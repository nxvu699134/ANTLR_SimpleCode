package utils;

import grammar.antlr4.SimpleCodeLexer;
import grammar.antlr4.SimpleCodeParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Scanner
{
    public Scanner(String FileName)
    {
        this.FileName = FileName;
    }

    public String Scan()
    {
        ANTLRInputStream input = null;
        try
        {
            input = new ANTLRInputStream(new ANTLRReader(this.FileName).read());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return "";
        }

        SimpleCodeLexer lexer = new SimpleCodeLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleCodeParser parser = new SimpleCodeParser(tokens);

        ParseTree tree = parser.program();

        for (int i = 0; i < tokens.size(); ++i)
        {
            Token token = tokens.get(i);
            int type = token.getType();
            String[] a = parser.getTokenNames();
            System.out.println((type > 0 ? parser.getTokenNames()[token.getType()] : "EOF") + ":" + "'" + token.getText()+ "'");
        }
        return tree.toStringTree(parser);
    }

    private String FileName = "";
}
