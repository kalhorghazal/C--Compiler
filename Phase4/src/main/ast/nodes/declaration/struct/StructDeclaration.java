package main.ast.nodes.declaration.struct;

import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.statement.Statement;
import main.visitor.IVisitor;
import java.util.*;

//Line -> STRUCT
public class StructDeclaration extends Declaration {
    private Identifier structName;
    private Statement body;

    public Identifier getStructName() {
        return structName;
    }

    public void setStructName(Identifier structName) {
        this.structName = structName;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "StructDeclaration_" + structName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


}
