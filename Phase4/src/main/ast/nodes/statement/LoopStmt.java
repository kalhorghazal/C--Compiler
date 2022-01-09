package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

//line -> in do...while : do  , in while : while
public class LoopStmt extends Statement {
    private Expression condition;
    private Statement body;
    private boolean isDoWhile;

    public Expression getCondition() {
        return condition;
    }
    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getBody() {
        return body;
    }
    public void setBody(Statement body) {
        this.body = body;
    }

    public boolean getIsDoWhile() {
        return isDoWhile;
    }
    public void setIsDoWhile(boolean isDoWhile) {
        this.isDoWhile = isDoWhile;
    }

    @Override
    public String toString() {
        return "LoopStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

