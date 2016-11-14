/**
 *  Converts non-whitespace stuff to nodes
 *
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.*;

public class Tokenizer {
    private Queue<Token> tokens;
    private Pattern valuePattern = Pattern.compile("[0-9]");
    private Pattern operPattern  = Pattern.compile("[+\\-*/]");
    private Pattern openparensPattern = Pattern.compile("\\(");
    private Pattern closeparensPattern = Pattern.compile("\\)");
    private Pattern whitespacePattern = Pattern.compile("\\s");
    
    public Tokenizer() {
    }
    
    public void buildTokensFromString(String input) {
        tokens = new LinkedList<>();
        char[] arr = input.toCharArray();
        for (int counter = 0; counter < arr.length; ) {
            String str = String.valueOf(arr[counter]);
            if (valuePattern.matcher(str).matches()) {
                StringBuilder sb = new StringBuilder(str);
                // numbers can be more than one digit
                while(valuePattern.matcher(arr[counter + 1] + "").matches()) {
                    counter++;
                    sb.append(arr[counter]);
                }
                tokens.add(new Token(TokenType.VALUE, sb.toString()));
            } else if (operPattern.matcher(str).matches()) {
                tokens.add(new Token(TokenType.OPERATOR, str));
            } else if (openparensPattern.matcher(str).matches()) {
                tokens.add(new Token(TokenType.OPENPARENS, str));
            } else if (closeparensPattern.matcher(str).matches()) {
                tokens.add(new Token(TokenType.CLOSEPARENS, str));
            } else if (whitespacePattern.matcher(str).matches()) {
                // ignore whitespace
            } else {
                System.out.println("Error while tokenizing: Unexpected character: '" + str + "'");
                System.exit(-1);
            }
            counter++;
        }
    }
    
    public Queue<Token> getTokens() {
        return this.tokens;
    }
}