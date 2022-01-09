package main.visitor.type;

import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.types.*;
import main.ast.types.primitives.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;
import main.compileError.typeError.*;
import java.util.*;

public class ExpressionTypeChecker extends Visitor<Type> {
    private boolean inFunctionCallStmt = false;
    private boolean access = false;
    private String accessStructName;

    public void setInFunctionCallStmt(boolean inFunctionCallStmt) {
        this.inFunctionCallStmt = inFunctionCallStmt;
    }

    public boolean sameType(Type el1,Type el2){
        if(el1 instanceof NoType || el2 instanceof NoType)
            return true;
        if(el1 instanceof IntType  && el2 instanceof IntType)
            return true;
        if(el1 instanceof BoolType && el2 instanceof BoolType)
            return true;
        if(el1 instanceof VoidType && el2 instanceof VoidType)
            return true;
        if (el1 instanceof ListType && el2 instanceof ListType){
            return sameType(((ListType) el1).getType(), ((ListType) el2).getType());
        }
        if (el1 instanceof StructType && el2 instanceof StructType) {
            if (((StructType) el1).getStructName().getName().equals(((StructType) el2).getStructName().getName()))
                return true;
        }
        if(el1 instanceof FptrType && el2 instanceof FptrType) {
            Type el1RetType = ((FptrType) el1).getReturnType();
            Type el2RetType = ((FptrType) el2).getReturnType();
            if (!sameType(el1RetType, el2RetType))
                return false;
            ArrayList<Type> el1ArgsTypes = ((FptrType) el1).getArgsType();
            ArrayList<Type> el2ArgsTypes = ((FptrType) el2).getArgsType();

            if (el1ArgsTypes.size() != el2ArgsTypes.size())
                return false;
            else {
                for (int i = 0; i < el1ArgsTypes.size(); i++) {
                    if (!sameType(el1ArgsTypes.get(i), el2ArgsTypes.get(i)))
                        return false;
                }
            }
            return true;
        }
        return false;
    }

    public SymbolTable getStructSymbolTable(String name) {
        try {
            StructSymbolTableItem structItem = (StructSymbolTableItem)
                    SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + name);
            return structItem.getStructSymbolTable();
        } catch (ItemNotFoundException ignored) {
            return null;
        }
    }

    private Type getIdType(Identifier id){
       String name = id.getName();
       try {
           String funcKey = FunctionSymbolTableItem.START_KEY + name;
           FunctionSymbolTableItem functionItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(funcKey);
           return new FptrType(functionItem.getArgTypes(), functionItem.getReturnType());
           
       }catch (ItemNotFoundException e) {
           try {
               String varKey = VariableSymbolTableItem.START_KEY + name;
               VariableSymbolTableItem varItem = (VariableSymbolTableItem) SymbolTable.top.getItem(varKey);
               return varItem.getType();
           } catch (ItemNotFoundException e2) {
               VarNotDeclared exception = new VarNotDeclared(id.getLine(), name);
               id.addError(exception);
               return new NoType();
           }
       }
    }

    public boolean isLvalue(Expression expr){
        if(expr instanceof Identifier){
            try {
                String funcKey = FunctionSymbolTableItem.START_KEY + ((Identifier)expr).getName();
                SymbolTable.root.getItem(funcKey);
            }catch (ItemNotFoundException e) {
                return true;
            }
        }
        if(expr instanceof ListAccessByIndex){
            return isLvalue(((ListAccessByIndex)expr).getInstance());
        }
        if(expr instanceof StructAccess){
            return isLvalue(((StructAccess)expr).getInstance());
        }
        return false;
    }


    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Expression left = binaryExpression.getFirstOperand();
        Expression right = binaryExpression.getSecondOperand();

        Type tl = left.accept(this);
        Type tr = right.accept(this);
        BinaryOperator operator =  binaryExpression.getBinaryOperator();


        if (operator.equals(BinaryOperator.and) || operator.equals(BinaryOperator.or)) {
            if (tl instanceof BoolType && tr instanceof BoolType)
                return new BoolType();

            if ((tl instanceof NoType || tl instanceof BoolType) &&
                    (tr instanceof BoolType || tr instanceof NoType))
                return new NoType();
        }

        else if(operator.equals(BinaryOperator.eq)) {
            if(tl instanceof ListType || tr instanceof ListType) {
                UnsupportedOperandType exception = new UnsupportedOperandType(left.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            if(!sameType(tl,tr)) {
                UnsupportedOperandType exception = new UnsupportedOperandType(right.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else {
                if(tl instanceof NoType || tr instanceof NoType)
                    return new NoType();
                else
                    return new BoolType();
            }
        }

        else if(operator.equals(BinaryOperator.assign)) {
            if(!isLvalue(left)){
                LeftSideNotLvalue exception = new LeftSideNotLvalue(binaryExpression.getLine());
                binaryExpression.addError(exception);
            }

            if(!sameType(tl,tr)) {
                UnsupportedOperandType exception = new UnsupportedOperandType(right.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else {
                if(tl instanceof NoType || tr instanceof NoType)
                    return new NoType();
                else
                    return tr;
            }
        }

        else if(operator.equals(BinaryOperator.gt) || operator.equals(BinaryOperator.lt)){
            if (tl instanceof IntType && tr instanceof IntType)
                return new BoolType();

            if ((tl instanceof NoType || tl instanceof IntType) &&
                    (tr instanceof IntType || tr instanceof NoType))
                return new NoType();
        }

        else { // + - / *
            if (tl instanceof IntType && tr instanceof IntType)
                return new IntType();

            if ((tl instanceof NoType || tl instanceof IntType) &&
                    (tr instanceof IntType || tr instanceof NoType))
                return new NoType();
        }

        UnsupportedOperandType exception = new UnsupportedOperandType(left.getLine(), operator.name());
        left.addError(exception);
        return new NoType();

    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        Expression uExpr = unaryExpression.getOperand();
        Type uType = uExpr.accept(this);
        UnaryOperator operator = unaryExpression.getOperator();

        if(operator.equals(UnaryOperator.not)) {
            if(uType instanceof BoolType)
                return new BoolType();
            if(!(uType instanceof NoType)){
                UnsupportedOperandType exception = new UnsupportedOperandType(uExpr.getLine(), operator.name());
                uExpr.addError(exception);
            }
        }
        else { //-
            if (uType instanceof IntType)
                return new IntType();
            if(!(uType instanceof NoType)){
                UnsupportedOperandType exception = new UnsupportedOperandType(uExpr.getLine(), operator.name());
                uExpr.addError(exception);
            }
        }
        return new NoType();
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        boolean err = false;
        boolean preInFunctionCallStmt = inFunctionCallStmt;
        ArrayList<Type> funcCallArgsType = new ArrayList<>();

        inFunctionCallStmt = false;
        Type instanceType = funcCall.getInstance().accept(this);

        for (Expression expression : funcCall.getArgs()) {
            Type t = expression.accept(this);
            funcCallArgsType.add(t);
        }
        inFunctionCallStmt = preInFunctionCallStmt;

        if(instanceType instanceof NoType)
            return new NoType();

        if (!(instanceType instanceof FptrType )){
            CallOnNoneFptrType exception = new CallOnNoneFptrType(funcCall.getLine());
            funcCall.addError(exception);
            return new NoType();
        }

        FptrType fptrType = (FptrType) instanceType;
        ArrayList<Type> fptrArgsType = fptrType.getArgsType();

        if (fptrType.getReturnType() instanceof VoidType && !inFunctionCallStmt){
            CantUseValueOfVoidFunction exception = new CantUseValueOfVoidFunction(funcCall.getLine());
            funcCall.addError(exception);
            err = true;
        }
        inFunctionCallStmt = false;



        if (funcCallArgsType.size() != fptrArgsType.size()) {
            ArgsInFunctionCallNotMatchDefinition exception = new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine());
            funcCall.addError(exception);
            err = true;
        }

        else if (fptrArgsType.size() != 0) {
            for(int i = 0; i < fptrArgsType.size(); i += 1){
                if (!sameType(fptrArgsType.get(i), funcCallArgsType.get(i))) {
                    ArgsInFunctionCallNotMatchDefinition exception = new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine());
                    funcCall.addError(exception);
                    err = true;
                    break;
                }
            }
        }

        if (err)
            return new NoType();
        else
            return fptrType.getReturnType();
    }

    @Override
    public Type visit(Identifier identifier) {
        if (access) {
            SymbolTable thisStruct = getStructSymbolTable(accessStructName);
            try {
                String varKey = VariableSymbolTableItem.START_KEY + identifier.getName();
                VariableSymbolTableItem varItem = (VariableSymbolTableItem) thisStruct.getItem(varKey);
                return varItem.getType();

            } catch (ItemNotFoundException i) {
               StructMemberNotFound exception = new StructMemberNotFound(identifier.getLine(), accessStructName, identifier.getName());
               identifier.addError(exception);
               return new NoType();
            }
        }
        else{
            return getIdType(identifier);
        }
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        Type indexType = listAccessByIndex.getIndex().accept(this);
        Type instanceType = listAccessByIndex.getInstance().accept(this);

        if(!(indexType instanceof IntType || indexType instanceof NoType)){
            ListIndexNotInt exception = new ListIndexNotInt(listAccessByIndex.getLine());
            listAccessByIndex.addError(exception);
        }

        if(instanceType instanceof NoType)
            return new NoType();

        if(!(instanceType instanceof ListType)){
            AccessByIndexOnNonList exception = new AccessByIndexOnNonList(listAccessByIndex.getLine());
            listAccessByIndex.addError(exception);
            return new NoType();
        }
        else {
            if (indexType instanceof IntType)
                return ((ListType) instanceType).getType();
            else
                return new NoType();
        }
    }

    @Override
    public Type visit(StructAccess structAccess) {
        Expression instance = structAccess.getInstance();
        Identifier element = structAccess.getElement();
        Type instanceType = instance.accept(this);
        if (instanceType instanceof StructType) {
            access = true;
            accessStructName = ((StructType) instanceType).getStructName().getName();
            Type memberType = element.accept(this);
            access = false;
            return memberType;
        }
        else if (instanceType instanceof NoType)
            return new NoType();
        else {
            AccessOnNonStruct exception = new AccessOnNonStruct(structAccess.getLine());
            structAccess.addError(exception);
            return new NoType();
        }
    }

    @Override
    public Type visit(ListSize listSize) {
        Type type = listSize.getArg().accept(this);
        if (type instanceof NoType)
            return new NoType();
        if (type instanceof ListType)
            return new IntType();
        GetSizeOfNonList exception = new GetSizeOfNonList(listSize.getLine());
        listSize.addError(exception);
        return new NoType();
    }

    @Override
    public Type visit(ListAppend listAppend) {
        if (!inFunctionCallStmt){
            CantUseValueOfVoidFunction exception = new CantUseValueOfVoidFunction(listAppend.getLine());
            listAppend.addError(exception);
        }
        inFunctionCallStmt = false;
        Type listType = listAppend.getListArg().accept(this);
        Type elementType = listAppend.getElementArg().accept(this);
        if (listType instanceof NoType)
            return new NoType();
        if (!(listType instanceof ListType)) {
            AppendToNonList exception = new AppendToNonList(listAppend.getLine());
            listAppend.addError(exception);
            return new NoType();
        }
        if(elementType instanceof NoType)
            return new NoType();

        if(!sameType(((ListType) listType).getType(), elementType)) {
            NewElementTypeNotMatchListType exception = new NewElementTypeNotMatchListType(listAppend.getLine());
            listAppend.addError(exception);
        }
        return new NoType();
    }

    @Override
    public Type visit(ExprInPar exprInPar) {
        return exprInPar.getInputs().get(0).accept(this);
    }

    @Override
    public Type visit(IntValue intValue) {
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        return new BoolType();
    }
}
