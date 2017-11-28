package analyzer;

import grammar.antlr4.SimpleCodeLexer;
import grammar.antlr4.SimpleCodeParser;


public abstract class Base
{
	Base(String filename)
	{
		this.filename = filename;
	}

	abstract public String analyze();

	SimpleCodeLexer lexer = null;
	SimpleCodeParser parser = null;
	String filename = "";
}
