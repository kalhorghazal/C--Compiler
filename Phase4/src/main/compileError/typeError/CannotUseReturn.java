package main.compileError.typeError;

import main.compileError.CompileError;

public class CannotUseReturn extends CompileError {
    public CannotUseReturn(int line) {
        super(line, "Cannot use return statement in this scope");
    }
}