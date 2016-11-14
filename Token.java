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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (type) {
            case VALUE:
                sb.append("VALUE");
                break;
            case OPENPARENS:
                sb.append("OPENPARENS");
                break;
            case CLOSEPARENS:
                sb.append("CLOSEPARENS");
                break;
            case OPERATOR:
                sb.append("OPERATOR");
                break;
        }
        sb.append(": \"");
        sb.append(value);
        sb.append("\"");
        return sb.toString();
    }
}

