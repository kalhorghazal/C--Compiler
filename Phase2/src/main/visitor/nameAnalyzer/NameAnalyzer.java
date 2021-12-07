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
        //ParentLinker parentLinker = new ParentLinker();
        //ParentsNameChecker parentsNameChecker = new ParentsNameChecker();
        this.program.accept(nameCollector);
       // this.classHierarchy = parentLinker.analyze(program);
        // this.program.accept(parentsNameChecker);
    }

    public Graph<String> getClassHierarchy() {
        return classHierarchy;
    }

}
