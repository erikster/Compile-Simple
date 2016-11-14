/**
 *  Pieces of text to be converted into items.
 *
 */
public class Token {
    public TokenType type;
    public String value;
    
    public Token(TokenType type, String value) {
        this.type  = type;
        this.value = value;
    }
}

