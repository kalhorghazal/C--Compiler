package main.compileError.typeError;

import main.compileError.CompileError;

public class StructNotDeclared extends CompileError {
    public StructNotDeclared(int line, String structName) {
        super(line, "Struct " + structName + " is not declared");
    }
}
