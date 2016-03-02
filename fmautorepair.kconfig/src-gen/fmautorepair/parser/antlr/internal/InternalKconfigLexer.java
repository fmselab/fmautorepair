package fmautorepair.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKconfigLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_KCONFIG_HELP=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_HEX_TERMINAL=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalKconfigLexer() {;} 
    public InternalKconfigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKconfigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKconfig.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:11:7: ( 'choice' )
            // InternalKconfig.g:11:9: 'choice'
            {
            match("choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:12:7: ( 'endchoice' )
            // InternalKconfig.g:12:9: 'endchoice'
            {
            match("endchoice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:13:7: ( 'source' )
            // InternalKconfig.g:13:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:14:7: ( '.Kconfig' )
            // InternalKconfig.g:14:9: '.Kconfig'
            {
            match(".Kconfig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:15:7: ( 'config' )
            // InternalKconfig.g:15:9: 'config'
            {
            match("config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:16:7: ( 'string' )
            // InternalKconfig.g:16:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:17:7: ( 'bool' )
            // InternalKconfig.g:17:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:18:7: ( 'tristate' )
            // InternalKconfig.g:18:9: 'tristate'
            {
            match("tristate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:19:7: ( 'int' )
            // InternalKconfig.g:19:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:20:7: ( 'hex' )
            // InternalKconfig.g:20:9: 'hex'
            {
            match("hex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:21:7: ( 'if' )
            // InternalKconfig.g:21:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:22:7: ( 'def_bool' )
            // InternalKconfig.g:22:9: 'def_bool'
            {
            match("def_bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:23:7: ( 'def_tristate' )
            // InternalKconfig.g:23:9: 'def_tristate'
            {
            match("def_tristate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:24:7: ( 'depends on' )
            // InternalKconfig.g:24:9: 'depends on'
            {
            match("depends on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:25:7: ( 'select' )
            // InternalKconfig.g:25:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:26:7: ( 'default' )
            // InternalKconfig.g:26:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:27:7: ( 'n' )
            // InternalKconfig.g:27:9: 'n'
            {
            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:28:7: ( 'm' )
            // InternalKconfig.g:28:9: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:29:7: ( 'y' )
            // InternalKconfig.g:29:9: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:30:7: ( 'prompt' )
            // InternalKconfig.g:30:9: 'prompt'
            {
            match("prompt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:31:7: ( 'range' )
            // InternalKconfig.g:31:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:32:7: ( '=' )
            // InternalKconfig.g:32:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:33:7: ( '!=' )
            // InternalKconfig.g:33:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:34:7: ( '&&' )
            // InternalKconfig.g:34:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:35:7: ( '||' )
            // InternalKconfig.g:35:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:36:7: ( '!' )
            // InternalKconfig.g:36:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:37:7: ( '(' )
            // InternalKconfig.g:37:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:38:7: ( ')' )
            // InternalKconfig.g:38:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:39:7: ( '-' )
            // InternalKconfig.g:39:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:1648:9: ( ( '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* ) )
            // InternalKconfig.g:1648:11: ( '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* )
            {
            // InternalKconfig.g:1648:11: ( '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* )
            int alt7=6;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalKconfig.g:1648:12: '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    {
                    matchRange('1','9'); 
                    matchRange('0','9'); 
                    matchRange('0','9'); 
                    matchRange('0','9'); 
                    matchRange('0','9'); 
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKconfig.g:1648:81: ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalKconfig.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:1648:115: '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    {
                    matchRange('1','9'); 
                    matchRange('0','9'); 
                    matchRange('0','9'); 
                    matchRange('0','9'); 
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKconfig.g:1648:175: ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKconfig.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:1648:209: '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    {
                    matchRange('0','9'); 
                    matchRange('0','9'); 
                    matchRange('0','9'); 
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKconfig.g:1648:260: ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalKconfig.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // InternalKconfig.g:1648:294: '1' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    {
                    matchRange('1','9'); 
                    matchRange('0','9'); 
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKconfig.g:1648:336: ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalKconfig.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 5 :
                    // InternalKconfig.g:1648:370: '1' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    {
                    matchRange('1','9'); 
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKconfig.g:1648:403: ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKconfig.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 6 :
                    // InternalKconfig.g:1648:437: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKconfig.g:1648:457: ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKconfig.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_HEX_TERMINAL"
    public final void mRULE_HEX_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_HEX_TERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:1650:19: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )* )
            // InternalKconfig.g:1650:21: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )*
            {
            match("0x"); 

            // InternalKconfig.g:1650:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='F')||(LA8_0>='a' && LA8_0<='f')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKconfig.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_TERMINAL"

    // $ANTLR start "RULE_KCONFIG_HELP"
    public final void mRULE_KCONFIG_HELP() throws RecognitionException {
        try {
            int _type = RULE_KCONFIG_HELP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:1652:19: ( '---help---' ( options {greedy=false; } : . )* '\\n\\n' )
            // InternalKconfig.g:1652:21: '---help---' ( options {greedy=false; } : . )* '\\n\\n'
            {
            match("---help---"); 

            // InternalKconfig.g:1652:34: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='\n') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='\t')||(LA9_1>='\u000B' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKconfig.g:1652:62: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("\n\n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KCONFIG_HELP"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:1654:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKconfig.g:1654:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalKconfig.g:1654:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKconfig.g:1654:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalKconfig.g:1654:39: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKconfig.g:1654:40: ( '\\r' )? '\\n'
                    {
                    // InternalKconfig.g:1654:40: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalKconfig.g:1654:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:1656:10: ( ( '0' .. '9' )+ )
            // InternalKconfig.g:1656:12: ( '0' .. '9' )+
            {
            // InternalKconfig.g:1656:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKconfig.g:1656:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:1658:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKconfig.g:1658:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKconfig.g:1658:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalKconfig.g:1658:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKconfig.g:1658:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalKconfig.g:1658:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKconfig.g:1658:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKconfig.g:1658:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKconfig.g:1658:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalKconfig.g:1658:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKconfig.g:1658:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:1660:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKconfig.g:1660:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKconfig.g:1660:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKconfig.g:1660:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:1662:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKconfig.g:1662:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKconfig.g:1662:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKconfig.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKconfig.g:1664:16: ( . )
            // InternalKconfig.g:1664:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalKconfig.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_HEX_TERMINAL | RULE_KCONFIG_HELP | RULE_SL_COMMENT | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=38;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalKconfig.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalKconfig.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalKconfig.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalKconfig.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalKconfig.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalKconfig.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalKconfig.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalKconfig.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalKconfig.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalKconfig.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalKconfig.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalKconfig.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalKconfig.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalKconfig.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalKconfig.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalKconfig.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalKconfig.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalKconfig.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalKconfig.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalKconfig.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalKconfig.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalKconfig.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalKconfig.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalKconfig.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalKconfig.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalKconfig.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalKconfig.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalKconfig.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalKconfig.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalKconfig.g:1:184: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalKconfig.g:1:192: RULE_HEX_TERMINAL
                {
                mRULE_HEX_TERMINAL(); 

                }
                break;
            case 32 :
                // InternalKconfig.g:1:210: RULE_KCONFIG_HELP
                {
                mRULE_KCONFIG_HELP(); 

                }
                break;
            case 33 :
                // InternalKconfig.g:1:228: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalKconfig.g:1:244: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalKconfig.g:1:253: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalKconfig.g:1:265: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalKconfig.g:1:281: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalKconfig.g:1:289: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\2\60\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA7_maxS =
        "\2\172\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\3\1\6\1\uffff\1\5\1\uffff\1\4\1\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\13\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\11\1\7\uffff\32\3\6\uffff\32\3",
            "\12\4\7\uffff\32\5\4\uffff\1\5\1\uffff\32\5",
            "",
            "",
            "\12\6\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "",
            "\12\10\7\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
            "",
            "\12\11\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1648:11: ( '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '0' .. '9' '0' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' '0' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | '1' .. '9' ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* | ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' | '_' )* )";
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\3\41\1\36\5\41\1\55\1\56\1\57\2\41\1\uffff\1\64\2\36\2\uffff\1\72\2\74\2\uffff\3\36\2\uffff\2\41\1\uffff\4\41\1\uffff\3\41\1\114\2\41\3\uffff\2\41\11\uffff\1\74\1\uffff\1\74\5\uffff\10\41\1\134\1\uffff\1\135\4\41\2\74\6\41\1\152\1\41\2\uffff\5\41\1\74\6\41\1\uffff\6\41\1\177\1\74\1\u0080\1\u0081\1\41\1\u0083\1\u0084\1\u0085\5\41\1\u008b\3\uffff\1\41\3\uffff\3\41\1\u0090\1\41\1\uffff\1\41\1\u0093\1\u0094\1\41\2\uffff\1\u0096\2\uffff\1\41\1\uffff\2\41\1\u009a\1\uffff";
    static final String DFA19_eofS =
        "\u009b\uffff";
    static final String DFA19_minS =
        "\1\0\1\150\1\156\1\145\1\113\1\157\1\162\1\146\2\145\3\60\1\162\1\141\1\uffff\1\75\1\46\1\174\2\uffff\1\55\2\60\2\uffff\2\0\1\52\2\uffff\1\157\1\156\1\uffff\1\144\1\165\1\162\1\154\1\uffff\1\157\1\151\1\164\1\60\1\170\1\146\3\uffff\1\157\1\156\11\uffff\1\60\1\uffff\1\60\5\uffff\1\151\1\146\1\143\1\162\1\151\1\145\1\154\1\163\1\60\1\uffff\1\60\1\137\1\145\1\155\1\147\1\60\1\101\1\143\1\151\1\150\1\143\1\156\1\143\1\60\1\164\2\uffff\1\142\1\165\1\156\1\160\1\145\1\60\1\145\1\147\1\157\1\145\1\147\1\164\1\uffff\1\141\1\157\1\162\1\154\1\144\1\164\1\60\1\101\2\60\1\151\3\60\1\164\1\157\1\151\1\164\1\163\1\60\3\uffff\1\143\3\uffff\1\145\1\154\1\163\1\60\1\40\1\uffff\1\145\2\60\1\164\2\uffff\1\60\2\uffff\1\141\1\uffff\1\164\1\145\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\157\1\156\1\164\1\113\1\157\1\162\1\156\2\145\3\172\1\162\1\141\1\uffff\1\75\1\46\1\174\2\uffff\1\55\1\172\1\170\2\uffff\2\uffff\1\52\2\uffff\1\157\1\156\1\uffff\1\144\1\165\1\162\1\154\1\uffff\1\157\1\151\1\164\1\172\1\170\1\160\3\uffff\1\157\1\156\11\uffff\1\172\1\uffff\1\71\5\uffff\1\151\1\146\1\143\1\162\1\151\1\145\1\154\1\163\1\172\1\uffff\1\172\1\141\1\145\1\155\1\147\2\172\1\143\1\151\1\150\1\143\1\156\1\143\1\172\1\164\2\uffff\1\164\1\165\1\156\1\160\1\145\1\172\1\145\1\147\1\157\1\145\1\147\1\164\1\uffff\1\141\1\157\1\162\1\154\1\144\1\164\4\172\1\151\3\172\1\164\1\157\1\151\1\164\1\163\1\172\3\uffff\1\143\3\uffff\1\145\1\154\1\163\1\172\1\40\1\uffff\1\145\2\172\1\164\2\uffff\1\172\2\uffff\1\141\1\uffff\1\164\1\145\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\17\uffff\1\26\3\uffff\1\33\1\34\3\uffff\1\36\1\41\3\uffff\1\45\1\46\2\uffff\1\36\4\uffff\1\4\6\uffff\1\21\1\22\1\23\2\uffff\1\26\1\27\1\32\1\30\1\31\1\33\1\34\1\40\1\35\1\uffff\1\42\1\uffff\1\37\1\41\1\43\1\44\1\45\11\uffff\1\13\17\uffff\1\11\1\12\14\uffff\1\7\24\uffff\1\25\1\1\1\5\1\uffff\1\3\1\6\1\17\5\uffff\1\24\4\uffff\1\20\1\16\1\uffff\1\10\1\14\1\uffff\1\2\3\uffff\1\15";
    static final String DFA19_specialS =
        "\1\0\31\uffff\1\2\1\1\177\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\20\1\32\1\31\2\36\1\21\1\33\1\23\1\24\3\36\1\25\1\4\1\34\1\27\11\26\3\36\1\17\3\36\32\30\6\36\1\30\1\5\1\1\1\11\1\2\2\30\1\10\1\7\3\30\1\13\1\12\1\30\1\15\1\30\1\16\1\3\1\6\4\30\1\14\1\30\1\36\1\22\uff83\36",
            "\1\37\6\uffff\1\40",
            "\1\42",
            "\1\45\11\uffff\1\43\4\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\52\7\uffff\1\51",
            "\1\53",
            "\1\54",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\60",
            "\1\61",
            "",
            "\1\63",
            "\1\65",
            "\1\66",
            "",
            "",
            "\1\71",
            "\12\73\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\75\76\uffff\1\76",
            "",
            "",
            "\0\100",
            "\0\100",
            "\1\101",
            "",
            "",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\115",
            "\1\116\11\uffff\1\117",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\122\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\123",
            "",
            "",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\136\1\uffff\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\143\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\153",
            "",
            "",
            "\1\154\21\uffff\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\162\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0082",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\1\u008c",
            "",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0091",
            "",
            "\1\u0092",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0095",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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

    class DFA19 extends DFA {

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
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_HEX_TERMINAL | RULE_KCONFIG_HELP | RULE_SL_COMMENT | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='c') ) {s = 1;}

                        else if ( (LA19_0=='e') ) {s = 2;}

                        else if ( (LA19_0=='s') ) {s = 3;}

                        else if ( (LA19_0=='.') ) {s = 4;}

                        else if ( (LA19_0=='b') ) {s = 5;}

                        else if ( (LA19_0=='t') ) {s = 6;}

                        else if ( (LA19_0=='i') ) {s = 7;}

                        else if ( (LA19_0=='h') ) {s = 8;}

                        else if ( (LA19_0=='d') ) {s = 9;}

                        else if ( (LA19_0=='n') ) {s = 10;}

                        else if ( (LA19_0=='m') ) {s = 11;}

                        else if ( (LA19_0=='y') ) {s = 12;}

                        else if ( (LA19_0=='p') ) {s = 13;}

                        else if ( (LA19_0=='r') ) {s = 14;}

                        else if ( (LA19_0=='=') ) {s = 15;}

                        else if ( (LA19_0=='!') ) {s = 16;}

                        else if ( (LA19_0=='&') ) {s = 17;}

                        else if ( (LA19_0=='|') ) {s = 18;}

                        else if ( (LA19_0=='(') ) {s = 19;}

                        else if ( (LA19_0==')') ) {s = 20;}

                        else if ( (LA19_0=='-') ) {s = 21;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 22;}

                        else if ( (LA19_0=='0') ) {s = 23;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='a'||(LA19_0>='f' && LA19_0<='g')||(LA19_0>='j' && LA19_0<='l')||LA19_0=='o'||LA19_0=='q'||(LA19_0>='u' && LA19_0<='x')||LA19_0=='z') ) {s = 24;}

                        else if ( (LA19_0=='#') ) {s = 25;}

                        else if ( (LA19_0=='\"') ) {s = 26;}

                        else if ( (LA19_0=='\'') ) {s = 27;}

                        else if ( (LA19_0=='/') ) {s = 28;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 29;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||(LA19_0>='$' && LA19_0<='%')||(LA19_0>='*' && LA19_0<=',')||(LA19_0>=':' && LA19_0<='<')||(LA19_0>='>' && LA19_0<='@')||(LA19_0>='[' && LA19_0<='`')||LA19_0=='{'||(LA19_0>='}' && LA19_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_27 = input.LA(1);

                        s = -1;
                        if ( ((LA19_27>='\u0000' && LA19_27<='\uFFFF')) ) {s = 64;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_26 = input.LA(1);

                        s = -1;
                        if ( ((LA19_26>='\u0000' && LA19_26<='\uFFFF')) ) {s = 64;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}