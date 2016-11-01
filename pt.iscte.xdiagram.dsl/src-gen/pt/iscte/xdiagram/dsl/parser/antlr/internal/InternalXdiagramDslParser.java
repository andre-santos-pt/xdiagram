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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'{'", "'plugin-id'", "'ecore-file'", "'}'", "'.'", "'*'", "'diagram'", "'if'", "'node'", "'link'", "'reference'", "'class'", "'source'", "'target'", "'decorator'", "'anchor'", "'max'", "';'", "'colors'", "'figure'", "'as'", "'child'", "'rectangle'", "'square'", "'rhombus'", "'ellipse'", "'circle'", "'polygon'", "'polyline'", "'triangle'", "'hline'", "'vline'", "'arrow'", "'contains'", "'null'", "'label'", "'image'", "'invisible'", "'foreground'", "'background'", "'transparency'", "'%'", "'size'", "']'", "'resizable'", "'point'", "'position'", "'corner'", "'layout'", "'vertical'", "'horizontal'", "'margin'", "'text'", "'edit:'", "'font'", "'arial'", "'verdana'", "'courier'", "'times'", "'bold'", "'italics'", "'align'", "'linestyle'", "'manhattan'", "'linewidth'", "'incoming'", "'outgoing'", "'white'", "'silver'", "'gray'", "'black'", "'red'", "'maroon'", "'yellow'", "'olive'", "'lime'", "'green'", "'aqua'", "'teal'", "'blue'", "'navy'", "'fuchsia'", "'purple'", "'='", "'<>'", "'true'", "'false'", "'left'", "'center'", "'right'", "'solid'", "'dashed'", "'dotted'"
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
    // InternalXdiagramDsl.g:72:1: ruleXDiagram returns [EObject current=null] : ( ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( (lv_customColors_2_0= ruleColors ) )? ( ( (lv_elements_3_0= ruleDiagramElement ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )* ) ;
    public final EObject ruleXDiagram() throws RecognitionException {
        EObject current = null;

        EObject lv_metamodel_0_0 = null;

        EObject lv_diagram_1_0 = null;

        EObject lv_customColors_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_figures_4_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:78:2: ( ( ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( (lv_customColors_2_0= ruleColors ) )? ( ( (lv_elements_3_0= ruleDiagramElement ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )* ) )
            // InternalXdiagramDsl.g:79:2: ( ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( (lv_customColors_2_0= ruleColors ) )? ( ( (lv_elements_3_0= ruleDiagramElement ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )* )
            {
            // InternalXdiagramDsl.g:79:2: ( ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( (lv_customColors_2_0= ruleColors ) )? ( ( (lv_elements_3_0= ruleDiagramElement ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )* )
            // InternalXdiagramDsl.g:80:3: ( (lv_metamodel_0_0= ruleMetaModel ) ) ( (lv_diagram_1_0= ruleDiagram ) ) ( (lv_customColors_2_0= ruleColors ) )? ( ( (lv_elements_3_0= ruleDiagramElement ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )*
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

            // InternalXdiagramDsl.g:118:3: ( (lv_customColors_2_0= ruleColors ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXdiagramDsl.g:119:4: (lv_customColors_2_0= ruleColors )
                    {
                    // InternalXdiagramDsl.g:119:4: (lv_customColors_2_0= ruleColors )
                    // InternalXdiagramDsl.g:120:5: lv_customColors_2_0= ruleColors
                    {

                    					newCompositeNode(grammarAccess.getXDiagramAccess().getCustomColorsColorsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_customColors_2_0=ruleColors();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getXDiagramRule());
                    					}
                    					set(
                    						current,
                    						"customColors",
                    						lv_customColors_2_0,
                    						"pt.iscte.xdiagram.dsl.XdiagramDsl.Colors");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:137:3: ( ( (lv_elements_3_0= ruleDiagramElement ) ) | ( (lv_figures_4_0= ruleCustomFigure ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=20 && LA2_0<=21)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==31) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXdiagramDsl.g:138:4: ( (lv_elements_3_0= ruleDiagramElement ) )
            	    {
            	    // InternalXdiagramDsl.g:138:4: ( (lv_elements_3_0= ruleDiagramElement ) )
            	    // InternalXdiagramDsl.g:139:5: (lv_elements_3_0= ruleDiagramElement )
            	    {
            	    // InternalXdiagramDsl.g:139:5: (lv_elements_3_0= ruleDiagramElement )
            	    // InternalXdiagramDsl.g:140:6: lv_elements_3_0= ruleDiagramElement
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getElementsDiagramElementParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleDiagramElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_3_0,
            	    							"pt.iscte.xdiagram.dsl.XdiagramDsl.DiagramElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXdiagramDsl.g:158:4: ( (lv_figures_4_0= ruleCustomFigure ) )
            	    {
            	    // InternalXdiagramDsl.g:158:4: ( (lv_figures_4_0= ruleCustomFigure ) )
            	    // InternalXdiagramDsl.g:159:5: (lv_figures_4_0= ruleCustomFigure )
            	    {
            	    // InternalXdiagramDsl.g:159:5: (lv_figures_4_0= ruleCustomFigure )
            	    // InternalXdiagramDsl.g:160:6: lv_figures_4_0= ruleCustomFigure
            	    {

            	    						newCompositeNode(grammarAccess.getXDiagramAccess().getFiguresCustomFigureParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
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


    // $ANTLR start "entryRuleMetaModel"
    // InternalXdiagramDsl.g:182:1: entryRuleMetaModel returns [EObject current=null] : iv_ruleMetaModel= ruleMetaModel EOF ;
    public final EObject entryRuleMetaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModel = null;


        try {
            // InternalXdiagramDsl.g:182:50: (iv_ruleMetaModel= ruleMetaModel EOF )
            // InternalXdiagramDsl.g:183:2: iv_ruleMetaModel= ruleMetaModel EOF
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
    // InternalXdiagramDsl.g:189:1: ruleMetaModel returns [EObject current=null] : (otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:195:2: ( (otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:196:2: (otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:196:2: (otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalXdiagramDsl.g:197:3: otherlv_0= 'metamodel' otherlv_1= '{' otherlv_2= 'plugin-id' ( (lv_plugin_3_0= RULE_STRING ) ) otherlv_4= 'ecore-file' ( (lv_ecorePath_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaModelAccess().getMetamodelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaModelAccess().getPluginIdKeyword_2());
            		
            // InternalXdiagramDsl.g:209:3: ( (lv_plugin_3_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:210:4: (lv_plugin_3_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:210:4: (lv_plugin_3_0= RULE_STRING )
            // InternalXdiagramDsl.g:211:5: lv_plugin_3_0= RULE_STRING
            {
            lv_plugin_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMetaModelAccess().getEcoreFileKeyword_4());
            		
            // InternalXdiagramDsl.g:231:3: ( (lv_ecorePath_5_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:232:4: (lv_ecorePath_5_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:232:4: (lv_ecorePath_5_0= RULE_STRING )
            // InternalXdiagramDsl.g:233:5: lv_ecorePath_5_0= RULE_STRING
            {
            lv_ecorePath_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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
    // InternalXdiagramDsl.g:257:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXdiagramDsl.g:257:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXdiagramDsl.g:258:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXdiagramDsl.g:264:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:270:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXdiagramDsl.g:271:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXdiagramDsl.g:271:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXdiagramDsl.g:272:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXdiagramDsl.g:279:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalXdiagramDsl.g:280:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalXdiagramDsl.g:297:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // InternalXdiagramDsl.g:297:65: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // InternalXdiagramDsl.g:298:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
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
    // InternalXdiagramDsl.g:304:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:310:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalXdiagramDsl.g:311:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalXdiagramDsl.g:311:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalXdiagramDsl.g:312:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXdiagramDsl.g:322:3: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXdiagramDsl.g:323:4: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_13); 

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
    // InternalXdiagramDsl.g:338:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalXdiagramDsl.g:338:48: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalXdiagramDsl.g:339:2: iv_ruleDiagram= ruleDiagram EOF
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
    // InternalXdiagramDsl.g:345:1: ruleDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_contains_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:351:2: ( (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) )
            // InternalXdiagramDsl.g:352:2: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            {
            // InternalXdiagramDsl.g:352:2: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            // InternalXdiagramDsl.g:353:3: otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDiagramAccess().getDiagramKeyword_0());
            		
            // InternalXdiagramDsl.g:357:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:358:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:358:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:359:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiagramRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDiagramAccess().getModelClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_6);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:377:3: ( (lv_contains_3_0= ruleContains ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==45) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXdiagramDsl.g:378:4: (lv_contains_3_0= ruleContains )
            	    {
            	    // InternalXdiagramDsl.g:378:4: (lv_contains_3_0= ruleContains )
            	    // InternalXdiagramDsl.g:379:5: lv_contains_3_0= ruleContains
            	    {

            	    					newCompositeNode(grammarAccess.getDiagramAccess().getContainsContainsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop5;
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
    // InternalXdiagramDsl.g:404:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // InternalXdiagramDsl.g:404:55: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // InternalXdiagramDsl.g:405:2: iv_ruleDiagramElement= ruleDiagramElement EOF
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
    // InternalXdiagramDsl.g:411:1: ruleDiagramElement returns [EObject current=null] : (this_Node_0= ruleNode | this_Link_1= ruleLink ) ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Link_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:417:2: ( (this_Node_0= ruleNode | this_Link_1= ruleLink ) )
            // InternalXdiagramDsl.g:418:2: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            {
            // InternalXdiagramDsl.g:418:2: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXdiagramDsl.g:419:3: this_Node_0= ruleNode
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
                    // InternalXdiagramDsl.g:428:3: this_Link_1= ruleLink
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
    // InternalXdiagramDsl.g:440:1: entryRuleLinkedFeature returns [EObject current=null] : iv_ruleLinkedFeature= ruleLinkedFeature EOF ;
    public final EObject entryRuleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedFeature = null;


        try {
            // InternalXdiagramDsl.g:440:54: (iv_ruleLinkedFeature= ruleLinkedFeature EOF )
            // InternalXdiagramDsl.g:441:2: iv_ruleLinkedFeature= ruleLinkedFeature EOF
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
    // InternalXdiagramDsl.g:447:1: ruleLinkedFeature returns [EObject current=null] : (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) ;
    public final EObject ruleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_Anchor_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:453:2: ( (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) )
            // InternalXdiagramDsl.g:454:2: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            {
            // InternalXdiagramDsl.g:454:2: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXdiagramDsl.g:455:3: this_Contains_0= ruleContains
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
                    // InternalXdiagramDsl.g:464:3: this_Anchor_1= ruleAnchor
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
    // InternalXdiagramDsl.g:476:1: entryRuleStyleFeature returns [EObject current=null] : iv_ruleStyleFeature= ruleStyleFeature EOF ;
    public final EObject entryRuleStyleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleFeature = null;


        try {
            // InternalXdiagramDsl.g:476:53: (iv_ruleStyleFeature= ruleStyleFeature EOF )
            // InternalXdiagramDsl.g:477:2: iv_ruleStyleFeature= ruleStyleFeature EOF
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
    // InternalXdiagramDsl.g:483:1: ruleStyleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) ;
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
            // InternalXdiagramDsl.g:489:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) )
            // InternalXdiagramDsl.g:490:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            {
            // InternalXdiagramDsl.g:490:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt8=1;
                }
                break;
            case 58:
                {
                alt8=2;
                }
                break;
            case 57:
                {
                alt8=3;
                }
                break;
            case 59:
                {
                alt8=4;
                }
                break;
            case 51:
                {
                alt8=5;
                }
                break;
            case 50:
                {
                alt8=6;
                }
                break;
            case 52:
                {
                alt8=7;
                }
                break;
            case 66:
                {
                alt8=8;
                }
                break;
            case 64:
                {
                alt8=9;
                }
                break;
            case 73:
                {
                alt8=10;
                }
                break;
            case 74:
                {
                alt8=11;
                }
                break;
            case 76:
                {
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXdiagramDsl.g:491:3: this_Size_0= ruleSize
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
                    // InternalXdiagramDsl.g:500:3: this_Position_1= rulePosition
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
                    // InternalXdiagramDsl.g:509:3: this_Point_2= rulePoint
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
                    // InternalXdiagramDsl.g:518:3: this_Corner_3= ruleCorner
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
                    // InternalXdiagramDsl.g:527:3: this_Background_4= ruleBackground
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
                    // InternalXdiagramDsl.g:536:3: this_Foreground_5= ruleForeground
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
                    // InternalXdiagramDsl.g:545:3: this_Transparency_6= ruleTransparency
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
                    // InternalXdiagramDsl.g:554:3: this_FontProperties_7= ruleFontProperties
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
                    // InternalXdiagramDsl.g:563:3: this_TextValue_8= ruleTextValue
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
                    // InternalXdiagramDsl.g:572:3: this_TextAlign_9= ruleTextAlign
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
                    // InternalXdiagramDsl.g:581:3: this_LineStyle_10= ruleLineStyle
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
                    // InternalXdiagramDsl.g:590:3: this_LineWidth_11= ruleLineWidth
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
    // InternalXdiagramDsl.g:602:1: entryRuleChildElement returns [EObject current=null] : iv_ruleChildElement= ruleChildElement EOF ;
    public final EObject entryRuleChildElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildElement = null;


        try {
            // InternalXdiagramDsl.g:602:53: (iv_ruleChildElement= ruleChildElement EOF )
            // InternalXdiagramDsl.g:603:2: iv_ruleChildElement= ruleChildElement EOF
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
    // InternalXdiagramDsl.g:609:1: ruleChildElement returns [EObject current=null] : (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) ;
    public final EObject ruleChildElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElement_0 = null;

        EObject this_Line_1 = null;

        EObject this_Arrow_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:615:2: ( (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) )
            // InternalXdiagramDsl.g:616:2: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            {
            // InternalXdiagramDsl.g:616:2: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 31:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 47:
            case 48:
            case 49:
                {
                alt9=1;
                }
                break;
            case 42:
            case 43:
                {
                alt9=2;
                }
                break;
            case 44:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXdiagramDsl.g:617:3: this_ConnectableElement_0= ruleConnectableElement
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
                    // InternalXdiagramDsl.g:626:3: this_Line_1= ruleLine
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
                    // InternalXdiagramDsl.g:635:3: this_Arrow_2= ruleArrow
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
    // InternalXdiagramDsl.g:647:1: entryRuleFeatureConditional returns [EObject current=null] : iv_ruleFeatureConditional= ruleFeatureConditional EOF ;
    public final EObject entryRuleFeatureConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureConditional = null;


        try {
            // InternalXdiagramDsl.g:647:59: (iv_ruleFeatureConditional= ruleFeatureConditional EOF )
            // InternalXdiagramDsl.g:648:2: iv_ruleFeatureConditional= ruleFeatureConditional EOF
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
    // InternalXdiagramDsl.g:654:1: ruleFeatureConditional returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleFeatureConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:660:2: ( (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalXdiagramDsl.g:661:2: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalXdiagramDsl.g:661:2: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            // InternalXdiagramDsl.g:662:3: otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureConditionalAccess().getIfKeyword_0());
            		
            // InternalXdiagramDsl.g:666:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:667:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:667:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:668:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureConditionalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureConditionalAccess().getModelAttributeEAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:682:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalXdiagramDsl.g:683:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalXdiagramDsl.g:683:4: (lv_operator_2_0= ruleOperator )
            // InternalXdiagramDsl.g:684:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getFeatureConditionalAccess().getOperatorOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalXdiagramDsl.g:701:3: ( (lv_value_3_0= ruleValue ) )
            // InternalXdiagramDsl.g:702:4: (lv_value_3_0= ruleValue )
            {
            // InternalXdiagramDsl.g:702:4: (lv_value_3_0= ruleValue )
            // InternalXdiagramDsl.g:703:5: lv_value_3_0= ruleValue
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
    // InternalXdiagramDsl.g:724:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalXdiagramDsl.g:724:45: (iv_ruleNode= ruleNode EOF )
            // InternalXdiagramDsl.g:725:2: iv_ruleNode= ruleNode EOF
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
    // InternalXdiagramDsl.g:731:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rootFigure_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:737:2: ( (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) ) ) )
            // InternalXdiagramDsl.g:738:2: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) ) )
            {
            // InternalXdiagramDsl.g:738:2: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) ) )
            // InternalXdiagramDsl.g:739:3: otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_2_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalXdiagramDsl.g:743:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:744:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:744:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:745:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeAccess().getModelClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:759:3: ( (lv_rootFigure_2_0= ruleConnectableElement ) )
            // InternalXdiagramDsl.g:760:4: (lv_rootFigure_2_0= ruleConnectableElement )
            {
            // InternalXdiagramDsl.g:760:4: (lv_rootFigure_2_0= ruleConnectableElement )
            // InternalXdiagramDsl.g:761:5: lv_rootFigure_2_0= ruleConnectableElement
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
    // InternalXdiagramDsl.g:782:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalXdiagramDsl.g:782:45: (iv_ruleLink= ruleLink EOF )
            // InternalXdiagramDsl.g:783:2: iv_ruleLink= ruleLink EOF
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
    // InternalXdiagramDsl.g:789:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}' ) ;
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
            // InternalXdiagramDsl.g:795:2: ( (otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}' ) )
            // InternalXdiagramDsl.g:796:2: (otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}' )
            {
            // InternalXdiagramDsl.g:796:2: (otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}' )
            // InternalXdiagramDsl.g:797:3: otherlv_0= 'link' ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) ) otherlv_9= '{' ( (lv_features_10_0= ruleLinkFeature ) )* ( (lv_decorators_11_0= ruleDecorator ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalXdiagramDsl.g:801:3: ( ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXdiagramDsl.g:802:4: ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:802:4: ( ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:803:5: ( (lv_reference_1_0= 'reference' ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:803:5: ( (lv_reference_1_0= 'reference' ) )
                    // InternalXdiagramDsl.g:804:6: (lv_reference_1_0= 'reference' )
                    {
                    // InternalXdiagramDsl.g:804:6: (lv_reference_1_0= 'reference' )
                    // InternalXdiagramDsl.g:805:7: lv_reference_1_0= 'reference'
                    {
                    lv_reference_1_0=(Token)match(input,22,FOLLOW_12); 

                    							newLeafNode(lv_reference_1_0, grammarAccess.getLinkAccess().getReferenceReferenceKeyword_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    							setWithLastConsumed(current, "reference", true, "reference");
                    						

                    }


                    }

                    // InternalXdiagramDsl.g:817:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:818:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:818:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:819:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_1_0_1_0());
                    						
                    pushFollow(FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:835:4: ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:835:4: ( ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:836:5: ( (lv_complex_3_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_5= 'source' ( ( ruleQualifiedName ) ) otherlv_7= 'target' ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:836:5: ( (lv_complex_3_0= 'class' ) )
                    // InternalXdiagramDsl.g:837:6: (lv_complex_3_0= 'class' )
                    {
                    // InternalXdiagramDsl.g:837:6: (lv_complex_3_0= 'class' )
                    // InternalXdiagramDsl.g:838:7: lv_complex_3_0= 'class'
                    {
                    lv_complex_3_0=(Token)match(input,23,FOLLOW_12); 

                    							newLeafNode(lv_complex_3_0, grammarAccess.getLinkAccess().getComplexClassKeyword_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    							setWithLastConsumed(current, "complex", true, "class");
                    						

                    }


                    }

                    // InternalXdiagramDsl.g:850:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:851:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:851:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:852:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_1_1_1_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_12); 

                    					newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getSourceKeyword_1_1_2());
                    				
                    // InternalXdiagramDsl.g:870:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:871:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:871:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:872:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_1_1_3_0());
                    						
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_12); 

                    					newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getTargetKeyword_1_1_4());
                    				
                    // InternalXdiagramDsl.g:890:5: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:891:6: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:891:6: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:892:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_1_1_5_0());
                    						
                    pushFollow(FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:912:3: ( (lv_features_10_0= ruleLinkFeature ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==50||LA11_0==74||LA11_0==76) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXdiagramDsl.g:913:4: (lv_features_10_0= ruleLinkFeature )
            	    {
            	    // InternalXdiagramDsl.g:913:4: (lv_features_10_0= ruleLinkFeature )
            	    // InternalXdiagramDsl.g:914:5: lv_features_10_0= ruleLinkFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getFeaturesLinkFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    break loop11;
                }
            } while (true);

            // InternalXdiagramDsl.g:931:3: ( (lv_decorators_11_0= ruleDecorator ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXdiagramDsl.g:932:4: (lv_decorators_11_0= ruleDecorator )
            	    {
            	    // InternalXdiagramDsl.g:932:4: (lv_decorators_11_0= ruleDecorator )
            	    // InternalXdiagramDsl.g:933:5: lv_decorators_11_0= ruleDecorator
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getDecoratorsDecoratorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    break loop12;
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
    // InternalXdiagramDsl.g:958:1: entryRuleLinkFeature returns [EObject current=null] : iv_ruleLinkFeature= ruleLinkFeature EOF ;
    public final EObject entryRuleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkFeature = null;


        try {
            // InternalXdiagramDsl.g:958:52: (iv_ruleLinkFeature= ruleLinkFeature EOF )
            // InternalXdiagramDsl.g:959:2: iv_ruleLinkFeature= ruleLinkFeature EOF
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
    // InternalXdiagramDsl.g:965:1: ruleLinkFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) ;
    public final EObject ruleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_LineStyle_1 = null;

        EObject this_LineWidth_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:971:2: ( (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) )
            // InternalXdiagramDsl.g:972:2: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            {
            // InternalXdiagramDsl.g:972:2: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt13=1;
                }
                break;
            case 74:
                {
                alt13=2;
                }
                break;
            case 76:
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
                    // InternalXdiagramDsl.g:973:3: this_Foreground_0= ruleForeground
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
                    // InternalXdiagramDsl.g:982:3: this_LineStyle_1= ruleLineStyle
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
                    // InternalXdiagramDsl.g:991:3: this_LineWidth_2= ruleLineWidth
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
    // InternalXdiagramDsl.g:1003:1: entryRuleDecorator returns [EObject current=null] : iv_ruleDecorator= ruleDecorator EOF ;
    public final EObject entryRuleDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorator = null;


        try {
            // InternalXdiagramDsl.g:1003:50: (iv_ruleDecorator= ruleDecorator EOF )
            // InternalXdiagramDsl.g:1004:2: iv_ruleDecorator= ruleDecorator EOF
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
    // InternalXdiagramDsl.g:1010:1: ruleDecorator returns [EObject current=null] : (otherlv_0= 'decorator' ( (lv_element_1_0= ruleDecoratorElement ) ) ) ;
    public final EObject ruleDecorator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1016:2: ( (otherlv_0= 'decorator' ( (lv_element_1_0= ruleDecoratorElement ) ) ) )
            // InternalXdiagramDsl.g:1017:2: (otherlv_0= 'decorator' ( (lv_element_1_0= ruleDecoratorElement ) ) )
            {
            // InternalXdiagramDsl.g:1017:2: (otherlv_0= 'decorator' ( (lv_element_1_0= ruleDecoratorElement ) ) )
            // InternalXdiagramDsl.g:1018:3: otherlv_0= 'decorator' ( (lv_element_1_0= ruleDecoratorElement ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getDecoratorAccess().getDecoratorKeyword_0());
            		
            // InternalXdiagramDsl.g:1022:3: ( (lv_element_1_0= ruleDecoratorElement ) )
            // InternalXdiagramDsl.g:1023:4: (lv_element_1_0= ruleDecoratorElement )
            {
            // InternalXdiagramDsl.g:1023:4: (lv_element_1_0= ruleDecoratorElement )
            // InternalXdiagramDsl.g:1024:5: lv_element_1_0= ruleDecoratorElement
            {

            					newCompositeNode(grammarAccess.getDecoratorAccess().getElementDecoratorElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_1_0=ruleDecoratorElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecoratorRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
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
    // InternalXdiagramDsl.g:1045:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // InternalXdiagramDsl.g:1045:47: (iv_ruleAnchor= ruleAnchor EOF )
            // InternalXdiagramDsl.g:1046:2: iv_ruleAnchor= ruleAnchor EOF
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
    // InternalXdiagramDsl.g:1052:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalXdiagramDsl.g:1058:2: ( (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:1059:2: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:1059:2: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:1060:3: otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAnchorKeyword_0());
            		
            // InternalXdiagramDsl.g:1064:3: ( (lv_direction_1_0= ruleAnchorDirection ) )
            // InternalXdiagramDsl.g:1065:4: (lv_direction_1_0= ruleAnchorDirection )
            {
            // InternalXdiagramDsl.g:1065:4: (lv_direction_1_0= ruleAnchorDirection )
            // InternalXdiagramDsl.g:1066:5: lv_direction_1_0= ruleAnchorDirection
            {

            					newCompositeNode(grammarAccess.getAnchorAccess().getDirectionAnchorDirectionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalXdiagramDsl.g:1083:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:1084:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:1084:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:1085:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnchorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAnchorAccess().getModelReferenceEReferenceCrossReference_2_0());
            				
            pushFollow(FOLLOW_25);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdiagramDsl.g:1099:3: (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXdiagramDsl.g:1100:4: otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnchorAccess().getMaxKeyword_3_0());
                    			
                    // InternalXdiagramDsl.g:1104:4: ( (lv_max_4_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:1105:5: (lv_max_4_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:1105:5: (lv_max_4_0= RULE_INT )
                    // InternalXdiagramDsl.g:1106:6: lv_max_4_0= RULE_INT
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

            // InternalXdiagramDsl.g:1123:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXdiagramDsl.g:1124:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:1124:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:1125:5: lv_conditional_5_0= ruleFeatureConditional
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

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "entryRuleColors"
    // InternalXdiagramDsl.g:1150:1: entryRuleColors returns [EObject current=null] : iv_ruleColors= ruleColors EOF ;
    public final EObject entryRuleColors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColors = null;


        try {
            // InternalXdiagramDsl.g:1150:47: (iv_ruleColors= ruleColors EOF )
            // InternalXdiagramDsl.g:1151:2: iv_ruleColors= ruleColors EOF
            {
             newCompositeNode(grammarAccess.getColorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColors=ruleColors();

            state._fsp--;

             current =iv_ruleColors; 
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
    // $ANTLR end "entryRuleColors"


    // $ANTLR start "ruleColors"
    // InternalXdiagramDsl.g:1157:1: ruleColors returns [EObject current=null] : ( () otherlv_1= 'colors' otherlv_2= '{' ( (lv_colors_3_0= ruleCustomColor ) )* otherlv_4= '}' ) ;
    public final EObject ruleColors() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_colors_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1163:2: ( ( () otherlv_1= 'colors' otherlv_2= '{' ( (lv_colors_3_0= ruleCustomColor ) )* otherlv_4= '}' ) )
            // InternalXdiagramDsl.g:1164:2: ( () otherlv_1= 'colors' otherlv_2= '{' ( (lv_colors_3_0= ruleCustomColor ) )* otherlv_4= '}' )
            {
            // InternalXdiagramDsl.g:1164:2: ( () otherlv_1= 'colors' otherlv_2= '{' ( (lv_colors_3_0= ruleCustomColor ) )* otherlv_4= '}' )
            // InternalXdiagramDsl.g:1165:3: () otherlv_1= 'colors' otherlv_2= '{' ( (lv_colors_3_0= ruleCustomColor ) )* otherlv_4= '}'
            {
            // InternalXdiagramDsl.g:1165:3: ()
            // InternalXdiagramDsl.g:1166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorsAccess().getColorsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getColorsAccess().getColorsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getColorsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:1180:3: ( (lv_colors_3_0= ruleCustomColor ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1181:4: (lv_colors_3_0= ruleCustomColor )
            	    {
            	    // InternalXdiagramDsl.g:1181:4: (lv_colors_3_0= ruleCustomColor )
            	    // InternalXdiagramDsl.g:1182:5: lv_colors_3_0= ruleCustomColor
            	    {

            	    					newCompositeNode(grammarAccess.getColorsAccess().getColorsCustomColorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_colors_3_0=ruleCustomColor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getColorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"colors",
            	    						lv_colors_3_0,
            	    						"pt.iscte.xdiagram.dsl.XdiagramDsl.CustomColor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getColorsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColors"


    // $ANTLR start "entryRuleCustomColor"
    // InternalXdiagramDsl.g:1207:1: entryRuleCustomColor returns [EObject current=null] : iv_ruleCustomColor= ruleCustomColor EOF ;
    public final EObject entryRuleCustomColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomColor = null;


        try {
            // InternalXdiagramDsl.g:1207:52: (iv_ruleCustomColor= ruleCustomColor EOF )
            // InternalXdiagramDsl.g:1208:2: iv_ruleCustomColor= ruleCustomColor EOF
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
    // InternalXdiagramDsl.g:1214:1: ruleCustomColor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_R_1_0= RULE_INT ) ) ( (lv_G_2_0= RULE_INT ) ) ( (lv_B_3_0= RULE_INT ) ) otherlv_4= ';' ) ;
    public final EObject ruleCustomColor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_R_1_0=null;
        Token lv_G_2_0=null;
        Token lv_B_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:1220:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_R_1_0= RULE_INT ) ) ( (lv_G_2_0= RULE_INT ) ) ( (lv_B_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:1221:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_R_1_0= RULE_INT ) ) ( (lv_G_2_0= RULE_INT ) ) ( (lv_B_3_0= RULE_INT ) ) otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:1221:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_R_1_0= RULE_INT ) ) ( (lv_G_2_0= RULE_INT ) ) ( (lv_B_3_0= RULE_INT ) ) otherlv_4= ';' )
            // InternalXdiagramDsl.g:1222:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_R_1_0= RULE_INT ) ) ( (lv_G_2_0= RULE_INT ) ) ( (lv_B_3_0= RULE_INT ) ) otherlv_4= ';'
            {
            // InternalXdiagramDsl.g:1222:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXdiagramDsl.g:1223:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:1223:4: (lv_name_0_0= RULE_ID )
            // InternalXdiagramDsl.g:1224:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCustomColorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdiagramDsl.g:1240:3: ( (lv_R_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1241:4: (lv_R_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1241:4: (lv_R_1_0= RULE_INT )
            // InternalXdiagramDsl.g:1242:5: lv_R_1_0= RULE_INT
            {
            lv_R_1_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_R_1_0, grammarAccess.getCustomColorAccess().getRINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"R",
            						lv_R_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:1258:3: ( (lv_G_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1259:4: (lv_G_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1259:4: (lv_G_2_0= RULE_INT )
            // InternalXdiagramDsl.g:1260:5: lv_G_2_0= RULE_INT
            {
            lv_G_2_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_G_2_0, grammarAccess.getCustomColorAccess().getGINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"G",
            						lv_G_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXdiagramDsl.g:1276:3: ( (lv_B_3_0= RULE_INT ) )
            // InternalXdiagramDsl.g:1277:4: (lv_B_3_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:1277:4: (lv_B_3_0= RULE_INT )
            // InternalXdiagramDsl.g:1278:5: lv_B_3_0= RULE_INT
            {
            lv_B_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_B_3_0, grammarAccess.getCustomColorAccess().getBINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"B",
            						lv_B_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomColorAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalXdiagramDsl.g:1302:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXdiagramDsl.g:1302:46: (iv_ruleColor= ruleColor EOF )
            // InternalXdiagramDsl.g:1303:2: iv_ruleColor= ruleColor EOF
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
    // InternalXdiagramDsl.g:1309:1: ruleColor returns [EObject current=null] : ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_default_0_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1315:2: ( ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalXdiagramDsl.g:1316:2: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalXdiagramDsl.g:1316:2: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=79 && LA17_0<=94)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalXdiagramDsl.g:1317:3: ( (lv_default_0_0= ruleDefaultColor ) )
                    {
                    // InternalXdiagramDsl.g:1317:3: ( (lv_default_0_0= ruleDefaultColor ) )
                    // InternalXdiagramDsl.g:1318:4: (lv_default_0_0= ruleDefaultColor )
                    {
                    // InternalXdiagramDsl.g:1318:4: (lv_default_0_0= ruleDefaultColor )
                    // InternalXdiagramDsl.g:1319:5: lv_default_0_0= ruleDefaultColor
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
                    // InternalXdiagramDsl.g:1337:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalXdiagramDsl.g:1337:3: ( (otherlv_1= RULE_ID ) )
                    // InternalXdiagramDsl.g:1338:4: (otherlv_1= RULE_ID )
                    {
                    // InternalXdiagramDsl.g:1338:4: (otherlv_1= RULE_ID )
                    // InternalXdiagramDsl.g:1339:5: otherlv_1= RULE_ID
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
    // InternalXdiagramDsl.g:1354:1: entryRuleConnectableElement returns [EObject current=null] : iv_ruleConnectableElement= ruleConnectableElement EOF ;
    public final EObject entryRuleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElement = null;


        try {
            // InternalXdiagramDsl.g:1354:59: (iv_ruleConnectableElement= ruleConnectableElement EOF )
            // InternalXdiagramDsl.g:1355:2: iv_ruleConnectableElement= ruleConnectableElement EOF
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
    // InternalXdiagramDsl.g:1361:1: ruleConnectableElement returns [EObject current=null] : (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) ;
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
            // InternalXdiagramDsl.g:1367:2: ( (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) )
            // InternalXdiagramDsl.g:1368:2: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            {
            // InternalXdiagramDsl.g:1368:2: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            int alt18=9;
            switch ( input.LA(1) ) {
            case 34:
            case 35:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
            case 38:
                {
                alt18=3;
                }
                break;
            case 39:
            case 40:
                {
                alt18=4;
                }
                break;
            case 47:
                {
                alt18=5;
                }
                break;
            case 48:
                {
                alt18=6;
                }
                break;
            case 49:
                {
                alt18=7;
                }
                break;
            case 31:
                {
                alt18=8;
                }
                break;
            case 41:
                {
                alt18=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalXdiagramDsl.g:1369:3: this_Rectangle_0= ruleRectangle
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
                    // InternalXdiagramDsl.g:1378:3: this_Rhombus_1= ruleRhombus
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
                    // InternalXdiagramDsl.g:1387:3: this_Ellipse_2= ruleEllipse
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
                    // InternalXdiagramDsl.g:1396:3: this_Polyline_3= rulePolyline
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
                    // InternalXdiagramDsl.g:1405:3: this_Label_4= ruleLabel
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
                    // InternalXdiagramDsl.g:1414:3: this_Image_5= ruleImage
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
                    // InternalXdiagramDsl.g:1423:3: this_Invisible_6= ruleInvisible
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
                    // InternalXdiagramDsl.g:1432:3: this_Custom_7= ruleCustom
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
                    // InternalXdiagramDsl.g:1441:3: this_Triangle_8= ruleTriangle
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
    // InternalXdiagramDsl.g:1453:1: entryRuleDecoratorElement returns [EObject current=null] : iv_ruleDecoratorElement= ruleDecoratorElement EOF ;
    public final EObject entryRuleDecoratorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoratorElement = null;


        try {
            // InternalXdiagramDsl.g:1453:57: (iv_ruleDecoratorElement= ruleDecoratorElement EOF )
            // InternalXdiagramDsl.g:1454:2: iv_ruleDecoratorElement= ruleDecoratorElement EOF
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
    // InternalXdiagramDsl.g:1460:1: ruleDecoratorElement returns [EObject current=null] : (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) ;
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
            // InternalXdiagramDsl.g:1466:2: ( (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) )
            // InternalXdiagramDsl.g:1467:2: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            {
            // InternalXdiagramDsl.g:1467:2: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 39:
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
                }
                break;
            case 47:
                {
                alt19=5;
                }
                break;
            case 48:
                {
                alt19=6;
                }
                break;
            case 44:
                {
                alt19=7;
                }
                break;
            case 42:
            case 43:
                {
                alt19=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalXdiagramDsl.g:1468:3: this_Ellipse_0= ruleEllipse
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
                    // InternalXdiagramDsl.g:1477:3: this_Rhombus_1= ruleRhombus
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
                    // InternalXdiagramDsl.g:1486:3: this_Polyline_2= rulePolyline
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
                    // InternalXdiagramDsl.g:1495:3: this_Triangle_3= ruleTriangle
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
                    // InternalXdiagramDsl.g:1504:3: this_Label_4= ruleLabel
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
                    // InternalXdiagramDsl.g:1513:3: this_Image_5= ruleImage
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
                    // InternalXdiagramDsl.g:1522:3: this_Arrow_6= ruleArrow
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
                    // InternalXdiagramDsl.g:1531:3: this_Line_7= ruleLine
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
    // InternalXdiagramDsl.g:1543:1: entryRuleConnectableElementFeature returns [EObject current=null] : iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF ;
    public final EObject entryRuleConnectableElementFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElementFeature = null;


        try {
            // InternalXdiagramDsl.g:1543:66: (iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF )
            // InternalXdiagramDsl.g:1544:2: iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF
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
    // InternalXdiagramDsl.g:1550:1: ruleConnectableElementFeature returns [EObject current=null] : (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) ;
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
            // InternalXdiagramDsl.g:1556:2: ( (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) )
            // InternalXdiagramDsl.g:1557:2: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            {
            // InternalXdiagramDsl.g:1557:2: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            int alt20=10;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt20=1;
                }
                break;
            case 54:
                {
                alt20=2;
                }
                break;
            case 50:
            case 51:
                {
                alt20=3;
                }
                break;
            case 52:
                {
                alt20=4;
                }
                break;
            case 74:
                {
                alt20=5;
                }
                break;
            case 76:
                {
                alt20=6;
                }
                break;
            case 45:
                {
                alt20=7;
                }
                break;
            case 27:
                {
                alt20=8;
                }
                break;
            case 60:
                {
                alt20=9;
                }
                break;
            case 49:
                {
                alt20=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalXdiagramDsl.g:1558:3: this_Position_0= rulePosition
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
                    // InternalXdiagramDsl.g:1567:3: this_Size_1= ruleSize
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
                    // InternalXdiagramDsl.g:1576:3: this_ColorFeature_2= ruleColorFeature
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
                    // InternalXdiagramDsl.g:1585:3: this_Transparency_3= ruleTransparency
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
                    // InternalXdiagramDsl.g:1594:3: this_LineStyle_4= ruleLineStyle
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
                    // InternalXdiagramDsl.g:1603:3: this_LineWidth_5= ruleLineWidth
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
                    // InternalXdiagramDsl.g:1612:3: this_Contains_6= ruleContains
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
                    // InternalXdiagramDsl.g:1621:3: this_Anchor_7= ruleAnchor
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
                    // InternalXdiagramDsl.g:1630:3: this_Layout_8= ruleLayout
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
                    // InternalXdiagramDsl.g:1639:3: this_Visible_9= ruleVisible
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
    // InternalXdiagramDsl.g:1651:1: entryRuleCustomFigure returns [EObject current=null] : iv_ruleCustomFigure= ruleCustomFigure EOF ;
    public final EObject entryRuleCustomFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFigure = null;


        try {
            // InternalXdiagramDsl.g:1651:53: (iv_ruleCustomFigure= ruleCustomFigure EOF )
            // InternalXdiagramDsl.g:1652:2: iv_ruleCustomFigure= ruleCustomFigure EOF
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
    // InternalXdiagramDsl.g:1658:1: ruleCustomFigure returns [EObject current=null] : (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleCustomFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1664:2: ( (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) )
            // InternalXdiagramDsl.g:1665:2: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            {
            // InternalXdiagramDsl.g:1665:2: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            // InternalXdiagramDsl.g:1666:3: otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomFigureAccess().getFigureKeyword_0());
            		
            // InternalXdiagramDsl.g:1670:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdiagramDsl.g:1671:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:1671:4: (lv_name_1_0= RULE_ID )
            // InternalXdiagramDsl.g:1672:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_2=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomFigureAccess().getAsKeyword_2());
            		
            // InternalXdiagramDsl.g:1692:3: ( (lv_element_3_0= ruleConnectableElement ) )
            // InternalXdiagramDsl.g:1693:4: (lv_element_3_0= ruleConnectableElement )
            {
            // InternalXdiagramDsl.g:1693:4: (lv_element_3_0= ruleConnectableElement )
            // InternalXdiagramDsl.g:1694:5: lv_element_3_0= ruleConnectableElement
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
    // InternalXdiagramDsl.g:1715:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalXdiagramDsl.g:1715:47: (iv_ruleCustom= ruleCustom EOF )
            // InternalXdiagramDsl.g:1716:2: iv_ruleCustom= ruleCustom EOF
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
    // InternalXdiagramDsl.g:1722:1: ruleCustom returns [EObject current=null] : (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:1728:2: ( (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:1729:2: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:1729:2: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:1730:3: otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkedFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomAccess().getFigureKeyword_0());
            		
            // InternalXdiagramDsl.g:1734:3: ( (otherlv_1= RULE_ID ) )
            // InternalXdiagramDsl.g:1735:4: (otherlv_1= RULE_ID )
            {
            // InternalXdiagramDsl.g:1735:4: (otherlv_1= RULE_ID )
            // InternalXdiagramDsl.g:1736:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getFigureCustomFigureCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:1751:3: ( (lv_features_3_0= ruleLinkedFeature ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27||LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1752:4: (lv_features_3_0= ruleLinkedFeature )
            	    {
            	    // InternalXdiagramDsl.g:1752:4: (lv_features_3_0= ruleLinkedFeature )
            	    // InternalXdiagramDsl.g:1753:5: lv_features_3_0= ruleLinkedFeature
            	    {

            	    					newCompositeNode(grammarAccess.getCustomAccess().getFeaturesLinkedFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
            	    break loop21;
                }
            } while (true);

            // InternalXdiagramDsl.g:1770:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1771:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:1775:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:1776:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:1776:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:1777:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getCustomAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop22;
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
    // InternalXdiagramDsl.g:1803:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalXdiagramDsl.g:1803:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalXdiagramDsl.g:1804:2: iv_ruleRectangle= ruleRectangle EOF
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
    // InternalXdiagramDsl.g:1810:1: ruleRectangle returns [EObject current=null] : ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:1816:2: ( ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:1817:2: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:1817:2: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:1818:3: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleRectangleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:1818:3: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            else if ( (LA23_0==35) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalXdiagramDsl.g:1819:4: ( (lv_rectangle_0_0= 'rectangle' ) )
                    {
                    // InternalXdiagramDsl.g:1819:4: ( (lv_rectangle_0_0= 'rectangle' ) )
                    // InternalXdiagramDsl.g:1820:5: (lv_rectangle_0_0= 'rectangle' )
                    {
                    // InternalXdiagramDsl.g:1820:5: (lv_rectangle_0_0= 'rectangle' )
                    // InternalXdiagramDsl.g:1821:6: lv_rectangle_0_0= 'rectangle'
                    {
                    lv_rectangle_0_0=(Token)match(input,34,FOLLOW_6); 

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
                    // InternalXdiagramDsl.g:1834:4: ( (lv_square_1_0= 'square' ) )
                    {
                    // InternalXdiagramDsl.g:1834:4: ( (lv_square_1_0= 'square' ) )
                    // InternalXdiagramDsl.g:1835:5: (lv_square_1_0= 'square' )
                    {
                    // InternalXdiagramDsl.g:1835:5: (lv_square_1_0= 'square' )
                    // InternalXdiagramDsl.g:1836:6: lv_square_1_0= 'square'
                    {
                    lv_square_1_0=(Token)match(input,35,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXdiagramDsl.g:1853:3: ( (lv_features_3_0= ruleRectangleFeature ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27||LA24_0==45||(LA24_0>=49 && LA24_0<=52)||LA24_0==54||(LA24_0>=58 && LA24_0<=60)||LA24_0==74||LA24_0==76) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1854:4: (lv_features_3_0= ruleRectangleFeature )
            	    {
            	    // InternalXdiagramDsl.g:1854:4: (lv_features_3_0= ruleRectangleFeature )
            	    // InternalXdiagramDsl.g:1855:5: lv_features_3_0= ruleRectangleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getRectangleAccess().getFeaturesRectangleFeatureParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop24;
                }
            } while (true);

            // InternalXdiagramDsl.g:1872:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1873:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRectangleAccess().getChildKeyword_3_0());
            	    			
            	    // InternalXdiagramDsl.g:1877:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:1878:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:1878:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:1879:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getRectangleAccess().getChildrenChildElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop25;
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
    // InternalXdiagramDsl.g:1905:1: entryRuleRectangleFeature returns [EObject current=null] : iv_ruleRectangleFeature= ruleRectangleFeature EOF ;
    public final EObject entryRuleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleFeature = null;


        try {
            // InternalXdiagramDsl.g:1905:57: (iv_ruleRectangleFeature= ruleRectangleFeature EOF )
            // InternalXdiagramDsl.g:1906:2: iv_ruleRectangleFeature= ruleRectangleFeature EOF
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
    // InternalXdiagramDsl.g:1912:1: ruleRectangleFeature returns [EObject current=null] : (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) ;
    public final EObject ruleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElementFeature_0 = null;

        EObject this_Corner_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:1918:2: ( (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) )
            // InternalXdiagramDsl.g:1919:2: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            {
            // InternalXdiagramDsl.g:1919:2: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27||LA26_0==45||(LA26_0>=49 && LA26_0<=52)||LA26_0==54||LA26_0==58||LA26_0==60||LA26_0==74||LA26_0==76) ) {
                alt26=1;
            }
            else if ( (LA26_0==59) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalXdiagramDsl.g:1920:3: this_ConnectableElementFeature_0= ruleConnectableElementFeature
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
                    // InternalXdiagramDsl.g:1929:3: this_Corner_1= ruleCorner
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
    // InternalXdiagramDsl.g:1941:1: entryRuleRhombus returns [EObject current=null] : iv_ruleRhombus= ruleRhombus EOF ;
    public final EObject entryRuleRhombus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhombus = null;


        try {
            // InternalXdiagramDsl.g:1941:48: (iv_ruleRhombus= ruleRhombus EOF )
            // InternalXdiagramDsl.g:1942:2: iv_ruleRhombus= ruleRhombus EOF
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
    // InternalXdiagramDsl.g:1948:1: ruleRhombus returns [EObject current=null] : ( () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:1954:2: ( ( () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:1955:2: ( () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:1955:2: ( () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:1956:3: () otherlv_1= 'rhombus' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:1956:3: ()
            // InternalXdiagramDsl.g:1957:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRhombusAccess().getRhombusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRhombusAccess().getRhombusKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getRhombusAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:1971:3: ( (lv_features_3_0= ruleConnectableElementFeature ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27||LA27_0==45||(LA27_0>=49 && LA27_0<=52)||LA27_0==54||LA27_0==58||LA27_0==60||LA27_0==74||LA27_0==76) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1972:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:1972:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:1973:5: lv_features_3_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getRhombusAccess().getFeaturesConnectableElementFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop27;
                }
            } while (true);

            // InternalXdiagramDsl.g:1990:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalXdiagramDsl.g:1991:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRhombusAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:1995:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:1996:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:1996:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:1997:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getRhombusAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop28;
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
    // InternalXdiagramDsl.g:2023:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // InternalXdiagramDsl.g:2023:48: (iv_ruleEllipse= ruleEllipse EOF )
            // InternalXdiagramDsl.g:2024:2: iv_ruleEllipse= ruleEllipse EOF
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
    // InternalXdiagramDsl.g:2030:1: ruleEllipse returns [EObject current=null] : ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:2036:2: ( ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:2037:2: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:2037:2: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:2038:3: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:2038:3: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            else if ( (LA29_0==38) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalXdiagramDsl.g:2039:4: ( (lv_ellipse_0_0= 'ellipse' ) )
                    {
                    // InternalXdiagramDsl.g:2039:4: ( (lv_ellipse_0_0= 'ellipse' ) )
                    // InternalXdiagramDsl.g:2040:5: (lv_ellipse_0_0= 'ellipse' )
                    {
                    // InternalXdiagramDsl.g:2040:5: (lv_ellipse_0_0= 'ellipse' )
                    // InternalXdiagramDsl.g:2041:6: lv_ellipse_0_0= 'ellipse'
                    {
                    lv_ellipse_0_0=(Token)match(input,37,FOLLOW_6); 

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
                    // InternalXdiagramDsl.g:2054:4: ( (lv_circle_1_0= 'circle' ) )
                    {
                    // InternalXdiagramDsl.g:2054:4: ( (lv_circle_1_0= 'circle' ) )
                    // InternalXdiagramDsl.g:2055:5: (lv_circle_1_0= 'circle' )
                    {
                    // InternalXdiagramDsl.g:2055:5: (lv_circle_1_0= 'circle' )
                    // InternalXdiagramDsl.g:2056:6: lv_circle_1_0= 'circle'
                    {
                    lv_circle_1_0=(Token)match(input,38,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXdiagramDsl.g:2073:3: ( (lv_features_3_0= ruleConnectableElementFeature ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==27||LA30_0==45||(LA30_0>=49 && LA30_0<=52)||LA30_0==54||LA30_0==58||LA30_0==60||LA30_0==74||LA30_0==76) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2074:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2074:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2075:5: lv_features_3_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEllipseAccess().getFeaturesConnectableElementFeatureParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop30;
                }
            } while (true);

            // InternalXdiagramDsl.g:2092:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==33) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2093:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEllipseAccess().getChildKeyword_3_0());
            	    			
            	    // InternalXdiagramDsl.g:2097:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2098:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2098:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2099:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getEllipseAccess().getChildrenChildElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop31;
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
    // InternalXdiagramDsl.g:2125:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // InternalXdiagramDsl.g:2125:49: (iv_rulePolyline= rulePolyline EOF )
            // InternalXdiagramDsl.g:2126:2: iv_rulePolyline= rulePolyline EOF
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
    // InternalXdiagramDsl.g:2132:1: rulePolyline returns [EObject current=null] : ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}' ) ;
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
            // InternalXdiagramDsl.g:2138:2: ( ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}' ) )
            // InternalXdiagramDsl.g:2139:2: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}' )
            {
            // InternalXdiagramDsl.g:2139:2: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}' )
            // InternalXdiagramDsl.g:2140:3: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePoint ) )* ( (lv_features_6_0= ruleConnectableElementFeature ) )* (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )* otherlv_9= '}'
            {
            // InternalXdiagramDsl.g:2140:3: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            else if ( (LA32_0==40) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalXdiagramDsl.g:2141:4: ( (lv_polygon_0_0= 'polygon' ) )
                    {
                    // InternalXdiagramDsl.g:2141:4: ( (lv_polygon_0_0= 'polygon' ) )
                    // InternalXdiagramDsl.g:2142:5: (lv_polygon_0_0= 'polygon' )
                    {
                    // InternalXdiagramDsl.g:2142:5: (lv_polygon_0_0= 'polygon' )
                    // InternalXdiagramDsl.g:2143:6: lv_polygon_0_0= 'polygon'
                    {
                    lv_polygon_0_0=(Token)match(input,39,FOLLOW_6); 

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
                    // InternalXdiagramDsl.g:2156:4: ( (lv_polyline_1_0= 'polyline' ) )
                    {
                    // InternalXdiagramDsl.g:2156:4: ( (lv_polyline_1_0= 'polyline' ) )
                    // InternalXdiagramDsl.g:2157:5: (lv_polyline_1_0= 'polyline' )
                    {
                    // InternalXdiagramDsl.g:2157:5: (lv_polyline_1_0= 'polyline' )
                    // InternalXdiagramDsl.g:2158:6: lv_polyline_1_0= 'polyline'
                    {
                    lv_polyline_1_0=(Token)match(input,40,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getPolylineAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXdiagramDsl.g:2175:3: ( (lv_features_3_0= rulePoint ) )
            // InternalXdiagramDsl.g:2176:4: (lv_features_3_0= rulePoint )
            {
            // InternalXdiagramDsl.g:2176:4: (lv_features_3_0= rulePoint )
            // InternalXdiagramDsl.g:2177:5: lv_features_3_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalXdiagramDsl.g:2194:3: ( (lv_features_4_0= rulePoint ) )
            // InternalXdiagramDsl.g:2195:4: (lv_features_4_0= rulePoint )
            {
            // InternalXdiagramDsl.g:2195:4: (lv_features_4_0= rulePoint )
            // InternalXdiagramDsl.g:2196:5: lv_features_4_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalXdiagramDsl.g:2213:3: ( (lv_features_5_0= rulePoint ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==57) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2214:4: (lv_features_5_0= rulePoint )
            	    {
            	    // InternalXdiagramDsl.g:2214:4: (lv_features_5_0= rulePoint )
            	    // InternalXdiagramDsl.g:2215:5: lv_features_5_0= rulePoint
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_36);
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
            	    break loop33;
                }
            } while (true);

            // InternalXdiagramDsl.g:2232:3: ( (lv_features_6_0= ruleConnectableElementFeature ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27||LA34_0==45||(LA34_0>=49 && LA34_0<=52)||LA34_0==54||LA34_0==58||LA34_0==60||LA34_0==74||LA34_0==76) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2233:4: (lv_features_6_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2233:4: (lv_features_6_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2234:5: lv_features_6_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesConnectableElementFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop34;
                }
            } while (true);

            // InternalXdiagramDsl.g:2251:3: (otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==33) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2252:4: otherlv_7= 'child' ( (lv_children_8_0= ruleChildElement ) )
            	    {
            	    otherlv_7=(Token)match(input,33,FOLLOW_23); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPolylineAccess().getChildKeyword_6_0());
            	    			
            	    // InternalXdiagramDsl.g:2256:4: ( (lv_children_8_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2257:5: (lv_children_8_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2257:5: (lv_children_8_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2258:6: lv_children_8_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getPolylineAccess().getChildrenChildElementParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop35;
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
    // InternalXdiagramDsl.g:2284:1: entryRuleTriangle returns [EObject current=null] : iv_ruleTriangle= ruleTriangle EOF ;
    public final EObject entryRuleTriangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriangle = null;


        try {
            // InternalXdiagramDsl.g:2284:49: (iv_ruleTriangle= ruleTriangle EOF )
            // InternalXdiagramDsl.g:2285:2: iv_ruleTriangle= ruleTriangle EOF
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
    // InternalXdiagramDsl.g:2291:1: ruleTriangle returns [EObject current=null] : ( () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:2297:2: ( ( () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:2298:2: ( () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:2298:2: ( () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:2299:3: () otherlv_1= 'triangle' otherlv_2= '{' ( (lv_features_3_0= ruleConnectableElementFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:2299:3: ()
            // InternalXdiagramDsl.g:2300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriangleAccess().getTriangleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTriangleAccess().getTriangleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getTriangleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2314:3: ( (lv_features_3_0= ruleConnectableElementFeature ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==27||LA36_0==45||(LA36_0>=49 && LA36_0<=52)||LA36_0==54||LA36_0==58||LA36_0==60||LA36_0==74||LA36_0==76) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2315:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    {
            	    // InternalXdiagramDsl.g:2315:4: (lv_features_3_0= ruleConnectableElementFeature )
            	    // InternalXdiagramDsl.g:2316:5: lv_features_3_0= ruleConnectableElementFeature
            	    {

            	    					newCompositeNode(grammarAccess.getTriangleAccess().getFeaturesConnectableElementFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop36;
                }
            } while (true);

            // InternalXdiagramDsl.g:2333:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==33) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2334:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTriangleAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:2338:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2339:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2339:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2340:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getTriangleAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop37;
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
    // InternalXdiagramDsl.g:2366:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalXdiagramDsl.g:2366:45: (iv_ruleLine= ruleLine EOF )
            // InternalXdiagramDsl.g:2367:2: iv_ruleLine= ruleLine EOF
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
    // InternalXdiagramDsl.g:2373:1: ruleLine returns [EObject current=null] : ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}' ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_horizontal_1_0=null;
        Token lv_vertical_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2379:2: ( ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}' ) )
            // InternalXdiagramDsl.g:2380:2: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}' )
            {
            // InternalXdiagramDsl.g:2380:2: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}' )
            // InternalXdiagramDsl.g:2381:3: () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) otherlv_3= '{' ( (lv_features_4_0= ruleLineFeature ) )* otherlv_5= '}'
            {
            // InternalXdiagramDsl.g:2381:3: ()
            // InternalXdiagramDsl.g:2382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineAccess().getLineAction_0(),
            					current);
            			

            }

            // InternalXdiagramDsl.g:2388:3: ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            else if ( (LA38_0==43) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalXdiagramDsl.g:2389:4: ( (lv_horizontal_1_0= 'hline' ) )
                    {
                    // InternalXdiagramDsl.g:2389:4: ( (lv_horizontal_1_0= 'hline' ) )
                    // InternalXdiagramDsl.g:2390:5: (lv_horizontal_1_0= 'hline' )
                    {
                    // InternalXdiagramDsl.g:2390:5: (lv_horizontal_1_0= 'hline' )
                    // InternalXdiagramDsl.g:2391:6: lv_horizontal_1_0= 'hline'
                    {
                    lv_horizontal_1_0=(Token)match(input,42,FOLLOW_6); 

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
                    // InternalXdiagramDsl.g:2404:4: ( (lv_vertical_2_0= 'vline' ) )
                    {
                    // InternalXdiagramDsl.g:2404:4: ( (lv_vertical_2_0= 'vline' ) )
                    // InternalXdiagramDsl.g:2405:5: (lv_vertical_2_0= 'vline' )
                    {
                    // InternalXdiagramDsl.g:2405:5: (lv_vertical_2_0= 'vline' )
                    // InternalXdiagramDsl.g:2406:6: lv_vertical_2_0= 'vline'
                    {
                    lv_vertical_2_0=(Token)match(input,43,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2423:3: ( (lv_features_4_0= ruleLineFeature ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=49 && LA39_0<=50)||LA39_0==54||LA39_0==58||LA39_0==74||LA39_0==76) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2424:4: (lv_features_4_0= ruleLineFeature )
            	    {
            	    // InternalXdiagramDsl.g:2424:4: (lv_features_4_0= ruleLineFeature )
            	    // InternalXdiagramDsl.g:2425:5: lv_features_4_0= ruleLineFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLineAccess().getFeaturesLineFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_37);
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
            	    break loop39;
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
    // InternalXdiagramDsl.g:2450:1: entryRuleLineFeature returns [EObject current=null] : iv_ruleLineFeature= ruleLineFeature EOF ;
    public final EObject entryRuleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineFeature = null;


        try {
            // InternalXdiagramDsl.g:2450:52: (iv_ruleLineFeature= ruleLineFeature EOF )
            // InternalXdiagramDsl.g:2451:2: iv_ruleLineFeature= ruleLineFeature EOF
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
    // InternalXdiagramDsl.g:2457:1: ruleLineFeature returns [EObject current=null] : (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) ;
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
            // InternalXdiagramDsl.g:2463:2: ( (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) )
            // InternalXdiagramDsl.g:2464:2: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            {
            // InternalXdiagramDsl.g:2464:2: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt40=1;
                }
                break;
            case 74:
                {
                alt40=2;
                }
                break;
            case 50:
                {
                alt40=3;
                }
                break;
            case 58:
                {
                alt40=4;
                }
                break;
            case 54:
                {
                alt40=5;
                }
                break;
            case 49:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalXdiagramDsl.g:2465:3: this_LineWidth_0= ruleLineWidth
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
                    // InternalXdiagramDsl.g:2474:3: this_LineStyle_1= ruleLineStyle
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
                    // InternalXdiagramDsl.g:2483:3: this_Foreground_2= ruleForeground
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
                    // InternalXdiagramDsl.g:2492:3: this_Position_3= rulePosition
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
                    // InternalXdiagramDsl.g:2501:3: this_Size_4= ruleSize
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
                    // InternalXdiagramDsl.g:2510:3: this_Visible_5= ruleVisible
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
    // InternalXdiagramDsl.g:2522:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalXdiagramDsl.g:2522:46: (iv_ruleArrow= ruleArrow EOF )
            // InternalXdiagramDsl.g:2523:2: iv_ruleArrow= ruleArrow EOF
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
    // InternalXdiagramDsl.g:2529:1: ruleArrow returns [EObject current=null] : ( () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2535:2: ( ( () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}' ) )
            // InternalXdiagramDsl.g:2536:2: ( () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}' )
            {
            // InternalXdiagramDsl.g:2536:2: ( () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}' )
            // InternalXdiagramDsl.g:2537:3: () otherlv_1= 'arrow' otherlv_2= '{' ( (lv_features_3_0= ruleLineFeature ) )* otherlv_4= '}'
            {
            // InternalXdiagramDsl.g:2537:3: ()
            // InternalXdiagramDsl.g:2538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrowAccess().getArrowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getArrowAccess().getArrowKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getArrowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2552:3: ( (lv_features_3_0= ruleLineFeature ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=49 && LA41_0<=50)||LA41_0==54||LA41_0==58||LA41_0==74||LA41_0==76) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2553:4: (lv_features_3_0= ruleLineFeature )
            	    {
            	    // InternalXdiagramDsl.g:2553:4: (lv_features_3_0= ruleLineFeature )
            	    // InternalXdiagramDsl.g:2554:5: lv_features_3_0= ruleLineFeature
            	    {

            	    					newCompositeNode(grammarAccess.getArrowAccess().getFeaturesLineFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_37);
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
            	    break loop41;
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
    // InternalXdiagramDsl.g:2579:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalXdiagramDsl.g:2579:49: (iv_ruleContains= ruleContains EOF )
            // InternalXdiagramDsl.g:2580:2: iv_ruleContains= ruleContains EOF
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
    // InternalXdiagramDsl.g:2586:1: ruleContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2592:2: ( (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:2593:2: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:2593:2: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:2594:3: otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
            		
            // InternalXdiagramDsl.g:2598:3: ( ( ruleQualifiedName ) )
            // InternalXdiagramDsl.g:2599:4: ( ruleQualifiedName )
            {
            // InternalXdiagramDsl.g:2599:4: ( ruleQualifiedName )
            // InternalXdiagramDsl.g:2600:5: ruleQualifiedName
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

            // InternalXdiagramDsl.g:2614:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==19) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXdiagramDsl.g:2615:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:2615:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:2616:5: lv_conditional_2_0= ruleFeatureConditional
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:2641:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalXdiagramDsl.g:2641:46: (iv_ruleValue= ruleValue EOF )
            // InternalXdiagramDsl.g:2642:2: iv_ruleValue= ruleValue EOF
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
    // InternalXdiagramDsl.g:2648:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_DoubleValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_EnumValue_4 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2654:2: ( (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) )
            // InternalXdiagramDsl.g:2655:2: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            {
            // InternalXdiagramDsl.g:2655:2: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            int alt43=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==EOF||LA43_1==29) ) {
                    alt43=1;
                }
                else if ( (LA43_1==16) ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 46:
                {
                alt43=3;
                }
                break;
            case 97:
            case 98:
                {
                alt43=4;
                }
                break;
            case RULE_ID:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalXdiagramDsl.g:2656:3: this_IntValue_0= ruleIntValue
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
                    // InternalXdiagramDsl.g:2665:3: this_DoubleValue_1= ruleDoubleValue
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
                    // InternalXdiagramDsl.g:2674:3: this_StringValue_2= ruleStringValue
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
                    // InternalXdiagramDsl.g:2683:3: this_BooleanValue_3= ruleBooleanValue
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
                    // InternalXdiagramDsl.g:2692:3: this_EnumValue_4= ruleEnumValue
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
    // InternalXdiagramDsl.g:2704:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalXdiagramDsl.g:2704:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalXdiagramDsl.g:2705:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalXdiagramDsl.g:2711:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:2717:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalXdiagramDsl.g:2718:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalXdiagramDsl.g:2718:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalXdiagramDsl.g:2719:3: (lv_value_0_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:2719:3: (lv_value_0_0= RULE_INT )
            // InternalXdiagramDsl.g:2720:4: lv_value_0_0= RULE_INT
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
    // InternalXdiagramDsl.g:2739:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // InternalXdiagramDsl.g:2739:52: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // InternalXdiagramDsl.g:2740:2: iv_ruleDoubleValue= ruleDoubleValue EOF
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
    // InternalXdiagramDsl.g:2746:1: ruleDoubleValue returns [EObject current=null] : ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueInt_0_0=null;
        Token otherlv_1=null;
        Token lv_valueDecimal_2_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:2752:2: ( ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) )
            // InternalXdiagramDsl.g:2753:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            {
            // InternalXdiagramDsl.g:2753:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            // InternalXdiagramDsl.g:2754:3: ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) )
            {
            // InternalXdiagramDsl.g:2754:3: ( (lv_valueInt_0_0= RULE_INT ) )
            // InternalXdiagramDsl.g:2755:4: (lv_valueInt_0_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:2755:4: (lv_valueInt_0_0= RULE_INT )
            // InternalXdiagramDsl.g:2756:5: lv_valueInt_0_0= RULE_INT
            {
            lv_valueInt_0_0=(Token)match(input,RULE_INT,FOLLOW_38); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleValueAccess().getFullStopKeyword_1());
            		
            // InternalXdiagramDsl.g:2776:3: ( (lv_valueDecimal_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:2777:4: (lv_valueDecimal_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:2777:4: (lv_valueDecimal_2_0= RULE_INT )
            // InternalXdiagramDsl.g:2778:5: lv_valueDecimal_2_0= RULE_INT
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
    // InternalXdiagramDsl.g:2798:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalXdiagramDsl.g:2798:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalXdiagramDsl.g:2799:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalXdiagramDsl.g:2805:1: ruleStringValue returns [EObject current=null] : ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_null_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:2811:2: ( ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalXdiagramDsl.g:2812:2: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalXdiagramDsl.g:2812:2: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_STRING) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalXdiagramDsl.g:2813:3: ( (lv_null_0_0= 'null' ) )
                    {
                    // InternalXdiagramDsl.g:2813:3: ( (lv_null_0_0= 'null' ) )
                    // InternalXdiagramDsl.g:2814:4: (lv_null_0_0= 'null' )
                    {
                    // InternalXdiagramDsl.g:2814:4: (lv_null_0_0= 'null' )
                    // InternalXdiagramDsl.g:2815:5: lv_null_0_0= 'null'
                    {
                    lv_null_0_0=(Token)match(input,46,FOLLOW_2); 

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
                    // InternalXdiagramDsl.g:2828:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalXdiagramDsl.g:2828:3: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:2829:4: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:2829:4: (lv_value_1_0= RULE_STRING )
                    // InternalXdiagramDsl.g:2830:5: lv_value_1_0= RULE_STRING
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
    // InternalXdiagramDsl.g:2850:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalXdiagramDsl.g:2850:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalXdiagramDsl.g:2851:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalXdiagramDsl.g:2857:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteral ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:2863:2: ( ( (lv_value_0_0= ruleBooleanLiteral ) ) )
            // InternalXdiagramDsl.g:2864:2: ( (lv_value_0_0= ruleBooleanLiteral ) )
            {
            // InternalXdiagramDsl.g:2864:2: ( (lv_value_0_0= ruleBooleanLiteral ) )
            // InternalXdiagramDsl.g:2865:3: (lv_value_0_0= ruleBooleanLiteral )
            {
            // InternalXdiagramDsl.g:2865:3: (lv_value_0_0= ruleBooleanLiteral )
            // InternalXdiagramDsl.g:2866:4: lv_value_0_0= ruleBooleanLiteral
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
    // InternalXdiagramDsl.g:2886:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalXdiagramDsl.g:2886:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalXdiagramDsl.g:2887:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalXdiagramDsl.g:2893:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:2899:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalXdiagramDsl.g:2900:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalXdiagramDsl.g:2900:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalXdiagramDsl.g:2901:3: (lv_name_0_0= RULE_ID )
            {
            // InternalXdiagramDsl.g:2901:3: (lv_name_0_0= RULE_ID )
            // InternalXdiagramDsl.g:2902:4: lv_name_0_0= RULE_ID
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
    // InternalXdiagramDsl.g:2921:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalXdiagramDsl.g:2921:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalXdiagramDsl.g:2922:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalXdiagramDsl.g:2928:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:2934:2: ( ( () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:2935:2: ( () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:2935:2: ( () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:2936:3: () otherlv_1= 'label' otherlv_2= '{' ( (lv_features_3_0= ruleLabelFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:2936:3: ()
            // InternalXdiagramDsl.g:2937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:2951:3: ( (lv_features_3_0= ruleLabelFeature ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=49 && LA45_0<=50)||LA45_0==54||LA45_0==58||LA45_0==64||LA45_0==66||LA45_0==73) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2952:4: (lv_features_3_0= ruleLabelFeature )
            	    {
            	    // InternalXdiagramDsl.g:2952:4: (lv_features_3_0= ruleLabelFeature )
            	    // InternalXdiagramDsl.g:2953:5: lv_features_3_0= ruleLabelFeature
            	    {

            	    					newCompositeNode(grammarAccess.getLabelAccess().getFeaturesLabelFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
            	    break loop45;
                }
            } while (true);

            // InternalXdiagramDsl.g:2970:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==33) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalXdiagramDsl.g:2971:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:2975:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:2976:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:2976:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:2977:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getLabelAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop46;
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
    // InternalXdiagramDsl.g:3003:1: entryRuleLabelFeature returns [EObject current=null] : iv_ruleLabelFeature= ruleLabelFeature EOF ;
    public final EObject entryRuleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelFeature = null;


        try {
            // InternalXdiagramDsl.g:3003:53: (iv_ruleLabelFeature= ruleLabelFeature EOF )
            // InternalXdiagramDsl.g:3004:2: iv_ruleLabelFeature= ruleLabelFeature EOF
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
    // InternalXdiagramDsl.g:3010:1: ruleLabelFeature returns [EObject current=null] : (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) ;
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
            // InternalXdiagramDsl.g:3016:2: ( (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) )
            // InternalXdiagramDsl.g:3017:2: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            {
            // InternalXdiagramDsl.g:3017:2: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            int alt47=7;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt47=1;
                }
                break;
            case 50:
                {
                alt47=2;
                }
                break;
            case 66:
                {
                alt47=3;
                }
                break;
            case 54:
                {
                alt47=4;
                }
                break;
            case 58:
                {
                alt47=5;
                }
                break;
            case 49:
                {
                alt47=6;
                }
                break;
            case 73:
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
                    // InternalXdiagramDsl.g:3018:3: this_TextValue_0= ruleTextValue
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
                    // InternalXdiagramDsl.g:3027:3: this_Foreground_1= ruleForeground
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
                    // InternalXdiagramDsl.g:3036:3: this_FontProperties_2= ruleFontProperties
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
                    // InternalXdiagramDsl.g:3045:3: this_Size_3= ruleSize
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
                    // InternalXdiagramDsl.g:3054:3: this_Position_4= rulePosition
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
                    // InternalXdiagramDsl.g:3063:3: this_Visible_5= ruleVisible
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
                    // InternalXdiagramDsl.g:3072:3: this_TextAlign_6= ruleTextAlign
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
    // InternalXdiagramDsl.g:3084:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalXdiagramDsl.g:3084:46: (iv_ruleImage= ruleImage EOF )
            // InternalXdiagramDsl.g:3085:2: iv_ruleImage= ruleImage EOF
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
    // InternalXdiagramDsl.g:3091:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:3097:2: ( (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:3098:2: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:3098:2: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:3099:3: otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
            		
            // InternalXdiagramDsl.g:3103:3: ( (lv_imageId_1_0= RULE_STRING ) )
            // InternalXdiagramDsl.g:3104:4: (lv_imageId_1_0= RULE_STRING )
            {
            // InternalXdiagramDsl.g:3104:4: (lv_imageId_1_0= RULE_STRING )
            // InternalXdiagramDsl.g:3105:5: lv_imageId_1_0= RULE_STRING
            {
            lv_imageId_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:3125:3: ( (lv_features_3_0= ruleImageFeature ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==52||LA48_0==54||LA48_0==58) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3126:4: (lv_features_3_0= ruleImageFeature )
            	    {
            	    // InternalXdiagramDsl.g:3126:4: (lv_features_3_0= ruleImageFeature )
            	    // InternalXdiagramDsl.g:3127:5: lv_features_3_0= ruleImageFeature
            	    {

            	    					newCompositeNode(grammarAccess.getImageAccess().getFeaturesImageFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop48;
                }
            } while (true);

            // InternalXdiagramDsl.g:3144:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==33) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3145:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getImageAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:3149:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:3150:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:3150:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:3151:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getImageAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop49;
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
    // InternalXdiagramDsl.g:3177:1: entryRuleImageFeature returns [EObject current=null] : iv_ruleImageFeature= ruleImageFeature EOF ;
    public final EObject entryRuleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFeature = null;


        try {
            // InternalXdiagramDsl.g:3177:53: (iv_ruleImageFeature= ruleImageFeature EOF )
            // InternalXdiagramDsl.g:3178:2: iv_ruleImageFeature= ruleImageFeature EOF
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
    // InternalXdiagramDsl.g:3184:1: ruleImageFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) ;
    public final EObject ruleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Transparency_2 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3190:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) )
            // InternalXdiagramDsl.g:3191:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            {
            // InternalXdiagramDsl.g:3191:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt50=1;
                }
                break;
            case 58:
                {
                alt50=2;
                }
                break;
            case 52:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalXdiagramDsl.g:3192:3: this_Size_0= ruleSize
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
                    // InternalXdiagramDsl.g:3201:3: this_Position_1= rulePosition
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
                    // InternalXdiagramDsl.g:3210:3: this_Transparency_2= ruleTransparency
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
    // InternalXdiagramDsl.g:3222:1: entryRuleInvisible returns [EObject current=null] : iv_ruleInvisible= ruleInvisible EOF ;
    public final EObject entryRuleInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisible = null;


        try {
            // InternalXdiagramDsl.g:3222:50: (iv_ruleInvisible= ruleInvisible EOF )
            // InternalXdiagramDsl.g:3223:2: iv_ruleInvisible= ruleInvisible EOF
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
    // InternalXdiagramDsl.g:3229:1: ruleInvisible returns [EObject current=null] : ( () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalXdiagramDsl.g:3235:2: ( ( () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' ) )
            // InternalXdiagramDsl.g:3236:2: ( () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            {
            // InternalXdiagramDsl.g:3236:2: ( () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}' )
            // InternalXdiagramDsl.g:3237:3: () otherlv_1= 'invisible' otherlv_2= '{' ( (lv_features_3_0= ruleInvisibleFeature ) )* (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )* otherlv_6= '}'
            {
            // InternalXdiagramDsl.g:3237:3: ()
            // InternalXdiagramDsl.g:3238:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvisibleAccess().getInvisibleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInvisibleAccess().getInvisibleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getInvisibleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdiagramDsl.g:3252:3: ( (lv_features_3_0= ruleInvisibleFeature ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==27||LA51_0==45||LA51_0==54||LA51_0==58||LA51_0==60) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3253:4: (lv_features_3_0= ruleInvisibleFeature )
            	    {
            	    // InternalXdiagramDsl.g:3253:4: (lv_features_3_0= ruleInvisibleFeature )
            	    // InternalXdiagramDsl.g:3254:5: lv_features_3_0= ruleInvisibleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getInvisibleAccess().getFeaturesInvisibleFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_41);
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
            	    break loop51;
                }
            } while (true);

            // InternalXdiagramDsl.g:3271:3: (otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==33) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalXdiagramDsl.g:3272:4: otherlv_4= 'child' ( (lv_children_5_0= ruleChildElement ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInvisibleAccess().getChildKeyword_4_0());
            	    			
            	    // InternalXdiagramDsl.g:3276:4: ( (lv_children_5_0= ruleChildElement ) )
            	    // InternalXdiagramDsl.g:3277:5: (lv_children_5_0= ruleChildElement )
            	    {
            	    // InternalXdiagramDsl.g:3277:5: (lv_children_5_0= ruleChildElement )
            	    // InternalXdiagramDsl.g:3278:6: lv_children_5_0= ruleChildElement
            	    {

            	    						newCompositeNode(grammarAccess.getInvisibleAccess().getChildrenChildElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop52;
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
    // InternalXdiagramDsl.g:3304:1: entryRuleInvisibleFeature returns [EObject current=null] : iv_ruleInvisibleFeature= ruleInvisibleFeature EOF ;
    public final EObject entryRuleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisibleFeature = null;


        try {
            // InternalXdiagramDsl.g:3304:57: (iv_ruleInvisibleFeature= ruleInvisibleFeature EOF )
            // InternalXdiagramDsl.g:3305:2: iv_ruleInvisibleFeature= ruleInvisibleFeature EOF
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
    // InternalXdiagramDsl.g:3311:1: ruleInvisibleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) ;
    public final EObject ruleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_LinkedFeature_2 = null;

        EObject this_Layout_3 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3317:2: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) )
            // InternalXdiagramDsl.g:3318:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            {
            // InternalXdiagramDsl.g:3318:2: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt53=1;
                }
                break;
            case 58:
                {
                alt53=2;
                }
                break;
            case 27:
            case 45:
                {
                alt53=3;
                }
                break;
            case 60:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalXdiagramDsl.g:3319:3: this_Size_0= ruleSize
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
                    // InternalXdiagramDsl.g:3328:3: this_Position_1= rulePosition
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
                    // InternalXdiagramDsl.g:3337:3: this_LinkedFeature_2= ruleLinkedFeature
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
                    // InternalXdiagramDsl.g:3346:3: this_Layout_3= ruleLayout
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
    // InternalXdiagramDsl.g:3358:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // InternalXdiagramDsl.g:3358:53: (iv_ruleColorFeature= ruleColorFeature EOF )
            // InternalXdiagramDsl.g:3359:2: iv_ruleColorFeature= ruleColorFeature EOF
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
    // InternalXdiagramDsl.g:3365:1: ruleColorFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_Background_1 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3371:2: ( (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) )
            // InternalXdiagramDsl.g:3372:2: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            {
            // InternalXdiagramDsl.g:3372:2: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==50) ) {
                alt54=1;
            }
            else if ( (LA54_0==51) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalXdiagramDsl.g:3373:3: this_Foreground_0= ruleForeground
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
                    // InternalXdiagramDsl.g:3382:3: this_Background_1= ruleBackground
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
    // InternalXdiagramDsl.g:3394:1: entryRuleForeground returns [EObject current=null] : iv_ruleForeground= ruleForeground EOF ;
    public final EObject entryRuleForeground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeground = null;


        try {
            // InternalXdiagramDsl.g:3394:51: (iv_ruleForeground= ruleForeground EOF )
            // InternalXdiagramDsl.g:3395:2: iv_ruleForeground= ruleForeground EOF
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
    // InternalXdiagramDsl.g:3401:1: ruleForeground returns [EObject current=null] : ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleForeground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3407:2: ( ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:3408:2: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:3408:2: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:3409:3: ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalXdiagramDsl.g:3409:3: ( (lv_type_0_0= 'foreground' ) )
            // InternalXdiagramDsl.g:3410:4: (lv_type_0_0= 'foreground' )
            {
            // InternalXdiagramDsl.g:3410:4: (lv_type_0_0= 'foreground' )
            // InternalXdiagramDsl.g:3411:5: lv_type_0_0= 'foreground'
            {
            lv_type_0_0=(Token)match(input,50,FOLLOW_42); 

            					newLeafNode(lv_type_0_0, grammarAccess.getForegroundAccess().getTypeForegroundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForegroundRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "foreground");
            				

            }


            }

            // InternalXdiagramDsl.g:3423:3: ( (lv_color_1_0= ruleColor ) )
            // InternalXdiagramDsl.g:3424:4: (lv_color_1_0= ruleColor )
            {
            // InternalXdiagramDsl.g:3424:4: (lv_color_1_0= ruleColor )
            // InternalXdiagramDsl.g:3425:5: lv_color_1_0= ruleColor
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

            // InternalXdiagramDsl.g:3442:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==19) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXdiagramDsl.g:3443:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3443:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3444:5: lv_conditional_2_0= ruleFeatureConditional
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3469:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalXdiagramDsl.g:3469:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalXdiagramDsl.g:3470:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalXdiagramDsl.g:3476:1: ruleBackground returns [EObject current=null] : ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3482:2: ( ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:3483:2: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:3483:2: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:3484:3: ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalXdiagramDsl.g:3484:3: ( (lv_type_0_0= 'background' ) )
            // InternalXdiagramDsl.g:3485:4: (lv_type_0_0= 'background' )
            {
            // InternalXdiagramDsl.g:3485:4: (lv_type_0_0= 'background' )
            // InternalXdiagramDsl.g:3486:5: lv_type_0_0= 'background'
            {
            lv_type_0_0=(Token)match(input,51,FOLLOW_42); 

            					newLeafNode(lv_type_0_0, grammarAccess.getBackgroundAccess().getTypeBackgroundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "background");
            				

            }


            }

            // InternalXdiagramDsl.g:3498:3: ( (lv_color_1_0= ruleColor ) )
            // InternalXdiagramDsl.g:3499:4: (lv_color_1_0= ruleColor )
            {
            // InternalXdiagramDsl.g:3499:4: (lv_color_1_0= ruleColor )
            // InternalXdiagramDsl.g:3500:5: lv_color_1_0= ruleColor
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

            // InternalXdiagramDsl.g:3517:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==19) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalXdiagramDsl.g:3518:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3518:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3519:5: lv_conditional_2_0= ruleFeatureConditional
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3544:1: entryRuleTransparency returns [EObject current=null] : iv_ruleTransparency= ruleTransparency EOF ;
    public final EObject entryRuleTransparency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransparency = null;


        try {
            // InternalXdiagramDsl.g:3544:53: (iv_ruleTransparency= ruleTransparency EOF )
            // InternalXdiagramDsl.g:3545:2: iv_ruleTransparency= ruleTransparency EOF
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
    // InternalXdiagramDsl.g:3551:1: ruleTransparency returns [EObject current=null] : (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTransparency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_percent_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3557:2: ( (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:3558:2: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:3558:2: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:3559:3: otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTransparencyAccess().getTransparencyKeyword_0());
            		
            // InternalXdiagramDsl.g:3563:3: ( (lv_percent_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3564:4: (lv_percent_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3564:4: (lv_percent_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3565:5: lv_percent_1_0= RULE_INT
            {
            lv_percent_1_0=(Token)match(input,RULE_INT,FOLLOW_43); 

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

            otherlv_2=(Token)match(input,53,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getTransparencyAccess().getPercentSignKeyword_2());
            		
            // InternalXdiagramDsl.g:3585:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==19) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalXdiagramDsl.g:3586:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3586:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3587:5: lv_conditional_3_0= ruleFeatureConditional
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

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3612:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalXdiagramDsl.g:3612:45: (iv_ruleSize= ruleSize EOF )
            // InternalXdiagramDsl.g:3613:2: iv_ruleSize= ruleSize EOF
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
    // InternalXdiagramDsl.g:3619:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) ;
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
            // InternalXdiagramDsl.g:3625:2: ( (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) )
            // InternalXdiagramDsl.g:3626:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            {
            // InternalXdiagramDsl.g:3626:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            // InternalXdiagramDsl.g:3627:3: otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            // InternalXdiagramDsl.g:3631:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3632:4: (lv_width_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3632:4: (lv_width_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3633:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_44); 

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

            // InternalXdiagramDsl.g:3649:3: ( (lv_widthRelative_2_0= ']' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==55) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalXdiagramDsl.g:3650:4: (lv_widthRelative_2_0= ']' )
                    {
                    // InternalXdiagramDsl.g:3650:4: (lv_widthRelative_2_0= ']' )
                    // InternalXdiagramDsl.g:3651:5: lv_widthRelative_2_0= ']'
                    {
                    lv_widthRelative_2_0=(Token)match(input,55,FOLLOW_45); 

                    					newLeafNode(lv_widthRelative_2_0, grammarAccess.getSizeAccess().getWidthRelativeRightSquareBracketKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSizeRule());
                    					}
                    					setWithLastConsumed(current, "widthRelative", true, "]");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:3663:3: ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_INT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalXdiagramDsl.g:3664:4: ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )?
                    {
                    // InternalXdiagramDsl.g:3664:4: ( (lv_height_3_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:3665:5: (lv_height_3_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:3665:5: (lv_height_3_0= RULE_INT )
                    // InternalXdiagramDsl.g:3666:6: lv_height_3_0= RULE_INT
                    {
                    lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_46); 

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

                    // InternalXdiagramDsl.g:3682:4: ( (lv_heightRelative_4_0= ']' ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==55) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalXdiagramDsl.g:3683:5: (lv_heightRelative_4_0= ']' )
                            {
                            // InternalXdiagramDsl.g:3683:5: (lv_heightRelative_4_0= ']' )
                            // InternalXdiagramDsl.g:3684:6: lv_heightRelative_4_0= ']'
                            {
                            lv_heightRelative_4_0=(Token)match(input,55,FOLLOW_47); 

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

            // InternalXdiagramDsl.g:3697:3: ( (lv_resizable_5_0= 'resizable' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==56) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalXdiagramDsl.g:3698:4: (lv_resizable_5_0= 'resizable' )
                    {
                    // InternalXdiagramDsl.g:3698:4: (lv_resizable_5_0= 'resizable' )
                    // InternalXdiagramDsl.g:3699:5: lv_resizable_5_0= 'resizable'
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

            // InternalXdiagramDsl.g:3711:3: ( (lv_conditional_6_0= ruleFeatureConditional ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==19) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXdiagramDsl.g:3712:4: (lv_conditional_6_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3712:4: (lv_conditional_6_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3713:5: lv_conditional_6_0= ruleFeatureConditional
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

            otherlv_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3738:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalXdiagramDsl.g:3738:46: (iv_rulePoint= rulePoint EOF )
            // InternalXdiagramDsl.g:3739:2: iv_rulePoint= rulePoint EOF
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
    // InternalXdiagramDsl.g:3745:1: rulePoint returns [EObject current=null] : (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3751:2: ( (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:3752:2: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:3752:2: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:3753:3: otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getPointKeyword_0());
            		
            // InternalXdiagramDsl.g:3757:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3758:4: (lv_x_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3758:4: (lv_x_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3759:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            // InternalXdiagramDsl.g:3775:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3776:4: (lv_y_2_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3776:4: (lv_y_2_0= RULE_INT )
            // InternalXdiagramDsl.g:3777:5: lv_y_2_0= RULE_INT
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

            // InternalXdiagramDsl.g:3793:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==19) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXdiagramDsl.g:3794:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3794:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3795:5: lv_conditional_3_0= ruleFeatureConditional
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

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3820:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalXdiagramDsl.g:3820:49: (iv_rulePosition= rulePosition EOF )
            // InternalXdiagramDsl.g:3821:2: iv_rulePosition= rulePosition EOF
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
    // InternalXdiagramDsl.g:3827:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalXdiagramDsl.g:3833:2: ( (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:3834:2: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:3834:2: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:3835:3: otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            // InternalXdiagramDsl.g:3839:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3840:4: (lv_x_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3840:4: (lv_x_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3841:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_48); 

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

            // InternalXdiagramDsl.g:3857:3: ( (lv_xRelative_2_0= '%' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==53) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXdiagramDsl.g:3858:4: (lv_xRelative_2_0= '%' )
                    {
                    // InternalXdiagramDsl.g:3858:4: (lv_xRelative_2_0= '%' )
                    // InternalXdiagramDsl.g:3859:5: lv_xRelative_2_0= '%'
                    {
                    lv_xRelative_2_0=(Token)match(input,53,FOLLOW_49); 

                    					newLeafNode(lv_xRelative_2_0, grammarAccess.getPositionAccess().getXRelativePercentSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPositionRule());
                    					}
                    					setWithLastConsumed(current, "xRelative", true, "%");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:3871:3: ( ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_INT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXdiagramDsl.g:3872:4: ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )?
                    {
                    // InternalXdiagramDsl.g:3872:4: ( (lv_y_3_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:3873:5: (lv_y_3_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:3873:5: (lv_y_3_0= RULE_INT )
                    // InternalXdiagramDsl.g:3874:6: lv_y_3_0= RULE_INT
                    {
                    lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_y_3_0, grammarAccess.getPositionAccess().getYINTTerminalRuleCall_3_0_0());
                    					

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

                    // InternalXdiagramDsl.g:3890:4: ( (lv_yRelative_4_0= '%' ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==53) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalXdiagramDsl.g:3891:5: (lv_yRelative_4_0= '%' )
                            {
                            // InternalXdiagramDsl.g:3891:5: (lv_yRelative_4_0= '%' )
                            // InternalXdiagramDsl.g:3892:6: lv_yRelative_4_0= '%'
                            {
                            lv_yRelative_4_0=(Token)match(input,53,FOLLOW_27); 

                            						newLeafNode(lv_yRelative_4_0, grammarAccess.getPositionAccess().getYRelativePercentSignKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPositionRule());
                            						}
                            						setWithLastConsumed(current, "yRelative", true, "%");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:3905:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==19) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXdiagramDsl.g:3906:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3906:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3907:5: lv_conditional_5_0= ruleFeatureConditional
                    {

                    					newCompositeNode(grammarAccess.getPositionAccess().getConditionalFeatureConditionalParserRuleCall_4_0());
                    				
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

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPositionAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalXdiagramDsl.g:3932:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // InternalXdiagramDsl.g:3932:47: (iv_ruleCorner= ruleCorner EOF )
            // InternalXdiagramDsl.g:3933:2: iv_ruleCorner= ruleCorner EOF
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
    // InternalXdiagramDsl.g:3939:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:3945:2: ( (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:3946:2: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:3946:2: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:3947:3: otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
            		
            // InternalXdiagramDsl.g:3951:3: ( (lv_angle_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:3952:4: (lv_angle_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:3952:4: (lv_angle_1_0= RULE_INT )
            // InternalXdiagramDsl.g:3953:5: lv_angle_1_0= RULE_INT
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

            // InternalXdiagramDsl.g:3969:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==19) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXdiagramDsl.g:3970:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:3970:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:3971:5: lv_conditional_2_0= ruleFeatureConditional
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:3996:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalXdiagramDsl.g:3996:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalXdiagramDsl.g:3997:2: iv_ruleLayout= ruleLayout EOF
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
    // InternalXdiagramDsl.g:4003:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalXdiagramDsl.g:4009:2: ( (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalXdiagramDsl.g:4010:2: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalXdiagramDsl.g:4010:2: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalXdiagramDsl.g:4011:3: otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
            		
            // InternalXdiagramDsl.g:4015:3: ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==61) ) {
                alt69=1;
            }
            else if ( (LA69_0==62) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalXdiagramDsl.g:4016:4: ( (lv_vertical_1_0= 'vertical' ) )
                    {
                    // InternalXdiagramDsl.g:4016:4: ( (lv_vertical_1_0= 'vertical' ) )
                    // InternalXdiagramDsl.g:4017:5: (lv_vertical_1_0= 'vertical' )
                    {
                    // InternalXdiagramDsl.g:4017:5: (lv_vertical_1_0= 'vertical' )
                    // InternalXdiagramDsl.g:4018:6: lv_vertical_1_0= 'vertical'
                    {
                    lv_vertical_1_0=(Token)match(input,61,FOLLOW_52); 

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
                    // InternalXdiagramDsl.g:4031:4: ( (lv_horizontal_2_0= 'horizontal' ) )
                    {
                    // InternalXdiagramDsl.g:4031:4: ( (lv_horizontal_2_0= 'horizontal' ) )
                    // InternalXdiagramDsl.g:4032:5: (lv_horizontal_2_0= 'horizontal' )
                    {
                    // InternalXdiagramDsl.g:4032:5: (lv_horizontal_2_0= 'horizontal' )
                    // InternalXdiagramDsl.g:4033:6: lv_horizontal_2_0= 'horizontal'
                    {
                    lv_horizontal_2_0=(Token)match(input,62,FOLLOW_52); 

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

            // InternalXdiagramDsl.g:4046:3: (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==63) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXdiagramDsl.g:4047:4: otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getMarginKeyword_2_0());
                    			
                    // InternalXdiagramDsl.g:4051:4: ( (lv_margin_4_0= RULE_INT ) )
                    // InternalXdiagramDsl.g:4052:5: (lv_margin_4_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:4052:5: (lv_margin_4_0= RULE_INT )
                    // InternalXdiagramDsl.g:4053:6: lv_margin_4_0= RULE_INT
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

            // InternalXdiagramDsl.g:4070:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==19) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXdiagramDsl.g:4071:4: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4071:4: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4072:5: lv_conditional_5_0= ruleFeatureConditional
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

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4097:1: entryRuleVisible returns [EObject current=null] : iv_ruleVisible= ruleVisible EOF ;
    public final EObject entryRuleVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisible = null;


        try {
            // InternalXdiagramDsl.g:4097:48: (iv_ruleVisible= ruleVisible EOF )
            // InternalXdiagramDsl.g:4098:2: iv_ruleVisible= ruleVisible EOF
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
    // InternalXdiagramDsl.g:4104:1: ruleVisible returns [EObject current=null] : (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) ;
    public final EObject ruleVisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_conditional_1_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4110:2: ( (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) )
            // InternalXdiagramDsl.g:4111:2: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            {
            // InternalXdiagramDsl.g:4111:2: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            // InternalXdiagramDsl.g:4112:3: otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibleAccess().getInvisibleKeyword_0());
            		
            // InternalXdiagramDsl.g:4116:3: ( (lv_conditional_1_0= ruleFeatureConditional ) )
            // InternalXdiagramDsl.g:4117:4: (lv_conditional_1_0= ruleFeatureConditional )
            {
            // InternalXdiagramDsl.g:4117:4: (lv_conditional_1_0= ruleFeatureConditional )
            // InternalXdiagramDsl.g:4118:5: lv_conditional_1_0= ruleFeatureConditional
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4143:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalXdiagramDsl.g:4143:50: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalXdiagramDsl.g:4144:2: iv_ruleTextValue= ruleTextValue EOF
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
    // InternalXdiagramDsl.g:4150:1: ruleTextValue returns [EObject current=null] : ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_parts_2_0 = null;

        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4156:2: ( ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalXdiagramDsl.g:4157:2: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalXdiagramDsl.g:4157:2: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalXdiagramDsl.g:4158:3: () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            // InternalXdiagramDsl.g:4158:3: ()
            // InternalXdiagramDsl.g:4159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextValueAccess().getTextValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getTextValueAccess().getTextKeyword_1());
            		
            // InternalXdiagramDsl.g:4169:3: ( (lv_parts_2_0= ruleTextPart ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_ID)||LA72_0==65) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalXdiagramDsl.g:4170:4: (lv_parts_2_0= ruleTextPart )
            	    {
            	    // InternalXdiagramDsl.g:4170:4: (lv_parts_2_0= ruleTextPart )
            	    // InternalXdiagramDsl.g:4171:5: lv_parts_2_0= ruleTextPart
            	    {

            	    					newCompositeNode(grammarAccess.getTextValueAccess().getPartsTextPartParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_54);
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
            	    break loop72;
                }
            } while (true);

            // InternalXdiagramDsl.g:4188:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==19) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalXdiagramDsl.g:4189:4: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4189:4: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4190:5: lv_conditional_3_0= ruleFeatureConditional
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

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4215:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // InternalXdiagramDsl.g:4215:49: (iv_ruleTextPart= ruleTextPart EOF )
            // InternalXdiagramDsl.g:4216:2: iv_ruleTextPart= ruleTextPart EOF
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
    // InternalXdiagramDsl.g:4222:1: ruleTextPart returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_editable_1_0=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4228:2: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) )
            // InternalXdiagramDsl.g:4229:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            {
            // InternalXdiagramDsl.g:4229:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_STRING) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID||LA75_0==65) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalXdiagramDsl.g:4230:3: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // InternalXdiagramDsl.g:4230:3: ( (lv_text_0_0= RULE_STRING ) )
                    // InternalXdiagramDsl.g:4231:4: (lv_text_0_0= RULE_STRING )
                    {
                    // InternalXdiagramDsl.g:4231:4: (lv_text_0_0= RULE_STRING )
                    // InternalXdiagramDsl.g:4232:5: lv_text_0_0= RULE_STRING
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
                    // InternalXdiagramDsl.g:4249:3: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    {
                    // InternalXdiagramDsl.g:4249:3: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    // InternalXdiagramDsl.g:4250:4: ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) )
                    {
                    // InternalXdiagramDsl.g:4250:4: ( (lv_editable_1_0= 'edit:' ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==65) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalXdiagramDsl.g:4251:5: (lv_editable_1_0= 'edit:' )
                            {
                            // InternalXdiagramDsl.g:4251:5: (lv_editable_1_0= 'edit:' )
                            // InternalXdiagramDsl.g:4252:6: lv_editable_1_0= 'edit:'
                            {
                            lv_editable_1_0=(Token)match(input,65,FOLLOW_12); 

                            						newLeafNode(lv_editable_1_0, grammarAccess.getTextPartAccess().getEditableEditKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTextPartRule());
                            						}
                            						setWithLastConsumed(current, "editable", true, "edit:");
                            					

                            }


                            }
                            break;

                    }

                    // InternalXdiagramDsl.g:4264:4: ( ( ruleQualifiedName ) )
                    // InternalXdiagramDsl.g:4265:5: ( ruleQualifiedName )
                    {
                    // InternalXdiagramDsl.g:4265:5: ( ruleQualifiedName )
                    // InternalXdiagramDsl.g:4266:6: ruleQualifiedName
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
    // InternalXdiagramDsl.g:4285:1: entryRuleFontProperties returns [EObject current=null] : iv_ruleFontProperties= ruleFontProperties EOF ;
    public final EObject entryRuleFontProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontProperties = null;


        try {
            // InternalXdiagramDsl.g:4285:55: (iv_ruleFontProperties= ruleFontProperties EOF )
            // InternalXdiagramDsl.g:4286:2: iv_ruleFontProperties= ruleFontProperties EOF
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
    // InternalXdiagramDsl.g:4292:1: ruleFontProperties returns [EObject current=null] : ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) ;
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
            // InternalXdiagramDsl.g:4298:2: ( ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) )
            // InternalXdiagramDsl.g:4299:2: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            {
            // InternalXdiagramDsl.g:4299:2: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            // InternalXdiagramDsl.g:4300:3: () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';'
            {
            // InternalXdiagramDsl.g:4300:3: ()
            // InternalXdiagramDsl.g:4301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFontPropertiesAccess().getFontPropertiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getFontPropertiesAccess().getFontKeyword_1());
            		
            // InternalXdiagramDsl.g:4311:3: ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )?
            int alt76=5;
            switch ( input.LA(1) ) {
                case 67:
                    {
                    alt76=1;
                    }
                    break;
                case 68:
                    {
                    alt76=2;
                    }
                    break;
                case 69:
                    {
                    alt76=3;
                    }
                    break;
                case 70:
                    {
                    alt76=4;
                    }
                    break;
            }

            switch (alt76) {
                case 1 :
                    // InternalXdiagramDsl.g:4312:4: ( (lv_face_2_0= 'arial' ) )
                    {
                    // InternalXdiagramDsl.g:4312:4: ( (lv_face_2_0= 'arial' ) )
                    // InternalXdiagramDsl.g:4313:5: (lv_face_2_0= 'arial' )
                    {
                    // InternalXdiagramDsl.g:4313:5: (lv_face_2_0= 'arial' )
                    // InternalXdiagramDsl.g:4314:6: lv_face_2_0= 'arial'
                    {
                    lv_face_2_0=(Token)match(input,67,FOLLOW_56); 

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
                    // InternalXdiagramDsl.g:4327:4: otherlv_3= 'verdana'
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_56); 

                    				newLeafNode(otherlv_3, grammarAccess.getFontPropertiesAccess().getVerdanaKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4332:4: otherlv_4= 'courier'
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getFontPropertiesAccess().getCourierKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:4337:4: otherlv_5= 'times'
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_56); 

                    				newLeafNode(otherlv_5, grammarAccess.getFontPropertiesAccess().getTimesKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalXdiagramDsl.g:4342:3: ( (lv_size_6_0= RULE_INT ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_INT) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalXdiagramDsl.g:4343:4: (lv_size_6_0= RULE_INT )
                    {
                    // InternalXdiagramDsl.g:4343:4: (lv_size_6_0= RULE_INT )
                    // InternalXdiagramDsl.g:4344:5: lv_size_6_0= RULE_INT
                    {
                    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_57); 

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

            // InternalXdiagramDsl.g:4360:3: ( (lv_bold_7_0= 'bold' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==71) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXdiagramDsl.g:4361:4: (lv_bold_7_0= 'bold' )
                    {
                    // InternalXdiagramDsl.g:4361:4: (lv_bold_7_0= 'bold' )
                    // InternalXdiagramDsl.g:4362:5: lv_bold_7_0= 'bold'
                    {
                    lv_bold_7_0=(Token)match(input,71,FOLLOW_58); 

                    					newLeafNode(lv_bold_7_0, grammarAccess.getFontPropertiesAccess().getBoldBoldKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFontPropertiesRule());
                    					}
                    					setWithLastConsumed(current, "bold", true, "bold");
                    				

                    }


                    }
                    break;

            }

            // InternalXdiagramDsl.g:4374:3: ( (lv_italics_8_0= 'italics' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==72) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalXdiagramDsl.g:4375:4: (lv_italics_8_0= 'italics' )
                    {
                    // InternalXdiagramDsl.g:4375:4: (lv_italics_8_0= 'italics' )
                    // InternalXdiagramDsl.g:4376:5: lv_italics_8_0= 'italics'
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

            // InternalXdiagramDsl.g:4388:3: ( (lv_conditional_9_0= ruleFeatureConditional ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==19) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalXdiagramDsl.g:4389:4: (lv_conditional_9_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4389:4: (lv_conditional_9_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4390:5: lv_conditional_9_0= ruleFeatureConditional
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

            otherlv_10=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4415:1: entryRuleTextAlign returns [EObject current=null] : iv_ruleTextAlign= ruleTextAlign EOF ;
    public final EObject entryRuleTextAlign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAlign = null;


        try {
            // InternalXdiagramDsl.g:4415:50: (iv_ruleTextAlign= ruleTextAlign EOF )
            // InternalXdiagramDsl.g:4416:2: iv_ruleTextAlign= ruleTextAlign EOF
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
    // InternalXdiagramDsl.g:4422:1: ruleTextAlign returns [EObject current=null] : (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleTextAlign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_value_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4428:2: ( (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4429:2: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4429:2: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4430:3: otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAlignAccess().getAlignKeyword_0());
            		
            // InternalXdiagramDsl.g:4434:3: ( (lv_value_1_0= ruleTextAlignValue ) )
            // InternalXdiagramDsl.g:4435:4: (lv_value_1_0= ruleTextAlignValue )
            {
            // InternalXdiagramDsl.g:4435:4: (lv_value_1_0= ruleTextAlignValue )
            // InternalXdiagramDsl.g:4436:5: lv_value_1_0= ruleTextAlignValue
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

            // InternalXdiagramDsl.g:4453:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==19) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalXdiagramDsl.g:4454:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4454:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4455:5: lv_conditional_2_0= ruleFeatureConditional
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4480:1: entryRuleLineStyle returns [EObject current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final EObject entryRuleLineStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStyle = null;


        try {
            // InternalXdiagramDsl.g:4480:50: (iv_ruleLineStyle= ruleLineStyle EOF )
            // InternalXdiagramDsl.g:4481:2: iv_ruleLineStyle= ruleLineStyle EOF
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
    // InternalXdiagramDsl.g:4487:1: ruleLineStyle returns [EObject current=null] : ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject ruleLineStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_manhattan_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_style_2_0 = null;

        EObject lv_conditional_4_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4493:2: ( ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // InternalXdiagramDsl.g:4494:2: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // InternalXdiagramDsl.g:4494:2: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // InternalXdiagramDsl.g:4495:3: () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            // InternalXdiagramDsl.g:4495:3: ()
            // InternalXdiagramDsl.g:4496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineStyleAccess().getLineStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getLineStyleAccess().getLinestyleKeyword_1());
            		
            // InternalXdiagramDsl.g:4506:3: ( (lv_style_2_0= ruleLineType ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=102 && LA82_0<=104)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXdiagramDsl.g:4507:4: (lv_style_2_0= ruleLineType )
                    {
                    // InternalXdiagramDsl.g:4507:4: (lv_style_2_0= ruleLineType )
                    // InternalXdiagramDsl.g:4508:5: lv_style_2_0= ruleLineType
                    {

                    					newCompositeNode(grammarAccess.getLineStyleAccess().getStyleLineTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_61);
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

            // InternalXdiagramDsl.g:4525:3: ( (lv_manhattan_3_0= 'manhattan' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==75) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalXdiagramDsl.g:4526:4: (lv_manhattan_3_0= 'manhattan' )
                    {
                    // InternalXdiagramDsl.g:4526:4: (lv_manhattan_3_0= 'manhattan' )
                    // InternalXdiagramDsl.g:4527:5: lv_manhattan_3_0= 'manhattan'
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

            // InternalXdiagramDsl.g:4539:3: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==19) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalXdiagramDsl.g:4540:4: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4540:4: (lv_conditional_4_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4541:5: lv_conditional_4_0= ruleFeatureConditional
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

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4566:1: entryRuleLineWidth returns [EObject current=null] : iv_ruleLineWidth= ruleLineWidth EOF ;
    public final EObject entryRuleLineWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineWidth = null;


        try {
            // InternalXdiagramDsl.g:4566:50: (iv_ruleLineWidth= ruleLineWidth EOF )
            // InternalXdiagramDsl.g:4567:2: iv_ruleLineWidth= ruleLineWidth EOF
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
    // InternalXdiagramDsl.g:4573:1: ruleLineWidth returns [EObject current=null] : (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleLineWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalXdiagramDsl.g:4579:2: ( (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalXdiagramDsl.g:4580:2: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalXdiagramDsl.g:4580:2: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalXdiagramDsl.g:4581:3: otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getLineWidthAccess().getLinewidthKeyword_0());
            		
            // InternalXdiagramDsl.g:4585:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalXdiagramDsl.g:4586:4: (lv_width_1_0= RULE_INT )
            {
            // InternalXdiagramDsl.g:4586:4: (lv_width_1_0= RULE_INT )
            // InternalXdiagramDsl.g:4587:5: lv_width_1_0= RULE_INT
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

            // InternalXdiagramDsl.g:4603:3: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==19) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXdiagramDsl.g:4604:4: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalXdiagramDsl.g:4604:4: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalXdiagramDsl.g:4605:5: lv_conditional_2_0= ruleFeatureConditional
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXdiagramDsl.g:4630:1: ruleAnchorDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) ;
    public final Enumerator ruleAnchorDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4636:2: ( ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) )
            // InternalXdiagramDsl.g:4637:2: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            {
            // InternalXdiagramDsl.g:4637:2: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==77) ) {
                alt86=1;
            }
            else if ( (LA86_0==78) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalXdiagramDsl.g:4638:3: (enumLiteral_0= 'incoming' )
                    {
                    // InternalXdiagramDsl.g:4638:3: (enumLiteral_0= 'incoming' )
                    // InternalXdiagramDsl.g:4639:4: enumLiteral_0= 'incoming'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4646:3: (enumLiteral_1= 'outgoing' )
                    {
                    // InternalXdiagramDsl.g:4646:3: (enumLiteral_1= 'outgoing' )
                    // InternalXdiagramDsl.g:4647:4: enumLiteral_1= 'outgoing'
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
    // InternalXdiagramDsl.g:4657:1: ruleDefaultColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) ;
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
            // InternalXdiagramDsl.g:4663:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) )
            // InternalXdiagramDsl.g:4664:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            {
            // InternalXdiagramDsl.g:4664:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            int alt87=16;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt87=1;
                }
                break;
            case 80:
                {
                alt87=2;
                }
                break;
            case 81:
                {
                alt87=3;
                }
                break;
            case 82:
                {
                alt87=4;
                }
                break;
            case 83:
                {
                alt87=5;
                }
                break;
            case 84:
                {
                alt87=6;
                }
                break;
            case 85:
                {
                alt87=7;
                }
                break;
            case 86:
                {
                alt87=8;
                }
                break;
            case 87:
                {
                alt87=9;
                }
                break;
            case 88:
                {
                alt87=10;
                }
                break;
            case 89:
                {
                alt87=11;
                }
                break;
            case 90:
                {
                alt87=12;
                }
                break;
            case 91:
                {
                alt87=13;
                }
                break;
            case 92:
                {
                alt87=14;
                }
                break;
            case 93:
                {
                alt87=15;
                }
                break;
            case 94:
                {
                alt87=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalXdiagramDsl.g:4665:3: (enumLiteral_0= 'white' )
                    {
                    // InternalXdiagramDsl.g:4665:3: (enumLiteral_0= 'white' )
                    // InternalXdiagramDsl.g:4666:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4673:3: (enumLiteral_1= 'silver' )
                    {
                    // InternalXdiagramDsl.g:4673:3: (enumLiteral_1= 'silver' )
                    // InternalXdiagramDsl.g:4674:4: enumLiteral_1= 'silver'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4681:3: (enumLiteral_2= 'gray' )
                    {
                    // InternalXdiagramDsl.g:4681:3: (enumLiteral_2= 'gray' )
                    // InternalXdiagramDsl.g:4682:4: enumLiteral_2= 'gray'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXdiagramDsl.g:4689:3: (enumLiteral_3= 'black' )
                    {
                    // InternalXdiagramDsl.g:4689:3: (enumLiteral_3= 'black' )
                    // InternalXdiagramDsl.g:4690:4: enumLiteral_3= 'black'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXdiagramDsl.g:4697:3: (enumLiteral_4= 'red' )
                    {
                    // InternalXdiagramDsl.g:4697:3: (enumLiteral_4= 'red' )
                    // InternalXdiagramDsl.g:4698:4: enumLiteral_4= 'red'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXdiagramDsl.g:4705:3: (enumLiteral_5= 'maroon' )
                    {
                    // InternalXdiagramDsl.g:4705:3: (enumLiteral_5= 'maroon' )
                    // InternalXdiagramDsl.g:4706:4: enumLiteral_5= 'maroon'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXdiagramDsl.g:4713:3: (enumLiteral_6= 'yellow' )
                    {
                    // InternalXdiagramDsl.g:4713:3: (enumLiteral_6= 'yellow' )
                    // InternalXdiagramDsl.g:4714:4: enumLiteral_6= 'yellow'
                    {
                    enumLiteral_6=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXdiagramDsl.g:4721:3: (enumLiteral_7= 'olive' )
                    {
                    // InternalXdiagramDsl.g:4721:3: (enumLiteral_7= 'olive' )
                    // InternalXdiagramDsl.g:4722:4: enumLiteral_7= 'olive'
                    {
                    enumLiteral_7=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalXdiagramDsl.g:4729:3: (enumLiteral_8= 'lime' )
                    {
                    // InternalXdiagramDsl.g:4729:3: (enumLiteral_8= 'lime' )
                    // InternalXdiagramDsl.g:4730:4: enumLiteral_8= 'lime'
                    {
                    enumLiteral_8=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalXdiagramDsl.g:4737:3: (enumLiteral_9= 'green' )
                    {
                    // InternalXdiagramDsl.g:4737:3: (enumLiteral_9= 'green' )
                    // InternalXdiagramDsl.g:4738:4: enumLiteral_9= 'green'
                    {
                    enumLiteral_9=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalXdiagramDsl.g:4745:3: (enumLiteral_10= 'aqua' )
                    {
                    // InternalXdiagramDsl.g:4745:3: (enumLiteral_10= 'aqua' )
                    // InternalXdiagramDsl.g:4746:4: enumLiteral_10= 'aqua'
                    {
                    enumLiteral_10=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalXdiagramDsl.g:4753:3: (enumLiteral_11= 'teal' )
                    {
                    // InternalXdiagramDsl.g:4753:3: (enumLiteral_11= 'teal' )
                    // InternalXdiagramDsl.g:4754:4: enumLiteral_11= 'teal'
                    {
                    enumLiteral_11=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalXdiagramDsl.g:4761:3: (enumLiteral_12= 'blue' )
                    {
                    // InternalXdiagramDsl.g:4761:3: (enumLiteral_12= 'blue' )
                    // InternalXdiagramDsl.g:4762:4: enumLiteral_12= 'blue'
                    {
                    enumLiteral_12=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalXdiagramDsl.g:4769:3: (enumLiteral_13= 'navy' )
                    {
                    // InternalXdiagramDsl.g:4769:3: (enumLiteral_13= 'navy' )
                    // InternalXdiagramDsl.g:4770:4: enumLiteral_13= 'navy'
                    {
                    enumLiteral_13=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalXdiagramDsl.g:4777:3: (enumLiteral_14= 'fuchsia' )
                    {
                    // InternalXdiagramDsl.g:4777:3: (enumLiteral_14= 'fuchsia' )
                    // InternalXdiagramDsl.g:4778:4: enumLiteral_14= 'fuchsia'
                    {
                    enumLiteral_14=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalXdiagramDsl.g:4785:3: (enumLiteral_15= 'purple' )
                    {
                    // InternalXdiagramDsl.g:4785:3: (enumLiteral_15= 'purple' )
                    // InternalXdiagramDsl.g:4786:4: enumLiteral_15= 'purple'
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
    // InternalXdiagramDsl.g:4796:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4802:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalXdiagramDsl.g:4803:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalXdiagramDsl.g:4803:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==95) ) {
                alt88=1;
            }
            else if ( (LA88_0==96) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalXdiagramDsl.g:4804:3: (enumLiteral_0= '=' )
                    {
                    // InternalXdiagramDsl.g:4804:3: (enumLiteral_0= '=' )
                    // InternalXdiagramDsl.g:4805:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4812:3: (enumLiteral_1= '<>' )
                    {
                    // InternalXdiagramDsl.g:4812:3: (enumLiteral_1= '<>' )
                    // InternalXdiagramDsl.g:4813:4: enumLiteral_1= '<>'
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
    // InternalXdiagramDsl.g:4823:1: ruleBooleanLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4829:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalXdiagramDsl.g:4830:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalXdiagramDsl.g:4830:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==97) ) {
                alt89=1;
            }
            else if ( (LA89_0==98) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalXdiagramDsl.g:4831:3: (enumLiteral_0= 'true' )
                    {
                    // InternalXdiagramDsl.g:4831:3: (enumLiteral_0= 'true' )
                    // InternalXdiagramDsl.g:4832:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4839:3: (enumLiteral_1= 'false' )
                    {
                    // InternalXdiagramDsl.g:4839:3: (enumLiteral_1= 'false' )
                    // InternalXdiagramDsl.g:4840:4: enumLiteral_1= 'false'
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
    // InternalXdiagramDsl.g:4850:1: ruleTextAlignValue returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleTextAlignValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4856:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalXdiagramDsl.g:4857:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalXdiagramDsl.g:4857:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt90=1;
                }
                break;
            case 100:
                {
                alt90=2;
                }
                break;
            case 101:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalXdiagramDsl.g:4858:3: (enumLiteral_0= 'left' )
                    {
                    // InternalXdiagramDsl.g:4858:3: (enumLiteral_0= 'left' )
                    // InternalXdiagramDsl.g:4859:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4866:3: (enumLiteral_1= 'center' )
                    {
                    // InternalXdiagramDsl.g:4866:3: (enumLiteral_1= 'center' )
                    // InternalXdiagramDsl.g:4867:4: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4874:3: (enumLiteral_2= 'right' )
                    {
                    // InternalXdiagramDsl.g:4874:3: (enumLiteral_2= 'right' )
                    // InternalXdiagramDsl.g:4875:4: enumLiteral_2= 'right'
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
    // InternalXdiagramDsl.g:4885:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXdiagramDsl.g:4891:2: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) )
            // InternalXdiagramDsl.g:4892:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            {
            // InternalXdiagramDsl.g:4892:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            int alt91=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt91=1;
                }
                break;
            case 103:
                {
                alt91=2;
                }
                break;
            case 104:
                {
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalXdiagramDsl.g:4893:3: (enumLiteral_0= 'solid' )
                    {
                    // InternalXdiagramDsl.g:4893:3: (enumLiteral_0= 'solid' )
                    // InternalXdiagramDsl.g:4894:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdiagramDsl.g:4901:3: (enumLiteral_1= 'dashed' )
                    {
                    // InternalXdiagramDsl.g:4901:3: (enumLiteral_1= 'dashed' )
                    // InternalXdiagramDsl.g:4902:4: enumLiteral_1= 'dashed'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXdiagramDsl.g:4909:3: (enumLiteral_2= 'dotted' )
                    {
                    // InternalXdiagramDsl.g:4909:3: (enumLiteral_2= 'dotted' )
                    // InternalXdiagramDsl.g:4910:4: enumLiteral_2= 'dotted'
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000C0300002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080300002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400000000070L,0x0000000600000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000383FC80000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000004008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00039FFC80000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200208008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1C5E200208008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x145E200208008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x165E200208008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x145E200008008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x145E200208008000L,0x0000000000001605L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0450000200008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1440200208008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0180000020080040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000020080040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0180000020080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000020080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000020080040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000020080040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000020080000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000020080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000020080030L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000020080040L,0x00000000000001F8L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000020080040L,0x0000000000000180L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000020080000L,0x0000000000000180L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000020080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000020080000L,0x000001C000000800L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000020080000L,0x0000000000000800L});

}