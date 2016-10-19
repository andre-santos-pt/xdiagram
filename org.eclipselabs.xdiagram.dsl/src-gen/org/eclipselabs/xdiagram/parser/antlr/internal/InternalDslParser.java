package org.eclipselabs.xdiagram.parser.antlr.internal; 

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
import org.eclipselabs.xdiagram.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'import'", "'.'", "'*'", "'diagram'", "'{'", "'}'", "'toolgroup'", "';'", "'style'", "'+'", "'if'", "'tool'", "'group'", "'icon'", "'node'", "'link'", "'reference'", "'class'", "'source'", "'target'", "'decorator'", "'%'", "'anchor'", "'max'", "'color'", "'figure'", "'as'", "'child'", "'rectangle'", "'square'", "'rhombus'", "'ellipse'", "'circle'", "'polygon'", "'polyline'", "'triangle'", "'hline'", "'vline'", "'arrow'", "'contains'", "'null'", "'label'", "'image'", "'invisible'", "'foreground'", "'background'", "'transparency'", "'size'", "']'", "'resizable'", "'point'", "'position'", "'corner'", "'layout'", "'vertical'", "'horizontal'", "'margin'", "'text'", "'edit:'", "'font'", "'arial'", "'verdana'", "'courier'", "'times'", "'bold'", "'italics'", "'align'", "'linestyle'", "'manhattan'", "'linewidth'", "'incoming'", "'outgoing'", "'white'", "'silver'", "'gray'", "'black'", "'red'", "'maroon'", "'yellow'", "'olive'", "'lime'", "'green'", "'aqua'", "'teal'", "'blue'", "'navy'", "'fuchsia'", "'purple'", "'='", "'<>'", "'true'", "'false'", "'left'", "'center'", "'right'", "'solid'", "'dashed'", "'dotted'"
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


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XDiagram";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXDiagram"
    // InternalDsl.g:68:1: entryRuleXDiagram returns [EObject current=null] : iv_ruleXDiagram= ruleXDiagram EOF ;
    public final EObject entryRuleXDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDiagram = null;


        try {
            // InternalDsl.g:69:2: (iv_ruleXDiagram= ruleXDiagram EOF )
            // InternalDsl.g:70:2: iv_ruleXDiagram= ruleXDiagram EOF
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
    // InternalDsl.g:77:1: ruleXDiagram returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* ) ;
    public final EObject ruleXDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        EObject lv_imports_2_0 = null;

        EObject lv_diagram_3_0 = null;

        EObject lv_groups_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_styles_6_0 = null;

        EObject lv_colors_7_0 = null;

        EObject lv_figures_8_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:80:28: ( (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* ) )
            // InternalDsl.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* )
            {
            // InternalDsl.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* )
            // InternalDsl.g:81:3: otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getXDiagramAccess().getMetamodelKeyword_0());
                
            // InternalDsl.g:85:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalDsl.g:86:1: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalDsl.g:86:1: (lv_importURI_1_0= RULE_STRING )
            // InternalDsl.g:87:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getXDiagramAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalDsl.g:103:2: ( (lv_imports_2_0= ruleImportStatement ) )
            // InternalDsl.g:104:1: (lv_imports_2_0= ruleImportStatement )
            {
            // InternalDsl.g:104:1: (lv_imports_2_0= ruleImportStatement )
            // InternalDsl.g:105:3: lv_imports_2_0= ruleImportStatement
            {
             
            	        newCompositeNode(grammarAccess.getXDiagramAccess().getImportsImportStatementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_imports_2_0=ruleImportStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	        }
                   		add(
                   			current, 
                   			"imports",
                    		lv_imports_2_0, 
                    		"org.eclipselabs.xdiagram.Dsl.ImportStatement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:121:2: ( (lv_diagram_3_0= ruleDiagram ) )
            // InternalDsl.g:122:1: (lv_diagram_3_0= ruleDiagram )
            {
            // InternalDsl.g:122:1: (lv_diagram_3_0= ruleDiagram )
            // InternalDsl.g:123:3: lv_diagram_3_0= ruleDiagram
            {
             
            	        newCompositeNode(grammarAccess.getXDiagramAccess().getDiagramDiagramParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_diagram_3_0=ruleDiagram();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	        }
                   		set(
                   			current, 
                   			"diagram",
                    		lv_diagram_3_0, 
                    		"org.eclipselabs.xdiagram.Dsl.Diagram");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:139:2: ( (lv_groups_4_0= ruleToolGroup ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:140:1: (lv_groups_4_0= ruleToolGroup )
            	    {
            	    // InternalDsl.g:140:1: (lv_groups_4_0= ruleToolGroup )
            	    // InternalDsl.g:141:3: lv_groups_4_0= ruleToolGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getGroupsToolGroupParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_groups_4_0=ruleToolGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groups",
            	            		lv_groups_4_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ToolGroup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:157:3: ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 23:
                case 26:
                case 27:
                    {
                    alt2=1;
                    }
                    break;
                case 20:
                    {
                    alt2=2;
                    }
                    break;
                case 36:
                    {
                    alt2=3;
                    }
                    break;
                case 37:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:157:4: ( (lv_elements_5_0= ruleDiagramElement ) )
            	    {
            	    // InternalDsl.g:157:4: ( (lv_elements_5_0= ruleDiagramElement ) )
            	    // InternalDsl.g:158:1: (lv_elements_5_0= ruleDiagramElement )
            	    {
            	    // InternalDsl.g:158:1: (lv_elements_5_0= ruleDiagramElement )
            	    // InternalDsl.g:159:3: lv_elements_5_0= ruleDiagramElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getElementsDiagramElementParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_elements_5_0=ruleDiagramElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.DiagramElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:176:6: ( (lv_styles_6_0= ruleStyle ) )
            	    {
            	    // InternalDsl.g:176:6: ( (lv_styles_6_0= ruleStyle ) )
            	    // InternalDsl.g:177:1: (lv_styles_6_0= ruleStyle )
            	    {
            	    // InternalDsl.g:177:1: (lv_styles_6_0= ruleStyle )
            	    // InternalDsl.g:178:3: lv_styles_6_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getStylesStyleParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_styles_6_0=ruleStyle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"styles",
            	            		lv_styles_6_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.Style");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:195:6: ( (lv_colors_7_0= ruleCustomColor ) )
            	    {
            	    // InternalDsl.g:195:6: ( (lv_colors_7_0= ruleCustomColor ) )
            	    // InternalDsl.g:196:1: (lv_colors_7_0= ruleCustomColor )
            	    {
            	    // InternalDsl.g:196:1: (lv_colors_7_0= ruleCustomColor )
            	    // InternalDsl.g:197:3: lv_colors_7_0= ruleCustomColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getColorsCustomColorParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_colors_7_0=ruleCustomColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colors",
            	            		lv_colors_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.CustomColor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDsl.g:214:6: ( (lv_figures_8_0= ruleCustomFigure ) )
            	    {
            	    // InternalDsl.g:214:6: ( (lv_figures_8_0= ruleCustomFigure ) )
            	    // InternalDsl.g:215:1: (lv_figures_8_0= ruleCustomFigure )
            	    {
            	    // InternalDsl.g:215:1: (lv_figures_8_0= ruleCustomFigure )
            	    // InternalDsl.g:216:3: lv_figures_8_0= ruleCustomFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getFiguresCustomFigureParserRuleCall_5_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_figures_8_0=ruleCustomFigure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"figures",
            	            		lv_figures_8_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.CustomFigure");
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
    // InternalDsl.g:240:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // InternalDsl.g:241:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // InternalDsl.g:242:2: iv_ruleImportStatement= ruleImportStatement EOF
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
    // InternalDsl.g:249:1: ruleImportStatement returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:252:28: ( ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) )
            // InternalDsl.g:253:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            {
            // InternalDsl.g:253:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            // InternalDsl.g:253:2: () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            {
            // InternalDsl.g:253:2: ()
            // InternalDsl.g:254:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportStatementAccess().getImportStatementAction_0(),
                        current);
                

            }

            // InternalDsl.g:259:2: (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:259:4: otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_7); 

                        	newLeafNode(otherlv_1, grammarAccess.getImportStatementAccess().getImportKeyword_1_0());
                        
                    // InternalDsl.g:263:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    // InternalDsl.g:264:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    {
                    // InternalDsl.g:264:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    // InternalDsl.g:265:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
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
                            		"org.eclipselabs.xdiagram.Dsl.QualifiedNameWithWildCard");
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
    // InternalDsl.g:289:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDsl.g:290:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDsl.g:291:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDsl.g:298:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalDsl.g:301:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDsl.g:302:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDsl.g:302:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDsl.g:302:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalDsl.g:309:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:310:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_7); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

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
    // InternalDsl.g:330:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // InternalDsl.g:331:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // InternalDsl.g:332:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
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
    // InternalDsl.g:339:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:342:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalDsl.g:343:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalDsl.g:343:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalDsl.g:344:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalDsl.g:354:1: (kw= '.' kw= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:355:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_9); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                        
                    kw=(Token)match(input,14,FOLLOW_2); 

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
    // InternalDsl.g:374:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalDsl.g:375:2: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalDsl.g:376:2: iv_ruleDiagram= ruleDiagram EOF
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
    // InternalDsl.g:383:1: ruleDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_contains_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:386:28: ( (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) )
            // InternalDsl.g:387:1: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            {
            // InternalDsl.g:387:1: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            // InternalDsl.g:387:3: otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getDiagramAccess().getDiagramKeyword_0());
                
            // InternalDsl.g:391:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:392:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:392:1: ( ruleQualifiedName )
            // InternalDsl.g:393:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDiagramAccess().getModelClassEClassCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDsl.g:410:1: ( (lv_contains_3_0= ruleContains ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==51) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:411:1: (lv_contains_3_0= ruleContains )
            	    {
            	    // InternalDsl.g:411:1: (lv_contains_3_0= ruleContains )
            	    // InternalDsl.g:412:3: lv_contains_3_0= ruleContains
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getContainsContainsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_11);
            	    lv_contains_3_0=ruleContains();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contains",
            	            		lv_contains_3_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.Contains");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:440:1: entryRuleToolGroup returns [EObject current=null] : iv_ruleToolGroup= ruleToolGroup EOF ;
    public final EObject entryRuleToolGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolGroup = null;


        try {
            // InternalDsl.g:441:2: (iv_ruleToolGroup= ruleToolGroup EOF )
            // InternalDsl.g:442:2: iv_ruleToolGroup= ruleToolGroup EOF
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
    // InternalDsl.g:449:1: ruleToolGroup returns [EObject current=null] : (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleToolGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalDsl.g:452:28: ( (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalDsl.g:453:1: (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalDsl.g:453:1: (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalDsl.g:453:3: otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getToolGroupAccess().getToolgroupKeyword_0());
                
            // InternalDsl.g:457:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:458:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:458:1: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:459:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalDsl.g:475:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:476:1: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalDsl.g:476:1: (lv_description_2_0= RULE_STRING )
                    // InternalDsl.g:477:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:505:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // InternalDsl.g:506:2: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // InternalDsl.g:507:2: iv_ruleDiagramElement= ruleDiagramElement EOF
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
    // InternalDsl.g:514:1: ruleDiagramElement returns [EObject current=null] : (this_Node_0= ruleNode | this_Link_1= ruleLink ) ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Link_1 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:517:28: ( (this_Node_0= ruleNode | this_Link_1= ruleLink ) )
            // InternalDsl.g:518:1: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            {
            // InternalDsl.g:518:1: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        int LA8_5 = input.LA(4);

                        if ( (LA8_5==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 25:
                                {
                                int LA8_6 = input.LA(6);

                                if ( (LA8_6==RULE_ID) ) {
                                    int LA8_8 = input.LA(7);

                                    if ( (LA8_8==27) ) {
                                        alt8=2;
                                    }
                                    else if ( (LA8_8==26) ) {
                                        alt8=1;
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
                            case 26:
                                {
                                alt8=1;
                                }
                                break;
                            case 27:
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
                    case 25:
                        {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==RULE_ID) ) {
                            int LA8_8 = input.LA(5);

                            if ( (LA8_8==27) ) {
                                alt8=2;
                            }
                            else if ( (LA8_8==26) ) {
                                alt8=1;
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
                    case 26:
                        {
                        alt8=1;
                        }
                        break;
                    case 27:
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
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
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
                    // InternalDsl.g:519:5: this_Node_0= ruleNode
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
                    // InternalDsl.g:529:5: this_Link_1= ruleLink
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
    // InternalDsl.g:545:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalDsl.g:546:2: (iv_ruleStyle= ruleStyle EOF )
            // InternalDsl.g:547:2: iv_ruleStyle= ruleStyle EOF
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
    // InternalDsl.g:554:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) ;
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
            // InternalDsl.g:557:28: ( (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) )
            // InternalDsl.g:558:1: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            {
            // InternalDsl.g:558:1: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            // InternalDsl.g:558:3: otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                
            // InternalDsl.g:562:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:563:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:563:1: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:564:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalDsl.g:580:2: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:580:3: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:580:3: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:581:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:581:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:582:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getStyleAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStyleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:595:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:596:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:596:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:597:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStyleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_15); 

                	newLeafNode(otherlv_4, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDsl.g:612:1: ( (lv_features_5_0= ruleStyleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=56 && LA10_0<=59)||(LA10_0>=62 && LA10_0<=64)||LA10_0==69||LA10_0==71||(LA10_0>=78 && LA10_0<=79)||LA10_0==81) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:613:1: (lv_features_5_0= ruleStyleFeature )
            	    {
            	    // InternalDsl.g:613:1: (lv_features_5_0= ruleStyleFeature )
            	    // InternalDsl.g:614:3: lv_features_5_0= ruleStyleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStyleAccess().getFeaturesStyleFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_15);
            	    lv_features_5_0=ruleStyleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.StyleFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:644:1: entryRuleLinkedFeature returns [EObject current=null] : iv_ruleLinkedFeature= ruleLinkedFeature EOF ;
    public final EObject entryRuleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedFeature = null;


        try {
            // InternalDsl.g:645:2: (iv_ruleLinkedFeature= ruleLinkedFeature EOF )
            // InternalDsl.g:646:2: iv_ruleLinkedFeature= ruleLinkedFeature EOF
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
    // InternalDsl.g:653:1: ruleLinkedFeature returns [EObject current=null] : (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) ;
    public final EObject ruleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_Anchor_1 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:656:28: ( (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) )
            // InternalDsl.g:657:1: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            {
            // InternalDsl.g:657:1: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==51) ) {
                alt11=1;
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:658:5: this_Contains_0= ruleContains
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
                    // InternalDsl.g:668:5: this_Anchor_1= ruleAnchor
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
    // InternalDsl.g:684:1: entryRuleStyleFeature returns [EObject current=null] : iv_ruleStyleFeature= ruleStyleFeature EOF ;
    public final EObject entryRuleStyleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleFeature = null;


        try {
            // InternalDsl.g:685:2: (iv_ruleStyleFeature= ruleStyleFeature EOF )
            // InternalDsl.g:686:2: iv_ruleStyleFeature= ruleStyleFeature EOF
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
    // InternalDsl.g:693:1: ruleStyleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) ;
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
            // InternalDsl.g:696:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) )
            // InternalDsl.g:697:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            {
            // InternalDsl.g:697:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            int alt12=12;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt12=1;
                }
                break;
            case 63:
                {
                alt12=2;
                }
                break;
            case 62:
                {
                alt12=3;
                }
                break;
            case 64:
                {
                alt12=4;
                }
                break;
            case 57:
                {
                alt12=5;
                }
                break;
            case 56:
                {
                alt12=6;
                }
                break;
            case 58:
                {
                alt12=7;
                }
                break;
            case 71:
                {
                alt12=8;
                }
                break;
            case 69:
                {
                alt12=9;
                }
                break;
            case 78:
                {
                alt12=10;
                }
                break;
            case 79:
                {
                alt12=11;
                }
                break;
            case 81:
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
                    // InternalDsl.g:698:5: this_Size_0= ruleSize
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
                    // InternalDsl.g:708:5: this_Position_1= rulePosition
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
                    // InternalDsl.g:718:5: this_Point_2= rulePoint
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
                    // InternalDsl.g:728:5: this_Corner_3= ruleCorner
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
                    // InternalDsl.g:738:5: this_Background_4= ruleBackground
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
                    // InternalDsl.g:748:5: this_Foreground_5= ruleForeground
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
                    // InternalDsl.g:758:5: this_Transparency_6= ruleTransparency
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
                    // InternalDsl.g:768:5: this_FontProperties_7= ruleFontProperties
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
                    // InternalDsl.g:778:5: this_TextValue_8= ruleTextValue
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
                    // InternalDsl.g:788:5: this_TextAlign_9= ruleTextAlign
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
                    // InternalDsl.g:798:5: this_LineStyle_10= ruleLineStyle
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
                    // InternalDsl.g:808:5: this_LineWidth_11= ruleLineWidth
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
    // InternalDsl.g:826:1: entryRuleChildElement returns [EObject current=null] : iv_ruleChildElement= ruleChildElement EOF ;
    public final EObject entryRuleChildElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildElement = null;


        try {
            // InternalDsl.g:827:2: (iv_ruleChildElement= ruleChildElement EOF )
            // InternalDsl.g:828:2: iv_ruleChildElement= ruleChildElement EOF
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
    // InternalDsl.g:835:1: ruleChildElement returns [EObject current=null] : (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) ;
    public final EObject ruleChildElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElement_0 = null;

        EObject this_Line_1 = null;

        EObject this_Arrow_2 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:838:28: ( (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) )
            // InternalDsl.g:839:1: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            {
            // InternalDsl.g:839:1: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 37:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 53:
            case 54:
            case 55:
                {
                alt13=1;
                }
                break;
            case 48:
            case 49:
                {
                alt13=2;
                }
                break;
            case 50:
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
                    // InternalDsl.g:840:5: this_ConnectableElement_0= ruleConnectableElement
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
                    // InternalDsl.g:850:5: this_Line_1= ruleLine
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
                    // InternalDsl.g:860:5: this_Arrow_2= ruleArrow
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
    // InternalDsl.g:876:1: entryRuleFeatureConditional returns [EObject current=null] : iv_ruleFeatureConditional= ruleFeatureConditional EOF ;
    public final EObject entryRuleFeatureConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureConditional = null;


        try {
            // InternalDsl.g:877:2: (iv_ruleFeatureConditional= ruleFeatureConditional EOF )
            // InternalDsl.g:878:2: iv_ruleFeatureConditional= ruleFeatureConditional EOF
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
    // InternalDsl.g:885:1: ruleFeatureConditional returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleFeatureConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:888:28: ( (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalDsl.g:889:1: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalDsl.g:889:1: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            // InternalDsl.g:889:3: otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureConditionalAccess().getIfKeyword_0());
                
            // InternalDsl.g:893:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:894:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:894:1: ( ruleQualifiedName )
            // InternalDsl.g:895:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureConditionalRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFeatureConditionalAccess().getModelAttributeEAttributeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:908:2: ( (lv_operator_2_0= ruleOperator ) )
            // InternalDsl.g:909:1: (lv_operator_2_0= ruleOperator )
            {
            // InternalDsl.g:909:1: (lv_operator_2_0= ruleOperator )
            // InternalDsl.g:910:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getFeatureConditionalAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_17);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureConditionalRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"org.eclipselabs.xdiagram.Dsl.Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:926:2: ( (lv_value_3_0= ruleValue ) )
            // InternalDsl.g:927:1: (lv_value_3_0= ruleValue )
            {
            // InternalDsl.g:927:1: (lv_value_3_0= ruleValue )
            // InternalDsl.g:928:3: lv_value_3_0= ruleValue
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
                    		"org.eclipselabs.xdiagram.Dsl.Value");
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
    // InternalDsl.g:952:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalDsl.g:953:2: (iv_ruleNode= ruleNode EOF )
            // InternalDsl.g:954:2: iv_ruleNode= ruleNode EOF
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
    // InternalDsl.g:961:1: ruleNode returns [EObject current=null] : ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) ;
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
            // InternalDsl.g:964:28: ( ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) )
            // InternalDsl.g:965:1: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            {
            // InternalDsl.g:965:1: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            // InternalDsl.g:965:2: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            {
            // InternalDsl.g:965:2: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:965:3: ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    {
                    // InternalDsl.g:965:3: ( (lv_tool_0_0= 'tool' ) )
                    // InternalDsl.g:966:1: (lv_tool_0_0= 'tool' )
                    {
                    // InternalDsl.g:966:1: (lv_tool_0_0= 'tool' )
                    // InternalDsl.g:967:3: lv_tool_0_0= 'tool'
                    {
                    lv_tool_0_0=(Token)match(input,23,FOLLOW_3); 

                            newLeafNode(lv_tool_0_0, grammarAccess.getNodeAccess().getToolToolKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(current, "tool", true, "tool");
                    	    

                    }


                    }

                    // InternalDsl.g:980:2: ( (lv_toolName_1_0= RULE_STRING ) )
                    // InternalDsl.g:981:1: (lv_toolName_1_0= RULE_STRING )
                    {
                    // InternalDsl.g:981:1: (lv_toolName_1_0= RULE_STRING )
                    // InternalDsl.g:982:3: lv_toolName_1_0= RULE_STRING
                    {
                    lv_toolName_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

                    // InternalDsl.g:998:2: ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==24) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalDsl.g:998:3: ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalDsl.g:998:3: ( (lv_group_2_0= 'group' ) )
                            // InternalDsl.g:999:1: (lv_group_2_0= 'group' )
                            {
                            // InternalDsl.g:999:1: (lv_group_2_0= 'group' )
                            // InternalDsl.g:1000:3: lv_group_2_0= 'group'
                            {
                            lv_group_2_0=(Token)match(input,24,FOLLOW_7); 

                                    newLeafNode(lv_group_2_0, grammarAccess.getNodeAccess().getGroupGroupKeyword_0_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeRule());
                            	        }
                                   		setWithLastConsumed(current, "group", true, "group");
                            	    

                            }


                            }

                            // InternalDsl.g:1013:2: ( (otherlv_3= RULE_ID ) )
                            // InternalDsl.g:1014:1: (otherlv_3= RULE_ID )
                            {
                            // InternalDsl.g:1014:1: (otherlv_3= RULE_ID )
                            // InternalDsl.g:1015:3: otherlv_3= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeRule());
                            	        }
                                    
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

                            		newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getGroupIdToolGroupCrossReference_0_2_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }

                    // InternalDsl.g:1026:4: ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==25) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDsl.g:1026:5: ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) )
                            {
                            // InternalDsl.g:1026:5: ( (lv_icon_4_0= 'icon' ) )
                            // InternalDsl.g:1027:1: (lv_icon_4_0= 'icon' )
                            {
                            // InternalDsl.g:1027:1: (lv_icon_4_0= 'icon' )
                            // InternalDsl.g:1028:3: lv_icon_4_0= 'icon'
                            {
                            lv_icon_4_0=(Token)match(input,25,FOLLOW_7); 

                                    newLeafNode(lv_icon_4_0, grammarAccess.getNodeAccess().getIconIconKeyword_0_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeRule());
                            	        }
                                   		setWithLastConsumed(current, "icon", true, "icon");
                            	    

                            }


                            }

                            // InternalDsl.g:1041:2: ( (lv_imageId_5_0= RULE_ID ) )
                            // InternalDsl.g:1042:1: (lv_imageId_5_0= RULE_ID )
                            {
                            // InternalDsl.g:1042:1: (lv_imageId_5_0= RULE_ID )
                            // InternalDsl.g:1043:3: lv_imageId_5_0= RULE_ID
                            {
                            lv_imageId_5_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_6=(Token)match(input,26,FOLLOW_7); 

                	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getNodeKeyword_1());
                
            // InternalDsl.g:1063:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:1064:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:1064:1: ( ruleQualifiedName )
            // InternalDsl.g:1065:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getModelClassEClassCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:1078:2: ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            // InternalDsl.g:1079:1: (lv_rootFigure_8_0= ruleConnectableElement )
            {
            // InternalDsl.g:1079:1: (lv_rootFigure_8_0= ruleConnectableElement )
            // InternalDsl.g:1080:3: lv_rootFigure_8_0= ruleConnectableElement
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
                    		"org.eclipselabs.xdiagram.Dsl.ConnectableElement");
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
    // InternalDsl.g:1104:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:1105:2: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:1106:2: iv_ruleLink= ruleLink EOF
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
    // InternalDsl.g:1113:1: ruleLink returns [EObject current=null] : ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' ) ;
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
            // InternalDsl.g:1116:28: ( ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' ) )
            // InternalDsl.g:1117:1: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' )
            {
            // InternalDsl.g:1117:1: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' )
            // InternalDsl.g:1117:2: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}'
            {
            // InternalDsl.g:1117:2: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1117:3: ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    {
                    // InternalDsl.g:1117:3: ( (lv_tool_0_0= 'tool' ) )
                    // InternalDsl.g:1118:1: (lv_tool_0_0= 'tool' )
                    {
                    // InternalDsl.g:1118:1: (lv_tool_0_0= 'tool' )
                    // InternalDsl.g:1119:3: lv_tool_0_0= 'tool'
                    {
                    lv_tool_0_0=(Token)match(input,23,FOLLOW_3); 

                            newLeafNode(lv_tool_0_0, grammarAccess.getLinkAccess().getToolToolKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "tool", true, "tool");
                    	    

                    }


                    }

                    // InternalDsl.g:1132:2: ( (lv_toolName_1_0= RULE_STRING ) )
                    // InternalDsl.g:1133:1: (lv_toolName_1_0= RULE_STRING )
                    {
                    // InternalDsl.g:1133:1: (lv_toolName_1_0= RULE_STRING )
                    // InternalDsl.g:1134:3: lv_toolName_1_0= RULE_STRING
                    {
                    lv_toolName_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

                    // InternalDsl.g:1150:2: ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalDsl.g:1150:3: ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalDsl.g:1150:3: ( (lv_group_2_0= 'group' ) )
                            // InternalDsl.g:1151:1: (lv_group_2_0= 'group' )
                            {
                            // InternalDsl.g:1151:1: (lv_group_2_0= 'group' )
                            // InternalDsl.g:1152:3: lv_group_2_0= 'group'
                            {
                            lv_group_2_0=(Token)match(input,24,FOLLOW_7); 

                                    newLeafNode(lv_group_2_0, grammarAccess.getLinkAccess().getGroupGroupKeyword_0_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLinkRule());
                            	        }
                                   		setWithLastConsumed(current, "group", true, "group");
                            	    

                            }


                            }

                            // InternalDsl.g:1165:2: ( (otherlv_3= RULE_ID ) )
                            // InternalDsl.g:1166:1: (otherlv_3= RULE_ID )
                            {
                            // InternalDsl.g:1166:1: (otherlv_3= RULE_ID )
                            // InternalDsl.g:1167:3: otherlv_3= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLinkRule());
                            	        }
                                    
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

                            		newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getGroupIdToolGroupCrossReference_0_2_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }

                    // InternalDsl.g:1178:4: ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==25) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDsl.g:1178:5: ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) )
                            {
                            // InternalDsl.g:1178:5: ( (lv_icon_4_0= 'icon' ) )
                            // InternalDsl.g:1179:1: (lv_icon_4_0= 'icon' )
                            {
                            // InternalDsl.g:1179:1: (lv_icon_4_0= 'icon' )
                            // InternalDsl.g:1180:3: lv_icon_4_0= 'icon'
                            {
                            lv_icon_4_0=(Token)match(input,25,FOLLOW_7); 

                                    newLeafNode(lv_icon_4_0, grammarAccess.getLinkAccess().getIconIconKeyword_0_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLinkRule());
                            	        }
                                   		setWithLastConsumed(current, "icon", true, "icon");
                            	    

                            }


                            }

                            // InternalDsl.g:1193:2: ( (lv_imageId_5_0= RULE_ID ) )
                            // InternalDsl.g:1194:1: (lv_imageId_5_0= RULE_ID )
                            {
                            // InternalDsl.g:1194:1: (lv_imageId_5_0= RULE_ID )
                            // InternalDsl.g:1195:3: lv_imageId_5_0= RULE_ID
                            {
                            lv_imageId_5_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            otherlv_6=(Token)match(input,27,FOLLOW_25); 

                	newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getLinkKeyword_1());
                
            // InternalDsl.g:1215:1: ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1215:2: ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalDsl.g:1215:2: ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    // InternalDsl.g:1215:3: ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalDsl.g:1215:3: ( (lv_reference_7_0= 'reference' ) )
                    // InternalDsl.g:1216:1: (lv_reference_7_0= 'reference' )
                    {
                    // InternalDsl.g:1216:1: (lv_reference_7_0= 'reference' )
                    // InternalDsl.g:1217:3: lv_reference_7_0= 'reference'
                    {
                    lv_reference_7_0=(Token)match(input,28,FOLLOW_7); 

                            newLeafNode(lv_reference_7_0, grammarAccess.getLinkAccess().getReferenceReferenceKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "reference", true, "reference");
                    	    

                    }


                    }

                    // InternalDsl.g:1230:2: ( ( ruleQualifiedName ) )
                    // InternalDsl.g:1231:1: ( ruleQualifiedName )
                    {
                    // InternalDsl.g:1231:1: ( ruleQualifiedName )
                    // InternalDsl.g:1232:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1246:6: ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalDsl.g:1246:6: ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) )
                    // InternalDsl.g:1246:7: ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) )
                    {
                    // InternalDsl.g:1246:7: ( (lv_complex_9_0= 'class' ) )
                    // InternalDsl.g:1247:1: (lv_complex_9_0= 'class' )
                    {
                    // InternalDsl.g:1247:1: (lv_complex_9_0= 'class' )
                    // InternalDsl.g:1248:3: lv_complex_9_0= 'class'
                    {
                    lv_complex_9_0=(Token)match(input,29,FOLLOW_7); 

                            newLeafNode(lv_complex_9_0, grammarAccess.getLinkAccess().getComplexClassKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "complex", true, "class");
                    	    

                    }


                    }

                    // InternalDsl.g:1261:2: ( ( ruleQualifiedName ) )
                    // InternalDsl.g:1262:1: ( ruleQualifiedName )
                    {
                    // InternalDsl.g:1262:1: ( ruleQualifiedName )
                    // InternalDsl.g:1263:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_26);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_7); 

                        	newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getSourceKeyword_2_1_2());
                        
                    // InternalDsl.g:1280:1: ( ( ruleQualifiedName ) )
                    // InternalDsl.g:1281:1: ( ruleQualifiedName )
                    {
                    // InternalDsl.g:1281:1: ( ruleQualifiedName )
                    // InternalDsl.g:1282:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_2_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_27);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_7); 

                        	newLeafNode(otherlv_13, grammarAccess.getLinkAccess().getTargetKeyword_2_1_4());
                        
                    // InternalDsl.g:1299:1: ( ( ruleQualifiedName ) )
                    // InternalDsl.g:1300:1: ( ruleQualifiedName )
                    {
                    // InternalDsl.g:1300:1: ( ruleQualifiedName )
                    // InternalDsl.g:1301:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_2_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1314:4: ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1314:5: ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) )
                    {
                    // InternalDsl.g:1314:5: ( (lv_styled_15_0= '+' ) )
                    // InternalDsl.g:1315:1: (lv_styled_15_0= '+' )
                    {
                    // InternalDsl.g:1315:1: (lv_styled_15_0= '+' )
                    // InternalDsl.g:1316:3: lv_styled_15_0= '+'
                    {
                    lv_styled_15_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_15_0, grammarAccess.getLinkAccess().getStyledPlusSignKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:1329:2: ( (otherlv_16= RULE_ID ) )
                    // InternalDsl.g:1330:1: (otherlv_16= RULE_ID )
                    {
                    // InternalDsl.g:1330:1: (otherlv_16= RULE_ID )
                    // InternalDsl.g:1331:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_16, grammarAccess.getLinkAccess().getStyleStyleCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_28); 

                	newLeafNode(otherlv_17, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalDsl.g:1346:1: ( (lv_features_18_0= ruleLinkFeature ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==56||LA22_0==79||LA22_0==81) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:1347:1: (lv_features_18_0= ruleLinkFeature )
            	    {
            	    // InternalDsl.g:1347:1: (lv_features_18_0= ruleLinkFeature )
            	    // InternalDsl.g:1348:3: lv_features_18_0= ruleLinkFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getFeaturesLinkFeatureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_28);
            	    lv_features_18_0=ruleLinkFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_18_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.LinkFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalDsl.g:1364:3: ( (lv_decorators_19_0= ruleDecorator ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:1365:1: (lv_decorators_19_0= ruleDecorator )
            	    {
            	    // InternalDsl.g:1365:1: (lv_decorators_19_0= ruleDecorator )
            	    // InternalDsl.g:1366:3: lv_decorators_19_0= ruleDecorator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getDecoratorsDecoratorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_29);
            	    lv_decorators_19_0=ruleDecorator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decorators",
            	            		lv_decorators_19_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.Decorator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:1394:1: entryRuleLinkFeature returns [EObject current=null] : iv_ruleLinkFeature= ruleLinkFeature EOF ;
    public final EObject entryRuleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkFeature = null;


        try {
            // InternalDsl.g:1395:2: (iv_ruleLinkFeature= ruleLinkFeature EOF )
            // InternalDsl.g:1396:2: iv_ruleLinkFeature= ruleLinkFeature EOF
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
    // InternalDsl.g:1403:1: ruleLinkFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) ;
    public final EObject ruleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_LineStyle_1 = null;

        EObject this_LineWidth_2 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:1406:28: ( (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) )
            // InternalDsl.g:1407:1: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            {
            // InternalDsl.g:1407:1: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt24=1;
                }
                break;
            case 79:
                {
                alt24=2;
                }
                break;
            case 81:
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
                    // InternalDsl.g:1408:5: this_Foreground_0= ruleForeground
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
                    // InternalDsl.g:1418:5: this_LineStyle_1= ruleLineStyle
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
                    // InternalDsl.g:1428:5: this_LineWidth_2= ruleLineWidth
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
    // InternalDsl.g:1444:1: entryRuleDecorator returns [EObject current=null] : iv_ruleDecorator= ruleDecorator EOF ;
    public final EObject entryRuleDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorator = null;


        try {
            // InternalDsl.g:1445:2: (iv_ruleDecorator= ruleDecorator EOF )
            // InternalDsl.g:1446:2: iv_ruleDecorator= ruleDecorator EOF
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
    // InternalDsl.g:1453:1: ruleDecorator returns [EObject current=null] : (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) ;
    public final EObject ruleDecorator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_position_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:1456:28: ( (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) )
            // InternalDsl.g:1457:1: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            {
            // InternalDsl.g:1457:1: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            // InternalDsl.g:1457:3: otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_30); 

                	newLeafNode(otherlv_0, grammarAccess.getDecoratorAccess().getDecoratorKeyword_0());
                
            // InternalDsl.g:1461:1: ( (lv_position_1_0= RULE_INT ) )
            // InternalDsl.g:1462:1: (lv_position_1_0= RULE_INT )
            {
            // InternalDsl.g:1462:1: (lv_position_1_0= RULE_INT )
            // InternalDsl.g:1463:3: lv_position_1_0= RULE_INT
            {
            lv_position_1_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_32); 

                	newLeafNode(otherlv_2, grammarAccess.getDecoratorAccess().getPercentSignKeyword_2());
                
            // InternalDsl.g:1483:1: ( (lv_element_3_0= ruleDecoratorElement ) )
            // InternalDsl.g:1484:1: (lv_element_3_0= ruleDecoratorElement )
            {
            // InternalDsl.g:1484:1: (lv_element_3_0= ruleDecoratorElement )
            // InternalDsl.g:1485:3: lv_element_3_0= ruleDecoratorElement
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
                    		"org.eclipselabs.xdiagram.Dsl.DecoratorElement");
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
    // InternalDsl.g:1509:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // InternalDsl.g:1510:2: (iv_ruleAnchor= ruleAnchor EOF )
            // InternalDsl.g:1511:2: iv_ruleAnchor= ruleAnchor EOF
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
    // InternalDsl.g:1518:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalDsl.g:1521:28: ( (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalDsl.g:1522:1: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalDsl.g:1522:1: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalDsl.g:1522:3: otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_33); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAnchorKeyword_0());
                
            // InternalDsl.g:1526:1: ( (lv_direction_1_0= ruleAnchorDirection ) )
            // InternalDsl.g:1527:1: (lv_direction_1_0= ruleAnchorDirection )
            {
            // InternalDsl.g:1527:1: (lv_direction_1_0= ruleAnchorDirection )
            // InternalDsl.g:1528:3: lv_direction_1_0= ruleAnchorDirection
            {
             
            	        newCompositeNode(grammarAccess.getAnchorAccess().getDirectionAnchorDirectionEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_7);
            lv_direction_1_0=ruleAnchorDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnchorRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_1_0, 
                    		"org.eclipselabs.xdiagram.Dsl.AnchorDirection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:1544:2: ( ( ruleQualifiedName ) )
            // InternalDsl.g:1545:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:1545:1: ( ruleQualifiedName )
            // InternalDsl.g:1546:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnchorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnchorAccess().getModelReferenceEReferenceCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_34);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:1559:2: (otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1559:4: otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_30); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnchorAccess().getMaxKeyword_3_0());
                        
                    // InternalDsl.g:1563:1: ( (lv_max_4_0= RULE_INT ) )
                    // InternalDsl.g:1564:1: (lv_max_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1564:1: (lv_max_4_0= RULE_INT )
                    // InternalDsl.g:1565:3: lv_max_4_0= RULE_INT
                    {
                    lv_max_4_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            // InternalDsl.g:1581:4: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1582:1: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:1582:1: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalDsl.g:1583:3: lv_conditional_5_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getConditionalFeatureConditionalParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_5_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnchorRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_5_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:1611:1: entryRuleCustomColor returns [EObject current=null] : iv_ruleCustomColor= ruleCustomColor EOF ;
    public final EObject entryRuleCustomColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomColor = null;


        try {
            // InternalDsl.g:1612:2: (iv_ruleCustomColor= ruleCustomColor EOF )
            // InternalDsl.g:1613:2: iv_ruleCustomColor= ruleCustomColor EOF
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
    // InternalDsl.g:1620:1: ruleCustomColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) ;
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
            // InternalDsl.g:1623:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) )
            // InternalDsl.g:1624:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            {
            // InternalDsl.g:1624:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            // InternalDsl.g:1624:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomColorAccess().getColorKeyword_0());
                
            // InternalDsl.g:1628:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1629:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1629:1: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1630:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            // InternalDsl.g:1646:2: ( (lv_R_2_0= RULE_INT ) )
            // InternalDsl.g:1647:1: (lv_R_2_0= RULE_INT )
            {
            // InternalDsl.g:1647:1: (lv_R_2_0= RULE_INT )
            // InternalDsl.g:1648:3: lv_R_2_0= RULE_INT
            {
            lv_R_2_0=(Token)match(input,RULE_INT,FOLLOW_30); 

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

            // InternalDsl.g:1664:2: ( (lv_G_3_0= RULE_INT ) )
            // InternalDsl.g:1665:1: (lv_G_3_0= RULE_INT )
            {
            // InternalDsl.g:1665:1: (lv_G_3_0= RULE_INT )
            // InternalDsl.g:1666:3: lv_G_3_0= RULE_INT
            {
            lv_G_3_0=(Token)match(input,RULE_INT,FOLLOW_30); 

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

            // InternalDsl.g:1682:2: ( (lv_B_4_0= RULE_INT ) )
            // InternalDsl.g:1683:1: (lv_B_4_0= RULE_INT )
            {
            // InternalDsl.g:1683:1: (lv_B_4_0= RULE_INT )
            // InternalDsl.g:1684:3: lv_B_4_0= RULE_INT
            {
            lv_B_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:1712:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDsl.g:1713:2: (iv_ruleColor= ruleColor EOF )
            // InternalDsl.g:1714:2: iv_ruleColor= ruleColor EOF
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
    // InternalDsl.g:1721:1: ruleColor returns [EObject current=null] : ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_default_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:1724:28: ( ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDsl.g:1725:1: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDsl.g:1725:1: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=84 && LA27_0<=99)) ) {
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
                    // InternalDsl.g:1725:2: ( (lv_default_0_0= ruleDefaultColor ) )
                    {
                    // InternalDsl.g:1725:2: ( (lv_default_0_0= ruleDefaultColor ) )
                    // InternalDsl.g:1726:1: (lv_default_0_0= ruleDefaultColor )
                    {
                    // InternalDsl.g:1726:1: (lv_default_0_0= ruleDefaultColor )
                    // InternalDsl.g:1727:3: lv_default_0_0= ruleDefaultColor
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
                            		"org.eclipselabs.xdiagram.Dsl.DefaultColor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1744:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDsl.g:1744:6: ( (otherlv_1= RULE_ID ) )
                    // InternalDsl.g:1745:1: (otherlv_1= RULE_ID )
                    {
                    // InternalDsl.g:1745:1: (otherlv_1= RULE_ID )
                    // InternalDsl.g:1746:3: otherlv_1= RULE_ID
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
    // InternalDsl.g:1765:1: entryRuleConnectableElement returns [EObject current=null] : iv_ruleConnectableElement= ruleConnectableElement EOF ;
    public final EObject entryRuleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElement = null;


        try {
            // InternalDsl.g:1766:2: (iv_ruleConnectableElement= ruleConnectableElement EOF )
            // InternalDsl.g:1767:2: iv_ruleConnectableElement= ruleConnectableElement EOF
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
    // InternalDsl.g:1774:1: ruleConnectableElement returns [EObject current=null] : (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) ;
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
            // InternalDsl.g:1777:28: ( (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) )
            // InternalDsl.g:1778:1: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            {
            // InternalDsl.g:1778:1: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            int alt28=9;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
                {
                alt28=1;
                }
                break;
            case 42:
                {
                alt28=2;
                }
                break;
            case 43:
            case 44:
                {
                alt28=3;
                }
                break;
            case 45:
            case 46:
                {
                alt28=4;
                }
                break;
            case 53:
                {
                alt28=5;
                }
                break;
            case 54:
                {
                alt28=6;
                }
                break;
            case 55:
                {
                alt28=7;
                }
                break;
            case 37:
                {
                alt28=8;
                }
                break;
            case 47:
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
                    // InternalDsl.g:1779:5: this_Rectangle_0= ruleRectangle
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
                    // InternalDsl.g:1789:5: this_Rhombus_1= ruleRhombus
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
                    // InternalDsl.g:1799:5: this_Ellipse_2= ruleEllipse
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
                    // InternalDsl.g:1809:5: this_Polyline_3= rulePolyline
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
                    // InternalDsl.g:1819:5: this_Label_4= ruleLabel
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
                    // InternalDsl.g:1829:5: this_Image_5= ruleImage
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
                    // InternalDsl.g:1839:5: this_Invisible_6= ruleInvisible
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
                    // InternalDsl.g:1849:5: this_Custom_7= ruleCustom
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
                    // InternalDsl.g:1859:5: this_Triangle_8= ruleTriangle
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
    // InternalDsl.g:1875:1: entryRuleDecoratorElement returns [EObject current=null] : iv_ruleDecoratorElement= ruleDecoratorElement EOF ;
    public final EObject entryRuleDecoratorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoratorElement = null;


        try {
            // InternalDsl.g:1876:2: (iv_ruleDecoratorElement= ruleDecoratorElement EOF )
            // InternalDsl.g:1877:2: iv_ruleDecoratorElement= ruleDecoratorElement EOF
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
    // InternalDsl.g:1884:1: ruleDecoratorElement returns [EObject current=null] : (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) ;
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
            // InternalDsl.g:1887:28: ( (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) )
            // InternalDsl.g:1888:1: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            {
            // InternalDsl.g:1888:1: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            int alt29=8;
            switch ( input.LA(1) ) {
            case 43:
            case 44:
                {
                alt29=1;
                }
                break;
            case 42:
                {
                alt29=2;
                }
                break;
            case 45:
            case 46:
                {
                alt29=3;
                }
                break;
            case 47:
                {
                alt29=4;
                }
                break;
            case 53:
                {
                alt29=5;
                }
                break;
            case 54:
                {
                alt29=6;
                }
                break;
            case 50:
                {
                alt29=7;
                }
                break;
            case 48:
            case 49:
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
                    // InternalDsl.g:1889:5: this_Ellipse_0= ruleEllipse
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
                    // InternalDsl.g:1899:5: this_Rhombus_1= ruleRhombus
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
                    // InternalDsl.g:1909:5: this_Polyline_2= rulePolyline
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
                    // InternalDsl.g:1919:5: this_Triangle_3= ruleTriangle
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
                    // InternalDsl.g:1929:5: this_Label_4= ruleLabel
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
                    // InternalDsl.g:1939:5: this_Image_5= ruleImage
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
                    // InternalDsl.g:1949:5: this_Arrow_6= ruleArrow
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
                    // InternalDsl.g:1959:5: this_Line_7= ruleLine
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
    // InternalDsl.g:1975:1: entryRuleConnectableElementFeature returns [EObject current=null] : iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF ;
    public final EObject entryRuleConnectableElementFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElementFeature = null;


        try {
            // InternalDsl.g:1976:2: (iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF )
            // InternalDsl.g:1977:2: iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF
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
    // InternalDsl.g:1984:1: ruleConnectableElementFeature returns [EObject current=null] : (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) ;
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
            // InternalDsl.g:1987:28: ( (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) )
            // InternalDsl.g:1988:1: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            {
            // InternalDsl.g:1988:1: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            int alt30=10;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt30=1;
                }
                break;
            case 59:
                {
                alt30=2;
                }
                break;
            case 56:
            case 57:
                {
                alt30=3;
                }
                break;
            case 58:
                {
                alt30=4;
                }
                break;
            case 79:
                {
                alt30=5;
                }
                break;
            case 81:
                {
                alt30=6;
                }
                break;
            case 51:
                {
                alt30=7;
                }
                break;
            case 34:
                {
                alt30=8;
                }
                break;
            case 65:
                {
                alt30=9;
                }
                break;
            case 55:
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
                    // InternalDsl.g:1989:5: this_Position_0= rulePosition
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
                    // InternalDsl.g:1999:5: this_Size_1= ruleSize
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
                    // InternalDsl.g:2009:5: this_ColorFeature_2= ruleColorFeature
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
                    // InternalDsl.g:2019:5: this_Transparency_3= ruleTransparency
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
                    // InternalDsl.g:2029:5: this_LineStyle_4= ruleLineStyle
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
                    // InternalDsl.g:2039:5: this_LineWidth_5= ruleLineWidth
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
                    // InternalDsl.g:2049:5: this_Contains_6= ruleContains
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
                    // InternalDsl.g:2059:5: this_Anchor_7= ruleAnchor
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
                    // InternalDsl.g:2069:5: this_Layout_8= ruleLayout
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
                    // InternalDsl.g:2079:5: this_Visible_9= ruleVisible
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
    // InternalDsl.g:2095:1: entryRuleCustomFigure returns [EObject current=null] : iv_ruleCustomFigure= ruleCustomFigure EOF ;
    public final EObject entryRuleCustomFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFigure = null;


        try {
            // InternalDsl.g:2096:2: (iv_ruleCustomFigure= ruleCustomFigure EOF )
            // InternalDsl.g:2097:2: iv_ruleCustomFigure= ruleCustomFigure EOF
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
    // InternalDsl.g:2104:1: ruleCustomFigure returns [EObject current=null] : (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleCustomFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:2107:28: ( (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) )
            // InternalDsl.g:2108:1: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            {
            // InternalDsl.g:2108:1: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            // InternalDsl.g:2108:3: otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomFigureAccess().getFigureKeyword_0());
                
            // InternalDsl.g:2112:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2113:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2113:1: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2114:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_21); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomFigureAccess().getAsKeyword_2());
                
            // InternalDsl.g:2134:1: ( (lv_element_3_0= ruleConnectableElement ) )
            // InternalDsl.g:2135:1: (lv_element_3_0= ruleConnectableElement )
            {
            // InternalDsl.g:2135:1: (lv_element_3_0= ruleConnectableElement )
            // InternalDsl.g:2136:3: lv_element_3_0= ruleConnectableElement
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
                    		"org.eclipselabs.xdiagram.Dsl.ConnectableElement");
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
    // InternalDsl.g:2160:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalDsl.g:2161:2: (iv_ruleCustom= ruleCustom EOF )
            // InternalDsl.g:2162:2: iv_ruleCustom= ruleCustom EOF
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
    // InternalDsl.g:2169:1: ruleCustom returns [EObject current=null] : (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalDsl.g:2172:28: ( (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalDsl.g:2173:1: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:2173:1: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalDsl.g:2173:3: otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomAccess().getFigureKeyword_0());
                
            // InternalDsl.g:2177:1: ( (otherlv_1= RULE_ID ) )
            // InternalDsl.g:2178:1: (otherlv_1= RULE_ID )
            {
            // InternalDsl.g:2178:1: (otherlv_1= RULE_ID )
            // InternalDsl.g:2179:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            		newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getFigureCustomFigureCrossReference_1_0()); 
            	

            }


            }

            // InternalDsl.g:2190:2: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:2190:3: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:2190:3: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:2191:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:2191:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:2192:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getCustomAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:2205:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:2206:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:2206:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:2207:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_37); 

                	newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDsl.g:2222:1: ( (lv_features_5_0= ruleLinkedFeature ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==34||LA32_0==51) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDsl.g:2223:1: (lv_features_5_0= ruleLinkedFeature )
            	    {
            	    // InternalDsl.g:2223:1: (lv_features_5_0= ruleLinkedFeature )
            	    // InternalDsl.g:2224:3: lv_features_5_0= ruleLinkedFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomAccess().getFeaturesLinkedFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_37);
            	    lv_features_5_0=ruleLinkedFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.LinkedFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalDsl.g:2240:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==39) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDsl.g:2240:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_32); 

            	        	newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getChildKeyword_5_0());
            	        
            	    // InternalDsl.g:2244:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalDsl.g:2245:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalDsl.g:2245:1: (lv_children_7_0= ruleChildElement )
            	    // InternalDsl.g:2246:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:2274:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalDsl.g:2275:2: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalDsl.g:2276:2: iv_ruleRectangle= ruleRectangle EOF
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
    // InternalDsl.g:2283:1: ruleRectangle returns [EObject current=null] : ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalDsl.g:2286:28: ( ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalDsl.g:2287:1: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:2287:1: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalDsl.g:2287:2: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalDsl.g:2287:2: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            else if ( (LA34_0==41) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:2287:3: ( (lv_rectangle_0_0= 'rectangle' ) )
                    {
                    // InternalDsl.g:2287:3: ( (lv_rectangle_0_0= 'rectangle' ) )
                    // InternalDsl.g:2288:1: (lv_rectangle_0_0= 'rectangle' )
                    {
                    // InternalDsl.g:2288:1: (lv_rectangle_0_0= 'rectangle' )
                    // InternalDsl.g:2289:3: lv_rectangle_0_0= 'rectangle'
                    {
                    lv_rectangle_0_0=(Token)match(input,40,FOLLOW_14); 

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
                    // InternalDsl.g:2303:6: ( (lv_square_1_0= 'square' ) )
                    {
                    // InternalDsl.g:2303:6: ( (lv_square_1_0= 'square' ) )
                    // InternalDsl.g:2304:1: (lv_square_1_0= 'square' )
                    {
                    // InternalDsl.g:2304:1: (lv_square_1_0= 'square' )
                    // InternalDsl.g:2305:3: lv_square_1_0= 'square'
                    {
                    lv_square_1_0=(Token)match(input,41,FOLLOW_14); 

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

            // InternalDsl.g:2318:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:2318:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:2318:4: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:2319:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:2319:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:2320:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getRectangleAccess().getStyledPlusSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRectangleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:2333:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:2334:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:2334:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:2335:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRectangleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getStyleStyleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_39); 

                	newLeafNode(otherlv_4, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDsl.g:2350:1: ( (lv_features_5_0= ruleRectangleFeature ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34||LA36_0==51||(LA36_0>=55 && LA36_0<=59)||(LA36_0>=63 && LA36_0<=65)||LA36_0==79||LA36_0==81) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDsl.g:2351:1: (lv_features_5_0= ruleRectangleFeature )
            	    {
            	    // InternalDsl.g:2351:1: (lv_features_5_0= ruleRectangleFeature )
            	    // InternalDsl.g:2352:3: lv_features_5_0= ruleRectangleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRectangleAccess().getFeaturesRectangleFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_features_5_0=ruleRectangleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.RectangleFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalDsl.g:2368:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==39) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDsl.g:2368:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_32); 

            	        	newLeafNode(otherlv_6, grammarAccess.getRectangleAccess().getChildKeyword_4_0());
            	        
            	    // InternalDsl.g:2372:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalDsl.g:2373:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalDsl.g:2373:1: (lv_children_7_0= ruleChildElement )
            	    // InternalDsl.g:2374:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRectangleAccess().getChildrenChildElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:2402:1: entryRuleRectangleFeature returns [EObject current=null] : iv_ruleRectangleFeature= ruleRectangleFeature EOF ;
    public final EObject entryRuleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleFeature = null;


        try {
            // InternalDsl.g:2403:2: (iv_ruleRectangleFeature= ruleRectangleFeature EOF )
            // InternalDsl.g:2404:2: iv_ruleRectangleFeature= ruleRectangleFeature EOF
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
    // InternalDsl.g:2411:1: ruleRectangleFeature returns [EObject current=null] : (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) ;
    public final EObject ruleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElementFeature_0 = null;

        EObject this_Corner_1 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:2414:28: ( (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) )
            // InternalDsl.g:2415:1: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            {
            // InternalDsl.g:2415:1: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34||LA38_0==51||(LA38_0>=55 && LA38_0<=59)||LA38_0==63||LA38_0==65||LA38_0==79||LA38_0==81) ) {
                alt38=1;
            }
            else if ( (LA38_0==64) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:2416:5: this_ConnectableElementFeature_0= ruleConnectableElementFeature
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
                    // InternalDsl.g:2426:5: this_Corner_1= ruleCorner
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
    // InternalDsl.g:2442:1: entryRuleRhombus returns [EObject current=null] : iv_ruleRhombus= ruleRhombus EOF ;
    public final EObject entryRuleRhombus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhombus = null;


        try {
            // InternalDsl.g:2443:2: (iv_ruleRhombus= ruleRhombus EOF )
            // InternalDsl.g:2444:2: iv_ruleRhombus= ruleRhombus EOF
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
    // InternalDsl.g:2451:1: ruleRhombus returns [EObject current=null] : ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalDsl.g:2454:28: ( ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalDsl.g:2455:1: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:2455:1: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalDsl.g:2455:2: () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalDsl.g:2455:2: ()
            // InternalDsl.g:2456:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRhombusAccess().getRhombusAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getRhombusAccess().getRhombusKeyword_1());
                
            // InternalDsl.g:2465:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:2465:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:2465:2: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:2466:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:2466:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:2467:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getRhombusAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRhombusRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:2480:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:2481:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:2481:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:2482:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRhombusRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getRhombusAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_39); 

                	newLeafNode(otherlv_4, grammarAccess.getRhombusAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDsl.g:2497:1: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==34||LA40_0==51||(LA40_0>=55 && LA40_0<=59)||LA40_0==63||LA40_0==65||LA40_0==79||LA40_0==81) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDsl.g:2498:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // InternalDsl.g:2498:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    // InternalDsl.g:2499:3: lv_features_5_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRhombusAccess().getFeaturesConnectableElementFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_features_5_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRhombusRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ConnectableElementFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalDsl.g:2515:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==39) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDsl.g:2515:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_32); 

            	        	newLeafNode(otherlv_6, grammarAccess.getRhombusAccess().getChildKeyword_5_0());
            	        
            	    // InternalDsl.g:2519:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalDsl.g:2520:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalDsl.g:2520:1: (lv_children_7_0= ruleChildElement )
            	    // InternalDsl.g:2521:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRhombusAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRhombusRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:2549:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // InternalDsl.g:2550:2: (iv_ruleEllipse= ruleEllipse EOF )
            // InternalDsl.g:2551:2: iv_ruleEllipse= ruleEllipse EOF
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
    // InternalDsl.g:2558:1: ruleEllipse returns [EObject current=null] : ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalDsl.g:2561:28: ( ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalDsl.g:2562:1: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:2562:1: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalDsl.g:2562:2: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalDsl.g:2562:2: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            else if ( (LA42_0==44) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:2562:3: ( (lv_ellipse_0_0= 'ellipse' ) )
                    {
                    // InternalDsl.g:2562:3: ( (lv_ellipse_0_0= 'ellipse' ) )
                    // InternalDsl.g:2563:1: (lv_ellipse_0_0= 'ellipse' )
                    {
                    // InternalDsl.g:2563:1: (lv_ellipse_0_0= 'ellipse' )
                    // InternalDsl.g:2564:3: lv_ellipse_0_0= 'ellipse'
                    {
                    lv_ellipse_0_0=(Token)match(input,43,FOLLOW_14); 

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
                    // InternalDsl.g:2578:6: ( (lv_circle_1_0= 'circle' ) )
                    {
                    // InternalDsl.g:2578:6: ( (lv_circle_1_0= 'circle' ) )
                    // InternalDsl.g:2579:1: (lv_circle_1_0= 'circle' )
                    {
                    // InternalDsl.g:2579:1: (lv_circle_1_0= 'circle' )
                    // InternalDsl.g:2580:3: lv_circle_1_0= 'circle'
                    {
                    lv_circle_1_0=(Token)match(input,44,FOLLOW_14); 

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

            // InternalDsl.g:2593:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:2593:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:2593:4: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:2594:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:2594:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:2595:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getEllipseAccess().getStyledPlusSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEllipseRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:2608:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:2609:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:2609:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:2610:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEllipseRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getEllipseAccess().getStyleStyleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_39); 

                	newLeafNode(otherlv_4, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDsl.g:2625:1: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==34||LA44_0==51||(LA44_0>=55 && LA44_0<=59)||LA44_0==63||LA44_0==65||LA44_0==79||LA44_0==81) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDsl.g:2626:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // InternalDsl.g:2626:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    // InternalDsl.g:2627:3: lv_features_5_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEllipseAccess().getFeaturesConnectableElementFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_features_5_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ConnectableElementFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalDsl.g:2643:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==39) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDsl.g:2643:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_32); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEllipseAccess().getChildKeyword_4_0());
            	        
            	    // InternalDsl.g:2647:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalDsl.g:2648:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalDsl.g:2648:1: (lv_children_7_0= ruleChildElement )
            	    // InternalDsl.g:2649:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEllipseAccess().getChildrenChildElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:2677:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // InternalDsl.g:2678:2: (iv_rulePolyline= rulePolyline EOF )
            // InternalDsl.g:2679:2: iv_rulePolyline= rulePolyline EOF
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
    // InternalDsl.g:2686:1: rulePolyline returns [EObject current=null] : ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' ) ;
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
            // InternalDsl.g:2689:28: ( ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' ) )
            // InternalDsl.g:2690:1: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' )
            {
            // InternalDsl.g:2690:1: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' )
            // InternalDsl.g:2690:2: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}'
            {
            // InternalDsl.g:2690:2: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==45) ) {
                alt46=1;
            }
            else if ( (LA46_0==46) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:2690:3: ( (lv_polygon_0_0= 'polygon' ) )
                    {
                    // InternalDsl.g:2690:3: ( (lv_polygon_0_0= 'polygon' ) )
                    // InternalDsl.g:2691:1: (lv_polygon_0_0= 'polygon' )
                    {
                    // InternalDsl.g:2691:1: (lv_polygon_0_0= 'polygon' )
                    // InternalDsl.g:2692:3: lv_polygon_0_0= 'polygon'
                    {
                    lv_polygon_0_0=(Token)match(input,45,FOLLOW_14); 

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
                    // InternalDsl.g:2706:6: ( (lv_polyline_1_0= 'polyline' ) )
                    {
                    // InternalDsl.g:2706:6: ( (lv_polyline_1_0= 'polyline' ) )
                    // InternalDsl.g:2707:1: (lv_polyline_1_0= 'polyline' )
                    {
                    // InternalDsl.g:2707:1: (lv_polyline_1_0= 'polyline' )
                    // InternalDsl.g:2708:3: lv_polyline_1_0= 'polyline'
                    {
                    lv_polyline_1_0=(Token)match(input,46,FOLLOW_14); 

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

            // InternalDsl.g:2721:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==21) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:2721:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:2721:4: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:2722:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:2722:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:2723:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getPolylineAccess().getStyledPlusSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolylineRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:2736:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:2737:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:2737:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:2738:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolylineRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getPolylineAccess().getStyleStyleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_40); 

                	newLeafNode(otherlv_4, grammarAccess.getPolylineAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDsl.g:2753:1: ( (lv_features_5_0= rulePoint ) )
            // InternalDsl.g:2754:1: (lv_features_5_0= rulePoint )
            {
            // InternalDsl.g:2754:1: (lv_features_5_0= rulePoint )
            // InternalDsl.g:2755:3: lv_features_5_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_40);
            lv_features_5_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_5_0, 
                    		"org.eclipselabs.xdiagram.Dsl.Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:2771:2: ( (lv_features_6_0= rulePoint ) )
            // InternalDsl.g:2772:1: (lv_features_6_0= rulePoint )
            {
            // InternalDsl.g:2772:1: (lv_features_6_0= rulePoint )
            // InternalDsl.g:2773:3: lv_features_6_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_39);
            lv_features_6_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_6_0, 
                    		"org.eclipselabs.xdiagram.Dsl.Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:2789:2: ( (lv_features_7_0= rulePoint ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==62) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDsl.g:2790:1: (lv_features_7_0= rulePoint )
            	    {
            	    // InternalDsl.g:2790:1: (lv_features_7_0= rulePoint )
            	    // InternalDsl.g:2791:3: lv_features_7_0= rulePoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_features_7_0=rulePoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.Point");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // InternalDsl.g:2807:3: ( (lv_features_8_0= ruleConnectableElementFeature ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==34||LA49_0==51||(LA49_0>=55 && LA49_0<=59)||LA49_0==63||LA49_0==65||LA49_0==79||LA49_0==81) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDsl.g:2808:1: (lv_features_8_0= ruleConnectableElementFeature )
            	    {
            	    // InternalDsl.g:2808:1: (lv_features_8_0= ruleConnectableElementFeature )
            	    // InternalDsl.g:2809:3: lv_features_8_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesConnectableElementFeatureParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_features_8_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_8_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ConnectableElementFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalDsl.g:2825:3: (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==39) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDsl.g:2825:5: otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) )
            	    {
            	    otherlv_9=(Token)match(input,39,FOLLOW_32); 

            	        	newLeafNode(otherlv_9, grammarAccess.getPolylineAccess().getChildKeyword_7_0());
            	        
            	    // InternalDsl.g:2829:1: ( (lv_children_10_0= ruleChildElement ) )
            	    // InternalDsl.g:2830:1: (lv_children_10_0= ruleChildElement )
            	    {
            	    // InternalDsl.g:2830:1: (lv_children_10_0= ruleChildElement )
            	    // InternalDsl.g:2831:3: lv_children_10_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolylineAccess().getChildrenChildElementParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_children_10_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_10_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:2859:1: entryRuleTriangle returns [EObject current=null] : iv_ruleTriangle= ruleTriangle EOF ;
    public final EObject entryRuleTriangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriangle = null;


        try {
            // InternalDsl.g:2860:2: (iv_ruleTriangle= ruleTriangle EOF )
            // InternalDsl.g:2861:2: iv_ruleTriangle= ruleTriangle EOF
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
    // InternalDsl.g:2868:1: ruleTriangle returns [EObject current=null] : ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalDsl.g:2871:28: ( ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalDsl.g:2872:1: ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:2872:1: ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalDsl.g:2872:2: () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalDsl.g:2872:2: ()
            // InternalDsl.g:2873:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTriangleAccess().getTriangleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getTriangleAccess().getTriangleKeyword_1());
                
            // InternalDsl.g:2882:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==21) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:2882:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:2882:2: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:2883:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:2883:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:2884:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getTriangleAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriangleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:2897:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:2898:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:2898:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:2899:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriangleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getTriangleAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_39); 

                	newLeafNode(otherlv_4, grammarAccess.getTriangleAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDsl.g:2914:1: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==34||LA52_0==51||(LA52_0>=55 && LA52_0<=59)||LA52_0==63||LA52_0==65||LA52_0==79||LA52_0==81) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalDsl.g:2915:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // InternalDsl.g:2915:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    // InternalDsl.g:2916:3: lv_features_5_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTriangleAccess().getFeaturesConnectableElementFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_features_5_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTriangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ConnectableElementFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // InternalDsl.g:2932:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==39) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalDsl.g:2932:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_32); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTriangleAccess().getChildKeyword_5_0());
            	        
            	    // InternalDsl.g:2936:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalDsl.g:2937:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalDsl.g:2937:1: (lv_children_7_0= ruleChildElement )
            	    // InternalDsl.g:2938:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTriangleAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTriangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:2966:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalDsl.g:2967:2: (iv_ruleLine= ruleLine EOF )
            // InternalDsl.g:2968:2: iv_ruleLine= ruleLine EOF
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
    // InternalDsl.g:2975:1: ruleLine returns [EObject current=null] : ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' ) ;
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
            // InternalDsl.g:2978:28: ( ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' ) )
            // InternalDsl.g:2979:1: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' )
            {
            // InternalDsl.g:2979:1: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' )
            // InternalDsl.g:2979:2: () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}'
            {
            // InternalDsl.g:2979:2: ()
            // InternalDsl.g:2980:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLineAccess().getLineAction_0(),
                        current);
                

            }

            // InternalDsl.g:2985:2: ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==48) ) {
                alt54=1;
            }
            else if ( (LA54_0==49) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalDsl.g:2985:3: ( (lv_horizontal_1_0= 'hline' ) )
                    {
                    // InternalDsl.g:2985:3: ( (lv_horizontal_1_0= 'hline' ) )
                    // InternalDsl.g:2986:1: (lv_horizontal_1_0= 'hline' )
                    {
                    // InternalDsl.g:2986:1: (lv_horizontal_1_0= 'hline' )
                    // InternalDsl.g:2987:3: lv_horizontal_1_0= 'hline'
                    {
                    lv_horizontal_1_0=(Token)match(input,48,FOLLOW_14); 

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
                    // InternalDsl.g:3001:6: ( (lv_vertical_2_0= 'vline' ) )
                    {
                    // InternalDsl.g:3001:6: ( (lv_vertical_2_0= 'vline' ) )
                    // InternalDsl.g:3002:1: (lv_vertical_2_0= 'vline' )
                    {
                    // InternalDsl.g:3002:1: (lv_vertical_2_0= 'vline' )
                    // InternalDsl.g:3003:3: lv_vertical_2_0= 'vline'
                    {
                    lv_vertical_2_0=(Token)match(input,49,FOLLOW_14); 

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

            // InternalDsl.g:3016:3: ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==21) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDsl.g:3016:4: ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalDsl.g:3016:4: ( (lv_styled_3_0= '+' ) )
                    // InternalDsl.g:3017:1: (lv_styled_3_0= '+' )
                    {
                    // InternalDsl.g:3017:1: (lv_styled_3_0= '+' )
                    // InternalDsl.g:3018:3: lv_styled_3_0= '+'
                    {
                    lv_styled_3_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_3_0, grammarAccess.getLineAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLineRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:3031:2: ( (otherlv_4= RULE_ID ) )
                    // InternalDsl.g:3032:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDsl.g:3032:1: (otherlv_4= RULE_ID )
                    // InternalDsl.g:3033:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLineRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_4, grammarAccess.getLineAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_41); 

                	newLeafNode(otherlv_5, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDsl.g:3048:1: ( (lv_features_6_0= ruleLineFeature ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=55 && LA56_0<=56)||LA56_0==59||LA56_0==63||LA56_0==79||LA56_0==81) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalDsl.g:3049:1: (lv_features_6_0= ruleLineFeature )
            	    {
            	    // InternalDsl.g:3049:1: (lv_features_6_0= ruleLineFeature )
            	    // InternalDsl.g:3050:3: lv_features_6_0= ruleLineFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLineAccess().getFeaturesLineFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_41);
            	    lv_features_6_0=ruleLineFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_6_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.LineFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:3078:1: entryRuleLineFeature returns [EObject current=null] : iv_ruleLineFeature= ruleLineFeature EOF ;
    public final EObject entryRuleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineFeature = null;


        try {
            // InternalDsl.g:3079:2: (iv_ruleLineFeature= ruleLineFeature EOF )
            // InternalDsl.g:3080:2: iv_ruleLineFeature= ruleLineFeature EOF
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
    // InternalDsl.g:3087:1: ruleLineFeature returns [EObject current=null] : (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) ;
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
            // InternalDsl.g:3090:28: ( (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible ) )
            // InternalDsl.g:3091:1: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            {
            // InternalDsl.g:3091:1: (this_LineWidth_0= ruleLineWidth | this_LineStyle_1= ruleLineStyle | this_Foreground_2= ruleForeground | this_Position_3= rulePosition | this_Size_4= ruleSize | this_Visible_5= ruleVisible )
            int alt57=6;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt57=1;
                }
                break;
            case 79:
                {
                alt57=2;
                }
                break;
            case 56:
                {
                alt57=3;
                }
                break;
            case 63:
                {
                alt57=4;
                }
                break;
            case 59:
                {
                alt57=5;
                }
                break;
            case 55:
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
                    // InternalDsl.g:3092:5: this_LineWidth_0= ruleLineWidth
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
                    // InternalDsl.g:3102:5: this_LineStyle_1= ruleLineStyle
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
                    // InternalDsl.g:3112:5: this_Foreground_2= ruleForeground
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
                    // InternalDsl.g:3122:5: this_Position_3= rulePosition
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
                    // InternalDsl.g:3132:5: this_Size_4= ruleSize
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
                    // InternalDsl.g:3142:5: this_Visible_5= ruleVisible
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
    // InternalDsl.g:3158:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalDsl.g:3159:2: (iv_ruleArrow= ruleArrow EOF )
            // InternalDsl.g:3160:2: iv_ruleArrow= ruleArrow EOF
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
    // InternalDsl.g:3167:1: ruleArrow returns [EObject current=null] : ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' ) ;
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
            // InternalDsl.g:3170:28: ( ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' ) )
            // InternalDsl.g:3171:1: ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' )
            {
            // InternalDsl.g:3171:1: ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' )
            // InternalDsl.g:3171:2: () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}'
            {
            // InternalDsl.g:3171:2: ()
            // InternalDsl.g:3172:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrowAccess().getArrowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getArrowAccess().getArrowKeyword_1());
                
            // InternalDsl.g:3181:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==21) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDsl.g:3181:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:3181:2: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:3182:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:3182:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:3183:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getArrowAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:3196:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:3197:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:3197:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:3198:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getArrowAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_41); 

                	newLeafNode(otherlv_4, grammarAccess.getArrowAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDsl.g:3213:1: ( (lv_features_5_0= ruleLineFeature ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=55 && LA59_0<=56)||LA59_0==59||LA59_0==63||LA59_0==79||LA59_0==81) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalDsl.g:3214:1: (lv_features_5_0= ruleLineFeature )
            	    {
            	    // InternalDsl.g:3214:1: (lv_features_5_0= ruleLineFeature )
            	    // InternalDsl.g:3215:3: lv_features_5_0= ruleLineFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrowAccess().getFeaturesLineFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_41);
            	    lv_features_5_0=ruleLineFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.LineFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:3243:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalDsl.g:3244:2: (iv_ruleContains= ruleContains EOF )
            // InternalDsl.g:3245:2: iv_ruleContains= ruleContains EOF
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
    // InternalDsl.g:3252:1: ruleContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:3255:28: ( (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalDsl.g:3256:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalDsl.g:3256:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalDsl.g:3256:3: otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
                
            // InternalDsl.g:3260:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:3261:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:3261:1: ( ruleQualifiedName )
            // InternalDsl.g:3262:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainsAccess().getModelReferenceEReferenceCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_35);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:3275:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==22) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDsl.g:3276:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:3276:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalDsl.g:3277:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainsAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainsRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:3305:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalDsl.g:3306:2: (iv_ruleValue= ruleValue EOF )
            // InternalDsl.g:3307:2: iv_ruleValue= ruleValue EOF
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
    // InternalDsl.g:3314:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_DoubleValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_EnumValue_4 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:3317:28: ( (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) )
            // InternalDsl.g:3318:1: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            {
            // InternalDsl.g:3318:1: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            int alt61=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==EOF||LA61_1==19) ) {
                    alt61=1;
                }
                else if ( (LA61_1==13) ) {
                    alt61=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 52:
                {
                alt61=3;
                }
                break;
            case 102:
            case 103:
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
                    // InternalDsl.g:3319:5: this_IntValue_0= ruleIntValue
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
                    // InternalDsl.g:3329:5: this_DoubleValue_1= ruleDoubleValue
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
                    // InternalDsl.g:3339:5: this_StringValue_2= ruleStringValue
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
                    // InternalDsl.g:3349:5: this_BooleanValue_3= ruleBooleanValue
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
                    // InternalDsl.g:3359:5: this_EnumValue_4= ruleEnumValue
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
    // InternalDsl.g:3375:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalDsl.g:3376:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalDsl.g:3377:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalDsl.g:3384:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalDsl.g:3387:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalDsl.g:3388:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalDsl.g:3388:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalDsl.g:3389:1: (lv_value_0_0= RULE_INT )
            {
            // InternalDsl.g:3389:1: (lv_value_0_0= RULE_INT )
            // InternalDsl.g:3390:3: lv_value_0_0= RULE_INT
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
    // InternalDsl.g:3414:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // InternalDsl.g:3415:2: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // InternalDsl.g:3416:2: iv_ruleDoubleValue= ruleDoubleValue EOF
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
    // InternalDsl.g:3423:1: ruleDoubleValue returns [EObject current=null] : ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueInt_0_0=null;
        Token otherlv_1=null;
        Token lv_valueDecimal_2_0=null;

         enterRule(); 
            
        try {
            // InternalDsl.g:3426:28: ( ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) )
            // InternalDsl.g:3427:1: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            {
            // InternalDsl.g:3427:1: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            // InternalDsl.g:3427:2: ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) )
            {
            // InternalDsl.g:3427:2: ( (lv_valueInt_0_0= RULE_INT ) )
            // InternalDsl.g:3428:1: (lv_valueInt_0_0= RULE_INT )
            {
            // InternalDsl.g:3428:1: (lv_valueInt_0_0= RULE_INT )
            // InternalDsl.g:3429:3: lv_valueInt_0_0= RULE_INT
            {
            lv_valueInt_0_0=(Token)match(input,RULE_INT,FOLLOW_42); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_30); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleValueAccess().getFullStopKeyword_1());
                
            // InternalDsl.g:3449:1: ( (lv_valueDecimal_2_0= RULE_INT ) )
            // InternalDsl.g:3450:1: (lv_valueDecimal_2_0= RULE_INT )
            {
            // InternalDsl.g:3450:1: (lv_valueDecimal_2_0= RULE_INT )
            // InternalDsl.g:3451:3: lv_valueDecimal_2_0= RULE_INT
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
    // InternalDsl.g:3475:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalDsl.g:3476:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalDsl.g:3477:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalDsl.g:3484:1: ruleStringValue returns [EObject current=null] : ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_null_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalDsl.g:3487:28: ( ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:3488:1: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:3488:1: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==52) ) {
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
                    // InternalDsl.g:3488:2: ( (lv_null_0_0= 'null' ) )
                    {
                    // InternalDsl.g:3488:2: ( (lv_null_0_0= 'null' ) )
                    // InternalDsl.g:3489:1: (lv_null_0_0= 'null' )
                    {
                    // InternalDsl.g:3489:1: (lv_null_0_0= 'null' )
                    // InternalDsl.g:3490:3: lv_null_0_0= 'null'
                    {
                    lv_null_0_0=(Token)match(input,52,FOLLOW_2); 

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
                    // InternalDsl.g:3504:6: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalDsl.g:3504:6: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalDsl.g:3505:1: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalDsl.g:3505:1: (lv_value_1_0= RULE_STRING )
                    // InternalDsl.g:3506:3: lv_value_1_0= RULE_STRING
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
    // InternalDsl.g:3530:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalDsl.g:3531:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalDsl.g:3532:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalDsl.g:3539:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteral ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:3542:28: ( ( (lv_value_0_0= ruleBooleanLiteral ) ) )
            // InternalDsl.g:3543:1: ( (lv_value_0_0= ruleBooleanLiteral ) )
            {
            // InternalDsl.g:3543:1: ( (lv_value_0_0= ruleBooleanLiteral ) )
            // InternalDsl.g:3544:1: (lv_value_0_0= ruleBooleanLiteral )
            {
            // InternalDsl.g:3544:1: (lv_value_0_0= ruleBooleanLiteral )
            // InternalDsl.g:3545:3: lv_value_0_0= ruleBooleanLiteral
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
                    		"org.eclipselabs.xdiagram.Dsl.BooleanLiteral");
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
    // InternalDsl.g:3569:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalDsl.g:3570:2: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalDsl.g:3571:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalDsl.g:3578:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalDsl.g:3581:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDsl.g:3582:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDsl.g:3582:1: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:3583:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:3583:1: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:3584:3: lv_name_0_0= RULE_ID
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
    // InternalDsl.g:3610:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalDsl.g:3611:2: (iv_ruleLabel= ruleLabel EOF )
            // InternalDsl.g:3612:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalDsl.g:3619:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalDsl.g:3622:28: ( ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalDsl.g:3623:1: ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:3623:1: ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalDsl.g:3623:2: () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalDsl.g:3623:2: ()
            // InternalDsl.g:3624:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLabelAccess().getLabelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
                
            // InternalDsl.g:3633:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==21) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDsl.g:3633:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:3633:2: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:3634:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:3634:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:3635:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getLabelAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:3648:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:3649:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:3649:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:3650:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_39); 

                	newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDsl.g:3665:1: ( (lv_features_5_0= ruleLabelFeature ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=55 && LA64_0<=56)||LA64_0==59||LA64_0==63||LA64_0==69||LA64_0==71||LA64_0==78) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalDsl.g:3666:1: (lv_features_5_0= ruleLabelFeature )
            	    {
            	    // InternalDsl.g:3666:1: (lv_features_5_0= ruleLabelFeature )
            	    // InternalDsl.g:3667:3: lv_features_5_0= ruleLabelFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelAccess().getFeaturesLabelFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_features_5_0=ruleLabelFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.LabelFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalDsl.g:3683:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==39) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalDsl.g:3683:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_32); 

            	        	newLeafNode(otherlv_6, grammarAccess.getLabelAccess().getChildKeyword_5_0());
            	        
            	    // InternalDsl.g:3687:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalDsl.g:3688:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalDsl.g:3688:1: (lv_children_7_0= ruleChildElement )
            	    // InternalDsl.g:3689:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:3717:1: entryRuleLabelFeature returns [EObject current=null] : iv_ruleLabelFeature= ruleLabelFeature EOF ;
    public final EObject entryRuleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelFeature = null;


        try {
            // InternalDsl.g:3718:2: (iv_ruleLabelFeature= ruleLabelFeature EOF )
            // InternalDsl.g:3719:2: iv_ruleLabelFeature= ruleLabelFeature EOF
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
    // InternalDsl.g:3726:1: ruleLabelFeature returns [EObject current=null] : (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) ;
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
            // InternalDsl.g:3729:28: ( (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) )
            // InternalDsl.g:3730:1: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            {
            // InternalDsl.g:3730:1: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            int alt66=7;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt66=1;
                }
                break;
            case 56:
                {
                alt66=2;
                }
                break;
            case 71:
                {
                alt66=3;
                }
                break;
            case 59:
                {
                alt66=4;
                }
                break;
            case 63:
                {
                alt66=5;
                }
                break;
            case 55:
                {
                alt66=6;
                }
                break;
            case 78:
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
                    // InternalDsl.g:3731:5: this_TextValue_0= ruleTextValue
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
                    // InternalDsl.g:3741:5: this_Foreground_1= ruleForeground
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
                    // InternalDsl.g:3751:5: this_FontProperties_2= ruleFontProperties
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
                    // InternalDsl.g:3761:5: this_Size_3= ruleSize
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
                    // InternalDsl.g:3771:5: this_Position_4= rulePosition
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
                    // InternalDsl.g:3781:5: this_Visible_5= ruleVisible
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
                    // InternalDsl.g:3791:5: this_TextAlign_6= ruleTextAlign
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
    // InternalDsl.g:3807:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalDsl.g:3808:2: (iv_ruleImage= ruleImage EOF )
            // InternalDsl.g:3809:2: iv_ruleImage= ruleImage EOF
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
    // InternalDsl.g:3816:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalDsl.g:3819:28: ( (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalDsl.g:3820:1: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:3820:1: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalDsl.g:3820:3: otherlv_0= 'image' ( (lv_imageId_1_0= RULE_STRING ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // InternalDsl.g:3824:1: ( (lv_imageId_1_0= RULE_STRING ) )
            // InternalDsl.g:3825:1: (lv_imageId_1_0= RULE_STRING )
            {
            // InternalDsl.g:3825:1: (lv_imageId_1_0= RULE_STRING )
            // InternalDsl.g:3826:3: lv_imageId_1_0= RULE_STRING
            {
            lv_imageId_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            // InternalDsl.g:3842:2: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==21) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDsl.g:3842:3: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:3842:3: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:3843:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:3843:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:3844:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getImageAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:3857:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:3858:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:3858:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:3859:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getImageAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_43); 

                	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDsl.g:3874:1: ( (lv_features_5_0= ruleImageFeature ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=58 && LA68_0<=59)||LA68_0==63) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalDsl.g:3875:1: (lv_features_5_0= ruleImageFeature )
            	    {
            	    // InternalDsl.g:3875:1: (lv_features_5_0= ruleImageFeature )
            	    // InternalDsl.g:3876:3: lv_features_5_0= ruleImageFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getFeaturesImageFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_43);
            	    lv_features_5_0=ruleImageFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ImageFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // InternalDsl.g:3892:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==39) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalDsl.g:3892:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_32); 

            	        	newLeafNode(otherlv_6, grammarAccess.getImageAccess().getChildKeyword_5_0());
            	        
            	    // InternalDsl.g:3896:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalDsl.g:3897:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalDsl.g:3897:1: (lv_children_7_0= ruleChildElement )
            	    // InternalDsl.g:3898:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:3926:1: entryRuleImageFeature returns [EObject current=null] : iv_ruleImageFeature= ruleImageFeature EOF ;
    public final EObject entryRuleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFeature = null;


        try {
            // InternalDsl.g:3927:2: (iv_ruleImageFeature= ruleImageFeature EOF )
            // InternalDsl.g:3928:2: iv_ruleImageFeature= ruleImageFeature EOF
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
    // InternalDsl.g:3935:1: ruleImageFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) ;
    public final EObject ruleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Transparency_2 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:3938:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) )
            // InternalDsl.g:3939:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            {
            // InternalDsl.g:3939:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt70=1;
                }
                break;
            case 63:
                {
                alt70=2;
                }
                break;
            case 58:
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
                    // InternalDsl.g:3940:5: this_Size_0= ruleSize
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
                    // InternalDsl.g:3950:5: this_Position_1= rulePosition
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
                    // InternalDsl.g:3960:5: this_Transparency_2= ruleTransparency
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
    // InternalDsl.g:3976:1: entryRuleInvisible returns [EObject current=null] : iv_ruleInvisible= ruleInvisible EOF ;
    public final EObject entryRuleInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisible = null;


        try {
            // InternalDsl.g:3977:2: (iv_ruleInvisible= ruleInvisible EOF )
            // InternalDsl.g:3978:2: iv_ruleInvisible= ruleInvisible EOF
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
    // InternalDsl.g:3985:1: ruleInvisible returns [EObject current=null] : ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // InternalDsl.g:3988:28: ( ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // InternalDsl.g:3989:1: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:3989:1: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // InternalDsl.g:3989:2: () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // InternalDsl.g:3989:2: ()
            // InternalDsl.g:3990:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInvisibleAccess().getInvisibleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getInvisibleAccess().getInvisibleKeyword_1());
                
            // InternalDsl.g:3999:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==21) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDsl.g:3999:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDsl.g:3999:2: ( (lv_styled_2_0= '+' ) )
                    // InternalDsl.g:4000:1: (lv_styled_2_0= '+' )
                    {
                    // InternalDsl.g:4000:1: (lv_styled_2_0= '+' )
                    // InternalDsl.g:4001:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_7); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getInvisibleAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvisibleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // InternalDsl.g:4014:2: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:4015:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:4015:1: (otherlv_3= RULE_ID )
                    // InternalDsl.g:4016:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvisibleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_3, grammarAccess.getInvisibleAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_44); 

                	newLeafNode(otherlv_4, grammarAccess.getInvisibleAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDsl.g:4031:1: ( (lv_features_5_0= ruleInvisibleFeature ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==34||LA72_0==51||LA72_0==59||LA72_0==63||LA72_0==65) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalDsl.g:4032:1: (lv_features_5_0= ruleInvisibleFeature )
            	    {
            	    // InternalDsl.g:4032:1: (lv_features_5_0= ruleInvisibleFeature )
            	    // InternalDsl.g:4033:3: lv_features_5_0= ruleInvisibleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvisibleAccess().getFeaturesInvisibleFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_44);
            	    lv_features_5_0=ruleInvisibleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvisibleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.InvisibleFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            // InternalDsl.g:4049:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==39) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalDsl.g:4049:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_32); 

            	        	newLeafNode(otherlv_6, grammarAccess.getInvisibleAccess().getChildKeyword_5_0());
            	        
            	    // InternalDsl.g:4053:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // InternalDsl.g:4054:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // InternalDsl.g:4054:1: (lv_children_7_0= ruleChildElement )
            	    // InternalDsl.g:4055:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvisibleAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvisibleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDsl.g:4083:1: entryRuleInvisibleFeature returns [EObject current=null] : iv_ruleInvisibleFeature= ruleInvisibleFeature EOF ;
    public final EObject entryRuleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisibleFeature = null;


        try {
            // InternalDsl.g:4084:2: (iv_ruleInvisibleFeature= ruleInvisibleFeature EOF )
            // InternalDsl.g:4085:2: iv_ruleInvisibleFeature= ruleInvisibleFeature EOF
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
    // InternalDsl.g:4092:1: ruleInvisibleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) ;
    public final EObject ruleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_LinkedFeature_2 = null;

        EObject this_Layout_3 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:4095:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) )
            // InternalDsl.g:4096:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            {
            // InternalDsl.g:4096:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt74=1;
                }
                break;
            case 63:
                {
                alt74=2;
                }
                break;
            case 34:
            case 51:
                {
                alt74=3;
                }
                break;
            case 65:
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
                    // InternalDsl.g:4097:5: this_Size_0= ruleSize
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
                    // InternalDsl.g:4107:5: this_Position_1= rulePosition
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
                    // InternalDsl.g:4117:5: this_LinkedFeature_2= ruleLinkedFeature
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
                    // InternalDsl.g:4127:5: this_Layout_3= ruleLayout
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
    // InternalDsl.g:4143:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // InternalDsl.g:4144:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // InternalDsl.g:4145:2: iv_ruleColorFeature= ruleColorFeature EOF
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
    // InternalDsl.g:4152:1: ruleColorFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_Background_1 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:4155:28: ( (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) )
            // InternalDsl.g:4156:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            {
            // InternalDsl.g:4156:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==56) ) {
                alt75=1;
            }
            else if ( (LA75_0==57) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalDsl.g:4157:5: this_Foreground_0= ruleForeground
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
                    // InternalDsl.g:4167:5: this_Background_1= ruleBackground
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
    // InternalDsl.g:4183:1: entryRuleForeground returns [EObject current=null] : iv_ruleForeground= ruleForeground EOF ;
    public final EObject entryRuleForeground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeground = null;


        try {
            // InternalDsl.g:4184:2: (iv_ruleForeground= ruleForeground EOF )
            // InternalDsl.g:4185:2: iv_ruleForeground= ruleForeground EOF
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
    // InternalDsl.g:4192:1: ruleForeground returns [EObject current=null] : ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleForeground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:4195:28: ( ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalDsl.g:4196:1: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalDsl.g:4196:1: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalDsl.g:4196:2: ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalDsl.g:4196:2: ( (lv_type_0_0= 'foreground' ) )
            // InternalDsl.g:4197:1: (lv_type_0_0= 'foreground' )
            {
            // InternalDsl.g:4197:1: (lv_type_0_0= 'foreground' )
            // InternalDsl.g:4198:3: lv_type_0_0= 'foreground'
            {
            lv_type_0_0=(Token)match(input,56,FOLLOW_45); 

                    newLeafNode(lv_type_0_0, grammarAccess.getForegroundAccess().getTypeForegroundKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForegroundRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "foreground");
            	    

            }


            }

            // InternalDsl.g:4211:2: ( (lv_color_1_0= ruleColor ) )
            // InternalDsl.g:4212:1: (lv_color_1_0= ruleColor )
            {
            // InternalDsl.g:4212:1: (lv_color_1_0= ruleColor )
            // InternalDsl.g:4213:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getForegroundAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_35);
            lv_color_1_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForegroundRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_1_0, 
                    		"org.eclipselabs.xdiagram.Dsl.Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:4229:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==22) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDsl.g:4230:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:4230:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalDsl.g:4231:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getForegroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForegroundRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:4259:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalDsl.g:4260:2: (iv_ruleBackground= ruleBackground EOF )
            // InternalDsl.g:4261:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalDsl.g:4268:1: ruleBackground returns [EObject current=null] : ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:4271:28: ( ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalDsl.g:4272:1: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalDsl.g:4272:1: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalDsl.g:4272:2: ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // InternalDsl.g:4272:2: ( (lv_type_0_0= 'background' ) )
            // InternalDsl.g:4273:1: (lv_type_0_0= 'background' )
            {
            // InternalDsl.g:4273:1: (lv_type_0_0= 'background' )
            // InternalDsl.g:4274:3: lv_type_0_0= 'background'
            {
            lv_type_0_0=(Token)match(input,57,FOLLOW_45); 

                    newLeafNode(lv_type_0_0, grammarAccess.getBackgroundAccess().getTypeBackgroundKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBackgroundRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "background");
            	    

            }


            }

            // InternalDsl.g:4287:2: ( (lv_color_1_0= ruleColor ) )
            // InternalDsl.g:4288:1: (lv_color_1_0= ruleColor )
            {
            // InternalDsl.g:4288:1: (lv_color_1_0= ruleColor )
            // InternalDsl.g:4289:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getBackgroundAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_35);
            lv_color_1_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_1_0, 
                    		"org.eclipselabs.xdiagram.Dsl.Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:4305:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==22) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDsl.g:4306:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:4306:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalDsl.g:4307:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getBackgroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:4335:1: entryRuleTransparency returns [EObject current=null] : iv_ruleTransparency= ruleTransparency EOF ;
    public final EObject entryRuleTransparency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransparency = null;


        try {
            // InternalDsl.g:4336:2: (iv_ruleTransparency= ruleTransparency EOF )
            // InternalDsl.g:4337:2: iv_ruleTransparency= ruleTransparency EOF
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
    // InternalDsl.g:4344:1: ruleTransparency returns [EObject current=null] : (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTransparency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_percent_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:4347:28: ( (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalDsl.g:4348:1: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalDsl.g:4348:1: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalDsl.g:4348:3: otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_30); 

                	newLeafNode(otherlv_0, grammarAccess.getTransparencyAccess().getTransparencyKeyword_0());
                
            // InternalDsl.g:4352:1: ( (lv_percent_1_0= RULE_INT ) )
            // InternalDsl.g:4353:1: (lv_percent_1_0= RULE_INT )
            {
            // InternalDsl.g:4353:1: (lv_percent_1_0= RULE_INT )
            // InternalDsl.g:4354:3: lv_percent_1_0= RULE_INT
            {
            lv_percent_1_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_35); 

                	newLeafNode(otherlv_2, grammarAccess.getTransparencyAccess().getPercentSignKeyword_2());
                
            // InternalDsl.g:4374:1: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==22) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalDsl.g:4375:1: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:4375:1: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalDsl.g:4376:3: lv_conditional_3_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransparencyAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransparencyRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_3_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:4404:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalDsl.g:4405:2: (iv_ruleSize= ruleSize EOF )
            // InternalDsl.g:4406:2: iv_ruleSize= ruleSize EOF
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
    // InternalDsl.g:4413:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) ;
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
            // InternalDsl.g:4416:28: ( (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) )
            // InternalDsl.g:4417:1: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            {
            // InternalDsl.g:4417:1: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            // InternalDsl.g:4417:3: otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_30); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
                
            // InternalDsl.g:4421:1: ( (lv_width_1_0= RULE_INT ) )
            // InternalDsl.g:4422:1: (lv_width_1_0= RULE_INT )
            {
            // InternalDsl.g:4422:1: (lv_width_1_0= RULE_INT )
            // InternalDsl.g:4423:3: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_46); 

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

            // InternalDsl.g:4439:2: ( (lv_widthRelative_2_0= ']' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==60) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDsl.g:4440:1: (lv_widthRelative_2_0= ']' )
                    {
                    // InternalDsl.g:4440:1: (lv_widthRelative_2_0= ']' )
                    // InternalDsl.g:4441:3: lv_widthRelative_2_0= ']'
                    {
                    lv_widthRelative_2_0=(Token)match(input,60,FOLLOW_47); 

                            newLeafNode(lv_widthRelative_2_0, grammarAccess.getSizeAccess().getWidthRelativeRightSquareBracketKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSizeRule());
                    	        }
                           		setWithLastConsumed(current, "widthRelative", true, "]");
                    	    

                    }


                    }
                    break;

            }

            // InternalDsl.g:4454:3: ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_INT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalDsl.g:4454:4: ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )?
                    {
                    // InternalDsl.g:4454:4: ( (lv_height_3_0= RULE_INT ) )
                    // InternalDsl.g:4455:1: (lv_height_3_0= RULE_INT )
                    {
                    // InternalDsl.g:4455:1: (lv_height_3_0= RULE_INT )
                    // InternalDsl.g:4456:3: lv_height_3_0= RULE_INT
                    {
                    lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_48); 

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

                    // InternalDsl.g:4472:2: ( (lv_heightRelative_4_0= ']' ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==60) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalDsl.g:4473:1: (lv_heightRelative_4_0= ']' )
                            {
                            // InternalDsl.g:4473:1: (lv_heightRelative_4_0= ']' )
                            // InternalDsl.g:4474:3: lv_heightRelative_4_0= ']'
                            {
                            lv_heightRelative_4_0=(Token)match(input,60,FOLLOW_49); 

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

            // InternalDsl.g:4487:5: ( (lv_resizable_5_0= 'resizable' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==61) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDsl.g:4488:1: (lv_resizable_5_0= 'resizable' )
                    {
                    // InternalDsl.g:4488:1: (lv_resizable_5_0= 'resizable' )
                    // InternalDsl.g:4489:3: lv_resizable_5_0= 'resizable'
                    {
                    lv_resizable_5_0=(Token)match(input,61,FOLLOW_35); 

                            newLeafNode(lv_resizable_5_0, grammarAccess.getSizeAccess().getResizableResizableKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSizeRule());
                    	        }
                           		setWithLastConsumed(current, "resizable", true, "resizable");
                    	    

                    }


                    }
                    break;

            }

            // InternalDsl.g:4502:3: ( (lv_conditional_6_0= ruleFeatureConditional ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==22) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalDsl.g:4503:1: (lv_conditional_6_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:4503:1: (lv_conditional_6_0= ruleFeatureConditional )
                    // InternalDsl.g:4504:3: lv_conditional_6_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getSizeAccess().getConditionalFeatureConditionalParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_6_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSizeRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_6_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:4532:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalDsl.g:4533:2: (iv_rulePoint= rulePoint EOF )
            // InternalDsl.g:4534:2: iv_rulePoint= rulePoint EOF
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
    // InternalDsl.g:4541:1: rulePoint returns [EObject current=null] : (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:4544:28: ( (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalDsl.g:4545:1: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalDsl.g:4545:1: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalDsl.g:4545:3: otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_30); 

                	newLeafNode(otherlv_0, grammarAccess.getPointAccess().getPointKeyword_0());
                
            // InternalDsl.g:4549:1: ( (lv_x_1_0= RULE_INT ) )
            // InternalDsl.g:4550:1: (lv_x_1_0= RULE_INT )
            {
            // InternalDsl.g:4550:1: (lv_x_1_0= RULE_INT )
            // InternalDsl.g:4551:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_30); 

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

            // InternalDsl.g:4567:2: ( (lv_y_2_0= RULE_INT ) )
            // InternalDsl.g:4568:1: (lv_y_2_0= RULE_INT )
            {
            // InternalDsl.g:4568:1: (lv_y_2_0= RULE_INT )
            // InternalDsl.g:4569:3: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            // InternalDsl.g:4585:2: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==22) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDsl.g:4586:1: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:4586:1: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalDsl.g:4587:3: lv_conditional_3_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getPointAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPointRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_3_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:4615:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalDsl.g:4616:2: (iv_rulePosition= rulePosition EOF )
            // InternalDsl.g:4617:2: iv_rulePosition= rulePosition EOF
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
    // InternalDsl.g:4624:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalDsl.g:4627:28: ( (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalDsl.g:4628:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalDsl.g:4628:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalDsl.g:4628:3: otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_30); 

                	newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
                
            // InternalDsl.g:4632:1: ( (lv_x_1_0= RULE_INT ) )
            // InternalDsl.g:4633:1: (lv_x_1_0= RULE_INT )
            {
            // InternalDsl.g:4633:1: (lv_x_1_0= RULE_INT )
            // InternalDsl.g:4634:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_50); 

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

            // InternalDsl.g:4650:2: ( (lv_xRelative_2_0= '%' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==33) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalDsl.g:4651:1: (lv_xRelative_2_0= '%' )
                    {
                    // InternalDsl.g:4651:1: (lv_xRelative_2_0= '%' )
                    // InternalDsl.g:4652:3: lv_xRelative_2_0= '%'
                    {
                    lv_xRelative_2_0=(Token)match(input,33,FOLLOW_30); 

                            newLeafNode(lv_xRelative_2_0, grammarAccess.getPositionAccess().getXRelativePercentSignKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPositionRule());
                    	        }
                           		setWithLastConsumed(current, "xRelative", true, "%");
                    	    

                    }


                    }
                    break;

            }

            // InternalDsl.g:4665:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalDsl.g:4666:1: (lv_y_3_0= RULE_INT )
            {
            // InternalDsl.g:4666:1: (lv_y_3_0= RULE_INT )
            // InternalDsl.g:4667:3: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_51); 

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

            // InternalDsl.g:4683:2: ( (lv_yRelative_4_0= '%' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==33) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalDsl.g:4684:1: (lv_yRelative_4_0= '%' )
                    {
                    // InternalDsl.g:4684:1: (lv_yRelative_4_0= '%' )
                    // InternalDsl.g:4685:3: lv_yRelative_4_0= '%'
                    {
                    lv_yRelative_4_0=(Token)match(input,33,FOLLOW_35); 

                            newLeafNode(lv_yRelative_4_0, grammarAccess.getPositionAccess().getYRelativePercentSignKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPositionRule());
                    	        }
                           		setWithLastConsumed(current, "yRelative", true, "%");
                    	    

                    }


                    }
                    break;

            }

            // InternalDsl.g:4698:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==22) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalDsl.g:4699:1: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:4699:1: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalDsl.g:4700:3: lv_conditional_5_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getPositionAccess().getConditionalFeatureConditionalParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_5_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPositionRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_5_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:4728:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // InternalDsl.g:4729:2: (iv_ruleCorner= ruleCorner EOF )
            // InternalDsl.g:4730:2: iv_ruleCorner= ruleCorner EOF
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
    // InternalDsl.g:4737:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:4740:28: ( (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalDsl.g:4741:1: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalDsl.g:4741:1: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalDsl.g:4741:3: otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_30); 

                	newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
                
            // InternalDsl.g:4745:1: ( (lv_angle_1_0= RULE_INT ) )
            // InternalDsl.g:4746:1: (lv_angle_1_0= RULE_INT )
            {
            // InternalDsl.g:4746:1: (lv_angle_1_0= RULE_INT )
            // InternalDsl.g:4747:3: lv_angle_1_0= RULE_INT
            {
            lv_angle_1_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            // InternalDsl.g:4763:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==22) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalDsl.g:4764:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:4764:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalDsl.g:4765:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getCornerAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCornerRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:4793:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalDsl.g:4794:2: (iv_ruleLayout= ruleLayout EOF )
            // InternalDsl.g:4795:2: iv_ruleLayout= ruleLayout EOF
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
    // InternalDsl.g:4802:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // InternalDsl.g:4805:28: ( (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // InternalDsl.g:4806:1: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // InternalDsl.g:4806:1: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // InternalDsl.g:4806:3: otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_52); 

                	newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
                
            // InternalDsl.g:4810:1: ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==66) ) {
                alt89=1;
            }
            else if ( (LA89_0==67) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalDsl.g:4810:2: ( (lv_vertical_1_0= 'vertical' ) )
                    {
                    // InternalDsl.g:4810:2: ( (lv_vertical_1_0= 'vertical' ) )
                    // InternalDsl.g:4811:1: (lv_vertical_1_0= 'vertical' )
                    {
                    // InternalDsl.g:4811:1: (lv_vertical_1_0= 'vertical' )
                    // InternalDsl.g:4812:3: lv_vertical_1_0= 'vertical'
                    {
                    lv_vertical_1_0=(Token)match(input,66,FOLLOW_53); 

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
                    // InternalDsl.g:4826:6: ( (lv_horizontal_2_0= 'horizontal' ) )
                    {
                    // InternalDsl.g:4826:6: ( (lv_horizontal_2_0= 'horizontal' ) )
                    // InternalDsl.g:4827:1: (lv_horizontal_2_0= 'horizontal' )
                    {
                    // InternalDsl.g:4827:1: (lv_horizontal_2_0= 'horizontal' )
                    // InternalDsl.g:4828:3: lv_horizontal_2_0= 'horizontal'
                    {
                    lv_horizontal_2_0=(Token)match(input,67,FOLLOW_53); 

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

            // InternalDsl.g:4841:3: (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==68) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalDsl.g:4841:5: otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_30); 

                        	newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getMarginKeyword_2_0());
                        
                    // InternalDsl.g:4845:1: ( (lv_margin_4_0= RULE_INT ) )
                    // InternalDsl.g:4846:1: (lv_margin_4_0= RULE_INT )
                    {
                    // InternalDsl.g:4846:1: (lv_margin_4_0= RULE_INT )
                    // InternalDsl.g:4847:3: lv_margin_4_0= RULE_INT
                    {
                    lv_margin_4_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            // InternalDsl.g:4863:4: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==22) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalDsl.g:4864:1: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:4864:1: (lv_conditional_5_0= ruleFeatureConditional )
                    // InternalDsl.g:4865:3: lv_conditional_5_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_5_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_5_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:4893:1: entryRuleVisible returns [EObject current=null] : iv_ruleVisible= ruleVisible EOF ;
    public final EObject entryRuleVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisible = null;


        try {
            // InternalDsl.g:4894:2: (iv_ruleVisible= ruleVisible EOF )
            // InternalDsl.g:4895:2: iv_ruleVisible= ruleVisible EOF
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
    // InternalDsl.g:4902:1: ruleVisible returns [EObject current=null] : (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) ;
    public final EObject ruleVisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_conditional_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:4905:28: ( (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) )
            // InternalDsl.g:4906:1: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            {
            // InternalDsl.g:4906:1: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            // InternalDsl.g:4906:3: otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_54); 

                	newLeafNode(otherlv_0, grammarAccess.getVisibleAccess().getInvisibleKeyword_0());
                
            // InternalDsl.g:4910:1: ( (lv_conditional_1_0= ruleFeatureConditional ) )
            // InternalDsl.g:4911:1: (lv_conditional_1_0= ruleFeatureConditional )
            {
            // InternalDsl.g:4911:1: (lv_conditional_1_0= ruleFeatureConditional )
            // InternalDsl.g:4912:3: lv_conditional_1_0= ruleFeatureConditional
            {
             
            	        newCompositeNode(grammarAccess.getVisibleAccess().getConditionalFeatureConditionalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_13);
            lv_conditional_1_0=ruleFeatureConditional();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVisibleRule());
            	        }
                   		set(
                   			current, 
                   			"conditional",
                    		lv_conditional_1_0, 
                    		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:4940:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalDsl.g:4941:2: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalDsl.g:4942:2: iv_ruleTextValue= ruleTextValue EOF
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
    // InternalDsl.g:4949:1: ruleTextValue returns [EObject current=null] : ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_parts_2_0 = null;

        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:4952:28: ( ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // InternalDsl.g:4953:1: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // InternalDsl.g:4953:1: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // InternalDsl.g:4953:2: () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            // InternalDsl.g:4953:2: ()
            // InternalDsl.g:4954:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextValueAccess().getTextValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,69,FOLLOW_55); 

                	newLeafNode(otherlv_1, grammarAccess.getTextValueAccess().getTextKeyword_1());
                
            // InternalDsl.g:4963:1: ( (lv_parts_2_0= ruleTextPart ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=RULE_STRING && LA92_0<=RULE_ID)||LA92_0==70) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalDsl.g:4964:1: (lv_parts_2_0= ruleTextPart )
            	    {
            	    // InternalDsl.g:4964:1: (lv_parts_2_0= ruleTextPart )
            	    // InternalDsl.g:4965:3: lv_parts_2_0= ruleTextPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextValueAccess().getPartsTextPartParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_55);
            	    lv_parts_2_0=ruleTextPart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parts",
            	            		lv_parts_2_0, 
            	            		"org.eclipselabs.xdiagram.Dsl.TextPart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            // InternalDsl.g:4981:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==22) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalDsl.g:4982:1: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:4982:1: (lv_conditional_3_0= ruleFeatureConditional )
                    // InternalDsl.g:4983:3: lv_conditional_3_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextValueAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextValueRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_3_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:5011:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // InternalDsl.g:5012:2: (iv_ruleTextPart= ruleTextPart EOF )
            // InternalDsl.g:5013:2: iv_ruleTextPart= ruleTextPart EOF
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
    // InternalDsl.g:5020:1: ruleTextPart returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_editable_1_0=null;

         enterRule(); 
            
        try {
            // InternalDsl.g:5023:28: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) )
            // InternalDsl.g:5024:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            {
            // InternalDsl.g:5024:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_STRING) ) {
                alt95=1;
            }
            else if ( (LA95_0==RULE_ID||LA95_0==70) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalDsl.g:5024:2: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // InternalDsl.g:5024:2: ( (lv_text_0_0= RULE_STRING ) )
                    // InternalDsl.g:5025:1: (lv_text_0_0= RULE_STRING )
                    {
                    // InternalDsl.g:5025:1: (lv_text_0_0= RULE_STRING )
                    // InternalDsl.g:5026:3: lv_text_0_0= RULE_STRING
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
                    // InternalDsl.g:5043:6: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    {
                    // InternalDsl.g:5043:6: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    // InternalDsl.g:5043:7: ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) )
                    {
                    // InternalDsl.g:5043:7: ( (lv_editable_1_0= 'edit:' ) )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==70) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // InternalDsl.g:5044:1: (lv_editable_1_0= 'edit:' )
                            {
                            // InternalDsl.g:5044:1: (lv_editable_1_0= 'edit:' )
                            // InternalDsl.g:5045:3: lv_editable_1_0= 'edit:'
                            {
                            lv_editable_1_0=(Token)match(input,70,FOLLOW_7); 

                                    newLeafNode(lv_editable_1_0, grammarAccess.getTextPartAccess().getEditableEditKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTextPartRule());
                            	        }
                                   		setWithLastConsumed(current, "editable", true, "edit:");
                            	    

                            }


                            }
                            break;

                    }

                    // InternalDsl.g:5058:3: ( ( ruleQualifiedName ) )
                    // InternalDsl.g:5059:1: ( ruleQualifiedName )
                    {
                    // InternalDsl.g:5059:1: ( ruleQualifiedName )
                    // InternalDsl.g:5060:3: ruleQualifiedName
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
    // InternalDsl.g:5081:1: entryRuleFontProperties returns [EObject current=null] : iv_ruleFontProperties= ruleFontProperties EOF ;
    public final EObject entryRuleFontProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontProperties = null;


        try {
            // InternalDsl.g:5082:2: (iv_ruleFontProperties= ruleFontProperties EOF )
            // InternalDsl.g:5083:2: iv_ruleFontProperties= ruleFontProperties EOF
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
    // InternalDsl.g:5090:1: ruleFontProperties returns [EObject current=null] : ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) ;
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
            // InternalDsl.g:5093:28: ( ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) )
            // InternalDsl.g:5094:1: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            {
            // InternalDsl.g:5094:1: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            // InternalDsl.g:5094:2: () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';'
            {
            // InternalDsl.g:5094:2: ()
            // InternalDsl.g:5095:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFontPropertiesAccess().getFontPropertiesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FOLLOW_56); 

                	newLeafNode(otherlv_1, grammarAccess.getFontPropertiesAccess().getFontKeyword_1());
                
            // InternalDsl.g:5104:1: ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )?
            int alt96=5;
            switch ( input.LA(1) ) {
                case 72:
                    {
                    alt96=1;
                    }
                    break;
                case 73:
                    {
                    alt96=2;
                    }
                    break;
                case 74:
                    {
                    alt96=3;
                    }
                    break;
                case 75:
                    {
                    alt96=4;
                    }
                    break;
            }

            switch (alt96) {
                case 1 :
                    // InternalDsl.g:5104:2: ( (lv_face_2_0= 'arial' ) )
                    {
                    // InternalDsl.g:5104:2: ( (lv_face_2_0= 'arial' ) )
                    // InternalDsl.g:5105:1: (lv_face_2_0= 'arial' )
                    {
                    // InternalDsl.g:5105:1: (lv_face_2_0= 'arial' )
                    // InternalDsl.g:5106:3: lv_face_2_0= 'arial'
                    {
                    lv_face_2_0=(Token)match(input,72,FOLLOW_57); 

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
                    // InternalDsl.g:5120:7: otherlv_3= 'verdana'
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_57); 

                        	newLeafNode(otherlv_3, grammarAccess.getFontPropertiesAccess().getVerdanaKeyword_2_1());
                        

                    }
                    break;
                case 3 :
                    // InternalDsl.g:5125:7: otherlv_4= 'courier'
                    {
                    otherlv_4=(Token)match(input,74,FOLLOW_57); 

                        	newLeafNode(otherlv_4, grammarAccess.getFontPropertiesAccess().getCourierKeyword_2_2());
                        

                    }
                    break;
                case 4 :
                    // InternalDsl.g:5130:7: otherlv_5= 'times'
                    {
                    otherlv_5=(Token)match(input,75,FOLLOW_57); 

                        	newLeafNode(otherlv_5, grammarAccess.getFontPropertiesAccess().getTimesKeyword_2_3());
                        

                    }
                    break;

            }

            // InternalDsl.g:5134:3: ( (lv_size_6_0= RULE_INT ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_INT) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalDsl.g:5135:1: (lv_size_6_0= RULE_INT )
                    {
                    // InternalDsl.g:5135:1: (lv_size_6_0= RULE_INT )
                    // InternalDsl.g:5136:3: lv_size_6_0= RULE_INT
                    {
                    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_58); 

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

            // InternalDsl.g:5152:3: ( (lv_bold_7_0= 'bold' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==76) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalDsl.g:5153:1: (lv_bold_7_0= 'bold' )
                    {
                    // InternalDsl.g:5153:1: (lv_bold_7_0= 'bold' )
                    // InternalDsl.g:5154:3: lv_bold_7_0= 'bold'
                    {
                    lv_bold_7_0=(Token)match(input,76,FOLLOW_59); 

                            newLeafNode(lv_bold_7_0, grammarAccess.getFontPropertiesAccess().getBoldBoldKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFontPropertiesRule());
                    	        }
                           		setWithLastConsumed(current, "bold", true, "bold");
                    	    

                    }


                    }
                    break;

            }

            // InternalDsl.g:5167:3: ( (lv_italics_8_0= 'italics' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==77) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalDsl.g:5168:1: (lv_italics_8_0= 'italics' )
                    {
                    // InternalDsl.g:5168:1: (lv_italics_8_0= 'italics' )
                    // InternalDsl.g:5169:3: lv_italics_8_0= 'italics'
                    {
                    lv_italics_8_0=(Token)match(input,77,FOLLOW_35); 

                            newLeafNode(lv_italics_8_0, grammarAccess.getFontPropertiesAccess().getItalicsItalicsKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFontPropertiesRule());
                    	        }
                           		setWithLastConsumed(current, "italics", true, "italics");
                    	    

                    }


                    }
                    break;

            }

            // InternalDsl.g:5182:3: ( (lv_conditional_9_0= ruleFeatureConditional ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==22) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalDsl.g:5183:1: (lv_conditional_9_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:5183:1: (lv_conditional_9_0= ruleFeatureConditional )
                    // InternalDsl.g:5184:3: lv_conditional_9_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getFontPropertiesAccess().getConditionalFeatureConditionalParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_9_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFontPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_9_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:5212:1: entryRuleTextAlign returns [EObject current=null] : iv_ruleTextAlign= ruleTextAlign EOF ;
    public final EObject entryRuleTextAlign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAlign = null;


        try {
            // InternalDsl.g:5213:2: (iv_ruleTextAlign= ruleTextAlign EOF )
            // InternalDsl.g:5214:2: iv_ruleTextAlign= ruleTextAlign EOF
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
    // InternalDsl.g:5221:1: ruleTextAlign returns [EObject current=null] : (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleTextAlign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_value_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:5224:28: ( (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalDsl.g:5225:1: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalDsl.g:5225:1: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalDsl.g:5225:3: otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_60); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAlignAccess().getAlignKeyword_0());
                
            // InternalDsl.g:5229:1: ( (lv_value_1_0= ruleTextAlignValue ) )
            // InternalDsl.g:5230:1: (lv_value_1_0= ruleTextAlignValue )
            {
            // InternalDsl.g:5230:1: (lv_value_1_0= ruleTextAlignValue )
            // InternalDsl.g:5231:3: lv_value_1_0= ruleTextAlignValue
            {
             
            	        newCompositeNode(grammarAccess.getTextAlignAccess().getValueTextAlignValueEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_35);
            lv_value_1_0=ruleTextAlignValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextAlignRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"org.eclipselabs.xdiagram.Dsl.TextAlignValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDsl.g:5247:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==22) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalDsl.g:5248:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:5248:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalDsl.g:5249:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAlignAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextAlignRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:5277:1: entryRuleLineStyle returns [EObject current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final EObject entryRuleLineStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStyle = null;


        try {
            // InternalDsl.g:5278:2: (iv_ruleLineStyle= ruleLineStyle EOF )
            // InternalDsl.g:5279:2: iv_ruleLineStyle= ruleLineStyle EOF
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
    // InternalDsl.g:5286:1: ruleLineStyle returns [EObject current=null] : ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject ruleLineStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_manhattan_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_style_2_0 = null;

        EObject lv_conditional_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:5289:28: ( ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // InternalDsl.g:5290:1: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // InternalDsl.g:5290:1: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // InternalDsl.g:5290:2: () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            // InternalDsl.g:5290:2: ()
            // InternalDsl.g:5291:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLineStyleAccess().getLineStyleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,79,FOLLOW_61); 

                	newLeafNode(otherlv_1, grammarAccess.getLineStyleAccess().getLinestyleKeyword_1());
                
            // InternalDsl.g:5300:1: ( (lv_style_2_0= ruleLineType ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=107 && LA102_0<=109)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDsl.g:5301:1: (lv_style_2_0= ruleLineType )
                    {
                    // InternalDsl.g:5301:1: (lv_style_2_0= ruleLineType )
                    // InternalDsl.g:5302:3: lv_style_2_0= ruleLineType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineStyleAccess().getStyleLineTypeEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_62);
                    lv_style_2_0=ruleLineType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"org.eclipselabs.xdiagram.Dsl.LineType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalDsl.g:5318:3: ( (lv_manhattan_3_0= 'manhattan' ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==80) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalDsl.g:5319:1: (lv_manhattan_3_0= 'manhattan' )
                    {
                    // InternalDsl.g:5319:1: (lv_manhattan_3_0= 'manhattan' )
                    // InternalDsl.g:5320:3: lv_manhattan_3_0= 'manhattan'
                    {
                    lv_manhattan_3_0=(Token)match(input,80,FOLLOW_35); 

                            newLeafNode(lv_manhattan_3_0, grammarAccess.getLineStyleAccess().getManhattanManhattanKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLineStyleRule());
                    	        }
                           		setWithLastConsumed(current, "manhattan", true, "manhattan");
                    	    

                    }


                    }
                    break;

            }

            // InternalDsl.g:5333:3: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==22) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalDsl.g:5334:1: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:5334:1: (lv_conditional_4_0= ruleFeatureConditional )
                    // InternalDsl.g:5335:3: lv_conditional_4_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineStyleAccess().getConditionalFeatureConditionalParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_4_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_4_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:5363:1: entryRuleLineWidth returns [EObject current=null] : iv_ruleLineWidth= ruleLineWidth EOF ;
    public final EObject entryRuleLineWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineWidth = null;


        try {
            // InternalDsl.g:5364:2: (iv_ruleLineWidth= ruleLineWidth EOF )
            // InternalDsl.g:5365:2: iv_ruleLineWidth= ruleLineWidth EOF
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
    // InternalDsl.g:5372:1: ruleLineWidth returns [EObject current=null] : (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleLineWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDsl.g:5375:28: ( (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // InternalDsl.g:5376:1: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // InternalDsl.g:5376:1: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // InternalDsl.g:5376:3: otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_30); 

                	newLeafNode(otherlv_0, grammarAccess.getLineWidthAccess().getLinewidthKeyword_0());
                
            // InternalDsl.g:5380:1: ( (lv_width_1_0= RULE_INT ) )
            // InternalDsl.g:5381:1: (lv_width_1_0= RULE_INT )
            {
            // InternalDsl.g:5381:1: (lv_width_1_0= RULE_INT )
            // InternalDsl.g:5382:3: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            // InternalDsl.g:5398:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==22) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalDsl.g:5399:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // InternalDsl.g:5399:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // InternalDsl.g:5400:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineWidthAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineWidthRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"org.eclipselabs.xdiagram.Dsl.FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:5428:1: ruleAnchorDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) ;
    public final Enumerator ruleAnchorDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDsl.g:5430:28: ( ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) )
            // InternalDsl.g:5431:1: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            {
            // InternalDsl.g:5431:1: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==82) ) {
                alt106=1;
            }
            else if ( (LA106_0==83) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalDsl.g:5431:2: (enumLiteral_0= 'incoming' )
                    {
                    // InternalDsl.g:5431:2: (enumLiteral_0= 'incoming' )
                    // InternalDsl.g:5431:4: enumLiteral_0= 'incoming'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                            current = grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:5437:6: (enumLiteral_1= 'outgoing' )
                    {
                    // InternalDsl.g:5437:6: (enumLiteral_1= 'outgoing' )
                    // InternalDsl.g:5437:8: enumLiteral_1= 'outgoing'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

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
    // InternalDsl.g:5447:1: ruleDefaultColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) ;
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
            // InternalDsl.g:5449:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) )
            // InternalDsl.g:5450:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            {
            // InternalDsl.g:5450:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            int alt107=16;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt107=1;
                }
                break;
            case 85:
                {
                alt107=2;
                }
                break;
            case 86:
                {
                alt107=3;
                }
                break;
            case 87:
                {
                alt107=4;
                }
                break;
            case 88:
                {
                alt107=5;
                }
                break;
            case 89:
                {
                alt107=6;
                }
                break;
            case 90:
                {
                alt107=7;
                }
                break;
            case 91:
                {
                alt107=8;
                }
                break;
            case 92:
                {
                alt107=9;
                }
                break;
            case 93:
                {
                alt107=10;
                }
                break;
            case 94:
                {
                alt107=11;
                }
                break;
            case 95:
                {
                alt107=12;
                }
                break;
            case 96:
                {
                alt107=13;
                }
                break;
            case 97:
                {
                alt107=14;
                }
                break;
            case 98:
                {
                alt107=15;
                }
                break;
            case 99:
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
                    // InternalDsl.g:5450:2: (enumLiteral_0= 'white' )
                    {
                    // InternalDsl.g:5450:2: (enumLiteral_0= 'white' )
                    // InternalDsl.g:5450:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:5456:6: (enumLiteral_1= 'silver' )
                    {
                    // InternalDsl.g:5456:6: (enumLiteral_1= 'silver' )
                    // InternalDsl.g:5456:8: enumLiteral_1= 'silver'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:5462:6: (enumLiteral_2= 'gray' )
                    {
                    // InternalDsl.g:5462:6: (enumLiteral_2= 'gray' )
                    // InternalDsl.g:5462:8: enumLiteral_2= 'gray'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:5468:6: (enumLiteral_3= 'black' )
                    {
                    // InternalDsl.g:5468:6: (enumLiteral_3= 'black' )
                    // InternalDsl.g:5468:8: enumLiteral_3= 'black'
                    {
                    enumLiteral_3=(Token)match(input,87,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:5474:6: (enumLiteral_4= 'red' )
                    {
                    // InternalDsl.g:5474:6: (enumLiteral_4= 'red' )
                    // InternalDsl.g:5474:8: enumLiteral_4= 'red'
                    {
                    enumLiteral_4=(Token)match(input,88,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:5480:6: (enumLiteral_5= 'maroon' )
                    {
                    // InternalDsl.g:5480:6: (enumLiteral_5= 'maroon' )
                    // InternalDsl.g:5480:8: enumLiteral_5= 'maroon'
                    {
                    enumLiteral_5=(Token)match(input,89,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:5486:6: (enumLiteral_6= 'yellow' )
                    {
                    // InternalDsl.g:5486:6: (enumLiteral_6= 'yellow' )
                    // InternalDsl.g:5486:8: enumLiteral_6= 'yellow'
                    {
                    enumLiteral_6=(Token)match(input,90,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:5492:6: (enumLiteral_7= 'olive' )
                    {
                    // InternalDsl.g:5492:6: (enumLiteral_7= 'olive' )
                    // InternalDsl.g:5492:8: enumLiteral_7= 'olive'
                    {
                    enumLiteral_7=(Token)match(input,91,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:5498:6: (enumLiteral_8= 'lime' )
                    {
                    // InternalDsl.g:5498:6: (enumLiteral_8= 'lime' )
                    // InternalDsl.g:5498:8: enumLiteral_8= 'lime'
                    {
                    enumLiteral_8=(Token)match(input,92,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:5504:6: (enumLiteral_9= 'green' )
                    {
                    // InternalDsl.g:5504:6: (enumLiteral_9= 'green' )
                    // InternalDsl.g:5504:8: enumLiteral_9= 'green'
                    {
                    enumLiteral_9=(Token)match(input,93,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:5510:6: (enumLiteral_10= 'aqua' )
                    {
                    // InternalDsl.g:5510:6: (enumLiteral_10= 'aqua' )
                    // InternalDsl.g:5510:8: enumLiteral_10= 'aqua'
                    {
                    enumLiteral_10=(Token)match(input,94,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:5516:6: (enumLiteral_11= 'teal' )
                    {
                    // InternalDsl.g:5516:6: (enumLiteral_11= 'teal' )
                    // InternalDsl.g:5516:8: enumLiteral_11= 'teal'
                    {
                    enumLiteral_11=(Token)match(input,95,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:5522:6: (enumLiteral_12= 'blue' )
                    {
                    // InternalDsl.g:5522:6: (enumLiteral_12= 'blue' )
                    // InternalDsl.g:5522:8: enumLiteral_12= 'blue'
                    {
                    enumLiteral_12=(Token)match(input,96,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // InternalDsl.g:5528:6: (enumLiteral_13= 'navy' )
                    {
                    // InternalDsl.g:5528:6: (enumLiteral_13= 'navy' )
                    // InternalDsl.g:5528:8: enumLiteral_13= 'navy'
                    {
                    enumLiteral_13=(Token)match(input,97,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // InternalDsl.g:5534:6: (enumLiteral_14= 'fuchsia' )
                    {
                    // InternalDsl.g:5534:6: (enumLiteral_14= 'fuchsia' )
                    // InternalDsl.g:5534:8: enumLiteral_14= 'fuchsia'
                    {
                    enumLiteral_14=(Token)match(input,98,FOLLOW_2); 

                            current = grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // InternalDsl.g:5540:6: (enumLiteral_15= 'purple' )
                    {
                    // InternalDsl.g:5540:6: (enumLiteral_15= 'purple' )
                    // InternalDsl.g:5540:8: enumLiteral_15= 'purple'
                    {
                    enumLiteral_15=(Token)match(input,99,FOLLOW_2); 

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
    // InternalDsl.g:5550:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDsl.g:5552:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalDsl.g:5553:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalDsl.g:5553:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==100) ) {
                alt108=1;
            }
            else if ( (LA108_0==101) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalDsl.g:5553:2: (enumLiteral_0= '=' )
                    {
                    // InternalDsl.g:5553:2: (enumLiteral_0= '=' )
                    // InternalDsl.g:5553:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,100,FOLLOW_2); 

                            current = grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:5559:6: (enumLiteral_1= '<>' )
                    {
                    // InternalDsl.g:5559:6: (enumLiteral_1= '<>' )
                    // InternalDsl.g:5559:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,101,FOLLOW_2); 

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
    // InternalDsl.g:5569:1: ruleBooleanLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDsl.g:5571:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalDsl.g:5572:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalDsl.g:5572:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==102) ) {
                alt109=1;
            }
            else if ( (LA109_0==103) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalDsl.g:5572:2: (enumLiteral_0= 'true' )
                    {
                    // InternalDsl.g:5572:2: (enumLiteral_0= 'true' )
                    // InternalDsl.g:5572:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                            current = grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:5578:6: (enumLiteral_1= 'false' )
                    {
                    // InternalDsl.g:5578:6: (enumLiteral_1= 'false' )
                    // InternalDsl.g:5578:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

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
    // InternalDsl.g:5588:1: ruleTextAlignValue returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleTextAlignValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalDsl.g:5590:28: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalDsl.g:5591:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalDsl.g:5591:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt110=1;
                }
                break;
            case 105:
                {
                alt110=2;
                }
                break;
            case 106:
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
                    // InternalDsl.g:5591:2: (enumLiteral_0= 'left' )
                    {
                    // InternalDsl.g:5591:2: (enumLiteral_0= 'left' )
                    // InternalDsl.g:5591:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                            current = grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:5597:6: (enumLiteral_1= 'center' )
                    {
                    // InternalDsl.g:5597:6: (enumLiteral_1= 'center' )
                    // InternalDsl.g:5597:8: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); 

                            current = grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:5603:6: (enumLiteral_2= 'right' )
                    {
                    // InternalDsl.g:5603:6: (enumLiteral_2= 'right' )
                    // InternalDsl.g:5603:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); 

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
    // InternalDsl.g:5613:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalDsl.g:5615:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) )
            // InternalDsl.g:5616:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            {
            // InternalDsl.g:5616:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt111=1;
                }
                break;
            case 108:
                {
                alt111=2;
                }
                break;
            case 109:
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
                    // InternalDsl.g:5616:2: (enumLiteral_0= 'solid' )
                    {
                    // InternalDsl.g:5616:2: (enumLiteral_0= 'solid' )
                    // InternalDsl.g:5616:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); 

                            current = grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:5622:6: (enumLiteral_1= 'dashed' )
                    {
                    // InternalDsl.g:5622:6: (enumLiteral_1= 'dashed' )
                    // InternalDsl.g:5622:8: enumLiteral_1= 'dashed'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); 

                            current = grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:5628:6: (enumLiteral_2= 'dotted' )
                    {
                    // InternalDsl.g:5628:6: (enumLiteral_2= 'dotted' )
                    // InternalDsl.g:5628:8: enumLiteral_2= 'dotted'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000300C940002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000300C900002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xCF00000000020000L,0x000000000002C0A1L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000070L,0x000000C000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00E0FF2000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000B000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xCF00000100020000L,0x000000000002C0A1L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00E7FF2000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800480000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008008400020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xCF88008400020000L,0x000000000002C0A3L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xCF88000400020000L,0x000000000002C0A3L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8C00008000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8808008400020000L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000020L,0x0000000FFFF00000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x3000000000480040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000480040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x3000000000480000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000480000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000200480000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000480000L,0x0000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000480030L,0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000480040L,0x0000000000003F00L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000480040L,0x0000000000003000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000480000L,0x0000000000003000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000480000L,0x0000000000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000480000L,0x0000380000010000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000480000L,0x0000000000010000L});

}