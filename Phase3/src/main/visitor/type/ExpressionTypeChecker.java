package main.visitor.type;

import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.types.*;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    private boolean isInFuncCallStmt = false;
    private boolean isInFunction = false;
    private boolean isInStruct = false;
    private boolean isInSetter = false;
    private boolean isInAppendStmt = false;
    private String currentFunctionName;
    private String currentStructName;
    private String currentSetGetName;

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        //Todo: done:)
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        Type firstType = binaryExpression.getFirstOperand().accept(this);
        Type secondType = binaryExpression.getSecondOperand().accept(this);
        if(operator == BinaryOperator.eq) {
            if(firstType instanceof NoType && secondType instanceof NoType) {
                return new NoType();
            }
            else if((firstType instanceof NoType && secondType instanceof ListType) ||
                    (secondType instanceof NoType && firstType instanceof ListType)) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }
            if(isFirstSubTypeOfSecondEq(secondType, firstType)) {
                return new BoolType();
            }
        }
        if((operator == BinaryOperator.mult) || (operator == BinaryOperator.div) ||
                (operator == BinaryOperator.add) || (operator == BinaryOperator.sub)) {
            if(firstType instanceof NoType && secondType instanceof NoType) {
                return new NoType();
            }
            else if((firstType instanceof NoType && !(secondType instanceof IntType)) ||
                    (secondType instanceof NoType && !(firstType instanceof IntType))) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }
            if((firstType instanceof IntType) && (secondType instanceof IntType)) {
                return new IntType();
            }
        }
        if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            if(firstType instanceof NoType && secondType instanceof NoType) {
                return new NoType();
            }
            else if((firstType instanceof NoType && !(secondType instanceof IntType)) ||
                    (secondType instanceof NoType && !(firstType instanceof IntType))) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }
            if((firstType instanceof IntType) && (secondType instanceof IntType)) {
                return new BoolType();
            }
        }
        if((operator == BinaryOperator.and) || (operator == BinaryOperator.or)) {
            if(firstType instanceof NoType && secondType instanceof NoType) {
                return new NoType();
            }
            else if((firstType instanceof NoType && !(secondType instanceof BoolType)) ||
                    (secondType instanceof NoType && !(firstType instanceof BoolType))) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }
            if((firstType instanceof BoolType) && (secondType instanceof BoolType)) {
                return new BoolType();
            }
        }
        if(operator == BinaryOperator.assign) {
            Expression left = binaryExpression.getFirstOperand();
            boolean leftIsLvalue = isLvalue(left);
            if(!leftIsLvalue) {
                LeftSideNotLvalue exception = new LeftSideNotLvalue(binaryExpression.getLine());
                binaryExpression.addError(exception);
            }
            if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }
            if(this.isFirstSubTypeOfSecond(secondType, firstType)) {
                if(leftIsLvalue)
                    return secondType;
                return new NoType();
            }
            UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), BinaryOperator.assign.name());
            binaryExpression.addError(exception);
            return new NoType();
        }
        UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
        binaryExpression.addError(exception);
        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        //Todo: done:)
        Type operandType = unaryExpression.getOperand().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();
        if(operator == UnaryOperator.not) {
            if(operandType instanceof NoType)
                return new NoType();
            if(operandType instanceof BoolType)
                return operandType;
        }
        else if(operator == UnaryOperator.minus) {
            if(operandType instanceof NoType)
                return new NoType();
            if(operandType instanceof IntType)
                return operandType;
        }
        UnsupportedOperandType exception = new UnsupportedOperandType(unaryExpression.getLine(), operator.name());
        unaryExpression.addError(exception);
        return new NoType();
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        //Todo: done:)
        Type instanceType = funcCall.getInstance().accept(this);
        boolean prevIsInFunCallStmt = this.isInFuncCallStmt;
        this.setIsInFuncCallStmt(false); //chera inja ro false mikonim?
        ArrayList<Type> argsTypes = new ArrayList<>();
        for(Expression arg : funcCall.getArgs()) {
            argsTypes.add(arg.accept(this));
        }
        this.setIsInFuncCallStmt(prevIsInFunCallStmt);
        if(!(instanceType instanceof FptrType || instanceType instanceof NoType)) {
            CallOnNoneFptrType exception = new CallOnNoneFptrType(funcCall.getLine());
            funcCall.addError(exception);
            return new NoType();
        }
        else if(instanceType instanceof NoType) {
            return new NoType();
        }
        else {
            ArrayList<Type> actualArgsTypes = ((FptrType) instanceType).getArgsType();
            Type returnType = ((FptrType) instanceType).getReturnType();
            boolean hasError = false;
            if(!isInFuncCallStmt && (returnType instanceof VoidType)) {
                CantUseValueOfVoidFunction exception = new CantUseValueOfVoidFunction(funcCall.getLine());
                funcCall.addError(exception);
                hasError = true;
            }
            if(this.isFirstSubTypeOfSecondMultiple(argsTypes, actualArgsTypes)) {
                if(hasError)
                    return new NoType();
                return returnType;
            }
            else {
                ArgsInFunctionCallNotMatchDefinition exception = new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine());
                funcCall.addError(exception);
                return new NoType();
            }
        }
    }

    @Override
    public Type visit(Identifier identifier) {
        //Todo: done:)
        String varName = identifier.getName();
        /*if(isInFunction) {
            try {
                String key = FunctionSymbolTableItem.START_KEY + currentFunctionName;
                FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(key);
                SymbolTable functionSymbolTable = functionSymbolTableItem.getFunctionSymbolTable();
                String varKey = VariableSymbolTableItem.START_KEY + varName;
                VariableSymbolTableItem varSym = (VariableSymbolTableItem) functionSymbolTable.root.getItem(varKey);
                return varSym.getType();
            } catch (ItemNotFoundException e) {
                VarNotDeclared exception = new VarNotDeclared(identifier.getLine(), varName);
                identifier.addError(exception);
                return new NoType();
            }
        }*/
        if(isInStruct) {
            try {
                String key = StructSymbolTableItem.START_KEY + currentStructName;
                StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(key);
                SymbolTable structSym = structSymbolTableItem.getStructSymbolTable();
                String varKey = VariableSymbolTableItem.START_KEY + varName;
                if(isInSetter) {
                    try {
                        String funcKey = FunctionSymbolTableItem.START_KEY + currentSetGetName;
                        FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) structSym.getItem(funcKey);
                        SymbolTable funcSym = functionSymbolTableItem.getFunctionSymbolTable();
                        VariableSymbolTableItem varSym = (VariableSymbolTableItem) funcSym.getItem(varKey);
                        return varSym.getType();
                    } catch (ItemNotFoundException e) {
                        VarNotDeclared exception = new VarNotDeclared(identifier.getLine(), varName);
                        identifier.addError(exception);
                        return new NoType();
                    }
                }
                VariableSymbolTableItem varSym = (VariableSymbolTableItem) structSym.getItem(varKey);
                return varSym.getType();
            } catch (ItemNotFoundException e) {}
        }
        try {
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY + varName);
            return new FptrType(functionSymbolTableItem.getArgTypes(), functionSymbolTableItem.getReturnType());
        } catch (ItemNotFoundException e) {}
        try {
            VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + varName);
            return variableSymbolTableItem.getType();
        } catch (ItemNotFoundException e) {
            VarNotDeclared exception = new VarNotDeclared(identifier.getLine(), varName);
            identifier.addError(exception);
            return new NoType();
        }
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        //Todo: done:)
        Type instanceType = listAccessByIndex.getInstance().accept(this);
        Type indexType = listAccessByIndex.getIndex().accept(this);
        if(instanceType instanceof NoType && indexType instanceof NoType) {
            return new NoType();
        }
        else if(instanceType instanceof NoType) {
            if(!(indexType instanceof IntType)) {
                ListIndexNotInt indexException = new ListIndexNotInt(listAccessByIndex.getLine());
                listAccessByIndex.addError(indexException);
            }
            return new NoType();
        }
        else if(!(instanceType instanceof ListType)) {
            AccessByIndexOnNonList instanceException = new AccessByIndexOnNonList(listAccessByIndex.getLine());
            listAccessByIndex.addError(instanceException);
            if (!(indexType instanceof IntType || indexType instanceof NoType)) {
                ListIndexNotInt indexException = new ListIndexNotInt(listAccessByIndex.getLine());
                listAccessByIndex.addError(indexException);
            }
            return new NoType();
        }
        else {
            if (!(indexType instanceof IntType || indexType instanceof NoType)) {
                ListIndexNotInt indexException = new ListIndexNotInt(listAccessByIndex.getLine());
                listAccessByIndex.addError(indexException);
                return new NoType();
            }
            else
                return ((ListType) instanceType).getType();
        }
    }

    @Override
    public Type visit(StructAccess structAccess) {
        //Todo: done:)
        Type instanceType = structAccess.getInstance().accept(this);
        //Type elementType = structAccess.getElement().accept(this);
        String memberName = structAccess.getElement().getName();
        if(instanceType instanceof NoType) {
            return new NoType();
        }
        if(!(instanceType instanceof StructType)) {
            AccessOnNonStruct exception = new AccessOnNonStruct(structAccess.getLine());
            structAccess.addError(exception);
            return new NoType();
        }
        else {
            String structName = ((StructType) instanceType).getStructName().getName();
            SymbolTable structSymbolTable;
            try {
                structSymbolTable = ((StructSymbolTableItem) SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + structName)).getStructSymbolTable();
            } catch(ItemNotFoundException structNotFound) {
                AccessOnNonStruct exception = new AccessOnNonStruct(structAccess.getLine());
                structAccess.addError(exception);
                return new NoType();
            }
            try {
                VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) structSymbolTable.getItem(VariableSymbolTableItem.START_KEY + memberName);
                return variableSymbolTableItem.getType();
            } catch (ItemNotFoundException memberNotFound) {
                StructMemberNotFound exception = new StructMemberNotFound(structAccess.getLine(), structName, memberName);
                structAccess.addError(exception);
                return new NoType();
            }
        }
    }

    @Override
    public Type visit(ListSize listSize) {
        //Todo: done:)
        Type argType = listSize.getArg().accept(this);
        if(argType instanceof ListType)
            return new IntType();
        GetSizeOfNonList exception = new GetSizeOfNonList(listSize.getLine());
        listSize.addError(exception);
        return new NoType();
    }

    @Override
    public Type visit(ListAppend listAppend) {
        //Todo: done:)
        boolean hasError = false;
        if(!isInAppendStmt) {
            CantUseValueOfVoidFunction expression = new CantUseValueOfVoidFunction(listAppend.getLine());
            listAppend.addError(expression);
            hasError = true;
        }
        Type listArgType = listAppend.getListArg().accept(this);
        Type elementArgType = listAppend.getElementArg().accept(this);
        if(listArgType instanceof NoType) {
            return new NoType();
        }
        if(listArgType instanceof ListType) {
            Type neededElementType = ((ListType) listArgType).getType();
            if(isFirstSubTypeOfSecond(elementArgType, neededElementType)){
                if(hasError)
                    return new NoType();
                return new VoidType();
            }
            else {
                NewElementTypeNotMatchListType exception = new NewElementTypeNotMatchListType(listAppend.getLine());
                listAppend.addError(exception);
                return  new NoType();
            }
        }
        AppendToNonList exception = new AppendToNonList(listAppend.getLine());
        listAppend.addError(exception);
        return new NoType();
    }

    @Override
    public Type visit(ExprInPar exprInPar) {
        //Todo: done:)
        return exprInPar.getInputs().get(0).accept(this);
    }

    @Override
    public Type visit(IntValue intValue) {
        //Todo: done:)
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        //Todo: done:)
        return new BoolType();
    }

    public boolean isFirstSubTypeOfSecondMultiple(ArrayList<Type> first, ArrayList<Type> second) {
        if(first.size() != second.size())
            return false;
        for(int i = 0; i < first.size(); i++) {
            if(!isFirstSubTypeOfSecond(first.get(i), second.get(i)))
                return false;
        }
        return true;
    }

    public boolean isFirstSubTypeOfSecond(Type first, Type second) {
        if(first instanceof NoType)
            return true;
        else if(first instanceof IntType || first instanceof BoolType)
            return first.toString().equals(second.toString());
        else if(first instanceof StructType) {
            if(!(second instanceof StructType))
                return false;
            return ((StructType) first).getStructName().getName().equals(((StructType) second).getStructName().getName());
        }
        else if(first instanceof FptrType) {
            if(!(second instanceof FptrType))
                return false;
            Type firstRetType = ((FptrType) first).getReturnType();
            Type secondRetType = ((FptrType) second).getReturnType();
            if(!isFirstSubTypeOfSecond(firstRetType, secondRetType))
                return false;
            ArrayList<Type> firstArgsTypes = ((FptrType) first).getArgsType();
            ArrayList<Type> secondArgsTypes = ((FptrType) second).getArgsType();
            return isFirstSubTypeOfSecondMultiple(secondArgsTypes, firstArgsTypes);
        }
        else if(first instanceof ListType) {
            if(!(second instanceof ListType))
                return false;
            Type firstElement = ((ListType) first).getType();
            Type secondElement = ((ListType) second).getType();
            if (!isFirstSubTypeOfSecond(firstElement, secondElement))
                return false;

            return true;
        }
        return false;
    }

    public boolean isFirstSubTypeOfSecondEq(Type first, Type second) {
        if(first instanceof NoType)
            return true;
        else if(first instanceof IntType || first instanceof BoolType)
            return first.toString().equals(second.toString());
        else if(first instanceof StructType) {
            if(!(second instanceof StructType))
                return false;
            return ((StructType) first).getStructName().getName().equals(((StructType) second).getStructName().getName());
        }
        else if(first instanceof FptrType) {
            if(!(second instanceof FptrType))
                return false;
            Type firstRetType = ((FptrType) first).getReturnType();
            Type secondRetType = ((FptrType) second).getReturnType();
            if(!isFirstSubTypeOfSecond(firstRetType, secondRetType))
                return false;
            ArrayList<Type> firstArgsTypes = ((FptrType) first).getArgsType();
            ArrayList<Type> secondArgsTypes = ((FptrType) second).getArgsType();
            return isFirstSubTypeOfSecondMultiple(secondArgsTypes, firstArgsTypes);
        }
        return false;
    }

    public boolean isLvalue(Expression expression) {
        if(!(expression instanceof Identifier || expression instanceof StructAccess ||
                expression instanceof ListAccessByIndex)) {
            return false;
        }
        return true;
    }

    public void setIsInFuncCallStmt(boolean isInFuncCallStmt) {
        this.isInFuncCallStmt = isInFuncCallStmt;
    }

    public void setIsInAppendStmt(boolean isInAppendStmt) {
        this.isInAppendStmt = isInAppendStmt;
    }

    public void setIsInFunction(boolean isInFunction) {
        this.isInFunction = isInFunction;
    }

    public void setCurrentFunctionName(String functionName) {
        this.currentFunctionName = functionName;
    }

    public void setIsInStruct(Boolean isInStruct) {
        this.isInStruct = isInStruct;
    }

    public void setCurrentStruct(String currentStructName) {
        this.currentStructName = currentStructName;
    }

    public void setIsInSetter(Boolean isInSetter) {
        this.isInSetter = isInSetter;
    }

    public void setCurrentSetGetName(String currentSetGetName) {
        this.currentSetGetName = currentSetGetName;
    }
}
