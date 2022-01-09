package main.ast.nodes.statement;

import main.visitor.IVisitor;

import java.util.ArrayList;

//line -> BEGIN
public class BlockStmt extends Statement{
    private ArrayList<Statement> statements = new ArrayList<>();

    public ArrayList<Statement> getStatements() {
        return statements;
    }
    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }
    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    @Override
    public String toString() {
        return "BlockStmt";
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
