package analyzer;

import grammar.antlr4.SimpleCodeLexer;
import grammar.antlr4.SimpleCodeParser;
import grammar.parsetree.node.IrNode;
import grammar.parsetree.parser.SymbolTableVisitor;
import grammar.parsetree.symtab.SymbolTable;
import myexception.LexerError;
import myexception.MyErrorStrategy;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 12:09 PM, 28/Nov/2017
 */

public class Syntaxical extends Base
{
	public Syntaxical(String input, String filename)
	{
		super(filename);
		ANTLRInputStream istream = new ANTLRInputStream(input);
		this.lexer = new SimpleCodeLexer(istream)
		{
			@Override
			public void recover(LexerNoViableAltException lnvae)
			{
				CharStream charStream = lnvae.getInputStream();
				String msg = "line [" + _tokenStartLine + ":" + getCharPositionInLine()
						+ "]: unexpected character ["
						+ getErrorDisplay(charStream.getText(Interval.of(getCharIndex(), getCharIndex())))
						+ "].";
				throw new RuntimeException(new LexerError(msg));
			}
		};
		this.lexer.removeErrorListeners();

		CommonTokenStream tokens = new CommonTokenStream(this.lexer);

		this.parser = new SimpleCodeParser(tokens);
		this.parser.setErrorHandler(new MyErrorStrategy(input));
		this.parser.removeErrorListeners();
	}

	@Override
	public String analyze()
	{
		try
		{
			ParseTree tree = this.parser.root();
//			System.out.println(tree.toStringTree(this.parser));
		}

		catch (RuntimeException e)
		{
			Throwable t = e.getCause();
			if (null == t.getMessage())
			{
				return e.getMessage();
			}
			else
			{
				return t.getMessage();
			}
		}

		return "";
	}
}
