package main.visitor.name;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.visitor.*;

public class ASTTreePrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message){
        System.out.println("Line " + line + ": " + message);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
        for (StructDeclaration structDeclaration: program.getStructs())
            structDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration:program.getFunctions())
            functionDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        //todo
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        //todo
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        //todo
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        //todo
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        //todo
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        //todo
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        //todo
        return null;
    }

    @Override
    public Void visit(FunctionCall funcCall) {
        //todo
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        //todo
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListSize listSize) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListAppend listAppend) {
        //todo
        return null;
    }

    @Override
    public Void visit(ExprInPar exprInPar) {
        //todo
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        //todo
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        //todo
        return null;
    }
}
