package analyzer;

import grammar.antlr4.SimpleCodeLexer;
import myexception.LexerError;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 12:09 PM, 28/Nov/2017
 */

public class Lexical extends Base
{

	public Lexical(String input, String filename)
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
	}

	@Override
	public String analyze()
	{
		StringBuilder sb = new StringBuilder();

		while (true)
		{
			try
			{
				Token token = lexer.nextToken();
				if (token.getType() == SimpleCodeLexer.EOF)
				{
					break;
				}

				switch (token.getType())
				{
					case SimpleCodeLexer.CHAR_LITERAL:
						addToken(sb, token, "CHARLITERAL");
						break;

					case SimpleCodeLexer.STRING_LITERAL:
						addToken(sb, token, "STRINGLITERAL");
						break;

					case SimpleCodeLexer.INT_LITERAL:
						addToken(sb, token, "INTLITERAL");
						break;

					case SimpleCodeLexer.BOOL_LITERAL:
						addToken(sb, token, "BOOLEANLITERAL");
						break;

					case SimpleCodeLexer.ID:
						addToken(sb, token, "IDENTIFIER");
						break;

					case SimpleCodeLexer.CHAR:
						String t = (int)token.getText().charAt(0) < 32 ? "0x" + Integer.toHexString((int)token.getText().charAt(0)).toUpperCase()
								: token.getText();
						String msg = "line [" + token.getLine() + ":" + token.getCharPositionInLine()
										+ "]: unexpected character [" + t + "].";
						throw new RuntimeException(new LexerError(msg));

					default:
						addToken(sb, token, "");
						break;
				}
			}
			catch (RuntimeException e)
			{
				Path p = Paths.get(this.filename);
				sb.append(p.getFileName().toString()).append(" ");
				sb.append(e.getCause().getMessage());
				sb.append("\n");
			}
		}

		return sb.toString();
	}

	private void addToken(StringBuilder stringBuilder, Token token, String type)
	{
		Path p = Paths.get(this.filename);
		stringBuilder.append(p.getFileName().toString()).append(" ");
		stringBuilder.append(token.getLine());
		stringBuilder.append(" ").append(type).append(" ");
		stringBuilder.append(token.getText());
		stringBuilder.append("\n");
	}

}
