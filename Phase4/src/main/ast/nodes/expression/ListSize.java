package main.ast.nodes.expression;

import main.visitor.IVisitor;

//line -> SIZE
public class ListSize extends Expression {
    private Expression arg;

    public ListSize(Expression arg) {
        this.arg = arg;
    }

    public void setArg(Expression arg) { this.arg = arg; }
    public Expression getArg() {
        return arg;
    }

    @Override
    public String toString() {
        return "ListSize";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}