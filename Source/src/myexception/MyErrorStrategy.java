package myexception;

import org.antlr.v4.runtime.*;

//public class MyErrorStrategy extends DefaultErrorStrategy
//{
//
//	@Override
//	public void recover(Parser recognizer, RecognitionException e) {
//		throw e;
//	}
//
//	@Override
//	public void reportInputMismatch(Parser recognizer, InputMismatchException e) throws RecognitionException {
//		String msg = "mismatched input " + getTokenErrorDisplay(e.getOffendingToken());
//		msg += " expecting one of "+e.getExpectedTokens().toString(recognizer.getTokenNames());
//		RecognitionException ex = new RecognitionException(msg, recognizer, recognizer.getInputStream(), recognizer.getContext());
//		ex.initCause(e);
//		throw ex;
//	}
//
//	@Override
//	public void reportMissingToken(Parser recognizer) {
//		beginErrorCondition(recognizer);
//		Token t = recognizer.getCurrentToken();
//		IntervalSet expecting = getExpectedTokens(recognizer);
//		String msg = "missing "+expecting.toString(recognizer.getTokenNames()) + " at " + getTokenErrorDisplay(t);
//		throw new RecognitionException(msg, recognizer, recognizer.getInputStream(), recognizer.getContext());
//	}
//}

public final class MyErrorStrategy extends DefaultErrorStrategy
{
	private static final String MISMATCHED_INPUT_ERROR_MESSAGE = "line [%s:%s]: mismatched input, found %s, expected %s.";
	private static final String VIABLE_ALTERNATIVE_ERROR_MESSAGE = "line [%s:%s]: can't find viable alternative at %s. Rule context: %s.";
	private static final String TOKEN_DISPLAY_FORMAT = "[%s]";
	private static final int STRING_START = 0;

	private final String originalExpression;

	public MyErrorStrategy(String expression)
	{
		this.originalExpression = expression;
	}

	private static void setExceptionContext(Parser recognizer, RuntimeException e)
	{
		for (ParserRuleContext context = recognizer.getContext();
			 context != null; context = context.getParent())
		{
			context.exception = (RecognitionException) e;
		}
	}

	@Override
	public void recover(Parser recognizer, RecognitionException error)
	{
		setExceptionContext(recognizer, error);
		throw new RuntimeException(error);
	}

	@Override
	public void reportError(Parser recognizer, RecognitionException error)
	{
		if (inErrorRecoveryMode(recognizer))
		{
			return; // don't report spurious errors
		}
		beginErrorCondition(recognizer);
		if (error instanceof NoViableAltException)
		{
			reportNoViableAlternative(recognizer, (NoViableAltException) error);
		}
		else if (error instanceof InputMismatchException)
		{
			reportInputMismatch(recognizer, (InputMismatchException) error);
		}
		else if (error instanceof FailedPredicateException)
		{

			reportFailedPredicate(recognizer, (FailedPredicateException) error);
		}
		else
		{
			recognizer.notifyErrorListeners(error.getOffendingToken(), error.getMessage(), error);
		}
	}

	@Override
	protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e)
	{
		String msg = formViableExceptionMessage(e, recognizer);
		recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
		throw new RuntimeException(msg, e);
	}

	private boolean tokenIsEOF(Token token)
	{
		return getSymbolType(token) == Token.EOF;
	}

	private static String getContext(Parser recognizer, TokenStream tokens)
	{
		String context = tokens.getText(recognizer.getContext());
		return context.isEmpty() ? "No context available" : context;
	}

	private String getPieceOfTextWhichContainsError(RecognitionException e)
	{
		return originalExpression.substring(STRING_START, e.getOffendingToken().getStopIndex());
	}

	private String formViableExceptionMessage(NoViableAltException e, Parser recognizer)
	{
		TokenStream tokens = recognizer.getInputStream();
		String context = getContext(recognizer, tokens);
		return String.format(VIABLE_ALTERNATIVE_ERROR_MESSAGE,
				e.getOffendingToken().getLine(), e.getOffendingToken().getCharPositionInLine(),
				escapeWSAndQuote(getInputToken(e, tokens)), context);
	}

	@Override
	public Token recoverInline(Parser recognizer) throws RecognitionException
	{
		InputMismatchException e = new InputMismatchException(recognizer);
		String msg = String.format(MISMATCHED_INPUT_ERROR_MESSAGE,
				e.getOffendingToken().getLine(),
				e.getOffendingToken().getCharPositionInLine(),
				getTokenErrorDisplay(e.getOffendingToken()),
				e.getExpectedTokens().toString(recognizer.getTokenNames()));
		recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
		RecognitionException ex = new RecognitionException(msg, recognizer, recognizer.getInputStream(), recognizer.getContext());
		ex.initCause(e);
		throw new RuntimeException(ex);
	}


	@Override
	protected void reportInputMismatch(Parser recognizer, InputMismatchException e) throws RecognitionException
	{
		String msg = String.format(MISMATCHED_INPUT_ERROR_MESSAGE,
				e.getOffendingToken().getLine(),
				e.getOffendingToken().getCharPositionInLine(),
				getTokenErrorDisplay(e.getOffendingToken()),
				e.getExpectedTokens().toString(recognizer.getTokenNames()));
		recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
		RecognitionException ex = new RecognitionException(msg, recognizer, recognizer.getInputStream(), recognizer.getContext());
		ex.initCause(e);
		throw new RuntimeException(ex);
	}

	@Override
	protected String getTokenErrorDisplay(Token token) {
		if (token == null) {
			return "<no token>";
		}
		return escapeWSAndQuote(String.format(TOKEN_DISPLAY_FORMAT, getErrorSymbol(token)));
	}

	private static boolean noTextSymbol(String s)
	{
		return s == null;
	}

	private String getErrorSymbol(Token token)
	{
		String symbol = getSymbolText(token);

		if (noTextSymbol(symbol)) {
			if (tokenIsEOF(token)) {
				symbol = "EOF";
			} else {
				symbol = String.valueOf(getSymbolType(token));
			}
		}
		return symbol;
	}

	private String getInputToken(NoViableAltException e, TokenStream tokens) {
		if (tokens != null) {
			String input;
			if (tokenIsEOF(e.getStartToken())) {
				input = "EOF";
			} else {
				input = tokens.getText(e.getStartToken(), e.getOffendingToken());
			}
			return input;
		}
		return "unknown input";
	}
}