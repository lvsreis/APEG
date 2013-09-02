// $ANTLR 3.5 /home/leo/workspace/APEG/grammars/AdaptablePEG.g 2013-08-24 16:33:39

    package srcparser;
    import util.Util;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AdaptablePEGLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int AND_LOOKAHEAD=4;
	public static final int ANY=5;
	public static final int ARRAY_REF=6;
	public static final int ASSIGN=7;
	public static final int ASSIGNLIST=8;
	public static final int CALL=9;
	public static final int CAPTURE_TEXT=10;
	public static final int CHOICE=11;
	public static final int COMMENT=12;
	public static final int COND=13;
	public static final int DIGIT=14;
	public static final int DOT=15;
	public static final int ESC=16;
	public static final int EXPONENT=17;
	public static final int FALSE=18;
	public static final int FILES=19;
	public static final int ID=20;
	public static final int INT_NUMBER=21;
	public static final int LAMBDA=22;
	public static final int LETTER=23;
	public static final int LINE_COMMENT=24;
	public static final int LIST=25;
	public static final int LITERAL_CHAR=26;
	public static final int NONTERM=27;
	public static final int NOT_LOOKAHEAD=28;
	public static final int ONE_REPEAT=29;
	public static final int OPTIONAL=30;
	public static final int OP_ADD=31;
	public static final int OP_AND=32;
	public static final int OP_DIV=33;
	public static final int OP_EQ=34;
	public static final int OP_GE=35;
	public static final int OP_GT=36;
	public static final int OP_LE=37;
	public static final int OP_LT=38;
	public static final int OP_MOD=39;
	public static final int OP_MUL=40;
	public static final int OP_NE=41;
	public static final int OP_NOT=42;
	public static final int OP_OR=43;
	public static final int OP_SUB=44;
	public static final int RANGE=45;
	public static final int RANGE_PAIR=46;
	public static final int REAL_NUMBER=47;
	public static final int REPEAT=48;
	public static final int RULE=49;
	public static final int SEQ=50;
	public static final int STRING_LITERAL=51;
	public static final int TRUE=52;
	public static final int UNARY_SUB=53;
	public static final int VARDECL=54;
	public static final int WS=55;
	public static final int XDIGIT=56;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public AdaptablePEGLexer() {} 
	public AdaptablePEGLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public AdaptablePEGLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/leo/workspace/APEG/grammars/AdaptablePEG.g"; }

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:7:7: ( '&' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:7:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:8:7: ( '(' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:8:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:9:7: ( ')' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:9:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:10:7: ( ',' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:10:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:11:7: ( '.' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:11:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:12:7: ( ':' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:12:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:13:7: ( ';' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:13:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:14:7: ( '=' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:14:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:15:7: ( '?' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:15:9: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:16:7: ( '[' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:16:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:17:7: ( ']' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:17:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:18:7: ( 'apeg' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:18:9: 'apeg'
			{
			match("apeg"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:19:7: ( 'discardChangesWhenFail' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:19:9: 'discardChangesWhenFail'
			{
			match("discardChangesWhenFail"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:20:7: ( 'envSemantics' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:20:9: 'envSemantics'
			{
			match("envSemantics"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:21:7: ( 'functions' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:21:9: 'functions'
			{
			match("functions"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:22:7: ( 'isAdaptable' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:22:9: 'isAdaptable'
			{
			match("isAdaptable"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:23:7: ( 'locals' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:23:9: 'locals'
			{
			match("locals"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:24:7: ( 'options' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:24:9: 'options'
			{
			match("options"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:25:7: ( 'returns' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:25:9: 'returns'
			{
			match("returns"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:26:7: ( 'simple' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:26:9: 'simple'
			{
			match("simple"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:27:7: ( '{' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:27:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:28:7: ( '{?' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:28:9: '{?'
			{
			match("{?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:29:7: ( '}' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:29:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "OP_AND"
	public final void mOP_AND() throws RecognitionException {
		try {
			int _type = OP_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:564:8: ( '&&' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:564:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_AND"

	// $ANTLR start "OP_OR"
	public final void mOP_OR() throws RecognitionException {
		try {
			int _type = OP_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:565:7: ( '||' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:565:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_OR"

	// $ANTLR start "OP_NOT"
	public final void mOP_NOT() throws RecognitionException {
		try {
			int _type = OP_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:566:8: ( '!' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:566:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_NOT"

	// $ANTLR start "OP_EQ"
	public final void mOP_EQ() throws RecognitionException {
		try {
			int _type = OP_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:567:7: ( '==' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:567:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_EQ"

	// $ANTLR start "OP_LT"
	public final void mOP_LT() throws RecognitionException {
		try {
			int _type = OP_LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:568:7: ( '<' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:568:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_LT"

	// $ANTLR start "OP_GT"
	public final void mOP_GT() throws RecognitionException {
		try {
			int _type = OP_GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:569:7: ( '>' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:569:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_GT"

	// $ANTLR start "OP_LE"
	public final void mOP_LE() throws RecognitionException {
		try {
			int _type = OP_LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:570:7: ( '<=' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:570:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_LE"

	// $ANTLR start "OP_GE"
	public final void mOP_GE() throws RecognitionException {
		try {
			int _type = OP_GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:571:7: ( '>=' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:571:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_GE"

	// $ANTLR start "OP_NE"
	public final void mOP_NE() throws RecognitionException {
		try {
			int _type = OP_NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:572:7: ( '!=' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:572:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_NE"

	// $ANTLR start "OP_ADD"
	public final void mOP_ADD() throws RecognitionException {
		try {
			int _type = OP_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:573:8: ( '+' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:573:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_ADD"

	// $ANTLR start "OP_SUB"
	public final void mOP_SUB() throws RecognitionException {
		try {
			int _type = OP_SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:574:8: ( '-' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:574:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_SUB"

	// $ANTLR start "OP_MUL"
	public final void mOP_MUL() throws RecognitionException {
		try {
			int _type = OP_MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:575:8: ( '*' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:575:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_MUL"

	// $ANTLR start "OP_DIV"
	public final void mOP_DIV() throws RecognitionException {
		try {
			int _type = OP_DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:576:8: ( '/' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:576:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_DIV"

	// $ANTLR start "OP_MOD"
	public final void mOP_MOD() throws RecognitionException {
		try {
			int _type = OP_MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:577:8: ( '%' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:577:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_MOD"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:578:15: ( '\\'' ( LITERAL_CHAR )* '\\'' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:579:6: '\\'' ( LITERAL_CHAR )* '\\''
			{
			match('\''); 
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:579:11: ( LITERAL_CHAR )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '&')||(LA1_0 >= '(' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:579:11: LITERAL_CHAR
					{
					mLITERAL_CHAR(); 

					}
					break;

				default :
					break loop1;
				}
			}

			match('\''); 

			  	String s = getText();
			  	s = s.substring(1, s.length()-1);
			  	s = Util.formatString(s);
			  	setText(s);
			//  	System.out.println("STRING : " + getText());
			  	
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "LITERAL_CHAR"
	public final void mLITERAL_CHAR() throws RecognitionException {
		try {
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:590:3: ( ESC |~ ( '\\'' | '\\\\' ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\\') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:590:5: ESC
					{
					mESC(); 

					}
					break;
				case 2 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:591:5: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LITERAL_CHAR"

	// $ANTLR start "ESC"
	public final void mESC() throws RecognitionException {
		try {
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:593:14: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' XDIGIT XDIGIT XDIGIT XDIGIT | . ) )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:593:16: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' XDIGIT XDIGIT XDIGIT XDIGIT | . )
			{
			match('\\'); 
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:594:5: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' XDIGIT XDIGIT XDIGIT XDIGIT | . )
			int alt3=10;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='n') ) {
				alt3=1;
			}
			else if ( (LA3_0=='r') ) {
				alt3=2;
			}
			else if ( (LA3_0=='t') ) {
				alt3=3;
			}
			else if ( (LA3_0=='b') ) {
				alt3=4;
			}
			else if ( (LA3_0=='f') ) {
				alt3=5;
			}
			else if ( (LA3_0=='\"') ) {
				alt3=6;
			}
			else if ( (LA3_0=='\'') ) {
				alt3=7;
			}
			else if ( (LA3_0=='\\') ) {
				alt3=8;
			}
			else if ( (LA3_0=='u') ) {
				int LA3_9 = input.LA(2);
				if ( ((LA3_9 >= '0' && LA3_9 <= '9')||(LA3_9 >= 'A' && LA3_9 <= 'F')||(LA3_9 >= 'a' && LA3_9 <= 'f')) ) {
					alt3=9;
				}

				else {
					alt3=10;
				}

			}
			else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= 'a')||(LA3_0 >= 'c' && LA3_0 <= 'e')||(LA3_0 >= 'g' && LA3_0 <= 'm')||(LA3_0 >= 'o' && LA3_0 <= 'q')||LA3_0=='s'||(LA3_0 >= 'v' && LA3_0 <= '\uFFFF')) ) {
				alt3=10;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:594:7: 'n'
					{
					match('n'); 
					}
					break;
				case 2 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:595:7: 'r'
					{
					match('r'); 
					}
					break;
				case 3 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:596:7: 't'
					{
					match('t'); 
					}
					break;
				case 4 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:597:7: 'b'
					{
					match('b'); 
					}
					break;
				case 5 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:598:7: 'f'
					{
					match('f'); 
					}
					break;
				case 6 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:599:7: '\"'
					{
					match('\"'); 
					}
					break;
				case 7 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:600:7: '\\''
					{
					match('\''); 
					}
					break;
				case 8 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:601:7: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 9 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:602:7: 'u' XDIGIT XDIGIT XDIGIT XDIGIT
					{
					match('u'); 
					mXDIGIT(); 

					mXDIGIT(); 

					mXDIGIT(); 

					mXDIGIT(); 

					}
					break;
				case 10 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:603:7: .
					{
					matchAny(); 
					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC"

	// $ANTLR start "XDIGIT"
	public final void mXDIGIT() throws RecognitionException {
		try {
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:606:17: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XDIGIT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:611:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:612:16: ( '0' .. '9' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:613:6: ( 'true' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:613:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:614:7: ( 'false' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:614:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:615:4: ( LETTER ( LETTER | DIGIT | '_' )* )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:615:6: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:615:13: ( LETTER | DIGIT | '_' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT_NUMBER"
	public final void mINT_NUMBER() throws RecognitionException {
		try {
			int _type = INT_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:616:12: ( ( DIGIT )+ )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:616:14: ( DIGIT )+
			{
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:616:14: ( DIGIT )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_NUMBER"

	// $ANTLR start "RANGE_PAIR"
	public final void mRANGE_PAIR() throws RecognitionException {
		try {
			int _type = RANGE_PAIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:617:12: ( LETTER '-' LETTER | DIGIT '-' DIGIT )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:617:14: LETTER '-' LETTER
					{
					mLETTER(); 

					match('-'); 
					mLETTER(); 

					}
					break;
				case 2 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:617:34: DIGIT '-' DIGIT
					{
					mDIGIT(); 

					match('-'); 
					mDIGIT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RANGE_PAIR"

	// $ANTLR start "REAL_NUMBER"
	public final void mREAL_NUMBER() throws RecognitionException {
		try {
			int _type = REAL_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:618:13: ( ( DIGIT )+ ( '.' ( DIGIT )* )? ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
				alt13=1;
			}
			else if ( (LA13_0=='.') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:619:3: ( DIGIT )+ ( '.' ( DIGIT )* )? ( EXPONENT )?
					{
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:619:3: ( DIGIT )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:619:10: ( '.' ( DIGIT )* )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='.') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:619:11: '.' ( DIGIT )*
							{
							match('.'); 
							// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:619:15: ( DIGIT )*
							loop8:
							while (true) {
								int alt8=2;
								int LA8_0 = input.LA(1);
								if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
									alt8=1;
								}

								switch (alt8) {
								case 1 :
									// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop8;
								}
							}

							}
							break;

					}

					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:619:24: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:619:24: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:621:3: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:621:7: ( DIGIT )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:621:14: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:621:14: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL_NUMBER"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:623:19: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+ )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:623:21: ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:623:31: ( '+' | '-' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='+'||LA14_0=='-') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:623:42: ( DIGIT )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:624:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:624:6: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:625:9: ( '/*' ( . )* '*/' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:625:11: '/*' ( . )* '*/'
			{
			match("/*"); 

			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:625:16: ( . )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='*') ) {
					int LA16_1 = input.LA(2);
					if ( (LA16_1=='/') ) {
						alt16=2;
					}
					else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
						alt16=1;
					}

				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:625:16: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop16;
				}
			}

			match("*/"); 

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:626:14: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:626:16: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:626:21: (~ ( '\\n' | '\\r' ) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '\uFFFF')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop17;
				}
			}

			// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:626:35: ( '\\r' )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\r') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:626:35: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:8: ( T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | OP_AND | OP_OR | OP_NOT | OP_EQ | OP_LT | OP_GT | OP_LE | OP_GE | OP_NE | OP_ADD | OP_SUB | OP_MUL | OP_DIV | OP_MOD | STRING_LITERAL | TRUE | FALSE | ID | INT_NUMBER | RANGE_PAIR | REAL_NUMBER | WS | COMMENT | LINE_COMMENT )
		int alt19=47;
		alt19 = dfa19.predict(input);
		switch (alt19) {
			case 1 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:10: T__57
				{
				mT__57(); 

				}
				break;
			case 2 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:16: T__58
				{
				mT__58(); 

				}
				break;
			case 3 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:22: T__59
				{
				mT__59(); 

				}
				break;
			case 4 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:28: T__60
				{
				mT__60(); 

				}
				break;
			case 5 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:34: T__61
				{
				mT__61(); 

				}
				break;
			case 6 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:40: T__62
				{
				mT__62(); 

				}
				break;
			case 7 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:46: T__63
				{
				mT__63(); 

				}
				break;
			case 8 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:52: T__64
				{
				mT__64(); 

				}
				break;
			case 9 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:58: T__65
				{
				mT__65(); 

				}
				break;
			case 10 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:64: T__66
				{
				mT__66(); 

				}
				break;
			case 11 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:70: T__67
				{
				mT__67(); 

				}
				break;
			case 12 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:76: T__68
				{
				mT__68(); 

				}
				break;
			case 13 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:82: T__69
				{
				mT__69(); 

				}
				break;
			case 14 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:88: T__70
				{
				mT__70(); 

				}
				break;
			case 15 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:94: T__71
				{
				mT__71(); 

				}
				break;
			case 16 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:100: T__72
				{
				mT__72(); 

				}
				break;
			case 17 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:106: T__73
				{
				mT__73(); 

				}
				break;
			case 18 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:112: T__74
				{
				mT__74(); 

				}
				break;
			case 19 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:118: T__75
				{
				mT__75(); 

				}
				break;
			case 20 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:124: T__76
				{
				mT__76(); 

				}
				break;
			case 21 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:130: T__77
				{
				mT__77(); 

				}
				break;
			case 22 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:136: T__78
				{
				mT__78(); 

				}
				break;
			case 23 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:142: T__79
				{
				mT__79(); 

				}
				break;
			case 24 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:148: OP_AND
				{
				mOP_AND(); 

				}
				break;
			case 25 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:155: OP_OR
				{
				mOP_OR(); 

				}
				break;
			case 26 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:161: OP_NOT
				{
				mOP_NOT(); 

				}
				break;
			case 27 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:168: OP_EQ
				{
				mOP_EQ(); 

				}
				break;
			case 28 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:174: OP_LT
				{
				mOP_LT(); 

				}
				break;
			case 29 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:180: OP_GT
				{
				mOP_GT(); 

				}
				break;
			case 30 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:186: OP_LE
				{
				mOP_LE(); 

				}
				break;
			case 31 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:192: OP_GE
				{
				mOP_GE(); 

				}
				break;
			case 32 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:198: OP_NE
				{
				mOP_NE(); 

				}
				break;
			case 33 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:204: OP_ADD
				{
				mOP_ADD(); 

				}
				break;
			case 34 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:211: OP_SUB
				{
				mOP_SUB(); 

				}
				break;
			case 35 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:218: OP_MUL
				{
				mOP_MUL(); 

				}
				break;
			case 36 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:225: OP_DIV
				{
				mOP_DIV(); 

				}
				break;
			case 37 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:232: OP_MOD
				{
				mOP_MOD(); 

				}
				break;
			case 38 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:239: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 39 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:254: TRUE
				{
				mTRUE(); 

				}
				break;
			case 40 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:259: FALSE
				{
				mFALSE(); 

				}
				break;
			case 41 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:265: ID
				{
				mID(); 

				}
				break;
			case 42 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:268: INT_NUMBER
				{
				mINT_NUMBER(); 

				}
				break;
			case 43 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:279: RANGE_PAIR
				{
				mRANGE_PAIR(); 

				}
				break;
			case 44 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:290: REAL_NUMBER
				{
				mREAL_NUMBER(); 

				}
				break;
			case 45 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:302: WS
				{
				mWS(); 

				}
				break;
			case 46 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:305: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 47 :
				// /home/leo/workspace/APEG/grammars/AdaptablePEG.g:1:313: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA19 dfa19 = new DFA19(this);
	static final String DFA19_eotS =
		"\1\uffff\1\46\3\uffff\1\47\2\uffff\1\52\3\uffff\11\54\1\70\2\uffff\1\72"+
		"\1\74\1\76\3\uffff\1\101\2\uffff\2\54\1\103\7\uffff\1\54\2\uffff\11\54"+
		"\13\uffff\1\54\1\uffff\1\103\13\54\1\133\11\54\1\145\1\uffff\3\54\1\151"+
		"\5\54\1\uffff\3\54\1\uffff\1\54\1\163\2\54\1\166\4\54\1\uffff\1\173\1"+
		"\174\1\uffff\4\54\2\uffff\2\54\1\u0083\3\54\1\uffff\3\54\1\u008a\1\54"+
		"\1\u008c\1\uffff\1\54\1\uffff\10\54\1\u0096\1\uffff";
	static final String DFA19_eofS =
		"\u0097\uffff";
	static final String DFA19_minS =
		"\1\11\1\46\3\uffff\1\60\2\uffff\1\75\3\uffff\11\55\1\77\2\uffff\3\75\3"+
		"\uffff\1\52\2\uffff\3\55\7\uffff\1\145\2\uffff\1\163\1\166\1\156\1\154"+
		"\1\101\1\143\2\164\1\155\13\uffff\1\165\1\uffff\1\56\1\147\1\143\1\123"+
		"\1\143\1\163\1\144\1\141\1\151\1\165\1\160\1\145\1\60\1\141\1\145\1\164"+
		"\1\145\1\141\1\154\1\157\1\162\1\154\1\60\1\uffff\1\162\1\155\1\151\1"+
		"\60\1\160\1\163\2\156\1\145\1\uffff\1\144\1\141\1\157\1\uffff\1\164\1"+
		"\60\2\163\1\60\1\103\2\156\1\141\1\uffff\2\60\1\uffff\1\150\1\164\1\163"+
		"\1\142\2\uffff\1\141\1\151\1\60\1\154\1\156\1\143\1\uffff\1\145\1\147"+
		"\1\163\1\60\1\145\1\60\1\uffff\1\163\1\uffff\1\127\1\150\1\145\1\156\1"+
		"\106\1\141\1\151\1\154\1\60\1\uffff";
	static final String DFA19_maxS =
		"\1\175\1\46\3\uffff\1\71\2\uffff\1\75\3\uffff\1\160\1\151\1\156\1\165"+
		"\1\163\1\157\1\160\1\145\1\151\1\77\2\uffff\3\75\3\uffff\1\57\2\uffff"+
		"\1\162\1\55\1\145\7\uffff\1\145\2\uffff\1\163\1\166\1\156\1\154\1\101"+
		"\1\143\2\164\1\155\13\uffff\1\165\1\uffff\1\145\1\147\1\143\1\123\1\143"+
		"\1\163\1\144\1\141\1\151\1\165\1\160\1\145\1\172\1\141\1\145\1\164\1\145"+
		"\1\141\1\154\1\157\1\162\1\154\1\172\1\uffff\1\162\1\155\1\151\1\172\1"+
		"\160\1\163\2\156\1\145\1\uffff\1\144\1\141\1\157\1\uffff\1\164\1\172\2"+
		"\163\1\172\1\103\2\156\1\141\1\uffff\2\172\1\uffff\1\150\1\164\1\163\1"+
		"\142\2\uffff\1\141\1\151\1\172\1\154\1\156\1\143\1\uffff\1\145\1\147\1"+
		"\163\1\172\1\145\1\172\1\uffff\1\163\1\uffff\1\127\1\150\1\145\1\156\1"+
		"\106\1\141\1\151\1\154\1\172\1\uffff";
	static final String DFA19_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\7\1\uffff\1\11\1\12\1\13\12\uffff\1"+
		"\27\1\31\3\uffff\1\41\1\42\1\43\1\uffff\1\45\1\46\3\uffff\1\55\1\30\1"+
		"\1\1\5\1\54\1\33\1\10\1\uffff\1\51\1\53\11\uffff\1\26\1\25\1\40\1\32\1"+
		"\36\1\34\1\37\1\35\1\56\1\57\1\44\1\uffff\1\52\27\uffff\1\14\11\uffff"+
		"\1\47\3\uffff\1\50\11\uffff\1\21\2\uffff\1\24\4\uffff\1\22\1\23\6\uffff"+
		"\1\17\6\uffff\1\20\1\uffff\1\16\11\uffff\1\15";
	static final String DFA19_specialS =
		"\u0097\uffff}>";
	static final String[] DFA19_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\44\1\30\3\uffff\1\37\1\1\1\40\1\2\1\3\1"+
			"\35\1\33\1\4\1\34\1\5\1\36\12\43\1\6\1\7\1\31\1\10\1\32\1\11\1\uffff"+
			"\32\42\1\12\1\uffff\1\13\3\uffff\1\14\2\42\1\15\1\16\1\17\2\42\1\20\2"+
			"\42\1\21\2\42\1\22\2\42\1\23\1\24\1\41\6\42\1\25\1\27\1\26",
			"\1\45",
			"",
			"",
			"",
			"\12\50",
			"",
			"",
			"\1\51",
			"",
			"",
			"",
			"\1\55\102\uffff\1\53",
			"\1\55\73\uffff\1\56",
			"\1\55\100\uffff\1\57",
			"\1\55\63\uffff\1\61\23\uffff\1\60",
			"\1\55\105\uffff\1\62",
			"\1\55\101\uffff\1\63",
			"\1\55\102\uffff\1\64",
			"\1\55\67\uffff\1\65",
			"\1\55\73\uffff\1\66",
			"\1\67",
			"",
			"",
			"\1\71",
			"\1\73",
			"\1\75",
			"",
			"",
			"",
			"\1\77\4\uffff\1\100",
			"",
			"",
			"\1\55\104\uffff\1\102",
			"\1\55",
			"\1\55\1\50\1\uffff\12\104\13\uffff\1\50\37\uffff\1\50",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\105",
			"",
			"",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\117",
			"",
			"\1\50\1\uffff\12\104\13\uffff\1\50\37\uffff\1\50",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\146",
			"\1\147",
			"\1\150",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"",
			"\1\157",
			"\1\160",
			"\1\161",
			"",
			"\1\162",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\164",
			"\1\165",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"",
			"",
			"\1\u0081",
			"\1\u0082",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u008b",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u008d",
			"",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | OP_AND | OP_OR | OP_NOT | OP_EQ | OP_LT | OP_GT | OP_LE | OP_GE | OP_NE | OP_ADD | OP_SUB | OP_MUL | OP_DIV | OP_MOD | STRING_LITERAL | TRUE | FALSE | ID | INT_NUMBER | RANGE_PAIR | REAL_NUMBER | WS | COMMENT | LINE_COMMENT );";
		}
	}

}
