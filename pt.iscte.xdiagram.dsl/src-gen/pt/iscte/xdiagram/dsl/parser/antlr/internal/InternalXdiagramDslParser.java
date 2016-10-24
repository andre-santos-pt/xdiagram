package pt.iscte.xdiagram.dsl.parser.antlr.internal;

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
import pt.iscte.xdiagram.dsl.services.XdiagramDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdiagramDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xdiagram'", "'metamodel'", "'meta'", "'plugin'", "':'", "'ecore-file'", "'import'", "'.'", "'*'", "'diagram'", "'{'", "'}'", "'toolgroup'", "';'", "'style'", "'+'", "'if'", "'tool'", "'group'", "'icon'", "'node'", "'link'", "'reference'", "'class'", "'source'", "'target'", "'decorator'", "'%'", "'anchor'", "'max'", "'color'", "'figure'", "'as'", "'child'", "'rectangle'", "'square'", "'rhombus'", "'ellipse'", "'circle'", "'polygon'", "'polyline'", "'triangle'", "'hline'", "'vline'", "'arrow'", "'contains'", "'null'", "'label'", "'image'", "'invisible'", "'foreground'", "'background'", "'transparency'", "'size'", "']'", "'resizable'", "'point'", "'position'", "'corner'", "'layout'", "'vertical'", "'horizontal'", "'margin'", "'text'", "'edit:'", "'font'", "'arial'", "'verdana'", "'courier'", "'times'", "'bold'", "'italics'", "'align'", "'linestyle'", "'manhattan'", "'linewidth'", "'incoming'", "'outgoing'", "'white'", "'silver'", "'gray'", "'black'", "'red'", "'maroon'", "'yellow'", "'olive'", "'lime'", "'green'", "'aqua'", "'teal'", "'blue'", "'navy'", "'fuchsia'", "'purple'", "'='", "'<>'", "'true'", "'false'", "'left'", "'center'", "'right'", "'solid'", "'dashed'", "'dotted'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalXdiagramDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXdiagramDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXdiagramDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXdiagramDsl.g"; }



     	private XdiagramDslGrammarAccess grammarAccess;

        public InternalXdiagramDslParser(TokenStream input, XdiagramDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "XDiagram";
       	}

       	@Override
       	protected XdiagramDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleXDiagram"
    // InternalXdiagramDsl.g:65:1: entryRuleXDiagram returns [EObject current=null] : iv_ruleXDiagram= ruleXDiagram EOF ;
    public final EObject entryRuleXDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDiagram = null;


        try {
            // InternalXdiagramDsl.g:65:49: (iv_ruleXDiagram= ruleXDiagram EOF )
            // InternalXdiagramDsl.g:66:2: iv_ruleXDiagram= ruleXDiagram EOF
            {
             newCompositeNode(grammarAccess.getXDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXDiagram=ruleXDiagram();

            state._fsp--;

             current =iv_ruleXDiagram; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:72:1: ruleXDiagram returns [EObject current=null] : (otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) )? ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_metamodel_6_0= ruleMetaModel ) ) ( (lv_diagram_7_0= ruleDiagram ) ) ( (lv_groups_8_0= ruleToolGroup ) )* ( ( (lv_elements_9_0= ruleDiagramElement ) ) | ( (lv_styles_10_0= ruleStyle ) ) | ( (lv_colors_11_0= ruleCustomColor ) ) | ( (lv_figures_12_0= ruleCustomFigure ) ) )* ) ;
    public final EObject ruleXDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_desc_2_0=null;
        Token otherlv_3=null;
        Token lv_importURI_4_0=null;
        EObject lv_imports_5_0 = null;

        EObject lv_metamodel_6_0 = null;

        EObject lv_diagram_7_0 = null;

        EObject lv_groups_8_0 = null;

        EObject lv_elements_9_0 = null;

        EObject lv_styles_10_0 = null;

        EObject lv_colors_11_0 = null;

        EObject lv_figures_12_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:78:2: ( (otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) )? ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_metamodel_6_0= ruleMetaModel ) ) ( (lv_diagram_7_0= ruleDiagram ) ) ( (lv_groups_8_0= ruleToolGroup ) )* ( ( (lv_elements_9_0= ruleDiagramElement ) ) | ( (lv_styles_10_0= ruleStyle ) ) | ( (lv_colors_11_0= ruleCustomColor ) ) | ( (lv_figures_12_0= ruleCustomFigure ) ) )* ) )
            // InternalXdiagramDsl.g:79:2: (otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) )? ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_metamodel_6_0= ruleMetaModel ) ) ( (lv_diagram_7_0= ruleDiagram ) ) ( (lv_groups_8_0= ruleToolGroup ) )* ( ( (lv_elements_9_0= ruleDiagramElement ) ) | ( (lv_styles_10_0= ruleStyle ) ) | ( (lv_colors_11_0= ruleCustomColor ) ) | ( (lv_figures_12_0= ruleCustomFigure ) ) )* )
            {
            // InternalXdiagramDsl.g:79:2: (otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) )? ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_metamodel_6_0= ruleMetaModel ) ) ( (lv_diagram_7_0= ruleDiagram ) ) ( (lv_groups_8_0= ruleToolGroup ) )* ( ( (lv_elements_9_0= ruleDiagramElement ) ) | ( (lv_styles_10_0= ruleStyle ) ) | ( (lv_colors_11_0= ruleCustomColor ) ) | ( (lv_figures_12_0= ruleCustomFigure ) ) )* )
            // InternalXdiagramDsl.g:80:3: otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) )? ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_metamodel_6_0= ruleMetaModel ) ) ( (lv_diagram_7_0= ruleDiagram ) ) ( (lv_groups_8_0= ruleToolGroup ) )* ( ( (lv_elements_9_0= ruleDiagramElement ) ) | ( (lv_styles_10_0= ruleStyle ) ) | ( (lv_colors_11_0= ruleCustomColor ) ) | ( (lv_figures_12_0= ruleCustomFigure ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getXDiagramAccess().getXdiagramKeyword_0());
            		
            // InternalXdiagramDsl.g:84:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:85:4: (lv_id_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:85:4: (lv_id_1_0= RULE_ID )
            // InternalXdiagramDsl.g:86:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_id_1_0, grammarAccess.getXDiagramAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdiagramDsl.g:102:3: ( (lv_desc_2_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:103:4: (lv_desc_2_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:103:4: (lv_desc_2_0= RULE_STRING )
            // InternalXdiagramDsl.g:104:5: lv_desc_2_0= RULE_STRING
            {
            lv_desc_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_desc_2_0, grammarAccess.getXDiagramAccess().getDescSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"desc",
            						lv_desc_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXdiagramDsl.g:120:3: (otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXdiagramDsl.g:121:4: otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getXDiagramAccess().getMetamodelKeyword_3_0());
                    			
                    // InternalXdiagramDsl.g:125:4: ( (lv_importURI_4_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:126:5: (lv_importURI_4_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:126:5: (lv_importURI_4_0= RULE_STRING )
                    // InternalXdiagramDsl.g:127:6: lv_importURI_4_0= RULE_STRING
                    {
                    lv_importURI_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_importURI_4_0, grammarAccess.getXDiagramAccess().getImportURISTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXDiagramRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"importURI",
                    							lv_importURI_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:144:3: ( (lv_imports_5_0= ruleImportStatement ) )
            // InternalXdiagramDsl.g:145:4: (lv_imports_5_0= ruleImportStatement )
            {
            // InternalXdiagramDsl.g:145:4: (lv_imports_5_0= ruleImportStatement )
            // InternalXdiagramDsl.g:146:5: lv_imports_5_0= ruleImportStatement
            {

            					newCompositeNode(grammarAccess.getXDiagramAccess().getImportsImportStatementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_imports_5_0=ruleImportStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXDiagramRule());
            					}
            					add(
            						current,
            						"imports",
            						lv_imports_5_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.ImportStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:163:3: ( (lv_metamodel_6_0= ruleMetaModel ) )
            // InternalXdiagramDsl.g:164:4: (lv_metamodel_6_0= ruleMetaModel )
            {
            // InternalXdiagramDsl.g:164:4: (lv_metamodel_6_0= ruleMetaModel )
            // InternalXdiagramDsl.g:165:5: lv_metamodel_6_0= ruleMetaModel
            {

            					newCompositeNode(grammarAccess.getXDiagramAccess().getMetamodelMetaModelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_metamodel_6_0=ruleMetaModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXDiagramRule());
            					}
            					set(
            						current,
            						"metamodel",
            						lv_metamodel_6_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.MetaModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:182:3: ( (lv_diagram_7_0= ruleDiagram ) )
            // InternalXdiagramDsl.g:183:4: (lv_diagram_7_0= ruleDiagram )
            {
            // InternalXdiagramDsl.g:183:4: (lv_diagram_7_0= ruleDiagram )
            // InternalXdiagramDsl.g:184:5: lv_diagram_7_0= ruleDiagram
            {

            					newCompositeNode(grammarAccess.getXDiagramAccess().getDiagramDiagramParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_diagram_7_0=ruleDiagram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXDiagramRule());
            					}
            					set(
            						current,
            						"diagram",
            						lv_diagram_7_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Diagram");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:201:3: ( (lv_groups_8_0= ruleToolGroup ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXdiagramDsl.g:202:4: (lv_groups_8_0= ruleToolGroup )
            	    {
            	    // InternalXdiagramDsl.g:202:4: (lv_groups_8_0= ruleToolGroup )
            	    // InternalXdiagramDsl.g:203:5: lv_groups_8_0= ruleToolGroup
            	    {

            	    					newCompositeNode(grammarAccess.getXDiagramAccess().getGroupsToolGroupParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_groups_8_0=ruleToolGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groups",
            	    						lv_groups_8_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ToolGroup");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalXdiagramDsl.g:220:3: ( ( (lv_elements_9_0= ruleDiagramElement ) ) | ( (lv_styles_10_0= ruleStyle ) ) | ( (lv_colors_11_0= ruleCustomColor ) ) | ( (lv_figures_12_0= ruleCustomFigure ) ) )*
            loop3:
            do {
                int alt3=5;
                switch ( input.LA(1) ) {
                case 28:
                case 31:
                case 32:
                    {
                    alt3=1;
                    }
                    break;
                case 25:
                    {
                    alt3=2;
                    }
                    break;
                case 41:
                    {
                    alt3=3;
                    }
                    break;
                case 42:
                    {
                    alt3=4;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalXdiagramDsl.g:221:4: ( (lv_elements_9_0= ruleDiagramElement ) )
            	    {
            	    // InternalXdiagramDsl.g:221:4: ( (lv_elements_9_0= ruleDiagramElement ) )
            	    // InternalXdiagramDsl.g:222:5: (lv_elements_9_0= ruleDiagramElement )
            	    {
            	    // InternalXdiagramDsl.g:222:5: (lv_elements_9_0= ruleDiagramElement )
            	    // InternalXdiagramDsl.g:223:6: lv_elements_9_0= ruleDiagramElement
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getElementsDiagramElementParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_elements_9_0=ruleDiagramElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_9_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.DiagramElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXdiagramDsl.g:241:4: ( (lv_styles_10_0= ruleStyle ) )
            	    {
            	    // InternalXdiagramDsl.g:241:4: ( (lv_styles_10_0= ruleStyle ) )
            	    // InternalXdiagramDsl.g:242:5: (lv_styles_10_0= ruleStyle )
            	    {
            	    // InternalXdiagramDsl.g:242:5: (lv_styles_10_0= ruleStyle )
            	    // InternalXdiagramDsl.g:243:6: lv_styles_10_0= ruleStyle
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getStylesStyleParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_styles_10_0=ruleStyle();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"styles",
            	    							lv_styles_10_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.Style");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXdiagramDsl.g:261:4: ( (lv_colors_11_0= ruleCustomColor ) )
            	    {
            	    // InternalXdiagramDsl.g:261:4: ( (lv_colors_11_0= ruleCustomColor ) )
            	    // InternalXdiagramDsl.g:262:5: (lv_colors_11_0= ruleCustomColor )
            	    {
            	    // InternalXdiagramDsl.g:262:5: (lv_colors_11_0= ruleCustomColor )
            	    // InternalXdiagramDsl.g:263:6: lv_colors_11_0= ruleCustomColor
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getColorsCustomColorParserRuleCall_8_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_colors_11_0=ruleCustomColor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"colors",
            	    							lv_colors_11_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.CustomColor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXdiagramDsl.g:281:4: ( (lv_figures_12_0= ruleCustomFigure ) )
            	    {
            	    // InternalXdiagramDsl.g:281:4: ( (lv_figures_12_0= ruleCustomFigure ) )
            	    // InternalXdiagramDsl.g:282:5: (lv_figures_12_0= ruleCustomFigure )
            	    {
            	    // InternalXdiagramDsl.g:282:5: (lv_figures_12_0= ruleCustomFigure )
            	    // InternalXdiagramDsl.g:283:6: lv_figures_12_0= ruleCustomFigure
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getFiguresCustomFigureParserRuleCall_8_3_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_figures_12_0=ruleCustomFigure();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"figures",
            	    							lv_figures_12_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.CustomFigure");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleMetaModel"
    // InternalXdiagramDsl.g:305:1: entryRuleMetaModel returns [EObject current=null] : iv_ruleMetaModel= ruleMetaModel EOF ;
    public final EObject entryRuleMetaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModel = null;


        try {
            // InternalXdiagramDsl.g:305:50: (iv_ruleMetaModel= ruleMetaModel EOF )
            // InternalXdiagramDsl.g:306:2: iv_ruleMetaModel= ruleMetaModel EOF
            {
             newCompositeNode(grammarAccess.getMetaModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaModel=ruleMetaModel();

            state._fsp--;

             current =iv_ruleMetaModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetaModel"


    // $ANTLR start "ruleMetaModel"
    // InternalXdiagramDsl.g:312:1: ruleMetaModel returns [EObject current=null] : (otherlv_0= 'meta' otherlv_1= 'plugin' otherlv_2= ':' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' otherlv_5= ':' ( (lv_ecorePath_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetaModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_plugin_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_ecorePath_6_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:318:2: ( (otherlv_0= 'meta' otherlv_1= 'plugin' otherlv_2= ':' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' otherlv_5= ':' ( (lv_ecorePath_6_0= RULE_STRING ) ) ) )
            // InternalXdiagramDsl.g:319:2: (otherlv_0= 'meta' otherlv_1= 'plugin' otherlv_2= ':' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' otherlv_5= ':' ( (lv_ecorePath_6_0= RULE_STRING ) ) )
            {
            // InternalXdiagramDsl.g:319:2: (otherlv_0= 'meta' otherlv_1= 'plugin' otherlv_2= ':' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' otherlv_5= ':' ( (lv_ecorePath_6_0= RULE_STRING ) ) )
            // InternalXdiagramDsl.g:320:3: otherlv_0= 'meta' otherlv_1= 'plugin' otherlv_2= ':' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' otherlv_5= ':' ( (lv_ecorePath_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaModelAccess().getMetaKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaModelAccess().getPluginKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaModelAccess().getColonKeyword_2());
            		
            // InternalXdiagramDsl.g:332:3: ( (lv_plugin_3_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:333:4: (lv_plugin_3_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:333:4: (lv_plugin_3_0= RULE_STRING )
            // InternalXdiagramDsl.g:334:5: lv_plugin_3_0= RULE_STRING
            {
            lv_plugin_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_plugin_3_0, grammarAccess.getMetaModelAccess().getPluginSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"plugin",
            						lv_plugin_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getMetaModelAccess().getEcoreFileKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMetaModelAccess().getColonKeyword_5());
            		
            // InternalXdiagramDsl.g:358:3: ( (lv_ecorePath_6_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:359:4: (lv_ecorePath_6_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:359:4: (lv_ecorePath_6_0= RULE_STRING )
            // InternalXdiagramDsl.g:360:5: lv_ecorePath_6_0= RULE_STRING
            {
            lv_ecorePath_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_ecorePath_6_0, grammarAccess.getMetaModelAccess().getEcorePathSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ecorePath",
            						lv_ecorePath_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMetaModel"


    // $ANTLR start "entryRuleImportStatement"
    // InternalXdiagramDsl.g:380:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // InternalXdiagramDsl.g:380:56: (iv_ruleImportStatement= ruleImportStatement EOF )
            // InternalXdiagramDsl.g:381:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;

             current =iv_ruleImportStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:387:1: ruleImportStatement returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:393:2: ( ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) )
            // InternalXdiagramDsl.g:394:2: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            {
            // InternalXdiagramDsl.g:394:2: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            // InternalXdiagramDsl.g:395:3: () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            {
            // InternalXdiagramDsl.g:395:3: ()
            // InternalXdiagramDsl.g:396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportStatementAccess().getImportStatementAction_0(),
            					current);
            			

            }

            // InternalXdiagramDsl.g:402:3: (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXdiagramDsl.g:403:4: otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportStatementAccess().getImportKeyword_1_0());
                    			
                    // InternalXdiagramDsl.g:407:4: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    // InternalXdiagramDsl.g:408:5: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    {
                    // InternalXdiagramDsl.g:408:5: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    // InternalXdiagramDsl.g:409:6: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
                    {

                    						newCompositeNode(grammarAccess.getImportStatementAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_importedNamespace_2_0=ruleQualifiedNameWithWildCard();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportStatementRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"pt.iscte.xdiagram.dsl.XdiagramDsl.QualifiedNameWithWildCard");
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
    // InternalXdiagramDsl.g:431:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXdiagramDsl.g:431:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXdiagramDsl.g:432:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:438:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:444:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXdiagramDsl.g:445:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXdiagramDsl.g:445:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXdiagramDsl.g:446:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXdiagramDsl.g:453:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalXdiagramDsl.g:454:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_12); 

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
    // InternalXdiagramDsl.g:471:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // InternalXdiagramDsl.g:471:65: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // InternalXdiagramDsl.g:472:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:478:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:484:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalXdiagramDsl.g:485:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalXdiagramDsl.g:485:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalXdiagramDsl.g:486:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXdiagramDsl.g:496:3: (kw= '.' kw= '*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXdiagramDsl.g:497:4: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0());
                    			
                    kw=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDiagram"
    // InternalXdiagramDsl.g:512:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalXdiagramDsl.g:512:48: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalXdiagramDsl.g:513:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalXdiagramDsl.g:519:1: ruleDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_contains_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:525:2: ( (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) )
            // InternalXdiagramDsl.g:526:2: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            {
            // InternalXdiagramDsl.g:526:2: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            // InternalXdiagramDsl.g:527:3: otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDiagramAccess().getDiagramKeyword_0());
            		
            // InternalXdiagramDsl.g:531:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:532:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:532:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:533:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiagramRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDiagramAccess().getModelClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_14);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:551:3: ( (lv_contains_3_0= ruleContains ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==56) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXdiagramDsl.g:552:4: (lv_contains_3_0= ruleContains )
            	    {
            	    // InternalXdiagramDsl.g:552:4: (lv_contains_3_0= ruleContains )
            	    // InternalXdiagramDsl.g:553:5: lv_contains_3_0= ruleContains
            	    {

            	    					newCompositeNode(grammarAccess.getDiagramAccess().getContainsContainsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_contains_3_0=ruleContains();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contains",
            	    						lv_contains_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.Contains");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleToolGroup"
    // InternalXdiagramDsl.g:578:1: entryRuleToolGroup returns [EObject current=null] : iv_ruleToolGroup= ruleToolGroup EOF ;
    public final EObject entryRuleToolGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolGroup = null;


        try {
            // InternalXdiagramDsl.g:578:50: (iv_ruleToolGroup= ruleToolGroup EOF )
            // InternalXdiagramDsl.g:579:2: iv_ruleToolGroup= ruleToolGroup EOF
            {
             newCompositeNode(grammarAccess.getToolGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToolGroup=ruleToolGroup();

            state._fsp--;

             current =iv_ruleToolGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleToolGroup"


    // $ANTLR start "ruleToolGroup"
    // InternalXdiagramDsl.g:585:1: ruleToolGroup returns [EObject current=null] : (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleToolGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:591:2: ( (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:592:2: (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:592:2: (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:593:3: otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getToolGroupAccess().getToolgroupKeyword_0());
            		
            // InternalXdiagramDsl.g:597:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:598:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:598:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:599:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getToolGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToolGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdiagramDsl.g:615:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXdiagramDsl.g:616:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:616:4: (lv_description_2_0= RULE_STRING )
                    // InternalXdiagramDsl.g:617:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getToolGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getToolGroupRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getToolGroupAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleToolGroup"


    // $ANTLR start "entryRuleDiagramElement"
    // InternalXdiagramDsl.g:641:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // InternalXdiagramDsl.g:641:55: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // InternalXdiagramDsl.g:642:2: iv_ruleDiagramElement= ruleDiagramElement EOF
            {
             newCompositeNode(grammarAccess.getDiagramElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagramElement=ruleDiagramElement();

            state._fsp--;

             current =iv_ruleDiagramElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiagramElement"


    // $ANTLR start "ruleDiagramElement"
    // InternalXdiagramDsl.g:648:1: ruleDiagramElement returns [EObject current=null] : (this_Node_0= ruleNode | this_Link_1= ruleLink ) ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Link_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:654:2: ( (this_Node_0= ruleNode | this_Link_1= ruleLink ) )
            // InternalXdiagramDsl.g:655:2: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            {
            // InternalXdiagramDsl.g:655:2: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 29:
                        {
                        int LA9_5 = input.LA(4);

                        if ( (LA9_5==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 30:
                                {
                                int LA9_6 = input.LA(6);

                                if ( (LA9_6==RULE_ID) ) {
                                    int LA9_8 = input.LA(7);

                                    if ( (LA9_8==31) ) {
                                        alt9=1;
                                    }
                                    else if ( (LA9_8==32) ) {
                                        alt9=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 9, 8, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 9, 6, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 31:
                                {
                                alt9=1;
                                }
                                break;
                            case 32:
                                {
                                alt9=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 7, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 30:
                        {
                        int LA9_6 = input.LA(4);

                        if ( (LA9_6==RULE_ID) ) {
                            int LA9_8 = input.LA(5);

                            if ( (LA9_8==31) ) {
                                alt9=1;
                            }
                            else if ( (LA9_8==32) ) {
                                alt9=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 32:
                        {
                        alt9=2;
                        }
                        break;
                    case 31:
                        {
                        alt9=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXdiagramDsl.g:656:3: this_Node_0= ruleNode
                    {

                    			newCompositeNode(grammarAccess.getDiagramElementAccess().getNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_0=ruleNode();

                    state._fsp--;


                    			current = this_Node_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:665:3: this_Link_1= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getDiagramElementAccess().getLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_1=ruleLink();

                    state._fsp--;


                    			current = this_Link_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDiagramElement"


    // $ANTLR start "entryRuleStyle"
    // InternalXdiagramDsl.g:677:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalXdiagramDsl.g:677:46: (iv_ruleStyle= ruleStyle EOF )
            // InternalXdiagramDsl.g:678:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:684:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:690:2: ( (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:691:2: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:691:2: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:692:3: otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
            		
            // InternalXdiagramDsl.g:696:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:697:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:697:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:698:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStyleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStyleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdiagramDsl.g:714:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXdiagramDsl.g:715:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:715:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:716:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:716:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:717:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getStyleAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStyleRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:729:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:730:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:730:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:731:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStyleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:747:3: ( (lv_features_5_0= ruleStyleFeature ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=61 && LA11_0<=64)||(LA11_0>=67 && LA11_0<=69)||LA11_0==74||LA11_0==76||(LA11_0>=83 && LA11_0<=84)||LA11_0==86) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXdiagramDsl.g:748:4: (lv_features_5_0= ruleStyleFeature )
            	    {
            	    // InternalXdiagramDsl.g:748:4: (lv_features_5_0= ruleStyleFeature )
            	    // InternalXdiagramDsl.g:749:5: lv_features_5_0= ruleStyleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getStyleAccess().getFeaturesStyleFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_features_5_0=ruleStyleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStyleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.StyleFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStyleAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleLinkedFeature"
    // InternalXdiagramDsl.g:774:1: entryRuleLinkedFeature returns [EObject current=null] : iv_ruleLinkedFeature= ruleLinkedFeature EOF ;
    public final EObject entryRuleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedFeature = null;


        try {
            // InternalXdiagramDsl.g:774:54: (iv_ruleLinkedFeature= ruleLinkedFeature EOF )
            // InternalXdiagramDsl.g:775:2: iv_ruleLinkedFeature= ruleLinkedFeature EOF
            {
             newCompositeNode(grammarAccess.getLinkedFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkedFeature=ruleLinkedFeature();

            state._fsp--;

             current =iv_ruleLinkedFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLinkedFeature"


    // $ANTLR start "ruleLinkedFeature"
    // InternalXdiagramDsl.g:781:1: ruleLinkedFeature returns [EObject current=null] : (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) ;
    public final EObject ruleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_Anchor_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:787:2: ( (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) )
            // InternalXdiagramDsl.g:788:2: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            {
            // InternalXdiagramDsl.g:788:2: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==56) ) {
                alt12=1;
            }
            else if ( (LA12_0==39) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalXdiagramDsl.g:789:3: this_Contains_0= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getLinkedFeatureAccess().getContainsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_0=ruleContains();

                    state._fsp--;


                    			current = this_Contains_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:798:3: this_Anchor_1= ruleAnchor
                    {

                    			newCompositeNode(grammarAccess.getLinkedFeatureAccess().getAnchorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Anchor_1=ruleAnchor();

                    state._fsp--;


                    			current = this_Anchor_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLinkedFeature"


    // $ANTLR start "entryRuleStyleFeature"
    // InternalXdiagramDsl.g:810:1: entryRuleStyleFeature returns [EObject current=null] : iv_ruleStyleFeature= ruleStyleFeature EOF ;
    public final EObject entryRuleStyleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleFeature = null;


        try {
            // InternalXdiagramDsl.g:810:53: (iv_ruleStyleFeature= ruleStyleFeature EOF )
            // InternalXdiagramDsl.g:811:2: iv_ruleStyleFeature= ruleStyleFeature EOF
            {
             newCompositeNode(grammarAccess.getStyleFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyleFeature=ruleStyleFeature();

            state._fsp--;

             current =iv_ruleStyleFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStyleFeature"


    // $ANTLR start "ruleStyleFeature"
    // InternalXdiagramDsl.g:817:1: ruleStyleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) ;
    public final EObject ruleStyleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Point_2 = null;

        EObject this_Corner_3 = null;

        EObject this_Background_4 = null;

        EObject this_Foreground_5 = null;

        EObject this_Transparency_6 = null;

        EObject this_FontProperties_7 = null;

        EObject this_TextValue_8 = null;

        EObject this_TextAlign_9 = null;

        EObject this_LineStyle_10 = null;

        EObject this_LineWidth_11 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:823:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) )
            // InternalXdiagramDsl.g:824:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            {
            // InternalXdiagramDsl.g:824:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            int alt13=12;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt13=1;
                }
                break;
            case 68:
                {
                alt13=2;
                }
                break;
            case 67:
                {
                alt13=3;
                }
                break;
            case 69:
                {
                alt13=4;
                }
                break;
            case 62:
                {
                alt13=5;
                }
                break;
            case 61:
                {
                alt13=6;
                }
                break;
            case 63:
                {
                alt13=7;
                }
                break;
            case 76:
                {
                alt13=8;
                }
                break;
            case 74:
                {
                alt13=9;
                }
                break;
            case 83:
                {
                alt13=10;
                }
                break;
            case 84:
                {
                alt13=11;
                }
                break;
            case 86:
                {
                alt13=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalXdiagramDsl.g:825:3: this_Size_0= ruleSize
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getSizeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Size_0=ruleSize();

                    state._fsp--;


                    			current = this_Size_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:834:3: this_Position_1= rulePosition
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getPositionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Position_1=rulePosition();

                    state._fsp--;


                    			current = this_Position_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:843:3: this_Point_2= rulePoint
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getPointParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Point_2=rulePoint();

                    state._fsp--;


                    			current = this_Point_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:852:3: this_Corner_3= ruleCorner
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getCornerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Corner_3=ruleCorner();

                    state._fsp--;


                    			current = this_Corner_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:861:3: this_Background_4= ruleBackground
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getBackgroundParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Background_4=ruleBackground();

                    state._fsp--;


                    			current = this_Background_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:870:3: this_Foreground_5= ruleForeground
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getForegroundParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Foreground_5=ruleForeground();

                    state._fsp--;


                    			current = this_Foreground_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXdiagramDsl.g:879:3: this_Transparency_6= ruleTransparency
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getTransparencyParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transparency_6=ruleTransparency();

                    state._fsp--;


                    			current = this_Transparency_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXdiagramDsl.g:888:3: this_FontProperties_7= ruleFontProperties
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getFontPropertiesParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_FontProperties_7=ruleFontProperties();

                    state._fsp--;


                    			current = this_FontProperties_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalXdiagramDsl.g:897:3: this_TextValue_8= ruleTextValue
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getTextValueParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextValue_8=ruleTextValue();

                    state._fsp--;


                    			current = this_TextValue_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalXdiagramDsl.g:906:3: this_TextAlign_9= ruleTextAlign
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getTextAlignParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextAlign_9=ruleTextAlign();

                    state._fsp--;


                    			current = this_TextAlign_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalXdiagramDsl.g:915:3: this_LineStyle_10= ruleLineStyle
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getLineStyleParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineStyle_10=ruleLineStyle();

                    state._fsp--;


                    			current = this_LineStyle_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalXdiagramDsl.g:924:3: this_LineWidth_11= ruleLineWidth
                    {

                    			newCompositeNode(grammarAccess.getStyleFeatureAccess().getLineWidthParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineWidth_11=ruleLineWidth();

                    state._fsp--;


                    			current = this_LineWidth_11;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleStyleFeature"


    // $ANTLR start "entryRuleChildElement"
    // InternalXdiagramDsl.g:936:1: entryRuleChildElement returns [EObject current=null] : iv_ruleChildElement= ruleChildElement EOF ;
    public final EObject entryRuleChildElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildElement = null;


        try {
            // InternalXdiagramDsl.g:936:53: (iv_ruleChildElement= ruleChildElement EOF )
            // InternalXdiagramDsl.g:937:2: iv_ruleChildElement= ruleChildElement EOF
            {
             newCompositeNode(grammarAccess.getChildElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChildElement=ruleChildElement();

            state._fsp--;

             current =iv_ruleChildElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChildElement"


    // $ANTLR start "ruleChildElement"
    // InternalXdiagramDsl.g:943:1: ruleChildElement returns [EObject current=null] : (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) ;
    public final EObject ruleChildElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElement_0 = null;

        EObject this_Line_1 = null;

        EObject this_Arrow_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:949:2: ( (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) )
            // InternalXdiagramDsl.g:950:2: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            {
            // InternalXdiagramDsl.g:950:2: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 42:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 58:
            case 59:
            case 60:
                {
                alt14=1;
                }
                break;
            case 53:
            case 54:
                {
                alt14=2;
                }
                break;
            case 55:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalXdiagramDsl.g:951:3: this_ConnectableElement_0= ruleConnectableElement
                    {

                    			newCompositeNode(grammarAccess.getChildElementAccess().getConnectableElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConnectableElement_0=ruleConnectableElement();

                    state._fsp--;


                    			current = this_ConnectableElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:960:3: this_Line_1= ruleLine
                    {

                    			newCompositeNode(grammarAccess.getChildElementAccess().getLineParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Line_1=ruleLine();

                    state._fsp--;


                    			current = this_Line_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:969:3: this_Arrow_2= ruleArrow
                    {

                    			newCompositeNode(grammarAccess.getChildElementAccess().getArrowParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Arrow_2=ruleArrow();

                    state._fsp--;


                    			current = this_Arrow_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleChildElement"


    // $ANTLR start "entryRuleFeatureConditional"
    // InternalXdiagramDsl.g:981:1: entryRuleFeatureConditional returns [EObject current=null] : iv_ruleFeatureConditional= ruleFeatureConditional EOF ;
    public final EObject entryRuleFeatureConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureConditional = null;


        try {
            // InternalXdiagramDsl.g:981:59: (iv_ruleFeatureConditional= ruleFeatureConditional EOF )
            // InternalXdiagramDsl.g:982:2: iv_ruleFeatureConditional= ruleFeatureConditional EOF
            {
             newCompositeNode(grammarAccess.getFeatureConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureConditional=ruleFeatureConditional();

            state._fsp--;

             current =iv_ruleFeatureConditional; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeatureConditional"


    // $ANTLR start "ruleFeatureConditional"
    // InternalXdiagramDsl.g:988:1: ruleFeatureConditional returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleFeatureConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:994:2: ( (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalXdiagramDsl.g:995:2: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalXdiagramDsl.g:995:2: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            // InternalXdiagramDsl.g:996:3: otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureConditionalAccess().getIfKeyword_0());
            		
            // InternalXdiagramDsl.g:1000:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:1001:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:1001:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:1002:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureConditionalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureConditionalAccess().getModelAttributeEAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:1016:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalXdiagramDsl.g:1017:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalXdiagramDsl.g:1017:4: (lv_operator_2_0= ruleOperator )
            // InternalXdiagramDsl.g:1018:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getFeatureConditionalAccess().getOperatorOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureConditionalRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:1035:3: ( (lv_value_3_0= ruleValue ) )
            // InternalXdiagramDsl.g:1036:4: (lv_value_3_0= ruleValue )
            {
            // InternalXdiagramDsl.g:1036:4: (lv_value_3_0= ruleValue )
            // InternalXdiagramDsl.g:1037:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getFeatureConditionalAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureConditionalRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Value");
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
    // $ANTLR end "ruleFeatureConditional"


    // $ANTLR start "entryRuleNode"
    // InternalXdiagramDsl.g:1058:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalXdiagramDsl.g:1058:45: (iv_ruleNode= ruleNode EOF )
            // InternalXdiagramDsl.g:1059:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:1065:1: ruleNode returns [EObject current=null] : ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_tool_0_0=null;
        Token lv_toolName_1_0=null;
        Token lv_group_2_0=null;
        Token otherlv_3=null;
        Token lv_icon_4_0=null;
        Token lv_imageId_5_0=null;
        Token otherlv_6=null;
        EObject lv_rootFigure_8_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1071:2: ( ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) )
            // InternalXdiagramDsl.g:1072:2: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            {
            // InternalXdiagramDsl.g:1072:2: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            // InternalXdiagramDsl.g:1073:3: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            {
            // InternalXdiagramDsl.g:1073:3: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXdiagramDsl.g:1074:4: ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    {
                    // InternalXdiagramDsl.g:1074:4: ( (lv_tool_0_0= 'tool' ) )
                    // InternalXdiagramDsl.g:1075:5: (lv_tool_0_0= 'tool' )
                    {
                    // InternalXdiagramDsl.g:1075:5: (lv_tool_0_0= 'tool' )
                    // InternalXdiagramDsl.g:1076:6: lv_tool_0_0= 'tool'
                    {
                    lv_tool_0_0=(Token)match(input,28,FOLLOW_4); 

                    						newLeafNode(lv_tool_0_0, grammarAccess.getNodeAccess().getToolToolKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(current, "tool", true, "tool");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:1088:4: ( (lv_toolName_1_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:1089:5: (lv_toolName_1_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:1089:5: (lv_toolName_1_0= RULE_STRING )
                    // InternalXdiagramDsl.g:1090:6: lv_toolName_1_0= RULE_STRING
                    {
                    lv_toolName_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_toolName_1_0, grammarAccess.getNodeAccess().getToolNameSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"toolName",
                    							lv_toolName_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:1106:4: ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==29) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalXdiagramDsl.g:1107:5: ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalXdiagramDsl.g:1107:5: ( (lv_group_2_0= 'group' ) )
                            // InternalXdiagramDsl.g:1108:6: (lv_group_2_0= 'group' )
                            {
                            // InternalXdiagramDsl.g:1108:6: (lv_group_2_0= 'group' )
                            // InternalXdiagramDsl.g:1109:7: lv_group_2_0= 'group'
                            {
                            lv_group_2_0=(Token)match(input,29,FOLLOW_3); 

                            							newLeafNode(lv_group_2_0, grammarAccess.getNodeAccess().getGroupGroupKeyword_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeRule());
                            							}
                            							setWithLastConsumed(current, "group", true, "group");
                            						

                            }


                            }

                            // InternalXdiagramDsl.g:1121:5: ( (otherlv_3= RULE_ID ) )
                            // InternalXdiagramDsl.g:1122:6: (otherlv_3= RULE_ID )
                            {
                            // InternalXdiagramDsl.g:1122:6: (otherlv_3= RULE_ID )
                            // InternalXdiagramDsl.g:1123:7: otherlv_3= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeRule());
                            							}
                            						
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

                            							newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getGroupIdToolGroupCrossReference_0_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalXdiagramDsl.g:1135:4: ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==30) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalXdiagramDsl.g:1136:5: ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) )
                            {
                            // InternalXdiagramDsl.g:1136:5: ( (lv_icon_4_0= 'icon' ) )
                            // InternalXdiagramDsl.g:1137:6: (lv_icon_4_0= 'icon' )
                            {
                            // InternalXdiagramDsl.g:1137:6: (lv_icon_4_0= 'icon' )
                            // InternalXdiagramDsl.g:1138:7: lv_icon_4_0= 'icon'
                            {
                            lv_icon_4_0=(Token)match(input,30,FOLLOW_3); 

                            							newLeafNode(lv_icon_4_0, grammarAccess.getNodeAccess().getIconIconKeyword_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeRule());
                            							}
                            							setWithLastConsumed(current, "icon", true, "icon");
                            						

                            }


                            }

                            // InternalXdiagramDsl.g:1150:5: ( (lv_imageId_5_0= RULE_ID ) )
                            // InternalXdiagramDsl.g:1151:6: (lv_imageId_5_0= RULE_ID )
                            {
                            // InternalXdiagramDsl.g:1151:6: (lv_imageId_5_0= RULE_ID )
                            // InternalXdiagramDsl.g:1152:7: lv_imageId_5_0= RULE_ID
                            {
                            lv_imageId_5_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(lv_imageId_5_0, grammarAccess.getNodeAccess().getImageIdIDTerminalRuleCall_0_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"imageId",
                            								lv_imageId_5_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getNodeKeyword_1());
            		
            // InternalXdiagramDsl.g:1174:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:1175:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:1175:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:1176:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeAccess().getModelClassEClassCrossReference_2_0());
            				
            pushFollow(FOLLOW_25);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:1190:3: ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            // InternalXdiagramDsl.g:1191:4: (lv_rootFigure_8_0= ruleConnectableElement )
            {
            // InternalXdiagramDsl.g:1191:4: (lv_rootFigure_8_0= ruleConnectableElement )
            // InternalXdiagramDsl.g:1192:5: lv_rootFigure_8_0= ruleConnectableElement
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getRootFigureConnectableElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_rootFigure_8_0=ruleConnectableElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"rootFigure",
            						lv_rootFigure_8_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElement");
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleLink"
    // InternalXdiagramDsl.g:1213:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalXdiagramDsl.g:1213:45: (iv_ruleLink= ruleLink EOF )
            // InternalXdiagramDsl.g:1214:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:1220:1: ruleLink returns [EObject current=null] : ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_tool_0_0=null;
        Token lv_toolName_1_0=null;
        Token lv_group_2_0=null;
        Token otherlv_3=null;
        Token lv_icon_4_0=null;
        Token lv_imageId_5_0=null;
        Token otherlv_6=null;
        Token lv_reference_7_0=null;
        Token lv_complex_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_styled_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_features_18_0 = null;

        EObject lv_decorators_19_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1226:2: ( ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' ) )
            // InternalXdiagramDsl.g:1227:2: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' )
            {
            // InternalXdiagramDsl.g:1227:2: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' )
            // InternalXdiagramDsl.g:1228:3: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}'
            {
            // InternalXdiagramDsl.g:1228:3: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXdiagramDsl.g:1229:4: ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    {
                    // InternalXdiagramDsl.g:1229:4: ( (lv_tool_0_0= 'tool' ) )
                    // InternalXdiagramDsl.g:1230:5: (lv_tool_0_0= 'tool' )
                    {
                    // InternalXdiagramDsl.g:1230:5: (lv_tool_0_0= 'tool' )
                    // InternalXdiagramDsl.g:1231:6: lv_tool_0_0= 'tool'
                    {
                    lv_tool_0_0=(Token)match(input,28,FOLLOW_4); 

                    						newLeafNode(lv_tool_0_0, grammarAccess.getLinkAccess().getToolToolKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(current, "tool", true, "tool");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:1243:4: ( (lv_toolName_1_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:1244:5: (lv_toolName_1_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:1244:5: (lv_toolName_1_0= RULE_STRING )
                    // InternalXdiagramDsl.g:1245:6: lv_toolName_1_0= RULE_STRING
                    {
                    lv_toolName_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_toolName_1_0, grammarAccess.getLinkAccess().getToolNameSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"toolName",
                    							lv_toolName_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:1261:4: ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalXdiagramDsl.g:1262:5: ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalXdiagramDsl.g:1262:5: ( (lv_group_2_0= 'group' ) )
                            // InternalXdiagramDsl.g:1263:6: (lv_group_2_0= 'group' )
                            {
                            // InternalXdiagramDsl.g:1263:6: (lv_group_2_0= 'group' )
                            // InternalXdiagramDsl.g:1264:7: lv_group_2_0= 'group'
                            {
                            lv_group_2_0=(Token)match(input,29,FOLLOW_3); 

                            							newLeafNode(lv_group_2_0, grammarAccess.getLinkAccess().getGroupGroupKeyword_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLinkRule());
                            							}
                            							setWithLastConsumed(current, "group", true, "group");
                            						

                            }


                            }

                            // InternalXdiagramDsl.g:1276:5: ( (otherlv_3= RULE_ID ) )
                            // InternalXdiagramDsl.g:1277:6: (otherlv_3= RULE_ID )
                            {
                            // InternalXdiagramDsl.g:1277:6: (otherlv_3= RULE_ID )
                            // InternalXdiagramDsl.g:1278:7: otherlv_3= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLinkRule());
                            							}
                            						
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

                            							newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getGroupIdToolGroupCrossReference_0_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalXdiagramDsl.g:1290:4: ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalXdiagramDsl.g:1291:5: ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) )
                            {
                            // InternalXdiagramDsl.g:1291:5: ( (lv_icon_4_0= 'icon' ) )
                            // InternalXdiagramDsl.g:1292:6: (lv_icon_4_0= 'icon' )
                            {
                            // InternalXdiagramDsl.g:1292:6: (lv_icon_4_0= 'icon' )
                            // InternalXdiagramDsl.g:1293:7: lv_icon_4_0= 'icon'
                            {
                            lv_icon_4_0=(Token)match(input,30,FOLLOW_3); 

                            							newLeafNode(lv_icon_4_0, grammarAccess.getLinkAccess().getIconIconKeyword_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLinkRule());
                            							}
                            							setWithLastConsumed(current, "icon", true, "icon");
                            						

                            }


                            }

                            // InternalXdiagramDsl.g:1305:5: ( (lv_imageId_5_0= RULE_ID ) )
                            // InternalXdiagramDsl.g:1306:6: (lv_imageId_5_0= RULE_ID )
                            {
                            // InternalXdiagramDsl.g:1306:6: (lv_imageId_5_0= RULE_ID )
                            // InternalXdiagramDsl.g:1307:7: lv_imageId_5_0= RULE_ID
                            {
                            lv_imageId_5_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                            							newLeafNode(lv_imageId_5_0, grammarAccess.getLinkAccess().getImageIdIDTerminalRuleCall_0_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLinkRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"imageId",
                            								lv_imageId_5_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalXdiagramDsl.g:1329:3: ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
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
                    // InternalXdiagramDsl.g:1330:4: ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:1330:4: ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:1331:5: ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:1331:5: ( (lv_reference_7_0= 'reference' ) )
                    // InternalXdiagramDsl.g:1332:6: (lv_reference_7_0= 'reference' )
                    {
                    // InternalXdiagramDsl.g:1332:6: (lv_reference_7_0= 'reference' )
                    // InternalXdiagramDsl.g:1333:7: lv_reference_7_0= 'reference'
                    {
                    lv_reference_7_0=(Token)match(input,33,FOLLOW_3); 

                    							newLeafNode(lv_reference_7_0, grammarAccess.getLinkAccess().getReferenceReferenceKeyword_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    							setWithLastConsumed(current, "reference", true, "reference");
                    						

                    }


                    }

                    // InternalXdiagramDsl.g:1345:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:1346:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:1346:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:1347:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_2_0_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:1363:4: ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:1363:4: ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:1364:5: ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:1364:5: ( (lv_complex_9_0= 'class' ) )
                    // InternalXdiagramDsl.g:1365:6: (lv_complex_9_0= 'class' )
                    {
                    // InternalXdiagramDsl.g:1365:6: (lv_complex_9_0= 'class' )
                    // InternalXdiagramDsl.g:1366:7: lv_complex_9_0= 'class'
                    {
                    lv_complex_9_0=(Token)match(input,34,FOLLOW_3); 

                    							newLeafNode(lv_complex_9_0, grammarAccess.getLinkAccess().getComplexClassKeyword_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    							setWithLastConsumed(current, "complex", true, "class");
                    						

                    }


                    }

                    // InternalXdiagramDsl.g:1378:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:1379:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:1379:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:1380:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_2_1_1_0());
                    						
                    pushFollow(FOLLOW_30);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,35,FOLLOW_3); 

                    					newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getSourceKeyword_2_1_2());
                    				
                    // InternalXdiagramDsl.g:1398:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:1399:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:1399:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:1400:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_2_1_3_0());
                    						
                    pushFollow(FOLLOW_31);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,36,FOLLOW_3); 

                    					newLeafNode(otherlv_13, grammarAccess.getLinkAccess().getTargetKeyword_2_1_4());
                    				
                    // InternalXdiagramDsl.g:1418:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:1419:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:1419:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:1420:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_2_1_5_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:1436:3: ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXdiagramDsl.g:1437:4: ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:1437:4: ( (lv_styled_15_0= '+' ) )
                    // InternalXdiagramDsl.g:1438:5: (lv_styled_15_0= '+' )
                    {
                    // InternalXdiagramDsl.g:1438:5: (lv_styled_15_0= '+' )
                    // InternalXdiagramDsl.g:1439:6: lv_styled_15_0= '+'
                    {
                    lv_styled_15_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_15_0, grammarAccess.getLinkAccess().getStyledPlusSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:1451:4: ( (otherlv_16= RULE_ID ) )
                    // InternalXdiagramDsl.g:1452:5: (otherlv_16= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:1452:5: (otherlv_16= RULE_ID )
                    // InternalXdiagramDsl.g:1453:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_16, grammarAccess.getLinkAccess().getStyleStyleCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,21,FOLLOW_32); 

            			newLeafNode(otherlv_17, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXdiagramDsl.g:1469:3: ( (lv_features_18_0= ruleLinkFeature ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==61||LA23_0==84||LA23_0==86) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1470:4: (lv_features_18_0= ruleLinkFeature )
            	    {
            	    // InternalXdiagramDsl.g:1470:4: (lv_features_18_0= ruleLinkFeature )
            	    // InternalXdiagramDsl.g:1471:5: lv_features_18_0= ruleLinkFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getFeaturesLinkFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_features_18_0=ruleLinkFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_18_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LinkFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalXdiagramDsl.g:1488:3: ( (lv_decorators_19_0= ruleDecorator ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1489:4: (lv_decorators_19_0= ruleDecorator )
            	    {
            	    // InternalXdiagramDsl.g:1489:4: (lv_decorators_19_0= ruleDecorator )
            	    // InternalXdiagramDsl.g:1490:5: lv_decorators_19_0= ruleDecorator
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getDecoratorsDecoratorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_decorators_19_0=ruleDecorator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"decorators",
            	    						lv_decorators_19_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.Decorator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_20=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleLinkFeature"
    // InternalXdiagramDsl.g:1515:1: entryRuleLinkFeature returns [EObject current=null] : iv_ruleLinkFeature= ruleLinkFeature EOF ;
    public final EObject entryRuleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkFeature = null;


        try {
            // InternalXdiagramDsl.g:1515:52: (iv_ruleLinkFeature= ruleLinkFeature EOF )
            // InternalXdiagramDsl.g:1516:2: iv_ruleLinkFeature= ruleLinkFeature EOF
            {
             newCompositeNode(grammarAccess.getLinkFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkFeature=ruleLinkFeature();

            state._fsp--;

             current =iv_ruleLinkFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLinkFeature"


    // $ANTLR start "ruleLinkFeature"
    // InternalXdiagramDsl.g:1522:1: ruleLinkFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) ;
    public final EObject ruleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_LineStyle_1 = null;

        EObject this_LineWidth_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1528:2: ( (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) )
            // InternalXdiagramDsl.g:1529:2: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            {
            // InternalXdiagramDsl.g:1529:2: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt25=1;
                }
                break;
            case 84:
                {
                alt25=2;
                }
                break;
            case 86:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalXdiagramDsl.g:1530:3: this_Foreground_0= ruleForeground
                    {

                    			newCompositeNode(grammarAccess.getLinkFeatureAccess().getForegroundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Foreground_0=ruleForeground();

                    state._fsp--;


                    			current = this_Foreground_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:1539:3: this_LineStyle_1= ruleLineStyle
                    {

                    			newCompositeNode(grammarAccess.getLinkFeatureAccess().getLineStyleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineStyle_1=ruleLineStyle();

                    state._fsp--;


                    			current = this_LineStyle_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:1548:3: this_LineWidth_2= ruleLineWidth
                    {

                    			newCompositeNode(grammarAccess.getLinkFeatureAccess().getLineWidthParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineWidth_2=ruleLineWidth();

                    state._fsp--;


                    			current = this_LineWidth_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLinkFeature"


    // $ANTLR start "entryRuleDecorator"
    // InternalXdiagramDsl.g:1560:1: entryRuleDecorator returns [EObject current=null] : iv_ruleDecorator= ruleDecorator EOF ;
    public final EObject entryRuleDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorator = null;


        try {
            // InternalXdiagramDsl.g:1560:50: (iv_ruleDecorator= ruleDecorator EOF )
            // InternalXdiagramDsl.g:1561:2: iv_ruleDecorator= ruleDecorator EOF
            {
             newCompositeNode(grammarAccess.getDecoratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecorator=ruleDecorator();

            state._fsp--;

             current =iv_ruleDecorator; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:1567:1: ruleDecorator returns [EObject current=null] : (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) ;
    public final EObject ruleDecorator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_position_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1573:2: ( (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) )
            // InternalXdiagramDsl.g:1574:2: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            {
            // InternalXdiagramDsl.g:1574:2: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            // InternalXdiagramDsl.g:1575:3: otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getDecoratorAccess().getDecoratorKeyword_0());
            		
            // InternalXdiagramDsl.g:1579:3: ( (lv_position_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1580:4: (lv_position_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1580:4: (lv_position_1_0= RULE_INT )
            // InternalXdiagramDsl.g:1581:5: lv_position_1_0= RULE_INT
            {
            lv_position_1_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_position_1_0, grammarAccess.getDecoratorAccess().getPositionINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecoratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"position",
            						lv_position_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getDecoratorAccess().getPercentSignKeyword_2());
            		
            // InternalXdiagramDsl.g:1601:3: ( (lv_element_3_0= ruleDecoratorElement ) )
            // InternalXdiagramDsl.g:1602:4: (lv_element_3_0= ruleDecoratorElement )
            {
            // InternalXdiagramDsl.g:1602:4: (lv_element_3_0= ruleDecoratorElement )
            // InternalXdiagramDsl.g:1603:5: lv_element_3_0= ruleDecoratorElement
            {

            					newCompositeNode(grammarAccess.getDecoratorAccess().getElementDecoratorElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_3_0=ruleDecoratorElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecoratorRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_3_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.DecoratorElement");
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
    // $ANTLR end "ruleDecorator"


    // $ANTLR start "entryRuleAnchor"
    // InternalXdiagramDsl.g:1624:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // InternalXdiagramDsl.g:1624:47: (iv_ruleAnchor= ruleAnchor EOF )
            // InternalXdiagramDsl.g:1625:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnchor"


    // $ANTLR start "ruleAnchor"
    // InternalXdiagramDsl.g:1631:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_max_4_0=null;
        Token otherlv_6=null;
        Enumerator lv_direction_1_0 = null;

        EObject lv_conditional_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1637:2: ( (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:1638:2: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:1638:2: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:1639:3: otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAnchorKeyword_0());
            		
            // InternalXdiagramDsl.g:1643:3: ( (lv_direction_1_0= ruleAnchorDirection ) )
            // InternalXdiagramDsl.g:1644:4: (lv_direction_1_0= ruleAnchorDirection )
            {
            // InternalXdiagramDsl.g:1644:4: (lv_direction_1_0= ruleAnchorDirection )
            // InternalXdiagramDsl.g:1645:5: lv_direction_1_0= ruleAnchorDirection
            {

            					newCompositeNode(grammarAccess.getAnchorAccess().getDirectionAnchorDirectionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_direction_1_0=ruleAnchorDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnchorRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_1_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.AnchorDirection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:1662:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:1663:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:1663:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:1664:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnchorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAnchorAccess().getModelReferenceEReferenceCrossReference_2_0());
            				
            pushFollow(FOLLOW_38);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:1678:3: (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXdiagramDsl.g:1679:4: otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnchorAccess().getMaxKeyword_3_0());
                    			
                    // InternalXdiagramDsl.g:1683:4: ( (lv_max_4_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:1684:5: (lv_max_4_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:1684:5: (lv_max_4_0= RULE_INT )
                    // InternalXdiagramDsl.g:1685:6: lv_max_4_0= RULE_INT
                    {
                    lv_max_4_0=(Token)match(input,RULE_INT,FOLLOW_39); 

                    						newLeafNode(lv_max_4_0, grammarAccess.getAnchorAccess().getMaxINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnchorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max",
                    							lv_max_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:1702:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXdiagramDsl.g:1703:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:1703:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:1704:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getAnchorAccess().getConditionalFeatureConditionalParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_5_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnchorRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_5_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAnchorAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleAnchor"


    // $ANTLR start "entryRuleCustomColor"
    // InternalXdiagramDsl.g:1729:1: entryRuleCustomColor returns [EObject current=null] : iv_ruleCustomColor= ruleCustomColor EOF ;
    public final EObject entryRuleCustomColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomColor = null;


        try {
            // InternalXdiagramDsl.g:1729:52: (iv_ruleCustomColor= ruleCustomColor EOF )
            // InternalXdiagramDsl.g:1730:2: iv_ruleCustomColor= ruleCustomColor EOF
            {
             newCompositeNode(grammarAccess.getCustomColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomColor=ruleCustomColor();

            state._fsp--;

             current =iv_ruleCustomColor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCustomColor"


    // $ANTLR start "ruleCustomColor"
    // InternalXdiagramDsl.g:1736:1: ruleCustomColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) ;
    public final EObject ruleCustomColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_R_2_0=null;
        Token lv_G_3_0=null;
        Token lv_B_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:1742:2: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) )
            // InternalXdiagramDsl.g:1743:2: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            {
            // InternalXdiagramDsl.g:1743:2: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            // InternalXdiagramDsl.g:1744:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomColorAccess().getColorKeyword_0());
            		
            // InternalXdiagramDsl.g:1748:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:1749:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:1749:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:1750:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCustomColorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdiagramDsl.g:1766:3: ( (lv_R_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1767:4: (lv_R_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1767:4: (lv_R_2_0= RULE_INT )
            // InternalXdiagramDsl.g:1768:5: lv_R_2_0= RULE_INT
            {
            lv_R_2_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_R_2_0, grammarAccess.getCustomColorAccess().getRINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"R",
            						lv_R_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:1784:3: ( (lv_G_3_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1785:4: (lv_G_3_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1785:4: (lv_G_3_0= RULE_INT )
            // InternalXdiagramDsl.g:1786:5: lv_G_3_0= RULE_INT
            {
            lv_G_3_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_G_3_0, grammarAccess.getCustomColorAccess().getGINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"G",
            						lv_G_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:1802:3: ( (lv_B_4_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1803:4: (lv_B_4_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1803:4: (lv_B_4_0= RULE_INT )
            // InternalXdiagramDsl.g:1804:5: lv_B_4_0= RULE_INT
            {
            lv_B_4_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_B_4_0, grammarAccess.getCustomColorAccess().getBINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"B",
            						lv_B_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomColorAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleCustomColor"


    // $ANTLR start "entryRuleColor"
    // InternalXdiagramDsl.g:1828:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXdiagramDsl.g:1828:46: (iv_ruleColor= ruleColor EOF )
            // InternalXdiagramDsl.g:1829:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:1835:1: ruleColor returns [EObject current=null] : ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_default_0_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1841:2: ( ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalXdiagramDsl.g:1842:2: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalXdiagramDsl.g:1842:2: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=89 && LA28_0<=104)) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalXdiagramDsl.g:1843:3: ( (lv_default_0_0= ruleDefaultColor ) )
                    {
                    // InternalXdiagramDsl.g:1843:3: ( (lv_default_0_0= ruleDefaultColor ) )
                    // InternalXdiagramDsl.g:1844:4: (lv_default_0_0= ruleDefaultColor )
                    {
                    // InternalXdiagramDsl.g:1844:4: (lv_default_0_0= ruleDefaultColor )
                    // InternalXdiagramDsl.g:1845:5: lv_default_0_0= ruleDefaultColor
                    {

                    					newCompositeNode(grammarAccess.getColorAccess().getDefaultDefaultColorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_default_0_0=ruleDefaultColor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColorRule());
                    					}
                    					set(
                    						current,
                    						"default",
                    						lv_default_0_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.DefaultColor");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:1863:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:1863:3: ( (otherlv_1= RULE_ID ) )
                    // InternalXdiagramDsl.g:1864:4: (otherlv_1= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:1864:4: (otherlv_1= RULE_ID )
                    // InternalXdiagramDsl.g:1865:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColorRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getColorAccess().getCustomCustomColorCrossReference_1_0());
                    				

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleConnectableElement"
    // InternalXdiagramDsl.g:1880:1: entryRuleConnectableElement returns [EObject current=null] : iv_ruleConnectableElement= ruleConnectableElement EOF ;
    public final EObject entryRuleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElement = null;


        try {
            // InternalXdiagramDsl.g:1880:59: (iv_ruleConnectableElement= ruleConnectableElement EOF )
            // InternalXdiagramDsl.g:1881:2: iv_ruleConnectableElement= ruleConnectableElement EOF
            {
             newCompositeNode(grammarAccess.getConnectableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectableElement=ruleConnectableElement();

            state._fsp--;

             current =iv_ruleConnectableElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectableElement"


    // $ANTLR start "ruleConnectableElement"
    // InternalXdiagramDsl.g:1887:1: ruleConnectableElement returns [EObject current=null] : (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) ;
    public final EObject ruleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rectangle_0 = null;

        EObject this_Rhombus_1 = null;

        EObject this_Ellipse_2 = null;

        EObject this_Polyline_3 = null;

        EObject this_Label_4 = null;

        EObject this_Image_5 = null;

        EObject this_Invisible_6 = null;

        EObject this_Custom_7 = null;

        EObject this_Triangle_8 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1893:2: ( (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) )
            // InternalXdiagramDsl.g:1894:2: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            {
            // InternalXdiagramDsl.g:1894:2: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
                {
                alt29=1;
                }
                break;
            case 47:
                {
                alt29=2;
                }
                break;
            case 48:
            case 49:
                {
                alt29=3;
                }
                break;
            case 50:
            case 51:
                {
                alt29=4;
                }
                break;
            case 58:
                {
                alt29=5;
                }
                break;
            case 59:
                {
                alt29=6;
                }
                break;
            case 60:
                {
                alt29=7;
                }
                break;
            case 42:
                {
                alt29=8;
                }
                break;
            case 52:
                {
                alt29=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalXdiagramDsl.g:1895:3: this_Rectangle_0= ruleRectangle
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementAccess().getRectangleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rectangle_0=ruleRectangle();

                    state._fsp--;


                    			current = this_Rectangle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:1904:3: this_Rhombus_1= ruleRhombus
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementAccess().getRhombusParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rhombus_1=ruleRhombus();

                    state._fsp--;


                    			current = this_Rhombus_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:1913:3: this_Ellipse_2= ruleEllipse
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementAccess().getEllipseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ellipse_2=ruleEllipse();

                    state._fsp--;


                    			current = this_Ellipse_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:1922:3: this_Polyline_3= rulePolyline
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementAccess().getPolylineParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Polyline_3=rulePolyline();

                    state._fsp--;


                    			current = this_Polyline_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:1931:3: this_Label_4= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementAccess().getLabelParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_4=ruleLabel();

                    state._fsp--;


                    			current = this_Label_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:1940:3: this_Image_5= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementAccess().getImageParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_5=ruleImage();

                    state._fsp--;


                    			current = this_Image_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXdiagramDsl.g:1949:3: this_Invisible_6= ruleInvisible
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementAccess().getInvisibleParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Invisible_6=ruleInvisible();

                    state._fsp--;


                    			current = this_Invisible_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXdiagramDsl.g:1958:3: this_Custom_7= ruleCustom
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementAccess().getCustomParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Custom_7=ruleCustom();

                    state._fsp--;


                    			current = this_Custom_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalXdiagramDsl.g:1967:3: this_Triangle_8= ruleTriangle
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementAccess().getTriangleParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Triangle_8=ruleTriangle();

                    state._fsp--;


                    			current = this_Triangle_8;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleConnectableElement"


    // $ANTLR start "entryRuleDecoratorElement"
    // InternalXdiagramDsl.g:1979:1: entryRuleDecoratorElement returns [EObject current=null] : iv_ruleDecoratorElement= ruleDecoratorElement EOF ;
    public final EObject entryRuleDecoratorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoratorElement = null;


        try {
            // InternalXdiagramDsl.g:1979:57: (iv_ruleDecoratorElement= ruleDecoratorElement EOF )
            // InternalXdiagramDsl.g:1980:2: iv_ruleDecoratorElement= ruleDecoratorElement EOF
            {
             newCompositeNode(grammarAccess.getDecoratorElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecoratorElement=ruleDecoratorElement();

            state._fsp--;

             current =iv_ruleDecoratorElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDecoratorElement"


    // $ANTLR start "ruleDecoratorElement"
    // InternalXdiagramDsl.g:1986:1: ruleDecoratorElement returns [EObject current=null] : (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) ;
    public final EObject ruleDecoratorElement() throws RecognitionException {
        EObject current = null;

        EObject this_Ellipse_0 = null;

        EObject this_Rhombus_1 = null;

        EObject this_Polyline_2 = null;

        EObject this_Triangle_3 = null;

        EObject this_Label_4 = null;

        EObject this_Image_5 = null;

        EObject this_Arrow_6 = null;

        EObject this_Line_7 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1992:2: ( (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) )
            // InternalXdiagramDsl.g:1993:2: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            {
            // InternalXdiagramDsl.g:1993:2: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            int alt30=8;
            switch ( input.LA(1) ) {
            case 48:
            case 49:
                {
                alt30=1;
                }
                break;
            case 47:
                {
                alt30=2;
                }
                break;
            case 50:
            case 51:
                {
                alt30=3;
                }
                break;
            case 52:
                {
                alt30=4;
                }
                break;
            case 58:
                {
                alt30=5;
                }
                break;
            case 59:
                {
                alt30=6;
                }
                break;
            case 55:
                {
                alt30=7;
                }
                break;
            case 53:
            case 54:
                {
                alt30=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalXdiagramDsl.g:1994:3: this_Ellipse_0= ruleEllipse
                    {

                    			newCompositeNode(grammarAccess.getDecoratorElementAccess().getEllipseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ellipse_0=ruleEllipse();

                    state._fsp--;


                    			current = this_Ellipse_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:2003:3: this_Rhombus_1= ruleRhombus
                    {

                    			newCompositeNode(grammarAccess.getDecoratorElementAccess().getRhombusParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rhombus_1=ruleRhombus();

                    state._fsp--;


                    			current = this_Rhombus_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:2012:3: this_Polyline_2= rulePolyline
                    {

                    			newCompositeNode(grammarAccess.getDecoratorElementAccess().getPolylineParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Polyline_2=rulePolyline();

                    state._fsp--;


                    			current = this_Polyline_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:2021:3: this_Triangle_3= ruleTriangle
                    {

                    			newCompositeNode(grammarAccess.getDecoratorElementAccess().getTriangleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Triangle_3=ruleTriangle();

                    state._fsp--;


                    			current = this_Triangle_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:2030:3: this_Label_4= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getDecoratorElementAccess().getLabelParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_4=ruleLabel();

                    state._fsp--;


                    			current = this_Label_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:2039:3: this_Image_5= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getDecoratorElementAccess().getImageParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_5=ruleImage();

                    state._fsp--;


                    			current = this_Image_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXdiagramDsl.g:2048:3: this_Arrow_6= ruleArrow
                    {

                    			newCompositeNode(grammarAccess.getDecoratorElementAccess().getArrowParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Arrow_6=ruleArrow();

                    state._fsp--;


                    			current = this_Arrow_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXdiagramDsl.g:2057:3: this_Line_7= ruleLine
                    {

                    			newCompositeNode(grammarAccess.getDecoratorElementAccess().getLineParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Line_7=ruleLine();

                    state._fsp--;


                    			current = this_Line_7;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDecoratorElement"


    // $ANTLR start "entryRuleConnectableElementFeature"
    // InternalXdiagramDsl.g:2069:1: entryRuleConnectableElementFeature returns [EObject current=null] : iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF ;
    public final EObject entryRuleConnectableElementFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElementFeature = null;


        try {
            // InternalXdiagramDsl.g:2069:66: (iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF )
            // InternalXdiagramDsl.g:2070:2: iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF
            {
             newCompositeNode(grammarAccess.getConnectableElementFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectableElementFeature=ruleConnectableElementFeature();

            state._fsp--;

             current =iv_ruleConnectableElementFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectableElementFeature"


    // $ANTLR start "ruleConnectableElementFeature"
    // InternalXdiagramDsl.g:2076:1: ruleConnectableElementFeature returns [EObject current=null] : (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) ;
    public final EObject ruleConnectableElementFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Position_0 = null;

        EObject this_Size_1 = null;

        EObject this_ColorFeature_2 = null;

        EObject this_Transparency_3 = null;

        EObject this_LineStyle_4 = null;

        EObject this_LineWidth_5 = null;

        EObject this_Contains_6 = null;

        EObject this_Anchor_7 = null;

        EObject this_Layout_8 = null;

        EObject this_Visible_9 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2082:2: ( (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) )
            // InternalXdiagramDsl.g:2083:2: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            {
            // InternalXdiagramDsl.g:2083:2: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            int alt31=10;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt31=1;
                }
                break;
            case 64:
                {
                alt31=2;
                }
                break;
            case 61:
            case 62:
                {
                alt31=3;
                }
                break;
            case 63:
                {
                alt31=4;
                }
                break;
            case 84:
                {
                alt31=5;
                }
                break;
            case 86:
                {
                alt31=6;
                }
                break;
            case 56:
                {
                alt31=7;
                }
                break;
            case 39:
                {
                alt31=8;
                }
                break;
            case 70:
                {
                alt31=9;
                }
                break;
            case 60:
                {
                alt31=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalXdiagramDsl.g:2084:3: this_Position_0= rulePosition
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getPositionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Position_0=rulePosition();

                    state._fsp--;


                    			current = this_Position_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:2093:3: this_Size_1= ruleSize
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getSizeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Size_1=ruleSize();

                    state._fsp--;


                    			current = this_Size_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:2102:3: this_ColorFeature_2= ruleColorFeature
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getColorFeatureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColorFeature_2=ruleColorFeature();

                    state._fsp--;


                    			current = this_ColorFeature_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:2111:3: this_Transparency_3= ruleTransparency
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getTransparencyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transparency_3=ruleTransparency();

                    state._fsp--;


                    			current = this_Transparency_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:2120:3: this_LineStyle_4= ruleLineStyle
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getLineStyleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineStyle_4=ruleLineStyle();

                    state._fsp--;


                    			current = this_LineStyle_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:2129:3: this_LineWidth_5= ruleLineWidth
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getLineWidthParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineWidth_5=ruleLineWidth();

                    state._fsp--;


                    			current = this_LineWidth_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXdiagramDsl.g:2138:3: this_Contains_6= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getContainsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_6=ruleContains();

                    state._fsp--;


                    			current = this_Contains_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXdiagramDsl.g:2147:3: this_Anchor_7= ruleAnchor
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getAnchorParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Anchor_7=ruleAnchor();

                    state._fsp--;


                    			current = this_Anchor_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalXdiagramDsl.g:2156:3: this_Layout_8= ruleLayout
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getLayoutParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Layout_8=ruleLayout();

                    state._fsp--;


                    			current = this_Layout_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalXdiagramDsl.g:2165:3: this_Visible_9= ruleVisible
                    {

                    			newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getVisibleParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visible_9=ruleVisible();

                    state._fsp--;


                    			current = this_Visible_9;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleConnectableElementFeature"


    // $ANTLR start "entryRuleCustomFigure"
    // InternalXdiagramDsl.g:2177:1: entryRuleCustomFigure returns [EObject current=null] : iv_ruleCustomFigure= ruleCustomFigure EOF ;
    public final EObject entryRuleCustomFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFigure = null;


        try {
            // InternalXdiagramDsl.g:2177:53: (iv_ruleCustomFigure= ruleCustomFigure EOF )
            // InternalXdiagramDsl.g:2178:2: iv_ruleCustomFigure= ruleCustomFigure EOF
            {
             newCompositeNode(grammarAccess.getCustomFigureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomFigure=ruleCustomFigure();

            state._fsp--;

             current =iv_ruleCustomFigure; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCustomFigure"


    // $ANTLR start "ruleCustomFigure"
    // InternalXdiagramDsl.g:2184:1: ruleCustomFigure returns [EObject current=null] : (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleCustomFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2190:2: ( (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) )
            // InternalXdiagramDsl.g:2191:2: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            {
            // InternalXdiagramDsl.g:2191:2: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            // InternalXdiagramDsl.g:2192:3: otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomFigureAccess().getFigureKeyword_0());
            		
            // InternalXdiagramDsl.g:2196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:2197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:2197:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:2198:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCustomFigureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomFigureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomFigureAccess().getAsKeyword_2());
            		
            // InternalXdiagramDsl.g:2218:3: ( (lv_element_3_0= ruleConnectableElement ) )
            // InternalXdiagramDsl.g:2219:4: (lv_element_3_0= ruleConnectableElement )
            {
            // InternalXdiagramDsl.g:2219:4: (lv_element_3_0= ruleConnectableElement )
            // InternalXdiagramDsl.g:2220:5: lv_element_3_0= ruleConnectableElement
            {

            					newCompositeNode(grammarAccess.getCustomFigureAccess().getElementConnectableElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_3_0=ruleConnectableElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomFigureRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_3_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElement");
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
    // $ANTLR end "ruleCustomFigure"


    // $ANTLR start "entryRuleCustom"
    // InternalXdiagramDsl.g:2241:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalXdiagramDsl.g:2241:47: (iv_ruleCustom= ruleCustom EOF )
            // InternalXdiagramDsl.g:2242:2: iv_ruleCustom= ruleCustom EOF
            {
             newCompositeNode(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustom=ruleCustom();

            state._fsp--;

             current =iv_ruleCustom; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCustom"


    // $ANTLR start "ruleCustom"
    // InternalXdiagramDsl.g:2248:1: ruleCustom returns [EObject current=null] : (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_5_0 = null;

        EObject lv_children_7_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2254:2: ( (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2255:2: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2255:2: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2256:3: otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomAccess().getFigureKeyword_0());
            		
            // InternalXdiagramDsl.g:2260:3: ( (otherlv_1= RULE_ID ) )
            // InternalXdiagramDsl.g:2261:4: (otherlv_1= RULE_ID )
            {
            // InternalXdiagramDsl.g:2261:4: (otherlv_1= RULE_ID )
            // InternalXdiagramDsl.g:2262:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getFigureCustomFigureCrossReference_1_0());
            				

            }


            }

            // InternalXdiagramDsl.g:2273:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXdiagramDsl.g:2274:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2274:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2275:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2275:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2276:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getCustomAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2288:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2289:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2289:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2290:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:2306:3: ( (lv_features_5_0= ruleLinkedFeature ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==39||LA33_0==56) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2307:4: (lv_features_5_0= ruleLinkedFeature )
            	    {
            	    // InternalXdiagramDsl.g:2307:4: (lv_features_5_0= ruleLinkedFeature )
            	    // InternalXdiagramDsl.g:2308:5: lv_features_5_0= ruleLinkedFeature
            	    {

            	    					newCompositeNode(grammarAccess.getCustomAccess().getFeaturesLinkedFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_features_5_0=ruleLinkedFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LinkedFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalXdiagramDsl.g:2325:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==44) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2326:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:2330:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2331:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2331:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2332:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getCustomAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCustomRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_7_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCustom"


    // $ANTLR start "entryRuleRectangle"
    // InternalXdiagramDsl.g:2358:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalXdiagramDsl.g:2358:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalXdiagramDsl.g:2359:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // InternalXdiagramDsl.g:2365:1: ruleRectangle returns [EObject current=null] : ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token lv_rectangle_0_0=null;
        Token lv_square_1_0=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_5_0 = null;

        EObject lv_children_7_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2371:2: ( ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2372:2: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2372:2: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2373:3: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:2373:3: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            else if ( (LA35_0==46) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalXdiagramDsl.g:2374:4: ( (lv_rectangle_0_0= 'rectangle' ) )
                    {
                    // InternalXdiagramDsl.g:2374:4: ( (lv_rectangle_0_0= 'rectangle' ) )
                    // InternalXdiagramDsl.g:2375:5: (lv_rectangle_0_0= 'rectangle' )
                    {
                    // InternalXdiagramDsl.g:2375:5: (lv_rectangle_0_0= 'rectangle' )
                    // InternalXdiagramDsl.g:2376:6: lv_rectangle_0_0= 'rectangle'
                    {
                    lv_rectangle_0_0=(Token)match(input,45,FOLLOW_18); 

                    						newLeafNode(lv_rectangle_0_0, grammarAccess.getRectangleAccess().getRectangleRectangleKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRectangleRule());
                    						}
                    						setWithLastConsumed(current, "rectangle", true, "rectangle");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:2389:4: ( (lv_square_1_0= 'square' ) )
                    {
                    // InternalXdiagramDsl.g:2389:4: ( (lv_square_1_0= 'square' ) )
                    // InternalXdiagramDsl.g:2390:5: (lv_square_1_0= 'square' )
                    {
                    // InternalXdiagramDsl.g:2390:5: (lv_square_1_0= 'square' )
                    // InternalXdiagramDsl.g:2391:6: lv_square_1_0= 'square'
                    {
                    lv_square_1_0=(Token)match(input,46,FOLLOW_18); 

                    						newLeafNode(lv_square_1_0, grammarAccess.getRectangleAccess().getSquareSquareKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRectangleRule());
                    						}
                    						setWithLastConsumed(current, "square", true, "square");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:2404:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXdiagramDsl.g:2405:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2405:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2406:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2406:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2407:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getRectangleAccess().getStyledPlusSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRectangleRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2419:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2420:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2420:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2421:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRectangleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getStyleStyleCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2437:3: ( (lv_features_5_0= ruleRectangleFeature ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==39||LA37_0==56||(LA37_0>=60 && LA37_0<=64)||(LA37_0>=68 && LA37_0<=70)||LA37_0==84||LA37_0==86) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2438:4: (lv_features_5_0= ruleRectangleFeature )
            	    {
            	    // InternalXdiagramDsl.g:2438:4: (lv_features_5_0= ruleRectangleFeature )
            	    // InternalXdiagramDsl.g:2439:5: lv_features_5_0= ruleRectangleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getRectangleAccess().getFeaturesRectangleFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_features_5_0=ruleRectangleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.RectangleFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalXdiagramDsl.g:2456:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==44) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2457:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRectangleAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:2461:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2462:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2462:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2463:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getRectangleAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_7_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRectangleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "entryRuleRectangleFeature"
    // InternalXdiagramDsl.g:2489:1: entryRuleRectangleFeature returns [EObject current=null] : iv_ruleRectangleFeature= ruleRectangleFeature EOF ;
    public final EObject entryRuleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleFeature = null;


        try {
            // InternalXdiagramDsl.g:2489:57: (iv_ruleRectangleFeature= ruleRectangleFeature EOF )
            // InternalXdiagramDsl.g:2490:2: iv_ruleRectangleFeature= ruleRectangleFeature EOF
            {
             newCompositeNode(grammarAccess.getRectangleFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRectangleFeature=ruleRectangleFeature();

            state._fsp--;

             current =iv_ruleRectangleFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRectangleFeature"


    // $ANTLR start "ruleRectangleFeature"
    // InternalXdiagramDsl.g:2496:1: ruleRectangleFeature returns [EObject current=null] : (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) ;
    public final EObject ruleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElementFeature_0 = null;

        EObject this_Corner_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2502:2: ( (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) )
            // InternalXdiagramDsl.g:2503:2: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            {
            // InternalXdiagramDsl.g:2503:2: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39||LA39_0==56||(LA39_0>=60 && LA39_0<=64)||LA39_0==68||LA39_0==70||LA39_0==84||LA39_0==86) ) {
                alt39=1;
            }
            else if ( (LA39_0==69) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalXdiagramDsl.g:2504:3: this_ConnectableElementFeature_0= ruleConnectableElementFeature
                    {

                    			newCompositeNode(grammarAccess.getRectangleFeatureAccess().getConnectableElementFeatureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConnectableElementFeature_0=ruleConnectableElementFeature();

                    state._fsp--;


                    			current = this_ConnectableElementFeature_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:2513:3: this_Corner_1= ruleCorner
                    {

                    			newCompositeNode(grammarAccess.getRectangleFeatureAccess().getCornerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Corner_1=ruleCorner();

                    state._fsp--;


                    			current = this_Corner_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRectangleFeature"


    // $ANTLR start "entryRuleRhombus"
    // InternalXdiagramDsl.g:2525:1: entryRuleRhombus returns [EObject current=null] : iv_ruleRhombus= ruleRhombus EOF ;
    public final EObject entryRuleRhombus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhombus = null;


        try {
            // InternalXdiagramDsl.g:2525:48: (iv_ruleRhombus= ruleRhombus EOF )
            // InternalXdiagramDsl.g:2526:2: iv_ruleRhombus= ruleRhombus EOF
            {
             newCompositeNode(grammarAccess.getRhombusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRhombus=ruleRhombus();

            state._fsp--;

             current =iv_ruleRhombus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRhombus"


    // $ANTLR start "ruleRhombus"
    // InternalXdiagramDsl.g:2532:1: ruleRhombus returns [EObject current=null] : ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleRhombus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_5_0 = null;

        EObject lv_children_7_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2538:2: ( ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2539:2: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2539:2: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2540:3: () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:2540:3: ()
            // InternalXdiagramDsl.g:2541:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRhombusAccess().getRhombusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRhombusAccess().getRhombusKeyword_1());
            		
            // InternalXdiagramDsl.g:2551:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXdiagramDsl.g:2552:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2552:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2553:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2553:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2554:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getRhombusAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRhombusRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2566:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2567:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2567:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2568:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRhombusRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getRhombusAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getRhombusAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:2584:3: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==39||LA41_0==56||(LA41_0>=60 && LA41_0<=64)||LA41_0==68||LA41_0==70||LA41_0==84||LA41_0==86) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2585:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2585:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2586:5: lv_features_5_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getRhombusAccess().getFeaturesConnectableElementFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_features_5_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRhombusRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElementFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalXdiagramDsl.g:2603:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==44) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2604:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRhombusAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:2608:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2609:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2609:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2610:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getRhombusAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRhombusRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_7_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRhombusAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRhombus"


    // $ANTLR start "entryRuleEllipse"
    // InternalXdiagramDsl.g:2636:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // InternalXdiagramDsl.g:2636:48: (iv_ruleEllipse= ruleEllipse EOF )
            // InternalXdiagramDsl.g:2637:2: iv_ruleEllipse= ruleEllipse EOF
            {
             newCompositeNode(grammarAccess.getEllipseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEllipse=ruleEllipse();

            state._fsp--;

             current =iv_ruleEllipse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEllipse"


    // $ANTLR start "ruleEllipse"
    // InternalXdiagramDsl.g:2643:1: ruleEllipse returns [EObject current=null] : ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleEllipse() throws RecognitionException {
        EObject current = null;

        Token lv_ellipse_0_0=null;
        Token lv_circle_1_0=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_5_0 = null;

        EObject lv_children_7_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2649:2: ( ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2650:2: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2650:2: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2651:3: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:2651:3: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            else if ( (LA43_0==49) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalXdiagramDsl.g:2652:4: ( (lv_ellipse_0_0= 'ellipse' ) )
                    {
                    // InternalXdiagramDsl.g:2652:4: ( (lv_ellipse_0_0= 'ellipse' ) )
                    // InternalXdiagramDsl.g:2653:5: (lv_ellipse_0_0= 'ellipse' )
                    {
                    // InternalXdiagramDsl.g:2653:5: (lv_ellipse_0_0= 'ellipse' )
                    // InternalXdiagramDsl.g:2654:6: lv_ellipse_0_0= 'ellipse'
                    {
                    lv_ellipse_0_0=(Token)match(input,48,FOLLOW_18); 

                    						newLeafNode(lv_ellipse_0_0, grammarAccess.getEllipseAccess().getEllipseEllipseKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEllipseRule());
                    						}
                    						setWithLastConsumed(current, "ellipse", true, "ellipse");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:2667:4: ( (lv_circle_1_0= 'circle' ) )
                    {
                    // InternalXdiagramDsl.g:2667:4: ( (lv_circle_1_0= 'circle' ) )
                    // InternalXdiagramDsl.g:2668:5: (lv_circle_1_0= 'circle' )
                    {
                    // InternalXdiagramDsl.g:2668:5: (lv_circle_1_0= 'circle' )
                    // InternalXdiagramDsl.g:2669:6: lv_circle_1_0= 'circle'
                    {
                    lv_circle_1_0=(Token)match(input,49,FOLLOW_18); 

                    						newLeafNode(lv_circle_1_0, grammarAccess.getEllipseAccess().getCircleCircleKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEllipseRule());
                    						}
                    						setWithLastConsumed(current, "circle", true, "circle");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:2682:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXdiagramDsl.g:2683:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2683:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2684:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2684:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2685:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getEllipseAccess().getStyledPlusSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEllipseRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2697:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2698:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2698:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2699:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEllipseRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getEllipseAccess().getStyleStyleCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2715:3: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==39||LA45_0==56||(LA45_0>=60 && LA45_0<=64)||LA45_0==68||LA45_0==70||LA45_0==84||LA45_0==86) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2716:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2716:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2717:5: lv_features_5_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEllipseAccess().getFeaturesConnectableElementFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_features_5_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElementFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalXdiagramDsl.g:2734:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==44) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2735:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEllipseAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:2739:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2740:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2740:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2741:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getEllipseAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_7_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEllipseAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEllipse"


    // $ANTLR start "entryRulePolyline"
    // InternalXdiagramDsl.g:2767:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // InternalXdiagramDsl.g:2767:49: (iv_rulePolyline= rulePolyline EOF )
            // InternalXdiagramDsl.g:2768:2: iv_rulePolyline= rulePolyline EOF
            {
             newCompositeNode(grammarAccess.getPolylineRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolyline=rulePolyline();

            state._fsp--;

             current =iv_rulePolyline; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePolyline"


    // $ANTLR start "rulePolyline"
    // InternalXdiagramDsl.g:2774:1: rulePolyline returns [EObject current=null] : ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' ) ;
    public final EObject rulePolyline() throws RecognitionException {
        EObject current = null;

        Token lv_polygon_0_0=null;
        Token lv_polyline_1_0=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_features_5_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_features_8_0 = null;

        EObject lv_children_10_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2780:2: ( ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' ) )
            // InternalXdiagramDsl.g:2781:2: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' )
            {
            // InternalXdiagramDsl.g:2781:2: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' )
            // InternalXdiagramDsl.g:2782:3: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}'
            {
            // InternalXdiagramDsl.g:2782:3: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            else if ( (LA47_0==51) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalXdiagramDsl.g:2783:4: ( (lv_polygon_0_0= 'polygon' ) )
                    {
                    // InternalXdiagramDsl.g:2783:4: ( (lv_polygon_0_0= 'polygon' ) )
                    // InternalXdiagramDsl.g:2784:5: (lv_polygon_0_0= 'polygon' )
                    {
                    // InternalXdiagramDsl.g:2784:5: (lv_polygon_0_0= 'polygon' )
                    // InternalXdiagramDsl.g:2785:6: lv_polygon_0_0= 'polygon'
                    {
                    lv_polygon_0_0=(Token)match(input,50,FOLLOW_18); 

                    						newLeafNode(lv_polygon_0_0, grammarAccess.getPolylineAccess().getPolygonPolygonKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPolylineRule());
                    						}
                    						setWithLastConsumed(current, "polygon", true, "polygon");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:2798:4: ( (lv_polyline_1_0= 'polyline' ) )
                    {
                    // InternalXdiagramDsl.g:2798:4: ( (lv_polyline_1_0= 'polyline' ) )
                    // InternalXdiagramDsl.g:2799:5: (lv_polyline_1_0= 'polyline' )
                    {
                    // InternalXdiagramDsl.g:2799:5: (lv_polyline_1_0= 'polyline' )
                    // InternalXdiagramDsl.g:2800:6: lv_polyline_1_0= 'polyline'
                    {
                    lv_polyline_1_0=(Token)match(input,51,FOLLOW_18); 

                    						newLeafNode(lv_polyline_1_0, grammarAccess.getPolylineAccess().getPolylinePolylineKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPolylineRule());
                    						}
                    						setWithLastConsumed(current, "polyline", true, "polyline");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:2813:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==26) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXdiagramDsl.g:2814:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2814:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2815:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2815:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2816:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getPolylineAccess().getStyledPlusSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPolylineRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2828:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2829:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2829:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2830:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPolylineRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getPolylineAccess().getStyleStyleCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_44); 

            			newLeafNode(otherlv_4, grammarAccess.getPolylineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2846:3: ( (lv_features_5_0= rulePoint ) )
            // InternalXdiagramDsl.g:2847:4: (lv_features_5_0= rulePoint )
            {
            // InternalXdiagramDsl.g:2847:4: (lv_features_5_0= rulePoint )
            // InternalXdiagramDsl.g:2848:5: lv_features_5_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
            lv_features_5_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolylineRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_5_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:2865:3: ( (lv_features_6_0= rulePoint ) )
            // InternalXdiagramDsl.g:2866:4: (lv_features_6_0= rulePoint )
            {
            // InternalXdiagramDsl.g:2866:4: (lv_features_6_0= rulePoint )
            // InternalXdiagramDsl.g:2867:5: lv_features_6_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_43);
            lv_features_6_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolylineRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_6_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:2884:3: ( (lv_features_7_0= rulePoint ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==67) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2885:4: (lv_features_7_0= rulePoint )
            	    {
            	    // InternalXdiagramDsl.g:2885:4: (lv_features_7_0= rulePoint )
            	    // InternalXdiagramDsl.g:2886:5: lv_features_7_0= rulePoint
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_features_7_0=rulePoint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_7_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.Point");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalXdiagramDsl.g:2903:3: ( (lv_features_8_0= ruleConnectableElementFeature ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==39||LA50_0==56||(LA50_0>=60 && LA50_0<=64)||LA50_0==68||LA50_0==70||LA50_0==84||LA50_0==86) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2904:4: (lv_features_8_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2904:4: (lv_features_8_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2905:5: lv_features_8_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesConnectableElementFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_features_8_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_8_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElementFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // InternalXdiagramDsl.g:2922:3: (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==44) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2923:4: otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) )
            	    {
            	    otherlv_9=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_9, grammarAccess.getPolylineAccess().getChildKeyword_7_0());
            	    			
            	    // InternalXdiagramDsl.g:2927:4: ( (lv_children_10_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2928:5: (lv_children_10_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2928:5: (lv_children_10_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2929:6: lv_children_10_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getPolylineAccess().getChildrenChildElementParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_children_10_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_10_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPolylineAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulePolyline"


    // $ANTLR start "entryRuleTriangle"
    // InternalXdiagramDsl.g:2955:1: entryRuleTriangle returns [EObject current=null] : iv_ruleTriangle= ruleTriangle EOF ;
    public final EObject entryRuleTriangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriangle = null;


        try {
            // InternalXdiagramDsl.g:2955:49: (iv_ruleTriangle= ruleTriangle EOF )
            // InternalXdiagramDsl.g:2956:2: iv_ruleTriangle= ruleTriangle EOF
            {
             newCompositeNode(grammarAccess.getTriangleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriangle=ruleTriangle();

            state._fsp--;

             current =iv_ruleTriangle; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTriangle"


    // $ANTLR start "ruleTriangle"
    // InternalXdiagramDsl.g:2962:1: ruleTriangle returns [EObject current=null] : ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleTriangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_5_0 = null;

        EObject lv_children_7_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2968:2: ( ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2969:2: ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2969:2: ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2970:3: () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:2970:3: ()
            // InternalXdiagramDsl.g:2971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriangleAccess().getTriangleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTriangleAccess().getTriangleKeyword_1());
            		
            // InternalXdiagramDsl.g:2981:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXdiagramDsl.g:2982:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2982:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2983:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2983:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2984:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getTriangleAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriangleRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2996:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2997:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2997:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2998:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriangleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getTriangleAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getTriangleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:3014:3: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==39||LA53_0==56||(LA53_0>=60 && LA53_0<=64)||LA53_0==68||LA53_0==70||LA53_0==84||LA53_0==86) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3015:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:3015:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:3016:5: lv_features_5_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getTriangleAccess().getFeaturesConnectableElementFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_features_5_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTriangleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElementFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalXdiagramDsl.g:3033:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==44) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3034:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTriangleAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:3038:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:3039:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:3039:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:3040:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getTriangleAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTriangleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_7_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTriangleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTriangle"


    // $ANTLR start "entryRuleLine"
    // InternalXdiagramDsl.g:3066:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalXdiagramDsl.g:3066:45: (iv_ruleLine= ruleLine EOF )
            // InternalXdiagramDsl.g:3067:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalXdiagramDsl.g:3073:1: ruleLine returns [EObject current=null] : ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_horizontal_1_0=null;
        Token lv_vertical_2_0=null;
        Token lv_styled_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3079:2: ( ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' ) )
            // InternalXdiagramDsl.g:3080:2: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' )
            {
            // InternalXdiagramDsl.g:3080:2: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' )
            // InternalXdiagramDsl.g:3081:3: () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}'
            {
            // InternalXdiagramDsl.g:3081:3: ()
            // InternalXdiagramDsl.g:3082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineAccess().getLineAction_0(),
            					current);
            			

            }

            // InternalXdiagramDsl.g:3088:3: ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==53) ) {
                alt55=1;
            }
            else if ( (LA55_0==54) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalXdiagramDsl.g:3089:4: ( (lv_horizontal_1_0= 'hline' ) )
                    {
                    // InternalXdiagramDsl.g:3089:4: ( (lv_horizontal_1_0= 'hline' ) )
                    // InternalXdiagramDsl.g:3090:5: (lv_horizontal_1_0= 'hline' )
                    {
                    // InternalXdiagramDsl.g:3090:5: (lv_horizontal_1_0= 'hline' )
                    // InternalXdiagramDsl.g:3091:6: lv_horizontal_1_0= 'hline'
                    {
                    lv_horizontal_1_0=(Token)match(input,53,FOLLOW_18); 

                    						newLeafNode(lv_horizontal_1_0, grammarAccess.getLineAccess().getHorizontalHlineKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineRule());
                    						}
                    						setWithLastConsumed(current, "horizontal", true, "hline");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:3104:4: ( (lv_vertical_2_0= 'vline' ) )
                    {
                    // InternalXdiagramDsl.g:3104:4: ( (lv_vertical_2_0= 'vline' ) )
                    // InternalXdiagramDsl.g:3105:5: (lv_vertical_2_0= 'vline' )
                    {
                    // InternalXdiagramDsl.g:3105:5: (lv_vertical_2_0= 'vline' )
                    // InternalXdiagramDsl.g:3106:6: lv_vertical_2_0= 'vline'
                    {
                    lv_vertical_2_0=(Token)match(input,54,FOLLOW_18); 

                    						newLeafNode(lv_vertical_2_0, grammarAccess.getLineAccess().getVerticalVlineKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineRule());
                    						}
                    						setWithLastConsumed(current, "vertical", true, "vline");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:3119:3: ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==26) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalXdiagramDsl.g:3120:4: ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:3120:4: ( (lv_styled_3_0= '+' ) )
                    // InternalXdiagramDsl.g:3121:5: (lv_styled_3_0= '+' )
                    {
                    // InternalXdiagramDsl.g:3121:5: (lv_styled_3_0= '+' )
                    // InternalXdiagramDsl.g:3122:6: lv_styled_3_0= '+'
                    {
                    lv_styled_3_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_3_0, grammarAccess.getLineAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:3134:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXdiagramDsl.g:3135:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:3135:5: (otherlv_4= RULE_ID )
                    // InternalXdiagramDsl.g:3136:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_4, grammarAccess.getLineAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:3152:3: ( (lv_features_6_0= ruleLineFeature ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=60 && LA57_0<=61)||LA57_0==64||LA57_0==68||LA57_0==84||LA57_0==86) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3153:4: (lv_features_6_0= ruleLineFeature )
            	    {
            	    // InternalXdiagramDsl.g:3153:4: (lv_features_6_0= ruleLineFeature )
            	    // InternalXdiagramDsl.g:3154:5: lv_features_6_0= ruleLineFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLineAccess().getFeaturesLineFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_features_6_0=ruleLineFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LineFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLineAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleLineFeature"
    // InternalXdiagramDsl.g:3179:1: entryRuleLineFeature returns [EObject current=null] : iv_ruleLineFeature= ruleLineFeature EOF ;
    public final EObject entryRuleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineFeature = null;


        try {
            // InternalXdiagramDsl.g:3179:52: (iv_ruleLineFeature= ruleLineFeature EOF )
            // InternalXdiagramDsl.g:3180:2: iv_ruleLineFeature= ruleLineFeature EOF
            {
             newCompositeNode(grammarAccess.getLineFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineFeature=ruleLineFeature();

            state._fsp--;

             current =iv_ruleLineFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3186:1: ruleLineFeature returns [EObject current=null] : (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) ;
    public final EObject ruleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject this_LineWidth_0 = null;

        EObject this_LineStyle_1 = null;

        EObject this_Foreground_2 = null;

        EObject this_Position_3 = null;

        EObject this_Size_4 = null;

        EObject this_Visible_5 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3192:2: ( (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) )
            // InternalXdiagramDsl.g:3193:2: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            {
            // InternalXdiagramDsl.g:3193:2: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt58=1;
                }
                break;
            case 84:
                {
                alt58=2;
                }
                break;
            case 61:
                {
                alt58=3;
                }
                break;
            case 68:
                {
                alt58=4;
                }
                break;
            case 64:
                {
                alt58=5;
                }
                break;
            case 60:
                {
                alt58=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalXdiagramDsl.g:3194:3: this_LineWidth_0= ruleLineWidth
                    {

                    			newCompositeNode(grammarAccess.getLineFeatureAccess().getLineWidthParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineWidth_0=ruleLineWidth();

                    state._fsp--;


                    			current = this_LineWidth_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:3203:3: this_LineStyle_1= ruleLineStyle
                    {

                    			newCompositeNode(grammarAccess.getLineFeatureAccess().getLineStyleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineStyle_1=ruleLineStyle();

                    state._fsp--;


                    			current = this_LineStyle_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:3212:3: this_Foreground_2= ruleForeground
                    {

                    			newCompositeNode(grammarAccess.getLineFeatureAccess().getForegroundParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Foreground_2=ruleForeground();

                    state._fsp--;


                    			current = this_Foreground_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:3221:3: this_Position_3= rulePosition
                    {

                    			newCompositeNode(grammarAccess.getLineFeatureAccess().getPositionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Position_3=rulePosition();

                    state._fsp--;


                    			current = this_Position_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:3230:3: this_Size_4= ruleSize
                    {

                    			newCompositeNode(grammarAccess.getLineFeatureAccess().getSizeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Size_4=ruleSize();

                    state._fsp--;


                    			current = this_Size_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:3239:3: this_Visible_5= ruleVisible
                    {

                    			newCompositeNode(grammarAccess.getLineFeatureAccess().getVisibleParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visible_5=ruleVisible();

                    state._fsp--;


                    			current = this_Visible_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLineFeature"


    // $ANTLR start "entryRuleArrow"
    // InternalXdiagramDsl.g:3251:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalXdiagramDsl.g:3251:46: (iv_ruleArrow= ruleArrow EOF )
            // InternalXdiagramDsl.g:3252:2: iv_ruleArrow= ruleArrow EOF
            {
             newCompositeNode(grammarAccess.getArrowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrow=ruleArrow();

            state._fsp--;

             current =iv_ruleArrow; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArrow"


    // $ANTLR start "ruleArrow"
    // InternalXdiagramDsl.g:3258:1: ruleArrow returns [EObject current=null] : ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleArrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3264:2: ( ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:3265:2: ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:3265:2: ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:3266:3: () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:3266:3: ()
            // InternalXdiagramDsl.g:3267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrowAccess().getArrowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getArrowAccess().getArrowKeyword_1());
            		
            // InternalXdiagramDsl.g:3277:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==26) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalXdiagramDsl.g:3278:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:3278:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:3279:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:3279:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:3280:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getArrowAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrowRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:3292:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:3293:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:3293:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:3294:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrowRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getArrowAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getArrowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:3310:3: ( (lv_features_5_0= ruleLineFeature ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=60 && LA60_0<=61)||LA60_0==64||LA60_0==68||LA60_0==84||LA60_0==86) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3311:4: (lv_features_5_0= ruleLineFeature )
            	    {
            	    // InternalXdiagramDsl.g:3311:4: (lv_features_5_0= ruleLineFeature )
            	    // InternalXdiagramDsl.g:3312:5: lv_features_5_0= ruleLineFeature
            	    {

            	    					newCompositeNode(grammarAccess.getArrowAccess().getFeaturesLineFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_features_5_0=ruleLineFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArrowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LineFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getArrowAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleArrow"


    // $ANTLR start "entryRuleContains"
    // InternalXdiagramDsl.g:3337:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalXdiagramDsl.g:3337:49: (iv_ruleContains= ruleContains EOF )
            // InternalXdiagramDsl.g:3338:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalXdiagramDsl.g:3344:1: ruleContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3350:2: ( (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:3351:2: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:3351:2: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:3352:3: otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
            		
            // InternalXdiagramDsl.g:3356:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:3357:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:3357:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:3358:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainsAccess().getModelReferenceEReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_39);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:3372:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==27) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalXdiagramDsl.g:3373:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3373:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3374:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getContainsAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContainsRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContainsAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleValue"
    // InternalXdiagramDsl.g:3399:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalXdiagramDsl.g:3399:46: (iv_ruleValue= ruleValue EOF )
            // InternalXdiagramDsl.g:3400:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalXdiagramDsl.g:3406:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_DoubleValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_EnumValue_4 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3412:2: ( (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) )
            // InternalXdiagramDsl.g:3413:2: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            {
            // InternalXdiagramDsl.g:3413:2: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            int alt62=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==18) ) {
                    alt62=2;
                }
                else if ( (LA62_1==EOF||LA62_1==24) ) {
                    alt62=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 57:
                {
                alt62=3;
                }
                break;
            case 107:
            case 108:
                {
                alt62=4;
                }
                break;
            case RULE_ID:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalXdiagramDsl.g:3414:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:3423:3: this_DoubleValue_1= ruleDoubleValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getDoubleValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleValue_1=ruleDoubleValue();

                    state._fsp--;


                    			current = this_DoubleValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:3432:3: this_StringValue_2= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:3441:3: this_BooleanValue_3= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_3=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:3450:3: this_EnumValue_4= ruleEnumValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getEnumValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumValue_4=ruleEnumValue();

                    state._fsp--;


                    			current = this_EnumValue_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalXdiagramDsl.g:3462:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalXdiagramDsl.g:3462:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalXdiagramDsl.g:3463:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalXdiagramDsl.g:3469:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:3475:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalXdiagramDsl.g:3476:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalXdiagramDsl.g:3476:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3477:3: (lv_value_0_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3477:3: (lv_value_0_0= RULE_INT )
            // InternalXdiagramDsl.g:3478:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleDoubleValue"
    // InternalXdiagramDsl.g:3497:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // InternalXdiagramDsl.g:3497:52: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // InternalXdiagramDsl.g:3498:2: iv_ruleDoubleValue= ruleDoubleValue EOF
            {
             newCompositeNode(grammarAccess.getDoubleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleValue=ruleDoubleValue();

            state._fsp--;

             current =iv_ruleDoubleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoubleValue"


    // $ANTLR start "ruleDoubleValue"
    // InternalXdiagramDsl.g:3504:1: ruleDoubleValue returns [EObject current=null] : ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueInt_0_0=null;
        Token otherlv_1=null;
        Token lv_valueDecimal_2_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:3510:2: ( ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) )
            // InternalXdiagramDsl.g:3511:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            {
            // InternalXdiagramDsl.g:3511:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            // InternalXdiagramDsl.g:3512:3: ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) )
            {
            // InternalXdiagramDsl.g:3512:3: ( (lv_valueInt_0_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3513:4: (lv_valueInt_0_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3513:4: (lv_valueInt_0_0= RULE_INT )
            // InternalXdiagramDsl.g:3514:5: lv_valueInt_0_0= RULE_INT
            {
            lv_valueInt_0_0=(Token)match(input,RULE_INT,FOLLOW_46); 

            					newLeafNode(lv_valueInt_0_0, grammarAccess.getDoubleValueAccess().getValueIntINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoubleValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valueInt",
            						lv_valueInt_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleValueAccess().getFullStopKeyword_1());
            		
            // InternalXdiagramDsl.g:3534:3: ( (lv_valueDecimal_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3535:4: (lv_valueDecimal_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3535:4: (lv_valueDecimal_2_0= RULE_INT )
            // InternalXdiagramDsl.g:3536:5: lv_valueDecimal_2_0= RULE_INT
            {
            lv_valueDecimal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_valueDecimal_2_0, grammarAccess.getDoubleValueAccess().getValueDecimalINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoubleValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valueDecimal",
            						lv_valueDecimal_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalXdiagramDsl.g:3556:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalXdiagramDsl.g:3556:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalXdiagramDsl.g:3557:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalXdiagramDsl.g:3563:1: ruleStringValue returns [EObject current=null] : ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_null_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:3569:2: ( ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalXdiagramDsl.g:3570:2: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalXdiagramDsl.g:3570:2: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==57) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_STRING) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalXdiagramDsl.g:3571:3: ( (lv_null_0_0= 'null' ) )
                    {
                    // InternalXdiagramDsl.g:3571:3: ( (lv_null_0_0= 'null' ) )
                    // InternalXdiagramDsl.g:3572:4: (lv_null_0_0= 'null' )
                    {
                    // InternalXdiagramDsl.g:3572:4: (lv_null_0_0= 'null' )
                    // InternalXdiagramDsl.g:3573:5: lv_null_0_0= 'null'
                    {
                    lv_null_0_0=(Token)match(input,57,FOLLOW_2); 

                    					newLeafNode(lv_null_0_0, grammarAccess.getStringValueAccess().getNullNullKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringValueRule());
                    					}
                    					setWithLastConsumed(current, "null", true, "null");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:3586:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalXdiagramDsl.g:3586:3: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:3587:4: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:3587:4: (lv_value_1_0= RULE_STRING )
                    // InternalXdiagramDsl.g:3588:5: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalXdiagramDsl.g:3608:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalXdiagramDsl.g:3608:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalXdiagramDsl.g:3609:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalXdiagramDsl.g:3615:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteral ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3621:2: ( ( (lv_value_0_0= ruleBooleanLiteral ) ) )
            // InternalXdiagramDsl.g:3622:2: ( (lv_value_0_0= ruleBooleanLiteral ) )
            {
            // InternalXdiagramDsl.g:3622:2: ( (lv_value_0_0= ruleBooleanLiteral ) )
            // InternalXdiagramDsl.g:3623:3: (lv_value_0_0= ruleBooleanLiteral )
            {
            // InternalXdiagramDsl.g:3623:3: (lv_value_0_0= ruleBooleanLiteral )
            // InternalXdiagramDsl.g:3624:4: lv_value_0_0= ruleBooleanLiteral
            {

            				newCompositeNode(grammarAccess.getBooleanValueAccess().getValueBooleanLiteralEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBooleanLiteral();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"pt.iscte.xdiagram.dsl.XdiagramDsl.BooleanLiteral");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEnumValue"
    // InternalXdiagramDsl.g:3644:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalXdiagramDsl.g:3644:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalXdiagramDsl.g:3645:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalXdiagramDsl.g:3651:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:3657:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalXdiagramDsl.g:3658:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalXdiagramDsl.g:3658:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalXdiagramDsl.g:3659:3: (lv_name_0_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:3659:3: (lv_name_0_0= RULE_ID )
            // InternalXdiagramDsl.g:3660:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleLabel"
    // InternalXdiagramDsl.g:3679:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalXdiagramDsl.g:3679:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalXdiagramDsl.g:3680:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalXdiagramDsl.g:3686:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_5_0 = null;

        EObject lv_children_7_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3692:2: ( ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:3693:2: ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:3693:2: ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:3694:3: () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:3694:3: ()
            // InternalXdiagramDsl.g:3695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
            		
            // InternalXdiagramDsl.g:3705:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==26) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXdiagramDsl.g:3706:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:3706:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:3707:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:3707:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:3708:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getLabelAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabelRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:3720:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:3721:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:3721:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:3722:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabelRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:3738:3: ( (lv_features_5_0= ruleLabelFeature ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=60 && LA65_0<=61)||LA65_0==64||LA65_0==68||LA65_0==74||LA65_0==76||LA65_0==83) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3739:4: (lv_features_5_0= ruleLabelFeature )
            	    {
            	    // InternalXdiagramDsl.g:3739:4: (lv_features_5_0= ruleLabelFeature )
            	    // InternalXdiagramDsl.g:3740:5: lv_features_5_0= ruleLabelFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLabelAccess().getFeaturesLabelFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_features_5_0=ruleLabelFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLabelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LabelFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // InternalXdiagramDsl.g:3757:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==44) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3758:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLabelAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:3762:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:3763:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:3763:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:3764:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getLabelAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLabelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_7_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleLabelFeature"
    // InternalXdiagramDsl.g:3790:1: entryRuleLabelFeature returns [EObject current=null] : iv_ruleLabelFeature= ruleLabelFeature EOF ;
    public final EObject entryRuleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelFeature = null;


        try {
            // InternalXdiagramDsl.g:3790:53: (iv_ruleLabelFeature= ruleLabelFeature EOF )
            // InternalXdiagramDsl.g:3791:2: iv_ruleLabelFeature= ruleLabelFeature EOF
            {
             newCompositeNode(grammarAccess.getLabelFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelFeature=ruleLabelFeature();

            state._fsp--;

             current =iv_ruleLabelFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLabelFeature"


    // $ANTLR start "ruleLabelFeature"
    // InternalXdiagramDsl.g:3797:1: ruleLabelFeature returns [EObject current=null] : (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) ;
    public final EObject ruleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject this_TextValue_0 = null;

        EObject this_Foreground_1 = null;

        EObject this_FontProperties_2 = null;

        EObject this_Size_3 = null;

        EObject this_Position_4 = null;

        EObject this_Visible_5 = null;

        EObject this_TextAlign_6 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3803:2: ( (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) )
            // InternalXdiagramDsl.g:3804:2: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            {
            // InternalXdiagramDsl.g:3804:2: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            int alt67=7;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt67=1;
                }
                break;
            case 61:
                {
                alt67=2;
                }
                break;
            case 76:
                {
                alt67=3;
                }
                break;
            case 64:
                {
                alt67=4;
                }
                break;
            case 68:
                {
                alt67=5;
                }
                break;
            case 60:
                {
                alt67=6;
                }
                break;
            case 83:
                {
                alt67=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalXdiagramDsl.g:3805:3: this_TextValue_0= ruleTextValue
                    {

                    			newCompositeNode(grammarAccess.getLabelFeatureAccess().getTextValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextValue_0=ruleTextValue();

                    state._fsp--;


                    			current = this_TextValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:3814:3: this_Foreground_1= ruleForeground
                    {

                    			newCompositeNode(grammarAccess.getLabelFeatureAccess().getForegroundParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Foreground_1=ruleForeground();

                    state._fsp--;


                    			current = this_Foreground_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:3823:3: this_FontProperties_2= ruleFontProperties
                    {

                    			newCompositeNode(grammarAccess.getLabelFeatureAccess().getFontPropertiesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FontProperties_2=ruleFontProperties();

                    state._fsp--;


                    			current = this_FontProperties_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:3832:3: this_Size_3= ruleSize
                    {

                    			newCompositeNode(grammarAccess.getLabelFeatureAccess().getSizeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Size_3=ruleSize();

                    state._fsp--;


                    			current = this_Size_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:3841:3: this_Position_4= rulePosition
                    {

                    			newCompositeNode(grammarAccess.getLabelFeatureAccess().getPositionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Position_4=rulePosition();

                    state._fsp--;


                    			current = this_Position_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:3850:3: this_Visible_5= ruleVisible
                    {

                    			newCompositeNode(grammarAccess.getLabelFeatureAccess().getVisibleParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visible_5=ruleVisible();

                    state._fsp--;


                    			current = this_Visible_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXdiagramDsl.g:3859:3: this_TextAlign_6= ruleTextAlign
                    {

                    			newCompositeNode(grammarAccess.getLabelFeatureAccess().getTextAlignParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextAlign_6=ruleTextAlign();

                    state._fsp--;


                    			current = this_TextAlign_6;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLabelFeature"


    // $ANTLR start "entryRuleImage"
    // InternalXdiagramDsl.g:3871:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalXdiagramDsl.g:3871:46: (iv_ruleImage= ruleImage EOF )
            // InternalXdiagramDsl.g:3872:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalXdiagramDsl.g:3878:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_imageId_1_0=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_5_0 = null;

        EObject lv_children_7_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3884:2: ( (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:3885:2: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:3885:2: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:3886:3: otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
            		
            // InternalXdiagramDsl.g:3890:3: ( (lv_imageId_1_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:3891:4: (lv_imageId_1_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:3891:4: (lv_imageId_1_0= RULE_STRING )
            // InternalXdiagramDsl.g:3892:5: lv_imageId_1_0= RULE_STRING
            {
            lv_imageId_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_imageId_1_0, grammarAccess.getImageAccess().getImageIdSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"imageId",
            						lv_imageId_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXdiagramDsl.g:3908:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==26) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXdiagramDsl.g:3909:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:3909:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:3910:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:3910:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:3911:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getImageAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:3923:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:3924:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:3924:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:3925:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getImageAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:3941:3: ( (lv_features_5_0= ruleImageFeature ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=63 && LA69_0<=64)||LA69_0==68) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3942:4: (lv_features_5_0= ruleImageFeature )
            	    {
            	    // InternalXdiagramDsl.g:3942:4: (lv_features_5_0= ruleImageFeature )
            	    // InternalXdiagramDsl.g:3943:5: lv_features_5_0= ruleImageFeature
            	    {

            	    					newCompositeNode(grammarAccess.getImageAccess().getFeaturesImageFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_features_5_0=ruleImageFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ImageFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // InternalXdiagramDsl.g:3960:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==44) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3961:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_6, grammarAccess.getImageAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:3965:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:3966:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:3966:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:3967:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getImageAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_7_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleImageFeature"
    // InternalXdiagramDsl.g:3993:1: entryRuleImageFeature returns [EObject current=null] : iv_ruleImageFeature= ruleImageFeature EOF ;
    public final EObject entryRuleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFeature = null;


        try {
            // InternalXdiagramDsl.g:3993:53: (iv_ruleImageFeature= ruleImageFeature EOF )
            // InternalXdiagramDsl.g:3994:2: iv_ruleImageFeature= ruleImageFeature EOF
            {
             newCompositeNode(grammarAccess.getImageFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageFeature=ruleImageFeature();

            state._fsp--;

             current =iv_ruleImageFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImageFeature"


    // $ANTLR start "ruleImageFeature"
    // InternalXdiagramDsl.g:4000:1: ruleImageFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) ;
    public final EObject ruleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Transparency_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4006:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) )
            // InternalXdiagramDsl.g:4007:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            {
            // InternalXdiagramDsl.g:4007:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt71=1;
                }
                break;
            case 68:
                {
                alt71=2;
                }
                break;
            case 63:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalXdiagramDsl.g:4008:3: this_Size_0= ruleSize
                    {

                    			newCompositeNode(grammarAccess.getImageFeatureAccess().getSizeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Size_0=ruleSize();

                    state._fsp--;


                    			current = this_Size_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4017:3: this_Position_1= rulePosition
                    {

                    			newCompositeNode(grammarAccess.getImageFeatureAccess().getPositionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Position_1=rulePosition();

                    state._fsp--;


                    			current = this_Position_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4026:3: this_Transparency_2= ruleTransparency
                    {

                    			newCompositeNode(grammarAccess.getImageFeatureAccess().getTransparencyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transparency_2=ruleTransparency();

                    state._fsp--;


                    			current = this_Transparency_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleImageFeature"


    // $ANTLR start "entryRuleInvisible"
    // InternalXdiagramDsl.g:4038:1: entryRuleInvisible returns [EObject current=null] : iv_ruleInvisible= ruleInvisible EOF ;
    public final EObject entryRuleInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisible = null;


        try {
            // InternalXdiagramDsl.g:4038:50: (iv_ruleInvisible= ruleInvisible EOF )
            // InternalXdiagramDsl.g:4039:2: iv_ruleInvisible= ruleInvisible EOF
            {
             newCompositeNode(grammarAccess.getInvisibleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvisible=ruleInvisible();

            state._fsp--;

             current =iv_ruleInvisible; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInvisible"


    // $ANTLR start "ruleInvisible"
    // InternalXdiagramDsl.g:4045:1: ruleInvisible returns [EObject current=null] : ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleInvisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_5_0 = null;

        EObject lv_children_7_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4051:2: ( ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:4052:2: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:4052:2: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:4053:3: () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:4053:3: ()
            // InternalXdiagramDsl.g:4054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvisibleAccess().getInvisibleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInvisibleAccess().getInvisibleKeyword_1());
            		
            // InternalXdiagramDsl.g:4064:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==26) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalXdiagramDsl.g:4065:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:4065:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:4066:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:4066:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:4067:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getInvisibleAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInvisibleRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:4079:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:4080:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:4080:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:4081:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInvisibleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getInvisibleAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_48); 

            			newLeafNode(otherlv_4, grammarAccess.getInvisibleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:4097:3: ( (lv_features_5_0= ruleInvisibleFeature ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==39||LA73_0==56||LA73_0==64||LA73_0==68||LA73_0==70) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalXdiagramDsl.g:4098:4: (lv_features_5_0= ruleInvisibleFeature )
            	    {
            	    // InternalXdiagramDsl.g:4098:4: (lv_features_5_0= ruleInvisibleFeature )
            	    // InternalXdiagramDsl.g:4099:5: lv_features_5_0= ruleInvisibleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getInvisibleAccess().getFeaturesInvisibleFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_48);
            	    lv_features_5_0=ruleInvisibleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInvisibleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.InvisibleFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // InternalXdiagramDsl.g:4116:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==44) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalXdiagramDsl.g:4117:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_6, grammarAccess.getInvisibleAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:4121:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:4122:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:4122:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:4123:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getInvisibleAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInvisibleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_7_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInvisibleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInvisible"


    // $ANTLR start "entryRuleInvisibleFeature"
    // InternalXdiagramDsl.g:4149:1: entryRuleInvisibleFeature returns [EObject current=null] : iv_ruleInvisibleFeature= ruleInvisibleFeature EOF ;
    public final EObject entryRuleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisibleFeature = null;


        try {
            // InternalXdiagramDsl.g:4149:57: (iv_ruleInvisibleFeature= ruleInvisibleFeature EOF )
            // InternalXdiagramDsl.g:4150:2: iv_ruleInvisibleFeature= ruleInvisibleFeature EOF
            {
             newCompositeNode(grammarAccess.getInvisibleFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvisibleFeature=ruleInvisibleFeature();

            state._fsp--;

             current =iv_ruleInvisibleFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInvisibleFeature"


    // $ANTLR start "ruleInvisibleFeature"
    // InternalXdiagramDsl.g:4156:1: ruleInvisibleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) ;
    public final EObject ruleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_LinkedFeature_2 = null;

        EObject this_Layout_3 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4162:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) )
            // InternalXdiagramDsl.g:4163:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            {
            // InternalXdiagramDsl.g:4163:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt75=1;
                }
                break;
            case 68:
                {
                alt75=2;
                }
                break;
            case 39:
            case 56:
                {
                alt75=3;
                }
                break;
            case 70:
                {
                alt75=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalXdiagramDsl.g:4164:3: this_Size_0= ruleSize
                    {

                    			newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getSizeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Size_0=ruleSize();

                    state._fsp--;


                    			current = this_Size_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4173:3: this_Position_1= rulePosition
                    {

                    			newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getPositionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Position_1=rulePosition();

                    state._fsp--;


                    			current = this_Position_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4182:3: this_LinkedFeature_2= ruleLinkedFeature
                    {

                    			newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getLinkedFeatureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LinkedFeature_2=ruleLinkedFeature();

                    state._fsp--;


                    			current = this_LinkedFeature_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:4191:3: this_Layout_3= ruleLayout
                    {

                    			newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getLayoutParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Layout_3=ruleLayout();

                    state._fsp--;


                    			current = this_Layout_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleInvisibleFeature"


    // $ANTLR start "entryRuleColorFeature"
    // InternalXdiagramDsl.g:4203:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // InternalXdiagramDsl.g:4203:53: (iv_ruleColorFeature= ruleColorFeature EOF )
            // InternalXdiagramDsl.g:4204:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4210:1: ruleColorFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_Background_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4216:2: ( (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) )
            // InternalXdiagramDsl.g:4217:2: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            {
            // InternalXdiagramDsl.g:4217:2: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==61) ) {
                alt76=1;
            }
            else if ( (LA76_0==62) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalXdiagramDsl.g:4218:3: this_Foreground_0= ruleForeground
                    {

                    			newCompositeNode(grammarAccess.getColorFeatureAccess().getForegroundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Foreground_0=ruleForeground();

                    state._fsp--;


                    			current = this_Foreground_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4227:3: this_Background_1= ruleBackground
                    {

                    			newCompositeNode(grammarAccess.getColorFeatureAccess().getBackgroundParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Background_1=ruleBackground();

                    state._fsp--;


                    			current = this_Background_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleColorFeature"


    // $ANTLR start "entryRuleForeground"
    // InternalXdiagramDsl.g:4239:1: entryRuleForeground returns [EObject current=null] : iv_ruleForeground= ruleForeground EOF ;
    public final EObject entryRuleForeground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeground = null;


        try {
            // InternalXdiagramDsl.g:4239:51: (iv_ruleForeground= ruleForeground EOF )
            // InternalXdiagramDsl.g:4240:2: iv_ruleForeground= ruleForeground EOF
            {
             newCompositeNode(grammarAccess.getForegroundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeground=ruleForeground();

            state._fsp--;

             current =iv_ruleForeground; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForeground"


    // $ANTLR start "ruleForeground"
    // InternalXdiagramDsl.g:4246:1: ruleForeground returns [EObject current=null] : ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleForeground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4252:2: ( ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4253:2: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4253:2: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4254:3: ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalXdiagramDsl.g:4254:3: ( (lv_type_0_0= 'foreground' ) )
            // InternalXdiagramDsl.g:4255:4: (lv_type_0_0= 'foreground' )
            {
            // InternalXdiagramDsl.g:4255:4: (lv_type_0_0= 'foreground' )
            // InternalXdiagramDsl.g:4256:5: lv_type_0_0= 'foreground'
            {
            lv_type_0_0=(Token)match(input,61,FOLLOW_49); 

            					newLeafNode(lv_type_0_0, grammarAccess.getForegroundAccess().getTypeForegroundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForegroundRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "foreground");
            				

            }


            }

            // InternalXdiagramDsl.g:4268:3: ( (lv_color_1_0= ruleColor ) )
            // InternalXdiagramDsl.g:4269:4: (lv_color_1_0= ruleColor )
            {
            // InternalXdiagramDsl.g:4269:4: (lv_color_1_0= ruleColor )
            // InternalXdiagramDsl.g:4270:5: lv_color_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getForegroundAccess().getColorColorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_color_1_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForegroundRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_1_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:4287:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==27) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalXdiagramDsl.g:4288:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4288:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4289:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getForegroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getForegroundRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getForegroundAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleForeground"


    // $ANTLR start "entryRuleBackground"
    // InternalXdiagramDsl.g:4314:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalXdiagramDsl.g:4314:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalXdiagramDsl.g:4315:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalXdiagramDsl.g:4321:1: ruleBackground returns [EObject current=null] : ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4327:2: ( ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4328:2: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4328:2: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4329:3: ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalXdiagramDsl.g:4329:3: ( (lv_type_0_0= 'background' ) )
            // InternalXdiagramDsl.g:4330:4: (lv_type_0_0= 'background' )
            {
            // InternalXdiagramDsl.g:4330:4: (lv_type_0_0= 'background' )
            // InternalXdiagramDsl.g:4331:5: lv_type_0_0= 'background'
            {
            lv_type_0_0=(Token)match(input,62,FOLLOW_49); 

            					newLeafNode(lv_type_0_0, grammarAccess.getBackgroundAccess().getTypeBackgroundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "background");
            				

            }


            }

            // InternalXdiagramDsl.g:4343:3: ( (lv_color_1_0= ruleColor ) )
            // InternalXdiagramDsl.g:4344:4: (lv_color_1_0= ruleColor )
            {
            // InternalXdiagramDsl.g:4344:4: (lv_color_1_0= ruleColor )
            // InternalXdiagramDsl.g:4345:5: lv_color_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getColorColorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_color_1_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_1_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:4362:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==27) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXdiagramDsl.g:4363:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4363:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4364:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getBackgroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBackgroundAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleTransparency"
    // InternalXdiagramDsl.g:4389:1: entryRuleTransparency returns [EObject current=null] : iv_ruleTransparency= ruleTransparency EOF ;
    public final EObject entryRuleTransparency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransparency = null;


        try {
            // InternalXdiagramDsl.g:4389:53: (iv_ruleTransparency= ruleTransparency EOF )
            // InternalXdiagramDsl.g:4390:2: iv_ruleTransparency= ruleTransparency EOF
            {
             newCompositeNode(grammarAccess.getTransparencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransparency=ruleTransparency();

            state._fsp--;

             current =iv_ruleTransparency; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransparency"


    // $ANTLR start "ruleTransparency"
    // InternalXdiagramDsl.g:4396:1: ruleTransparency returns [EObject current=null] : (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTransparency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_percent_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4402:2: ( (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:4403:2: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:4403:2: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:4404:3: otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getTransparencyAccess().getTransparencyKeyword_0());
            		
            // InternalXdiagramDsl.g:4408:3: ( (lv_percent_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4409:4: (lv_percent_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4409:4: (lv_percent_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4410:5: lv_percent_1_0= RULE_INT
            {
            lv_percent_1_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_percent_1_0, grammarAccess.getTransparencyAccess().getPercentINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransparencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"percent",
            						lv_percent_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getTransparencyAccess().getPercentSignKeyword_2());
            		
            // InternalXdiagramDsl.g:4430:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==27) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalXdiagramDsl.g:4431:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4431:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4432:5: lv_conditional_3_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getTransparencyAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransparencyRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_3_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTransparencyAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleTransparency"


    // $ANTLR start "entryRuleSize"
    // InternalXdiagramDsl.g:4457:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalXdiagramDsl.g:4457:45: (iv_ruleSize= ruleSize EOF )
            // InternalXdiagramDsl.g:4458:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalXdiagramDsl.g:4464:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token lv_widthRelative_2_0=null;
        Token lv_height_3_0=null;
        Token lv_heightRelative_4_0=null;
        Token lv_resizable_5_0=null;
        Token otherlv_7=null;
        EObject lv_conditional_6_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4470:2: ( (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) )
            // InternalXdiagramDsl.g:4471:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            {
            // InternalXdiagramDsl.g:4471:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            // InternalXdiagramDsl.g:4472:3: otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            // InternalXdiagramDsl.g:4476:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4477:4: (lv_width_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4477:4: (lv_width_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4478:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_50); 

            					newLeafNode(lv_width_1_0, grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:4494:3: ( (lv_widthRelative_2_0= ']' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==65) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalXdiagramDsl.g:4495:4: (lv_widthRelative_2_0= ']' )
                    {
                    // InternalXdiagramDsl.g:4495:4: (lv_widthRelative_2_0= ']' )
                    // InternalXdiagramDsl.g:4496:5: lv_widthRelative_2_0= ']'
                    {
                    lv_widthRelative_2_0=(Token)match(input,65,FOLLOW_51); 

                    					newLeafNode(lv_widthRelative_2_0, grammarAccess.getSizeAccess().getWidthRelativeRightSquareBracketKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSizeRule());
                    					}
                    					setWithLastConsumed(current, "widthRelative", true, "]");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4508:3: ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_INT) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXdiagramDsl.g:4509:4: ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )?
                    {
                    // InternalXdiagramDsl.g:4509:4: ( (lv_height_3_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:4510:5: (lv_height_3_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:4510:5: (lv_height_3_0= RULE_INT )
                    // InternalXdiagramDsl.g:4511:6: lv_height_3_0= RULE_INT
                    {
                    lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_52); 

                    						newLeafNode(lv_height_3_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSizeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"height",
                    							lv_height_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:4527:4: ( (lv_heightRelative_4_0= ']' ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==65) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalXdiagramDsl.g:4528:5: (lv_heightRelative_4_0= ']' )
                            {
                            // InternalXdiagramDsl.g:4528:5: (lv_heightRelative_4_0= ']' )
                            // InternalXdiagramDsl.g:4529:6: lv_heightRelative_4_0= ']'
                            {
                            lv_heightRelative_4_0=(Token)match(input,65,FOLLOW_53); 

                            						newLeafNode(lv_heightRelative_4_0, grammarAccess.getSizeAccess().getHeightRelativeRightSquareBracketKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSizeRule());
                            						}
                            						setWithLastConsumed(current, "heightRelative", true, "]");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4542:3: ( (lv_resizable_5_0= 'resizable' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==66) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalXdiagramDsl.g:4543:4: (lv_resizable_5_0= 'resizable' )
                    {
                    // InternalXdiagramDsl.g:4543:4: (lv_resizable_5_0= 'resizable' )
                    // InternalXdiagramDsl.g:4544:5: lv_resizable_5_0= 'resizable'
                    {
                    lv_resizable_5_0=(Token)match(input,66,FOLLOW_39); 

                    					newLeafNode(lv_resizable_5_0, grammarAccess.getSizeAccess().getResizableResizableKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSizeRule());
                    					}
                    					setWithLastConsumed(current, "resizable", true, "resizable");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4556:3: ( (lv_conditional_6_0= ruleFeatureConditional ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==27) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalXdiagramDsl.g:4557:4: (lv_conditional_6_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4557:4: (lv_conditional_6_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4558:5: lv_conditional_6_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getSizeAccess().getConditionalFeatureConditionalParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_6_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSizeRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_6_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSizeAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRulePoint"
    // InternalXdiagramDsl.g:4583:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalXdiagramDsl.g:4583:46: (iv_rulePoint= rulePoint EOF )
            // InternalXdiagramDsl.g:4584:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalXdiagramDsl.g:4590:1: rulePoint returns [EObject current=null] : (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4596:2: ( (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:4597:2: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:4597:2: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:4598:3: otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getPointKeyword_0());
            		
            // InternalXdiagramDsl.g:4602:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4603:4: (lv_x_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4603:4: (lv_x_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4604:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_x_1_0, grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:4620:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4621:4: (lv_y_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4621:4: (lv_y_2_0= RULE_INT )
            // InternalXdiagramDsl.g:4622:5: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_y_2_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:4638:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==27) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXdiagramDsl.g:4639:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4639:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4640:5: lv_conditional_3_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getPointAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPointRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_3_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRulePosition"
    // InternalXdiagramDsl.g:4665:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalXdiagramDsl.g:4665:49: (iv_rulePosition= rulePosition EOF )
            // InternalXdiagramDsl.g:4666:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalXdiagramDsl.g:4672:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_xRelative_2_0=null;
        Token lv_y_3_0=null;
        Token lv_yRelative_4_0=null;
        Token otherlv_6=null;
        EObject lv_conditional_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4678:2: ( (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:4679:2: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:4679:2: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:4680:3: otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            // InternalXdiagramDsl.g:4684:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4685:4: (lv_x_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4685:4: (lv_x_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4686:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_54); 

            					newLeafNode(lv_x_1_0, grammarAccess.getPositionAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:4702:3: ( (lv_xRelative_2_0= '%' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==38) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalXdiagramDsl.g:4703:4: (lv_xRelative_2_0= '%' )
                    {
                    // InternalXdiagramDsl.g:4703:4: (lv_xRelative_2_0= '%' )
                    // InternalXdiagramDsl.g:4704:5: lv_xRelative_2_0= '%'
                    {
                    lv_xRelative_2_0=(Token)match(input,38,FOLLOW_34); 

                    					newLeafNode(lv_xRelative_2_0, grammarAccess.getPositionAccess().getXRelativePercentSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPositionRule());
                    					}
                    					setWithLastConsumed(current, "xRelative", true, "%");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4716:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4717:4: (lv_y_3_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4717:4: (lv_y_3_0= RULE_INT )
            // InternalXdiagramDsl.g:4718:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_55); 

            					newLeafNode(lv_y_3_0, grammarAccess.getPositionAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:4734:3: ( (lv_yRelative_4_0= '%' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==38) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalXdiagramDsl.g:4735:4: (lv_yRelative_4_0= '%' )
                    {
                    // InternalXdiagramDsl.g:4735:4: (lv_yRelative_4_0= '%' )
                    // InternalXdiagramDsl.g:4736:5: lv_yRelative_4_0= '%'
                    {
                    lv_yRelative_4_0=(Token)match(input,38,FOLLOW_39); 

                    					newLeafNode(lv_yRelative_4_0, grammarAccess.getPositionAccess().getYRelativePercentSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPositionRule());
                    					}
                    					setWithLastConsumed(current, "yRelative", true, "%");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4748:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==27) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalXdiagramDsl.g:4749:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4749:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4750:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getPositionAccess().getConditionalFeatureConditionalParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_5_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPositionRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_5_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPositionAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleCorner"
    // InternalXdiagramDsl.g:4775:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // InternalXdiagramDsl.g:4775:47: (iv_ruleCorner= ruleCorner EOF )
            // InternalXdiagramDsl.g:4776:2: iv_ruleCorner= ruleCorner EOF
            {
             newCompositeNode(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCorner=ruleCorner();

            state._fsp--;

             current =iv_ruleCorner; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCorner"


    // $ANTLR start "ruleCorner"
    // InternalXdiagramDsl.g:4782:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4788:2: ( (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4789:2: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4789:2: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4790:3: otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
            		
            // InternalXdiagramDsl.g:4794:3: ( (lv_angle_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4795:4: (lv_angle_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4795:4: (lv_angle_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4796:5: lv_angle_1_0= RULE_INT
            {
            lv_angle_1_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_angle_1_0, grammarAccess.getCornerAccess().getAngleINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCornerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"angle",
            						lv_angle_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:4812:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==27) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalXdiagramDsl.g:4813:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4813:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4814:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getCornerAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCornerRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCornerAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleCorner"


    // $ANTLR start "entryRuleLayout"
    // InternalXdiagramDsl.g:4839:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalXdiagramDsl.g:4839:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalXdiagramDsl.g:4840:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalXdiagramDsl.g:4846:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_vertical_1_0=null;
        Token lv_horizontal_2_0=null;
        Token otherlv_3=null;
        Token lv_margin_4_0=null;
        Token otherlv_6=null;
        EObject lv_conditional_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4852:2: ( (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:4853:2: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:4853:2: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:4854:3: otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
            		
            // InternalXdiagramDsl.g:4858:3: ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==71) ) {
                alt90=1;
            }
            else if ( (LA90_0==72) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalXdiagramDsl.g:4859:4: ( (lv_vertical_1_0= 'vertical' ) )
                    {
                    // InternalXdiagramDsl.g:4859:4: ( (lv_vertical_1_0= 'vertical' ) )
                    // InternalXdiagramDsl.g:4860:5: (lv_vertical_1_0= 'vertical' )
                    {
                    // InternalXdiagramDsl.g:4860:5: (lv_vertical_1_0= 'vertical' )
                    // InternalXdiagramDsl.g:4861:6: lv_vertical_1_0= 'vertical'
                    {
                    lv_vertical_1_0=(Token)match(input,71,FOLLOW_57); 

                    						newLeafNode(lv_vertical_1_0, grammarAccess.getLayoutAccess().getVerticalVerticalKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLayoutRule());
                    						}
                    						setWithLastConsumed(current, "vertical", true, "vertical");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4874:4: ( (lv_horizontal_2_0= 'horizontal' ) )
                    {
                    // InternalXdiagramDsl.g:4874:4: ( (lv_horizontal_2_0= 'horizontal' ) )
                    // InternalXdiagramDsl.g:4875:5: (lv_horizontal_2_0= 'horizontal' )
                    {
                    // InternalXdiagramDsl.g:4875:5: (lv_horizontal_2_0= 'horizontal' )
                    // InternalXdiagramDsl.g:4876:6: lv_horizontal_2_0= 'horizontal'
                    {
                    lv_horizontal_2_0=(Token)match(input,72,FOLLOW_57); 

                    						newLeafNode(lv_horizontal_2_0, grammarAccess.getLayoutAccess().getHorizontalHorizontalKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLayoutRule());
                    						}
                    						setWithLastConsumed(current, "horizontal", true, "horizontal");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4889:3: (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==73) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalXdiagramDsl.g:4890:4: otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getMarginKeyword_2_0());
                    			
                    // InternalXdiagramDsl.g:4894:4: ( (lv_margin_4_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:4895:5: (lv_margin_4_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:4895:5: (lv_margin_4_0= RULE_INT )
                    // InternalXdiagramDsl.g:4896:6: lv_margin_4_0= RULE_INT
                    {
                    lv_margin_4_0=(Token)match(input,RULE_INT,FOLLOW_39); 

                    						newLeafNode(lv_margin_4_0, grammarAccess.getLayoutAccess().getMarginINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLayoutRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"margin",
                    							lv_margin_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4913:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==27) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalXdiagramDsl.g:4914:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4914:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4915:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getLayoutAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_5_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_5_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLayoutAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleVisible"
    // InternalXdiagramDsl.g:4940:1: entryRuleVisible returns [EObject current=null] : iv_ruleVisible= ruleVisible EOF ;
    public final EObject entryRuleVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisible = null;


        try {
            // InternalXdiagramDsl.g:4940:48: (iv_ruleVisible= ruleVisible EOF )
            // InternalXdiagramDsl.g:4941:2: iv_ruleVisible= ruleVisible EOF
            {
             newCompositeNode(grammarAccess.getVisibleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisible=ruleVisible();

            state._fsp--;

             current =iv_ruleVisible; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVisible"


    // $ANTLR start "ruleVisible"
    // InternalXdiagramDsl.g:4947:1: ruleVisible returns [EObject current=null] : (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) ;
    public final EObject ruleVisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_conditional_1_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4953:2: ( (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) )
            // InternalXdiagramDsl.g:4954:2: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            {
            // InternalXdiagramDsl.g:4954:2: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            // InternalXdiagramDsl.g:4955:3: otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibleAccess().getInvisibleKeyword_0());
            		
            // InternalXdiagramDsl.g:4959:3: ( (lv_conditional_1_0= ruleFeatureConditional ) )
            // InternalXdiagramDsl.g:4960:4: (lv_conditional_1_0= ruleFeatureConditional )
            {
            // InternalXdiagramDsl.g:4960:4: (lv_conditional_1_0= ruleFeatureConditional )
            // InternalXdiagramDsl.g:4961:5: lv_conditional_1_0= ruleFeatureConditional
            {

            					newCompositeNode(grammarAccess.getVisibleAccess().getConditionalFeatureConditionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_conditional_1_0=ruleFeatureConditional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibleRule());
            					}
            					set(
            						current,
            						"conditional",
            						lv_conditional_1_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVisibleAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleVisible"


    // $ANTLR start "entryRuleTextValue"
    // InternalXdiagramDsl.g:4986:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalXdiagramDsl.g:4986:50: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalXdiagramDsl.g:4987:2: iv_ruleTextValue= ruleTextValue EOF
            {
             newCompositeNode(grammarAccess.getTextValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextValue=ruleTextValue();

            state._fsp--;

             current =iv_ruleTextValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTextValue"


    // $ANTLR start "ruleTextValue"
    // InternalXdiagramDsl.g:4993:1: ruleTextValue returns [EObject current=null] : ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_parts_2_0 = null;

        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4999:2: ( ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:5000:2: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:5000:2: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:5001:3: () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            // InternalXdiagramDsl.g:5001:3: ()
            // InternalXdiagramDsl.g:5002:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextValueAccess().getTextValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getTextValueAccess().getTextKeyword_1());
            		
            // InternalXdiagramDsl.g:5012:3: ( (lv_parts_2_0= ruleTextPart ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=RULE_ID && LA93_0<=RULE_STRING)||LA93_0==75) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalXdiagramDsl.g:5013:4: (lv_parts_2_0= ruleTextPart )
            	    {
            	    // InternalXdiagramDsl.g:5013:4: (lv_parts_2_0= ruleTextPart )
            	    // InternalXdiagramDsl.g:5014:5: lv_parts_2_0= ruleTextPart
            	    {

            	    					newCompositeNode(grammarAccess.getTextValueAccess().getPartsTextPartParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_59);
            	    lv_parts_2_0=ruleTextPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTextValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parts",
            	    						lv_parts_2_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.TextPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            // InternalXdiagramDsl.g:5031:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==27) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalXdiagramDsl.g:5032:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:5032:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:5033:5: lv_conditional_3_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getTextValueAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTextValueRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_3_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTextValueAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleTextValue"


    // $ANTLR start "entryRuleTextPart"
    // InternalXdiagramDsl.g:5058:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // InternalXdiagramDsl.g:5058:49: (iv_ruleTextPart= ruleTextPart EOF )
            // InternalXdiagramDsl.g:5059:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTextPart"


    // $ANTLR start "ruleTextPart"
    // InternalXdiagramDsl.g:5065:1: ruleTextPart returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_editable_1_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5071:2: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) )
            // InternalXdiagramDsl.g:5072:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            {
            // InternalXdiagramDsl.g:5072:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_STRING) ) {
                alt96=1;
            }
            else if ( (LA96_0==RULE_ID||LA96_0==75) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalXdiagramDsl.g:5073:3: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // InternalXdiagramDsl.g:5073:3: ( (lv_text_0_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:5074:4: (lv_text_0_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:5074:4: (lv_text_0_0= RULE_STRING )
                    // InternalXdiagramDsl.g:5075:5: lv_text_0_0= RULE_STRING
                    {
                    lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_text_0_0, grammarAccess.getTextPartAccess().getTextSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextPartRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"text",
                    						lv_text_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5092:3: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:5092:3: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:5093:4: ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:5093:4: ( (lv_editable_1_0= 'edit:' ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==75) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalXdiagramDsl.g:5094:5: (lv_editable_1_0= 'edit:' )
                            {
                            // InternalXdiagramDsl.g:5094:5: (lv_editable_1_0= 'edit:' )
                            // InternalXdiagramDsl.g:5095:6: lv_editable_1_0= 'edit:'
                            {
                            lv_editable_1_0=(Token)match(input,75,FOLLOW_3); 

                            						newLeafNode(lv_editable_1_0, grammarAccess.getTextPartAccess().getEditableEditKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTextPartRule());
                            						}
                            						setWithLastConsumed(current, "editable", true, "edit:");
                            					

                            }


                            }
                            break;

                    }

                    // InternalXdiagramDsl.g:5107:4: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:5108:5: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:5108:5: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:5109:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextPartRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTextPartAccess().getModelAttributeEAttributeCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleTextPart"


    // $ANTLR start "entryRuleFontProperties"
    // InternalXdiagramDsl.g:5128:1: entryRuleFontProperties returns [EObject current=null] : iv_ruleFontProperties= ruleFontProperties EOF ;
    public final EObject entryRuleFontProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontProperties = null;


        try {
            // InternalXdiagramDsl.g:5128:55: (iv_ruleFontProperties= ruleFontProperties EOF )
            // InternalXdiagramDsl.g:5129:2: iv_ruleFontProperties= ruleFontProperties EOF
            {
             newCompositeNode(grammarAccess.getFontPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFontProperties=ruleFontProperties();

            state._fsp--;

             current =iv_ruleFontProperties; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFontProperties"


    // $ANTLR start "ruleFontProperties"
    // InternalXdiagramDsl.g:5135:1: ruleFontProperties returns [EObject current=null] : ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) ;
    public final EObject ruleFontProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_face_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_size_6_0=null;
        Token lv_bold_7_0=null;
        Token lv_italics_8_0=null;
        Token otherlv_10=null;
        EObject lv_conditional_9_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:5141:2: ( ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) )
            // InternalXdiagramDsl.g:5142:2: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            {
            // InternalXdiagramDsl.g:5142:2: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            // InternalXdiagramDsl.g:5143:3: () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';'
            {
            // InternalXdiagramDsl.g:5143:3: ()
            // InternalXdiagramDsl.g:5144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFontPropertiesAccess().getFontPropertiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getFontPropertiesAccess().getFontKeyword_1());
            		
            // InternalXdiagramDsl.g:5154:3: ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )?
            int alt97=5;
            switch ( input.LA(1) ) {
                case 77:
                    {
                    alt97=1;
                    }
                    break;
                case 78:
                    {
                    alt97=2;
                    }
                    break;
                case 79:
                    {
                    alt97=3;
                    }
                    break;
                case 80:
                    {
                    alt97=4;
                    }
                    break;
            }

            switch (alt97) {
                case 1 :
                    // InternalXdiagramDsl.g:5155:4: ( (lv_face_2_0= 'arial' ) )
                    {
                    // InternalXdiagramDsl.g:5155:4: ( (lv_face_2_0= 'arial' ) )
                    // InternalXdiagramDsl.g:5156:5: (lv_face_2_0= 'arial' )
                    {
                    // InternalXdiagramDsl.g:5156:5: (lv_face_2_0= 'arial' )
                    // InternalXdiagramDsl.g:5157:6: lv_face_2_0= 'arial'
                    {
                    lv_face_2_0=(Token)match(input,77,FOLLOW_61); 

                    						newLeafNode(lv_face_2_0, grammarAccess.getFontPropertiesAccess().getFaceArialKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFontPropertiesRule());
                    						}
                    						setWithLastConsumed(current, "face", lv_face_2_0, "arial");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5170:4: otherlv_3= 'verdana'
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_61); 

                    				newLeafNode(otherlv_3, grammarAccess.getFontPropertiesAccess().getVerdanaKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:5175:4: otherlv_4= 'courier'
                    {
                    otherlv_4=(Token)match(input,79,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getFontPropertiesAccess().getCourierKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:5180:4: otherlv_5= 'times'
                    {
                    otherlv_5=(Token)match(input,80,FOLLOW_61); 

                    				newLeafNode(otherlv_5, grammarAccess.getFontPropertiesAccess().getTimesKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalXdiagramDsl.g:5185:3: ( (lv_size_6_0= RULE_INT ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_INT) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalXdiagramDsl.g:5186:4: (lv_size_6_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:5186:4: (lv_size_6_0= RULE_INT )
                    // InternalXdiagramDsl.g:5187:5: lv_size_6_0= RULE_INT
                    {
                    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_62); 

                    					newLeafNode(lv_size_6_0, grammarAccess.getFontPropertiesAccess().getSizeINTTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFontPropertiesRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"size",
                    						lv_size_6_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:5203:3: ( (lv_bold_7_0= 'bold' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==81) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalXdiagramDsl.g:5204:4: (lv_bold_7_0= 'bold' )
                    {
                    // InternalXdiagramDsl.g:5204:4: (lv_bold_7_0= 'bold' )
                    // InternalXdiagramDsl.g:5205:5: lv_bold_7_0= 'bold'
                    {
                    lv_bold_7_0=(Token)match(input,81,FOLLOW_63); 

                    					newLeafNode(lv_bold_7_0, grammarAccess.getFontPropertiesAccess().getBoldBoldKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFontPropertiesRule());
                    					}
                    					setWithLastConsumed(current, "bold", true, "bold");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:5217:3: ( (lv_italics_8_0= 'italics' ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==82) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalXdiagramDsl.g:5218:4: (lv_italics_8_0= 'italics' )
                    {
                    // InternalXdiagramDsl.g:5218:4: (lv_italics_8_0= 'italics' )
                    // InternalXdiagramDsl.g:5219:5: lv_italics_8_0= 'italics'
                    {
                    lv_italics_8_0=(Token)match(input,82,FOLLOW_39); 

                    					newLeafNode(lv_italics_8_0, grammarAccess.getFontPropertiesAccess().getItalicsItalicsKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFontPropertiesRule());
                    					}
                    					setWithLastConsumed(current, "italics", true, "italics");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:5231:3: ( (lv_conditional_9_0= ruleFeatureConditional ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==27) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalXdiagramDsl.g:5232:4: (lv_conditional_9_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:5232:4: (lv_conditional_9_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:5233:5: lv_conditional_9_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getFontPropertiesAccess().getConditionalFeatureConditionalParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_9_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFontPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_9_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFontPropertiesAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleFontProperties"


    // $ANTLR start "entryRuleTextAlign"
    // InternalXdiagramDsl.g:5258:1: entryRuleTextAlign returns [EObject current=null] : iv_ruleTextAlign= ruleTextAlign EOF ;
    public final EObject entryRuleTextAlign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAlign = null;


        try {
            // InternalXdiagramDsl.g:5258:50: (iv_ruleTextAlign= ruleTextAlign EOF )
            // InternalXdiagramDsl.g:5259:2: iv_ruleTextAlign= ruleTextAlign EOF
            {
             newCompositeNode(grammarAccess.getTextAlignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextAlign=ruleTextAlign();

            state._fsp--;

             current =iv_ruleTextAlign; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTextAlign"


    // $ANTLR start "ruleTextAlign"
    // InternalXdiagramDsl.g:5265:1: ruleTextAlign returns [EObject current=null] : (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleTextAlign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_value_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:5271:2: ( (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:5272:2: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:5272:2: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:5273:3: otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_64); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAlignAccess().getAlignKeyword_0());
            		
            // InternalXdiagramDsl.g:5277:3: ( (lv_value_1_0= ruleTextAlignValue ) )
            // InternalXdiagramDsl.g:5278:4: (lv_value_1_0= ruleTextAlignValue )
            {
            // InternalXdiagramDsl.g:5278:4: (lv_value_1_0= ruleTextAlignValue )
            // InternalXdiagramDsl.g:5279:5: lv_value_1_0= ruleTextAlignValue
            {

            					newCompositeNode(grammarAccess.getTextAlignAccess().getValueTextAlignValueEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_value_1_0=ruleTextAlignValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextAlignRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.TextAlignValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:5296:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==27) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalXdiagramDsl.g:5297:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:5297:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:5298:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getTextAlignAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTextAlignRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTextAlignAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleTextAlign"


    // $ANTLR start "entryRuleLineStyle"
    // InternalXdiagramDsl.g:5323:1: entryRuleLineStyle returns [EObject current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final EObject entryRuleLineStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStyle = null;


        try {
            // InternalXdiagramDsl.g:5323:50: (iv_ruleLineStyle= ruleLineStyle EOF )
            // InternalXdiagramDsl.g:5324:2: iv_ruleLineStyle= ruleLineStyle EOF
            {
             newCompositeNode(grammarAccess.getLineStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineStyle=ruleLineStyle();

            state._fsp--;

             current =iv_ruleLineStyle; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5330:1: ruleLineStyle returns [EObject current=null] : ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject ruleLineStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_manhattan_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_style_2_0 = null;

        EObject lv_conditional_4_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:5336:2: ( ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // InternalXdiagramDsl.g:5337:2: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // InternalXdiagramDsl.g:5337:2: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // InternalXdiagramDsl.g:5338:3: () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            // InternalXdiagramDsl.g:5338:3: ()
            // InternalXdiagramDsl.g:5339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineStyleAccess().getLineStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getLineStyleAccess().getLinestyleKeyword_1());
            		
            // InternalXdiagramDsl.g:5349:3: ( (lv_style_2_0= ruleLineType ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=112 && LA103_0<=114)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalXdiagramDsl.g:5350:4: (lv_style_2_0= ruleLineType )
                    {
                    // InternalXdiagramDsl.g:5350:4: (lv_style_2_0= ruleLineType )
                    // InternalXdiagramDsl.g:5351:5: lv_style_2_0= ruleLineType
                    {

                    					newCompositeNode(grammarAccess.getLineStyleAccess().getStyleLineTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_66);
                    lv_style_2_0=ruleLineType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLineStyleRule());
                    					}
                    					set(
                    						current,
                    						"style",
                    						lv_style_2_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LineType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:5368:3: ( (lv_manhattan_3_0= 'manhattan' ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==85) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalXdiagramDsl.g:5369:4: (lv_manhattan_3_0= 'manhattan' )
                    {
                    // InternalXdiagramDsl.g:5369:4: (lv_manhattan_3_0= 'manhattan' )
                    // InternalXdiagramDsl.g:5370:5: lv_manhattan_3_0= 'manhattan'
                    {
                    lv_manhattan_3_0=(Token)match(input,85,FOLLOW_39); 

                    					newLeafNode(lv_manhattan_3_0, grammarAccess.getLineStyleAccess().getManhattanManhattanKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLineStyleRule());
                    					}
                    					setWithLastConsumed(current, "manhattan", true, "manhattan");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:5382:3: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==27) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalXdiagramDsl.g:5383:4: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:5383:4: (lv_conditional_4_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:5384:5: lv_conditional_4_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getLineStyleAccess().getConditionalFeatureConditionalParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_4_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLineStyleRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_4_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLineStyleAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleLineWidth"
    // InternalXdiagramDsl.g:5409:1: entryRuleLineWidth returns [EObject current=null] : iv_ruleLineWidth= ruleLineWidth EOF ;
    public final EObject entryRuleLineWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineWidth = null;


        try {
            // InternalXdiagramDsl.g:5409:50: (iv_ruleLineWidth= ruleLineWidth EOF )
            // InternalXdiagramDsl.g:5410:2: iv_ruleLineWidth= ruleLineWidth EOF
            {
             newCompositeNode(grammarAccess.getLineWidthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineWidth=ruleLineWidth();

            state._fsp--;

             current =iv_ruleLineWidth; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineWidth"


    // $ANTLR start "ruleLineWidth"
    // InternalXdiagramDsl.g:5416:1: ruleLineWidth returns [EObject current=null] : (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleLineWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:5422:2: ( (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:5423:2: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:5423:2: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:5424:3: otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getLineWidthAccess().getLinewidthKeyword_0());
            		
            // InternalXdiagramDsl.g:5428:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:5429:4: (lv_width_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:5429:4: (lv_width_1_0= RULE_INT )
            // InternalXdiagramDsl.g:5430:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_width_1_0, grammarAccess.getLineWidthAccess().getWidthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineWidthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:5446:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==27) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalXdiagramDsl.g:5447:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:5447:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:5448:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getLineWidthAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLineWidthRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.FeatureConditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLineWidthAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLineWidth"


    // $ANTLR start "ruleAnchorDirection"
    // InternalXdiagramDsl.g:5473:1: ruleAnchorDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) ;
    public final Enumerator ruleAnchorDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5479:2: ( ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) )
            // InternalXdiagramDsl.g:5480:2: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            {
            // InternalXdiagramDsl.g:5480:2: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==87) ) {
                alt107=1;
            }
            else if ( (LA107_0==88) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalXdiagramDsl.g:5481:3: (enumLiteral_0= 'incoming' )
                    {
                    // InternalXdiagramDsl.g:5481:3: (enumLiteral_0= 'incoming' )
                    // InternalXdiagramDsl.g:5482:4: enumLiteral_0= 'incoming'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5489:3: (enumLiteral_1= 'outgoing' )
                    {
                    // InternalXdiagramDsl.g:5489:3: (enumLiteral_1= 'outgoing' )
                    // InternalXdiagramDsl.g:5490:4: enumLiteral_1= 'outgoing'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getAnchorDirectionAccess().getOUTGOINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAnchorDirectionAccess().getOUTGOINGEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAnchorDirection"


    // $ANTLR start "ruleDefaultColor"
    // InternalXdiagramDsl.g:5500:1: ruleDefaultColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) ;
    public final Enumerator ruleDefaultColor() throws RecognitionException {
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
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5506:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) )
            // InternalXdiagramDsl.g:5507:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            {
            // InternalXdiagramDsl.g:5507:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            int alt108=16;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt108=1;
                }
                break;
            case 90:
                {
                alt108=2;
                }
                break;
            case 91:
                {
                alt108=3;
                }
                break;
            case 92:
                {
                alt108=4;
                }
                break;
            case 93:
                {
                alt108=5;
                }
                break;
            case 94:
                {
                alt108=6;
                }
                break;
            case 95:
                {
                alt108=7;
                }
                break;
            case 96:
                {
                alt108=8;
                }
                break;
            case 97:
                {
                alt108=9;
                }
                break;
            case 98:
                {
                alt108=10;
                }
                break;
            case 99:
                {
                alt108=11;
                }
                break;
            case 100:
                {
                alt108=12;
                }
                break;
            case 101:
                {
                alt108=13;
                }
                break;
            case 102:
                {
                alt108=14;
                }
                break;
            case 103:
                {
                alt108=15;
                }
                break;
            case 104:
                {
                alt108=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalXdiagramDsl.g:5508:3: (enumLiteral_0= 'white' )
                    {
                    // InternalXdiagramDsl.g:5508:3: (enumLiteral_0= 'white' )
                    // InternalXdiagramDsl.g:5509:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5516:3: (enumLiteral_1= 'silver' )
                    {
                    // InternalXdiagramDsl.g:5516:3: (enumLiteral_1= 'silver' )
                    // InternalXdiagramDsl.g:5517:4: enumLiteral_1= 'silver'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:5524:3: (enumLiteral_2= 'gray' )
                    {
                    // InternalXdiagramDsl.g:5524:3: (enumLiteral_2= 'gray' )
                    // InternalXdiagramDsl.g:5525:4: enumLiteral_2= 'gray'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:5532:3: (enumLiteral_3= 'black' )
                    {
                    // InternalXdiagramDsl.g:5532:3: (enumLiteral_3= 'black' )
                    // InternalXdiagramDsl.g:5533:4: enumLiteral_3= 'black'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:5540:3: (enumLiteral_4= 'red' )
                    {
                    // InternalXdiagramDsl.g:5540:3: (enumLiteral_4= 'red' )
                    // InternalXdiagramDsl.g:5541:4: enumLiteral_4= 'red'
                    {
                    enumLiteral_4=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:5548:3: (enumLiteral_5= 'maroon' )
                    {
                    // InternalXdiagramDsl.g:5548:3: (enumLiteral_5= 'maroon' )
                    // InternalXdiagramDsl.g:5549:4: enumLiteral_5= 'maroon'
                    {
                    enumLiteral_5=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXdiagramDsl.g:5556:3: (enumLiteral_6= 'yellow' )
                    {
                    // InternalXdiagramDsl.g:5556:3: (enumLiteral_6= 'yellow' )
                    // InternalXdiagramDsl.g:5557:4: enumLiteral_6= 'yellow'
                    {
                    enumLiteral_6=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXdiagramDsl.g:5564:3: (enumLiteral_7= 'olive' )
                    {
                    // InternalXdiagramDsl.g:5564:3: (enumLiteral_7= 'olive' )
                    // InternalXdiagramDsl.g:5565:4: enumLiteral_7= 'olive'
                    {
                    enumLiteral_7=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalXdiagramDsl.g:5572:3: (enumLiteral_8= 'lime' )
                    {
                    // InternalXdiagramDsl.g:5572:3: (enumLiteral_8= 'lime' )
                    // InternalXdiagramDsl.g:5573:4: enumLiteral_8= 'lime'
                    {
                    enumLiteral_8=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalXdiagramDsl.g:5580:3: (enumLiteral_9= 'green' )
                    {
                    // InternalXdiagramDsl.g:5580:3: (enumLiteral_9= 'green' )
                    // InternalXdiagramDsl.g:5581:4: enumLiteral_9= 'green'
                    {
                    enumLiteral_9=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalXdiagramDsl.g:5588:3: (enumLiteral_10= 'aqua' )
                    {
                    // InternalXdiagramDsl.g:5588:3: (enumLiteral_10= 'aqua' )
                    // InternalXdiagramDsl.g:5589:4: enumLiteral_10= 'aqua'
                    {
                    enumLiteral_10=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalXdiagramDsl.g:5596:3: (enumLiteral_11= 'teal' )
                    {
                    // InternalXdiagramDsl.g:5596:3: (enumLiteral_11= 'teal' )
                    // InternalXdiagramDsl.g:5597:4: enumLiteral_11= 'teal'
                    {
                    enumLiteral_11=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalXdiagramDsl.g:5604:3: (enumLiteral_12= 'blue' )
                    {
                    // InternalXdiagramDsl.g:5604:3: (enumLiteral_12= 'blue' )
                    // InternalXdiagramDsl.g:5605:4: enumLiteral_12= 'blue'
                    {
                    enumLiteral_12=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalXdiagramDsl.g:5612:3: (enumLiteral_13= 'navy' )
                    {
                    // InternalXdiagramDsl.g:5612:3: (enumLiteral_13= 'navy' )
                    // InternalXdiagramDsl.g:5613:4: enumLiteral_13= 'navy'
                    {
                    enumLiteral_13=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalXdiagramDsl.g:5620:3: (enumLiteral_14= 'fuchsia' )
                    {
                    // InternalXdiagramDsl.g:5620:3: (enumLiteral_14= 'fuchsia' )
                    // InternalXdiagramDsl.g:5621:4: enumLiteral_14= 'fuchsia'
                    {
                    enumLiteral_14=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalXdiagramDsl.g:5628:3: (enumLiteral_15= 'purple' )
                    {
                    // InternalXdiagramDsl.g:5628:3: (enumLiteral_15= 'purple' )
                    // InternalXdiagramDsl.g:5629:4: enumLiteral_15= 'purple'
                    {
                    enumLiteral_15=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getPURPLEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getDefaultColorAccess().getPURPLEEnumLiteralDeclaration_15());
                    			

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
    // $ANTLR end "ruleDefaultColor"


    // $ANTLR start "ruleOperator"
    // InternalXdiagramDsl.g:5639:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5645:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalXdiagramDsl.g:5646:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalXdiagramDsl.g:5646:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==105) ) {
                alt109=1;
            }
            else if ( (LA109_0==106) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalXdiagramDsl.g:5647:3: (enumLiteral_0= '=' )
                    {
                    // InternalXdiagramDsl.g:5647:3: (enumLiteral_0= '=' )
                    // InternalXdiagramDsl.g:5648:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5655:3: (enumLiteral_1= '<>' )
                    {
                    // InternalXdiagramDsl.g:5655:3: (enumLiteral_1= '<>' )
                    // InternalXdiagramDsl.g:5656:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getDIFFERENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getDIFFERENTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalXdiagramDsl.g:5666:1: ruleBooleanLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5672:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalXdiagramDsl.g:5673:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalXdiagramDsl.g:5673:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==107) ) {
                alt110=1;
            }
            else if ( (LA110_0==108) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalXdiagramDsl.g:5674:3: (enumLiteral_0= 'true' )
                    {
                    // InternalXdiagramDsl.g:5674:3: (enumLiteral_0= 'true' )
                    // InternalXdiagramDsl.g:5675:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5682:3: (enumLiteral_1= 'false' )
                    {
                    // InternalXdiagramDsl.g:5682:3: (enumLiteral_1= 'false' )
                    // InternalXdiagramDsl.g:5683:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getBooleanLiteralAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanLiteralAccess().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "ruleTextAlignValue"
    // InternalXdiagramDsl.g:5693:1: ruleTextAlignValue returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleTextAlignValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5699:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalXdiagramDsl.g:5700:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalXdiagramDsl.g:5700:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt111=1;
                }
                break;
            case 110:
                {
                alt111=2;
                }
                break;
            case 111:
                {
                alt111=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalXdiagramDsl.g:5701:3: (enumLiteral_0= 'left' )
                    {
                    // InternalXdiagramDsl.g:5701:3: (enumLiteral_0= 'left' )
                    // InternalXdiagramDsl.g:5702:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5709:3: (enumLiteral_1= 'center' )
                    {
                    // InternalXdiagramDsl.g:5709:3: (enumLiteral_1= 'center' )
                    // InternalXdiagramDsl.g:5710:4: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:5717:3: (enumLiteral_2= 'right' )
                    {
                    // InternalXdiagramDsl.g:5717:3: (enumLiteral_2= 'right' )
                    // InternalXdiagramDsl.g:5718:4: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getTextAlignValueAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTextAlignValueAccess().getRIGHTEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTextAlignValue"


    // $ANTLR start "ruleLineType"
    // InternalXdiagramDsl.g:5728:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5734:2: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) )
            // InternalXdiagramDsl.g:5735:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            {
            // InternalXdiagramDsl.g:5735:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            int alt112=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt112=1;
                }
                break;
            case 113:
                {
                alt112=2;
                }
                break;
            case 114:
                {
                alt112=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalXdiagramDsl.g:5736:3: (enumLiteral_0= 'solid' )
                    {
                    // InternalXdiagramDsl.g:5736:3: (enumLiteral_0= 'solid' )
                    // InternalXdiagramDsl.g:5737:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5744:3: (enumLiteral_1= 'dashed' )
                    {
                    // InternalXdiagramDsl.g:5744:3: (enumLiteral_1= 'dashed' )
                    // InternalXdiagramDsl.g:5745:4: enumLiteral_1= 'dashed'
                    {
                    enumLiteral_1=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:5752:3: (enumLiteral_2= 'dotted' )
                    {
                    // InternalXdiagramDsl.g:5752:3: (enumLiteral_2= 'dotted' )
                    // InternalXdiagramDsl.g:5753:4: enumLiteral_2= 'dotted'
                    {
                    enumLiteral_2=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getDOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLineTypeAccess().getDOTEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleLineType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000060192800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000060192000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0100000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xE000000000400000L,0x0000000000581439L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1C1FE40000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000160000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xE000002000400000L,0x0000000000581439L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1CFFE40000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010009000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100108000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xF100108000400000L,0x0000000000581479L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xF100008000400000L,0x0000000000581479L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x8000100000400000L,0x0000000000000011L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100108000400000L,0x0000000000000051L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000010L,0x000001FFFE000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000009000040L,0x0000000000000006L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000009000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000009000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000009000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000004009000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000009000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000009000030L,0x0000000000000800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000009000040L,0x000000000007E000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000009000040L,0x0000000000060000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000009000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000009000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000009000000L,0x0007000000200000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000009000000L,0x0000000000200000L});

}