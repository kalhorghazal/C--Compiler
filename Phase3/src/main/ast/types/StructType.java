package main.ast.types;

import main.ast.nodes.expression.Identifier;

public class StructType extends Type {
    private Identifier structName;

    public StructType(Identifier structName) {
        this.structName = structName;
    }

    public Identifier getStructName() { return structName; }
    public void setStructName(Identifier structName) {
        this.structName = structName;
    }

    @Override
    public String toString() {
        return "StructType_" + this.structName.getName();
    }
}
