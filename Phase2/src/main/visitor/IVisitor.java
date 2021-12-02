package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;

public interface IVisitor<T> {

    T visit(Program program);

    T visit(FunctionDeclaration functionDeclaration);
    T visit(MainDeclaration mainDeclaration);
    T visit(VariableDeclaration variableDeclaration);
    T visit(StructDeclaration structDeclaration);
    T visit(SetGetVarDeclaration setGetVarDeclaration);

    T visit(AssignmentStmt assignmentStmt);
    T visit(BlockStmt blockStmt);
    T visit(ConditionalStmt conditionalStmt);
    T visit(FunctionCallStmt functionCallStmt);
    T visit(DisplayStmt displayStmt);
    T visit(ReturnStmt returnStmt);
    T visit(LoopStmt loopStmt);
    T visit(VarDecStmt varDecStmt);
    T visit(ListAppendStmt listAppendStmt);
    T visit(ListSizeStmt listSizeStmt);

    T visit(BinaryExpression binaryExpression);
    T visit(UnaryExpression unaryExpression);
    T visit(FunctionCall functionCallCall);
    T visit(Identifier identifier);
    T visit(ListAccessByIndex listAccessByIndex);
    T visit(StructAccess structAccess);
    T visit(ListSize listSize);
    T visit(ListAppend listAppend);
    T visit(ExprInPar exprInPar);

    T visit(IntValue intValue);
    T visit(BoolValue boolValue);



}
