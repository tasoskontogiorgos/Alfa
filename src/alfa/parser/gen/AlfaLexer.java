// Generated from /Users/tdk/Dev/alex/Alpha/src/alfa/parser/Alfa.g4 by ANTLR 4.5
package alfa.parser.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlfaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"NullLiteral", "BooleanLiteral", "BRA", "KET", "OR", "PLUS", "MULT", "OPT", 
		"EQ", "NEQ", "IN", "GT", "GE", "LT", "LE", "INCLUDE", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
		"Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "CharacterLiteral", "SingleCharacter", 
		"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"OctalEscape", "ZeroToThree", "UnicodeEscape", "WS", "COMMENT", "LINE_COMMENT"
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


	public AlfaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alfa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 27:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u0235\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00cb\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\7\33\u00f7\n\33\f\33\16\33\u00fa\13\33\3\33\3\33\3"+
		"\33\7\33\u00ff\n\33\f\33\16\33\u0102\13\33\5\33\u0104\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u010c\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0114\n\35\3\36\3\36\3\36\3\36\5\36\u011a\n\36\3\37\3\37\5\37\u011e\n"+
		"\37\3 \3 \5 \u0122\n \3!\3!\5!\u0126\n!\3\"\3\"\5\"\u012a\n\"\3#\3#\3"+
		"$\3$\3$\5$\u0131\n$\3$\3$\3$\5$\u0136\n$\5$\u0138\n$\3%\3%\5%\u013c\n"+
		"%\3%\5%\u013f\n%\3&\3&\5&\u0143\n&\3\'\3\'\3(\6(\u0148\n(\r(\16(\u0149"+
		"\3)\3)\5)\u014e\n)\3*\6*\u0151\n*\r*\16*\u0152\3+\3+\3+\3+\3,\3,\5,\u015b"+
		"\n,\3,\5,\u015e\n,\3-\3-\3.\6.\u0163\n.\r.\16.\u0164\3/\3/\5/\u0169\n"+
		"/\3\60\3\60\5\60\u016d\n\60\3\60\3\60\3\61\3\61\5\61\u0173\n\61\3\61\5"+
		"\61\u0176\n\61\3\62\3\62\3\63\6\63\u017b\n\63\r\63\16\63\u017c\3\64\3"+
		"\64\5\64\u0181\n\64\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u0189\n\66\3\66"+
		"\5\66\u018c\n\66\3\67\3\67\38\68\u0191\n8\r8\168\u0192\39\39\59\u0197"+
		"\n9\3:\3:\5:\u019b\n:\3;\3;\3;\5;\u01a0\n;\3;\5;\u01a3\n;\3;\5;\u01a6"+
		"\n;\3;\3;\3;\5;\u01ab\n;\3;\5;\u01ae\n;\3;\3;\3;\5;\u01b3\n;\3;\3;\3;"+
		"\5;\u01b8\n;\3<\3<\3<\3=\3=\3>\5>\u01c0\n>\3>\3>\3?\3?\3@\3@\3A\3A\3A"+
		"\5A\u01cb\nA\3B\3B\5B\u01cf\nB\3B\3B\3B\5B\u01d4\nB\3B\3B\5B\u01d8\nB"+
		"\3C\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\5E\u01e7\nE\3F\3F\3G\3G\5G\u01ed"+
		"\nG\3G\3G\3H\6H\u01f2\nH\rH\16H\u01f3\3I\3I\5I\u01f8\nI\3J\3J\3J\3J\5"+
		"J\u01fe\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u020b\nK\3L\3L\3M\3M\3"+
		"M\3M\3M\3M\3M\3N\6N\u0217\nN\rN\16N\u0218\3N\3N\3O\3O\3O\3O\7O\u0221\n"+
		"O\fO\16O\u0224\13O\3O\3O\3O\3O\3O\3P\3P\3P\3P\7P\u022f\nP\fP\16P\u0232"+
		"\13P\3P\3P\3\u0222\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\29\2;\35=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2"+
		"_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\36u\2w\2y\2{\2}\2\177\2\u0081\2\u0083"+
		"\2\u0085\2\u0087\2\u0089\37\u008b\2\u008d \u008f\2\u0091\2\u0093\2\u0095"+
		"\2\u0097\2\u0099\2\u009b!\u009d\"\u009f#\3\2\30\6\2&&C\\aac|\4\2\2\u0101"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\4\2NNnn"+
		"\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--/"+
		"/\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\5"+
		"\2\13\f\16\17\"\"\4\2\f\f\17\17\u0247\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2;\3\2\2\2\2s\3\2\2\2\2\u0089\3\2\2\2\2\u008d\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3\u00a1\3\2\2\2\5\u00a3\3\2\2"+
		"\2\7\u00a5\3\2\2\2\t\u00a7\3\2\2\2\13\u00a9\3\2\2\2\r\u00ab\3\2\2\2\17"+
		"\u00ad\3\2\2\2\21\u00af\3\2\2\2\23\u00b1\3\2\2\2\25\u00b3\3\2\2\2\27\u00ca"+
		"\3\2\2\2\31\u00cc\3\2\2\2\33\u00ce\3\2\2\2\35\u00d0\3\2\2\2\37\u00d2\3"+
		"\2\2\2!\u00d4\3\2\2\2#\u00d6\3\2\2\2%\u00d8\3\2\2\2\'\u00db\3\2\2\2)\u00de"+
		"\3\2\2\2+\u00e1\3\2\2\2-\u00e3\3\2\2\2/\u00e6\3\2\2\2\61\u00e8\3\2\2\2"+
		"\63\u00eb\3\2\2\2\65\u0103\3\2\2\2\67\u010b\3\2\2\29\u0113\3\2\2\2;\u0119"+
		"\3\2\2\2=\u011b\3\2\2\2?\u011f\3\2\2\2A\u0123\3\2\2\2C\u0127\3\2\2\2E"+
		"\u012b\3\2\2\2G\u0137\3\2\2\2I\u0139\3\2\2\2K\u0142\3\2\2\2M\u0144\3\2"+
		"\2\2O\u0147\3\2\2\2Q\u014d\3\2\2\2S\u0150\3\2\2\2U\u0154\3\2\2\2W\u0158"+
		"\3\2\2\2Y\u015f\3\2\2\2[\u0162\3\2\2\2]\u0168\3\2\2\2_\u016a\3\2\2\2a"+
		"\u0170\3\2\2\2c\u0177\3\2\2\2e\u017a\3\2\2\2g\u0180\3\2\2\2i\u0182\3\2"+
		"\2\2k\u0186\3\2\2\2m\u018d\3\2\2\2o\u0190\3\2\2\2q\u0196\3\2\2\2s\u019a"+
		"\3\2\2\2u\u01b7\3\2\2\2w\u01b9\3\2\2\2y\u01bc\3\2\2\2{\u01bf\3\2\2\2}"+
		"\u01c3\3\2\2\2\177\u01c5\3\2\2\2\u0081\u01c7\3\2\2\2\u0083\u01d7\3\2\2"+
		"\2\u0085\u01d9\3\2\2\2\u0087\u01dc\3\2\2\2\u0089\u01e6\3\2\2\2\u008b\u01e8"+
		"\3\2\2\2\u008d\u01ea\3\2\2\2\u008f\u01f1\3\2\2\2\u0091\u01f7\3\2\2\2\u0093"+
		"\u01fd\3\2\2\2\u0095\u020a\3\2\2\2\u0097\u020c\3\2\2\2\u0099\u020e\3\2"+
		"\2\2\u009b\u0216\3\2\2\2\u009d\u021c\3\2\2\2\u009f\u022a\3\2\2\2\u00a1"+
		"\u00a2\7=\2\2\u00a2\4\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4\6\3\2\2\2\u00a5"+
		"\u00a6\7<\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7\177\2\2\u00a8\n\3\2\2\2\u00a9"+
		"\u00aa\7a\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7]\2\2\u00ac\16\3\2\2\2\u00ad"+
		"\u00ae\7.\2\2\u00ae\20\3\2\2\2\u00af\u00b0\7_\2\2\u00b0\22\3\2\2\2\u00b1"+
		"\u00b2\7?\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7w\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7n\2\2\u00b7\26\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7t\2\2\u00ba\u00bb\7w\2\2\u00bb\u00cb\7g\2\2\u00bc\u00bd\7h\2\2"+
		"\u00bd\u00be\7c\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00cb"+
		"\7g\2\2\u00c1\u00c2\7V\2\2\u00c2\u00c3\7T\2\2\u00c3\u00c4\7W\2\2\u00c4"+
		"\u00cb\7G\2\2\u00c5\u00c6\7H\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7N\2\2"+
		"\u00c8\u00c9\7U\2\2\u00c9\u00cb\7G\2\2\u00ca\u00b8\3\2\2\2\u00ca\u00bc"+
		"\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb\30\3\2\2\2\u00cc"+
		"\u00cd\7*\2\2\u00cd\32\3\2\2\2\u00ce\u00cf\7+\2\2\u00cf\34\3\2\2\2\u00d0"+
		"\u00d1\7~\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3 \3\2\2\2\u00d4"+
		"\u00d5\7,\2\2\u00d5\"\3\2\2\2\u00d6\u00d7\7A\2\2\u00d7$\3\2\2\2\u00d8"+
		"\u00d9\7?\2\2\u00d9\u00da\7?\2\2\u00da&\3\2\2\2\u00db\u00dc\7#\2\2\u00dc"+
		"\u00dd\7?\2\2\u00dd(\3\2\2\2\u00de\u00df\7<\2\2\u00df\u00e0\7<\2\2\u00e0"+
		"*\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4\u00e5"+
		"\7?\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7\60\3\2\2\2\u00e8\u00e9"+
		"\7>\2\2\u00e9\u00ea\7?\2\2\u00ea\62\3\2\2\2\u00eb\u00ec\7B\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7n\2\2\u00f0"+
		"\u00f1\7w\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7g\2\2\u00f3\64\3\2\2\2\u00f4"+
		"\u00f8\5\67\34\2\u00f5\u00f7\59\35\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0104\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7\'\2\2\u00fc\u0100\5\67\34\2\u00fd\u00ff\5"+
		"9\35\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u00f4\3\2"+
		"\2\2\u0103\u00fb\3\2\2\2\u0104\66\3\2\2\2\u0105\u010c\t\2\2\2\u0106\u0107"+
		"\n\3\2\2\u0107\u010c\6\34\2\2\u0108\u0109\t\4\2\2\u0109\u010a\t\5\2\2"+
		"\u010a\u010c\6\34\3\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0108"+
		"\3\2\2\2\u010c8\3\2\2\2\u010d\u0114\t\6\2\2\u010e\u010f\n\3\2\2\u010f"+
		"\u0114\6\35\4\2\u0110\u0111\t\4\2\2\u0111\u0112\t\5\2\2\u0112\u0114\6"+
		"\35\5\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u0110\3\2\2\2\u0114"+
		":\3\2\2\2\u0115\u011a\5=\37\2\u0116\u011a\5? \2\u0117\u011a\5A!\2\u0118"+
		"\u011a\5C\"\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u0118\3\2\2\2\u011a<\3\2\2\2\u011b\u011d\5G$\2\u011c\u011e"+
		"\5E#\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e>\3\2\2\2\u011f\u0121"+
		"\5U+\2\u0120\u0122\5E#\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"@\3\2\2\2\u0123\u0125\5_\60\2\u0124\u0126\5E#\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126B\3\2\2\2\u0127\u0129\5i\65\2\u0128\u012a\5E#\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012aD\3\2\2\2\u012b\u012c\t\7\2\2"+
		"\u012cF\3\2\2\2\u012d\u0138\7\62\2\2\u012e\u0135\5M\'\2\u012f\u0131\5"+
		"I%\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0136\3\2\2\2\u0132"+
		"\u0133\5S*\2\u0133\u0134\5I%\2\u0134\u0136\3\2\2\2\u0135\u0130\3\2\2\2"+
		"\u0135\u0132\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u012d\3\2\2\2\u0137\u012e"+
		"\3\2\2\2\u0138H\3\2\2\2\u0139\u013e\5K&\2\u013a\u013c\5O(\2\u013b\u013a"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\5K&\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013f\3\2\2\2\u013fJ\3\2\2\2\u0140\u0143\7\62\2\2"+
		"\u0141\u0143\5M\'\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143L\3\2"+
		"\2\2\u0144\u0145\t\b\2\2\u0145N\3\2\2\2\u0146\u0148\5Q)\2\u0147\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"P\3\2\2\2\u014b\u014e\5K&\2\u014c\u014e\7a\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014eR\3\2\2\2\u014f\u0151\7a\2\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153T\3\2\2\2"+
		"\u0154\u0155\7\62\2\2\u0155\u0156\t\t\2\2\u0156\u0157\5W,\2\u0157V\3\2"+
		"\2\2\u0158\u015d\5Y-\2\u0159\u015b\5[.\2\u015a\u0159\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\5Y-\2\u015d\u015a\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015eX\3\2\2\2\u015f\u0160\t\n\2\2\u0160Z\3\2\2\2\u0161"+
		"\u0163\5]/\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2"+
		"\2\u0164\u0165\3\2\2\2\u0165\\\3\2\2\2\u0166\u0169\5Y-\2\u0167\u0169\7"+
		"a\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169^\3\2\2\2\u016a\u016c"+
		"\7\62\2\2\u016b\u016d\5S*\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\5a\61\2\u016f`\3\2\2\2\u0170\u0175\5c\62\2"+
		"\u0171\u0173\5e\63\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0176\5c\62\2\u0175\u0172\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"b\3\2\2\2\u0177\u0178\t\13\2\2\u0178d\3\2\2\2\u0179\u017b\5g\64\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017df\3\2\2\2\u017e\u0181\5c\62\2\u017f\u0181\7a\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u017f\3\2\2\2\u0181h\3\2\2\2\u0182\u0183\7\62\2\2\u0183"+
		"\u0184\t\f\2\2\u0184\u0185\5k\66\2\u0185j\3\2\2\2\u0186\u018b\5m\67\2"+
		"\u0187\u0189\5o8\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018c\5m\67\2\u018b\u0188\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"l\3\2\2\2\u018d\u018e\t\r\2\2\u018en\3\2\2\2\u018f\u0191\5q9\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"p\3\2\2\2\u0194\u0197\5m\67\2\u0195\u0197\7a\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0195\3\2\2\2\u0197r\3\2\2\2\u0198\u019b\5u;\2\u0199\u019b\5\u0081A\2"+
		"\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019bt\3\2\2\2\u019c\u019d\5"+
		"I%\2\u019d\u019f\7\60\2\2\u019e\u01a0\5I%\2\u019f\u019e\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3\5w<\2\u01a2\u01a1\3\2\2"+
		"\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a6\5\177@\2\u01a5"+
		"\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01b8\3\2\2\2\u01a7\u01a8\7\60"+
		"\2\2\u01a8\u01aa\5I%\2\u01a9\u01ab\5w<\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01ae\5\177@\2\u01ad\u01ac\3\2\2\2"+
		"\u01ad\u01ae\3\2\2\2\u01ae\u01b8\3\2\2\2\u01af\u01b0\5I%\2\u01b0\u01b2"+
		"\5w<\2\u01b1\u01b3\5\177@\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b8\3\2\2\2\u01b4\u01b5\5I%\2\u01b5\u01b6\5\177@\2\u01b6\u01b8\3\2"+
		"\2\2\u01b7\u019c\3\2\2\2\u01b7\u01a7\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7"+
		"\u01b4\3\2\2\2\u01b8v\3\2\2\2\u01b9\u01ba\5y=\2\u01ba\u01bb\5{>\2\u01bb"+
		"x\3\2\2\2\u01bc\u01bd\t\16\2\2\u01bdz\3\2\2\2\u01be\u01c0\5}?\2\u01bf"+
		"\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5I"+
		"%\2\u01c2|\3\2\2\2\u01c3\u01c4\t\17\2\2\u01c4~\3\2\2\2\u01c5\u01c6\t\20"+
		"\2\2\u01c6\u0080\3\2\2\2\u01c7\u01c8\5\u0083B\2\u01c8\u01ca\5\u0085C\2"+
		"\u01c9\u01cb\5\177@\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u0082"+
		"\3\2\2\2\u01cc\u01ce\5U+\2\u01cd\u01cf\7\60\2\2\u01ce\u01cd\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d8\3\2\2\2\u01d0\u01d1\7\62\2\2\u01d1\u01d3\t"+
		"\t\2\2\u01d2\u01d4\5W,\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d6\7\60\2\2\u01d6\u01d8\5W,\2\u01d7\u01cc\3\2"+
		"\2\2\u01d7\u01d0\3\2\2\2\u01d8\u0084\3\2\2\2\u01d9\u01da\5\u0087D\2\u01da"+
		"\u01db\5{>\2\u01db\u0086\3\2\2\2\u01dc\u01dd\t\21\2\2\u01dd\u0088\3\2"+
		"\2\2\u01de\u01df\7)\2\2\u01df\u01e0\5\u008bF\2\u01e0\u01e1\7)\2\2\u01e1"+
		"\u01e7\3\2\2\2\u01e2\u01e3\7)\2\2\u01e3\u01e4\5\u0093J\2\u01e4\u01e5\7"+
		")\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e7"+
		"\u008a\3\2\2\2\u01e8\u01e9\n\22\2\2\u01e9\u008c\3\2\2\2\u01ea\u01ec\7"+
		"$\2\2\u01eb\u01ed\5\u008fH\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\7$\2\2\u01ef\u008e\3\2\2\2\u01f0\u01f2\5\u0091"+
		"I\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u0090\3\2\2\2\u01f5\u01f8\n\23\2\2\u01f6\u01f8\5"+
		"\u0093J\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u0092\3\2\2\2"+
		"\u01f9\u01fa\7^\2\2\u01fa\u01fe\t\24\2\2\u01fb\u01fe\5\u0095K\2\u01fc"+
		"\u01fe\5\u0099M\2\u01fd\u01f9\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc"+
		"\3\2\2\2\u01fe\u0094\3\2\2\2\u01ff\u0200\7^\2\2\u0200\u020b\5c\62\2\u0201"+
		"\u0202\7^\2\2\u0202\u0203\5c\62\2\u0203\u0204\5c\62\2\u0204\u020b\3\2"+
		"\2\2\u0205\u0206\7^\2\2\u0206\u0207\5\u0097L\2\u0207\u0208\5c\62\2\u0208"+
		"\u0209\5c\62\2\u0209\u020b\3\2\2\2\u020a\u01ff\3\2\2\2\u020a\u0201\3\2"+
		"\2\2\u020a\u0205\3\2\2\2\u020b\u0096\3\2\2\2\u020c\u020d\t\25\2\2\u020d"+
		"\u0098\3\2\2\2\u020e\u020f\7^\2\2\u020f\u0210\7w\2\2\u0210\u0211\5Y-\2"+
		"\u0211\u0212\5Y-\2\u0212\u0213\5Y-\2\u0213\u0214\5Y-\2\u0214\u009a\3\2"+
		"\2\2\u0215\u0217\t\26\2\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\bN"+
		"\2\2\u021b\u009c\3\2\2\2\u021c\u021d\7\61\2\2\u021d\u021e\7,\2\2\u021e"+
		"\u0222\3\2\2\2\u021f\u0221\13\2\2\2\u0220\u021f\3\2\2\2\u0221\u0224\3"+
		"\2\2\2\u0222\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0226\7,\2\2\u0226\u0227\7\61\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u0229\bO\2\2\u0229\u009e\3\2\2\2\u022a\u022b\7\61\2\2\u022b"+
		"\u022c\7\61\2\2\u022c\u0230\3\2\2\2\u022d\u022f\n\27\2\2\u022e\u022d\3"+
		"\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\bP\2\2\u0234\u00a0\3\2"+
		"\2\2:\2\u00ca\u00f8\u0100\u0103\u010b\u0113\u0119\u011d\u0121\u0125\u0129"+
		"\u0130\u0135\u0137\u013b\u013e\u0142\u0149\u014d\u0152\u015a\u015d\u0164"+
		"\u0168\u016c\u0172\u0175\u017c\u0180\u0188\u018b\u0192\u0196\u019a\u019f"+
		"\u01a2\u01a5\u01aa\u01ad\u01b2\u01b7\u01bf\u01ca\u01ce\u01d3\u01d7\u01e6"+
		"\u01ec\u01f3\u01f7\u01fd\u020a\u0218\u0222\u0230\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}