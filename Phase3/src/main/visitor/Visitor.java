package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;

public class Visitor<T> implements IVisitor<T> {

    @Override
    public T visit(Program program) {
        return null;
    }

    @Override
    public T visit(FunctionDeclaration functionDeclaration) {
        return null;
    }

    @Override
    public T visit(MainDeclaration mainDeclaration) {
        return null;
    }

    @Override
    public T visit(VariableDeclaration variableDeclaration) {
        return null;
    }

    @Override
    public T visit(StructDeclaration structDeclaration) {
        return null;
    }

    @Override
    public T visit(SetGetVarDeclaration setGetVarDeclaration) {
        return null;
    }

    @Override
    public T visit(AssignmentStmt assignmentStmt) {
        return null;
    }

    @Override
    public T visit(BlockStmt blockStmt) {
        return null;
    }

    @Override
    public T visit(ConditionalStmt conditionalStmt) {
        return null;
    }

    @Override
    public T visit(FunctionCallStmt functionCallStmt) {
        return null;
    }

    @Override
    public T visit(DisplayStmt displayStmt) {
        return null;
    }

    @Override
    public T visit(ReturnStmt returnStmt) {
        return null;
    }

    @Override
    public T visit(LoopStmt loopStmt) {
        return null;
    }

    @Override
    public T visit(VarDecStmt varDecStmt) {
        return null;
    }

    @Override
    public T visit(ListAppendStmt listAppendStmt) {
        return null;
    }

    @Override
    public T visit(ListSizeStmt listSizeStmt) {
        return null;
    }

    @Override
    public T visit(BinaryExpression binaryExpression) {
        return null;
    }

    @Override
    public T visit(UnaryExpression unaryExpression) {
        return null;
    }

    @Override
    public T visit(Identifier identifier) {
        return null;
    }

    @Override
    public T visit(ListAccessByIndex listAccessByIndex) {
        return null;
    }

    @Override
    public T visit(StructAccess structAccess) {
        return null;
    }

    @Override
    public T visit(FunctionCall functionCall) {
        return null;
    }

    @Override
    public T visit(IntValue intValue) {
        return null;
    }

    @Override
    public T visit(BoolValue boolValue) {
        return null;
    }

    @Override
    public T visit(ListSize listSize) {
        return null;
    }

    @Override
    public T visit(ListAppend listAppend) {
        return null;
    }

    @Override
    public T visit(ExprInPar exprInPar) {
        return null;
    }
}
