package main.visitor.type;

import main.ast.nodes.Node;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.expression.ListAccessByIndex;
import main.ast.nodes.expression.StructAccess;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

import java.util.ArrayList;

public class TypeChecker extends Visitor<Void> {
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker();
    public FunctionDeclaration currentFunction;
    private SetGetVarDeclaration currentSetGetVar;
    private boolean isInMain = false;
    private boolean isInSetter = false;
    private boolean isInGetter = false;
    private boolean isInStruct = false;
    private boolean isInFunction = false;
    private boolean isInSetGet = false;
    private boolean doesReturn = false;
    private String currentStructName;
    private String currentFunctionName;
    private String currentSetGetName;

    @Override
    public Void visit(Program program) {
        //Todo: done:)
        for (StructDeclaration structDeclaration: program.getStructs())
            structDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration:program.getFunctions()) {
            this.currentFunction = functionDeclaration;
            functionDeclaration.accept(this);
        }
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        //Todo
        SymbolTable funcScope = new SymbolTable();
        SymbolTable.push(funcScope);
        boolean typeNotExist = false;
        try {
            String key = FunctionSymbolTableItem.START_KEY + functionDec.getFunctionName().getName();
            FunctionSymbolTableItem funcSym = (FunctionSymbolTableItem) SymbolTable.root.getItem(key);
            Type retType = functionDec.getReturnType();
            if(retType instanceof StructType) {
                String structName = ((StructType) retType).getStructName().getName();
                try {
                    String structKey = StructSymbolTableItem.START_KEY + structName;
                    StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(structKey);
                } catch (ItemNotFoundException e) {
                    StructNotDeclared exception = new StructNotDeclared(functionDec.getLine(), structName);
                    functionDec.addError(exception);
                    typeNotExist = true;
                    //return null;
                }
            }
            if(retType instanceof ListType) {
                Type rootType = getListRootType((ListType) retType);
                if(rootType instanceof StructType) {
                    String structName = ((StructType) rootType).getStructName().getName();
                    try {
                        String rootKey = StructSymbolTableItem.START_KEY + structName;
                        StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(rootKey);
                    } catch (ItemNotFoundException e) {
                        StructNotDeclared exception = new StructNotDeclared(functionDec.getLine(), structName);
                        functionDec.addError(exception);
                        //return null;
                    }
                }
            }
            if(retType instanceof FptrType) {
                for (Type argType: ((FptrType) retType).getArgsType()) {
                    if(argType instanceof StructType) {
                        String structName = ((StructType) argType).getStructName().getName();
                        try {
                            String rootKey = StructSymbolTableItem.START_KEY + structName;
                            StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(rootKey);
                        } catch (ItemNotFoundException e) {
                            StructNotDeclared exception = new StructNotDeclared(functionDec.getLine(), structName);
                            functionDec.addError(exception);
                        }
                    }
                }
                Type rrType = ((FptrType) retType).getReturnType();
                if(rrType instanceof StructType) {
                    String structName = ((StructType) rrType).getStructName().getName();
                    try {
                        String rootKey = StructSymbolTableItem.START_KEY + structName;
                        StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(rootKey);
                    } catch (ItemNotFoundException e) {
                        StructNotDeclared exception = new StructNotDeclared(functionDec.getLine(), structName);
                        functionDec.addError(exception);
                    }
                }
            }
            funcSym.setReturnType(functionDec.getReturnType());
            funcSym.setFunctionSymbolTable(new SymbolTable());
        } catch (ItemNotFoundException e) {}
        isInFunction = true;
        expressionTypeChecker.setIsInFunction(true);
        currentFunctionName = functionDec.getFunctionName().getName();
        expressionTypeChecker.setCurrentFunctionName(currentFunctionName);
        for(VariableDeclaration arg: functionDec.getArgs()) {
            arg.accept(this);
        }
        functionDec.getBody().accept(this);
        isInFunction = false;
        expressionTypeChecker.setIsInFunction(false);
        if(typeNotExist) {
            try {
                String key = FunctionSymbolTableItem.START_KEY + functionDec.getFunctionName().getName();
                FunctionSymbolTableItem funcSym = (FunctionSymbolTableItem) SymbolTable.root.getItem(key);
                funcSym.setReturnType(new NoType());
            } catch (ItemNotFoundException e) {}
        }
        if(!(functionDec.getReturnType() instanceof VoidType) && !doesReturn) {
            MissingReturnStatement exception = new MissingReturnStatement(
                    functionDec.getLine(), functionDec.getFunctionName().getName());
            functionDec.addError(exception);
        }
        else {
            doesReturn = false;
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        //Todo: done:)
        SymbolTable mainScope = new SymbolTable(SymbolTable.top);
        SymbolTable.push(mainScope);
        isInMain = true;
        mainDec.getBody().accept(this);
        isInMain = false;
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        //Todo: done:)
        Type varType = variableDec.getVarType();
        String varName = variableDec.getVarName().getName();
        if(isInStruct) {
            try {
                String key = StructSymbolTableItem.START_KEY + currentStructName;
                StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(key);
                SymbolTable structSymbolTable = structSymbolTableItem.getStructSymbolTable();
                if (isInSetGet) {
                    String funKey = FunctionSymbolTableItem.START_KEY + currentSetGetName;
                    FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) structSymbolTable.getItem(funKey);
                    SymbolTable funcSym = functionSymbolTableItem.getFunctionSymbolTable();
                    VariableSymbolTableItem varSym = (VariableSymbolTableItem) funcSym.getItem(VariableSymbolTableItem.START_KEY + varName);
                    if(hasDeclaredStructError(varType))
                        varSym.setType(new NoType());
                    else
                        varSym.setType(varType);
                }
                else {
                    VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) structSymbolTable.getItem(VariableSymbolTableItem.START_KEY + varName);
                    if(hasDeclaredStructError(varType))
                        variableSymbolTableItem.setType(new NoType());
                    else
                        variableSymbolTableItem.setType(varType);
                }
            } catch (ItemNotFoundException e) {}
        }
        /*else if(isInFunction) {
            //try {
                //String key = FunctionSymbolTableItem.START_KEY + currentFunctionName;
                //FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(key);
                //SymbolTable functionSymbolTable = functionSymbolTableItem.getFunctionSymbolTable();
                VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                if(hasDeclaredStructError(varType))
                    variableSymbolTableItem.setType(new NoType());
                else
                    variableSymbolTableItem.setType(varType);
                try{
                SymbolTable.top.put(variableSymbolTableItem);}
            //} catch (ItemNotFoundException e) {}
            catch (ItemAlreadyExistsException e) {}
        }*/
        else {
            try {
                VariableSymbolTableItem varSym = new VariableSymbolTableItem(variableDec.getVarName());
                if(hasDeclaredStructError(varType))
                    varSym.setType(new NoType());
                else
                    varSym.setType(varType);
                SymbolTable.top.put(varSym);
            } catch (ItemAlreadyExistsException e) {}
        }
        if(varType instanceof StructType) {
            String structName = ((StructType) varType).getStructName().getName();
            try {
                String key = StructSymbolTableItem.START_KEY + structName;
                StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(key);
            } catch (ItemNotFoundException e) {
                StructNotDeclared exception = new StructNotDeclared(variableDec.getLine(), structName);
                variableDec.addError(exception);
                //return null;
            }
        }
        if(varType instanceof ListType) {
            Type rootType = getListRootType((ListType) varType);
            if(rootType instanceof StructType) {
                String structName = ((StructType) rootType).getStructName().getName();
                try {
                    String key = StructSymbolTableItem.START_KEY + structName;
                    StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(key);
                } catch (ItemNotFoundException e) {
                    StructNotDeclared exception = new StructNotDeclared(variableDec.getLine(), structName);
                    variableDec.addError(exception);
                    //return null;
                }
            }
        }
        if(varType instanceof FptrType) {
            for (Type argType: ((FptrType) varType).getArgsType()) {
                if(argType instanceof StructType) {
                    String structName = ((StructType) argType).getStructName().getName();
                    try {
                        String rootKey = StructSymbolTableItem.START_KEY + structName;
                        StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(rootKey);
                    } catch (ItemNotFoundException e) {
                        StructNotDeclared exception = new StructNotDeclared(variableDec.getLine(), structName);
                        variableDec.addError(exception);
                    }
                }
            }
            Type rrType = ((FptrType) varType).getReturnType();
            if(rrType instanceof StructType) {
                String structName = ((StructType) rrType).getStructName().getName();
                try {
                    String rootKey = StructSymbolTableItem.START_KEY + structName;
                    StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(rootKey);
                } catch (ItemNotFoundException e) {
                    StructNotDeclared exception = new StructNotDeclared(variableDec.getLine(), structName);
                    variableDec.addError(exception);
                }
            }
        }
        if(variableDec.getDefaultValue() != null) {
            Type valType = variableDec.getDefaultValue().accept(expressionTypeChecker);
            if(varType instanceof NoType || valType instanceof NoType) {
                return null;
            }
            if(this.isFirstSubTypeOfSecond(valType, varType)) {
                return null;
            }
            UnsupportedOperandType exception = new UnsupportedOperandType(variableDec.getLine(), BinaryOperator.assign.name());
            variableDec.addError(exception);
            return null;
        }
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        //Todo: done:)
        isInStruct = true;
        expressionTypeChecker.setIsInStruct(true);
        currentStructName = structDec.getStructName().getName();
        expressionTypeChecker.setCurrentStruct(currentStructName);
        structDec.getBody().accept(this);
        isInStruct = false;
        expressionTypeChecker.setIsInStruct(false);
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        //Todo: done:)
        String varName = setGetVarDec.getVarName().getName();
        Type varType = setGetVarDec.getVarType();
        String key = StructSymbolTableItem.START_KEY + currentStructName;
        try {
            StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(key);
            SymbolTable structSymbolTable = structSymbolTableItem.getStructSymbolTable();
            VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) structSymbolTable.getItem(VariableSymbolTableItem.START_KEY + varName);
            variableSymbolTableItem.setType(varType);
        } catch (ItemNotFoundException e) {}
        isInSetGet = true;
        currentSetGetName = setGetVarDec.getVarName().getName();
        expressionTypeChecker.setCurrentSetGetName(currentSetGetName);
        for (VariableDeclaration arg: setGetVarDec.getArgs()) {
            arg.accept(this);
        }
        isInSetter = true;
        expressionTypeChecker.setIsInSetter(true);
        setGetVarDec.getSetterBody().accept(this);
        isInSetter = false;
        expressionTypeChecker.setIsInSetter(false);
        isInGetter = true;
        currentSetGetVar = setGetVarDec;
        setGetVarDec.getGetterBody().accept(this);
        if(!doesReturn) {
            MissingReturnStatement exception = new MissingReturnStatement(setGetVarDec.getGetterBody().getLine(), varName);
            setGetVarDec.addError(exception);
        }
        else {
            doesReturn = false;
        }
        isInGetter = false;
        isInSetGet = false;
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        //Todo: done:)
        expressionTypeChecker.hasSeenNoneLValue = false;
        Type firstType = assignmentStmt.getLValue().accept(expressionTypeChecker);
        boolean leftIsLvalue = !expressionTypeChecker.hasSeenNoneLValue;
        Type secondType = assignmentStmt.getRValue().accept(expressionTypeChecker);
        if(!leftIsLvalue) {
            LeftSideNotLvalue exception = new LeftSideNotLvalue(assignmentStmt.getLine());
            assignmentStmt.addError(exception);
        }
        if(firstType instanceof NoType || secondType instanceof NoType) {
            return null;
        }
        if(this.isFirstSubTypeOfSecond(secondType, firstType)) {
            return null;
        }
        UnsupportedOperandType exception = new UnsupportedOperandType(assignmentStmt.getLine(), BinaryOperator.assign.name());
        assignmentStmt.addError(exception);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        //Todo: done:)
        for(Statement statement : blockStmt.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        //Todo: done:)
        SymbolTable ifScope = new SymbolTable(SymbolTable.top);
        SymbolTable.push(ifScope);
        Type condType = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if(!(condType instanceof BoolType || condType instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(conditionalStmt.getLine());
            conditionalStmt.addError(exception);
        }
        conditionalStmt.getThenBody().accept(this);
        SymbolTable.pop();
        if(conditionalStmt.getElseBody() != null) {
            SymbolTable elseScope = new SymbolTable(SymbolTable.top);
            SymbolTable.push(elseScope);
            conditionalStmt.getElseBody().accept(this);
            SymbolTable.pop();
        }
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        //Todo: done:)
        expressionTypeChecker.setIsInFuncCallStmt(true);
        functionCallStmt.getFunctionCall().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInFuncCallStmt(false);
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        //Todo: done:)
        Type argType = displayStmt.getArg().accept(expressionTypeChecker);
        if(!(argType instanceof IntType || argType instanceof BoolType
                || argType instanceof ListType || argType instanceof NoType)) {
            UnsupportedTypeForDisplay exception = new UnsupportedTypeForDisplay(displayStmt.getLine());
            displayStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        //Todo: done:)
        if(isInFunction || isInGetter) {
            doesReturn = true;
        }
        Type retExpr;
        if (returnStmt.getReturnedExpr() != null)
            retExpr = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        else
            retExpr = null;
        if(isInMain || isInSetter) {
            CannotUseReturn expression = new CannotUseReturn(returnStmt.getLine());
            returnStmt.addError(expression);
            //if(returnStmt.getReturnedExpr() != null)
                //returnStmt.getReturnedExpr().accept(expressionTypeChecker);
            return null;
        }
        Type retType;
        if(returnStmt.getReturnedExpr() != null) {
            retType = retExpr;
        }
        else {
            retType = new VoidType();
        }
        Type actualRetType;
        if(isInFunction) {
            actualRetType = this.currentFunction.getReturnType();
        }
        else {
            actualRetType = this.currentSetGetVar.getVarType();
        }
        if(!(isFirstSubTypeOfSecond(retType, actualRetType) || retType instanceof NoType)) {
            ReturnValueNotMatchFunctionReturnType exception = new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine());
            returnStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        //Todo: done:)
        SymbolTable loopScope = new SymbolTable(SymbolTable.top);
        SymbolTable.push(loopScope);
        Type condType = loopStmt.getCondition().accept(expressionTypeChecker);
        if(!(condType instanceof BoolType || condType instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(loopStmt.getLine());
            loopStmt.addError(exception);
        }
        loopStmt.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        //Todo: done:)
        if(isInGetter || isInSetter) {
            CannotUseDefineVar exception = new CannotUseDefineVar(varDecStmt.getLine());
            varDecStmt.addError(exception);
        }
        for(VariableDeclaration variableDeclaration: varDecStmt.getVars()) {
            variableDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        //Todo: done:)
        expressionTypeChecker.setIsInAppendStmt(true);
        listAppendStmt.getListAppendExpr().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInAppendStmt(false);
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        //Todo: done:)
        listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        return null;
    }

    public Type getListRootType(ListType listType) {
        Type elementType = listType.getType();
        while (elementType instanceof ListType) {
            elementType = ((ListType) elementType).getType();
        }
        return elementType;
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
        else if(first instanceof VoidType) {
            if (!(second instanceof VoidType))
                return false;
            return true;
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

    public boolean hasDeclaredStructError(Type type) {
        if(type instanceof StructType) {
            String structName = ((StructType) type).getStructName().getName();
            try {
                String structKey = StructSymbolTableItem.START_KEY + structName;
                StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(structKey);
            } catch (ItemNotFoundException e) {
                return true;
            }
        }
        if(type instanceof ListType) {
            Type rootType = getListRootType((ListType) type);
            if(rootType instanceof StructType) {
                String structName = ((StructType) rootType).getStructName().getName();
                try {
                    String rootKey = StructSymbolTableItem.START_KEY + structName;
                    StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(rootKey);
                } catch (ItemNotFoundException e) {
                    return true;
                }
            }
        }
        return hasFptrStructError(type);
    }

    Boolean hasFptrStructError(Type type) {
        if(type instanceof FptrType) {
            for (Type argType: ((FptrType) type).getArgsType()) {
                if(hasDeclaredStructError(argType)) return true;
            }
            return hasDeclaredStructError(((FptrType) type).getReturnType());
        }
        return false;
    }
}
