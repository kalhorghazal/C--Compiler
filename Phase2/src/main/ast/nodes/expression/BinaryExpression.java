package main.ast.nodes.expression;

import main.ast.nodes.expression.operators.BinaryOperator;
import main.visitor.IVisitor;

//line -> The line of operator
public class BinaryExpression extends Expression {
    private Expression firstOperand;
    private Expression secondOperand;
    private BinaryOperator binaryOperator;

    public BinaryExpression(Expression firstOperand, Expression secondOperand, BinaryOperator binaryOperator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.binaryOperator = binaryOperator;
    }

    public Expression getFirstOperand() {
        return firstOperand;
    }
    public void setFirstOperand(Expression firstOperand) {
        this.firstOperand = firstOperand;
    }

    public Expression getSecondOperand() {
        return secondOperand;
    }
    public void setSecondOperand(Expression secondOperand) {
        this.secondOperand = secondOperand;
    }

    public BinaryOperator getBinaryOperator() {
        return binaryOperator;
    }
    public void setBinaryOperator(BinaryOperator binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

    @Override
    public String toString() {
        return "BinaryExpression_" + this.binaryOperator.name();
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
