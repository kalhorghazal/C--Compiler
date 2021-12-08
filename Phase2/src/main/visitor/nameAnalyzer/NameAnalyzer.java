package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.symbolTable.utils.graph.Graph;

public class NameAnalyzer {
    private Program program;
    private Graph<String> structHierarchy;

    public NameAnalyzer(Program program) {
        this.program = program;
    }

    public void analyze() {
        NameCollector nameCollector = new NameCollector();
        GraphMaker graphMaker = new GraphMaker();
        this.program.accept(nameCollector);
        this.structHierarchy = graphMaker.analyze(program);
        NameChecker nameChecker = new NameChecker(getStructHierarchy());
        this.program.accept(nameChecker);
    }

    public Graph<String> getStructHierarchy() {
        return structHierarchy;
    }

}
