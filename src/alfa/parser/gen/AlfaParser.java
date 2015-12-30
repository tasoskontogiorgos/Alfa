// Generated from /Users/tdk/Dev/alex/Alpha/src/alfa/parser/Alfa.g4 by ANTLR 4.5
package alfa.parser.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlfaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NullLiteral=10, BooleanLiteral=11, BRA=12, KET=13, OR=14, PLUS=15, MULT=16, 
		OPT=17, EQ=18, NEQ=19, IN=20, GT=21, GE=22, LT=23, LE=24, INCLUDE=25, 
		Identifier=26, IntegerLiteral=27, FloatingPointLiteral=28, CharacterLiteral=29, 
		StringLiteral=30, WS=31, COMMENT=32, LINE_COMMENT=33;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_include = 2, RULE_literal = 3, RULE_num = 4, 
		RULE_var = 5, RULE_map = 6, RULE_pairmap = 7, RULE_list = 8, RULE_exp = 9, 
		RULE_funCall = 10, RULE_assignment = 11, RULE_binOper = 12;
	public static final String[] ruleNames = {
		"program", "stmt", "include", "literal", "num", "var", "map", "pairmap", 
		"list", "exp", "funCall", "assignment", "binOper"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "':'", "'}'", "'_'", "'['", "','", "']'", "'='", "'null'", 
		null, "'('", "')'", "'|'", "'+'", "'*'", "'?'", "'=='", "'!='", "'::'", 
		"'>'", "'>='", "'<'", "'<='", "'@include'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "NullLiteral", 
		"BooleanLiteral", "BRA", "KET", "OR", "PLUS", "MULT", "OPT", "EQ", "NEQ", 
		"IN", "GT", "GE", "LT", "LE", "INCLUDE", "Identifier", "IntegerLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "WS", "COMMENT", 
		"LINE_COMMENT"
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
	public String getGrammarFileName() { return "Alfa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlfaParser(TokenStream input) {
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
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				stmt();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE || _la==Identifier );
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				assignment();
				setState(33);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(32);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				funCall();
				setState(37);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(36);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				include();
				setState(41);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(40);
					match(T__0);
					}
				}

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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(AlfaParser.INCLUDE, 0); }
		public TerminalNode StringLiteral() { return getToken(AlfaParser.StringLiteral, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(INCLUDE);
			setState(46);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(AlfaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(AlfaParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AlfaParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(AlfaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AlfaParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(AlfaParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) ) {
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(AlfaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(AlfaParser.FloatingPointLiteral, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==IntegerLiteral || _la==FloatingPointLiteral) ) {
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AlfaParser.Identifier, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(Identifier);
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

	public static class MapContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__1);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				exp(0);
				setState(56);
				match(T__2);
				setState(57);
				exp(0);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << BRA) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) );
			setState(63);
			match(T__3);
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

	public static class PairmapContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PairmapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairmap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterPairmap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitPairmap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitPairmap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairmapContext pairmap() throws RecognitionException {
		PairmapContext _localctx = new PairmapContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pairmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				num();
				setState(67);
				match(T__4);
				setState(68);
				num();
				setState(69);
				match(T__2);
				setState(70);
				exp(0);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IntegerLiteral || _la==FloatingPointLiteral );
			setState(76);
			match(T__3);
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

	public static class ListContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__5);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << BRA) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(79);
				exp(0);
				setState(81);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(80);
					match(T__6);
					}
				}

				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__7);
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

	public static class ExpContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public PairmapContext pairmap() {
			return getRuleContext(PairmapContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public TerminalNode BRA() { return getToken(AlfaParser.BRA, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode KET() { return getToken(AlfaParser.KET, 0); }
		public BinOperContext binOper() {
			return getRuleContext(BinOperContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(91);
				literal();
				}
				break;
			case 2:
				{
				setState(92);
				var();
				}
				break;
			case 3:
				{
				setState(93);
				map();
				}
				break;
			case 4:
				{
				setState(94);
				pairmap();
				}
				break;
			case 5:
				{
				setState(95);
				list();
				}
				break;
			case 6:
				{
				setState(96);
				funCall();
				}
				break;
			case 7:
				{
				setState(97);
				match(BRA);
				setState(98);
				exp(0);
				setState(99);
				match(KET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(103);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(104);
					binOper();
					setState(105);
					exp(4);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class FunCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AlfaParser.Identifier, 0); }
		public TerminalNode BRA() { return getToken(AlfaParser.BRA, 0); }
		public TerminalNode KET() { return getToken(AlfaParser.KET, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Identifier);
			setState(113);
			match(BRA);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << BRA) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(114);
				exp(0);
				setState(116);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(115);
					match(T__6);
					}
				}

				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AlfaParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(Identifier);
			setState(126);
			match(T__8);
			setState(127);
			exp(0);
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

	public static class BinOperContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(AlfaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(AlfaParser.NEQ, 0); }
		public TerminalNode IN() { return getToken(AlfaParser.IN, 0); }
		public TerminalNode GT() { return getToken(AlfaParser.GT, 0); }
		public TerminalNode GE() { return getToken(AlfaParser.GE, 0); }
		public TerminalNode LT() { return getToken(AlfaParser.LT, 0); }
		public TerminalNode LE() { return getToken(AlfaParser.LE, 0); }
		public BinOperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).enterBinOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfaListener ) ((AlfaListener)listener).exitBinOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfaVisitor ) return ((AlfaVisitor<? extends T>)visitor).visitBinOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOperContext binOper() throws RecognitionException {
		BinOperContext _localctx = new BinOperContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binOper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << IN) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0086\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\5\3$"+
		"\n\3\3\3\3\3\5\3(\n\3\3\3\3\3\5\3,\n\3\5\3.\n\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\b>\n\b\r\b\16\b?\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\6\tK\n\t\r\t\16\tL\3\t\3\t\3\n\3\n\3\n\5\nT\n\n\7"+
		"\nV\n\n\f\n\16\nY\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13h\n\13\3\13\3\13\3\13\3\13\7\13n\n\13\f\13\16\13q"+
		"\13\13\3\f\3\f\3\f\3\f\5\fw\n\f\7\fy\n\f\f\f\16\f|\13\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\2\3\24\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2"+
		"\5\4\2\f\r\35 \3\2\35\36\3\2\24\32\u008b\2\35\3\2\2\2\4-\3\2\2\2\6/\3"+
		"\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\168\3\2\2\2\20C\3\2\2\2"+
		"\22P\3\2\2\2\24g\3\2\2\2\26r\3\2\2\2\30\177\3\2\2\2\32\u0083\3\2\2\2\34"+
		"\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3"+
		"\2\2\2!#\5\30\r\2\"$\7\3\2\2#\"\3\2\2\2#$\3\2\2\2$.\3\2\2\2%\'\5\26\f"+
		"\2&(\7\3\2\2\'&\3\2\2\2\'(\3\2\2\2(.\3\2\2\2)+\5\6\4\2*,\7\3\2\2+*\3\2"+
		"\2\2+,\3\2\2\2,.\3\2\2\2-!\3\2\2\2-%\3\2\2\2-)\3\2\2\2.\5\3\2\2\2/\60"+
		"\7\33\2\2\60\61\7 \2\2\61\7\3\2\2\2\62\63\t\2\2\2\63\t\3\2\2\2\64\65\t"+
		"\3\2\2\65\13\3\2\2\2\66\67\7\34\2\2\67\r\3\2\2\28=\7\4\2\29:\5\24\13\2"+
		":;\7\5\2\2;<\5\24\13\2<>\3\2\2\2=9\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2"+
		"\2@A\3\2\2\2AB\7\6\2\2B\17\3\2\2\2CJ\7\4\2\2DE\5\n\6\2EF\7\7\2\2FG\5\n"+
		"\6\2GH\7\5\2\2HI\5\24\13\2IK\3\2\2\2JD\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3"+
		"\2\2\2MN\3\2\2\2NO\7\6\2\2O\21\3\2\2\2PW\7\b\2\2QS\5\24\13\2RT\7\t\2\2"+
		"SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UQ\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"XZ\3\2\2\2YW\3\2\2\2Z[\7\n\2\2[\23\3\2\2\2\\]\b\13\1\2]h\5\b\5\2^h\5\f"+
		"\7\2_h\5\16\b\2`h\5\20\t\2ah\5\22\n\2bh\5\26\f\2cd\7\16\2\2de\5\24\13"+
		"\2ef\7\17\2\2fh\3\2\2\2g\\\3\2\2\2g^\3\2\2\2g_\3\2\2\2g`\3\2\2\2ga\3\2"+
		"\2\2gb\3\2\2\2gc\3\2\2\2ho\3\2\2\2ij\f\5\2\2jk\5\32\16\2kl\5\24\13\6l"+
		"n\3\2\2\2mi\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\25\3\2\2\2qo\3\2\2"+
		"\2rs\7\34\2\2sz\7\16\2\2tv\5\24\13\2uw\7\t\2\2vu\3\2\2\2vw\3\2\2\2wy\3"+
		"\2\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7"+
		"\17\2\2~\27\3\2\2\2\177\u0080\7\34\2\2\u0080\u0081\7\13\2\2\u0081\u0082"+
		"\5\24\13\2\u0082\31\3\2\2\2\u0083\u0084\t\4\2\2\u0084\33\3\2\2\2\17\37"+
		"#\'+-?LSWgovz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}