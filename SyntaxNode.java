/*  Tree stuff. Needs nodes, leaves.
 *  Each node has a value, represented as a string.
 *
 */

public class SyntaxNode {
    public SyntaxNode left;
    public SyntaxNode right;
    public String value;
}

public enum NodeType {
    VALUE, OPERATOR, EXPRESSION
}