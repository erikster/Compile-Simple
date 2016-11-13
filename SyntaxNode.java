/**  
 *  Tree stuff. Needs nodes, leaves.
 *  Each node has a value, represented as a string.
 *
 */
public class SyntaxNode {
    public SyntaxNode left;
    public SyntaxNode right;
    public NodeType   type;
    public String     value;
    
    public SyntaxNode(SyntaxNode left, SyntaxNode right, NodeType type, String value) {
        this.left  = left;
        this.right = right;
        this.type  = type;
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}

public enum NodeType {
    VALUE, OPERATOR, EXPRESSION
}