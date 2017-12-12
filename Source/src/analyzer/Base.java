package analyzer;

import grammar.antlr4.SimpleCodeLexer;
import grammar.antlr4.SimpleCodeParser;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 12:09 PM, 28/Nov/2017
 */

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
