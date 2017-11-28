// Generated from /run/media/innovation/My_Passport/MY_DATA/Daihoc/YEAR_4/SEMESTER_1/NGUYEN_LY_NN_LT/THUC_HANH/ANTLR_SimpleCode/Source/src/grammar/antlr4/SimpleCode.g4 by ANTLR 4.7
package grammar.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, K_VOID=5, K_CALLOUT=6, K_RETURN=7, K_CLASS=8, 
		K_IF=9, K_ELSE=10, BOOL_LITERAL=11, K_TRUE=12, K_FALSE=13, K_FOR=14, K_CONTINUE=15, 
		K_BREAK=16, K_INT=17, K_BOOLEAN=18, WHITE_SPACE=19, LINE_COMMENT=20, BLOCK_COMMENT=21, 
		SEMI=22, GT=23, LT=24, GE=25, LE=26, EQ=27, PLUS_EQ=28, MINUS_EQ=29, DOUBLE_EQ=30, 
		EX_EQ=31, MULT=32, DIV=33, PLUS=34, MINUS=35, MODULUS=36, COMMA=37, LPAREN=38, 
		RPAREN=39, LCBRACKET=40, RCBRACKET=41, LSBRACKET=42, RSBRACKET=43, ID=44, 
		INT_LITERAL=45, CHAR_LITERAL=46, STRING_LITERAL=47, CHAR=48;
	public static final int
		RULE_root = 0, RULE_program = 1, RULE_field_decl = 2, RULE_field = 3, 
		RULE_method_decl = 4, RULE_method_arg = 5, RULE_block = 6, RULE_var_decl = 7, 
		RULE_type = 8, RULE_statement = 9, RULE_assign_statement = 10, RULE_if_statement = 11, 
		RULE_for_statment = 12, RULE_return_statment = 13, RULE_break_statement = 14, 
		RULE_continue_statement = 15, RULE_assign_op = 16, RULE_method_call = 17, 
		RULE_method_name = 18, RULE_location = 19, RULE_expr = 20, RULE_callout_arg = 21, 
		RULE_bin_op = 22, RULE_arith_op = 23, RULE_rel_op = 24, RULE_eq_op = 25, 
		RULE_cond_op = 26, RULE_literal = 27, RULE_id = 28, RULE_int_literal = 29, 
		RULE_bool_literal = 30, RULE_char_literal = 31, RULE_string_literal = 32;
	public static final String[] ruleNames = {
		"root", "program", "field_decl", "field", "method_decl", "method_arg", 
		"block", "var_decl", "type", "statement", "assign_statement", "if_statement", 
		"for_statment", "return_statment", "break_statement", "continue_statement", 
		"assign_op", "method_call", "method_name", "location", "expr", "callout_arg", 
		"bin_op", "arith_op", "rel_op", "eq_op", "cond_op", "literal", "id", "int_literal", 
		"bool_literal", "char_literal", "string_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Program'", "'!'", "'&&'", "'||'", "'void'", "'callout'", "'return'", 
		"'class'", "'if'", "'else'", null, "'true'", "'false'", "'for'", "'continue'", 
		"'break'", "'int'", "'boolean'", null, null, null, "';'", "'>'", "'<'", 
		"'>='", "'<='", "'='", "'+='", "'-='", "'=='", "'!='", "'*'", "'/'", "'+'", 
		"'-'", "'%'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "K_VOID", "K_CALLOUT", "K_RETURN", "K_CLASS", 
		"K_IF", "K_ELSE", "BOOL_LITERAL", "K_TRUE", "K_FALSE", "K_FOR", "K_CONTINUE", 
		"K_BREAK", "K_INT", "K_BOOLEAN", "WHITE_SPACE", "LINE_COMMENT", "BLOCK_COMMENT", 
		"SEMI", "GT", "LT", "GE", "LE", "EQ", "PLUS_EQ", "MINUS_EQ", "DOUBLE_EQ", 
		"EX_EQ", "MULT", "DIV", "PLUS", "MINUS", "MODULUS", "COMMA", "LPAREN", 
		"RPAREN", "LCBRACKET", "RCBRACKET", "LSBRACKET", "RSBRACKET", "ID", "INT_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimpleCodeParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			program();
			setState(67);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode K_CLASS() { return getToken(SimpleCodeParser.K_CLASS, 0); }
		public TerminalNode LCBRACKET() { return getToken(SimpleCodeParser.LCBRACKET, 0); }
		public TerminalNode RCBRACKET() { return getToken(SimpleCodeParser.RCBRACKET, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(K_CLASS);
			setState(70);
			match(T__0);
			setState(71);
			match(LCBRACKET);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					field_decl();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_VOID) | (1L << K_INT) | (1L << K_BOOLEAN))) != 0)) {
				{
				{
				setState(78);
				method_decl();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(RCBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SimpleCodeParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SimpleCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleCodeParser.COMMA, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitField_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitField_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			type();
			setState(87);
			field();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				field();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LSBRACKET() { return getToken(SimpleCodeParser.LSBRACKET, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(SimpleCodeParser.RSBRACKET, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			id();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSBRACKET) {
				{
				setState(98);
				match(LSBRACKET);
				setState(99);
				int_literal();
				setState(100);
				match(RSBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimpleCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleCodeParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode K_VOID() { return getToken(SimpleCodeParser.K_VOID, 0); }
		public List<Method_argContext> method_arg() {
			return getRuleContexts(Method_argContext.class);
		}
		public Method_argContext method_arg(int i) {
			return getRuleContext(Method_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleCodeParser.COMMA, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitMethod_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitMethod_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INT:
			case K_BOOLEAN:
				{
				setState(104);
				type();
				}
				break;
			case K_VOID:
				{
				setState(105);
				match(K_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			id();
			setState(109);
			match(LPAREN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_INT || _la==K_BOOLEAN) {
				{
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						method_arg();
						setState(111);
						match(COMMA);
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(118);
				method_arg();
				}
			}

			setState(121);
			match(RPAREN);
			setState(122);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_argContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Method_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterMethod_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitMethod_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitMethod_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_argContext method_arg() throws RecognitionException {
		Method_argContext _localctx = new Method_argContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			type();
			setState(125);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCBRACKET() { return getToken(SimpleCodeParser.LCBRACKET, 0); }
		public TerminalNode RCBRACKET() { return getToken(SimpleCodeParser.RCBRACKET, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LCBRACKET);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_INT || _la==K_BOOLEAN) {
				{
				{
				setState(128);
				var_decl();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CALLOUT) | (1L << K_RETURN) | (1L << K_IF) | (1L << K_FOR) | (1L << K_CONTINUE) | (1L << K_BREAK) | (1L << LCBRACKET) | (1L << ID))) != 0)) {
				{
				{
				setState(134);
				statement();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(RCBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SimpleCodeParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SimpleCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleCodeParser.COMMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			type();
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					id();
					setState(144);
					match(COMMA);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(151);
			id();
			setState(152);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode K_INT() { return getToken(SimpleCodeParser.K_INT, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(SimpleCodeParser.K_BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==K_INT || _la==K_BOOLEAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleCodeParser.SEMI, 0); }
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statmentContext for_statment() {
			return getRuleContext(For_statmentContext.class,0);
		}
		public Return_statmentContext return_statment() {
			return getRuleContext(Return_statmentContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				assign_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				method_call();
				setState(158);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				for_statment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				return_statment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				break_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				continue_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_statementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleCodeParser.SEMI, 0); }
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			location();
			setState(169);
			assign_op();
			setState(170);
			expr(0);
			setState(171);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SimpleCodeParser.K_IF, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleCodeParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleCodeParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(SimpleCodeParser.K_ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(K_IF);
			setState(174);
			match(LPAREN);
			setState(175);
			expr(0);
			setState(176);
			match(RPAREN);
			setState(177);
			block();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(178);
				match(K_ELSE);
				setState(179);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statmentContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SimpleCodeParser.K_FOR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SimpleCodeParser.EQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SimpleCodeParser.COMMA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterFor_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitFor_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitFor_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statmentContext for_statment() throws RecognitionException {
		For_statmentContext _localctx = new For_statmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(K_FOR);
			setState(183);
			id();
			setState(184);
			match(EQ);
			setState(185);
			expr(0);
			setState(186);
			match(COMMA);
			setState(187);
			expr(0);
			setState(188);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statmentContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SimpleCodeParser.K_RETURN, 0); }
		public TerminalNode SEMI() { return getToken(SimpleCodeParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterReturn_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitReturn_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitReturn_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statmentContext return_statment() throws RecognitionException {
		Return_statmentContext _localctx = new Return_statmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(K_RETURN);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << K_CALLOUT) | (1L << BOOL_LITERAL) | (1L << MINUS) | (1L << LPAREN) | (1L << ID) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL))) != 0)) {
				{
				setState(191);
				expr(0);
				}
			}

			setState(194);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode K_BREAK() { return getToken(SimpleCodeParser.K_BREAK, 0); }
		public TerminalNode SEMI() { return getToken(SimpleCodeParser.SEMI, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(K_BREAK);
			setState(197);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode K_CONTINUE() { return getToken(SimpleCodeParser.K_CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(SimpleCodeParser.SEMI, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(K_CONTINUE);
			setState(200);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SimpleCodeParser.EQ, 0); }
		public TerminalNode PLUS_EQ() { return getToken(SimpleCodeParser.PLUS_EQ, 0); }
		public TerminalNode MINUS_EQ() { return getToken(SimpleCodeParser.MINUS_EQ, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitAssign_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLUS_EQ) | (1L << MINUS_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimpleCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleCodeParser.RPAREN, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleCodeParser.COMMA, i);
		}
		public TerminalNode K_CALLOUT() { return getToken(SimpleCodeParser.K_CALLOUT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_method_call);
		int _la;
		try {
			int _alt;
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				method_name();
				setState(205);
				match(LPAREN);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << K_CALLOUT) | (1L << BOOL_LITERAL) | (1L << MINUS) | (1L << LPAREN) | (1L << ID) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(206);
					callout_arg();
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(207);
						match(COMMA);
						setState(208);
						callout_arg();
						}
						}
						setState(213);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(216);
				match(RPAREN);
				}
				break;
			case K_CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(K_CALLOUT);
				setState(219);
				match(LPAREN);
				setState(220);
				string_literal();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(221);
					match(COMMA);
					setState(227);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(222);
							callout_arg();
							setState(223);
							match(COMMA);
							}
							} 
						}
						setState(229);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					setState(230);
					callout_arg();
					}
				}

				setState(233);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitMethod_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LSBRACKET() { return getToken(SimpleCodeParser.LSBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(SimpleCodeParser.RSBRACKET, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_location);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				id();
				setState(241);
				match(LSBRACKET);
				setState(242);
				expr(0);
				setState(243);
				match(RSBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SimpleCodeParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(SimpleCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleCodeParser.RPAREN, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(248);
				location();
				}
				break;
			case 2:
				{
				setState(249);
				method_call();
				}
				break;
			case 3:
				{
				setState(250);
				literal();
				}
				break;
			case 4:
				{
				setState(251);
				match(MINUS);
				setState(252);
				expr(3);
				}
				break;
			case 5:
				{
				setState(253);
				match(T__1);
				setState(254);
				expr(2);
				}
				break;
			case 6:
				{
				setState(255);
				match(LPAREN);
				setState(256);
				expr(0);
				setState(257);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(261);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(262);
					bin_op();
					setState(263);
					expr(5);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitCallout_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitCallout_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_callout_arg);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case K_CALLOUT:
			case BOOL_LITERAL:
			case MINUS:
			case LPAREN:
			case ID:
			case INT_LITERAL:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				expr(0);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_opContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitBin_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bin_op);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case DIV:
			case PLUS:
			case MINUS:
			case MODULUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				arith_op();
				}
				break;
			case GT:
			case LT:
			case GE:
			case LE:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				rel_op();
				}
				break;
			case DOUBLE_EQ:
			case EX_EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				eq_op();
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SimpleCodeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleCodeParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(SimpleCodeParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(SimpleCodeParser.DIV, 0); }
		public TerminalNode MODULUS() { return getToken(SimpleCodeParser.MODULUS, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitArith_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitArith_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << PLUS) | (1L << MINUS) | (1L << MODULUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(SimpleCodeParser.GT, 0); }
		public TerminalNode LT() { return getToken(SimpleCodeParser.LT, 0); }
		public TerminalNode GE() { return getToken(SimpleCodeParser.GE, 0); }
		public TerminalNode LE() { return getToken(SimpleCodeParser.LE, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode DOUBLE_EQ() { return getToken(SimpleCodeParser.DOUBLE_EQ, 0); }
		public TerminalNode EX_EQ() { return getToken(SimpleCodeParser.EX_EQ, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitEq_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_EQ || _la==EX_EQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_opContext extends ParserRuleContext {
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitCond_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitCond_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				int_literal();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				char_literal();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				bool_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleCodeParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SimpleCodeParser.INT_LITERAL, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitInt_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(INT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode BOOL_LITERAL() { return getToken(SimpleCodeParser.BOOL_LITERAL, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bool_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(BOOL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(SimpleCodeParser.CHAR_LITERAL, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitChar_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitChar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(CHAR_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SimpleCodeParser.STRING_LITERAL, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCodeVisitor ) return ((SimpleCodeVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0132\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3\7"+
		"\3R\n\3\f\3\16\3U\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6t\n\6\f\6\16\6w\13\6\3\6\5\6z\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00a9\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b7"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00c3\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00d4\n\23\f\23\16\23\u00d7\13\23\5\23\u00d9\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e4\n\23\f\23\16\23\u00e7\13"+
		"\23\3\23\5\23\u00ea\n\23\3\23\3\23\5\23\u00ee\n\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00f8\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0106\n\26\3\26\3\26\3\26\3\26\7\26\u010c"+
		"\n\26\f\26\16\26\u010f\13\26\3\27\3\27\5\27\u0113\n\27\3\30\3\30\3\30"+
		"\3\30\5\30\u0119\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\5\35\u0126\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\3"+
		"*#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2"+
		"\b\3\2\23\24\3\2\35\37\3\2\"&\3\2\31\34\3\2 !\3\2\5\6\2\u0135\2D\3\2\2"+
		"\2\4G\3\2\2\2\6X\3\2\2\2\bc\3\2\2\2\nl\3\2\2\2\f~\3\2\2\2\16\u0081\3\2"+
		"\2\2\20\u0090\3\2\2\2\22\u009c\3\2\2\2\24\u00a8\3\2\2\2\26\u00aa\3\2\2"+
		"\2\30\u00af\3\2\2\2\32\u00b8\3\2\2\2\34\u00c0\3\2\2\2\36\u00c6\3\2\2\2"+
		" \u00c9\3\2\2\2\"\u00cc\3\2\2\2$\u00ed\3\2\2\2&\u00ef\3\2\2\2(\u00f7\3"+
		"\2\2\2*\u0105\3\2\2\2,\u0112\3\2\2\2.\u0118\3\2\2\2\60\u011a\3\2\2\2\62"+
		"\u011c\3\2\2\2\64\u011e\3\2\2\2\66\u0120\3\2\2\28\u0125\3\2\2\2:\u0127"+
		"\3\2\2\2<\u0129\3\2\2\2>\u012b\3\2\2\2@\u012d\3\2\2\2B\u012f\3\2\2\2D"+
		"E\5\4\3\2EF\7\2\2\3F\3\3\2\2\2GH\7\n\2\2HI\7\3\2\2IM\7*\2\2JL\5\6\4\2"+
		"KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2PR\5\n\6\2"+
		"QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7+\2\2"+
		"W\5\3\2\2\2XY\5\22\n\2Y^\5\b\5\2Z[\7\'\2\2[]\5\b\5\2\\Z\3\2\2\2]`\3\2"+
		"\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\30\2\2b\7\3\2\2\2ch"+
		"\5:\36\2de\7,\2\2ef\5<\37\2fg\7-\2\2gi\3\2\2\2hd\3\2\2\2hi\3\2\2\2i\t"+
		"\3\2\2\2jm\5\22\n\2km\7\7\2\2lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2no\5:\36\2"+
		"oy\7(\2\2pq\5\f\7\2qr\7\'\2\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xz\5\f\7\2yu\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{|\7)\2\2|}\5\16\b\2}\13\3\2\2\2~\177\5\22\n\2\177\u0080\5:\36\2\u0080"+
		"\r\3\2\2\2\u0081\u0085\7*\2\2\u0082\u0084\5\20\t\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\5\24\13\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7+\2\2\u008f\17\3\2\2\2\u0090"+
		"\u0096\5\22\n\2\u0091\u0092\5:\36\2\u0092\u0093\7\'\2\2\u0093\u0095\3"+
		"\2\2\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\5:"+
		"\36\2\u009a\u009b\7\30\2\2\u009b\21\3\2\2\2\u009c\u009d\t\2\2\2\u009d"+
		"\23\3\2\2\2\u009e\u00a9\5\26\f\2\u009f\u00a0\5$\23\2\u00a0\u00a1\7\30"+
		"\2\2\u00a1\u00a9\3\2\2\2\u00a2\u00a9\5\30\r\2\u00a3\u00a9\5\32\16\2\u00a4"+
		"\u00a9\5\34\17\2\u00a5\u00a9\5\36\20\2\u00a6\u00a9\5 \21\2\u00a7\u00a9"+
		"\5\16\b\2\u00a8\u009e\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a2\3\2\2\2"+
		"\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\5(\25\2\u00ab"+
		"\u00ac\5\"\22\2\u00ac\u00ad\5*\26\2\u00ad\u00ae\7\30\2\2\u00ae\27\3\2"+
		"\2\2\u00af\u00b0\7\13\2\2\u00b0\u00b1\7(\2\2\u00b1\u00b2\5*\26\2\u00b2"+
		"\u00b3\7)\2\2\u00b3\u00b6\5\16\b\2\u00b4\u00b5\7\f\2\2\u00b5\u00b7\5\16"+
		"\b\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00b9"+
		"\7\20\2\2\u00b9\u00ba\5:\36\2\u00ba\u00bb\7\35\2\2\u00bb\u00bc\5*\26\2"+
		"\u00bc\u00bd\7\'\2\2\u00bd\u00be\5*\26\2\u00be\u00bf\5\16\b\2\u00bf\33"+
		"\3\2\2\2\u00c0\u00c2\7\t\2\2\u00c1\u00c3\5*\26\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\30\2\2\u00c5\35\3\2\2"+
		"\2\u00c6\u00c7\7\22\2\2\u00c7\u00c8\7\30\2\2\u00c8\37\3\2\2\2\u00c9\u00ca"+
		"\7\21\2\2\u00ca\u00cb\7\30\2\2\u00cb!\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd"+
		"#\3\2\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d8\7(\2\2\u00d0\u00d5\5,\27\2\u00d1"+
		"\u00d2\7\'\2\2\u00d2\u00d4\5,\27\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\7)\2\2\u00db\u00ee\3\2\2\2\u00dc\u00dd\7\b\2\2\u00dd"+
		"\u00de\7(\2\2\u00de\u00e9\5B\"\2\u00df\u00e5\7\'\2\2\u00e0\u00e1\5,\27"+
		"\2\u00e1\u00e2\7\'\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00ea\5,\27\2\u00e9\u00df\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7)\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00ce\3\2\2\2\u00ed\u00dc\3\2\2\2\u00ee%\3\2\2\2\u00ef\u00f0\5:\36\2"+
		"\u00f0\'\3\2\2\2\u00f1\u00f8\5:\36\2\u00f2\u00f3\5:\36\2\u00f3\u00f4\7"+
		",\2\2\u00f4\u00f5\5*\26\2\u00f5\u00f6\7-\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f1\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8)\3\2\2\2\u00f9\u00fa\b\26\1\2"+
		"\u00fa\u0106\5(\25\2\u00fb\u0106\5$\23\2\u00fc\u0106\58\35\2\u00fd\u00fe"+
		"\7%\2\2\u00fe\u0106\5*\26\5\u00ff\u0100\7\4\2\2\u0100\u0106\5*\26\4\u0101"+
		"\u0102\7(\2\2\u0102\u0103\5*\26\2\u0103\u0104\7)\2\2\u0104\u0106\3\2\2"+
		"\2\u0105\u00f9\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u00fd"+
		"\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0101\3\2\2\2\u0106\u010d\3\2\2\2\u0107"+
		"\u0108\f\6\2\2\u0108\u0109\5.\30\2\u0109\u010a\5*\26\7\u010a\u010c\3\2"+
		"\2\2\u010b\u0107\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e+\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0113\5*\26\2"+
		"\u0111\u0113\5B\"\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113-\3\2"+
		"\2\2\u0114\u0119\5\60\31\2\u0115\u0119\5\62\32\2\u0116\u0119\5\64\33\2"+
		"\u0117\u0119\5\66\34\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119/\3\2\2\2\u011a\u011b\t\4\2\2\u011b"+
		"\61\3\2\2\2\u011c\u011d\t\5\2\2\u011d\63\3\2\2\2\u011e\u011f\t\6\2\2\u011f"+
		"\65\3\2\2\2\u0120\u0121\t\7\2\2\u0121\67\3\2\2\2\u0122\u0126\5<\37\2\u0123"+
		"\u0126\5@!\2\u0124\u0126\5> \2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2"+
		"\u0125\u0124\3\2\2\2\u01269\3\2\2\2\u0127\u0128\7.\2\2\u0128;\3\2\2\2"+
		"\u0129\u012a\7/\2\2\u012a=\3\2\2\2\u012b\u012c\7\r\2\2\u012c?\3\2\2\2"+
		"\u012d\u012e\7\60\2\2\u012eA\3\2\2\2\u012f\u0130\7\61\2\2\u0130C\3\2\2"+
		"\2\32MS^hluy\u0085\u008b\u0096\u00a8\u00b6\u00c2\u00d5\u00d8\u00e5\u00e9"+
		"\u00ed\u00f7\u0105\u010d\u0112\u0118\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}