package main.compileError.typeError;

import main.compileError.CompileError;

public class CannotUseDefineVar extends CompileError {
    public CannotUseDefineVar(int line) {
        super(line, "Cannot define a new variable in this scope");
    }
}