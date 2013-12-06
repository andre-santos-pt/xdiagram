package org.eclipselabs.xdiagram.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.xdiagram.xtext.services.XDiagramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDiagramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'diagram'", "'{'", "'}'", "'import'", "'.'", "'*'", "'style'", "':'", "'node'", "'resizable'", "'icon'", "'set'", "'='", "'main'", "'figure'", "','", "'stack'", "'free'", "'container'", "'for'", "'%'", "'px'", "'link'", "'object'", "'source'", "'target'", "'manhattan'", "'origin'", "'destiny'", "'placing'", "'at'", "'text'", "'Label'", "'Description'", "'Arrow'", "'Triangle'", "'Rhombus'", "'Polygon'", "'Polyline'", "'anchor'", "'to'", "'-'", "'lf'", "'rg'", "'up'", "'dw'", "'as'", "'incoming'", "'outgoing'", "'both'", "'connection'", "'using'", "'connections'", "'attribute'", "'layout'", "'horizontal'", "'vertical'", "'over'", "'center'", "'text-align'", "'left'", "'middle'", "'right'", "'gradient'", "'BlueWhite'", "'BlueWhiteGloss'", "'CopperWhiteGloss'", "'LightGray'", "'LightYellow'", "'SilverWhiteGloss'", "'LimeWhite'", "'point'", "'size'", "'position'", "'background'", "'foreground'", "'border'", "'['", "'<>'", "']'", "'WHITE'", "'BLACK'", "'BLUE'", "'GREEN'", "'RED'", "'YELLOW'", "'CYAN'", "'ORANGE'", "'RGB'", "'('", "')'", "'line-width'", "'top'", "'width'", "'height'", "'angle'", "'corner'", "'transparency'", "'font-size'", "'text-value'", "'font-name'", "'+'", "'text-editable'", "'font-italic'", "'font-bold'", "'true'", "'false'", "'line-style'", "'solid'", "'dash'", "'dot'", "'dashdot'", "'->'", "'Square'", "'Rectangle'", "'RoundedRectangle'", "'Circle'", "'Ellipse'", "'Image'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=4;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
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
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
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
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=6;
    public static final int T__113=113;
    public static final int T__112=112;
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
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalXDiagramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXDiagramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXDiagramParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g"; }



     	private XDiagramGrammarAccess grammarAccess;
     	
        public InternalXDiagramParser(TokenStream input, XDiagramGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XDiagram";	
       	}
       	
       	@Override
       	protected XDiagramGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXDiagram"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:68:1: entryRuleXDiagram returns [EObject current=null] : iv_ruleXDiagram= ruleXDiagram EOF ;
    public final EObject entryRuleXDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDiagram = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:69:2: (iv_ruleXDiagram= ruleXDiagram EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:70:2: iv_ruleXDiagram= ruleXDiagram EOF
            {
             newCompositeNode(grammarAccess.getXDiagramRule()); 
            pushFollow(FOLLOW_ruleXDiagram_in_entryRuleXDiagram75);
            iv_ruleXDiagram=ruleXDiagram();

            state._fsp--;

             current =iv_ruleXDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDiagram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDiagram"


    // $ANTLR start "ruleXDiagram"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:77:1: ruleXDiagram returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_links_8_0= ruleLink ) ) )+ otherlv_9= '}' ) ;
    public final EObject ruleXDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_imports_2_0 = null;

        EObject lv_styles_3_0 = null;

        EObject lv_nodes_7_0 = null;

        EObject lv_links_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:80:28: ( (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_links_8_0= ruleLink ) ) )+ otherlv_9= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_links_8_0= ruleLink ) ) )+ otherlv_9= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_links_8_0= ruleLink ) ) )+ otherlv_9= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:81:3: otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_links_8_0= ruleLink ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleXDiagram122); 

                	newLeafNode(otherlv_0, grammarAccess.getXDiagramAccess().getMetamodelKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:85:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:86:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:86:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:87:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXDiagram139); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getXDiagramAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:103:2: ( (lv_imports_2_0= ruleImportStatement ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:104:1: (lv_imports_2_0= ruleImportStatement )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:104:1: (lv_imports_2_0= ruleImportStatement )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:105:3: lv_imports_2_0= ruleImportStatement
            {
             
            	        newCompositeNode(grammarAccess.getXDiagramAccess().getImportsImportStatementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleImportStatement_in_ruleXDiagram165);
            lv_imports_2_0=ruleImportStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	        }
                   		add(
                   			current, 
                   			"imports",
                    		lv_imports_2_0, 
                    		"ImportStatement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:121:2: ( (lv_styles_3_0= ruleStyle ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:122:1: (lv_styles_3_0= ruleStyle )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:122:1: (lv_styles_3_0= ruleStyle )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:123:3: lv_styles_3_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getStylesStyleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleXDiagram186);
            	    lv_styles_3_0=ruleStyle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"styles",
            	            		lv_styles_3_0, 
            	            		"Style");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleXDiagram199); 

                	newLeafNode(otherlv_4, grammarAccess.getXDiagramAccess().getDiagramKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:143:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:144:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:144:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:145:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getXDiagramRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getXDiagramAccess().getModelClassEClassCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXDiagram222);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleXDiagram234); 

                	newLeafNode(otherlv_6, grammarAccess.getXDiagramAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:162:1: ( ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_links_8_0= ruleLink ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }
                else if ( (LA2_0==34) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:162:2: ( (lv_nodes_7_0= ruleNode ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:162:2: ( (lv_nodes_7_0= ruleNode ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:163:1: (lv_nodes_7_0= ruleNode )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:163:1: (lv_nodes_7_0= ruleNode )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:164:3: lv_nodes_7_0= ruleNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getNodesNodeParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleXDiagram256);
            	    lv_nodes_7_0=ruleNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_7_0, 
            	            		"Node");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:181:6: ( (lv_links_8_0= ruleLink ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:181:6: ( (lv_links_8_0= ruleLink ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:182:1: (lv_links_8_0= ruleLink )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:182:1: (lv_links_8_0= ruleLink )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:183:3: lv_links_8_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getLinksLinkParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleXDiagram283);
            	    lv_links_8_0=ruleLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_8_0, 
            	            		"Link");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleXDiagram297); 

                	newLeafNode(otherlv_9, grammarAccess.getXDiagramAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDiagram"


    // $ANTLR start "entryRuleImportStatement"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:211:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:212:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:213:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement333);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;

             current =iv_ruleImportStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:220:1: ruleImportStatement returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:223:28: ( ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:224:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:224:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:224:2: () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:224:2: ()
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:225:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportStatementAccess().getImportStatementAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:230:2: (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:230:4: otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleImportStatement390); 

                        	newLeafNode(otherlv_1, grammarAccess.getImportStatementAccess().getImportKeyword_1_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:234:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:235:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:235:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:236:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportStatementAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportStatement411);
                    lv_importedNamespace_2_0=ruleQualifiedNameWithWildCard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"importedNamespace",
                            		lv_importedNamespace_2_0, 
                            		"QualifiedNameWithWildCard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:260:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:261:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:262:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName450);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:269:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:272:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:273:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:273:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:273:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName501); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:280:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:281:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName520); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName535); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:301:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:302:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:303:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard583);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard594); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:310:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:313:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:314:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:314:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:315:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard641);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:325:1: (kw= '.' kw= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:326:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildCard660); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildCard673); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleStyle"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:345:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:346:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:347:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle715);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle725); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:354:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:357:28: ( (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:358:1: (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:358:1: (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:358:3: otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleStyle762); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStyle774); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:366:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:367:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:367:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:368:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStyle791); 

            			newLeafNode(lv_name_2_0, grammarAccess.getStyleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStyle808); 

                	newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:388:1: ( (lv_features_4_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:389:1: (lv_features_4_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:389:1: (lv_features_4_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:390:3: lv_features_4_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getFeaturesFigureFeaturesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleStyle829);
            lv_features_4_0=ruleFigureFeatures();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	        }
                   		set(
                   			current, 
                   			"features",
                    		lv_features_4_0, 
                    		"FigureFeatures");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStyle841); 

                	newLeafNode(otherlv_5, grammarAccess.getStyleAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleNode"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:418:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:419:2: (iv_ruleNode= ruleNode EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:420:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode877);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode887); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:427:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_figures_9_0= ruleNodeFigure ) )* ( (lv_containers_10_0= ruleNodeContainer ) )* ( (lv_anchors_11_0= ruleNodeAnchor ) )* otherlv_12= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_resizable_3_0=null;
        Token otherlv_4=null;
        Token lv_style_5_0=null;
        Token otherlv_6=null;
        Token lv_icon_7_0=null;
        Token otherlv_12=null;
        EObject lv_attributes_8_0 = null;

        EObject lv_figures_9_0 = null;

        EObject lv_containers_10_0 = null;

        EObject lv_anchors_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:430:28: ( (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_figures_9_0= ruleNodeFigure ) )* ( (lv_containers_10_0= ruleNodeContainer ) )* ( (lv_anchors_11_0= ruleNodeAnchor ) )* otherlv_12= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:431:1: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_figures_9_0= ruleNodeFigure ) )* ( (lv_containers_10_0= ruleNodeContainer ) )* ( (lv_anchors_11_0= ruleNodeAnchor ) )* otherlv_12= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:431:1: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_figures_9_0= ruleNodeFigure ) )* ( (lv_containers_10_0= ruleNodeContainer ) )* ( (lv_anchors_11_0= ruleNodeAnchor ) )* otherlv_12= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:431:3: otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_figures_9_0= ruleNodeFigure ) )* ( (lv_containers_10_0= ruleNodeContainer ) )* ( (lv_anchors_11_0= ruleNodeAnchor ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNode924); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:435:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:436:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:436:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:437:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getModelClassEClassCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNode947);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleNode959); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:454:1: ( (lv_resizable_3_0= 'resizable' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:455:1: (lv_resizable_3_0= 'resizable' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:455:1: (lv_resizable_3_0= 'resizable' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:456:3: lv_resizable_3_0= 'resizable'
                    {
                    lv_resizable_3_0=(Token)match(input,21,FOLLOW_21_in_ruleNode977); 

                            newLeafNode(lv_resizable_3_0, grammarAccess.getNodeAccess().getResizableResizableKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(current, "resizable", true, "resizable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:469:3: (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:469:5: otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleNode1004); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getStyleKeyword_4_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:473:1: ( (lv_style_5_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:474:1: (lv_style_5_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:474:1: (lv_style_5_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:475:3: lv_style_5_0= RULE_ID
                    {
                    lv_style_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1021); 

                    			newLeafNode(lv_style_5_0, grammarAccess.getNodeAccess().getStyleIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:491:4: (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:491:6: otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleNode1041); 

                        	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getIconKeyword_5_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:495:1: ( (lv_icon_7_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:496:1: (lv_icon_7_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:496:1: (lv_icon_7_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:497:3: lv_icon_7_0= RULE_ID
                    {
                    lv_icon_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1058); 

                    			newLeafNode(lv_icon_7_0, grammarAccess.getNodeAccess().getIconIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_7_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:513:4: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:514:1: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:514:1: (lv_attributes_8_0= ruleAttribute )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:515:3: lv_attributes_8_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getAttributesAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleNode1086);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_8_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:531:3: ( (lv_figures_9_0= ruleNodeFigure ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:532:1: (lv_figures_9_0= ruleNodeFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:532:1: (lv_figures_9_0= ruleNodeFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:533:3: lv_figures_9_0= ruleNodeFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getFiguresNodeFigureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeFigure_in_ruleNode1108);
            	    lv_figures_9_0=ruleNodeFigure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"figures",
            	            		lv_figures_9_0, 
            	            		"NodeFigure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:549:3: ( (lv_containers_10_0= ruleNodeContainer ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=30)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:550:1: (lv_containers_10_0= ruleNodeContainer )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:550:1: (lv_containers_10_0= ruleNodeContainer )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:551:3: lv_containers_10_0= ruleNodeContainer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getContainersNodeContainerParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeContainer_in_ruleNode1130);
            	    lv_containers_10_0=ruleNodeContainer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containers",
            	            		lv_containers_10_0, 
            	            		"NodeContainer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:567:3: ( (lv_anchors_11_0= ruleNodeAnchor ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==51) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:568:1: (lv_anchors_11_0= ruleNodeAnchor )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:568:1: (lv_anchors_11_0= ruleNodeAnchor )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:569:3: lv_anchors_11_0= ruleNodeAnchor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getAnchorsNodeAnchorParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeAnchor_in_ruleNode1152);
            	    lv_anchors_11_0=ruleNodeAnchor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"anchors",
            	            		lv_anchors_11_0, 
            	            		"NodeAnchor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleNode1165); 

                	newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleAttribute"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:597:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:598:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:599:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1201);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:606:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:609:28: ( (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:610:1: (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:610:1: (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:610:3: otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAttribute1248); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getSetKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:614:1: ( (lv_key_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:615:1: (lv_key_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:615:1: (lv_key_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:616:3: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1265); 

            			newLeafNode(lv_key_1_0, grammarAccess.getAttributeAccess().getKeyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAttribute1282); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:636:1: ( (lv_value_3_0= ruleAtributeValue ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:637:1: (lv_value_3_0= ruleAtributeValue )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:637:1: (lv_value_3_0= ruleAtributeValue )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:638:3: lv_value_3_0= ruleAtributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getValueAtributeValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAtributeValue_in_ruleAttribute1303);
            lv_value_3_0=ruleAtributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"AtributeValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleNodeFigure"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:662:1: entryRuleNodeFigure returns [EObject current=null] : iv_ruleNodeFigure= ruleNodeFigure EOF ;
    public final EObject entryRuleNodeFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:663:2: (iv_ruleNodeFigure= ruleNodeFigure EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:664:2: iv_ruleNodeFigure= ruleNodeFigure EOF
            {
             newCompositeNode(grammarAccess.getNodeFigureRule()); 
            pushFollow(FOLLOW_ruleNodeFigure_in_entryRuleNodeFigure1339);
            iv_ruleNodeFigure=ruleNodeFigure();

            state._fsp--;

             current =iv_ruleNodeFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeFigure1349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeFigure"


    // $ANTLR start "ruleNodeFigure"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:671:1: ruleNodeFigure returns [EObject current=null] : ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' ) ;
    public final EObject ruleNodeFigure() throws RecognitionException {
        EObject current = null;

        Token lv_option_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_style_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_figure_3_0 = null;

        EObject lv_features_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:674:28: ( ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:675:1: ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:675:1: ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:675:2: ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}'
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:675:2: ( (lv_option_0_0= 'main' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:676:1: (lv_option_0_0= 'main' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:676:1: (lv_option_0_0= 'main' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:677:3: lv_option_0_0= 'main'
                    {
                    lv_option_0_0=(Token)match(input,25,FOLLOW_25_in_ruleNodeFigure1392); 

                            newLeafNode(lv_option_0_0, grammarAccess.getNodeFigureAccess().getOptionMainKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeFigureRule());
                    	        }
                           		setWithLastConsumed(current, "option", lv_option_0_0, "main");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleNodeFigure1418); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeFigureAccess().getFigureKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleNodeFigure1430); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeFigureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:698:1: ( (lv_figure_3_0= ruleFigureShape ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:699:1: (lv_figure_3_0= ruleFigureShape )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:699:1: (lv_figure_3_0= ruleFigureShape )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:700:3: lv_figure_3_0= ruleFigureShape
            {
             
            	        newCompositeNode(grammarAccess.getNodeFigureAccess().getFigureFigureShapeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureShape_in_ruleNodeFigure1451);
            lv_figure_3_0=ruleFigureShape();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeFigureRule());
            	        }
                   		set(
                   			current, 
                   			"figure",
                    		lv_figure_3_0, 
                    		"FigureShape");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:716:2: (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:716:4: otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleNodeFigure1464); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeFigureAccess().getCommaKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleNodeFigure1476); 

                        	newLeafNode(otherlv_5, grammarAccess.getNodeFigureAccess().getStyleKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleNodeFigure1488); 

                        	newLeafNode(otherlv_6, grammarAccess.getNodeFigureAccess().getColonKeyword_4_2());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:728:1: ( (lv_style_7_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:729:1: (lv_style_7_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:729:1: (lv_style_7_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:730:3: lv_style_7_0= RULE_ID
                    {
                    lv_style_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeFigure1505); 

                    			newLeafNode(lv_style_7_0, grammarAccess.getNodeFigureAccess().getStyleIDTerminalRuleCall_4_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeFigureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_7_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleNodeFigure1524); 

                	newLeafNode(otherlv_8, grammarAccess.getNodeFigureAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:750:1: ( (lv_features_9_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:751:1: (lv_features_9_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:751:1: (lv_features_9_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:752:3: lv_features_9_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getNodeFigureAccess().getFeaturesFigureFeaturesParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleNodeFigure1545);
            lv_features_9_0=ruleFigureFeatures();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeFigureRule());
            	        }
                   		set(
                   			current, 
                   			"features",
                    		lv_features_9_0, 
                    		"FigureFeatures");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleNodeFigure1557); 

                	newLeafNode(otherlv_10, grammarAccess.getNodeFigureAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeFigure"


    // $ANTLR start "entryRuleNodeContainer"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:780:1: entryRuleNodeContainer returns [EObject current=null] : iv_ruleNodeContainer= ruleNodeContainer EOF ;
    public final EObject entryRuleNodeContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeContainer = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:781:2: (iv_ruleNodeContainer= ruleNodeContainer EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:782:2: iv_ruleNodeContainer= ruleNodeContainer EOF
            {
             newCompositeNode(grammarAccess.getNodeContainerRule()); 
            pushFollow(FOLLOW_ruleNodeContainer_in_entryRuleNodeContainer1593);
            iv_ruleNodeContainer=ruleNodeContainer();

            state._fsp--;

             current =iv_ruleNodeContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeContainer1603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeContainer"


    // $ANTLR start "ruleNodeContainer"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:789:1: ruleNodeContainer returns [EObject current=null] : ( ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' ) ;
    public final EObject ruleNodeContainer() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token lv_format_6_1=null;
        Token lv_format_6_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_figures_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:792:28: ( ( ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:793:1: ( ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:793:1: ( ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:793:2: ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}'
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:793:2: ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=28 && LA16_0<=29)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:794:1: ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:794:1: ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:795:1: (lv_type_0_1= 'stack' | lv_type_0_2= 'free' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:795:1: (lv_type_0_1= 'stack' | lv_type_0_2= 'free' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==28) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==29) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:796:3: lv_type_0_1= 'stack'
                            {
                            lv_type_0_1=(Token)match(input,28,FOLLOW_28_in_ruleNodeContainer1648); 

                                    newLeafNode(lv_type_0_1, grammarAccess.getNodeContainerAccess().getTypeStackKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeContainerRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:808:8: lv_type_0_2= 'free'
                            {
                            lv_type_0_2=(Token)match(input,29,FOLLOW_29_in_ruleNodeContainer1677); 

                                    newLeafNode(lv_type_0_2, grammarAccess.getNodeContainerAccess().getTypeFreeKeyword_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeContainerRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_0_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleNodeContainer1706); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeContainerAccess().getContainerKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:827:1: (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:827:3: otherlv_2= 'for' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleNodeContainer1719); 

                        	newLeafNode(otherlv_2, grammarAccess.getNodeContainerAccess().getForKeyword_2_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:831:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:832:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:832:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:833:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeContainerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNodeContainerAccess().getModelClassEClassCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleNodeContainer1742);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:846:4: (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:846:6: otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleNodeContainer1757); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeContainerAccess().getColonKeyword_3_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:850:1: ( (lv_value_5_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:851:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:851:1: (lv_value_5_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:852:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeContainer1774); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getNodeContainerAccess().getValueINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:868:2: ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:869:1: ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:869:1: ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:870:1: (lv_format_6_1= '%' | lv_format_6_2= 'px' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:870:1: (lv_format_6_1= '%' | lv_format_6_2= 'px' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==32) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==33) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:871:3: lv_format_6_1= '%'
                            {
                            lv_format_6_1=(Token)match(input,32,FOLLOW_32_in_ruleNodeContainer1799); 

                                    newLeafNode(lv_format_6_1, grammarAccess.getNodeContainerAccess().getFormatPercentSignKeyword_3_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeContainerRule());
                            	        }
                                   		setWithLastConsumed(current, "format", lv_format_6_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:883:8: lv_format_6_2= 'px'
                            {
                            lv_format_6_2=(Token)match(input,33,FOLLOW_33_in_ruleNodeContainer1828); 

                                    newLeafNode(lv_format_6_2, grammarAccess.getNodeContainerAccess().getFormatPxKeyword_3_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeContainerRule());
                            	        }
                                   		setWithLastConsumed(current, "format", lv_format_6_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleNodeContainer1858); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeContainerAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:902:1: ( (lv_figures_8_0= ruleNodeFigure ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:903:1: (lv_figures_8_0= ruleNodeFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:903:1: (lv_figures_8_0= ruleNodeFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:904:3: lv_figures_8_0= ruleNodeFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeContainerAccess().getFiguresNodeFigureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeFigure_in_ruleNodeContainer1879);
            	    lv_figures_8_0=ruleNodeFigure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"figures",
            	            		lv_figures_8_0, 
            	            		"NodeFigure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleNodeContainer1892); 

                	newLeafNode(otherlv_9, grammarAccess.getNodeContainerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeContainer"


    // $ANTLR start "entryRuleLink"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:932:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:933:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:934:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1928);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1938); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:941:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? ( ( (lv_attributes_12_0= ruleAttribute ) ) | ( (lv_linefeatures_13_0= ruleLineFeature ) ) | ( (lv_colorfeatures_14_0= ruleColorFeature ) ) | ( (lv_integerfeatures_15_0= ruleIntegerFeature ) ) )* (otherlv_16= 'origin' otherlv_17= '{' ( (lv_sourceStatic_18_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_19_0= ruleDynamicFigure ) )* otherlv_20= '}' )? (otherlv_21= 'destiny' otherlv_22= '{' ( (lv_targetStatic_23_0= ruleStaticFigure ) )? ( (lv_targetDynamic_24_0= ruleDynamicFigure ) )* otherlv_25= '}' )? ( (lv_placings_26_0= rulePlacingFigure ) )* otherlv_27= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_complex_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_manhattan_9_0=null;
        Token otherlv_10=null;
        Token lv_style_11_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_attributes_12_0 = null;

        EObject lv_linefeatures_13_0 = null;

        EObject lv_colorfeatures_14_0 = null;

        EObject lv_integerfeatures_15_0 = null;

        EObject lv_sourceStatic_18_0 = null;

        EObject lv_sourceDynamic_19_0 = null;

        EObject lv_targetStatic_23_0 = null;

        EObject lv_targetDynamic_24_0 = null;

        EObject lv_placings_26_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:944:28: ( (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? ( ( (lv_attributes_12_0= ruleAttribute ) ) | ( (lv_linefeatures_13_0= ruleLineFeature ) ) | ( (lv_colorfeatures_14_0= ruleColorFeature ) ) | ( (lv_integerfeatures_15_0= ruleIntegerFeature ) ) )* (otherlv_16= 'origin' otherlv_17= '{' ( (lv_sourceStatic_18_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_19_0= ruleDynamicFigure ) )* otherlv_20= '}' )? (otherlv_21= 'destiny' otherlv_22= '{' ( (lv_targetStatic_23_0= ruleStaticFigure ) )? ( (lv_targetDynamic_24_0= ruleDynamicFigure ) )* otherlv_25= '}' )? ( (lv_placings_26_0= rulePlacingFigure ) )* otherlv_27= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:945:1: (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? ( ( (lv_attributes_12_0= ruleAttribute ) ) | ( (lv_linefeatures_13_0= ruleLineFeature ) ) | ( (lv_colorfeatures_14_0= ruleColorFeature ) ) | ( (lv_integerfeatures_15_0= ruleIntegerFeature ) ) )* (otherlv_16= 'origin' otherlv_17= '{' ( (lv_sourceStatic_18_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_19_0= ruleDynamicFigure ) )* otherlv_20= '}' )? (otherlv_21= 'destiny' otherlv_22= '{' ( (lv_targetStatic_23_0= ruleStaticFigure ) )? ( (lv_targetDynamic_24_0= ruleDynamicFigure ) )* otherlv_25= '}' )? ( (lv_placings_26_0= rulePlacingFigure ) )* otherlv_27= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:945:1: (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? ( ( (lv_attributes_12_0= ruleAttribute ) ) | ( (lv_linefeatures_13_0= ruleLineFeature ) ) | ( (lv_colorfeatures_14_0= ruleColorFeature ) ) | ( (lv_integerfeatures_15_0= ruleIntegerFeature ) ) )* (otherlv_16= 'origin' otherlv_17= '{' ( (lv_sourceStatic_18_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_19_0= ruleDynamicFigure ) )* otherlv_20= '}' )? (otherlv_21= 'destiny' otherlv_22= '{' ( (lv_targetStatic_23_0= ruleStaticFigure ) )? ( (lv_targetDynamic_24_0= ruleDynamicFigure ) )* otherlv_25= '}' )? ( (lv_placings_26_0= rulePlacingFigure ) )* otherlv_27= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:945:3: otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? ( ( (lv_attributes_12_0= ruleAttribute ) ) | ( (lv_linefeatures_13_0= ruleLineFeature ) ) | ( (lv_colorfeatures_14_0= ruleColorFeature ) ) | ( (lv_integerfeatures_15_0= ruleIntegerFeature ) ) )* (otherlv_16= 'origin' otherlv_17= '{' ( (lv_sourceStatic_18_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_19_0= ruleDynamicFigure ) )* otherlv_20= '}' )? (otherlv_21= 'destiny' otherlv_22= '{' ( (lv_targetStatic_23_0= ruleStaticFigure ) )? ( (lv_targetDynamic_24_0= ruleDynamicFigure ) )* otherlv_25= '}' )? ( (lv_placings_26_0= rulePlacingFigure ) )* otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleLink1975); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:949:1: ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==35) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:949:2: ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:949:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:950:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:950:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:951:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink1999);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:965:6: ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:965:6: ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:965:7: ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:965:7: ( (lv_complex_2_0= 'object' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:966:1: (lv_complex_2_0= 'object' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:966:1: (lv_complex_2_0= 'object' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:967:3: lv_complex_2_0= 'object'
                    {
                    lv_complex_2_0=(Token)match(input,35,FOLLOW_35_in_ruleLink2024); 

                            newLeafNode(lv_complex_2_0, grammarAccess.getLinkAccess().getComplexObjectKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "complex", true, "object");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:980:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:981:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:981:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:982:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2060);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleLink2072); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getSourceKeyword_1_1_2());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:999:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1000:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1000:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1001:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_1_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2095);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleLink2107); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getTargetKeyword_1_1_4());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1018:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1019:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1019:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1020:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_1_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2130);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleLink2144); 

                	newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1037:1: ( (lv_manhattan_9_0= 'manhattan' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1038:1: (lv_manhattan_9_0= 'manhattan' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1038:1: (lv_manhattan_9_0= 'manhattan' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1039:3: lv_manhattan_9_0= 'manhattan'
                    {
                    lv_manhattan_9_0=(Token)match(input,38,FOLLOW_38_in_ruleLink2162); 

                            newLeafNode(lv_manhattan_9_0, grammarAccess.getLinkAccess().getManhattanManhattanKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "manhattan", true, "manhattan");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1052:3: (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1052:5: otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleLink2189); 

                        	newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getStyleKeyword_4_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1056:1: ( (lv_style_11_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1057:1: (lv_style_11_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1057:1: (lv_style_11_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1058:3: lv_style_11_0= RULE_ID
                    {
                    lv_style_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2206); 

                    			newLeafNode(lv_style_11_0, grammarAccess.getLinkAccess().getStyleIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_11_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1074:4: ( ( (lv_attributes_12_0= ruleAttribute ) ) | ( (lv_linefeatures_13_0= ruleLineFeature ) ) | ( (lv_colorfeatures_14_0= ruleColorFeature ) ) | ( (lv_integerfeatures_15_0= ruleIntegerFeature ) ) )*
            loop24:
            do {
                int alt24=5;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1074:5: ( (lv_attributes_12_0= ruleAttribute ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1074:5: ( (lv_attributes_12_0= ruleAttribute ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1075:1: (lv_attributes_12_0= ruleAttribute )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1075:1: (lv_attributes_12_0= ruleAttribute )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1076:3: lv_attributes_12_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getAttributesAttributeParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleLink2235);
            	    lv_attributes_12_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_12_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1093:6: ( (lv_linefeatures_13_0= ruleLineFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1093:6: ( (lv_linefeatures_13_0= ruleLineFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1094:1: (lv_linefeatures_13_0= ruleLineFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1094:1: (lv_linefeatures_13_0= ruleLineFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1095:3: lv_linefeatures_13_0= ruleLineFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getLinefeaturesLineFeatureParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLineFeature_in_ruleLink2262);
            	    lv_linefeatures_13_0=ruleLineFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"linefeatures",
            	            		lv_linefeatures_13_0, 
            	            		"LineFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1112:6: ( (lv_colorfeatures_14_0= ruleColorFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1112:6: ( (lv_colorfeatures_14_0= ruleColorFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1113:1: (lv_colorfeatures_14_0= ruleColorFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1113:1: (lv_colorfeatures_14_0= ruleColorFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1114:3: lv_colorfeatures_14_0= ruleColorFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getColorfeaturesColorFeatureParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorFeature_in_ruleLink2289);
            	    lv_colorfeatures_14_0=ruleColorFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colorfeatures",
            	            		lv_colorfeatures_14_0, 
            	            		"ColorFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1131:6: ( (lv_integerfeatures_15_0= ruleIntegerFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1131:6: ( (lv_integerfeatures_15_0= ruleIntegerFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1132:1: (lv_integerfeatures_15_0= ruleIntegerFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1132:1: (lv_integerfeatures_15_0= ruleIntegerFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1133:3: lv_integerfeatures_15_0= ruleIntegerFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getIntegerfeaturesIntegerFeatureParserRuleCall_5_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntegerFeature_in_ruleLink2316);
            	    lv_integerfeatures_15_0=ruleIntegerFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"integerfeatures",
            	            		lv_integerfeatures_15_0, 
            	            		"IntegerFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1149:4: (otherlv_16= 'origin' otherlv_17= '{' ( (lv_sourceStatic_18_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_19_0= ruleDynamicFigure ) )* otherlv_20= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1149:6: otherlv_16= 'origin' otherlv_17= '{' ( (lv_sourceStatic_18_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_19_0= ruleDynamicFigure ) )* otherlv_20= '}'
                    {
                    otherlv_16=(Token)match(input,39,FOLLOW_39_in_ruleLink2331); 

                        	newLeafNode(otherlv_16, grammarAccess.getLinkAccess().getOriginKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleLink2343); 

                        	newLeafNode(otherlv_17, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1157:1: ( (lv_sourceStatic_18_0= ruleStaticFigure ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==26) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1158:1: (lv_sourceStatic_18_0= ruleStaticFigure )
                            {
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1158:1: (lv_sourceStatic_18_0= ruleStaticFigure )
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1159:3: lv_sourceStatic_18_0= ruleStaticFigure
                            {
                             
                            	        newCompositeNode(grammarAccess.getLinkAccess().getSourceStaticStaticFigureParserRuleCall_6_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStaticFigure_in_ruleLink2364);
                            lv_sourceStatic_18_0=ruleStaticFigure();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLinkRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"sourceStatic",
                                    		lv_sourceStatic_18_0, 
                                    		"StaticFigure");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1175:3: ( (lv_sourceDynamic_19_0= ruleDynamicFigure ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==43) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1176:1: (lv_sourceDynamic_19_0= ruleDynamicFigure )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1176:1: (lv_sourceDynamic_19_0= ruleDynamicFigure )
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1177:3: lv_sourceDynamic_19_0= ruleDynamicFigure
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkAccess().getSourceDynamicDynamicFigureParserRuleCall_6_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDynamicFigure_in_ruleLink2386);
                    	    lv_sourceDynamic_19_0=ruleDynamicFigure();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sourceDynamic",
                    	            		lv_sourceDynamic_19_0, 
                    	            		"DynamicFigure");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleLink2399); 

                        	newLeafNode(otherlv_20, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1197:3: (otherlv_21= 'destiny' otherlv_22= '{' ( (lv_targetStatic_23_0= ruleStaticFigure ) )? ( (lv_targetDynamic_24_0= ruleDynamicFigure ) )* otherlv_25= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1197:5: otherlv_21= 'destiny' otherlv_22= '{' ( (lv_targetStatic_23_0= ruleStaticFigure ) )? ( (lv_targetDynamic_24_0= ruleDynamicFigure ) )* otherlv_25= '}'
                    {
                    otherlv_21=(Token)match(input,40,FOLLOW_40_in_ruleLink2414); 

                        	newLeafNode(otherlv_21, grammarAccess.getLinkAccess().getDestinyKeyword_7_0());
                        
                    otherlv_22=(Token)match(input,13,FOLLOW_13_in_ruleLink2426); 

                        	newLeafNode(otherlv_22, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1205:1: ( (lv_targetStatic_23_0= ruleStaticFigure ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==26) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1206:1: (lv_targetStatic_23_0= ruleStaticFigure )
                            {
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1206:1: (lv_targetStatic_23_0= ruleStaticFigure )
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1207:3: lv_targetStatic_23_0= ruleStaticFigure
                            {
                             
                            	        newCompositeNode(grammarAccess.getLinkAccess().getTargetStaticStaticFigureParserRuleCall_7_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStaticFigure_in_ruleLink2447);
                            lv_targetStatic_23_0=ruleStaticFigure();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLinkRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"targetStatic",
                                    		lv_targetStatic_23_0, 
                                    		"StaticFigure");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1223:3: ( (lv_targetDynamic_24_0= ruleDynamicFigure ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==43) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1224:1: (lv_targetDynamic_24_0= ruleDynamicFigure )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1224:1: (lv_targetDynamic_24_0= ruleDynamicFigure )
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1225:3: lv_targetDynamic_24_0= ruleDynamicFigure
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkAccess().getTargetDynamicDynamicFigureParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDynamicFigure_in_ruleLink2469);
                    	    lv_targetDynamic_24_0=ruleDynamicFigure();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"targetDynamic",
                    	            		lv_targetDynamic_24_0, 
                    	            		"DynamicFigure");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleLink2482); 

                        	newLeafNode(otherlv_25, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1245:3: ( (lv_placings_26_0= rulePlacingFigure ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==41) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1246:1: (lv_placings_26_0= rulePlacingFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1246:1: (lv_placings_26_0= rulePlacingFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1247:3: lv_placings_26_0= rulePlacingFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getPlacingsPlacingFigureParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlacingFigure_in_ruleLink2505);
            	    lv_placings_26_0=rulePlacingFigure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"placings",
            	            		lv_placings_26_0, 
            	            		"PlacingFigure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_27=(Token)match(input,14,FOLLOW_14_in_ruleLink2518); 

                	newLeafNode(otherlv_27, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRulePlacingFigure"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1275:1: entryRulePlacingFigure returns [EObject current=null] : iv_rulePlacingFigure= rulePlacingFigure EOF ;
    public final EObject entryRulePlacingFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacingFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1276:2: (iv_rulePlacingFigure= rulePlacingFigure EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1277:2: iv_rulePlacingFigure= rulePlacingFigure EOF
            {
             newCompositeNode(grammarAccess.getPlacingFigureRule()); 
            pushFollow(FOLLOW_rulePlacingFigure_in_entryRulePlacingFigure2554);
            iv_rulePlacingFigure=rulePlacingFigure();

            state._fsp--;

             current =iv_rulePlacingFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlacingFigure2564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlacingFigure"


    // $ANTLR start "rulePlacingFigure"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1284:1: rulePlacingFigure returns [EObject current=null] : (otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}' ) ;
    public final EObject rulePlacingFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_pos_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_placingStatic_5_0 = null;

        EObject lv_placingDynamic_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1287:28: ( (otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1288:1: (otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1288:1: (otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1288:3: otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_rulePlacingFigure2601); 

                	newLeafNode(otherlv_0, grammarAccess.getPlacingFigureAccess().getPlacingKeyword_0());
                
            otherlv_1=(Token)match(input,42,FOLLOW_42_in_rulePlacingFigure2613); 

                	newLeafNode(otherlv_1, grammarAccess.getPlacingFigureAccess().getAtKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1296:1: ( (lv_pos_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1297:1: (lv_pos_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1297:1: (lv_pos_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1298:3: lv_pos_2_0= RULE_INT
            {
            lv_pos_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePlacingFigure2630); 

            			newLeafNode(lv_pos_2_0, grammarAccess.getPlacingFigureAccess().getPosINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlacingFigureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pos",
                    		lv_pos_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_rulePlacingFigure2647); 

                	newLeafNode(otherlv_3, grammarAccess.getPlacingFigureAccess().getPercentSignKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePlacingFigure2659); 

                	newLeafNode(otherlv_4, grammarAccess.getPlacingFigureAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1322:1: ( (lv_placingStatic_5_0= ruleStaticFigure ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1323:1: (lv_placingStatic_5_0= ruleStaticFigure )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1323:1: (lv_placingStatic_5_0= ruleStaticFigure )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1324:3: lv_placingStatic_5_0= ruleStaticFigure
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlacingFigureAccess().getPlacingStaticStaticFigureParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStaticFigure_in_rulePlacingFigure2680);
                    lv_placingStatic_5_0=ruleStaticFigure();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlacingFigureRule());
                    	        }
                           		set(
                           			current, 
                           			"placingStatic",
                            		lv_placingStatic_5_0, 
                            		"StaticFigure");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1340:3: ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1341:1: (lv_placingDynamic_6_0= ruleDynamicFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1341:1: (lv_placingDynamic_6_0= ruleDynamicFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1342:3: lv_placingDynamic_6_0= ruleDynamicFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlacingFigureAccess().getPlacingDynamicDynamicFigureParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDynamicFigure_in_rulePlacingFigure2702);
            	    lv_placingDynamic_6_0=ruleDynamicFigure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlacingFigureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"placingDynamic",
            	            		lv_placingDynamic_6_0, 
            	            		"DynamicFigure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_rulePlacingFigure2715); 

                	newLeafNode(otherlv_7, grammarAccess.getPlacingFigureAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlacingFigure"


    // $ANTLR start "entryRuleDynamicFigure"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1370:1: entryRuleDynamicFigure returns [EObject current=null] : iv_ruleDynamicFigure= ruleDynamicFigure EOF ;
    public final EObject entryRuleDynamicFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1371:2: (iv_ruleDynamicFigure= ruleDynamicFigure EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1372:2: iv_ruleDynamicFigure= ruleDynamicFigure EOF
            {
             newCompositeNode(grammarAccess.getDynamicFigureRule()); 
            pushFollow(FOLLOW_ruleDynamicFigure_in_entryRuleDynamicFigure2751);
            iv_ruleDynamicFigure=ruleDynamicFigure();

            state._fsp--;

             current =iv_ruleDynamicFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicFigure2761); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamicFigure"


    // $ANTLR start "ruleDynamicFigure"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1379:1: ruleDynamicFigure returns [EObject current=null] : (otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}' ) ;
    public final EObject ruleDynamicFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_figure_1_0 = null;

        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1382:28: ( (otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1383:1: (otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1383:1: (otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1383:3: otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleDynamicFigure2798); 

                	newLeafNode(otherlv_0, grammarAccess.getDynamicFigureAccess().getTextKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1387:1: ( (lv_figure_1_0= ruleDynamicElement ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1388:1: (lv_figure_1_0= ruleDynamicElement )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1388:1: (lv_figure_1_0= ruleDynamicElement )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1389:3: lv_figure_1_0= ruleDynamicElement
            {
             
            	        newCompositeNode(grammarAccess.getDynamicFigureAccess().getFigureDynamicElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDynamicElement_in_ruleDynamicFigure2819);
            lv_figure_1_0=ruleDynamicElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDynamicFigureRule());
            	        }
                   		set(
                   			current, 
                   			"figure",
                    		lv_figure_1_0, 
                    		"DynamicElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDynamicFigure2831); 

                	newLeafNode(otherlv_2, grammarAccess.getDynamicFigureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1409:1: ( (lv_features_3_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1410:1: (lv_features_3_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1410:1: (lv_features_3_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1411:3: lv_features_3_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getDynamicFigureAccess().getFeaturesFigureFeaturesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleDynamicFigure2852);
            lv_features_3_0=ruleFigureFeatures();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDynamicFigureRule());
            	        }
                   		set(
                   			current, 
                   			"features",
                    		lv_features_3_0, 
                    		"FigureFeatures");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDynamicFigure2864); 

                	newLeafNode(otherlv_4, grammarAccess.getDynamicFigureAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamicFigure"


    // $ANTLR start "entryRuleDynamicElement"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1439:1: entryRuleDynamicElement returns [String current=null] : iv_ruleDynamicElement= ruleDynamicElement EOF ;
    public final String entryRuleDynamicElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicElement = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1440:2: (iv_ruleDynamicElement= ruleDynamicElement EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1441:2: iv_ruleDynamicElement= ruleDynamicElement EOF
            {
             newCompositeNode(grammarAccess.getDynamicElementRule()); 
            pushFollow(FOLLOW_ruleDynamicElement_in_entryRuleDynamicElement2901);
            iv_ruleDynamicElement=ruleDynamicElement();

            state._fsp--;

             current =iv_ruleDynamicElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicElement2912); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamicElement"


    // $ANTLR start "ruleDynamicElement"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1448:1: ruleDynamicElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Label' | kw= 'Description' ) ;
    public final AntlrDatatypeRuleToken ruleDynamicElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1451:28: ( (kw= 'Label' | kw= 'Description' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1452:1: (kw= 'Label' | kw= 'Description' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1452:1: (kw= 'Label' | kw= 'Description' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            else if ( (LA34_0==45) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1453:2: kw= 'Label'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleDynamicElement2950); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDynamicElementAccess().getLabelKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1460:2: kw= 'Description'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleDynamicElement2969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDynamicElementAccess().getDescriptionKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamicElement"


    // $ANTLR start "entryRuleStaticFigure"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1473:1: entryRuleStaticFigure returns [EObject current=null] : iv_ruleStaticFigure= ruleStaticFigure EOF ;
    public final EObject entryRuleStaticFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1474:2: (iv_ruleStaticFigure= ruleStaticFigure EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1475:2: iv_ruleStaticFigure= ruleStaticFigure EOF
            {
             newCompositeNode(grammarAccess.getStaticFigureRule()); 
            pushFollow(FOLLOW_ruleStaticFigure_in_entryRuleStaticFigure3009);
            iv_ruleStaticFigure=ruleStaticFigure();

            state._fsp--;

             current =iv_ruleStaticFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticFigure3019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticFigure"


    // $ANTLR start "ruleStaticFigure"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1482:1: ruleStaticFigure returns [EObject current=null] : (otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}' ) ;
    public final EObject ruleStaticFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_style_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_figure_2_0 = null;

        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1485:28: ( (otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1486:1: (otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1486:1: (otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1486:3: otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleStaticFigure3056); 

                	newLeafNode(otherlv_0, grammarAccess.getStaticFigureAccess().getFigureKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStaticFigure3068); 

                	newLeafNode(otherlv_1, grammarAccess.getStaticFigureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1494:1: ( (lv_figure_2_0= ruleStaticElement ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1495:1: (lv_figure_2_0= ruleStaticElement )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1495:1: (lv_figure_2_0= ruleStaticElement )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1496:3: lv_figure_2_0= ruleStaticElement
            {
             
            	        newCompositeNode(grammarAccess.getStaticFigureAccess().getFigureStaticElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStaticElement_in_ruleStaticFigure3089);
            lv_figure_2_0=ruleStaticElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStaticFigureRule());
            	        }
                   		set(
                   			current, 
                   			"figure",
                    		lv_figure_2_0, 
                    		"StaticElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1512:2: (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1512:4: otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleStaticFigure3102); 

                        	newLeafNode(otherlv_3, grammarAccess.getStaticFigureAccess().getCommaKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStaticFigure3114); 

                        	newLeafNode(otherlv_4, grammarAccess.getStaticFigureAccess().getStyleKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleStaticFigure3126); 

                        	newLeafNode(otherlv_5, grammarAccess.getStaticFigureAccess().getColonKeyword_3_2());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1524:1: ( (lv_style_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1525:1: (lv_style_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1525:1: (lv_style_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1526:3: lv_style_6_0= RULE_ID
                    {
                    lv_style_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStaticFigure3143); 

                    			newLeafNode(lv_style_6_0, grammarAccess.getStaticFigureAccess().getStyleIDTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStaticFigureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleStaticFigure3162); 

                	newLeafNode(otherlv_7, grammarAccess.getStaticFigureAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1546:1: ( (lv_features_8_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1547:1: (lv_features_8_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1547:1: (lv_features_8_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1548:3: lv_features_8_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getStaticFigureAccess().getFeaturesFigureFeaturesParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleStaticFigure3183);
            lv_features_8_0=ruleFigureFeatures();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStaticFigureRule());
            	        }
                   		set(
                   			current, 
                   			"features",
                    		lv_features_8_0, 
                    		"FigureFeatures");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleStaticFigure3195); 

                	newLeafNode(otherlv_9, grammarAccess.getStaticFigureAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticFigure"


    // $ANTLR start "entryRuleStaticElement"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1576:1: entryRuleStaticElement returns [String current=null] : iv_ruleStaticElement= ruleStaticElement EOF ;
    public final String entryRuleStaticElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticElement = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1577:2: (iv_ruleStaticElement= ruleStaticElement EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1578:2: iv_ruleStaticElement= ruleStaticElement EOF
            {
             newCompositeNode(grammarAccess.getStaticElementRule()); 
            pushFollow(FOLLOW_ruleStaticElement_in_entryRuleStaticElement3232);
            iv_ruleStaticElement=ruleStaticElement();

            state._fsp--;

             current =iv_ruleStaticElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticElement3243); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticElement"


    // $ANTLR start "ruleStaticElement"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1585:1: ruleStaticElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Arrow' | kw= 'Triangle' | kw= 'Rhombus' | kw= 'Polygon' | kw= 'Polyline' ) ;
    public final AntlrDatatypeRuleToken ruleStaticElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1588:28: ( (kw= 'Arrow' | kw= 'Triangle' | kw= 'Rhombus' | kw= 'Polygon' | kw= 'Polyline' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1589:1: (kw= 'Arrow' | kw= 'Triangle' | kw= 'Rhombus' | kw= 'Polygon' | kw= 'Polyline' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1589:1: (kw= 'Arrow' | kw= 'Triangle' | kw= 'Rhombus' | kw= 'Polygon' | kw= 'Polyline' )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt36=1;
                }
                break;
            case 47:
                {
                alt36=2;
                }
                break;
            case 48:
                {
                alt36=3;
                }
                break;
            case 49:
                {
                alt36=4;
                }
                break;
            case 50:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1590:2: kw= 'Arrow'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleStaticElement3281); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getArrowKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1597:2: kw= 'Triangle'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleStaticElement3300); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getTriangleKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1604:2: kw= 'Rhombus'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleStaticElement3319); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getRhombusKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1611:2: kw= 'Polygon'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleStaticElement3338); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getPolygonKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1618:2: kw= 'Polyline'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleStaticElement3357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getPolylineKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticElement"


    // $ANTLR start "entryRuleNodeAnchor"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1631:1: entryRuleNodeAnchor returns [EObject current=null] : iv_ruleNodeAnchor= ruleNodeAnchor EOF ;
    public final EObject entryRuleNodeAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAnchor = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1632:2: (iv_ruleNodeAnchor= ruleNodeAnchor EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1633:2: iv_ruleNodeAnchor= ruleNodeAnchor EOF
            {
             newCompositeNode(grammarAccess.getNodeAnchorRule()); 
            pushFollow(FOLLOW_ruleNodeAnchor_in_entryRuleNodeAnchor3397);
            iv_ruleNodeAnchor=ruleNodeAnchor();

            state._fsp--;

             current =iv_ruleNodeAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAnchor3407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeAnchor"


    // $ANTLR start "ruleNodeAnchor"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1640:1: ruleNodeAnchor returns [EObject current=null] : (otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}' ) ;
    public final EObject ruleNodeAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_object_2_0=null;
        Token otherlv_3=null;
        Token lv_passX_4_0=null;
        Token lv_X_5_0=null;
        Token lv_formatX_6_1=null;
        Token lv_formatX_6_2=null;
        Token lv_formatX_6_3=null;
        Token otherlv_7=null;
        Token lv_passY_8_0=null;
        Token lv_Y_9_0=null;
        Token lv_formatY_10_1=null;
        Token lv_formatY_10_2=null;
        Token lv_formatY_10_3=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_figures_12_0 = null;

        EObject lv_arrows_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1643:28: ( (otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1644:1: (otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1644:1: (otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1644:3: otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleNodeAnchor3444); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAnchorAccess().getAnchorKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1648:1: (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1648:3: otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleNodeAnchor3457); 

                        	newLeafNode(otherlv_1, grammarAccess.getNodeAnchorAccess().getToKeyword_1_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1652:1: ( (lv_object_2_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1653:1: (lv_object_2_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1653:1: (lv_object_2_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1654:3: lv_object_2_0= RULE_ID
                    {
                    lv_object_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeAnchor3474); 

                    			newLeafNode(lv_object_2_0, grammarAccess.getNodeAnchorAccess().getObjectIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"object",
                            		lv_object_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleNodeAnchor3493); 

                	newLeafNode(otherlv_3, grammarAccess.getNodeAnchorAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1674:1: ( (lv_passX_4_0= '-' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1675:1: (lv_passX_4_0= '-' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1675:1: (lv_passX_4_0= '-' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1676:3: lv_passX_4_0= '-'
                    {
                    lv_passX_4_0=(Token)match(input,53,FOLLOW_53_in_ruleNodeAnchor3511); 

                            newLeafNode(lv_passX_4_0, grammarAccess.getNodeAnchorAccess().getPassXHyphenMinusKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "passX", lv_passX_4_0, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1689:3: ( (lv_X_5_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1690:1: (lv_X_5_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1690:1: (lv_X_5_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1691:3: lv_X_5_0= RULE_INT
            {
            lv_X_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeAnchor3542); 

            			newLeafNode(lv_X_5_0, grammarAccess.getNodeAnchorAccess().getXINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeAnchorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"X",
                    		lv_X_5_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1707:2: ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1708:1: ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1708:1: ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1709:1: (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1709:1: (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt39=1;
                }
                break;
            case 54:
                {
                alt39=2;
                }
                break;
            case 55:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1710:3: lv_formatX_6_1= '%'
                    {
                    lv_formatX_6_1=(Token)match(input,32,FOLLOW_32_in_ruleNodeAnchor3567); 

                            newLeafNode(lv_formatX_6_1, grammarAccess.getNodeAnchorAccess().getFormatXPercentSignKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatX", lv_formatX_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1722:8: lv_formatX_6_2= 'lf'
                    {
                    lv_formatX_6_2=(Token)match(input,54,FOLLOW_54_in_ruleNodeAnchor3596); 

                            newLeafNode(lv_formatX_6_2, grammarAccess.getNodeAnchorAccess().getFormatXLfKeyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatX", lv_formatX_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1734:8: lv_formatX_6_3= 'rg'
                    {
                    lv_formatX_6_3=(Token)match(input,55,FOLLOW_55_in_ruleNodeAnchor3625); 

                            newLeafNode(lv_formatX_6_3, grammarAccess.getNodeAnchorAccess().getFormatXRgKeyword_5_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatX", lv_formatX_6_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleNodeAnchor3653); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeAnchorAccess().getCommaKeyword_6());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1753:1: ( (lv_passY_8_0= '-' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1754:1: (lv_passY_8_0= '-' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1754:1: (lv_passY_8_0= '-' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1755:3: lv_passY_8_0= '-'
                    {
                    lv_passY_8_0=(Token)match(input,53,FOLLOW_53_in_ruleNodeAnchor3671); 

                            newLeafNode(lv_passY_8_0, grammarAccess.getNodeAnchorAccess().getPassYHyphenMinusKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "passY", lv_passY_8_0, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1768:3: ( (lv_Y_9_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1769:1: (lv_Y_9_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1769:1: (lv_Y_9_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1770:3: lv_Y_9_0= RULE_INT
            {
            lv_Y_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeAnchor3702); 

            			newLeafNode(lv_Y_9_0, grammarAccess.getNodeAnchorAccess().getYINTTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeAnchorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Y",
                    		lv_Y_9_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1786:2: ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1787:1: ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1787:1: ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1788:1: (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1788:1: (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt41=1;
                }
                break;
            case 56:
                {
                alt41=2;
                }
                break;
            case 57:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1789:3: lv_formatY_10_1= '%'
                    {
                    lv_formatY_10_1=(Token)match(input,32,FOLLOW_32_in_ruleNodeAnchor3727); 

                            newLeafNode(lv_formatY_10_1, grammarAccess.getNodeAnchorAccess().getFormatYPercentSignKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatY", lv_formatY_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1801:8: lv_formatY_10_2= 'up'
                    {
                    lv_formatY_10_2=(Token)match(input,56,FOLLOW_56_in_ruleNodeAnchor3756); 

                            newLeafNode(lv_formatY_10_2, grammarAccess.getNodeAnchorAccess().getFormatYUpKeyword_9_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatY", lv_formatY_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1813:8: lv_formatY_10_3= 'dw'
                    {
                    lv_formatY_10_3=(Token)match(input,57,FOLLOW_57_in_ruleNodeAnchor3785); 

                            newLeafNode(lv_formatY_10_3, grammarAccess.getNodeAnchorAccess().getFormatYDwKeyword_9_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatY", lv_formatY_10_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleNodeAnchor3813); 

                	newLeafNode(otherlv_11, grammarAccess.getNodeAnchorAccess().getLeftCurlyBracketKeyword_10());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1832:1: ( (lv_figures_12_0= ruleNodeFigure ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=25 && LA42_0<=26)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1833:1: (lv_figures_12_0= ruleNodeFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1833:1: (lv_figures_12_0= ruleNodeFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1834:3: lv_figures_12_0= ruleNodeFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAnchorAccess().getFiguresNodeFigureParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeFigure_in_ruleNodeAnchor3834);
            	    lv_figures_12_0=ruleNodeFigure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeAnchorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"figures",
            	            		lv_figures_12_0, 
            	            		"NodeFigure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1850:3: ( (lv_arrows_13_0= ruleArrowAnchor ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==23) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1851:1: (lv_arrows_13_0= ruleArrowAnchor )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1851:1: (lv_arrows_13_0= ruleArrowAnchor )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1852:3: lv_arrows_13_0= ruleArrowAnchor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAnchorAccess().getArrowsArrowAnchorParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArrowAnchor_in_ruleNodeAnchor3856);
            	    lv_arrows_13_0=ruleArrowAnchor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeAnchorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arrows",
            	            		lv_arrows_13_0, 
            	            		"ArrowAnchor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleNodeAnchor3869); 

                	newLeafNode(otherlv_14, grammarAccess.getNodeAnchorAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeAnchor"


    // $ANTLR start "entryRuleArrowAnchor"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1880:1: entryRuleArrowAnchor returns [EObject current=null] : iv_ruleArrowAnchor= ruleArrowAnchor EOF ;
    public final EObject entryRuleArrowAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowAnchor = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1881:2: (iv_ruleArrowAnchor= ruleArrowAnchor EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1882:2: iv_ruleArrowAnchor= ruleArrowAnchor EOF
            {
             newCompositeNode(grammarAccess.getArrowAnchorRule()); 
            pushFollow(FOLLOW_ruleArrowAnchor_in_entryRuleArrowAnchor3905);
            iv_ruleArrowAnchor=ruleArrowAnchor();

            state._fsp--;

             current =iv_ruleArrowAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowAnchor3915); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrowAnchor"


    // $ANTLR start "ruleArrowAnchor"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1889:1: ruleArrowAnchor returns [EObject current=null] : (otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )? ) ;
    public final EObject ruleArrowAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_N_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1892:28: ( (otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1893:1: (otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1893:1: (otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1893:3: otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleArrowAnchor3952); 

                	newLeafNode(otherlv_0, grammarAccess.getArrowAnchorAccess().getSetKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1897:1: ( (lv_reference_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1898:1: (lv_reference_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1898:1: (lv_reference_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1899:3: lv_reference_1_0= RULE_ID
            {
            lv_reference_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArrowAnchor3969); 

            			newLeafNode(lv_reference_1_0, grammarAccess.getArrowAnchorAccess().getReferenceIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArrowAnchorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"reference",
                    		lv_reference_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleArrowAnchor3986); 

                	newLeafNode(otherlv_2, grammarAccess.getArrowAnchorAccess().getAsKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1919:1: ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1920:1: ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1920:1: ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1921:1: (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1921:1: (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt44=1;
                }
                break;
            case 60:
                {
                alt44=2;
                }
                break;
            case 61:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1922:3: lv_type_3_1= 'incoming'
                    {
                    lv_type_3_1=(Token)match(input,59,FOLLOW_59_in_ruleArrowAnchor4006); 

                            newLeafNode(lv_type_3_1, grammarAccess.getArrowAnchorAccess().getTypeIncomingKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1934:8: lv_type_3_2= 'outgoing'
                    {
                    lv_type_3_2=(Token)match(input,60,FOLLOW_60_in_ruleArrowAnchor4035); 

                            newLeafNode(lv_type_3_2, grammarAccess.getArrowAnchorAccess().getTypeOutgoingKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1946:8: lv_type_3_3= 'both'
                    {
                    lv_type_3_3=(Token)match(input,61,FOLLOW_61_in_ruleArrowAnchor4064); 

                            newLeafNode(lv_type_3_3, grammarAccess.getArrowAnchorAccess().getTypeBothKeyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleArrowAnchor4092); 

                	newLeafNode(otherlv_4, grammarAccess.getArrowAnchorAccess().getConnectionKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1965:1: (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==63) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1965:3: otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections'
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_63_in_ruleArrowAnchor4105); 

                        	newLeafNode(otherlv_5, grammarAccess.getArrowAnchorAccess().getUsingKeyword_5_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1969:1: ( (lv_N_6_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1970:1: (lv_N_6_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1970:1: (lv_N_6_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1971:3: lv_N_6_0= RULE_INT
                    {
                    lv_N_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArrowAnchor4122); 

                    			newLeafNode(lv_N_6_0, grammarAccess.getArrowAnchorAccess().getNINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowAnchorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"N",
                            		lv_N_6_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,64,FOLLOW_64_in_ruleArrowAnchor4139); 

                        	newLeafNode(otherlv_7, grammarAccess.getArrowAnchorAccess().getConnectionsKeyword_5_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrowAnchor"


    // $ANTLR start "entryRuleFigureFeatures"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1999:1: entryRuleFigureFeatures returns [EObject current=null] : iv_ruleFigureFeatures= ruleFigureFeatures EOF ;
    public final EObject entryRuleFigureFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFigureFeatures = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2000:2: (iv_ruleFigureFeatures= ruleFigureFeatures EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2001:2: iv_ruleFigureFeatures= ruleFigureFeatures EOF
            {
             newCompositeNode(grammarAccess.getFigureFeaturesRule()); 
            pushFollow(FOLLOW_ruleFigureFeatures_in_entryRuleFigureFeatures4177);
            iv_ruleFigureFeatures=ruleFigureFeatures();

            state._fsp--;

             current =iv_ruleFigureFeatures; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFigureFeatures4187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFigureFeatures"


    // $ANTLR start "ruleFigureFeatures"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2008:1: ruleFigureFeatures returns [EObject current=null] : ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) | ( (lv_customfeatures_12_0= ruleCustomFeature ) ) )* ) ;
    public final EObject ruleFigureFeatures() throws RecognitionException {
        EObject current = null;

        EObject lv_linefeatures_1_0 = null;

        EObject lv_centerfeatures_2_0 = null;

        EObject lv_alignfeatures_3_0 = null;

        EObject lv_gradientfeatures_4_0 = null;

        EObject lv_pointfeatures_5_0 = null;

        EObject lv_sizefeatures_6_0 = null;

        EObject lv_positionfeatures_7_0 = null;

        EObject lv_colorfeatures_8_0 = null;

        EObject lv_integerfeatures_9_0 = null;

        EObject lv_booleanfeatures_10_0 = null;

        EObject lv_stringfeatures_11_0 = null;

        EObject lv_customfeatures_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2011:28: ( ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) | ( (lv_customfeatures_12_0= ruleCustomFeature ) ) )* ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2012:1: ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) | ( (lv_customfeatures_12_0= ruleCustomFeature ) ) )* )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2012:1: ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) | ( (lv_customfeatures_12_0= ruleCustomFeature ) ) )* )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2012:2: () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) | ( (lv_customfeatures_12_0= ruleCustomFeature ) ) )*
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2012:2: ()
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2013:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFigureFeaturesAccess().getFigureFeaturesAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2018:2: ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) | ( (lv_customfeatures_12_0= ruleCustomFeature ) ) )*
            loop46:
            do {
                int alt46=13;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2018:3: ( (lv_linefeatures_1_0= ruleLineFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2018:3: ( (lv_linefeatures_1_0= ruleLineFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2019:1: (lv_linefeatures_1_0= ruleLineFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2019:1: (lv_linefeatures_1_0= ruleLineFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2020:3: lv_linefeatures_1_0= ruleLineFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getLinefeaturesLineFeatureParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLineFeature_in_ruleFigureFeatures4243);
            	    lv_linefeatures_1_0=ruleLineFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"linefeatures",
            	            		lv_linefeatures_1_0, 
            	            		"LineFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2037:6: ( (lv_centerfeatures_2_0= ruleCenterFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2037:6: ( (lv_centerfeatures_2_0= ruleCenterFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2038:1: (lv_centerfeatures_2_0= ruleCenterFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2038:1: (lv_centerfeatures_2_0= ruleCenterFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2039:3: lv_centerfeatures_2_0= ruleCenterFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getCenterfeaturesCenterFeatureParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCenterFeature_in_ruleFigureFeatures4270);
            	    lv_centerfeatures_2_0=ruleCenterFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"centerfeatures",
            	            		lv_centerfeatures_2_0, 
            	            		"CenterFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2056:6: ( (lv_alignfeatures_3_0= ruleAlignFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2056:6: ( (lv_alignfeatures_3_0= ruleAlignFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2057:1: (lv_alignfeatures_3_0= ruleAlignFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2057:1: (lv_alignfeatures_3_0= ruleAlignFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2058:3: lv_alignfeatures_3_0= ruleAlignFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getAlignfeaturesAlignFeatureParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAlignFeature_in_ruleFigureFeatures4297);
            	    lv_alignfeatures_3_0=ruleAlignFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alignfeatures",
            	            		lv_alignfeatures_3_0, 
            	            		"AlignFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2075:6: ( (lv_gradientfeatures_4_0= ruleGradientFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2075:6: ( (lv_gradientfeatures_4_0= ruleGradientFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2076:1: (lv_gradientfeatures_4_0= ruleGradientFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2076:1: (lv_gradientfeatures_4_0= ruleGradientFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2077:3: lv_gradientfeatures_4_0= ruleGradientFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getGradientfeaturesGradientFeatureParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGradientFeature_in_ruleFigureFeatures4324);
            	    lv_gradientfeatures_4_0=ruleGradientFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"gradientfeatures",
            	            		lv_gradientfeatures_4_0, 
            	            		"GradientFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2094:6: ( (lv_pointfeatures_5_0= rulePointFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2094:6: ( (lv_pointfeatures_5_0= rulePointFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2095:1: (lv_pointfeatures_5_0= rulePointFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2095:1: (lv_pointfeatures_5_0= rulePointFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2096:3: lv_pointfeatures_5_0= rulePointFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getPointfeaturesPointFeatureParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePointFeature_in_ruleFigureFeatures4351);
            	    lv_pointfeatures_5_0=rulePointFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pointfeatures",
            	            		lv_pointfeatures_5_0, 
            	            		"PointFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2113:6: ( (lv_sizefeatures_6_0= ruleSizeFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2113:6: ( (lv_sizefeatures_6_0= ruleSizeFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2114:1: (lv_sizefeatures_6_0= ruleSizeFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2114:1: (lv_sizefeatures_6_0= ruleSizeFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2115:3: lv_sizefeatures_6_0= ruleSizeFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getSizefeaturesSizeFeatureParserRuleCall_1_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSizeFeature_in_ruleFigureFeatures4378);
            	    lv_sizefeatures_6_0=ruleSizeFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sizefeatures",
            	            		lv_sizefeatures_6_0, 
            	            		"SizeFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2132:6: ( (lv_positionfeatures_7_0= rulePositionFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2132:6: ( (lv_positionfeatures_7_0= rulePositionFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2133:1: (lv_positionfeatures_7_0= rulePositionFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2133:1: (lv_positionfeatures_7_0= rulePositionFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2134:3: lv_positionfeatures_7_0= rulePositionFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getPositionfeaturesPositionFeatureParserRuleCall_1_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePositionFeature_in_ruleFigureFeatures4405);
            	    lv_positionfeatures_7_0=rulePositionFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"positionfeatures",
            	            		lv_positionfeatures_7_0, 
            	            		"PositionFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2151:6: ( (lv_colorfeatures_8_0= ruleColorFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2151:6: ( (lv_colorfeatures_8_0= ruleColorFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2152:1: (lv_colorfeatures_8_0= ruleColorFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2152:1: (lv_colorfeatures_8_0= ruleColorFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2153:3: lv_colorfeatures_8_0= ruleColorFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getColorfeaturesColorFeatureParserRuleCall_1_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorFeature_in_ruleFigureFeatures4432);
            	    lv_colorfeatures_8_0=ruleColorFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colorfeatures",
            	            		lv_colorfeatures_8_0, 
            	            		"ColorFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2170:6: ( (lv_integerfeatures_9_0= ruleIntegerFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2170:6: ( (lv_integerfeatures_9_0= ruleIntegerFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2171:1: (lv_integerfeatures_9_0= ruleIntegerFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2171:1: (lv_integerfeatures_9_0= ruleIntegerFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2172:3: lv_integerfeatures_9_0= ruleIntegerFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getIntegerfeaturesIntegerFeatureParserRuleCall_1_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntegerFeature_in_ruleFigureFeatures4459);
            	    lv_integerfeatures_9_0=ruleIntegerFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"integerfeatures",
            	            		lv_integerfeatures_9_0, 
            	            		"IntegerFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2189:6: ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2189:6: ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2190:1: (lv_booleanfeatures_10_0= ruleBooleanFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2190:1: (lv_booleanfeatures_10_0= ruleBooleanFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2191:3: lv_booleanfeatures_10_0= ruleBooleanFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getBooleanfeaturesBooleanFeatureParserRuleCall_1_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanFeature_in_ruleFigureFeatures4486);
            	    lv_booleanfeatures_10_0=ruleBooleanFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"booleanfeatures",
            	            		lv_booleanfeatures_10_0, 
            	            		"BooleanFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2208:6: ( (lv_stringfeatures_11_0= ruleStringFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2208:6: ( (lv_stringfeatures_11_0= ruleStringFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2209:1: (lv_stringfeatures_11_0= ruleStringFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2209:1: (lv_stringfeatures_11_0= ruleStringFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2210:3: lv_stringfeatures_11_0= ruleStringFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getStringfeaturesStringFeatureParserRuleCall_1_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringFeature_in_ruleFigureFeatures4513);
            	    lv_stringfeatures_11_0=ruleStringFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stringfeatures",
            	            		lv_stringfeatures_11_0, 
            	            		"StringFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2227:6: ( (lv_customfeatures_12_0= ruleCustomFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2227:6: ( (lv_customfeatures_12_0= ruleCustomFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2228:1: (lv_customfeatures_12_0= ruleCustomFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2228:1: (lv_customfeatures_12_0= ruleCustomFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2229:3: lv_customfeatures_12_0= ruleCustomFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getCustomfeaturesCustomFeatureParserRuleCall_1_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomFeature_in_ruleFigureFeatures4540);
            	    lv_customfeatures_12_0=ruleCustomFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFigureFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"customfeatures",
            	            		lv_customfeatures_12_0, 
            	            		"CustomFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFigureFeatures"


    // $ANTLR start "entryRuleCustomFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2253:1: entryRuleCustomFeature returns [EObject current=null] : iv_ruleCustomFeature= ruleCustomFeature EOF ;
    public final EObject entryRuleCustomFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2254:2: (iv_ruleCustomFeature= ruleCustomFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2255:2: iv_ruleCustomFeature= ruleCustomFeature EOF
            {
             newCompositeNode(grammarAccess.getCustomFeatureRule()); 
            pushFollow(FOLLOW_ruleCustomFeature_in_entryRuleCustomFeature4578);
            iv_ruleCustomFeature=ruleCustomFeature();

            state._fsp--;

             current =iv_ruleCustomFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomFeature4588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomFeature"


    // $ANTLR start "ruleCustomFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2262:1: ruleCustomFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'attribute' ) ) otherlv_1= ':' ( (lv_attribute_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) ) ;
    public final EObject ruleCustomFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_attribute_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2265:28: ( ( ( (lv_key_0_0= 'attribute' ) ) otherlv_1= ':' ( (lv_attribute_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2266:1: ( ( (lv_key_0_0= 'attribute' ) ) otherlv_1= ':' ( (lv_attribute_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2266:1: ( ( (lv_key_0_0= 'attribute' ) ) otherlv_1= ':' ( (lv_attribute_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2266:2: ( (lv_key_0_0= 'attribute' ) ) otherlv_1= ':' ( (lv_attribute_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2266:2: ( (lv_key_0_0= 'attribute' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2267:1: (lv_key_0_0= 'attribute' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2267:1: (lv_key_0_0= 'attribute' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2268:3: lv_key_0_0= 'attribute'
            {
            lv_key_0_0=(Token)match(input,65,FOLLOW_65_in_ruleCustomFeature4631); 

                    newLeafNode(lv_key_0_0, grammarAccess.getCustomFeatureAccess().getKeyAttributeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "attribute");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleCustomFeature4656); 

                	newLeafNode(otherlv_1, grammarAccess.getCustomFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2285:1: ( (lv_attribute_2_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2286:1: (lv_attribute_2_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2286:1: (lv_attribute_2_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2287:3: lv_attribute_2_0= RULE_ID
            {
            lv_attribute_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomFeature4673); 

            			newLeafNode(lv_attribute_2_0, grammarAccess.getCustomFeatureAccess().getAttributeIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attribute",
                    		lv_attribute_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleCustomFeature4690); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomFeatureAccess().getEqualsSignKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2307:1: ( (lv_value_4_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2308:1: (lv_value_4_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2308:1: (lv_value_4_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2309:3: lv_value_4_0= RULE_ID
            {
            lv_value_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomFeature4707); 

            			newLeafNode(lv_value_4_0, grammarAccess.getCustomFeatureAccess().getValueIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomFeature"


    // $ANTLR start "entryRuleLayoutFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2335:1: entryRuleLayoutFeature returns [EObject current=null] : iv_ruleLayoutFeature= ruleLayoutFeature EOF ;
    public final EObject entryRuleLayoutFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2336:2: (iv_ruleLayoutFeature= ruleLayoutFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2337:2: iv_ruleLayoutFeature= ruleLayoutFeature EOF
            {
             newCompositeNode(grammarAccess.getLayoutFeatureRule()); 
            pushFollow(FOLLOW_ruleLayoutFeature_in_entryRuleLayoutFeature4750);
            iv_ruleLayoutFeature=ruleLayoutFeature();

            state._fsp--;

             current =iv_ruleLayoutFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutFeature4760); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayoutFeature"


    // $ANTLR start "ruleLayoutFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2344:1: ruleLayoutFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) ) ;
    public final EObject ruleLayoutFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2347:28: ( ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2348:1: ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2348:1: ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2348:2: ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2348:2: ( (lv_key_0_0= 'layout' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2349:1: (lv_key_0_0= 'layout' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2349:1: (lv_key_0_0= 'layout' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2350:3: lv_key_0_0= 'layout'
            {
            lv_key_0_0=(Token)match(input,66,FOLLOW_66_in_ruleLayoutFeature4803); 

                    newLeafNode(lv_key_0_0, grammarAccess.getLayoutFeatureAccess().getKeyLayoutKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "layout");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLayoutFeature4828); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2367:1: ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2368:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2368:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2369:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2369:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt47=1;
                }
                break;
            case 68:
                {
                alt47=2;
                }
                break;
            case 69:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2370:3: lv_value_2_1= 'horizontal'
                    {
                    lv_value_2_1=(Token)match(input,67,FOLLOW_67_in_ruleLayoutFeature4848); 

                            newLeafNode(lv_value_2_1, grammarAccess.getLayoutFeatureAccess().getValueHorizontalKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2382:8: lv_value_2_2= 'vertical'
                    {
                    lv_value_2_2=(Token)match(input,68,FOLLOW_68_in_ruleLayoutFeature4877); 

                            newLeafNode(lv_value_2_2, grammarAccess.getLayoutFeatureAccess().getValueVerticalKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2394:8: lv_value_2_3= 'over'
                    {
                    lv_value_2_3=(Token)match(input,69,FOLLOW_69_in_ruleLayoutFeature4906); 

                            newLeafNode(lv_value_2_3, grammarAccess.getLayoutFeatureAccess().getValueOverKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutFeature"


    // $ANTLR start "entryRuleCenterFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2417:1: entryRuleCenterFeature returns [EObject current=null] : iv_ruleCenterFeature= ruleCenterFeature EOF ;
    public final EObject entryRuleCenterFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCenterFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2418:2: (iv_ruleCenterFeature= ruleCenterFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2419:2: iv_ruleCenterFeature= ruleCenterFeature EOF
            {
             newCompositeNode(grammarAccess.getCenterFeatureRule()); 
            pushFollow(FOLLOW_ruleCenterFeature_in_entryRuleCenterFeature4958);
            iv_ruleCenterFeature=ruleCenterFeature();

            state._fsp--;

             current =iv_ruleCenterFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCenterFeature4968); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCenterFeature"


    // $ANTLR start "ruleCenterFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2426:1: ruleCenterFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) ) ;
    public final EObject ruleCenterFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2429:28: ( ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2430:1: ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2430:1: ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2430:2: ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2430:2: ( (lv_key_0_0= 'center' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2431:1: (lv_key_0_0= 'center' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2431:1: (lv_key_0_0= 'center' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2432:3: lv_key_0_0= 'center'
            {
            lv_key_0_0=(Token)match(input,70,FOLLOW_70_in_ruleCenterFeature5011); 

                    newLeafNode(lv_key_0_0, grammarAccess.getCenterFeatureAccess().getKeyCenterKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCenterFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "center");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleCenterFeature5036); 

                	newLeafNode(otherlv_1, grammarAccess.getCenterFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2449:1: ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2450:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2450:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2451:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2451:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt48=1;
                }
                break;
            case 68:
                {
                alt48=2;
                }
                break;
            case 61:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2452:3: lv_value_2_1= 'horizontal'
                    {
                    lv_value_2_1=(Token)match(input,67,FOLLOW_67_in_ruleCenterFeature5056); 

                            newLeafNode(lv_value_2_1, grammarAccess.getCenterFeatureAccess().getValueHorizontalKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCenterFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2464:8: lv_value_2_2= 'vertical'
                    {
                    lv_value_2_2=(Token)match(input,68,FOLLOW_68_in_ruleCenterFeature5085); 

                            newLeafNode(lv_value_2_2, grammarAccess.getCenterFeatureAccess().getValueVerticalKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCenterFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2476:8: lv_value_2_3= 'both'
                    {
                    lv_value_2_3=(Token)match(input,61,FOLLOW_61_in_ruleCenterFeature5114); 

                            newLeafNode(lv_value_2_3, grammarAccess.getCenterFeatureAccess().getValueBothKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCenterFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCenterFeature"


    // $ANTLR start "entryRuleAlignFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2499:1: entryRuleAlignFeature returns [EObject current=null] : iv_ruleAlignFeature= ruleAlignFeature EOF ;
    public final EObject entryRuleAlignFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlignFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2500:2: (iv_ruleAlignFeature= ruleAlignFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2501:2: iv_ruleAlignFeature= ruleAlignFeature EOF
            {
             newCompositeNode(grammarAccess.getAlignFeatureRule()); 
            pushFollow(FOLLOW_ruleAlignFeature_in_entryRuleAlignFeature5166);
            iv_ruleAlignFeature=ruleAlignFeature();

            state._fsp--;

             current =iv_ruleAlignFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlignFeature5176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlignFeature"


    // $ANTLR start "ruleAlignFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2508:1: ruleAlignFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) ) ;
    public final EObject ruleAlignFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2511:28: ( ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2512:1: ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2512:1: ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2512:2: ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2512:2: ( (lv_key_0_0= 'text-align' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2513:1: (lv_key_0_0= 'text-align' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2513:1: (lv_key_0_0= 'text-align' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2514:3: lv_key_0_0= 'text-align'
            {
            lv_key_0_0=(Token)match(input,71,FOLLOW_71_in_ruleAlignFeature5219); 

                    newLeafNode(lv_key_0_0, grammarAccess.getAlignFeatureAccess().getKeyTextAlignKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlignFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "text-align");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleAlignFeature5244); 

                	newLeafNode(otherlv_1, grammarAccess.getAlignFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2531:1: ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2532:1: ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2532:1: ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2533:1: (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2533:1: (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt49=1;
                }
                break;
            case 73:
                {
                alt49=2;
                }
                break;
            case 74:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2534:3: lv_value_2_1= 'left'
                    {
                    lv_value_2_1=(Token)match(input,72,FOLLOW_72_in_ruleAlignFeature5264); 

                            newLeafNode(lv_value_2_1, grammarAccess.getAlignFeatureAccess().getValueLeftKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlignFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2546:8: lv_value_2_2= 'middle'
                    {
                    lv_value_2_2=(Token)match(input,73,FOLLOW_73_in_ruleAlignFeature5293); 

                            newLeafNode(lv_value_2_2, grammarAccess.getAlignFeatureAccess().getValueMiddleKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlignFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2558:8: lv_value_2_3= 'right'
                    {
                    lv_value_2_3=(Token)match(input,74,FOLLOW_74_in_ruleAlignFeature5322); 

                            newLeafNode(lv_value_2_3, grammarAccess.getAlignFeatureAccess().getValueRightKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlignFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlignFeature"


    // $ANTLR start "entryRuleGradientFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2581:1: entryRuleGradientFeature returns [EObject current=null] : iv_ruleGradientFeature= ruleGradientFeature EOF ;
    public final EObject entryRuleGradientFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradientFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2582:2: (iv_ruleGradientFeature= ruleGradientFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2583:2: iv_ruleGradientFeature= ruleGradientFeature EOF
            {
             newCompositeNode(grammarAccess.getGradientFeatureRule()); 
            pushFollow(FOLLOW_ruleGradientFeature_in_entryRuleGradientFeature5374);
            iv_ruleGradientFeature=ruleGradientFeature();

            state._fsp--;

             current =iv_ruleGradientFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGradientFeature5384); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradientFeature"


    // $ANTLR start "ruleGradientFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2590:1: ruleGradientFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) ) ;
    public final EObject ruleGradientFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;
        Token lv_value_2_4=null;
        Token lv_value_2_5=null;
        Token lv_value_2_6=null;
        Token lv_value_2_7=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2593:28: ( ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2594:1: ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2594:1: ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2594:2: ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2594:2: ( (lv_key_0_0= 'gradient' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2595:1: (lv_key_0_0= 'gradient' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2595:1: (lv_key_0_0= 'gradient' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2596:3: lv_key_0_0= 'gradient'
            {
            lv_key_0_0=(Token)match(input,75,FOLLOW_75_in_ruleGradientFeature5427); 

                    newLeafNode(lv_key_0_0, grammarAccess.getGradientFeatureAccess().getKeyGradientKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "gradient");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleGradientFeature5452); 

                	newLeafNode(otherlv_1, grammarAccess.getGradientFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2613:1: ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2614:1: ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2614:1: ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2615:1: (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2615:1: (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' )
            int alt50=7;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt50=1;
                }
                break;
            case 77:
                {
                alt50=2;
                }
                break;
            case 78:
                {
                alt50=3;
                }
                break;
            case 79:
                {
                alt50=4;
                }
                break;
            case 80:
                {
                alt50=5;
                }
                break;
            case 81:
                {
                alt50=6;
                }
                break;
            case 82:
                {
                alt50=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2616:3: lv_value_2_1= 'BlueWhite'
                    {
                    lv_value_2_1=(Token)match(input,76,FOLLOW_76_in_ruleGradientFeature5472); 

                            newLeafNode(lv_value_2_1, grammarAccess.getGradientFeatureAccess().getValueBlueWhiteKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2628:8: lv_value_2_2= 'BlueWhiteGloss'
                    {
                    lv_value_2_2=(Token)match(input,77,FOLLOW_77_in_ruleGradientFeature5501); 

                            newLeafNode(lv_value_2_2, grammarAccess.getGradientFeatureAccess().getValueBlueWhiteGlossKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2640:8: lv_value_2_3= 'CopperWhiteGloss'
                    {
                    lv_value_2_3=(Token)match(input,78,FOLLOW_78_in_ruleGradientFeature5530); 

                            newLeafNode(lv_value_2_3, grammarAccess.getGradientFeatureAccess().getValueCopperWhiteGlossKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2652:8: lv_value_2_4= 'LightGray'
                    {
                    lv_value_2_4=(Token)match(input,79,FOLLOW_79_in_ruleGradientFeature5559); 

                            newLeafNode(lv_value_2_4, grammarAccess.getGradientFeatureAccess().getValueLightGrayKeyword_2_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2664:8: lv_value_2_5= 'LightYellow'
                    {
                    lv_value_2_5=(Token)match(input,80,FOLLOW_80_in_ruleGradientFeature5588); 

                            newLeafNode(lv_value_2_5, grammarAccess.getGradientFeatureAccess().getValueLightYellowKeyword_2_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2676:8: lv_value_2_6= 'SilverWhiteGloss'
                    {
                    lv_value_2_6=(Token)match(input,81,FOLLOW_81_in_ruleGradientFeature5617); 

                            newLeafNode(lv_value_2_6, grammarAccess.getGradientFeatureAccess().getValueSilverWhiteGlossKeyword_2_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2688:8: lv_value_2_7= 'LimeWhite'
                    {
                    lv_value_2_7=(Token)match(input,82,FOLLOW_82_in_ruleGradientFeature5646); 

                            newLeafNode(lv_value_2_7, grammarAccess.getGradientFeatureAccess().getValueLimeWhiteKeyword_2_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_7, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradientFeature"


    // $ANTLR start "entryRulePointFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2711:1: entryRulePointFeature returns [EObject current=null] : iv_rulePointFeature= rulePointFeature EOF ;
    public final EObject entryRulePointFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2712:2: (iv_rulePointFeature= rulePointFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2713:2: iv_rulePointFeature= rulePointFeature EOF
            {
             newCompositeNode(grammarAccess.getPointFeatureRule()); 
            pushFollow(FOLLOW_rulePointFeature_in_entryRulePointFeature5698);
            iv_rulePointFeature=rulePointFeature();

            state._fsp--;

             current =iv_rulePointFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointFeature5708); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePointFeature"


    // $ANTLR start "rulePointFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2720:1: rulePointFeature returns [EObject current=null] : (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) ;
    public final EObject rulePointFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_X_2_0=null;
        Token otherlv_3=null;
        Token lv_Y_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2723:28: ( (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2724:1: (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2724:1: (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2724:3: otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_rulePointFeature5745); 

                	newLeafNode(otherlv_0, grammarAccess.getPointFeatureAccess().getPointKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulePointFeature5757); 

                	newLeafNode(otherlv_1, grammarAccess.getPointFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2732:1: ( (lv_X_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2733:1: (lv_X_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2733:1: (lv_X_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2734:3: lv_X_2_0= RULE_INT
            {
            lv_X_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePointFeature5774); 

            			newLeafNode(lv_X_2_0, grammarAccess.getPointFeatureAccess().getXINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"X",
                    		lv_X_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulePointFeature5791); 

                	newLeafNode(otherlv_3, grammarAccess.getPointFeatureAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2754:1: ( (lv_Y_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2755:1: (lv_Y_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2755:1: (lv_Y_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2756:3: lv_Y_4_0= RULE_INT
            {
            lv_Y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePointFeature5808); 

            			newLeafNode(lv_Y_4_0, grammarAccess.getPointFeatureAccess().getYINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Y",
                    		lv_Y_4_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePointFeature"


    // $ANTLR start "entryRuleSizeFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2780:1: entryRuleSizeFeature returns [EObject current=null] : iv_ruleSizeFeature= ruleSizeFeature EOF ;
    public final EObject entryRuleSizeFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2781:2: (iv_ruleSizeFeature= ruleSizeFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2782:2: iv_ruleSizeFeature= ruleSizeFeature EOF
            {
             newCompositeNode(grammarAccess.getSizeFeatureRule()); 
            pushFollow(FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature5849);
            iv_ruleSizeFeature=ruleSizeFeature();

            state._fsp--;

             current =iv_ruleSizeFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeFeature5859); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSizeFeature"


    // $ANTLR start "ruleSizeFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2789:1: ruleSizeFeature returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) ) ;
    public final EObject ruleSizeFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_Width_2_0=null;
        Token otherlv_3=null;
        Token lv_Height_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2792:28: ( (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2793:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2793:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2793:3: otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleSizeFeature5896); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeFeatureAccess().getSizeKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSizeFeature5908); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2801:1: ( (lv_Width_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2802:1: (lv_Width_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2802:1: (lv_Width_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2803:3: lv_Width_2_0= RULE_INT
            {
            lv_Width_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSizeFeature5925); 

            			newLeafNode(lv_Width_2_0, grammarAccess.getSizeFeatureAccess().getWidthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Width",
                    		lv_Width_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSizeFeature5942); 

                	newLeafNode(otherlv_3, grammarAccess.getSizeFeatureAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2823:1: ( (lv_Height_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2824:1: (lv_Height_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2824:1: (lv_Height_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2825:3: lv_Height_4_0= RULE_INT
            {
            lv_Height_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSizeFeature5959); 

            			newLeafNode(lv_Height_4_0, grammarAccess.getSizeFeatureAccess().getHeightINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Height",
                    		lv_Height_4_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSizeFeature"


    // $ANTLR start "entryRulePositionFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2849:1: entryRulePositionFeature returns [EObject current=null] : iv_rulePositionFeature= rulePositionFeature EOF ;
    public final EObject entryRulePositionFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2850:2: (iv_rulePositionFeature= rulePositionFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2851:2: iv_rulePositionFeature= rulePositionFeature EOF
            {
             newCompositeNode(grammarAccess.getPositionFeatureRule()); 
            pushFollow(FOLLOW_rulePositionFeature_in_entryRulePositionFeature6000);
            iv_rulePositionFeature=rulePositionFeature();

            state._fsp--;

             current =iv_rulePositionFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionFeature6010); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositionFeature"


    // $ANTLR start "rulePositionFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2858:1: rulePositionFeature returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) ;
    public final EObject rulePositionFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_X_2_0=null;
        Token otherlv_3=null;
        Token lv_Y_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2861:28: ( (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2862:1: (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2862:1: (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2862:3: otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_rulePositionFeature6047); 

                	newLeafNode(otherlv_0, grammarAccess.getPositionFeatureAccess().getPositionKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulePositionFeature6059); 

                	newLeafNode(otherlv_1, grammarAccess.getPositionFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2870:1: ( (lv_X_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2871:1: (lv_X_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2871:1: (lv_X_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2872:3: lv_X_2_0= RULE_INT
            {
            lv_X_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionFeature6076); 

            			newLeafNode(lv_X_2_0, grammarAccess.getPositionFeatureAccess().getXINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPositionFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"X",
                    		lv_X_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulePositionFeature6093); 

                	newLeafNode(otherlv_3, grammarAccess.getPositionFeatureAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2892:1: ( (lv_Y_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2893:1: (lv_Y_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2893:1: (lv_Y_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2894:3: lv_Y_4_0= RULE_INT
            {
            lv_Y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionFeature6110); 

            			newLeafNode(lv_Y_4_0, grammarAccess.getPositionFeatureAccess().getYINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPositionFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Y",
                    		lv_Y_4_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositionFeature"


    // $ANTLR start "entryRuleColorFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2918:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2919:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2920:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature6151);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature6161); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorFeature"


    // $ANTLR start "ruleColorFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2927:1: ruleColorFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_1=null;
        Token lv_key_1_2=null;
        Token lv_key_1_3=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_atribute_6_0=null;
        Token lv_operator_7_1=null;
        Token lv_operator_7_2=null;
        Token lv_option_8_0=null;
        Token otherlv_9=null;
        EObject lv_expression_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        EObject lv_rgb_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2930:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2931:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2931:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2931:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )?
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2931:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2932:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2932:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2933:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleColorFeature6207);
                    lv_expression_0_0=ruleAtributeExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_0_0, 
                            		"AtributeExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2949:3: ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2950:1: ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2950:1: ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2951:1: (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2951:1: (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt52=1;
                }
                break;
            case 87:
                {
                alt52=2;
                }
                break;
            case 88:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2952:3: lv_key_1_1= 'background'
                    {
                    lv_key_1_1=(Token)match(input,86,FOLLOW_86_in_ruleColorFeature6228); 

                            newLeafNode(lv_key_1_1, grammarAccess.getColorFeatureAccess().getKeyBackgroundKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2964:8: lv_key_1_2= 'foreground'
                    {
                    lv_key_1_2=(Token)match(input,87,FOLLOW_87_in_ruleColorFeature6257); 

                            newLeafNode(lv_key_1_2, grammarAccess.getColorFeatureAccess().getKeyForegroundKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2976:8: lv_key_1_3= 'border'
                    {
                    lv_key_1_3=(Token)match(input,88,FOLLOW_88_in_ruleColorFeature6286); 

                            newLeafNode(lv_key_1_3, grammarAccess.getColorFeatureAccess().getKeyBorderKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleColorFeature6314); 

                	newLeafNode(otherlv_2, grammarAccess.getColorFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2995:1: ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=92 && LA53_0<=99)) ) {
                alt53=1;
            }
            else if ( (LA53_0==100) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2995:2: ( (lv_value_3_0= ruleColor ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2995:2: ( (lv_value_3_0= ruleColor ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2996:1: (lv_value_3_0= ruleColor )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2996:1: (lv_value_3_0= ruleColor )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2997:3: lv_value_3_0= ruleColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorFeatureAccess().getValueColorParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColor_in_ruleColorFeature6336);
                    lv_value_3_0=ruleColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"Color");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3014:6: ( (lv_rgb_4_0= ruleRGB ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3014:6: ( (lv_rgb_4_0= ruleRGB ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3015:1: (lv_rgb_4_0= ruleRGB )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3015:1: (lv_rgb_4_0= ruleRGB )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3016:3: lv_rgb_4_0= ruleRGB
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorFeatureAccess().getRgbRGBParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRGB_in_ruleColorFeature6363);
                    lv_rgb_4_0=ruleRGB();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"rgb",
                            		lv_rgb_4_0, 
                            		"RGB");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3032:3: (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==89) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3032:5: otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,89,FOLLOW_89_in_ruleColorFeature6377); 

                        	newLeafNode(otherlv_5, grammarAccess.getColorFeatureAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3036:1: ( (lv_atribute_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3037:1: (lv_atribute_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3037:1: (lv_atribute_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3038:3: lv_atribute_6_0= RULE_ID
                    {
                    lv_atribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorFeature6394); 

                    			newLeafNode(lv_atribute_6_0, grammarAccess.getColorFeatureAccess().getAtributeIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"atribute",
                            		lv_atribute_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3054:2: ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3055:1: ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3055:1: ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3056:1: (lv_operator_7_1= '=' | lv_operator_7_2= '<>' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3056:1: (lv_operator_7_1= '=' | lv_operator_7_2= '<>' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==24) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==90) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3057:3: lv_operator_7_1= '='
                            {
                            lv_operator_7_1=(Token)match(input,24,FOLLOW_24_in_ruleColorFeature6419); 

                                    newLeafNode(lv_operator_7_1, grammarAccess.getColorFeatureAccess().getOperatorEqualsSignKeyword_4_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getColorFeatureRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_7_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3069:8: lv_operator_7_2= '<>'
                            {
                            lv_operator_7_2=(Token)match(input,90,FOLLOW_90_in_ruleColorFeature6448); 

                                    newLeafNode(lv_operator_7_2, grammarAccess.getColorFeatureAccess().getOperatorLessThanSignGreaterThanSignKeyword_4_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getColorFeatureRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_7_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3084:2: ( (lv_option_8_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3085:1: (lv_option_8_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3085:1: (lv_option_8_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3086:3: lv_option_8_0= RULE_ID
                    {
                    lv_option_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorFeature6481); 

                    			newLeafNode(lv_option_8_0, grammarAccess.getColorFeatureAccess().getOptionIDTerminalRuleCall_4_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"option",
                            		lv_option_8_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,91,FOLLOW_91_in_ruleColorFeature6498); 

                        	newLeafNode(otherlv_9, grammarAccess.getColorFeatureAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorFeature"


    // $ANTLR start "entryRuleColor"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3114:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3115:2: (iv_ruleColor= ruleColor EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3116:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor6537);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor6548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3123:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3126:28: ( (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3127:1: (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3127:1: (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' )
            int alt56=8;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt56=1;
                }
                break;
            case 93:
                {
                alt56=2;
                }
                break;
            case 94:
                {
                alt56=3;
                }
                break;
            case 95:
                {
                alt56=4;
                }
                break;
            case 96:
                {
                alt56=5;
                }
                break;
            case 97:
                {
                alt56=6;
                }
                break;
            case 98:
                {
                alt56=7;
                }
                break;
            case 99:
                {
                alt56=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3128:2: kw= 'WHITE'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleColor6586); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getWHITEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3135:2: kw= 'BLACK'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleColor6605); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getBLACKKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3142:2: kw= 'BLUE'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleColor6624); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getBLUEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3149:2: kw= 'GREEN'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleColor6643); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getGREENKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3156:2: kw= 'RED'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleColor6662); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getREDKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3163:2: kw= 'YELLOW'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleColor6681); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getYELLOWKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3170:2: kw= 'CYAN'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleColor6700); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getCYANKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3177:2: kw= 'ORANGE'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleColor6719); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getORANGEKeyword_7()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleRGB"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3190:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3191:2: (iv_ruleRGB= ruleRGB EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3192:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_ruleRGB_in_entryRuleRGB6759);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGB6769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3199:1: ruleRGB returns [EObject current=null] : (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleRGB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_R_2_0=null;
        Token otherlv_3=null;
        Token lv_G_4_0=null;
        Token otherlv_5=null;
        Token lv_B_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3202:28: ( (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3203:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3203:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3203:3: otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleRGB6806); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getRGBKeyword_0());
                
            otherlv_1=(Token)match(input,101,FOLLOW_101_in_ruleRGB6818); 

                	newLeafNode(otherlv_1, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3211:1: ( (lv_R_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3212:1: (lv_R_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3212:1: (lv_R_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3213:3: lv_R_2_0= RULE_INT
            {
            lv_R_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB6835); 

            			newLeafNode(lv_R_2_0, grammarAccess.getRGBAccess().getRINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"R",
                    		lv_R_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleRGB6852); 

                	newLeafNode(otherlv_3, grammarAccess.getRGBAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3233:1: ( (lv_G_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3234:1: (lv_G_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3234:1: (lv_G_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3235:3: lv_G_4_0= RULE_INT
            {
            lv_G_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB6869); 

            			newLeafNode(lv_G_4_0, grammarAccess.getRGBAccess().getGINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"G",
                    		lv_G_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleRGB6886); 

                	newLeafNode(otherlv_5, grammarAccess.getRGBAccess().getCommaKeyword_5());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3255:1: ( (lv_B_6_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3256:1: (lv_B_6_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3256:1: (lv_B_6_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3257:3: lv_B_6_0= RULE_INT
            {
            lv_B_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB6903); 

            			newLeafNode(lv_B_6_0, grammarAccess.getRGBAccess().getBINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"B",
                    		lv_B_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,102,FOLLOW_102_in_ruleRGB6920); 

                	newLeafNode(otherlv_7, grammarAccess.getRGBAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRGB"


    // $ANTLR start "entryRuleIntegerFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3285:1: entryRuleIntegerFeature returns [EObject current=null] : iv_ruleIntegerFeature= ruleIntegerFeature EOF ;
    public final EObject entryRuleIntegerFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3286:2: (iv_ruleIntegerFeature= ruleIntegerFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3287:2: iv_ruleIntegerFeature= ruleIntegerFeature EOF
            {
             newCompositeNode(grammarAccess.getIntegerFeatureRule()); 
            pushFollow(FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature6956);
            iv_ruleIntegerFeature=ruleIntegerFeature();

            state._fsp--;

             current =iv_ruleIntegerFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerFeature6966); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerFeature"


    // $ANTLR start "ruleIntegerFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3294:1: ruleIntegerFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_1=null;
        Token lv_key_1_2=null;
        Token lv_key_1_3=null;
        Token lv_key_1_4=null;
        Token lv_key_1_5=null;
        Token lv_key_1_6=null;
        Token lv_key_1_7=null;
        Token lv_key_1_8=null;
        Token lv_key_1_9=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3297:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3298:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3298:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3298:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3298:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3299:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3299:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3300:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleIntegerFeature7012);
                    lv_expression_0_0=ruleAtributeExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_0_0, 
                            		"AtributeExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3316:3: ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3317:1: ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3317:1: ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3318:1: (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3318:1: (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' )
            int alt58=9;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt58=1;
                }
                break;
            case 104:
                {
                alt58=2;
                }
                break;
            case 72:
                {
                alt58=3;
                }
                break;
            case 105:
                {
                alt58=4;
                }
                break;
            case 106:
                {
                alt58=5;
                }
                break;
            case 107:
                {
                alt58=6;
                }
                break;
            case 108:
                {
                alt58=7;
                }
                break;
            case 109:
                {
                alt58=8;
                }
                break;
            case 110:
                {
                alt58=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3319:3: lv_key_1_1= 'line-width'
                    {
                    lv_key_1_1=(Token)match(input,103,FOLLOW_103_in_ruleIntegerFeature7033); 

                            newLeafNode(lv_key_1_1, grammarAccess.getIntegerFeatureAccess().getKeyLineWidthKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3331:8: lv_key_1_2= 'top'
                    {
                    lv_key_1_2=(Token)match(input,104,FOLLOW_104_in_ruleIntegerFeature7062); 

                            newLeafNode(lv_key_1_2, grammarAccess.getIntegerFeatureAccess().getKeyTopKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3343:8: lv_key_1_3= 'left'
                    {
                    lv_key_1_3=(Token)match(input,72,FOLLOW_72_in_ruleIntegerFeature7091); 

                            newLeafNode(lv_key_1_3, grammarAccess.getIntegerFeatureAccess().getKeyLeftKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3355:8: lv_key_1_4= 'width'
                    {
                    lv_key_1_4=(Token)match(input,105,FOLLOW_105_in_ruleIntegerFeature7120); 

                            newLeafNode(lv_key_1_4, grammarAccess.getIntegerFeatureAccess().getKeyWidthKeyword_1_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3367:8: lv_key_1_5= 'height'
                    {
                    lv_key_1_5=(Token)match(input,106,FOLLOW_106_in_ruleIntegerFeature7149); 

                            newLeafNode(lv_key_1_5, grammarAccess.getIntegerFeatureAccess().getKeyHeightKeyword_1_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3379:8: lv_key_1_6= 'angle'
                    {
                    lv_key_1_6=(Token)match(input,107,FOLLOW_107_in_ruleIntegerFeature7178); 

                            newLeafNode(lv_key_1_6, grammarAccess.getIntegerFeatureAccess().getKeyAngleKeyword_1_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3391:8: lv_key_1_7= 'corner'
                    {
                    lv_key_1_7=(Token)match(input,108,FOLLOW_108_in_ruleIntegerFeature7207); 

                            newLeafNode(lv_key_1_7, grammarAccess.getIntegerFeatureAccess().getKeyCornerKeyword_1_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3403:8: lv_key_1_8= 'transparency'
                    {
                    lv_key_1_8=(Token)match(input,109,FOLLOW_109_in_ruleIntegerFeature7236); 

                            newLeafNode(lv_key_1_8, grammarAccess.getIntegerFeatureAccess().getKeyTransparencyKeyword_1_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3415:8: lv_key_1_9= 'font-size'
                    {
                    lv_key_1_9=(Token)match(input,110,FOLLOW_110_in_ruleIntegerFeature7265); 

                            newLeafNode(lv_key_1_9, grammarAccess.getIntegerFeatureAccess().getKeyFontSizeKeyword_1_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_9, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleIntegerFeature7293); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3434:1: ( (lv_value_3_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3435:1: (lv_value_3_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3435:1: (lv_value_3_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3436:3: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerFeature7310); 

            			newLeafNode(lv_value_3_0, grammarAccess.getIntegerFeatureAccess().getValueINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerFeature"


    // $ANTLR start "entryRuleStringFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3462:1: entryRuleStringFeature returns [EObject current=null] : iv_ruleStringFeature= ruleStringFeature EOF ;
    public final EObject entryRuleStringFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3463:2: (iv_ruleStringFeature= ruleStringFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3464:2: iv_ruleStringFeature= ruleStringFeature EOF
            {
             newCompositeNode(grammarAccess.getStringFeatureRule()); 
            pushFollow(FOLLOW_ruleStringFeature_in_entryRuleStringFeature7353);
            iv_ruleStringFeature=ruleStringFeature();

            state._fsp--;

             current =iv_ruleStringFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFeature7363); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringFeature"


    // $ANTLR start "ruleStringFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3471:1: ruleStringFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? ) ;
    public final EObject ruleStringFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_1=null;
        Token lv_key_1_2=null;
        Token lv_key_1_3=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token lv_valueL_4_0=null;
        Token otherlv_5=null;
        Token lv_attribute_6_0=null;
        Token lv_attribute_7_0=null;
        Token otherlv_8=null;
        Token lv_valueR_9_0=null;
        Token lv_attribute_10_0=null;
        Token lv_valueL_11_0=null;
        Token otherlv_12=null;
        Token lv_attribute_13_0=null;
        Token otherlv_14=null;
        Token lv_valueR_15_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3474:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3475:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3475:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3475:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )?
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3475:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3476:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3476:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3477:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleStringFeature7409);
                    lv_expression_0_0=ruleAtributeExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_0_0, 
                            		"AtributeExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3493:3: ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3494:1: ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3494:1: ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3495:1: (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3495:1: (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt60=1;
                }
                break;
            case 112:
                {
                alt60=2;
                }
                break;
            case 22:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3496:3: lv_key_1_1= 'text-value'
                    {
                    lv_key_1_1=(Token)match(input,111,FOLLOW_111_in_ruleStringFeature7430); 

                            newLeafNode(lv_key_1_1, grammarAccess.getStringFeatureAccess().getKeyTextValueKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3508:8: lv_key_1_2= 'font-name'
                    {
                    lv_key_1_2=(Token)match(input,112,FOLLOW_112_in_ruleStringFeature7459); 

                            newLeafNode(lv_key_1_2, grammarAccess.getStringFeatureAccess().getKeyFontNameKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3520:8: lv_key_1_3= 'icon'
                    {
                    lv_key_1_3=(Token)match(input,22,FOLLOW_22_in_ruleStringFeature7488); 

                            newLeafNode(lv_key_1_3, grammarAccess.getStringFeatureAccess().getKeyIconKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleStringFeature7516); 

                	newLeafNode(otherlv_2, grammarAccess.getStringFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3539:1: ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )?
            int alt61=6;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3539:2: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3539:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3540:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3540:1: (lv_value_3_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3541:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7534); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getStringFeatureAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3558:6: ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3558:6: ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3558:7: ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3558:7: ( (lv_valueL_4_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3559:1: (lv_valueL_4_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3559:1: (lv_valueL_4_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3560:3: lv_valueL_4_0= RULE_STRING
                    {
                    lv_valueL_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7563); 

                    			newLeafNode(lv_valueL_4_0, grammarAccess.getStringFeatureAccess().getValueLSTRINGTerminalRuleCall_3_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueL",
                            		lv_valueL_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,113,FOLLOW_113_in_ruleStringFeature7580); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_1_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3580:1: ( (lv_attribute_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3581:1: (lv_attribute_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3581:1: (lv_attribute_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3582:3: lv_attribute_6_0= RULE_ID
                    {
                    lv_attribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7597); 

                    			newLeafNode(lv_attribute_6_0, grammarAccess.getStringFeatureAccess().getAttributeIDTerminalRuleCall_3_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3599:6: ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3599:6: ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3599:7: ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3599:7: ( (lv_attribute_7_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3600:1: (lv_attribute_7_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3600:1: (lv_attribute_7_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3601:3: lv_attribute_7_0= RULE_ID
                    {
                    lv_attribute_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7627); 

                    			newLeafNode(lv_attribute_7_0, grammarAccess.getStringFeatureAccess().getAttributeIDTerminalRuleCall_3_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_7_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,113,FOLLOW_113_in_ruleStringFeature7644); 

                        	newLeafNode(otherlv_8, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_2_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3621:1: ( (lv_valueR_9_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3622:1: (lv_valueR_9_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3622:1: (lv_valueR_9_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3623:3: lv_valueR_9_0= RULE_STRING
                    {
                    lv_valueR_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7661); 

                    			newLeafNode(lv_valueR_9_0, grammarAccess.getStringFeatureAccess().getValueRSTRINGTerminalRuleCall_3_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueR",
                            		lv_valueR_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3640:6: ( (lv_attribute_10_0= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3640:6: ( (lv_attribute_10_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3641:1: (lv_attribute_10_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3641:1: (lv_attribute_10_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3642:3: lv_attribute_10_0= RULE_ID
                    {
                    lv_attribute_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7690); 

                    			newLeafNode(lv_attribute_10_0, grammarAccess.getStringFeatureAccess().getAttributeIDTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_10_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3659:6: ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3659:6: ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3659:7: ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3659:7: ( (lv_valueL_11_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3660:1: (lv_valueL_11_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3660:1: (lv_valueL_11_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3661:3: lv_valueL_11_0= RULE_STRING
                    {
                    lv_valueL_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7719); 

                    			newLeafNode(lv_valueL_11_0, grammarAccess.getStringFeatureAccess().getValueLSTRINGTerminalRuleCall_3_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueL",
                            		lv_valueL_11_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,113,FOLLOW_113_in_ruleStringFeature7736); 

                        	newLeafNode(otherlv_12, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_4_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3681:1: ( (lv_attribute_13_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3682:1: (lv_attribute_13_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3682:1: (lv_attribute_13_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3683:3: lv_attribute_13_0= RULE_ID
                    {
                    lv_attribute_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7753); 

                    			newLeafNode(lv_attribute_13_0, grammarAccess.getStringFeatureAccess().getAttributeIDTerminalRuleCall_3_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_13_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,113,FOLLOW_113_in_ruleStringFeature7770); 

                        	newLeafNode(otherlv_14, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_4_3());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3703:1: ( (lv_valueR_15_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3704:1: (lv_valueR_15_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3704:1: (lv_valueR_15_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3705:3: lv_valueR_15_0= RULE_STRING
                    {
                    lv_valueR_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7787); 

                    			newLeafNode(lv_valueR_15_0, grammarAccess.getStringFeatureAccess().getValueRSTRINGTerminalRuleCall_3_4_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueR",
                            		lv_valueR_15_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringFeature"


    // $ANTLR start "entryRuleBooleanFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3729:1: entryRuleBooleanFeature returns [EObject current=null] : iv_ruleBooleanFeature= ruleBooleanFeature EOF ;
    public final EObject entryRuleBooleanFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3730:2: (iv_ruleBooleanFeature= ruleBooleanFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3731:2: iv_ruleBooleanFeature= ruleBooleanFeature EOF
            {
             newCompositeNode(grammarAccess.getBooleanFeatureRule()); 
            pushFollow(FOLLOW_ruleBooleanFeature_in_entryRuleBooleanFeature7831);
            iv_ruleBooleanFeature=ruleBooleanFeature();

            state._fsp--;

             current =iv_ruleBooleanFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanFeature7841); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanFeature"


    // $ANTLR start "ruleBooleanFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3738:1: ruleBooleanFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) ;
    public final EObject ruleBooleanFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_1=null;
        Token lv_key_1_2=null;
        Token lv_key_1_3=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3741:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3742:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3742:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3742:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3742:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3743:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3743:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3744:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleBooleanFeature7887);
                    lv_expression_0_0=ruleAtributeExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_0_0, 
                            		"AtributeExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3760:3: ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3761:1: ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3761:1: ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3762:1: (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3762:1: (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt63=1;
                }
                break;
            case 115:
                {
                alt63=2;
                }
                break;
            case 116:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3763:3: lv_key_1_1= 'text-editable'
                    {
                    lv_key_1_1=(Token)match(input,114,FOLLOW_114_in_ruleBooleanFeature7908); 

                            newLeafNode(lv_key_1_1, grammarAccess.getBooleanFeatureAccess().getKeyTextEditableKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3775:8: lv_key_1_2= 'font-italic'
                    {
                    lv_key_1_2=(Token)match(input,115,FOLLOW_115_in_ruleBooleanFeature7937); 

                            newLeafNode(lv_key_1_2, grammarAccess.getBooleanFeatureAccess().getKeyFontItalicKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3787:8: lv_key_1_3= 'font-bold'
                    {
                    lv_key_1_3=(Token)match(input,116,FOLLOW_116_in_ruleBooleanFeature7966); 

                            newLeafNode(lv_key_1_3, grammarAccess.getBooleanFeatureAccess().getKeyFontBoldKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleBooleanFeature7994); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3806:1: ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3807:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3807:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3808:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3808:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==117) ) {
                alt64=1;
            }
            else if ( (LA64_0==118) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3809:3: lv_value_3_1= 'true'
                    {
                    lv_value_3_1=(Token)match(input,117,FOLLOW_117_in_ruleBooleanFeature8014); 

                            newLeafNode(lv_value_3_1, grammarAccess.getBooleanFeatureAccess().getValueTrueKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3821:8: lv_value_3_2= 'false'
                    {
                    lv_value_3_2=(Token)match(input,118,FOLLOW_118_in_ruleBooleanFeature8043); 

                            newLeafNode(lv_value_3_2, grammarAccess.getBooleanFeatureAccess().getValueFalseKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_2, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanFeature"


    // $ANTLR start "entryRuleLineFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3844:1: entryRuleLineFeature returns [EObject current=null] : iv_ruleLineFeature= ruleLineFeature EOF ;
    public final EObject entryRuleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3845:2: (iv_ruleLineFeature= ruleLineFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3846:2: iv_ruleLineFeature= ruleLineFeature EOF
            {
             newCompositeNode(grammarAccess.getLineFeatureRule()); 
            pushFollow(FOLLOW_ruleLineFeature_in_entryRuleLineFeature8095);
            iv_ruleLineFeature=ruleLineFeature();

            state._fsp--;

             current =iv_ruleLineFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineFeature8105); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineFeature"


    // $ANTLR start "ruleLineFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3853:1: ruleLineFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) ) ;
    public final EObject ruleLineFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3856:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3857:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3857:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3857:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3857:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3858:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3858:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3859:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleLineFeature8151);
                    lv_expression_0_0=ruleAtributeExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_0_0, 
                            		"AtributeExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3875:3: ( (lv_key_1_0= 'line-style' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3876:1: (lv_key_1_0= 'line-style' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3876:1: (lv_key_1_0= 'line-style' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3877:3: lv_key_1_0= 'line-style'
            {
            lv_key_1_0=(Token)match(input,119,FOLLOW_119_in_ruleLineFeature8170); 

                    newLeafNode(lv_key_1_0, grammarAccess.getLineFeatureAccess().getKeyLineStyleKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLineFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_1_0, "line-style");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLineFeature8195); 

                	newLeafNode(otherlv_2, grammarAccess.getLineFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3894:1: ( (lv_value_3_0= ruleLineStyle ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3895:1: (lv_value_3_0= ruleLineStyle )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3895:1: (lv_value_3_0= ruleLineStyle )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3896:3: lv_value_3_0= ruleLineStyle
            {
             
            	        newCompositeNode(grammarAccess.getLineFeatureAccess().getValueLineStyleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLineStyle_in_ruleLineFeature8216);
            lv_value_3_0=ruleLineStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLineFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"LineStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineFeature"


    // $ANTLR start "entryRuleLineStyle"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3920:1: entryRuleLineStyle returns [String current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final String entryRuleLineStyle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3921:2: (iv_ruleLineStyle= ruleLineStyle EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3922:2: iv_ruleLineStyle= ruleLineStyle EOF
            {
             newCompositeNode(grammarAccess.getLineStyleRule()); 
            pushFollow(FOLLOW_ruleLineStyle_in_entryRuleLineStyle8253);
            iv_ruleLineStyle=ruleLineStyle();

            state._fsp--;

             current =iv_ruleLineStyle.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineStyle8264); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineStyle"


    // $ANTLR start "ruleLineStyle"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3929:1: ruleLineStyle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' ) ;
    public final AntlrDatatypeRuleToken ruleLineStyle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3932:28: ( (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3933:1: (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3933:1: (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt66=1;
                }
                break;
            case 121:
                {
                alt66=2;
                }
                break;
            case 122:
                {
                alt66=3;
                }
                break;
            case 123:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3934:2: kw= 'solid'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_ruleLineStyle8302); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getSolidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3941:2: kw= 'dash'
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_ruleLineStyle8321); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getDashKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3948:2: kw= 'dot'
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleLineStyle8340); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getDotKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3955:2: kw= 'dashdot'
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleLineStyle8359); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getDashdotKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineStyle"


    // $ANTLR start "entryRuleAtributeExpression"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3968:1: entryRuleAtributeExpression returns [EObject current=null] : iv_ruleAtributeExpression= ruleAtributeExpression EOF ;
    public final EObject entryRuleAtributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributeExpression = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3969:2: (iv_ruleAtributeExpression= ruleAtributeExpression EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3970:2: iv_ruleAtributeExpression= ruleAtributeExpression EOF
            {
             newCompositeNode(grammarAccess.getAtributeExpressionRule()); 
            pushFollow(FOLLOW_ruleAtributeExpression_in_entryRuleAtributeExpression8399);
            iv_ruleAtributeExpression=ruleAtributeExpression();

            state._fsp--;

             current =iv_ruleAtributeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributeExpression8409); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributeExpression"


    // $ANTLR start "ruleAtributeExpression"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3977:1: ruleAtributeExpression returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' ) ;
    public final EObject ruleAtributeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3980:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3981:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3981:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3981:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->'
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3981:2: ( (lv_key_0_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3982:1: (lv_key_0_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3982:1: (lv_key_0_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3983:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributeExpression8451); 

            			newLeafNode(lv_key_0_0, grammarAccess.getAtributeExpressionAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtributeExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3999:2: ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4000:1: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4000:1: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4001:1: (lv_operator_1_1= '=' | lv_operator_1_2= '<>' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4001:1: (lv_operator_1_1= '=' | lv_operator_1_2= '<>' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==24) ) {
                alt67=1;
            }
            else if ( (LA67_0==90) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4002:3: lv_operator_1_1= '='
                    {
                    lv_operator_1_1=(Token)match(input,24,FOLLOW_24_in_ruleAtributeExpression8476); 

                            newLeafNode(lv_operator_1_1, grammarAccess.getAtributeExpressionAccess().getOperatorEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4014:8: lv_operator_1_2= '<>'
                    {
                    lv_operator_1_2=(Token)match(input,90,FOLLOW_90_in_ruleAtributeExpression8505); 

                            newLeafNode(lv_operator_1_2, grammarAccess.getAtributeExpressionAccess().getOperatorLessThanSignGreaterThanSignKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4029:2: ( (lv_value_2_0= ruleAtributeValue ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4030:1: (lv_value_2_0= ruleAtributeValue )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4030:1: (lv_value_2_0= ruleAtributeValue )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4031:3: lv_value_2_0= ruleAtributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAtributeExpressionAccess().getValueAtributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtributeValue_in_ruleAtributeExpression8542);
            lv_value_2_0=ruleAtributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtributeExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"AtributeValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,124,FOLLOW_124_in_ruleAtributeExpression8554); 

                	newLeafNode(otherlv_3, grammarAccess.getAtributeExpressionAccess().getHyphenMinusGreaterThanSignKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributeExpression"


    // $ANTLR start "entryRuleAtributeValue"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4059:1: entryRuleAtributeValue returns [EObject current=null] : iv_ruleAtributeValue= ruleAtributeValue EOF ;
    public final EObject entryRuleAtributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributeValue = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4060:2: (iv_ruleAtributeValue= ruleAtributeValue EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4061:2: iv_ruleAtributeValue= ruleAtributeValue EOF
            {
             newCompositeNode(grammarAccess.getAtributeValueRule()); 
            pushFollow(FOLLOW_ruleAtributeValue_in_entryRuleAtributeValue8590);
            iv_ruleAtributeValue=ruleAtributeValue();

            state._fsp--;

             current =iv_ruleAtributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributeValue8600); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributeValue"


    // $ANTLR start "ruleAtributeValue"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4068:1: ruleAtributeValue returns [EObject current=null] : ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAtributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueINT_0_0=null;
        Token lv_valueINT_1_0=null;
        Token otherlv_2=null;
        Token lv_valueDEC_3_0=null;
        Token lv_valueID_4_0=null;
        Token lv_valueBOOL_5_1=null;
        Token lv_valueBOOL_5_2=null;
        Token lv_valueSTRING_6_0=null;
        Token lv_valueDAY_7_0=null;
        Token otherlv_8=null;
        Token lv_valueMONTH_9_0=null;
        Token otherlv_10=null;
        Token lv_valueYEAR_11_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4071:28: ( ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4072:1: ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4072:1: ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) )
            int alt69=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 14:
                case 23:
                case 25:
                case 26:
                case 28:
                case 29:
                case 30:
                case 39:
                case 40:
                case 41:
                case 51:
                case 72:
                case 86:
                case 87:
                case 88:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 119:
                case 124:
                    {
                    alt69=1;
                    }
                    break;
                case 53:
                    {
                    alt69=6;
                    }
                    break;
                case 16:
                    {
                    alt69=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt69=3;
                }
                break;
            case 117:
            case 118:
                {
                alt69=4;
                }
                break;
            case RULE_STRING:
                {
                alt69=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4072:2: ( (lv_valueINT_0_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4072:2: ( (lv_valueINT_0_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4073:1: (lv_valueINT_0_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4073:1: (lv_valueINT_0_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4074:3: lv_valueINT_0_0= RULE_INT
                    {
                    lv_valueINT_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8642); 

                    			newLeafNode(lv_valueINT_0_0, grammarAccess.getAtributeValueAccess().getValueINTINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueINT",
                            		lv_valueINT_0_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4091:6: ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4091:6: ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4091:7: ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4091:7: ( (lv_valueINT_1_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4092:1: (lv_valueINT_1_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4092:1: (lv_valueINT_1_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4093:3: lv_valueINT_1_0= RULE_INT
                    {
                    lv_valueINT_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8671); 

                    			newLeafNode(lv_valueINT_1_0, grammarAccess.getAtributeValueAccess().getValueINTINTTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueINT",
                            		lv_valueINT_1_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAtributeValue8688); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtributeValueAccess().getFullStopKeyword_1_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4113:1: ( (lv_valueDEC_3_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4114:1: (lv_valueDEC_3_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4114:1: (lv_valueDEC_3_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4115:3: lv_valueDEC_3_0= RULE_INT
                    {
                    lv_valueDEC_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8705); 

                    			newLeafNode(lv_valueDEC_3_0, grammarAccess.getAtributeValueAccess().getValueDECINTTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueDEC",
                            		lv_valueDEC_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4132:6: ( (lv_valueID_4_0= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4132:6: ( (lv_valueID_4_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4133:1: (lv_valueID_4_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4133:1: (lv_valueID_4_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4134:3: lv_valueID_4_0= RULE_ID
                    {
                    lv_valueID_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributeValue8734); 

                    			newLeafNode(lv_valueID_4_0, grammarAccess.getAtributeValueAccess().getValueIDIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueID",
                            		lv_valueID_4_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4151:6: ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4151:6: ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4152:1: ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4152:1: ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4153:1: (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4153:1: (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==117) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==118) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4154:3: lv_valueBOOL_5_1= 'true'
                            {
                            lv_valueBOOL_5_1=(Token)match(input,117,FOLLOW_117_in_ruleAtributeValue8765); 

                                    newLeafNode(lv_valueBOOL_5_1, grammarAccess.getAtributeValueAccess().getValueBOOLTrueKeyword_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtributeValueRule());
                            	        }
                                   		setWithLastConsumed(current, "valueBOOL", lv_valueBOOL_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4166:8: lv_valueBOOL_5_2= 'false'
                            {
                            lv_valueBOOL_5_2=(Token)match(input,118,FOLLOW_118_in_ruleAtributeValue8794); 

                                    newLeafNode(lv_valueBOOL_5_2, grammarAccess.getAtributeValueAccess().getValueBOOLFalseKeyword_3_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtributeValueRule());
                            	        }
                                   		setWithLastConsumed(current, "valueBOOL", lv_valueBOOL_5_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4182:6: ( (lv_valueSTRING_6_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4182:6: ( (lv_valueSTRING_6_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4183:1: (lv_valueSTRING_6_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4183:1: (lv_valueSTRING_6_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4184:3: lv_valueSTRING_6_0= RULE_STRING
                    {
                    lv_valueSTRING_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributeValue8833); 

                    			newLeafNode(lv_valueSTRING_6_0, grammarAccess.getAtributeValueAccess().getValueSTRINGSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueSTRING",
                            		lv_valueSTRING_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4201:6: ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4201:6: ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4201:7: ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4201:7: ( (lv_valueDAY_7_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4202:1: (lv_valueDAY_7_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4202:1: (lv_valueDAY_7_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4203:3: lv_valueDAY_7_0= RULE_INT
                    {
                    lv_valueDAY_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8862); 

                    			newLeafNode(lv_valueDAY_7_0, grammarAccess.getAtributeValueAccess().getValueDAYINTTerminalRuleCall_5_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueDAY",
                            		lv_valueDAY_7_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleAtributeValue8879); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtributeValueAccess().getHyphenMinusKeyword_5_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4223:1: ( (lv_valueMONTH_9_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4224:1: (lv_valueMONTH_9_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4224:1: (lv_valueMONTH_9_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4225:3: lv_valueMONTH_9_0= RULE_INT
                    {
                    lv_valueMONTH_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8896); 

                    			newLeafNode(lv_valueMONTH_9_0, grammarAccess.getAtributeValueAccess().getValueMONTHINTTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueMONTH",
                            		lv_valueMONTH_9_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,53,FOLLOW_53_in_ruleAtributeValue8913); 

                        	newLeafNode(otherlv_10, grammarAccess.getAtributeValueAccess().getHyphenMinusKeyword_5_3());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4245:1: ( (lv_valueYEAR_11_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4246:1: (lv_valueYEAR_11_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4246:1: (lv_valueYEAR_11_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4247:3: lv_valueYEAR_11_0= RULE_INT
                    {
                    lv_valueYEAR_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8930); 

                    			newLeafNode(lv_valueYEAR_11_0, grammarAccess.getAtributeValueAccess().getValueYEARINTTerminalRuleCall_5_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueYEAR",
                            		lv_valueYEAR_11_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributeValue"


    // $ANTLR start "ruleFigureShape"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4271:1: ruleFigureShape returns [Enumerator current=null] : ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) ) ;
    public final Enumerator ruleFigureShape() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4273:28: ( ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4274:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4274:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) )
            int alt70=11;
            switch ( input.LA(1) ) {
            case 125:
                {
                alt70=1;
                }
                break;
            case 126:
                {
                alt70=2;
                }
                break;
            case 127:
                {
                alt70=3;
                }
                break;
            case 128:
                {
                alt70=4;
                }
                break;
            case 129:
                {
                alt70=5;
                }
                break;
            case 47:
                {
                alt70=6;
                }
                break;
            case 48:
                {
                alt70=7;
                }
                break;
            case 49:
                {
                alt70=8;
                }
                break;
            case 50:
                {
                alt70=9;
                }
                break;
            case 44:
                {
                alt70=10;
                }
                break;
            case 130:
                {
                alt70=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4274:2: (enumLiteral_0= 'Square' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4274:2: (enumLiteral_0= 'Square' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4274:4: enumLiteral_0= 'Square'
                    {
                    enumLiteral_0=(Token)match(input,125,FOLLOW_125_in_ruleFigureShape8986); 

                            current = grammarAccess.getFigureShapeAccess().getSQUAREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFigureShapeAccess().getSQUAREEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4280:6: (enumLiteral_1= 'Rectangle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4280:6: (enumLiteral_1= 'Rectangle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4280:8: enumLiteral_1= 'Rectangle'
                    {
                    enumLiteral_1=(Token)match(input,126,FOLLOW_126_in_ruleFigureShape9003); 

                            current = grammarAccess.getFigureShapeAccess().getRECTANGLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFigureShapeAccess().getRECTANGLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4286:6: (enumLiteral_2= 'RoundedRectangle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4286:6: (enumLiteral_2= 'RoundedRectangle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4286:8: enumLiteral_2= 'RoundedRectangle'
                    {
                    enumLiteral_2=(Token)match(input,127,FOLLOW_127_in_ruleFigureShape9020); 

                            current = grammarAccess.getFigureShapeAccess().getROUNDED_RECTANGLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFigureShapeAccess().getROUNDED_RECTANGLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4292:6: (enumLiteral_3= 'Circle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4292:6: (enumLiteral_3= 'Circle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4292:8: enumLiteral_3= 'Circle'
                    {
                    enumLiteral_3=(Token)match(input,128,FOLLOW_128_in_ruleFigureShape9037); 

                            current = grammarAccess.getFigureShapeAccess().getCIRCLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFigureShapeAccess().getCIRCLEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4298:6: (enumLiteral_4= 'Ellipse' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4298:6: (enumLiteral_4= 'Ellipse' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4298:8: enumLiteral_4= 'Ellipse'
                    {
                    enumLiteral_4=(Token)match(input,129,FOLLOW_129_in_ruleFigureShape9054); 

                            current = grammarAccess.getFigureShapeAccess().getELLIPSEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFigureShapeAccess().getELLIPSEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4304:6: (enumLiteral_5= 'Triangle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4304:6: (enumLiteral_5= 'Triangle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4304:8: enumLiteral_5= 'Triangle'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_47_in_ruleFigureShape9071); 

                            current = grammarAccess.getFigureShapeAccess().getTRIANGLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFigureShapeAccess().getTRIANGLEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4310:6: (enumLiteral_6= 'Rhombus' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4310:6: (enumLiteral_6= 'Rhombus' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4310:8: enumLiteral_6= 'Rhombus'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_48_in_ruleFigureShape9088); 

                            current = grammarAccess.getFigureShapeAccess().getRHOMBUSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getFigureShapeAccess().getRHOMBUSEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4316:6: (enumLiteral_7= 'Polygon' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4316:6: (enumLiteral_7= 'Polygon' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4316:8: enumLiteral_7= 'Polygon'
                    {
                    enumLiteral_7=(Token)match(input,49,FOLLOW_49_in_ruleFigureShape9105); 

                            current = grammarAccess.getFigureShapeAccess().getPOLYGONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getFigureShapeAccess().getPOLYGONEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4322:6: (enumLiteral_8= 'Polyline' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4322:6: (enumLiteral_8= 'Polyline' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4322:8: enumLiteral_8= 'Polyline'
                    {
                    enumLiteral_8=(Token)match(input,50,FOLLOW_50_in_ruleFigureShape9122); 

                            current = grammarAccess.getFigureShapeAccess().getPOLYLINEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getFigureShapeAccess().getPOLYLINEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4328:6: (enumLiteral_9= 'Label' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4328:6: (enumLiteral_9= 'Label' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4328:8: enumLiteral_9= 'Label'
                    {
                    enumLiteral_9=(Token)match(input,44,FOLLOW_44_in_ruleFigureShape9139); 

                            current = grammarAccess.getFigureShapeAccess().getLABELEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getFigureShapeAccess().getLABELEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4334:6: (enumLiteral_10= 'Image' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4334:6: (enumLiteral_10= 'Image' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4334:8: enumLiteral_10= 'Image'
                    {
                    enumLiteral_10=(Token)match(input,130,FOLLOW_130_in_ruleFigureShape9156); 

                            current = grammarAccess.getFigureShapeAccess().getIMAGEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getFigureShapeAccess().getIMAGEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFigureShape"

    // Delegated rules


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String DFA24_eotS =
        "\25\uffff";
    static final String DFA24_eofS =
        "\25\uffff";
    static final String DFA24_minS =
        "\1\5\2\uffff\1\30\3\uffff\2\4\1\20\4\174\2\6\1\110\1\65\1\174\1"+
        "\6\1\174";
    static final String DFA24_maxS =
        "\1\167\2\uffff\1\132\3\uffff\2\166\5\174\2\6\1\167\1\65\1\174\1"+
        "\6\1\174";
    static final String DFA24_acceptS =
        "\1\uffff\1\5\1\1\1\uffff\1\2\1\3\1\4\16\uffff";
    static final String DFA24_specialS =
        "\25\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\3\10\uffff\1\1\10\uffff\1\2\17\uffff\3\1\36\uffff\1\6\15"+
            "\uffff\3\5\16\uffff\10\6\10\uffff\1\4",
            "",
            "",
            "\1\7\101\uffff\1\10",
            "",
            "",
            "",
            "\1\15\1\12\1\11\156\uffff\1\13\1\14",
            "\1\15\1\12\1\11\156\uffff\1\13\1\14",
            "\1\17\44\uffff\1\16\106\uffff\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\6\15\uffff\3\5\16\uffff\10\6\10\uffff\1\4",
            "\1\23",
            "\1\20",
            "\1\24",
            "\1\20"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 1074:4: ( ( (lv_attributes_12_0= ruleAttribute ) ) | ( (lv_linefeatures_13_0= ruleLineFeature ) ) | ( (lv_colorfeatures_14_0= ruleColorFeature ) ) | ( (lv_integerfeatures_15_0= ruleIntegerFeature ) ) )*";
        }
    }
    static final String DFA46_eotS =
        "\35\uffff";
    static final String DFA46_eofS =
        "\1\1\34\uffff";
    static final String DFA46_minS =
        "\1\5\1\uffff\1\30\14\uffff\2\4\1\20\4\174\1\6\1\26\1\6\1\174\1\65"+
        "\1\6\1\174";
    static final String DFA46_maxS =
        "\1\167\1\uffff\1\132\14\uffff\2\166\5\174\1\6\1\167\1\6\1\174\1"+
        "\65\1\6\1\174";
    static final String DFA46_acceptS =
        "\1\uffff\1\15\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
        "\1\13\1\14\16\uffff";
    static final String DFA46_specialS =
        "\35\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\2\10\uffff\1\1\7\uffff\1\15\52\uffff\1\16\4\uffff\1\4\1\5"+
            "\1\13\2\uffff\1\6\7\uffff\1\7\1\10\1\11\3\12\16\uffff\10\13"+
            "\2\15\1\uffff\3\14\2\uffff\1\3",
            "",
            "\1\17\101\uffff\1\20",
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
            "",
            "\1\25\1\22\1\21\156\uffff\1\23\1\24",
            "\1\25\1\22\1\21\156\uffff\1\23\1\24",
            "\1\26\44\uffff\1\30\106\uffff\1\27",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\31",
            "\1\15\61\uffff\1\13\15\uffff\3\12\16\uffff\10\13\2\15\1\uffff"+
            "\3\14\2\uffff\1\3",
            "\1\32",
            "\1\27",
            "\1\33",
            "\1\34",
            "\1\27"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "()* loopback of 2018:2: ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) | ( (lv_customfeatures_12_0= ruleCustomFeature ) ) )*";
        }
    }
    static final String DFA61_eotS =
        "\13\uffff";
    static final String DFA61_eofS =
        "\1\3\1\5\1\7\5\uffff\1\11\2\uffff";
    static final String DFA61_minS =
        "\1\4\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff";
    static final String DFA61_maxS =
        "\3\167\1\uffff\1\5\3\uffff\1\167\2\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\1\6\1\uffff\1\1\1\3\1\4\1\uffff\1\2\1\5";
    static final String DFA61_specialS =
        "\13\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\1\2\10\uffff\1\3\7\uffff\1\3\52\uffff\1\3\4\uffff\3\3\2"+
            "\uffff\1\3\7\uffff\6\3\16\uffff\12\3\1\uffff\3\3\2\uffff\1\3",
            "\1\5\10\uffff\1\5\7\uffff\1\5\52\uffff\1\5\4\uffff\3\5\2\uffff"+
            "\1\5\7\uffff\6\5\16\uffff\12\5\1\4\3\5\2\uffff\1\5",
            "\1\7\10\uffff\1\7\7\uffff\1\7\1\uffff\1\3\50\uffff\1\7\4\uffff"+
            "\3\7\2\uffff\1\7\7\uffff\6\7\1\uffff\1\3\14\uffff\12\7\1\6\3"+
            "\7\2\uffff\1\7",
            "",
            "\1\10",
            "",
            "",
            "",
            "\1\11\10\uffff\1\11\7\uffff\1\11\52\uffff\1\11\4\uffff\3\11"+
            "\2\uffff\1\11\7\uffff\6\11\16\uffff\12\11\1\12\3\11\2\uffff"+
            "\1\11",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3539:1: ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleXDiagram_in_entryRuleXDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleXDiagram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXDiagram139 = new BitSet(new long[]{0x0000000000049000L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleXDiagram165 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleXDiagram186 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12_in_ruleXDiagram199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXDiagram222 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXDiagram234 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_ruleNode_in_ruleXDiagram256 = new BitSet(new long[]{0x0000000400104000L});
    public static final BitSet FOLLOW_ruleLink_in_ruleXDiagram283 = new BitSet(new long[]{0x0000000400104000L});
    public static final BitSet FOLLOW_14_in_ruleXDiagram297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImportStatement390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportStatement411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName501 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName535 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard641 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildCard660 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildCard673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStyle762 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStyle774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStyle791 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStyle808 = new BitSet(new long[]{0x0000000000404020L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleStyle829 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStyle841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNode924 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNode947 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNode959 = new BitSet(new long[]{0x0008000076E44000L});
    public static final BitSet FOLLOW_21_in_ruleNode977 = new BitSet(new long[]{0x0008000076C44000L});
    public static final BitSet FOLLOW_18_in_ruleNode1004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1021 = new BitSet(new long[]{0x0008000076C04000L});
    public static final BitSet FOLLOW_22_in_ruleNode1041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1058 = new BitSet(new long[]{0x0008000076804000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleNode1086 = new BitSet(new long[]{0x0008000076804000L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_ruleNode1108 = new BitSet(new long[]{0x0008000076004000L});
    public static final BitSet FOLLOW_ruleNodeContainer_in_ruleNode1130 = new BitSet(new long[]{0x0008000070004000L});
    public static final BitSet FOLLOW_ruleNodeAnchor_in_ruleNode1152 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNode1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAttribute1248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1265 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAttribute1282 = new BitSet(new long[]{0x0000000000000070L,0x0060000000000000L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_ruleAttribute1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_entryRuleNodeFigure1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeFigure1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNodeFigure1392 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNodeFigure1418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeFigure1430 = new BitSet(new long[]{0x0007900000000000L,0xE000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFigureShape_in_ruleNodeFigure1451 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_27_in_ruleNodeFigure1464 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeFigure1476 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeFigure1488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeFigure1505 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeFigure1524 = new BitSet(new long[]{0x0000000000404020L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleNodeFigure1545 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeFigure1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeContainer_in_entryRuleNodeContainer1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeContainer1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNodeContainer1648 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29_in_ruleNodeContainer1677 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNodeContainer1706 = new BitSet(new long[]{0x0000000080082000L});
    public static final BitSet FOLLOW_31_in_ruleNodeContainer1719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNodeContainer1742 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_19_in_ruleNodeContainer1757 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeContainer1774 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleNodeContainer1799 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33_in_ruleNodeContainer1828 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeContainer1858 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_ruleNodeContainer1879 = new BitSet(new long[]{0x0000000006004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeContainer1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLink1975 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink1999 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_35_in_ruleLink2024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2060 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleLink2072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2095 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLink2107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2130 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLink2144 = new BitSet(new long[]{0x000003C000844020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_38_in_ruleLink2162 = new BitSet(new long[]{0x0000038000844020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_18_in_ruleLink2189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2206 = new BitSet(new long[]{0x0000038000804020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleLink2235 = new BitSet(new long[]{0x0000038000804020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_ruleLineFeature_in_ruleLink2262 = new BitSet(new long[]{0x0000038000804020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleLink2289 = new BitSet(new long[]{0x0000038000804020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_ruleIntegerFeature_in_ruleLink2316 = new BitSet(new long[]{0x0000038000804020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_39_in_ruleLink2331 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLink2343 = new BitSet(new long[]{0x0000080004004000L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_ruleLink2364 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_ruleLink2386 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_14_in_ruleLink2399 = new BitSet(new long[]{0x0000030000004000L});
    public static final BitSet FOLLOW_40_in_ruleLink2414 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLink2426 = new BitSet(new long[]{0x0000080004004000L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_ruleLink2447 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_ruleLink2469 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_14_in_ruleLink2482 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_rulePlacingFigure_in_ruleLink2505 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_14_in_ruleLink2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlacingFigure_in_entryRulePlacingFigure2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlacingFigure2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePlacingFigure2601 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_rulePlacingFigure2613 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlacingFigure2630 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePlacingFigure2647 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePlacingFigure2659 = new BitSet(new long[]{0x0000080004004000L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_rulePlacingFigure2680 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_rulePlacingFigure2702 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_14_in_rulePlacingFigure2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_entryRuleDynamicFigure2751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicFigure2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDynamicFigure2798 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_ruleDynamicElement_in_ruleDynamicFigure2819 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDynamicFigure2831 = new BitSet(new long[]{0x0000000000404020L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleDynamicFigure2852 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDynamicFigure2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicElement_in_entryRuleDynamicElement2901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicElement2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDynamicElement2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDynamicElement2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_entryRuleStaticFigure3009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticFigure3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStaticFigure3056 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStaticFigure3068 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_ruleStaticElement_in_ruleStaticFigure3089 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_27_in_ruleStaticFigure3102 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStaticFigure3114 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStaticFigure3126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStaticFigure3143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStaticFigure3162 = new BitSet(new long[]{0x0000000000404020L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleStaticFigure3183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStaticFigure3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticElement_in_entryRuleStaticElement3232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticElement3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleStaticElement3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleStaticElement3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleStaticElement3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleStaticElement3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleStaticElement3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAnchor_in_entryRuleNodeAnchor3397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAnchor3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNodeAnchor3444 = new BitSet(new long[]{0x0010000000080000L});
    public static final BitSet FOLLOW_52_in_ruleNodeAnchor3457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeAnchor3474 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeAnchor3493 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_53_in_ruleNodeAnchor3511 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeAnchor3542 = new BitSet(new long[]{0x00C0000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNodeAnchor3567 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_54_in_ruleNodeAnchor3596 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_55_in_ruleNodeAnchor3625 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNodeAnchor3653 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_53_in_ruleNodeAnchor3671 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeAnchor3702 = new BitSet(new long[]{0x0300000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNodeAnchor3727 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_56_in_ruleNodeAnchor3756 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_57_in_ruleNodeAnchor3785 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeAnchor3813 = new BitSet(new long[]{0x0000000006804000L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_ruleNodeAnchor3834 = new BitSet(new long[]{0x0000000006804000L});
    public static final BitSet FOLLOW_ruleArrowAnchor_in_ruleNodeAnchor3856 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_ruleNodeAnchor3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowAnchor_in_entryRuleArrowAnchor3905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowAnchor3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleArrowAnchor3952 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArrowAnchor3969 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleArrowAnchor3986 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleArrowAnchor4006 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleArrowAnchor4035 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleArrowAnchor4064 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleArrowAnchor4092 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleArrowAnchor4105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArrowAnchor4122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleArrowAnchor4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_entryRuleFigureFeatures4177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFigureFeatures4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineFeature_in_ruleFigureFeatures4243 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleCenterFeature_in_ruleFigureFeatures4270 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleAlignFeature_in_ruleFigureFeatures4297 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleGradientFeature_in_ruleFigureFeatures4324 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_rulePointFeature_in_ruleFigureFeatures4351 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_ruleFigureFeatures4378 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_rulePositionFeature_in_ruleFigureFeatures4405 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleFigureFeatures4432 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleIntegerFeature_in_ruleFigureFeatures4459 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleBooleanFeature_in_ruleFigureFeatures4486 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleStringFeature_in_ruleFigureFeatures4513 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleCustomFeature_in_ruleFigureFeatures4540 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C2L});
    public static final BitSet FOLLOW_ruleCustomFeature_in_entryRuleCustomFeature4578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomFeature4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCustomFeature4631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCustomFeature4656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomFeature4673 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCustomFeature4690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomFeature4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutFeature_in_entryRuleLayoutFeature4750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutFeature4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleLayoutFeature4803 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLayoutFeature4828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleLayoutFeature4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLayoutFeature4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleLayoutFeature4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCenterFeature_in_entryRuleCenterFeature4958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCenterFeature4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCenterFeature5011 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCenterFeature5036 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleCenterFeature5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCenterFeature5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCenterFeature5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignFeature_in_entryRuleAlignFeature5166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignFeature5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAlignFeature5219 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAlignFeature5244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_72_in_ruleAlignFeature5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAlignFeature5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAlignFeature5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientFeature_in_entryRuleGradientFeature5374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGradientFeature5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleGradientFeature5427 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGradientFeature5452 = new BitSet(new long[]{0x0000000000000000L,0x000000000007F000L});
    public static final BitSet FOLLOW_76_in_ruleGradientFeature5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleGradientFeature5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleGradientFeature5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleGradientFeature5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleGradientFeature5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleGradientFeature5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleGradientFeature5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointFeature_in_entryRulePointFeature5698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointFeature5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rulePointFeature5745 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePointFeature5757 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePointFeature5774 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePointFeature5791 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePointFeature5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature5849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeFeature5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleSizeFeature5896 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSizeFeature5908 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSizeFeature5925 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSizeFeature5942 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSizeFeature5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionFeature_in_entryRulePositionFeature6000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionFeature6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rulePositionFeature6047 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePositionFeature6059 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionFeature6076 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePositionFeature6093 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionFeature6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature6151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleColorFeature6207 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_86_in_ruleColorFeature6228 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_87_in_ruleColorFeature6257 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_88_in_ruleColorFeature6286 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleColorFeature6314 = new BitSet(new long[]{0x0000000000000000L,0x0000001FF0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorFeature6336 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleRGB_in_ruleColorFeature6363 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleColorFeature6377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorFeature6394 = new BitSet(new long[]{0x0000000001000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_24_in_ruleColorFeature6419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_90_in_ruleColorFeature6448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorFeature6481 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleColorFeature6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor6537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleColor6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleColor6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleColor6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleColor6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleColor6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleColor6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleColor6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleColor6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGB_in_entryRuleRGB6759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGB6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleRGB6806 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleRGB6818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB6835 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRGB6852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB6869 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRGB6886 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB6903 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleRGB6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature6956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerFeature6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleIntegerFeature7012 = new BitSet(new long[]{0x0000000000000000L,0x00007F8000000100L});
    public static final BitSet FOLLOW_103_in_ruleIntegerFeature7033 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_104_in_ruleIntegerFeature7062 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_72_in_ruleIntegerFeature7091 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_105_in_ruleIntegerFeature7120 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_106_in_ruleIntegerFeature7149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_107_in_ruleIntegerFeature7178 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_108_in_ruleIntegerFeature7207 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_109_in_ruleIntegerFeature7236 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_110_in_ruleIntegerFeature7265 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIntegerFeature7293 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerFeature7310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFeature_in_entryRuleStringFeature7353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFeature7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleStringFeature7409 = new BitSet(new long[]{0x0000000000400000L,0x0001800000000000L});
    public static final BitSet FOLLOW_111_in_ruleStringFeature7430 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_112_in_ruleStringFeature7459 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22_in_ruleStringFeature7488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStringFeature7516 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7563 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStringFeature7580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7627 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStringFeature7644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7719 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStringFeature7736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7753 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStringFeature7770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanFeature_in_entryRuleBooleanFeature7831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanFeature7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleBooleanFeature7887 = new BitSet(new long[]{0x0000000000000000L,0x001C000000000000L});
    public static final BitSet FOLLOW_114_in_ruleBooleanFeature7908 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_115_in_ruleBooleanFeature7937 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_116_in_ruleBooleanFeature7966 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBooleanFeature7994 = new BitSet(new long[]{0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_117_in_ruleBooleanFeature8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleBooleanFeature8043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineFeature_in_entryRuleLineFeature8095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineFeature8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleLineFeature8151 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLineFeature8170 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLineFeature8195 = new BitSet(new long[]{0x0000000000000000L,0x0F00000000000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleLineFeature8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_entryRuleLineStyle8253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineStyle8264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleLineStyle8302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleLineStyle8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleLineStyle8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLineStyle8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_entryRuleAtributeExpression8399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributeExpression8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributeExpression8451 = new BitSet(new long[]{0x0000000001000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_24_in_ruleAtributeExpression8476 = new BitSet(new long[]{0x0000000000000070L,0x0060000000000000L});
    public static final BitSet FOLLOW_90_in_ruleAtributeExpression8505 = new BitSet(new long[]{0x0000000000000070L,0x0060000000000000L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_ruleAtributeExpression8542 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleAtributeExpression8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_entryRuleAtributeValue8590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributeValue8600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8671 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtributeValue8688 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributeValue8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleAtributeValue8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleAtributeValue8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributeValue8833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8862 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleAtributeValue8879 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8896 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleAtributeValue8913 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleFigureShape8986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleFigureShape9003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleFigureShape9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleFigureShape9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleFigureShape9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleFigureShape9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFigureShape9088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFigureShape9105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleFigureShape9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleFigureShape9139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleFigureShape9156 = new BitSet(new long[]{0x0000000000000002L});

}