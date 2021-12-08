package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.symbolTable.utils.graph.Graph;
import main.symbolTable.utils.graph.exceptions.GraphDoesNotContainNodeException;
import main.symbolTable.utils.graph.exceptions.NodeAlreadyExistsException;

public class GraphMaker {

    public Graph<String> analyze(Program program) {
        Graph<String> structHierarchy = new Graph<>();
        for (StructDeclaration structDeclaration : program.getStructs()) {
            String structName = structDeclaration.getStructName().getName();
            for (String child : structDeclaration.getChildrenStructs()) {
                try {
                    try {
                        structHierarchy.addNode(child);
                    } catch (NodeAlreadyExistsException ignored) {}
                    structHierarchy.addNodeAsParentOf(child, structName);
                } catch (GraphDoesNotContainNodeException ignored) {}
            }
        }
        return structHierarchy;
    }
}
