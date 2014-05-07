package org.eclipselabs.xdiagram.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_PERCENT=7;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__19=19;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=4;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalDslLexer() {;} 
    public InternalDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:11:7: ( 'metamodel' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:11:9: 'metamodel'
            {
            match("metamodel"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:12:7: ( 'import' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:12:9: 'import'
            {
            match("import"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:13:7: ( '.' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:13:9: '.'
            {
            match('.'); 

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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:14:7: ( '*' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:14:9: '*'
            {
            match('*'); 

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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:15:7: ( 'diagram' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:15:9: 'diagram'
            {
            match("diagram"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:16:7: ( '{' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:16:9: '{'
            {
            match('{'); 

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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:17:7: ( '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:17:9: '}'
            {
            match('}'); 

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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:18:7: ( 'group' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:18:9: 'group'
            {
            match("group"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:19:7: ( 'style' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:19:9: 'style'
            {
            match("style"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:20:7: ( 'extends' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:20:9: 'extends'
            {
            match("extends"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:21:7: ( 'if' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:21:9: 'if'
            {
            match("if"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:22:7: ( 'node' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:22:9: 'node'
            {
            match("node"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:23:7: ( ':' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:23:9: ':'
            {
            match(':'); 

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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:24:7: ( 'icon' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:24:9: 'icon'
            {
            match("icon"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:25:7: ( 'link' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:25:9: 'link'
            {
            match("link"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:26:7: ( 'object' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:26:9: 'object'
            {
            match("object"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:27:7: ( 'source' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:27:9: 'source'
            {
            match("source"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:28:7: ( 'target' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:28:9: 'target'
            {
            match("target"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:29:7: ( 'connection' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:29:9: 'connection'
            {
            match("connection"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:30:7: ( '+' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:30:9: '+'
            {
            match('+'); 

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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:31:7: ( 'decorators:' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:31:9: 'decorators:'
            {
            match("decorators:"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:32:7: ( 'at' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:32:9: 'at'
            {
            match("at"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:33:7: ( '%' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:33:9: '%'
            {
            match('%'); 

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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:34:7: ( 'middle' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:34:9: 'middle'
            {
            match("middle"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:35:7: ( 'anchor' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:35:9: 'anchor'
            {
            match("anchor"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:36:7: ( ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:36:9: ';'
            {
            match(';'); 

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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:37:7: ( 'color' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:37:9: 'color'
            {
            match("color"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:38:7: ( ',' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:38:9: ','
            {
            match(','); 

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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:39:7: ( 'figure' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:39:9: 'figure'
            {
            match("figure"); 


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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:40:7: ( 'as' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:40:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:41:7: ( 'children:' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:41:9: 'children:'
            {
            match("children:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:42:7: ( 'rectangle' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:42:9: 'rectangle'
            {
            match("rectangle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:43:7: ( 'square' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:43:9: 'square'
            {
            match("square"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:44:7: ( 'rhombus' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:44:9: 'rhombus'
            {
            match("rhombus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:45:7: ( 'ellipse' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:45:9: 'ellipse'
            {
            match("ellipse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:46:7: ( 'circle' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:46:9: 'circle'
            {
            match("circle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:47:7: ( 'polygon' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:47:9: 'polygon'
            {
            match("polygon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:48:7: ( 'polyline' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:48:9: 'polyline'
            {
            match("polyline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:49:7: ( 'contains' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:49:9: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:50:7: ( 'null' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:50:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:51:7: ( 'label' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:51:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:52:7: ( 'editable' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:52:9: 'editable'
            {
            match("editable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:53:7: ( 'image' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:53:9: 'image'
            {
            match("image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:54:7: ( 'invisible' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:54:9: 'invisible'
            {
            match("invisible"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:55:7: ( 'foreground' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:55:9: 'foreground'
            {
            match("foreground"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:56:7: ( 'background' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:56:9: 'background'
            {
            match("background"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:57:7: ( 'transparency' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:57:9: 'transparency'
            {
            match("transparency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:58:7: ( 'size' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:58:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:59:7: ( 'x' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:59:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:60:7: ( 'point' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:60:9: 'point'
            {
            match("point"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:61:7: ( 'position' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:61:9: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:62:7: ( 'corner' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:62:9: 'corner'
            {
            match("corner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:63:7: ( 'text' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:63:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:64:7: ( 'font-face' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:64:9: 'font-face'
            {
            match("font-face"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:65:7: ( 'font-size' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:65:9: 'font-size'
            {
            match("font-size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:66:7: ( 'font-style' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:66:9: 'font-style'
            {
            match("font-style"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:67:7: ( 'line-type' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:67:9: 'line-type'
            {
            match("line-type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:68:7: ( 'line-width' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:68:9: 'line-width'
            {
            match("line-width"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:69:7: ( 'free' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:69:9: 'free'
            {
            match("free"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:70:7: ( 'manhattan' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:70:9: 'manhattan'
            {
            match("manhattan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:71:7: ( 'incoming' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:71:9: 'incoming'
            {
            match("incoming"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:72:7: ( 'outgoing' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:72:9: 'outgoing'
            {
            match("outgoing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:73:7: ( 'white' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:73:9: 'white'
            {
            match("white"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:74:7: ( 'silver' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:74:9: 'silver'
            {
            match("silver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:75:7: ( 'gray' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:75:9: 'gray'
            {
            match("gray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:76:7: ( 'black' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:76:9: 'black'
            {
            match("black"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:77:7: ( 'red' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:77:9: 'red'
            {
            match("red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:78:7: ( 'maroon' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:78:9: 'maroon'
            {
            match("maroon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:79:7: ( 'yellow' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:79:9: 'yellow'
            {
            match("yellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:80:7: ( 'olive' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:80:9: 'olive'
            {
            match("olive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:81:7: ( 'lime' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:81:9: 'lime'
            {
            match("lime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:82:7: ( 'green' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:82:9: 'green'
            {
            match("green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:83:7: ( 'aqua' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:83:9: 'aqua'
            {
            match("aqua"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:84:7: ( 'teal' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:84:9: 'teal'
            {
            match("teal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:85:7: ( 'blue' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:85:9: 'blue'
            {
            match("blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:86:7: ( 'navy' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:86:9: 'navy'
            {
            match("navy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:87:7: ( 'fuchsia' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:87:9: 'fuchsia'
            {
            match("fuchsia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:88:7: ( 'purple' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:88:9: 'purple'
            {
            match("purple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:89:7: ( 'vstack' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:89:9: 'vstack'
            {
            match("vstack"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:90:7: ( 'hstack' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:90:9: 'hstack'
            {
            match("hstack"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:91:7: ( '=' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:91:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:92:7: ( '<>' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:92:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:93:7: ( 'true' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:93:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:94:7: ( 'false' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:94:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:95:7: ( 'arial' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:95:9: 'arial'
            {
            match("arial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:96:7: ( 'verdana' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:96:9: 'verdana'
            {
            match("verdana"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:97:7: ( 'times' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:97:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:98:7: ( 'courier' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:98:9: 'courier'
            {
            match("courier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:99:8: ( 'italics' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:99:10: 'italics'
            {
            match("italics"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:100:8: ( 'bold' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:100:10: 'bold'
            {
            match("bold"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:101:8: ( 'underline' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:101:10: 'underline'
            {
            match("underline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:102:8: ( 'solid' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:102:10: 'solid'
            {
            match("solid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:103:8: ( 'dash' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:103:10: 'dash'
            {
            match("dash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5003:14: ( ( '0' | '1' .. '9' ( '0' .. '9' )? | '100' ) '%' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5003:16: ( '0' | '1' .. '9' ( '0' .. '9' )? | '100' ) '%'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5003:16: ( '0' | '1' .. '9' ( '0' .. '9' )? | '100' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt2=1;
                }
                break;
            case '1':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='0') ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4=='0') ) {
                        alt2=3;
                    }
                    else if ( (LA2_4=='%') ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_2=='%'||(LA2_2>='1' && LA2_2<='9')) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5003:17: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5003:21: '1' .. '9' ( '0' .. '9' )?
                    {
                    matchRange('1','9'); 
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5003:30: ( '0' .. '9' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5003:31: '0' .. '9'
                            {
                            matchRange('0','9'); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5003:42: '100'
                    {
                    match("100"); 


                    }
                    break;

            }

            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5005:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5005:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5005:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5005:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5005:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5007:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5007:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5007:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5007:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5011:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5011:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5011:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5011:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5013:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5013:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5013:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5013:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5013:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5013:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5013:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5013:41: '\\r'
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5015:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5015:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5015:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5017:16: ( . )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5017:18: .
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
        // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | RULE_PERCENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=101;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:478: T__90
                {
                mT__90(); 

                }
                break;
            case 80 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:484: T__91
                {
                mT__91(); 

                }
                break;
            case 81 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:490: T__92
                {
                mT__92(); 

                }
                break;
            case 82 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:496: T__93
                {
                mT__93(); 

                }
                break;
            case 83 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:502: T__94
                {
                mT__94(); 

                }
                break;
            case 84 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:508: T__95
                {
                mT__95(); 

                }
                break;
            case 85 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:514: T__96
                {
                mT__96(); 

                }
                break;
            case 86 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:520: T__97
                {
                mT__97(); 

                }
                break;
            case 87 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:526: T__98
                {
                mT__98(); 

                }
                break;
            case 88 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:532: T__99
                {
                mT__99(); 

                }
                break;
            case 89 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:538: T__100
                {
                mT__100(); 

                }
                break;
            case 90 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:545: T__101
                {
                mT__101(); 

                }
                break;
            case 91 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:552: T__102
                {
                mT__102(); 

                }
                break;
            case 92 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:559: T__103
                {
                mT__103(); 

                }
                break;
            case 93 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:566: T__104
                {
                mT__104(); 

                }
                break;
            case 94 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:573: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 95 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:586: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 96 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:594: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 97 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:603: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 98 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:615: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 99 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:631: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 100 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:647: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 101 :
                // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1:655: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\57\2\uffff\1\57\2\uffff\4\57\1\uffff\4\57\1\uffff\1\57"+
        "\3\uffff\4\57\1\151\4\57\1\uffff\1\53\1\57\3\162\1\53\1\uffff\3"+
        "\53\2\uffff\3\57\1\uffff\1\57\1\u0080\3\57\2\uffff\3\57\2\uffff"+
        "\13\57\1\uffff\14\57\1\uffff\1\u00a9\1\57\1\u00ab\2\57\3\uffff\14"+
        "\57\1\uffff\5\57\2\uffff\1\57\2\uffff\2\162\4\uffff\6\57\1\uffff"+
        "\50\57\1\uffff\1\57\1\uffff\11\57\1\u0100\17\57\1\162\6\57\1\u0116"+
        "\5\57\1\u011c\1\57\1\u011e\5\57\1\u0124\4\57\1\u0129\1\u012a\1\u012b"+
        "\1\u012c\1\57\1\u012e\6\57\1\u0135\1\u0136\1\u0137\11\57\1\u0141"+
        "\4\57\1\u0146\3\57\1\uffff\7\57\1\u0152\1\u0153\13\57\1\u015f\1"+
        "\uffff\5\57\1\uffff\1\u0165\1\uffff\1\u0166\1\u0167\1\57\1\u0169"+
        "\1\57\1\uffff\4\57\6\uffff\1\u0171\2\57\1\u0174\2\57\3\uffff\1\u0177"+
        "\2\57\1\u017a\5\57\1\uffff\1\u0180\2\57\2\uffff\1\57\1\u0186\4\57"+
        "\1\u018b\3\57\1\u018f\2\uffff\1\u0190\6\57\1\u0197\1\57\1\u0199"+
        "\1\u019a\1\uffff\5\57\3\uffff\1\u01a0\1\uffff\1\u01a1\1\u01a2\3"+
        "\57\3\uffff\1\u01a6\1\57\1\uffff\1\u01a8\1\57\1\uffff\2\57\1\uffff"+
        "\1\u01ac\2\57\1\u01af\1\u01b0\1\uffff\1\u01b1\1\57\2\uffff\1\57"+
        "\1\uffff\4\57\1\uffff\1\57\1\u01bb\1\57\2\uffff\1\u01bd\1\u01be"+
        "\1\57\1\u01c0\2\57\1\uffff\1\57\2\uffff\2\57\1\u01c6\1\u01c7\1\57"+
        "\3\uffff\1\u01c9\1\u01ca\1\57\1\uffff\1\57\1\uffff\3\57\1\uffff"+
        "\1\u01d0\1\57\3\uffff\1\57\2\uffff\1\u01d3\1\57\1\u01d5\1\u01d6"+
        "\2\57\1\uffff\1\57\2\uffff\1\u01da\1\uffff\4\57\1\u01df\2\uffff"+
        "\1\57\2\uffff\1\u01e1\1\u01e2\2\57\1\u01e5\1\uffff\2\57\1\uffff"+
        "\1\57\2\uffff\1\u01e9\1\u01ea\1\57\1\uffff\1\57\1\u01ed\1\u01ee"+
        "\1\u01ef\1\uffff\1\57\2\uffff\2\57\2\uffff\1\57\1\u01f4\2\uffff"+
        "\1\57\1\u01f6\3\uffff\2\57\1\u01f9\1\u01fa\1\uffff\1\u01fb\2\uffff"+
        "\1\57\3\uffff\1\u01fd\1\uffff";
    static final String DFA14_eofS =
        "\u01fe\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\1\143\2\uffff\1\141\2\uffff\1\162\1\151\1\144\1\141\1"+
        "\uffff\1\141\1\142\1\141\1\150\1\uffff\1\156\3\uffff\1\141\1\145"+
        "\1\157\1\141\1\60\1\150\2\145\1\163\1\uffff\1\76\1\156\3\45\1\101"+
        "\1\uffff\2\0\1\52\2\uffff\1\164\1\144\1\156\1\uffff\1\141\1\60\1"+
        "\157\1\143\1\141\2\uffff\1\141\1\143\1\163\2\uffff\1\141\1\171\1"+
        "\154\1\165\1\154\1\164\1\154\1\151\1\144\1\154\1\166\1\uffff\1\155"+
        "\1\142\1\152\1\164\1\151\1\162\2\141\1\155\1\154\1\151\1\162\1\uffff"+
        "\1\60\1\143\1\60\1\165\1\151\3\uffff\1\147\1\156\1\145\1\143\1\154"+
        "\1\143\1\157\1\151\1\162\1\143\1\141\1\154\1\uffff\1\151\1\154\1"+
        "\164\1\162\1\164\2\uffff\1\144\2\uffff\2\45\4\uffff\1\141\1\144"+
        "\1\150\2\157\1\147\1\uffff\1\156\1\151\1\157\1\154\1\147\1\157\1"+
        "\150\1\165\1\171\1\145\1\154\1\162\1\151\1\141\1\145\1\166\1\145"+
        "\1\151\1\164\1\145\1\154\1\171\4\145\1\147\1\166\1\147\1\156\1\145"+
        "\1\164\1\154\1\145\1\156\1\157\1\156\1\162\1\154\1\143\1\uffff\1"+
        "\150\1\uffff\2\141\1\165\1\145\1\164\1\145\1\150\1\163\1\164\1\60"+
        "\1\155\1\171\1\156\1\151\1\160\1\153\1\143\1\145\1\144\1\164\1\154"+
        "\1\141\1\144\1\141\1\145\1\45\1\155\1\154\1\141\1\157\1\162\1\145"+
        "\1\60\1\163\1\155\1\151\2\162\1\60\1\160\1\60\1\156\1\145\1\143"+
        "\1\144\1\162\1\60\1\145\1\156\1\160\1\141\4\60\1\55\1\60\1\154\1"+
        "\143\1\157\2\145\1\163\3\60\1\163\1\145\1\141\1\162\1\145\1\151"+
        "\1\144\1\154\1\157\1\60\1\154\1\162\1\147\1\55\1\60\1\163\1\145"+
        "\1\141\1\uffff\1\142\1\147\2\164\1\154\1\147\1\153\2\60\1\145\1"+
        "\157\1\143\1\141\1\143\1\162\1\157\1\145\1\164\1\156\1\164\1\60"+
        "\1\uffff\2\151\1\143\2\141\1\uffff\1\60\1\uffff\2\60\1\145\1\60"+
        "\1\145\1\uffff\1\162\1\144\1\163\1\142\4\uffff\1\164\1\uffff\1\60"+
        "\1\164\1\151\1\60\1\164\1\160\3\uffff\1\60\1\143\1\151\1\60\1\162"+
        "\1\145\1\162\1\145\1\162\1\uffff\1\60\1\145\1\162\1\146\1\uffff"+
        "\1\151\1\60\1\156\1\165\1\157\1\151\1\60\1\151\1\145\1\162\1\60"+
        "\2\uffff\1\60\1\167\1\153\1\156\1\153\1\154\1\144\1\60\1\164\2\60"+
        "\1\uffff\1\142\1\156\1\163\1\155\1\164\3\uffff\1\60\1\uffff\2\60"+
        "\1\163\1\145\1\154\3\uffff\1\60\1\156\1\uffff\1\60\1\141\1\uffff"+
        "\1\164\1\156\1\uffff\1\60\1\162\1\145\2\60\1\uffff\1\60\1\157\1"+
        "\uffff\1\151\1\141\1\uffff\1\147\1\163\2\156\1\uffff\1\157\1\60"+
        "\1\157\2\uffff\2\60\1\141\1\60\1\151\1\145\1\uffff\1\141\2\uffff"+
        "\1\154\1\147\2\60\1\157\3\uffff\2\60\1\145\1\uffff\1\147\1\uffff"+
        "\1\162\1\151\1\163\1\uffff\1\60\1\156\3\uffff\1\165\2\uffff\1\60"+
        "\1\154\2\60\1\145\1\156\1\uffff\1\165\2\uffff\1\60\1\uffff\1\156"+
        "\1\154\1\156\1\145\1\60\2\uffff\1\162\2\uffff\2\60\1\145\1\157\1"+
        "\60\1\uffff\1\72\1\156\1\uffff\1\145\2\uffff\2\60\1\156\1\uffff"+
        "\1\145\3\60\1\uffff\1\163\2\uffff\2\156\2\uffff\1\144\1\60\2\uffff"+
        "\1\144\1\60\3\uffff\1\72\1\143\2\60\1\uffff\1\60\2\uffff\1\171\3"+
        "\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\151\1\164\2\uffff\1\151\2\uffff\1\162\1\164\1\170\1\165"+
        "\1\uffff\1\151\1\165\1\162\1\157\1\uffff\1\164\3\uffff\1\165\1\150"+
        "\1\165\1\157\1\172\1\150\1\145\2\163\1\uffff\1\76\1\156\1\45\2\71"+
        "\1\172\1\uffff\2\uffff\1\57\2\uffff\1\164\1\144\1\162\1\uffff\1"+
        "\160\1\172\1\157\1\166\1\141\2\uffff\1\141\1\143\1\163\2\uffff\1"+
        "\157\1\171\2\165\1\172\1\164\1\154\1\151\1\144\1\154\1\166\1\uffff"+
        "\1\156\1\142\1\152\1\164\1\151\1\162\1\165\1\170\1\155\1\165\1\151"+
        "\1\162\1\uffff\1\172\1\143\1\172\1\165\1\151\3\uffff\1\147\1\162"+
        "\1\145\1\143\1\154\1\144\1\157\1\163\1\162\1\143\1\165\1\154\1\uffff"+
        "\1\151\1\154\1\164\1\162\1\164\2\uffff\1\144\2\uffff\1\60\1\45\4"+
        "\uffff\1\141\1\144\1\150\2\157\1\147\1\uffff\1\156\1\151\1\157\1"+
        "\154\1\147\1\157\1\150\1\165\1\171\1\145\1\154\1\162\1\151\1\141"+
        "\1\145\1\166\1\145\1\151\1\164\1\145\1\154\1\171\1\153\3\145\1\147"+
        "\1\166\1\147\1\156\1\145\1\164\1\154\1\145\1\164\1\157\1\156\1\162"+
        "\1\154\1\143\1\uffff\1\150\1\uffff\2\141\1\165\1\145\1\164\1\145"+
        "\1\150\1\163\1\164\1\172\1\155\1\171\1\156\1\151\1\160\1\153\1\143"+
        "\1\145\1\144\1\164\1\154\1\141\1\144\1\141\1\145\1\45\1\155\1\154"+
        "\1\141\1\157\1\162\1\145\1\172\1\163\1\155\1\151\2\162\1\172\1\160"+
        "\1\172\1\156\1\145\1\143\1\144\1\162\1\172\1\145\1\156\1\160\1\141"+
        "\4\172\1\55\1\172\1\154\1\143\1\157\2\145\1\163\3\172\1\163\1\145"+
        "\1\141\1\162\1\145\1\151\1\144\1\154\1\157\1\172\1\154\1\162\1\147"+
        "\1\55\1\172\1\163\1\145\1\141\1\uffff\1\142\1\154\2\164\1\154\1"+
        "\147\1\153\2\172\1\145\1\157\1\143\1\141\1\143\1\162\1\157\1\145"+
        "\1\164\1\156\1\164\1\172\1\uffff\2\151\1\143\2\141\1\uffff\1\172"+
        "\1\uffff\2\172\1\145\1\172\1\145\1\uffff\1\162\1\144\1\163\1\142"+
        "\4\uffff\1\167\1\uffff\1\172\1\164\1\151\1\172\1\164\1\160\3\uffff"+
        "\1\172\1\143\1\151\1\172\1\162\1\145\1\162\1\145\1\162\1\uffff\1"+
        "\172\1\145\1\162\1\163\1\uffff\1\151\1\172\1\156\1\165\1\157\1\151"+
        "\1\172\1\151\1\145\1\162\1\172\2\uffff\1\172\1\167\1\153\1\156\1"+
        "\153\1\154\1\144\1\172\1\164\2\172\1\uffff\1\142\1\156\1\163\1\155"+
        "\1\164\3\uffff\1\172\1\uffff\2\172\1\163\1\145\1\154\3\uffff\1\172"+
        "\1\156\1\uffff\1\172\1\141\1\uffff\1\164\1\156\1\uffff\1\172\1\162"+
        "\1\145\2\172\1\uffff\1\172\1\157\1\uffff\1\164\1\141\1\uffff\1\147"+
        "\1\163\2\156\1\uffff\1\157\1\172\1\157\2\uffff\2\172\1\141\1\172"+
        "\1\151\1\145\1\uffff\1\141\2\uffff\1\154\1\147\2\172\1\157\3\uffff"+
        "\2\172\1\145\1\uffff\1\147\1\uffff\1\162\1\151\1\163\1\uffff\1\172"+
        "\1\156\3\uffff\1\165\2\uffff\1\172\1\154\2\172\1\145\1\156\1\uffff"+
        "\1\165\2\uffff\1\172\1\uffff\1\156\1\154\1\156\1\145\1\172\2\uffff"+
        "\1\162\2\uffff\2\172\1\145\1\157\1\172\1\uffff\1\72\1\156\1\uffff"+
        "\1\145\2\uffff\2\172\1\156\1\uffff\1\145\3\172\1\uffff\1\163\2\uffff"+
        "\2\156\2\uffff\1\144\1\172\2\uffff\1\144\1\172\3\uffff\1\72\1\143"+
        "\2\172\1\uffff\1\172\2\uffff\1\171\3\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\4\1\uffff\1\6\1\7\4\uffff\1\15\4\uffff\1\24\1\uffff"+
        "\1\27\1\32\1\34\11\uffff\1\121\6\uffff\1\137\3\uffff\1\144\1\145"+
        "\3\uffff\1\137\5\uffff\1\3\1\4\3\uffff\1\6\1\7\13\uffff\1\15\14"+
        "\uffff\1\24\5\uffff\1\27\1\32\1\34\14\uffff\1\61\5\uffff\1\121\1"+
        "\122\1\uffff\1\140\1\136\2\uffff\1\141\1\142\1\143\1\144\6\uffff"+
        "\1\13\50\uffff\1\26\1\uffff\1\36\124\uffff\1\103\25\uffff\1\16\5"+
        "\uffff\1\135\1\uffff\1\101\5\uffff\1\60\4\uffff\1\14\1\50\1\114"+
        "\1\17\1\uffff\1\107\6\uffff\1\123\1\65\1\112\11\uffff\1\111\4\uffff"+
        "\1\73\13\uffff\1\113\1\132\13\uffff\1\53\5\uffff\1\10\1\110\1\11"+
        "\1\uffff\1\134\5\uffff\1\71\1\72\1\51\2\uffff\1\106\2\uffff\1\127"+
        "\2\uffff\1\33\5\uffff\1\125\2\uffff\1\66\2\uffff\1\124\4\uffff\1"+
        "\62\3\uffff\1\102\1\77\6\uffff\1\30\1\uffff\1\104\1\2\5\uffff\1"+
        "\21\1\41\1\100\3\uffff\1\20\1\uffff\1\22\3\uffff\1\64\2\uffff\1"+
        "\44\1\31\1\35\1\uffff\1\67\1\70\6\uffff\1\116\1\uffff\1\105\1\117"+
        "\1\uffff\1\120\5\uffff\1\131\1\5\1\uffff\1\12\1\43\5\uffff\1\130"+
        "\2\uffff\1\115\1\uffff\1\42\1\45\3\uffff\1\126\4\uffff\1\75\1\uffff"+
        "\1\52\1\76\2\uffff\1\47\1\37\2\uffff\1\46\1\63\2\uffff\1\1\1\74"+
        "\1\54\4\uffff\1\40\1\uffff\1\133\1\25\1\uffff\1\23\1\55\1\56\1\uffff"+
        "\1\57";
    static final String DFA14_specialS =
        "\1\0\46\uffff\1\1\1\2\u01d5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\47\2\53\1\23\1\53\1"+
            "\50\2\53\1\4\1\21\1\25\1\53\1\3\1\51\1\42\1\43\10\44\1\14\1"+
            "\24\1\40\1\37\3\53\32\46\3\53\1\45\1\46\1\53\1\22\1\31\1\20"+
            "\1\5\1\12\1\26\1\10\1\36\1\2\2\46\1\15\1\1\1\13\1\16\1\30\1"+
            "\46\1\27\1\11\1\17\1\41\1\35\1\33\1\32\1\34\1\46\1\6\1\53\1"+
            "\7\uff82\53",
            "\1\56\3\uffff\1\54\3\uffff\1\55",
            "\1\62\2\uffff\1\61\6\uffff\1\60\1\63\5\uffff\1\64",
            "",
            "",
            "\1\71\3\uffff\1\70\3\uffff\1\67",
            "",
            "",
            "\1\74",
            "\1\100\5\uffff\1\76\1\uffff\1\77\2\uffff\1\75",
            "\1\103\7\uffff\1\102\13\uffff\1\101",
            "\1\106\15\uffff\1\104\5\uffff\1\105",
            "",
            "\1\111\7\uffff\1\110",
            "\1\112\11\uffff\1\114\10\uffff\1\113",
            "\1\115\3\uffff\1\117\3\uffff\1\120\10\uffff\1\116",
            "\1\122\1\123\5\uffff\1\121",
            "",
            "\1\126\2\uffff\1\130\1\131\1\127\1\125",
            "",
            "",
            "",
            "\1\141\7\uffff\1\135\5\uffff\1\136\2\uffff\1\137\2\uffff\1"+
            "\140",
            "\1\142\2\uffff\1\143",
            "\1\144\5\uffff\1\145",
            "\1\146\12\uffff\1\147\2\uffff\1\150",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\152",
            "\1\153",
            "\1\155\15\uffff\1\154",
            "\1\156",
            "",
            "\1\160",
            "\1\161",
            "\1\163",
            "\1\163\12\uffff\1\164\11\165",
            "\1\163\12\uffff\12\165",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\0\166",
            "\0\166",
            "\1\167\4\uffff\1\170",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174\3\uffff\1\175",
            "",
            "\1\177\16\uffff\1\176",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0081",
            "\1\u0083\22\uffff\1\u0082",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "\1\u0089\3\uffff\1\u008a\11\uffff\1\u0088",
            "\1\u008b",
            "\1\u008d\10\uffff\1\u008c",
            "\1\u008e",
            "\1\u0090\15\uffff\1\u008f",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0098\1\u0097",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\23\uffff\1\u009f",
            "\1\u00a1\26\uffff\1\u00a0",
            "\1\u00a2",
            "\1\u00a4\1\uffff\1\u00a3\3\uffff\1\u00a5\2\uffff\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00aa",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "",
            "\1\u00ae",
            "\1\u00b0\3\uffff\1\u00af",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4\1\u00b5",
            "\1\u00b6",
            "\1\u00b8\2\uffff\1\u00b7\6\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc\23\uffff\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "\1\u00c4",
            "",
            "",
            "\1\163\12\uffff\1\u00c5",
            "\1\163",
            "",
            "",
            "",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e3\5\uffff\1\u00e2",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef\5\uffff\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\163",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u011d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u012d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "",
            "\1\u014a",
            "\1\u014b\4\uffff\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0168",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u016a",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "",
            "",
            "",
            "\1\u016f\2\uffff\1\u0170",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0172",
            "\1\u0173",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0175",
            "\1\u0176",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0178",
            "\1\u0179",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183\14\uffff\1\u0184",
            "",
            "\1\u0185",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0198",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01a7",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01a9",
            "",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01ad",
            "\1\u01ae",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01b2",
            "",
            "\1\u01b3\12\uffff\1\u01b4",
            "\1\u01b5",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01bc",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01bf",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "",
            "",
            "\1\u01c4",
            "\1\u01c5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01c8",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01d1",
            "",
            "",
            "",
            "\1\u01d2",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01d4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01d7",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u01e0",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01e3",
            "\1\u01e4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u01e6",
            "\1\u01e7",
            "",
            "\1\u01e8",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01eb",
            "",
            "\1\u01ec",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u01f0",
            "",
            "",
            "\1\u01f1",
            "\1\u01f2",
            "",
            "",
            "\1\u01f3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u01f5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u01f7",
            "\1\u01f8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u01fc",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | RULE_PERCENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='m') ) {s = 1;}

                        else if ( (LA14_0=='i') ) {s = 2;}

                        else if ( (LA14_0=='.') ) {s = 3;}

                        else if ( (LA14_0=='*') ) {s = 4;}

                        else if ( (LA14_0=='d') ) {s = 5;}

                        else if ( (LA14_0=='{') ) {s = 6;}

                        else if ( (LA14_0=='}') ) {s = 7;}

                        else if ( (LA14_0=='g') ) {s = 8;}

                        else if ( (LA14_0=='s') ) {s = 9;}

                        else if ( (LA14_0=='e') ) {s = 10;}

                        else if ( (LA14_0=='n') ) {s = 11;}

                        else if ( (LA14_0==':') ) {s = 12;}

                        else if ( (LA14_0=='l') ) {s = 13;}

                        else if ( (LA14_0=='o') ) {s = 14;}

                        else if ( (LA14_0=='t') ) {s = 15;}

                        else if ( (LA14_0=='c') ) {s = 16;}

                        else if ( (LA14_0=='+') ) {s = 17;}

                        else if ( (LA14_0=='a') ) {s = 18;}

                        else if ( (LA14_0=='%') ) {s = 19;}

                        else if ( (LA14_0==';') ) {s = 20;}

                        else if ( (LA14_0==',') ) {s = 21;}

                        else if ( (LA14_0=='f') ) {s = 22;}

                        else if ( (LA14_0=='r') ) {s = 23;}

                        else if ( (LA14_0=='p') ) {s = 24;}

                        else if ( (LA14_0=='b') ) {s = 25;}

                        else if ( (LA14_0=='x') ) {s = 26;}

                        else if ( (LA14_0=='w') ) {s = 27;}

                        else if ( (LA14_0=='y') ) {s = 28;}

                        else if ( (LA14_0=='v') ) {s = 29;}

                        else if ( (LA14_0=='h') ) {s = 30;}

                        else if ( (LA14_0=='=') ) {s = 31;}

                        else if ( (LA14_0=='<') ) {s = 32;}

                        else if ( (LA14_0=='u') ) {s = 33;}

                        else if ( (LA14_0=='0') ) {s = 34;}

                        else if ( (LA14_0=='1') ) {s = 35;}

                        else if ( ((LA14_0>='2' && LA14_0<='9')) ) {s = 36;}

                        else if ( (LA14_0=='^') ) {s = 37;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='j' && LA14_0<='k')||LA14_0=='q'||LA14_0=='z') ) {s = 38;}

                        else if ( (LA14_0=='\"') ) {s = 39;}

                        else if ( (LA14_0=='\'') ) {s = 40;}

                        else if ( (LA14_0=='/') ) {s = 41;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 42;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='$')||LA14_0=='&'||(LA14_0>='(' && LA14_0<=')')||LA14_0=='-'||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_39 = input.LA(1);

                        s = -1;
                        if ( ((LA14_39>='\u0000' && LA14_39<='\uFFFF')) ) {s = 118;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_40 = input.LA(1);

                        s = -1;
                        if ( ((LA14_40>='\u0000' && LA14_40<='\uFFFF')) ) {s = 118;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}