package main.compileError.nameError;

import main.compileError.CompileError;

public class DuplicateStruct extends CompileError {
    public DuplicateStruct(int line, String structName) {
        super(line, "Duplicate struct " + structName);
    }
}
