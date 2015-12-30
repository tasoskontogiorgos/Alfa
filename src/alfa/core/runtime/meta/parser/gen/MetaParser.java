// Generated from /Users/tdk/Dev/alex/Alpha/src/alfa/core/runtime/meta/parser/Meta.g4 by ANTLR 4.5
package alfa.core.runtime.meta.parser.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BooleanLiteral=3, BRA=4, KET=5, OR=6, PLUS=7, MULT=8, 
		OPT=9, EQ=10, NEQ=11, IN=12, GT=13, GE=14, LT=15, LE=16, INCLUDE=17, STR=18, 
		BOOL=19, VAR=20, NUM=21, MAP=22, PAIRMAP=23, LIST=24, Identifier=25, IntegerLiteral=26, 
		FloatingPointLiteral=27, CharacterLiteral=28, StringLiteral=29, NullLiteral=30, 
		WS=31, COMMENT=32, LINE_COMMENT=33;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_include = 2, RULE_formalSpec = 3, 
		RULE_concreteFormal = 4, RULE_mod = 5, RULE_funDecl = 6;
	public static final String[] ruleNames = {
		"program", "stmt", "include", "formalSpec", "concreteFormal", "mod", "funDecl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", null, "'('", "')'", "'|'", "'+'", "'*'", "'?'", "'=='", 
		"'!='", "'::'", "'>'", "'>='", "'<'", "'<='", "'@include'", "'STR'", "'BOOL'", 
		"'VAR'", "'NUM'", "'MAP'", "'PAIRMAP'", "'LIST'", null, null, null, null, 
		null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BooleanLiteral", "BRA", "KET", "OR", "PLUS", "MULT", 
		"OPT", "EQ", "NEQ", "IN", "GT", "GE", "LT", "LE", "INCLUDE", "STR", "BOOL", 
		"VAR", "NUM", "MAP", "PAIRMAP", "LIST", "Identifier", "IntegerLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Meta.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MetaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				stmt();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
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

	public static class StmtContext extends ParserRuleContext {
		public FunDeclContext funDecl() {
			return getRuleContext(FunDeclContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			funDecl();
			setState(21);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(20);
				match(T__0);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(MetaParser.INCLUDE, 0); }
		public TerminalNode StringLiteral() { return getToken(MetaParser.StringLiteral, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(INCLUDE);
			setState(24);
			match(StringLiteral);
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

	public static class FormalSpecContext extends ParserRuleContext {
		public ConcreteFormalContext concreteFormal() {
			return getRuleContext(ConcreteFormalContext.class,0);
		}
		public TerminalNode BRA() { return getToken(MetaParser.BRA, 0); }
		public List<FormalSpecContext> formalSpec() {
			return getRuleContexts(FormalSpecContext.class);
		}
		public FormalSpecContext formalSpec(int i) {
			return getRuleContext(FormalSpecContext.class,i);
		}
		public TerminalNode KET() { return getToken(MetaParser.KET, 0); }
		public List<TerminalNode> OR() { return getTokens(MetaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MetaParser.OR, i);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public FormalSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterFormalSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitFormalSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitFormalSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalSpecContext formalSpec() throws RecognitionException {
		return formalSpec(0);
	}

	private FormalSpecContext formalSpec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormalSpecContext _localctx = new FormalSpecContext(_ctx, _parentState);
		FormalSpecContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_formalSpec, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			switch (_input.LA(1)) {
			case STR:
			case BOOL:
			case VAR:
			case NUM:
			case MAP:
			case PAIRMAP:
			case LIST:
				{
				setState(27);
				concreteFormal();
				}
				break;
			case BRA:
				{
				setState(28);
				match(BRA);
				setState(29);
				formalSpec(0);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(30);
					match(OR);
					setState(31);
					formalSpec(0);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(KET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FormalSpecContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_formalSpec);
					setState(41);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(42);
					mod();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ConcreteFormalContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MetaParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(MetaParser.NUM, 0); }
		public TerminalNode MAP() { return getToken(MetaParser.MAP, 0); }
		public TerminalNode PAIRMAP() { return getToken(MetaParser.PAIRMAP, 0); }
		public TerminalNode LIST() { return getToken(MetaParser.LIST, 0); }
		public TerminalNode STR() { return getToken(MetaParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(MetaParser.BOOL, 0); }
		public ConcreteFormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concreteFormal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterConcreteFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitConcreteFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitConcreteFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcreteFormalContext concreteFormal() throws RecognitionException {
		ConcreteFormalContext _localctx = new ConcreteFormalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_concreteFormal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << BOOL) | (1L << VAR) | (1L << NUM) | (1L << MAP) | (1L << PAIRMAP) | (1L << LIST))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ModContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MetaParser.PLUS, 0); }
		public TerminalNode MULT() { return getToken(MetaParser.MULT, 0); }
		public TerminalNode OPT() { return getToken(MetaParser.OPT, 0); }
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MULT) | (1L << OPT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FunDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MetaParser.Identifier, 0); }
		public TerminalNode BRA() { return getToken(MetaParser.BRA, 0); }
		public TerminalNode KET() { return getToken(MetaParser.KET, 0); }
		public List<FormalSpecContext> formalSpec() {
			return getRuleContexts(FormalSpecContext.class);
		}
		public FormalSpecContext formalSpec(int i) {
			return getRuleContext(FormalSpecContext.class,i);
		}
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitFunDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitFunDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(Identifier);
			setState(53);
			match(BRA);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRA) | (1L << STR) | (1L << BOOL) | (1L << VAR) | (1L << NUM) | (1L << MAP) | (1L << PAIRMAP) | (1L << LIST))) != 0)) {
				{
				{
				setState(54);
				formalSpec(0);
				setState(56);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(55);
					match(T__1);
					}
				}

				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(KET);
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
		case 3:
			return formalSpec_sempred((FormalSpecContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formalSpec_sempred(FormalSpecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#D\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23\3"+
		"\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5#\n\5\f\5\16"+
		"\5&\13\5\3\5\3\5\5\5*\n\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\5\b;\n\b\7\b=\n\b\f\b\16\b@\13\b\3\b\3\b\3\b\2"+
		"\3\b\t\2\4\6\b\n\f\16\2\4\3\2\24\32\3\2\t\13C\2\21\3\2\2\2\4\25\3\2\2"+
		"\2\6\31\3\2\2\2\b)\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16\66\3\2\2\2\20"+
		"\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24"+
		"\3\3\2\2\2\25\27\5\16\b\2\26\30\7\3\2\2\27\26\3\2\2\2\27\30\3\2\2\2\30"+
		"\5\3\2\2\2\31\32\7\23\2\2\32\33\7\37\2\2\33\7\3\2\2\2\34\35\b\5\1\2\35"+
		"*\5\n\6\2\36\37\7\6\2\2\37$\5\b\5\2 !\7\b\2\2!#\5\b\5\2\" \3\2\2\2#&\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\7\2\2(*\3\2\2\2"+
		")\34\3\2\2\2)\36\3\2\2\2*/\3\2\2\2+,\f\3\2\2,.\5\f\7\2-+\3\2\2\2.\61\3"+
		"\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\t\3\2\2\2\61/\3\2\2\2\62\63\t\2\2\2\63"+
		"\13\3\2\2\2\64\65\t\3\2\2\65\r\3\2\2\2\66\67\7\33\2\2\67>\7\6\2\28:\5"+
		"\b\5\29;\7\4\2\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<8\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\7\2\2B\17\3\2\2\2\t\23\27$)/"+
		":>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}