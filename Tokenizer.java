/**
 *  Converts non-whitespace stuff to nodes
 *
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.*;

public class Tokenizer {
    Queue<Token> tokens;
    // corresponds to numbers (values)
    Pattern valuePattern = Pattern.compile("[0-9]");
    // corresponds to operators (+-*/)
    Pattern operPattern  = Pattern.compile("[+\-*/]");
    Pattern openparensPattern = Pattern.compile("\(");
    Pattern closeparensPattern = Pattern.compile("\)");
    Pattern whitespacePattern = Pattern.compile("\s");
    
    public Tokenizer() {
    }
    
    public void buildTokensFromString(String input) {
        tokens = new LinkedList<>();
        char[] arr = input.toCharArray();
        for (int counter = 0; counter < arr.length;) {
            String str = String.valueOf(arr[counter]);
            if (valuePattern.matcher(str)) {
                
            }
        }
    }
}