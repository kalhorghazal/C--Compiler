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
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    private boolean isInFuncCallStmt = false;

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
            if(firstType instanceof IntType || firstType instanceof BoolType || firstType instanceof FptrType) {
                if (firstType.toString().equals(secondType.toString())) {
                    return new BoolType();
                }
            }
            if((firstType instanceof StructType && secondType instanceof StructType)) {
                if (((StructType) firstType).getStructName().getName().equals(((StructType) secondType).getStructName().getName())) {
                    return new BoolType();
                }
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
            if(!(left instanceof Identifier || left instanceof StructAccess || left instanceof ListAccessByIndex)) {
                LeftSideNotLvalue exception = new LeftSideNotLvalue(binaryExpression.getLine());
                binaryExpression.addError(exception);
            }
            if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }
            if(firstType instanceof IntType || firstType instanceof BoolType || firstType instanceof FptrType) {
                if (firstType.toString().equals(secondType.toString())) {
                    return firstType;
                }
            }
            if(firstType instanceof ListType && secondType instanceof ListType) {
                if (((ListType) firstType).getType().equals(((ListType) secondType).getType()))
                    return firstType;
            }
            if((firstType instanceof StructType && secondType instanceof StructType)) {
                if (((StructType) firstType).getStructName().getName().equals(((StructType) secondType).getStructName().getName())) {
                    return firstType;
                }
            }
            UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
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
        boolean prevIsInMethodCallStmt = this.isInFuncCallStmt;
        this.setIsInFuncCallStmt(false);
        ArrayList<Type> argsTypes = new ArrayList<>();
        for(Expression arg : funcCall.getArgs()) {
            argsTypes.add(arg.accept(this));
        }
        this.setIsInFuncCallStmt(prevIsInMethodCallStmt);
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
            if(this.hasSameArgTypes(argsTypes, actualArgsTypes)) {
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
        Type elementType = structAccess.getElement().accept(this);
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
                return elementType;
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
        Type listArgType = listAppend.getListArg().accept(this);
        Type elementArgType = listAppend.getElementArg().accept(this);
        if(listArgType instanceof ListType) {
            Type neededElementType = ((ListType) listArgType).getType();
            if(elementArgType.toString().equals(neededElementType.toString())) {
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

    public boolean hasSameArgTypes(ArrayList<Type> first, ArrayList<Type> second) {
        if(first.size() != second.size())
            return false;
        for(int i = 0; i < first.size(); i++) {
            if(! first.get(i).equals(second.get(i)))
                return false;
        }
        return true;
    }

    public void setIsInFuncCallStmt(boolean _isInFuncCallStmt) {
        isInFuncCallStmt = _isInFuncCallStmt;
    }
}
