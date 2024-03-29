package machine;

import antlr.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Parser {
    public AMGrammarBaseListener parseInput (String input) {
        try {
            //CharStream cs = CharStreams.fromFileName("src/main/resources/MP_Grammar.txt");
            InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
            AMGrammarLexer amLexer = new AMGrammarLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
            //AMGrammarLexer amLexer = new AMGrammarLexer(cs);
            CommonTokenStream commonTokenStream = new CommonTokenStream(amLexer);
            AMGrammarBaseListener listener = new AMGrammarBaseListener();

            AMGrammarParser amParser = new AMGrammarParser(commonTokenStream);

            ParseTree tree = amParser.start();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(listener, tree);

            return listener;

//            commonTokenStream.fill();
//
//            for(Token t : commonTokenStream.getTokens()) {
//                System.out.printf("%-35s `%s`%n",
//                amLexer.VOCABULARY.getSymbolicName(t.getType()),
//                t.getText().replace("\n", "\\n"));
//            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<SyntaxError> getSyntaxErrors(String input)
    {

        try {
            //CharStream cs = CharStreams.fromFileName("src/main/resources/MP_Grammar.txt");
            InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
            AMGrammarLexer amLexer = null;
            amLexer = new AMGrammarLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
            //AMGrammarLexer amLexer = new AMGrammarLexer(cs);
            CommonTokenStream commonTokenStream = new CommonTokenStream(amLexer);

            AMGrammarParser amParser = new AMGrammarParser(commonTokenStream);

            SyntaxErrorListener listener = new SyntaxErrorListener();
            amParser.addErrorListener(listener);
            amParser.start();

            return listener.getSyntaxErrors();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
