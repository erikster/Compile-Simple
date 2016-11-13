/**
 *  Pieces of text to be converted into items.
 *
 */
public class Token {
    public TokenType type;
    public String value;
}

public enum TokenType {
    VALUE, OPENPARENS, CLOSEPARENS, OPERATOR
}