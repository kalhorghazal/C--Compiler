package main.ast.nodes.expression;

import main.visitor.IVisitor;
import java.util.*;

//line -> LPAR before arguments
public class FunctionCall extends Expression {
    private Expression instance;
    private ArrayList<Expression> args = new ArrayList<>();

    public FunctionCall(Expression instance) {
        this.instance = instance;
    }

    public FunctionCall(Expression instance, ArrayList<Expression> args) {
        this.instance = instance;
        if (args != null)
            this.args = args;
    }

    public Expression getInstance() {
        return instance;
    }
    public void setInstance(Expression instance) {
        this.instance = instance;
    }

    public ArrayList<Expression> getArgs() {
        return args;
    }
    public void setArgs(ArrayList<Expression> args) {
        this.args = args;
    }
    public void addArg(Expression arg) {
        this.args.add(arg);
    }

    @Override
    public String toString() {
        return "FunctionCall";
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
