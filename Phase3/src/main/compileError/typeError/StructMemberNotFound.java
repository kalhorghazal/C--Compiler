package main.compileError.typeError;

import main.compileError.CompileError;

public class StructMemberNotFound extends CompileError {
    public StructMemberNotFound(int line, String structName, String varName) {
        super(line, "There is no member named " + varName + " in struct " + structName);
    }
}
