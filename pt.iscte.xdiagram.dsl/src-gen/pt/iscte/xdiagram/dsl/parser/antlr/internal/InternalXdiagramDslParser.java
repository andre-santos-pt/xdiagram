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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'{'", "'plugin-id'", "'ecore-file'", "'}'", "'.'", "'*'", "'diagram'", "'if'", "'node'", "'link'", "'reference'", "'class'", "'source'", "'target'", "'decorator'", "'%'", "'anchor'", "'max'", "';'", "'color'", "'figure'", "'as'", "'child'", "'rectangle'", "'square'", "'rhombus'", "'ellipse'", "'circle'", "'polygon'", "'polyline'", "'triangle'", "'hline'", "'vline'", "'arrow'", "'contains'", "'null'", "'label'", "'image'", "'invisible'", "'foreground'", "'background'", "'transparency'", "'size'", "']'", "'resizable'", "'point'", "'position'", "'corner'", "'layout'", "'vertical'", "'horizontal'", "'margin'", "'text'", "'edit:'", "'font'", "'arial'", "'verdana'", "'courier'", "'times'", "'bold'", "'italics'", "'align'", "'linestyle'", "'manhattan'", "'linewidth'", "'incoming'", "'outgoing'", "'white'", "'silver'", "'gray'", "'black'", "'red'", "'maroon'", "'yellow'", "'olive'", "'lime'", "'green'", "'aqua'", "'teal'", "'blue'", "'navy'", "'fuchsia'", "'purple'", "'='", "'<>'", "'true'", "'false'", "'left'", "'center'", "'right'", "'solid'", "'dashed'", "'dotted'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;

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
    // InternalXdiagramDsl.g:72:1: ruleXDiagram returns [EObject current=null] : ( ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( ( (lv_elements_2_0= ruleDiagramElement ) ) | ( (lv_colors_3_0= ruleCustomColor ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )* ) ;
    public final EObject ruleXDiagram() throws RecognitionException {
        EObject current = null;

        EObject lv_metamodel_0_0 = null;

        EObject lv_diagram_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_colors_3_0 = null;

        EObject lv_figures_4_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:78:2: ( ( ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( ( (lv_elements_2_0= ruleDiagramElement ) ) | ( (lv_colors_3_0= ruleCustomColor ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )* ) )
            // InternalXdiagramDsl.g:79:2: ( ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( ( (lv_elements_2_0= ruleDiagramElement ) ) | ( (lv_colors_3_0= ruleCustomColor ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )* )
            {
            // InternalXdiagramDsl.g:79:2: ( ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( ( (lv_elements_2_0= ruleDiagramElement ) ) | ( (lv_colors_3_0= ruleCustomColor ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )* )
            // InternalXdiagramDsl.g:80:3: ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( ( (lv_elements_2_0= ruleDiagramElement ) ) | ( (lv_colors_3_0= ruleCustomColor ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )*
            {
            // InternalXdiagramDsl.g:80:3: ( (lv_metamodel_0_0= ruleMetaModel ) )
            // InternalXdiagramDsl.g:81:4: (lv_metamodel_0_0= ruleMetaModel )
            {
            // InternalXdiagramDsl.g:81:4: (lv_metamodel_0_0= ruleMetaModel )
            // InternalXdiagramDsl.g:82:5: lv_metamodel_0_0= ruleMetaModel
            {

            					newCompositeNode(grammarAccess.getXDiagramAccess().getMetamodelMetaModelParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_metamodel_0_0=ruleMetaModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXDiagramRule());
            					}
            					set(
            						current,
            						"metamodel",
            						lv_metamodel_0_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.MetaModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:99:3: ( (lv_diagram_1_0= ruleDiagram ) )
            // InternalXdiagramDsl.g:100:4: (lv_diagram_1_0= ruleDiagram )
            {
            // InternalXdiagramDsl.g:100:4: (lv_diagram_1_0= ruleDiagram )
            // InternalXdiagramDsl.g:101:5: lv_diagram_1_0= ruleDiagram
            {

            					newCompositeNode(grammarAccess.getXDiagramAccess().getDiagramDiagramParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_diagram_1_0=ruleDiagram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXDiagramRule());
            					}
            					set(
            						current,
            						"diagram",
            						lv_diagram_1_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Diagram");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:118:3: ( ( (lv_elements_2_0= ruleDiagramElement ) ) | ( (lv_colors_3_0= ruleCustomColor ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 20:
                case 21:
                    {
                    alt1=1;
                    }
                    break;
                case 31:
                    {
                    alt1=2;
                    }
                    break;
                case 32:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalXdiagramDsl.g:119:4: ( (lv_elements_2_0= ruleDiagramElement ) )
            	    {
            	    // InternalXdiagramDsl.g:119:4: ( (lv_elements_2_0= ruleDiagramElement ) )
            	    // InternalXdiagramDsl.g:120:5: (lv_elements_2_0= ruleDiagramElement )
            	    {
            	    // InternalXdiagramDsl.g:120:5: (lv_elements_2_0= ruleDiagramElement )
            	    // InternalXdiagramDsl.g:121:6: lv_elements_2_0= ruleDiagramElement
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getElementsDiagramElementParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleDiagramElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_2_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.DiagramElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXdiagramDsl.g:139:4: ( (lv_colors_3_0= ruleCustomColor ) )
            	    {
            	    // InternalXdiagramDsl.g:139:4: ( (lv_colors_3_0= ruleCustomColor ) )
            	    // InternalXdiagramDsl.g:140:5: (lv_colors_3_0= ruleCustomColor )
            	    {
            	    // InternalXdiagramDsl.g:140:5: (lv_colors_3_0= ruleCustomColor )
            	    // InternalXdiagramDsl.g:141:6: lv_colors_3_0= ruleCustomColor
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getColorsCustomColorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_colors_3_0=ruleCustomColor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"colors",
            	    							lv_colors_3_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.CustomColor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXdiagramDsl.g:159:4: ( (lv_figures_4_0= ruleCustomFigure ) )
            	    {
            	    // InternalXdiagramDsl.g:159:4: ( (lv_figures_4_0= ruleCustomFigure ) )
            	    // InternalXdiagramDsl.g:160:5: (lv_figures_4_0= ruleCustomFigure )
            	    {
            	    // InternalXdiagramDsl.g:160:5: (lv_figures_4_0= ruleCustomFigure )
            	    // InternalXdiagramDsl.g:161:6: lv_figures_4_0= ruleCustomFigure
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getFiguresCustomFigureParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_figures_4_0=ruleCustomFigure();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"figures",
            	    							lv_figures_4_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.CustomFigure");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalXdiagramDsl.g:183:1: entryRuleMetaModel returns [EObject current=null] : iv_ruleMetaModel= ruleMetaModel EOF ;
    public final EObject entryRuleMetaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModel = null;


        try {
            // InternalXdiagramDsl.g:183:50: (iv_ruleMetaModel= ruleMetaModel EOF )
            // InternalXdiagramDsl.g:184:2: iv_ruleMetaModel= ruleMetaModel EOF
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
    // InternalXdiagramDsl.g:190:1: ruleMetaModel returns [EObject current=null] : (otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleMetaModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_plugin_3_0=null;
        Token otherlv_4=null;
        Token lv_ecorePath_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:196:2: ( (otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:197:2: (otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:197:2: (otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalXdiagramDsl.g:198:3: otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaModelAccess().getMetamodelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaModelAccess().getPluginIdKeyword_2());
            		
            // InternalXdiagramDsl.g:210:3: ( (lv_plugin_3_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:211:4: (lv_plugin_3_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:211:4: (lv_plugin_3_0= RULE_STRING )
            // InternalXdiagramDsl.g:212:5: lv_plugin_3_0= RULE_STRING
            {
            lv_plugin_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMetaModelAccess().getEcoreFileKeyword_4());
            		
            // InternalXdiagramDsl.g:232:3: ( (lv_ecorePath_5_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:233:4: (lv_ecorePath_5_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:233:4: (lv_ecorePath_5_0= RULE_STRING )
            // InternalXdiagramDsl.g:234:5: lv_ecorePath_5_0= RULE_STRING
            {
            lv_ecorePath_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_ecorePath_5_0, grammarAccess.getMetaModelAccess().getEcorePathSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ecorePath",
            						lv_ecorePath_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMetaModelAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXdiagramDsl.g:258:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXdiagramDsl.g:258:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXdiagramDsl.g:259:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXdiagramDsl.g:265:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:271:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXdiagramDsl.g:272:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXdiagramDsl.g:272:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXdiagramDsl.g:273:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXdiagramDsl.g:280:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalXdiagramDsl.g:281:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalXdiagramDsl.g:298:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // InternalXdiagramDsl.g:298:65: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // InternalXdiagramDsl.g:299:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
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
    // InternalXdiagramDsl.g:305:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:311:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalXdiagramDsl.g:312:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalXdiagramDsl.g:312:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalXdiagramDsl.g:313:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXdiagramDsl.g:323:3: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXdiagramDsl.g:324:4: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0());
                    			
                    kw=(Token)match(input,17,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:339:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalXdiagramDsl.g:339:48: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalXdiagramDsl.g:340:2: iv_ruleDiagram= ruleDiagram EOF
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
    // InternalXdiagramDsl.g:346:1: ruleDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_contains_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:352:2: ( (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) )
            // InternalXdiagramDsl.g:353:2: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            {
            // InternalXdiagramDsl.g:353:2: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            // InternalXdiagramDsl.g:354:3: otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDiagramAccess().getDiagramKeyword_0());
            		
            // InternalXdiagramDsl.g:358:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:359:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:359:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:360:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiagramRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDiagramAccess().getModelClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:378:3: ( (lv_contains_3_0= ruleContains ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==46) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXdiagramDsl.g:379:4: (lv_contains_3_0= ruleContains )
            	    {
            	    // InternalXdiagramDsl.g:379:4: (lv_contains_3_0= ruleContains )
            	    // InternalXdiagramDsl.g:380:5: lv_contains_3_0= ruleContains
            	    {

            	    					newCompositeNode(grammarAccess.getDiagramAccess().getContainsContainsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDiagramElement"
    // InternalXdiagramDsl.g:405:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // InternalXdiagramDsl.g:405:55: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // InternalXdiagramDsl.g:406:2: iv_ruleDiagramElement= ruleDiagramElement EOF
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
    // InternalXdiagramDsl.g:412:1: ruleDiagramElement returns [EObject current=null] : (this_Node_0= ruleNode | this_Link_1= ruleLink ) ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Link_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:418:2: ( (this_Node_0= ruleNode | this_Link_1= ruleLink ) )
            // InternalXdiagramDsl.g:419:2: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            {
            // InternalXdiagramDsl.g:419:2: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXdiagramDsl.g:420:3: this_Node_0= ruleNode
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
                    // InternalXdiagramDsl.g:429:3: this_Link_1= ruleLink
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


    // $ANTLR start "entryRuleLinkedFeature"
    // InternalXdiagramDsl.g:441:1: entryRuleLinkedFeature returns [EObject current=null] : iv_ruleLinkedFeature= ruleLinkedFeature EOF ;
    public final EObject entryRuleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedFeature = null;


        try {
            // InternalXdiagramDsl.g:441:54: (iv_ruleLinkedFeature= ruleLinkedFeature EOF )
            // InternalXdiagramDsl.g:442:2: iv_ruleLinkedFeature= ruleLinkedFeature EOF
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
    // InternalXdiagramDsl.g:448:1: ruleLinkedFeature returns [EObject current=null] : (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) ;
    public final EObject ruleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_Anchor_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:454:2: ( (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) )
            // InternalXdiagramDsl.g:455:2: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            {
            // InternalXdiagramDsl.g:455:2: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==46) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXdiagramDsl.g:456:3: this_Contains_0= ruleContains
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
                    // InternalXdiagramDsl.g:465:3: this_Anchor_1= ruleAnchor
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
    // InternalXdiagramDsl.g:477:1: entryRuleStyleFeature returns [EObject current=null] : iv_ruleStyleFeature= ruleStyleFeature EOF ;
    public final EObject entryRuleStyleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleFeature = null;


        try {
            // InternalXdiagramDsl.g:477:53: (iv_ruleStyleFeature= ruleStyleFeature EOF )
            // InternalXdiagramDsl.g:478:2: iv_ruleStyleFeature= ruleStyleFeature EOF
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
    // InternalXdiagramDsl.g:484:1: ruleStyleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) ;
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
            // InternalXdiagramDsl.g:490:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) )
            // InternalXdiagramDsl.g:491:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            {
            // InternalXdiagramDsl.g:491:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt7=1;
                }
                break;
            case 58:
                {
                alt7=2;
                }
                break;
            case 57:
                {
                alt7=3;
                }
                break;
            case 59:
                {
                alt7=4;
                }
                break;
            case 52:
                {
                alt7=5;
                }
                break;
            case 51:
                {
                alt7=6;
                }
                break;
            case 53:
                {
                alt7=7;
                }
                break;
            case 66:
                {
                alt7=8;
                }
                break;
            case 64:
                {
                alt7=9;
                }
                break;
            case 73:
                {
                alt7=10;
                }
                break;
            case 74:
                {
                alt7=11;
                }
                break;
            case 76:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXdiagramDsl.g:492:3: this_Size_0= ruleSize
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
                    // InternalXdiagramDsl.g:501:3: this_Position_1= rulePosition
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
                    // InternalXdiagramDsl.g:510:3: this_Point_2= rulePoint
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
                    // InternalXdiagramDsl.g:519:3: this_Corner_3= ruleCorner
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
                    // InternalXdiagramDsl.g:528:3: this_Background_4= ruleBackground
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
                    // InternalXdiagramDsl.g:537:3: this_Foreground_5= ruleForeground
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
                    // InternalXdiagramDsl.g:546:3: this_Transparency_6= ruleTransparency
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
                    // InternalXdiagramDsl.g:555:3: this_FontProperties_7= ruleFontProperties
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
                    // InternalXdiagramDsl.g:564:3: this_TextValue_8= ruleTextValue
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
                    // InternalXdiagramDsl.g:573:3: this_TextAlign_9= ruleTextAlign
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
                    // InternalXdiagramDsl.g:582:3: this_LineStyle_10= ruleLineStyle
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
                    // InternalXdiagramDsl.g:591:3: this_LineWidth_11= ruleLineWidth
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
    // InternalXdiagramDsl.g:603:1: entryRuleChildElement returns [EObject current=null] : iv_ruleChildElement= ruleChildElement EOF ;
    public final EObject entryRuleChildElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildElement = null;


        try {
            // InternalXdiagramDsl.g:603:53: (iv_ruleChildElement= ruleChildElement EOF )
            // InternalXdiagramDsl.g:604:2: iv_ruleChildElement= ruleChildElement EOF
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
    // InternalXdiagramDsl.g:610:1: ruleChildElement returns [EObject current=null] : (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) ;
    public final EObject ruleChildElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElement_0 = null;

        EObject this_Line_1 = null;

        EObject this_Arrow_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:616:2: ( (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) )
            // InternalXdiagramDsl.g:617:2: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            {
            // InternalXdiagramDsl.g:617:2: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 32:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 48:
            case 49:
            case 50:
                {
                alt8=1;
                }
                break;
            case 43:
            case 44:
                {
                alt8=2;
                }
                break;
            case 45:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXdiagramDsl.g:618:3: this_ConnectableElement_0= ruleConnectableElement
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
                    // InternalXdiagramDsl.g:627:3: this_Line_1= ruleLine
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
                    // InternalXdiagramDsl.g:636:3: this_Arrow_2= ruleArrow
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
    // InternalXdiagramDsl.g:648:1: entryRuleFeatureConditional returns [EObject current=null] : iv_ruleFeatureConditional= ruleFeatureConditional EOF ;
    public final EObject entryRuleFeatureConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureConditional = null;


        try {
            // InternalXdiagramDsl.g:648:59: (iv_ruleFeatureConditional= ruleFeatureConditional EOF )
            // InternalXdiagramDsl.g:649:2: iv_ruleFeatureConditional= ruleFeatureConditional EOF
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
    // InternalXdiagramDsl.g:655:1: ruleFeatureConditional returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleFeatureConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:661:2: ( (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalXdiagramDsl.g:662:2: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalXdiagramDsl.g:662:2: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            // InternalXdiagramDsl.g:663:3: otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureConditionalAccess().getIfKeyword_0());
            		
            // InternalXdiagramDsl.g:667:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:668:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:668:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:669:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureConditionalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureConditionalAccess().getModelAttributeEAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_14);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:683:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalXdiagramDsl.g:684:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalXdiagramDsl.g:684:4: (lv_operator_2_0= ruleOperator )
            // InternalXdiagramDsl.g:685:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getFeatureConditionalAccess().getOperatorOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalXdiagramDsl.g:702:3: ( (lv_value_3_0= ruleValue ) )
            // InternalXdiagramDsl.g:703:4: (lv_value_3_0= ruleValue )
            {
            // InternalXdiagramDsl.g:703:4: (lv_value_3_0= ruleValue )
            // InternalXdiagramDsl.g:704:5: lv_value_3_0= ruleValue
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
    // InternalXdiagramDsl.g:725:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalXdiagramDsl.g:725:45: (iv_ruleNode= ruleNode EOF )
            // InternalXdiagramDsl.g:726:2: iv_ruleNode= ruleNode EOF
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
    // InternalXdiagramDsl.g:732:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rootFigure_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:738:2: ( (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) ) ) )
            // InternalXdiagramDsl.g:739:2: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) ) )
            {
            // InternalXdiagramDsl.g:739:2: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) ) )
            // InternalXdiagramDsl.g:740:3: otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalXdiagramDsl.g:744:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:745:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:745:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:746:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeAccess().getModelClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:760:3: ( (lv_rootFigure_2_0= ruleConnectableElement ) )
            // InternalXdiagramDsl.g:761:4: (lv_rootFigure_2_0= ruleConnectableElement )
            {
            // InternalXdiagramDsl.g:761:4: (lv_rootFigure_2_0= ruleConnectableElement )
            // InternalXdiagramDsl.g:762:5: lv_rootFigure_2_0= ruleConnectableElement
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getRootFigureConnectableElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rootFigure_2_0=ruleConnectableElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"rootFigure",
            						lv_rootFigure_2_0,
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
    // InternalXdiagramDsl.g:783:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalXdiagramDsl.g:783:45: (iv_ruleLink= ruleLink EOF )
            // InternalXdiagramDsl.g:784:2: iv_ruleLink= ruleLink EOF
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
    // InternalXdiagramDsl.g:790:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;
        Token lv_complex_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_features_10_0 = null;

        EObject lv_decorators_11_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:796:2: ( (otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}' ) )
            // InternalXdiagramDsl.g:797:2: (otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}' )
            {
            // InternalXdiagramDsl.g:797:2: (otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}' )
            // InternalXdiagramDsl.g:798:3: otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalXdiagramDsl.g:802:3: ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXdiagramDsl.g:803:4: ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:803:4: ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:804:5: ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:804:5: ( (lv_reference_1_0= 'reference' ) )
                    // InternalXdiagramDsl.g:805:6: (lv_reference_1_0= 'reference' )
                    {
                    // InternalXdiagramDsl.g:805:6: (lv_reference_1_0= 'reference' )
                    // InternalXdiagramDsl.g:806:7: lv_reference_1_0= 'reference'
                    {
                    lv_reference_1_0=(Token)match(input,22,FOLLOW_11); 

                    							newLeafNode(lv_reference_1_0, grammarAccess.getLinkAccess().getReferenceReferenceKeyword_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    							setWithLastConsumed(current, "reference", true, "reference");
                    						

                    }


                    }

                    // InternalXdiagramDsl.g:818:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:819:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:819:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:820:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_1_0_1_0());
                    						
                    pushFollow(FOLLOW_5);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:836:4: ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:836:4: ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:837:5: ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:837:5: ( (lv_complex_3_0= 'class' ) )
                    // InternalXdiagramDsl.g:838:6: (lv_complex_3_0= 'class' )
                    {
                    // InternalXdiagramDsl.g:838:6: (lv_complex_3_0= 'class' )
                    // InternalXdiagramDsl.g:839:7: lv_complex_3_0= 'class'
                    {
                    lv_complex_3_0=(Token)match(input,23,FOLLOW_11); 

                    							newLeafNode(lv_complex_3_0, grammarAccess.getLinkAccess().getComplexClassKeyword_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    							setWithLastConsumed(current, "complex", true, "class");
                    						

                    }


                    }

                    // InternalXdiagramDsl.g:851:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:852:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:852:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:853:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_1_1_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_11); 

                    					newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getSourceKeyword_1_1_2());
                    				
                    // InternalXdiagramDsl.g:871:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:872:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:872:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:873:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_1_1_3_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_11); 

                    					newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getTargetKeyword_1_1_4());
                    				
                    // InternalXdiagramDsl.g:891:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:892:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:892:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:893:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_1_1_5_0());
                    						
                    pushFollow(FOLLOW_5);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:913:3: ( (lv_features_10_0= ruleLinkFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==51||LA10_0==74||LA10_0==76) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXdiagramDsl.g:914:4: (lv_features_10_0= ruleLinkFeature )
            	    {
            	    // InternalXdiagramDsl.g:914:4: (lv_features_10_0= ruleLinkFeature )
            	    // InternalXdiagramDsl.g:915:5: lv_features_10_0= ruleLinkFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getFeaturesLinkFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_features_10_0=ruleLinkFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_10_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LinkFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalXdiagramDsl.g:932:3: ( (lv_decorators_11_0= ruleDecorator ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXdiagramDsl.g:933:4: (lv_decorators_11_0= ruleDecorator )
            	    {
            	    // InternalXdiagramDsl.g:933:4: (lv_decorators_11_0= ruleDecorator )
            	    // InternalXdiagramDsl.g:934:5: lv_decorators_11_0= ruleDecorator
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getDecoratorsDecoratorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_decorators_11_0=ruleDecorator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"decorators",
            	    						lv_decorators_11_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.Decorator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalXdiagramDsl.g:959:1: entryRuleLinkFeature returns [EObject current=null] : iv_ruleLinkFeature= ruleLinkFeature EOF ;
    public final EObject entryRuleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkFeature = null;


        try {
            // InternalXdiagramDsl.g:959:52: (iv_ruleLinkFeature= ruleLinkFeature EOF )
            // InternalXdiagramDsl.g:960:2: iv_ruleLinkFeature= ruleLinkFeature EOF
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
    // InternalXdiagramDsl.g:966:1: ruleLinkFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) ;
    public final EObject ruleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_LineStyle_1 = null;

        EObject this_LineWidth_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:972:2: ( (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) )
            // InternalXdiagramDsl.g:973:2: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            {
            // InternalXdiagramDsl.g:973:2: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt12=1;
                }
                break;
            case 74:
                {
                alt12=2;
                }
                break;
            case 76:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalXdiagramDsl.g:974:3: this_Foreground_0= ruleForeground
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
                    // InternalXdiagramDsl.g:983:3: this_LineStyle_1= ruleLineStyle
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
                    // InternalXdiagramDsl.g:992:3: this_LineWidth_2= ruleLineWidth
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
    // InternalXdiagramDsl.g:1004:1: entryRuleDecorator returns [EObject current=null] : iv_ruleDecorator= ruleDecorator EOF ;
    public final EObject entryRuleDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorator = null;


        try {
            // InternalXdiagramDsl.g:1004:50: (iv_ruleDecorator= ruleDecorator EOF )
            // InternalXdiagramDsl.g:1005:2: iv_ruleDecorator= ruleDecorator EOF
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
    // InternalXdiagramDsl.g:1011:1: ruleDecorator returns [EObject current=null] : (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) ;
    public final EObject ruleDecorator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_position_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1017:2: ( (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) )
            // InternalXdiagramDsl.g:1018:2: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            {
            // InternalXdiagramDsl.g:1018:2: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            // InternalXdiagramDsl.g:1019:3: otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getDecoratorAccess().getDecoratorKeyword_0());
            		
            // InternalXdiagramDsl.g:1023:3: ( (lv_position_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1024:4: (lv_position_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1024:4: (lv_position_1_0= RULE_INT )
            // InternalXdiagramDsl.g:1025:5: lv_position_1_0= RULE_INT
            {
            lv_position_1_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDecoratorAccess().getPercentSignKeyword_2());
            		
            // InternalXdiagramDsl.g:1045:3: ( (lv_element_3_0= ruleDecoratorElement ) )
            // InternalXdiagramDsl.g:1046:4: (lv_element_3_0= ruleDecoratorElement )
            {
            // InternalXdiagramDsl.g:1046:4: (lv_element_3_0= ruleDecoratorElement )
            // InternalXdiagramDsl.g:1047:5: lv_element_3_0= ruleDecoratorElement
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
    // InternalXdiagramDsl.g:1068:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // InternalXdiagramDsl.g:1068:47: (iv_ruleAnchor= ruleAnchor EOF )
            // InternalXdiagramDsl.g:1069:2: iv_ruleAnchor= ruleAnchor EOF
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
    // InternalXdiagramDsl.g:1075:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalXdiagramDsl.g:1081:2: ( (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:1082:2: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:1082:2: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:1083:3: otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAnchorKeyword_0());
            		
            // InternalXdiagramDsl.g:1087:3: ( (lv_direction_1_0= ruleAnchorDirection ) )
            // InternalXdiagramDsl.g:1088:4: (lv_direction_1_0= ruleAnchorDirection )
            {
            // InternalXdiagramDsl.g:1088:4: (lv_direction_1_0= ruleAnchorDirection )
            // InternalXdiagramDsl.g:1089:5: lv_direction_1_0= ruleAnchorDirection
            {

            					newCompositeNode(grammarAccess.getAnchorAccess().getDirectionAnchorDirectionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalXdiagramDsl.g:1106:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:1107:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:1107:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:1108:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnchorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAnchorAccess().getModelReferenceEReferenceCrossReference_2_0());
            				
            pushFollow(FOLLOW_26);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:1122:3: (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXdiagramDsl.g:1123:4: otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnchorAccess().getMaxKeyword_3_0());
                    			
                    // InternalXdiagramDsl.g:1127:4: ( (lv_max_4_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:1128:5: (lv_max_4_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:1128:5: (lv_max_4_0= RULE_INT )
                    // InternalXdiagramDsl.g:1129:6: lv_max_4_0= RULE_INT
                    {
                    lv_max_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            // InternalXdiagramDsl.g:1146:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXdiagramDsl.g:1147:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:1147:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:1148:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getAnchorAccess().getConditionalFeatureConditionalParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:1173:1: entryRuleCustomColor returns [EObject current=null] : iv_ruleCustomColor= ruleCustomColor EOF ;
    public final EObject entryRuleCustomColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomColor = null;


        try {
            // InternalXdiagramDsl.g:1173:52: (iv_ruleCustomColor= ruleCustomColor EOF )
            // InternalXdiagramDsl.g:1174:2: iv_ruleCustomColor= ruleCustomColor EOF
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
    // InternalXdiagramDsl.g:1180:1: ruleCustomColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) ;
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
            // InternalXdiagramDsl.g:1186:2: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) )
            // InternalXdiagramDsl.g:1187:2: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            {
            // InternalXdiagramDsl.g:1187:2: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            // InternalXdiagramDsl.g:1188:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomColorAccess().getColorKeyword_0());
            		
            // InternalXdiagramDsl.g:1192:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:1193:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:1193:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:1194:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalXdiagramDsl.g:1210:3: ( (lv_R_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1211:4: (lv_R_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1211:4: (lv_R_2_0= RULE_INT )
            // InternalXdiagramDsl.g:1212:5: lv_R_2_0= RULE_INT
            {
            lv_R_2_0=(Token)match(input,RULE_INT,FOLLOW_22); 

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

            // InternalXdiagramDsl.g:1228:3: ( (lv_G_3_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1229:4: (lv_G_3_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1229:4: (lv_G_3_0= RULE_INT )
            // InternalXdiagramDsl.g:1230:5: lv_G_3_0= RULE_INT
            {
            lv_G_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

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

            // InternalXdiagramDsl.g:1246:3: ( (lv_B_4_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1247:4: (lv_B_4_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1247:4: (lv_B_4_0= RULE_INT )
            // InternalXdiagramDsl.g:1248:5: lv_B_4_0= RULE_INT
            {
            lv_B_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:1272:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXdiagramDsl.g:1272:46: (iv_ruleColor= ruleColor EOF )
            // InternalXdiagramDsl.g:1273:2: iv_ruleColor= ruleColor EOF
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
    // InternalXdiagramDsl.g:1279:1: ruleColor returns [EObject current=null] : ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_default_0_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1285:2: ( ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalXdiagramDsl.g:1286:2: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalXdiagramDsl.g:1286:2: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=79 && LA15_0<=94)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalXdiagramDsl.g:1287:3: ( (lv_default_0_0= ruleDefaultColor ) )
                    {
                    // InternalXdiagramDsl.g:1287:3: ( (lv_default_0_0= ruleDefaultColor ) )
                    // InternalXdiagramDsl.g:1288:4: (lv_default_0_0= ruleDefaultColor )
                    {
                    // InternalXdiagramDsl.g:1288:4: (lv_default_0_0= ruleDefaultColor )
                    // InternalXdiagramDsl.g:1289:5: lv_default_0_0= ruleDefaultColor
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
                    // InternalXdiagramDsl.g:1307:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:1307:3: ( (otherlv_1= RULE_ID ) )
                    // InternalXdiagramDsl.g:1308:4: (otherlv_1= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:1308:4: (otherlv_1= RULE_ID )
                    // InternalXdiagramDsl.g:1309:5: otherlv_1= RULE_ID
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
    // InternalXdiagramDsl.g:1324:1: entryRuleConnectableElement returns [EObject current=null] : iv_ruleConnectableElement= ruleConnectableElement EOF ;
    public final EObject entryRuleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElement = null;


        try {
            // InternalXdiagramDsl.g:1324:59: (iv_ruleConnectableElement= ruleConnectableElement EOF )
            // InternalXdiagramDsl.g:1325:2: iv_ruleConnectableElement= ruleConnectableElement EOF
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
    // InternalXdiagramDsl.g:1331:1: ruleConnectableElement returns [EObject current=null] : (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) ;
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
            // InternalXdiagramDsl.g:1337:2: ( (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) )
            // InternalXdiagramDsl.g:1338:2: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            {
            // InternalXdiagramDsl.g:1338:2: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            int alt16=9;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
            case 39:
                {
                alt16=3;
                }
                break;
            case 40:
            case 41:
                {
                alt16=4;
                }
                break;
            case 48:
                {
                alt16=5;
                }
                break;
            case 49:
                {
                alt16=6;
                }
                break;
            case 50:
                {
                alt16=7;
                }
                break;
            case 32:
                {
                alt16=8;
                }
                break;
            case 42:
                {
                alt16=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalXdiagramDsl.g:1339:3: this_Rectangle_0= ruleRectangle
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
                    // InternalXdiagramDsl.g:1348:3: this_Rhombus_1= ruleRhombus
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
                    // InternalXdiagramDsl.g:1357:3: this_Ellipse_2= ruleEllipse
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
                    // InternalXdiagramDsl.g:1366:3: this_Polyline_3= rulePolyline
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
                    // InternalXdiagramDsl.g:1375:3: this_Label_4= ruleLabel
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
                    // InternalXdiagramDsl.g:1384:3: this_Image_5= ruleImage
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
                    // InternalXdiagramDsl.g:1393:3: this_Invisible_6= ruleInvisible
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
                    // InternalXdiagramDsl.g:1402:3: this_Custom_7= ruleCustom
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
                    // InternalXdiagramDsl.g:1411:3: this_Triangle_8= ruleTriangle
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
    // InternalXdiagramDsl.g:1423:1: entryRuleDecoratorElement returns [EObject current=null] : iv_ruleDecoratorElement= ruleDecoratorElement EOF ;
    public final EObject entryRuleDecoratorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoratorElement = null;


        try {
            // InternalXdiagramDsl.g:1423:57: (iv_ruleDecoratorElement= ruleDecoratorElement EOF )
            // InternalXdiagramDsl.g:1424:2: iv_ruleDecoratorElement= ruleDecoratorElement EOF
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
    // InternalXdiagramDsl.g:1430:1: ruleDecoratorElement returns [EObject current=null] : (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) ;
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
            // InternalXdiagramDsl.g:1436:2: ( (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) )
            // InternalXdiagramDsl.g:1437:2: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            {
            // InternalXdiagramDsl.g:1437:2: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            int alt17=8;
            switch ( input.LA(1) ) {
            case 38:
            case 39:
                {
                alt17=1;
                }
                break;
            case 37:
                {
                alt17=2;
                }
                break;
            case 40:
            case 41:
                {
                alt17=3;
                }
                break;
            case 42:
                {
                alt17=4;
                }
                break;
            case 48:
                {
                alt17=5;
                }
                break;
            case 49:
                {
                alt17=6;
                }
                break;
            case 45:
                {
                alt17=7;
                }
                break;
            case 43:
            case 44:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalXdiagramDsl.g:1438:3: this_Ellipse_0= ruleEllipse
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
                    // InternalXdiagramDsl.g:1447:3: this_Rhombus_1= ruleRhombus
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
                    // InternalXdiagramDsl.g:1456:3: this_Polyline_2= rulePolyline
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
                    // InternalXdiagramDsl.g:1465:3: this_Triangle_3= ruleTriangle
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
                    // InternalXdiagramDsl.g:1474:3: this_Label_4= ruleLabel
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
                    // InternalXdiagramDsl.g:1483:3: this_Image_5= ruleImage
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
                    // InternalXdiagramDsl.g:1492:3: this_Arrow_6= ruleArrow
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
                    // InternalXdiagramDsl.g:1501:3: this_Line_7= ruleLine
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
    // InternalXdiagramDsl.g:1513:1: entryRuleConnectableElementFeature returns [EObject current=null] : iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF ;
    public final EObject entryRuleConnectableElementFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElementFeature = null;


        try {
            // InternalXdiagramDsl.g:1513:66: (iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF )
            // InternalXdiagramDsl.g:1514:2: iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF
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
    // InternalXdiagramDsl.g:1520:1: ruleConnectableElementFeature returns [EObject current=null] : (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) ;
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
            // InternalXdiagramDsl.g:1526:2: ( (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) )
            // InternalXdiagramDsl.g:1527:2: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            {
            // InternalXdiagramDsl.g:1527:2: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            int alt18=10;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt18=1;
                }
                break;
            case 54:
                {
                alt18=2;
                }
                break;
            case 51:
            case 52:
                {
                alt18=3;
                }
                break;
            case 53:
                {
                alt18=4;
                }
                break;
            case 74:
                {
                alt18=5;
                }
                break;
            case 76:
                {
                alt18=6;
                }
                break;
            case 46:
                {
                alt18=7;
                }
                break;
            case 28:
                {
                alt18=8;
                }
                break;
            case 60:
                {
                alt18=9;
                }
                break;
            case 50:
                {
                alt18=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalXdiagramDsl.g:1528:3: this_Position_0= rulePosition
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
                    // InternalXdiagramDsl.g:1537:3: this_Size_1= ruleSize
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
                    // InternalXdiagramDsl.g:1546:3: this_ColorFeature_2= ruleColorFeature
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
                    // InternalXdiagramDsl.g:1555:3: this_Transparency_3= ruleTransparency
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
                    // InternalXdiagramDsl.g:1564:3: this_LineStyle_4= ruleLineStyle
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
                    // InternalXdiagramDsl.g:1573:3: this_LineWidth_5= ruleLineWidth
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
                    // InternalXdiagramDsl.g:1582:3: this_Contains_6= ruleContains
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
                    // InternalXdiagramDsl.g:1591:3: this_Anchor_7= ruleAnchor
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
                    // InternalXdiagramDsl.g:1600:3: this_Layout_8= ruleLayout
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
                    // InternalXdiagramDsl.g:1609:3: this_Visible_9= ruleVisible
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
    // InternalXdiagramDsl.g:1621:1: entryRuleCustomFigure returns [EObject current=null] : iv_ruleCustomFigure= ruleCustomFigure EOF ;
    public final EObject entryRuleCustomFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFigure = null;


        try {
            // InternalXdiagramDsl.g:1621:53: (iv_ruleCustomFigure= ruleCustomFigure EOF )
            // InternalXdiagramDsl.g:1622:2: iv_ruleCustomFigure= ruleCustomFigure EOF
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
    // InternalXdiagramDsl.g:1628:1: ruleCustomFigure returns [EObject current=null] : (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleCustomFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1634:2: ( (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) )
            // InternalXdiagramDsl.g:1635:2: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            {
            // InternalXdiagramDsl.g:1635:2: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            // InternalXdiagramDsl.g:1636:3: otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomFigureAccess().getFigureKeyword_0());
            		
            // InternalXdiagramDsl.g:1640:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:1641:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:1641:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:1642:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomFigureAccess().getAsKeyword_2());
            		
            // InternalXdiagramDsl.g:1662:3: ( (lv_element_3_0= ruleConnectableElement ) )
            // InternalXdiagramDsl.g:1663:4: (lv_element_3_0= ruleConnectableElement )
            {
            // InternalXdiagramDsl.g:1663:4: (lv_element_3_0= ruleConnectableElement )
            // InternalXdiagramDsl.g:1664:5: lv_element_3_0= ruleConnectableElement
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
    // InternalXdiagramDsl.g:1685:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalXdiagramDsl.g:1685:47: (iv_ruleCustom= ruleCustom EOF )
            // InternalXdiagramDsl.g:1686:2: iv_ruleCustom= ruleCustom EOF
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
    // InternalXdiagramDsl.g:1692:1: ruleCustom returns [EObject current=null] : (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1698:2: ( (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:1699:2: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:1699:2: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:1700:3: otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomAccess().getFigureKeyword_0());
            		
            // InternalXdiagramDsl.g:1704:3: ( (otherlv_1= RULE_ID ) )
            // InternalXdiagramDsl.g:1705:4: (otherlv_1= RULE_ID )
            {
            // InternalXdiagramDsl.g:1705:4: (otherlv_1= RULE_ID )
            // InternalXdiagramDsl.g:1706:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getFigureCustomFigureCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:1721:3: ( (lv_features_3_0= ruleLinkedFeature ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28||LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1722:4: (lv_features_3_0= ruleLinkedFeature )
            	    {
            	    // InternalXdiagramDsl.g:1722:4: (lv_features_3_0= ruleLinkedFeature )
            	    // InternalXdiagramDsl.g:1723:5: lv_features_3_0= ruleLinkedFeature
            	    {

            	    					newCompositeNode(grammarAccess.getCustomAccess().getFeaturesLinkedFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_features_3_0=ruleLinkedFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LinkedFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalXdiagramDsl.g:1740:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1741:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:1745:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:1746:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:1746:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:1747:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getCustomAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_children_5_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCustomRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_5_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalXdiagramDsl.g:1773:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalXdiagramDsl.g:1773:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalXdiagramDsl.g:1774:2: iv_ruleRectangle= ruleRectangle EOF
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
    // InternalXdiagramDsl.g:1780:1: ruleRectangle returns [EObject current=null] : ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token lv_rectangle_0_0=null;
        Token lv_square_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1786:2: ( ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:1787:2: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:1787:2: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:1788:3: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:1788:3: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            else if ( (LA21_0==36) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalXdiagramDsl.g:1789:4: ( (lv_rectangle_0_0= 'rectangle' ) )
                    {
                    // InternalXdiagramDsl.g:1789:4: ( (lv_rectangle_0_0= 'rectangle' ) )
                    // InternalXdiagramDsl.g:1790:5: (lv_rectangle_0_0= 'rectangle' )
                    {
                    // InternalXdiagramDsl.g:1790:5: (lv_rectangle_0_0= 'rectangle' )
                    // InternalXdiagramDsl.g:1791:6: lv_rectangle_0_0= 'rectangle'
                    {
                    lv_rectangle_0_0=(Token)match(input,35,FOLLOW_5); 

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
                    // InternalXdiagramDsl.g:1804:4: ( (lv_square_1_0= 'square' ) )
                    {
                    // InternalXdiagramDsl.g:1804:4: ( (lv_square_1_0= 'square' ) )
                    // InternalXdiagramDsl.g:1805:5: (lv_square_1_0= 'square' )
                    {
                    // InternalXdiagramDsl.g:1805:5: (lv_square_1_0= 'square' )
                    // InternalXdiagramDsl.g:1806:6: lv_square_1_0= 'square'
                    {
                    lv_square_1_0=(Token)match(input,36,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXdiagramDsl.g:1823:3: ( (lv_features_3_0= ruleRectangleFeature ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28||LA22_0==46||(LA22_0>=50 && LA22_0<=54)||(LA22_0>=58 && LA22_0<=60)||LA22_0==74||LA22_0==76) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1824:4: (lv_features_3_0= ruleRectangleFeature )
            	    {
            	    // InternalXdiagramDsl.g:1824:4: (lv_features_3_0= ruleRectangleFeature )
            	    // InternalXdiagramDsl.g:1825:5: lv_features_3_0= ruleRectangleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getRectangleAccess().getFeaturesRectangleFeatureParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_features_3_0=ruleRectangleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.RectangleFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalXdiagramDsl.g:1842:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1843:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRectangleAccess().getChildKeyword_3_0());
            	    			
            	    // InternalXdiagramDsl.g:1847:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:1848:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:1848:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:1849:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getRectangleAccess().getChildrenChildElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_children_5_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_5_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRectangleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalXdiagramDsl.g:1875:1: entryRuleRectangleFeature returns [EObject current=null] : iv_ruleRectangleFeature= ruleRectangleFeature EOF ;
    public final EObject entryRuleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleFeature = null;


        try {
            // InternalXdiagramDsl.g:1875:57: (iv_ruleRectangleFeature= ruleRectangleFeature EOF )
            // InternalXdiagramDsl.g:1876:2: iv_ruleRectangleFeature= ruleRectangleFeature EOF
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
    // InternalXdiagramDsl.g:1882:1: ruleRectangleFeature returns [EObject current=null] : (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) ;
    public final EObject ruleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElementFeature_0 = null;

        EObject this_Corner_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1888:2: ( (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) )
            // InternalXdiagramDsl.g:1889:2: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            {
            // InternalXdiagramDsl.g:1889:2: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28||LA24_0==46||(LA24_0>=50 && LA24_0<=54)||LA24_0==58||LA24_0==60||LA24_0==74||LA24_0==76) ) {
                alt24=1;
            }
            else if ( (LA24_0==59) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalXdiagramDsl.g:1890:3: this_ConnectableElementFeature_0= ruleConnectableElementFeature
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
                    // InternalXdiagramDsl.g:1899:3: this_Corner_1= ruleCorner
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
    // InternalXdiagramDsl.g:1911:1: entryRuleRhombus returns [EObject current=null] : iv_ruleRhombus= ruleRhombus EOF ;
    public final EObject entryRuleRhombus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhombus = null;


        try {
            // InternalXdiagramDsl.g:1911:48: (iv_ruleRhombus= ruleRhombus EOF )
            // InternalXdiagramDsl.g:1912:2: iv_ruleRhombus= ruleRhombus EOF
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
    // InternalXdiagramDsl.g:1918:1: ruleRhombus returns [EObject current=null] : ( () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleRhombus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1924:2: ( ( () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:1925:2: ( () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:1925:2: ( () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:1926:3: () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:1926:3: ()
            // InternalXdiagramDsl.g:1927:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRhombusAccess().getRhombusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRhombusAccess().getRhombusKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getRhombusAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:1941:3: ( (lv_features_3_0= ruleConnectableElementFeature ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28||LA25_0==46||(LA25_0>=50 && LA25_0<=54)||LA25_0==58||LA25_0==60||LA25_0==74||LA25_0==76) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1942:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:1942:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:1943:5: lv_features_3_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getRhombusAccess().getFeaturesConnectableElementFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_features_3_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRhombusRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElementFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalXdiagramDsl.g:1960:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1961:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRhombusAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:1965:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:1966:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:1966:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:1967:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getRhombusAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_children_5_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRhombusRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_5_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRhombusAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalXdiagramDsl.g:1993:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // InternalXdiagramDsl.g:1993:48: (iv_ruleEllipse= ruleEllipse EOF )
            // InternalXdiagramDsl.g:1994:2: iv_ruleEllipse= ruleEllipse EOF
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
    // InternalXdiagramDsl.g:2000:1: ruleEllipse returns [EObject current=null] : ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEllipse() throws RecognitionException {
        EObject current = null;

        Token lv_ellipse_0_0=null;
        Token lv_circle_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2006:2: ( ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:2007:2: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:2007:2: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:2008:3: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:2008:3: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            else if ( (LA27_0==39) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalXdiagramDsl.g:2009:4: ( (lv_ellipse_0_0= 'ellipse' ) )
                    {
                    // InternalXdiagramDsl.g:2009:4: ( (lv_ellipse_0_0= 'ellipse' ) )
                    // InternalXdiagramDsl.g:2010:5: (lv_ellipse_0_0= 'ellipse' )
                    {
                    // InternalXdiagramDsl.g:2010:5: (lv_ellipse_0_0= 'ellipse' )
                    // InternalXdiagramDsl.g:2011:6: lv_ellipse_0_0= 'ellipse'
                    {
                    lv_ellipse_0_0=(Token)match(input,38,FOLLOW_5); 

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
                    // InternalXdiagramDsl.g:2024:4: ( (lv_circle_1_0= 'circle' ) )
                    {
                    // InternalXdiagramDsl.g:2024:4: ( (lv_circle_1_0= 'circle' ) )
                    // InternalXdiagramDsl.g:2025:5: (lv_circle_1_0= 'circle' )
                    {
                    // InternalXdiagramDsl.g:2025:5: (lv_circle_1_0= 'circle' )
                    // InternalXdiagramDsl.g:2026:6: lv_circle_1_0= 'circle'
                    {
                    lv_circle_1_0=(Token)match(input,39,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXdiagramDsl.g:2043:3: ( (lv_features_3_0= ruleConnectableElementFeature ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28||LA28_0==46||(LA28_0>=50 && LA28_0<=54)||LA28_0==58||LA28_0==60||LA28_0==74||LA28_0==76) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2044:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2044:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2045:5: lv_features_3_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEllipseAccess().getFeaturesConnectableElementFeatureParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_features_3_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElementFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalXdiagramDsl.g:2062:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==34) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2063:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEllipseAccess().getChildKeyword_3_0());
            	    			
            	    // InternalXdiagramDsl.g:2067:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2068:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2068:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2069:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getEllipseAccess().getChildrenChildElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_children_5_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_5_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEllipseAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalXdiagramDsl.g:2095:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // InternalXdiagramDsl.g:2095:49: (iv_rulePolyline= rulePolyline EOF )
            // InternalXdiagramDsl.g:2096:2: iv_rulePolyline= rulePolyline EOF
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
    // InternalXdiagramDsl.g:2102:1: rulePolyline returns [EObject current=null] : ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}' ) ;
    public final EObject rulePolyline() throws RecognitionException {
        EObject current = null;

        Token lv_polygon_0_0=null;
        Token lv_polyline_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_features_3_0 = null;

        EObject lv_features_4_0 = null;

        EObject lv_features_5_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_children_8_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2108:2: ( ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}' ) )
            // InternalXdiagramDsl.g:2109:2: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}' )
            {
            // InternalXdiagramDsl.g:2109:2: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}' )
            // InternalXdiagramDsl.g:2110:3: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}'
            {
            // InternalXdiagramDsl.g:2110:3: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            else if ( (LA30_0==41) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalXdiagramDsl.g:2111:4: ( (lv_polygon_0_0= 'polygon' ) )
                    {
                    // InternalXdiagramDsl.g:2111:4: ( (lv_polygon_0_0= 'polygon' ) )
                    // InternalXdiagramDsl.g:2112:5: (lv_polygon_0_0= 'polygon' )
                    {
                    // InternalXdiagramDsl.g:2112:5: (lv_polygon_0_0= 'polygon' )
                    // InternalXdiagramDsl.g:2113:6: lv_polygon_0_0= 'polygon'
                    {
                    lv_polygon_0_0=(Token)match(input,40,FOLLOW_5); 

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
                    // InternalXdiagramDsl.g:2126:4: ( (lv_polyline_1_0= 'polyline' ) )
                    {
                    // InternalXdiagramDsl.g:2126:4: ( (lv_polyline_1_0= 'polyline' ) )
                    // InternalXdiagramDsl.g:2127:5: (lv_polyline_1_0= 'polyline' )
                    {
                    // InternalXdiagramDsl.g:2127:5: (lv_polyline_1_0= 'polyline' )
                    // InternalXdiagramDsl.g:2128:6: lv_polyline_1_0= 'polyline'
                    {
                    lv_polyline_1_0=(Token)match(input,41,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getPolylineAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXdiagramDsl.g:2145:3: ( (lv_features_3_0= rulePoint ) )
            // InternalXdiagramDsl.g:2146:4: (lv_features_3_0= rulePoint )
            {
            // InternalXdiagramDsl.g:2146:4: (lv_features_3_0= rulePoint )
            // InternalXdiagramDsl.g:2147:5: lv_features_3_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_features_3_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolylineRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_3_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:2164:3: ( (lv_features_4_0= rulePoint ) )
            // InternalXdiagramDsl.g:2165:4: (lv_features_4_0= rulePoint )
            {
            // InternalXdiagramDsl.g:2165:4: (lv_features_4_0= rulePoint )
            // InternalXdiagramDsl.g:2166:5: lv_features_4_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_features_4_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolylineRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_4_0,
            						"pt.iscte.xdiagram.dsl.XdiagramDsl.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:2183:3: ( (lv_features_5_0= rulePoint ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==57) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2184:4: (lv_features_5_0= rulePoint )
            	    {
            	    // InternalXdiagramDsl.g:2184:4: (lv_features_5_0= rulePoint )
            	    // InternalXdiagramDsl.g:2185:5: lv_features_5_0= rulePoint
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalXdiagramDsl.g:2202:3: ( (lv_features_6_0= ruleConnectableElementFeature ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==28||LA32_0==46||(LA32_0>=50 && LA32_0<=54)||LA32_0==58||LA32_0==60||LA32_0==74||LA32_0==76) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2203:4: (lv_features_6_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2203:4: (lv_features_6_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2204:5: lv_features_6_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesConnectableElementFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_features_6_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElementFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalXdiagramDsl.g:2221:3: (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==34) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2222:4: otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) )
            	    {
            	    otherlv_7=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPolylineAccess().getChildKeyword_6_0());
            	    			
            	    // InternalXdiagramDsl.g:2226:4: ( (lv_children_8_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2227:5: (lv_children_8_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2227:5: (lv_children_8_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2228:6: lv_children_8_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getPolylineAccess().getChildrenChildElementParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_children_8_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_8_0,
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

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPolylineAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalXdiagramDsl.g:2254:1: entryRuleTriangle returns [EObject current=null] : iv_ruleTriangle= ruleTriangle EOF ;
    public final EObject entryRuleTriangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriangle = null;


        try {
            // InternalXdiagramDsl.g:2254:49: (iv_ruleTriangle= ruleTriangle EOF )
            // InternalXdiagramDsl.g:2255:2: iv_ruleTriangle= ruleTriangle EOF
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
    // InternalXdiagramDsl.g:2261:1: ruleTriangle returns [EObject current=null] : ( () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTriangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2267:2: ( ( () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:2268:2: ( () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:2268:2: ( () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:2269:3: () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:2269:3: ()
            // InternalXdiagramDsl.g:2270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriangleAccess().getTriangleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTriangleAccess().getTriangleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getTriangleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2284:3: ( (lv_features_3_0= ruleConnectableElementFeature ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28||LA34_0==46||(LA34_0>=50 && LA34_0<=54)||LA34_0==58||LA34_0==60||LA34_0==74||LA34_0==76) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2285:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2285:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2286:5: lv_features_3_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getTriangleAccess().getFeaturesConnectableElementFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_features_3_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTriangleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ConnectableElementFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalXdiagramDsl.g:2303:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2304:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTriangleAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:2308:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2309:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2309:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2310:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getTriangleAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_children_5_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTriangleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_5_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTriangleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalXdiagramDsl.g:2336:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalXdiagramDsl.g:2336:45: (iv_ruleLine= ruleLine EOF )
            // InternalXdiagramDsl.g:2337:2: iv_ruleLine= ruleLine EOF
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
    // InternalXdiagramDsl.g:2343:1: ruleLine returns [EObject current=null] : ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}' ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_horizontal_1_0=null;
        Token lv_vertical_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2349:2: ( ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}' ) )
            // InternalXdiagramDsl.g:2350:2: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}' )
            {
            // InternalXdiagramDsl.g:2350:2: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}' )
            // InternalXdiagramDsl.g:2351:3: () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}'
            {
            // InternalXdiagramDsl.g:2351:3: ()
            // InternalXdiagramDsl.g:2352:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineAccess().getLineAction_0(),
            					current);
            			

            }

            // InternalXdiagramDsl.g:2358:3: ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            else if ( (LA36_0==44) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalXdiagramDsl.g:2359:4: ( (lv_horizontal_1_0= 'hline' ) )
                    {
                    // InternalXdiagramDsl.g:2359:4: ( (lv_horizontal_1_0= 'hline' ) )
                    // InternalXdiagramDsl.g:2360:5: (lv_horizontal_1_0= 'hline' )
                    {
                    // InternalXdiagramDsl.g:2360:5: (lv_horizontal_1_0= 'hline' )
                    // InternalXdiagramDsl.g:2361:6: lv_horizontal_1_0= 'hline'
                    {
                    lv_horizontal_1_0=(Token)match(input,43,FOLLOW_5); 

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
                    // InternalXdiagramDsl.g:2374:4: ( (lv_vertical_2_0= 'vline' ) )
                    {
                    // InternalXdiagramDsl.g:2374:4: ( (lv_vertical_2_0= 'vline' ) )
                    // InternalXdiagramDsl.g:2375:5: (lv_vertical_2_0= 'vline' )
                    {
                    // InternalXdiagramDsl.g:2375:5: (lv_vertical_2_0= 'vline' )
                    // InternalXdiagramDsl.g:2376:6: lv_vertical_2_0= 'vline'
                    {
                    lv_vertical_2_0=(Token)match(input,44,FOLLOW_5); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2393:3: ( (lv_features_4_0= ruleLineFeature ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=50 && LA37_0<=51)||LA37_0==54||LA37_0==58||LA37_0==74||LA37_0==76) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2394:4: (lv_features_4_0= ruleLineFeature )
            	    {
            	    // InternalXdiagramDsl.g:2394:4: (lv_features_4_0= ruleLineFeature )
            	    // InternalXdiagramDsl.g:2395:5: lv_features_4_0= ruleLineFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLineAccess().getFeaturesLineFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_features_4_0=ruleLineFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_4_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LineFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLineAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalXdiagramDsl.g:2420:1: entryRuleLineFeature returns [EObject current=null] : iv_ruleLineFeature= ruleLineFeature EOF ;
    public final EObject entryRuleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineFeature = null;


        try {
            // InternalXdiagramDsl.g:2420:52: (iv_ruleLineFeature= ruleLineFeature EOF )
            // InternalXdiagramDsl.g:2421:2: iv_ruleLineFeature= ruleLineFeature EOF
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
    // InternalXdiagramDsl.g:2427:1: ruleLineFeature returns [EObject current=null] : (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) ;
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
            // InternalXdiagramDsl.g:2433:2: ( (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) )
            // InternalXdiagramDsl.g:2434:2: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            {
            // InternalXdiagramDsl.g:2434:2: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt38=1;
                }
                break;
            case 74:
                {
                alt38=2;
                }
                break;
            case 51:
                {
                alt38=3;
                }
                break;
            case 58:
                {
                alt38=4;
                }
                break;
            case 54:
                {
                alt38=5;
                }
                break;
            case 50:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalXdiagramDsl.g:2435:3: this_LineWidth_0= ruleLineWidth
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
                    // InternalXdiagramDsl.g:2444:3: this_LineStyle_1= ruleLineStyle
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
                    // InternalXdiagramDsl.g:2453:3: this_Foreground_2= ruleForeground
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
                    // InternalXdiagramDsl.g:2462:3: this_Position_3= rulePosition
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
                    // InternalXdiagramDsl.g:2471:3: this_Size_4= ruleSize
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
                    // InternalXdiagramDsl.g:2480:3: this_Visible_5= ruleVisible
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
    // InternalXdiagramDsl.g:2492:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalXdiagramDsl.g:2492:46: (iv_ruleArrow= ruleArrow EOF )
            // InternalXdiagramDsl.g:2493:2: iv_ruleArrow= ruleArrow EOF
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
    // InternalXdiagramDsl.g:2499:1: ruleArrow returns [EObject current=null] : ( () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2505:2: ( ( () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}' ) )
            // InternalXdiagramDsl.g:2506:2: ( () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}' )
            {
            // InternalXdiagramDsl.g:2506:2: ( () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}' )
            // InternalXdiagramDsl.g:2507:3: () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}'
            {
            // InternalXdiagramDsl.g:2507:3: ()
            // InternalXdiagramDsl.g:2508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrowAccess().getArrowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getArrowAccess().getArrowKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getArrowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2522:3: ( (lv_features_3_0= ruleLineFeature ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=50 && LA39_0<=51)||LA39_0==54||LA39_0==58||LA39_0==74||LA39_0==76) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2523:4: (lv_features_3_0= ruleLineFeature )
            	    {
            	    // InternalXdiagramDsl.g:2523:4: (lv_features_3_0= ruleLineFeature )
            	    // InternalXdiagramDsl.g:2524:5: lv_features_3_0= ruleLineFeature
            	    {

            	    					newCompositeNode(grammarAccess.getArrowAccess().getFeaturesLineFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_features_3_0=ruleLineFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArrowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LineFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArrowAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalXdiagramDsl.g:2549:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalXdiagramDsl.g:2549:49: (iv_ruleContains= ruleContains EOF )
            // InternalXdiagramDsl.g:2550:2: iv_ruleContains= ruleContains EOF
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
    // InternalXdiagramDsl.g:2556:1: ruleContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2562:2: ( (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:2563:2: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:2563:2: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:2564:3: otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
            		
            // InternalXdiagramDsl.g:2568:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:2569:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:2569:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:2570:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainsAccess().getModelReferenceEReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:2584:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXdiagramDsl.g:2585:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:2585:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:2586:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getContainsAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:2611:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalXdiagramDsl.g:2611:46: (iv_ruleValue= ruleValue EOF )
            // InternalXdiagramDsl.g:2612:2: iv_ruleValue= ruleValue EOF
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
    // InternalXdiagramDsl.g:2618:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_DoubleValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_EnumValue_4 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2624:2: ( (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) )
            // InternalXdiagramDsl.g:2625:2: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            {
            // InternalXdiagramDsl.g:2625:2: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            int alt41=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==16) ) {
                    alt41=2;
                }
                else if ( (LA41_1==EOF||LA41_1==30) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 47:
                {
                alt41=3;
                }
                break;
            case 97:
            case 98:
                {
                alt41=4;
                }
                break;
            case RULE_ID:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalXdiagramDsl.g:2626:3: this_IntValue_0= ruleIntValue
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
                    // InternalXdiagramDsl.g:2635:3: this_DoubleValue_1= ruleDoubleValue
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
                    // InternalXdiagramDsl.g:2644:3: this_StringValue_2= ruleStringValue
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
                    // InternalXdiagramDsl.g:2653:3: this_BooleanValue_3= ruleBooleanValue
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
                    // InternalXdiagramDsl.g:2662:3: this_EnumValue_4= ruleEnumValue
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
    // InternalXdiagramDsl.g:2674:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalXdiagramDsl.g:2674:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalXdiagramDsl.g:2675:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalXdiagramDsl.g:2681:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:2687:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalXdiagramDsl.g:2688:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalXdiagramDsl.g:2688:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalXdiagramDsl.g:2689:3: (lv_value_0_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:2689:3: (lv_value_0_0= RULE_INT )
            // InternalXdiagramDsl.g:2690:4: lv_value_0_0= RULE_INT
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
    // InternalXdiagramDsl.g:2709:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // InternalXdiagramDsl.g:2709:52: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // InternalXdiagramDsl.g:2710:2: iv_ruleDoubleValue= ruleDoubleValue EOF
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
    // InternalXdiagramDsl.g:2716:1: ruleDoubleValue returns [EObject current=null] : ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueInt_0_0=null;
        Token otherlv_1=null;
        Token lv_valueDecimal_2_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:2722:2: ( ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) )
            // InternalXdiagramDsl.g:2723:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            {
            // InternalXdiagramDsl.g:2723:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            // InternalXdiagramDsl.g:2724:3: ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) )
            {
            // InternalXdiagramDsl.g:2724:3: ( (lv_valueInt_0_0= RULE_INT ) )
            // InternalXdiagramDsl.g:2725:4: (lv_valueInt_0_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:2725:4: (lv_valueInt_0_0= RULE_INT )
            // InternalXdiagramDsl.g:2726:5: lv_valueInt_0_0= RULE_INT
            {
            lv_valueInt_0_0=(Token)match(input,RULE_INT,FOLLOW_37); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleValueAccess().getFullStopKeyword_1());
            		
            // InternalXdiagramDsl.g:2746:3: ( (lv_valueDecimal_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:2747:4: (lv_valueDecimal_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:2747:4: (lv_valueDecimal_2_0= RULE_INT )
            // InternalXdiagramDsl.g:2748:5: lv_valueDecimal_2_0= RULE_INT
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
    // InternalXdiagramDsl.g:2768:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalXdiagramDsl.g:2768:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalXdiagramDsl.g:2769:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalXdiagramDsl.g:2775:1: ruleStringValue returns [EObject current=null] : ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_null_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:2781:2: ( ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalXdiagramDsl.g:2782:2: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalXdiagramDsl.g:2782:2: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_STRING) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalXdiagramDsl.g:2783:3: ( (lv_null_0_0= 'null' ) )
                    {
                    // InternalXdiagramDsl.g:2783:3: ( (lv_null_0_0= 'null' ) )
                    // InternalXdiagramDsl.g:2784:4: (lv_null_0_0= 'null' )
                    {
                    // InternalXdiagramDsl.g:2784:4: (lv_null_0_0= 'null' )
                    // InternalXdiagramDsl.g:2785:5: lv_null_0_0= 'null'
                    {
                    lv_null_0_0=(Token)match(input,47,FOLLOW_2); 

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
                    // InternalXdiagramDsl.g:2798:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalXdiagramDsl.g:2798:3: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:2799:4: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:2799:4: (lv_value_1_0= RULE_STRING )
                    // InternalXdiagramDsl.g:2800:5: lv_value_1_0= RULE_STRING
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
    // InternalXdiagramDsl.g:2820:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalXdiagramDsl.g:2820:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalXdiagramDsl.g:2821:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalXdiagramDsl.g:2827:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteral ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2833:2: ( ( (lv_value_0_0= ruleBooleanLiteral ) ) )
            // InternalXdiagramDsl.g:2834:2: ( (lv_value_0_0= ruleBooleanLiteral ) )
            {
            // InternalXdiagramDsl.g:2834:2: ( (lv_value_0_0= ruleBooleanLiteral ) )
            // InternalXdiagramDsl.g:2835:3: (lv_value_0_0= ruleBooleanLiteral )
            {
            // InternalXdiagramDsl.g:2835:3: (lv_value_0_0= ruleBooleanLiteral )
            // InternalXdiagramDsl.g:2836:4: lv_value_0_0= ruleBooleanLiteral
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
    // InternalXdiagramDsl.g:2856:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalXdiagramDsl.g:2856:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalXdiagramDsl.g:2857:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalXdiagramDsl.g:2863:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:2869:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalXdiagramDsl.g:2870:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalXdiagramDsl.g:2870:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalXdiagramDsl.g:2871:3: (lv_name_0_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:2871:3: (lv_name_0_0= RULE_ID )
            // InternalXdiagramDsl.g:2872:4: lv_name_0_0= RULE_ID
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
    // InternalXdiagramDsl.g:2891:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalXdiagramDsl.g:2891:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalXdiagramDsl.g:2892:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalXdiagramDsl.g:2898:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2904:2: ( ( () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:2905:2: ( () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:2905:2: ( () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:2906:3: () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:2906:3: ()
            // InternalXdiagramDsl.g:2907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2921:3: ( (lv_features_3_0= ruleLabelFeature ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=50 && LA43_0<=51)||LA43_0==54||LA43_0==58||LA43_0==64||LA43_0==66||LA43_0==73) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2922:4: (lv_features_3_0= ruleLabelFeature )
            	    {
            	    // InternalXdiagramDsl.g:2922:4: (lv_features_3_0= ruleLabelFeature )
            	    // InternalXdiagramDsl.g:2923:5: lv_features_3_0= ruleLabelFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLabelAccess().getFeaturesLabelFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_features_3_0=ruleLabelFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLabelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.LabelFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalXdiagramDsl.g:2940:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==34) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2941:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:2945:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2946:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2946:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2947:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getLabelAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_children_5_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLabelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_5_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalXdiagramDsl.g:2973:1: entryRuleLabelFeature returns [EObject current=null] : iv_ruleLabelFeature= ruleLabelFeature EOF ;
    public final EObject entryRuleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelFeature = null;


        try {
            // InternalXdiagramDsl.g:2973:53: (iv_ruleLabelFeature= ruleLabelFeature EOF )
            // InternalXdiagramDsl.g:2974:2: iv_ruleLabelFeature= ruleLabelFeature EOF
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
    // InternalXdiagramDsl.g:2980:1: ruleLabelFeature returns [EObject current=null] : (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) ;
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
            // InternalXdiagramDsl.g:2986:2: ( (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) )
            // InternalXdiagramDsl.g:2987:2: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            {
            // InternalXdiagramDsl.g:2987:2: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            int alt45=7;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt45=1;
                }
                break;
            case 51:
                {
                alt45=2;
                }
                break;
            case 66:
                {
                alt45=3;
                }
                break;
            case 54:
                {
                alt45=4;
                }
                break;
            case 58:
                {
                alt45=5;
                }
                break;
            case 50:
                {
                alt45=6;
                }
                break;
            case 73:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalXdiagramDsl.g:2988:3: this_TextValue_0= ruleTextValue
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
                    // InternalXdiagramDsl.g:2997:3: this_Foreground_1= ruleForeground
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
                    // InternalXdiagramDsl.g:3006:3: this_FontProperties_2= ruleFontProperties
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
                    // InternalXdiagramDsl.g:3015:3: this_Size_3= ruleSize
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
                    // InternalXdiagramDsl.g:3024:3: this_Position_4= rulePosition
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
                    // InternalXdiagramDsl.g:3033:3: this_Visible_5= ruleVisible
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
                    // InternalXdiagramDsl.g:3042:3: this_TextAlign_6= ruleTextAlign
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
    // InternalXdiagramDsl.g:3054:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalXdiagramDsl.g:3054:46: (iv_ruleImage= ruleImage EOF )
            // InternalXdiagramDsl.g:3055:2: iv_ruleImage= ruleImage EOF
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
    // InternalXdiagramDsl.g:3061:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_imageId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3067:2: ( (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:3068:2: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:3068:2: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:3069:3: otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
            		
            // InternalXdiagramDsl.g:3073:3: ( (lv_imageId_1_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:3074:4: (lv_imageId_1_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:3074:4: (lv_imageId_1_0= RULE_STRING )
            // InternalXdiagramDsl.g:3075:5: lv_imageId_1_0= RULE_STRING
            {
            lv_imageId_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:3095:3: ( (lv_features_3_0= ruleImageFeature ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=53 && LA46_0<=54)||LA46_0==58) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3096:4: (lv_features_3_0= ruleImageFeature )
            	    {
            	    // InternalXdiagramDsl.g:3096:4: (lv_features_3_0= ruleImageFeature )
            	    // InternalXdiagramDsl.g:3097:5: lv_features_3_0= ruleImageFeature
            	    {

            	    					newCompositeNode(grammarAccess.getImageAccess().getFeaturesImageFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_features_3_0=ruleImageFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.ImageFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalXdiagramDsl.g:3114:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==34) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3115:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getImageAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:3119:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:3120:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:3120:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:3121:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getImageAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_children_5_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_5_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.ChildElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalXdiagramDsl.g:3147:1: entryRuleImageFeature returns [EObject current=null] : iv_ruleImageFeature= ruleImageFeature EOF ;
    public final EObject entryRuleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFeature = null;


        try {
            // InternalXdiagramDsl.g:3147:53: (iv_ruleImageFeature= ruleImageFeature EOF )
            // InternalXdiagramDsl.g:3148:2: iv_ruleImageFeature= ruleImageFeature EOF
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
    // InternalXdiagramDsl.g:3154:1: ruleImageFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) ;
    public final EObject ruleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Transparency_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3160:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) )
            // InternalXdiagramDsl.g:3161:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            {
            // InternalXdiagramDsl.g:3161:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt48=1;
                }
                break;
            case 58:
                {
                alt48=2;
                }
                break;
            case 53:
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
                    // InternalXdiagramDsl.g:3162:3: this_Size_0= ruleSize
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
                    // InternalXdiagramDsl.g:3171:3: this_Position_1= rulePosition
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
                    // InternalXdiagramDsl.g:3180:3: this_Transparency_2= ruleTransparency
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
    // InternalXdiagramDsl.g:3192:1: entryRuleInvisible returns [EObject current=null] : iv_ruleInvisible= ruleInvisible EOF ;
    public final EObject entryRuleInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisible = null;


        try {
            // InternalXdiagramDsl.g:3192:50: (iv_ruleInvisible= ruleInvisible EOF )
            // InternalXdiagramDsl.g:3193:2: iv_ruleInvisible= ruleInvisible EOF
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
    // InternalXdiagramDsl.g:3199:1: ruleInvisible returns [EObject current=null] : ( () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleInvisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3205:2: ( ( () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:3206:2: ( () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:3206:2: ( () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:3207:3: () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:3207:3: ()
            // InternalXdiagramDsl.g:3208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvisibleAccess().getInvisibleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInvisibleAccess().getInvisibleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getInvisibleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:3222:3: ( (lv_features_3_0= ruleInvisibleFeature ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==28||LA49_0==46||LA49_0==54||LA49_0==58||LA49_0==60) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3223:4: (lv_features_3_0= ruleInvisibleFeature )
            	    {
            	    // InternalXdiagramDsl.g:3223:4: (lv_features_3_0= ruleInvisibleFeature )
            	    // InternalXdiagramDsl.g:3224:5: lv_features_3_0= ruleInvisibleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getInvisibleAccess().getFeaturesInvisibleFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_features_3_0=ruleInvisibleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInvisibleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.InvisibleFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalXdiagramDsl.g:3241:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==34) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3242:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInvisibleAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:3246:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:3247:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:3247:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:3248:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getInvisibleAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_children_5_0=ruleChildElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInvisibleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_5_0,
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInvisibleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalXdiagramDsl.g:3274:1: entryRuleInvisibleFeature returns [EObject current=null] : iv_ruleInvisibleFeature= ruleInvisibleFeature EOF ;
    public final EObject entryRuleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisibleFeature = null;


        try {
            // InternalXdiagramDsl.g:3274:57: (iv_ruleInvisibleFeature= ruleInvisibleFeature EOF )
            // InternalXdiagramDsl.g:3275:2: iv_ruleInvisibleFeature= ruleInvisibleFeature EOF
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
    // InternalXdiagramDsl.g:3281:1: ruleInvisibleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) ;
    public final EObject ruleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_LinkedFeature_2 = null;

        EObject this_Layout_3 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3287:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) )
            // InternalXdiagramDsl.g:3288:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            {
            // InternalXdiagramDsl.g:3288:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt51=1;
                }
                break;
            case 58:
                {
                alt51=2;
                }
                break;
            case 28:
            case 46:
                {
                alt51=3;
                }
                break;
            case 60:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalXdiagramDsl.g:3289:3: this_Size_0= ruleSize
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
                    // InternalXdiagramDsl.g:3298:3: this_Position_1= rulePosition
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
                    // InternalXdiagramDsl.g:3307:3: this_LinkedFeature_2= ruleLinkedFeature
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
                    // InternalXdiagramDsl.g:3316:3: this_Layout_3= ruleLayout
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
    // InternalXdiagramDsl.g:3328:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // InternalXdiagramDsl.g:3328:53: (iv_ruleColorFeature= ruleColorFeature EOF )
            // InternalXdiagramDsl.g:3329:2: iv_ruleColorFeature= ruleColorFeature EOF
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
    // InternalXdiagramDsl.g:3335:1: ruleColorFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_Background_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3341:2: ( (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) )
            // InternalXdiagramDsl.g:3342:2: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            {
            // InternalXdiagramDsl.g:3342:2: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==51) ) {
                alt52=1;
            }
            else if ( (LA52_0==52) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalXdiagramDsl.g:3343:3: this_Foreground_0= ruleForeground
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
                    // InternalXdiagramDsl.g:3352:3: this_Background_1= ruleBackground
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
    // InternalXdiagramDsl.g:3364:1: entryRuleForeground returns [EObject current=null] : iv_ruleForeground= ruleForeground EOF ;
    public final EObject entryRuleForeground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeground = null;


        try {
            // InternalXdiagramDsl.g:3364:51: (iv_ruleForeground= ruleForeground EOF )
            // InternalXdiagramDsl.g:3365:2: iv_ruleForeground= ruleForeground EOF
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
    // InternalXdiagramDsl.g:3371:1: ruleForeground returns [EObject current=null] : ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleForeground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3377:2: ( ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:3378:2: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:3378:2: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:3379:3: ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalXdiagramDsl.g:3379:3: ( (lv_type_0_0= 'foreground' ) )
            // InternalXdiagramDsl.g:3380:4: (lv_type_0_0= 'foreground' )
            {
            // InternalXdiagramDsl.g:3380:4: (lv_type_0_0= 'foreground' )
            // InternalXdiagramDsl.g:3381:5: lv_type_0_0= 'foreground'
            {
            lv_type_0_0=(Token)match(input,51,FOLLOW_41); 

            					newLeafNode(lv_type_0_0, grammarAccess.getForegroundAccess().getTypeForegroundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForegroundRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "foreground");
            				

            }


            }

            // InternalXdiagramDsl.g:3393:3: ( (lv_color_1_0= ruleColor ) )
            // InternalXdiagramDsl.g:3394:4: (lv_color_1_0= ruleColor )
            {
            // InternalXdiagramDsl.g:3394:4: (lv_color_1_0= ruleColor )
            // InternalXdiagramDsl.g:3395:5: lv_color_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getForegroundAccess().getColorColorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalXdiagramDsl.g:3412:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==19) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXdiagramDsl.g:3413:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3413:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3414:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getForegroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3439:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalXdiagramDsl.g:3439:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalXdiagramDsl.g:3440:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalXdiagramDsl.g:3446:1: ruleBackground returns [EObject current=null] : ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3452:2: ( ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:3453:2: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:3453:2: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:3454:3: ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalXdiagramDsl.g:3454:3: ( (lv_type_0_0= 'background' ) )
            // InternalXdiagramDsl.g:3455:4: (lv_type_0_0= 'background' )
            {
            // InternalXdiagramDsl.g:3455:4: (lv_type_0_0= 'background' )
            // InternalXdiagramDsl.g:3456:5: lv_type_0_0= 'background'
            {
            lv_type_0_0=(Token)match(input,52,FOLLOW_41); 

            					newLeafNode(lv_type_0_0, grammarAccess.getBackgroundAccess().getTypeBackgroundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "background");
            				

            }


            }

            // InternalXdiagramDsl.g:3468:3: ( (lv_color_1_0= ruleColor ) )
            // InternalXdiagramDsl.g:3469:4: (lv_color_1_0= ruleColor )
            {
            // InternalXdiagramDsl.g:3469:4: (lv_color_1_0= ruleColor )
            // InternalXdiagramDsl.g:3470:5: lv_color_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getColorColorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalXdiagramDsl.g:3487:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==19) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalXdiagramDsl.g:3488:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3488:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3489:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getBackgroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3514:1: entryRuleTransparency returns [EObject current=null] : iv_ruleTransparency= ruleTransparency EOF ;
    public final EObject entryRuleTransparency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransparency = null;


        try {
            // InternalXdiagramDsl.g:3514:53: (iv_ruleTransparency= ruleTransparency EOF )
            // InternalXdiagramDsl.g:3515:2: iv_ruleTransparency= ruleTransparency EOF
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
    // InternalXdiagramDsl.g:3521:1: ruleTransparency returns [EObject current=null] : (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTransparency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_percent_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3527:2: ( (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:3528:2: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:3528:2: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:3529:3: otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTransparencyAccess().getTransparencyKeyword_0());
            		
            // InternalXdiagramDsl.g:3533:3: ( (lv_percent_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3534:4: (lv_percent_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3534:4: (lv_percent_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3535:5: lv_percent_1_0= RULE_INT
            {
            lv_percent_1_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getTransparencyAccess().getPercentSignKeyword_2());
            		
            // InternalXdiagramDsl.g:3555:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==19) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXdiagramDsl.g:3556:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3556:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3557:5: lv_conditional_3_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getTransparencyAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3582:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalXdiagramDsl.g:3582:45: (iv_ruleSize= ruleSize EOF )
            // InternalXdiagramDsl.g:3583:2: iv_ruleSize= ruleSize EOF
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
    // InternalXdiagramDsl.g:3589:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) ;
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
            // InternalXdiagramDsl.g:3595:2: ( (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) )
            // InternalXdiagramDsl.g:3596:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            {
            // InternalXdiagramDsl.g:3596:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            // InternalXdiagramDsl.g:3597:3: otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            // InternalXdiagramDsl.g:3601:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3602:4: (lv_width_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3602:4: (lv_width_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3603:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_42); 

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

            // InternalXdiagramDsl.g:3619:3: ( (lv_widthRelative_2_0= ']' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==55) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalXdiagramDsl.g:3620:4: (lv_widthRelative_2_0= ']' )
                    {
                    // InternalXdiagramDsl.g:3620:4: (lv_widthRelative_2_0= ']' )
                    // InternalXdiagramDsl.g:3621:5: lv_widthRelative_2_0= ']'
                    {
                    lv_widthRelative_2_0=(Token)match(input,55,FOLLOW_43); 

                    					newLeafNode(lv_widthRelative_2_0, grammarAccess.getSizeAccess().getWidthRelativeRightSquareBracketKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSizeRule());
                    					}
                    					setWithLastConsumed(current, "widthRelative", true, "]");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:3633:3: ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalXdiagramDsl.g:3634:4: ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )?
                    {
                    // InternalXdiagramDsl.g:3634:4: ( (lv_height_3_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:3635:5: (lv_height_3_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:3635:5: (lv_height_3_0= RULE_INT )
                    // InternalXdiagramDsl.g:3636:6: lv_height_3_0= RULE_INT
                    {
                    lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_44); 

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

                    // InternalXdiagramDsl.g:3652:4: ( (lv_heightRelative_4_0= ']' ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==55) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalXdiagramDsl.g:3653:5: (lv_heightRelative_4_0= ']' )
                            {
                            // InternalXdiagramDsl.g:3653:5: (lv_heightRelative_4_0= ']' )
                            // InternalXdiagramDsl.g:3654:6: lv_heightRelative_4_0= ']'
                            {
                            lv_heightRelative_4_0=(Token)match(input,55,FOLLOW_45); 

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

            // InternalXdiagramDsl.g:3667:3: ( (lv_resizable_5_0= 'resizable' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==56) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalXdiagramDsl.g:3668:4: (lv_resizable_5_0= 'resizable' )
                    {
                    // InternalXdiagramDsl.g:3668:4: (lv_resizable_5_0= 'resizable' )
                    // InternalXdiagramDsl.g:3669:5: lv_resizable_5_0= 'resizable'
                    {
                    lv_resizable_5_0=(Token)match(input,56,FOLLOW_27); 

                    					newLeafNode(lv_resizable_5_0, grammarAccess.getSizeAccess().getResizableResizableKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSizeRule());
                    					}
                    					setWithLastConsumed(current, "resizable", true, "resizable");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:3681:3: ( (lv_conditional_6_0= ruleFeatureConditional ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==19) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalXdiagramDsl.g:3682:4: (lv_conditional_6_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3682:4: (lv_conditional_6_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3683:5: lv_conditional_6_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getSizeAccess().getConditionalFeatureConditionalParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3708:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalXdiagramDsl.g:3708:46: (iv_rulePoint= rulePoint EOF )
            // InternalXdiagramDsl.g:3709:2: iv_rulePoint= rulePoint EOF
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
    // InternalXdiagramDsl.g:3715:1: rulePoint returns [EObject current=null] : (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3721:2: ( (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:3722:2: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:3722:2: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:3723:3: otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getPointKeyword_0());
            		
            // InternalXdiagramDsl.g:3727:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3728:4: (lv_x_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3728:4: (lv_x_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3729:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

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

            // InternalXdiagramDsl.g:3745:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3746:4: (lv_y_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3746:4: (lv_y_2_0= RULE_INT )
            // InternalXdiagramDsl.g:3747:5: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            // InternalXdiagramDsl.g:3763:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==19) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalXdiagramDsl.g:3764:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3764:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3765:5: lv_conditional_3_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getPointAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3790:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalXdiagramDsl.g:3790:49: (iv_rulePosition= rulePosition EOF )
            // InternalXdiagramDsl.g:3791:2: iv_rulePosition= rulePosition EOF
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
    // InternalXdiagramDsl.g:3797:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalXdiagramDsl.g:3803:2: ( (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:3804:2: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:3804:2: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:3805:3: otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            // InternalXdiagramDsl.g:3809:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3810:4: (lv_x_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3810:4: (lv_x_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3811:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_46); 

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

            // InternalXdiagramDsl.g:3827:3: ( (lv_xRelative_2_0= '%' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==27) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXdiagramDsl.g:3828:4: (lv_xRelative_2_0= '%' )
                    {
                    // InternalXdiagramDsl.g:3828:4: (lv_xRelative_2_0= '%' )
                    // InternalXdiagramDsl.g:3829:5: lv_xRelative_2_0= '%'
                    {
                    lv_xRelative_2_0=(Token)match(input,27,FOLLOW_22); 

                    					newLeafNode(lv_xRelative_2_0, grammarAccess.getPositionAccess().getXRelativePercentSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPositionRule());
                    					}
                    					setWithLastConsumed(current, "xRelative", true, "%");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:3841:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3842:4: (lv_y_3_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3842:4: (lv_y_3_0= RULE_INT )
            // InternalXdiagramDsl.g:3843:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_47); 

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

            // InternalXdiagramDsl.g:3859:3: ( (lv_yRelative_4_0= '%' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==27) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXdiagramDsl.g:3860:4: (lv_yRelative_4_0= '%' )
                    {
                    // InternalXdiagramDsl.g:3860:4: (lv_yRelative_4_0= '%' )
                    // InternalXdiagramDsl.g:3861:5: lv_yRelative_4_0= '%'
                    {
                    lv_yRelative_4_0=(Token)match(input,27,FOLLOW_27); 

                    					newLeafNode(lv_yRelative_4_0, grammarAccess.getPositionAccess().getYRelativePercentSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPositionRule());
                    					}
                    					setWithLastConsumed(current, "yRelative", true, "%");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:3873:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==19) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXdiagramDsl.g:3874:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3874:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3875:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getPositionAccess().getConditionalFeatureConditionalParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3900:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // InternalXdiagramDsl.g:3900:47: (iv_ruleCorner= ruleCorner EOF )
            // InternalXdiagramDsl.g:3901:2: iv_ruleCorner= ruleCorner EOF
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
    // InternalXdiagramDsl.g:3907:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3913:2: ( (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:3914:2: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:3914:2: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:3915:3: otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
            		
            // InternalXdiagramDsl.g:3919:3: ( (lv_angle_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3920:4: (lv_angle_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3920:4: (lv_angle_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3921:5: lv_angle_1_0= RULE_INT
            {
            lv_angle_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            // InternalXdiagramDsl.g:3937:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==19) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXdiagramDsl.g:3938:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3938:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3939:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getCornerAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3964:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalXdiagramDsl.g:3964:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalXdiagramDsl.g:3965:2: iv_ruleLayout= ruleLayout EOF
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
    // InternalXdiagramDsl.g:3971:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalXdiagramDsl.g:3977:2: ( (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:3978:2: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:3978:2: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:3979:3: otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
            		
            // InternalXdiagramDsl.g:3983:3: ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==61) ) {
                alt66=1;
            }
            else if ( (LA66_0==62) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalXdiagramDsl.g:3984:4: ( (lv_vertical_1_0= 'vertical' ) )
                    {
                    // InternalXdiagramDsl.g:3984:4: ( (lv_vertical_1_0= 'vertical' ) )
                    // InternalXdiagramDsl.g:3985:5: (lv_vertical_1_0= 'vertical' )
                    {
                    // InternalXdiagramDsl.g:3985:5: (lv_vertical_1_0= 'vertical' )
                    // InternalXdiagramDsl.g:3986:6: lv_vertical_1_0= 'vertical'
                    {
                    lv_vertical_1_0=(Token)match(input,61,FOLLOW_49); 

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
                    // InternalXdiagramDsl.g:3999:4: ( (lv_horizontal_2_0= 'horizontal' ) )
                    {
                    // InternalXdiagramDsl.g:3999:4: ( (lv_horizontal_2_0= 'horizontal' ) )
                    // InternalXdiagramDsl.g:4000:5: (lv_horizontal_2_0= 'horizontal' )
                    {
                    // InternalXdiagramDsl.g:4000:5: (lv_horizontal_2_0= 'horizontal' )
                    // InternalXdiagramDsl.g:4001:6: lv_horizontal_2_0= 'horizontal'
                    {
                    lv_horizontal_2_0=(Token)match(input,62,FOLLOW_49); 

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

            // InternalXdiagramDsl.g:4014:3: (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==63) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXdiagramDsl.g:4015:4: otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getMarginKeyword_2_0());
                    			
                    // InternalXdiagramDsl.g:4019:4: ( (lv_margin_4_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:4020:5: (lv_margin_4_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:4020:5: (lv_margin_4_0= RULE_INT )
                    // InternalXdiagramDsl.g:4021:6: lv_margin_4_0= RULE_INT
                    {
                    lv_margin_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            // InternalXdiagramDsl.g:4038:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==19) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXdiagramDsl.g:4039:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4039:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4040:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getLayoutAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4065:1: entryRuleVisible returns [EObject current=null] : iv_ruleVisible= ruleVisible EOF ;
    public final EObject entryRuleVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisible = null;


        try {
            // InternalXdiagramDsl.g:4065:48: (iv_ruleVisible= ruleVisible EOF )
            // InternalXdiagramDsl.g:4066:2: iv_ruleVisible= ruleVisible EOF
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
    // InternalXdiagramDsl.g:4072:1: ruleVisible returns [EObject current=null] : (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) ;
    public final EObject ruleVisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_conditional_1_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4078:2: ( (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) )
            // InternalXdiagramDsl.g:4079:2: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            {
            // InternalXdiagramDsl.g:4079:2: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            // InternalXdiagramDsl.g:4080:3: otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibleAccess().getInvisibleKeyword_0());
            		
            // InternalXdiagramDsl.g:4084:3: ( (lv_conditional_1_0= ruleFeatureConditional ) )
            // InternalXdiagramDsl.g:4085:4: (lv_conditional_1_0= ruleFeatureConditional )
            {
            // InternalXdiagramDsl.g:4085:4: (lv_conditional_1_0= ruleFeatureConditional )
            // InternalXdiagramDsl.g:4086:5: lv_conditional_1_0= ruleFeatureConditional
            {

            					newCompositeNode(grammarAccess.getVisibleAccess().getConditionalFeatureConditionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_2=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4111:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalXdiagramDsl.g:4111:50: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalXdiagramDsl.g:4112:2: iv_ruleTextValue= ruleTextValue EOF
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
    // InternalXdiagramDsl.g:4118:1: ruleTextValue returns [EObject current=null] : ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_parts_2_0 = null;

        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4124:2: ( ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:4125:2: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:4125:2: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:4126:3: () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            // InternalXdiagramDsl.g:4126:3: ()
            // InternalXdiagramDsl.g:4127:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextValueAccess().getTextValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getTextValueAccess().getTextKeyword_1());
            		
            // InternalXdiagramDsl.g:4137:3: ( (lv_parts_2_0= ruleTextPart ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_ID)||LA69_0==65) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalXdiagramDsl.g:4138:4: (lv_parts_2_0= ruleTextPart )
            	    {
            	    // InternalXdiagramDsl.g:4138:4: (lv_parts_2_0= ruleTextPart )
            	    // InternalXdiagramDsl.g:4139:5: lv_parts_2_0= ruleTextPart
            	    {

            	    					newCompositeNode(grammarAccess.getTextValueAccess().getPartsTextPartParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_51);
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
            	    break loop69;
                }
            } while (true);

            // InternalXdiagramDsl.g:4156:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==19) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXdiagramDsl.g:4157:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4157:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4158:5: lv_conditional_3_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getTextValueAccess().getConditionalFeatureConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4183:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // InternalXdiagramDsl.g:4183:49: (iv_ruleTextPart= ruleTextPart EOF )
            // InternalXdiagramDsl.g:4184:2: iv_ruleTextPart= ruleTextPart EOF
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
    // InternalXdiagramDsl.g:4190:1: ruleTextPart returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_editable_1_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4196:2: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) )
            // InternalXdiagramDsl.g:4197:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            {
            // InternalXdiagramDsl.g:4197:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_STRING) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_ID||LA72_0==65) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalXdiagramDsl.g:4198:3: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // InternalXdiagramDsl.g:4198:3: ( (lv_text_0_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:4199:4: (lv_text_0_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:4199:4: (lv_text_0_0= RULE_STRING )
                    // InternalXdiagramDsl.g:4200:5: lv_text_0_0= RULE_STRING
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
                    // InternalXdiagramDsl.g:4217:3: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:4217:3: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:4218:4: ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:4218:4: ( (lv_editable_1_0= 'edit:' ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==65) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalXdiagramDsl.g:4219:5: (lv_editable_1_0= 'edit:' )
                            {
                            // InternalXdiagramDsl.g:4219:5: (lv_editable_1_0= 'edit:' )
                            // InternalXdiagramDsl.g:4220:6: lv_editable_1_0= 'edit:'
                            {
                            lv_editable_1_0=(Token)match(input,65,FOLLOW_11); 

                            						newLeafNode(lv_editable_1_0, grammarAccess.getTextPartAccess().getEditableEditKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTextPartRule());
                            						}
                            						setWithLastConsumed(current, "editable", true, "edit:");
                            					

                            }


                            }
                            break;

                    }

                    // InternalXdiagramDsl.g:4232:4: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:4233:5: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:4233:5: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:4234:6: ruleQualifiedName
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
    // InternalXdiagramDsl.g:4253:1: entryRuleFontProperties returns [EObject current=null] : iv_ruleFontProperties= ruleFontProperties EOF ;
    public final EObject entryRuleFontProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontProperties = null;


        try {
            // InternalXdiagramDsl.g:4253:55: (iv_ruleFontProperties= ruleFontProperties EOF )
            // InternalXdiagramDsl.g:4254:2: iv_ruleFontProperties= ruleFontProperties EOF
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
    // InternalXdiagramDsl.g:4260:1: ruleFontProperties returns [EObject current=null] : ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) ;
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
            // InternalXdiagramDsl.g:4266:2: ( ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) )
            // InternalXdiagramDsl.g:4267:2: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            {
            // InternalXdiagramDsl.g:4267:2: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            // InternalXdiagramDsl.g:4268:3: () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';'
            {
            // InternalXdiagramDsl.g:4268:3: ()
            // InternalXdiagramDsl.g:4269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFontPropertiesAccess().getFontPropertiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getFontPropertiesAccess().getFontKeyword_1());
            		
            // InternalXdiagramDsl.g:4279:3: ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )?
            int alt73=5;
            switch ( input.LA(1) ) {
                case 67:
                    {
                    alt73=1;
                    }
                    break;
                case 68:
                    {
                    alt73=2;
                    }
                    break;
                case 69:
                    {
                    alt73=3;
                    }
                    break;
                case 70:
                    {
                    alt73=4;
                    }
                    break;
            }

            switch (alt73) {
                case 1 :
                    // InternalXdiagramDsl.g:4280:4: ( (lv_face_2_0= 'arial' ) )
                    {
                    // InternalXdiagramDsl.g:4280:4: ( (lv_face_2_0= 'arial' ) )
                    // InternalXdiagramDsl.g:4281:5: (lv_face_2_0= 'arial' )
                    {
                    // InternalXdiagramDsl.g:4281:5: (lv_face_2_0= 'arial' )
                    // InternalXdiagramDsl.g:4282:6: lv_face_2_0= 'arial'
                    {
                    lv_face_2_0=(Token)match(input,67,FOLLOW_53); 

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
                    // InternalXdiagramDsl.g:4295:4: otherlv_3= 'verdana'
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_53); 

                    				newLeafNode(otherlv_3, grammarAccess.getFontPropertiesAccess().getVerdanaKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4300:4: otherlv_4= 'courier'
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_53); 

                    				newLeafNode(otherlv_4, grammarAccess.getFontPropertiesAccess().getCourierKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:4305:4: otherlv_5= 'times'
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_53); 

                    				newLeafNode(otherlv_5, grammarAccess.getFontPropertiesAccess().getTimesKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalXdiagramDsl.g:4310:3: ( (lv_size_6_0= RULE_INT ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_INT) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalXdiagramDsl.g:4311:4: (lv_size_6_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:4311:4: (lv_size_6_0= RULE_INT )
                    // InternalXdiagramDsl.g:4312:5: lv_size_6_0= RULE_INT
                    {
                    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_54); 

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

            // InternalXdiagramDsl.g:4328:3: ( (lv_bold_7_0= 'bold' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==71) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalXdiagramDsl.g:4329:4: (lv_bold_7_0= 'bold' )
                    {
                    // InternalXdiagramDsl.g:4329:4: (lv_bold_7_0= 'bold' )
                    // InternalXdiagramDsl.g:4330:5: lv_bold_7_0= 'bold'
                    {
                    lv_bold_7_0=(Token)match(input,71,FOLLOW_55); 

                    					newLeafNode(lv_bold_7_0, grammarAccess.getFontPropertiesAccess().getBoldBoldKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFontPropertiesRule());
                    					}
                    					setWithLastConsumed(current, "bold", true, "bold");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4342:3: ( (lv_italics_8_0= 'italics' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==72) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalXdiagramDsl.g:4343:4: (lv_italics_8_0= 'italics' )
                    {
                    // InternalXdiagramDsl.g:4343:4: (lv_italics_8_0= 'italics' )
                    // InternalXdiagramDsl.g:4344:5: lv_italics_8_0= 'italics'
                    {
                    lv_italics_8_0=(Token)match(input,72,FOLLOW_27); 

                    					newLeafNode(lv_italics_8_0, grammarAccess.getFontPropertiesAccess().getItalicsItalicsKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFontPropertiesRule());
                    					}
                    					setWithLastConsumed(current, "italics", true, "italics");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4356:3: ( (lv_conditional_9_0= ruleFeatureConditional ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==19) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalXdiagramDsl.g:4357:4: (lv_conditional_9_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4357:4: (lv_conditional_9_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4358:5: lv_conditional_9_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getFontPropertiesAccess().getConditionalFeatureConditionalParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_10=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4383:1: entryRuleTextAlign returns [EObject current=null] : iv_ruleTextAlign= ruleTextAlign EOF ;
    public final EObject entryRuleTextAlign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAlign = null;


        try {
            // InternalXdiagramDsl.g:4383:50: (iv_ruleTextAlign= ruleTextAlign EOF )
            // InternalXdiagramDsl.g:4384:2: iv_ruleTextAlign= ruleTextAlign EOF
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
    // InternalXdiagramDsl.g:4390:1: ruleTextAlign returns [EObject current=null] : (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleTextAlign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_value_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4396:2: ( (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4397:2: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4397:2: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4398:3: otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAlignAccess().getAlignKeyword_0());
            		
            // InternalXdiagramDsl.g:4402:3: ( (lv_value_1_0= ruleTextAlignValue ) )
            // InternalXdiagramDsl.g:4403:4: (lv_value_1_0= ruleTextAlignValue )
            {
            // InternalXdiagramDsl.g:4403:4: (lv_value_1_0= ruleTextAlignValue )
            // InternalXdiagramDsl.g:4404:5: lv_value_1_0= ruleTextAlignValue
            {

            					newCompositeNode(grammarAccess.getTextAlignAccess().getValueTextAlignValueEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalXdiagramDsl.g:4421:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==19) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXdiagramDsl.g:4422:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4422:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4423:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getTextAlignAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4448:1: entryRuleLineStyle returns [EObject current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final EObject entryRuleLineStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStyle = null;


        try {
            // InternalXdiagramDsl.g:4448:50: (iv_ruleLineStyle= ruleLineStyle EOF )
            // InternalXdiagramDsl.g:4449:2: iv_ruleLineStyle= ruleLineStyle EOF
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
    // InternalXdiagramDsl.g:4455:1: ruleLineStyle returns [EObject current=null] : ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject ruleLineStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_manhattan_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_style_2_0 = null;

        EObject lv_conditional_4_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4461:2: ( ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // InternalXdiagramDsl.g:4462:2: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // InternalXdiagramDsl.g:4462:2: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // InternalXdiagramDsl.g:4463:3: () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            // InternalXdiagramDsl.g:4463:3: ()
            // InternalXdiagramDsl.g:4464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineStyleAccess().getLineStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getLineStyleAccess().getLinestyleKeyword_1());
            		
            // InternalXdiagramDsl.g:4474:3: ( (lv_style_2_0= ruleLineType ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=102 && LA79_0<=104)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalXdiagramDsl.g:4475:4: (lv_style_2_0= ruleLineType )
                    {
                    // InternalXdiagramDsl.g:4475:4: (lv_style_2_0= ruleLineType )
                    // InternalXdiagramDsl.g:4476:5: lv_style_2_0= ruleLineType
                    {

                    					newCompositeNode(grammarAccess.getLineStyleAccess().getStyleLineTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_58);
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

            // InternalXdiagramDsl.g:4493:3: ( (lv_manhattan_3_0= 'manhattan' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==75) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalXdiagramDsl.g:4494:4: (lv_manhattan_3_0= 'manhattan' )
                    {
                    // InternalXdiagramDsl.g:4494:4: (lv_manhattan_3_0= 'manhattan' )
                    // InternalXdiagramDsl.g:4495:5: lv_manhattan_3_0= 'manhattan'
                    {
                    lv_manhattan_3_0=(Token)match(input,75,FOLLOW_27); 

                    					newLeafNode(lv_manhattan_3_0, grammarAccess.getLineStyleAccess().getManhattanManhattanKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLineStyleRule());
                    					}
                    					setWithLastConsumed(current, "manhattan", true, "manhattan");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4507:3: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==19) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalXdiagramDsl.g:4508:4: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4508:4: (lv_conditional_4_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4509:5: lv_conditional_4_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getLineStyleAccess().getConditionalFeatureConditionalParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4534:1: entryRuleLineWidth returns [EObject current=null] : iv_ruleLineWidth= ruleLineWidth EOF ;
    public final EObject entryRuleLineWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineWidth = null;


        try {
            // InternalXdiagramDsl.g:4534:50: (iv_ruleLineWidth= ruleLineWidth EOF )
            // InternalXdiagramDsl.g:4535:2: iv_ruleLineWidth= ruleLineWidth EOF
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
    // InternalXdiagramDsl.g:4541:1: ruleLineWidth returns [EObject current=null] : (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleLineWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4547:2: ( (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4548:2: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4548:2: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4549:3: otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getLineWidthAccess().getLinewidthKeyword_0());
            		
            // InternalXdiagramDsl.g:4553:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4554:4: (lv_width_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4554:4: (lv_width_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4555:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            // InternalXdiagramDsl.g:4571:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==19) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXdiagramDsl.g:4572:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4572:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4573:5: lv_conditional_2_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getLineWidthAccess().getConditionalFeatureConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4598:1: ruleAnchorDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) ;
    public final Enumerator ruleAnchorDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4604:2: ( ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) )
            // InternalXdiagramDsl.g:4605:2: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            {
            // InternalXdiagramDsl.g:4605:2: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==77) ) {
                alt83=1;
            }
            else if ( (LA83_0==78) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalXdiagramDsl.g:4606:3: (enumLiteral_0= 'incoming' )
                    {
                    // InternalXdiagramDsl.g:4606:3: (enumLiteral_0= 'incoming' )
                    // InternalXdiagramDsl.g:4607:4: enumLiteral_0= 'incoming'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4614:3: (enumLiteral_1= 'outgoing' )
                    {
                    // InternalXdiagramDsl.g:4614:3: (enumLiteral_1= 'outgoing' )
                    // InternalXdiagramDsl.g:4615:4: enumLiteral_1= 'outgoing'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4625:1: ruleDefaultColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) ;
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
            // InternalXdiagramDsl.g:4631:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) )
            // InternalXdiagramDsl.g:4632:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            {
            // InternalXdiagramDsl.g:4632:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            int alt84=16;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt84=1;
                }
                break;
            case 80:
                {
                alt84=2;
                }
                break;
            case 81:
                {
                alt84=3;
                }
                break;
            case 82:
                {
                alt84=4;
                }
                break;
            case 83:
                {
                alt84=5;
                }
                break;
            case 84:
                {
                alt84=6;
                }
                break;
            case 85:
                {
                alt84=7;
                }
                break;
            case 86:
                {
                alt84=8;
                }
                break;
            case 87:
                {
                alt84=9;
                }
                break;
            case 88:
                {
                alt84=10;
                }
                break;
            case 89:
                {
                alt84=11;
                }
                break;
            case 90:
                {
                alt84=12;
                }
                break;
            case 91:
                {
                alt84=13;
                }
                break;
            case 92:
                {
                alt84=14;
                }
                break;
            case 93:
                {
                alt84=15;
                }
                break;
            case 94:
                {
                alt84=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalXdiagramDsl.g:4633:3: (enumLiteral_0= 'white' )
                    {
                    // InternalXdiagramDsl.g:4633:3: (enumLiteral_0= 'white' )
                    // InternalXdiagramDsl.g:4634:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4641:3: (enumLiteral_1= 'silver' )
                    {
                    // InternalXdiagramDsl.g:4641:3: (enumLiteral_1= 'silver' )
                    // InternalXdiagramDsl.g:4642:4: enumLiteral_1= 'silver'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4649:3: (enumLiteral_2= 'gray' )
                    {
                    // InternalXdiagramDsl.g:4649:3: (enumLiteral_2= 'gray' )
                    // InternalXdiagramDsl.g:4650:4: enumLiteral_2= 'gray'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:4657:3: (enumLiteral_3= 'black' )
                    {
                    // InternalXdiagramDsl.g:4657:3: (enumLiteral_3= 'black' )
                    // InternalXdiagramDsl.g:4658:4: enumLiteral_3= 'black'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:4665:3: (enumLiteral_4= 'red' )
                    {
                    // InternalXdiagramDsl.g:4665:3: (enumLiteral_4= 'red' )
                    // InternalXdiagramDsl.g:4666:4: enumLiteral_4= 'red'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:4673:3: (enumLiteral_5= 'maroon' )
                    {
                    // InternalXdiagramDsl.g:4673:3: (enumLiteral_5= 'maroon' )
                    // InternalXdiagramDsl.g:4674:4: enumLiteral_5= 'maroon'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXdiagramDsl.g:4681:3: (enumLiteral_6= 'yellow' )
                    {
                    // InternalXdiagramDsl.g:4681:3: (enumLiteral_6= 'yellow' )
                    // InternalXdiagramDsl.g:4682:4: enumLiteral_6= 'yellow'
                    {
                    enumLiteral_6=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXdiagramDsl.g:4689:3: (enumLiteral_7= 'olive' )
                    {
                    // InternalXdiagramDsl.g:4689:3: (enumLiteral_7= 'olive' )
                    // InternalXdiagramDsl.g:4690:4: enumLiteral_7= 'olive'
                    {
                    enumLiteral_7=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalXdiagramDsl.g:4697:3: (enumLiteral_8= 'lime' )
                    {
                    // InternalXdiagramDsl.g:4697:3: (enumLiteral_8= 'lime' )
                    // InternalXdiagramDsl.g:4698:4: enumLiteral_8= 'lime'
                    {
                    enumLiteral_8=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalXdiagramDsl.g:4705:3: (enumLiteral_9= 'green' )
                    {
                    // InternalXdiagramDsl.g:4705:3: (enumLiteral_9= 'green' )
                    // InternalXdiagramDsl.g:4706:4: enumLiteral_9= 'green'
                    {
                    enumLiteral_9=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalXdiagramDsl.g:4713:3: (enumLiteral_10= 'aqua' )
                    {
                    // InternalXdiagramDsl.g:4713:3: (enumLiteral_10= 'aqua' )
                    // InternalXdiagramDsl.g:4714:4: enumLiteral_10= 'aqua'
                    {
                    enumLiteral_10=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalXdiagramDsl.g:4721:3: (enumLiteral_11= 'teal' )
                    {
                    // InternalXdiagramDsl.g:4721:3: (enumLiteral_11= 'teal' )
                    // InternalXdiagramDsl.g:4722:4: enumLiteral_11= 'teal'
                    {
                    enumLiteral_11=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalXdiagramDsl.g:4729:3: (enumLiteral_12= 'blue' )
                    {
                    // InternalXdiagramDsl.g:4729:3: (enumLiteral_12= 'blue' )
                    // InternalXdiagramDsl.g:4730:4: enumLiteral_12= 'blue'
                    {
                    enumLiteral_12=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalXdiagramDsl.g:4737:3: (enumLiteral_13= 'navy' )
                    {
                    // InternalXdiagramDsl.g:4737:3: (enumLiteral_13= 'navy' )
                    // InternalXdiagramDsl.g:4738:4: enumLiteral_13= 'navy'
                    {
                    enumLiteral_13=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalXdiagramDsl.g:4745:3: (enumLiteral_14= 'fuchsia' )
                    {
                    // InternalXdiagramDsl.g:4745:3: (enumLiteral_14= 'fuchsia' )
                    // InternalXdiagramDsl.g:4746:4: enumLiteral_14= 'fuchsia'
                    {
                    enumLiteral_14=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalXdiagramDsl.g:4753:3: (enumLiteral_15= 'purple' )
                    {
                    // InternalXdiagramDsl.g:4753:3: (enumLiteral_15= 'purple' )
                    // InternalXdiagramDsl.g:4754:4: enumLiteral_15= 'purple'
                    {
                    enumLiteral_15=(Token)match(input,94,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4764:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4770:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalXdiagramDsl.g:4771:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalXdiagramDsl.g:4771:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==95) ) {
                alt85=1;
            }
            else if ( (LA85_0==96) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalXdiagramDsl.g:4772:3: (enumLiteral_0= '=' )
                    {
                    // InternalXdiagramDsl.g:4772:3: (enumLiteral_0= '=' )
                    // InternalXdiagramDsl.g:4773:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4780:3: (enumLiteral_1= '<>' )
                    {
                    // InternalXdiagramDsl.g:4780:3: (enumLiteral_1= '<>' )
                    // InternalXdiagramDsl.g:4781:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4791:1: ruleBooleanLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4797:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalXdiagramDsl.g:4798:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalXdiagramDsl.g:4798:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==97) ) {
                alt86=1;
            }
            else if ( (LA86_0==98) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalXdiagramDsl.g:4799:3: (enumLiteral_0= 'true' )
                    {
                    // InternalXdiagramDsl.g:4799:3: (enumLiteral_0= 'true' )
                    // InternalXdiagramDsl.g:4800:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4807:3: (enumLiteral_1= 'false' )
                    {
                    // InternalXdiagramDsl.g:4807:3: (enumLiteral_1= 'false' )
                    // InternalXdiagramDsl.g:4808:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4818:1: ruleTextAlignValue returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleTextAlignValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4824:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalXdiagramDsl.g:4825:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalXdiagramDsl.g:4825:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt87=1;
                }
                break;
            case 100:
                {
                alt87=2;
                }
                break;
            case 101:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalXdiagramDsl.g:4826:3: (enumLiteral_0= 'left' )
                    {
                    // InternalXdiagramDsl.g:4826:3: (enumLiteral_0= 'left' )
                    // InternalXdiagramDsl.g:4827:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4834:3: (enumLiteral_1= 'center' )
                    {
                    // InternalXdiagramDsl.g:4834:3: (enumLiteral_1= 'center' )
                    // InternalXdiagramDsl.g:4835:4: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4842:3: (enumLiteral_2= 'right' )
                    {
                    // InternalXdiagramDsl.g:4842:3: (enumLiteral_2= 'right' )
                    // InternalXdiagramDsl.g:4843:4: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4853:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4859:2: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) )
            // InternalXdiagramDsl.g:4860:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            {
            // InternalXdiagramDsl.g:4860:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            int alt88=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt88=1;
                }
                break;
            case 103:
                {
                alt88=2;
                }
                break;
            case 104:
                {
                alt88=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalXdiagramDsl.g:4861:3: (enumLiteral_0= 'solid' )
                    {
                    // InternalXdiagramDsl.g:4861:3: (enumLiteral_0= 'solid' )
                    // InternalXdiagramDsl.g:4862:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4869:3: (enumLiteral_1= 'dashed' )
                    {
                    // InternalXdiagramDsl.g:4869:3: (enumLiteral_1= 'dashed' )
                    // InternalXdiagramDsl.g:4870:4: enumLiteral_1= 'dashed'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4877:3: (enumLiteral_2= 'dotted' )
                    {
                    // InternalXdiagramDsl.g:4877:3: (enumLiteral_2= 'dotted' )
                    // InternalXdiagramDsl.g:4878:4: enumLiteral_2= 'dotted'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000180300002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000070L,0x0000000600000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000707F900000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000004008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00073FF900000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400410008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1C7C400410008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x147C400410008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x167C400410008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x147C400010008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x147C400410008000L,0x0000000000001605L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0460000400008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1440400410008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0180000040080040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000040080040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0180000040080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000040080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000048080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000040080000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000040080030L,0x0000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000040080040L,0x00000000000001F8L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000040080040L,0x0000000000000180L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000040080000L,0x0000000000000180L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000040080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000040080000L,0x000001C000000800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000040080000L,0x0000000000000800L});

}