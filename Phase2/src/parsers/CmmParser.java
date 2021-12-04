// Generated from /home/ghazal/IdeaProjects/Phase2/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package parsers;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, RETURN=2, VOID=3, SIZE=4, DISPLAY=5, APPEND=6, IF=7, ELSE=8, PLUS=9, 
		MINUS=10, MULT=11, DIVIDE=12, EQUAL=13, ARROW=14, GREATER_THAN=15, LESS_THAN=16, 
		AND=17, OR=18, NOT=19, TRUE=20, FALSE=21, BEGIN=22, END=23, INT=24, BOOL=25, 
		LIST=26, STRUCT=27, FPTR=28, GET=29, SET=30, WHILE=31, DO=32, ASSIGN=33, 
		SHARP=34, LPAR=35, RPAR=36, LBRACK=37, RBRACK=38, COMMA=39, DOT=40, SEMICOLON=41, 
		NEWLINE=42, INT_VALUE=43, IDENTIFIER=44, COMMENT=45, WS=46;
	public static final int
		RULE_cmm = 0, RULE_program = 1, RULE_main = 2, RULE_structDeclaration = 3, 
		RULE_singleVarWithGetAndSet = 4, RULE_singleStatementStructBody = 5, RULE_structBody = 6, 
		RULE_getBody = 7, RULE_setBody = 8, RULE_functionDeclaration = 9, RULE_functionArgsDec = 10, 
		RULE_functionArguments = 11, RULE_body = 12, RULE_loopCondBody = 13, RULE_blockStatement = 14, 
		RULE_varDecStatement = 15, RULE_functionCallStmt = 16, RULE_returnStatement = 17, 
		RULE_ifStatement = 18, RULE_elseStatement = 19, RULE_loopStatement = 20, 
		RULE_whileLoopStatement = 21, RULE_doWhileLoopStatement = 22, RULE_displayStatement = 23, 
		RULE_assignmentStatement = 24, RULE_singleStatement = 25, RULE_expression = 26, 
		RULE_orExpression = 27, RULE_andExpression = 28, RULE_equalityExpression = 29, 
		RULE_relationalExpression = 30, RULE_additiveExpression = 31, RULE_multiplicativeExpression = 32, 
		RULE_preUnaryExpression = 33, RULE_accessExpression = 34, RULE_otherExpression = 35, 
		RULE_size = 36, RULE_append = 37, RULE_value = 38, RULE_boolValue = 39, 
		RULE_identifier = 40, RULE_structType = 41, RULE_listType = 42, RULE_type = 43, 
		RULE_fptrType = 44, RULE_typesWithComma = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "program", "main", "structDeclaration", "singleVarWithGetAndSet", 
			"singleStatementStructBody", "structBody", "getBody", "setBody", "functionDeclaration", 
			"functionArgsDec", "functionArguments", "body", "loopCondBody", "blockStatement", 
			"varDecStatement", "functionCallStmt", "returnStatement", "ifStatement", 
			"elseStatement", "loopStatement", "whileLoopStatement", "doWhileLoopStatement", 
			"displayStatement", "assignmentStatement", "singleStatement", "expression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"accessExpression", "otherExpression", "size", "append", "value", "boolValue", 
			"identifier", "structType", "listType", "type", "fptrType", "typesWithComma"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'return'", "'void'", "'size'", "'display'", "'append'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'=='", "'->'", "'>'", 
			"'<'", "'&'", "'|'", "'~'", "'true'", "'false'", "'begin'", "'end'", 
			"'int'", "'bool'", "'list'", "'struct'", "'fptr'", "'get'", "'set'", 
			"'while'", "'do'", "'='", "'#'", "'('", "')'", "'['", "']'", "','", "'.'", 
			"';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "RETURN", "VOID", "SIZE", "DISPLAY", "APPEND", "IF", "ELSE", 
			"PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "AND", "OR", "NOT", "TRUE", "FALSE", "BEGIN", "END", "INT", 
			"BOOL", "LIST", "STRUCT", "FPTR", "GET", "SET", "WHILE", "DO", "ASSIGN", 
			"SHARP", "LPAR", "RPAR", "LBRACK", "RBRACK", "COMMA", "DOT", "SEMICOLON", 
			"NEWLINE", "INT_VALUE", "IDENTIFIER", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmmContext extends ParserRuleContext {
		public Program cmmProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public CmmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCmm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCmm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCmm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmmContext cmm() throws RecognitionException {
		CmmContext _localctx = new CmmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(92);
				match(NEWLINE);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			((CmmContext)_localctx).p = program();
			((CmmContext)_localctx).cmmProgram =  ((CmmContext)_localctx).p.programRet;
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(100);
				match(NEWLINE);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
		public Program programRet;
		public StructDeclarationContext s;
		public FunctionDeclarationContext f;
		public MainContext m;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitProgram(this);
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
			((ProgramContext)_localctx).programRet =  new Program();
			     int line = 1;
			     _localctx.programRet.setLine(line);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					((ProgramContext)_localctx).s = structDeclaration();
					_localctx.programRet.addStruct(((ProgramContext)_localctx).s.structDeclarationRet);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				{
				setState(117);
				((ProgramContext)_localctx).f = functionDeclaration();
				_localctx.programRet.addFunction(((ProgramContext)_localctx).f.functionDeclarationRet);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			((ProgramContext)_localctx).m = main();
			_localctx.programRet.setMain(((ProgramContext)_localctx).m.mainRet);
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

	public static class MainContext extends ParserRuleContext {
		public MainDeclaration mainRet;
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(MAIN);
			setState(129);
			match(LPAR);
			setState(130);
			match(RPAR);
			setState(131);
			body();
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructDeclaration structDeclarationRet;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public SingleStatementStructBodyContext singleStatementStructBody() {
			return getRuleContext(SingleStatementStructBodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(STRUCT);
			setState(134);
			identifier();
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(135);
				match(BEGIN);
				setState(136);
				structBody();
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					match(NEWLINE);
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(142);
				match(END);
				}
				}
				break;
			case NEWLINE:
				{
				{
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					match(NEWLINE);
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(149);
				singleStatementStructBody();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(150);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(NEWLINE);
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SingleVarWithGetAndSetContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public SetBodyContext setBody() {
			return getRuleContext(SetBodyContext.class,0);
		}
		public GetBodyContext getBody() {
			return getRuleContext(GetBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SingleVarWithGetAndSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarWithGetAndSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleVarWithGetAndSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleVarWithGetAndSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleVarWithGetAndSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarWithGetAndSetContext singleVarWithGetAndSet() throws RecognitionException {
		SingleVarWithGetAndSetContext _localctx = new SingleVarWithGetAndSetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleVarWithGetAndSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			type();
			setState(161);
			identifier();
			setState(162);
			functionArgsDec();
			setState(163);
			match(BEGIN);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				match(NEWLINE);
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(169);
			setBody();
			setState(170);
			getBody();
			setState(171);
			match(END);
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

	public static class SingleStatementStructBodyContext extends ParserRuleContext {
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public SingleVarWithGetAndSetContext singleVarWithGetAndSet() {
			return getRuleContext(SingleVarWithGetAndSetContext.class,0);
		}
		public SingleStatementStructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatementStructBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatementStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatementStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatementStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementStructBodyContext singleStatementStructBody() throws RecognitionException {
		SingleStatementStructBodyContext _localctx = new SingleStatementStructBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleStatementStructBody);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				varDecStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				singleVarWithGetAndSet();
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

	public static class StructBodyContext extends ParserRuleContext {
		public List<SingleStatementStructBodyContext> singleStatementStructBody() {
			return getRuleContexts(SingleStatementStructBodyContext.class);
		}
		public SingleStatementStructBodyContext singleStatementStructBody(int i) {
			return getRuleContext(SingleStatementStructBodyContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(177);
						match(NEWLINE);
						}
						}
						setState(180); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(182);
							singleStatementStructBody();
							setState(183);
							match(SEMICOLON);
							}
							} 
						}
						setState(189);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(190);
					singleStatementStructBody();
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(191);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class GetBodyContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public GetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetBodyContext getBody() throws RecognitionException {
		GetBodyContext _localctx = new GetBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(GET);
			setState(199);
			body();
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				match(NEWLINE);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SetBodyContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetBodyContext setBody() throws RecognitionException {
		SetBodyContext _localctx = new SetBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(SET);
			setState(206);
			body();
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				match(NEWLINE);
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration functionDeclarationRet;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(212);
				type();
				}
				break;
			case VOID:
				{
				setState(213);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216);
			identifier();
			setState(217);
			functionArgsDec();
			setState(218);
			body();
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				match(NEWLINE);
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionArgsDecContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsDecContext functionArgsDec() throws RecognitionException {
		FunctionArgsDecContext _localctx = new FunctionArgsDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionArgsDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(LPAR);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(225);
				type();
				setState(226);
				identifier();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227);
					match(COMMA);
					setState(228);
					type();
					setState(229);
					identifier();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(238);
			match(RPAR);
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> functionArgsRet;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(240);
				expression();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(241);
					match(COMMA);
					setState(242);
					expression();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class BodyContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(250);
				blockStatement();
				}
				break;
			case NEWLINE:
				{
				{
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(251);
					match(NEWLINE);
					}
					}
					setState(254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(256);
				singleStatement();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(257);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LoopCondBodyContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public LoopCondBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCondBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopCondBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopCondBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopCondBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopCondBodyContext loopCondBody() throws RecognitionException {
		LoopCondBodyContext _localctx = new LoopCondBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopCondBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(262);
				blockStatement();
				}
				break;
			case NEWLINE:
				{
				{
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(263);
					match(NEWLINE);
					}
					}
					setState(266); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(268);
				singleStatement();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(BEGIN);
			setState(289); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(272);
						match(NEWLINE);
						}
						}
						setState(275); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(277);
							singleStatement();
							setState(278);
							match(SEMICOLON);
							}
							} 
						}
						setState(284);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(285);
					singleStatement();
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(286);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				match(NEWLINE);
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(298);
			match(END);
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public VarDecStmt varDecStmtRet;
		public VariableDeclaration tempVar;
		public TypeContext t;
		public IdentifierContext i1;
		public OrExpressionContext oe1;
		public IdentifierContext i2;
		public OrExpressionContext oe2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			((VarDecStatementContext)_localctx).t = type();
			setState(301);
			((VarDecStatementContext)_localctx).i1 = identifier();

			        ((VarDecStatementContext)_localctx).tempVar =  new VariableDeclaration(((VarDecStatementContext)_localctx).i1.idRet, ((VarDecStatementContext)_localctx).t.typeRet);
			        _localctx.tempVar.setLine(((VarDecStatementContext)_localctx).i1.line);
			    
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(303);
				match(ASSIGN);
				setState(304);
				((VarDecStatementContext)_localctx).oe1 = orExpression();
				 _localctx.tempVar.setDefaultValue(((VarDecStatementContext)_localctx).oe1.orExprRet); 
				}
			}


			        ((VarDecStatementContext)_localctx).varDecStmtRet =  new VarDecStmt();
			        _localctx.varDecStmtRet.addVar(_localctx.tempVar);
			        _localctx.varDecStmtRet.setLine(_localctx.tempVar.getLine());
			    
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310);
				match(COMMA);
				setState(311);
				((VarDecStatementContext)_localctx).i2 = identifier();

				        ((VarDecStatementContext)_localctx).tempVar =  new VariableDeclaration(((VarDecStatementContext)_localctx).i2.idRet, ((VarDecStatementContext)_localctx).t.typeRet);
				        _localctx.tempVar.setLine(((VarDecStatementContext)_localctx).i2.line);
				    
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(313);
					match(ASSIGN);
					setState(314);
					((VarDecStatementContext)_localctx).oe2 = orExpression();
					 _localctx.tempVar.setDefaultValue(((VarDecStatementContext)_localctx).oe2.orExprRet); 
					}
				}

				 _localctx.varDecStmtRet.addVar(_localctx.tempVar); 
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionCallStmtContext extends ParserRuleContext {
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStmtContext functionCallStmt() throws RecognitionException {
		FunctionCallStmtContext _localctx = new FunctionCallStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCallStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			otherExpression();
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(333);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(327);
						match(LPAR);
						setState(328);
						functionArguments();
						setState(329);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(331);
						match(DOT);
						setState(332);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(338);
			match(LPAR);
			setState(339);
			functionArguments();
			setState(340);
			match(RPAR);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStmtRet;
		public Token r;
		public ExpressionContext e;
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((ReturnStatementContext)_localctx).r = match(RETURN);

			        ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt();
			        _localctx.returnStmtRet.setLine(((ReturnStatementContext)_localctx).r.getLine());
			    
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(344);
				((ReturnStatementContext)_localctx).e = expression();
				 _localctx.returnStmtRet.setReturnedExpr(((ReturnStatementContext)_localctx).e.exprRet); 
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(IF);
			setState(350);
			expression();
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(351);
				loopCondBody();
				}
				break;
			case 2:
				{
				setState(352);
				body();
				setState(353);
				elseStatement();
				}
				break;
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(357);
				match(NEWLINE);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(ELSE);
			setState(364);
			loopCondBody();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public WhileLoopStatementContext whileLoopStatement() {
			return getRuleContext(WhileLoopStatementContext.class,0);
		}
		public DoWhileLoopStatementContext doWhileLoopStatement() {
			return getRuleContext(DoWhileLoopStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loopStatement);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				whileLoopStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				doWhileLoopStatement();
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

	public static class WhileLoopStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public WhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopStatementContext whileLoopStatement() throws RecognitionException {
		WhileLoopStatementContext _localctx = new WhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileLoopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(WHILE);
			setState(371);
			expression();
			setState(372);
			loopCondBody();
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

	public static class DoWhileLoopStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public DoWhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDoWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDoWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDoWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopStatementContext doWhileLoopStatement() throws RecognitionException {
		DoWhileLoopStatementContext _localctx = new DoWhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_doWhileLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(DO);
			setState(375);
			body();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(376);
				match(NEWLINE);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(WHILE);
			setState(383);
			expression();
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public DisplayStmt displayStmtRet;
		public Token d;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDisplayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDisplayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			((DisplayStatementContext)_localctx).d = match(DISPLAY);
			setState(386);
			match(LPAR);
			setState(387);
			((DisplayStatementContext)_localctx).e = expression();

			        ((DisplayStatementContext)_localctx).displayStmtRet =  new DisplayStmt(((DisplayStatementContext)_localctx).e.exprRet);
			        _localctx.displayStmtRet.setLine(((DisplayStatementContext)_localctx).d.getLine());
			    
			setState(389);
			match(RPAR);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentRet;
		public OrExpressionContext left;
		public Token a;
		public ExpressionContext right;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((AssignmentStatementContext)_localctx).left = orExpression();
			setState(392);
			((AssignmentStatementContext)_localctx).a = match(ASSIGN);
			setState(393);
			((AssignmentStatementContext)_localctx).right = expression();

			        ((AssignmentStatementContext)_localctx).assignmentRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).left.orExprRet, ((AssignmentStatementContext)_localctx).right.exprRet);
			        _localctx.assignmentRet.setLine(((AssignmentStatementContext)_localctx).a.getLine());
			    
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

	public static class SingleStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public FunctionCallStmtContext functionCallStmt() {
			return getRuleContext(FunctionCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_singleStatement);
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				displayStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				functionCallStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				assignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(401);
				varDecStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(402);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(403);
				append();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(404);
				size();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression exprRet;
		public OrExpressionContext oe;
		public Token a;
		public ExpressionContext e;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			((ExpressionContext)_localctx).oe = orExpression();
			 ((ExpressionContext)_localctx).exprRet =  ((ExpressionContext)_localctx).oe.orExprRet; 
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(409);
				((ExpressionContext)_localctx).a = match(ASSIGN);
				setState(410);
				((ExpressionContext)_localctx).e = expression();

				        BinaryOperator op = BinaryOperator.assign;
				        ((ExpressionContext)_localctx).exprRet =  new BinaryExpression(((ExpressionContext)_localctx).oe.orExprRet, ((ExpressionContext)_localctx).e.exprRet, op);
				        _localctx.exprRet.setLine(((ExpressionContext)_localctx).a.getLine());
				    
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExprRet;
		public AndExpressionContext ael;
		public Token o;
		public AndExpressionContext aer;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CmmParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CmmParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			((OrExpressionContext)_localctx).ael = andExpression();
			 ((OrExpressionContext)_localctx).orExprRet =  ((OrExpressionContext)_localctx).ael.andExprRet; 
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(417);
				((OrExpressionContext)_localctx).o = match(OR);
				setState(418);
				((OrExpressionContext)_localctx).aer = andExpression();

				        BinaryOperator op = BinaryOperator.or;
				        ((OrExpressionContext)_localctx).orExprRet =  new BinaryExpression(_localctx.orExprRet, ((OrExpressionContext)_localctx).aer.andExprRet, op);
				        _localctx.orExprRet.setLine(((OrExpressionContext)_localctx).o.getLine());
				    
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExprRet;
		public EqualityExpressionContext eel;
		public Token a;
		public EqualityExpressionContext ee2;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CmmParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			((AndExpressionContext)_localctx).eel = equalityExpression();
			 ((AndExpressionContext)_localctx).andExprRet =  ((AndExpressionContext)_localctx).eel.eqExprRet; 
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(428);
				((AndExpressionContext)_localctx).a = match(AND);
				setState(429);
				((AndExpressionContext)_localctx).ee2 = equalityExpression();

				        BinaryOperator op = BinaryOperator.and;
				        ((AndExpressionContext)_localctx).andExprRet =  new BinaryExpression(_localctx.andExprRet, ((AndExpressionContext)_localctx).ee2.eqExprRet, op);
				        _localctx.andExprRet.setLine(((AndExpressionContext)_localctx).a.getLine());
				    
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression eqExprRet;
		public BinaryOperator op;
		public int line;
		public RelationalExpressionContext rel;
		public Token eq;
		public RelationalExpressionContext rer;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CmmParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CmmParser.EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			((EqualityExpressionContext)_localctx).rel = relationalExpression();
			 ((EqualityExpressionContext)_localctx).eqExprRet =  ((EqualityExpressionContext)_localctx).rel.relExprRet; 
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(439);
				((EqualityExpressionContext)_localctx).eq = match(EQUAL);

				        ((EqualityExpressionContext)_localctx).op =  BinaryOperator.eq;
				        ((EqualityExpressionContext)_localctx).line =  ((EqualityExpressionContext)_localctx).eq.getLine();
				    
				setState(441);
				((EqualityExpressionContext)_localctx).rer = relationalExpression();

				        ((EqualityExpressionContext)_localctx).eqExprRet =  new BinaryExpression(_localctx.eqExprRet, ((EqualityExpressionContext)_localctx).rer.relExprRet, _localctx.op);
				        _localctx.eqExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relExprRet;
		public BinaryOperator op;
		public int line;
		public AdditiveExpressionContext ael;
		public Token gt;
		public Token lt;
		public AdditiveExpressionContext aer;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(CmmParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(CmmParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(CmmParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(CmmParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			((RelationalExpressionContext)_localctx).ael = additiveExpression();
			 ((RelationalExpressionContext)_localctx).relExprRet =  ((RelationalExpressionContext)_localctx).ael.addExprRet; 
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(455);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(451);
					((RelationalExpressionContext)_localctx).gt = match(GREATER_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.gt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).gt.getLine();
					    
					}
					break;
				case LESS_THAN:
					{
					setState(453);
					((RelationalExpressionContext)_localctx).lt = match(LESS_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.lt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).lt.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(457);
				((RelationalExpressionContext)_localctx).aer = additiveExpression();

				        ((RelationalExpressionContext)_localctx).relExprRet =  new BinaryExpression(_localctx.relExprRet, ((RelationalExpressionContext)_localctx).aer.addExprRet, _localctx.op);
				        _localctx.relExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression addExprRet;
		public BinaryOperator op;
		public int line;
		public MultiplicativeExpressionContext mel;
		public Token add;
		public Token sub;
		public MultiplicativeExpressionContext mer;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CmmParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CmmParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CmmParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CmmParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			((AdditiveExpressionContext)_localctx).mel = multiplicativeExpression();
			 ((AdditiveExpressionContext)_localctx).addExprRet =  ((AdditiveExpressionContext)_localctx).mel.multExprRet; 
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(471);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(467);
					((AdditiveExpressionContext)_localctx).add = match(PLUS);

					        ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.add;
					        ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).add.getLine();
					    
					}
					break;
				case MINUS:
					{
					setState(469);
					((AdditiveExpressionContext)_localctx).sub = match(MINUS);

					        ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.sub;
					        ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).sub.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(473);
				((AdditiveExpressionContext)_localctx).mer = multiplicativeExpression();

				        ((AdditiveExpressionContext)_localctx).addExprRet =  new BinaryExpression(_localctx.addExprRet, ((AdditiveExpressionContext)_localctx).mer.multExprRet, _localctx.op);
				        _localctx.addExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multExprRet;
		public BinaryOperator op;
		public int line;
		public PreUnaryExpressionContext pel;
		public Token mult;
		public Token div;
		public PreUnaryExpressionContext per;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CmmParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CmmParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CmmParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CmmParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			((MultiplicativeExpressionContext)_localctx).pel = preUnaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).multExprRet =  ((MultiplicativeExpressionContext)_localctx).pel.preUnaryExprRet; 
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(487);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(483);
					((MultiplicativeExpressionContext)_localctx).mult = match(MULT);

					        ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mult;
					        ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).mult.getLine();
					    
					}
					break;
				case DIVIDE:
					{
					setState(485);
					((MultiplicativeExpressionContext)_localctx).div = match(DIVIDE);

					        ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.div;
					        ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).div.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(489);
				((MultiplicativeExpressionContext)_localctx).per = preUnaryExpression();

				        ((MultiplicativeExpressionContext)_localctx).multExprRet =  new BinaryExpression(_localctx.multExprRet, ((MultiplicativeExpressionContext)_localctx).per.preUnaryExprRet, _localctx.op);
				        _localctx.multExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExprRet;
		public UnaryOperator op;
		public int line;
		public Token not;
		public Token minus;
		public PreUnaryExpressionContext pre;
		public AccessExpressionContext ae;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_preUnaryExpression);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(497);
					((PreUnaryExpressionContext)_localctx).not = match(NOT);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.not;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).not.getLine();
					    
					}
					break;
				case MINUS:
					{
					setState(499);
					((PreUnaryExpressionContext)_localctx).minus = match(MINUS);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.minus;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).minus.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(503);
				((PreUnaryExpressionContext)_localctx).pre = preUnaryExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pre.preUnaryExprRet, _localctx.op);
				        _localctx.preUnaryExprRet.setLine(_localctx.line);
				    
				}
				break;
			case SIZE:
			case APPEND:
			case TRUE:
			case FALSE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				((PreUnaryExpressionContext)_localctx).ae = accessExpression();
				 ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  ((PreUnaryExpressionContext)_localctx).ae.accessExprRet; 
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExprRet;
		public OtherExpressionContext oe;
		public Token l1;
		public FunctionArgumentsContext f;
		public IdentifierContext i1;
		public Token l2;
		public ExpressionContext index;
		public IdentifierContext i2;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CmmParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CmmParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CmmParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CmmParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_accessExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			 ((AccessExpressionContext)_localctx).accessExprRet =  ((AccessExpressionContext)_localctx).oe.otherExprRet; 
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(524);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(513);
						((AccessExpressionContext)_localctx).l1 = match(LPAR);
						setState(514);
						((AccessExpressionContext)_localctx).f = functionArguments();
						setState(515);
						match(RPAR);
						}

						        ((AccessExpressionContext)_localctx).accessExprRet =  new FunctionCall(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).f.functionArgsRet);
						        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).l1.getLine());
						    
						}
						break;
					case DOT:
						{
						{
						setState(519);
						match(DOT);
						setState(520);
						((AccessExpressionContext)_localctx).i1 = identifier();
						}

						        ((AccessExpressionContext)_localctx).accessExprRet =  new StructAccess(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).i1.idRet);
						        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).i1.line);
						    
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(540);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(529);
					((AccessExpressionContext)_localctx).l2 = match(LBRACK);
					setState(530);
					((AccessExpressionContext)_localctx).index = expression();
					setState(531);
					match(RBRACK);
					}

					        ((AccessExpressionContext)_localctx).accessExprRet =  new ListAccessByIndex(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).index.exprRet);
					        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).l2.getLine());
					    
					}
					break;
				case DOT:
					{
					{
					setState(535);
					match(DOT);
					setState(536);
					((AccessExpressionContext)_localctx).i2 = identifier();
					}

					        ((AccessExpressionContext)_localctx).accessExprRet =  new StructAccess(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).i2.idRet);
					        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).i2.line);
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExprRet;
		public ValueContext v;
		public IdentifierContext id;
		public Token l;
		public FunctionArgumentsContext f;
		public SizeContext s;
		public AppendContext a;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_otherExpression);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				((OtherExpressionContext)_localctx).v = value();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).v.valueRet; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				((OtherExpressionContext)_localctx).id = identifier();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).id.idRet; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				((OtherExpressionContext)_localctx).l = match(LPAR);
				{
				setState(552);
				((OtherExpressionContext)_localctx).f = functionArguments();
				}
				setState(553);
				match(RPAR);

				        ((OtherExpressionContext)_localctx).otherExprRet =  new ExprInPar(((OtherExpressionContext)_localctx).f.functionArgsRet);
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).l.getLine());
				    
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				((OtherExpressionContext)_localctx).s = size();

				        ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).s.listSizeRet;
				    
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				((OtherExpressionContext)_localctx).a = append();

				        ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).a.listAppendRet;
				    
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

	public static class SizeContext extends ParserRuleContext {
		public ListSize listSizeRet;
		public Token s;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			((SizeContext)_localctx).s = match(SIZE);
			setState(565);
			match(LPAR);
			setState(566);
			((SizeContext)_localctx).e = expression();

			        ((SizeContext)_localctx).listSizeRet =  new ListSize(((SizeContext)_localctx).e.exprRet);
			        _localctx.listSizeRet.setLine(((SizeContext)_localctx).s.getLine());
			    
			setState(568);
			match(RPAR);
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

	public static class AppendContext extends ParserRuleContext {
		public ListAppend listAppendRet;
		public Token a;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			((AppendContext)_localctx).a = match(APPEND);
			setState(571);
			match(LPAR);
			setState(572);
			((AppendContext)_localctx).e1 = expression();
			setState(573);
			match(COMMA);
			setState(574);
			((AppendContext)_localctx).e2 = expression();

			        ((AppendContext)_localctx).listAppendRet =  new ListAppend(((AppendContext)_localctx).e1.exprRet, ((AppendContext)_localctx).e2.exprRet);
			        _localctx.listAppendRet.setLine(((AppendContext)_localctx).a.getLine());
			    
			setState(576);
			match(RPAR);
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

	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public BoolValueContext b;
		public Token i;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(CmmParser.INT_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				((ValueContext)_localctx).b = boolValue();

				        ((ValueContext)_localctx).valueRet =  new BoolValue(((ValueContext)_localctx).b.boolValueRet);
				        _localctx.valueRet.setLine(((ValueContext)_localctx).b.line);
				    
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				((ValueContext)_localctx).i = match(INT_VALUE);

				        ((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).i!=null?Integer.valueOf(((ValueContext)_localctx).i.getText()):0));
				        _localctx.valueRet.setLine(((ValueContext)_localctx).i.getLine());
				    
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

	public static class BoolValueContext extends ParserRuleContext {
		public boolean boolValueRet;
		public int line;
		public Token t;
		public Token f;
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolValue);
		try {
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				((BoolValueContext)_localctx).t = match(TRUE);

				        ((BoolValueContext)_localctx).boolValueRet =  true;
				        ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).t.getLine();
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				((BoolValueContext)_localctx).f = match(FALSE);

				        ((BoolValueContext)_localctx).boolValueRet =  false;
				        ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).f.getLine();
				    
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier idRet;
		public int line;
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			((IdentifierContext)_localctx).id = match(IDENTIFIER);

			        ((IdentifierContext)_localctx).idRet =  new Identifier((((IdentifierContext)_localctx).id!=null?((IdentifierContext)_localctx).id.getText():null));
			        _localctx.idRet.setLine(((IdentifierContext)_localctx).id.getLine());
			        ((IdentifierContext)_localctx).line =  ((IdentifierContext)_localctx).id.getLine();
			    
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

	public static class StructTypeContext extends ParserRuleContext {
		public StructType structTypeRet;
		public IdentifierContext id;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(STRUCT);
			setState(595);
			((StructTypeContext)_localctx).id = identifier();
			 ((StructTypeContext)_localctx).structTypeRet =  new StructType(((StructTypeContext)_localctx).id.idRet); 
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

	public static class ListTypeContext extends ParserRuleContext {
		public ListType listTypeRet;
		public TypeContext t;
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode SHARP() { return getToken(CmmParser.SHARP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(LIST);
			setState(599);
			match(SHARP);
			setState(600);
			((ListTypeContext)_localctx).t = type();
			 ((ListTypeContext)_localctx).listTypeRet =  new ListType(((ListTypeContext)_localctx).t.typeRet); 
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
		public Type typeRet;
		public ListTypeContext l;
		public StructTypeContext s;
		public FptrTypeContext f;
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public FptrTypeContext fptrType() {
			return getRuleContext(FptrTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(INT);
				 ((TypeContext)_localctx).typeRet =  new IntType(); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(BOOL);
				 ((TypeContext)_localctx).typeRet =  new BoolType(); 
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				((TypeContext)_localctx).l = listType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).l.listTypeRet; 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(610);
				((TypeContext)_localctx).s = structType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).s.structTypeRet; 
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(613);
				((TypeContext)_localctx).f = fptrType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).f.fptrTypeRet; 
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

	public static class FptrTypeContext extends ParserRuleContext {
		public FptrType fptrTypeRet;
		public ArrayList<Type> argsTypes;
		public Type returnType;
		public TypesWithCommaContext types;
		public TypeContext t;
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(CmmParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(CmmParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
		public TypesWithCommaContext typesWithComma() {
			return getRuleContext(TypesWithCommaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FptrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FptrTypeContext fptrType() throws RecognitionException {
		FptrTypeContext _localctx = new FptrTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fptrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(FPTR);
			setState(619);
			match(LESS_THAN);
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(620);
				match(VOID);
				 ((FptrTypeContext)_localctx).argsTypes =  new ArrayList<Type>(); 
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(622);
				((FptrTypeContext)_localctx).types = typesWithComma();
				 ((FptrTypeContext)_localctx).argsTypes =  ((FptrTypeContext)_localctx).types.typesWithCommaRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(627);
			match(ARROW);
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(628);
				match(VOID);
				 ((FptrTypeContext)_localctx).returnType =  new VoidType(); 
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(630);
				((FptrTypeContext)_localctx).t = type();
				 ((FptrTypeContext)_localctx).returnType =  ((FptrTypeContext)_localctx).t.typeRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(635);
			match(GREATER_THAN);
			 ((FptrTypeContext)_localctx).fptrTypeRet =  new FptrType(_localctx.argsTypes, _localctx.returnType); 
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

	public static class TypesWithCommaContext extends ParserRuleContext {
		public ArrayList<Type> typesWithCommaRet;
		public TypeContext t1;
		public TypeContext t2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public TypesWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterTypesWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitTypesWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitTypesWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesWithCommaContext typesWithComma() throws RecognitionException {
		TypesWithCommaContext _localctx = new TypesWithCommaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypesWithCommaContext)_localctx).typesWithCommaRet =  new ArrayList<>(); 
			setState(639);
			((TypesWithCommaContext)_localctx).t1 = type();
			 _localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t1.typeRet); 
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(641);
				match(COMMA);
				setState(642);
				((TypesWithCommaContext)_localctx).t2 = type();
				 _localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t2.typeRet); 
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u028d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\3\2\7\2h\n"+
		"\2\f\2\16\2k\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3s\n\3\f\3\16\3v\13\3\3\3"+
		"\3\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\6\5\u008d\n\5\r\5\16\5\u008e\3\5\3\5\3\5\6\5\u0094\n\5"+
		"\r\5\16\5\u0095\3\5\3\5\5\5\u009a\n\5\5\5\u009c\n\5\3\5\6\5\u009f\n\5"+
		"\r\5\16\5\u00a0\3\6\3\6\3\6\3\6\3\6\6\6\u00a8\n\6\r\6\16\6\u00a9\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\5\7\u00b2\n\7\3\b\6\b\u00b5\n\b\r\b\16\b\u00b6\3\b"+
		"\3\b\3\b\7\b\u00bc\n\b\f\b\16\b\u00bf\13\b\3\b\3\b\5\b\u00c3\n\b\6\b\u00c5"+
		"\n\b\r\b\16\b\u00c6\3\t\3\t\3\t\6\t\u00cc\n\t\r\t\16\t\u00cd\3\n\3\n\3"+
		"\n\6\n\u00d3\n\n\r\n\16\n\u00d4\3\13\3\13\5\13\u00d9\n\13\3\13\3\13\3"+
		"\13\3\13\6\13\u00df\n\13\r\13\16\13\u00e0\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00ea\n\f\f\f\16\f\u00ed\13\f\5\f\u00ef\n\f\3\f\3\f\3\r\3\r\3\r\7"+
		"\r\u00f6\n\r\f\r\16\r\u00f9\13\r\5\r\u00fb\n\r\3\16\3\16\6\16\u00ff\n"+
		"\16\r\16\16\16\u0100\3\16\3\16\5\16\u0105\n\16\5\16\u0107\n\16\3\17\3"+
		"\17\6\17\u010b\n\17\r\17\16\17\u010c\3\17\5\17\u0110\n\17\3\20\3\20\6"+
		"\20\u0114\n\20\r\20\16\20\u0115\3\20\3\20\3\20\7\20\u011b\n\20\f\20\16"+
		"\20\u011e\13\20\3\20\3\20\5\20\u0122\n\20\6\20\u0124\n\20\r\20\16\20\u0125"+
		"\3\20\6\20\u0129\n\20\r\20\16\20\u012a\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0136\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0140\n\21\3\21\3\21\7\21\u0144\n\21\f\21\16\21\u0147\13\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0150\n\22\f\22\16\22\u0153\13\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u015e\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0166\n\24\3\25\7\25\u0169\n\25\f\25\16\25\u016c"+
		"\13\25\3\25\3\25\3\25\3\26\3\26\5\26\u0173\n\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\7\30\u017c\n\30\f\30\16\30\u017f\13\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u0198\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u01a0\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01a8\n\35\f"+
		"\35\16\35\u01ab\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01b3\n\36\f"+
		"\36\16\36\u01b6\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01bf\n"+
		"\37\f\37\16\37\u01c2\13\37\3 \3 \3 \3 \3 \3 \5 \u01ca\n \3 \3 \3 \7 \u01cf"+
		"\n \f \16 \u01d2\13 \3!\3!\3!\3!\3!\3!\5!\u01da\n!\3!\3!\3!\7!\u01df\n"+
		"!\f!\16!\u01e2\13!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ea\n\"\3\"\3\"\3\"\7"+
		"\"\u01ef\n\"\f\"\16\"\u01f2\13\"\3#\3#\3#\3#\5#\u01f8\n#\3#\3#\3#\3#\3"+
		"#\3#\5#\u0200\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u020f\n$\f"+
		"$\16$\u0212\13$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u021f\n$\f$\16$\u0222"+
		"\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0235\n%\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u024a"+
		"\n(\3)\3)\3)\3)\5)\u0250\n)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u026b\n-\3.\3.\3.\3.\3.\3.\3.\5."+
		"\u0274\n.\3.\3.\3.\3.\3.\3.\5.\u027c\n.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/"+
		"\7/\u0288\n/\f/\16/\u028b\13/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\2\2\u02ae\2a\3\2"+
		"\2\2\4n\3\2\2\2\6\u0082\3\2\2\2\b\u0087\3\2\2\2\n\u00a2\3\2\2\2\f\u00b1"+
		"\3\2\2\2\16\u00c4\3\2\2\2\20\u00c8\3\2\2\2\22\u00cf\3\2\2\2\24\u00d8\3"+
		"\2\2\2\26\u00e2\3\2\2\2\30\u00fa\3\2\2\2\32\u0106\3\2\2\2\34\u010f\3\2"+
		"\2\2\36\u0111\3\2\2\2 \u012e\3\2\2\2\"\u0148\3\2\2\2$\u0158\3\2\2\2&\u015f"+
		"\3\2\2\2(\u016a\3\2\2\2*\u0172\3\2\2\2,\u0174\3\2\2\2.\u0178\3\2\2\2\60"+
		"\u0183\3\2\2\2\62\u0189\3\2\2\2\64\u0197\3\2\2\2\66\u0199\3\2\2\28\u01a1"+
		"\3\2\2\2:\u01ac\3\2\2\2<\u01b7\3\2\2\2>\u01c3\3\2\2\2@\u01d3\3\2\2\2B"+
		"\u01e3\3\2\2\2D\u01ff\3\2\2\2F\u0201\3\2\2\2H\u0234\3\2\2\2J\u0236\3\2"+
		"\2\2L\u023c\3\2\2\2N\u0249\3\2\2\2P\u024f\3\2\2\2R\u0251\3\2\2\2T\u0254"+
		"\3\2\2\2V\u0258\3\2\2\2X\u026a\3\2\2\2Z\u026c\3\2\2\2\\\u0280\3\2\2\2"+
		"^`\7,\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2"+
		"de\5\4\3\2ei\b\2\1\2fh\7,\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"jl\3\2\2\2ki\3\2\2\2lm\7\2\2\3m\3\3\2\2\2nt\b\3\1\2op\5\b\5\2pq\b\3\1"+
		"\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u|\3\2\2\2vt\3\2\2"+
		"\2wx\5\24\13\2xy\b\3\1\2y{\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\5\6\4\2\u0080\u0081\b\3\1\2\u0081"+
		"\5\3\2\2\2\u0082\u0083\7\3\2\2\u0083\u0084\7%\2\2\u0084\u0085\7&\2\2\u0085"+
		"\u0086\5\32\16\2\u0086\7\3\2\2\2\u0087\u0088\7\35\2\2\u0088\u009b\5R*"+
		"\2\u0089\u008a\7\30\2\2\u008a\u008c\5\16\b\2\u008b\u008d\7,\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\31\2\2\u0091\u009c\3\2\2\2\u0092"+
		"\u0094\7,\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\5\f\7\2\u0098"+
		"\u009a\7+\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0089\3\2\2\2\u009b\u0093\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009f\7,\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\t\3\2\2\2\u00a2\u00a3\5X-\2\u00a3\u00a4"+
		"\5R*\2\u00a4\u00a5\5\26\f\2\u00a5\u00a7\7\30\2\2\u00a6\u00a8\7,\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\5\20\t\2\u00ad"+
		"\u00ae\7\31\2\2\u00ae\13\3\2\2\2\u00af\u00b2\5 \21\2\u00b0\u00b2\5\n\6"+
		"\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\r\3\2\2\2\u00b3\u00b5"+
		"\7,\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00bd\3\2\2\2\u00b8\u00b9\5\f\7\2\u00b9\u00ba\7+"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c2\5\f\7\2\u00c1\u00c3\7+\2\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b4\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\17\3\2\2\2\u00c8\u00c9"+
		"\7\37\2\2\u00c9\u00cb\5\32\16\2\u00ca\u00cc\7,\2\2\u00cb\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\21"+
		"\3\2\2\2\u00cf\u00d0\7 \2\2\u00d0\u00d2\5\32\16\2\u00d1\u00d3\7,\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\23\3\2\2\2\u00d6\u00d9\5X-\2\u00d7\u00d9\7\5\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5R*\2\u00db"+
		"\u00dc\5\26\f\2\u00dc\u00de\5\32\16\2\u00dd\u00df\7,\2\2\u00de\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\25\3\2\2\2\u00e2\u00ee\7%\2\2\u00e3\u00e4\5X-\2\u00e4\u00eb\5R*\2\u00e5"+
		"\u00e6\7)\2\2\u00e6\u00e7\5X-\2\u00e7\u00e8\5R*\2\u00e8\u00ea\3\2\2\2"+
		"\u00e9\u00e5\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00e3\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7&\2\2\u00f1\27\3\2\2\2"+
		"\u00f2\u00f7\5\66\34\2\u00f3\u00f4\7)\2\2\u00f4\u00f6\5\66\34\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\31\3\2\2\2\u00fc\u0107\5\36\20\2\u00fd\u00ff\7,\2"+
		"\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\5\64\33\2\u0103\u0105\7+\2\2"+
		"\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u00fc"+
		"\3\2\2\2\u0106\u00fe\3\2\2\2\u0107\33\3\2\2\2\u0108\u0110\5\36\20\2\u0109"+
		"\u010b\7,\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\5\64\33\2\u010f"+
		"\u0108\3\2\2\2\u010f\u010a\3\2\2\2\u0110\35\3\2\2\2\u0111\u0123\7\30\2"+
		"\2\u0112\u0114\7,\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011c\3\2\2\2\u0117\u0118\5\64\33\2"+
		"\u0118\u0119\7+\2\2\u0119\u011b\3\2\2\2\u011a\u0117\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0121\5\64\33\2\u0120\u0122\7+\2\2\u0121\u0120\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0113\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2"+
		"\2\2\u0127\u0129\7,\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\31"+
		"\2\2\u012d\37\3\2\2\2\u012e\u012f\5X-\2\u012f\u0130\5R*\2\u0130\u0135"+
		"\b\21\1\2\u0131\u0132\7#\2\2\u0132\u0133\58\35\2\u0133\u0134\b\21\1\2"+
		"\u0134\u0136\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0145\b\21\1\2\u0138\u0139\7)\2\2\u0139\u013a\5R*\2\u013a"+
		"\u013f\b\21\1\2\u013b\u013c\7#\2\2\u013c\u013d\58\35\2\u013d\u013e\b\21"+
		"\1\2\u013e\u0140\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\b\21\1\2\u0142\u0144\3\2\2\2\u0143\u0138\3"+
		"\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"!\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0151\5H%\2\u0149\u014a\7%\2\2\u014a"+
		"\u014b\5\30\r\2\u014b\u014c\7&\2\2\u014c\u0150\3\2\2\2\u014d\u014e\7*"+
		"\2\2\u014e\u0150\5R*\2\u014f\u0149\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0155\7%\2\2\u0155\u0156\5\30\r\2\u0156\u0157\7&"+
		"\2\2\u0157#\3\2\2\2\u0158\u0159\7\4\2\2\u0159\u015d\b\23\1\2\u015a\u015b"+
		"\5\66\34\2\u015b\u015c\b\23\1\2\u015c\u015e\3\2\2\2\u015d\u015a\3\2\2"+
		"\2\u015d\u015e\3\2\2\2\u015e%\3\2\2\2\u015f\u0160\7\t\2\2\u0160\u0165"+
		"\5\66\34\2\u0161\u0166\5\34\17\2\u0162\u0163\5\32\16\2\u0163\u0164\5("+
		"\25\2\u0164\u0166\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0166"+
		"\'\3\2\2\2\u0167\u0169\7,\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2"+
		"\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u016e\7\n\2\2\u016e\u016f\5\34\17\2\u016f)\3\2\2\2\u0170"+
		"\u0173\5,\27\2\u0171\u0173\5.\30\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0173+\3\2\2\2\u0174\u0175\7!\2\2\u0175\u0176\5\66\34\2\u0176\u0177"+
		"\5\34\17\2\u0177-\3\2\2\2\u0178\u0179\7\"\2\2\u0179\u017d\5\32\16\2\u017a"+
		"\u017c\7,\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0181\7!\2\2\u0181\u0182\5\66\34\2\u0182/\3\2\2\2\u0183\u0184\7\7\2\2"+
		"\u0184\u0185\7%\2\2\u0185\u0186\5\66\34\2\u0186\u0187\b\31\1\2\u0187\u0188"+
		"\7&\2\2\u0188\61\3\2\2\2\u0189\u018a\58\35\2\u018a\u018b\7#\2\2\u018b"+
		"\u018c\5\66\34\2\u018c\u018d\b\32\1\2\u018d\63\3\2\2\2\u018e\u0198\5&"+
		"\24\2\u018f\u0198\5\60\31\2\u0190\u0198\5\"\22\2\u0191\u0198\5$\23\2\u0192"+
		"\u0198\5\62\32\2\u0193\u0198\5 \21\2\u0194\u0198\5*\26\2\u0195\u0198\5"+
		"L\'\2\u0196\u0198\5J&\2\u0197\u018e\3\2\2\2\u0197\u018f\3\2\2\2\u0197"+
		"\u0190\3\2\2\2\u0197\u0191\3\2\2\2\u0197\u0192\3\2\2\2\u0197\u0193\3\2"+
		"\2\2\u0197\u0194\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198"+
		"\65\3\2\2\2\u0199\u019a\58\35\2\u019a\u019f\b\34\1\2\u019b\u019c\7#\2"+
		"\2\u019c\u019d\5\66\34\2\u019d\u019e\b\34\1\2\u019e\u01a0\3\2\2\2\u019f"+
		"\u019b\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\67\3\2\2\2\u01a1\u01a2\5:\36"+
		"\2\u01a2\u01a9\b\35\1\2\u01a3\u01a4\7\24\2\2\u01a4\u01a5\5:\36\2\u01a5"+
		"\u01a6\b\35\1\2\u01a6\u01a8\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a8\u01ab\3"+
		"\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa9\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ac\u01ad\5<\37\2\u01ad\u01b4\b\36\1\2\u01ae\u01af\7\23\2\2"+
		"\u01af\u01b0\5<\37\2\u01b0\u01b1\b\36\1\2\u01b1\u01b3\3\2\2\2\u01b2\u01ae"+
		"\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		";\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\5> \2\u01b8\u01c0\b\37\1\2\u01b9"+
		"\u01ba\7\17\2\2\u01ba\u01bb\b\37\1\2\u01bb\u01bc\5> \2\u01bc\u01bd\b\37"+
		"\1\2\u01bd\u01bf\3\2\2\2\u01be\u01b9\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1=\3\2\2\2\u01c2\u01c0\3\2\2\2"+
		"\u01c3\u01c4\5@!\2\u01c4\u01d0\b \1\2\u01c5\u01c6\7\21\2\2\u01c6\u01ca"+
		"\b \1\2\u01c7\u01c8\7\22\2\2\u01c8\u01ca\b \1\2\u01c9\u01c5\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\5@!\2\u01cc\u01cd\b \1"+
		"\2\u01cd\u01cf\3\2\2\2\u01ce\u01c9\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1?\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d4\5B\"\2\u01d4\u01e0\b!\1\2\u01d5\u01d6\7\13\2\2\u01d6\u01da\b!\1"+
		"\2\u01d7\u01d8\7\f\2\2\u01d8\u01da\b!\1\2\u01d9\u01d5\3\2\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\5B\"\2\u01dc\u01dd\b!\1\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01d9\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1A\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4"+
		"\5D#\2\u01e4\u01f0\b\"\1\2\u01e5\u01e6\7\r\2\2\u01e6\u01ea\b\"\1\2\u01e7"+
		"\u01e8\7\16\2\2\u01e8\u01ea\b\"\1\2\u01e9\u01e5\3\2\2\2\u01e9\u01e7\3"+
		"\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5D#\2\u01ec\u01ed\b\"\1\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1C\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4"+
		"\7\25\2\2\u01f4\u01f8\b#\1\2\u01f5\u01f6\7\f\2\2\u01f6\u01f8\b#\1\2\u01f7"+
		"\u01f3\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\5D"+
		"#\2\u01fa\u01fb\b#\1\2\u01fb\u0200\3\2\2\2\u01fc\u01fd\5F$\2\u01fd\u01fe"+
		"\b#\1\2\u01fe\u0200\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200"+
		"E\3\2\2\2\u0201\u0202\5H%\2\u0202\u0210\b$\1\2\u0203\u0204\7%\2\2\u0204"+
		"\u0205\5\30\r\2\u0205\u0206\7&\2\2\u0206\u0207\3\2\2\2\u0207\u0208\b$"+
		"\1\2\u0208\u020f\3\2\2\2\u0209\u020a\7*\2\2\u020a\u020b\5R*\2\u020b\u020c"+
		"\3\2\2\2\u020c\u020d\b$\1\2\u020d\u020f\3\2\2\2\u020e\u0203\3\2\2\2\u020e"+
		"\u0209\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0220\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\7\'\2\2\u0214"+
		"\u0215\5\66\34\2\u0215\u0216\7(\2\2\u0216\u0217\3\2\2\2\u0217\u0218\b"+
		"$\1\2\u0218\u021f\3\2\2\2\u0219\u021a\7*\2\2\u021a\u021b\5R*\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021d\b$\1\2\u021d\u021f\3\2\2\2\u021e\u0213\3\2\2\2\u021e"+
		"\u0219\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221G\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\5N(\2\u0224\u0225"+
		"\b%\1\2\u0225\u0235\3\2\2\2\u0226\u0227\5R*\2\u0227\u0228\b%\1\2\u0228"+
		"\u0235\3\2\2\2\u0229\u022a\7%\2\2\u022a\u022b\5\30\r\2\u022b\u022c\7&"+
		"\2\2\u022c\u022d\b%\1\2\u022d\u0235\3\2\2\2\u022e\u022f\5J&\2\u022f\u0230"+
		"\b%\1\2\u0230\u0235\3\2\2\2\u0231\u0232\5L\'\2\u0232\u0233\b%\1\2\u0233"+
		"\u0235\3\2\2\2\u0234\u0223\3\2\2\2\u0234\u0226\3\2\2\2\u0234\u0229\3\2"+
		"\2\2\u0234\u022e\3\2\2\2\u0234\u0231\3\2\2\2\u0235I\3\2\2\2\u0236\u0237"+
		"\7\6\2\2\u0237\u0238\7%\2\2\u0238\u0239\5\66\34\2\u0239\u023a\b&\1\2\u023a"+
		"\u023b\7&\2\2\u023bK\3\2\2\2\u023c\u023d\7\b\2\2\u023d\u023e\7%\2\2\u023e"+
		"\u023f\5\66\34\2\u023f\u0240\7)\2\2\u0240\u0241\5\66\34\2\u0241\u0242"+
		"\b\'\1\2\u0242\u0243\7&\2\2\u0243M\3\2\2\2\u0244\u0245\5P)\2\u0245\u0246"+
		"\b(\1\2\u0246\u024a\3\2\2\2\u0247\u0248\7-\2\2\u0248\u024a\b(\1\2\u0249"+
		"\u0244\3\2\2\2\u0249\u0247\3\2\2\2\u024aO\3\2\2\2\u024b\u024c\7\26\2\2"+
		"\u024c\u0250\b)\1\2\u024d\u024e\7\27\2\2\u024e\u0250\b)\1\2\u024f\u024b"+
		"\3\2\2\2\u024f\u024d\3\2\2\2\u0250Q\3\2\2\2\u0251\u0252\7.\2\2\u0252\u0253"+
		"\b*\1\2\u0253S\3\2\2\2\u0254\u0255\7\35\2\2\u0255\u0256\5R*\2\u0256\u0257"+
		"\b+\1\2\u0257U\3\2\2\2\u0258\u0259\7\34\2\2\u0259\u025a\7$\2\2\u025a\u025b"+
		"\5X-\2\u025b\u025c\b,\1\2\u025cW\3\2\2\2\u025d\u025e\7\32\2\2\u025e\u026b"+
		"\b-\1\2\u025f\u0260\7\33\2\2\u0260\u026b\b-\1\2\u0261\u0262\5V,\2\u0262"+
		"\u0263\b-\1\2\u0263\u026b\3\2\2\2\u0264\u0265\5T+\2\u0265\u0266\b-\1\2"+
		"\u0266\u026b\3\2\2\2\u0267\u0268\5Z.\2\u0268\u0269\b-\1\2\u0269\u026b"+
		"\3\2\2\2\u026a\u025d\3\2\2\2\u026a\u025f\3\2\2\2\u026a\u0261\3\2\2\2\u026a"+
		"\u0264\3\2\2\2\u026a\u0267\3\2\2\2\u026bY\3\2\2\2\u026c\u026d\7\36\2\2"+
		"\u026d\u0273\7\22\2\2\u026e\u026f\7\5\2\2\u026f\u0274\b.\1\2\u0270\u0271"+
		"\5\\/\2\u0271\u0272\b.\1\2\u0272\u0274\3\2\2\2\u0273\u026e\3\2\2\2\u0273"+
		"\u0270\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u027b\7\20\2\2\u0276\u0277\7"+
		"\5\2\2\u0277\u027c\b.\1\2\u0278\u0279\5X-\2\u0279\u027a\b.\1\2\u027a\u027c"+
		"\3\2\2\2\u027b\u0276\3\2\2\2\u027b\u0278\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027e\7\21\2\2\u027e\u027f\b.\1\2\u027f[\3\2\2\2\u0280\u0281\b/\1\2\u0281"+
		"\u0282\5X-\2\u0282\u0289\b/\1\2\u0283\u0284\7)\2\2\u0284\u0285\5X-\2\u0285"+
		"\u0286\b/\1\2\u0286\u0288\3\2\2\2\u0287\u0283\3\2\2\2\u0288\u028b\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a]\3\2\2\2\u028b\u0289"+
		"\3\2\2\2Eait|\u008e\u0095\u0099\u009b\u00a0\u00a9\u00b1\u00b6\u00bd\u00c2"+
		"\u00c6\u00cd\u00d4\u00d8\u00e0\u00eb\u00ee\u00f7\u00fa\u0100\u0104\u0106"+
		"\u010c\u010f\u0115\u011c\u0121\u0125\u012a\u0135\u013f\u0145\u014f\u0151"+
		"\u015d\u0165\u016a\u0172\u017d\u0197\u019f\u01a9\u01b4\u01c0\u01c9\u01d0"+
		"\u01d9\u01e0\u01e9\u01f0\u01f7\u01ff\u020e\u0210\u021e\u0220\u0234\u0249"+
		"\u024f\u026a\u0273\u027b\u0289";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}