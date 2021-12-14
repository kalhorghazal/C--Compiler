package main.visitor.type;

import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.types.Type;
import main.visitor.Visitor;

public class ExpressionTypeChecker extends Visitor<Type> {

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        //Todo
        return null;
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        //Todo
        return null;
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        //Todo
        return null;
    }

    @Override
    public Type visit(Identifier identifier) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        //Todo
        return null;
    }

    @Override
    public Type visit(StructAccess structAccess) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ListSize listSize) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ListAppend listAppend) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ExprInPar exprInPar) {
        //Todo
        return null;
    }

    @Override
    public Type visit(IntValue intValue) {
        //Todo
        return null;
    }

    @Override
    public Type visit(BoolValue boolValue) {
        //Todo
        return null;
    }
}
