package main.compileError.typeError;

import main.compileError.CompileError;

public class AppendToNonList extends CompileError {
    public AppendToNonList(int line) {
        super(line, "Append to a non-list");
    }
}