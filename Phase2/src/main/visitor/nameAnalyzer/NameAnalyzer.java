package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.symbolTable.utils.graph.Graph;

public class NameAnalyzer {
    private Program program;
    private Graph<String> classHierarchy;

    public NameAnalyzer(Program program) {
        this.program = program;
    }

    public void analyze() {
        NameCollector nameCollector = new NameCollector();
        NameChecker nameChecker = new NameChecker();
        this.program.accept(nameCollector);
        this.program.accept(nameChecker);
    }

    public Graph<String> getClassHierarchy() {
        return classHierarchy;
    }

}
