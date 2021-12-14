package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class StructAccess extends Expression {
    private Expression instance;
    private Identifier element;

    public StructAccess(Expression instance, Identifier element) {
        this.instance = instance;
        this.element = element;
    }

    public Expression getInstance() {
        return instance;
    }

    public void setInstance(Expression instance) {
        this.instance = instance;
    }

    public Identifier getElement() {
        return element;
    }

    public void setElement(Identifier element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "StructAccess";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


}
