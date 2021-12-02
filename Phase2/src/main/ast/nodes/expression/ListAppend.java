package main.ast.nodes.expression;

import main.visitor.IVisitor;

//line -> APPEND
public class ListAppend extends Expression{
    private Expression listArg;
    private Expression elementArg;

    public ListAppend(Expression listArg, Expression elementArg) {
        this.listArg = listArg;
        this.elementArg = elementArg;
    }

    public void setListArg(Expression listArg) { this.listArg = listArg; }
    public Expression getListArg() { return listArg; }

    public void setElementArg(Expression elementArg) { this.elementArg = elementArg; }
    public Expression getElementArg() {
        return elementArg;
    }

    @Override
    public String toString() {
        return "ListAppend";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
