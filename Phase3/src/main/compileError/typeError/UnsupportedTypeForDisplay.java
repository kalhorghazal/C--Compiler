package main.compileError.typeError;

import main.compileError.CompileError;

public class UnsupportedTypeForDisplay extends CompileError {

    public UnsupportedTypeForDisplay(int line) {
        super(line, "Unsupported type for display");
    }

}
