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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'diagram'", "'import'", "'.'", "'*'", "'style'", "':'", "'{'", "'}'", "'node'", "'resizable'", "'icon'", "'name'", "'set'", "'='", "'main'", "'figure'", "','", "'container'", "'for'", "'%'", "'px'", "'link'", "'object'", "'source'", "'target'", "'manhattan'", "'decorator'", "'at'", "'middle'", "'text'", "'Label'", "'Description'", "'Arrow'", "'Triangle'", "'Rhombus'", "'Polygon'", "'Polyline'", "'anchor'", "'to'", "'-'", "'lf'", "'rg'", "'up'", "'dw'", "'as'", "'incoming'", "'outgoing'", "'both'", "'connection'", "'using'", "'connections'", "'layout'", "'horizontal'", "'vertical'", "'over'", "'center'", "'text-align'", "'left'", "'right'", "'gradient'", "'BlueWhite'", "'BlueWhiteGloss'", "'CopperWhiteGloss'", "'LightGray'", "'LightYellow'", "'SilverWhiteGloss'", "'LimeWhite'", "'point'", "'size'", "'position'", "'background'", "'foreground'", "'border'", "'['", "'<>'", "']'", "'WHITE'", "'BLACK'", "'BLUE'", "'GREEN'", "'RED'", "'YELLOW'", "'CYAN'", "'ORANGE'", "'RGB'", "'('", "')'", "'line-width'", "'top'", "'width'", "'height'", "'angle'", "'corner'", "'transparency'", "'font-size'", "'text-value'", "'font-name'", "'+'", "'text-editable'", "'font-italic'", "'font-bold'", "'true'", "'false'", "'line-style'", "'solid'", "'dash'", "'dot'", "'dashdot'", "'->'", "'stack'", "'free'", "'Square'", "'Rectangle'", "'RoundedRectangle'", "'Circle'", "'Ellipse'", "'Image'"
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:77:1: ruleXDiagram returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) otherlv_3= 'diagram' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )* ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )* ) ;
    public final EObject ruleXDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_3=null;
        EObject lv_imports_2_0 = null;

        EObject lv_styles_5_0 = null;

        EObject lv_nodes_6_0 = null;

        EObject lv_links_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:80:28: ( (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) otherlv_3= 'diagram' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )* ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )* ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) otherlv_3= 'diagram' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )* ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )* )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) otherlv_3= 'diagram' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )* ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )* )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:81:3: otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) otherlv_3= 'diagram' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )* ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )*
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleXDiagram177); 

                	newLeafNode(otherlv_3, grammarAccess.getXDiagramAccess().getDiagramKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:125:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:126:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:126:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:127:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getXDiagramRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getXDiagramAccess().getModelClassEClassCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXDiagram200);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:140:2: ( (lv_styles_5_0= ruleStyle ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:141:1: (lv_styles_5_0= ruleStyle )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:141:1: (lv_styles_5_0= ruleStyle )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:142:3: lv_styles_5_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getStylesStyleParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleXDiagram221);
            	    lv_styles_5_0=ruleStyle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"styles",
            	            		lv_styles_5_0, 
            	            		"Style");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:158:3: ( ( (lv_nodes_6_0= ruleNode ) ) | ( (lv_links_7_0= ruleLink ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }
                else if ( (LA2_0==33) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:158:4: ( (lv_nodes_6_0= ruleNode ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:158:4: ( (lv_nodes_6_0= ruleNode ) )
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
            	    break loop2;
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
    // $ANTLR end "ruleXDiagram"


    // $ANTLR start "entryRuleImportStatement"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:203:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:204:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:205:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement309);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;

             current =iv_ruleImportStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement319); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:212:1: ruleImportStatement returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:215:28: ( ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:216:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:216:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:216:2: () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:216:2: ()
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:217:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportStatementAccess().getImportStatementAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:222:2: (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:222:4: otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleImportStatement366); 

                        	newLeafNode(otherlv_1, grammarAccess.getImportStatementAccess().getImportKeyword_1_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:226:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:227:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:227:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:228:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportStatementAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportStatement387);
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:252:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:253:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:254:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName426);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName437); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:261:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:264:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:265:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:265:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:265:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName477); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:272:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:273:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName496); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName511); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:293:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:294:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:295:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard559);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard570); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:302:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:305:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:306:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:306:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:307:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard617);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:317:1: (kw= '.' kw= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:318:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard636); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard649); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:337:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:338:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:339:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle691);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle701); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:346:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:349:28: ( (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:350:1: (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:350:1: (otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:350:3: otherlv_0= 'style' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFigureFeatures ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleStyle738); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStyle750); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:358:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:359:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:359:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:360:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStyle767); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleStyle784); 

                	newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:380:1: ( (lv_features_4_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:381:1: (lv_features_4_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:381:1: (lv_features_4_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:382:3: lv_features_4_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getFeaturesFigureFeaturesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleStyle805);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleStyle817); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:412:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:413:2: (iv_ruleNode= ruleNode EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:414:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode855);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode865); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:421:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:424:28: ( (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:425:1: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:425:1: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:425:3: otherlv_0= 'node' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_resizable_3_0= 'resizable' ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )? (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )? (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_figures_11_0= ruleNodeFigure ) )* ( (lv_containers_12_0= ruleNodeContainer ) )* ( (lv_anchors_13_0= ruleNodeAnchor ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNode902); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:429:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:430:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:430:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:431:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getModelClassEClassCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNode925);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleNode937); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:448:1: ( (lv_resizable_3_0= 'resizable' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:449:1: (lv_resizable_3_0= 'resizable' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:449:1: (lv_resizable_3_0= 'resizable' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:450:3: lv_resizable_3_0= 'resizable'
                    {
                    lv_resizable_3_0=(Token)match(input,21,FOLLOW_21_in_ruleNode955); 

                            newLeafNode(lv_resizable_3_0, grammarAccess.getNodeAccess().getResizableResizableKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(current, "resizable", true, "resizable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:463:3: (otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:463:5: otherlv_4= 'style' ( (lv_style_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleNode982); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getStyleKeyword_4_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:467:1: ( (lv_style_5_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:468:1: (lv_style_5_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:468:1: (lv_style_5_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:469:3: lv_style_5_0= RULE_ID
                    {
                    lv_style_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode999); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:485:4: (otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:485:6: otherlv_6= 'icon' ( (lv_icon_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleNode1019); 

                        	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getIconKeyword_5_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:489:1: ( (lv_icon_7_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:490:1: (lv_icon_7_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:490:1: (lv_icon_7_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:491:3: lv_icon_7_0= RULE_ID
                    {
                    lv_icon_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1036); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:507:4: (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:507:6: otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleNode1056); 

                        	newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getNameKeyword_6_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:511:1: ( (lv_name_9_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:512:1: (lv_name_9_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:512:1: (lv_name_9_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:513:3: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode1073); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:529:4: ( (lv_attributes_10_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:530:1: (lv_attributes_10_0= ruleAttribute )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:530:1: (lv_attributes_10_0= ruleAttribute )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:531:3: lv_attributes_10_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleNode1101);
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
            	    break loop10;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:547:3: ( (lv_figures_11_0= ruleNodeFigure ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=26 && LA11_0<=27)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:548:1: (lv_figures_11_0= ruleNodeFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:548:1: (lv_figures_11_0= ruleNodeFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:549:3: lv_figures_11_0= ruleNodeFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getFiguresNodeFigureParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeFigure_in_ruleNode1123);
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
            	    break loop11;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:565:3: ( (lv_containers_12_0= ruleNodeContainer ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29||(LA12_0>=121 && LA12_0<=122)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:566:1: (lv_containers_12_0= ruleNodeContainer )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:566:1: (lv_containers_12_0= ruleNodeContainer )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:567:3: lv_containers_12_0= ruleNodeContainer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getContainersNodeContainerParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeContainer_in_ruleNode1145);
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
            	    break loop12;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:583:3: ( (lv_anchors_13_0= ruleNodeAnchor ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==49) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:584:1: (lv_anchors_13_0= ruleNodeAnchor )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:584:1: (lv_anchors_13_0= ruleNodeAnchor )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:585:3: lv_anchors_13_0= ruleNodeAnchor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getAnchorsNodeAnchorParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeAnchor_in_ruleNode1167);
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
            	    break loop13;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleNode1180); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:613:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:614:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:615:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1216);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1226); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:622:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:625:28: ( (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:626:1: (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:626:1: (otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:626:3: otherlv_0= 'set' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAtributeValue ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleAttribute1263); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getSetKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:630:1: ( (lv_key_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:631:1: (lv_key_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:631:1: (lv_key_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:632:3: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1280); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAttribute1297); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:652:1: ( (lv_value_3_0= ruleAtributeValue ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:653:1: (lv_value_3_0= ruleAtributeValue )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:653:1: (lv_value_3_0= ruleAtributeValue )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:654:3: lv_value_3_0= ruleAtributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getValueAtributeValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAtributeValue_in_ruleAttribute1318);
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:678:1: entryRuleNodeFigure returns [EObject current=null] : iv_ruleNodeFigure= ruleNodeFigure EOF ;
    public final EObject entryRuleNodeFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:679:2: (iv_ruleNodeFigure= ruleNodeFigure EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:680:2: iv_ruleNodeFigure= ruleNodeFigure EOF
            {
             newCompositeNode(grammarAccess.getNodeFigureRule()); 
            pushFollow(FOLLOW_ruleNodeFigure_in_entryRuleNodeFigure1354);
            iv_ruleNodeFigure=ruleNodeFigure();

            state._fsp--;

             current =iv_ruleNodeFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeFigure1364); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:687:1: ruleNodeFigure returns [EObject current=null] : ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:690:28: ( ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:691:1: ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:691:1: ( ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:691:2: ( (lv_option_0_0= 'main' ) )? otherlv_1= 'figure' otherlv_2= ':' ( (lv_figure_3_0= ruleFigureShape ) ) (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFigureFeatures ) ) otherlv_10= '}'
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:691:2: ( (lv_option_0_0= 'main' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:692:1: (lv_option_0_0= 'main' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:692:1: (lv_option_0_0= 'main' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:693:3: lv_option_0_0= 'main'
                    {
                    lv_option_0_0=(Token)match(input,26,FOLLOW_26_in_ruleNodeFigure1407); 

                            newLeafNode(lv_option_0_0, grammarAccess.getNodeFigureAccess().getOptionMainKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeFigureRule());
                    	        }
                           		setWithLastConsumed(current, "option", lv_option_0_0, "main");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleNodeFigure1433); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeFigureAccess().getFigureKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleNodeFigure1445); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeFigureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:714:1: ( (lv_figure_3_0= ruleFigureShape ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:715:1: (lv_figure_3_0= ruleFigureShape )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:715:1: (lv_figure_3_0= ruleFigureShape )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:716:3: lv_figure_3_0= ruleFigureShape
            {
             
            	        newCompositeNode(grammarAccess.getNodeFigureAccess().getFigureFigureShapeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureShape_in_ruleNodeFigure1466);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:732:2: (otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:732:4: otherlv_4= ',' otherlv_5= 'style' otherlv_6= ':' ( (lv_style_7_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleNodeFigure1479); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeFigureAccess().getCommaKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleNodeFigure1491); 

                        	newLeafNode(otherlv_5, grammarAccess.getNodeFigureAccess().getStyleKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleNodeFigure1503); 

                        	newLeafNode(otherlv_6, grammarAccess.getNodeFigureAccess().getColonKeyword_4_2());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:744:1: ( (lv_style_7_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:745:1: (lv_style_7_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:745:1: (lv_style_7_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:746:3: lv_style_7_0= RULE_ID
                    {
                    lv_style_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeFigure1520); 

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

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleNodeFigure1539); 

                	newLeafNode(otherlv_8, grammarAccess.getNodeFigureAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:766:1: ( (lv_features_9_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:767:1: (lv_features_9_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:767:1: (lv_features_9_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:768:3: lv_features_9_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getNodeFigureAccess().getFeaturesFigureFeaturesParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleNodeFigure1560);
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

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleNodeFigure1572); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:796:1: entryRuleNodeContainer returns [EObject current=null] : iv_ruleNodeContainer= ruleNodeContainer EOF ;
    public final EObject entryRuleNodeContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeContainer = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:797:2: (iv_ruleNodeContainer= ruleNodeContainer EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:798:2: iv_ruleNodeContainer= ruleNodeContainer EOF
            {
             newCompositeNode(grammarAccess.getNodeContainerRule()); 
            pushFollow(FOLLOW_ruleNodeContainer_in_entryRuleNodeContainer1608);
            iv_ruleNodeContainer=ruleNodeContainer();

            state._fsp--;

             current =iv_ruleNodeContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeContainer1618); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:805:1: ruleNodeContainer returns [EObject current=null] : ( ( (lv_layout_0_0= ruleContainerLayout ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' ) ;
    public final EObject ruleNodeContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token lv_format_6_1=null;
        Token lv_format_6_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_layout_0_0 = null;

        EObject lv_figures_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:808:28: ( ( ( (lv_layout_0_0= ruleContainerLayout ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:809:1: ( ( (lv_layout_0_0= ruleContainerLayout ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:809:1: ( ( (lv_layout_0_0= ruleContainerLayout ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:809:2: ( (lv_layout_0_0= ruleContainerLayout ) )? otherlv_1= 'container' (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )? (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )? otherlv_7= '{' ( (lv_figures_8_0= ruleNodeFigure ) )+ otherlv_9= '}'
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:809:2: ( (lv_layout_0_0= ruleContainerLayout ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=121 && LA16_0<=122)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:810:1: (lv_layout_0_0= ruleContainerLayout )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:810:1: (lv_layout_0_0= ruleContainerLayout )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:811:3: lv_layout_0_0= ruleContainerLayout
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeContainerAccess().getLayoutContainerLayoutEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainerLayout_in_ruleNodeContainer1664);
                    lv_layout_0_0=ruleContainerLayout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"layout",
                            		lv_layout_0_0, 
                            		"ContainerLayout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleNodeContainer1677); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeContainerAccess().getContainerKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:831:1: (otherlv_2= 'for' ( ( ruleQualifiedName ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:831:3: otherlv_2= 'for' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleNodeContainer1690); 

                        	newLeafNode(otherlv_2, grammarAccess.getNodeContainerAccess().getForKeyword_2_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:835:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:836:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:836:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:837:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeContainerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNodeContainerAccess().getModelReferenceEReferenceCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleNodeContainer1713);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:850:4: (otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:850:6: otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleNodeContainer1728); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeContainerAccess().getColonKeyword_3_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:854:1: ( (lv_value_5_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:855:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:855:1: (lv_value_5_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:856:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeContainer1745); 

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

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:872:2: ( ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:873:1: ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:873:1: ( (lv_format_6_1= '%' | lv_format_6_2= 'px' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:874:1: (lv_format_6_1= '%' | lv_format_6_2= 'px' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:874:1: (lv_format_6_1= '%' | lv_format_6_2= 'px' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==31) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==32) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:875:3: lv_format_6_1= '%'
                            {
                            lv_format_6_1=(Token)match(input,31,FOLLOW_31_in_ruleNodeContainer1770); 

                                    newLeafNode(lv_format_6_1, grammarAccess.getNodeContainerAccess().getFormatPercentSignKeyword_3_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeContainerRule());
                            	        }
                                   		setWithLastConsumed(current, "format", lv_format_6_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:887:8: lv_format_6_2= 'px'
                            {
                            lv_format_6_2=(Token)match(input,32,FOLLOW_32_in_ruleNodeContainer1799); 

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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleNodeContainer1829); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeContainerAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:906:1: ( (lv_figures_8_0= ruleNodeFigure ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=26 && LA20_0<=27)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:907:1: (lv_figures_8_0= ruleNodeFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:907:1: (lv_figures_8_0= ruleNodeFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:908:3: lv_figures_8_0= ruleNodeFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeContainerAccess().getFiguresNodeFigureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeFigure_in_ruleNodeContainer1850);
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

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleNodeContainer1863); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:936:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:937:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:938:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1899);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1909); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:945:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* ( (lv_decorators_20_0= ruleDecorator ) )* otherlv_21= '}' ) ;
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
        Token otherlv_21=null;
        EObject lv_attributes_16_0 = null;

        EObject lv_linefeatures_17_0 = null;

        EObject lv_colorfeatures_18_0 = null;

        EObject lv_integerfeatures_19_0 = null;

        EObject lv_decorators_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:948:28: ( (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* ( (lv_decorators_20_0= ruleDecorator ) )* otherlv_21= '}' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:949:1: (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* ( (lv_decorators_20_0= ruleDecorator ) )* otherlv_21= '}' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:949:1: (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* ( (lv_decorators_20_0= ruleDecorator ) )* otherlv_21= '}' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:949:3: otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_8= '{' ( (lv_manhattan_9_0= 'manhattan' ) )? (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )? (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )? (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )? ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )* ( (lv_decorators_20_0= ruleDecorator ) )* otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleLink1946); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:953:1: ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==34) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:953:2: ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:953:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:954:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:954:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:955:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink1970);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:969:6: ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:969:6: ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:969:7: ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:969:7: ( (lv_complex_2_0= 'object' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:970:1: (lv_complex_2_0= 'object' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:970:1: (lv_complex_2_0= 'object' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:971:3: lv_complex_2_0= 'object'
                    {
                    lv_complex_2_0=(Token)match(input,34,FOLLOW_34_in_ruleLink1995); 

                            newLeafNode(lv_complex_2_0, grammarAccess.getLinkAccess().getComplexObjectKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "complex", true, "object");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:984:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:985:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:985:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:986:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2031);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleLink2043); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getSourceKeyword_1_1_2());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1003:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1004:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1004:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1005:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_1_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2066);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleLink2078); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getTargetKeyword_1_1_4());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1022:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1023:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1023:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1024:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_1_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2101);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleLink2115); 

                	newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1041:1: ( (lv_manhattan_9_0= 'manhattan' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1042:1: (lv_manhattan_9_0= 'manhattan' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1042:1: (lv_manhattan_9_0= 'manhattan' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1043:3: lv_manhattan_9_0= 'manhattan'
                    {
                    lv_manhattan_9_0=(Token)match(input,37,FOLLOW_37_in_ruleLink2133); 

                            newLeafNode(lv_manhattan_9_0, grammarAccess.getLinkAccess().getManhattanManhattanKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "manhattan", true, "manhattan");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1056:3: (otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1056:5: otherlv_10= 'style' ( (lv_style_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleLink2160); 

                        	newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getStyleKeyword_4_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1060:1: ( (lv_style_11_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1061:1: (lv_style_11_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1061:1: (lv_style_11_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1062:3: lv_style_11_0= RULE_ID
                    {
                    lv_style_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2177); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1078:4: (otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1078:6: otherlv_12= 'icon' ( (lv_icon_13_0= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleLink2197); 

                        	newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getIconKeyword_5_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1082:1: ( (lv_icon_13_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1083:1: (lv_icon_13_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1083:1: (lv_icon_13_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1084:3: lv_icon_13_0= RULE_ID
                    {
                    lv_icon_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2214); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1100:4: (otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1100:6: otherlv_14= 'name' ( (lv_name_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleLink2234); 

                        	newLeafNode(otherlv_14, grammarAccess.getLinkAccess().getNameKeyword_6_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1104:1: ( (lv_name_15_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1105:1: (lv_name_15_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1105:1: (lv_name_15_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1106:3: lv_name_15_0= RULE_STRING
                    {
                    lv_name_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink2251); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1122:4: ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )*
            loop26:
            do {
                int alt26=5;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1122:5: ( (lv_attributes_16_0= ruleAttribute ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1122:5: ( (lv_attributes_16_0= ruleAttribute ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1123:1: (lv_attributes_16_0= ruleAttribute )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1123:1: (lv_attributes_16_0= ruleAttribute )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1124:3: lv_attributes_16_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getAttributesAttributeParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleLink2280);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1141:6: ( (lv_linefeatures_17_0= ruleLineFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1141:6: ( (lv_linefeatures_17_0= ruleLineFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1142:1: (lv_linefeatures_17_0= ruleLineFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1142:1: (lv_linefeatures_17_0= ruleLineFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1143:3: lv_linefeatures_17_0= ruleLineFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getLinefeaturesLineFeatureParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLineFeature_in_ruleLink2307);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1160:6: ( (lv_colorfeatures_18_0= ruleColorFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1160:6: ( (lv_colorfeatures_18_0= ruleColorFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1161:1: (lv_colorfeatures_18_0= ruleColorFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1161:1: (lv_colorfeatures_18_0= ruleColorFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1162:3: lv_colorfeatures_18_0= ruleColorFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getColorfeaturesColorFeatureParserRuleCall_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorFeature_in_ruleLink2334);
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
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1179:6: ( (lv_integerfeatures_19_0= ruleIntegerFeature ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1179:6: ( (lv_integerfeatures_19_0= ruleIntegerFeature ) )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1180:1: (lv_integerfeatures_19_0= ruleIntegerFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1180:1: (lv_integerfeatures_19_0= ruleIntegerFeature )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1181:3: lv_integerfeatures_19_0= ruleIntegerFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getIntegerfeaturesIntegerFeatureParserRuleCall_7_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntegerFeature_in_ruleLink2361);
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
            	    break loop26;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1197:4: ( (lv_decorators_20_0= ruleDecorator ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=35 && LA27_0<=36)||LA27_0==38||LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1198:1: (lv_decorators_20_0= ruleDecorator )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1198:1: (lv_decorators_20_0= ruleDecorator )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1199:3: lv_decorators_20_0= ruleDecorator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getDecoratorsDecoratorParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecorator_in_ruleLink2384);
            	    lv_decorators_20_0=ruleDecorator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decorators",
            	            		lv_decorators_20_0, 
            	            		"Decorator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_21=(Token)match(input,19,FOLLOW_19_in_ruleLink2397); 

                	newLeafNode(otherlv_21, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleDecorator"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1227:1: entryRuleDecorator returns [EObject current=null] : iv_ruleDecorator= ruleDecorator EOF ;
    public final EObject entryRuleDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorator = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1228:2: (iv_ruleDecorator= ruleDecorator EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1229:2: iv_ruleDecorator= ruleDecorator EOF
            {
             newCompositeNode(grammarAccess.getDecoratorRule()); 
            pushFollow(FOLLOW_ruleDecorator_in_entryRuleDecorator2433);
            iv_ruleDecorator=ruleDecorator();

            state._fsp--;

             current =iv_ruleDecorator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorator2443); 

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
    // $ANTLR end "entryRuleDecorator"


    // $ANTLR start "ruleDecorator"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1236:1: ruleDecorator returns [EObject current=null] : ( (otherlv_0= 'decorator' (otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' ) ) | ( (lv_source_4_0= 'source' ) ) | ( (lv_target_5_0= 'target' ) ) | ( ( (lv_middle_6_0= 'middle' ) ) otherlv_7= '{' ( (lv_placingStatic_8_0= ruleStaticFigure ) )? ( (lv_placingDynamic_9_0= ruleDynamicFigure ) )* otherlv_10= '}' ) ) ;
    public final EObject ruleDecorator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_pos_2_0=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token lv_target_5_0=null;
        Token lv_middle_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_placingStatic_8_0 = null;

        EObject lv_placingDynamic_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1239:28: ( ( (otherlv_0= 'decorator' (otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' ) ) | ( (lv_source_4_0= 'source' ) ) | ( (lv_target_5_0= 'target' ) ) | ( ( (lv_middle_6_0= 'middle' ) ) otherlv_7= '{' ( (lv_placingStatic_8_0= ruleStaticFigure ) )? ( (lv_placingDynamic_9_0= ruleDynamicFigure ) )* otherlv_10= '}' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1240:1: ( (otherlv_0= 'decorator' (otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' ) ) | ( (lv_source_4_0= 'source' ) ) | ( (lv_target_5_0= 'target' ) ) | ( ( (lv_middle_6_0= 'middle' ) ) otherlv_7= '{' ( (lv_placingStatic_8_0= ruleStaticFigure ) )? ( (lv_placingDynamic_9_0= ruleDynamicFigure ) )* otherlv_10= '}' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1240:1: ( (otherlv_0= 'decorator' (otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' ) ) | ( (lv_source_4_0= 'source' ) ) | ( (lv_target_5_0= 'target' ) ) | ( ( (lv_middle_6_0= 'middle' ) ) otherlv_7= '{' ( (lv_placingStatic_8_0= ruleStaticFigure ) )? ( (lv_placingDynamic_9_0= ruleDynamicFigure ) )* otherlv_10= '}' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt30=1;
                }
                break;
            case 35:
                {
                alt30=2;
                }
                break;
            case 36:
                {
                alt30=3;
                }
                break;
            case 40:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1240:2: (otherlv_0= 'decorator' (otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1240:2: (otherlv_0= 'decorator' (otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1240:4: otherlv_0= 'decorator' (otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' )
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleDecorator2481); 

                        	newLeafNode(otherlv_0, grammarAccess.getDecoratorAccess().getDecoratorKeyword_0_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1244:1: (otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1244:3: otherlv_1= 'at' ( (lv_pos_2_0= RULE_INT ) ) otherlv_3= '%'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleDecorator2494); 

                        	newLeafNode(otherlv_1, grammarAccess.getDecoratorAccess().getAtKeyword_0_1_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1248:1: ( (lv_pos_2_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1249:1: (lv_pos_2_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1249:1: (lv_pos_2_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1250:3: lv_pos_2_0= RULE_INT
                    {
                    lv_pos_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecorator2511); 

                    			newLeafNode(lv_pos_2_0, grammarAccess.getDecoratorAccess().getPosINTTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecoratorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pos",
                            		lv_pos_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleDecorator2528); 

                        	newLeafNode(otherlv_3, grammarAccess.getDecoratorAccess().getPercentSignKeyword_0_1_2());
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1271:6: ( (lv_source_4_0= 'source' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1271:6: ( (lv_source_4_0= 'source' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1272:1: (lv_source_4_0= 'source' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1272:1: (lv_source_4_0= 'source' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1273:3: lv_source_4_0= 'source'
                    {
                    lv_source_4_0=(Token)match(input,35,FOLLOW_35_in_ruleDecorator2554); 

                            newLeafNode(lv_source_4_0, grammarAccess.getDecoratorAccess().getSourceSourceKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecoratorRule());
                    	        }
                           		setWithLastConsumed(current, "source", true, "source");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1287:6: ( (lv_target_5_0= 'target' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1287:6: ( (lv_target_5_0= 'target' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1288:1: (lv_target_5_0= 'target' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1288:1: (lv_target_5_0= 'target' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1289:3: lv_target_5_0= 'target'
                    {
                    lv_target_5_0=(Token)match(input,36,FOLLOW_36_in_ruleDecorator2591); 

                            newLeafNode(lv_target_5_0, grammarAccess.getDecoratorAccess().getTargetTargetKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecoratorRule());
                    	        }
                           		setWithLastConsumed(current, "target", true, "target");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1303:6: ( ( (lv_middle_6_0= 'middle' ) ) otherlv_7= '{' ( (lv_placingStatic_8_0= ruleStaticFigure ) )? ( (lv_placingDynamic_9_0= ruleDynamicFigure ) )* otherlv_10= '}' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1303:6: ( ( (lv_middle_6_0= 'middle' ) ) otherlv_7= '{' ( (lv_placingStatic_8_0= ruleStaticFigure ) )? ( (lv_placingDynamic_9_0= ruleDynamicFigure ) )* otherlv_10= '}' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1303:7: ( (lv_middle_6_0= 'middle' ) ) otherlv_7= '{' ( (lv_placingStatic_8_0= ruleStaticFigure ) )? ( (lv_placingDynamic_9_0= ruleDynamicFigure ) )* otherlv_10= '}'
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1303:7: ( (lv_middle_6_0= 'middle' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1304:1: (lv_middle_6_0= 'middle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1304:1: (lv_middle_6_0= 'middle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1305:3: lv_middle_6_0= 'middle'
                    {
                    lv_middle_6_0=(Token)match(input,40,FOLLOW_40_in_ruleDecorator2629); 

                            newLeafNode(lv_middle_6_0, grammarAccess.getDecoratorAccess().getMiddleMiddleKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecoratorRule());
                    	        }
                           		setWithLastConsumed(current, "middle", true, "middle");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleDecorator2654); 

                        	newLeafNode(otherlv_7, grammarAccess.getDecoratorAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1322:1: ( (lv_placingStatic_8_0= ruleStaticFigure ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==27) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1323:1: (lv_placingStatic_8_0= ruleStaticFigure )
                            {
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1323:1: (lv_placingStatic_8_0= ruleStaticFigure )
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1324:3: lv_placingStatic_8_0= ruleStaticFigure
                            {
                             
                            	        newCompositeNode(grammarAccess.getDecoratorAccess().getPlacingStaticStaticFigureParserRuleCall_3_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStaticFigure_in_ruleDecorator2675);
                            lv_placingStatic_8_0=ruleStaticFigure();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDecoratorRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"placingStatic",
                                    		lv_placingStatic_8_0, 
                                    		"StaticFigure");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1340:3: ( (lv_placingDynamic_9_0= ruleDynamicFigure ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==41) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1341:1: (lv_placingDynamic_9_0= ruleDynamicFigure )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1341:1: (lv_placingDynamic_9_0= ruleDynamicFigure )
                    	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1342:3: lv_placingDynamic_9_0= ruleDynamicFigure
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDecoratorAccess().getPlacingDynamicDynamicFigureParserRuleCall_3_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDynamicFigure_in_ruleDecorator2697);
                    	    lv_placingDynamic_9_0=ruleDynamicFigure();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDecoratorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"placingDynamic",
                    	            		lv_placingDynamic_9_0, 
                    	            		"DynamicFigure");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleDecorator2710); 

                        	newLeafNode(otherlv_10, grammarAccess.getDecoratorAccess().getRightCurlyBracketKeyword_3_4());
                        

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
    // $ANTLR end "ruleDecorator"


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
            pushFollow(FOLLOW_ruleDynamicFigure_in_entryRuleDynamicFigure2747);
            iv_ruleDynamicFigure=ruleDynamicFigure();

            state._fsp--;

             current =iv_ruleDynamicFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicFigure2757); 

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
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleDynamicFigure2794); 

                	newLeafNode(otherlv_0, grammarAccess.getDynamicFigureAccess().getTextKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1387:1: ( (lv_figure_1_0= ruleDynamicElement ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1388:1: (lv_figure_1_0= ruleDynamicElement )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1388:1: (lv_figure_1_0= ruleDynamicElement )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1389:3: lv_figure_1_0= ruleDynamicElement
            {
             
            	        newCompositeNode(grammarAccess.getDynamicFigureAccess().getFigureDynamicElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDynamicElement_in_ruleDynamicFigure2815);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDynamicFigure2827); 

                	newLeafNode(otherlv_2, grammarAccess.getDynamicFigureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1409:1: ( (lv_features_3_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1410:1: (lv_features_3_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1410:1: (lv_features_3_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1411:3: lv_features_3_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getDynamicFigureAccess().getFeaturesFigureFeaturesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleDynamicFigure2848);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleDynamicFigure2860); 

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
            pushFollow(FOLLOW_ruleDynamicElement_in_entryRuleDynamicElement2897);
            iv_ruleDynamicElement=ruleDynamicElement();

            state._fsp--;

             current =iv_ruleDynamicElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicElement2908); 

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
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            else if ( (LA31_0==43) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1453:2: kw= 'Label'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleDynamicElement2946); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDynamicElementAccess().getLabelKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1460:2: kw= 'Description'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleDynamicElement2965); 

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
            pushFollow(FOLLOW_ruleStaticFigure_in_entryRuleStaticFigure3005);
            iv_ruleStaticFigure=ruleStaticFigure();

            state._fsp--;

             current =iv_ruleStaticFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticFigure3015); 

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
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleStaticFigure3052); 

                	newLeafNode(otherlv_0, grammarAccess.getStaticFigureAccess().getFigureKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStaticFigure3064); 

                	newLeafNode(otherlv_1, grammarAccess.getStaticFigureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1494:1: ( (lv_figure_2_0= ruleStaticElement ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1495:1: (lv_figure_2_0= ruleStaticElement )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1495:1: (lv_figure_2_0= ruleStaticElement )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1496:3: lv_figure_2_0= ruleStaticElement
            {
             
            	        newCompositeNode(grammarAccess.getStaticFigureAccess().getFigureStaticElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStaticElement_in_ruleStaticFigure3085);
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
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1512:4: otherlv_3= ',' otherlv_4= 'style' otherlv_5= ':' ( (lv_style_6_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleStaticFigure3098); 

                        	newLeafNode(otherlv_3, grammarAccess.getStaticFigureAccess().getCommaKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleStaticFigure3110); 

                        	newLeafNode(otherlv_4, grammarAccess.getStaticFigureAccess().getStyleKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleStaticFigure3122); 

                        	newLeafNode(otherlv_5, grammarAccess.getStaticFigureAccess().getColonKeyword_3_2());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1524:1: ( (lv_style_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1525:1: (lv_style_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1525:1: (lv_style_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1526:3: lv_style_6_0= RULE_ID
                    {
                    lv_style_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStaticFigure3139); 

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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleStaticFigure3158); 

                	newLeafNode(otherlv_7, grammarAccess.getStaticFigureAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1546:1: ( (lv_features_8_0= ruleFigureFeatures ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1547:1: (lv_features_8_0= ruleFigureFeatures )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1547:1: (lv_features_8_0= ruleFigureFeatures )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1548:3: lv_features_8_0= ruleFigureFeatures
            {
             
            	        newCompositeNode(grammarAccess.getStaticFigureAccess().getFeaturesFigureFeaturesParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleFigureFeatures_in_ruleStaticFigure3179);
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

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleStaticFigure3191); 

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
            pushFollow(FOLLOW_ruleStaticElement_in_entryRuleStaticElement3228);
            iv_ruleStaticElement=ruleStaticElement();

            state._fsp--;

             current =iv_ruleStaticElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticElement3239); 

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
            int alt33=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 45:
                {
                alt33=2;
                }
                break;
            case 46:
                {
                alt33=3;
                }
                break;
            case 47:
                {
                alt33=4;
                }
                break;
            case 48:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1590:2: kw= 'Arrow'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleStaticElement3277); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getArrowKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1597:2: kw= 'Triangle'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleStaticElement3296); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getTriangleKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1604:2: kw= 'Rhombus'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleStaticElement3315); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getRhombusKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1611:2: kw= 'Polygon'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleStaticElement3334); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStaticElementAccess().getPolygonKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1618:2: kw= 'Polyline'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleStaticElement3353); 

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
            pushFollow(FOLLOW_ruleNodeAnchor_in_entryRuleNodeAnchor3393);
            iv_ruleNodeAnchor=ruleNodeAnchor();

            state._fsp--;

             current =iv_ruleNodeAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAnchor3403); 

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
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleNodeAnchor3440); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAnchorAccess().getAnchorKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1648:1: (otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1648:3: otherlv_1= 'to' ( (lv_object_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleNodeAnchor3453); 

                        	newLeafNode(otherlv_1, grammarAccess.getNodeAnchorAccess().getToKeyword_1_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1652:1: ( (lv_object_2_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1653:1: (lv_object_2_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1653:1: (lv_object_2_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1654:3: lv_object_2_0= RULE_ID
                    {
                    lv_object_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeAnchor3470); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleNodeAnchor3489); 

                	newLeafNode(otherlv_3, grammarAccess.getNodeAnchorAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1674:1: ( (lv_passX_4_0= '-' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1675:1: (lv_passX_4_0= '-' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1675:1: (lv_passX_4_0= '-' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1676:3: lv_passX_4_0= '-'
                    {
                    lv_passX_4_0=(Token)match(input,51,FOLLOW_51_in_ruleNodeAnchor3507); 

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
            lv_X_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeAnchor3538); 

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
            int alt36=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt36=1;
                }
                break;
            case 52:
                {
                alt36=2;
                }
                break;
            case 53:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1710:3: lv_formatX_6_1= '%'
                    {
                    lv_formatX_6_1=(Token)match(input,31,FOLLOW_31_in_ruleNodeAnchor3563); 

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
                    lv_formatX_6_2=(Token)match(input,52,FOLLOW_52_in_ruleNodeAnchor3592); 

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
                    lv_formatX_6_3=(Token)match(input,53,FOLLOW_53_in_ruleNodeAnchor3621); 

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

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleNodeAnchor3649); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeAnchorAccess().getCommaKeyword_6());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1753:1: ( (lv_passY_8_0= '-' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1754:1: (lv_passY_8_0= '-' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1754:1: (lv_passY_8_0= '-' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1755:3: lv_passY_8_0= '-'
                    {
                    lv_passY_8_0=(Token)match(input,51,FOLLOW_51_in_ruleNodeAnchor3667); 

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
            lv_Y_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeAnchor3698); 

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
            int alt38=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt38=1;
                }
                break;
            case 54:
                {
                alt38=2;
                }
                break;
            case 55:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1789:3: lv_formatY_10_1= '%'
                    {
                    lv_formatY_10_1=(Token)match(input,31,FOLLOW_31_in_ruleNodeAnchor3723); 

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
                    lv_formatY_10_2=(Token)match(input,54,FOLLOW_54_in_ruleNodeAnchor3752); 

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
                    lv_formatY_10_3=(Token)match(input,55,FOLLOW_55_in_ruleNodeAnchor3781); 

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

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleNodeAnchor3809); 

                	newLeafNode(otherlv_11, grammarAccess.getNodeAnchorAccess().getLeftCurlyBracketKeyword_10());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1832:1: ( (lv_figures_12_0= ruleNodeFigure ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=26 && LA39_0<=27)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1833:1: (lv_figures_12_0= ruleNodeFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1833:1: (lv_figures_12_0= ruleNodeFigure )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1834:3: lv_figures_12_0= ruleNodeFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAnchorAccess().getFiguresNodeFigureParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeFigure_in_ruleNodeAnchor3830);
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
            	    break loop39;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1850:3: ( (lv_arrows_13_0= ruleArrowAnchor ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==24) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1851:1: (lv_arrows_13_0= ruleArrowAnchor )
            	    {
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1851:1: (lv_arrows_13_0= ruleArrowAnchor )
            	    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1852:3: lv_arrows_13_0= ruleArrowAnchor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAnchorAccess().getArrowsArrowAnchorParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArrowAnchor_in_ruleNodeAnchor3852);
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
            	    break loop40;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleNodeAnchor3865); 

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
            pushFollow(FOLLOW_ruleArrowAnchor_in_entryRuleArrowAnchor3901);
            iv_ruleArrowAnchor=ruleArrowAnchor();

            state._fsp--;

             current =iv_ruleArrowAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowAnchor3911); 

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
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleArrowAnchor3948); 

                	newLeafNode(otherlv_0, grammarAccess.getArrowAnchorAccess().getSetKeyword_0());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1897:1: ( (lv_reference_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1898:1: (lv_reference_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1898:1: (lv_reference_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1899:3: lv_reference_1_0= RULE_ID
            {
            lv_reference_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArrowAnchor3965); 

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

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleArrowAnchor3982); 

                	newLeafNode(otherlv_2, grammarAccess.getArrowAnchorAccess().getAsKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1919:1: ( ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1920:1: ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1920:1: ( (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1921:1: (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1921:1: (lv_type_3_1= 'incoming' | lv_type_3_2= 'outgoing' | lv_type_3_3= 'both' )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt41=1;
                }
                break;
            case 58:
                {
                alt41=2;
                }
                break;
            case 59:
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1922:3: lv_type_3_1= 'incoming'
                    {
                    lv_type_3_1=(Token)match(input,57,FOLLOW_57_in_ruleArrowAnchor4002); 

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
                    lv_type_3_2=(Token)match(input,58,FOLLOW_58_in_ruleArrowAnchor4031); 

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
                    lv_type_3_3=(Token)match(input,59,FOLLOW_59_in_ruleArrowAnchor4060); 

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

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleArrowAnchor4088); 

                	newLeafNode(otherlv_4, grammarAccess.getArrowAnchorAccess().getConnectionKeyword_4());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1965:1: (otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==61) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1965:3: otherlv_5= 'using' ( (lv_N_6_0= RULE_INT ) ) otherlv_7= 'connections'
                    {
                    otherlv_5=(Token)match(input,61,FOLLOW_61_in_ruleArrowAnchor4101); 

                        	newLeafNode(otherlv_5, grammarAccess.getArrowAnchorAccess().getUsingKeyword_5_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1969:1: ( (lv_N_6_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1970:1: (lv_N_6_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1970:1: (lv_N_6_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:1971:3: lv_N_6_0= RULE_INT
                    {
                    lv_N_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArrowAnchor4118); 

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

                    otherlv_7=(Token)match(input,62,FOLLOW_62_in_ruleArrowAnchor4135); 

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
            pushFollow(FOLLOW_ruleFigureFeatures_in_entryRuleFigureFeatures4173);
            iv_ruleFigureFeatures=ruleFigureFeatures();

            state._fsp--;

             current =iv_ruleFigureFeatures; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFigureFeatures4183); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2008:1: ruleFigureFeatures returns [EObject current=null] : ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )* ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2011:28: ( ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )* ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2012:1: ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )* )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2012:1: ( () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )* )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2012:2: () ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )*
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2012:2: ()
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2013:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFigureFeaturesAccess().getFigureFeaturesAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2018:2: ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )*
            loop43:
            do {
                int alt43=12;
                alt43 = dfa43.predict(input);
                switch (alt43) {
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
            	    	    
            	    pushFollow(FOLLOW_ruleLineFeature_in_ruleFigureFeatures4239);
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
            	    	    
            	    pushFollow(FOLLOW_ruleCenterFeature_in_ruleFigureFeatures4266);
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
            	    	    
            	    pushFollow(FOLLOW_ruleAlignFeature_in_ruleFigureFeatures4293);
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
            	    	    
            	    pushFollow(FOLLOW_ruleGradientFeature_in_ruleFigureFeatures4320);
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
            	    	    
            	    pushFollow(FOLLOW_rulePointFeature_in_ruleFigureFeatures4347);
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
            	    	    
            	    pushFollow(FOLLOW_ruleSizeFeature_in_ruleFigureFeatures4374);
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
            	    	    
            	    pushFollow(FOLLOW_rulePositionFeature_in_ruleFigureFeatures4401);
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
            	    	    
            	    pushFollow(FOLLOW_ruleColorFeature_in_ruleFigureFeatures4428);
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
            	    	    
            	    pushFollow(FOLLOW_ruleIntegerFeature_in_ruleFigureFeatures4455);
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
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanFeature_in_ruleFigureFeatures4482);
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
            	    	    
            	    pushFollow(FOLLOW_ruleStringFeature_in_ruleFigureFeatures4509);
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
            	    break loop43;
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2236:1: entryRuleLayoutFeature returns [EObject current=null] : iv_ruleLayoutFeature= ruleLayoutFeature EOF ;
    public final EObject entryRuleLayoutFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2237:2: (iv_ruleLayoutFeature= ruleLayoutFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2238:2: iv_ruleLayoutFeature= ruleLayoutFeature EOF
            {
             newCompositeNode(grammarAccess.getLayoutFeatureRule()); 
            pushFollow(FOLLOW_ruleLayoutFeature_in_entryRuleLayoutFeature4549);
            iv_ruleLayoutFeature=ruleLayoutFeature();

            state._fsp--;

             current =iv_ruleLayoutFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutFeature4559); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2245:1: ruleLayoutFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) ) ;
    public final EObject ruleLayoutFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2248:28: ( ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2249:1: ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2249:1: ( ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2249:2: ( (lv_key_0_0= 'layout' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2249:2: ( (lv_key_0_0= 'layout' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2250:1: (lv_key_0_0= 'layout' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2250:1: (lv_key_0_0= 'layout' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2251:3: lv_key_0_0= 'layout'
            {
            lv_key_0_0=(Token)match(input,63,FOLLOW_63_in_ruleLayoutFeature4602); 

                    newLeafNode(lv_key_0_0, grammarAccess.getLayoutFeatureAccess().getKeyLayoutKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "layout");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleLayoutFeature4627); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2268:1: ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2269:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2269:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2270:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2270:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'over' )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt44=1;
                }
                break;
            case 65:
                {
                alt44=2;
                }
                break;
            case 66:
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2271:3: lv_value_2_1= 'horizontal'
                    {
                    lv_value_2_1=(Token)match(input,64,FOLLOW_64_in_ruleLayoutFeature4647); 

                            newLeafNode(lv_value_2_1, grammarAccess.getLayoutFeatureAccess().getValueHorizontalKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2283:8: lv_value_2_2= 'vertical'
                    {
                    lv_value_2_2=(Token)match(input,65,FOLLOW_65_in_ruleLayoutFeature4676); 

                            newLeafNode(lv_value_2_2, grammarAccess.getLayoutFeatureAccess().getValueVerticalKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayoutFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2295:8: lv_value_2_3= 'over'
                    {
                    lv_value_2_3=(Token)match(input,66,FOLLOW_66_in_ruleLayoutFeature4705); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2318:1: entryRuleCenterFeature returns [EObject current=null] : iv_ruleCenterFeature= ruleCenterFeature EOF ;
    public final EObject entryRuleCenterFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCenterFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2319:2: (iv_ruleCenterFeature= ruleCenterFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2320:2: iv_ruleCenterFeature= ruleCenterFeature EOF
            {
             newCompositeNode(grammarAccess.getCenterFeatureRule()); 
            pushFollow(FOLLOW_ruleCenterFeature_in_entryRuleCenterFeature4757);
            iv_ruleCenterFeature=ruleCenterFeature();

            state._fsp--;

             current =iv_ruleCenterFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCenterFeature4767); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2327:1: ruleCenterFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) ) ;
    public final EObject ruleCenterFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2330:28: ( ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2331:1: ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2331:1: ( ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2331:2: ( (lv_key_0_0= 'center' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2331:2: ( (lv_key_0_0= 'center' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2332:1: (lv_key_0_0= 'center' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2332:1: (lv_key_0_0= 'center' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2333:3: lv_key_0_0= 'center'
            {
            lv_key_0_0=(Token)match(input,67,FOLLOW_67_in_ruleCenterFeature4810); 

                    newLeafNode(lv_key_0_0, grammarAccess.getCenterFeatureAccess().getKeyCenterKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCenterFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "center");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleCenterFeature4835); 

                	newLeafNode(otherlv_1, grammarAccess.getCenterFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2350:1: ( ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2351:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2351:1: ( (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2352:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2352:1: (lv_value_2_1= 'horizontal' | lv_value_2_2= 'vertical' | lv_value_2_3= 'both' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt45=1;
                }
                break;
            case 65:
                {
                alt45=2;
                }
                break;
            case 59:
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2353:3: lv_value_2_1= 'horizontal'
                    {
                    lv_value_2_1=(Token)match(input,64,FOLLOW_64_in_ruleCenterFeature4855); 

                            newLeafNode(lv_value_2_1, grammarAccess.getCenterFeatureAccess().getValueHorizontalKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCenterFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2365:8: lv_value_2_2= 'vertical'
                    {
                    lv_value_2_2=(Token)match(input,65,FOLLOW_65_in_ruleCenterFeature4884); 

                            newLeafNode(lv_value_2_2, grammarAccess.getCenterFeatureAccess().getValueVerticalKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCenterFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2377:8: lv_value_2_3= 'both'
                    {
                    lv_value_2_3=(Token)match(input,59,FOLLOW_59_in_ruleCenterFeature4913); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2400:1: entryRuleAlignFeature returns [EObject current=null] : iv_ruleAlignFeature= ruleAlignFeature EOF ;
    public final EObject entryRuleAlignFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlignFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2401:2: (iv_ruleAlignFeature= ruleAlignFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2402:2: iv_ruleAlignFeature= ruleAlignFeature EOF
            {
             newCompositeNode(grammarAccess.getAlignFeatureRule()); 
            pushFollow(FOLLOW_ruleAlignFeature_in_entryRuleAlignFeature4965);
            iv_ruleAlignFeature=ruleAlignFeature();

            state._fsp--;

             current =iv_ruleAlignFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlignFeature4975); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2409:1: ruleAlignFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) ) ;
    public final EObject ruleAlignFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2412:28: ( ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2413:1: ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2413:1: ( ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2413:2: ( (lv_key_0_0= 'text-align' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2413:2: ( (lv_key_0_0= 'text-align' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2414:1: (lv_key_0_0= 'text-align' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2414:1: (lv_key_0_0= 'text-align' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2415:3: lv_key_0_0= 'text-align'
            {
            lv_key_0_0=(Token)match(input,68,FOLLOW_68_in_ruleAlignFeature5018); 

                    newLeafNode(lv_key_0_0, grammarAccess.getAlignFeatureAccess().getKeyTextAlignKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlignFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "text-align");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAlignFeature5043); 

                	newLeafNode(otherlv_1, grammarAccess.getAlignFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2432:1: ( ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2433:1: ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2433:1: ( (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2434:1: (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2434:1: (lv_value_2_1= 'left' | lv_value_2_2= 'middle' | lv_value_2_3= 'right' )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt46=1;
                }
                break;
            case 40:
                {
                alt46=2;
                }
                break;
            case 70:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2435:3: lv_value_2_1= 'left'
                    {
                    lv_value_2_1=(Token)match(input,69,FOLLOW_69_in_ruleAlignFeature5063); 

                            newLeafNode(lv_value_2_1, grammarAccess.getAlignFeatureAccess().getValueLeftKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlignFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2447:8: lv_value_2_2= 'middle'
                    {
                    lv_value_2_2=(Token)match(input,40,FOLLOW_40_in_ruleAlignFeature5092); 

                            newLeafNode(lv_value_2_2, grammarAccess.getAlignFeatureAccess().getValueMiddleKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlignFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2459:8: lv_value_2_3= 'right'
                    {
                    lv_value_2_3=(Token)match(input,70,FOLLOW_70_in_ruleAlignFeature5121); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2482:1: entryRuleGradientFeature returns [EObject current=null] : iv_ruleGradientFeature= ruleGradientFeature EOF ;
    public final EObject entryRuleGradientFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradientFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2483:2: (iv_ruleGradientFeature= ruleGradientFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2484:2: iv_ruleGradientFeature= ruleGradientFeature EOF
            {
             newCompositeNode(grammarAccess.getGradientFeatureRule()); 
            pushFollow(FOLLOW_ruleGradientFeature_in_entryRuleGradientFeature5173);
            iv_ruleGradientFeature=ruleGradientFeature();

            state._fsp--;

             current =iv_ruleGradientFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGradientFeature5183); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2491:1: ruleGradientFeature returns [EObject current=null] : ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2494:28: ( ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2495:1: ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2495:1: ( ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2495:2: ( (lv_key_0_0= 'gradient' ) ) otherlv_1= ':' ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2495:2: ( (lv_key_0_0= 'gradient' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2496:1: (lv_key_0_0= 'gradient' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2496:1: (lv_key_0_0= 'gradient' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2497:3: lv_key_0_0= 'gradient'
            {
            lv_key_0_0=(Token)match(input,71,FOLLOW_71_in_ruleGradientFeature5226); 

                    newLeafNode(lv_key_0_0, grammarAccess.getGradientFeatureAccess().getKeyGradientKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_0_0, "gradient");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleGradientFeature5251); 

                	newLeafNode(otherlv_1, grammarAccess.getGradientFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2514:1: ( ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2515:1: ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2515:1: ( (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2516:1: (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2516:1: (lv_value_2_1= 'BlueWhite' | lv_value_2_2= 'BlueWhiteGloss' | lv_value_2_3= 'CopperWhiteGloss' | lv_value_2_4= 'LightGray' | lv_value_2_5= 'LightYellow' | lv_value_2_6= 'SilverWhiteGloss' | lv_value_2_7= 'LimeWhite' )
            int alt47=7;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt47=1;
                }
                break;
            case 73:
                {
                alt47=2;
                }
                break;
            case 74:
                {
                alt47=3;
                }
                break;
            case 75:
                {
                alt47=4;
                }
                break;
            case 76:
                {
                alt47=5;
                }
                break;
            case 77:
                {
                alt47=6;
                }
                break;
            case 78:
                {
                alt47=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2517:3: lv_value_2_1= 'BlueWhite'
                    {
                    lv_value_2_1=(Token)match(input,72,FOLLOW_72_in_ruleGradientFeature5271); 

                            newLeafNode(lv_value_2_1, grammarAccess.getGradientFeatureAccess().getValueBlueWhiteKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2529:8: lv_value_2_2= 'BlueWhiteGloss'
                    {
                    lv_value_2_2=(Token)match(input,73,FOLLOW_73_in_ruleGradientFeature5300); 

                            newLeafNode(lv_value_2_2, grammarAccess.getGradientFeatureAccess().getValueBlueWhiteGlossKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2541:8: lv_value_2_3= 'CopperWhiteGloss'
                    {
                    lv_value_2_3=(Token)match(input,74,FOLLOW_74_in_ruleGradientFeature5329); 

                            newLeafNode(lv_value_2_3, grammarAccess.getGradientFeatureAccess().getValueCopperWhiteGlossKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2553:8: lv_value_2_4= 'LightGray'
                    {
                    lv_value_2_4=(Token)match(input,75,FOLLOW_75_in_ruleGradientFeature5358); 

                            newLeafNode(lv_value_2_4, grammarAccess.getGradientFeatureAccess().getValueLightGrayKeyword_2_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2565:8: lv_value_2_5= 'LightYellow'
                    {
                    lv_value_2_5=(Token)match(input,76,FOLLOW_76_in_ruleGradientFeature5387); 

                            newLeafNode(lv_value_2_5, grammarAccess.getGradientFeatureAccess().getValueLightYellowKeyword_2_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2577:8: lv_value_2_6= 'SilverWhiteGloss'
                    {
                    lv_value_2_6=(Token)match(input,77,FOLLOW_77_in_ruleGradientFeature5416); 

                            newLeafNode(lv_value_2_6, grammarAccess.getGradientFeatureAccess().getValueSilverWhiteGlossKeyword_2_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2589:8: lv_value_2_7= 'LimeWhite'
                    {
                    lv_value_2_7=(Token)match(input,78,FOLLOW_78_in_ruleGradientFeature5445); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2612:1: entryRulePointFeature returns [EObject current=null] : iv_rulePointFeature= rulePointFeature EOF ;
    public final EObject entryRulePointFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2613:2: (iv_rulePointFeature= rulePointFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2614:2: iv_rulePointFeature= rulePointFeature EOF
            {
             newCompositeNode(grammarAccess.getPointFeatureRule()); 
            pushFollow(FOLLOW_rulePointFeature_in_entryRulePointFeature5497);
            iv_rulePointFeature=rulePointFeature();

            state._fsp--;

             current =iv_rulePointFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointFeature5507); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2621:1: rulePointFeature returns [EObject current=null] : (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) ;
    public final EObject rulePointFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_X_2_0=null;
        Token otherlv_3=null;
        Token lv_Y_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2624:28: ( (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2625:1: (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2625:1: (otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2625:3: otherlv_0= 'point' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_rulePointFeature5544); 

                	newLeafNode(otherlv_0, grammarAccess.getPointFeatureAccess().getPointKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePointFeature5556); 

                	newLeafNode(otherlv_1, grammarAccess.getPointFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2633:1: ( (lv_X_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2634:1: (lv_X_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2634:1: (lv_X_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2635:3: lv_X_2_0= RULE_INT
            {
            lv_X_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePointFeature5573); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulePointFeature5590); 

                	newLeafNode(otherlv_3, grammarAccess.getPointFeatureAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2655:1: ( (lv_Y_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2656:1: (lv_Y_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2656:1: (lv_Y_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2657:3: lv_Y_4_0= RULE_INT
            {
            lv_Y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePointFeature5607); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2681:1: entryRuleSizeFeature returns [EObject current=null] : iv_ruleSizeFeature= ruleSizeFeature EOF ;
    public final EObject entryRuleSizeFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2682:2: (iv_ruleSizeFeature= ruleSizeFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2683:2: iv_ruleSizeFeature= ruleSizeFeature EOF
            {
             newCompositeNode(grammarAccess.getSizeFeatureRule()); 
            pushFollow(FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature5648);
            iv_ruleSizeFeature=ruleSizeFeature();

            state._fsp--;

             current =iv_ruleSizeFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeFeature5658); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2690:1: ruleSizeFeature returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) ) ;
    public final EObject ruleSizeFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_Width_2_0=null;
        Token otherlv_3=null;
        Token lv_Height_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2693:28: ( (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2694:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2694:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2694:3: otherlv_0= 'size' otherlv_1= ':' ( (lv_Width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Height_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleSizeFeature5695); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeFeatureAccess().getSizeKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSizeFeature5707); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2702:1: ( (lv_Width_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2703:1: (lv_Width_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2703:1: (lv_Width_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2704:3: lv_Width_2_0= RULE_INT
            {
            lv_Width_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSizeFeature5724); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSizeFeature5741); 

                	newLeafNode(otherlv_3, grammarAccess.getSizeFeatureAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2724:1: ( (lv_Height_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2725:1: (lv_Height_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2725:1: (lv_Height_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2726:3: lv_Height_4_0= RULE_INT
            {
            lv_Height_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSizeFeature5758); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2750:1: entryRulePositionFeature returns [EObject current=null] : iv_rulePositionFeature= rulePositionFeature EOF ;
    public final EObject entryRulePositionFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2751:2: (iv_rulePositionFeature= rulePositionFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2752:2: iv_rulePositionFeature= rulePositionFeature EOF
            {
             newCompositeNode(grammarAccess.getPositionFeatureRule()); 
            pushFollow(FOLLOW_rulePositionFeature_in_entryRulePositionFeature5799);
            iv_rulePositionFeature=rulePositionFeature();

            state._fsp--;

             current =iv_rulePositionFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionFeature5809); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2759:1: rulePositionFeature returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) ;
    public final EObject rulePositionFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_X_2_0=null;
        Token otherlv_3=null;
        Token lv_Y_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2762:28: ( (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2763:1: (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2763:1: (otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2763:3: otherlv_0= 'position' otherlv_1= ':' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_rulePositionFeature5846); 

                	newLeafNode(otherlv_0, grammarAccess.getPositionFeatureAccess().getPositionKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePositionFeature5858); 

                	newLeafNode(otherlv_1, grammarAccess.getPositionFeatureAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2771:1: ( (lv_X_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2772:1: (lv_X_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2772:1: (lv_X_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2773:3: lv_X_2_0= RULE_INT
            {
            lv_X_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionFeature5875); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulePositionFeature5892); 

                	newLeafNode(otherlv_3, grammarAccess.getPositionFeatureAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2793:1: ( (lv_Y_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2794:1: (lv_Y_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2794:1: (lv_Y_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2795:3: lv_Y_4_0= RULE_INT
            {
            lv_Y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionFeature5909); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2819:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2820:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2821:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature5950);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature5960); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2828:1: ruleColorFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2831:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2832:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2832:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2832:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) ) (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )?
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2832:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2833:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2833:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2834:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleColorFeature6006);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2850:3: ( ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2851:1: ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2851:1: ( (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2852:1: (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2852:1: (lv_key_1_1= 'background' | lv_key_1_2= 'foreground' | lv_key_1_3= 'border' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt49=1;
                }
                break;
            case 83:
                {
                alt49=2;
                }
                break;
            case 84:
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2853:3: lv_key_1_1= 'background'
                    {
                    lv_key_1_1=(Token)match(input,82,FOLLOW_82_in_ruleColorFeature6027); 

                            newLeafNode(lv_key_1_1, grammarAccess.getColorFeatureAccess().getKeyBackgroundKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2865:8: lv_key_1_2= 'foreground'
                    {
                    lv_key_1_2=(Token)match(input,83,FOLLOW_83_in_ruleColorFeature6056); 

                            newLeafNode(lv_key_1_2, grammarAccess.getColorFeatureAccess().getKeyForegroundKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2877:8: lv_key_1_3= 'border'
                    {
                    lv_key_1_3=(Token)match(input,84,FOLLOW_84_in_ruleColorFeature6085); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleColorFeature6113); 

                	newLeafNode(otherlv_2, grammarAccess.getColorFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2896:1: ( ( (lv_value_3_0= ruleColor ) ) | ( (lv_rgb_4_0= ruleRGB ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=88 && LA50_0<=95)) ) {
                alt50=1;
            }
            else if ( (LA50_0==96) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2896:2: ( (lv_value_3_0= ruleColor ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2896:2: ( (lv_value_3_0= ruleColor ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2897:1: (lv_value_3_0= ruleColor )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2897:1: (lv_value_3_0= ruleColor )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2898:3: lv_value_3_0= ruleColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorFeatureAccess().getValueColorParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColor_in_ruleColorFeature6135);
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2915:6: ( (lv_rgb_4_0= ruleRGB ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2915:6: ( (lv_rgb_4_0= ruleRGB ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2916:1: (lv_rgb_4_0= ruleRGB )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2916:1: (lv_rgb_4_0= ruleRGB )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2917:3: lv_rgb_4_0= ruleRGB
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorFeatureAccess().getRgbRGBParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRGB_in_ruleColorFeature6162);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2933:3: (otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==85) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2933:5: otherlv_5= '[' ( (lv_atribute_6_0= RULE_ID ) ) ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) ) ( (lv_option_8_0= RULE_ID ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,85,FOLLOW_85_in_ruleColorFeature6176); 

                        	newLeafNode(otherlv_5, grammarAccess.getColorFeatureAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2937:1: ( (lv_atribute_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2938:1: (lv_atribute_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2938:1: (lv_atribute_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2939:3: lv_atribute_6_0= RULE_ID
                    {
                    lv_atribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorFeature6193); 

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

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2955:2: ( ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2956:1: ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2956:1: ( (lv_operator_7_1= '=' | lv_operator_7_2= '<>' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2957:1: (lv_operator_7_1= '=' | lv_operator_7_2= '<>' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2957:1: (lv_operator_7_1= '=' | lv_operator_7_2= '<>' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==25) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==86) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2958:3: lv_operator_7_1= '='
                            {
                            lv_operator_7_1=(Token)match(input,25,FOLLOW_25_in_ruleColorFeature6218); 

                                    newLeafNode(lv_operator_7_1, grammarAccess.getColorFeatureAccess().getOperatorEqualsSignKeyword_4_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getColorFeatureRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_7_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2970:8: lv_operator_7_2= '<>'
                            {
                            lv_operator_7_2=(Token)match(input,86,FOLLOW_86_in_ruleColorFeature6247); 

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

                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2985:2: ( (lv_option_8_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2986:1: (lv_option_8_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2986:1: (lv_option_8_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:2987:3: lv_option_8_0= RULE_ID
                    {
                    lv_option_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorFeature6280); 

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

                    otherlv_9=(Token)match(input,87,FOLLOW_87_in_ruleColorFeature6297); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3015:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3016:2: (iv_ruleColor= ruleColor EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3017:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor6336);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor6347); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3024:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3027:28: ( (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3028:1: (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3028:1: (kw= 'WHITE' | kw= 'BLACK' | kw= 'BLUE' | kw= 'GREEN' | kw= 'RED' | kw= 'YELLOW' | kw= 'CYAN' | kw= 'ORANGE' )
            int alt53=8;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt53=1;
                }
                break;
            case 89:
                {
                alt53=2;
                }
                break;
            case 90:
                {
                alt53=3;
                }
                break;
            case 91:
                {
                alt53=4;
                }
                break;
            case 92:
                {
                alt53=5;
                }
                break;
            case 93:
                {
                alt53=6;
                }
                break;
            case 94:
                {
                alt53=7;
                }
                break;
            case 95:
                {
                alt53=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3029:2: kw= 'WHITE'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleColor6385); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getWHITEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3036:2: kw= 'BLACK'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleColor6404); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getBLACKKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3043:2: kw= 'BLUE'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleColor6423); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getBLUEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3050:2: kw= 'GREEN'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleColor6442); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getGREENKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3057:2: kw= 'RED'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleColor6461); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getREDKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3064:2: kw= 'YELLOW'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleColor6480); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getYELLOWKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3071:2: kw= 'CYAN'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleColor6499); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColorAccess().getCYANKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3078:2: kw= 'ORANGE'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleColor6518); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3091:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3092:2: (iv_ruleRGB= ruleRGB EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3093:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_ruleRGB_in_entryRuleRGB6558);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGB6568); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3100:1: ruleRGB returns [EObject current=null] : (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3103:28: ( (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3104:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3104:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3104:3: otherlv_0= 'RGB' otherlv_1= '(' ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleRGB6605); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getRGBKeyword_0());
                
            otherlv_1=(Token)match(input,97,FOLLOW_97_in_ruleRGB6617); 

                	newLeafNode(otherlv_1, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_1());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3112:1: ( (lv_R_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3113:1: (lv_R_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3113:1: (lv_R_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3114:3: lv_R_2_0= RULE_INT
            {
            lv_R_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB6634); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRGB6651); 

                	newLeafNode(otherlv_3, grammarAccess.getRGBAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3134:1: ( (lv_G_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3135:1: (lv_G_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3135:1: (lv_G_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3136:3: lv_G_4_0= RULE_INT
            {
            lv_G_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB6668); 

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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleRGB6685); 

                	newLeafNode(otherlv_5, grammarAccess.getRGBAccess().getCommaKeyword_5());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3156:1: ( (lv_B_6_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3157:1: (lv_B_6_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3157:1: (lv_B_6_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3158:3: lv_B_6_0= RULE_INT
            {
            lv_B_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB6702); 

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

            otherlv_7=(Token)match(input,98,FOLLOW_98_in_ruleRGB6719); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3186:1: entryRuleIntegerFeature returns [EObject current=null] : iv_ruleIntegerFeature= ruleIntegerFeature EOF ;
    public final EObject entryRuleIntegerFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3187:2: (iv_ruleIntegerFeature= ruleIntegerFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3188:2: iv_ruleIntegerFeature= ruleIntegerFeature EOF
            {
             newCompositeNode(grammarAccess.getIntegerFeatureRule()); 
            pushFollow(FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature6755);
            iv_ruleIntegerFeature=ruleIntegerFeature();

            state._fsp--;

             current =iv_ruleIntegerFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerFeature6765); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3195:1: ruleIntegerFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3198:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3199:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3199:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3199:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_INT ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3199:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3200:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3200:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3201:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleIntegerFeature6811);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3217:3: ( ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3218:1: ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3218:1: ( (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3219:1: (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3219:1: (lv_key_1_1= 'line-width' | lv_key_1_2= 'top' | lv_key_1_3= 'left' | lv_key_1_4= 'width' | lv_key_1_5= 'height' | lv_key_1_6= 'angle' | lv_key_1_7= 'corner' | lv_key_1_8= 'transparency' | lv_key_1_9= 'font-size' )
            int alt55=9;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt55=1;
                }
                break;
            case 100:
                {
                alt55=2;
                }
                break;
            case 69:
                {
                alt55=3;
                }
                break;
            case 101:
                {
                alt55=4;
                }
                break;
            case 102:
                {
                alt55=5;
                }
                break;
            case 103:
                {
                alt55=6;
                }
                break;
            case 104:
                {
                alt55=7;
                }
                break;
            case 105:
                {
                alt55=8;
                }
                break;
            case 106:
                {
                alt55=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3220:3: lv_key_1_1= 'line-width'
                    {
                    lv_key_1_1=(Token)match(input,99,FOLLOW_99_in_ruleIntegerFeature6832); 

                            newLeafNode(lv_key_1_1, grammarAccess.getIntegerFeatureAccess().getKeyLineWidthKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3232:8: lv_key_1_2= 'top'
                    {
                    lv_key_1_2=(Token)match(input,100,FOLLOW_100_in_ruleIntegerFeature6861); 

                            newLeafNode(lv_key_1_2, grammarAccess.getIntegerFeatureAccess().getKeyTopKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3244:8: lv_key_1_3= 'left'
                    {
                    lv_key_1_3=(Token)match(input,69,FOLLOW_69_in_ruleIntegerFeature6890); 

                            newLeafNode(lv_key_1_3, grammarAccess.getIntegerFeatureAccess().getKeyLeftKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3256:8: lv_key_1_4= 'width'
                    {
                    lv_key_1_4=(Token)match(input,101,FOLLOW_101_in_ruleIntegerFeature6919); 

                            newLeafNode(lv_key_1_4, grammarAccess.getIntegerFeatureAccess().getKeyWidthKeyword_1_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3268:8: lv_key_1_5= 'height'
                    {
                    lv_key_1_5=(Token)match(input,102,FOLLOW_102_in_ruleIntegerFeature6948); 

                            newLeafNode(lv_key_1_5, grammarAccess.getIntegerFeatureAccess().getKeyHeightKeyword_1_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3280:8: lv_key_1_6= 'angle'
                    {
                    lv_key_1_6=(Token)match(input,103,FOLLOW_103_in_ruleIntegerFeature6977); 

                            newLeafNode(lv_key_1_6, grammarAccess.getIntegerFeatureAccess().getKeyAngleKeyword_1_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3292:8: lv_key_1_7= 'corner'
                    {
                    lv_key_1_7=(Token)match(input,104,FOLLOW_104_in_ruleIntegerFeature7006); 

                            newLeafNode(lv_key_1_7, grammarAccess.getIntegerFeatureAccess().getKeyCornerKeyword_1_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3304:8: lv_key_1_8= 'transparency'
                    {
                    lv_key_1_8=(Token)match(input,105,FOLLOW_105_in_ruleIntegerFeature7035); 

                            newLeafNode(lv_key_1_8, grammarAccess.getIntegerFeatureAccess().getKeyTransparencyKeyword_1_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3316:8: lv_key_1_9= 'font-size'
                    {
                    lv_key_1_9=(Token)match(input,106,FOLLOW_106_in_ruleIntegerFeature7064); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleIntegerFeature7092); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3335:1: ( (lv_value_3_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3336:1: (lv_value_3_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3336:1: (lv_value_3_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3337:3: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerFeature7109); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3361:1: entryRuleStringFeature returns [EObject current=null] : iv_ruleStringFeature= ruleStringFeature EOF ;
    public final EObject entryRuleStringFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3362:2: (iv_ruleStringFeature= ruleStringFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3363:2: iv_ruleStringFeature= ruleStringFeature EOF
            {
             newCompositeNode(grammarAccess.getStringFeatureRule()); 
            pushFollow(FOLLOW_ruleStringFeature_in_entryRuleStringFeature7150);
            iv_ruleStringFeature=ruleStringFeature();

            state._fsp--;

             current =iv_ruleStringFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFeature7160); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3370:1: ruleStringFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3373:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3374:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3374:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )? )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3374:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) ) otherlv_2= ':' ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )?
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3374:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3375:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3375:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3376:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleStringFeature7206);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3392:3: ( ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3393:1: ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3393:1: ( (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3394:1: (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3394:1: (lv_key_1_1= 'text-value' | lv_key_1_2= 'font-name' | lv_key_1_3= 'icon' )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt57=1;
                }
                break;
            case 108:
                {
                alt57=2;
                }
                break;
            case 22:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3395:3: lv_key_1_1= 'text-value'
                    {
                    lv_key_1_1=(Token)match(input,107,FOLLOW_107_in_ruleStringFeature7227); 

                            newLeafNode(lv_key_1_1, grammarAccess.getStringFeatureAccess().getKeyTextValueKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3407:8: lv_key_1_2= 'font-name'
                    {
                    lv_key_1_2=(Token)match(input,108,FOLLOW_108_in_ruleStringFeature7256); 

                            newLeafNode(lv_key_1_2, grammarAccess.getStringFeatureAccess().getKeyFontNameKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3419:8: lv_key_1_3= 'icon'
                    {
                    lv_key_1_3=(Token)match(input,22,FOLLOW_22_in_ruleStringFeature7285); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStringFeature7313); 

                	newLeafNode(otherlv_2, grammarAccess.getStringFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3438:1: ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )?
            int alt58=6;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3438:2: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3438:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3439:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3439:1: (lv_value_3_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3440:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7331); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3457:6: ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3457:6: ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3457:7: ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3457:7: ( (lv_valueL_4_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3458:1: (lv_valueL_4_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3458:1: (lv_valueL_4_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3459:3: lv_valueL_4_0= RULE_STRING
                    {
                    lv_valueL_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7360); 

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

                    otherlv_5=(Token)match(input,109,FOLLOW_109_in_ruleStringFeature7377); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_1_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3479:1: ( (lv_attribute_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3480:1: (lv_attribute_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3480:1: (lv_attribute_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3481:3: lv_attribute_6_0= RULE_ID
                    {
                    lv_attribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7394); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3498:6: ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3498:6: ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3498:7: ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3498:7: ( (lv_attribute_7_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3499:1: (lv_attribute_7_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3499:1: (lv_attribute_7_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3500:3: lv_attribute_7_0= RULE_ID
                    {
                    lv_attribute_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7424); 

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

                    otherlv_8=(Token)match(input,109,FOLLOW_109_in_ruleStringFeature7441); 

                        	newLeafNode(otherlv_8, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_2_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3520:1: ( (lv_valueR_9_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3521:1: (lv_valueR_9_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3521:1: (lv_valueR_9_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3522:3: lv_valueR_9_0= RULE_STRING
                    {
                    lv_valueR_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7458); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3539:6: ( (lv_attribute_10_0= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3539:6: ( (lv_attribute_10_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3540:1: (lv_attribute_10_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3540:1: (lv_attribute_10_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3541:3: lv_attribute_10_0= RULE_ID
                    {
                    lv_attribute_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7487); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3558:6: ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3558:6: ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3558:7: ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3558:7: ( (lv_valueL_11_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3559:1: (lv_valueL_11_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3559:1: (lv_valueL_11_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3560:3: lv_valueL_11_0= RULE_STRING
                    {
                    lv_valueL_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7516); 

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

                    otherlv_12=(Token)match(input,109,FOLLOW_109_in_ruleStringFeature7533); 

                        	newLeafNode(otherlv_12, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_4_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3580:1: ( (lv_attribute_13_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3581:1: (lv_attribute_13_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3581:1: (lv_attribute_13_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3582:3: lv_attribute_13_0= RULE_ID
                    {
                    lv_attribute_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringFeature7550); 

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

                    otherlv_14=(Token)match(input,109,FOLLOW_109_in_ruleStringFeature7567); 

                        	newLeafNode(otherlv_14, grammarAccess.getStringFeatureAccess().getPlusSignKeyword_3_4_3());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3602:1: ( (lv_valueR_15_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3603:1: (lv_valueR_15_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3603:1: (lv_valueR_15_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3604:3: lv_valueR_15_0= RULE_STRING
                    {
                    lv_valueR_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringFeature7584); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3628:1: entryRuleBooleanFeature returns [EObject current=null] : iv_ruleBooleanFeature= ruleBooleanFeature EOF ;
    public final EObject entryRuleBooleanFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3629:2: (iv_ruleBooleanFeature= ruleBooleanFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3630:2: iv_ruleBooleanFeature= ruleBooleanFeature EOF
            {
             newCompositeNode(grammarAccess.getBooleanFeatureRule()); 
            pushFollow(FOLLOW_ruleBooleanFeature_in_entryRuleBooleanFeature7628);
            iv_ruleBooleanFeature=ruleBooleanFeature();

            state._fsp--;

             current =iv_ruleBooleanFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanFeature7638); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3637:1: ruleBooleanFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3640:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3641:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3641:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3641:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) ) otherlv_2= ':' ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3641:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3642:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3642:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3643:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleBooleanFeature7684);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3659:3: ( ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3660:1: ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3660:1: ( (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3661:1: (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3661:1: (lv_key_1_1= 'text-editable' | lv_key_1_2= 'font-italic' | lv_key_1_3= 'font-bold' )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt60=1;
                }
                break;
            case 111:
                {
                alt60=2;
                }
                break;
            case 112:
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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3662:3: lv_key_1_1= 'text-editable'
                    {
                    lv_key_1_1=(Token)match(input,110,FOLLOW_110_in_ruleBooleanFeature7705); 

                            newLeafNode(lv_key_1_1, grammarAccess.getBooleanFeatureAccess().getKeyTextEditableKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3674:8: lv_key_1_2= 'font-italic'
                    {
                    lv_key_1_2=(Token)match(input,111,FOLLOW_111_in_ruleBooleanFeature7734); 

                            newLeafNode(lv_key_1_2, grammarAccess.getBooleanFeatureAccess().getKeyFontItalicKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "key", lv_key_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3686:8: lv_key_1_3= 'font-bold'
                    {
                    lv_key_1_3=(Token)match(input,112,FOLLOW_112_in_ruleBooleanFeature7763); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBooleanFeature7791); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3705:1: ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3706:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3706:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3707:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3707:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==113) ) {
                alt61=1;
            }
            else if ( (LA61_0==114) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3708:3: lv_value_3_1= 'true'
                    {
                    lv_value_3_1=(Token)match(input,113,FOLLOW_113_in_ruleBooleanFeature7811); 

                            newLeafNode(lv_value_3_1, grammarAccess.getBooleanFeatureAccess().getValueTrueKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3720:8: lv_value_3_2= 'false'
                    {
                    lv_value_3_2=(Token)match(input,114,FOLLOW_114_in_ruleBooleanFeature7840); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3743:1: entryRuleLineFeature returns [EObject current=null] : iv_ruleLineFeature= ruleLineFeature EOF ;
    public final EObject entryRuleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3744:2: (iv_ruleLineFeature= ruleLineFeature EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3745:2: iv_ruleLineFeature= ruleLineFeature EOF
            {
             newCompositeNode(grammarAccess.getLineFeatureRule()); 
            pushFollow(FOLLOW_ruleLineFeature_in_entryRuleLineFeature7892);
            iv_ruleLineFeature=ruleLineFeature();

            state._fsp--;

             current =iv_ruleLineFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineFeature7902); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3752:1: ruleLineFeature returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) ) ;
    public final EObject ruleLineFeature() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3755:28: ( ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3756:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3756:1: ( ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3756:2: ( (lv_expression_0_0= ruleAtributeExpression ) )? ( (lv_key_1_0= 'line-style' ) ) otherlv_2= ':' ( (lv_value_3_0= ruleLineStyle ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3756:2: ( (lv_expression_0_0= ruleAtributeExpression ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3757:1: (lv_expression_0_0= ruleAtributeExpression )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3757:1: (lv_expression_0_0= ruleAtributeExpression )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3758:3: lv_expression_0_0= ruleAtributeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineFeatureAccess().getExpressionAtributeExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtributeExpression_in_ruleLineFeature7948);
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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3774:3: ( (lv_key_1_0= 'line-style' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3775:1: (lv_key_1_0= 'line-style' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3775:1: (lv_key_1_0= 'line-style' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3776:3: lv_key_1_0= 'line-style'
            {
            lv_key_1_0=(Token)match(input,115,FOLLOW_115_in_ruleLineFeature7967); 

                    newLeafNode(lv_key_1_0, grammarAccess.getLineFeatureAccess().getKeyLineStyleKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLineFeatureRule());
            	        }
                   		setWithLastConsumed(current, "key", lv_key_1_0, "line-style");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLineFeature7992); 

                	newLeafNode(otherlv_2, grammarAccess.getLineFeatureAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3793:1: ( (lv_value_3_0= ruleLineStyle ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3794:1: (lv_value_3_0= ruleLineStyle )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3794:1: (lv_value_3_0= ruleLineStyle )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3795:3: lv_value_3_0= ruleLineStyle
            {
             
            	        newCompositeNode(grammarAccess.getLineFeatureAccess().getValueLineStyleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLineStyle_in_ruleLineFeature8013);
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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3819:1: entryRuleLineStyle returns [String current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final String entryRuleLineStyle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3820:2: (iv_ruleLineStyle= ruleLineStyle EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3821:2: iv_ruleLineStyle= ruleLineStyle EOF
            {
             newCompositeNode(grammarAccess.getLineStyleRule()); 
            pushFollow(FOLLOW_ruleLineStyle_in_entryRuleLineStyle8050);
            iv_ruleLineStyle=ruleLineStyle();

            state._fsp--;

             current =iv_ruleLineStyle.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineStyle8061); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3828:1: ruleLineStyle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' ) ;
    public final AntlrDatatypeRuleToken ruleLineStyle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3831:28: ( (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3832:1: (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3832:1: (kw= 'solid' | kw= 'dash' | kw= 'dot' | kw= 'dashdot' )
            int alt63=4;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt63=1;
                }
                break;
            case 117:
                {
                alt63=2;
                }
                break;
            case 118:
                {
                alt63=3;
                }
                break;
            case 119:
                {
                alt63=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3833:2: kw= 'solid'
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleLineStyle8099); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getSolidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3840:2: kw= 'dash'
                    {
                    kw=(Token)match(input,117,FOLLOW_117_in_ruleLineStyle8118); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getDashKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3847:2: kw= 'dot'
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_ruleLineStyle8137); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineStyleAccess().getDotKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3854:2: kw= 'dashdot'
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_ruleLineStyle8156); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3867:1: entryRuleAtributeExpression returns [EObject current=null] : iv_ruleAtributeExpression= ruleAtributeExpression EOF ;
    public final EObject entryRuleAtributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributeExpression = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3868:2: (iv_ruleAtributeExpression= ruleAtributeExpression EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3869:2: iv_ruleAtributeExpression= ruleAtributeExpression EOF
            {
             newCompositeNode(grammarAccess.getAtributeExpressionRule()); 
            pushFollow(FOLLOW_ruleAtributeExpression_in_entryRuleAtributeExpression8196);
            iv_ruleAtributeExpression=ruleAtributeExpression();

            state._fsp--;

             current =iv_ruleAtributeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributeExpression8206); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3876:1: ruleAtributeExpression returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' ) ;
    public final EObject ruleAtributeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3879:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3880:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3880:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->' )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3880:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) ) ( (lv_value_2_0= ruleAtributeValue ) ) otherlv_3= '->'
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3880:2: ( (lv_key_0_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3881:1: (lv_key_0_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3881:1: (lv_key_0_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3882:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributeExpression8248); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3898:2: ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3899:1: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3899:1: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3900:1: (lv_operator_1_1= '=' | lv_operator_1_2= '<>' )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3900:1: (lv_operator_1_1= '=' | lv_operator_1_2= '<>' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==25) ) {
                alt64=1;
            }
            else if ( (LA64_0==86) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3901:3: lv_operator_1_1= '='
                    {
                    lv_operator_1_1=(Token)match(input,25,FOLLOW_25_in_ruleAtributeExpression8273); 

                            newLeafNode(lv_operator_1_1, grammarAccess.getAtributeExpressionAccess().getOperatorEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3913:8: lv_operator_1_2= '<>'
                    {
                    lv_operator_1_2=(Token)match(input,86,FOLLOW_86_in_ruleAtributeExpression8302); 

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

            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3928:2: ( (lv_value_2_0= ruleAtributeValue ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3929:1: (lv_value_2_0= ruleAtributeValue )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3929:1: (lv_value_2_0= ruleAtributeValue )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3930:3: lv_value_2_0= ruleAtributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAtributeExpressionAccess().getValueAtributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtributeValue_in_ruleAtributeExpression8339);
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

            otherlv_3=(Token)match(input,120,FOLLOW_120_in_ruleAtributeExpression8351); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3958:1: entryRuleAtributeValue returns [EObject current=null] : iv_ruleAtributeValue= ruleAtributeValue EOF ;
    public final EObject entryRuleAtributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributeValue = null;


        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3959:2: (iv_ruleAtributeValue= ruleAtributeValue EOF )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3960:2: iv_ruleAtributeValue= ruleAtributeValue EOF
            {
             newCompositeNode(grammarAccess.getAtributeValueRule()); 
            pushFollow(FOLLOW_ruleAtributeValue_in_entryRuleAtributeValue8387);
            iv_ruleAtributeValue=ruleAtributeValue();

            state._fsp--;

             current =iv_ruleAtributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributeValue8397); 

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
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3967:1: ruleAtributeValue returns [EObject current=null] : ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3970:28: ( ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3971:1: ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3971:1: ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) )
            int alt66=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 19:
                case 24:
                case 26:
                case 27:
                case 29:
                case 35:
                case 36:
                case 38:
                case 40:
                case 49:
                case 69:
                case 82:
                case 83:
                case 84:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 115:
                case 120:
                case 121:
                case 122:
                    {
                    alt66=1;
                    }
                    break;
                case 14:
                    {
                    alt66=2;
                    }
                    break;
                case 51:
                    {
                    alt66=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt66=3;
                }
                break;
            case 113:
            case 114:
                {
                alt66=4;
                }
                break;
            case RULE_STRING:
                {
                alt66=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3971:2: ( (lv_valueINT_0_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3971:2: ( (lv_valueINT_0_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3972:1: (lv_valueINT_0_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3972:1: (lv_valueINT_0_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3973:3: lv_valueINT_0_0= RULE_INT
                    {
                    lv_valueINT_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8439); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3990:6: ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3990:6: ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3990:7: ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3990:7: ( (lv_valueINT_1_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3991:1: (lv_valueINT_1_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3991:1: (lv_valueINT_1_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:3992:3: lv_valueINT_1_0= RULE_INT
                    {
                    lv_valueINT_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8468); 

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

                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAtributeValue8485); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtributeValueAccess().getFullStopKeyword_1_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4012:1: ( (lv_valueDEC_3_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4013:1: (lv_valueDEC_3_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4013:1: (lv_valueDEC_3_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4014:3: lv_valueDEC_3_0= RULE_INT
                    {
                    lv_valueDEC_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8502); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4031:6: ( (lv_valueID_4_0= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4031:6: ( (lv_valueID_4_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4032:1: (lv_valueID_4_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4032:1: (lv_valueID_4_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4033:3: lv_valueID_4_0= RULE_ID
                    {
                    lv_valueID_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributeValue8531); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4050:6: ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4050:6: ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4051:1: ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4051:1: ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4052:1: (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4052:1: (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==113) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==114) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4053:3: lv_valueBOOL_5_1= 'true'
                            {
                            lv_valueBOOL_5_1=(Token)match(input,113,FOLLOW_113_in_ruleAtributeValue8562); 

                                    newLeafNode(lv_valueBOOL_5_1, grammarAccess.getAtributeValueAccess().getValueBOOLTrueKeyword_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtributeValueRule());
                            	        }
                                   		setWithLastConsumed(current, "valueBOOL", lv_valueBOOL_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4065:8: lv_valueBOOL_5_2= 'false'
                            {
                            lv_valueBOOL_5_2=(Token)match(input,114,FOLLOW_114_in_ruleAtributeValue8591); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4081:6: ( (lv_valueSTRING_6_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4081:6: ( (lv_valueSTRING_6_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4082:1: (lv_valueSTRING_6_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4082:1: (lv_valueSTRING_6_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4083:3: lv_valueSTRING_6_0= RULE_STRING
                    {
                    lv_valueSTRING_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributeValue8630); 

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
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4100:6: ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4100:6: ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4100:7: ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4100:7: ( (lv_valueDAY_7_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4101:1: (lv_valueDAY_7_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4101:1: (lv_valueDAY_7_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4102:3: lv_valueDAY_7_0= RULE_INT
                    {
                    lv_valueDAY_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8659); 

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

                    otherlv_8=(Token)match(input,51,FOLLOW_51_in_ruleAtributeValue8676); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtributeValueAccess().getHyphenMinusKeyword_5_1());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4122:1: ( (lv_valueMONTH_9_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4123:1: (lv_valueMONTH_9_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4123:1: (lv_valueMONTH_9_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4124:3: lv_valueMONTH_9_0= RULE_INT
                    {
                    lv_valueMONTH_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8693); 

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

                    otherlv_10=(Token)match(input,51,FOLLOW_51_in_ruleAtributeValue8710); 

                        	newLeafNode(otherlv_10, grammarAccess.getAtributeValueAccess().getHyphenMinusKeyword_5_3());
                        
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4144:1: ( (lv_valueYEAR_11_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4145:1: (lv_valueYEAR_11_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4145:1: (lv_valueYEAR_11_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4146:3: lv_valueYEAR_11_0= RULE_INT
                    {
                    lv_valueYEAR_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue8727); 

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


    // $ANTLR start "ruleContainerLayout"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4170:1: ruleContainerLayout returns [Enumerator current=null] : ( (enumLiteral_0= 'stack' ) | (enumLiteral_1= 'free' ) ) ;
    public final Enumerator ruleContainerLayout() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4172:28: ( ( (enumLiteral_0= 'stack' ) | (enumLiteral_1= 'free' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4173:1: ( (enumLiteral_0= 'stack' ) | (enumLiteral_1= 'free' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4173:1: ( (enumLiteral_0= 'stack' ) | (enumLiteral_1= 'free' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==121) ) {
                alt67=1;
            }
            else if ( (LA67_0==122) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4173:2: (enumLiteral_0= 'stack' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4173:2: (enumLiteral_0= 'stack' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4173:4: enumLiteral_0= 'stack'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_121_in_ruleContainerLayout8783); 

                            current = grammarAccess.getContainerLayoutAccess().getSTACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContainerLayoutAccess().getSTACKEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4179:6: (enumLiteral_1= 'free' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4179:6: (enumLiteral_1= 'free' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4179:8: enumLiteral_1= 'free'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_122_in_ruleContainerLayout8800); 

                            current = grammarAccess.getContainerLayoutAccess().getFREEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContainerLayoutAccess().getFREEEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleContainerLayout"


    // $ANTLR start "ruleFigureShape"
    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4189:1: ruleFigureShape returns [Enumerator current=null] : ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) ) ;
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
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4191:28: ( ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) ) )
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4192:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) )
            {
            // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4192:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Rectangle' ) | (enumLiteral_2= 'RoundedRectangle' ) | (enumLiteral_3= 'Circle' ) | (enumLiteral_4= 'Ellipse' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Rhombus' ) | (enumLiteral_7= 'Polygon' ) | (enumLiteral_8= 'Polyline' ) | (enumLiteral_9= 'Label' ) | (enumLiteral_10= 'Image' ) )
            int alt68=11;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt68=1;
                }
                break;
            case 124:
                {
                alt68=2;
                }
                break;
            case 125:
                {
                alt68=3;
                }
                break;
            case 126:
                {
                alt68=4;
                }
                break;
            case 127:
                {
                alt68=5;
                }
                break;
            case 45:
                {
                alt68=6;
                }
                break;
            case 46:
                {
                alt68=7;
                }
                break;
            case 47:
                {
                alt68=8;
                }
                break;
            case 48:
                {
                alt68=9;
                }
                break;
            case 42:
                {
                alt68=10;
                }
                break;
            case 128:
                {
                alt68=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4192:2: (enumLiteral_0= 'Square' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4192:2: (enumLiteral_0= 'Square' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4192:4: enumLiteral_0= 'Square'
                    {
                    enumLiteral_0=(Token)match(input,123,FOLLOW_123_in_ruleFigureShape8845); 

                            current = grammarAccess.getFigureShapeAccess().getSQUAREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFigureShapeAccess().getSQUAREEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4198:6: (enumLiteral_1= 'Rectangle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4198:6: (enumLiteral_1= 'Rectangle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4198:8: enumLiteral_1= 'Rectangle'
                    {
                    enumLiteral_1=(Token)match(input,124,FOLLOW_124_in_ruleFigureShape8862); 

                            current = grammarAccess.getFigureShapeAccess().getRECTANGLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFigureShapeAccess().getRECTANGLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4204:6: (enumLiteral_2= 'RoundedRectangle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4204:6: (enumLiteral_2= 'RoundedRectangle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4204:8: enumLiteral_2= 'RoundedRectangle'
                    {
                    enumLiteral_2=(Token)match(input,125,FOLLOW_125_in_ruleFigureShape8879); 

                            current = grammarAccess.getFigureShapeAccess().getROUNDED_RECTANGLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFigureShapeAccess().getROUNDED_RECTANGLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4210:6: (enumLiteral_3= 'Circle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4210:6: (enumLiteral_3= 'Circle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4210:8: enumLiteral_3= 'Circle'
                    {
                    enumLiteral_3=(Token)match(input,126,FOLLOW_126_in_ruleFigureShape8896); 

                            current = grammarAccess.getFigureShapeAccess().getCIRCLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFigureShapeAccess().getCIRCLEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4216:6: (enumLiteral_4= 'Ellipse' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4216:6: (enumLiteral_4= 'Ellipse' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4216:8: enumLiteral_4= 'Ellipse'
                    {
                    enumLiteral_4=(Token)match(input,127,FOLLOW_127_in_ruleFigureShape8913); 

                            current = grammarAccess.getFigureShapeAccess().getELLIPSEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFigureShapeAccess().getELLIPSEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4222:6: (enumLiteral_5= 'Triangle' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4222:6: (enumLiteral_5= 'Triangle' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4222:8: enumLiteral_5= 'Triangle'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_45_in_ruleFigureShape8930); 

                            current = grammarAccess.getFigureShapeAccess().getTRIANGLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFigureShapeAccess().getTRIANGLEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4228:6: (enumLiteral_6= 'Rhombus' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4228:6: (enumLiteral_6= 'Rhombus' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4228:8: enumLiteral_6= 'Rhombus'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_46_in_ruleFigureShape8947); 

                            current = grammarAccess.getFigureShapeAccess().getRHOMBUSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getFigureShapeAccess().getRHOMBUSEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4234:6: (enumLiteral_7= 'Polygon' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4234:6: (enumLiteral_7= 'Polygon' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4234:8: enumLiteral_7= 'Polygon'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_47_in_ruleFigureShape8964); 

                            current = grammarAccess.getFigureShapeAccess().getPOLYGONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getFigureShapeAccess().getPOLYGONEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4240:6: (enumLiteral_8= 'Polyline' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4240:6: (enumLiteral_8= 'Polyline' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4240:8: enumLiteral_8= 'Polyline'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_48_in_ruleFigureShape8981); 

                            current = grammarAccess.getFigureShapeAccess().getPOLYLINEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getFigureShapeAccess().getPOLYLINEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4246:6: (enumLiteral_9= 'Label' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4246:6: (enumLiteral_9= 'Label' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4246:8: enumLiteral_9= 'Label'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_42_in_ruleFigureShape8998); 

                            current = grammarAccess.getFigureShapeAccess().getLABELEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getFigureShapeAccess().getLABELEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4252:6: (enumLiteral_10= 'Image' )
                    {
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4252:6: (enumLiteral_10= 'Image' )
                    // ../org.eclipselabs.xdiagram.xtext/src-gen/org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.g:4252:8: enumLiteral_10= 'Image'
                    {
                    enumLiteral_10=(Token)match(input,128,FOLLOW_128_in_ruleFigureShape9015); 

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


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA26_eotS =
        "\25\uffff";
    static final String DFA26_eofS =
        "\25\uffff";
    static final String DFA26_minS =
        "\1\5\2\uffff\1\31\3\uffff\2\4\1\16\4\170\2\6\1\105\1\63\1\170\1"+
        "\6\1\170";
    static final String DFA26_maxS =
        "\1\163\2\uffff\1\126\3\uffff\2\162\5\170\2\6\1\163\1\63\1\170\1"+
        "\6\1\170";
    static final String DFA26_acceptS =
        "\1\uffff\1\5\1\1\1\uffff\1\2\1\3\1\4\16\uffff";
    static final String DFA26_specialS =
        "\25\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\3\15\uffff\1\1\4\uffff\1\2\12\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\1\1\34\uffff\1\6\14\uffff\3\5\16\uffff\10\6\10\uffff\1\4",
            "",
            "",
            "\1\7\74\uffff\1\10",
            "",
            "",
            "",
            "\1\15\1\12\1\11\152\uffff\1\13\1\14",
            "\1\15\1\12\1\11\152\uffff\1\13\1\14",
            "\1\17\44\uffff\1\16\104\uffff\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\6\14\uffff\3\5\16\uffff\10\6\10\uffff\1\4",
            "\1\23",
            "\1\20",
            "\1\24",
            "\1\20"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 1122:4: ( ( (lv_attributes_16_0= ruleAttribute ) ) | ( (lv_linefeatures_17_0= ruleLineFeature ) ) | ( (lv_colorfeatures_18_0= ruleColorFeature ) ) | ( (lv_integerfeatures_19_0= ruleIntegerFeature ) ) )*";
        }
    }
    static final String DFA43_eotS =
        "\34\uffff";
    static final String DFA43_eofS =
        "\1\1\33\uffff";
    static final String DFA43_minS =
        "\1\5\1\uffff\1\31\13\uffff\2\4\1\16\4\170\2\6\1\26\1\170\1\63\1"+
        "\6\1\170";
    static final String DFA43_maxS =
        "\1\163\1\uffff\1\126\13\uffff\2\162\5\170\2\6\1\163\1\170\1\63\1"+
        "\6\1\170";
    static final String DFA43_acceptS =
        "\1\uffff\1\14\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
        "\1\13\16\uffff";
    static final String DFA43_specialS =
        "\34\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\2\15\uffff\1\1\2\uffff\1\15\54\uffff\1\4\1\5\1\13\1\uffff"+
            "\1\6\7\uffff\1\7\1\10\1\11\3\12\16\uffff\10\13\2\15\1\uffff"+
            "\3\14\2\uffff\1\3",
            "",
            "\1\16\74\uffff\1\17",
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
            "\1\24\1\21\1\20\152\uffff\1\22\1\23",
            "\1\24\1\21\1\20\152\uffff\1\22\1\23",
            "\1\25\44\uffff\1\26\104\uffff\1\27",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\15\56\uffff\1\13\14\uffff\3\12\16\uffff\10\13\2\15\1\uffff"+
            "\3\14\2\uffff\1\3",
            "\1\27",
            "\1\32",
            "\1\33",
            "\1\27"
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 2018:2: ( ( (lv_linefeatures_1_0= ruleLineFeature ) ) | ( (lv_centerfeatures_2_0= ruleCenterFeature ) ) | ( (lv_alignfeatures_3_0= ruleAlignFeature ) ) | ( (lv_gradientfeatures_4_0= ruleGradientFeature ) ) | ( (lv_pointfeatures_5_0= rulePointFeature ) ) | ( (lv_sizefeatures_6_0= ruleSizeFeature ) ) | ( (lv_positionfeatures_7_0= rulePositionFeature ) ) | ( (lv_colorfeatures_8_0= ruleColorFeature ) ) | ( (lv_integerfeatures_9_0= ruleIntegerFeature ) ) | ( (lv_booleanfeatures_10_0= ruleBooleanFeature ) ) | ( (lv_stringfeatures_11_0= ruleStringFeature ) ) )*";
        }
    }
    static final String DFA58_eotS =
        "\13\uffff";
    static final String DFA58_eofS =
        "\1\3\1\5\1\7\5\uffff\1\12\2\uffff";
    static final String DFA58_minS =
        "\1\4\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff";
    static final String DFA58_maxS =
        "\3\163\1\uffff\1\5\3\uffff\1\163\2\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\1\6\1\uffff\1\1\1\3\1\4\1\uffff\1\5\1\2";
    static final String DFA58_specialS =
        "\13\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\1\2\15\uffff\1\3\2\uffff\1\3\54\uffff\3\3\1\uffff\1\3\7"+
            "\uffff\6\3\16\uffff\12\3\1\uffff\3\3\2\uffff\1\3",
            "\1\5\15\uffff\1\5\2\uffff\1\5\54\uffff\3\5\1\uffff\1\5\7\uffff"+
            "\6\5\16\uffff\12\5\1\4\3\5\2\uffff\1\5",
            "\1\7\15\uffff\1\7\2\uffff\1\7\2\uffff\1\3\51\uffff\3\7\1\uffff"+
            "\1\7\7\uffff\6\7\1\uffff\1\3\14\uffff\12\7\1\6\3\7\2\uffff\1"+
            "\7",
            "",
            "\1\10",
            "",
            "",
            "",
            "\1\12\15\uffff\1\12\2\uffff\1\12\54\uffff\3\12\1\uffff\1\12"+
            "\7\uffff\6\12\16\uffff\12\12\1\11\3\12\2\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3438:1: ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_valueL_4_0= RULE_STRING ) ) otherlv_5= '+' ( (lv_attribute_6_0= RULE_ID ) ) ) | ( ( (lv_attribute_7_0= RULE_ID ) ) otherlv_8= '+' ( (lv_valueR_9_0= RULE_STRING ) ) ) | ( (lv_attribute_10_0= RULE_ID ) ) | ( ( (lv_valueL_11_0= RULE_STRING ) ) otherlv_12= '+' ( (lv_attribute_13_0= RULE_ID ) ) otherlv_14= '+' ( (lv_valueR_15_0= RULE_STRING ) ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleXDiagram_in_entryRuleXDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleXDiagram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXDiagram139 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleXDiagram165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXDiagram177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXDiagram200 = new BitSet(new long[]{0x0000000200110002L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleXDiagram221 = new BitSet(new long[]{0x0000000200110002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleXDiagram244 = new BitSet(new long[]{0x0000000200100002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleXDiagram271 = new BitSet(new long[]{0x0000000200100002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportStatement366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportStatement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName477 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName496 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName511 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard617 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard636 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStyle738 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStyle750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStyle767 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStyle784 = new BitSet(new long[]{0x0000000000480020L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleStyle805 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStyle817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNode902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNode925 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNode937 = new BitSet(new long[]{0x000200002DE90000L,0x0600000000000000L});
    public static final BitSet FOLLOW_21_in_ruleNode955 = new BitSet(new long[]{0x000200002DC90000L,0x0600000000000000L});
    public static final BitSet FOLLOW_16_in_ruleNode982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode999 = new BitSet(new long[]{0x000200002DC80000L,0x0600000000000000L});
    public static final BitSet FOLLOW_22_in_ruleNode1019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1036 = new BitSet(new long[]{0x000200002D880000L,0x0600000000000000L});
    public static final BitSet FOLLOW_23_in_ruleNode1056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode1073 = new BitSet(new long[]{0x000200002D080000L,0x0600000000000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleNode1101 = new BitSet(new long[]{0x000200002D080000L,0x0600000000000000L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_ruleNode1123 = new BitSet(new long[]{0x000200002C080000L,0x0600000000000000L});
    public static final BitSet FOLLOW_ruleNodeContainer_in_ruleNode1145 = new BitSet(new long[]{0x0002000020080000L,0x0600000000000000L});
    public static final BitSet FOLLOW_ruleNodeAnchor_in_ruleNode1167 = new BitSet(new long[]{0x0002000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNode1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAttribute1263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1280 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAttribute1297 = new BitSet(new long[]{0x0000000000000070L,0x0006000000000000L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_ruleAttribute1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_entryRuleNodeFigure1354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeFigure1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNodeFigure1407 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNodeFigure1433 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNodeFigure1445 = new BitSet(new long[]{0x0001E40000000000L,0xF800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFigureShape_in_ruleNodeFigure1466 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_28_in_ruleNodeFigure1479 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNodeFigure1491 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNodeFigure1503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeFigure1520 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeFigure1539 = new BitSet(new long[]{0x0000000000480020L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleNodeFigure1560 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeFigure1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeContainer_in_entryRuleNodeContainer1608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeContainer1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleNodeContainer1664 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNodeContainer1677 = new BitSet(new long[]{0x0000000040060000L});
    public static final BitSet FOLLOW_30_in_ruleNodeContainer1690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNodeContainer1713 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleNodeContainer1728 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeContainer1745 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleNodeContainer1770 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_32_in_ruleNodeContainer1799 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeContainer1829 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_ruleNodeContainer1850 = new BitSet(new long[]{0x000000000C080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeContainer1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLink1946 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink1970 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_34_in_ruleLink1995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2031 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleLink2043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2066 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleLink2078 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2101 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLink2115 = new BitSet(new long[]{0x0000017801C90020L,0x000807F8001C0020L});
    public static final BitSet FOLLOW_37_in_ruleLink2133 = new BitSet(new long[]{0x0000015801C90020L,0x000807F8001C0020L});
    public static final BitSet FOLLOW_16_in_ruleLink2160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2177 = new BitSet(new long[]{0x0000015801C80020L,0x000807F8001C0020L});
    public static final BitSet FOLLOW_22_in_ruleLink2197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2214 = new BitSet(new long[]{0x0000015801880020L,0x000807F8001C0020L});
    public static final BitSet FOLLOW_23_in_ruleLink2234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink2251 = new BitSet(new long[]{0x0000015801080020L,0x000807F8001C0020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleLink2280 = new BitSet(new long[]{0x0000015801080020L,0x000807F8001C0020L});
    public static final BitSet FOLLOW_ruleLineFeature_in_ruleLink2307 = new BitSet(new long[]{0x0000015801080020L,0x000807F8001C0020L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleLink2334 = new BitSet(new long[]{0x0000015801080020L,0x000807F8001C0020L});
    public static final BitSet FOLLOW_ruleIntegerFeature_in_ruleLink2361 = new BitSet(new long[]{0x0000015801080020L,0x000807F8001C0020L});
    public static final BitSet FOLLOW_ruleDecorator_in_ruleLink2384 = new BitSet(new long[]{0x0000015800080000L});
    public static final BitSet FOLLOW_19_in_ruleLink2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorator_in_entryRuleDecorator2433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorator2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDecorator2481 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDecorator2494 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecorator2511 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDecorator2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDecorator2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDecorator2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDecorator2629 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDecorator2654 = new BitSet(new long[]{0x0000020008080000L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_ruleDecorator2675 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_ruleDecorator2697 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_19_in_ruleDecorator2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicFigure_in_entryRuleDynamicFigure2747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicFigure2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDynamicFigure2794 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleDynamicElement_in_ruleDynamicFigure2815 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDynamicFigure2827 = new BitSet(new long[]{0x0000000000480020L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleDynamicFigure2848 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDynamicFigure2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicElement_in_entryRuleDynamicElement2897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicElement2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDynamicElement2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDynamicElement2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticFigure_in_entryRuleStaticFigure3005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticFigure3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleStaticFigure3052 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStaticFigure3064 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_ruleStaticElement_in_ruleStaticFigure3085 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_28_in_ruleStaticFigure3098 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStaticFigure3110 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStaticFigure3122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStaticFigure3139 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStaticFigure3158 = new BitSet(new long[]{0x0000000000480020L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_ruleStaticFigure3179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStaticFigure3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticElement_in_entryRuleStaticElement3228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticElement3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleStaticElement3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleStaticElement3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleStaticElement3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleStaticElement3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleStaticElement3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAnchor_in_entryRuleNodeAnchor3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAnchor3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNodeAnchor3440 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_50_in_ruleNodeAnchor3453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeAnchor3470 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNodeAnchor3489 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_51_in_ruleNodeAnchor3507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeAnchor3538 = new BitSet(new long[]{0x0030000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNodeAnchor3563 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_52_in_ruleNodeAnchor3592 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_53_in_ruleNodeAnchor3621 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNodeAnchor3649 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_51_in_ruleNodeAnchor3667 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeAnchor3698 = new BitSet(new long[]{0x00C0000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNodeAnchor3723 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_54_in_ruleNodeAnchor3752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_55_in_ruleNodeAnchor3781 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeAnchor3809 = new BitSet(new long[]{0x000000000D080000L});
    public static final BitSet FOLLOW_ruleNodeFigure_in_ruleNodeAnchor3830 = new BitSet(new long[]{0x000000000D080000L});
    public static final BitSet FOLLOW_ruleArrowAnchor_in_ruleNodeAnchor3852 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeAnchor3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowAnchor_in_entryRuleArrowAnchor3901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowAnchor3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleArrowAnchor3948 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArrowAnchor3965 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleArrowAnchor3982 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleArrowAnchor4002 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_58_in_ruleArrowAnchor4031 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_59_in_ruleArrowAnchor4060 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleArrowAnchor4088 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleArrowAnchor4101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArrowAnchor4118 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleArrowAnchor4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFigureFeatures_in_entryRuleFigureFeatures4173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFigureFeatures4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineFeature_in_ruleFigureFeatures4239 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleCenterFeature_in_ruleFigureFeatures4266 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleAlignFeature_in_ruleFigureFeatures4293 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleGradientFeature_in_ruleFigureFeatures4320 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_rulePointFeature_in_ruleFigureFeatures4347 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_ruleFigureFeatures4374 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_rulePositionFeature_in_ruleFigureFeatures4401 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleFigureFeatures4428 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleIntegerFeature_in_ruleFigureFeatures4455 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleBooleanFeature_in_ruleFigureFeatures4482 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleStringFeature_in_ruleFigureFeatures4509 = new BitSet(new long[]{0x0000000000400022L,0x0009DFF8001F80B8L});
    public static final BitSet FOLLOW_ruleLayoutFeature_in_entryRuleLayoutFeature4549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutFeature4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleLayoutFeature4602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLayoutFeature4627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_64_in_ruleLayoutFeature4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLayoutFeature4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleLayoutFeature4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCenterFeature_in_entryRuleCenterFeature4757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCenterFeature4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCenterFeature4810 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCenterFeature4835 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_ruleCenterFeature4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCenterFeature4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCenterFeature4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignFeature_in_entryRuleAlignFeature4965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignFeature4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAlignFeature5018 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAlignFeature5043 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleAlignFeature5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAlignFeature5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAlignFeature5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientFeature_in_entryRuleGradientFeature5173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGradientFeature5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleGradientFeature5226 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGradientFeature5251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_72_in_ruleGradientFeature5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleGradientFeature5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleGradientFeature5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleGradientFeature5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleGradientFeature5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleGradientFeature5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleGradientFeature5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointFeature_in_entryRulePointFeature5497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointFeature5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePointFeature5544 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePointFeature5556 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePointFeature5573 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePointFeature5590 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePointFeature5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature5648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeFeature5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleSizeFeature5695 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSizeFeature5707 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSizeFeature5724 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSizeFeature5741 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSizeFeature5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionFeature_in_entryRulePositionFeature5799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionFeature5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulePositionFeature5846 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePositionFeature5858 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionFeature5875 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePositionFeature5892 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionFeature5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature5950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleColorFeature6006 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_82_in_ruleColorFeature6027 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_83_in_ruleColorFeature6056 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_84_in_ruleColorFeature6085 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleColorFeature6113 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorFeature6135 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleRGB_in_ruleColorFeature6162 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleColorFeature6176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorFeature6193 = new BitSet(new long[]{0x0000000002000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_25_in_ruleColorFeature6218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_86_in_ruleColorFeature6247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorFeature6280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleColorFeature6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor6336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleColor6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleColor6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleColor6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleColor6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleColor6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleColor6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleColor6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleColor6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGB_in_entryRuleRGB6558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGB6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRGB6605 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleRGB6617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB6634 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRGB6651 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB6668 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRGB6685 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB6702 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleRGB6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature6755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerFeature6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleIntegerFeature6811 = new BitSet(new long[]{0x0000000000000000L,0x000007F800000020L});
    public static final BitSet FOLLOW_99_in_ruleIntegerFeature6832 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_100_in_ruleIntegerFeature6861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_69_in_ruleIntegerFeature6890 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_101_in_ruleIntegerFeature6919 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_102_in_ruleIntegerFeature6948 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_103_in_ruleIntegerFeature6977 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_104_in_ruleIntegerFeature7006 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_105_in_ruleIntegerFeature7035 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_106_in_ruleIntegerFeature7064 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIntegerFeature7092 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerFeature7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFeature_in_entryRuleStringFeature7150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFeature7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleStringFeature7206 = new BitSet(new long[]{0x0000000000400000L,0x0000180000000000L});
    public static final BitSet FOLLOW_107_in_ruleStringFeature7227 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_108_in_ruleStringFeature7256 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22_in_ruleStringFeature7285 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStringFeature7313 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7360 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleStringFeature7377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7424 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleStringFeature7441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7516 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleStringFeature7533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringFeature7550 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleStringFeature7567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringFeature7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanFeature_in_entryRuleBooleanFeature7628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanFeature7638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleBooleanFeature7684 = new BitSet(new long[]{0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_110_in_ruleBooleanFeature7705 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_111_in_ruleBooleanFeature7734 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_112_in_ruleBooleanFeature7763 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBooleanFeature7791 = new BitSet(new long[]{0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_113_in_ruleBooleanFeature7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleBooleanFeature7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineFeature_in_entryRuleLineFeature7892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineFeature7902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_ruleLineFeature7948 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleLineFeature7967 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLineFeature7992 = new BitSet(new long[]{0x0000000000000000L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleLineFeature8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_entryRuleLineStyle8050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineStyle8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleLineStyle8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleLineStyle8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleLineStyle8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleLineStyle8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_entryRuleAtributeExpression8196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributeExpression8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributeExpression8248 = new BitSet(new long[]{0x0000000002000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_25_in_ruleAtributeExpression8273 = new BitSet(new long[]{0x0000000000000070L,0x0006000000000000L});
    public static final BitSet FOLLOW_86_in_ruleAtributeExpression8302 = new BitSet(new long[]{0x0000000000000070L,0x0006000000000000L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_ruleAtributeExpression8339 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleAtributeExpression8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_entryRuleAtributeValue8387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributeValue8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8468 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtributeValue8485 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributeValue8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleAtributeValue8562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleAtributeValue8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributeValue8630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8659 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleAtributeValue8676 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8693 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleAtributeValue8710 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue8727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleContainerLayout8783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleContainerLayout8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleFigureShape8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleFigureShape8862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleFigureShape8879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleFigureShape8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleFigureShape8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleFigureShape8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFigureShape8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleFigureShape8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFigureShape8981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFigureShape8998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleFigureShape9015 = new BitSet(new long[]{0x0000000000000002L});

}