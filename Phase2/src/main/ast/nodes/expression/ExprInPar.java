package main.ast.nodes.expression;
import main.visitor.IVisitor;

import java.util.*;

//line -> LPAR
public class ExprInPar extends Expression {
    private ArrayList<Expression> inputs;

    public ExprInPar(ArrayList<Expression> inputs) {
        this.inputs = inputs;
    }

    public ArrayList<Expression> getInputs() {
        return inputs;
    }

    public void setInputs(ArrayList<Expression> inputs) {
        this.inputs = inputs;
    }

    @Override
    public String toString() {
        return "ExprInPar";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


}
