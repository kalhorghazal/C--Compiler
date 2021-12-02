package main.compileError.nameError;

import main.compileError.CompileError;

public class CyclicDependency extends CompileError {
    public CyclicDependency(int line, String structName) {
        super(line, "Struct " + structName + " is in dependency cycle");
    }
}
