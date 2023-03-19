package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MainParser {
    public static void parseInput(String input)
    {
        try {
            // CharStream cs = CharStreams.fromFileName("src/main/resources/MP_Grammar.txt");
            InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
            AMGrammarLexer amLexer = new AMGrammarLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
            CommonTokenStream commonTokenStream = new CommonTokenStream(amLexer);

            List<String> info = new ArrayList<>();
            AMGrammarBaseListener listener = new AMGrammarBaseListener(info);

            AMGrammarParser amParser = new AMGrammarParser(commonTokenStream);
            ParseTree tree = amParser.start();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(listener, tree);


//            commonTokenStream.fill();
//
//            for(Token t : commonTokenStream.getTokens()) {
//                System.out.printf("%-35s `%s`%n",
//                amLexer.VOCABULARY.getSymbolicName(t.getType()),
//                t.getText().replace("\n", "\\n"));
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
