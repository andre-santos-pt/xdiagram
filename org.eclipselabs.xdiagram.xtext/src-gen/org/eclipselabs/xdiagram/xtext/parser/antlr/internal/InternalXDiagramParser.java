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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'diagram'", "'import'", "'.'", "'*'", "'style'", "':'", "'{'", "'}'", "'node'", "'resizable'", "'icon'", "'name'", "'set'", "'='", "'main'", "'figure'", "','", "'stack'", "'free'", "'container'", "'for'", "'%'", "'px'", "'link'", "'object'", "'source'", "'target'", "'manhattan'", "'origin'", "'destiny'", "'placing'", "'at'", "'text'", "'Label'", "'Description'", "'Arrow'", "'Triangle'", "'Rhombus'", "'Polygon'", "'Polyline'", "'anchor'", "'to'", "'-'", "'lf'", "'rg'", "'up'", "'dw'", "'as'", "'incoming'", "'outgoing'", "'both'", "'connection'", "'using'", "'connections'", "'layout'", "'horizontal'", "'vertical'", "'over'", "'center'", "'text-align'", "'left'", "'middle'", "'right'", "'gradient'", "'BlueWhite'", "'BlueWhiteGloss'", "'CopperWhiteGloss'", "'LightGray'", "'LightYellow'", "'SilverWhiteGloss'", "'LimeWhite'", "'point'", "'size'", "'position'", "'background'", "'foreground'", "'border'", "'['", "'<>'", "']'", "'WHITE'", "'BLACK'", "'BLUE'", "'GREEN'", "'RED'", "'YELLOW'", "'CYAN'", "'ORANGE'", "'RGB'", "'('", "')'", "'line-width'", "'top'", "'width'", "'height'", "'angle'", "'corner'", "'transparency'", "'font-size'", "'text-value'", "'font-name'", "'+'", "'text-editable'", "'font-italic'", "'font-bold'", "'true'", "'false'", "'line-style'", "'solid'", "'dash'", "'dot'", "'dashdot'", "'->'", "'/'", "'Square'", "'Rectangle'", "'RoundedRectangle'", "'Circle'", "'Ellipse'", "'Image'"
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
    public static final int T__131=131;
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:77:1: ruleXDiagram returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )+ ( (lv_attr_8_0= ruleAttributeReference ) )+ ) ;
    public final EObject ruleXDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_4=null;
        EObject lv_imports_2_0 = null;

        EObject lv_styles_3_0 = null;

        EObject lv_nodes_6_0 = null;

        EObject lv_links_7_0 = null;

        EObject lv_attr_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:80:28: ( (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )+ ( (lv_attr_8_0= ruleAttributeReference ) )+ ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )+ ( (lv_attr_8_0= ruleAttributeReference ) )+ )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )+ ( (lv_attr_8_0= ruleAttributeReference ) )+ )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:81:3: otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_styles_3_0= ruleStyle ) )* otherlv_4= 'diagram' ( ( ruleQualifiedName ) ) ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )+ ( (lv_attr_8_0= ruleAttributeReference ) )+
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

                if ( (LA1_0==16) ) {
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:158:2: ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }
                else if ( (LA2_0==35) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:158:3: ( (lv_nodes_6_0= ruleNode ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:158:3: ( (lv_nodes_6_0= ruleNode ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:159:1: (lv_nodes_6_0= ruleNode )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:159:1: (lv_nodes_6_0= ruleNode )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:160:3: lv_nodes_6_0= ruleNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getNodesNodeParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleXDiagram244);
            	    lv_nodes_6_0=ruleNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_6_0, 
            	            		"Node");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:177:6: ( (lv_links_7_0= ruleLink ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:177:6: ( (lv_links_7_0= ruleLink ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:178:1: (lv_links_7_0= ruleLink )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:178:1: (lv_links_7_0= ruleLink )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:179:3: lv_links_7_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getLinksLinkParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleXDiagram271);
            	    lv_links_7_0=ruleLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_7_0, 
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:195:4: ( (lv_attr_8_0= ruleAttributeReference ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:196:1: (lv_attr_8_0= ruleAttributeReference )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:196:1: (lv_attr_8_0= ruleAttributeReference )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:197:3: lv_attr_8_0= ruleAttributeReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getAttrAttributeReferenceParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeReference_in_ruleXDiagram294);
            	    lv_attr_8_0=ruleAttributeReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attr",
            	            		lv_attr_8_0, 
            	            		"AttributeReference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleXDiagram"


    // $ANTLR start "entryRuleImportStatement"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:221:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:222:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:223:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement331);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;

             current =iv_ruleImportStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement341); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:230:1: ruleImportStatement returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:233:28: ( ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:234:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:234:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:234:2: () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:234:2: ()
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:235:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportStatementAccess().getImportStatementAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:240:2: (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:240:4: otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleImportStatement388); 

                        	newLeafNode(otherlv_1, grammarAccess.getImportStatementAccess().getImportKeyword_1_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:244:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:245:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:245:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:246:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportStatementAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportStatement409);
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:270:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:271:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:272:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName448);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName459); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:279:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:282:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:283:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:283:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:283:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName499); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:290:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:291:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName518); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName533); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:311:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:312:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:313:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard581);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard592); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:320:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:323:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:324:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:324:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:325:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard639);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:335:1: (kw= '.' kw= '*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:336:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard658); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard671); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:355:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:356:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:357:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle713);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle723); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:364:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:367:28: ( (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:368:1: (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:368:1: (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:368:3: otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleStyle760); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStyle772); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:376:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:377:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:377:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:378:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStyle789); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleStyle806); 

                	newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:398:1: ( (lv_features_4_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:399:1: (lv_features_4_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:399:1: (lv_features_4_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:400:3: lv_features_4_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getFeaturesFigureFeaturesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleStyle827);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleStyle839); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:430:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:431:2: (iv_ruleNode= ruleNode EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:432:2: iv_ruleNode= ruleNode EOF
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:439:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_resizable_3_0=null;
        Token otherlv_4=null;
        Token lv_style_5_0=null;
        Token otherlv_6=null;
        Token lv_icon_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_14=null;
        EObject lv_attributes_10_0 = null;

        EObject lv_figures_11_0 = null;

        EObject lv_containers_12_0 = null;

        EObject lv_anchors_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:442:28: ( (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:443:1: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:443:1: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:443:3: otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNode924); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:447:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:448:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:448:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:449:3: ruleQualifiedName
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleNode959); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:466:1: ( (lv_resizable_3_0= 'resizable' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:467:1: (lv_resizable_3_0= 'resizable' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:467:1: (lv_resizable_3_0= 'resizable' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:468:3: lv_resizable_3_0= 'resizable'
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:481:3: (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:481:5: otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleNode1004); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getStyleKeyword_4_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:485:1: ( (lv_style_5_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:486:1: (lv_style_5_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:486:1: (lv_style_5_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:487:3: lv_style_5_0= RULE_ID
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:503:4: (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:503:6: otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleNode1041); 

                        	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getIconKeyword_5_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:507:1: ( (lv_icon_7_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:508:1: (lv_icon_7_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:508:1: (lv_icon_7_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:509:3: lv_icon_7_0= RULE_ID
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:525:4: (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:525:6: otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleNode1078); 

                        	newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getNameKeyword_6_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:529:1: ( (lv_name_9_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:530:1: (lv_name_9_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:530:1: (lv_name_9_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:531:3: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode1095); 

                    			newLeafNode(lv_name_9_0, grammarAccess.getNodeAccess().getNameSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:547:4: ( (lv_attributes_10_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:548:1: (lv_attributes_10_0= ruleAttribute )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:548:1: (lv_attributes_10_0= ruleAttribute )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:549:3: lv_attributes_10_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleNode1123);
            	    lv_attributes_10_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_10_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:565:3: ( (lv_figures_11_0= ruleNodeFigure ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=26 && LA12_0<=27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:566:1: (lv_figures_11_0= ruleNodeFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:566:1: (lv_figures_11_0= ruleNodeFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:567:3: lv_figures_11_0= ruleNodeFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getFiguresNodeFigureParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeFigure_in_ruleNode1145);
            	    lv_figures_11_0=ruleNodeFigure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"figures",
            	            		lv_figures_11_0, 
            	            		"NodeFigure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:583:3: ( (lv_containers_12_0= ruleNodeContainer ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:584:1: (lv_containers_12_0= ruleNodeContainer )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:584:1: (lv_containers_12_0= ruleNodeContainer )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:585:3: lv_containers_12_0= ruleNodeContainer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getContainersNodeContainerParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeContainer_in_ruleNode1167);
            	    lv_containers_12_0=ruleNodeContainer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containers",
            	            		lv_containers_12_0, 
            	            		"NodeContainer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:601:3: ( (lv_anchors_13_0= ruleNodeAnchor ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==52) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:602:1: (lv_anchors_13_0= ruleNodeAnchor )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:602:1: (lv_anchors_13_0= ruleNodeAnchor )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:603:3: lv_anchors_13_0= ruleNodeAnchor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getAnchorsNodeAnchorParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeAnchor_in_ruleNode1189);
            	    lv_anchors_13_0=ruleNodeAnchor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"anchors",
            	            		lv_anchors_13_0, 
            	            		"NodeAnchor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleNode1202); 

                	newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:631:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:632:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:633:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1238);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1248); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:640:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:643:28: ( (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:644:1: (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:644:1: (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:644:3: otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleAttribute1285); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getSetKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:648:1: ( (lv_key_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:649:1: (lv_key_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:649:1: (lv_key_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:650:3: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1302); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAttribute1319); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:670:1: ( (lv_value_3_0= ruleAtributeValue ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:671:1: (lv_value_3_0= ruleAtributeValue )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:671:1: (lv_value_3_0= ruleAtributeValue )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:672:3: lv_value_3_0= ruleAtributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getValueAtributeValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAtributeValue_in_ruleAttribute1340);
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:696:1: entryRuleNodeFigure returns [EObject current=null] : iv_ruleNodeFigure= ruleNodeFigure EOF ;
    public final EObject entryRuleNodeFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:697:2: (iv_ruleNodeFigure= ruleNodeFigure EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:698:2: iv_ruleNodeFigure= ruleNodeFigure EOF
            {
             newCompositeNode(grammarAccess.getNodeFigureRule()); 
            pushFollow(FOLLOW_ruleNodeFigure_in_entryRuleNodeFigure1376);
            iv_ruleNodeFigure=ruleNodeFigure();

            state._fsp--;

             current =iv_ruleNodeFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeFigure1386); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:705:1: ruleNodeFigure returns [EObject current=null] : ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:708:28: ( ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:709:1: ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:709:1: ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:709:2: ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}'
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:709:2: ( (lv_option_0_0= 'main' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:710:1: (lv_option_0_0= 'main' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:710:1: (lv_option_0_0= 'main' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:711:3: lv_option_0_0= 'main'
                    {
                    lv_option_0_0=(Token)match(input,26,FOLLOW_26_in_ruleNodeFigure1429); 

                            newLeafNode(lv_option_0_0, grammarAccess.getNodeFigureAccess().getOptionMainKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeFigureRule());
                    	        }
                           		setWithLastConsumed(current, "option", lv_option_0_0, "main");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleNodeFigure1455); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeFigureAccess().getFigureKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleNodeFigure1467); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeFigureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:732:1: ( (lv_figure_3_0= ruleFigureShape ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:733:1: (lv_figure_3_0= ruleFigureShape )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:733:1: (lv_figure_3_0= ruleFigureShape )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:734:3: lv_figure_3_0= ruleFigureShape
            {
             
            	        newCompositeNode(grammarAccess.getNodeFigureAccess().getFigureFigureShapeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureShape_in_ruleNodeFigure1488);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:750:2: (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:750:4: otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleNodeFigure1501); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeFigureAccess().getCommaKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleNodeFigure1513); 

                        	newLeafNode(otherlv_5, grammarAccess.getNodeFigureAccess().getStyleKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleNodeFigure1525); 

                        	newLeafNode(otherlv_6, grammarAccess.getNodeFigureAccess().getColonKeyword_4_2());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:762:1: ( (lv_style_7_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:763:1: (lv_style_7_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:763:1: (lv_style_7_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:764:3: lv_style_7_0= RULE_ID
                    {
                    lv_style_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeFigure1542); 

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

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleNodeFigure1561); 

                	newLeafNode(otherlv_8, grammarAccess.getNodeFigureAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:784:1: ( (lv_features_9_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:785:1: (lv_features_9_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:785:1: (lv_features_9_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:786:3: lv_features_9_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getNodeFigureAccess().getFeaturesFigureFeaturesParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleNodeFigure1582);
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

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleNodeFigure1594); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:814:1: entryRuleNodeContainer returns [EObject current=null] : iv_ruleNodeContainer= ruleNodeContainer EOF ;
    public final EObject entryRuleNodeContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeContainer = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:815:2: (iv_ruleNodeContainer= ruleNodeContainer EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:816:2: iv_ruleNodeContainer= ruleNodeContainer EOF
            {
             newCompositeNode(grammarAccess.getNodeContainerRule()); 
            pushFollow(FOLLOW_ruleNodeContainer_in_entryRuleNodeContainer1630);
            iv_ruleNodeContainer=ruleNodeContainer();

            state._fsp--;

             current =iv_ruleNodeContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeContainer1640); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:823:1: ruleNodeContainer returns [EObject current=null] : ( ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:826:28: ( ( ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:827:1: ( ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:827:1: ( ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:827:2: ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}'
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:827:2: ( ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=29 && LA18_0<=30)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:828:1: ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:828:1: ( (lv_type_0_1= 'stack' | lv_type_0_2= 'free' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:829:1: (lv_type_0_1= 'stack' | lv_type_0_2= 'free' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:829:1: (lv_type_0_1= 'stack' | lv_type_0_2= 'free' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==29) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==30) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:830:3: lv_type_0_1= 'stack'
                            {
                            lv_type_0_1=(Token)match(input,29,FOLLOW_29_in_ruleNodeContainer1685); 

                                    newLeafNode(lv_type_0_1, grammarAccess.getNodeContainerAccess().getTypeStackKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeContainerRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:842:8: lv_type_0_2= 'free'
                            {
                            lv_type_0_2=(Token)match(input,30,FOLLOW_30_in_ruleNodeContainer1714); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleNodeContainer1743); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeContainerAccess().getContainerKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:861:1: (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:861:3: otherlv_2= 'for' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleNodeContainer1756); 

                        	newLeafNode(otherlv_2, grammarAccess.getNodeContainerAccess().getForKeyword_2_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:865:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:866:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:866:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:867:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeContainerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNodeContainerAccess().getModelReferenceEReferenceCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleNodeContainer1779);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:880:4: (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:880:6: otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleNodeContainer1794); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeContainerAccess().getColonKeyword_3_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:884:1: ( (lv_value_5_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:885:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:885:1: (lv_value_5_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:886:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeContainer1811); 

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

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:902:2: ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:903:1: ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:903:1: ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:904:1: (lv_format_6_1= '%' | lv_format_6_2= 'px' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:904:1: (lv_format_6_1= '%' | lv_format_6_2= 'px' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==33) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==34) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:905:3: lv_format_6_1= '%'
                            {
                            lv_format_6_1=(Token)match(input,33,FOLLOW_33_in_ruleNodeContainer1836); 

                                    newLeafNode(lv_format_6_1, grammarAccess.getNodeContainerAccess().getFormatPercentSignKeyword_3_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeContainerRule());
                            	        }
                                   		setWithLastConsumed(current, "format", lv_format_6_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:917:8: lv_format_6_2= 'px'
                            {
                            lv_format_6_2=(Token)match(input,34,FOLLOW_34_in_ruleNodeContainer1865); 

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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleNodeContainer1895); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeContainerAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:936:1: ( (lv_figures_8_0= ruleNodeFigure ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=26 && LA22_0<=27)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:937:1: (lv_figures_8_0= ruleNodeFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:937:1: (lv_figures_8_0= ruleNodeFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:938:3: lv_figures_8_0= ruleNodeFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeContainerAccess().getFiguresNodeFigureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeFigure_in_ruleNodeContainer1916);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleNodeContainer1929); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:966:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:967:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:968:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1965);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1975); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:975:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* (otherlv_20= 'origin' otherlv_21= '{' ( (lv_sourceStatic_22_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_23_0= ruleDynamicFigure ) )* otherlv_24= '}' )? (otherlv_25= 'destiny' otherlv_26= '{' ( (lv_targetStatic_27_0= ruleStaticFigure ) )? ( (lv_targetDynamic_28_0= ruleDynamicFigure ) )* otherlv_29= '}' )? ( (lv_placings_30_0= rulePlacingFigure ) )* otherlv_31= '}' ) ;
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
        Token otherlv_12=null;
        Token lv_icon_13_0=null;
        Token otherlv_14=null;
        Token lv_name_15_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_attributes_16_0 = null;

        EObject lv_linefeatures_17_0 = null;

        EObject lv_colorfeatures_18_0 = null;

        EObject lv_integerfeatures_19_0 = null;

        EObject lv_sourceStatic_22_0 = null;

        EObject lv_sourceDynamic_23_0 = null;

        EObject lv_targetStatic_27_0 = null;

        EObject lv_targetDynamic_28_0 = null;

        EObject lv_placings_30_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:978:28: ( (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* (otherlv_20= 'origin' otherlv_21= '{' ( (lv_sourceStatic_22_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_23_0= ruleDynamicFigure ) )* otherlv_24= '}' )? (otherlv_25= 'destiny' otherlv_26= '{' ( (lv_targetStatic_27_0= ruleStaticFigure ) )? ( (lv_targetDynamic_28_0= ruleDynamicFigure ) )* otherlv_29= '}' )? ( (lv_placings_30_0= rulePlacingFigure ) )* otherlv_31= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:979:1: (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* (otherlv_20= 'origin' otherlv_21= '{' ( (lv_sourceStatic_22_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_23_0= ruleDynamicFigure ) )* otherlv_24= '}' )? (otherlv_25= 'destiny' otherlv_26= '{' ( (lv_targetStatic_27_0= ruleStaticFigure ) )? ( (lv_targetDynamic_28_0= ruleDynamicFigure ) )* otherlv_29= '}' )? ( (lv_placings_30_0= rulePlacingFigure ) )* otherlv_31= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:979:1: (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* (otherlv_20= 'origin' otherlv_21= '{' ( (lv_sourceStatic_22_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_23_0= ruleDynamicFigure ) )* otherlv_24= '}' )? (otherlv_25= 'destiny' otherlv_26= '{' ( (lv_targetStatic_27_0= ruleStaticFigure ) )? ( (lv_targetDynamic_28_0= ruleDynamicFigure ) )* otherlv_29= '}' )? ( (lv_placings_30_0= rulePlacingFigure ) )* otherlv_31= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:979:3: otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* (otherlv_20= 'origin' otherlv_21= '{' ( (lv_sourceStatic_22_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_23_0= ruleDynamicFigure ) )* otherlv_24= '}' )? (otherlv_25= 'destiny' otherlv_26= '{' ( (lv_targetStatic_27_0= ruleStaticFigure ) )? ( (lv_targetDynamic_28_0= ruleDynamicFigure ) )* otherlv_29= '}' )? ( (lv_placings_30_0= rulePlacingFigure ) )* otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleLink2012); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:983:1: ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==36) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:983:2: ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:983:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:984:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:984:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:985:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2036);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:999:6: ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:999:6: ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:999:7: ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:999:7: ( (lv_complex_2_0= 'object' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1000:1: (lv_complex_2_0= 'object' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1000:1: (lv_complex_2_0= 'object' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1001:3: lv_complex_2_0= 'object'
                    {
                    lv_complex_2_0=(Token)match(input,36,FOLLOW_36_in_ruleLink2061); 

                            newLeafNode(lv_complex_2_0, grammarAccess.getLinkAccess().getComplexObjectKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "complex", true, "object");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1014:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1015:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1015:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1016:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2097);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleLink2109); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getSourceKeyword_1_1_2());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1033:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1034:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1034:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1035:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_1_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2132);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleLink2144); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getTargetKeyword_1_1_4());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1052:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1053:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1053:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1054:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_1_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2167);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleLink2181); 

                	newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1071:1: ( (lv_manhattan_9_0= 'manhattan' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1072:1: (lv_manhattan_9_0= 'manhattan' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1072:1: (lv_manhattan_9_0= 'manhattan' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1073:3: lv_manhattan_9_0= 'manhattan'
                    {
                    lv_manhattan_9_0=(Token)match(input,39,FOLLOW_39_in_ruleLink2199); 

                            newLeafNode(lv_manhattan_9_0, grammarAccess.getLinkAccess().getManhattanManhattanKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "manhattan", true, "manhattan");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1086:3: (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1086:5: otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleLink2226); 

                        	newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getStyleKeyword_4_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1090:1: ( (lv_style_11_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1091:1: (lv_style_11_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1091:1: (lv_style_11_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1092:3: lv_style_11_0= RULE_ID
                    {
                    lv_style_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2243); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1108:4: (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1108:6: otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleLink2263); 

                        	newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getIconKeyword_5_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1112:1: ( (lv_icon_13_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1113:1: (lv_icon_13_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1113:1: (lv_icon_13_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1114:3: lv_icon_13_0= RULE_ID
                    {
                    lv_icon_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2280); 

                    			newLeafNode(lv_icon_13_0, grammarAccess.getLinkAccess().getIconIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_13_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1130:4: (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1130:6: otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleLink2300); 

                        	newLeafNode(otherlv_14, grammarAccess.getLinkAccess().getNameKeyword_6_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1134:1: ( (lv_name_15_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1135:1: (lv_name_15_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1135:1: (lv_name_15_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1136:3: lv_name_15_0= RULE_STRING
                    {
                    lv_name_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink2317); 

                    			newLeafNode(lv_name_15_0, grammarAccess.getLinkAccess().getNameSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_15_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1152:4: ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )*
            loop28:
            do {
                int alt28=5;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1152:5: ( (lv_attributes_16_0= ruleAttribute ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1152:5: ( (lv_attributes_16_0= ruleAttribute ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1153:1: (lv_attributes_16_0= ruleAttribute )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1153:1: (lv_attributes_16_0= ruleAttribute )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1154:3: lv_attributes_16_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getAttributesAttributeParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleLink2346);
            	    lv_attributes_16_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_16_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1171:6: ( (lv_linefeatures_17_0= ruleLineFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1171:6: ( (lv_linefeatures_17_0= ruleLineFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1172:1: (lv_linefeatures_17_0= ruleLineFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1172:1: (lv_linefeatures_17_0= ruleLineFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1173:3: lv_linefeatures_17_0= ruleLineFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getLinefeaturesLineFeatureParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLineFeature_in_ruleLink2373);
            	    lv_linefeatures_17_0=ruleLineFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"linefeatures",
            	            		lv_linefeatures_17_0, 
            	            		"LineFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1190:6: ( (lv_colorfeatures_18_0= ruleColorFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1190:6: ( (lv_colorfeatures_18_0= ruleColorFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1191:1: (lv_colorfeatures_18_0= ruleColorFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1191:1: (lv_colorfeatures_18_0= ruleColorFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1192:3: lv_colorfeatures_18_0= ruleColorFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getColorfeaturesColorFeatureParserRuleCall_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorFeature_in_ruleLink2400);
            	    lv_colorfeatures_18_0=ruleColorFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colorfeatures",
            	            		lv_colorfeatures_18_0, 
            	            		"ColorFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1209:6: ( (lv_integerfeatures_19_0= ruleIntegerFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1209:6: ( (lv_integerfeatures_19_0= ruleIntegerFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1210:1: (lv_integerfeatures_19_0= ruleIntegerFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1210:1: (lv_integerfeatures_19_0= ruleIntegerFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1211:3: lv_integerfeatures_19_0= ruleIntegerFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getIntegerfeaturesIntegerFeatureParserRuleCall_7_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntegerFeature_in_ruleLink2427);
            	    lv_integerfeatures_19_0=ruleIntegerFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"integerfeatures",
            	            		lv_integerfeatures_19_0, 
            	            		"IntegerFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1227:4: (otherlv_20= 'origin' otherlv_21= '{' ( (lv_sourceStatic_22_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_23_0= ruleDynamicFigure ) )* otherlv_24= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1227:6: otherlv_20= 'origin' otherlv_21= '{' ( (lv_sourceStatic_22_0= ruleStaticFigure ) )? ( (lv_sourceDynamic_23_0= ruleDynamicFigure ) )* otherlv_24= '}'
                    {
                    otherlv_20=(Token)match(input,40,FOLLOW_40_in_ruleLink2442); 

                        	newLeafNode(otherlv_20, grammarAccess.getLinkAccess().getOriginKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleLink2454); 

                        	newLeafNode(otherlv_21, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1235:1: ( (lv_sourceStatic_22_0= ruleStaticFigure ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==27) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1236:1: (lv_sourceStatic_22_0= ruleStaticFigure )
                            {
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1236:1: (lv_sourceStatic_22_0= ruleStaticFigure )
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1237:3: lv_sourceStatic_22_0= ruleStaticFigure
                            {
                             
                            	        newCompositeNode(grammarAccess.getLinkAccess().getSourceStaticStaticFigureParserRuleCall_8_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStaticFigure_in_ruleLink2475);
                            lv_sourceStatic_22_0=ruleStaticFigure();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLinkRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"sourceStatic",
                                    		lv_sourceStatic_22_0, 
                                    		"StaticFigure");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1253:3: ( (lv_sourceDynamic_23_0= ruleDynamicFigure ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==44) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1254:1: (lv_sourceDynamic_23_0= ruleDynamicFigure )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1254:1: (lv_sourceDynamic_23_0= ruleDynamicFigure )
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1255:3: lv_sourceDynamic_23_0= ruleDynamicFigure
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkAccess().getSourceDynamicDynamicFigureParserRuleCall_8_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDynamicFigure_in_ruleLink2497);
                    	    lv_sourceDynamic_23_0=ruleDynamicFigure();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sourceDynamic",
                    	            		lv_sourceDynamic_23_0, 
                    	            		"DynamicFigure");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,19,FOLLOW_19_in_ruleLink2510); 

                        	newLeafNode(otherlv_24, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1275:3: (otherlv_25= 'destiny' otherlv_26= '{' ( (lv_targetStatic_27_0= ruleStaticFigure ) )? ( (lv_targetDynamic_28_0= ruleDynamicFigure ) )* otherlv_29= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1275:5: otherlv_25= 'destiny' otherlv_26= '{' ( (lv_targetStatic_27_0= ruleStaticFigure ) )? ( (lv_targetDynamic_28_0= ruleDynamicFigure ) )* otherlv_29= '}'
                    {
                    otherlv_25=(Token)match(input,41,FOLLOW_41_in_ruleLink2525); 

                        	newLeafNode(otherlv_25, grammarAccess.getLinkAccess().getDestinyKeyword_9_0());
                        
                    otherlv_26=(Token)match(input,18,FOLLOW_18_in_ruleLink2537); 

                        	newLeafNode(otherlv_26, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1283:1: ( (lv_targetStatic_27_0= ruleStaticFigure ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==27) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1284:1: (lv_targetStatic_27_0= ruleStaticFigure )
                            {
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1284:1: (lv_targetStatic_27_0= ruleStaticFigure )
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1285:3: lv_targetStatic_27_0= ruleStaticFigure
                            {
                             
                            	        newCompositeNode(grammarAccess.getLinkAccess().getTargetStaticStaticFigureParserRuleCall_9_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStaticFigure_in_ruleLink2558);
                            lv_targetStatic_27_0=ruleStaticFigure();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLinkRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"targetStatic",
                                    		lv_targetStatic_27_0, 
                                    		"StaticFigure");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1301:3: ( (lv_targetDynamic_28_0= ruleDynamicFigure ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==44) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1302:1: (lv_targetDynamic_28_0= ruleDynamicFigure )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1302:1: (lv_targetDynamic_28_0= ruleDynamicFigure )
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1303:3: lv_targetDynamic_28_0= ruleDynamicFigure
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkAccess().getTargetDynamicDynamicFigureParserRuleCall_9_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDynamicFigure_in_ruleLink2580);
                    	    lv_targetDynamic_28_0=ruleDynamicFigure();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"targetDynamic",
                    	            		lv_targetDynamic_28_0, 
                    	            		"DynamicFigure");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_19_in_ruleLink2593); 

                        	newLeafNode(otherlv_29, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1323:3: ( (lv_placings_30_0= rulePlacingFigure ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==42) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1324:1: (lv_placings_30_0= rulePlacingFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1324:1: (lv_placings_30_0= rulePlacingFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1325:3: lv_placings_30_0= rulePlacingFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getPlacingsPlacingFigureParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlacingFigure_in_ruleLink2616);
            	    lv_placings_30_0=rulePlacingFigure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"placings",
            	            		lv_placings_30_0, 
            	            		"PlacingFigure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_31=(Token)match(input,19,FOLLOW_19_in_ruleLink2629); 

                	newLeafNode(otherlv_31, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1353:1: entryRulePlacingFigure returns [EObject current=null] : iv_rulePlacingFigure= rulePlacingFigure EOF ;
    public final EObject entryRulePlacingFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacingFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1354:2: (iv_rulePlacingFigure= rulePlacingFigure EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1355:2: iv_rulePlacingFigure= rulePlacingFigure EOF
            {
             newCompositeNode(grammarAccess.getPlacingFigureRule()); 
            pushFollow(FOLLOW_rulePlacingFigure_in_entryRulePlacingFigure2665);
            iv_rulePlacingFigure=rulePlacingFigure();

            state._fsp--;

             current =iv_rulePlacingFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlacingFigure2675); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1362:1: rulePlacingFigure returns [EObject current=null] : (otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1365:28: ( (otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1366:1: (otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1366:1: (otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1366:3: otherlv_0= 'placing' otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' otherlv_4= '{' ( (lv_placingStatic_5_0= ruleStaticFigure ) )? ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_rulePlacingFigure2712); 

                	newLeafNode(otherlv_0, grammarAccess.getPlacingFigureAccess().getPlacingKeyword_0());
                
            otherlv_1=(Token)match(input,43,FOLLOW_43_in_rulePlacingFigure2724); 

                	newLeafNode(otherlv_1, grammarAccess.getPlacingFigureAccess().getAtKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1374:1: ( (lv_pos_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1375:1: (lv_pos_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1375:1: (lv_pos_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1376:3: lv_pos_2_0= RULE_INT
            {
            lv_pos_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePlacingFigure2741); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_rulePlacingFigure2758); 

                	newLeafNode(otherlv_3, grammarAccess.getPlacingFigureAccess().getPercentSignKeyword_3());
                
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePlacingFigure2770); 

                	newLeafNode(otherlv_4, grammarAccess.getPlacingFigureAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1400:1: ( (lv_placingStatic_5_0= ruleStaticFigure ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1401:1: (lv_placingStatic_5_0= ruleStaticFigure )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1401:1: (lv_placingStatic_5_0= ruleStaticFigure )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1402:3: lv_placingStatic_5_0= ruleStaticFigure
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlacingFigureAccess().getPlacingStaticStaticFigureParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStaticFigure_in_rulePlacingFigure2791);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1418:3: ( (lv_placingDynamic_6_0= ruleDynamicFigure ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==44) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1419:1: (lv_placingDynamic_6_0= ruleDynamicFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1419:1: (lv_placingDynamic_6_0= ruleDynamicFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1420:3: lv_placingDynamic_6_0= ruleDynamicFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlacingFigureAccess().getPlacingDynamicDynamicFigureParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDynamicFigure_in_rulePlacingFigure2813);
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
            	    break loop37;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_rulePlacingFigure2826); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1448:1: entryRuleDynamicFigure returns [EObject current=null] : iv_ruleDynamicFigure= ruleDynamicFigure EOF ;
    public final EObject entryRuleDynamicFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1449:2: (iv_ruleDynamicFigure= ruleDynamicFigure EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1450:2: iv_ruleDynamicFigure= ruleDynamicFigure EOF
            {
             newCompositeNode(grammarAccess.getDynamicFigureRule()); 
            pushFollow(FOLLOW_ruleDynamicFigure_in_entryRuleDynamicFigure2862);
            iv_ruleDynamicFigure=ruleDynamicFigure();

            state._fsp--;

             current =iv_ruleDynamicFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicFigure2872); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1457:1: ruleDynamicFigure returns [EObject current=null] : (otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}' ) ;
    public final EObject ruleDynamicFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_figure_1_0 = null;

        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1460:28: ( (otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1461:1: (otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1461:1: (otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1461:3: otherlv_0= 'text' ( (lv_figure_1_0= ruleDynamicElement ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFigureFeatures ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleDynamicFigure2909); 

                	newLeafNode(otherlv_0, grammarAccess.getDynamicFigureAccess().getTextKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1465:1: ( (lv_figure_1_0= ruleDynamicElement ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1466:1: (lv_figure_1_0= ruleDynamicElement )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1466:1: (lv_figure_1_0= ruleDynamicElement )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1467:3: lv_figure_1_0= ruleDynamicElement
            {
             
            	        newCompositeNode(grammarAccess.getDynamicFigureAccess().getFigureDynamicElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDynamicElement_in_ruleDynamicFigure2930);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDynamicFigure2942); 

                	newLeafNode(otherlv_2, grammarAccess.getDynamicFigureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1487:1: ( (lv_features_3_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1488:1: (lv_features_3_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1488:1: (lv_features_3_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1489:3: lv_features_3_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getDynamicFigureAccess().getFeaturesFigureFeaturesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleDynamicFigure2963);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleDynamicFigure2975); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1517:1: entryRuleDynamicElement returns [String current=null] : iv_ruleDynamicElement= ruleDynamicElement EOF ;
    public final String entryRuleDynamicElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicElement = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1518:2: (iv_ruleDynamicElement= ruleDynamicElement EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1519:2: iv_ruleDynamicElement= ruleDynamicElement EOF
            {
             newCompositeNode(grammarAccess.getDynamicElementRule()); 
            pushFollow(FOLLOW_ruleDynamicElement_in_entryRuleDynamicElement3012);
            iv_ruleDynamicElement=ruleDynamicElement();

            state._fsp--;

             current =iv_ruleDynamicElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicElement3023); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1526:1: ruleDynamicElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Label' | kw= 'Description' ) ;
    public final AntlrDatatypeRuleToken ruleDynamicElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1529:28: ( (kw= 'Label' | kw= 'Description' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1530:1: (kw= 'Label' | kw= 'Description' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1530:1: (kw= 'Label' | kw= 'Description' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            else if ( (LA38_0==46) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1531:2: kw= 'Label'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleDynamicElement3061); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDynamicElementAccess().getLabelKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1538:2: kw= 'Description'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleDynamicElement3080); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1551:1: entryRuleStaticFigure returns [EObject current=null] : iv_ruleStaticFigure= ruleStaticFigure EOF ;
    public final EObject entryRuleStaticFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1552:2: (iv_ruleStaticFigure= ruleStaticFigure EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1553:2: iv_ruleStaticFigure= ruleStaticFigure EOF
            {
             newCompositeNode(grammarAccess.getStaticFigureRule()); 
            pushFollow(FOLLOW_ruleStaticFigure_in_entryRuleStaticFigure3120);
            iv_ruleStaticFigure=ruleStaticFigure();

            state._fsp--;

             current =iv_ruleStaticFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticFigure3130); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1560:1: ruleStaticFigure returns [EObject current=null] : (otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1563:28: ( (otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1564:1: (otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1564:1: (otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1564:3: otherlv_0= 'figure' otherlv_1= ':' ( (lv_figure_2_0= ruleStaticElement ) ) (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFigureFeatures ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleStaticFigure3167); 

                	newLeafNode(otherlv_0, grammarAccess.getStaticFigureAccess().getFigureKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStaticFigure3179); 

                	newLeafNode(otherlv_1, grammarAccess.getStaticFigureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1572:1: ( (lv_figure_2_0= ruleStaticElement ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1573:1: (lv_figure_2_0= ruleStaticElement )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1573:1: (lv_figure_2_0= ruleStaticElement )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1574:3: lv_figure_2_0= ruleStaticElement
            {
             
            	        newCompositeNode(grammarAccess.getStaticFigureAccess().getFigureStaticElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStaticElement_in_ruleStaticFigure3200);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1590:2: (otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1590:4: otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleStaticFigure3213); 

                        	newLeafNode(otherlv_3, grammarAccess.getStaticFigureAccess().getCommaKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleStaticFigure3225); 

                        	newLeafNode(otherlv_4, grammarAccess.getStaticFigureAccess().getStyleKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleStaticFigure3237); 

                        	newLeafNode(otherlv_5, grammarAccess.getStaticFigureAccess().getColonKeyword_3_2());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1602:1: ( (lv_style_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1603:1: (lv_style_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1603:1: (lv_style_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1604:3: lv_style_6_0= RULE_ID
                    {
                    lv_style_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStaticFigure3254); 

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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleStaticFigure3273); 

                	newLeafNode(otherlv_7, grammarAccess.getStaticFigureAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1624:1: ( (lv_features_8_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1625:1: (lv_features_8_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1625:1: (lv_features_8_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1626:3: lv_features_8_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getStaticFigureAccess().getFeaturesFigureFeaturesParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleStaticFigure3294);
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

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleStaticFigure3306); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1654:1: entryRuleStaticElement returns [String current=null] : iv_ruleStaticElement= ruleStaticElement EOF ;
    public final String entryRuleStaticElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticElement = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1655:2: (iv_ruleStaticElement= ruleStaticElement EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1656:2: iv_ruleStaticElement= ruleStaticElement EOF
            {
             newCompositeNode(grammarAccess.getStaticElementRule()); 
            pushFollow(FOLLOW_ruleStaticElement_in_entryRuleStaticElement3343);
            iv_ruleStaticElement=ruleStaticElement();

            state._fsp--;

             current =iv_ruleStaticElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticElement3354); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1663:1: ruleStaticElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Arrow' | kw= 'Triangle' | kw= 'Rhombus' | kw= 'Polygon' | kw= 'Polyline' ) ;
    public final AntlrDatatypeRuleToken ruleStaticElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1666:28: ( (kw= 'Arrow' | kw= 'Triangle' | kw= 'Rhombus' | kw= 'Polygon' | kw= 'Polyline' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1667:1: (kw= 'Arrow' | kw= 'Triangle' | kw= 'Rhombus' | kw= 'Polygon' | kw= 'Polyline' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1667:1: (kw= 'Arrow' | kw= 'Triangle' | kw= 'Rhombus' | kw= 'Polygon' | kw= 'Polyline' )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt40=1;
                }
                break;
            case 48:
                {
                alt40=2;
                }
                break;
            case 49:
                {
                alt40=3;
                }
                break;
            case 50:
                {
                alt40=4;
                }
                break;
            case 51:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1668:2: kw= 'Arrow'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleStaticElement3392); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getArrowKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1675:2: kw= 'Triangle'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleStaticElement3411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getTriangleKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1682:2: kw= 'Rhombus'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleStaticElement3430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getRhombusKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1689:2: kw= 'Polygon'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleStaticElement3449); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getPolygonKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1696:2: kw= 'Polyline'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleStaticElement3468); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1709:1: entryRuleNodeAnchor returns [EObject current=null] : iv_ruleNodeAnchor= ruleNodeAnchor EOF ;
    public final EObject entryRuleNodeAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAnchor = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1710:2: (iv_ruleNodeAnchor= ruleNodeAnchor EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1711:2: iv_ruleNodeAnchor= ruleNodeAnchor EOF
            {
             newCompositeNode(grammarAccess.getNodeAnchorRule()); 
            pushFollow(FOLLOW_ruleNodeAnchor_in_entryRuleNodeAnchor3508);
            iv_ruleNodeAnchor=ruleNodeAnchor();

            state._fsp--;

             current =iv_ruleNodeAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAnchor3518); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1718:1: ruleNodeAnchor returns [EObject current=null] : (otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1721:28: ( (otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1722:1: (otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1722:1: (otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1722:3: otherlv_0= 'anchor' (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )? otherlv_3= ':' ( (lv_passX_4_0= '-' ) )? ( (lv_X_5_0= RULE_INT ) ) ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) ) otherlv_7= ',' ( (lv_passY_8_0= '-' ) )? ( (lv_Y_9_0= RULE_INT ) ) ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) ) otherlv_11= '{' ( (lv_figures_12_0= ruleNodeFigure ) )* ( (lv_arrows_13_0= ruleArrowAnchor ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleNodeAnchor3555); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAnchorAccess().getAnchorKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1726:1: (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1726:3: otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleNodeAnchor3568); 

                        	newLeafNode(otherlv_1, grammarAccess.getNodeAnchorAccess().getToKeyword_1_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1730:1: ( (lv_object_2_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1731:1: (lv_object_2_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1731:1: (lv_object_2_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1732:3: lv_object_2_0= RULE_ID
                    {
                    lv_object_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeAnchor3585); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleNodeAnchor3604); 

                	newLeafNode(otherlv_3, grammarAccess.getNodeAnchorAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1752:1: ( (lv_passX_4_0= '-' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1753:1: (lv_passX_4_0= '-' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1753:1: (lv_passX_4_0= '-' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1754:3: lv_passX_4_0= '-'
                    {
                    lv_passX_4_0=(Token)match(input,54,FOLLOW_54_in_ruleNodeAnchor3622); 

                            newLeafNode(lv_passX_4_0, grammarAccess.getNodeAnchorAccess().getPassXHyphenMinusKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "passX", lv_passX_4_0, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1767:3: ( (lv_X_5_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1768:1: (lv_X_5_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1768:1: (lv_X_5_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1769:3: lv_X_5_0= RULE_INT
            {
            lv_X_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeAnchor3653); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1785:2: ( ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1786:1: ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1786:1: ( (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1787:1: (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1787:1: (lv_formatX_6_1= '%' | lv_formatX_6_2= 'lf' | lv_formatX_6_3= 'rg' )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt43=1;
                }
                break;
            case 55:
                {
                alt43=2;
                }
                break;
            case 56:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1788:3: lv_formatX_6_1= '%'
                    {
                    lv_formatX_6_1=(Token)match(input,33,FOLLOW_33_in_ruleNodeAnchor3678); 

                            newLeafNode(lv_formatX_6_1, grammarAccess.getNodeAnchorAccess().getFormatXPercentSignKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatX", lv_formatX_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1800:8: lv_formatX_6_2= 'lf'
                    {
                    lv_formatX_6_2=(Token)match(input,55,FOLLOW_55_in_ruleNodeAnchor3707); 

                            newLeafNode(lv_formatX_6_2, grammarAccess.getNodeAnchorAccess().getFormatXLfKeyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatX", lv_formatX_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1812:8: lv_formatX_6_3= 'rg'
                    {
                    lv_formatX_6_3=(Token)match(input,56,FOLLOW_56_in_ruleNodeAnchor3736); 

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

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleNodeAnchor3764); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeAnchorAccess().getCommaKeyword_6());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1831:1: ( (lv_passY_8_0= '-' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1832:1: (lv_passY_8_0= '-' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1832:1: (lv_passY_8_0= '-' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1833:3: lv_passY_8_0= '-'
                    {
                    lv_passY_8_0=(Token)match(input,54,FOLLOW_54_in_ruleNodeAnchor3782); 

                            newLeafNode(lv_passY_8_0, grammarAccess.getNodeAnchorAccess().getPassYHyphenMinusKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "passY", lv_passY_8_0, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1846:3: ( (lv_Y_9_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1847:1: (lv_Y_9_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1847:1: (lv_Y_9_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1848:3: lv_Y_9_0= RULE_INT
            {
            lv_Y_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeAnchor3813); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1864:2: ( ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1865:1: ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1865:1: ( (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1866:1: (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1866:1: (lv_formatY_10_1= '%' | lv_formatY_10_2= 'up' | lv_formatY_10_3= 'dw' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt45=1;
                }
                break;
            case 57:
                {
                alt45=2;
                }
                break;
            case 58:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1867:3: lv_formatY_10_1= '%'
                    {
                    lv_formatY_10_1=(Token)match(input,33,FOLLOW_33_in_ruleNodeAnchor3838); 

                            newLeafNode(lv_formatY_10_1, grammarAccess.getNodeAnchorAccess().getFormatYPercentSignKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatY", lv_formatY_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1879:8: lv_formatY_10_2= 'up'
                    {
                    lv_formatY_10_2=(Token)match(input,57,FOLLOW_57_in_ruleNodeAnchor3867); 

                            newLeafNode(lv_formatY_10_2, grammarAccess.getNodeAnchorAccess().getFormatYUpKeyword_9_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "formatY", lv_formatY_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1891:8: lv_formatY_10_3= 'dw'
                    {
                    lv_formatY_10_3=(Token)match(input,58,FOLLOW_58_in_ruleNodeAnchor3896); 

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

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleNodeAnchor3924); 

                	newLeafNode(otherlv_11, grammarAccess.getNodeAnchorAccess().getLeftCurlyBracketKeyword_10());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1910:1: ( (lv_figures_12_0= ruleNodeFigure ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=26 && LA46_0<=27)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1911:1: (lv_figures_12_0= ruleNodeFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1911:1: (lv_figures_12_0= ruleNodeFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1912:3: lv_figures_12_0= ruleNodeFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAnchorAccess().getFiguresNodeFigureParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeFigure_in_ruleNodeAnchor3945);
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
            	    break loop46;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1928:3: ( (lv_arrows_13_0= ruleArrowAnchor ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==24) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1929:1: (lv_arrows_13_0= ruleArrowAnchor )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1929:1: (lv_arrows_13_0= ruleArrowAnchor )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1930:3: lv_arrows_13_0= ruleArrowAnchor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAnchorAccess().getArrowsArrowAnchorParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArrowAnchor_in_ruleNodeAnchor3967);
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
            	    break loop47;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleNodeAnchor3980); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1958:1: entryRuleArrowAnchor returns [EObject current=null] : iv_ruleArrowAnchor= ruleArrowAnchor EOF ;
    public final EObject entryRuleArrowAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowAnchor = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1959:2: (iv_ruleArrowAnchor= ruleArrowAnchor EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1960:2: iv_ruleArrowAnchor= ruleArrowAnchor EOF
            {
             newCompositeNode(grammarAccess.getArrowAnchorRule()); 
            pushFollow(FOLLOW_ruleArrowAnchor_in_entryRuleArrowAnchor4016);
            iv_ruleArrowAnchor=ruleArrowAnchor();

            state._fsp--;

             current =iv_ruleArrowAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowAnchor4026); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1967:1: ruleArrowAnchor returns [EObject current=null] : (otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )? ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1970:28: ( (otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1971:1: (otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1971:1: (otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1971:3: otherlv_0= 'set' ( (lv_reference_1_0= RULE_ID ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) ) otherlv_4= 'connection' (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleArrowAnchor4063); 

                	newLeafNode(otherlv_0, grammarAccess.getArrowAnchorAccess().getSetKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1975:1: ( (lv_reference_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1976:1: (lv_reference_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1976:1: (lv_reference_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1977:3: lv_reference_1_0= RULE_ID
            {
            lv_reference_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArrowAnchor4080); 

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

            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleArrowAnchor4097); 

                	newLeafNode(otherlv_2, grammarAccess.getArrowAnchorAccess().getAsKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1997:1: ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1998:1: ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1998:1: ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1999:1: (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1999:1: (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt48=1;
                }
                break;
            case 61:
                {
                alt48=2;
                }
                break;
            case 62:
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2000:3: lv_type_3_1= 'incoming'
                    {
                    lv_type_3_1=(Token)match(input,60,FOLLOW_60_in_ruleArrowAnchor4117); 

                            newLeafNode(lv_type_3_1, grammarAccess.getArrowAnchorAccess().getTypeIncomingKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2012:8: lv_type_3_2= 'outgoing'
                    {
                    lv_type_3_2=(Token)match(input,61,FOLLOW_61_in_ruleArrowAnchor4146); 

                            newLeafNode(lv_type_3_2, grammarAccess.getArrowAnchorAccess().getTypeOutgoingKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowAnchorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2024:8: lv_type_3_3= 'both'
                    {
                    lv_type_3_3=(Token)match(input,62,FOLLOW_62_in_ruleArrowAnchor4175); 

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

            otherlv_4=(Token)match(input,63,FOLLOW_63_in_ruleArrowAnchor4203); 

                	newLeafNode(otherlv_4, grammarAccess.getArrowAnchorAccess().getConnectionKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2043:1: (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==64) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2043:3: otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections'
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleArrowAnchor4216); 

                        	newLeafNode(otherlv_5, grammarAccess.getArrowAnchorAccess().getUsingKeyword_5_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2047:1: ( (lv_N_6_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2048:1: (lv_N_6_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2048:1: (lv_N_6_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2049:3: lv_N_6_0= RULE_INT
                    {
                    lv_N_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArrowAnchor4233); 

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

                    otherlv_7=(Token)match(input,65,FOLLOW_65_in_ruleArrowAnchor4250); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2077:1: entryRuleFigureFeatures returns [EObject current=null] : iv_ruleFigureFeatures= ruleFigureFeatures EOF ;
    public final EObject entryRuleFigureFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFigureFeatures = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2078:2: (iv_ruleFigureFeatures= ruleFigureFeatures EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2079:2: iv_ruleFigureFeatures= ruleFigureFeatures EOF
            {
             newCompositeNode(grammarAccess.getFigureFeaturesRule()); 
            pushFollow(FOLLOW_ruleFigureFeatures_in_entryRuleFigureFeatures4288);
            iv_ruleFigureFeatures=ruleFigureFeatures();

            state._fsp--;

             current =iv_ruleFigureFeatures; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFigureFeatures4298); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2086:1: ruleFigureFeatures returns [EObject current=null] : ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )* ) ;
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


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2089:28: ( ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )* ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2090:1: ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )* )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2090:1: ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )* )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2090:2: () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )*
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2090:2: ()
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2091:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFigureFeaturesAccess().getFigureFeaturesAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2096:2: ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )*
            loop50:
            do {
                int alt50=12;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2096:3: ( (lv_linefeatures_1_0= ruleLineFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2096:3: ( (lv_linefeatures_1_0= ruleLineFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2097:1: (lv_linefeatures_1_0= ruleLineFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2097:1: (lv_linefeatures_1_0= ruleLineFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2098:3: lv_linefeatures_1_0= ruleLineFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getLinefeaturesLineFeatureParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLineFeature_in_ruleFigureFeatures4354);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2115:6: ( (lv_centerfeatures_2_0= ruleCenterFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2115:6: ( (lv_centerfeatures_2_0= ruleCenterFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2116:1: (lv_centerfeatures_2_0= ruleCenterFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2116:1: (lv_centerfeatures_2_0= ruleCenterFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2117:3: lv_centerfeatures_2_0= ruleCenterFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getCenterfeaturesCenterFeatureParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCenterFeature_in_ruleFigureFeatures4381);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2134:6: ( (lv_alignfeatures_3_0= ruleAlignFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2134:6: ( (lv_alignfeatures_3_0= ruleAlignFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2135:1: (lv_alignfeatures_3_0= ruleAlignFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2135:1: (lv_alignfeatures_3_0= ruleAlignFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2136:3: lv_alignfeatures_3_0= ruleAlignFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getAlignfeaturesAlignFeatureParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAlignFeature_in_ruleFigureFeatures4408);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2153:6: ( (lv_gradientfeatures_4_0= ruleGradientFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2153:6: ( (lv_gradientfeatures_4_0= ruleGradientFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2154:1: (lv_gradientfeatures_4_0= ruleGradientFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2154:1: (lv_gradientfeatures_4_0= ruleGradientFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2155:3: lv_gradientfeatures_4_0= ruleGradientFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getGradientfeaturesGradientFeatureParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGradientFeature_in_ruleFigureFeatures4435);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2172:6: ( (lv_pointfeatures_5_0= rulePointFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2172:6: ( (lv_pointfeatures_5_0= rulePointFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2173:1: (lv_pointfeatures_5_0= rulePointFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2173:1: (lv_pointfeatures_5_0= rulePointFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2174:3: lv_pointfeatures_5_0= rulePointFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getPointfeaturesPointFeatureParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePointFeature_in_ruleFigureFeatures4462);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2191:6: ( (lv_sizefeatures_6_0= ruleSizeFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2191:6: ( (lv_sizefeatures_6_0= ruleSizeFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2192:1: (lv_sizefeatures_6_0= ruleSizeFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2192:1: (lv_sizefeatures_6_0= ruleSizeFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2193:3: lv_sizefeatures_6_0= ruleSizeFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getSizefeaturesSizeFeatureParserRuleCall_1_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSizeFeature_in_ruleFigureFeatures4489);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2210:6: ( (lv_positionfeatures_7_0= rulePositionFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2210:6: ( (lv_positionfeatures_7_0= rulePositionFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2211:1: (lv_positionfeatures_7_0= rulePositionFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2211:1: (lv_positionfeatures_7_0= rulePositionFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2212:3: lv_positionfeatures_7_0= rulePositionFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getPositionfeaturesPositionFeatureParserRuleCall_1_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePositionFeature_in_ruleFigureFeatures4516);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2229:6: ( (lv_colorfeatures_8_0= ruleColorFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2229:6: ( (lv_colorfeatures_8_0= ruleColorFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2230:1: (lv_colorfeatures_8_0= ruleColorFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2230:1: (lv_colorfeatures_8_0= ruleColorFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2231:3: lv_colorfeatures_8_0= ruleColorFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getColorfeaturesColorFeatureParserRuleCall_1_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorFeature_in_ruleFigureFeatures4543);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2248:6: ( (lv_integerfeatures_9_0= ruleIntegerFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2248:6: ( (lv_integerfeatures_9_0= ruleIntegerFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2249:1: (lv_integerfeatures_9_0= ruleIntegerFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2249:1: (lv_integerfeatures_9_0= ruleIntegerFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2250:3: lv_integerfeatures_9_0= ruleIntegerFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getIntegerfeaturesIntegerFeatureParserRuleCall_1_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntegerFeature_in_ruleFigureFeatures4570);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2267:6: ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2267:6: ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2268:1: (lv_booleanfeatures_10_0= ruleBooleanFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2268:1: (lv_booleanfeatures_10_0= ruleBooleanFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2269:3: lv_booleanfeatures_10_0= ruleBooleanFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getBooleanfeaturesBooleanFeatureParserRuleCall_1_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanFeature_in_ruleFigureFeatures4597);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2286:6: ( (lv_stringfeatures_11_0= ruleStringFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2286:6: ( (lv_stringfeatures_11_0= ruleStringFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2287:1: (lv_stringfeatures_11_0= ruleStringFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2287:1: (lv_stringfeatures_11_0= ruleStringFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2288:3: lv_stringfeatures_11_0= ruleStringFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFigureFeaturesAccess().getStringfeaturesStringFeatureParserRuleCall_1_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringFeature_in_ruleFigureFeatures4624);
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

            	default :
            	    break loop50;
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


    // $ANTLR start "entryRuleLayoutFeature"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2314:1: entryRuleLayoutFeature returns [EObject current=null] : iv_ruleLayoutFeature= ruleLayoutFeature EOF ;
    public final EObject entryRuleLayoutFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2315:2: (iv_ruleLayoutFeature= ruleLayoutFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2316:2: iv_ruleLayoutFeature= ruleLayoutFeature EOF
            {
             newCompositeNode(grammarAccess.getLayoutFeatureRule()); 
            pushFollow(FOLLOW_ruleLayoutFeature_in_entryRuleLayoutFeature4664);
            iv_ruleLayoutFeature=ruleLayoutFeature();

            state._fsp--;

             current =iv_ruleLayoutFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutFeature4674); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2323:1: ruleLayoutFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) ) ;
    public final EObject ruleLayoutFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2326:28: ( ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2327:1: ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2327:1: ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2327:2: ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2327:2: ( (lv_key_0_0= 'layout' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2328:1: (lv_key_0_0= 'layout' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2328:1: (lv_key_0_0= 'layout' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2329:3: lv_key_0_0= 'layout'
            {
            lv_key_0_0=(Token)match(input,66,FOLLOW_66_in_ruleLayoutFeature4717); 

                    newLeafNode(lv_key_0_0, grammarAccess.getLayoutFeatureAccess().getKeyLayoutKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "layout");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleLayoutFeature4742); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2346:1: ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2347:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2347:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2348:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2348:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt51=1;
                }
                break;
            case 68:
                {
                alt51=2;
                }
                break;
            case 69:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2349:3: lv_value_2_1= 'horizontal'
                    {
                    lv_value_2_1=(Token)match(input,67,FOLLOW_67_in_ruleLayoutFeature4762); 

                            newLeafNode(lv_value_2_1, grammarAccess.getLayoutFeatureAccess().getValueHorizontalKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2361:8: lv_value_2_2= 'vertical'
                    {
                    lv_value_2_2=(Token)match(input,68,FOLLOW_68_in_ruleLayoutFeature4791); 

                            newLeafNode(lv_value_2_2, grammarAccess.getLayoutFeatureAccess().getValueVerticalKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2373:8: lv_value_2_3= 'over'
                    {
                    lv_value_2_3=(Token)match(input,69,FOLLOW_69_in_ruleLayoutFeature4820); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2396:1: entryRuleCenterFeature returns [EObject current=null] : iv_ruleCenterFeature= ruleCenterFeature EOF ;
    public final EObject entryRuleCenterFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCenterFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2397:2: (iv_ruleCenterFeature= ruleCenterFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2398:2: iv_ruleCenterFeature= ruleCenterFeature EOF
            {
             newCompositeNode(grammarAccess.getCenterFeatureRule()); 
            pushFollow(FOLLOW_ruleCenterFeature_in_entryRuleCenterFeature4872);
            iv_ruleCenterFeature=ruleCenterFeature();

            state._fsp--;

             current =iv_ruleCenterFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCenterFeature4882); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2405:1: ruleCenterFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) ) ;
    public final EObject ruleCenterFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2408:28: ( ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2409:1: ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2409:1: ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2409:2: ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2409:2: ( (lv_key_0_0= 'center' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2410:1: (lv_key_0_0= 'center' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2410:1: (lv_key_0_0= 'center' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2411:3: lv_key_0_0= 'center'
            {
            lv_key_0_0=(Token)match(input,70,FOLLOW_70_in_ruleCenterFeature4925); 

                    newLeafNode(lv_key_0_0, grammarAccess.getCenterFeatureAccess().getKeyCenterKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCenterFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "center");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleCenterFeature4950); 

                	newLeafNode(otherlv_1, grammarAccess.getCenterFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2428:1: ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2429:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2429:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2430:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2430:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt52=1;
                }
                break;
            case 68:
                {
                alt52=2;
                }
                break;
            case 62:
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2431:3: lv_value_2_1= 'horizontal'
                    {
                    lv_value_2_1=(Token)match(input,67,FOLLOW_67_in_ruleCenterFeature4970); 

                            newLeafNode(lv_value_2_1, grammarAccess.getCenterFeatureAccess().getValueHorizontalKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCenterFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2443:8: lv_value_2_2= 'vertical'
                    {
                    lv_value_2_2=(Token)match(input,68,FOLLOW_68_in_ruleCenterFeature4999); 

                            newLeafNode(lv_value_2_2, grammarAccess.getCenterFeatureAccess().getValueVerticalKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCenterFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2455:8: lv_value_2_3= 'both'
                    {
                    lv_value_2_3=(Token)match(input,62,FOLLOW_62_in_ruleCenterFeature5028); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2478:1: entryRuleAlignFeature returns [EObject current=null] : iv_ruleAlignFeature= ruleAlignFeature EOF ;
    public final EObject entryRuleAlignFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlignFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2479:2: (iv_ruleAlignFeature= ruleAlignFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2480:2: iv_ruleAlignFeature= ruleAlignFeature EOF
            {
             newCompositeNode(grammarAccess.getAlignFeatureRule()); 
            pushFollow(FOLLOW_ruleAlignFeature_in_entryRuleAlignFeature5080);
            iv_ruleAlignFeature=ruleAlignFeature();

            state._fsp--;

             current =iv_ruleAlignFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlignFeature5090); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2487:1: ruleAlignFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) ) ;
    public final EObject ruleAlignFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2490:28: ( ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2491:1: ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2491:1: ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2491:2: ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2491:2: ( (lv_key_0_0= 'text-align' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2492:1: (lv_key_0_0= 'text-align' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2492:1: (lv_key_0_0= 'text-align' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2493:3: lv_key_0_0= 'text-align'
            {
            lv_key_0_0=(Token)match(input,71,FOLLOW_71_in_ruleAlignFeature5133); 

                    newLeafNode(lv_key_0_0, grammarAccess.getAlignFeatureAccess().getKeyTextAlignKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlignFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "text-align");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAlignFeature5158); 

                	newLeafNode(otherlv_1, grammarAccess.getAlignFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2510:1: ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2511:1: ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2511:1: ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2512:1: (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2512:1: (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt53=1;
                }
                break;
            case 73:
                {
                alt53=2;
                }
                break;
            case 74:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2513:3: lv_value_2_1= 'left'
                    {
                    lv_value_2_1=(Token)match(input,72,FOLLOW_72_in_ruleAlignFeature5178); 

                            newLeafNode(lv_value_2_1, grammarAccess.getAlignFeatureAccess().getValueLeftKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlignFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2525:8: lv_value_2_2= 'middle'
                    {
                    lv_value_2_2=(Token)match(input,73,FOLLOW_73_in_ruleAlignFeature5207); 

                            newLeafNode(lv_value_2_2, grammarAccess.getAlignFeatureAccess().getValueMiddleKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlignFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2537:8: lv_value_2_3= 'right'
                    {
                    lv_value_2_3=(Token)match(input,74,FOLLOW_74_in_ruleAlignFeature5236); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2560:1: entryRuleGradientFeature returns [EObject current=null] : iv_ruleGradientFeature= ruleGradientFeature EOF ;
    public final EObject entryRuleGradientFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradientFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2561:2: (iv_ruleGradientFeature= ruleGradientFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2562:2: iv_ruleGradientFeature= ruleGradientFeature EOF
            {
             newCompositeNode(grammarAccess.getGradientFeatureRule()); 
            pushFollow(FOLLOW_ruleGradientFeature_in_entryRuleGradientFeature5288);
            iv_ruleGradientFeature=ruleGradientFeature();

            state._fsp--;

             current =iv_ruleGradientFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGradientFeature5298); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2569:1: ruleGradientFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2572:28: ( ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2573:1: ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2573:1: ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2573:2: ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2573:2: ( (lv_key_0_0= 'gradient' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2574:1: (lv_key_0_0= 'gradient' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2574:1: (lv_key_0_0= 'gradient' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2575:3: lv_key_0_0= 'gradient'
            {
            lv_key_0_0=(Token)match(input,75,FOLLOW_75_in_ruleGradientFeature5341); 

                    newLeafNode(lv_key_0_0, grammarAccess.getGradientFeatureAccess().getKeyGradientKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "gradient");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleGradientFeature5366); 

                	newLeafNode(otherlv_1, grammarAccess.getGradientFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2592:1: ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2593:1: ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2593:1: ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2594:1: (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2594:1: (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' )
            int alt54=7;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt54=1;
                }
                break;
            case 77:
                {
                alt54=2;
                }
                break;
            case 78:
                {
                alt54=3;
                }
                break;
            case 79:
                {
                alt54=4;
                }
                break;
            case 80:
                {
                alt54=5;
                }
                break;
            case 81:
                {
                alt54=6;
                }
                break;
            case 82:
                {
                alt54=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2595:3: lv_value_2_1= 'BlueWhite'
                    {
                    lv_value_2_1=(Token)match(input,76,FOLLOW_76_in_ruleGradientFeature5386); 

                            newLeafNode(lv_value_2_1, grammarAccess.getGradientFeatureAccess().getValueBlueWhiteKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2607:8: lv_value_2_2= 'BlueWhiteGloss'
                    {
                    lv_value_2_2=(Token)match(input,77,FOLLOW_77_in_ruleGradientFeature5415); 

                            newLeafNode(lv_value_2_2, grammarAccess.getGradientFeatureAccess().getValueBlueWhiteGlossKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2619:8: lv_value_2_3= 'CopperWhiteGloss'
                    {
                    lv_value_2_3=(Token)match(input,78,FOLLOW_78_in_ruleGradientFeature5444); 

                            newLeafNode(lv_value_2_3, grammarAccess.getGradientFeatureAccess().getValueCopperWhiteGlossKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2631:8: lv_value_2_4= 'LightGray'
                    {
                    lv_value_2_4=(Token)match(input,79,FOLLOW_79_in_ruleGradientFeature5473); 

                            newLeafNode(lv_value_2_4, grammarAccess.getGradientFeatureAccess().getValueLightGrayKeyword_2_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2643:8: lv_value_2_5= 'LightYellow'
                    {
                    lv_value_2_5=(Token)match(input,80,FOLLOW_80_in_ruleGradientFeature5502); 

                            newLeafNode(lv_value_2_5, grammarAccess.getGradientFeatureAccess().getValueLightYellowKeyword_2_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2655:8: lv_value_2_6= 'SilverWhiteGloss'
                    {
                    lv_value_2_6=(Token)match(input,81,FOLLOW_81_in_ruleGradientFeature5531); 

                            newLeafNode(lv_value_2_6, grammarAccess.getGradientFeatureAccess().getValueSilverWhiteGlossKeyword_2_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2667:8: lv_value_2_7= 'LimeWhite'
                    {
                    lv_value_2_7=(Token)match(input,82,FOLLOW_82_in_ruleGradientFeature5560); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2690:1: entryRulePointFeature returns [EObject current=null] : iv_rulePointFeature= rulePointFeature EOF ;
    public final EObject entryRulePointFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2691:2: (iv_rulePointFeature= rulePointFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2692:2: iv_rulePointFeature= rulePointFeature EOF
            {
             newCompositeNode(grammarAccess.getPointFeatureRule()); 
            pushFollow(FOLLOW_rulePointFeature_in_entryRulePointFeature5612);
            iv_rulePointFeature=rulePointFeature();

            state._fsp--;

             current =iv_rulePointFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointFeature5622); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2699:1: rulePointFeature returns [EObject current=null] : (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) ;
    public final EObject rulePointFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_X_2_0=null;
        Token otherlv_3=null;
        Token lv_Y_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2702:28: ( (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2703:1: (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2703:1: (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2703:3: otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_rulePointFeature5659); 

                	newLeafNode(otherlv_0, grammarAccess.getPointFeatureAccess().getPointKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePointFeature5671); 

                	newLeafNode(otherlv_1, grammarAccess.getPointFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2711:1: ( (lv_X_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2712:1: (lv_X_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2712:1: (lv_X_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2713:3: lv_X_2_0= RULE_INT
            {
            lv_X_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePointFeature5688); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulePointFeature5705); 

                	newLeafNode(otherlv_3, grammarAccess.getPointFeatureAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2733:1: ( (lv_Y_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2734:1: (lv_Y_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2734:1: (lv_Y_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2735:3: lv_Y_4_0= RULE_INT
            {
            lv_Y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePointFeature5722); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2759:1: entryRuleSizeFeature returns [EObject current=null] : iv_ruleSizeFeature= ruleSizeFeature EOF ;
    public final EObject entryRuleSizeFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2760:2: (iv_ruleSizeFeature= ruleSizeFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2761:2: iv_ruleSizeFeature= ruleSizeFeature EOF
            {
             newCompositeNode(grammarAccess.getSizeFeatureRule()); 
            pushFollow(FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature5763);
            iv_ruleSizeFeature=ruleSizeFeature();

            state._fsp--;

             current =iv_ruleSizeFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeFeature5773); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2768:1: ruleSizeFeature returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) ) ;
    public final EObject ruleSizeFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_Width_2_0=null;
        Token otherlv_3=null;
        Token lv_Height_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2771:28: ( (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2772:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2772:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2772:3: otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleSizeFeature5810); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeFeatureAccess().getSizeKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSizeFeature5822); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2780:1: ( (lv_Width_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2781:1: (lv_Width_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2781:1: (lv_Width_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2782:3: lv_Width_2_0= RULE_INT
            {
            lv_Width_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSizeFeature5839); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSizeFeature5856); 

                	newLeafNode(otherlv_3, grammarAccess.getSizeFeatureAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2802:1: ( (lv_Height_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2803:1: (lv_Height_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2803:1: (lv_Height_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2804:3: lv_Height_4_0= RULE_INT
            {
            lv_Height_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSizeFeature5873); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2828:1: entryRulePositionFeature returns [EObject current=null] : iv_rulePositionFeature= rulePositionFeature EOF ;
    public final EObject entryRulePositionFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2829:2: (iv_rulePositionFeature= rulePositionFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2830:2: iv_rulePositionFeature= rulePositionFeature EOF
            {
             newCompositeNode(grammarAccess.getPositionFeatureRule()); 
            pushFollow(FOLLOW_rulePositionFeature_in_entryRulePositionFeature5914);
            iv_rulePositionFeature=rulePositionFeature();

            state._fsp--;

             current =iv_rulePositionFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionFeature5924); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2837:1: rulePositionFeature returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) ;
    public final EObject rulePositionFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_X_2_0=null;
        Token otherlv_3=null;
        Token lv_Y_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2840:28: ( (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2841:1: (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2841:1: (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2841:3: otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_rulePositionFeature5961); 

                	newLeafNode(otherlv_0, grammarAccess.getPositionFeatureAccess().getPositionKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePositionFeature5973); 

                	newLeafNode(otherlv_1, grammarAccess.getPositionFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2849:1: ( (lv_X_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2850:1: (lv_X_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2850:1: (lv_X_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2851:3: lv_X_2_0= RULE_INT
            {
            lv_X_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionFeature5990); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulePositionFeature6007); 

                	newLeafNode(otherlv_3, grammarAccess.getPositionFeatureAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2871:1: ( (lv_Y_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2872:1: (lv_Y_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2872:1: (lv_Y_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2873:3: lv_Y_4_0= RULE_INT
            {
            lv_Y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionFeature6024); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2897:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2898:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2899:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature6065);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature6075); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2906:1: ruleColorFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2909:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2910:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2910:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2910:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )?
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2910:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2911:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2911:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2912:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleColorFeature6121);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2928:3: ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2929:1: ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2929:1: ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2930:1: (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2930:1: (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt56=1;
                }
                break;
            case 87:
                {
                alt56=2;
                }
                break;
            case 88:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2931:3: lv_key_1_1= 'background'
                    {
                    lv_key_1_1=(Token)match(input,86,FOLLOW_86_in_ruleColorFeature6142); 

                            newLeafNode(lv_key_1_1, grammarAccess.getColorFeatureAccess().getKeyBackgroundKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2943:8: lv_key_1_2= 'foreground'
                    {
                    lv_key_1_2=(Token)match(input,87,FOLLOW_87_in_ruleColorFeature6171); 

                            newLeafNode(lv_key_1_2, grammarAccess.getColorFeatureAccess().getKeyForegroundKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2955:8: lv_key_1_3= 'border'
                    {
                    lv_key_1_3=(Token)match(input,88,FOLLOW_88_in_ruleColorFeature6200); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleColorFeature6228); 

                	newLeafNode(otherlv_2, grammarAccess.getColorFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2974:1: ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=92 && LA57_0<=99)) ) {
                alt57=1;
            }
            else if ( (LA57_0==100) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2974:2: ( (lv_value_3_0= ruleColor ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2974:2: ( (lv_value_3_0= ruleColor ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2975:1: (lv_value_3_0= ruleColor )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2975:1: (lv_value_3_0= ruleColor )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2976:3: lv_value_3_0= ruleColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorFeatureAccess().getValueColorParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColor_in_ruleColorFeature6250);
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2993:6: ( (lv_rgb_4_0= ruleRGB ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2993:6: ( (lv_rgb_4_0= ruleRGB ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2994:1: (lv_rgb_4_0= ruleRGB )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2994:1: (lv_rgb_4_0= ruleRGB )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2995:3: lv_rgb_4_0= ruleRGB
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorFeatureAccess().getRgbRGBParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRGB_in_ruleColorFeature6277);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3011:3: (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==89) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3011:5: otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,89,FOLLOW_89_in_ruleColorFeature6291); 

                        	newLeafNode(otherlv_5, grammarAccess.getColorFeatureAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3015:1: ( (lv_atribute_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3016:1: (lv_atribute_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3016:1: (lv_atribute_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3017:3: lv_atribute_6_0= RULE_ID
                    {
                    lv_atribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorFeature6308); 

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

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3033:2: ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3034:1: ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3034:1: ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3035:1: (lv_operator_7_1= '=' | lv_operator_7_2= '<>' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3035:1: (lv_operator_7_1= '=' | lv_operator_7_2= '<>' )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==25) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==90) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3036:3: lv_operator_7_1= '='
                            {
                            lv_operator_7_1=(Token)match(input,25,FOLLOW_25_in_ruleColorFeature6333); 

                                    newLeafNode(lv_operator_7_1, grammarAccess.getColorFeatureAccess().getOperatorEqualsSignKeyword_4_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getColorFeatureRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_7_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3048:8: lv_operator_7_2= '<>'
                            {
                            lv_operator_7_2=(Token)match(input,90,FOLLOW_90_in_ruleColorFeature6362); 

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

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3063:2: ( (lv_option_8_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3064:1: (lv_option_8_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3064:1: (lv_option_8_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3065:3: lv_option_8_0= RULE_ID
                    {
                    lv_option_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorFeature6395); 

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

                    otherlv_9=(Token)match(input,91,FOLLOW_91_in_ruleColorFeature6412); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3093:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3094:2: (iv_ruleColor= ruleColor EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3095:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor6451);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor6462); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3102:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3105:28: ( (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3106:1: (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3106:1: (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' )
            int alt60=8;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt60=1;
                }
                break;
            case 93:
                {
                alt60=2;
                }
                break;
            case 94:
                {
                alt60=3;
                }
                break;
            case 95:
                {
                alt60=4;
                }
                break;
            case 96:
                {
                alt60=5;
                }
                break;
            case 97:
                {
                alt60=6;
                }
                break;
            case 98:
                {
                alt60=7;
                }
                break;
            case 99:
                {
                alt60=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3107:2: kw= 'WHITE'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleColor6500); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getWHITEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3114:2: kw= 'BLACK'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleColor6519); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getBLACKKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3121:2: kw= 'BLUE'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleColor6538); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getBLUEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3128:2: kw= 'GREEN'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleColor6557); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getGREENKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3135:2: kw= 'RED'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleColor6576); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getREDKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3142:2: kw= 'YELLOW'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleColor6595); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getYELLOWKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3149:2: kw= 'CYAN'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleColor6614); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getCYANKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3156:2: kw= 'ORANGE'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleColor6633); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3169:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3170:2: (iv_ruleRGB= ruleRGB EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3171:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_ruleRGB_in_entryRuleRGB6673);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGB6683); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3178:1: ruleRGB returns [EObject current=null] : (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3181:28: ( (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3182:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3182:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3182:3: otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleRGB6720); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getRGBKeyword_0());
                
            otherlv_1=(Token)match(input,101,FOLLOW_101_in_ruleRGB6732); 

                	newLeafNode(otherlv_1, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3190:1: ( (lv_R_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3191:1: (lv_R_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3191:1: (lv_R_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3192:3: lv_R_2_0= RULE_INT
            {
            lv_R_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB6749); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRGB6766); 

                	newLeafNode(otherlv_3, grammarAccess.getRGBAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3212:1: ( (lv_G_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3213:1: (lv_G_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3213:1: (lv_G_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3214:3: lv_G_4_0= RULE_INT
            {
            lv_G_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB6783); 

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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleRGB6800); 

                	newLeafNode(otherlv_5, grammarAccess.getRGBAccess().getCommaKeyword_5());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3234:1: ( (lv_B_6_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3235:1: (lv_B_6_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3235:1: (lv_B_6_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3236:3: lv_B_6_0= RULE_INT
            {
            lv_B_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB6817); 

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

            otherlv_7=(Token)match(input,102,FOLLOW_102_in_ruleRGB6834); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3264:1: entryRuleIntegerFeature returns [EObject current=null] : iv_ruleIntegerFeature= ruleIntegerFeature EOF ;
    public final EObject entryRuleIntegerFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3265:2: (iv_ruleIntegerFeature= ruleIntegerFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3266:2: iv_ruleIntegerFeature= ruleIntegerFeature EOF
            {
             newCompositeNode(grammarAccess.getIntegerFeatureRule()); 
            pushFollow(FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature6870);
            iv_ruleIntegerFeature=ruleIntegerFeature();

            state._fsp--;

             current =iv_ruleIntegerFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerFeature6880); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3273:1: ruleIntegerFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3276:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3277:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3277:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3277:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3277:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3278:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3278:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3279:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleIntegerFeature6926);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3295:3: ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3296:1: ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3296:1: ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3297:1: (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3297:1: (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' )
            int alt62=9;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt62=1;
                }
                break;
            case 104:
                {
                alt62=2;
                }
                break;
            case 72:
                {
                alt62=3;
                }
                break;
            case 105:
                {
                alt62=4;
                }
                break;
            case 106:
                {
                alt62=5;
                }
                break;
            case 107:
                {
                alt62=6;
                }
                break;
            case 108:
                {
                alt62=7;
                }
                break;
            case 109:
                {
                alt62=8;
                }
                break;
            case 110:
                {
                alt62=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3298:3: lv_key_1_1= 'line-width'
                    {
                    lv_key_1_1=(Token)match(input,103,FOLLOW_103_in_ruleIntegerFeature6947); 

                            newLeafNode(lv_key_1_1, grammarAccess.getIntegerFeatureAccess().getKeyLineWidthKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3310:8: lv_key_1_2= 'top'
                    {
                    lv_key_1_2=(Token)match(input,104,FOLLOW_104_in_ruleIntegerFeature6976); 

                            newLeafNode(lv_key_1_2, grammarAccess.getIntegerFeatureAccess().getKeyTopKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3322:8: lv_key_1_3= 'left'
                    {
                    lv_key_1_3=(Token)match(input,72,FOLLOW_72_in_ruleIntegerFeature7005); 

                            newLeafNode(lv_key_1_3, grammarAccess.getIntegerFeatureAccess().getKeyLeftKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3334:8: lv_key_1_4= 'width'
                    {
                    lv_key_1_4=(Token)match(input,105,FOLLOW_105_in_ruleIntegerFeature7034); 

                            newLeafNode(lv_key_1_4, grammarAccess.getIntegerFeatureAccess().getKeyWidthKeyword_1_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3346:8: lv_key_1_5= 'height'
                    {
                    lv_key_1_5=(Token)match(input,106,FOLLOW_106_in_ruleIntegerFeature7063); 

                            newLeafNode(lv_key_1_5, grammarAccess.getIntegerFeatureAccess().getKeyHeightKeyword_1_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3358:8: lv_key_1_6= 'angle'
                    {
                    lv_key_1_6=(Token)match(input,107,FOLLOW_107_in_ruleIntegerFeature7092); 

                            newLeafNode(lv_key_1_6, grammarAccess.getIntegerFeatureAccess().getKeyAngleKeyword_1_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3370:8: lv_key_1_7= 'corner'
                    {
                    lv_key_1_7=(Token)match(input,108,FOLLOW_108_in_ruleIntegerFeature7121); 

                            newLeafNode(lv_key_1_7, grammarAccess.getIntegerFeatureAccess().getKeyCornerKeyword_1_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3382:8: lv_key_1_8= 'transparency'
                    {
                    lv_key_1_8=(Token)match(input,109,FOLLOW_109_in_ruleIntegerFeature7150); 

                            newLeafNode(lv_key_1_8, grammarAccess.getIntegerFeatureAccess().getKeyTransparencyKeyword_1_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3394:8: lv_key_1_9= 'font-size'
                    {
                    lv_key_1_9=(Token)match(input,110,FOLLOW_110_in_ruleIntegerFeature7179); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleIntegerFeature7207); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3413:1: ( (lv_value_3_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3414:1: (lv_value_3_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3414:1: (lv_value_3_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3415:3: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerFeature7224); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3441:1: entryRuleStringFeature returns [EObject current=null] : iv_ruleStringFeature= ruleStringFeature EOF ;
    public final EObject entryRuleStringFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3442:2: (iv_ruleStringFeature= ruleStringFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3443:2: iv_ruleStringFeature= ruleStringFeature EOF
            {
             newCompositeNode(grammarAccess.getStringFeatureRule()); 
            pushFollow(FOLLOW_ruleStringFeature_in_entryRuleStringFeature7267);
            iv_ruleStringFeature=ruleStringFeature();

            state._fsp--;

             current =iv_ruleStringFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFeature7277); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3450:1: ruleStringFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3453:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3454:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3454:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3454:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )?
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3454:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3455:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3455:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3456:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleStringFeature7323);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3472:3: ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3473:1: ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3473:1: ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3474:1: (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3474:1: (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt64=1;
                }
                break;
            case 112:
                {
                alt64=2;
                }
                break;
            case 22:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3475:3: lv_key_1_1= 'text-value'
                    {
                    lv_key_1_1=(Token)match(input,111,FOLLOW_111_in_ruleStringFeature7344); 

                            newLeafNode(lv_key_1_1, grammarAccess.getStringFeatureAccess().getKeyTextValueKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3487:8: lv_key_1_2= 'font-name'
                    {
                    lv_key_1_2=(Token)match(input,112,FOLLOW_112_in_ruleStringFeature7373); 

                            newLeafNode(lv_key_1_2, grammarAccess.getStringFeatureAccess().getKeyFontNameKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3499:8: lv_key_1_3= 'icon'
                    {
                    lv_key_1_3=(Token)match(input,22,FOLLOW_22_in_ruleStringFeature7402); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStringFeature7430); 

                	newLeafNode(otherlv_2, grammarAccess.getStringFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3518:1: ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )?
            int alt65=6;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3518:2: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3518:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3519:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3519:1: (lv_value_3_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3520:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7448); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3537:6: ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3537:6: ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3537:7: ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3537:7: ( (lv_valueL_4_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3538:1: (lv_valueL_4_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3538:1: (lv_valueL_4_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3539:3: lv_valueL_4_0= RULE_STRING
                    {
                    lv_valueL_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7477); 

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

                    otherlv_5=(Token)match(input,113,FOLLOW_113_in_ruleStringFeature7494); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_1_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3559:1: ( (lv_attribute_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3560:1: (lv_attribute_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3560:1: (lv_attribute_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3561:3: lv_attribute_6_0= RULE_ID
                    {
                    lv_attribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7511); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3578:6: ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3578:6: ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3578:7: ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3578:7: ( (lv_attribute_7_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3579:1: (lv_attribute_7_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3579:1: (lv_attribute_7_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3580:3: lv_attribute_7_0= RULE_ID
                    {
                    lv_attribute_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7541); 

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

                    otherlv_8=(Token)match(input,113,FOLLOW_113_in_ruleStringFeature7558); 

                        	newLeafNode(otherlv_8, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_2_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3600:1: ( (lv_valueR_9_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3601:1: (lv_valueR_9_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3601:1: (lv_valueR_9_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3602:3: lv_valueR_9_0= RULE_STRING
                    {
                    lv_valueR_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7575); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3619:6: ( (lv_attribute_10_0= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3619:6: ( (lv_attribute_10_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3620:1: (lv_attribute_10_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3620:1: (lv_attribute_10_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3621:3: lv_attribute_10_0= RULE_ID
                    {
                    lv_attribute_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7604); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3638:6: ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3638:6: ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3638:7: ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3638:7: ( (lv_valueL_11_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3639:1: (lv_valueL_11_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3639:1: (lv_valueL_11_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3640:3: lv_valueL_11_0= RULE_STRING
                    {
                    lv_valueL_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7633); 

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

                    otherlv_12=(Token)match(input,113,FOLLOW_113_in_ruleStringFeature7650); 

                        	newLeafNode(otherlv_12, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_4_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3660:1: ( (lv_attribute_13_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3661:1: (lv_attribute_13_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3661:1: (lv_attribute_13_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3662:3: lv_attribute_13_0= RULE_ID
                    {
                    lv_attribute_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7667); 

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

                    otherlv_14=(Token)match(input,113,FOLLOW_113_in_ruleStringFeature7684); 

                        	newLeafNode(otherlv_14, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_4_3());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3682:1: ( (lv_valueR_15_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3683:1: (lv_valueR_15_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3683:1: (lv_valueR_15_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3684:3: lv_valueR_15_0= RULE_STRING
                    {
                    lv_valueR_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7701); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3708:1: entryRuleBooleanFeature returns [EObject current=null] : iv_ruleBooleanFeature= ruleBooleanFeature EOF ;
    public final EObject entryRuleBooleanFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3709:2: (iv_ruleBooleanFeature= ruleBooleanFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3710:2: iv_ruleBooleanFeature= ruleBooleanFeature EOF
            {
             newCompositeNode(grammarAccess.getBooleanFeatureRule()); 
            pushFollow(FOLLOW_ruleBooleanFeature_in_entryRuleBooleanFeature7745);
            iv_ruleBooleanFeature=ruleBooleanFeature();

            state._fsp--;

             current =iv_ruleBooleanFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanFeature7755); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3717:1: ruleBooleanFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3720:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3721:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3721:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3721:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3721:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3722:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3722:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3723:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleBooleanFeature7801);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3739:3: ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3740:1: ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3740:1: ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3741:1: (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3741:1: (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt67=1;
                }
                break;
            case 115:
                {
                alt67=2;
                }
                break;
            case 116:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3742:3: lv_key_1_1= 'text-editable'
                    {
                    lv_key_1_1=(Token)match(input,114,FOLLOW_114_in_ruleBooleanFeature7822); 

                            newLeafNode(lv_key_1_1, grammarAccess.getBooleanFeatureAccess().getKeyTextEditableKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3754:8: lv_key_1_2= 'font-italic'
                    {
                    lv_key_1_2=(Token)match(input,115,FOLLOW_115_in_ruleBooleanFeature7851); 

                            newLeafNode(lv_key_1_2, grammarAccess.getBooleanFeatureAccess().getKeyFontItalicKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3766:8: lv_key_1_3= 'font-bold'
                    {
                    lv_key_1_3=(Token)match(input,116,FOLLOW_116_in_ruleBooleanFeature7880); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBooleanFeature7908); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3785:1: ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3786:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3786:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3787:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3787:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3788:3: lv_value_3_1= 'true'
                    {
                    lv_value_3_1=(Token)match(input,117,FOLLOW_117_in_ruleBooleanFeature7928); 

                            newLeafNode(lv_value_3_1, grammarAccess.getBooleanFeatureAccess().getValueTrueKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3800:8: lv_value_3_2= 'false'
                    {
                    lv_value_3_2=(Token)match(input,118,FOLLOW_118_in_ruleBooleanFeature7957); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3823:1: entryRuleLineFeature returns [EObject current=null] : iv_ruleLineFeature= ruleLineFeature EOF ;
    public final EObject entryRuleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3824:2: (iv_ruleLineFeature= ruleLineFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3825:2: iv_ruleLineFeature= ruleLineFeature EOF
            {
             newCompositeNode(grammarAccess.getLineFeatureRule()); 
            pushFollow(FOLLOW_ruleLineFeature_in_entryRuleLineFeature8009);
            iv_ruleLineFeature=ruleLineFeature();

            state._fsp--;

             current =iv_ruleLineFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineFeature8019); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3832:1: ruleLineFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) ) ;
    public final EObject ruleLineFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3835:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3836:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3836:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3836:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3836:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3837:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3837:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3838:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleLineFeature8065);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3854:3: ( (lv_key_1_0= 'line-style' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3855:1: (lv_key_1_0= 'line-style' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3855:1: (lv_key_1_0= 'line-style' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3856:3: lv_key_1_0= 'line-style'
            {
            lv_key_1_0=(Token)match(input,119,FOLLOW_119_in_ruleLineFeature8084); 

                    newLeafNode(lv_key_1_0, grammarAccess.getLineFeatureAccess().getKeyLineStyleKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLineFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_1_0, "line-style");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLineFeature8109); 

                	newLeafNode(otherlv_2, grammarAccess.getLineFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3873:1: ( (lv_value_3_0= ruleLineStyle ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3874:1: (lv_value_3_0= ruleLineStyle )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3874:1: (lv_value_3_0= ruleLineStyle )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3875:3: lv_value_3_0= ruleLineStyle
            {
             
            	        newCompositeNode(grammarAccess.getLineFeatureAccess().getValueLineStyleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLineStyle_in_ruleLineFeature8130);
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3899:1: entryRuleLineStyle returns [String current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final String entryRuleLineStyle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3900:2: (iv_ruleLineStyle= ruleLineStyle EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3901:2: iv_ruleLineStyle= ruleLineStyle EOF
            {
             newCompositeNode(grammarAccess.getLineStyleRule()); 
            pushFollow(FOLLOW_ruleLineStyle_in_entryRuleLineStyle8167);
            iv_ruleLineStyle=ruleLineStyle();

            state._fsp--;

             current =iv_ruleLineStyle.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineStyle8178); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3908:1: ruleLineStyle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' ) ;
    public final AntlrDatatypeRuleToken ruleLineStyle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3911:28: ( (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3912:1: (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3912:1: (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' )
            int alt70=4;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt70=1;
                }
                break;
            case 121:
                {
                alt70=2;
                }
                break;
            case 122:
                {
                alt70=3;
                }
                break;
            case 123:
                {
                alt70=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3913:2: kw= 'solid'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_ruleLineStyle8216); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getSolidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3920:2: kw= 'dash'
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_ruleLineStyle8235); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getDashKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3927:2: kw= 'dot'
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleLineStyle8254); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getDotKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3934:2: kw= 'dashdot'
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleLineStyle8273); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3947:1: entryRuleAtributeExpression returns [EObject current=null] : iv_ruleAtributeExpression= ruleAtributeExpression EOF ;
    public final EObject entryRuleAtributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributeExpression = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3948:2: (iv_ruleAtributeExpression= ruleAtributeExpression EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3949:2: iv_ruleAtributeExpression= ruleAtributeExpression EOF
            {
             newCompositeNode(grammarAccess.getAtributeExpressionRule()); 
            pushFollow(FOLLOW_ruleAtributeExpression_in_entryRuleAtributeExpression8313);
            iv_ruleAtributeExpression=ruleAtributeExpression();

            state._fsp--;

             current =iv_ruleAtributeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributeExpression8323); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3956:1: ruleAtributeExpression returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' ) ;
    public final EObject ruleAtributeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3959:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3960:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3960:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3960:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->'
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3960:2: ( (lv_key_0_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3961:1: (lv_key_0_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3961:1: (lv_key_0_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3962:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributeExpression8365); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3978:2: ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3979:1: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3979:1: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3980:1: (lv_operator_1_1= '=' | lv_operator_1_2= '<>' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3980:1: (lv_operator_1_1= '=' | lv_operator_1_2= '<>' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==25) ) {
                alt71=1;
            }
            else if ( (LA71_0==90) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3981:3: lv_operator_1_1= '='
                    {
                    lv_operator_1_1=(Token)match(input,25,FOLLOW_25_in_ruleAtributeExpression8390); 

                            newLeafNode(lv_operator_1_1, grammarAccess.getAtributeExpressionAccess().getOperatorEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3993:8: lv_operator_1_2= '<>'
                    {
                    lv_operator_1_2=(Token)match(input,90,FOLLOW_90_in_ruleAtributeExpression8419); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4008:2: ( (lv_value_2_0= ruleAtributeValue ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4009:1: (lv_value_2_0= ruleAtributeValue )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4009:1: (lv_value_2_0= ruleAtributeValue )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4010:3: lv_value_2_0= ruleAtributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAtributeExpressionAccess().getValueAtributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtributeValue_in_ruleAtributeExpression8456);
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

            otherlv_3=(Token)match(input,124,FOLLOW_124_in_ruleAtributeExpression8468); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4038:1: entryRuleAtributeValue returns [EObject current=null] : iv_ruleAtributeValue= ruleAtributeValue EOF ;
    public final EObject entryRuleAtributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributeValue = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4039:2: (iv_ruleAtributeValue= ruleAtributeValue EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4040:2: iv_ruleAtributeValue= ruleAtributeValue EOF
            {
             newCompositeNode(grammarAccess.getAtributeValueRule()); 
            pushFollow(FOLLOW_ruleAtributeValue_in_entryRuleAtributeValue8504);
            iv_ruleAtributeValue=ruleAtributeValue();

            state._fsp--;

             current =iv_ruleAtributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributeValue8514); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4047:1: ruleAtributeValue returns [EObject current=null] : ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4050:28: ( ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4051:1: ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4051:1: ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) )
            int alt73=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt73=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 19:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                case 31:
                case 40:
                case 41:
                case 42:
                case 52:
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
                    alt73=1;
                    }
                    break;
                case 54:
                    {
                    alt73=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt73=3;
                }
                break;
            case 117:
            case 118:
                {
                alt73=4;
                }
                break;
            case RULE_STRING:
                {
                alt73=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4051:2: ( (lv_valueINT_0_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4051:2: ( (lv_valueINT_0_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4052:1: (lv_valueINT_0_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4052:1: (lv_valueINT_0_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4053:3: lv_valueINT_0_0= RULE_INT
                    {
                    lv_valueINT_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8556); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4070:6: ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4070:6: ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4070:7: ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4070:7: ( (lv_valueINT_1_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4071:1: (lv_valueINT_1_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4071:1: (lv_valueINT_1_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4072:3: lv_valueINT_1_0= RULE_INT
                    {
                    lv_valueINT_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8585); 

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

                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAtributeValue8602); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtributeValueAccess().getFullStopKeyword_1_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4092:1: ( (lv_valueDEC_3_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4093:1: (lv_valueDEC_3_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4093:1: (lv_valueDEC_3_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4094:3: lv_valueDEC_3_0= RULE_INT
                    {
                    lv_valueDEC_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8619); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4111:6: ( (lv_valueID_4_0= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4111:6: ( (lv_valueID_4_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4112:1: (lv_valueID_4_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4112:1: (lv_valueID_4_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4113:3: lv_valueID_4_0= RULE_ID
                    {
                    lv_valueID_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributeValue8648); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4130:6: ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4130:6: ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4131:1: ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4131:1: ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4132:1: (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4132:1: (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==117) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==118) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4133:3: lv_valueBOOL_5_1= 'true'
                            {
                            lv_valueBOOL_5_1=(Token)match(input,117,FOLLOW_117_in_ruleAtributeValue8679); 

                                    newLeafNode(lv_valueBOOL_5_1, grammarAccess.getAtributeValueAccess().getValueBOOLTrueKeyword_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtributeValueRule());
                            	        }
                                   		setWithLastConsumed(current, "valueBOOL", lv_valueBOOL_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4145:8: lv_valueBOOL_5_2= 'false'
                            {
                            lv_valueBOOL_5_2=(Token)match(input,118,FOLLOW_118_in_ruleAtributeValue8708); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4161:6: ( (lv_valueSTRING_6_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4161:6: ( (lv_valueSTRING_6_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4162:1: (lv_valueSTRING_6_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4162:1: (lv_valueSTRING_6_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4163:3: lv_valueSTRING_6_0= RULE_STRING
                    {
                    lv_valueSTRING_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributeValue8747); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4180:6: ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4180:6: ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4180:7: ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4180:7: ( (lv_valueDAY_7_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4181:1: (lv_valueDAY_7_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4181:1: (lv_valueDAY_7_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4182:3: lv_valueDAY_7_0= RULE_INT
                    {
                    lv_valueDAY_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8776); 

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

                    otherlv_8=(Token)match(input,54,FOLLOW_54_in_ruleAtributeValue8793); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtributeValueAccess().getHyphenMinusKeyword_5_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4202:1: ( (lv_valueMONTH_9_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4203:1: (lv_valueMONTH_9_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4203:1: (lv_valueMONTH_9_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4204:3: lv_valueMONTH_9_0= RULE_INT
                    {
                    lv_valueMONTH_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8810); 

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

                    otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleAtributeValue8827); 

                        	newLeafNode(otherlv_10, grammarAccess.getAtributeValueAccess().getHyphenMinusKeyword_5_3());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4224:1: ( (lv_valueYEAR_11_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4225:1: (lv_valueYEAR_11_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4225:1: (lv_valueYEAR_11_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4226:3: lv_valueYEAR_11_0= RULE_INT
                    {
                    lv_valueYEAR_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8844); 

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


    // $ANTLR start "entryRuleAttributeReference"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4250:1: entryRuleAttributeReference returns [EObject current=null] : iv_ruleAttributeReference= ruleAttributeReference EOF ;
    public final EObject entryRuleAttributeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeReference = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4251:2: (iv_ruleAttributeReference= ruleAttributeReference EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4252:2: iv_ruleAttributeReference= ruleAttributeReference EOF
            {
             newCompositeNode(grammarAccess.getAttributeReferenceRule()); 
            pushFollow(FOLLOW_ruleAttributeReference_in_entryRuleAttributeReference8886);
            iv_ruleAttributeReference=ruleAttributeReference();

            state._fsp--;

             current =iv_ruleAttributeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeReference8896); 

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
    // $ANTLR end "entryRuleAttributeReference"


    // $ANTLR start "ruleAttributeReference"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4259:1: ruleAttributeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '/' ( (lv_path_2_0= ruleAttributeReference ) ) )* ) ;
    public final EObject ruleAttributeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4262:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '/' ( (lv_path_2_0= ruleAttributeReference ) ) )* ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4263:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '/' ( (lv_path_2_0= ruleAttributeReference ) ) )* )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4263:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '/' ( (lv_path_2_0= ruleAttributeReference ) ) )* )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4263:2: ( ( ruleQualifiedName ) ) (otherlv_1= '/' ( (lv_path_2_0= ruleAttributeReference ) ) )*
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4263:2: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4264:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4264:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4265:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeReferenceAccess().getModelAttributeEAttributeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttributeReference8944);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4278:2: (otherlv_1= '/' ( (lv_path_2_0= ruleAttributeReference ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==125) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4278:4: otherlv_1= '/' ( (lv_path_2_0= ruleAttributeReference ) )
            	    {
            	    otherlv_1=(Token)match(input,125,FOLLOW_125_in_ruleAttributeReference8957); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAttributeReferenceAccess().getSolidusKeyword_1_0());
            	        
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4282:1: ( (lv_path_2_0= ruleAttributeReference ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4283:1: (lv_path_2_0= ruleAttributeReference )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4283:1: (lv_path_2_0= ruleAttributeReference )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4284:3: lv_path_2_0= ruleAttributeReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeReferenceAccess().getPathAttributeReferenceParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeReference_in_ruleAttributeReference8978);
            	    lv_path_2_0=ruleAttributeReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeReferenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"path",
            	            		lv_path_2_0, 
            	            		"AttributeReference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // $ANTLR end "ruleAttributeReference"


    // $ANTLR start "ruleFigureShape"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4308:1: ruleFigureShape returns [Enumerator current=null] : ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4310:28: ( ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4311:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4311:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) )
            int alt75=11;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt75=1;
                }
                break;
            case 127:
                {
                alt75=2;
                }
                break;
            case 128:
                {
                alt75=3;
                }
                break;
            case 129:
                {
                alt75=4;
                }
                break;
            case 130:
                {
                alt75=5;
                }
                break;
            case 48:
                {
                alt75=6;
                }
                break;
            case 49:
                {
                alt75=7;
                }
                break;
            case 50:
                {
                alt75=8;
                }
                break;
            case 51:
                {
                alt75=9;
                }
                break;
            case 45:
                {
                alt75=10;
                }
                break;
            case 131:
                {
                alt75=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4311:2: (enumLiteral_0= 'Square' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4311:2: (enumLiteral_0= 'Square' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4311:4: enumLiteral_0= 'Square'
                    {
                    enumLiteral_0=(Token)match(input,126,FOLLOW_126_in_ruleFigureShape9030); 

                            current = grammarAccess.getFigureShapeAccess().getSQUAREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFigureShapeAccess().getSQUAREEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4317:6: (enumLiteral_1= 'Rectangle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4317:6: (enumLiteral_1= 'Rectangle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4317:8: enumLiteral_1= 'Rectangle'
                    {
                    enumLiteral_1=(Token)match(input,127,FOLLOW_127_in_ruleFigureShape9047); 

                            current = grammarAccess.getFigureShapeAccess().getRECTANGLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFigureShapeAccess().getRECTANGLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4323:6: (enumLiteral_2= 'RoundedRectangle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4323:6: (enumLiteral_2= 'RoundedRectangle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4323:8: enumLiteral_2= 'RoundedRectangle'
                    {
                    enumLiteral_2=(Token)match(input,128,FOLLOW_128_in_ruleFigureShape9064); 

                            current = grammarAccess.getFigureShapeAccess().getROUNDED_RECTANGLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFigureShapeAccess().getROUNDED_RECTANGLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4329:6: (enumLiteral_3= 'Circle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4329:6: (enumLiteral_3= 'Circle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4329:8: enumLiteral_3= 'Circle'
                    {
                    enumLiteral_3=(Token)match(input,129,FOLLOW_129_in_ruleFigureShape9081); 

                            current = grammarAccess.getFigureShapeAccess().getCIRCLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFigureShapeAccess().getCIRCLEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4335:6: (enumLiteral_4= 'Ellipse' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4335:6: (enumLiteral_4= 'Ellipse' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4335:8: enumLiteral_4= 'Ellipse'
                    {
                    enumLiteral_4=(Token)match(input,130,FOLLOW_130_in_ruleFigureShape9098); 

                            current = grammarAccess.getFigureShapeAccess().getELLIPSEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFigureShapeAccess().getELLIPSEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4341:6: (enumLiteral_5= 'Triangle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4341:6: (enumLiteral_5= 'Triangle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4341:8: enumLiteral_5= 'Triangle'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_48_in_ruleFigureShape9115); 

                            current = grammarAccess.getFigureShapeAccess().getTRIANGLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFigureShapeAccess().getTRIANGLEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4347:6: (enumLiteral_6= 'Rhombus' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4347:6: (enumLiteral_6= 'Rhombus' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4347:8: enumLiteral_6= 'Rhombus'
                    {
                    enumLiteral_6=(Token)match(input,49,FOLLOW_49_in_ruleFigureShape9132); 

                            current = grammarAccess.getFigureShapeAccess().getRHOMBUSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getFigureShapeAccess().getRHOMBUSEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4353:6: (enumLiteral_7= 'Polygon' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4353:6: (enumLiteral_7= 'Polygon' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4353:8: enumLiteral_7= 'Polygon'
                    {
                    enumLiteral_7=(Token)match(input,50,FOLLOW_50_in_ruleFigureShape9149); 

                            current = grammarAccess.getFigureShapeAccess().getPOLYGONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getFigureShapeAccess().getPOLYGONEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4359:6: (enumLiteral_8= 'Polyline' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4359:6: (enumLiteral_8= 'Polyline' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4359:8: enumLiteral_8= 'Polyline'
                    {
                    enumLiteral_8=(Token)match(input,51,FOLLOW_51_in_ruleFigureShape9166); 

                            current = grammarAccess.getFigureShapeAccess().getPOLYLINEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getFigureShapeAccess().getPOLYLINEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4365:6: (enumLiteral_9= 'Label' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4365:6: (enumLiteral_9= 'Label' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4365:8: enumLiteral_9= 'Label'
                    {
                    enumLiteral_9=(Token)match(input,45,FOLLOW_45_in_ruleFigureShape9183); 

                            current = grammarAccess.getFigureShapeAccess().getLABELEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getFigureShapeAccess().getLABELEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4371:6: (enumLiteral_10= 'Image' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4371:6: (enumLiteral_10= 'Image' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4371:8: enumLiteral_10= 'Image'
                    {
                    enumLiteral_10=(Token)match(input,131,FOLLOW_131_in_ruleFigureShape9200); 

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


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA28_eotS =
        "\25\uffff";
    static final String DFA28_eofS =
        "\25\uffff";
    static final String DFA28_minS =
        "\1\5\2\uffff\1\31\3\uffff\2\4\1\16\4\174\1\110\2\6\1\66\1\174\1"+
        "\6\1\174";
    static final String DFA28_maxS =
        "\1\167\2\uffff\1\132\3\uffff\2\166\5\174\1\167\2\6\1\66\1\174\1"+
        "\6\1\174";
    static final String DFA28_acceptS =
        "\1\uffff\1\5\1\1\1\uffff\1\2\1\3\1\4\16\uffff";
    static final String DFA28_specialS =
        "\25\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\3\15\uffff\1\1\4\uffff\1\2\17\uffff\3\1\35\uffff\1\6\15\uffff"+
            "\3\5\16\uffff\10\6\10\uffff\1\4",
            "",
            "",
            "\1\7\100\uffff\1\10",
            "",
            "",
            "",
            "\1\15\1\12\1\11\156\uffff\1\13\1\14",
            "\1\15\1\12\1\11\156\uffff\1\13\1\14",
            "\1\20\47\uffff\1\17\105\uffff\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\6\15\uffff\3\5\16\uffff\10\6\10\uffff\1\4",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\16",
            "\1\24",
            "\1\16"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 1152:4: ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )*";
        }
    }
    static final String DFA50_eotS =
        "\34\uffff";
    static final String DFA50_eofS =
        "\1\1\33\uffff";
    static final String DFA50_minS =
        "\1\5\1\uffff\1\31\13\uffff\2\4\1\16\4\174\1\26\2\6\1\174\1\66\1"+
        "\6\1\174";
    static final String DFA50_maxS =
        "\1\167\1\uffff\1\132\13\uffff\2\166\5\174\1\167\2\6\1\174\1\66\1"+
        "\6\1\174";
    static final String DFA50_acceptS =
        "\1\uffff\1\14\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
        "\1\13\16\uffff";
    static final String DFA50_specialS =
        "\34\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\15\uffff\1\1\2\uffff\1\15\57\uffff\1\4\1\5\1\13\2\uffff"+
            "\1\6\7\uffff\1\7\1\10\1\11\3\12\16\uffff\10\13\2\15\1\uffff"+
            "\3\14\2\uffff\1\3",
            "",
            "\1\16\100\uffff\1\17",
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
            "\1\24\1\21\1\20\156\uffff\1\22\1\23",
            "\1\24\1\21\1\20\156\uffff\1\22\1\23",
            "\1\26\47\uffff\1\27\105\uffff\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\15\61\uffff\1\13\15\uffff\3\12\16\uffff\10\13\2\15\1\uffff"+
            "\3\14\2\uffff\1\3",
            "\1\30",
            "\1\31",
            "\1\25",
            "\1\32",
            "\1\33",
            "\1\25"
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "()* loopback of 2096:2: ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )*";
        }
    }
    static final String DFA65_eotS =
        "\13\uffff";
    static final String DFA65_eofS =
        "\1\3\1\4\1\6\5\uffff\1\11\2\uffff";
    static final String DFA65_minS =
        "\1\4\2\5\2\uffff\1\5\2\uffff\1\5\2\uffff";
    static final String DFA65_maxS =
        "\3\167\2\uffff\1\5\2\uffff\1\167\2\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\1\6\1\1\1\uffff\1\4\1\3\1\uffff\1\2\1\5";
    static final String DFA65_specialS =
        "\13\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\1\2\15\uffff\1\3\2\uffff\1\3\57\uffff\3\3\2\uffff\1\3\7"+
            "\uffff\6\3\16\uffff\12\3\1\uffff\3\3\2\uffff\1\3",
            "\1\4\15\uffff\1\4\2\uffff\1\4\57\uffff\3\4\2\uffff\1\4\7\uffff"+
            "\6\4\16\uffff\12\4\1\5\3\4\2\uffff\1\4",
            "\1\6\15\uffff\1\6\2\uffff\1\6\2\uffff\1\3\54\uffff\3\6\2\uffff"+
            "\1\6\7\uffff\6\6\1\uffff\1\3\14\uffff\12\6\1\7\3\6\2\uffff\1"+
            "\6",
            "",
            "",
            "\1\10",
            "",
            "",
            "\1\11\15\uffff\1\11\2\uffff\1\11\57\uffff\3\11\2\uffff\1\11"+
            "\7\uffff\6\11\16\uffff\12\11\1\12\3\11\2\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3518:1: ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleXDiagram_in_entryRuleXDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleXDiagram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXDiagram139 = new BitSet(new long[]{0x0000000000013000L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleXDiagram165 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleXDiagram186 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleXDiagram199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXDiagram222 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleNode_in_ruleXDiagram244 = new BitSet(new long[]{0x0000000800100020L});
    public static final BitSet FOLLOW_ruleLink_in_ruleXDiagram271 = new BitSet(new long[]{0x0000000800100020L});
    public static final BitSet FOLLOW_ruleAttributeReference_in_ruleXDiagram294 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportStatement388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportStatement409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName499 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName533 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard639 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard658 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStyle760 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStyle772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStyle789 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStyle806 = new BitSet(new long[]{0x0000000000480020L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleStyle827 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStyle839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNode924 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNode947 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNode959 = new BitSet(new long[]{0x00100000EDE90000L});
    public static final BitSet FOLLOW_21_in_ruleNode977 = new BitSet(new long[]{0x00100000EDC90000L});
    public static final BitSet FOLLOW_16_in_ruleNode1004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1021 = new BitSet(new long[]{0x00100000EDC80000L});
    public static final BitSet FOLLOW_22_in_ruleNode1041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1058 = new BitSet(new long[]{0x00100000ED880000L});
    public static final BitSet FOLLOW_23_in_ruleNode1078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode1095 = new BitSet(new long[]{0x00100000ED080000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleNode1123 = new BitSet(new long[]{0x00100000ED080000L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_ruleNode1145 = new BitSet(new long[]{0x00100000EC080000L});
    public static final BitSet FOLLOW_ruleNodeContainer_in_ruleNode1167 = new BitSet(new long[]{0x00100000E0080000L});
    public static final BitSet FOLLOW_ruleNodeAnchor_in_ruleNode1189 = new BitSet(new long[]{0x0010000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNode1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAttribute1285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1302 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAttribute1319 = new BitSet(new long[]{0x0000000000000070L,0x0060000000000000L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_ruleAttribute1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_entryRuleNodeFigure1376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeFigure1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNodeFigure1429 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNodeFigure1455 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNodeFigure1467 = new BitSet(new long[]{0x000F200000000000L,0xC000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleFigureShape_in_ruleNodeFigure1488 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_28_in_ruleNodeFigure1501 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNodeFigure1513 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNodeFigure1525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeFigure1542 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeFigure1561 = new BitSet(new long[]{0x0000000000480020L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleNodeFigure1582 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeFigure1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeContainer_in_entryRuleNodeContainer1630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeContainer1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleNodeContainer1685 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_ruleNodeContainer1714 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNodeContainer1743 = new BitSet(new long[]{0x0000000100060000L});
    public static final BitSet FOLLOW_32_in_ruleNodeContainer1756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNodeContainer1779 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleNodeContainer1794 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeContainer1811 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_ruleNodeContainer1836 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_34_in_ruleNodeContainer1865 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeContainer1895 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_ruleNodeContainer1916 = new BitSet(new long[]{0x000000000C080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeContainer1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLink2012 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2036 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_36_in_ruleLink2061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2097 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLink2109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2132 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLink2144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2167 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLink2181 = new BitSet(new long[]{0x0000078001C90020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_39_in_ruleLink2199 = new BitSet(new long[]{0x0000070001C90020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_16_in_ruleLink2226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2243 = new BitSet(new long[]{0x0000070001C80020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_22_in_ruleLink2263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2280 = new BitSet(new long[]{0x0000070001880020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_23_in_ruleLink2300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink2317 = new BitSet(new long[]{0x0000070001080020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleLink2346 = new BitSet(new long[]{0x0000070001080020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_ruleLineFeature_in_ruleLink2373 = new BitSet(new long[]{0x0000070001080020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleLink2400 = new BitSet(new long[]{0x0000070001080020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_ruleIntegerFeature_in_ruleLink2427 = new BitSet(new long[]{0x0000070001080020L,0x00807F8001C00100L});
    public static final BitSet FOLLOW_40_in_ruleLink2442 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLink2454 = new BitSet(new long[]{0x0000100008080000L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_ruleLink2475 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_ruleLink2497 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_19_in_ruleLink2510 = new BitSet(new long[]{0x0000060000080000L});
    public static final BitSet FOLLOW_41_in_ruleLink2525 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLink2537 = new BitSet(new long[]{0x0000100008080000L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_ruleLink2558 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_ruleLink2580 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_19_in_ruleLink2593 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_rulePlacingFigure_in_ruleLink2616 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_19_in_ruleLink2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlacingFigure_in_entryRulePlacingFigure2665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlacingFigure2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePlacingFigure2712 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rulePlacingFigure2724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlacingFigure2741 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePlacingFigure2758 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePlacingFigure2770 = new BitSet(new long[]{0x0000100008080000L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_rulePlacingFigure2791 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_rulePlacingFigure2813 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_19_in_rulePlacingFigure2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_entryRuleDynamicFigure2862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicFigure2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDynamicFigure2909 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleDynamicElement_in_ruleDynamicFigure2930 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDynamicFigure2942 = new BitSet(new long[]{0x0000000000480020L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleDynamicFigure2963 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDynamicFigure2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicElement_in_entryRuleDynamicElement3012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicElement3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDynamicElement3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDynamicElement3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_entryRuleStaticFigure3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticFigure3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleStaticFigure3167 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStaticFigure3179 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_ruleStaticElement_in_ruleStaticFigure3200 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_28_in_ruleStaticFigure3213 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStaticFigure3225 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStaticFigure3237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStaticFigure3254 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStaticFigure3273 = new BitSet(new long[]{0x0000000000480020L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleStaticFigure3294 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStaticFigure3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticElement_in_entryRuleStaticElement3343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticElement3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleStaticElement3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleStaticElement3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleStaticElement3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleStaticElement3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleStaticElement3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAnchor_in_entryRuleNodeAnchor3508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAnchor3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNodeAnchor3555 = new BitSet(new long[]{0x0020000000020000L});
    public static final BitSet FOLLOW_53_in_ruleNodeAnchor3568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeAnchor3585 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNodeAnchor3604 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_54_in_ruleNodeAnchor3622 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeAnchor3653 = new BitSet(new long[]{0x0180000200000000L});
    public static final BitSet FOLLOW_33_in_ruleNodeAnchor3678 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_55_in_ruleNodeAnchor3707 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_56_in_ruleNodeAnchor3736 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNodeAnchor3764 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_54_in_ruleNodeAnchor3782 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeAnchor3813 = new BitSet(new long[]{0x0600000200000000L});
    public static final BitSet FOLLOW_33_in_ruleNodeAnchor3838 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_57_in_ruleNodeAnchor3867 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_58_in_ruleNodeAnchor3896 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeAnchor3924 = new BitSet(new long[]{0x000000000D080000L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_ruleNodeAnchor3945 = new BitSet(new long[]{0x000000000D080000L});
    public static final BitSet FOLLOW_ruleArrowAnchor_in_ruleNodeAnchor3967 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeAnchor3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowAnchor_in_entryRuleArrowAnchor4016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowAnchor4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleArrowAnchor4063 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArrowAnchor4080 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleArrowAnchor4097 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleArrowAnchor4117 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleArrowAnchor4146 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleArrowAnchor4175 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleArrowAnchor4203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleArrowAnchor4216 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArrowAnchor4233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleArrowAnchor4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_entryRuleFigureFeatures4288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFigureFeatures4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineFeature_in_ruleFigureFeatures4354 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleCenterFeature_in_ruleFigureFeatures4381 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleAlignFeature_in_ruleFigureFeatures4408 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleGradientFeature_in_ruleFigureFeatures4435 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_rulePointFeature_in_ruleFigureFeatures4462 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_ruleFigureFeatures4489 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_rulePositionFeature_in_ruleFigureFeatures4516 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleFigureFeatures4543 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleIntegerFeature_in_ruleFigureFeatures4570 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleBooleanFeature_in_ruleFigureFeatures4597 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleStringFeature_in_ruleFigureFeatures4624 = new BitSet(new long[]{0x0000000000400022L,0x009DFF8001F809C0L});
    public static final BitSet FOLLOW_ruleLayoutFeature_in_entryRuleLayoutFeature4664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutFeature4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleLayoutFeature4717 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLayoutFeature4742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleLayoutFeature4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLayoutFeature4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleLayoutFeature4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCenterFeature_in_entryRuleCenterFeature4872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCenterFeature4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCenterFeature4925 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCenterFeature4950 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleCenterFeature4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCenterFeature4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCenterFeature5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignFeature_in_entryRuleAlignFeature5080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignFeature5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAlignFeature5133 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAlignFeature5158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_72_in_ruleAlignFeature5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAlignFeature5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAlignFeature5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientFeature_in_entryRuleGradientFeature5288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGradientFeature5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleGradientFeature5341 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGradientFeature5366 = new BitSet(new long[]{0x0000000000000000L,0x000000000007F000L});
    public static final BitSet FOLLOW_76_in_ruleGradientFeature5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleGradientFeature5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleGradientFeature5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleGradientFeature5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleGradientFeature5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleGradientFeature5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleGradientFeature5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointFeature_in_entryRulePointFeature5612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointFeature5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rulePointFeature5659 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePointFeature5671 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePointFeature5688 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePointFeature5705 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePointFeature5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature5763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeFeature5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleSizeFeature5810 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSizeFeature5822 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSizeFeature5839 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSizeFeature5856 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSizeFeature5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionFeature_in_entryRulePositionFeature5914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionFeature5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rulePositionFeature5961 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePositionFeature5973 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionFeature5990 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePositionFeature6007 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionFeature6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature6065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleColorFeature6121 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_86_in_ruleColorFeature6142 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_87_in_ruleColorFeature6171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_88_in_ruleColorFeature6200 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleColorFeature6228 = new BitSet(new long[]{0x0000000000000000L,0x0000001FF0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorFeature6250 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleRGB_in_ruleColorFeature6277 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleColorFeature6291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorFeature6308 = new BitSet(new long[]{0x0000000002000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_25_in_ruleColorFeature6333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_90_in_ruleColorFeature6362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorFeature6395 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleColorFeature6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor6451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleColor6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleColor6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleColor6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleColor6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleColor6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleColor6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleColor6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleColor6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGB_in_entryRuleRGB6673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGB6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleRGB6720 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleRGB6732 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB6749 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRGB6766 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB6783 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRGB6800 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB6817 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleRGB6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature6870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerFeature6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleIntegerFeature6926 = new BitSet(new long[]{0x0000000000000000L,0x00007F8000000100L});
    public static final BitSet FOLLOW_103_in_ruleIntegerFeature6947 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_104_in_ruleIntegerFeature6976 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_72_in_ruleIntegerFeature7005 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_105_in_ruleIntegerFeature7034 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_106_in_ruleIntegerFeature7063 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_107_in_ruleIntegerFeature7092 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_108_in_ruleIntegerFeature7121 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_109_in_ruleIntegerFeature7150 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_110_in_ruleIntegerFeature7179 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIntegerFeature7207 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerFeature7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFeature_in_entryRuleStringFeature7267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFeature7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleStringFeature7323 = new BitSet(new long[]{0x0000000000400000L,0x0001800000000000L});
    public static final BitSet FOLLOW_111_in_ruleStringFeature7344 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_112_in_ruleStringFeature7373 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22_in_ruleStringFeature7402 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStringFeature7430 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7477 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStringFeature7494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7541 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStringFeature7558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7633 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStringFeature7650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7667 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStringFeature7684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanFeature_in_entryRuleBooleanFeature7745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanFeature7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleBooleanFeature7801 = new BitSet(new long[]{0x0000000000000000L,0x001C000000000000L});
    public static final BitSet FOLLOW_114_in_ruleBooleanFeature7822 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_115_in_ruleBooleanFeature7851 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_116_in_ruleBooleanFeature7880 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBooleanFeature7908 = new BitSet(new long[]{0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_117_in_ruleBooleanFeature7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleBooleanFeature7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineFeature_in_entryRuleLineFeature8009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineFeature8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleLineFeature8065 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLineFeature8084 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLineFeature8109 = new BitSet(new long[]{0x0000000000000000L,0x0F00000000000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleLineFeature8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_entryRuleLineStyle8167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineStyle8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleLineStyle8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleLineStyle8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleLineStyle8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLineStyle8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_entryRuleAtributeExpression8313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributeExpression8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributeExpression8365 = new BitSet(new long[]{0x0000000002000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_25_in_ruleAtributeExpression8390 = new BitSet(new long[]{0x0000000000000070L,0x0060000000000000L});
    public static final BitSet FOLLOW_90_in_ruleAtributeExpression8419 = new BitSet(new long[]{0x0000000000000070L,0x0060000000000000L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_ruleAtributeExpression8456 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleAtributeExpression8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_entryRuleAtributeValue8504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributeValue8514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8585 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtributeValue8602 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributeValue8648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleAtributeValue8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleAtributeValue8708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributeValue8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8776 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleAtributeValue8793 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8810 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleAtributeValue8827 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeReference_in_entryRuleAttributeReference8886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeReference8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttributeReference8944 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleAttributeReference8957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAttributeReference_in_ruleAttributeReference8978 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleFigureShape9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleFigureShape9047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleFigureShape9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleFigureShape9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleFigureShape9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFigureShape9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFigureShape9132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleFigureShape9149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFigureShape9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleFigureShape9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleFigureShape9200 = new BitSet(new long[]{0x0000000000000002L});

}