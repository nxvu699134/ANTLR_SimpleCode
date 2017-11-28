package test;

import analyzer.*;

import java.io.IOException;

public class LexicalAnalyzeTest
{
	public LexicalAnalyzeTest(String FileName)
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

		Lexical analyzer = new Lexical(input, this.filename);

		System.out.println(analyzer.analyze());

	}

	private String filename = "";
}