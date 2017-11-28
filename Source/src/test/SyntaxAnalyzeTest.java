package test;

import analyzer.Syntaxical;

import java.io.IOException;

public class SyntaxAnalyzeTest
{
    public SyntaxAnalyzeTest(String FileName)
    {
        this.filename = FileName;
    }

    public void Run()
    {
        String input = null;
        try
        {
            input = new utils.ANTLRReader(this.filename).read();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Syntaxical analyzer = new Syntaxical(input, this.filename);

        System.out.println(analyzer.analyze());
    }

    private String filename = "";
}
