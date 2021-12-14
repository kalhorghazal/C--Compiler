package main.compileError.typeError;

import main.compileError.CompileError;

public class AccessOnNonStruct extends CompileError {
    public AccessOnNonStruct(int line) {
        super(line, "Access on a non-struct");
    }
}