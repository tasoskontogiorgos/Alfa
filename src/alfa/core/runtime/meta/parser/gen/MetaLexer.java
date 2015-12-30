// Generated from /Users/tdk/Dev/alex/Alpha/src/alfa/core/runtime/meta/parser/Meta.g4 by ANTLR 4.5
package alfa.core.runtime.meta.parser.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "BooleanLiteral", "BRA", "KET", "OR", "PLUS", "MULT", 
		"OPT", "EQ", "NEQ", "IN", "GT", "GE", "LT", "LE", "INCLUDE", "STR", "BOOL", 
		"VAR", "NUM", "MAP", "PAIRMAP", "LIST", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
		"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
		"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "CharacterLiteral", "SingleCharacter", 
		"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"OctalEscape", "ZeroToThree", "UnicodeEscape", "NullLiteral", "WS", "COMMENT", 
		"LINE_COMMENT"
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


	public MetaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Meta.g4"; }

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
		case 25:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 26:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u0249\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b8"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\7\32\u0106\n\32\f\32\16\32\u0109\13\32\3\32\3\32\3"+
		"\32\7\32\u010e\n\32\f\32\16\32\u0111\13\32\5\32\u0113\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u011b\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0123\n\34\3\35\3\35\3\35\3\35\5\35\u0129\n\35\3\36\3\36\5\36\u012d\n"+
		"\36\3\37\3\37\5\37\u0131\n\37\3 \3 \5 \u0135\n \3!\3!\5!\u0139\n!\3\""+
		"\3\"\3#\3#\3#\5#\u0140\n#\3#\3#\3#\5#\u0145\n#\5#\u0147\n#\3$\3$\5$\u014b"+
		"\n$\3$\5$\u014e\n$\3%\3%\5%\u0152\n%\3&\3&\3\'\6\'\u0157\n\'\r\'\16\'"+
		"\u0158\3(\3(\5(\u015d\n(\3)\6)\u0160\n)\r)\16)\u0161\3*\3*\3*\3*\3+\3"+
		"+\5+\u016a\n+\3+\5+\u016d\n+\3,\3,\3-\6-\u0172\n-\r-\16-\u0173\3.\3.\5"+
		".\u0178\n.\3/\3/\5/\u017c\n/\3/\3/\3\60\3\60\5\60\u0182\n\60\3\60\5\60"+
		"\u0185\n\60\3\61\3\61\3\62\6\62\u018a\n\62\r\62\16\62\u018b\3\63\3\63"+
		"\5\63\u0190\n\63\3\64\3\64\3\64\3\64\3\65\3\65\5\65\u0198\n\65\3\65\5"+
		"\65\u019b\n\65\3\66\3\66\3\67\6\67\u01a0\n\67\r\67\16\67\u01a1\38\38\5"+
		"8\u01a6\n8\39\39\59\u01aa\n9\3:\3:\3:\5:\u01af\n:\3:\5:\u01b2\n:\3:\5"+
		":\u01b5\n:\3:\3:\3:\5:\u01ba\n:\3:\5:\u01bd\n:\3:\3:\3:\5:\u01c2\n:\3"+
		":\3:\3:\5:\u01c7\n:\3;\3;\3;\3<\3<\3=\5=\u01cf\n=\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3@\5@\u01da\n@\3A\3A\5A\u01de\nA\3A\3A\3A\5A\u01e3\nA\3A\3A\5A\u01e7"+
		"\nA\3B\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\5D\u01f6\nD\3E\3E\3F\3F\5F"+
		"\u01fc\nF\3F\3F\3G\6G\u0201\nG\rG\16G\u0202\3H\3H\5H\u0207\nH\3I\3I\3"+
		"I\3I\5I\u020d\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u021a\nJ\3K\3K\3"+
		"L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\6N\u022b\nN\rN\16N\u022c\3N\3N\3"+
		"O\3O\3O\3O\7O\u0235\nO\fO\16O\u0238\13O\3O\3O\3O\3O\3O\3P\3P\3P\3P\7P"+
		"\u0243\nP\fP\16P\u0246\13P\3P\3P\3\u0236\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\2\67\29\34;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2"+
		"Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\35s\2u\2w\2y\2{\2}\2"+
		"\177\2\u0081\2\u0083\2\u0085\2\u0087\36\u0089\2\u008b\37\u008d\2\u008f"+
		"\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099 \u009b!\u009d\"\u009f#\3\2\30"+
		"\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\7\2&&\62;C\\aac|\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd"+
		"\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$$)"+
		")^^ddhhppttvv\3\2\62\65\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u025b\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\29\3\2\2\2\2q\3\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2"+
		"\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3"+
		"\u00a1\3\2\2\2\5\u00a3\3\2\2\2\7\u00b7\3\2\2\2\t\u00b9\3\2\2\2\13\u00bb"+
		"\3\2\2\2\r\u00bd\3\2\2\2\17\u00bf\3\2\2\2\21\u00c1\3\2\2\2\23\u00c3\3"+
		"\2\2\2\25\u00c5\3\2\2\2\27\u00c8\3\2\2\2\31\u00cb\3\2\2\2\33\u00ce\3\2"+
		"\2\2\35\u00d0\3\2\2\2\37\u00d3\3\2\2\2!\u00d5\3\2\2\2#\u00d8\3\2\2\2%"+
		"\u00e1\3\2\2\2\'\u00e5\3\2\2\2)\u00ea\3\2\2\2+\u00ee\3\2\2\2-\u00f2\3"+
		"\2\2\2/\u00f6\3\2\2\2\61\u00fe\3\2\2\2\63\u0112\3\2\2\2\65\u011a\3\2\2"+
		"\2\67\u0122\3\2\2\29\u0128\3\2\2\2;\u012a\3\2\2\2=\u012e\3\2\2\2?\u0132"+
		"\3\2\2\2A\u0136\3\2\2\2C\u013a\3\2\2\2E\u0146\3\2\2\2G\u0148\3\2\2\2I"+
		"\u0151\3\2\2\2K\u0153\3\2\2\2M\u0156\3\2\2\2O\u015c\3\2\2\2Q\u015f\3\2"+
		"\2\2S\u0163\3\2\2\2U\u0167\3\2\2\2W\u016e\3\2\2\2Y\u0171\3\2\2\2[\u0177"+
		"\3\2\2\2]\u0179\3\2\2\2_\u017f\3\2\2\2a\u0186\3\2\2\2c\u0189\3\2\2\2e"+
		"\u018f\3\2\2\2g\u0191\3\2\2\2i\u0195\3\2\2\2k\u019c\3\2\2\2m\u019f\3\2"+
		"\2\2o\u01a5\3\2\2\2q\u01a9\3\2\2\2s\u01c6\3\2\2\2u\u01c8\3\2\2\2w\u01cb"+
		"\3\2\2\2y\u01ce\3\2\2\2{\u01d2\3\2\2\2}\u01d4\3\2\2\2\177\u01d6\3\2\2"+
		"\2\u0081\u01e6\3\2\2\2\u0083\u01e8\3\2\2\2\u0085\u01eb\3\2\2\2\u0087\u01f5"+
		"\3\2\2\2\u0089\u01f7\3\2\2\2\u008b\u01f9\3\2\2\2\u008d\u0200\3\2\2\2\u008f"+
		"\u0206\3\2\2\2\u0091\u020c\3\2\2\2\u0093\u0219\3\2\2\2\u0095\u021b\3\2"+
		"\2\2\u0097\u021d\3\2\2\2\u0099\u0224\3\2\2\2\u009b\u022a\3\2\2\2\u009d"+
		"\u0230\3\2\2\2\u009f\u023e\3\2\2\2\u00a1\u00a2\7=\2\2\u00a2\4\3\2\2\2"+
		"\u00a3\u00a4\7.\2\2\u00a4\6\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t"+
		"\2\2\u00a7\u00a8\7w\2\2\u00a8\u00b8\7g\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab"+
		"\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00b8\7g\2\2\u00ae"+
		"\u00af\7V\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7W\2\2\u00b1\u00b8\7G\2\2"+
		"\u00b2\u00b3\7H\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\7N\2\2\u00b5\u00b6"+
		"\7U\2\2\u00b6\u00b8\7G\2\2\u00b7\u00a5\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7"+
		"\u00ae\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8\b\3\2\2\2\u00b9\u00ba\7*\2\2"+
		"\u00ba\n\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc\f\3\2\2\2\u00bd\u00be\7~\2\2"+
		"\u00be\16\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0\20\3\2\2\2\u00c1\u00c2\7,\2"+
		"\2\u00c2\22\3\2\2\2\u00c3\u00c4\7A\2\2\u00c4\24\3\2\2\2\u00c5\u00c6\7"+
		"?\2\2\u00c6\u00c7\7?\2\2\u00c7\26\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca\30\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc\u00cd\7<\2\2\u00cd\32"+
		"\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf\34\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1"+
		"\u00d2\7?\2\2\u00d2\36\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4 \3\2\2\2\u00d5"+
		"\u00d6\7>\2\2\u00d6\u00d7\7?\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7B\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7n\2\2"+
		"\u00dd\u00de\7w\2\2\u00de\u00df\7f\2\2\u00df\u00e0\7g\2\2\u00e0$\3\2\2"+
		"\2\u00e1\u00e2\7U\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4\7T\2\2\u00e4&\3\2"+
		"\2\2\u00e5\u00e6\7D\2\2\u00e6\u00e7\7Q\2\2\u00e7\u00e8\7Q\2\2\u00e8\u00e9"+
		"\7N\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7X\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed"+
		"\7T\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7P\2\2\u00ef\u00f0\7W\2\2\u00f0\u00f1"+
		"\7O\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7O\2\2\u00f3\u00f4\7C\2\2\u00f4\u00f5"+
		"\7R\2\2\u00f5.\3\2\2\2\u00f6\u00f7\7R\2\2\u00f7\u00f8\7C\2\2\u00f8\u00f9"+
		"\7K\2\2\u00f9\u00fa\7T\2\2\u00fa\u00fb\7O\2\2\u00fb\u00fc\7C\2\2\u00fc"+
		"\u00fd\7R\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7N\2\2\u00ff\u0100\7K\2\2\u0100"+
		"\u0101\7U\2\2\u0101\u0102\7V\2\2\u0102\62\3\2\2\2\u0103\u0107\5\65\33"+
		"\2\u0104\u0106\5\67\34\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0113\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010b\7\'\2\2\u010b\u010f\5\65\33\2\u010c\u010e\5\67\34\2\u010d"+
		"\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0103\3\2\2\2\u0112"+
		"\u010a\3\2\2\2\u0113\64\3\2\2\2\u0114\u011b\t\2\2\2\u0115\u0116\n\3\2"+
		"\2\u0116\u011b\6\33\2\2\u0117\u0118\t\4\2\2\u0118\u0119\t\5\2\2\u0119"+
		"\u011b\6\33\3\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0117\3"+
		"\2\2\2\u011b\66\3\2\2\2\u011c\u0123\t\6\2\2\u011d\u011e\n\3\2\2\u011e"+
		"\u0123\6\34\4\2\u011f\u0120\t\4\2\2\u0120\u0121\t\5\2\2\u0121\u0123\6"+
		"\34\5\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u011f\3\2\2\2\u0123"+
		"8\3\2\2\2\u0124\u0129\5;\36\2\u0125\u0129\5=\37\2\u0126\u0129\5? \2\u0127"+
		"\u0129\5A!\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2"+
		"\2\u0128\u0127\3\2\2\2\u0129:\3\2\2\2\u012a\u012c\5E#\2\u012b\u012d\5"+
		"C\"\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d<\3\2\2\2\u012e\u0130"+
		"\5S*\2\u012f\u0131\5C\"\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		">\3\2\2\2\u0132\u0134\5]/\2\u0133\u0135\5C\"\2\u0134\u0133\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135@\3\2\2\2\u0136\u0138\5g\64\2\u0137\u0139\5C\"\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139B\3\2\2\2\u013a\u013b\t\7\2\2"+
		"\u013bD\3\2\2\2\u013c\u0147\7\62\2\2\u013d\u0144\5K&\2\u013e\u0140\5G"+
		"$\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0145\3\2\2\2\u0141"+
		"\u0142\5Q)\2\u0142\u0143\5G$\2\u0143\u0145\3\2\2\2\u0144\u013f\3\2\2\2"+
		"\u0144\u0141\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u013c\3\2\2\2\u0146\u013d"+
		"\3\2\2\2\u0147F\3\2\2\2\u0148\u014d\5I%\2\u0149\u014b\5M\'\2\u014a\u0149"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\5I%\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014e\3\2\2\2\u014eH\3\2\2\2\u014f\u0152\7\62\2\2"+
		"\u0150\u0152\5K&\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152J\3\2"+
		"\2\2\u0153\u0154\t\b\2\2\u0154L\3\2\2\2\u0155\u0157\5O(\2\u0156\u0155"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"N\3\2\2\2\u015a\u015d\5I%\2\u015b\u015d\7a\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015dP\3\2\2\2\u015e\u0160\7a\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162R\3\2\2\2"+
		"\u0163\u0164\7\62\2\2\u0164\u0165\t\t\2\2\u0165\u0166\5U+\2\u0166T\3\2"+
		"\2\2\u0167\u016c\5W,\2\u0168\u016a\5Y-\2\u0169\u0168\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\5W,\2\u016c\u0169\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016dV\3\2\2\2\u016e\u016f\t\n\2\2\u016fX\3\2\2\2\u0170"+
		"\u0172\5[.\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2"+
		"\2\u0173\u0174\3\2\2\2\u0174Z\3\2\2\2\u0175\u0178\5W,\2\u0176\u0178\7"+
		"a\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178\\\3\2\2\2\u0179\u017b"+
		"\7\62\2\2\u017a\u017c\5Q)\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\5_\60\2\u017e^\3\2\2\2\u017f\u0184\5a\61\2"+
		"\u0180\u0182\5c\62\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0185\5a\61\2\u0184\u0181\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"`\3\2\2\2\u0186\u0187\t\13\2\2\u0187b\3\2\2\2\u0188\u018a\5e\63\2\u0189"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018cd\3\2\2\2\u018d\u0190\5a\61\2\u018e\u0190\7a\2\2\u018f\u018d"+
		"\3\2\2\2\u018f\u018e\3\2\2\2\u0190f\3\2\2\2\u0191\u0192\7\62\2\2\u0192"+
		"\u0193\t\f\2\2\u0193\u0194\5i\65\2\u0194h\3\2\2\2\u0195\u019a\5k\66\2"+
		"\u0196\u0198\5m\67\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019b\5k\66\2\u019a\u0197\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"j\3\2\2\2\u019c\u019d\t\r\2\2\u019dl\3\2\2\2\u019e\u01a0\5o8\2\u019f\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"n\3\2\2\2\u01a3\u01a6\5k\66\2\u01a4\u01a6\7a\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a4\3\2\2\2\u01a6p\3\2\2\2\u01a7\u01aa\5s:\2\u01a8\u01aa\5\177@\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aar\3\2\2\2\u01ab\u01ac\5G$\2\u01ac"+
		"\u01ae\7\60\2\2\u01ad\u01af\5G$\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2\5u;\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5}?\2\u01b4\u01b3\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01c7\3\2\2\2\u01b6\u01b7\7\60\2\2\u01b7\u01b9\5"+
		"G$\2\u01b8\u01ba\5u;\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc"+
		"\3\2\2\2\u01bb\u01bd\5}?\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01c7\3\2\2\2\u01be\u01bf\5G$\2\u01bf\u01c1\5u;\2\u01c0\u01c2\5}?\2\u01c1"+
		"\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c7\3\2\2\2\u01c3\u01c4\5G"+
		"$\2\u01c4\u01c5\5}?\2\u01c5\u01c7\3\2\2\2\u01c6\u01ab\3\2\2\2\u01c6\u01b6"+
		"\3\2\2\2\u01c6\u01be\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c7t\3\2\2\2\u01c8"+
		"\u01c9\5w<\2\u01c9\u01ca\5y=\2\u01cav\3\2\2\2\u01cb\u01cc\t\16\2\2\u01cc"+
		"x\3\2\2\2\u01cd\u01cf\5{>\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\5G$\2\u01d1z\3\2\2\2\u01d2\u01d3\t\17\2\2\u01d3"+
		"|\3\2\2\2\u01d4\u01d5\t\20\2\2\u01d5~\3\2\2\2\u01d6\u01d7\5\u0081A\2\u01d7"+
		"\u01d9\5\u0083B\2\u01d8\u01da\5}?\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3"+
		"\2\2\2\u01da\u0080\3\2\2\2\u01db\u01dd\5S*\2\u01dc\u01de\7\60\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e7\3\2\2\2\u01df\u01e0\7\62"+
		"\2\2\u01e0\u01e2\t\t\2\2\u01e1\u01e3\5U+\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7\60\2\2\u01e5\u01e7\5U+\2\u01e6"+
		"\u01db\3\2\2\2\u01e6\u01df\3\2\2\2\u01e7\u0082\3\2\2\2\u01e8\u01e9\5\u0085"+
		"C\2\u01e9\u01ea\5y=\2\u01ea\u0084\3\2\2\2\u01eb\u01ec\t\21\2\2\u01ec\u0086"+
		"\3\2\2\2\u01ed\u01ee\7)\2\2\u01ee\u01ef\5\u0089E\2\u01ef\u01f0\7)\2\2"+
		"\u01f0\u01f6\3\2\2\2\u01f1\u01f2\7)\2\2\u01f2\u01f3\5\u0091I\2\u01f3\u01f4"+
		"\7)\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f5\u01f1\3\2\2\2\u01f6"+
		"\u0088\3\2\2\2\u01f7\u01f8\n\22\2\2\u01f8\u008a\3\2\2\2\u01f9\u01fb\7"+
		"$\2\2\u01fa\u01fc\5\u008dG\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\7$\2\2\u01fe\u008c\3\2\2\2\u01ff\u0201\5\u008f"+
		"H\2\u0200\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u008e\3\2\2\2\u0204\u0207\n\23\2\2\u0205\u0207\5"+
		"\u0091I\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u0090\3\2\2\2"+
		"\u0208\u0209\7^\2\2\u0209\u020d\t\24\2\2\u020a\u020d\5\u0093J\2\u020b"+
		"\u020d\5\u0097L\2\u020c\u0208\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b"+
		"\3\2\2\2\u020d\u0092\3\2\2\2\u020e\u020f\7^\2\2\u020f\u021a\5a\61\2\u0210"+
		"\u0211\7^\2\2\u0211\u0212\5a\61\2\u0212\u0213\5a\61\2\u0213\u021a\3\2"+
		"\2\2\u0214\u0215\7^\2\2\u0215\u0216\5\u0095K\2\u0216\u0217\5a\61\2\u0217"+
		"\u0218\5a\61\2\u0218\u021a\3\2\2\2\u0219\u020e\3\2\2\2\u0219\u0210\3\2"+
		"\2\2\u0219\u0214\3\2\2\2\u021a\u0094\3\2\2\2\u021b\u021c\t\25\2\2\u021c"+
		"\u0096\3\2\2\2\u021d\u021e\7^\2\2\u021e\u021f\7w\2\2\u021f\u0220\5W,\2"+
		"\u0220\u0221\5W,\2\u0221\u0222\5W,\2\u0222\u0223\5W,\2\u0223\u0098\3\2"+
		"\2\2\u0224\u0225\7p\2\2\u0225\u0226\7w\2\2\u0226\u0227\7n\2\2\u0227\u0228"+
		"\7n\2\2\u0228\u009a\3\2\2\2\u0229\u022b\t\26\2\2\u022a\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022e\u022f\bN\2\2\u022f\u009c\3\2\2\2\u0230\u0231\7\61\2\2\u0231"+
		"\u0232\7,\2\2\u0232\u0236\3\2\2\2\u0233\u0235\13\2\2\2\u0234\u0233\3\2"+
		"\2\2\u0235\u0238\3\2\2\2\u0236\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7,\2\2\u023a\u023b\7\61"+
		"\2\2\u023b\u023c\3\2\2\2\u023c\u023d\bO\2\2\u023d\u009e\3\2\2\2\u023e"+
		"\u023f\7\61\2\2\u023f\u0240\7\61\2\2\u0240\u0244\3\2\2\2\u0241\u0243\n"+
		"\27\2\2\u0242\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\bP"+
		"\2\2\u0248\u00a0\3\2\2\2:\2\u00b7\u0107\u010f\u0112\u011a\u0122\u0128"+
		"\u012c\u0130\u0134\u0138\u013f\u0144\u0146\u014a\u014d\u0151\u0158\u015c"+
		"\u0161\u0169\u016c\u0173\u0177\u017b\u0181\u0184\u018b\u018f\u0197\u019a"+
		"\u01a1\u01a5\u01a9\u01ae\u01b1\u01b4\u01b9\u01bc\u01c1\u01c6\u01ce\u01d9"+
		"\u01dd\u01e2\u01e6\u01f5\u01fb\u0202\u0206\u020c\u0219\u022c\u0236\u0244"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}