import java.io.*;
import java.util.Queue;

/**
 *  Main class. Takes an input file, tokenizes it, parses it, then evaluates it.
 *
 *  @author Erik Steringer
 */
 public class Main {
    public static void main(String[] args) {
        Tokenizer tr = new Tokenizer();
        tr.buildTokensFromString("2 + ( 1 + 2 )");
        Queue<Token> queue = tr.getTokens();
        for (Token t : queue) {
            System.out.println(t);
        }
    }
 }