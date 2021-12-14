package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.ListAppend;
import main.visitor.IVisitor;

public class ListAppendStmt extends Statement{
    private ListAppend listAppendExpr;

    public ListAppendStmt(ListAppend listAppendExpr) {
        this.listAppendExpr = listAppendExpr;
    }

    public void setListAppendExpr(ListAppend listAppendExpr) { this.listAppendExpr = listAppendExpr; }
    public Expression getListAppendExpr() { return listAppendExpr; }

    @Override
    public String toString() {
        return "AppendStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
