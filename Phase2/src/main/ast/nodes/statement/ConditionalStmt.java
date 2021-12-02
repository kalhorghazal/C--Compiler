package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

//line -> IF
public class ConditionalStmt extends Statement{
    private Expression condition;
    private Statement thenBody;
    private Statement elseBody;

    public ConditionalStmt(Expression expression) {
        this.condition = expression;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getThenBody() {
        return thenBody;
    }

    public void setThenBody(Statement thenBody) {
        this.thenBody = thenBody;
    }

    public Statement getElseBody() {
        return elseBody;
    }

    public void setElseBody(Statement elseBody) {
        this.elseBody = elseBody;
    }

    @Override
    public String toString() {
        return "ConditionalStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
