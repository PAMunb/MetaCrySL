package br.unb.cic.mcsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetaCrySLLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__10=10;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMetaCrySLLexer() {;} 
    public InternalMetaCrySLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMetaCrySLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMetaCrySL.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMetaCrySL.g:11:7: ( 'ABSTRACT' )
            // InternalMetaCrySL.g:11:9: 'ABSTRACT'
            {
            match("ABSTRACT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMetaCrySL.g:12:7: ( 'SPEC' )
            // InternalMetaCrySL.g:12:9: 'SPEC'
            {
            match("SPEC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMetaCrySL.g:13:7: ( 'OBJECTS' )
            // InternalMetaCrySL.g:13:9: 'OBJECTS'
            {
            match("OBJECTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMetaCrySL.g:14:7: ( ':' )
            // InternalMetaCrySL.g:14:9: ':'
            {
            match(':'); 

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
            // InternalMetaCrySL.g:15:7: ( ';' )
            // InternalMetaCrySL.g:15:9: ';'
            {
            match(';'); 

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
            // InternalMetaCrySL.g:16:7: ( 'EVENTS' )
            // InternalMetaCrySL.g:16:9: 'EVENTS'
            {
            match("EVENTS"); 


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
            // InternalMetaCrySL.g:17:7: ( '=' )
            // InternalMetaCrySL.g:17:9: '='
            {
            match('='); 

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
            // InternalMetaCrySL.g:18:7: ( ':=' )
            // InternalMetaCrySL.g:18:9: ':='
            {
            match(":="); 


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
            // InternalMetaCrySL.g:19:7: ( '|' )
            // InternalMetaCrySL.g:19:9: '|'
            {
            match('|'); 

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
            // InternalMetaCrySL.g:20:7: ( '(' )
            // InternalMetaCrySL.g:20:9: '('
            {
            match('('); 

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
            // InternalMetaCrySL.g:21:7: ( ')' )
            // InternalMetaCrySL.g:21:9: ')'
            {
            match(')'); 

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
            // InternalMetaCrySL.g:22:7: ( ',' )
            // InternalMetaCrySL.g:22:9: ','
            {
            match(','); 

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
            // InternalMetaCrySL.g:23:7: ( 'ORDER' )
            // InternalMetaCrySL.g:23:9: 'ORDER'
            {
            match("ORDER"); 


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
            // InternalMetaCrySL.g:24:7: ( '?' )
            // InternalMetaCrySL.g:24:9: '?'
            {
            match('?'); 

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
            // InternalMetaCrySL.g:25:7: ( '*' )
            // InternalMetaCrySL.g:25:9: '*'
            {
            match('*'); 

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
            // InternalMetaCrySL.g:26:7: ( '+' )
            // InternalMetaCrySL.g:26:9: '+'
            {
            match('+'); 

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
            // InternalMetaCrySL.g:27:7: ( 'CONSTRAINTS' )
            // InternalMetaCrySL.g:27:9: 'CONSTRAINTS'
            {
            match("CONSTRAINTS"); 


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
            // InternalMetaCrySL.g:28:7: ( 'in' )
            // InternalMetaCrySL.g:28:9: 'in'
            {
            match("in"); 


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
            // InternalMetaCrySL.g:29:7: ( '{' )
            // InternalMetaCrySL.g:29:9: '{'
            {
            match('{'); 

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
            // InternalMetaCrySL.g:30:7: ( '}' )
            // InternalMetaCrySL.g:30:9: '}'
            {
            match('}'); 

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
            // InternalMetaCrySL.g:31:7: ( '[' )
            // InternalMetaCrySL.g:31:9: '['
            {
            match('['); 

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
            // InternalMetaCrySL.g:32:7: ( ']' )
            // InternalMetaCrySL.g:32:9: ']'
            {
            match(']'); 

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
            // InternalMetaCrySL.g:33:7: ( '=>' )
            // InternalMetaCrySL.g:33:9: '=>'
            {
            match("=>"); 


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
            // InternalMetaCrySL.g:34:7: ( '<' )
            // InternalMetaCrySL.g:34:9: '<'
            {
            match('<'); 

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
            // InternalMetaCrySL.g:35:7: ( '>' )
            // InternalMetaCrySL.g:35:9: '>'
            {
            match('>'); 

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
            // InternalMetaCrySL.g:36:7: ( '.' )
            // InternalMetaCrySL.g:36:9: '.'
            {
            match('.'); 

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
            // InternalMetaCrySL.g:37:7: ( 'extends' )
            // InternalMetaCrySL.g:37:9: 'extends'
            {
            match("extends"); 


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
            // InternalMetaCrySL.g:38:7: ( '&' )
            // InternalMetaCrySL.g:38:9: '&'
            {
            match('&'); 

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
            // InternalMetaCrySL.g:39:7: ( 'super' )
            // InternalMetaCrySL.g:39:9: 'super'
            {
            match("super"); 


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
            // InternalMetaCrySL.g:40:7: ( 'import' )
            // InternalMetaCrySL.g:40:9: 'import'
            {
            match("import"); 


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
            // InternalMetaCrySL.g:41:7: ( 'static' )
            // InternalMetaCrySL.g:41:9: 'static'
            {
            match("static"); 


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
            // InternalMetaCrySL.g:42:7: ( 'extension' )
            // InternalMetaCrySL.g:42:9: 'extension'
            {
            match("extension"); 


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
            // InternalMetaCrySL.g:2346:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalMetaCrySL.g:2346:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalMetaCrySL.g:2346:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMetaCrySL.g:2346:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMetaCrySL.g:2346:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMetaCrySL.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMetaCrySL.g:2348:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalMetaCrySL.g:2348:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalMetaCrySL.g:2348:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMetaCrySL.g:2348:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalMetaCrySL.g:2348:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMetaCrySL.g:2348:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMetaCrySL.g:2348:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop3;
                        }
                    } while (true);

                    // InternalMetaCrySL.g:2348:44: ( '\"' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\"') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMetaCrySL.g:2348:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:2348:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalMetaCrySL.g:2348:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMetaCrySL.g:2348:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMetaCrySL.g:2348:62: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    // InternalMetaCrySL.g:2348:79: ( '\\'' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\'') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMetaCrySL.g:2348:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


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
            // InternalMetaCrySL.g:2350:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMetaCrySL.g:2350:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMetaCrySL.g:2350:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMetaCrySL.g:2350:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMetaCrySL.g:2352:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMetaCrySL.g:2352:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMetaCrySL.g:2352:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMetaCrySL.g:2352:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalMetaCrySL.g:2352:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMetaCrySL.g:2352:41: ( '\\r' )? '\\n'
                    {
                    // InternalMetaCrySL.g:2352:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMetaCrySL.g:2352:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMetaCrySL.g:2354:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMetaCrySL.g:2354:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMetaCrySL.g:2354:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMetaCrySL.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalMetaCrySL.g:2356:16: ( . )
            // InternalMetaCrySL.g:2356:18: .
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
        // InternalMetaCrySL.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=38;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMetaCrySL.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // InternalMetaCrySL.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // InternalMetaCrySL.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // InternalMetaCrySL.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // InternalMetaCrySL.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // InternalMetaCrySL.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // InternalMetaCrySL.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // InternalMetaCrySL.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // InternalMetaCrySL.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // InternalMetaCrySL.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // InternalMetaCrySL.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // InternalMetaCrySL.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // InternalMetaCrySL.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // InternalMetaCrySL.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // InternalMetaCrySL.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // InternalMetaCrySL.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // InternalMetaCrySL.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // InternalMetaCrySL.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // InternalMetaCrySL.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // InternalMetaCrySL.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // InternalMetaCrySL.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // InternalMetaCrySL.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // InternalMetaCrySL.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // InternalMetaCrySL.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // InternalMetaCrySL.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // InternalMetaCrySL.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // InternalMetaCrySL.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // InternalMetaCrySL.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // InternalMetaCrySL.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // InternalMetaCrySL.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // InternalMetaCrySL.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // InternalMetaCrySL.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // InternalMetaCrySL.g:1:202: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalMetaCrySL.g:1:210: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalMetaCrySL.g:1:222: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalMetaCrySL.g:1:238: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalMetaCrySL.g:1:254: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalMetaCrySL.g:1:262: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\43\1\50\1\uffff\1\43\1\54\7\uffff\2\43\7\uffff\1\43\1\uffff\1\43\1\41\3\uffff\1\41\2\uffff\1\43\1\uffff\3\43\3\uffff\1\43\11\uffff\1\43\1\114\1\43\7\uffff\1\43\1\uffff\2\43\4\uffff\6\43\1\uffff\5\43\1\134\11\43\1\uffff\1\43\1\147\4\43\1\155\3\43\1\uffff\1\161\1\43\1\163\2\43\1\uffff\1\166\1\43\1\170\1\uffff\1\43\1\uffff\1\172\1\43\1\uffff\1\174\1\uffff\1\43\1\uffff\1\43\1\uffff\1\43\1\u0080\1\43\1\uffff\1\u0082\1\uffff";
    static final String DFA13_eofS =
        "\u0083\uffff";
    static final String DFA13_minS =
        "\1\0\1\102\1\120\1\102\1\75\1\uffff\1\126\1\76\7\uffff\1\117\1\155\7\uffff\1\170\1\uffff\1\164\1\44\3\uffff\1\52\2\uffff\1\123\1\uffff\1\105\1\112\1\104\3\uffff\1\105\11\uffff\1\116\1\44\1\160\7\uffff\1\164\1\uffff\1\160\1\141\4\uffff\1\124\1\103\2\105\1\116\1\123\1\uffff\1\157\2\145\1\164\1\122\1\44\1\103\1\122\2\124\1\162\1\156\1\162\1\151\1\101\1\uffff\1\124\1\44\1\123\1\122\1\164\1\144\1\44\1\143\1\103\1\123\1\uffff\1\44\1\101\1\44\1\163\1\151\1\uffff\1\44\1\124\1\44\1\uffff\1\111\1\uffff\1\44\1\157\1\uffff\1\44\1\uffff\1\116\1\uffff\1\156\1\uffff\1\124\1\44\1\123\1\uffff\1\44\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\102\1\120\1\122\1\75\1\uffff\1\126\1\76\7\uffff\1\117\1\156\7\uffff\1\170\1\uffff\1\165\1\172\3\uffff\1\57\2\uffff\1\123\1\uffff\1\105\1\112\1\104\3\uffff\1\105\11\uffff\1\116\1\172\1\160\7\uffff\1\164\1\uffff\1\160\1\141\4\uffff\1\124\1\103\2\105\1\116\1\123\1\uffff\1\157\2\145\1\164\1\122\1\172\1\103\1\122\2\124\1\162\1\156\1\162\1\151\1\101\1\uffff\1\124\1\172\1\123\1\122\1\164\1\163\1\172\1\143\1\103\1\123\1\uffff\1\172\1\101\1\172\1\163\1\151\1\uffff\1\172\1\124\1\172\1\uffff\1\111\1\uffff\1\172\1\157\1\uffff\1\172\1\uffff\1\116\1\uffff\1\156\1\uffff\1\124\1\172\1\123\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\5\2\uffff\1\11\1\12\1\13\1\14\1\16\1\17\1\20\2\uffff\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\uffff\1\34\2\uffff\1\41\2\42\1\uffff\1\45\1\46\1\uffff\1\41\3\uffff\1\10\1\4\1\5\1\uffff\1\27\1\7\1\11\1\12\1\13\1\14\1\16\1\17\1\20\3\uffff\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\uffff\1\34\2\uffff\1\42\1\43\1\44\1\45\6\uffff\1\22\17\uffff\1\2\12\uffff\1\15\5\uffff\1\35\3\uffff\1\6\1\uffff\1\36\2\uffff\1\37\1\uffff\1\3\1\uffff\1\33\1\uffff\1\1\3\uffff\1\40\1\uffff\1\21";
    static final String DFA13_specialS =
        "\1\0\u0082\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\1\41\1\34\1\41\1\31\1\36\1\11\1\12\1\15\1\16\1\13\1\41\1\27\1\37\12\41\1\4\1\5\1\25\1\7\1\26\1\14\1\41\1\1\1\34\1\17\1\34\1\6\11\34\1\3\3\34\1\2\7\34\1\23\1\41\1\24\1\33\1\34\1\41\4\34\1\30\3\34\1\20\11\34\1\32\7\34\1\21\1\10\1\22\uff82\41",
            "\1\42",
            "\1\44",
            "\1\45\17\uffff\1\46",
            "\1\47",
            "",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\66\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "",
            "\1\101\1\100",
            "\1\43\34\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\103\4\uffff\1\104",
            "",
            "",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\16\uffff\1\154",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\162",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\164",
            "\1\165",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\167",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\171",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\173",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\175",
            "",
            "\1\176",
            "",
            "\1\177",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0081",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='A') ) {s = 1;}

                        else if ( (LA13_0=='S') ) {s = 2;}

                        else if ( (LA13_0=='O') ) {s = 3;}

                        else if ( (LA13_0==':') ) {s = 4;}

                        else if ( (LA13_0==';') ) {s = 5;}

                        else if ( (LA13_0=='E') ) {s = 6;}

                        else if ( (LA13_0=='=') ) {s = 7;}

                        else if ( (LA13_0=='|') ) {s = 8;}

                        else if ( (LA13_0=='(') ) {s = 9;}

                        else if ( (LA13_0==')') ) {s = 10;}

                        else if ( (LA13_0==',') ) {s = 11;}

                        else if ( (LA13_0=='?') ) {s = 12;}

                        else if ( (LA13_0=='*') ) {s = 13;}

                        else if ( (LA13_0=='+') ) {s = 14;}

                        else if ( (LA13_0=='C') ) {s = 15;}

                        else if ( (LA13_0=='i') ) {s = 16;}

                        else if ( (LA13_0=='{') ) {s = 17;}

                        else if ( (LA13_0=='}') ) {s = 18;}

                        else if ( (LA13_0=='[') ) {s = 19;}

                        else if ( (LA13_0==']') ) {s = 20;}

                        else if ( (LA13_0=='<') ) {s = 21;}

                        else if ( (LA13_0=='>') ) {s = 22;}

                        else if ( (LA13_0=='.') ) {s = 23;}

                        else if ( (LA13_0=='e') ) {s = 24;}

                        else if ( (LA13_0=='&') ) {s = 25;}

                        else if ( (LA13_0=='s') ) {s = 26;}

                        else if ( (LA13_0=='^') ) {s = 27;}

                        else if ( (LA13_0=='$'||LA13_0=='B'||LA13_0=='D'||(LA13_0>='F' && LA13_0<='N')||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='d')||(LA13_0>='f' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='r')||(LA13_0>='t' && LA13_0<='z')) ) {s = 28;}

                        else if ( (LA13_0=='\"') ) {s = 29;}

                        else if ( (LA13_0=='\'') ) {s = 30;}

                        else if ( (LA13_0=='/') ) {s = 31;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 32;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||LA13_0=='#'||LA13_0=='%'||LA13_0=='-'||(LA13_0>='0' && LA13_0<='9')||LA13_0=='@'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}