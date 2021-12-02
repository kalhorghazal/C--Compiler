package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.ListSize;
import main.visitor.IVisitor;

//line -> line of ListSize
public class ListSizeStmt extends Statement{
    private ListSize listSizeExpr;

    public ListSizeStmt(ListSize listSizeExpr) {
        this.listSizeExpr = listSizeExpr;
    }

    public void setListSizeExpr(ListSize listSizeExpr) { this.listSizeExpr = listSizeExpr; }
    public Expression getListSizeExpr() { return listSizeExpr; }

    @Override
    public String toString() {
        return "SizeStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
