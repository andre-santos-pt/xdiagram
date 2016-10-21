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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xdiagram'", "'metamodel'", "'import'", "'.'", "'*'", "'diagram'", "'{'", "'}'", "'toolgroup'", "';'", "'style'", "'+'", "'if'", "'tool'", "'group'", "'icon'", "'node'", "'link'", "'reference'", "'class'", "'source'", "'target'", "'decorator'", "'%'", "'anchor'", "'max'", "'color'", "'figure'", "'as'", "'child'", "'rectangle'", "'square'", "'rhombus'", "'ellipse'", "'circle'", "'polygon'", "'polyline'", "'triangle'", "'hline'", "'vline'", "'arrow'", "'contains'", "'null'", "'label'", "'image'", "'invisible'", "'foreground'", "'background'", "'transparency'", "'size'", "']'", "'resizable'", "'point'", "'position'", "'corner'", "'layout'", "'vertical'", "'horizontal'", "'margin'", "'text'", "'edit:'", "'font'", "'arial'", "'verdana'", "'courier'", "'times'", "'bold'", "'italics'", "'align'", "'linestyle'", "'manhattan'", "'linewidth'", "'incoming'", "'outgoing'", "'white'", "'silver'", "'gray'", "'black'", "'red'", "'maroon'", "'yellow'", "'olive'", "'lime'", "'green'", "'aqua'", "'teal'", "'blue'", "'navy'", "'fuchsia'", "'purple'", "'='", "'<>'", "'true'", "'false'", "'left'", "'center'", "'right'", "'solid'", "'dashed'", "'dotted'"
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
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
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
    // InternalXdiagramDsl.g:72:1: ruleXDiagram returns [EObject current=null] : (otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_diagram_6_0= ruleDiagram ) ) ( (lv_groups_7_0= ruleToolGroup ) )* ( ( (lv_elements_8_0= ruleDiagramElement ) ) | ( (lv_styles_9_0= ruleStyle ) ) | ( (lv_colors_10_0= ruleCustomColor ) ) | ( (lv_figures_11_0= ruleCustomFigure ) ) )* ) ;
    public final EObject ruleXDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_desc_2_0=null;
        Token otherlv_3=null;
        Token lv_importURI_4_0=null;
        EObject lv_imports_5_0 = null;

        EObject lv_diagram_6_0 = null;

        EObject lv_groups_7_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_styles_9_0 = null;

        EObject lv_colors_10_0 = null;

        EObject lv_figures_11_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:78:2: ( (otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_diagram_6_0= ruleDiagram ) ) ( (lv_groups_7_0= ruleToolGroup ) )* ( ( (lv_elements_8_0= ruleDiagramElement ) ) | ( (lv_styles_9_0= ruleStyle ) ) | ( (lv_colors_10_0= ruleCustomColor ) ) | ( (lv_figures_11_0= ruleCustomFigure ) ) )* ) )
            // InternalXdiagramDsl.g:79:2: (otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_diagram_6_0= ruleDiagram ) ) ( (lv_groups_7_0= ruleToolGroup ) )* ( ( (lv_elements_8_0= ruleDiagramElement ) ) | ( (lv_styles_9_0= ruleStyle ) ) | ( (lv_colors_10_0= ruleCustomColor ) ) | ( (lv_figures_11_0= ruleCustomFigure ) ) )* )
            {
            // InternalXdiagramDsl.g:79:2: (otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_diagram_6_0= ruleDiagram ) ) ( (lv_groups_7_0= ruleToolGroup ) )* ( ( (lv_elements_8_0= ruleDiagramElement ) ) | ( (lv_styles_9_0= ruleStyle ) ) | ( (lv_colors_10_0= ruleCustomColor ) ) | ( (lv_figures_11_0= ruleCustomFigure ) ) )* )
            // InternalXdiagramDsl.g:80:3: otherlv_0= 'xdiagram' ( (lv_id_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= 'metamodel' ( (lv_importURI_4_0= RULE_STRING ) ) ( (lv_imports_5_0= ruleImportStatement ) ) ( (lv_diagram_6_0= ruleDiagram ) ) ( (lv_groups_7_0= ruleToolGroup ) )* ( ( (lv_elements_8_0= ruleDiagramElement ) ) | ( (lv_styles_9_0= ruleStyle ) ) | ( (lv_colors_10_0= ruleCustomColor ) ) | ( (lv_figures_11_0= ruleCustomFigure ) ) )*
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

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getXDiagramAccess().getMetamodelKeyword_3());
            		
            // InternalXdiagramDsl.g:124:3: ( (lv_importURI_4_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:125:4: (lv_importURI_4_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:125:4: (lv_importURI_4_0= RULE_STRING )
            // InternalXdiagramDsl.g:126:5: lv_importURI_4_0= RULE_STRING
            {
            lv_importURI_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_importURI_4_0, grammarAccess.getXDiagramAccess().getImportURISTRINGTerminalRuleCall_4_0());
            				

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

            // InternalXdiagramDsl.g:142:3: ( (lv_imports_5_0= ruleImportStatement ) )
            // InternalXdiagramDsl.g:143:4: (lv_imports_5_0= ruleImportStatement )
            {
            // InternalXdiagramDsl.g:143:4: (lv_imports_5_0= ruleImportStatement )
            // InternalXdiagramDsl.g:144:5: lv_imports_5_0= ruleImportStatement
            {

            					newCompositeNode(grammarAccess.getXDiagramAccess().getImportsImportStatementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalXdiagramDsl.g:161:3: ( (lv_diagram_6_0= ruleDiagram ) )
            // InternalXdiagramDsl.g:162:4: (lv_diagram_6_0= ruleDiagram )
            {
            // InternalXdiagramDsl.g:162:4: (lv_diagram_6_0= ruleDiagram )
            // InternalXdiagramDsl.g:163:5: lv_diagram_6_0= ruleDiagram
            {

            					newCompositeNode(grammarAccess.getXDiagramAccess().getDiagramDiagramParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_diagram_6_0=ruleDiagram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXDiagramRule());
            					}
            					set(
            						current,
            						"diagram",
            						lv_diagram_6_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Diagram");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:180:3: ( (lv_groups_7_0= ruleToolGroup ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXdiagramDsl.g:181:4: (lv_groups_7_0= ruleToolGroup )
            	    {
            	    // InternalXdiagramDsl.g:181:4: (lv_groups_7_0= ruleToolGroup )
            	    // InternalXdiagramDsl.g:182:5: lv_groups_7_0= ruleToolGroup
            	    {

            	    					newCompositeNode(grammarAccess.getXDiagramAccess().getGroupsToolGroupParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_groups_7_0=ruleToolGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groups",
            	    						lv_groups_7_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ToolGroup");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalXdiagramDsl.g:199:3: ( ( (lv_elements_8_0= ruleDiagramElement ) ) | ( (lv_styles_9_0= ruleStyle ) ) | ( (lv_colors_10_0= ruleCustomColor ) ) | ( (lv_figures_11_0= ruleCustomFigure ) ) )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 24:
                case 27:
                case 28:
                    {
                    alt2=1;
                    }
                    break;
                case 21:
                    {
                    alt2=2;
                    }
                    break;
                case 37:
                    {
                    alt2=3;
                    }
                    break;
                case 38:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalXdiagramDsl.g:200:4: ( (lv_elements_8_0= ruleDiagramElement ) )
            	    {
            	    // InternalXdiagramDsl.g:200:4: ( (lv_elements_8_0= ruleDiagramElement ) )
            	    // InternalXdiagramDsl.g:201:5: (lv_elements_8_0= ruleDiagramElement )
            	    {
            	    // InternalXdiagramDsl.g:201:5: (lv_elements_8_0= ruleDiagramElement )
            	    // InternalXdiagramDsl.g:202:6: lv_elements_8_0= ruleDiagramElement
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getElementsDiagramElementParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_elements_8_0=ruleDiagramElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_8_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.DiagramElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXdiagramDsl.g:220:4: ( (lv_styles_9_0= ruleStyle ) )
            	    {
            	    // InternalXdiagramDsl.g:220:4: ( (lv_styles_9_0= ruleStyle ) )
            	    // InternalXdiagramDsl.g:221:5: (lv_styles_9_0= ruleStyle )
            	    {
            	    // InternalXdiagramDsl.g:221:5: (lv_styles_9_0= ruleStyle )
            	    // InternalXdiagramDsl.g:222:6: lv_styles_9_0= ruleStyle
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getStylesStyleParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_styles_9_0=ruleStyle();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"styles",
            	    							lv_styles_9_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.Style");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXdiagramDsl.g:240:4: ( (lv_colors_10_0= ruleCustomColor ) )
            	    {
            	    // InternalXdiagramDsl.g:240:4: ( (lv_colors_10_0= ruleCustomColor ) )
            	    // InternalXdiagramDsl.g:241:5: (lv_colors_10_0= ruleCustomColor )
            	    {
            	    // InternalXdiagramDsl.g:241:5: (lv_colors_10_0= ruleCustomColor )
            	    // InternalXdiagramDsl.g:242:6: lv_colors_10_0= ruleCustomColor
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getColorsCustomColorParserRuleCall_8_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_colors_10_0=ruleCustomColor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"colors",
            	    							lv_colors_10_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.CustomColor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXdiagramDsl.g:260:4: ( (lv_figures_11_0= ruleCustomFigure ) )
            	    {
            	    // InternalXdiagramDsl.g:260:4: ( (lv_figures_11_0= ruleCustomFigure ) )
            	    // InternalXdiagramDsl.g:261:5: (lv_figures_11_0= ruleCustomFigure )
            	    {
            	    // InternalXdiagramDsl.g:261:5: (lv_figures_11_0= ruleCustomFigure )
            	    // InternalXdiagramDsl.g:262:6: lv_figures_11_0= ruleCustomFigure
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getFiguresCustomFigureParserRuleCall_8_3_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_figures_11_0=ruleCustomFigure();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"figures",
            	    							lv_figures_11_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.CustomFigure");
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
    // InternalXdiagramDsl.g:284:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // InternalXdiagramDsl.g:284:56: (iv_ruleImportStatement= ruleImportStatement EOF )
            // InternalXdiagramDsl.g:285:2: iv_ruleImportStatement= ruleImportStatement EOF
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
    // InternalXdiagramDsl.g:291:1: ruleImportStatement returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:297:2: ( ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) )
            // InternalXdiagramDsl.g:298:2: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            {
            // InternalXdiagramDsl.g:298:2: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            // InternalXdiagramDsl.g:299:3: () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            {
            // InternalXdiagramDsl.g:299:3: ()
            // InternalXdiagramDsl.g:300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportStatementAccess().getImportStatementAction_0(),
            					current);
            			

            }

            // InternalXdiagramDsl.g:306:3: (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXdiagramDsl.g:307:4: otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportStatementAccess().getImportKeyword_1_0());
                    			
                    // InternalXdiagramDsl.g:311:4: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    // InternalXdiagramDsl.g:312:5: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    {
                    // InternalXdiagramDsl.g:312:5: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    // InternalXdiagramDsl.g:313:6: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
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
    // InternalXdiagramDsl.g:335:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXdiagramDsl.g:335:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXdiagramDsl.g:336:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXdiagramDsl.g:342:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:348:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXdiagramDsl.g:349:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXdiagramDsl.g:349:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXdiagramDsl.g:350:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXdiagramDsl.g:357:3: (kw= '.' this_ID_2= RULE_ID )*
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
            	    // InternalXdiagramDsl.g:358:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

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
    // InternalXdiagramDsl.g:375:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // InternalXdiagramDsl.g:375:65: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // InternalXdiagramDsl.g:376:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
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
    // InternalXdiagramDsl.g:382:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:388:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalXdiagramDsl.g:389:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalXdiagramDsl.g:389:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalXdiagramDsl.g:390:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXdiagramDsl.g:400:3: (kw= '.' kw= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXdiagramDsl.g:401:4: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0());
                    			
                    kw=(Token)match(input,15,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:416:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalXdiagramDsl.g:416:48: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalXdiagramDsl.g:417:2: iv_ruleDiagram= ruleDiagram EOF
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
    // InternalXdiagramDsl.g:423:1: ruleDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_contains_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:429:2: ( (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) )
            // InternalXdiagramDsl.g:430:2: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            {
            // InternalXdiagramDsl.g:430:2: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            // InternalXdiagramDsl.g:431:3: otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDiagramAccess().getDiagramKeyword_0());
            		
            // InternalXdiagramDsl.g:435:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:436:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:436:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:437:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiagramRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDiagramAccess().getModelClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:455:3: ( (lv_contains_3_0= ruleContains ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==52) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXdiagramDsl.g:456:4: (lv_contains_3_0= ruleContains )
            	    {
            	    // InternalXdiagramDsl.g:456:4: (lv_contains_3_0= ruleContains )
            	    // InternalXdiagramDsl.g:457:5: lv_contains_3_0= ruleContains
            	    {

            	    					newCompositeNode(grammarAccess.getDiagramAccess().getContainsContainsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:482:1: entryRuleToolGroup returns [EObject current=null] : iv_ruleToolGroup= ruleToolGroup EOF ;
    public final EObject entryRuleToolGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolGroup = null;


        try {
            // InternalXdiagramDsl.g:482:50: (iv_ruleToolGroup= ruleToolGroup EOF )
            // InternalXdiagramDsl.g:483:2: iv_ruleToolGroup= ruleToolGroup EOF
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
    // InternalXdiagramDsl.g:489:1: ruleToolGroup returns [EObject current=null] : (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleToolGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:495:2: ( (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:496:2: (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:496:2: (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:497:3: otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getToolGroupAccess().getToolgroupKeyword_0());
            		
            // InternalXdiagramDsl.g:501:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:502:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:502:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:503:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalXdiagramDsl.g:519:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXdiagramDsl.g:520:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:520:4: (lv_description_2_0= RULE_STRING )
                    // InternalXdiagramDsl.g:521:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:545:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // InternalXdiagramDsl.g:545:55: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // InternalXdiagramDsl.g:546:2: iv_ruleDiagramElement= ruleDiagramElement EOF
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
    // InternalXdiagramDsl.g:552:1: ruleDiagramElement returns [EObject current=null] : (this_Node_0= ruleNode | this_Link_1= ruleLink ) ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Link_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:558:2: ( (this_Node_0= ruleNode | this_Link_1= ruleLink ) )
            // InternalXdiagramDsl.g:559:2: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            {
            // InternalXdiagramDsl.g:559:2: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        int LA8_5 = input.LA(4);

                        if ( (LA8_5==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 26:
                                {
                                int LA8_6 = input.LA(6);

                                if ( (LA8_6==RULE_ID) ) {
                                    int LA8_8 = input.LA(7);

                                    if ( (LA8_8==27) ) {
                                        alt8=1;
                                    }
                                    else if ( (LA8_8==28) ) {
                                        alt8=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 8, 8, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 6, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 27:
                                {
                                alt8=1;
                                }
                                break;
                            case 28:
                                {
                                alt8=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 7, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 26:
                        {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==RULE_ID) ) {
                            int LA8_8 = input.LA(5);

                            if ( (LA8_8==27) ) {
                                alt8=1;
                            }
                            else if ( (LA8_8==28) ) {
                                alt8=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 27:
                        {
                        alt8=1;
                        }
                        break;
                    case 28:
                        {
                        alt8=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXdiagramDsl.g:560:3: this_Node_0= ruleNode
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
                    // InternalXdiagramDsl.g:569:3: this_Link_1= ruleLink
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
    // InternalXdiagramDsl.g:581:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalXdiagramDsl.g:581:46: (iv_ruleStyle= ruleStyle EOF )
            // InternalXdiagramDsl.g:582:2: iv_ruleStyle= ruleStyle EOF
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
    // InternalXdiagramDsl.g:588:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:594:2: ( (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:595:2: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:595:2: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:596:3: otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
            		
            // InternalXdiagramDsl.g:600:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:601:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:601:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:602:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalXdiagramDsl.g:618:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXdiagramDsl.g:619:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:619:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:620:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:620:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:621:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getStyleAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStyleRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:633:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:634:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:634:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:635:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStyleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:651:3: ( (lv_features_5_0= ruleStyleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=57 && LA10_0<=60)||(LA10_0>=63 && LA10_0<=65)||LA10_0==70||LA10_0==72||(LA10_0>=79 && LA10_0<=80)||LA10_0==82) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXdiagramDsl.g:652:4: (lv_features_5_0= ruleStyleFeature )
            	    {
            	    // InternalXdiagramDsl.g:652:4: (lv_features_5_0= ruleStyleFeature )
            	    // InternalXdiagramDsl.g:653:5: lv_features_5_0= ruleStyleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getStyleAccess().getFeaturesStyleFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:678:1: entryRuleLinkedFeature returns [EObject current=null] : iv_ruleLinkedFeature= ruleLinkedFeature EOF ;
    public final EObject entryRuleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedFeature = null;


        try {
            // InternalXdiagramDsl.g:678:54: (iv_ruleLinkedFeature= ruleLinkedFeature EOF )
            // InternalXdiagramDsl.g:679:2: iv_ruleLinkedFeature= ruleLinkedFeature EOF
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
    // InternalXdiagramDsl.g:685:1: ruleLinkedFeature returns [EObject current=null] : (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) ;
    public final EObject ruleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_Anchor_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:691:2: ( (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) )
            // InternalXdiagramDsl.g:692:2: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            {
            // InternalXdiagramDsl.g:692:2: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==52) ) {
                alt11=1;
            }
            else if ( (LA11_0==35) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalXdiagramDsl.g:693:3: this_Contains_0= ruleContains
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
                    // InternalXdiagramDsl.g:702:3: this_Anchor_1= ruleAnchor
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
    // InternalXdiagramDsl.g:714:1: entryRuleStyleFeature returns [EObject current=null] : iv_ruleStyleFeature= ruleStyleFeature EOF ;
    public final EObject entryRuleStyleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleFeature = null;


        try {
            // InternalXdiagramDsl.g:714:53: (iv_ruleStyleFeature= ruleStyleFeature EOF )
            // InternalXdiagramDsl.g:715:2: iv_ruleStyleFeature= ruleStyleFeature EOF
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
    // InternalXdiagramDsl.g:721:1: ruleStyleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) ;
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
            // InternalXdiagramDsl.g:727:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) )
            // InternalXdiagramDsl.g:728:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            {
            // InternalXdiagramDsl.g:728:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            int alt12=12;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt12=1;
                }
                break;
            case 64:
                {
                alt12=2;
                }
                break;
            case 63:
                {
                alt12=3;
                }
                break;
            case 65:
                {
                alt12=4;
                }
                break;
            case 58:
                {
                alt12=5;
                }
                break;
            case 57:
                {
                alt12=6;
                }
                break;
            case 59:
                {
                alt12=7;
                }
                break;
            case 72:
                {
                alt12=8;
                }
                break;
            case 70:
                {
                alt12=9;
                }
                break;
            case 79:
                {
                alt12=10;
                }
                break;
            case 80:
                {
                alt12=11;
                }
                break;
            case 82:
                {
                alt12=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalXdiagramDsl.g:729:3: this_Size_0= ruleSize
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
                    // InternalXdiagramDsl.g:738:3: this_Position_1= rulePosition
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
                    // InternalXdiagramDsl.g:747:3: this_Point_2= rulePoint
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
                    // InternalXdiagramDsl.g:756:3: this_Corner_3= ruleCorner
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
                    // InternalXdiagramDsl.g:765:3: this_Background_4= ruleBackground
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
                    // InternalXdiagramDsl.g:774:3: this_Foreground_5= ruleForeground
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
                    // InternalXdiagramDsl.g:783:3: this_Transparency_6= ruleTransparency
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
                    // InternalXdiagramDsl.g:792:3: this_FontProperties_7= ruleFontProperties
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
                    // InternalXdiagramDsl.g:801:3: this_TextValue_8= ruleTextValue
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
                    // InternalXdiagramDsl.g:810:3: this_TextAlign_9= ruleTextAlign
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
                    // InternalXdiagramDsl.g:819:3: this_LineStyle_10= ruleLineStyle
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
                    // InternalXdiagramDsl.g:828:3: this_LineWidth_11= ruleLineWidth
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
    // InternalXdiagramDsl.g:840:1: entryRuleChildElement returns [EObject current=null] : iv_ruleChildElement= ruleChildElement EOF ;
    public final EObject entryRuleChildElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildElement = null;


        try {
            // InternalXdiagramDsl.g:840:53: (iv_ruleChildElement= ruleChildElement EOF )
            // InternalXdiagramDsl.g:841:2: iv_ruleChildElement= ruleChildElement EOF
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
    // InternalXdiagramDsl.g:847:1: ruleChildElement returns [EObject current=null] : (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) ;
    public final EObject ruleChildElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElement_0 = null;

        EObject this_Line_1 = null;

        EObject this_Arrow_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:853:2: ( (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) )
            // InternalXdiagramDsl.g:854:2: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            {
            // InternalXdiagramDsl.g:854:2: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 38:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 54:
            case 55:
            case 56:
                {
                alt13=1;
                }
                break;
            case 49:
            case 50:
                {
                alt13=2;
                }
                break;
            case 51:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalXdiagramDsl.g:855:3: this_ConnectableElement_0= ruleConnectableElement
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
                    // InternalXdiagramDsl.g:864:3: this_Line_1= ruleLine
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
                    // InternalXdiagramDsl.g:873:3: this_Arrow_2= ruleArrow
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
    // InternalXdiagramDsl.g:885:1: entryRuleFeatureConditional returns [EObject current=null] : iv_ruleFeatureConditional= ruleFeatureConditional EOF ;
    public final EObject entryRuleFeatureConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureConditional = null;


        try {
            // InternalXdiagramDsl.g:885:59: (iv_ruleFeatureConditional= ruleFeatureConditional EOF )
            // InternalXdiagramDsl.g:886:2: iv_ruleFeatureConditional= ruleFeatureConditional EOF
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
    // InternalXdiagramDsl.g:892:1: ruleFeatureConditional returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleFeatureConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:898:2: ( (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalXdiagramDsl.g:899:2: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalXdiagramDsl.g:899:2: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            // InternalXdiagramDsl.g:900:3: otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureConditionalAccess().getIfKeyword_0());
            		
            // InternalXdiagramDsl.g:904:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:905:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:905:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:906:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureConditionalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureConditionalAccess().getModelAttributeEAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:920:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalXdiagramDsl.g:921:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalXdiagramDsl.g:921:4: (lv_operator_2_0= ruleOperator )
            // InternalXdiagramDsl.g:922:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getFeatureConditionalAccess().getOperatorOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalXdiagramDsl.g:939:3: ( (lv_value_3_0= ruleValue ) )
            // InternalXdiagramDsl.g:940:4: (lv_value_3_0= ruleValue )
            {
            // InternalXdiagramDsl.g:940:4: (lv_value_3_0= ruleValue )
            // InternalXdiagramDsl.g:941:5: lv_value_3_0= ruleValue
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
    // InternalXdiagramDsl.g:962:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalXdiagramDsl.g:962:45: (iv_ruleNode= ruleNode EOF )
            // InternalXdiagramDsl.g:963:2: iv_ruleNode= ruleNode EOF
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
    // InternalXdiagramDsl.g:969:1: ruleNode returns [EObject current=null] : ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) ;
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
            // InternalXdiagramDsl.g:975:2: ( ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) )
            // InternalXdiagramDsl.g:976:2: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            {
            // InternalXdiagramDsl.g:976:2: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            // InternalXdiagramDsl.g:977:3: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            {
            // InternalXdiagramDsl.g:977:3: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXdiagramDsl.g:978:4: ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    {
                    // InternalXdiagramDsl.g:978:4: ( (lv_tool_0_0= 'tool' ) )
                    // InternalXdiagramDsl.g:979:5: (lv_tool_0_0= 'tool' )
                    {
                    // InternalXdiagramDsl.g:979:5: (lv_tool_0_0= 'tool' )
                    // InternalXdiagramDsl.g:980:6: lv_tool_0_0= 'tool'
                    {
                    lv_tool_0_0=(Token)match(input,24,FOLLOW_4); 

                    						newLeafNode(lv_tool_0_0, grammarAccess.getNodeAccess().getToolToolKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(current, "tool", true, "tool");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:992:4: ( (lv_toolName_1_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:993:5: (lv_toolName_1_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:993:5: (lv_toolName_1_0= RULE_STRING )
                    // InternalXdiagramDsl.g:994:6: lv_toolName_1_0= RULE_STRING
                    {
                    lv_toolName_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

                    // InternalXdiagramDsl.g:1010:4: ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalXdiagramDsl.g:1011:5: ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalXdiagramDsl.g:1011:5: ( (lv_group_2_0= 'group' ) )
                            // InternalXdiagramDsl.g:1012:6: (lv_group_2_0= 'group' )
                            {
                            // InternalXdiagramDsl.g:1012:6: (lv_group_2_0= 'group' )
                            // InternalXdiagramDsl.g:1013:7: lv_group_2_0= 'group'
                            {
                            lv_group_2_0=(Token)match(input,25,FOLLOW_3); 

                            							newLeafNode(lv_group_2_0, grammarAccess.getNodeAccess().getGroupGroupKeyword_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeRule());
                            							}
                            							setWithLastConsumed(current, "group", true, "group");
                            						

                            }


                            }

                            // InternalXdiagramDsl.g:1025:5: ( (otherlv_3= RULE_ID ) )
                            // InternalXdiagramDsl.g:1026:6: (otherlv_3= RULE_ID )
                            {
                            // InternalXdiagramDsl.g:1026:6: (otherlv_3= RULE_ID )
                            // InternalXdiagramDsl.g:1027:7: otherlv_3= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeRule());
                            							}
                            						
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                            							newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getGroupIdToolGroupCrossReference_0_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalXdiagramDsl.g:1039:4: ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==26) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalXdiagramDsl.g:1040:5: ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) )
                            {
                            // InternalXdiagramDsl.g:1040:5: ( (lv_icon_4_0= 'icon' ) )
                            // InternalXdiagramDsl.g:1041:6: (lv_icon_4_0= 'icon' )
                            {
                            // InternalXdiagramDsl.g:1041:6: (lv_icon_4_0= 'icon' )
                            // InternalXdiagramDsl.g:1042:7: lv_icon_4_0= 'icon'
                            {
                            lv_icon_4_0=(Token)match(input,26,FOLLOW_3); 

                            							newLeafNode(lv_icon_4_0, grammarAccess.getNodeAccess().getIconIconKeyword_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeRule());
                            							}
                            							setWithLastConsumed(current, "icon", true, "icon");
                            						

                            }


                            }

                            // InternalXdiagramDsl.g:1054:5: ( (lv_imageId_5_0= RULE_ID ) )
                            // InternalXdiagramDsl.g:1055:6: (lv_imageId_5_0= RULE_ID )
                            {
                            // InternalXdiagramDsl.g:1055:6: (lv_imageId_5_0= RULE_ID )
                            // InternalXdiagramDsl.g:1056:7: lv_imageId_5_0= RULE_ID
                            {
                            lv_imageId_5_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_6=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getNodeKeyword_1());
            		
            // InternalXdiagramDsl.g:1078:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:1079:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:1079:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:1080:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeAccess().getModelClassEClassCrossReference_2_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:1094:3: ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            // InternalXdiagramDsl.g:1095:4: (lv_rootFigure_8_0= ruleConnectableElement )
            {
            // InternalXdiagramDsl.g:1095:4: (lv_rootFigure_8_0= ruleConnectableElement )
            // InternalXdiagramDsl.g:1096:5: lv_rootFigure_8_0= ruleConnectableElement
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
    // InternalXdiagramDsl.g:1117:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalXdiagramDsl.g:1117:45: (iv_ruleLink= ruleLink EOF )
            // InternalXdiagramDsl.g:1118:2: iv_ruleLink= ruleLink EOF
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
    // InternalXdiagramDsl.g:1124:1: ruleLink returns [EObject current=null] : ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' ) ;
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
            // InternalXdiagramDsl.g:1130:2: ( ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' ) )
            // InternalXdiagramDsl.g:1131:2: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' )
            {
            // InternalXdiagramDsl.g:1131:2: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' )
            // InternalXdiagramDsl.g:1132:3: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}'
            {
            // InternalXdiagramDsl.g:1132:3: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXdiagramDsl.g:1133:4: ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    {
                    // InternalXdiagramDsl.g:1133:4: ( (lv_tool_0_0= 'tool' ) )
                    // InternalXdiagramDsl.g:1134:5: (lv_tool_0_0= 'tool' )
                    {
                    // InternalXdiagramDsl.g:1134:5: (lv_tool_0_0= 'tool' )
                    // InternalXdiagramDsl.g:1135:6: lv_tool_0_0= 'tool'
                    {
                    lv_tool_0_0=(Token)match(input,24,FOLLOW_4); 

                    						newLeafNode(lv_tool_0_0, grammarAccess.getLinkAccess().getToolToolKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(current, "tool", true, "tool");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:1147:4: ( (lv_toolName_1_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:1148:5: (lv_toolName_1_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:1148:5: (lv_toolName_1_0= RULE_STRING )
                    // InternalXdiagramDsl.g:1149:6: lv_toolName_1_0= RULE_STRING
                    {
                    lv_toolName_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

                    // InternalXdiagramDsl.g:1165:4: ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalXdiagramDsl.g:1166:5: ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalXdiagramDsl.g:1166:5: ( (lv_group_2_0= 'group' ) )
                            // InternalXdiagramDsl.g:1167:6: (lv_group_2_0= 'group' )
                            {
                            // InternalXdiagramDsl.g:1167:6: (lv_group_2_0= 'group' )
                            // InternalXdiagramDsl.g:1168:7: lv_group_2_0= 'group'
                            {
                            lv_group_2_0=(Token)match(input,25,FOLLOW_3); 

                            							newLeafNode(lv_group_2_0, grammarAccess.getLinkAccess().getGroupGroupKeyword_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLinkRule());
                            							}
                            							setWithLastConsumed(current, "group", true, "group");
                            						

                            }


                            }

                            // InternalXdiagramDsl.g:1180:5: ( (otherlv_3= RULE_ID ) )
                            // InternalXdiagramDsl.g:1181:6: (otherlv_3= RULE_ID )
                            {
                            // InternalXdiagramDsl.g:1181:6: (otherlv_3= RULE_ID )
                            // InternalXdiagramDsl.g:1182:7: otherlv_3= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLinkRule());
                            							}
                            						
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getGroupIdToolGroupCrossReference_0_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalXdiagramDsl.g:1194:4: ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==26) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalXdiagramDsl.g:1195:5: ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) )
                            {
                            // InternalXdiagramDsl.g:1195:5: ( (lv_icon_4_0= 'icon' ) )
                            // InternalXdiagramDsl.g:1196:6: (lv_icon_4_0= 'icon' )
                            {
                            // InternalXdiagramDsl.g:1196:6: (lv_icon_4_0= 'icon' )
                            // InternalXdiagramDsl.g:1197:7: lv_icon_4_0= 'icon'
                            {
                            lv_icon_4_0=(Token)match(input,26,FOLLOW_3); 

                            							newLeafNode(lv_icon_4_0, grammarAccess.getLinkAccess().getIconIconKeyword_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLinkRule());
                            							}
                            							setWithLastConsumed(current, "icon", true, "icon");
                            						

                            }


                            }

                            // InternalXdiagramDsl.g:1209:5: ( (lv_imageId_5_0= RULE_ID ) )
                            // InternalXdiagramDsl.g:1210:6: (lv_imageId_5_0= RULE_ID )
                            {
                            // InternalXdiagramDsl.g:1210:6: (lv_imageId_5_0= RULE_ID )
                            // InternalXdiagramDsl.g:1211:7: lv_imageId_5_0= RULE_ID
                            {
                            lv_imageId_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_6=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalXdiagramDsl.g:1233:3: ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            else if ( (LA20_0==30) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalXdiagramDsl.g:1234:4: ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:1234:4: ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:1235:5: ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:1235:5: ( (lv_reference_7_0= 'reference' ) )
                    // InternalXdiagramDsl.g:1236:6: (lv_reference_7_0= 'reference' )
                    {
                    // InternalXdiagramDsl.g:1236:6: (lv_reference_7_0= 'reference' )
                    // InternalXdiagramDsl.g:1237:7: lv_reference_7_0= 'reference'
                    {
                    lv_reference_7_0=(Token)match(input,29,FOLLOW_3); 

                    							newLeafNode(lv_reference_7_0, grammarAccess.getLinkAccess().getReferenceReferenceKeyword_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    							setWithLastConsumed(current, "reference", true, "reference");
                    						

                    }


                    }

                    // InternalXdiagramDsl.g:1249:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:1250:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:1250:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:1251:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_2_0_1_0());
                    						
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:1267:4: ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:1267:4: ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:1268:5: ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:1268:5: ( (lv_complex_9_0= 'class' ) )
                    // InternalXdiagramDsl.g:1269:6: (lv_complex_9_0= 'class' )
                    {
                    // InternalXdiagramDsl.g:1269:6: (lv_complex_9_0= 'class' )
                    // InternalXdiagramDsl.g:1270:7: lv_complex_9_0= 'class'
                    {
                    lv_complex_9_0=(Token)match(input,30,FOLLOW_3); 

                    							newLeafNode(lv_complex_9_0, grammarAccess.getLinkAccess().getComplexClassKeyword_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    							setWithLastConsumed(current, "complex", true, "class");
                    						

                    }


                    }

                    // InternalXdiagramDsl.g:1282:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:1283:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:1283:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:1284:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_2_1_1_0());
                    						
                    pushFollow(FOLLOW_27);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,31,FOLLOW_3); 

                    					newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getSourceKeyword_2_1_2());
                    				
                    // InternalXdiagramDsl.g:1302:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:1303:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:1303:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:1304:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_2_1_3_0());
                    						
                    pushFollow(FOLLOW_28);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(otherlv_13, grammarAccess.getLinkAccess().getTargetKeyword_2_1_4());
                    				
                    // InternalXdiagramDsl.g:1322:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:1323:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:1323:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:1324:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_2_1_5_0());
                    						
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:1340:3: ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXdiagramDsl.g:1341:4: ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:1341:4: ( (lv_styled_15_0= '+' ) )
                    // InternalXdiagramDsl.g:1342:5: (lv_styled_15_0= '+' )
                    {
                    // InternalXdiagramDsl.g:1342:5: (lv_styled_15_0= '+' )
                    // InternalXdiagramDsl.g:1343:6: lv_styled_15_0= '+'
                    {
                    lv_styled_15_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_15_0, grammarAccess.getLinkAccess().getStyledPlusSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:1355:4: ( (otherlv_16= RULE_ID ) )
                    // InternalXdiagramDsl.g:1356:5: (otherlv_16= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:1356:5: (otherlv_16= RULE_ID )
                    // InternalXdiagramDsl.g:1357:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_16, grammarAccess.getLinkAccess().getStyleStyleCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_29); 

            			newLeafNode(otherlv_17, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXdiagramDsl.g:1373:3: ( (lv_features_18_0= ruleLinkFeature ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==57||LA22_0==80||LA22_0==82) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1374:4: (lv_features_18_0= ruleLinkFeature )
            	    {
            	    // InternalXdiagramDsl.g:1374:4: (lv_features_18_0= ruleLinkFeature )
            	    // InternalXdiagramDsl.g:1375:5: lv_features_18_0= ruleLinkFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getFeaturesLinkFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop22;
                }
            } while (true);

            // InternalXdiagramDsl.g:1392:3: ( (lv_decorators_19_0= ruleDecorator ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1393:4: (lv_decorators_19_0= ruleDecorator )
            	    {
            	    // InternalXdiagramDsl.g:1393:4: (lv_decorators_19_0= ruleDecorator )
            	    // InternalXdiagramDsl.g:1394:5: lv_decorators_19_0= ruleDecorator
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getDecoratorsDecoratorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop23;
                }
            } while (true);

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:1419:1: entryRuleLinkFeature returns [EObject current=null] : iv_ruleLinkFeature= ruleLinkFeature EOF ;
    public final EObject entryRuleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkFeature = null;


        try {
            // InternalXdiagramDsl.g:1419:52: (iv_ruleLinkFeature= ruleLinkFeature EOF )
            // InternalXdiagramDsl.g:1420:2: iv_ruleLinkFeature= ruleLinkFeature EOF
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
    // InternalXdiagramDsl.g:1426:1: ruleLinkFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) ;
    public final EObject ruleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_LineStyle_1 = null;

        EObject this_LineWidth_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1432:2: ( (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) )
            // InternalXdiagramDsl.g:1433:2: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            {
            // InternalXdiagramDsl.g:1433:2: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt24=1;
                }
                break;
            case 80:
                {
                alt24=2;
                }
                break;
            case 82:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalXdiagramDsl.g:1434:3: this_Foreground_0= ruleForeground
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
                    // InternalXdiagramDsl.g:1443:3: this_LineStyle_1= ruleLineStyle
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
                    // InternalXdiagramDsl.g:1452:3: this_LineWidth_2= ruleLineWidth
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
    // InternalXdiagramDsl.g:1464:1: entryRuleDecorator returns [EObject current=null] : iv_ruleDecorator= ruleDecorator EOF ;
    public final EObject entryRuleDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorator = null;


        try {
            // InternalXdiagramDsl.g:1464:50: (iv_ruleDecorator= ruleDecorator EOF )
            // InternalXdiagramDsl.g:1465:2: iv_ruleDecorator= ruleDecorator EOF
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
    // InternalXdiagramDsl.g:1471:1: ruleDecorator returns [EObject current=null] : (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) ;
    public final EObject ruleDecorator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_position_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1477:2: ( (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) )
            // InternalXdiagramDsl.g:1478:2: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            {
            // InternalXdiagramDsl.g:1478:2: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            // InternalXdiagramDsl.g:1479:3: otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getDecoratorAccess().getDecoratorKeyword_0());
            		
            // InternalXdiagramDsl.g:1483:3: ( (lv_position_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1484:4: (lv_position_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1484:4: (lv_position_1_0= RULE_INT )
            // InternalXdiagramDsl.g:1485:5: lv_position_1_0= RULE_INT
            {
            lv_position_1_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDecoratorAccess().getPercentSignKeyword_2());
            		
            // InternalXdiagramDsl.g:1505:3: ( (lv_element_3_0= ruleDecoratorElement ) )
            // InternalXdiagramDsl.g:1506:4: (lv_element_3_0= ruleDecoratorElement )
            {
            // InternalXdiagramDsl.g:1506:4: (lv_element_3_0= ruleDecoratorElement )
            // InternalXdiagramDsl.g:1507:5: lv_element_3_0= ruleDecoratorElement
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
    // InternalXdiagramDsl.g:1528:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // InternalXdiagramDsl.g:1528:47: (iv_ruleAnchor= ruleAnchor EOF )
            // InternalXdiagramDsl.g:1529:2: iv_ruleAnchor= ruleAnchor EOF
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
    // InternalXdiagramDsl.g:1535:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalXdiagramDsl.g:1541:2: ( (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:1542:2: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:1542:2: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:1543:3: otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAnchorKeyword_0());
            		
            // InternalXdiagramDsl.g:1547:3: ( (lv_direction_1_0= ruleAnchorDirection ) )
            // InternalXdiagramDsl.g:1548:4: (lv_direction_1_0= ruleAnchorDirection )
            {
            // InternalXdiagramDsl.g:1548:4: (lv_direction_1_0= ruleAnchorDirection )
            // InternalXdiagramDsl.g:1549:5: lv_direction_1_0= ruleAnchorDirection
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

            // InternalXdiagramDsl.g:1566:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:1567:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:1567:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:1568:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnchorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAnchorAccess().getModelReferenceEReferenceCrossReference_2_0());
            				
            pushFollow(FOLLOW_35);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:1582:3: (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXdiagramDsl.g:1583:4: otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnchorAccess().getMaxKeyword_3_0());
                    			
                    // InternalXdiagramDsl.g:1587:4: ( (lv_max_4_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:1588:5: (lv_max_4_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:1588:5: (lv_max_4_0= RULE_INT )
                    // InternalXdiagramDsl.g:1589:6: lv_max_4_0= RULE_INT
                    {
                    lv_max_4_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            // InternalXdiagramDsl.g:1606:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXdiagramDsl.g:1607:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:1607:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:1608:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getAnchorAccess().getConditionalFeatureConditionalParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:1633:1: entryRuleCustomColor returns [EObject current=null] : iv_ruleCustomColor= ruleCustomColor EOF ;
    public final EObject entryRuleCustomColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomColor = null;


        try {
            // InternalXdiagramDsl.g:1633:52: (iv_ruleCustomColor= ruleCustomColor EOF )
            // InternalXdiagramDsl.g:1634:2: iv_ruleCustomColor= ruleCustomColor EOF
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
    // InternalXdiagramDsl.g:1640:1: ruleCustomColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) ;
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
            // InternalXdiagramDsl.g:1646:2: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) )
            // InternalXdiagramDsl.g:1647:2: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            {
            // InternalXdiagramDsl.g:1647:2: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            // InternalXdiagramDsl.g:1648:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomColorAccess().getColorKeyword_0());
            		
            // InternalXdiagramDsl.g:1652:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:1653:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:1653:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:1654:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            // InternalXdiagramDsl.g:1670:3: ( (lv_R_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1671:4: (lv_R_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1671:4: (lv_R_2_0= RULE_INT )
            // InternalXdiagramDsl.g:1672:5: lv_R_2_0= RULE_INT
            {
            lv_R_2_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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

            // InternalXdiagramDsl.g:1688:3: ( (lv_G_3_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1689:4: (lv_G_3_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1689:4: (lv_G_3_0= RULE_INT )
            // InternalXdiagramDsl.g:1690:5: lv_G_3_0= RULE_INT
            {
            lv_G_3_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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

            // InternalXdiagramDsl.g:1706:3: ( (lv_B_4_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1707:4: (lv_B_4_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1707:4: (lv_B_4_0= RULE_INT )
            // InternalXdiagramDsl.g:1708:5: lv_B_4_0= RULE_INT
            {
            lv_B_4_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:1732:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXdiagramDsl.g:1732:46: (iv_ruleColor= ruleColor EOF )
            // InternalXdiagramDsl.g:1733:2: iv_ruleColor= ruleColor EOF
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
    // InternalXdiagramDsl.g:1739:1: ruleColor returns [EObject current=null] : ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_default_0_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1745:2: ( ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalXdiagramDsl.g:1746:2: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalXdiagramDsl.g:1746:2: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=85 && LA27_0<=100)) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalXdiagramDsl.g:1747:3: ( (lv_default_0_0= ruleDefaultColor ) )
                    {
                    // InternalXdiagramDsl.g:1747:3: ( (lv_default_0_0= ruleDefaultColor ) )
                    // InternalXdiagramDsl.g:1748:4: (lv_default_0_0= ruleDefaultColor )
                    {
                    // InternalXdiagramDsl.g:1748:4: (lv_default_0_0= ruleDefaultColor )
                    // InternalXdiagramDsl.g:1749:5: lv_default_0_0= ruleDefaultColor
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
                    // InternalXdiagramDsl.g:1767:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:1767:3: ( (otherlv_1= RULE_ID ) )
                    // InternalXdiagramDsl.g:1768:4: (otherlv_1= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:1768:4: (otherlv_1= RULE_ID )
                    // InternalXdiagramDsl.g:1769:5: otherlv_1= RULE_ID
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
    // InternalXdiagramDsl.g:1784:1: entryRuleConnectableElement returns [EObject current=null] : iv_ruleConnectableElement= ruleConnectableElement EOF ;
    public final EObject entryRuleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElement = null;


        try {
            // InternalXdiagramDsl.g:1784:59: (iv_ruleConnectableElement= ruleConnectableElement EOF )
            // InternalXdiagramDsl.g:1785:2: iv_ruleConnectableElement= ruleConnectableElement EOF
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
    // InternalXdiagramDsl.g:1791:1: ruleConnectableElement returns [EObject current=null] : (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) ;
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
            // InternalXdiagramDsl.g:1797:2: ( (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) )
            // InternalXdiagramDsl.g:1798:2: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            {
            // InternalXdiagramDsl.g:1798:2: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            int alt28=9;
            switch ( input.LA(1) ) {
            case 41:
            case 42:
                {
                alt28=1;
                }
                break;
            case 43:
                {
                alt28=2;
                }
                break;
            case 44:
            case 45:
                {
                alt28=3;
                }
                break;
            case 46:
            case 47:
                {
                alt28=4;
                }
                break;
            case 54:
                {
                alt28=5;
                }
                break;
            case 55:
                {
                alt28=6;
                }
                break;
            case 56:
                {
                alt28=7;
                }
                break;
            case 38:
                {
                alt28=8;
                }
                break;
            case 48:
                {
                alt28=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalXdiagramDsl.g:1799:3: this_Rectangle_0= ruleRectangle
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
                    // InternalXdiagramDsl.g:1808:3: this_Rhombus_1= ruleRhombus
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
                    // InternalXdiagramDsl.g:1817:3: this_Ellipse_2= ruleEllipse
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
                    // InternalXdiagramDsl.g:1826:3: this_Polyline_3= rulePolyline
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
                    // InternalXdiagramDsl.g:1835:3: this_Label_4= ruleLabel
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
                    // InternalXdiagramDsl.g:1844:3: this_Image_5= ruleImage
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
                    // InternalXdiagramDsl.g:1853:3: this_Invisible_6= ruleInvisible
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
                    // InternalXdiagramDsl.g:1862:3: this_Custom_7= ruleCustom
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
                    // InternalXdiagramDsl.g:1871:3: this_Triangle_8= ruleTriangle
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
    // InternalXdiagramDsl.g:1883:1: entryRuleDecoratorElement returns [EObject current=null] : iv_ruleDecoratorElement= ruleDecoratorElement EOF ;
    public final EObject entryRuleDecoratorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoratorElement = null;


        try {
            // InternalXdiagramDsl.g:1883:57: (iv_ruleDecoratorElement= ruleDecoratorElement EOF )
            // InternalXdiagramDsl.g:1884:2: iv_ruleDecoratorElement= ruleDecoratorElement EOF
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
    // InternalXdiagramDsl.g:1890:1: ruleDecoratorElement returns [EObject current=null] : (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) ;
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
            // InternalXdiagramDsl.g:1896:2: ( (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) )
            // InternalXdiagramDsl.g:1897:2: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            {
            // InternalXdiagramDsl.g:1897:2: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            int alt29=8;
            switch ( input.LA(1) ) {
            case 44:
            case 45:
                {
                alt29=1;
                }
                break;
            case 43:
                {
                alt29=2;
                }
                break;
            case 46:
            case 47:
                {
                alt29=3;
                }
                break;
            case 48:
                {
                alt29=4;
                }
                break;
            case 54:
                {
                alt29=5;
                }
                break;
            case 55:
                {
                alt29=6;
                }
                break;
            case 51:
                {
                alt29=7;
                }
                break;
            case 49:
            case 50:
                {
                alt29=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalXdiagramDsl.g:1898:3: this_Ellipse_0= ruleEllipse
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
                    // InternalXdiagramDsl.g:1907:3: this_Rhombus_1= ruleRhombus
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
                    // InternalXdiagramDsl.g:1916:3: this_Polyline_2= rulePolyline
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
                    // InternalXdiagramDsl.g:1925:3: this_Triangle_3= ruleTriangle
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
                    // InternalXdiagramDsl.g:1934:3: this_Label_4= ruleLabel
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
                    // InternalXdiagramDsl.g:1943:3: this_Image_5= ruleImage
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
                    // InternalXdiagramDsl.g:1952:3: this_Arrow_6= ruleArrow
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
                    // InternalXdiagramDsl.g:1961:3: this_Line_7= ruleLine
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
    // InternalXdiagramDsl.g:1973:1: entryRuleConnectableElementFeature returns [EObject current=null] : iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF ;
    public final EObject entryRuleConnectableElementFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElementFeature = null;


        try {
            // InternalXdiagramDsl.g:1973:66: (iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF )
            // InternalXdiagramDsl.g:1974:2: iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF
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
    // InternalXdiagramDsl.g:1980:1: ruleConnectableElementFeature returns [EObject current=null] : (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) ;
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
            // InternalXdiagramDsl.g:1986:2: ( (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) )
            // InternalXdiagramDsl.g:1987:2: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            {
            // InternalXdiagramDsl.g:1987:2: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            int alt30=10;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt30=1;
                }
                break;
            case 60:
                {
                alt30=2;
                }
                break;
            case 57:
            case 58:
                {
                alt30=3;
                }
                break;
            case 59:
                {
                alt30=4;
                }
                break;
            case 80:
                {
                alt30=5;
                }
                break;
            case 82:
                {
                alt30=6;
                }
                break;
            case 52:
                {
                alt30=7;
                }
                break;
            case 35:
                {
                alt30=8;
                }
                break;
            case 66:
                {
                alt30=9;
                }
                break;
            case 56:
                {
                alt30=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalXdiagramDsl.g:1988:3: this_Position_0= rulePosition
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
                    // InternalXdiagramDsl.g:1997:3: this_Size_1= ruleSize
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
                    // InternalXdiagramDsl.g:2006:3: this_ColorFeature_2= ruleColorFeature
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
                    // InternalXdiagramDsl.g:2015:3: this_Transparency_3= ruleTransparency
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
                    // InternalXdiagramDsl.g:2024:3: this_LineStyle_4= ruleLineStyle
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
                    // InternalXdiagramDsl.g:2033:3: this_LineWidth_5= ruleLineWidth
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
                    // InternalXdiagramDsl.g:2042:3: this_Contains_6= ruleContains
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
                    // InternalXdiagramDsl.g:2051:3: this_Anchor_7= ruleAnchor
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
                    // InternalXdiagramDsl.g:2060:3: this_Layout_8= ruleLayout
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
                    // InternalXdiagramDsl.g:2069:3: this_Visible_9= ruleVisible
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
    // InternalXdiagramDsl.g:2081:1: entryRuleCustomFigure returns [EObject current=null] : iv_ruleCustomFigure= ruleCustomFigure EOF ;
    public final EObject entryRuleCustomFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFigure = null;


        try {
            // InternalXdiagramDsl.g:2081:53: (iv_ruleCustomFigure= ruleCustomFigure EOF )
            // InternalXdiagramDsl.g:2082:2: iv_ruleCustomFigure= ruleCustomFigure EOF
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
    // InternalXdiagramDsl.g:2088:1: ruleCustomFigure returns [EObject current=null] : (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleCustomFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2094:2: ( (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) )
            // InternalXdiagramDsl.g:2095:2: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            {
            // InternalXdiagramDsl.g:2095:2: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            // InternalXdiagramDsl.g:2096:3: otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomFigureAccess().getFigureKeyword_0());
            		
            // InternalXdiagramDsl.g:2100:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:2101:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:2101:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:2102:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomFigureAccess().getAsKeyword_2());
            		
            // InternalXdiagramDsl.g:2122:3: ( (lv_element_3_0= ruleConnectableElement ) )
            // InternalXdiagramDsl.g:2123:4: (lv_element_3_0= ruleConnectableElement )
            {
            // InternalXdiagramDsl.g:2123:4: (lv_element_3_0= ruleConnectableElement )
            // InternalXdiagramDsl.g:2124:5: lv_element_3_0= ruleConnectableElement
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
    // InternalXdiagramDsl.g:2145:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalXdiagramDsl.g:2145:47: (iv_ruleCustom= ruleCustom EOF )
            // InternalXdiagramDsl.g:2146:2: iv_ruleCustom= ruleCustom EOF
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
    // InternalXdiagramDsl.g:2152:1: ruleCustom returns [EObject current=null] : (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalXdiagramDsl.g:2158:2: ( (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2159:2: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2159:2: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2160:3: otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomAccess().getFigureKeyword_0());
            		
            // InternalXdiagramDsl.g:2164:3: ( (otherlv_1= RULE_ID ) )
            // InternalXdiagramDsl.g:2165:4: (otherlv_1= RULE_ID )
            {
            // InternalXdiagramDsl.g:2165:4: (otherlv_1= RULE_ID )
            // InternalXdiagramDsl.g:2166:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getFigureCustomFigureCrossReference_1_0());
            				

            }


            }

            // InternalXdiagramDsl.g:2177:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXdiagramDsl.g:2178:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2178:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2179:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2179:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2180:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getCustomAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2192:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2193:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2193:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2194:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:2210:3: ( (lv_features_5_0= ruleLinkedFeature ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35||LA32_0==52) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2211:4: (lv_features_5_0= ruleLinkedFeature )
            	    {
            	    // InternalXdiagramDsl.g:2211:4: (lv_features_5_0= ruleLinkedFeature )
            	    // InternalXdiagramDsl.g:2212:5: lv_features_5_0= ruleLinkedFeature
            	    {

            	    					newCompositeNode(grammarAccess.getCustomAccess().getFeaturesLinkedFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
            	    break loop32;
                }
            } while (true);

            // InternalXdiagramDsl.g:2229:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==40) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2230:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:2234:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2235:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2235:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2236:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getCustomAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop33;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:2262:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalXdiagramDsl.g:2262:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalXdiagramDsl.g:2263:2: iv_ruleRectangle= ruleRectangle EOF
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
    // InternalXdiagramDsl.g:2269:1: ruleRectangle returns [EObject current=null] : ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalXdiagramDsl.g:2275:2: ( ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2276:2: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2276:2: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2277:3: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:2277:3: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            else if ( (LA34_0==42) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalXdiagramDsl.g:2278:4: ( (lv_rectangle_0_0= 'rectangle' ) )
                    {
                    // InternalXdiagramDsl.g:2278:4: ( (lv_rectangle_0_0= 'rectangle' ) )
                    // InternalXdiagramDsl.g:2279:5: (lv_rectangle_0_0= 'rectangle' )
                    {
                    // InternalXdiagramDsl.g:2279:5: (lv_rectangle_0_0= 'rectangle' )
                    // InternalXdiagramDsl.g:2280:6: lv_rectangle_0_0= 'rectangle'
                    {
                    lv_rectangle_0_0=(Token)match(input,41,FOLLOW_15); 

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
                    // InternalXdiagramDsl.g:2293:4: ( (lv_square_1_0= 'square' ) )
                    {
                    // InternalXdiagramDsl.g:2293:4: ( (lv_square_1_0= 'square' ) )
                    // InternalXdiagramDsl.g:2294:5: (lv_square_1_0= 'square' )
                    {
                    // InternalXdiagramDsl.g:2294:5: (lv_square_1_0= 'square' )
                    // InternalXdiagramDsl.g:2295:6: lv_square_1_0= 'square'
                    {
                    lv_square_1_0=(Token)match(input,42,FOLLOW_15); 

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

            // InternalXdiagramDsl.g:2308:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXdiagramDsl.g:2309:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2309:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2310:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2310:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2311:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getRectangleAccess().getStyledPlusSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRectangleRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2323:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2324:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2324:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2325:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRectangleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getStyleStyleCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2341:3: ( (lv_features_5_0= ruleRectangleFeature ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==35||LA36_0==52||(LA36_0>=56 && LA36_0<=60)||(LA36_0>=64 && LA36_0<=66)||LA36_0==80||LA36_0==82) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2342:4: (lv_features_5_0= ruleRectangleFeature )
            	    {
            	    // InternalXdiagramDsl.g:2342:4: (lv_features_5_0= ruleRectangleFeature )
            	    // InternalXdiagramDsl.g:2343:5: lv_features_5_0= ruleRectangleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getRectangleAccess().getFeaturesRectangleFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop36;
                }
            } while (true);

            // InternalXdiagramDsl.g:2360:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==40) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2361:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRectangleAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:2365:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2366:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2366:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2367:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getRectangleAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop37;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:2393:1: entryRuleRectangleFeature returns [EObject current=null] : iv_ruleRectangleFeature= ruleRectangleFeature EOF ;
    public final EObject entryRuleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleFeature = null;


        try {
            // InternalXdiagramDsl.g:2393:57: (iv_ruleRectangleFeature= ruleRectangleFeature EOF )
            // InternalXdiagramDsl.g:2394:2: iv_ruleRectangleFeature= ruleRectangleFeature EOF
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
    // InternalXdiagramDsl.g:2400:1: ruleRectangleFeature returns [EObject current=null] : (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) ;
    public final EObject ruleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElementFeature_0 = null;

        EObject this_Corner_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2406:2: ( (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) )
            // InternalXdiagramDsl.g:2407:2: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            {
            // InternalXdiagramDsl.g:2407:2: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35||LA38_0==52||(LA38_0>=56 && LA38_0<=60)||LA38_0==64||LA38_0==66||LA38_0==80||LA38_0==82) ) {
                alt38=1;
            }
            else if ( (LA38_0==65) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalXdiagramDsl.g:2408:3: this_ConnectableElementFeature_0= ruleConnectableElementFeature
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
                    // InternalXdiagramDsl.g:2417:3: this_Corner_1= ruleCorner
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
    // InternalXdiagramDsl.g:2429:1: entryRuleRhombus returns [EObject current=null] : iv_ruleRhombus= ruleRhombus EOF ;
    public final EObject entryRuleRhombus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhombus = null;


        try {
            // InternalXdiagramDsl.g:2429:48: (iv_ruleRhombus= ruleRhombus EOF )
            // InternalXdiagramDsl.g:2430:2: iv_ruleRhombus= ruleRhombus EOF
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
    // InternalXdiagramDsl.g:2436:1: ruleRhombus returns [EObject current=null] : ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalXdiagramDsl.g:2442:2: ( ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2443:2: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2443:2: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2444:3: () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:2444:3: ()
            // InternalXdiagramDsl.g:2445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRhombusAccess().getRhombusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getRhombusAccess().getRhombusKeyword_1());
            		
            // InternalXdiagramDsl.g:2455:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXdiagramDsl.g:2456:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2456:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2457:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2457:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2458:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getRhombusAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRhombusRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2470:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2471:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2471:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2472:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRhombusRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getRhombusAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getRhombusAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:2488:3: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==35||LA40_0==52||(LA40_0>=56 && LA40_0<=60)||LA40_0==64||LA40_0==66||LA40_0==80||LA40_0==82) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2489:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2489:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2490:5: lv_features_5_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getRhombusAccess().getFeaturesConnectableElementFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop40;
                }
            } while (true);

            // InternalXdiagramDsl.g:2507:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==40) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2508:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRhombusAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:2512:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2513:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2513:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2514:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getRhombusAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop41;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:2540:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // InternalXdiagramDsl.g:2540:48: (iv_ruleEllipse= ruleEllipse EOF )
            // InternalXdiagramDsl.g:2541:2: iv_ruleEllipse= ruleEllipse EOF
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
    // InternalXdiagramDsl.g:2547:1: ruleEllipse returns [EObject current=null] : ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalXdiagramDsl.g:2553:2: ( ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2554:2: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2554:2: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2555:3: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:2555:3: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            else if ( (LA42_0==45) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalXdiagramDsl.g:2556:4: ( (lv_ellipse_0_0= 'ellipse' ) )
                    {
                    // InternalXdiagramDsl.g:2556:4: ( (lv_ellipse_0_0= 'ellipse' ) )
                    // InternalXdiagramDsl.g:2557:5: (lv_ellipse_0_0= 'ellipse' )
                    {
                    // InternalXdiagramDsl.g:2557:5: (lv_ellipse_0_0= 'ellipse' )
                    // InternalXdiagramDsl.g:2558:6: lv_ellipse_0_0= 'ellipse'
                    {
                    lv_ellipse_0_0=(Token)match(input,44,FOLLOW_15); 

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
                    // InternalXdiagramDsl.g:2571:4: ( (lv_circle_1_0= 'circle' ) )
                    {
                    // InternalXdiagramDsl.g:2571:4: ( (lv_circle_1_0= 'circle' ) )
                    // InternalXdiagramDsl.g:2572:5: (lv_circle_1_0= 'circle' )
                    {
                    // InternalXdiagramDsl.g:2572:5: (lv_circle_1_0= 'circle' )
                    // InternalXdiagramDsl.g:2573:6: lv_circle_1_0= 'circle'
                    {
                    lv_circle_1_0=(Token)match(input,45,FOLLOW_15); 

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

            // InternalXdiagramDsl.g:2586:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==22) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXdiagramDsl.g:2587:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2587:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2588:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2588:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2589:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getEllipseAccess().getStyledPlusSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEllipseRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2601:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2602:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2602:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2603:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEllipseRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getEllipseAccess().getStyleStyleCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2619:3: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==35||LA44_0==52||(LA44_0>=56 && LA44_0<=60)||LA44_0==64||LA44_0==66||LA44_0==80||LA44_0==82) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2620:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2620:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2621:5: lv_features_5_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEllipseAccess().getFeaturesConnectableElementFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop44;
                }
            } while (true);

            // InternalXdiagramDsl.g:2638:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==40) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2639:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEllipseAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:2643:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2644:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2644:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2645:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getEllipseAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop45;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:2671:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // InternalXdiagramDsl.g:2671:49: (iv_rulePolyline= rulePolyline EOF )
            // InternalXdiagramDsl.g:2672:2: iv_rulePolyline= rulePolyline EOF
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
    // InternalXdiagramDsl.g:2678:1: rulePolyline returns [EObject current=null] : ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' ) ;
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
            // InternalXdiagramDsl.g:2684:2: ( ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' ) )
            // InternalXdiagramDsl.g:2685:2: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' )
            {
            // InternalXdiagramDsl.g:2685:2: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' )
            // InternalXdiagramDsl.g:2686:3: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}'
            {
            // InternalXdiagramDsl.g:2686:3: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            else if ( (LA46_0==47) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalXdiagramDsl.g:2687:4: ( (lv_polygon_0_0= 'polygon' ) )
                    {
                    // InternalXdiagramDsl.g:2687:4: ( (lv_polygon_0_0= 'polygon' ) )
                    // InternalXdiagramDsl.g:2688:5: (lv_polygon_0_0= 'polygon' )
                    {
                    // InternalXdiagramDsl.g:2688:5: (lv_polygon_0_0= 'polygon' )
                    // InternalXdiagramDsl.g:2689:6: lv_polygon_0_0= 'polygon'
                    {
                    lv_polygon_0_0=(Token)match(input,46,FOLLOW_15); 

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
                    // InternalXdiagramDsl.g:2702:4: ( (lv_polyline_1_0= 'polyline' ) )
                    {
                    // InternalXdiagramDsl.g:2702:4: ( (lv_polyline_1_0= 'polyline' ) )
                    // InternalXdiagramDsl.g:2703:5: (lv_polyline_1_0= 'polyline' )
                    {
                    // InternalXdiagramDsl.g:2703:5: (lv_polyline_1_0= 'polyline' )
                    // InternalXdiagramDsl.g:2704:6: lv_polyline_1_0= 'polyline'
                    {
                    lv_polyline_1_0=(Token)match(input,47,FOLLOW_15); 

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

            // InternalXdiagramDsl.g:2717:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==22) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXdiagramDsl.g:2718:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2718:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2719:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2719:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2720:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getPolylineAccess().getStyledPlusSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPolylineRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2732:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2733:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2733:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2734:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPolylineRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getPolylineAccess().getStyleStyleCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getPolylineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2750:3: ( (lv_features_5_0= rulePoint ) )
            // InternalXdiagramDsl.g:2751:4: (lv_features_5_0= rulePoint )
            {
            // InternalXdiagramDsl.g:2751:4: (lv_features_5_0= rulePoint )
            // InternalXdiagramDsl.g:2752:5: lv_features_5_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalXdiagramDsl.g:2769:3: ( (lv_features_6_0= rulePoint ) )
            // InternalXdiagramDsl.g:2770:4: (lv_features_6_0= rulePoint )
            {
            // InternalXdiagramDsl.g:2770:4: (lv_features_6_0= rulePoint )
            // InternalXdiagramDsl.g:2771:5: lv_features_6_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalXdiagramDsl.g:2788:3: ( (lv_features_7_0= rulePoint ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==63) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2789:4: (lv_features_7_0= rulePoint )
            	    {
            	    // InternalXdiagramDsl.g:2789:4: (lv_features_7_0= rulePoint )
            	    // InternalXdiagramDsl.g:2790:5: lv_features_7_0= rulePoint
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop48;
                }
            } while (true);

            // InternalXdiagramDsl.g:2807:3: ( (lv_features_8_0= ruleConnectableElementFeature ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==35||LA49_0==52||(LA49_0>=56 && LA49_0<=60)||LA49_0==64||LA49_0==66||LA49_0==80||LA49_0==82) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2808:4: (lv_features_8_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2808:4: (lv_features_8_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2809:5: lv_features_8_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesConnectableElementFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop49;
                }
            } while (true);

            // InternalXdiagramDsl.g:2826:3: (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==40) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2827:4: otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) )
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_9, grammarAccess.getPolylineAccess().getChildKeyword_7_0());
            	    			
            	    // InternalXdiagramDsl.g:2831:4: ( (lv_children_10_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2832:5: (lv_children_10_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2832:5: (lv_children_10_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2833:6: lv_children_10_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getPolylineAccess().getChildrenChildElementParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop50;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:2859:1: entryRuleTriangle returns [EObject current=null] : iv_ruleTriangle= ruleTriangle EOF ;
    public final EObject entryRuleTriangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriangle = null;


        try {
            // InternalXdiagramDsl.g:2859:49: (iv_ruleTriangle= ruleTriangle EOF )
            // InternalXdiagramDsl.g:2860:2: iv_ruleTriangle= ruleTriangle EOF
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
    // InternalXdiagramDsl.g:2866:1: ruleTriangle returns [EObject current=null] : ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalXdiagramDsl.g:2872:2: ( ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:2873:2: ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:2873:2: ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:2874:3: () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:2874:3: ()
            // InternalXdiagramDsl.g:2875:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriangleAccess().getTriangleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getTriangleAccess().getTriangleKeyword_1());
            		
            // InternalXdiagramDsl.g:2885:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==22) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXdiagramDsl.g:2886:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:2886:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:2887:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:2887:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:2888:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getTriangleAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriangleRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:2900:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:2901:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:2901:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:2902:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriangleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getTriangleAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getTriangleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:2918:3: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==35||LA52_0==52||(LA52_0>=56 && LA52_0<=60)||LA52_0==64||LA52_0==66||LA52_0==80||LA52_0==82) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2919:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2919:4: (lv_features_5_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2920:5: lv_features_5_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getTriangleAccess().getFeaturesConnectableElementFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop52;
                }
            } while (true);

            // InternalXdiagramDsl.g:2937:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==40) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2938:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTriangleAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:2942:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2943:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2943:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2944:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getTriangleAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop53;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:2970:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalXdiagramDsl.g:2970:45: (iv_ruleLine= ruleLine EOF )
            // InternalXdiagramDsl.g:2971:2: iv_ruleLine= ruleLine EOF
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
    // InternalXdiagramDsl.g:2977:1: ruleLine returns [EObject current=null] : ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' ) ;
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
            // InternalXdiagramDsl.g:2983:2: ( ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' ) )
            // InternalXdiagramDsl.g:2984:2: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' )
            {
            // InternalXdiagramDsl.g:2984:2: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' )
            // InternalXdiagramDsl.g:2985:3: () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}'
            {
            // InternalXdiagramDsl.g:2985:3: ()
            // InternalXdiagramDsl.g:2986:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineAccess().getLineAction_0(),
            					current);
            			

            }

            // InternalXdiagramDsl.g:2992:3: ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            else if ( (LA54_0==50) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalXdiagramDsl.g:2993:4: ( (lv_horizontal_1_0= 'hline' ) )
                    {
                    // InternalXdiagramDsl.g:2993:4: ( (lv_horizontal_1_0= 'hline' ) )
                    // InternalXdiagramDsl.g:2994:5: (lv_horizontal_1_0= 'hline' )
                    {
                    // InternalXdiagramDsl.g:2994:5: (lv_horizontal_1_0= 'hline' )
                    // InternalXdiagramDsl.g:2995:6: lv_horizontal_1_0= 'hline'
                    {
                    lv_horizontal_1_0=(Token)match(input,49,FOLLOW_15); 

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
                    // InternalXdiagramDsl.g:3008:4: ( (lv_vertical_2_0= 'vline' ) )
                    {
                    // InternalXdiagramDsl.g:3008:4: ( (lv_vertical_2_0= 'vline' ) )
                    // InternalXdiagramDsl.g:3009:5: (lv_vertical_2_0= 'vline' )
                    {
                    // InternalXdiagramDsl.g:3009:5: (lv_vertical_2_0= 'vline' )
                    // InternalXdiagramDsl.g:3010:6: lv_vertical_2_0= 'vline'
                    {
                    lv_vertical_2_0=(Token)match(input,50,FOLLOW_15); 

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

            // InternalXdiagramDsl.g:3023:3: ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==22) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXdiagramDsl.g:3024:4: ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:3024:4: ( (lv_styled_3_0= '+' ) )
                    // InternalXdiagramDsl.g:3025:5: (lv_styled_3_0= '+' )
                    {
                    // InternalXdiagramDsl.g:3025:5: (lv_styled_3_0= '+' )
                    // InternalXdiagramDsl.g:3026:6: lv_styled_3_0= '+'
                    {
                    lv_styled_3_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_3_0, grammarAccess.getLineAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:3038:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXdiagramDsl.g:3039:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:3039:5: (otherlv_4= RULE_ID )
                    // InternalXdiagramDsl.g:3040:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_4, grammarAccess.getLineAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:3056:3: ( (lv_features_6_0= ruleLineFeature ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=56 && LA56_0<=57)||LA56_0==60||LA56_0==64||LA56_0==80||LA56_0==82) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3057:4: (lv_features_6_0= ruleLineFeature )
            	    {
            	    // InternalXdiagramDsl.g:3057:4: (lv_features_6_0= ruleLineFeature )
            	    // InternalXdiagramDsl.g:3058:5: lv_features_6_0= ruleLineFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLineAccess().getFeaturesLineFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop56;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3083:1: entryRuleLineFeature returns [EObject current=null] : iv_ruleLineFeature= ruleLineFeature EOF ;
    public final EObject entryRuleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineFeature = null;


        try {
            // InternalXdiagramDsl.g:3083:52: (iv_ruleLineFeature= ruleLineFeature EOF )
            // InternalXdiagramDsl.g:3084:2: iv_ruleLineFeature= ruleLineFeature EOF
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
    // InternalXdiagramDsl.g:3090:1: ruleLineFeature returns [EObject current=null] : (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) ;
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
            // InternalXdiagramDsl.g:3096:2: ( (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) )
            // InternalXdiagramDsl.g:3097:2: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            {
            // InternalXdiagramDsl.g:3097:2: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            int alt57=6;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt57=1;
                }
                break;
            case 80:
                {
                alt57=2;
                }
                break;
            case 57:
                {
                alt57=3;
                }
                break;
            case 64:
                {
                alt57=4;
                }
                break;
            case 60:
                {
                alt57=5;
                }
                break;
            case 56:
                {
                alt57=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalXdiagramDsl.g:3098:3: this_LineWidth_0= ruleLineWidth
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
                    // InternalXdiagramDsl.g:3107:3: this_LineStyle_1= ruleLineStyle
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
                    // InternalXdiagramDsl.g:3116:3: this_Foreground_2= ruleForeground
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
                    // InternalXdiagramDsl.g:3125:3: this_Position_3= rulePosition
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
                    // InternalXdiagramDsl.g:3134:3: this_Size_4= ruleSize
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
                    // InternalXdiagramDsl.g:3143:3: this_Visible_5= ruleVisible
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
    // InternalXdiagramDsl.g:3155:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalXdiagramDsl.g:3155:46: (iv_ruleArrow= ruleArrow EOF )
            // InternalXdiagramDsl.g:3156:2: iv_ruleArrow= ruleArrow EOF
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
    // InternalXdiagramDsl.g:3162:1: ruleArrow returns [EObject current=null] : ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:3168:2: ( ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:3169:2: ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:3169:2: ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:3170:3: () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:3170:3: ()
            // InternalXdiagramDsl.g:3171:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrowAccess().getArrowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getArrowAccess().getArrowKeyword_1());
            		
            // InternalXdiagramDsl.g:3181:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==22) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalXdiagramDsl.g:3182:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:3182:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:3183:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:3183:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:3184:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getArrowAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrowRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:3196:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:3197:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:3197:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:3198:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrowRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getArrowAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getArrowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:3214:3: ( (lv_features_5_0= ruleLineFeature ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=56 && LA59_0<=57)||LA59_0==60||LA59_0==64||LA59_0==80||LA59_0==82) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3215:4: (lv_features_5_0= ruleLineFeature )
            	    {
            	    // InternalXdiagramDsl.g:3215:4: (lv_features_5_0= ruleLineFeature )
            	    // InternalXdiagramDsl.g:3216:5: lv_features_5_0= ruleLineFeature
            	    {

            	    					newCompositeNode(grammarAccess.getArrowAccess().getFeaturesLineFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop59;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3241:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalXdiagramDsl.g:3241:49: (iv_ruleContains= ruleContains EOF )
            // InternalXdiagramDsl.g:3242:2: iv_ruleContains= ruleContains EOF
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
    // InternalXdiagramDsl.g:3248:1: ruleContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3254:2: ( (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:3255:2: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:3255:2: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:3256:3: otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
            		
            // InternalXdiagramDsl.g:3260:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:3261:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:3261:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:3262:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainsAccess().getModelReferenceEReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_36);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:3276:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==23) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalXdiagramDsl.g:3277:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3277:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3278:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getContainsAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3303:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalXdiagramDsl.g:3303:46: (iv_ruleValue= ruleValue EOF )
            // InternalXdiagramDsl.g:3304:2: iv_ruleValue= ruleValue EOF
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
    // InternalXdiagramDsl.g:3310:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_DoubleValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_EnumValue_4 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3316:2: ( (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) )
            // InternalXdiagramDsl.g:3317:2: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            {
            // InternalXdiagramDsl.g:3317:2: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            int alt61=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==14) ) {
                    alt61=2;
                }
                else if ( (LA61_1==EOF||LA61_1==20) ) {
                    alt61=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 53:
                {
                alt61=3;
                }
                break;
            case 103:
            case 104:
                {
                alt61=4;
                }
                break;
            case RULE_ID:
                {
                alt61=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalXdiagramDsl.g:3318:3: this_IntValue_0= ruleIntValue
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
                    // InternalXdiagramDsl.g:3327:3: this_DoubleValue_1= ruleDoubleValue
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
                    // InternalXdiagramDsl.g:3336:3: this_StringValue_2= ruleStringValue
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
                    // InternalXdiagramDsl.g:3345:3: this_BooleanValue_3= ruleBooleanValue
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
                    // InternalXdiagramDsl.g:3354:3: this_EnumValue_4= ruleEnumValue
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
    // InternalXdiagramDsl.g:3366:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalXdiagramDsl.g:3366:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalXdiagramDsl.g:3367:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalXdiagramDsl.g:3373:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:3379:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalXdiagramDsl.g:3380:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalXdiagramDsl.g:3380:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3381:3: (lv_value_0_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3381:3: (lv_value_0_0= RULE_INT )
            // InternalXdiagramDsl.g:3382:4: lv_value_0_0= RULE_INT
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
    // InternalXdiagramDsl.g:3401:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // InternalXdiagramDsl.g:3401:52: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // InternalXdiagramDsl.g:3402:2: iv_ruleDoubleValue= ruleDoubleValue EOF
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
    // InternalXdiagramDsl.g:3408:1: ruleDoubleValue returns [EObject current=null] : ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueInt_0_0=null;
        Token otherlv_1=null;
        Token lv_valueDecimal_2_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:3414:2: ( ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) )
            // InternalXdiagramDsl.g:3415:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            {
            // InternalXdiagramDsl.g:3415:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            // InternalXdiagramDsl.g:3416:3: ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) )
            {
            // InternalXdiagramDsl.g:3416:3: ( (lv_valueInt_0_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3417:4: (lv_valueInt_0_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3417:4: (lv_valueInt_0_0= RULE_INT )
            // InternalXdiagramDsl.g:3418:5: lv_valueInt_0_0= RULE_INT
            {
            lv_valueInt_0_0=(Token)match(input,RULE_INT,FOLLOW_43); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleValueAccess().getFullStopKeyword_1());
            		
            // InternalXdiagramDsl.g:3438:3: ( (lv_valueDecimal_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3439:4: (lv_valueDecimal_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3439:4: (lv_valueDecimal_2_0= RULE_INT )
            // InternalXdiagramDsl.g:3440:5: lv_valueDecimal_2_0= RULE_INT
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
    // InternalXdiagramDsl.g:3460:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalXdiagramDsl.g:3460:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalXdiagramDsl.g:3461:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalXdiagramDsl.g:3467:1: ruleStringValue returns [EObject current=null] : ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_null_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:3473:2: ( ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalXdiagramDsl.g:3474:2: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalXdiagramDsl.g:3474:2: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==53) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_STRING) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalXdiagramDsl.g:3475:3: ( (lv_null_0_0= 'null' ) )
                    {
                    // InternalXdiagramDsl.g:3475:3: ( (lv_null_0_0= 'null' ) )
                    // InternalXdiagramDsl.g:3476:4: (lv_null_0_0= 'null' )
                    {
                    // InternalXdiagramDsl.g:3476:4: (lv_null_0_0= 'null' )
                    // InternalXdiagramDsl.g:3477:5: lv_null_0_0= 'null'
                    {
                    lv_null_0_0=(Token)match(input,53,FOLLOW_2); 

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
                    // InternalXdiagramDsl.g:3490:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalXdiagramDsl.g:3490:3: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:3491:4: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:3491:4: (lv_value_1_0= RULE_STRING )
                    // InternalXdiagramDsl.g:3492:5: lv_value_1_0= RULE_STRING
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
    // InternalXdiagramDsl.g:3512:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalXdiagramDsl.g:3512:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalXdiagramDsl.g:3513:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalXdiagramDsl.g:3519:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteral ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3525:2: ( ( (lv_value_0_0= ruleBooleanLiteral ) ) )
            // InternalXdiagramDsl.g:3526:2: ( (lv_value_0_0= ruleBooleanLiteral ) )
            {
            // InternalXdiagramDsl.g:3526:2: ( (lv_value_0_0= ruleBooleanLiteral ) )
            // InternalXdiagramDsl.g:3527:3: (lv_value_0_0= ruleBooleanLiteral )
            {
            // InternalXdiagramDsl.g:3527:3: (lv_value_0_0= ruleBooleanLiteral )
            // InternalXdiagramDsl.g:3528:4: lv_value_0_0= ruleBooleanLiteral
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
    // InternalXdiagramDsl.g:3548:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalXdiagramDsl.g:3548:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalXdiagramDsl.g:3549:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalXdiagramDsl.g:3555:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:3561:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalXdiagramDsl.g:3562:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalXdiagramDsl.g:3562:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalXdiagramDsl.g:3563:3: (lv_name_0_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:3563:3: (lv_name_0_0= RULE_ID )
            // InternalXdiagramDsl.g:3564:4: lv_name_0_0= RULE_ID
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
    // InternalXdiagramDsl.g:3583:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalXdiagramDsl.g:3583:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalXdiagramDsl.g:3584:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalXdiagramDsl.g:3590:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalXdiagramDsl.g:3596:2: ( ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:3597:2: ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:3597:2: ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:3598:3: () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:3598:3: ()
            // InternalXdiagramDsl.g:3599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
            		
            // InternalXdiagramDsl.g:3609:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==22) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXdiagramDsl.g:3610:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:3610:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:3611:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:3611:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:3612:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getLabelAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabelRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:3624:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:3625:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:3625:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:3626:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabelRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:3642:3: ( (lv_features_5_0= ruleLabelFeature ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=56 && LA64_0<=57)||LA64_0==60||LA64_0==64||LA64_0==70||LA64_0==72||LA64_0==79) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3643:4: (lv_features_5_0= ruleLabelFeature )
            	    {
            	    // InternalXdiagramDsl.g:3643:4: (lv_features_5_0= ruleLabelFeature )
            	    // InternalXdiagramDsl.g:3644:5: lv_features_5_0= ruleLabelFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLabelAccess().getFeaturesLabelFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop64;
                }
            } while (true);

            // InternalXdiagramDsl.g:3661:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==40) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3662:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLabelAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:3666:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:3667:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:3667:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:3668:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getLabelAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop65;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3694:1: entryRuleLabelFeature returns [EObject current=null] : iv_ruleLabelFeature= ruleLabelFeature EOF ;
    public final EObject entryRuleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelFeature = null;


        try {
            // InternalXdiagramDsl.g:3694:53: (iv_ruleLabelFeature= ruleLabelFeature EOF )
            // InternalXdiagramDsl.g:3695:2: iv_ruleLabelFeature= ruleLabelFeature EOF
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
    // InternalXdiagramDsl.g:3701:1: ruleLabelFeature returns [EObject current=null] : (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) ;
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
            // InternalXdiagramDsl.g:3707:2: ( (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) )
            // InternalXdiagramDsl.g:3708:2: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            {
            // InternalXdiagramDsl.g:3708:2: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            int alt66=7;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt66=1;
                }
                break;
            case 57:
                {
                alt66=2;
                }
                break;
            case 72:
                {
                alt66=3;
                }
                break;
            case 60:
                {
                alt66=4;
                }
                break;
            case 64:
                {
                alt66=5;
                }
                break;
            case 56:
                {
                alt66=6;
                }
                break;
            case 79:
                {
                alt66=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalXdiagramDsl.g:3709:3: this_TextValue_0= ruleTextValue
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
                    // InternalXdiagramDsl.g:3718:3: this_Foreground_1= ruleForeground
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
                    // InternalXdiagramDsl.g:3727:3: this_FontProperties_2= ruleFontProperties
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
                    // InternalXdiagramDsl.g:3736:3: this_Size_3= ruleSize
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
                    // InternalXdiagramDsl.g:3745:3: this_Position_4= rulePosition
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
                    // InternalXdiagramDsl.g:3754:3: this_Visible_5= ruleVisible
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
                    // InternalXdiagramDsl.g:3763:3: this_TextAlign_6= ruleTextAlign
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
    // InternalXdiagramDsl.g:3775:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalXdiagramDsl.g:3775:46: (iv_ruleImage= ruleImage EOF )
            // InternalXdiagramDsl.g:3776:2: iv_ruleImage= ruleImage EOF
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
    // InternalXdiagramDsl.g:3782:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalXdiagramDsl.g:3788:2: ( (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:3789:2: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:3789:2: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:3790:3: otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
            		
            // InternalXdiagramDsl.g:3794:3: ( (lv_imageId_1_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:3795:4: (lv_imageId_1_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:3795:4: (lv_imageId_1_0= RULE_STRING )
            // InternalXdiagramDsl.g:3796:5: lv_imageId_1_0= RULE_STRING
            {
            lv_imageId_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            // InternalXdiagramDsl.g:3812:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==22) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXdiagramDsl.g:3813:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:3813:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:3814:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:3814:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:3815:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getImageAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:3827:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:3828:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:3828:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:3829:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getImageAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_44); 

            			newLeafNode(otherlv_4, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:3845:3: ( (lv_features_5_0= ruleImageFeature ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=59 && LA68_0<=60)||LA68_0==64) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3846:4: (lv_features_5_0= ruleImageFeature )
            	    {
            	    // InternalXdiagramDsl.g:3846:4: (lv_features_5_0= ruleImageFeature )
            	    // InternalXdiagramDsl.g:3847:5: lv_features_5_0= ruleImageFeature
            	    {

            	    					newCompositeNode(grammarAccess.getImageAccess().getFeaturesImageFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_44);
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
            	    break loop68;
                }
            } while (true);

            // InternalXdiagramDsl.g:3864:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==40) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3865:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getImageAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:3869:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:3870:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:3870:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:3871:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getImageAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop69;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3897:1: entryRuleImageFeature returns [EObject current=null] : iv_ruleImageFeature= ruleImageFeature EOF ;
    public final EObject entryRuleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFeature = null;


        try {
            // InternalXdiagramDsl.g:3897:53: (iv_ruleImageFeature= ruleImageFeature EOF )
            // InternalXdiagramDsl.g:3898:2: iv_ruleImageFeature= ruleImageFeature EOF
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
    // InternalXdiagramDsl.g:3904:1: ruleImageFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) ;
    public final EObject ruleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Transparency_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3910:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) )
            // InternalXdiagramDsl.g:3911:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            {
            // InternalXdiagramDsl.g:3911:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt70=1;
                }
                break;
            case 64:
                {
                alt70=2;
                }
                break;
            case 59:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalXdiagramDsl.g:3912:3: this_Size_0= ruleSize
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
                    // InternalXdiagramDsl.g:3921:3: this_Position_1= rulePosition
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
                    // InternalXdiagramDsl.g:3930:3: this_Transparency_2= ruleTransparency
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
    // InternalXdiagramDsl.g:3942:1: entryRuleInvisible returns [EObject current=null] : iv_ruleInvisible= ruleInvisible EOF ;
    public final EObject entryRuleInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisible = null;


        try {
            // InternalXdiagramDsl.g:3942:50: (iv_ruleInvisible= ruleInvisible EOF )
            // InternalXdiagramDsl.g:3943:2: iv_ruleInvisible= ruleInvisible EOF
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
    // InternalXdiagramDsl.g:3949:1: ruleInvisible returns [EObject current=null] : ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalXdiagramDsl.g:3955:2: ( ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalXdiagramDsl.g:3956:2: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalXdiagramDsl.g:3956:2: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalXdiagramDsl.g:3957:3: () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalXdiagramDsl.g:3957:3: ()
            // InternalXdiagramDsl.g:3958:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvisibleAccess().getInvisibleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getInvisibleAccess().getInvisibleKeyword_1());
            		
            // InternalXdiagramDsl.g:3968:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==22) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXdiagramDsl.g:3969:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:3969:4: ( (lv_styled_2_0= '+' ) )
                    // InternalXdiagramDsl.g:3970:5: (lv_styled_2_0= '+' )
                    {
                    // InternalXdiagramDsl.g:3970:5: (lv_styled_2_0= '+' )
                    // InternalXdiagramDsl.g:3971:6: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,22,FOLLOW_3); 

                    						newLeafNode(lv_styled_2_0, grammarAccess.getInvisibleAccess().getStyledPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInvisibleRule());
                    						}
                    						setWithLastConsumed(current, "styled", true, "+");
                    					

                    }


                    }

                    // InternalXdiagramDsl.g:3983:4: ( (otherlv_3= RULE_ID ) )
                    // InternalXdiagramDsl.g:3984:5: (otherlv_3= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:3984:5: (otherlv_3= RULE_ID )
                    // InternalXdiagramDsl.g:3985:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInvisibleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getInvisibleAccess().getStyleStyleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getInvisibleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXdiagramDsl.g:4001:3: ( (lv_features_5_0= ruleInvisibleFeature ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==35||LA72_0==52||LA72_0==60||LA72_0==64||LA72_0==66) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalXdiagramDsl.g:4002:4: (lv_features_5_0= ruleInvisibleFeature )
            	    {
            	    // InternalXdiagramDsl.g:4002:4: (lv_features_5_0= ruleInvisibleFeature )
            	    // InternalXdiagramDsl.g:4003:5: lv_features_5_0= ruleInvisibleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getInvisibleAccess().getFeaturesInvisibleFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_45);
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
            	    break loop72;
                }
            } while (true);

            // InternalXdiagramDsl.g:4020:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==40) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalXdiagramDsl.g:4021:4: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getInvisibleAccess().getChildKeyword_5_0());
            	    			
            	    // InternalXdiagramDsl.g:4025:4: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:4026:5: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:4026:5: (lv_children_7_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:4027:6: lv_children_7_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getInvisibleAccess().getChildrenChildElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop73;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4053:1: entryRuleInvisibleFeature returns [EObject current=null] : iv_ruleInvisibleFeature= ruleInvisibleFeature EOF ;
    public final EObject entryRuleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisibleFeature = null;


        try {
            // InternalXdiagramDsl.g:4053:57: (iv_ruleInvisibleFeature= ruleInvisibleFeature EOF )
            // InternalXdiagramDsl.g:4054:2: iv_ruleInvisibleFeature= ruleInvisibleFeature EOF
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
    // InternalXdiagramDsl.g:4060:1: ruleInvisibleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) ;
    public final EObject ruleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_LinkedFeature_2 = null;

        EObject this_Layout_3 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4066:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) )
            // InternalXdiagramDsl.g:4067:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            {
            // InternalXdiagramDsl.g:4067:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt74=1;
                }
                break;
            case 64:
                {
                alt74=2;
                }
                break;
            case 35:
            case 52:
                {
                alt74=3;
                }
                break;
            case 66:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalXdiagramDsl.g:4068:3: this_Size_0= ruleSize
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
                    // InternalXdiagramDsl.g:4077:3: this_Position_1= rulePosition
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
                    // InternalXdiagramDsl.g:4086:3: this_LinkedFeature_2= ruleLinkedFeature
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
                    // InternalXdiagramDsl.g:4095:3: this_Layout_3= ruleLayout
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
    // InternalXdiagramDsl.g:4107:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // InternalXdiagramDsl.g:4107:53: (iv_ruleColorFeature= ruleColorFeature EOF )
            // InternalXdiagramDsl.g:4108:2: iv_ruleColorFeature= ruleColorFeature EOF
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
    // InternalXdiagramDsl.g:4114:1: ruleColorFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_Background_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4120:2: ( (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) )
            // InternalXdiagramDsl.g:4121:2: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            {
            // InternalXdiagramDsl.g:4121:2: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==57) ) {
                alt75=1;
            }
            else if ( (LA75_0==58) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalXdiagramDsl.g:4122:3: this_Foreground_0= ruleForeground
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
                    // InternalXdiagramDsl.g:4131:3: this_Background_1= ruleBackground
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
    // InternalXdiagramDsl.g:4143:1: entryRuleForeground returns [EObject current=null] : iv_ruleForeground= ruleForeground EOF ;
    public final EObject entryRuleForeground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeground = null;


        try {
            // InternalXdiagramDsl.g:4143:51: (iv_ruleForeground= ruleForeground EOF )
            // InternalXdiagramDsl.g:4144:2: iv_ruleForeground= ruleForeground EOF
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
    // InternalXdiagramDsl.g:4150:1: ruleForeground returns [EObject current=null] : ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleForeground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4156:2: ( ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4157:2: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4157:2: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4158:3: ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalXdiagramDsl.g:4158:3: ( (lv_type_0_0= 'foreground' ) )
            // InternalXdiagramDsl.g:4159:4: (lv_type_0_0= 'foreground' )
            {
            // InternalXdiagramDsl.g:4159:4: (lv_type_0_0= 'foreground' )
            // InternalXdiagramDsl.g:4160:5: lv_type_0_0= 'foreground'
            {
            lv_type_0_0=(Token)match(input,57,FOLLOW_46); 

            					newLeafNode(lv_type_0_0, grammarAccess.getForegroundAccess().getTypeForegroundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForegroundRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "foreground");
            				

            }


            }

            // InternalXdiagramDsl.g:4172:3: ( (lv_color_1_0= ruleColor ) )
            // InternalXdiagramDsl.g:4173:4: (lv_color_1_0= ruleColor )
            {
            // InternalXdiagramDsl.g:4173:4: (lv_color_1_0= ruleColor )
            // InternalXdiagramDsl.g:4174:5: lv_color_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getForegroundAccess().getColorColorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalXdiagramDsl.g:4191:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==23) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalXdiagramDsl.g:4192:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4192:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4193:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getForegroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4218:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalXdiagramDsl.g:4218:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalXdiagramDsl.g:4219:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalXdiagramDsl.g:4225:1: ruleBackground returns [EObject current=null] : ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4231:2: ( ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4232:2: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4232:2: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4233:3: ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalXdiagramDsl.g:4233:3: ( (lv_type_0_0= 'background' ) )
            // InternalXdiagramDsl.g:4234:4: (lv_type_0_0= 'background' )
            {
            // InternalXdiagramDsl.g:4234:4: (lv_type_0_0= 'background' )
            // InternalXdiagramDsl.g:4235:5: lv_type_0_0= 'background'
            {
            lv_type_0_0=(Token)match(input,58,FOLLOW_46); 

            					newLeafNode(lv_type_0_0, grammarAccess.getBackgroundAccess().getTypeBackgroundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "background");
            				

            }


            }

            // InternalXdiagramDsl.g:4247:3: ( (lv_color_1_0= ruleColor ) )
            // InternalXdiagramDsl.g:4248:4: (lv_color_1_0= ruleColor )
            {
            // InternalXdiagramDsl.g:4248:4: (lv_color_1_0= ruleColor )
            // InternalXdiagramDsl.g:4249:5: lv_color_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getColorColorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalXdiagramDsl.g:4266:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==23) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalXdiagramDsl.g:4267:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4267:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4268:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getBackgroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4293:1: entryRuleTransparency returns [EObject current=null] : iv_ruleTransparency= ruleTransparency EOF ;
    public final EObject entryRuleTransparency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransparency = null;


        try {
            // InternalXdiagramDsl.g:4293:53: (iv_ruleTransparency= ruleTransparency EOF )
            // InternalXdiagramDsl.g:4294:2: iv_ruleTransparency= ruleTransparency EOF
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
    // InternalXdiagramDsl.g:4300:1: ruleTransparency returns [EObject current=null] : (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTransparency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_percent_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4306:2: ( (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:4307:2: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:4307:2: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:4308:3: otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getTransparencyAccess().getTransparencyKeyword_0());
            		
            // InternalXdiagramDsl.g:4312:3: ( (lv_percent_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4313:4: (lv_percent_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4313:4: (lv_percent_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4314:5: lv_percent_1_0= RULE_INT
            {
            lv_percent_1_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getTransparencyAccess().getPercentSignKeyword_2());
            		
            // InternalXdiagramDsl.g:4334:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==23) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXdiagramDsl.g:4335:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4335:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4336:5: lv_conditional_3_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getTransparencyAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4361:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalXdiagramDsl.g:4361:45: (iv_ruleSize= ruleSize EOF )
            // InternalXdiagramDsl.g:4362:2: iv_ruleSize= ruleSize EOF
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
    // InternalXdiagramDsl.g:4368:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) ;
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
            // InternalXdiagramDsl.g:4374:2: ( (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) )
            // InternalXdiagramDsl.g:4375:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            {
            // InternalXdiagramDsl.g:4375:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            // InternalXdiagramDsl.g:4376:3: otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            // InternalXdiagramDsl.g:4380:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4381:4: (lv_width_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4381:4: (lv_width_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4382:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_47); 

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

            // InternalXdiagramDsl.g:4398:3: ( (lv_widthRelative_2_0= ']' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==61) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalXdiagramDsl.g:4399:4: (lv_widthRelative_2_0= ']' )
                    {
                    // InternalXdiagramDsl.g:4399:4: (lv_widthRelative_2_0= ']' )
                    // InternalXdiagramDsl.g:4400:5: lv_widthRelative_2_0= ']'
                    {
                    lv_widthRelative_2_0=(Token)match(input,61,FOLLOW_48); 

                    					newLeafNode(lv_widthRelative_2_0, grammarAccess.getSizeAccess().getWidthRelativeRightSquareBracketKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSizeRule());
                    					}
                    					setWithLastConsumed(current, "widthRelative", true, "]");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4412:3: ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_INT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalXdiagramDsl.g:4413:4: ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )?
                    {
                    // InternalXdiagramDsl.g:4413:4: ( (lv_height_3_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:4414:5: (lv_height_3_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:4414:5: (lv_height_3_0= RULE_INT )
                    // InternalXdiagramDsl.g:4415:6: lv_height_3_0= RULE_INT
                    {
                    lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_49); 

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

                    // InternalXdiagramDsl.g:4431:4: ( (lv_heightRelative_4_0= ']' ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==61) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalXdiagramDsl.g:4432:5: (lv_heightRelative_4_0= ']' )
                            {
                            // InternalXdiagramDsl.g:4432:5: (lv_heightRelative_4_0= ']' )
                            // InternalXdiagramDsl.g:4433:6: lv_heightRelative_4_0= ']'
                            {
                            lv_heightRelative_4_0=(Token)match(input,61,FOLLOW_50); 

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

            // InternalXdiagramDsl.g:4446:3: ( (lv_resizable_5_0= 'resizable' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==62) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXdiagramDsl.g:4447:4: (lv_resizable_5_0= 'resizable' )
                    {
                    // InternalXdiagramDsl.g:4447:4: (lv_resizable_5_0= 'resizable' )
                    // InternalXdiagramDsl.g:4448:5: lv_resizable_5_0= 'resizable'
                    {
                    lv_resizable_5_0=(Token)match(input,62,FOLLOW_36); 

                    					newLeafNode(lv_resizable_5_0, grammarAccess.getSizeAccess().getResizableResizableKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSizeRule());
                    					}
                    					setWithLastConsumed(current, "resizable", true, "resizable");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4460:3: ( (lv_conditional_6_0= ruleFeatureConditional ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==23) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalXdiagramDsl.g:4461:4: (lv_conditional_6_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4461:4: (lv_conditional_6_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4462:5: lv_conditional_6_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getSizeAccess().getConditionalFeatureConditionalParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4487:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalXdiagramDsl.g:4487:46: (iv_rulePoint= rulePoint EOF )
            // InternalXdiagramDsl.g:4488:2: iv_rulePoint= rulePoint EOF
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
    // InternalXdiagramDsl.g:4494:1: rulePoint returns [EObject current=null] : (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4500:2: ( (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:4501:2: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:4501:2: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:4502:3: otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getPointKeyword_0());
            		
            // InternalXdiagramDsl.g:4506:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4507:4: (lv_x_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4507:4: (lv_x_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4508:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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

            // InternalXdiagramDsl.g:4524:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4525:4: (lv_y_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4525:4: (lv_y_2_0= RULE_INT )
            // InternalXdiagramDsl.g:4526:5: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            // InternalXdiagramDsl.g:4542:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==23) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalXdiagramDsl.g:4543:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4543:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4544:5: lv_conditional_3_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getPointAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4569:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalXdiagramDsl.g:4569:49: (iv_rulePosition= rulePosition EOF )
            // InternalXdiagramDsl.g:4570:2: iv_rulePosition= rulePosition EOF
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
    // InternalXdiagramDsl.g:4576:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalXdiagramDsl.g:4582:2: ( (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:4583:2: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:4583:2: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:4584:3: otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            // InternalXdiagramDsl.g:4588:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4589:4: (lv_x_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4589:4: (lv_x_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4590:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_51); 

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

            // InternalXdiagramDsl.g:4606:3: ( (lv_xRelative_2_0= '%' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==34) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXdiagramDsl.g:4607:4: (lv_xRelative_2_0= '%' )
                    {
                    // InternalXdiagramDsl.g:4607:4: (lv_xRelative_2_0= '%' )
                    // InternalXdiagramDsl.g:4608:5: lv_xRelative_2_0= '%'
                    {
                    lv_xRelative_2_0=(Token)match(input,34,FOLLOW_31); 

                    					newLeafNode(lv_xRelative_2_0, grammarAccess.getPositionAccess().getXRelativePercentSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPositionRule());
                    					}
                    					setWithLastConsumed(current, "xRelative", true, "%");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4620:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4621:4: (lv_y_3_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4621:4: (lv_y_3_0= RULE_INT )
            // InternalXdiagramDsl.g:4622:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_52); 

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

            // InternalXdiagramDsl.g:4638:3: ( (lv_yRelative_4_0= '%' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==34) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalXdiagramDsl.g:4639:4: (lv_yRelative_4_0= '%' )
                    {
                    // InternalXdiagramDsl.g:4639:4: (lv_yRelative_4_0= '%' )
                    // InternalXdiagramDsl.g:4640:5: lv_yRelative_4_0= '%'
                    {
                    lv_yRelative_4_0=(Token)match(input,34,FOLLOW_36); 

                    					newLeafNode(lv_yRelative_4_0, grammarAccess.getPositionAccess().getYRelativePercentSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPositionRule());
                    					}
                    					setWithLastConsumed(current, "yRelative", true, "%");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4652:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==23) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalXdiagramDsl.g:4653:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4653:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4654:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getPositionAccess().getConditionalFeatureConditionalParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4679:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // InternalXdiagramDsl.g:4679:47: (iv_ruleCorner= ruleCorner EOF )
            // InternalXdiagramDsl.g:4680:2: iv_ruleCorner= ruleCorner EOF
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
    // InternalXdiagramDsl.g:4686:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4692:2: ( (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4693:2: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4693:2: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4694:3: otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
            		
            // InternalXdiagramDsl.g:4698:3: ( (lv_angle_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4699:4: (lv_angle_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4699:4: (lv_angle_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4700:5: lv_angle_1_0= RULE_INT
            {
            lv_angle_1_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            // InternalXdiagramDsl.g:4716:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==23) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalXdiagramDsl.g:4717:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4717:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4718:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getCornerAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4743:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalXdiagramDsl.g:4743:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalXdiagramDsl.g:4744:2: iv_ruleLayout= ruleLayout EOF
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
    // InternalXdiagramDsl.g:4750:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalXdiagramDsl.g:4756:2: ( (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:4757:2: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:4757:2: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:4758:3: otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
            		
            // InternalXdiagramDsl.g:4762:3: ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==67) ) {
                alt89=1;
            }
            else if ( (LA89_0==68) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalXdiagramDsl.g:4763:4: ( (lv_vertical_1_0= 'vertical' ) )
                    {
                    // InternalXdiagramDsl.g:4763:4: ( (lv_vertical_1_0= 'vertical' ) )
                    // InternalXdiagramDsl.g:4764:5: (lv_vertical_1_0= 'vertical' )
                    {
                    // InternalXdiagramDsl.g:4764:5: (lv_vertical_1_0= 'vertical' )
                    // InternalXdiagramDsl.g:4765:6: lv_vertical_1_0= 'vertical'
                    {
                    lv_vertical_1_0=(Token)match(input,67,FOLLOW_54); 

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
                    // InternalXdiagramDsl.g:4778:4: ( (lv_horizontal_2_0= 'horizontal' ) )
                    {
                    // InternalXdiagramDsl.g:4778:4: ( (lv_horizontal_2_0= 'horizontal' ) )
                    // InternalXdiagramDsl.g:4779:5: (lv_horizontal_2_0= 'horizontal' )
                    {
                    // InternalXdiagramDsl.g:4779:5: (lv_horizontal_2_0= 'horizontal' )
                    // InternalXdiagramDsl.g:4780:6: lv_horizontal_2_0= 'horizontal'
                    {
                    lv_horizontal_2_0=(Token)match(input,68,FOLLOW_54); 

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

            // InternalXdiagramDsl.g:4793:3: (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==69) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalXdiagramDsl.g:4794:4: otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getMarginKeyword_2_0());
                    			
                    // InternalXdiagramDsl.g:4798:4: ( (lv_margin_4_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:4799:5: (lv_margin_4_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:4799:5: (lv_margin_4_0= RULE_INT )
                    // InternalXdiagramDsl.g:4800:6: lv_margin_4_0= RULE_INT
                    {
                    lv_margin_4_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            // InternalXdiagramDsl.g:4817:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==23) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalXdiagramDsl.g:4818:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4818:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4819:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getLayoutAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4844:1: entryRuleVisible returns [EObject current=null] : iv_ruleVisible= ruleVisible EOF ;
    public final EObject entryRuleVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisible = null;


        try {
            // InternalXdiagramDsl.g:4844:48: (iv_ruleVisible= ruleVisible EOF )
            // InternalXdiagramDsl.g:4845:2: iv_ruleVisible= ruleVisible EOF
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
    // InternalXdiagramDsl.g:4851:1: ruleVisible returns [EObject current=null] : (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) ;
    public final EObject ruleVisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_conditional_1_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4857:2: ( (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) )
            // InternalXdiagramDsl.g:4858:2: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            {
            // InternalXdiagramDsl.g:4858:2: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            // InternalXdiagramDsl.g:4859:3: otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibleAccess().getInvisibleKeyword_0());
            		
            // InternalXdiagramDsl.g:4863:3: ( (lv_conditional_1_0= ruleFeatureConditional ) )
            // InternalXdiagramDsl.g:4864:4: (lv_conditional_1_0= ruleFeatureConditional )
            {
            // InternalXdiagramDsl.g:4864:4: (lv_conditional_1_0= ruleFeatureConditional )
            // InternalXdiagramDsl.g:4865:5: lv_conditional_1_0= ruleFeatureConditional
            {

            					newCompositeNode(grammarAccess.getVisibleAccess().getConditionalFeatureConditionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4890:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalXdiagramDsl.g:4890:50: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalXdiagramDsl.g:4891:2: iv_ruleTextValue= ruleTextValue EOF
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
    // InternalXdiagramDsl.g:4897:1: ruleTextValue returns [EObject current=null] : ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_parts_2_0 = null;

        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4903:2: ( ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:4904:2: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:4904:2: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:4905:3: () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            // InternalXdiagramDsl.g:4905:3: ()
            // InternalXdiagramDsl.g:4906:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextValueAccess().getTextValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getTextValueAccess().getTextKeyword_1());
            		
            // InternalXdiagramDsl.g:4916:3: ( (lv_parts_2_0= ruleTextPart ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=RULE_ID && LA92_0<=RULE_STRING)||LA92_0==71) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalXdiagramDsl.g:4917:4: (lv_parts_2_0= ruleTextPart )
            	    {
            	    // InternalXdiagramDsl.g:4917:4: (lv_parts_2_0= ruleTextPart )
            	    // InternalXdiagramDsl.g:4918:5: lv_parts_2_0= ruleTextPart
            	    {

            	    					newCompositeNode(grammarAccess.getTextValueAccess().getPartsTextPartParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_56);
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
            	    break loop92;
                }
            } while (true);

            // InternalXdiagramDsl.g:4935:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==23) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalXdiagramDsl.g:4936:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4936:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4937:5: lv_conditional_3_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getTextValueAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4962:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // InternalXdiagramDsl.g:4962:49: (iv_ruleTextPart= ruleTextPart EOF )
            // InternalXdiagramDsl.g:4963:2: iv_ruleTextPart= ruleTextPart EOF
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
    // InternalXdiagramDsl.g:4969:1: ruleTextPart returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_editable_1_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4975:2: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) )
            // InternalXdiagramDsl.g:4976:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            {
            // InternalXdiagramDsl.g:4976:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_STRING) ) {
                alt95=1;
            }
            else if ( (LA95_0==RULE_ID||LA95_0==71) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalXdiagramDsl.g:4977:3: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // InternalXdiagramDsl.g:4977:3: ( (lv_text_0_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:4978:4: (lv_text_0_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:4978:4: (lv_text_0_0= RULE_STRING )
                    // InternalXdiagramDsl.g:4979:5: lv_text_0_0= RULE_STRING
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
                    // InternalXdiagramDsl.g:4996:3: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:4996:3: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:4997:4: ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:4997:4: ( (lv_editable_1_0= 'edit:' ) )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==71) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // InternalXdiagramDsl.g:4998:5: (lv_editable_1_0= 'edit:' )
                            {
                            // InternalXdiagramDsl.g:4998:5: (lv_editable_1_0= 'edit:' )
                            // InternalXdiagramDsl.g:4999:6: lv_editable_1_0= 'edit:'
                            {
                            lv_editable_1_0=(Token)match(input,71,FOLLOW_3); 

                            						newLeafNode(lv_editable_1_0, grammarAccess.getTextPartAccess().getEditableEditKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTextPartRule());
                            						}
                            						setWithLastConsumed(current, "editable", true, "edit:");
                            					

                            }


                            }
                            break;

                    }

                    // InternalXdiagramDsl.g:5011:4: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:5012:5: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:5012:5: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:5013:6: ruleQualifiedName
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
    // InternalXdiagramDsl.g:5032:1: entryRuleFontProperties returns [EObject current=null] : iv_ruleFontProperties= ruleFontProperties EOF ;
    public final EObject entryRuleFontProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontProperties = null;


        try {
            // InternalXdiagramDsl.g:5032:55: (iv_ruleFontProperties= ruleFontProperties EOF )
            // InternalXdiagramDsl.g:5033:2: iv_ruleFontProperties= ruleFontProperties EOF
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
    // InternalXdiagramDsl.g:5039:1: ruleFontProperties returns [EObject current=null] : ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) ;
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
            // InternalXdiagramDsl.g:5045:2: ( ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) )
            // InternalXdiagramDsl.g:5046:2: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            {
            // InternalXdiagramDsl.g:5046:2: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            // InternalXdiagramDsl.g:5047:3: () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';'
            {
            // InternalXdiagramDsl.g:5047:3: ()
            // InternalXdiagramDsl.g:5048:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFontPropertiesAccess().getFontPropertiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getFontPropertiesAccess().getFontKeyword_1());
            		
            // InternalXdiagramDsl.g:5058:3: ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )?
            int alt96=5;
            switch ( input.LA(1) ) {
                case 73:
                    {
                    alt96=1;
                    }
                    break;
                case 74:
                    {
                    alt96=2;
                    }
                    break;
                case 75:
                    {
                    alt96=3;
                    }
                    break;
                case 76:
                    {
                    alt96=4;
                    }
                    break;
            }

            switch (alt96) {
                case 1 :
                    // InternalXdiagramDsl.g:5059:4: ( (lv_face_2_0= 'arial' ) )
                    {
                    // InternalXdiagramDsl.g:5059:4: ( (lv_face_2_0= 'arial' ) )
                    // InternalXdiagramDsl.g:5060:5: (lv_face_2_0= 'arial' )
                    {
                    // InternalXdiagramDsl.g:5060:5: (lv_face_2_0= 'arial' )
                    // InternalXdiagramDsl.g:5061:6: lv_face_2_0= 'arial'
                    {
                    lv_face_2_0=(Token)match(input,73,FOLLOW_58); 

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
                    // InternalXdiagramDsl.g:5074:4: otherlv_3= 'verdana'
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_58); 

                    				newLeafNode(otherlv_3, grammarAccess.getFontPropertiesAccess().getVerdanaKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:5079:4: otherlv_4= 'courier'
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getFontPropertiesAccess().getCourierKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:5084:4: otherlv_5= 'times'
                    {
                    otherlv_5=(Token)match(input,76,FOLLOW_58); 

                    				newLeafNode(otherlv_5, grammarAccess.getFontPropertiesAccess().getTimesKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalXdiagramDsl.g:5089:3: ( (lv_size_6_0= RULE_INT ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_INT) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalXdiagramDsl.g:5090:4: (lv_size_6_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:5090:4: (lv_size_6_0= RULE_INT )
                    // InternalXdiagramDsl.g:5091:5: lv_size_6_0= RULE_INT
                    {
                    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_59); 

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

            // InternalXdiagramDsl.g:5107:3: ( (lv_bold_7_0= 'bold' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==77) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalXdiagramDsl.g:5108:4: (lv_bold_7_0= 'bold' )
                    {
                    // InternalXdiagramDsl.g:5108:4: (lv_bold_7_0= 'bold' )
                    // InternalXdiagramDsl.g:5109:5: lv_bold_7_0= 'bold'
                    {
                    lv_bold_7_0=(Token)match(input,77,FOLLOW_60); 

                    					newLeafNode(lv_bold_7_0, grammarAccess.getFontPropertiesAccess().getBoldBoldKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFontPropertiesRule());
                    					}
                    					setWithLastConsumed(current, "bold", true, "bold");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:5121:3: ( (lv_italics_8_0= 'italics' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==78) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalXdiagramDsl.g:5122:4: (lv_italics_8_0= 'italics' )
                    {
                    // InternalXdiagramDsl.g:5122:4: (lv_italics_8_0= 'italics' )
                    // InternalXdiagramDsl.g:5123:5: lv_italics_8_0= 'italics'
                    {
                    lv_italics_8_0=(Token)match(input,78,FOLLOW_36); 

                    					newLeafNode(lv_italics_8_0, grammarAccess.getFontPropertiesAccess().getItalicsItalicsKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFontPropertiesRule());
                    					}
                    					setWithLastConsumed(current, "italics", true, "italics");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:5135:3: ( (lv_conditional_9_0= ruleFeatureConditional ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==23) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalXdiagramDsl.g:5136:4: (lv_conditional_9_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:5136:4: (lv_conditional_9_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:5137:5: lv_conditional_9_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getFontPropertiesAccess().getConditionalFeatureConditionalParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5162:1: entryRuleTextAlign returns [EObject current=null] : iv_ruleTextAlign= ruleTextAlign EOF ;
    public final EObject entryRuleTextAlign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAlign = null;


        try {
            // InternalXdiagramDsl.g:5162:50: (iv_ruleTextAlign= ruleTextAlign EOF )
            // InternalXdiagramDsl.g:5163:2: iv_ruleTextAlign= ruleTextAlign EOF
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
    // InternalXdiagramDsl.g:5169:1: ruleTextAlign returns [EObject current=null] : (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleTextAlign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_value_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:5175:2: ( (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:5176:2: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:5176:2: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:5177:3: otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_61); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAlignAccess().getAlignKeyword_0());
            		
            // InternalXdiagramDsl.g:5181:3: ( (lv_value_1_0= ruleTextAlignValue ) )
            // InternalXdiagramDsl.g:5182:4: (lv_value_1_0= ruleTextAlignValue )
            {
            // InternalXdiagramDsl.g:5182:4: (lv_value_1_0= ruleTextAlignValue )
            // InternalXdiagramDsl.g:5183:5: lv_value_1_0= ruleTextAlignValue
            {

            					newCompositeNode(grammarAccess.getTextAlignAccess().getValueTextAlignValueEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalXdiagramDsl.g:5200:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==23) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalXdiagramDsl.g:5201:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:5201:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:5202:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getTextAlignAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5227:1: entryRuleLineStyle returns [EObject current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final EObject entryRuleLineStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStyle = null;


        try {
            // InternalXdiagramDsl.g:5227:50: (iv_ruleLineStyle= ruleLineStyle EOF )
            // InternalXdiagramDsl.g:5228:2: iv_ruleLineStyle= ruleLineStyle EOF
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
    // InternalXdiagramDsl.g:5234:1: ruleLineStyle returns [EObject current=null] : ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject ruleLineStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_manhattan_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_style_2_0 = null;

        EObject lv_conditional_4_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:5240:2: ( ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // InternalXdiagramDsl.g:5241:2: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // InternalXdiagramDsl.g:5241:2: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // InternalXdiagramDsl.g:5242:3: () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            // InternalXdiagramDsl.g:5242:3: ()
            // InternalXdiagramDsl.g:5243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineStyleAccess().getLineStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getLineStyleAccess().getLinestyleKeyword_1());
            		
            // InternalXdiagramDsl.g:5253:3: ( (lv_style_2_0= ruleLineType ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=108 && LA102_0<=110)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalXdiagramDsl.g:5254:4: (lv_style_2_0= ruleLineType )
                    {
                    // InternalXdiagramDsl.g:5254:4: (lv_style_2_0= ruleLineType )
                    // InternalXdiagramDsl.g:5255:5: lv_style_2_0= ruleLineType
                    {

                    					newCompositeNode(grammarAccess.getLineStyleAccess().getStyleLineTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_63);
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

            // InternalXdiagramDsl.g:5272:3: ( (lv_manhattan_3_0= 'manhattan' ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==81) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalXdiagramDsl.g:5273:4: (lv_manhattan_3_0= 'manhattan' )
                    {
                    // InternalXdiagramDsl.g:5273:4: (lv_manhattan_3_0= 'manhattan' )
                    // InternalXdiagramDsl.g:5274:5: lv_manhattan_3_0= 'manhattan'
                    {
                    lv_manhattan_3_0=(Token)match(input,81,FOLLOW_36); 

                    					newLeafNode(lv_manhattan_3_0, grammarAccess.getLineStyleAccess().getManhattanManhattanKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLineStyleRule());
                    					}
                    					setWithLastConsumed(current, "manhattan", true, "manhattan");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:5286:3: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==23) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalXdiagramDsl.g:5287:4: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:5287:4: (lv_conditional_4_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:5288:5: lv_conditional_4_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getLineStyleAccess().getConditionalFeatureConditionalParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5313:1: entryRuleLineWidth returns [EObject current=null] : iv_ruleLineWidth= ruleLineWidth EOF ;
    public final EObject entryRuleLineWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineWidth = null;


        try {
            // InternalXdiagramDsl.g:5313:50: (iv_ruleLineWidth= ruleLineWidth EOF )
            // InternalXdiagramDsl.g:5314:2: iv_ruleLineWidth= ruleLineWidth EOF
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
    // InternalXdiagramDsl.g:5320:1: ruleLineWidth returns [EObject current=null] : (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleLineWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:5326:2: ( (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:5327:2: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:5327:2: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:5328:3: otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getLineWidthAccess().getLinewidthKeyword_0());
            		
            // InternalXdiagramDsl.g:5332:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:5333:4: (lv_width_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:5333:4: (lv_width_1_0= RULE_INT )
            // InternalXdiagramDsl.g:5334:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            // InternalXdiagramDsl.g:5350:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==23) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalXdiagramDsl.g:5351:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:5351:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:5352:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getLineWidthAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5377:1: ruleAnchorDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) ;
    public final Enumerator ruleAnchorDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5383:2: ( ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) )
            // InternalXdiagramDsl.g:5384:2: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            {
            // InternalXdiagramDsl.g:5384:2: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==83) ) {
                alt106=1;
            }
            else if ( (LA106_0==84) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalXdiagramDsl.g:5385:3: (enumLiteral_0= 'incoming' )
                    {
                    // InternalXdiagramDsl.g:5385:3: (enumLiteral_0= 'incoming' )
                    // InternalXdiagramDsl.g:5386:4: enumLiteral_0= 'incoming'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5393:3: (enumLiteral_1= 'outgoing' )
                    {
                    // InternalXdiagramDsl.g:5393:3: (enumLiteral_1= 'outgoing' )
                    // InternalXdiagramDsl.g:5394:4: enumLiteral_1= 'outgoing'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5404:1: ruleDefaultColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) ;
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
            // InternalXdiagramDsl.g:5410:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) )
            // InternalXdiagramDsl.g:5411:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            {
            // InternalXdiagramDsl.g:5411:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            int alt107=16;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt107=1;
                }
                break;
            case 86:
                {
                alt107=2;
                }
                break;
            case 87:
                {
                alt107=3;
                }
                break;
            case 88:
                {
                alt107=4;
                }
                break;
            case 89:
                {
                alt107=5;
                }
                break;
            case 90:
                {
                alt107=6;
                }
                break;
            case 91:
                {
                alt107=7;
                }
                break;
            case 92:
                {
                alt107=8;
                }
                break;
            case 93:
                {
                alt107=9;
                }
                break;
            case 94:
                {
                alt107=10;
                }
                break;
            case 95:
                {
                alt107=11;
                }
                break;
            case 96:
                {
                alt107=12;
                }
                break;
            case 97:
                {
                alt107=13;
                }
                break;
            case 98:
                {
                alt107=14;
                }
                break;
            case 99:
                {
                alt107=15;
                }
                break;
            case 100:
                {
                alt107=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalXdiagramDsl.g:5412:3: (enumLiteral_0= 'white' )
                    {
                    // InternalXdiagramDsl.g:5412:3: (enumLiteral_0= 'white' )
                    // InternalXdiagramDsl.g:5413:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5420:3: (enumLiteral_1= 'silver' )
                    {
                    // InternalXdiagramDsl.g:5420:3: (enumLiteral_1= 'silver' )
                    // InternalXdiagramDsl.g:5421:4: enumLiteral_1= 'silver'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:5428:3: (enumLiteral_2= 'gray' )
                    {
                    // InternalXdiagramDsl.g:5428:3: (enumLiteral_2= 'gray' )
                    // InternalXdiagramDsl.g:5429:4: enumLiteral_2= 'gray'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:5436:3: (enumLiteral_3= 'black' )
                    {
                    // InternalXdiagramDsl.g:5436:3: (enumLiteral_3= 'black' )
                    // InternalXdiagramDsl.g:5437:4: enumLiteral_3= 'black'
                    {
                    enumLiteral_3=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:5444:3: (enumLiteral_4= 'red' )
                    {
                    // InternalXdiagramDsl.g:5444:3: (enumLiteral_4= 'red' )
                    // InternalXdiagramDsl.g:5445:4: enumLiteral_4= 'red'
                    {
                    enumLiteral_4=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:5452:3: (enumLiteral_5= 'maroon' )
                    {
                    // InternalXdiagramDsl.g:5452:3: (enumLiteral_5= 'maroon' )
                    // InternalXdiagramDsl.g:5453:4: enumLiteral_5= 'maroon'
                    {
                    enumLiteral_5=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXdiagramDsl.g:5460:3: (enumLiteral_6= 'yellow' )
                    {
                    // InternalXdiagramDsl.g:5460:3: (enumLiteral_6= 'yellow' )
                    // InternalXdiagramDsl.g:5461:4: enumLiteral_6= 'yellow'
                    {
                    enumLiteral_6=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXdiagramDsl.g:5468:3: (enumLiteral_7= 'olive' )
                    {
                    // InternalXdiagramDsl.g:5468:3: (enumLiteral_7= 'olive' )
                    // InternalXdiagramDsl.g:5469:4: enumLiteral_7= 'olive'
                    {
                    enumLiteral_7=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalXdiagramDsl.g:5476:3: (enumLiteral_8= 'lime' )
                    {
                    // InternalXdiagramDsl.g:5476:3: (enumLiteral_8= 'lime' )
                    // InternalXdiagramDsl.g:5477:4: enumLiteral_8= 'lime'
                    {
                    enumLiteral_8=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalXdiagramDsl.g:5484:3: (enumLiteral_9= 'green' )
                    {
                    // InternalXdiagramDsl.g:5484:3: (enumLiteral_9= 'green' )
                    // InternalXdiagramDsl.g:5485:4: enumLiteral_9= 'green'
                    {
                    enumLiteral_9=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalXdiagramDsl.g:5492:3: (enumLiteral_10= 'aqua' )
                    {
                    // InternalXdiagramDsl.g:5492:3: (enumLiteral_10= 'aqua' )
                    // InternalXdiagramDsl.g:5493:4: enumLiteral_10= 'aqua'
                    {
                    enumLiteral_10=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalXdiagramDsl.g:5500:3: (enumLiteral_11= 'teal' )
                    {
                    // InternalXdiagramDsl.g:5500:3: (enumLiteral_11= 'teal' )
                    // InternalXdiagramDsl.g:5501:4: enumLiteral_11= 'teal'
                    {
                    enumLiteral_11=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalXdiagramDsl.g:5508:3: (enumLiteral_12= 'blue' )
                    {
                    // InternalXdiagramDsl.g:5508:3: (enumLiteral_12= 'blue' )
                    // InternalXdiagramDsl.g:5509:4: enumLiteral_12= 'blue'
                    {
                    enumLiteral_12=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalXdiagramDsl.g:5516:3: (enumLiteral_13= 'navy' )
                    {
                    // InternalXdiagramDsl.g:5516:3: (enumLiteral_13= 'navy' )
                    // InternalXdiagramDsl.g:5517:4: enumLiteral_13= 'navy'
                    {
                    enumLiteral_13=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalXdiagramDsl.g:5524:3: (enumLiteral_14= 'fuchsia' )
                    {
                    // InternalXdiagramDsl.g:5524:3: (enumLiteral_14= 'fuchsia' )
                    // InternalXdiagramDsl.g:5525:4: enumLiteral_14= 'fuchsia'
                    {
                    enumLiteral_14=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalXdiagramDsl.g:5532:3: (enumLiteral_15= 'purple' )
                    {
                    // InternalXdiagramDsl.g:5532:3: (enumLiteral_15= 'purple' )
                    // InternalXdiagramDsl.g:5533:4: enumLiteral_15= 'purple'
                    {
                    enumLiteral_15=(Token)match(input,100,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5543:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5549:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalXdiagramDsl.g:5550:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalXdiagramDsl.g:5550:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==101) ) {
                alt108=1;
            }
            else if ( (LA108_0==102) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalXdiagramDsl.g:5551:3: (enumLiteral_0= '=' )
                    {
                    // InternalXdiagramDsl.g:5551:3: (enumLiteral_0= '=' )
                    // InternalXdiagramDsl.g:5552:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5559:3: (enumLiteral_1= '<>' )
                    {
                    // InternalXdiagramDsl.g:5559:3: (enumLiteral_1= '<>' )
                    // InternalXdiagramDsl.g:5560:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5570:1: ruleBooleanLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5576:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalXdiagramDsl.g:5577:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalXdiagramDsl.g:5577:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==103) ) {
                alt109=1;
            }
            else if ( (LA109_0==104) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalXdiagramDsl.g:5578:3: (enumLiteral_0= 'true' )
                    {
                    // InternalXdiagramDsl.g:5578:3: (enumLiteral_0= 'true' )
                    // InternalXdiagramDsl.g:5579:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5586:3: (enumLiteral_1= 'false' )
                    {
                    // InternalXdiagramDsl.g:5586:3: (enumLiteral_1= 'false' )
                    // InternalXdiagramDsl.g:5587:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5597:1: ruleTextAlignValue returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleTextAlignValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5603:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalXdiagramDsl.g:5604:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalXdiagramDsl.g:5604:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt110=1;
                }
                break;
            case 106:
                {
                alt110=2;
                }
                break;
            case 107:
                {
                alt110=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalXdiagramDsl.g:5605:3: (enumLiteral_0= 'left' )
                    {
                    // InternalXdiagramDsl.g:5605:3: (enumLiteral_0= 'left' )
                    // InternalXdiagramDsl.g:5606:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5613:3: (enumLiteral_1= 'center' )
                    {
                    // InternalXdiagramDsl.g:5613:3: (enumLiteral_1= 'center' )
                    // InternalXdiagramDsl.g:5614:4: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:5621:3: (enumLiteral_2= 'right' )
                    {
                    // InternalXdiagramDsl.g:5621:3: (enumLiteral_2= 'right' )
                    // InternalXdiagramDsl.g:5622:4: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:5632:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:5638:2: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) )
            // InternalXdiagramDsl.g:5639:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            {
            // InternalXdiagramDsl.g:5639:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt111=1;
                }
                break;
            case 109:
                {
                alt111=2;
                }
                break;
            case 110:
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
                    // InternalXdiagramDsl.g:5640:3: (enumLiteral_0= 'solid' )
                    {
                    // InternalXdiagramDsl.g:5640:3: (enumLiteral_0= 'solid' )
                    // InternalXdiagramDsl.g:5641:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:5648:3: (enumLiteral_1= 'dashed' )
                    {
                    // InternalXdiagramDsl.g:5648:3: (enumLiteral_1= 'dashed' )
                    // InternalXdiagramDsl.g:5649:4: enumLiteral_1= 'dashed'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:5656:3: (enumLiteral_2= 'dotted' )
                    {
                    // InternalXdiagramDsl.g:5656:3: (enumLiteral_2= 'dotted' )
                    // InternalXdiagramDsl.g:5657:4: enumLiteral_2= 'dotted'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000006019280002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000006019200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x9E00000000040000L,0x0000000000058143L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000070L,0x0000018000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x01C1FE4000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000016000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x9E00000200040000L,0x0000000000058143L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x01CFFE4000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000900000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010010800040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x9F10010800040000L,0x0000000000058147L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x9F10000800040000L,0x0000000000058147L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1800010000040000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1010010800040000L,0x0000000000000005L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000010L,0x0000001FFFE00000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x6000000000900040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000900040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x6000000000900000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000900000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000400900000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000900000L,0x0000000000000020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000900030L,0x0000000000000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000900040L,0x0000000000007E00L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000900040L,0x0000000000006000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000900000L,0x0000000000006000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000900000L,0x0000000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000900000L,0x0000700000020000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000900000L,0x0000000000020000L});

}