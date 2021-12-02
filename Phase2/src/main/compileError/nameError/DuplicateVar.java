package main.compileError.nameError;

import main.compileError.CompileError;

public class DuplicateVar extends CompileError {
    public DuplicateVar(int line, String varName) {
        super(line, "Variable " + varName + " is already declared");
    }
}
