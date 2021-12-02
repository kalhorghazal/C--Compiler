package main.ast.types;

public class ListType extends Type {
    private Type elementType;

    public ListType(Type elementType) {
        this.elementType = elementType;
    }

    public Type getType() {
        return elementType;
    }
    public void setType(Type elementType) {
        this.elementType = elementType;
    }

    @Override
    public String toString() {
        return "ListType";
    }
}

