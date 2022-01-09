package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.primitives.*;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.*;
import main.visitor.Visitor;

import java.util.*;

public class TypeChecker extends Visitor<Void> {
    private final ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker();
    private FunctionDeclaration curFunction;
    private boolean validForReturn = true;
    private boolean validForVarDec = true;
    private boolean hasReturn = false;
    Set<String> undefined = new HashSet<>();

    public void checkForUndefinedStructs(Type type){
        if (type instanceof StructType){
            SymbolTable targetStruct = expressionTypeChecker.getStructSymbolTable(((StructType) type).getStructName().getName());
            if (targetStruct == null) {
                undefined.add(((StructType) type).getStructName().getName());
            }
        }
        if (type instanceof ListType){
            checkForUndefinedStructs(((ListType)type).getType());
        }
        if (type instanceof FptrType){
            checkForUndefinedStructs(((FptrType)type).getReturnType());
            for(Type argType : ((FptrType)type).getArgsType()){
                checkForUndefinedStructs(argType);
            }
        }
    }

    @Override
    public Void visit(Program program) {
        for (StructDeclaration structDec: program.getStructs())
            structDec.accept(this);
        for (FunctionDeclaration functionDec: program.getFunctions())
            functionDec.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        String name = structDec.getStructName().getName();
        try {
            StructSymbolTableItem structItem = (StructSymbolTableItem) SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + name);
            SymbolTable.push(structItem.getStructSymbolTable());
            structDec.getBody().accept(this);
        } catch (ItemNotFoundException exception) {//unReachable
        }
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        FunctionSymbolTableItem functionItem = new FunctionSymbolTableItem(functionDec);
        hasReturn = false;
        Type type = functionDec.getReturnType();

        checkForUndefinedStructs(type);
        for(String u : undefined){
            StructNotDeclared exception = new StructNotDeclared(functionDec.getLine(), u);
            functionDec.addError(exception);
            type =  new NoType();
        }
        undefined.clear();

        try {
            String funcKey = FunctionSymbolTableItem.START_KEY + functionDec.getFunctionName().getName();
            functionItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(funcKey);
            functionItem.setReturnType(type);
        }catch (ItemNotFoundException e) {//unreachable
        }

        SymbolTable newSymbolTable = new SymbolTable();
        SymbolTable.push(newSymbolTable);
        curFunction = functionDec;

        for(VariableDeclaration arg: functionDec.getArgs())
            arg.accept(this);

        functionDec.getBody().accept(this);

        SymbolTable.pop();
        functionItem.setFunctionSymbolTable(newSymbolTable);

        if(!hasReturn && !(curFunction.getReturnType() instanceof VoidType)){
            MissingReturnStatement exception = new MissingReturnStatement(functionDec.getLine(), functionDec.getFunctionName().getName());
            functionDec.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        functionDeclaration.setFunctionName(new Identifier("main"));
        functionDeclaration.setReturnType(new VoidType());
        functionDeclaration.setArgs(new ArrayList<>());
        FunctionSymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(functionDeclaration);
        try {
            SymbolTable.root.put(functionSymbolTableItem);
        }
        catch (ItemAlreadyExistsException e){//unreachable
        }

        SymbolTable newSymbolTable = new SymbolTable();
        SymbolTable.push(newSymbolTable);
        validForReturn = false;
        mainDec.getBody().accept(this);
        validForReturn = true;
        SymbolTable.pop();
        functionSymbolTableItem.setFunctionSymbolTable(newSymbolTable);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        String name = variableDec.getVarName().getName();
        VariableSymbolTableItem varItem;
        try { //struct
            varItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + name);
        } catch (ItemNotFoundException exception) { //function & main
            varItem = new VariableSymbolTableItem(variableDec.getVarName());
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExistsException e) {//unReachable
            }
        }
        Type type = variableDec.getVarType();

        checkForUndefinedStructs(type);
        for(String u : undefined){
            StructNotDeclared exception = new StructNotDeclared(variableDec.getLine(), u);
            variableDec.addError(exception);
            type =  new NoType();
        }
        undefined.clear();

        varItem.setType(type);
        if (variableDec.getDefaultValue() != null) {
            Type defaultType = variableDec.getDefaultValue().accept(expressionTypeChecker);
            if (! expressionTypeChecker.sameType(varItem.getType(), defaultType)) {
                UnsupportedOperandType exception = new UnsupportedOperandType(variableDec.getLine(), BinaryOperator.assign.name());
                variableDec.addError(exception);
            }
        }
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        try {
            String varKey = VariableSymbolTableItem.START_KEY + setGetVarDec.getVarName().getName();
            VariableSymbolTableItem varItem = (VariableSymbolTableItem) SymbolTable.top.getItem(varKey);
            varItem.setType(setGetVarDec.getVarType());
        } catch (ItemNotFoundException exception) {//unreachable
        }

        FunctionDeclaration newFuncDec = new FunctionDeclaration();
        newFuncDec.setReturnType(setGetVarDec.getVarType());
        curFunction = newFuncDec;

        SymbolTable newSymbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(newSymbolTable);

        for(VariableDeclaration varDec : setGetVarDec.getArgs()){
            varDec.accept(this);
        }
        validForReturn = false;
        validForVarDec = false;
        setGetVarDec.getSetterBody().accept(this);
        SymbolTable.pop();
        validForReturn = true;
        setGetVarDec.getGetterBody().accept(this);
        validForVarDec = true;
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Expression lExpr = assignmentStmt.getLValue();
        Expression rExpr = assignmentStmt.getRValue();
        Type lType = lExpr.accept(expressionTypeChecker);
        Type rType = rExpr.accept(expressionTypeChecker);

        if(!expressionTypeChecker.isLvalue(lExpr)){
            LeftSideNotLvalue exception = new LeftSideNotLvalue(assignmentStmt.getLine());
            assignmentStmt.addError(exception);
        }

        if(!expressionTypeChecker.sameType(lType,rType)) {
            UnsupportedOperandType exception = new UnsupportedOperandType(assignmentStmt.getLine(), BinaryOperator.assign.name());
            assignmentStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement statement: blockStmt.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        boolean hasReturnIf, hasReturnElse = false, hasReturnCur;
        hasReturnCur = hasReturn;
        Type condType = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if(!(condType instanceof BoolType || condType instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(conditionalStmt.getLine());
            conditionalStmt.addError(exception);
        }
        SymbolTable newSymbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(newSymbolTable);
        hasReturn = false;
        conditionalStmt.getThenBody().accept(this);
        hasReturnIf = hasReturn;
        SymbolTable.pop();
        if(conditionalStmt.getElseBody() != null) {
            newSymbolTable = new SymbolTable(SymbolTable.top);
            SymbolTable.push(newSymbolTable);
            hasReturn = false;
            conditionalStmt.getElseBody().accept(this);
            hasReturnElse = hasReturn;
            SymbolTable.pop();
        }
        if(hasReturnCur){
            hasReturn = true;
        }
        else {
            hasReturn = hasReturnIf && hasReturnElse;
        }
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        expressionTypeChecker.setInFunctionCallStmt(true);
        functionCallStmt.getFunctionCall().accept(expressionTypeChecker);
        expressionTypeChecker.setInFunctionCallStmt(false);
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        Type argType =  displayStmt.getArg().accept(expressionTypeChecker);
        if(argType instanceof FptrType || argType instanceof StructType) {
            UnsupportedTypeForDisplay exception = new UnsupportedTypeForDisplay(displayStmt.getLine());
            displayStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        hasReturn = true;
        Type returnType = new VoidType();
        if (returnStmt.getReturnedExpr() != null)
            returnType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if(!validForReturn){
            CannotUseReturn exception = new CannotUseReturn(returnStmt.getLine());
            returnStmt.addError(exception);
        }
        else if(!expressionTypeChecker.sameType(curFunction.getReturnType(), returnType)){
            ReturnValueNotMatchFunctionReturnType exception = new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine());
            returnStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        boolean hasReturnCur;
        hasReturnCur = hasReturn;
        Type condType = loopStmt.getCondition().accept(expressionTypeChecker);
        if(!(condType instanceof BoolType || condType instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(loopStmt.getLine());
            loopStmt.addError(exception);
        }

        SymbolTable newSymbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(newSymbolTable);
        loopStmt.getBody().accept(this);
        SymbolTable.pop();

        hasReturn = hasReturnCur;
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        for (VariableDeclaration varDec: varDecStmt.getVars())
            varDec.accept(this);

        if(!validForVarDec){
            CannotUseDefineVar exception = new CannotUseDefineVar(varDecStmt.getLine());
            varDecStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        expressionTypeChecker.setInFunctionCallStmt(true);
        listAppendStmt.getListAppendExpr().accept(expressionTypeChecker);
        expressionTypeChecker.setInFunctionCallStmt(false);
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        return null;
    }
}
