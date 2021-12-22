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
import main.visitor.Visitor;

public class TypeChecker extends Visitor<Void> {
    ExpressionTypeChecker expressionTypeChecker;
    public FunctionDeclaration currentFunction;

    public void TypeChecker(){
        this.expressionTypeChecker = new ExpressionTypeChecker();
    }

    @Override
    public Void visit(Program program) {
        //Todo: done:)
        for (StructDeclaration structDeclaration: program.getStructs())
            structDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration:program.getFunctions())
            functionDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        //Todo
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
        Type condType = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if(!(condType instanceof BoolType || condType instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(conditionalStmt.getLine());
            conditionalStmt.addError(exception);
        }
        conditionalStmt.getThenBody().accept(this);
        if(conditionalStmt.getElseBody() != null) {
            conditionalStmt.getElseBody().accept(this);
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
        Type retType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        Type actualRetType = this.currentFunction.getReturnType();
        if(!retType.toString().equals(actualRetType.toString())) {
            ReturnValueNotMatchFunctionReturnType exception = new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine());
            returnStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        //Todo: done:)
        Type condType = loopStmt.getCondition().accept(expressionTypeChecker);
        if(!(condType instanceof BoolType || condType instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(loopStmt.getLine());
            loopStmt.addError(exception);
        }
        loopStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        //Todo: done:)
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
