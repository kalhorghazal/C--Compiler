package main.visitor.type;

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
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

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
                    //return null;
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
                    varSym.setType(varType);
                }
                else {
                    VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) structSymbolTable.getItem(VariableSymbolTableItem.START_KEY + varName);
                    variableSymbolTableItem.setType(varType);
                }
            } catch (ItemNotFoundException e) {}
        }
        else if(isInFunction) {
            try {
                String key = FunctionSymbolTableItem.START_KEY + currentFunctionName;
                FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(key);
                SymbolTable functionSymbolTable = functionSymbolTableItem.getFunctionSymbolTable();
                VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                variableSymbolTableItem.setType(varType);
                functionSymbolTable.put(variableSymbolTableItem);
            } catch (ItemNotFoundException e) {} catch (ItemAlreadyExistsException e) {}
        }
        else {
            try {
                VariableSymbolTableItem varSym = new VariableSymbolTableItem(variableDec.getVarName());
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
        if(variableDec.getDefaultValue() != null) {
            Type valType = variableDec.getDefaultValue().accept(expressionTypeChecker);
            if(varType instanceof NoType || valType instanceof NoType) {
                return null;
            }
            if(varType instanceof IntType || varType instanceof BoolType || varType instanceof FptrType) {
                if (varType.toString().equals(valType.toString())) {
                    return null;
                }
            }
            if((varType instanceof StructType && valType instanceof StructType)) {
                if (((StructType) varType).getStructName().getName().equals(((StructType) valType).getStructName().getName())) {
                    return null;
                }
            }
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
        isInGetter = false;
        isInSetGet = false;
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        //Todo: done:)
        Type firstType = assignmentStmt.getLValue().accept(expressionTypeChecker);
        Type secondType = assignmentStmt.getRValue().accept(expressionTypeChecker);
        Expression left = assignmentStmt.getLValue();
        if(!(left instanceof Identifier || left instanceof StructAccess || left instanceof ListAccessByIndex)) {
            LeftSideNotLvalue exception = new LeftSideNotLvalue(assignmentStmt.getLine());
            assignmentStmt.addError(exception);
        }
        if(firstType instanceof NoType || secondType instanceof NoType) {
            return null;
        }
        if(firstType instanceof IntType || firstType instanceof BoolType || firstType instanceof FptrType) {
            if (firstType.toString().equals(secondType.toString())) {
                return null;
            }
        }
        if(firstType instanceof ListType && secondType instanceof ListType) {
            if (((ListType) firstType).getType().equals(((ListType) secondType).getType()))
                return null;
        }
        if((firstType instanceof StructType && secondType instanceof StructType)) {
            if (((StructType) firstType).getStructName().getName().equals(((StructType) secondType).getStructName().getName())) {
                return null;
            }
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
        if(conditionalStmt.getElseBody() != null) {
            conditionalStmt.getElseBody().accept(this);
        }
        SymbolTable.pop();
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
        if(isInMain || isInSetter) {
            CannotUseReturn expression = new CannotUseReturn(returnStmt.getLine());
            returnStmt.addError(expression);
            returnStmt.getReturnedExpr().accept(expressionTypeChecker);
            return null;
        }
        Type retType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        Type actualRetType;
        if(isInFunction) {
            actualRetType = this.currentFunction.getReturnType();
        }
        else {
            actualRetType = this.currentSetGetVar.getVarType();
        }
        if(!(retType.toString().equals(actualRetType.toString()) || retType instanceof NoType)) {
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
        listAppendStmt.getListAppendExpr().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        //Todo: done:)
        listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        return null;
    }
}
