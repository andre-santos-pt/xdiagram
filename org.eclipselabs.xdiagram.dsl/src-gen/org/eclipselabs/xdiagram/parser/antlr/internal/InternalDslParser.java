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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_PERCENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'import'", "'.'", "'*'", "'diagram'", "'{'", "'}'", "'group'", "'style'", "'extends'", "'if'", "'node'", "':'", "'icon'", "'link'", "'object'", "'source'", "'target'", "'connection'", "'+'", "'decorators:'", "'at'", "'%'", "'middle'", "'anchor'", "';'", "'color'", "','", "'figure'", "'as'", "'children'", "'rectangle'", "'square'", "'rhombus'", "'ellipse'", "'circle'", "'polygon'", "'polyline'", "'contains'", "'null'", "'label'", "'editable'", "'image'", "'invisible'", "'foreground'", "'background'", "'transparency'", "'size'", "'x'", "'point'", "'position'", "'corner'", "'text'", "'font-face'", "'font-size'", "'font-style'", "'line-type'", "'line-width'", "'free'", "'manhattan'", "'incoming'", "'outgoing'", "'white'", "'silver'", "'gray'", "'black'", "'red'", "'maroon'", "'yellow'", "'olive'", "'lime'", "'green'", "'aqua'", "'teal'", "'blue'", "'navy'", "'fuchsia'", "'purple'", "'vstack'", "'hstack'", "'='", "'<>'", "'true'", "'false'", "'arial'", "'verdana'", "'times'", "'courier'", "'italics'", "'bold'", "'underline'", "'solid'", "'dash'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_PERCENT=7;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g"; }



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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:68:1: entryRuleXDiagram returns [EObject current=null] : iv_ruleXDiagram= ruleXDiagram EOF ;
    public final EObject entryRuleXDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDiagram = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:69:2: (iv_ruleXDiagram= ruleXDiagram EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:70:2: iv_ruleXDiagram= ruleXDiagram EOF
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:77:1: ruleXDiagram returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:80:28: ( (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:81:3: otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleXDiagram122); 

                	newLeafNode(otherlv_0, grammarAccess.getXDiagramAccess().getMetamodelKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:85:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:86:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:86:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:87:3: lv_importURI_1_0= RULE_STRING
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:103:2: ( (lv_imports_2_0= ruleImportStatement ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:104:1: (lv_imports_2_0= ruleImportStatement )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:104:1: (lv_imports_2_0= ruleImportStatement )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:105:3: lv_imports_2_0= ruleImportStatement
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:121:2: ( (lv_diagram_3_0= ruleDiagram ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:122:1: (lv_diagram_3_0= ruleDiagram )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:122:1: (lv_diagram_3_0= ruleDiagram )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:123:3: lv_diagram_3_0= ruleDiagram
            {
             
            	        newCompositeNode(grammarAccess.getXDiagramAccess().getDiagramDiagramParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDiagram_in_ruleXDiagram186);
            lv_diagram_3_0=ruleDiagram();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	        }
                   		set(
                   			current, 
                   			"diagram",
                    		lv_diagram_3_0, 
                    		"Diagram");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:139:2: ( (lv_groups_4_0= ruleGroup ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:140:1: (lv_groups_4_0= ruleGroup )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:140:1: (lv_groups_4_0= ruleGroup )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:141:3: lv_groups_4_0= ruleGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getGroupsGroupParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroup_in_ruleXDiagram207);
            	    lv_groups_4_0=ruleGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groups",
            	            		lv_groups_4_0, 
            	            		"Group");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:157:3: ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 23:
                case 26:
                    {
                    alt2=1;
                    }
                    break;
                case 20:
                    {
                    alt2=2;
                    }
                    break;
                case 38:
                    {
                    alt2=3;
                    }
                    break;
                case 40:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:157:4: ( (lv_elements_5_0= ruleDiagramElement ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:157:4: ( (lv_elements_5_0= ruleDiagramElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:158:1: (lv_elements_5_0= ruleDiagramElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:158:1: (lv_elements_5_0= ruleDiagramElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:159:3: lv_elements_5_0= ruleDiagramElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getElementsDiagramElementParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDiagramElement_in_ruleXDiagram230);
            	    lv_elements_5_0=ruleDiagramElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"DiagramElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:176:6: ( (lv_styles_6_0= ruleStyle ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:176:6: ( (lv_styles_6_0= ruleStyle ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:177:1: (lv_styles_6_0= ruleStyle )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:177:1: (lv_styles_6_0= ruleStyle )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:178:3: lv_styles_6_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getStylesStyleParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleXDiagram257);
            	    lv_styles_6_0=ruleStyle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"styles",
            	            		lv_styles_6_0, 
            	            		"Style");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:195:6: ( (lv_colors_7_0= ruleCustomColor ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:195:6: ( (lv_colors_7_0= ruleCustomColor ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:196:1: (lv_colors_7_0= ruleCustomColor )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:196:1: (lv_colors_7_0= ruleCustomColor )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:197:3: lv_colors_7_0= ruleCustomColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getColorsCustomColorParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomColor_in_ruleXDiagram284);
            	    lv_colors_7_0=ruleCustomColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colors",
            	            		lv_colors_7_0, 
            	            		"CustomColor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:214:6: ( (lv_figures_8_0= ruleCustomFigure ) )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:214:6: ( (lv_figures_8_0= ruleCustomFigure ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:215:1: (lv_figures_8_0= ruleCustomFigure )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:215:1: (lv_figures_8_0= ruleCustomFigure )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:216:3: lv_figures_8_0= ruleCustomFigure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getFiguresCustomFigureParserRuleCall_5_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomFigure_in_ruleXDiagram311);
            	    lv_figures_8_0=ruleCustomFigure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"figures",
            	            		lv_figures_8_0, 
            	            		"CustomFigure");
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:240:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:241:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:242:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement349);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;

             current =iv_ruleImportStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement359); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:249:1: ruleImportStatement returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:252:28: ( ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:253:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:253:1: ( () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )? )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:253:2: () (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:253:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:254:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportStatementAccess().getImportStatementAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:259:2: (otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:259:4: otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleImportStatement406); 

                        	newLeafNode(otherlv_1, grammarAccess.getImportStatementAccess().getImportKeyword_1_0());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:263:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:264:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:264:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:265:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportStatementAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportStatement427);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:289:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:290:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:291:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName466);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName477); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:298:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:301:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:302:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:302:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:302:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName517); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:309:1: (kw= '.' this_ID_2= RULE_ID )*
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
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:310:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName536); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName551); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:330:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:331:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:332:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard599);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard610); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:339:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:342:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:343:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:343:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:344:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard657);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:354:1: (kw= '.' kw= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:355:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard676); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard689); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:374:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:375:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:376:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram731);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram741); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:383:1: ruleDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* ( (lv_figures_4_0= ruleConnectableElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_contains_3_0 = null;

        EObject lv_figures_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:386:28: ( (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* ( (lv_figures_4_0= ruleConnectableElement ) )* otherlv_5= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:387:1: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* ( (lv_figures_4_0= ruleConnectableElement ) )* otherlv_5= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:387:1: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* ( (lv_figures_4_0= ruleConnectableElement ) )* otherlv_5= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:387:3: otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* ( (lv_figures_4_0= ruleConnectableElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDiagram778); 

                	newLeafNode(otherlv_0, grammarAccess.getDiagramAccess().getDiagramKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:391:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:392:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:392:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:393:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDiagramAccess().getModelClassEClassCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDiagram801);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleDiagram813); 

                	newLeafNode(otherlv_2, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:410:1: ( (lv_contains_3_0= ruleContains ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==50) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:411:1: (lv_contains_3_0= ruleContains )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:411:1: (lv_contains_3_0= ruleContains )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:412:3: lv_contains_3_0= ruleContains
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getContainsContainsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContains_in_ruleDiagram834);
            	    lv_contains_3_0=ruleContains();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contains",
            	            		lv_contains_3_0, 
            	            		"Contains");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:428:3: ( (lv_figures_4_0= ruleConnectableElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==40||(LA7_0>=43 && LA7_0<=49)||LA7_0==52||(LA7_0>=54 && LA7_0<=55)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:429:1: (lv_figures_4_0= ruleConnectableElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:429:1: (lv_figures_4_0= ruleConnectableElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:430:3: lv_figures_4_0= ruleConnectableElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getFiguresConnectableElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectableElement_in_ruleDiagram856);
            	    lv_figures_4_0=ruleConnectableElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"figures",
            	            		lv_figures_4_0, 
            	            		"ConnectableElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDiagram869); 

                	newLeafNode(otherlv_5, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleGroup"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:458:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:459:2: (iv_ruleGroup= ruleGroup EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:460:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup905);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup915); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:467:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:470:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:471:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:471:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:471:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleGroup952); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:475:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:476:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:476:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:477:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGroup969); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleDiagramElement"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:501:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:502:2: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:503:2: iv_ruleDiagramElement= ruleDiagramElement EOF
            {
             newCompositeNode(grammarAccess.getDiagramElementRule()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1010);
            iv_ruleDiagramElement=ruleDiagramElement();

            state._fsp--;

             current =iv_ruleDiagramElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramElement1020); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:510:1: ruleDiagramElement returns [EObject current=null] : (this_Node_0= ruleNode | this_Link_1= ruleLink ) ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Link_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:513:28: ( (this_Node_0= ruleNode | this_Link_1= ruleLink ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:514:1: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:514:1: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:515:5: this_Node_0= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getDiagramElementAccess().getNodeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNode_in_ruleDiagramElement1067);
                    this_Node_0=ruleNode();

                    state._fsp--;

                     
                            current = this_Node_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:525:5: this_Link_1= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getDiagramElementAccess().getLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleDiagramElement1094);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:541:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:542:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:543:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle1129);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle1139); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:550:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= 'extends' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:553:28: ( (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= 'extends' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:554:1: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= 'extends' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:554:1: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= 'extends' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:554:3: otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= 'extends' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleStyle1176); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:558:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:559:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:559:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:560:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStyle1193); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:576:2: ( ( (lv_styled_2_0= 'extends' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:576:3: ( (lv_styled_2_0= 'extends' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:576:3: ( (lv_styled_2_0= 'extends' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:577:1: (lv_styled_2_0= 'extends' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:577:1: (lv_styled_2_0= 'extends' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:578:3: lv_styled_2_0= 'extends'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleStyle1217); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getStyleAccess().getStyledExtendsKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStyleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "extends");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:591:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:592:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:592:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:593:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStyleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStyle1250); 

                    		newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleStyle1264); 

                	newLeafNode(otherlv_4, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:608:1: ( (lv_features_5_0= ruleStyleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=56 && LA10_0<=59)||(LA10_0>=61 && LA10_0<=69)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:609:1: (lv_features_5_0= ruleStyleFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:609:1: (lv_features_5_0= ruleStyleFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:610:3: lv_features_5_0= ruleStyleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStyleAccess().getFeaturesStyleFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyleFeature_in_ruleStyle1285);
            	    lv_features_5_0=ruleStyleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"StyleFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleStyle1298); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:640:1: entryRuleLinkedFeature returns [EObject current=null] : iv_ruleLinkedFeature= ruleLinkedFeature EOF ;
    public final EObject entryRuleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:641:2: (iv_ruleLinkedFeature= ruleLinkedFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:642:2: iv_ruleLinkedFeature= ruleLinkedFeature EOF
            {
             newCompositeNode(grammarAccess.getLinkedFeatureRule()); 
            pushFollow(FOLLOW_ruleLinkedFeature_in_entryRuleLinkedFeature1336);
            iv_ruleLinkedFeature=ruleLinkedFeature();

            state._fsp--;

             current =iv_ruleLinkedFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedFeature1346); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:649:1: ruleLinkedFeature returns [EObject current=null] : (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) ;
    public final EObject ruleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_Anchor_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:652:28: ( (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:653:1: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:653:1: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==50) ) {
                alt11=1;
            }
            else if ( (LA11_0==36) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:654:5: this_Contains_0= ruleContains
                    {
                     
                            newCompositeNode(grammarAccess.getLinkedFeatureAccess().getContainsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleContains_in_ruleLinkedFeature1393);
                    this_Contains_0=ruleContains();

                    state._fsp--;

                     
                            current = this_Contains_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:664:5: this_Anchor_1= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getLinkedFeatureAccess().getAnchorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleLinkedFeature1420);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:680:1: entryRuleStyleFeature returns [EObject current=null] : iv_ruleStyleFeature= ruleStyleFeature EOF ;
    public final EObject entryRuleStyleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:681:2: (iv_ruleStyleFeature= ruleStyleFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:682:2: iv_ruleStyleFeature= ruleStyleFeature EOF
            {
             newCompositeNode(grammarAccess.getStyleFeatureRule()); 
            pushFollow(FOLLOW_ruleStyleFeature_in_entryRuleStyleFeature1455);
            iv_ruleStyleFeature=ruleStyleFeature();

            state._fsp--;

             current =iv_ruleStyleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyleFeature1465); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:689:1: ruleStyleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontFace_7= ruleFontFace | this_FontSize_8= ruleFontSize | this_FontStyle_9= ruleFontStyle | this_TextValue_10= ruleTextValue | this_LineStyle_11= ruleLineStyle | this_LineWidth_12= ruleLineWidth ) ;
    public final EObject ruleStyleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Point_2 = null;

        EObject this_Corner_3 = null;

        EObject this_Background_4 = null;

        EObject this_Foreground_5 = null;

        EObject this_Transparency_6 = null;

        EObject this_FontFace_7 = null;

        EObject this_FontSize_8 = null;

        EObject this_FontStyle_9 = null;

        EObject this_TextValue_10 = null;

        EObject this_LineStyle_11 = null;

        EObject this_LineWidth_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:692:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontFace_7= ruleFontFace | this_FontSize_8= ruleFontSize | this_FontStyle_9= ruleFontStyle | this_TextValue_10= ruleTextValue | this_LineStyle_11= ruleLineStyle | this_LineWidth_12= ruleLineWidth ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:693:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontFace_7= ruleFontFace | this_FontSize_8= ruleFontSize | this_FontStyle_9= ruleFontStyle | this_TextValue_10= ruleTextValue | this_LineStyle_11= ruleLineStyle | this_LineWidth_12= ruleLineWidth )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:693:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontFace_7= ruleFontFace | this_FontSize_8= ruleFontSize | this_FontStyle_9= ruleFontStyle | this_TextValue_10= ruleTextValue | this_LineStyle_11= ruleLineStyle | this_LineWidth_12= ruleLineWidth )
            int alt12=13;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt12=1;
                }
                break;
            case 62:
                {
                alt12=2;
                }
                break;
            case 61:
                {
                alt12=3;
                }
                break;
            case 63:
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
            case 65:
                {
                alt12=8;
                }
                break;
            case 66:
                {
                alt12=9;
                }
                break;
            case 67:
                {
                alt12=10;
                }
                break;
            case 64:
                {
                alt12=11;
                }
                break;
            case 68:
                {
                alt12=12;
                }
                break;
            case 69:
                {
                alt12=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:694:5: this_Size_0= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getSizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleStyleFeature1512);
                    this_Size_0=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:704:5: this_Position_1= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getPositionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleStyleFeature1539);
                    this_Position_1=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:714:5: this_Point_2= rulePoint
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getPointParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePoint_in_ruleStyleFeature1566);
                    this_Point_2=rulePoint();

                    state._fsp--;

                     
                            current = this_Point_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:724:5: this_Corner_3= ruleCorner
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getCornerParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCorner_in_ruleStyleFeature1593);
                    this_Corner_3=ruleCorner();

                    state._fsp--;

                     
                            current = this_Corner_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:734:5: this_Background_4= ruleBackground
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getBackgroundParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBackground_in_ruleStyleFeature1620);
                    this_Background_4=ruleBackground();

                    state._fsp--;

                     
                            current = this_Background_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:744:5: this_Foreground_5= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getForegroundParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleStyleFeature1647);
                    this_Foreground_5=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:754:5: this_Transparency_6= ruleTransparency
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getTransparencyParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTransparency_in_ruleStyleFeature1674);
                    this_Transparency_6=ruleTransparency();

                    state._fsp--;

                     
                            current = this_Transparency_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:764:5: this_FontFace_7= ruleFontFace
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getFontFaceParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleFontFace_in_ruleStyleFeature1701);
                    this_FontFace_7=ruleFontFace();

                    state._fsp--;

                     
                            current = this_FontFace_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:774:5: this_FontSize_8= ruleFontSize
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getFontSizeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleFontSize_in_ruleStyleFeature1728);
                    this_FontSize_8=ruleFontSize();

                    state._fsp--;

                     
                            current = this_FontSize_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:784:5: this_FontStyle_9= ruleFontStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getFontStyleParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleFontStyle_in_ruleStyleFeature1755);
                    this_FontStyle_9=ruleFontStyle();

                    state._fsp--;

                     
                            current = this_FontStyle_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:794:5: this_TextValue_10= ruleTextValue
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getTextValueParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleTextValue_in_ruleStyleFeature1782);
                    this_TextValue_10=ruleTextValue();

                    state._fsp--;

                     
                            current = this_TextValue_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:804:5: this_LineStyle_11= ruleLineStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getLineStyleParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleStyleFeature1809);
                    this_LineStyle_11=ruleLineStyle();

                    state._fsp--;

                     
                            current = this_LineStyle_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:814:5: this_LineWidth_12= ruleLineWidth
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getLineWidthParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleLineWidth_in_ruleStyleFeature1836);
                    this_LineWidth_12=ruleLineWidth();

                    state._fsp--;

                     
                            current = this_LineWidth_12; 
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


    // $ANTLR start "entryRuleFeatureConditional"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:832:1: entryRuleFeatureConditional returns [EObject current=null] : iv_ruleFeatureConditional= ruleFeatureConditional EOF ;
    public final EObject entryRuleFeatureConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureConditional = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:833:2: (iv_ruleFeatureConditional= ruleFeatureConditional EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:834:2: iv_ruleFeatureConditional= ruleFeatureConditional EOF
            {
             newCompositeNode(grammarAccess.getFeatureConditionalRule()); 
            pushFollow(FOLLOW_ruleFeatureConditional_in_entryRuleFeatureConditional1873);
            iv_ruleFeatureConditional=ruleFeatureConditional();

            state._fsp--;

             current =iv_ruleFeatureConditional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureConditional1883); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:841:1: ruleFeatureConditional returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleFeatureConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:844:28: ( (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:845:1: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:845:1: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:845:3: otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleFeatureConditional1920); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureConditionalAccess().getIfKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:849:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:850:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:850:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:851:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureConditionalRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFeatureConditionalAccess().getModelAttributeEAttributeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureConditional1943);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:864:2: ( (lv_operator_2_0= ruleOperator ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:865:1: (lv_operator_2_0= ruleOperator )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:865:1: (lv_operator_2_0= ruleOperator )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:866:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getFeatureConditionalAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleFeatureConditional1964);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureConditionalRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:882:2: ( (lv_value_3_0= ruleValue ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:883:1: (lv_value_3_0= ruleValue )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:883:1: (lv_value_3_0= ruleValue )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:884:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getFeatureConditionalAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleFeatureConditional1985);
            lv_value_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureConditionalRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Value");
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:908:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:909:2: (iv_ruleNode= ruleNode EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:910:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode2021);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode2031); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:917:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( ( (lv_toolName_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? )? (otherlv_5= 'icon' ( (lv_imageId_6_0= RULE_ID ) ) )? otherlv_7= ':' ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_toolName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_imageId_6_0=null;
        Token otherlv_7=null;
        EObject lv_rootFigure_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:920:28: ( (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( ( (lv_toolName_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? )? (otherlv_5= 'icon' ( (lv_imageId_6_0= RULE_ID ) ) )? otherlv_7= ':' ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:921:1: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( ( (lv_toolName_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? )? (otherlv_5= 'icon' ( (lv_imageId_6_0= RULE_ID ) ) )? otherlv_7= ':' ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:921:1: (otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( ( (lv_toolName_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? )? (otherlv_5= 'icon' ( (lv_imageId_6_0= RULE_ID ) ) )? otherlv_7= ':' ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:921:3: otherlv_0= 'node' ( ( ruleQualifiedName ) ) ( ( (lv_toolName_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? )? (otherlv_5= 'icon' ( (lv_imageId_6_0= RULE_ID ) ) )? otherlv_7= ':' ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleNode2068); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:925:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:926:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:926:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:927:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getModelClassEClassCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNode2091);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:940:2: ( ( (lv_toolName_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:940:3: ( (lv_toolName_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )?
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:940:3: ( (lv_toolName_2_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:941:1: (lv_toolName_2_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:941:1: (lv_toolName_2_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:942:3: lv_toolName_2_0= RULE_STRING
                    {
                    lv_toolName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode2109); 

                    			newLeafNode(lv_toolName_2_0, grammarAccess.getNodeAccess().getToolNameSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"toolName",
                            		lv_toolName_2_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:958:2: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==24) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==RULE_ID) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:958:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleNode2127); 

                                	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getColonKeyword_2_1_0());
                                
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:962:1: ( (otherlv_4= RULE_ID ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:963:1: (otherlv_4= RULE_ID )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:963:1: (otherlv_4= RULE_ID )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:964:3: otherlv_4= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeRule());
                            	        }
                                    
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode2147); 

                            		newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getGroupGroupCrossReference_2_1_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:975:6: (otherlv_5= 'icon' ( (lv_imageId_6_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:975:8: otherlv_5= 'icon' ( (lv_imageId_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleNode2164); 

                        	newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getIconKeyword_3_0());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:979:1: ( (lv_imageId_6_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:980:1: (lv_imageId_6_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:980:1: (lv_imageId_6_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:981:3: lv_imageId_6_0= RULE_ID
                    {
                    lv_imageId_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode2181); 

                    			newLeafNode(lv_imageId_6_0, grammarAccess.getNodeAccess().getImageIdIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"imageId",
                            		lv_imageId_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleNode2200); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getColonKeyword_4());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1001:1: ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1002:1: (lv_rootFigure_8_0= ruleConnectableElement )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1002:1: (lv_rootFigure_8_0= ruleConnectableElement )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1003:3: lv_rootFigure_8_0= ruleConnectableElement
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getRootFigureConnectableElementParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleConnectableElement_in_ruleNode2221);
            lv_rootFigure_8_0=ruleConnectableElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	        }
                   		set(
                   			current, 
                   			"rootFigure",
                    		lv_rootFigure_8_0, 
                    		"ConnectableElement");
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1027:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1028:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1029:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink2257);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink2267); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1036:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_toolName_8_0= RULE_STRING ) ) (otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'icon' ( (lv_imageId_12_0= RULE_ID ) ) )? otherlv_13= ':' otherlv_14= 'connection' ( (lv_type_15_0= ruleConnectionType ) ) ( ( (lv_styled_16_0= '+' ) ) ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '{' ( (lv_features_19_0= ruleLinkFeature ) )* (otherlv_20= 'decorators:' ( (lv_decorators_21_0= ruleDecorator ) )+ )? otherlv_22= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_complex_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_toolName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_imageId_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_styled_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Enumerator lv_type_15_0 = null;

        EObject lv_features_19_0 = null;

        EObject lv_decorators_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1039:28: ( (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_toolName_8_0= RULE_STRING ) ) (otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'icon' ( (lv_imageId_12_0= RULE_ID ) ) )? otherlv_13= ':' otherlv_14= 'connection' ( (lv_type_15_0= ruleConnectionType ) ) ( ( (lv_styled_16_0= '+' ) ) ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '{' ( (lv_features_19_0= ruleLinkFeature ) )* (otherlv_20= 'decorators:' ( (lv_decorators_21_0= ruleDecorator ) )+ )? otherlv_22= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1040:1: (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_toolName_8_0= RULE_STRING ) ) (otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'icon' ( (lv_imageId_12_0= RULE_ID ) ) )? otherlv_13= ':' otherlv_14= 'connection' ( (lv_type_15_0= ruleConnectionType ) ) ( ( (lv_styled_16_0= '+' ) ) ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '{' ( (lv_features_19_0= ruleLinkFeature ) )* (otherlv_20= 'decorators:' ( (lv_decorators_21_0= ruleDecorator ) )+ )? otherlv_22= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1040:1: (otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_toolName_8_0= RULE_STRING ) ) (otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'icon' ( (lv_imageId_12_0= RULE_ID ) ) )? otherlv_13= ':' otherlv_14= 'connection' ( (lv_type_15_0= ruleConnectionType ) ) ( ( (lv_styled_16_0= '+' ) ) ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '{' ( (lv_features_19_0= ruleLinkFeature ) )* (otherlv_20= 'decorators:' ( (lv_decorators_21_0= ruleDecorator ) )+ )? otherlv_22= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1040:3: otherlv_0= 'link' ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_toolName_8_0= RULE_STRING ) ) (otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'icon' ( (lv_imageId_12_0= RULE_ID ) ) )? otherlv_13= ':' otherlv_14= 'connection' ( (lv_type_15_0= ruleConnectionType ) ) ( ( (lv_styled_16_0= '+' ) ) ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '{' ( (lv_features_19_0= ruleLinkFeature ) )* (otherlv_20= 'decorators:' ( (lv_decorators_21_0= ruleDecorator ) )+ )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLink2304); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1044:1: ( ( ( ruleQualifiedName ) ) | ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1044:2: ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1044:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1045:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1045:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1046:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2328);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1060:6: ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1060:6: ( ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1060:7: ( (lv_complex_2_0= 'object' ) ) ( ( ruleQualifiedName ) ) otherlv_4= 'source' ( ( ruleQualifiedName ) ) otherlv_6= 'target' ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1060:7: ( (lv_complex_2_0= 'object' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1061:1: (lv_complex_2_0= 'object' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1061:1: (lv_complex_2_0= 'object' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1062:3: lv_complex_2_0= 'object'
                    {
                    lv_complex_2_0=(Token)match(input,27,FOLLOW_27_in_ruleLink2353); 

                            newLeafNode(lv_complex_2_0, grammarAccess.getLinkAccess().getComplexObjectKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "complex", true, "object");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1075:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1076:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1076:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1077:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2389);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleLink2401); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getSourceKeyword_1_1_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1094:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1095:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1095:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1096:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_1_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2424);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleLink2436); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getTargetKeyword_1_1_4());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1113:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1114:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1114:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1115:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_1_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2459);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1128:4: ( ( (lv_toolName_8_0= RULE_STRING ) ) (otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1128:5: ( (lv_toolName_8_0= RULE_STRING ) ) (otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )?
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1128:5: ( (lv_toolName_8_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1129:1: (lv_toolName_8_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1129:1: (lv_toolName_8_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1130:3: lv_toolName_8_0= RULE_STRING
                    {
                    lv_toolName_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink2479); 

                    			newLeafNode(lv_toolName_8_0, grammarAccess.getLinkAccess().getToolNameSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"toolName",
                            		lv_toolName_8_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1146:2: (otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==RULE_ID) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1146:4: otherlv_9= ':' ( (otherlv_10= RULE_ID ) )
                            {
                            otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleLink2497); 

                                	newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getColonKeyword_2_1_0());
                                
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1150:1: ( (otherlv_10= RULE_ID ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1151:1: (otherlv_10= RULE_ID )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1151:1: (otherlv_10= RULE_ID )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1152:3: otherlv_10= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLinkRule());
                            	        }
                                    
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2517); 

                            		newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getGroupGroupCrossReference_2_1_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1163:6: (otherlv_11= 'icon' ( (lv_imageId_12_0= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1163:8: otherlv_11= 'icon' ( (lv_imageId_12_0= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleLink2534); 

                        	newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getIconKeyword_3_0());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1167:1: ( (lv_imageId_12_0= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1168:1: (lv_imageId_12_0= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1168:1: (lv_imageId_12_0= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1169:3: lv_imageId_12_0= RULE_ID
                    {
                    lv_imageId_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2551); 

                    			newLeafNode(lv_imageId_12_0, grammarAccess.getLinkAccess().getImageIdIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"imageId",
                            		lv_imageId_12_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleLink2570); 

                	newLeafNode(otherlv_13, grammarAccess.getLinkAccess().getColonKeyword_4());
                
            otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleLink2582); 

                	newLeafNode(otherlv_14, grammarAccess.getLinkAccess().getConnectionKeyword_5());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1193:1: ( (lv_type_15_0= ruleConnectionType ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1194:1: (lv_type_15_0= ruleConnectionType )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1194:1: (lv_type_15_0= ruleConnectionType )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1195:3: lv_type_15_0= ruleConnectionType
            {
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getTypeConnectionTypeEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleConnectionType_in_ruleLink2603);
            lv_type_15_0=ruleConnectionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_15_0, 
                    		"ConnectionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1211:2: ( ( (lv_styled_16_0= '+' ) ) ( (otherlv_17= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1211:3: ( (lv_styled_16_0= '+' ) ) ( (otherlv_17= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1211:3: ( (lv_styled_16_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1212:1: (lv_styled_16_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1212:1: (lv_styled_16_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1213:3: lv_styled_16_0= '+'
                    {
                    lv_styled_16_0=(Token)match(input,31,FOLLOW_31_in_ruleLink2622); 

                            newLeafNode(lv_styled_16_0, grammarAccess.getLinkAccess().getStyledPlusSignKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1226:2: ( (otherlv_17= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1227:1: (otherlv_17= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1227:1: (otherlv_17= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1228:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2655); 

                    		newLeafNode(otherlv_17, grammarAccess.getLinkAccess().getStyleStyleCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleLink2669); 

                	newLeafNode(otherlv_18, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1243:1: ( (lv_features_19_0= ruleLinkFeature ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==56||(LA21_0>=68 && LA21_0<=69)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1244:1: (lv_features_19_0= ruleLinkFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1244:1: (lv_features_19_0= ruleLinkFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1245:3: lv_features_19_0= ruleLinkFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getFeaturesLinkFeatureParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkFeature_in_ruleLink2690);
            	    lv_features_19_0=ruleLinkFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_19_0, 
            	            		"LinkFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1261:3: (otherlv_20= 'decorators:' ( (lv_decorators_21_0= ruleDecorator ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1261:5: otherlv_20= 'decorators:' ( (lv_decorators_21_0= ruleDecorator ) )+
                    {
                    otherlv_20=(Token)match(input,32,FOLLOW_32_in_ruleLink2704); 

                        	newLeafNode(otherlv_20, grammarAccess.getLinkAccess().getDecoratorsKeyword_10_0());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1265:1: ( (lv_decorators_21_0= ruleDecorator ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=28 && LA22_0<=29)||LA22_0==33||LA22_0==35) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1266:1: (lv_decorators_21_0= ruleDecorator )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1266:1: (lv_decorators_21_0= ruleDecorator )
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1267:3: lv_decorators_21_0= ruleDecorator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkAccess().getDecoratorsDecoratorParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecorator_in_ruleLink2725);
                    	    lv_decorators_21_0=ruleDecorator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"decorators",
                    	            		lv_decorators_21_0, 
                    	            		"Decorator");
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


                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_18_in_ruleLink2740); 

                	newLeafNode(otherlv_22, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1295:1: entryRuleLinkFeature returns [EObject current=null] : iv_ruleLinkFeature= ruleLinkFeature EOF ;
    public final EObject entryRuleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1296:2: (iv_ruleLinkFeature= ruleLinkFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1297:2: iv_ruleLinkFeature= ruleLinkFeature EOF
            {
             newCompositeNode(grammarAccess.getLinkFeatureRule()); 
            pushFollow(FOLLOW_ruleLinkFeature_in_entryRuleLinkFeature2776);
            iv_ruleLinkFeature=ruleLinkFeature();

            state._fsp--;

             current =iv_ruleLinkFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkFeature2786); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1304:1: ruleLinkFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) ;
    public final EObject ruleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_LineStyle_1 = null;

        EObject this_LineWidth_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1307:28: ( (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1308:1: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1308:1: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt24=1;
                }
                break;
            case 68:
                {
                alt24=2;
                }
                break;
            case 69:
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1309:5: this_Foreground_0= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getLinkFeatureAccess().getForegroundParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleLinkFeature2833);
                    this_Foreground_0=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1319:5: this_LineStyle_1= ruleLineStyle
                    {
                     
                            newCompositeNode(grammarAccess.getLinkFeatureAccess().getLineStyleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleLinkFeature2860);
                    this_LineStyle_1=ruleLineStyle();

                    state._fsp--;

                     
                            current = this_LineStyle_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1329:5: this_LineWidth_2= ruleLineWidth
                    {
                     
                            newCompositeNode(grammarAccess.getLinkFeatureAccess().getLineWidthParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLineWidth_in_ruleLinkFeature2887);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1345:1: entryRuleDecorator returns [EObject current=null] : iv_ruleDecorator= ruleDecorator EOF ;
    public final EObject entryRuleDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorator = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1346:2: (iv_ruleDecorator= ruleDecorator EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1347:2: iv_ruleDecorator= ruleDecorator EOF
            {
             newCompositeNode(grammarAccess.getDecoratorRule()); 
            pushFollow(FOLLOW_ruleDecorator_in_entryRuleDecorator2922);
            iv_ruleDecorator=ruleDecorator();

            state._fsp--;

             current =iv_ruleDecorator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorator2932); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1354:1: ruleDecorator returns [EObject current=null] : ( ( (otherlv_0= 'at' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ) | ( (lv_source_3_0= 'source' ) ) | ( (lv_target_4_0= 'target' ) ) | ( (lv_middle_5_0= 'middle' ) ) ) ( ( (lv_staticElement_6_0= ruleStaticElement ) ) | ( (lv_label_7_0= ruleLabel ) ) )? ) ;
    public final EObject ruleDecorator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_position_1_0=null;
        Token otherlv_2=null;
        Token lv_source_3_0=null;
        Token lv_target_4_0=null;
        Token lv_middle_5_0=null;
        EObject lv_staticElement_6_0 = null;

        EObject lv_label_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1357:28: ( ( ( (otherlv_0= 'at' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ) | ( (lv_source_3_0= 'source' ) ) | ( (lv_target_4_0= 'target' ) ) | ( (lv_middle_5_0= 'middle' ) ) ) ( ( (lv_staticElement_6_0= ruleStaticElement ) ) | ( (lv_label_7_0= ruleLabel ) ) )? ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1358:1: ( ( (otherlv_0= 'at' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ) | ( (lv_source_3_0= 'source' ) ) | ( (lv_target_4_0= 'target' ) ) | ( (lv_middle_5_0= 'middle' ) ) ) ( ( (lv_staticElement_6_0= ruleStaticElement ) ) | ( (lv_label_7_0= ruleLabel ) ) )? )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1358:1: ( ( (otherlv_0= 'at' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ) | ( (lv_source_3_0= 'source' ) ) | ( (lv_target_4_0= 'target' ) ) | ( (lv_middle_5_0= 'middle' ) ) ) ( ( (lv_staticElement_6_0= ruleStaticElement ) ) | ( (lv_label_7_0= ruleLabel ) ) )? )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1358:2: ( (otherlv_0= 'at' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ) | ( (lv_source_3_0= 'source' ) ) | ( (lv_target_4_0= 'target' ) ) | ( (lv_middle_5_0= 'middle' ) ) ) ( ( (lv_staticElement_6_0= ruleStaticElement ) ) | ( (lv_label_7_0= ruleLabel ) ) )?
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1358:2: ( (otherlv_0= 'at' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ) | ( (lv_source_3_0= 'source' ) ) | ( (lv_target_4_0= 'target' ) ) | ( (lv_middle_5_0= 'middle' ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt25=1;
                }
                break;
            case 28:
                {
                alt25=2;
                }
                break;
            case 29:
                {
                alt25=3;
                }
                break;
            case 35:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1358:3: (otherlv_0= 'at' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1358:3: (otherlv_0= 'at' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1358:5: otherlv_0= 'at' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleDecorator2971); 

                        	newLeafNode(otherlv_0, grammarAccess.getDecoratorAccess().getAtKeyword_0_0_0());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1362:1: ( (lv_position_1_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1363:1: (lv_position_1_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1363:1: (lv_position_1_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1364:3: lv_position_1_0= RULE_INT
                    {
                    lv_position_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecorator2988); 

                    			newLeafNode(lv_position_1_0, grammarAccess.getDecoratorAccess().getPositionINTTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecoratorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"position",
                            		lv_position_1_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleDecorator3005); 

                        	newLeafNode(otherlv_2, grammarAccess.getDecoratorAccess().getPercentSignKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1385:6: ( (lv_source_3_0= 'source' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1385:6: ( (lv_source_3_0= 'source' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1386:1: (lv_source_3_0= 'source' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1386:1: (lv_source_3_0= 'source' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1387:3: lv_source_3_0= 'source'
                    {
                    lv_source_3_0=(Token)match(input,28,FOLLOW_28_in_ruleDecorator3030); 

                            newLeafNode(lv_source_3_0, grammarAccess.getDecoratorAccess().getSourceSourceKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecoratorRule());
                    	        }
                           		setWithLastConsumed(current, "source", true, "source");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1401:6: ( (lv_target_4_0= 'target' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1401:6: ( (lv_target_4_0= 'target' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1402:1: (lv_target_4_0= 'target' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1402:1: (lv_target_4_0= 'target' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1403:3: lv_target_4_0= 'target'
                    {
                    lv_target_4_0=(Token)match(input,29,FOLLOW_29_in_ruleDecorator3067); 

                            newLeafNode(lv_target_4_0, grammarAccess.getDecoratorAccess().getTargetTargetKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecoratorRule());
                    	        }
                           		setWithLastConsumed(current, "target", true, "target");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1417:6: ( (lv_middle_5_0= 'middle' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1417:6: ( (lv_middle_5_0= 'middle' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1418:1: (lv_middle_5_0= 'middle' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1418:1: (lv_middle_5_0= 'middle' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1419:3: lv_middle_5_0= 'middle'
                    {
                    lv_middle_5_0=(Token)match(input,35,FOLLOW_35_in_ruleDecorator3104); 

                            newLeafNode(lv_middle_5_0, grammarAccess.getDecoratorAccess().getMiddleMiddleKeyword_0_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecoratorRule());
                    	        }
                           		setWithLastConsumed(current, "middle", true, "middle");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1432:3: ( ( (lv_staticElement_6_0= ruleStaticElement ) ) | ( (lv_label_7_0= ruleLabel ) ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45||(LA26_0>=48 && LA26_0<=49)) ) {
                alt26=1;
            }
            else if ( (LA26_0==52) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1432:4: ( (lv_staticElement_6_0= ruleStaticElement ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1432:4: ( (lv_staticElement_6_0= ruleStaticElement ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1433:1: (lv_staticElement_6_0= ruleStaticElement )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1433:1: (lv_staticElement_6_0= ruleStaticElement )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1434:3: lv_staticElement_6_0= ruleStaticElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getDecoratorAccess().getStaticElementStaticElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStaticElement_in_ruleDecorator3140);
                    lv_staticElement_6_0=ruleStaticElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDecoratorRule());
                    	        }
                           		set(
                           			current, 
                           			"staticElement",
                            		lv_staticElement_6_0, 
                            		"StaticElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1451:6: ( (lv_label_7_0= ruleLabel ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1451:6: ( (lv_label_7_0= ruleLabel ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1452:1: (lv_label_7_0= ruleLabel )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1452:1: (lv_label_7_0= ruleLabel )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1453:3: lv_label_7_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getDecoratorAccess().getLabelLabelParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleDecorator3167);
                    lv_label_7_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDecoratorRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_7_0, 
                            		"Label");
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
    // $ANTLR end "ruleDecorator"


    // $ANTLR start "entryRuleStaticElement"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1477:1: entryRuleStaticElement returns [EObject current=null] : iv_ruleStaticElement= ruleStaticElement EOF ;
    public final EObject entryRuleStaticElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticElement = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1478:2: (iv_ruleStaticElement= ruleStaticElement EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1479:2: iv_ruleStaticElement= ruleStaticElement EOF
            {
             newCompositeNode(grammarAccess.getStaticElementRule()); 
            pushFollow(FOLLOW_ruleStaticElement_in_entryRuleStaticElement3205);
            iv_ruleStaticElement=ruleStaticElement();

            state._fsp--;

             current =iv_ruleStaticElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticElement3215); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1486:1: ruleStaticElement returns [EObject current=null] : (this_Rhombus_0= ruleRhombus | this_Polyline_1= rulePolyline ) ;
    public final EObject ruleStaticElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rhombus_0 = null;

        EObject this_Polyline_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1489:28: ( (this_Rhombus_0= ruleRhombus | this_Polyline_1= rulePolyline ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1490:1: (this_Rhombus_0= ruleRhombus | this_Polyline_1= rulePolyline )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1490:1: (this_Rhombus_0= ruleRhombus | this_Polyline_1= rulePolyline )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=48 && LA27_0<=49)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1491:5: this_Rhombus_0= ruleRhombus
                    {
                     
                            newCompositeNode(grammarAccess.getStaticElementAccess().getRhombusParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRhombus_in_ruleStaticElement3262);
                    this_Rhombus_0=ruleRhombus();

                    state._fsp--;

                     
                            current = this_Rhombus_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1501:5: this_Polyline_1= rulePolyline
                    {
                     
                            newCompositeNode(grammarAccess.getStaticElementAccess().getPolylineParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePolyline_in_ruleStaticElement3289);
                    this_Polyline_1=rulePolyline();

                    state._fsp--;

                     
                            current = this_Polyline_1; 
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
    // $ANTLR end "ruleStaticElement"


    // $ANTLR start "entryRuleAnchor"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1517:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1518:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1519:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor3324);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor3334); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1526:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_direction_1_0 = null;

        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1529:28: ( (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1530:1: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1530:1: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1530:3: otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleAnchor3371); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAnchorKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1534:1: ( (lv_direction_1_0= ruleAnchorDirection ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1535:1: (lv_direction_1_0= ruleAnchorDirection )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1535:1: (lv_direction_1_0= ruleAnchorDirection )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1536:3: lv_direction_1_0= ruleAnchorDirection
            {
             
            	        newCompositeNode(grammarAccess.getAnchorAccess().getDirectionAnchorDirectionEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnchorDirection_in_ruleAnchor3392);
            lv_direction_1_0=ruleAnchorDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnchorRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_1_0, 
                    		"AnchorDirection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1552:2: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1553:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1553:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1554:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnchorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnchorAccess().getModelReferenceEReferenceCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnchor3415);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1567:2: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1568:1: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1568:1: (lv_conditional_3_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1569:3: lv_conditional_3_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleAnchor3436);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnchorRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_3_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleAnchor3449); 

                	newLeafNode(otherlv_4, grammarAccess.getAnchorAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1597:1: entryRuleCustomColor returns [EObject current=null] : iv_ruleCustomColor= ruleCustomColor EOF ;
    public final EObject entryRuleCustomColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomColor = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1598:2: (iv_ruleCustomColor= ruleCustomColor EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1599:2: iv_ruleCustomColor= ruleCustomColor EOF
            {
             newCompositeNode(grammarAccess.getCustomColorRule()); 
            pushFollow(FOLLOW_ruleCustomColor_in_entryRuleCustomColor3485);
            iv_ruleCustomColor=ruleCustomColor();

            state._fsp--;

             current =iv_ruleCustomColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomColor3495); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1606:1: ruleCustomColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) ) ;
    public final EObject ruleCustomColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_R_2_0=null;
        Token otherlv_3=null;
        Token lv_G_4_0=null;
        Token otherlv_5=null;
        Token lv_B_6_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1609:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1610:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1610:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1610:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_G_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_B_6_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleCustomColor3532); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomColorAccess().getColorKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1614:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1615:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1615:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1616:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomColor3549); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCustomColorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1632:2: ( (lv_R_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1633:1: (lv_R_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1633:1: (lv_R_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1634:3: lv_R_2_0= RULE_INT
            {
            lv_R_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomColor3571); 

            			newLeafNode(lv_R_2_0, grammarAccess.getCustomColorAccess().getRINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"R",
                    		lv_R_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleCustomColor3588); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomColorAccess().getCommaKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1654:1: ( (lv_G_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1655:1: (lv_G_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1655:1: (lv_G_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1656:3: lv_G_4_0= RULE_INT
            {
            lv_G_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomColor3605); 

            			newLeafNode(lv_G_4_0, grammarAccess.getCustomColorAccess().getGINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"G",
                    		lv_G_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleCustomColor3622); 

                	newLeafNode(otherlv_5, grammarAccess.getCustomColorAccess().getCommaKeyword_5());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1676:1: ( (lv_B_6_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1677:1: (lv_B_6_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1677:1: (lv_B_6_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1678:3: lv_B_6_0= RULE_INT
            {
            lv_B_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomColor3639); 

            			newLeafNode(lv_B_6_0, grammarAccess.getCustomColorAccess().getBINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"B",
                    		lv_B_6_0, 
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
    // $ANTLR end "ruleCustomColor"


    // $ANTLR start "entryRuleColor"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1702:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1703:2: (iv_ruleColor= ruleColor EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1704:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor3680);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor3690); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1711:1: ruleColor returns [EObject current=null] : ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_default_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1714:28: ( ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1715:1: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1715:1: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=74 && LA29_0<=89)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1715:2: ( (lv_default_0_0= ruleDefaultColor ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1715:2: ( (lv_default_0_0= ruleDefaultColor ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1716:1: (lv_default_0_0= ruleDefaultColor )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1716:1: (lv_default_0_0= ruleDefaultColor )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1717:3: lv_default_0_0= ruleDefaultColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getDefaultDefaultColorEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultColor_in_ruleColor3736);
                    lv_default_0_0=ruleDefaultColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_0_0, 
                            		"DefaultColor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1734:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1734:6: ( (otherlv_1= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1735:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1735:1: (otherlv_1= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1736:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColor3762); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1755:1: entryRuleConnectableElement returns [EObject current=null] : iv_ruleConnectableElement= ruleConnectableElement EOF ;
    public final EObject entryRuleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElement = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1756:2: (iv_ruleConnectableElement= ruleConnectableElement EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1757:2: iv_ruleConnectableElement= ruleConnectableElement EOF
            {
             newCompositeNode(grammarAccess.getConnectableElementRule()); 
            pushFollow(FOLLOW_ruleConnectableElement_in_entryRuleConnectableElement3798);
            iv_ruleConnectableElement=ruleConnectableElement();

            state._fsp--;

             current =iv_ruleConnectableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectableElement3808); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1764:1: ruleConnectableElement returns [EObject current=null] : (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom ) ;
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


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1767:28: ( (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1768:1: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1768:1: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom )
            int alt30=8;
            switch ( input.LA(1) ) {
            case 43:
            case 44:
                {
                alt30=1;
                }
                break;
            case 45:
                {
                alt30=2;
                }
                break;
            case 46:
            case 47:
                {
                alt30=3;
                }
                break;
            case 48:
            case 49:
                {
                alt30=4;
                }
                break;
            case 52:
                {
                alt30=5;
                }
                break;
            case 54:
                {
                alt30=6;
                }
                break;
            case 55:
                {
                alt30=7;
                }
                break;
            case 40:
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1769:5: this_Rectangle_0= ruleRectangle
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getRectangleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRectangle_in_ruleConnectableElement3855);
                    this_Rectangle_0=ruleRectangle();

                    state._fsp--;

                     
                            current = this_Rectangle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1779:5: this_Rhombus_1= ruleRhombus
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getRhombusParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRhombus_in_ruleConnectableElement3882);
                    this_Rhombus_1=ruleRhombus();

                    state._fsp--;

                     
                            current = this_Rhombus_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1789:5: this_Ellipse_2= ruleEllipse
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getEllipseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEllipse_in_ruleConnectableElement3909);
                    this_Ellipse_2=ruleEllipse();

                    state._fsp--;

                     
                            current = this_Ellipse_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1799:5: this_Polyline_3= rulePolyline
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getPolylineParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePolyline_in_ruleConnectableElement3936);
                    this_Polyline_3=rulePolyline();

                    state._fsp--;

                     
                            current = this_Polyline_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1809:5: this_Label_4= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getLabelParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleConnectableElement3963);
                    this_Label_4=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1819:5: this_Image_5= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getImageParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleConnectableElement3990);
                    this_Image_5=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1829:5: this_Invisible_6= ruleInvisible
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getInvisibleParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleInvisible_in_ruleConnectableElement4017);
                    this_Invisible_6=ruleInvisible();

                    state._fsp--;

                     
                            current = this_Invisible_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1839:5: this_Custom_7= ruleCustom
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getCustomParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleCustom_in_ruleConnectableElement4044);
                    this_Custom_7=ruleCustom();

                    state._fsp--;

                     
                            current = this_Custom_7; 
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


    // $ANTLR start "entryRuleConnectableElementFeature"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1855:1: entryRuleConnectableElementFeature returns [EObject current=null] : iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF ;
    public final EObject entryRuleConnectableElementFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElementFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1856:2: (iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1857:2: iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF
            {
             newCompositeNode(grammarAccess.getConnectableElementFeatureRule()); 
            pushFollow(FOLLOW_ruleConnectableElementFeature_in_entryRuleConnectableElementFeature4079);
            iv_ruleConnectableElementFeature=ruleConnectableElementFeature();

            state._fsp--;

             current =iv_ruleConnectableElementFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectableElementFeature4089); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1864:1: ruleConnectableElementFeature returns [EObject current=null] : (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_LineStyle_3= ruleLineStyle | this_LineWidth_4= ruleLineWidth | this_Contains_5= ruleContains | this_Anchor_6= ruleAnchor ) ;
    public final EObject ruleConnectableElementFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Position_0 = null;

        EObject this_Size_1 = null;

        EObject this_ColorFeature_2 = null;

        EObject this_LineStyle_3 = null;

        EObject this_LineWidth_4 = null;

        EObject this_Contains_5 = null;

        EObject this_Anchor_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1867:28: ( (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_LineStyle_3= ruleLineStyle | this_LineWidth_4= ruleLineWidth | this_Contains_5= ruleContains | this_Anchor_6= ruleAnchor ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1868:1: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_LineStyle_3= ruleLineStyle | this_LineWidth_4= ruleLineWidth | this_Contains_5= ruleContains | this_Anchor_6= ruleAnchor )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1868:1: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_LineStyle_3= ruleLineStyle | this_LineWidth_4= ruleLineWidth | this_Contains_5= ruleContains | this_Anchor_6= ruleAnchor )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt31=1;
                }
                break;
            case 59:
                {
                alt31=2;
                }
                break;
            case 56:
            case 57:
                {
                alt31=3;
                }
                break;
            case 68:
                {
                alt31=4;
                }
                break;
            case 69:
                {
                alt31=5;
                }
                break;
            case 50:
                {
                alt31=6;
                }
                break;
            case 36:
                {
                alt31=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1869:5: this_Position_0= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getPositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleConnectableElementFeature4136);
                    this_Position_0=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1879:5: this_Size_1= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getSizeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleConnectableElementFeature4163);
                    this_Size_1=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1889:5: this_ColorFeature_2= ruleColorFeature
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getColorFeatureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleColorFeature_in_ruleConnectableElementFeature4190);
                    this_ColorFeature_2=ruleColorFeature();

                    state._fsp--;

                     
                            current = this_ColorFeature_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1899:5: this_LineStyle_3= ruleLineStyle
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getLineStyleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleConnectableElementFeature4217);
                    this_LineStyle_3=ruleLineStyle();

                    state._fsp--;

                     
                            current = this_LineStyle_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1909:5: this_LineWidth_4= ruleLineWidth
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getLineWidthParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLineWidth_in_ruleConnectableElementFeature4244);
                    this_LineWidth_4=ruleLineWidth();

                    state._fsp--;

                     
                            current = this_LineWidth_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1919:5: this_Contains_5= ruleContains
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getContainsParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleContains_in_ruleConnectableElementFeature4271);
                    this_Contains_5=ruleContains();

                    state._fsp--;

                     
                            current = this_Contains_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1929:5: this_Anchor_6= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getAnchorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleConnectableElementFeature4298);
                    this_Anchor_6=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_6; 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1945:1: entryRuleCustomFigure returns [EObject current=null] : iv_ruleCustomFigure= ruleCustomFigure EOF ;
    public final EObject entryRuleCustomFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1946:2: (iv_ruleCustomFigure= ruleCustomFigure EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1947:2: iv_ruleCustomFigure= ruleCustomFigure EOF
            {
             newCompositeNode(grammarAccess.getCustomFigureRule()); 
            pushFollow(FOLLOW_ruleCustomFigure_in_entryRuleCustomFigure4333);
            iv_ruleCustomFigure=ruleCustomFigure();

            state._fsp--;

             current =iv_ruleCustomFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomFigure4343); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1954:1: ruleCustomFigure returns [EObject current=null] : (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleCustomFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1957:28: ( (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1958:1: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1958:1: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1958:3: otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleCustomFigure4380); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomFigureAccess().getFigureKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1962:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1963:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1963:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1964:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomFigure4397); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCustomFigureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomFigureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleCustomFigure4414); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomFigureAccess().getAsKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1984:1: ( (lv_element_3_0= ruleConnectableElement ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1985:1: (lv_element_3_0= ruleConnectableElement )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1985:1: (lv_element_3_0= ruleConnectableElement )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1986:3: lv_element_3_0= ruleConnectableElement
            {
             
            	        newCompositeNode(grammarAccess.getCustomFigureAccess().getElementConnectableElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConnectableElement_in_ruleCustomFigure4435);
            lv_element_3_0=ruleConnectableElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomFigureRule());
            	        }
                   		set(
                   			current, 
                   			"element",
                    		lv_element_3_0, 
                    		"ConnectableElement");
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2010:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2011:2: (iv_ruleCustom= ruleCustom EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2012:2: iv_ruleCustom= ruleCustom EOF
            {
             newCompositeNode(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_ruleCustom_in_entryRuleCustom4471);
            iv_ruleCustom=ruleCustom();

            state._fsp--;

             current =iv_ruleCustom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustom4481); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2019:1: ruleCustom returns [EObject current=null] : (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) ;
    public final EObject ruleCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_composite_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_features_5_0 = null;

        Enumerator lv_layout_7_0 = null;

        EObject lv_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2022:28: ( (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2023:1: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2023:1: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2023:3: otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleCustom4518); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomAccess().getFigureKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2027:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2028:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2028:1: (otherlv_1= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2029:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustom4538); 

            		newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getFigureCustomFigureCrossReference_1_0()); 
            	

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2040:2: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2040:3: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2040:3: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2041:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2041:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2042:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,31,FOLLOW_31_in_ruleCustom4557); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getCustomAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2055:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2056:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2056:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2057:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustom4590); 

                    		newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleCustom4604); 

                	newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2072:1: ( (lv_features_5_0= ruleLinkedFeature ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==36||LA33_0==50) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2073:1: (lv_features_5_0= ruleLinkedFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2073:1: (lv_features_5_0= ruleLinkedFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2074:3: lv_features_5_0= ruleLinkedFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomAccess().getFeaturesLinkedFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkedFeature_in_ruleCustom4625);
            	    lv_features_5_0=ruleLinkedFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"LinkedFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2090:3: ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2090:4: ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2090:4: ( (lv_composite_6_0= 'children' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2091:1: (lv_composite_6_0= 'children' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2091:1: (lv_composite_6_0= 'children' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2092:3: lv_composite_6_0= 'children'
                    {
                    lv_composite_6_0=(Token)match(input,42,FOLLOW_42_in_ruleCustom4645); 

                            newLeafNode(lv_composite_6_0, grammarAccess.getCustomAccess().getCompositeChildrenKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomRule());
                    	        }
                           		setWithLastConsumed(current, "composite", true, "children");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2105:2: ( (lv_layout_7_0= ruleContainerLayout ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==70||(LA34_0>=90 && LA34_0<=91)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2106:1: (lv_layout_7_0= ruleContainerLayout )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2106:1: (lv_layout_7_0= ruleContainerLayout )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2107:3: lv_layout_7_0= ruleContainerLayout
                            {
                             
                            	        newCompositeNode(grammarAccess.getCustomAccess().getLayoutContainerLayoutEnumRuleCall_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContainerLayout_in_ruleCustom4679);
                            lv_layout_7_0=ruleContainerLayout();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCustomRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"layout",
                                    		lv_layout_7_0, 
                                    		"ContainerLayout");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleCustom4692); 

                        	newLeafNode(otherlv_8, grammarAccess.getCustomAccess().getColonKeyword_5_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2127:1: ( (lv_children_9_0= ruleConnectableElement ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==40||(LA35_0>=43 && LA35_0<=49)||LA35_0==52||(LA35_0>=54 && LA35_0<=55)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2128:1: (lv_children_9_0= ruleConnectableElement )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2128:1: (lv_children_9_0= ruleConnectableElement )
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2129:3: lv_children_9_0= ruleConnectableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCustomAccess().getChildrenConnectableElementParserRuleCall_5_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnectableElement_in_ruleCustom4713);
                    	    lv_children_9_0=ruleConnectableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCustomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"ConnectableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleCustom4728); 

                	newLeafNode(otherlv_10, grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2157:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2158:2: (iv_ruleRectangle= ruleRectangle EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2159:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_ruleRectangle_in_entryRuleRectangle4764);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRectangle4774); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2166:1: ruleRectangle returns [EObject current=null] : ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token lv_rectangle_0_0=null;
        Token lv_square_1_0=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_composite_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_features_5_0 = null;

        Enumerator lv_layout_7_0 = null;

        EObject lv_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2169:28: ( ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2170:1: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2170:1: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2170:2: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2170:2: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            else if ( (LA37_0==44) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2170:3: ( (lv_rectangle_0_0= 'rectangle' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2170:3: ( (lv_rectangle_0_0= 'rectangle' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2171:1: (lv_rectangle_0_0= 'rectangle' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2171:1: (lv_rectangle_0_0= 'rectangle' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2172:3: lv_rectangle_0_0= 'rectangle'
                    {
                    lv_rectangle_0_0=(Token)match(input,43,FOLLOW_43_in_ruleRectangle4818); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2186:6: ( (lv_square_1_0= 'square' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2186:6: ( (lv_square_1_0= 'square' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2187:1: (lv_square_1_0= 'square' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2187:1: (lv_square_1_0= 'square' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2188:3: lv_square_1_0= 'square'
                    {
                    lv_square_1_0=(Token)match(input,44,FOLLOW_44_in_ruleRectangle4855); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2201:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2201:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2201:4: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2202:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2202:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2203:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,31,FOLLOW_31_in_ruleRectangle4888); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getRectangleAccess().getStyledPlusSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRectangleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2216:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2217:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2217:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2218:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRectangleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRectangle4921); 

                    		newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getStyleStyleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleRectangle4935); 

                	newLeafNode(otherlv_4, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2233:1: ( (lv_features_5_0= ruleRectangleFeature ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36||LA39_0==50||(LA39_0>=56 && LA39_0<=57)||LA39_0==59||(LA39_0>=62 && LA39_0<=63)||(LA39_0>=68 && LA39_0<=69)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2234:1: (lv_features_5_0= ruleRectangleFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2234:1: (lv_features_5_0= ruleRectangleFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2235:3: lv_features_5_0= ruleRectangleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRectangleAccess().getFeaturesRectangleFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRectangleFeature_in_ruleRectangle4956);
            	    lv_features_5_0=ruleRectangleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"RectangleFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2251:3: ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2251:4: ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2251:4: ( (lv_composite_6_0= 'children' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2252:1: (lv_composite_6_0= 'children' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2252:1: (lv_composite_6_0= 'children' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2253:3: lv_composite_6_0= 'children'
                    {
                    lv_composite_6_0=(Token)match(input,42,FOLLOW_42_in_ruleRectangle4976); 

                            newLeafNode(lv_composite_6_0, grammarAccess.getRectangleAccess().getCompositeChildrenKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRectangleRule());
                    	        }
                           		setWithLastConsumed(current, "composite", true, "children");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2266:2: ( (lv_layout_7_0= ruleContainerLayout ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==70||(LA40_0>=90 && LA40_0<=91)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2267:1: (lv_layout_7_0= ruleContainerLayout )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2267:1: (lv_layout_7_0= ruleContainerLayout )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2268:3: lv_layout_7_0= ruleContainerLayout
                            {
                             
                            	        newCompositeNode(grammarAccess.getRectangleAccess().getLayoutContainerLayoutEnumRuleCall_4_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContainerLayout_in_ruleRectangle5010);
                            lv_layout_7_0=ruleContainerLayout();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRectangleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"layout",
                                    		lv_layout_7_0, 
                                    		"ContainerLayout");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleRectangle5023); 

                        	newLeafNode(otherlv_8, grammarAccess.getRectangleAccess().getColonKeyword_4_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2288:1: ( (lv_children_9_0= ruleConnectableElement ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==40||(LA41_0>=43 && LA41_0<=49)||LA41_0==52||(LA41_0>=54 && LA41_0<=55)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2289:1: (lv_children_9_0= ruleConnectableElement )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2289:1: (lv_children_9_0= ruleConnectableElement )
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2290:3: lv_children_9_0= ruleConnectableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRectangleAccess().getChildrenConnectableElementParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnectableElement_in_ruleRectangle5044);
                    	    lv_children_9_0=ruleConnectableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRectangleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"ConnectableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleRectangle5059); 

                	newLeafNode(otherlv_10, grammarAccess.getRectangleAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2318:1: entryRuleRectangleFeature returns [EObject current=null] : iv_ruleRectangleFeature= ruleRectangleFeature EOF ;
    public final EObject entryRuleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2319:2: (iv_ruleRectangleFeature= ruleRectangleFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2320:2: iv_ruleRectangleFeature= ruleRectangleFeature EOF
            {
             newCompositeNode(grammarAccess.getRectangleFeatureRule()); 
            pushFollow(FOLLOW_ruleRectangleFeature_in_entryRuleRectangleFeature5095);
            iv_ruleRectangleFeature=ruleRectangleFeature();

            state._fsp--;

             current =iv_ruleRectangleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRectangleFeature5105); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2327:1: ruleRectangleFeature returns [EObject current=null] : (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) ;
    public final EObject ruleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElementFeature_0 = null;

        EObject this_Corner_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2330:28: ( (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2331:1: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2331:1: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36||LA43_0==50||(LA43_0>=56 && LA43_0<=57)||LA43_0==59||LA43_0==62||(LA43_0>=68 && LA43_0<=69)) ) {
                alt43=1;
            }
            else if ( (LA43_0==63) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2332:5: this_ConnectableElementFeature_0= ruleConnectableElementFeature
                    {
                     
                            newCompositeNode(grammarAccess.getRectangleFeatureAccess().getConnectableElementFeatureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConnectableElementFeature_in_ruleRectangleFeature5152);
                    this_ConnectableElementFeature_0=ruleConnectableElementFeature();

                    state._fsp--;

                     
                            current = this_ConnectableElementFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2342:5: this_Corner_1= ruleCorner
                    {
                     
                            newCompositeNode(grammarAccess.getRectangleFeatureAccess().getCornerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCorner_in_ruleRectangleFeature5179);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2358:1: entryRuleRhombus returns [EObject current=null] : iv_ruleRhombus= ruleRhombus EOF ;
    public final EObject entryRuleRhombus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhombus = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2359:2: (iv_ruleRhombus= ruleRhombus EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2360:2: iv_ruleRhombus= ruleRhombus EOF
            {
             newCompositeNode(grammarAccess.getRhombusRule()); 
            pushFollow(FOLLOW_ruleRhombus_in_entryRuleRhombus5214);
            iv_ruleRhombus=ruleRhombus();

            state._fsp--;

             current =iv_ruleRhombus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRhombus5224); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2367:1: ruleRhombus returns [EObject current=null] : ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) ;
    public final EObject ruleRhombus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_composite_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_features_5_0 = null;

        Enumerator lv_layout_7_0 = null;

        EObject lv_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2370:28: ( ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2371:1: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2371:1: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2371:2: () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2371:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2372:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRhombusAccess().getRhombusAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleRhombus5270); 

                	newLeafNode(otherlv_1, grammarAccess.getRhombusAccess().getRhombusKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2381:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==31) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2381:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2381:2: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2382:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2382:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2383:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,31,FOLLOW_31_in_ruleRhombus5289); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getRhombusAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRhombusRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2396:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2397:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2397:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2398:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRhombusRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRhombus5322); 

                    		newLeafNode(otherlv_3, grammarAccess.getRhombusAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleRhombus5336); 

                	newLeafNode(otherlv_4, grammarAccess.getRhombusAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2413:1: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==36||LA45_0==50||(LA45_0>=56 && LA45_0<=57)||LA45_0==59||LA45_0==62||(LA45_0>=68 && LA45_0<=69)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2414:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2414:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2415:3: lv_features_5_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRhombusAccess().getFeaturesConnectableElementFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectableElementFeature_in_ruleRhombus5357);
            	    lv_features_5_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRhombusRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"ConnectableElementFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2431:3: ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2431:4: ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2431:4: ( (lv_composite_6_0= 'children' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2432:1: (lv_composite_6_0= 'children' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2432:1: (lv_composite_6_0= 'children' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2433:3: lv_composite_6_0= 'children'
                    {
                    lv_composite_6_0=(Token)match(input,42,FOLLOW_42_in_ruleRhombus5377); 

                            newLeafNode(lv_composite_6_0, grammarAccess.getRhombusAccess().getCompositeChildrenKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRhombusRule());
                    	        }
                           		setWithLastConsumed(current, "composite", true, "children");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2446:2: ( (lv_layout_7_0= ruleContainerLayout ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==70||(LA46_0>=90 && LA46_0<=91)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2447:1: (lv_layout_7_0= ruleContainerLayout )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2447:1: (lv_layout_7_0= ruleContainerLayout )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2448:3: lv_layout_7_0= ruleContainerLayout
                            {
                             
                            	        newCompositeNode(grammarAccess.getRhombusAccess().getLayoutContainerLayoutEnumRuleCall_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContainerLayout_in_ruleRhombus5411);
                            lv_layout_7_0=ruleContainerLayout();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRhombusRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"layout",
                                    		lv_layout_7_0, 
                                    		"ContainerLayout");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleRhombus5424); 

                        	newLeafNode(otherlv_8, grammarAccess.getRhombusAccess().getColonKeyword_5_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2468:1: ( (lv_children_9_0= ruleConnectableElement ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==40||(LA47_0>=43 && LA47_0<=49)||LA47_0==52||(LA47_0>=54 && LA47_0<=55)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2469:1: (lv_children_9_0= ruleConnectableElement )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2469:1: (lv_children_9_0= ruleConnectableElement )
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2470:3: lv_children_9_0= ruleConnectableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRhombusAccess().getChildrenConnectableElementParserRuleCall_5_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnectableElement_in_ruleRhombus5445);
                    	    lv_children_9_0=ruleConnectableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRhombusRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"ConnectableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleRhombus5460); 

                	newLeafNode(otherlv_10, grammarAccess.getRhombusAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2498:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2499:2: (iv_ruleEllipse= ruleEllipse EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2500:2: iv_ruleEllipse= ruleEllipse EOF
            {
             newCompositeNode(grammarAccess.getEllipseRule()); 
            pushFollow(FOLLOW_ruleEllipse_in_entryRuleEllipse5496);
            iv_ruleEllipse=ruleEllipse();

            state._fsp--;

             current =iv_ruleEllipse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEllipse5506); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2507:1: ruleEllipse returns [EObject current=null] : ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) ;
    public final EObject ruleEllipse() throws RecognitionException {
        EObject current = null;

        Token lv_ellipse_0_0=null;
        Token lv_circle_1_0=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_composite_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_features_5_0 = null;

        Enumerator lv_layout_7_0 = null;

        EObject lv_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2510:28: ( ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2511:1: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2511:1: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2511:2: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2511:2: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            else if ( (LA49_0==47) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2511:3: ( (lv_ellipse_0_0= 'ellipse' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2511:3: ( (lv_ellipse_0_0= 'ellipse' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2512:1: (lv_ellipse_0_0= 'ellipse' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2512:1: (lv_ellipse_0_0= 'ellipse' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2513:3: lv_ellipse_0_0= 'ellipse'
                    {
                    lv_ellipse_0_0=(Token)match(input,46,FOLLOW_46_in_ruleEllipse5550); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2527:6: ( (lv_circle_1_0= 'circle' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2527:6: ( (lv_circle_1_0= 'circle' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2528:1: (lv_circle_1_0= 'circle' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2528:1: (lv_circle_1_0= 'circle' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2529:3: lv_circle_1_0= 'circle'
                    {
                    lv_circle_1_0=(Token)match(input,47,FOLLOW_47_in_ruleEllipse5587); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2542:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==31) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2542:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2542:4: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2543:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2543:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2544:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,31,FOLLOW_31_in_ruleEllipse5620); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getEllipseAccess().getStyledPlusSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEllipseRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2557:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2558:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2558:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2559:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEllipseRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEllipse5653); 

                    		newLeafNode(otherlv_3, grammarAccess.getEllipseAccess().getStyleStyleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEllipse5667); 

                	newLeafNode(otherlv_4, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2574:1: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==36||LA51_0==50||(LA51_0>=56 && LA51_0<=57)||LA51_0==59||LA51_0==62||(LA51_0>=68 && LA51_0<=69)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2575:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2575:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2576:3: lv_features_5_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEllipseAccess().getFeaturesConnectableElementFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectableElementFeature_in_ruleEllipse5688);
            	    lv_features_5_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"ConnectableElementFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2592:3: ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==42) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2592:4: ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2592:4: ( (lv_composite_6_0= 'children' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2593:1: (lv_composite_6_0= 'children' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2593:1: (lv_composite_6_0= 'children' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2594:3: lv_composite_6_0= 'children'
                    {
                    lv_composite_6_0=(Token)match(input,42,FOLLOW_42_in_ruleEllipse5708); 

                            newLeafNode(lv_composite_6_0, grammarAccess.getEllipseAccess().getCompositeChildrenKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEllipseRule());
                    	        }
                           		setWithLastConsumed(current, "composite", true, "children");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2607:2: ( (lv_layout_7_0= ruleContainerLayout ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==70||(LA52_0>=90 && LA52_0<=91)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2608:1: (lv_layout_7_0= ruleContainerLayout )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2608:1: (lv_layout_7_0= ruleContainerLayout )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2609:3: lv_layout_7_0= ruleContainerLayout
                            {
                             
                            	        newCompositeNode(grammarAccess.getEllipseAccess().getLayoutContainerLayoutEnumRuleCall_4_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContainerLayout_in_ruleEllipse5742);
                            lv_layout_7_0=ruleContainerLayout();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getEllipseRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"layout",
                                    		lv_layout_7_0, 
                                    		"ContainerLayout");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleEllipse5755); 

                        	newLeafNode(otherlv_8, grammarAccess.getEllipseAccess().getColonKeyword_4_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2629:1: ( (lv_children_9_0= ruleConnectableElement ) )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==40||(LA53_0>=43 && LA53_0<=49)||LA53_0==52||(LA53_0>=54 && LA53_0<=55)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2630:1: (lv_children_9_0= ruleConnectableElement )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2630:1: (lv_children_9_0= ruleConnectableElement )
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2631:3: lv_children_9_0= ruleConnectableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEllipseAccess().getChildrenConnectableElementParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnectableElement_in_ruleEllipse5776);
                    	    lv_children_9_0=ruleConnectableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEllipseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"ConnectableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleEllipse5791); 

                	newLeafNode(otherlv_10, grammarAccess.getEllipseAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2659:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2660:2: (iv_rulePolyline= rulePolyline EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2661:2: iv_rulePolyline= rulePolyline EOF
            {
             newCompositeNode(grammarAccess.getPolylineRule()); 
            pushFollow(FOLLOW_rulePolyline_in_entryRulePolyline5827);
            iv_rulePolyline=rulePolyline();

            state._fsp--;

             current =iv_rulePolyline; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolyline5837); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2668:1: rulePolyline returns [EObject current=null] : ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_9_0= 'children' ) ) ( (lv_layout_10_0= ruleContainerLayout ) )? otherlv_11= ':' ( (lv_children_12_0= ruleConnectableElement ) )+ )? otherlv_13= '}' ) ;
    public final EObject rulePolyline() throws RecognitionException {
        EObject current = null;

        Token lv_polygon_0_0=null;
        Token lv_polyline_1_0=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_composite_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_features_5_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_features_8_0 = null;

        Enumerator lv_layout_10_0 = null;

        EObject lv_children_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2671:28: ( ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_9_0= 'children' ) ) ( (lv_layout_10_0= ruleContainerLayout ) )? otherlv_11= ':' ( (lv_children_12_0= ruleConnectableElement ) )+ )? otherlv_13= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2672:1: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_9_0= 'children' ) ) ( (lv_layout_10_0= ruleContainerLayout ) )? otherlv_11= ':' ( (lv_children_12_0= ruleConnectableElement ) )+ )? otherlv_13= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2672:1: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_9_0= 'children' ) ) ( (lv_layout_10_0= ruleContainerLayout ) )? otherlv_11= ':' ( (lv_children_12_0= ruleConnectableElement ) )+ )? otherlv_13= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2672:2: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* ( ( (lv_composite_9_0= 'children' ) ) ( (lv_layout_10_0= ruleContainerLayout ) )? otherlv_11= ':' ( (lv_children_12_0= ruleConnectableElement ) )+ )? otherlv_13= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2672:2: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==48) ) {
                alt55=1;
            }
            else if ( (LA55_0==49) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2672:3: ( (lv_polygon_0_0= 'polygon' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2672:3: ( (lv_polygon_0_0= 'polygon' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2673:1: (lv_polygon_0_0= 'polygon' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2673:1: (lv_polygon_0_0= 'polygon' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2674:3: lv_polygon_0_0= 'polygon'
                    {
                    lv_polygon_0_0=(Token)match(input,48,FOLLOW_48_in_rulePolyline5881); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2688:6: ( (lv_polyline_1_0= 'polyline' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2688:6: ( (lv_polyline_1_0= 'polyline' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2689:1: (lv_polyline_1_0= 'polyline' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2689:1: (lv_polyline_1_0= 'polyline' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2690:3: lv_polyline_1_0= 'polyline'
                    {
                    lv_polyline_1_0=(Token)match(input,49,FOLLOW_49_in_rulePolyline5918); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2703:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==31) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2703:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2703:4: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2704:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2704:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2705:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,31,FOLLOW_31_in_rulePolyline5951); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getPolylineAccess().getStyledPlusSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolylineRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2718:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2719:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2719:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2720:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolylineRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePolyline5984); 

                    		newLeafNode(otherlv_3, grammarAccess.getPolylineAccess().getStyleStyleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePolyline5998); 

                	newLeafNode(otherlv_4, grammarAccess.getPolylineAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2735:1: ( (lv_features_5_0= rulePoint ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2736:1: (lv_features_5_0= rulePoint )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2736:1: (lv_features_5_0= rulePoint )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2737:3: lv_features_5_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_rulePolyline6019);
            lv_features_5_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_5_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2753:2: ( (lv_features_6_0= rulePoint ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2754:1: (lv_features_6_0= rulePoint )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2754:1: (lv_features_6_0= rulePoint )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2755:3: lv_features_6_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_rulePolyline6040);
            lv_features_6_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_6_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2771:2: ( (lv_features_7_0= rulePoint ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==61) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2772:1: (lv_features_7_0= rulePoint )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2772:1: (lv_features_7_0= rulePoint )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2773:3: lv_features_7_0= rulePoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoint_in_rulePolyline6061);
            	    lv_features_7_0=rulePoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_7_0, 
            	            		"Point");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2789:3: ( (lv_features_8_0= ruleConnectableElementFeature ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==36||LA58_0==50||(LA58_0>=56 && LA58_0<=57)||LA58_0==59||LA58_0==62||(LA58_0>=68 && LA58_0<=69)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2790:1: (lv_features_8_0= ruleConnectableElementFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2790:1: (lv_features_8_0= ruleConnectableElementFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2791:3: lv_features_8_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesConnectableElementFeatureParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectableElementFeature_in_rulePolyline6083);
            	    lv_features_8_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_8_0, 
            	            		"ConnectableElementFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2807:3: ( ( (lv_composite_9_0= 'children' ) ) ( (lv_layout_10_0= ruleContainerLayout ) )? otherlv_11= ':' ( (lv_children_12_0= ruleConnectableElement ) )+ )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==42) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2807:4: ( (lv_composite_9_0= 'children' ) ) ( (lv_layout_10_0= ruleContainerLayout ) )? otherlv_11= ':' ( (lv_children_12_0= ruleConnectableElement ) )+
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2807:4: ( (lv_composite_9_0= 'children' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2808:1: (lv_composite_9_0= 'children' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2808:1: (lv_composite_9_0= 'children' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2809:3: lv_composite_9_0= 'children'
                    {
                    lv_composite_9_0=(Token)match(input,42,FOLLOW_42_in_rulePolyline6103); 

                            newLeafNode(lv_composite_9_0, grammarAccess.getPolylineAccess().getCompositeChildrenKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolylineRule());
                    	        }
                           		setWithLastConsumed(current, "composite", true, "children");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2822:2: ( (lv_layout_10_0= ruleContainerLayout ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==70||(LA59_0>=90 && LA59_0<=91)) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2823:1: (lv_layout_10_0= ruleContainerLayout )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2823:1: (lv_layout_10_0= ruleContainerLayout )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2824:3: lv_layout_10_0= ruleContainerLayout
                            {
                             
                            	        newCompositeNode(grammarAccess.getPolylineAccess().getLayoutContainerLayoutEnumRuleCall_7_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContainerLayout_in_rulePolyline6137);
                            lv_layout_10_0=ruleContainerLayout();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPolylineRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"layout",
                                    		lv_layout_10_0, 
                                    		"ContainerLayout");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,24,FOLLOW_24_in_rulePolyline6150); 

                        	newLeafNode(otherlv_11, grammarAccess.getPolylineAccess().getColonKeyword_7_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2844:1: ( (lv_children_12_0= ruleConnectableElement ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==40||(LA60_0>=43 && LA60_0<=49)||LA60_0==52||(LA60_0>=54 && LA60_0<=55)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2845:1: (lv_children_12_0= ruleConnectableElement )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2845:1: (lv_children_12_0= ruleConnectableElement )
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2846:3: lv_children_12_0= ruleConnectableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPolylineAccess().getChildrenConnectableElementParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnectableElement_in_rulePolyline6171);
                    	    lv_children_12_0=ruleConnectableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPolylineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_12_0, 
                    	            		"ConnectableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_rulePolyline6186); 

                	newLeafNode(otherlv_13, grammarAccess.getPolylineAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleContains"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2874:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2875:2: (iv_ruleContains= ruleContains EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2876:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_ruleContains_in_entryRuleContains6222);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContains6232); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2883:1: ruleContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? ( (lv_layout_3_0= ruleContainerLayout ) )? otherlv_4= ';' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_conditional_2_0 = null;

        Enumerator lv_layout_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2886:28: ( (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? ( (lv_layout_3_0= ruleContainerLayout ) )? otherlv_4= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2887:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? ( (lv_layout_3_0= ruleContainerLayout ) )? otherlv_4= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2887:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? ( (lv_layout_3_0= ruleContainerLayout ) )? otherlv_4= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2887:3: otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? ( (lv_layout_3_0= ruleContainerLayout ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleContains6269); 

                	newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2891:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2892:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2892:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2893:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainsAccess().getModelReferenceEReferenceCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContains6292);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2906:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==22) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2907:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2907:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2908:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainsAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleContains6313);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainsRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2924:3: ( (lv_layout_3_0= ruleContainerLayout ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==70||(LA63_0>=90 && LA63_0<=91)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2925:1: (lv_layout_3_0= ruleContainerLayout )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2925:1: (lv_layout_3_0= ruleContainerLayout )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2926:3: lv_layout_3_0= ruleContainerLayout
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainsAccess().getLayoutContainerLayoutEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainerLayout_in_ruleContains6335);
                    lv_layout_3_0=ruleContainerLayout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainsRule());
                    	        }
                           		set(
                           			current, 
                           			"layout",
                            		lv_layout_3_0, 
                            		"ContainerLayout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleContains6348); 

                	newLeafNode(otherlv_4, grammarAccess.getContainsAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2954:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2955:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2956:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue6384);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue6394); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2963:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_DoubleValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_EnumValue_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2966:28: ( (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2967:1: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2967:1: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            int alt64=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==14) ) {
                    alt64=2;
                }
                else if ( (LA64_1==EOF||LA64_1==37||LA64_1==70||(LA64_1>=90 && LA64_1<=91)) ) {
                    alt64=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 51:
                {
                alt64=3;
                }
                break;
            case 94:
            case 95:
                {
                alt64=4;
                }
                break;
            case RULE_ID:
                {
                alt64=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2968:5: this_IntValue_0= ruleIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue6441);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;

                     
                            current = this_IntValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2978:5: this_DoubleValue_1= ruleDoubleValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDoubleValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDoubleValue_in_ruleValue6468);
                    this_DoubleValue_1=ruleDoubleValue();

                    state._fsp--;

                     
                            current = this_DoubleValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2988:5: this_StringValue_2= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue6495);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2998:5: this_BooleanValue_3= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue6522);
                    this_BooleanValue_3=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3008:5: this_EnumValue_4= ruleEnumValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getEnumValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEnumValue_in_ruleValue6549);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3024:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3025:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3026:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue6584);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue6594); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3033:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3036:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3037:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3037:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3038:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3038:1: (lv_value_0_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3039:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue6635); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3063:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3064:2: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3065:2: iv_ruleDoubleValue= ruleDoubleValue EOF
            {
             newCompositeNode(grammarAccess.getDoubleValueRule()); 
            pushFollow(FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue6675);
            iv_ruleDoubleValue=ruleDoubleValue();

            state._fsp--;

             current =iv_ruleDoubleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleValue6685); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3072:1: ruleDoubleValue returns [EObject current=null] : ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueInt_0_0=null;
        Token otherlv_1=null;
        Token lv_valueDecimal_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3075:28: ( ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3076:1: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3076:1: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3076:2: ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3076:2: ( (lv_valueInt_0_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3077:1: (lv_valueInt_0_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3077:1: (lv_valueInt_0_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3078:3: lv_valueInt_0_0= RULE_INT
            {
            lv_valueInt_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleValue6727); 

            			newLeafNode(lv_valueInt_0_0, grammarAccess.getDoubleValueAccess().getValueIntINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoubleValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valueInt",
                    		lv_valueInt_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDoubleValue6744); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleValueAccess().getFullStopKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3098:1: ( (lv_valueDecimal_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3099:1: (lv_valueDecimal_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3099:1: (lv_valueDecimal_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3100:3: lv_valueDecimal_2_0= RULE_INT
            {
            lv_valueDecimal_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleValue6761); 

            			newLeafNode(lv_valueDecimal_2_0, grammarAccess.getDoubleValueAccess().getValueDecimalINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoubleValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valueDecimal",
                    		lv_valueDecimal_2_0, 
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
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3124:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3125:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3126:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue6802);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue6812); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3133:1: ruleStringValue returns [EObject current=null] : ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_null_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3136:28: ( ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3137:1: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3137:1: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==51) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_STRING) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3137:2: ( (lv_null_0_0= 'null' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3137:2: ( (lv_null_0_0= 'null' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3138:1: (lv_null_0_0= 'null' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3138:1: (lv_null_0_0= 'null' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3139:3: lv_null_0_0= 'null'
                    {
                    lv_null_0_0=(Token)match(input,51,FOLLOW_51_in_ruleStringValue6855); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3153:6: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3153:6: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3154:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3154:1: (lv_value_1_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3155:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue6891); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"STRING");
                    	    

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3179:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3180:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3181:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6932);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue6942); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3188:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteral ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3191:28: ( ( (lv_value_0_0= ruleBooleanLiteral ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3192:1: ( (lv_value_0_0= ruleBooleanLiteral ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3192:1: ( (lv_value_0_0= ruleBooleanLiteral ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3193:1: (lv_value_0_0= ruleBooleanLiteral )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3193:1: (lv_value_0_0= ruleBooleanLiteral )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3194:3: lv_value_0_0= ruleBooleanLiteral
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueBooleanLiteralEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanValue6987);
            lv_value_0_0=ruleBooleanLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"BooleanLiteral");
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3218:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3219:2: (iv_ruleEnumValue= ruleEnumValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3220:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_ruleEnumValue_in_entryRuleEnumValue7022);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumValue7032); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3227:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3230:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3231:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3231:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3232:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3232:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3233:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumValue7073); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3259:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3260:2: (iv_ruleLabel= ruleLabel EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3261:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel7115);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel7125); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3268:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLabelFeature ) )* ( ( (lv_composite_7_0= 'children' ) ) ( (lv_layout_8_0= ruleContainerLayout ) )? otherlv_9= ':' ( (lv_children_10_0= ruleConnectableElement ) )+ )? otherlv_11= '}' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_editable_2_0=null;
        Token lv_styled_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_composite_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_features_6_0 = null;

        Enumerator lv_layout_8_0 = null;

        EObject lv_children_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3271:28: ( ( () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLabelFeature ) )* ( ( (lv_composite_7_0= 'children' ) ) ( (lv_layout_8_0= ruleContainerLayout ) )? otherlv_9= ':' ( (lv_children_10_0= ruleConnectableElement ) )+ )? otherlv_11= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3272:1: ( () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLabelFeature ) )* ( ( (lv_composite_7_0= 'children' ) ) ( (lv_layout_8_0= ruleContainerLayout ) )? otherlv_9= ':' ( (lv_children_10_0= ruleConnectableElement ) )+ )? otherlv_11= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3272:1: ( () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLabelFeature ) )* ( ( (lv_composite_7_0= 'children' ) ) ( (lv_layout_8_0= ruleContainerLayout ) )? otherlv_9= ':' ( (lv_children_10_0= ruleConnectableElement ) )+ )? otherlv_11= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3272:2: () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLabelFeature ) )* ( ( (lv_composite_7_0= 'children' ) ) ( (lv_layout_8_0= ruleContainerLayout ) )? otherlv_9= ':' ( (lv_children_10_0= ruleConnectableElement ) )+ )? otherlv_11= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3272:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3273:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLabelAccess().getLabelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleLabel7171); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3282:1: ( (lv_editable_2_0= 'editable' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==53) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3283:1: (lv_editable_2_0= 'editable' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3283:1: (lv_editable_2_0= 'editable' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3284:3: lv_editable_2_0= 'editable'
                    {
                    lv_editable_2_0=(Token)match(input,53,FOLLOW_53_in_ruleLabel7189); 

                            newLeafNode(lv_editable_2_0, grammarAccess.getLabelAccess().getEditableEditableKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(current, "editable", true, "editable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3297:3: ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==31) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3297:4: ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3297:4: ( (lv_styled_3_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3298:1: (lv_styled_3_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3298:1: (lv_styled_3_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3299:3: lv_styled_3_0= '+'
                    {
                    lv_styled_3_0=(Token)match(input,31,FOLLOW_31_in_ruleLabel7222); 

                            newLeafNode(lv_styled_3_0, grammarAccess.getLabelAccess().getStyledPlusSignKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3312:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3313:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3313:1: (otherlv_4= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3314:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel7255); 

                    		newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getStyleStyleCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleLabel7269); 

                	newLeafNode(otherlv_5, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3329:1: ( (lv_features_6_0= ruleLabelFeature ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=56 && LA68_0<=57)||LA68_0==59||LA68_0==62||(LA68_0>=64 && LA68_0<=67)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3330:1: (lv_features_6_0= ruleLabelFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3330:1: (lv_features_6_0= ruleLabelFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3331:3: lv_features_6_0= ruleLabelFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelAccess().getFeaturesLabelFeatureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabelFeature_in_ruleLabel7290);
            	    lv_features_6_0=ruleLabelFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_6_0, 
            	            		"LabelFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3347:3: ( ( (lv_composite_7_0= 'children' ) ) ( (lv_layout_8_0= ruleContainerLayout ) )? otherlv_9= ':' ( (lv_children_10_0= ruleConnectableElement ) )+ )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==42) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3347:4: ( (lv_composite_7_0= 'children' ) ) ( (lv_layout_8_0= ruleContainerLayout ) )? otherlv_9= ':' ( (lv_children_10_0= ruleConnectableElement ) )+
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3347:4: ( (lv_composite_7_0= 'children' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3348:1: (lv_composite_7_0= 'children' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3348:1: (lv_composite_7_0= 'children' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3349:3: lv_composite_7_0= 'children'
                    {
                    lv_composite_7_0=(Token)match(input,42,FOLLOW_42_in_ruleLabel7310); 

                            newLeafNode(lv_composite_7_0, grammarAccess.getLabelAccess().getCompositeChildrenKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(current, "composite", true, "children");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3362:2: ( (lv_layout_8_0= ruleContainerLayout ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==70||(LA69_0>=90 && LA69_0<=91)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3363:1: (lv_layout_8_0= ruleContainerLayout )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3363:1: (lv_layout_8_0= ruleContainerLayout )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3364:3: lv_layout_8_0= ruleContainerLayout
                            {
                             
                            	        newCompositeNode(grammarAccess.getLabelAccess().getLayoutContainerLayoutEnumRuleCall_6_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContainerLayout_in_ruleLabel7344);
                            lv_layout_8_0=ruleContainerLayout();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLabelRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"layout",
                                    		lv_layout_8_0, 
                                    		"ContainerLayout");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleLabel7357); 

                        	newLeafNode(otherlv_9, grammarAccess.getLabelAccess().getColonKeyword_6_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3384:1: ( (lv_children_10_0= ruleConnectableElement ) )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==40||(LA70_0>=43 && LA70_0<=49)||LA70_0==52||(LA70_0>=54 && LA70_0<=55)) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3385:1: (lv_children_10_0= ruleConnectableElement )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3385:1: (lv_children_10_0= ruleConnectableElement )
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3386:3: lv_children_10_0= ruleConnectableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLabelAccess().getChildrenConnectableElementParserRuleCall_6_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnectableElement_in_ruleLabel7378);
                    	    lv_children_10_0=ruleConnectableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLabelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_10_0, 
                    	            		"ConnectableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt70 >= 1 ) break loop70;
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleLabel7393); 

                	newLeafNode(otherlv_11, grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3414:1: entryRuleLabelFeature returns [EObject current=null] : iv_ruleLabelFeature= ruleLabelFeature EOF ;
    public final EObject entryRuleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3415:2: (iv_ruleLabelFeature= ruleLabelFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3416:2: iv_ruleLabelFeature= ruleLabelFeature EOF
            {
             newCompositeNode(grammarAccess.getLabelFeatureRule()); 
            pushFollow(FOLLOW_ruleLabelFeature_in_entryRuleLabelFeature7429);
            iv_ruleLabelFeature=ruleLabelFeature();

            state._fsp--;

             current =iv_ruleLabelFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelFeature7439); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3423:1: ruleLabelFeature returns [EObject current=null] : (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_Background_2= ruleBackground | this_FontFace_3= ruleFontFace | this_FontSize_4= ruleFontSize | this_FontStyle_5= ruleFontStyle | this_Size_6= ruleSize | this_Position_7= rulePosition ) ;
    public final EObject ruleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject this_TextValue_0 = null;

        EObject this_Foreground_1 = null;

        EObject this_Background_2 = null;

        EObject this_FontFace_3 = null;

        EObject this_FontSize_4 = null;

        EObject this_FontStyle_5 = null;

        EObject this_Size_6 = null;

        EObject this_Position_7 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3426:28: ( (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_Background_2= ruleBackground | this_FontFace_3= ruleFontFace | this_FontSize_4= ruleFontSize | this_FontStyle_5= ruleFontStyle | this_Size_6= ruleSize | this_Position_7= rulePosition ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3427:1: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_Background_2= ruleBackground | this_FontFace_3= ruleFontFace | this_FontSize_4= ruleFontSize | this_FontStyle_5= ruleFontStyle | this_Size_6= ruleSize | this_Position_7= rulePosition )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3427:1: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_Background_2= ruleBackground | this_FontFace_3= ruleFontFace | this_FontSize_4= ruleFontSize | this_FontStyle_5= ruleFontStyle | this_Size_6= ruleSize | this_Position_7= rulePosition )
            int alt72=8;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt72=1;
                }
                break;
            case 56:
                {
                alt72=2;
                }
                break;
            case 57:
                {
                alt72=3;
                }
                break;
            case 65:
                {
                alt72=4;
                }
                break;
            case 66:
                {
                alt72=5;
                }
                break;
            case 67:
                {
                alt72=6;
                }
                break;
            case 59:
                {
                alt72=7;
                }
                break;
            case 62:
                {
                alt72=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3428:5: this_TextValue_0= ruleTextValue
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getTextValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTextValue_in_ruleLabelFeature7486);
                    this_TextValue_0=ruleTextValue();

                    state._fsp--;

                     
                            current = this_TextValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3438:5: this_Foreground_1= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getForegroundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleLabelFeature7513);
                    this_Foreground_1=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3448:5: this_Background_2= ruleBackground
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getBackgroundParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBackground_in_ruleLabelFeature7540);
                    this_Background_2=ruleBackground();

                    state._fsp--;

                     
                            current = this_Background_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3458:5: this_FontFace_3= ruleFontFace
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getFontFaceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFontFace_in_ruleLabelFeature7567);
                    this_FontFace_3=ruleFontFace();

                    state._fsp--;

                     
                            current = this_FontFace_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3468:5: this_FontSize_4= ruleFontSize
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getFontSizeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFontSize_in_ruleLabelFeature7594);
                    this_FontSize_4=ruleFontSize();

                    state._fsp--;

                     
                            current = this_FontSize_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3478:5: this_FontStyle_5= ruleFontStyle
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getFontStyleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFontStyle_in_ruleLabelFeature7621);
                    this_FontStyle_5=ruleFontStyle();

                    state._fsp--;

                     
                            current = this_FontStyle_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3488:5: this_Size_6= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getSizeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleLabelFeature7648);
                    this_Size_6=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3498:5: this_Position_7= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getPositionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleLabelFeature7675);
                    this_Position_7=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_7; 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3514:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3515:2: (iv_ruleImage= ruleImage EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3516:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage7710);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage7720); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3523:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_imageId_1_0=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_composite_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_features_5_0 = null;

        Enumerator lv_layout_7_0 = null;

        EObject lv_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3526:28: ( (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3527:1: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3527:1: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3527:3: otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleImage7757); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3531:1: ( (lv_imageId_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3532:1: (lv_imageId_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3532:1: (lv_imageId_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3533:3: lv_imageId_1_0= RULE_ID
            {
            lv_imageId_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImage7774); 

            			newLeafNode(lv_imageId_1_0, grammarAccess.getImageAccess().getImageIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"imageId",
                    		lv_imageId_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3549:2: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==31) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3549:3: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3549:3: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3550:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3550:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3551:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,31,FOLLOW_31_in_ruleImage7798); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getImageAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3564:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3565:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3565:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3566:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImage7831); 

                    		newLeafNode(otherlv_3, grammarAccess.getImageAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleImage7845); 

                	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3581:1: ( (lv_features_5_0= ruleImageFeature ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=58 && LA74_0<=59)||LA74_0==62) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3582:1: (lv_features_5_0= ruleImageFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3582:1: (lv_features_5_0= ruleImageFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3583:3: lv_features_5_0= ruleImageFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getFeaturesImageFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImageFeature_in_ruleImage7866);
            	    lv_features_5_0=ruleImageFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"ImageFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3599:3: ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==42) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3599:4: ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3599:4: ( (lv_composite_6_0= 'children' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3600:1: (lv_composite_6_0= 'children' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3600:1: (lv_composite_6_0= 'children' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3601:3: lv_composite_6_0= 'children'
                    {
                    lv_composite_6_0=(Token)match(input,42,FOLLOW_42_in_ruleImage7886); 

                            newLeafNode(lv_composite_6_0, grammarAccess.getImageAccess().getCompositeChildrenKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                           		setWithLastConsumed(current, "composite", true, "children");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3614:2: ( (lv_layout_7_0= ruleContainerLayout ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==70||(LA75_0>=90 && LA75_0<=91)) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3615:1: (lv_layout_7_0= ruleContainerLayout )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3615:1: (lv_layout_7_0= ruleContainerLayout )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3616:3: lv_layout_7_0= ruleContainerLayout
                            {
                             
                            	        newCompositeNode(grammarAccess.getImageAccess().getLayoutContainerLayoutEnumRuleCall_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContainerLayout_in_ruleImage7920);
                            lv_layout_7_0=ruleContainerLayout();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getImageRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"layout",
                                    		lv_layout_7_0, 
                                    		"ContainerLayout");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleImage7933); 

                        	newLeafNode(otherlv_8, grammarAccess.getImageAccess().getColonKeyword_5_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3636:1: ( (lv_children_9_0= ruleConnectableElement ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==40||(LA76_0>=43 && LA76_0<=49)||LA76_0==52||(LA76_0>=54 && LA76_0<=55)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3637:1: (lv_children_9_0= ruleConnectableElement )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3637:1: (lv_children_9_0= ruleConnectableElement )
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3638:3: lv_children_9_0= ruleConnectableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImageAccess().getChildrenConnectableElementParserRuleCall_5_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnectableElement_in_ruleImage7954);
                    	    lv_children_9_0=ruleConnectableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"ConnectableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleImage7969); 

                	newLeafNode(otherlv_10, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3666:1: entryRuleImageFeature returns [EObject current=null] : iv_ruleImageFeature= ruleImageFeature EOF ;
    public final EObject entryRuleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3667:2: (iv_ruleImageFeature= ruleImageFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3668:2: iv_ruleImageFeature= ruleImageFeature EOF
            {
             newCompositeNode(grammarAccess.getImageFeatureRule()); 
            pushFollow(FOLLOW_ruleImageFeature_in_entryRuleImageFeature8005);
            iv_ruleImageFeature=ruleImageFeature();

            state._fsp--;

             current =iv_ruleImageFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageFeature8015); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3675:1: ruleImageFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) ;
    public final EObject ruleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Transparency_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3678:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3679:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3679:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt78=1;
                }
                break;
            case 62:
                {
                alt78=2;
                }
                break;
            case 58:
                {
                alt78=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3680:5: this_Size_0= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getImageFeatureAccess().getSizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleImageFeature8062);
                    this_Size_0=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3690:5: this_Position_1= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getImageFeatureAccess().getPositionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleImageFeature8089);
                    this_Position_1=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3700:5: this_Transparency_2= ruleTransparency
                    {
                     
                            newCompositeNode(grammarAccess.getImageFeatureAccess().getTransparencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTransparency_in_ruleImageFeature8116);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3716:1: entryRuleInvisible returns [EObject current=null] : iv_ruleInvisible= ruleInvisible EOF ;
    public final EObject entryRuleInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisible = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3717:2: (iv_ruleInvisible= ruleInvisible EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3718:2: iv_ruleInvisible= ruleInvisible EOF
            {
             newCompositeNode(grammarAccess.getInvisibleRule()); 
            pushFollow(FOLLOW_ruleInvisible_in_entryRuleInvisible8151);
            iv_ruleInvisible=ruleInvisible();

            state._fsp--;

             current =iv_ruleInvisible; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvisible8161); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3725:1: ruleInvisible returns [EObject current=null] : ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) ;
    public final EObject ruleInvisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_styled_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_composite_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_features_5_0 = null;

        Enumerator lv_layout_7_0 = null;

        EObject lv_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3728:28: ( ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3729:1: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3729:1: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3729:2: () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )? otherlv_10= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3729:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3730:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInvisibleAccess().getInvisibleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleInvisible8207); 

                	newLeafNode(otherlv_1, grammarAccess.getInvisibleAccess().getInvisibleKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3739:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==31) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3739:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3739:2: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3740:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3740:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3741:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,31,FOLLOW_31_in_ruleInvisible8226); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getInvisibleAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvisibleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3754:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3755:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3755:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3756:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvisibleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvisible8259); 

                    		newLeafNode(otherlv_3, grammarAccess.getInvisibleAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInvisible8273); 

                	newLeafNode(otherlv_4, grammarAccess.getInvisibleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3771:1: ( (lv_features_5_0= ruleInvisibleFeature ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==36||LA80_0==50||LA80_0==59||LA80_0==62) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3772:1: (lv_features_5_0= ruleInvisibleFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3772:1: (lv_features_5_0= ruleInvisibleFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3773:3: lv_features_5_0= ruleInvisibleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvisibleAccess().getFeaturesInvisibleFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInvisibleFeature_in_ruleInvisible8294);
            	    lv_features_5_0=ruleInvisibleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvisibleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"InvisibleFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3789:3: ( ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+ )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==42) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3789:4: ( (lv_composite_6_0= 'children' ) ) ( (lv_layout_7_0= ruleContainerLayout ) )? otherlv_8= ':' ( (lv_children_9_0= ruleConnectableElement ) )+
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3789:4: ( (lv_composite_6_0= 'children' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3790:1: (lv_composite_6_0= 'children' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3790:1: (lv_composite_6_0= 'children' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3791:3: lv_composite_6_0= 'children'
                    {
                    lv_composite_6_0=(Token)match(input,42,FOLLOW_42_in_ruleInvisible8314); 

                            newLeafNode(lv_composite_6_0, grammarAccess.getInvisibleAccess().getCompositeChildrenKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvisibleRule());
                    	        }
                           		setWithLastConsumed(current, "composite", true, "children");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3804:2: ( (lv_layout_7_0= ruleContainerLayout ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==70||(LA81_0>=90 && LA81_0<=91)) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3805:1: (lv_layout_7_0= ruleContainerLayout )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3805:1: (lv_layout_7_0= ruleContainerLayout )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3806:3: lv_layout_7_0= ruleContainerLayout
                            {
                             
                            	        newCompositeNode(grammarAccess.getInvisibleAccess().getLayoutContainerLayoutEnumRuleCall_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContainerLayout_in_ruleInvisible8348);
                            lv_layout_7_0=ruleContainerLayout();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInvisibleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"layout",
                                    		lv_layout_7_0, 
                                    		"ContainerLayout");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleInvisible8361); 

                        	newLeafNode(otherlv_8, grammarAccess.getInvisibleAccess().getColonKeyword_5_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3826:1: ( (lv_children_9_0= ruleConnectableElement ) )+
                    int cnt82=0;
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==40||(LA82_0>=43 && LA82_0<=49)||LA82_0==52||(LA82_0>=54 && LA82_0<=55)) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3827:1: (lv_children_9_0= ruleConnectableElement )
                    	    {
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3827:1: (lv_children_9_0= ruleConnectableElement )
                    	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3828:3: lv_children_9_0= ruleConnectableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInvisibleAccess().getChildrenConnectableElementParserRuleCall_5_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnectableElement_in_ruleInvisible8382);
                    	    lv_children_9_0=ruleConnectableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInvisibleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"ConnectableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt82 >= 1 ) break loop82;
                                EarlyExitException eee =
                                    new EarlyExitException(82, input);
                                throw eee;
                        }
                        cnt82++;
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleInvisible8397); 

                	newLeafNode(otherlv_10, grammarAccess.getInvisibleAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3856:1: entryRuleInvisibleFeature returns [EObject current=null] : iv_ruleInvisibleFeature= ruleInvisibleFeature EOF ;
    public final EObject entryRuleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisibleFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3857:2: (iv_ruleInvisibleFeature= ruleInvisibleFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3858:2: iv_ruleInvisibleFeature= ruleInvisibleFeature EOF
            {
             newCompositeNode(grammarAccess.getInvisibleFeatureRule()); 
            pushFollow(FOLLOW_ruleInvisibleFeature_in_entryRuleInvisibleFeature8433);
            iv_ruleInvisibleFeature=ruleInvisibleFeature();

            state._fsp--;

             current =iv_ruleInvisibleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvisibleFeature8443); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3865:1: ruleInvisibleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature ) ;
    public final EObject ruleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_LinkedFeature_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3868:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3869:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3869:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature )
            int alt84=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt84=1;
                }
                break;
            case 62:
                {
                alt84=2;
                }
                break;
            case 36:
            case 50:
                {
                alt84=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3870:5: this_Size_0= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getSizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleInvisibleFeature8490);
                    this_Size_0=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3880:5: this_Position_1= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getPositionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleInvisibleFeature8517);
                    this_Position_1=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3890:5: this_LinkedFeature_2= ruleLinkedFeature
                    {
                     
                            newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getLinkedFeatureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLinkedFeature_in_ruleInvisibleFeature8544);
                    this_LinkedFeature_2=ruleLinkedFeature();

                    state._fsp--;

                     
                            current = this_LinkedFeature_2; 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3906:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3907:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3908:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature8579);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature8589); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3915:1: ruleColorFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_Background_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3918:28: ( (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3919:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3919:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==56) ) {
                alt85=1;
            }
            else if ( (LA85_0==57) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3920:5: this_Foreground_0= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getColorFeatureAccess().getForegroundParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleColorFeature8636);
                    this_Foreground_0=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3930:5: this_Background_1= ruleBackground
                    {
                     
                            newCompositeNode(grammarAccess.getColorFeatureAccess().getBackgroundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBackground_in_ruleColorFeature8663);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3946:1: entryRuleForeground returns [EObject current=null] : iv_ruleForeground= ruleForeground EOF ;
    public final EObject entryRuleForeground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeground = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3947:2: (iv_ruleForeground= ruleForeground EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3948:2: iv_ruleForeground= ruleForeground EOF
            {
             newCompositeNode(grammarAccess.getForegroundRule()); 
            pushFollow(FOLLOW_ruleForeground_in_entryRuleForeground8698);
            iv_ruleForeground=ruleForeground();

            state._fsp--;

             current =iv_ruleForeground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeground8708); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3955:1: ruleForeground returns [EObject current=null] : ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleForeground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3958:28: ( ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3959:1: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3959:1: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3959:2: ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3959:2: ( (lv_type_0_0= 'foreground' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3960:1: (lv_type_0_0= 'foreground' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3960:1: (lv_type_0_0= 'foreground' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3961:3: lv_type_0_0= 'foreground'
            {
            lv_type_0_0=(Token)match(input,56,FOLLOW_56_in_ruleForeground8751); 

                    newLeafNode(lv_type_0_0, grammarAccess.getForegroundAccess().getTypeForegroundKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForegroundRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "foreground");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3974:2: ( (lv_color_1_0= ruleColor ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3975:1: (lv_color_1_0= ruleColor )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3975:1: (lv_color_1_0= ruleColor )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3976:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getForegroundAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleForeground8785);
            lv_color_1_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForegroundRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_1_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3992:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==22) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3993:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3993:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3994:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getForegroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleForeground8806);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForegroundRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleForeground8819); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4022:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4023:2: (iv_ruleBackground= ruleBackground EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4024:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground8855);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground8865); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4031:1: ruleBackground returns [EObject current=null] : ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4034:28: ( ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4035:1: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4035:1: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4035:2: ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4035:2: ( (lv_type_0_0= 'background' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4036:1: (lv_type_0_0= 'background' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4036:1: (lv_type_0_0= 'background' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4037:3: lv_type_0_0= 'background'
            {
            lv_type_0_0=(Token)match(input,57,FOLLOW_57_in_ruleBackground8908); 

                    newLeafNode(lv_type_0_0, grammarAccess.getBackgroundAccess().getTypeBackgroundKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBackgroundRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "background");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4050:2: ( (lv_color_1_0= ruleColor ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4051:1: (lv_color_1_0= ruleColor )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4051:1: (lv_color_1_0= ruleColor )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4052:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getBackgroundAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleBackground8942);
            lv_color_1_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_1_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4068:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==22) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4069:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4069:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4070:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getBackgroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleBackground8963);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleBackground8976); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4098:1: entryRuleTransparency returns [EObject current=null] : iv_ruleTransparency= ruleTransparency EOF ;
    public final EObject entryRuleTransparency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransparency = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4099:2: (iv_ruleTransparency= ruleTransparency EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4100:2: iv_ruleTransparency= ruleTransparency EOF
            {
             newCompositeNode(grammarAccess.getTransparencyRule()); 
            pushFollow(FOLLOW_ruleTransparency_in_entryRuleTransparency9012);
            iv_ruleTransparency=ruleTransparency();

            state._fsp--;

             current =iv_ruleTransparency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransparency9022); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4107:1: ruleTransparency returns [EObject current=null] : (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_PERCENT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleTransparency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_percent_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4110:28: ( (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_PERCENT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4111:1: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_PERCENT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4111:1: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_PERCENT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4111:3: otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_PERCENT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleTransparency9059); 

                	newLeafNode(otherlv_0, grammarAccess.getTransparencyAccess().getTransparencyKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4115:1: ( (lv_percent_1_0= RULE_PERCENT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4116:1: (lv_percent_1_0= RULE_PERCENT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4116:1: (lv_percent_1_0= RULE_PERCENT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4117:3: lv_percent_1_0= RULE_PERCENT
            {
            lv_percent_1_0=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleTransparency9076); 

            			newLeafNode(lv_percent_1_0, grammarAccess.getTransparencyAccess().getPercentPERCENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransparencyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"percent",
                    		lv_percent_1_0, 
                    		"PERCENT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4133:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==22) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4134:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4134:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4135:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransparencyAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleTransparency9102);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransparencyRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleTransparency9115); 

                	newLeafNode(otherlv_3, grammarAccess.getTransparencyAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4163:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4164:2: (iv_ruleSize= ruleSize EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4165:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize9151);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize9161); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4172:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_2=null;
        Token lv_height_3_0=null;
        Token otherlv_5=null;
        EObject lv_conditional_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4175:28: ( (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4176:1: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4176:1: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4176:3: otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleSize9198); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4180:1: ( (lv_width_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4181:1: (lv_width_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4181:1: (lv_width_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4182:3: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize9215); 

            			newLeafNode(lv_width_1_0, grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleSize9232); 

                	newLeafNode(otherlv_2, grammarAccess.getSizeAccess().getXKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4202:1: ( (lv_height_3_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4203:1: (lv_height_3_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4203:1: (lv_height_3_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4204:3: lv_height_3_0= RULE_INT
            {
            lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize9249); 

            			newLeafNode(lv_height_3_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_3_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4220:2: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==22) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4221:1: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4221:1: (lv_conditional_4_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4222:3: lv_conditional_4_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getSizeAccess().getConditionalFeatureConditionalParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleSize9275);
                    lv_conditional_4_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSizeRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_4_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleSize9288); 

                	newLeafNode(otherlv_5, grammarAccess.getSizeAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4250:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4251:2: (iv_rulePoint= rulePoint EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4252:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint9324);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint9334); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4259:1: rulePoint returns [EObject current=null] : (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_5=null;
        EObject lv_conditional_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4262:28: ( (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4263:1: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4263:1: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4263:3: otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_rulePoint9371); 

                	newLeafNode(otherlv_0, grammarAccess.getPointAccess().getPointKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4267:1: ( (lv_x_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4268:1: (lv_x_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4268:1: (lv_x_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4269:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint9388); 

            			newLeafNode(lv_x_1_0, grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_rulePoint9405); 

                	newLeafNode(otherlv_2, grammarAccess.getPointAccess().getCommaKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4289:1: ( (lv_y_3_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4290:1: (lv_y_3_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4290:1: (lv_y_3_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4291:3: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint9422); 

            			newLeafNode(lv_y_3_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_3_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4307:2: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==22) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4308:1: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4308:1: (lv_conditional_4_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4309:3: lv_conditional_4_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getPointAccess().getConditionalFeatureConditionalParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_rulePoint9448);
                    lv_conditional_4_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPointRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_4_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_rulePoint9461); 

                	newLeafNode(otherlv_5, grammarAccess.getPointAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4337:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4338:2: (iv_rulePosition= rulePosition EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4339:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_rulePosition_in_entryRulePosition9497);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosition9507); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4346:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_5=null;
        EObject lv_conditional_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4349:28: ( (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4350:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4350:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4350:3: otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_rulePosition9544); 

                	newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4354:1: ( (lv_x_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4355:1: (lv_x_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4355:1: (lv_x_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4356:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePosition9561); 

            			newLeafNode(lv_x_1_0, grammarAccess.getPositionAccess().getXINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_rulePosition9578); 

                	newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getCommaKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4376:1: ( (lv_y_3_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4377:1: (lv_y_3_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4377:1: (lv_y_3_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4378:3: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePosition9595); 

            			newLeafNode(lv_y_3_0, grammarAccess.getPositionAccess().getYINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_3_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4394:2: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==22) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4395:1: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4395:1: (lv_conditional_4_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4396:3: lv_conditional_4_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getPositionAccess().getConditionalFeatureConditionalParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_rulePosition9621);
                    lv_conditional_4_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPositionRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_4_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_rulePosition9634); 

                	newLeafNode(otherlv_5, grammarAccess.getPositionAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4424:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4425:2: (iv_ruleCorner= ruleCorner EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4426:2: iv_ruleCorner= ruleCorner EOF
            {
             newCompositeNode(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner9670);
            iv_ruleCorner=ruleCorner();

            state._fsp--;

             current =iv_ruleCorner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner9680); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4433:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4436:28: ( (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4437:1: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4437:1: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4437:3: otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleCorner9717); 

                	newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4441:1: ( (lv_angle_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4442:1: (lv_angle_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4442:1: (lv_angle_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4443:3: lv_angle_1_0= RULE_INT
            {
            lv_angle_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCorner9734); 

            			newLeafNode(lv_angle_1_0, grammarAccess.getCornerAccess().getAngleINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCornerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"angle",
                    		lv_angle_1_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4459:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==22) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4460:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4460:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4461:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getCornerAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleCorner9760);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCornerRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleCorner9773); 

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


    // $ANTLR start "entryRuleTextValue"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4489:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4490:2: (iv_ruleTextValue= ruleTextValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4491:2: iv_ruleTextValue= ruleTextValue EOF
            {
             newCompositeNode(grammarAccess.getTextValueRule()); 
            pushFollow(FOLLOW_ruleTextValue_in_entryRuleTextValue9809);
            iv_ruleTextValue=ruleTextValue();

            state._fsp--;

             current =iv_ruleTextValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextValue9819); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4498:1: ruleTextValue returns [EObject current=null] : (otherlv_0= 'text' ( ( (lv_text_1_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4501:28: ( (otherlv_0= 'text' ( ( (lv_text_1_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4502:1: (otherlv_0= 'text' ( ( (lv_text_1_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4502:1: (otherlv_0= 'text' ( ( (lv_text_1_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4502:3: otherlv_0= 'text' ( ( (lv_text_1_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleTextValue9856); 

                	newLeafNode(otherlv_0, grammarAccess.getTextValueAccess().getTextKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4506:1: ( ( (lv_text_1_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_STRING) ) {
                alt93=1;
            }
            else if ( (LA93_0==RULE_ID) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4506:2: ( (lv_text_1_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4506:2: ( (lv_text_1_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4507:1: (lv_text_1_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4507:1: (lv_text_1_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4508:3: lv_text_1_0= RULE_STRING
                    {
                    lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextValue9874); 

                    			newLeafNode(lv_text_1_0, grammarAccess.getTextValueAccess().getTextSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4525:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4525:6: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4526:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4526:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4527:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextValueRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTextValueAccess().getModelAttributeEAttributeCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTextValue9908);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4540:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==22) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4541:1: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4541:1: (lv_conditional_3_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4542:3: lv_conditional_3_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextValueAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleTextValue9930);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextValueRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_3_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleTextValue9943); 

                	newLeafNode(otherlv_4, grammarAccess.getTextValueAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleFontFace"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4570:1: entryRuleFontFace returns [EObject current=null] : iv_ruleFontFace= ruleFontFace EOF ;
    public final EObject entryRuleFontFace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontFace = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4571:2: (iv_ruleFontFace= ruleFontFace EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4572:2: iv_ruleFontFace= ruleFontFace EOF
            {
             newCompositeNode(grammarAccess.getFontFaceRule()); 
            pushFollow(FOLLOW_ruleFontFace_in_entryRuleFontFace9979);
            iv_ruleFontFace=ruleFontFace();

            state._fsp--;

             current =iv_ruleFontFace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontFace9989); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFontFace"


    // $ANTLR start "ruleFontFace"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4579:1: ruleFontFace returns [EObject current=null] : (otherlv_0= 'font-face' ( (lv_face_1_0= ruleFontFaceType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleFontFace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_face_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4582:28: ( (otherlv_0= 'font-face' ( (lv_face_1_0= ruleFontFaceType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4583:1: (otherlv_0= 'font-face' ( (lv_face_1_0= ruleFontFaceType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4583:1: (otherlv_0= 'font-face' ( (lv_face_1_0= ruleFontFaceType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4583:3: otherlv_0= 'font-face' ( (lv_face_1_0= ruleFontFaceType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleFontFace10026); 

                	newLeafNode(otherlv_0, grammarAccess.getFontFaceAccess().getFontFaceKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4587:1: ( (lv_face_1_0= ruleFontFaceType ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4588:1: (lv_face_1_0= ruleFontFaceType )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4588:1: (lv_face_1_0= ruleFontFaceType )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4589:3: lv_face_1_0= ruleFontFaceType
            {
             
            	        newCompositeNode(grammarAccess.getFontFaceAccess().getFaceFontFaceTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFontFaceType_in_ruleFontFace10047);
            lv_face_1_0=ruleFontFaceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFontFaceRule());
            	        }
                   		set(
                   			current, 
                   			"face",
                    		lv_face_1_0, 
                    		"FontFaceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4605:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==22) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4606:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4606:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4607:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getFontFaceAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleFontFace10068);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFontFaceRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleFontFace10081); 

                	newLeafNode(otherlv_3, grammarAccess.getFontFaceAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFontFace"


    // $ANTLR start "entryRuleFontSize"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4635:1: entryRuleFontSize returns [EObject current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final EObject entryRuleFontSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSize = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4636:2: (iv_ruleFontSize= ruleFontSize EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4637:2: iv_ruleFontSize= ruleFontSize EOF
            {
             newCompositeNode(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_ruleFontSize_in_entryRuleFontSize10117);
            iv_ruleFontSize=ruleFontSize();

            state._fsp--;

             current =iv_ruleFontSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontSize10127); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFontSize"


    // $ANTLR start "ruleFontSize"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4644:1: ruleFontSize returns [EObject current=null] : (otherlv_0= 'font-size' ( (lv_size_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleFontSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_size_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4647:28: ( (otherlv_0= 'font-size' ( (lv_size_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4648:1: (otherlv_0= 'font-size' ( (lv_size_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4648:1: (otherlv_0= 'font-size' ( (lv_size_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4648:3: otherlv_0= 'font-size' ( (lv_size_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleFontSize10164); 

                	newLeafNode(otherlv_0, grammarAccess.getFontSizeAccess().getFontSizeKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4652:1: ( (lv_size_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4653:1: (lv_size_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4653:1: (lv_size_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4654:3: lv_size_1_0= RULE_INT
            {
            lv_size_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFontSize10181); 

            			newLeafNode(lv_size_1_0, grammarAccess.getFontSizeAccess().getSizeINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFontSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"size",
                    		lv_size_1_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4670:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==22) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4671:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4671:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4672:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getFontSizeAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleFontSize10207);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFontSizeRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleFontSize10220); 

                	newLeafNode(otherlv_3, grammarAccess.getFontSizeAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFontSize"


    // $ANTLR start "entryRuleFontStyle"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4700:1: entryRuleFontStyle returns [EObject current=null] : iv_ruleFontStyle= ruleFontStyle EOF ;
    public final EObject entryRuleFontStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4701:2: (iv_ruleFontStyle= ruleFontStyle EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4702:2: iv_ruleFontStyle= ruleFontStyle EOF
            {
             newCompositeNode(grammarAccess.getFontStyleRule()); 
            pushFollow(FOLLOW_ruleFontStyle_in_entryRuleFontStyle10256);
            iv_ruleFontStyle=ruleFontStyle();

            state._fsp--;

             current =iv_ruleFontStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontStyle10266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFontStyle"


    // $ANTLR start "ruleFontStyle"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4709:1: ruleFontStyle returns [EObject current=null] : (otherlv_0= 'font-style' ( (lv_styles_1_0= ruleFontStyleType ) ) (otherlv_2= ',' ( (lv_styles_3_0= ruleFontStyleType ) ) )* ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject ruleFontStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_styles_1_0 = null;

        Enumerator lv_styles_3_0 = null;

        EObject lv_conditional_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4712:28: ( (otherlv_0= 'font-style' ( (lv_styles_1_0= ruleFontStyleType ) ) (otherlv_2= ',' ( (lv_styles_3_0= ruleFontStyleType ) ) )* ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4713:1: (otherlv_0= 'font-style' ( (lv_styles_1_0= ruleFontStyleType ) ) (otherlv_2= ',' ( (lv_styles_3_0= ruleFontStyleType ) ) )* ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4713:1: (otherlv_0= 'font-style' ( (lv_styles_1_0= ruleFontStyleType ) ) (otherlv_2= ',' ( (lv_styles_3_0= ruleFontStyleType ) ) )* ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4713:3: otherlv_0= 'font-style' ( (lv_styles_1_0= ruleFontStyleType ) ) (otherlv_2= ',' ( (lv_styles_3_0= ruleFontStyleType ) ) )* ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleFontStyle10303); 

                	newLeafNode(otherlv_0, grammarAccess.getFontStyleAccess().getFontStyleKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4717:1: ( (lv_styles_1_0= ruleFontStyleType ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4718:1: (lv_styles_1_0= ruleFontStyleType )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4718:1: (lv_styles_1_0= ruleFontStyleType )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4719:3: lv_styles_1_0= ruleFontStyleType
            {
             
            	        newCompositeNode(grammarAccess.getFontStyleAccess().getStylesFontStyleTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFontStyleType_in_ruleFontStyle10324);
            lv_styles_1_0=ruleFontStyleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFontStyleRule());
            	        }
                   		add(
                   			current, 
                   			"styles",
                    		lv_styles_1_0, 
                    		"FontStyleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4735:2: (otherlv_2= ',' ( (lv_styles_3_0= ruleFontStyleType ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==39) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4735:4: otherlv_2= ',' ( (lv_styles_3_0= ruleFontStyleType ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleFontStyle10337); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFontStyleAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4739:1: ( (lv_styles_3_0= ruleFontStyleType ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4740:1: (lv_styles_3_0= ruleFontStyleType )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4740:1: (lv_styles_3_0= ruleFontStyleType )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4741:3: lv_styles_3_0= ruleFontStyleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFontStyleAccess().getStylesFontStyleTypeEnumRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFontStyleType_in_ruleFontStyle10358);
            	    lv_styles_3_0=ruleFontStyleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFontStyleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"styles",
            	            		lv_styles_3_0, 
            	            		"FontStyleType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4757:4: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==22) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4758:1: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4758:1: (lv_conditional_4_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4759:3: lv_conditional_4_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getFontStyleAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleFontStyle10381);
                    lv_conditional_4_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFontStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_4_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleFontStyle10394); 

                	newLeafNode(otherlv_5, grammarAccess.getFontStyleAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFontStyle"


    // $ANTLR start "entryRuleLineStyle"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4787:1: entryRuleLineStyle returns [EObject current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final EObject entryRuleLineStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4788:2: (iv_ruleLineStyle= ruleLineStyle EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4789:2: iv_ruleLineStyle= ruleLineStyle EOF
            {
             newCompositeNode(grammarAccess.getLineStyleRule()); 
            pushFollow(FOLLOW_ruleLineStyle_in_entryRuleLineStyle10430);
            iv_ruleLineStyle=ruleLineStyle();

            state._fsp--;

             current =iv_ruleLineStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineStyle10440); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4796:1: ruleLineStyle returns [EObject current=null] : (otherlv_0= 'line-type' ( (lv_style_1_0= ruleLineType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleLineStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_style_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4799:28: ( (otherlv_0= 'line-type' ( (lv_style_1_0= ruleLineType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4800:1: (otherlv_0= 'line-type' ( (lv_style_1_0= ruleLineType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4800:1: (otherlv_0= 'line-type' ( (lv_style_1_0= ruleLineType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4800:3: otherlv_0= 'line-type' ( (lv_style_1_0= ruleLineType ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleLineStyle10477); 

                	newLeafNode(otherlv_0, grammarAccess.getLineStyleAccess().getLineTypeKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4804:1: ( (lv_style_1_0= ruleLineType ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4805:1: (lv_style_1_0= ruleLineType )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4805:1: (lv_style_1_0= ruleLineType )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4806:3: lv_style_1_0= ruleLineType
            {
             
            	        newCompositeNode(grammarAccess.getLineStyleAccess().getStyleLineTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLineType_in_ruleLineStyle10498);
            lv_style_1_0=ruleLineType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLineStyleRule());
            	        }
                   		set(
                   			current, 
                   			"style",
                    		lv_style_1_0, 
                    		"LineType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4822:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==22) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4823:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4823:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4824:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineStyleAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleLineStyle10519);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleLineStyle10532); 

                	newLeafNode(otherlv_3, grammarAccess.getLineStyleAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4852:1: entryRuleLineWidth returns [EObject current=null] : iv_ruleLineWidth= ruleLineWidth EOF ;
    public final EObject entryRuleLineWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineWidth = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4853:2: (iv_ruleLineWidth= ruleLineWidth EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4854:2: iv_ruleLineWidth= ruleLineWidth EOF
            {
             newCompositeNode(grammarAccess.getLineWidthRule()); 
            pushFollow(FOLLOW_ruleLineWidth_in_entryRuleLineWidth10568);
            iv_ruleLineWidth=ruleLineWidth();

            state._fsp--;

             current =iv_ruleLineWidth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineWidth10578); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4861:1: ruleLineWidth returns [EObject current=null] : (otherlv_0= 'line-width' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleLineWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4864:28: ( (otherlv_0= 'line-width' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4865:1: (otherlv_0= 'line-width' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4865:1: (otherlv_0= 'line-width' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4865:3: otherlv_0= 'line-width' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleLineWidth10615); 

                	newLeafNode(otherlv_0, grammarAccess.getLineWidthAccess().getLineWidthKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4869:1: ( (lv_width_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4870:1: (lv_width_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4870:1: (lv_width_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4871:3: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLineWidth10632); 

            			newLeafNode(lv_width_1_0, grammarAccess.getLineWidthAccess().getWidthINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLineWidthRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_1_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4887:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==22) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4888:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4888:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4889:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineWidthAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleLineWidth10658);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineWidthRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleLineWidth10671); 

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


    // $ANTLR start "ruleConnectionType"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4919:1: ruleConnectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'manhattan' ) ) ;
    public final Enumerator ruleConnectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4921:28: ( ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'manhattan' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4922:1: ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'manhattan' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4922:1: ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'manhattan' ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==70) ) {
                alt101=1;
            }
            else if ( (LA101_0==71) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4922:2: (enumLiteral_0= 'free' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4922:2: (enumLiteral_0= 'free' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4922:4: enumLiteral_0= 'free'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleConnectionType10723); 

                            current = grammarAccess.getConnectionTypeAccess().getFREEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionTypeAccess().getFREEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4928:6: (enumLiteral_1= 'manhattan' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4928:6: (enumLiteral_1= 'manhattan' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4928:8: enumLiteral_1= 'manhattan'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleConnectionType10740); 

                            current = grammarAccess.getConnectionTypeAccess().getMANHATTANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionTypeAccess().getMANHATTANEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleConnectionType"


    // $ANTLR start "ruleAnchorDirection"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4938:1: ruleAnchorDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) ;
    public final Enumerator ruleAnchorDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4940:28: ( ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4941:1: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4941:1: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==72) ) {
                alt102=1;
            }
            else if ( (LA102_0==73) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4941:2: (enumLiteral_0= 'incoming' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4941:2: (enumLiteral_0= 'incoming' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4941:4: enumLiteral_0= 'incoming'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleAnchorDirection10785); 

                            current = grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4947:6: (enumLiteral_1= 'outgoing' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4947:6: (enumLiteral_1= 'outgoing' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4947:8: enumLiteral_1= 'outgoing'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleAnchorDirection10802); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4957:1: ruleDefaultColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4959:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4960:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4960:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            int alt103=16;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt103=1;
                }
                break;
            case 75:
                {
                alt103=2;
                }
                break;
            case 76:
                {
                alt103=3;
                }
                break;
            case 77:
                {
                alt103=4;
                }
                break;
            case 78:
                {
                alt103=5;
                }
                break;
            case 79:
                {
                alt103=6;
                }
                break;
            case 80:
                {
                alt103=7;
                }
                break;
            case 81:
                {
                alt103=8;
                }
                break;
            case 82:
                {
                alt103=9;
                }
                break;
            case 83:
                {
                alt103=10;
                }
                break;
            case 84:
                {
                alt103=11;
                }
                break;
            case 85:
                {
                alt103=12;
                }
                break;
            case 86:
                {
                alt103=13;
                }
                break;
            case 87:
                {
                alt103=14;
                }
                break;
            case 88:
                {
                alt103=15;
                }
                break;
            case 89:
                {
                alt103=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4960:2: (enumLiteral_0= 'white' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4960:2: (enumLiteral_0= 'white' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4960:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleDefaultColor10847); 

                            current = grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4966:6: (enumLiteral_1= 'silver' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4966:6: (enumLiteral_1= 'silver' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4966:8: enumLiteral_1= 'silver'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleDefaultColor10864); 

                            current = grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4972:6: (enumLiteral_2= 'gray' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4972:6: (enumLiteral_2= 'gray' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4972:8: enumLiteral_2= 'gray'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleDefaultColor10881); 

                            current = grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4978:6: (enumLiteral_3= 'black' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4978:6: (enumLiteral_3= 'black' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4978:8: enumLiteral_3= 'black'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleDefaultColor10898); 

                            current = grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4984:6: (enumLiteral_4= 'red' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4984:6: (enumLiteral_4= 'red' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4984:8: enumLiteral_4= 'red'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleDefaultColor10915); 

                            current = grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4990:6: (enumLiteral_5= 'maroon' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4990:6: (enumLiteral_5= 'maroon' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4990:8: enumLiteral_5= 'maroon'
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleDefaultColor10932); 

                            current = grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4996:6: (enumLiteral_6= 'yellow' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4996:6: (enumLiteral_6= 'yellow' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4996:8: enumLiteral_6= 'yellow'
                    {
                    enumLiteral_6=(Token)match(input,80,FOLLOW_80_in_ruleDefaultColor10949); 

                            current = grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5002:6: (enumLiteral_7= 'olive' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5002:6: (enumLiteral_7= 'olive' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5002:8: enumLiteral_7= 'olive'
                    {
                    enumLiteral_7=(Token)match(input,81,FOLLOW_81_in_ruleDefaultColor10966); 

                            current = grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5008:6: (enumLiteral_8= 'lime' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5008:6: (enumLiteral_8= 'lime' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5008:8: enumLiteral_8= 'lime'
                    {
                    enumLiteral_8=(Token)match(input,82,FOLLOW_82_in_ruleDefaultColor10983); 

                            current = grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5014:6: (enumLiteral_9= 'green' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5014:6: (enumLiteral_9= 'green' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5014:8: enumLiteral_9= 'green'
                    {
                    enumLiteral_9=(Token)match(input,83,FOLLOW_83_in_ruleDefaultColor11000); 

                            current = grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5020:6: (enumLiteral_10= 'aqua' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5020:6: (enumLiteral_10= 'aqua' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5020:8: enumLiteral_10= 'aqua'
                    {
                    enumLiteral_10=(Token)match(input,84,FOLLOW_84_in_ruleDefaultColor11017); 

                            current = grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5026:6: (enumLiteral_11= 'teal' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5026:6: (enumLiteral_11= 'teal' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5026:8: enumLiteral_11= 'teal'
                    {
                    enumLiteral_11=(Token)match(input,85,FOLLOW_85_in_ruleDefaultColor11034); 

                            current = grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5032:6: (enumLiteral_12= 'blue' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5032:6: (enumLiteral_12= 'blue' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5032:8: enumLiteral_12= 'blue'
                    {
                    enumLiteral_12=(Token)match(input,86,FOLLOW_86_in_ruleDefaultColor11051); 

                            current = grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5038:6: (enumLiteral_13= 'navy' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5038:6: (enumLiteral_13= 'navy' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5038:8: enumLiteral_13= 'navy'
                    {
                    enumLiteral_13=(Token)match(input,87,FOLLOW_87_in_ruleDefaultColor11068); 

                            current = grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5044:6: (enumLiteral_14= 'fuchsia' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5044:6: (enumLiteral_14= 'fuchsia' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5044:8: enumLiteral_14= 'fuchsia'
                    {
                    enumLiteral_14=(Token)match(input,88,FOLLOW_88_in_ruleDefaultColor11085); 

                            current = grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5050:6: (enumLiteral_15= 'purple' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5050:6: (enumLiteral_15= 'purple' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5050:8: enumLiteral_15= 'purple'
                    {
                    enumLiteral_15=(Token)match(input,89,FOLLOW_89_in_ruleDefaultColor11102); 

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


    // $ANTLR start "ruleContainerLayout"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5060:1: ruleContainerLayout returns [Enumerator current=null] : ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'vstack' ) | (enumLiteral_2= 'hstack' ) ) ;
    public final Enumerator ruleContainerLayout() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5062:28: ( ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'vstack' ) | (enumLiteral_2= 'hstack' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5063:1: ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'vstack' ) | (enumLiteral_2= 'hstack' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5063:1: ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'vstack' ) | (enumLiteral_2= 'hstack' ) )
            int alt104=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt104=1;
                }
                break;
            case 90:
                {
                alt104=2;
                }
                break;
            case 91:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5063:2: (enumLiteral_0= 'free' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5063:2: (enumLiteral_0= 'free' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5063:4: enumLiteral_0= 'free'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleContainerLayout11147); 

                            current = grammarAccess.getContainerLayoutAccess().getFREEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContainerLayoutAccess().getFREEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5069:6: (enumLiteral_1= 'vstack' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5069:6: (enumLiteral_1= 'vstack' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5069:8: enumLiteral_1= 'vstack'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleContainerLayout11164); 

                            current = grammarAccess.getContainerLayoutAccess().getVSTACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContainerLayoutAccess().getVSTACKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5075:6: (enumLiteral_2= 'hstack' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5075:6: (enumLiteral_2= 'hstack' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5075:8: enumLiteral_2= 'hstack'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleContainerLayout11181); 

                            current = grammarAccess.getContainerLayoutAccess().getHSTACKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContainerLayoutAccess().getHSTACKEnumLiteralDeclaration_2()); 
                        

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


    // $ANTLR start "ruleOperator"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5085:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5087:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5088:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5088:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==92) ) {
                alt105=1;
            }
            else if ( (LA105_0==93) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5088:2: (enumLiteral_0= '=' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5088:2: (enumLiteral_0= '=' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5088:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleOperator11226); 

                            current = grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5094:6: (enumLiteral_1= '<>' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5094:6: (enumLiteral_1= '<>' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5094:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleOperator11243); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5104:1: ruleBooleanLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5106:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5107:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5107:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==94) ) {
                alt106=1;
            }
            else if ( (LA106_0==95) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5107:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5107:2: (enumLiteral_0= 'true' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5107:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_94_in_ruleBooleanLiteral11288); 

                            current = grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5113:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5113:6: (enumLiteral_1= 'false' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5113:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_95_in_ruleBooleanLiteral11305); 

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


    // $ANTLR start "ruleFontFaceType"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5123:1: ruleFontFaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'arial' ) | (enumLiteral_1= 'verdana' ) | (enumLiteral_2= 'times' ) | (enumLiteral_3= 'courier' ) ) ;
    public final Enumerator ruleFontFaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5125:28: ( ( (enumLiteral_0= 'arial' ) | (enumLiteral_1= 'verdana' ) | (enumLiteral_2= 'times' ) | (enumLiteral_3= 'courier' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5126:1: ( (enumLiteral_0= 'arial' ) | (enumLiteral_1= 'verdana' ) | (enumLiteral_2= 'times' ) | (enumLiteral_3= 'courier' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5126:1: ( (enumLiteral_0= 'arial' ) | (enumLiteral_1= 'verdana' ) | (enumLiteral_2= 'times' ) | (enumLiteral_3= 'courier' ) )
            int alt107=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt107=1;
                }
                break;
            case 97:
                {
                alt107=2;
                }
                break;
            case 98:
                {
                alt107=3;
                }
                break;
            case 99:
                {
                alt107=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5126:2: (enumLiteral_0= 'arial' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5126:2: (enumLiteral_0= 'arial' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5126:4: enumLiteral_0= 'arial'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_96_in_ruleFontFaceType11350); 

                            current = grammarAccess.getFontFaceTypeAccess().getARIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFontFaceTypeAccess().getARIALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5132:6: (enumLiteral_1= 'verdana' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5132:6: (enumLiteral_1= 'verdana' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5132:8: enumLiteral_1= 'verdana'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_97_in_ruleFontFaceType11367); 

                            current = grammarAccess.getFontFaceTypeAccess().getVERDANAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFontFaceTypeAccess().getVERDANAEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5138:6: (enumLiteral_2= 'times' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5138:6: (enumLiteral_2= 'times' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5138:8: enumLiteral_2= 'times'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_98_in_ruleFontFaceType11384); 

                            current = grammarAccess.getFontFaceTypeAccess().getTIMESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFontFaceTypeAccess().getTIMESEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5144:6: (enumLiteral_3= 'courier' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5144:6: (enumLiteral_3= 'courier' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5144:8: enumLiteral_3= 'courier'
                    {
                    enumLiteral_3=(Token)match(input,99,FOLLOW_99_in_ruleFontFaceType11401); 

                            current = grammarAccess.getFontFaceTypeAccess().getCOURIEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFontFaceTypeAccess().getCOURIEREnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleFontFaceType"


    // $ANTLR start "ruleFontStyleType"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5154:1: ruleFontStyleType returns [Enumerator current=null] : ( (enumLiteral_0= 'italics' ) | (enumLiteral_1= 'bold' ) | (enumLiteral_2= 'underline' ) ) ;
    public final Enumerator ruleFontStyleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5156:28: ( ( (enumLiteral_0= 'italics' ) | (enumLiteral_1= 'bold' ) | (enumLiteral_2= 'underline' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5157:1: ( (enumLiteral_0= 'italics' ) | (enumLiteral_1= 'bold' ) | (enumLiteral_2= 'underline' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5157:1: ( (enumLiteral_0= 'italics' ) | (enumLiteral_1= 'bold' ) | (enumLiteral_2= 'underline' ) )
            int alt108=3;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt108=1;
                }
                break;
            case 101:
                {
                alt108=2;
                }
                break;
            case 102:
                {
                alt108=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5157:2: (enumLiteral_0= 'italics' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5157:2: (enumLiteral_0= 'italics' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5157:4: enumLiteral_0= 'italics'
                    {
                    enumLiteral_0=(Token)match(input,100,FOLLOW_100_in_ruleFontStyleType11446); 

                            current = grammarAccess.getFontStyleTypeAccess().getITALICSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFontStyleTypeAccess().getITALICSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5163:6: (enumLiteral_1= 'bold' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5163:6: (enumLiteral_1= 'bold' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5163:8: enumLiteral_1= 'bold'
                    {
                    enumLiteral_1=(Token)match(input,101,FOLLOW_101_in_ruleFontStyleType11463); 

                            current = grammarAccess.getFontStyleTypeAccess().getBOLDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFontStyleTypeAccess().getBOLDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5169:6: (enumLiteral_2= 'underline' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5169:6: (enumLiteral_2= 'underline' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5169:8: enumLiteral_2= 'underline'
                    {
                    enumLiteral_2=(Token)match(input,102,FOLLOW_102_in_ruleFontStyleType11480); 

                            current = grammarAccess.getFontStyleTypeAccess().getUNDERLINEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFontStyleTypeAccess().getUNDERLINEEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleFontStyleType"


    // $ANTLR start "ruleLineType"
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5179:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5181:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5182:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5182:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) )
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5182:2: (enumLiteral_0= 'solid' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5182:2: (enumLiteral_0= 'solid' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5182:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_103_in_ruleLineType11525); 

                            current = grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5188:6: (enumLiteral_1= 'dash' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5188:6: (enumLiteral_1= 'dash' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5188:8: enumLiteral_1= 'dash'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_104_in_ruleLineType11542); 

                            current = grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1()); 
                        

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


 

    public static final BitSet FOLLOW_ruleXDiagram_in_entryRuleXDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleXDiagram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXDiagram139 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleXDiagram165 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ruleDiagram_in_ruleXDiagram186 = new BitSet(new long[]{0x0000014004980002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleXDiagram207 = new BitSet(new long[]{0x0000014004980002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_ruleXDiagram230 = new BitSet(new long[]{0x0000014004900002L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleXDiagram257 = new BitSet(new long[]{0x0000014004900002L});
    public static final BitSet FOLLOW_ruleCustomColor_in_ruleXDiagram284 = new BitSet(new long[]{0x0000014004900002L});
    public static final BitSet FOLLOW_ruleCustomFigure_in_ruleXDiagram311 = new BitSet(new long[]{0x0000014004900002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportStatement406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportStatement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName517 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName551 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard657 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard676 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDiagram778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDiagram801 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDiagram813 = new BitSet(new long[]{0x00D7F90000040000L});
    public static final BitSet FOLLOW_ruleContains_in_ruleDiagram834 = new BitSet(new long[]{0x00D7F90000040000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleDiagram856 = new BitSet(new long[]{0x00D3F90000040000L});
    public static final BitSet FOLLOW_18_in_ruleDiagram869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGroup952 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGroup969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramElement1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleDiagramElement1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleDiagramElement1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle1129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStyle1176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStyle1193 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_21_in_ruleStyle1217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStyle1250 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStyle1264 = new BitSet(new long[]{0xEF00000000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleStyleFeature_in_ruleStyle1285 = new BitSet(new long[]{0xEF00000000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_18_in_ruleStyle1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedFeature_in_entryRuleLinkedFeature1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedFeature1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_ruleLinkedFeature1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleLinkedFeature1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyleFeature_in_entryRuleStyleFeature1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleFeature1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleStyleFeature1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleStyleFeature1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_ruleStyleFeature1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_ruleStyleFeature1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleStyleFeature1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleStyleFeature1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransparency_in_ruleStyleFeature1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontFace_in_ruleStyleFeature1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_ruleStyleFeature1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyle_in_ruleStyleFeature1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_ruleStyleFeature1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleStyleFeature1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_ruleStyleFeature1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_entryRuleFeatureConditional1873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureConditional1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFeatureConditional1920 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureConditional1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleFeatureConditional1964 = new BitSet(new long[]{0x0008000000000070L,0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFeatureConditional1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode2021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNode2068 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNode2091 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode2109 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleNode2127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode2147 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleNode2164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode2181 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNode2200 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleNode2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink2257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLink2304 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2328 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_27_in_ruleLink2353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2389 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLink2401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2424 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLink2436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2459 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink2479 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleLink2497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2517 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleLink2534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2551 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLink2570 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLink2582 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleConnectionType_in_ruleLink2603 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleLink2622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2655 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLink2669 = new BitSet(new long[]{0xEF00000100040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleLinkFeature_in_ruleLink2690 = new BitSet(new long[]{0xEF00000100040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_32_in_ruleLink2704 = new BitSet(new long[]{0x0000000A30000000L});
    public static final BitSet FOLLOW_ruleDecorator_in_ruleLink2725 = new BitSet(new long[]{0x0000000A30040000L});
    public static final BitSet FOLLOW_18_in_ruleLink2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkFeature_in_entryRuleLinkFeature2776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkFeature2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleLinkFeature2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleLinkFeature2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_ruleLinkFeature2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorator_in_entryRuleDecorator2922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorator2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDecorator2971 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecorator2988 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDecorator3005 = new BitSet(new long[]{0x0013200000000002L});
    public static final BitSet FOLLOW_28_in_ruleDecorator3030 = new BitSet(new long[]{0x0013200000000002L});
    public static final BitSet FOLLOW_29_in_ruleDecorator3067 = new BitSet(new long[]{0x0013200000000002L});
    public static final BitSet FOLLOW_35_in_ruleDecorator3104 = new BitSet(new long[]{0x0013200000000002L});
    public static final BitSet FOLLOW_ruleStaticElement_in_ruleDecorator3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleDecorator3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticElement_in_entryRuleStaticElement3205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticElement3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhombus_in_ruleStaticElement3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolyline_in_ruleStaticElement3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor3324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAnchor3371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleAnchorDirection_in_ruleAnchor3392 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnchor3415 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleAnchor3436 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAnchor3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomColor_in_entryRuleCustomColor3485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomColor3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCustomColor3532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomColor3549 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomColor3571 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCustomColor3588 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomColor3605 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCustomColor3622 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomColor3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor3680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultColor_in_ruleColor3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColor3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_entryRuleConnectableElement3798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectableElement3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangle_in_ruleConnectableElement3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhombus_in_ruleConnectableElement3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_ruleConnectableElement3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolyline_in_ruleConnectableElement3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleConnectableElement3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleConnectableElement3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvisible_in_ruleConnectableElement4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustom_in_ruleConnectableElement4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_entryRuleConnectableElementFeature4079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectableElementFeature4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleConnectableElementFeature4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleConnectableElementFeature4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleConnectableElementFeature4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleConnectableElementFeature4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_ruleConnectableElementFeature4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_ruleConnectableElementFeature4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleConnectableElementFeature4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomFigure_in_entryRuleCustomFigure4333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomFigure4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCustomFigure4380 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomFigure4397 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleCustomFigure4414 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleCustomFigure4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustom_in_entryRuleCustom4471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustom4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCustom4518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustom4538 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleCustom4557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustom4590 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCustom4604 = new BitSet(new long[]{0x0004041000040000L});
    public static final BitSet FOLLOW_ruleLinkedFeature_in_ruleCustom4625 = new BitSet(new long[]{0x0004041000040000L});
    public static final BitSet FOLLOW_42_in_ruleCustom4645 = new BitSet(new long[]{0x0000000001000000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleCustom4679 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCustom4692 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleCustom4713 = new BitSet(new long[]{0x00D3F90000040000L});
    public static final BitSet FOLLOW_18_in_ruleCustom4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangle_in_entryRuleRectangle4764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRectangle4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRectangle4818 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_44_in_ruleRectangle4855 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleRectangle4888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRectangle4921 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRectangle4935 = new BitSet(new long[]{0xEF04041000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleRectangleFeature_in_ruleRectangle4956 = new BitSet(new long[]{0xEF04041000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_42_in_ruleRectangle4976 = new BitSet(new long[]{0x0000000001000000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleRectangle5010 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRectangle5023 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleRectangle5044 = new BitSet(new long[]{0x00D3F90000040000L});
    public static final BitSet FOLLOW_18_in_ruleRectangle5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangleFeature_in_entryRuleRectangleFeature5095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRectangleFeature5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_ruleRectangleFeature5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_ruleRectangleFeature5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhombus_in_entryRuleRhombus5214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRhombus5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRhombus5270 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleRhombus5289 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRhombus5322 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRhombus5336 = new BitSet(new long[]{0xEF04041000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_ruleRhombus5357 = new BitSet(new long[]{0xEF04041000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_42_in_ruleRhombus5377 = new BitSet(new long[]{0x0000000001000000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleRhombus5411 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRhombus5424 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleRhombus5445 = new BitSet(new long[]{0x00D3F90000040000L});
    public static final BitSet FOLLOW_18_in_ruleRhombus5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_entryRuleEllipse5496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEllipse5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEllipse5550 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_47_in_ruleEllipse5587 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleEllipse5620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEllipse5653 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEllipse5667 = new BitSet(new long[]{0xEF04041000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_ruleEllipse5688 = new BitSet(new long[]{0xEF04041000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_42_in_ruleEllipse5708 = new BitSet(new long[]{0x0000000001000000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleEllipse5742 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEllipse5755 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleEllipse5776 = new BitSet(new long[]{0x00D3F90000040000L});
    public static final BitSet FOLLOW_18_in_ruleEllipse5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolyline_in_entryRulePolyline5827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolyline5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePolyline5881 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_49_in_rulePolyline5918 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_rulePolyline5951 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePolyline5984 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePolyline5998 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rulePoint_in_rulePolyline6019 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rulePoint_in_rulePolyline6040 = new BitSet(new long[]{0xEF04041000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_rulePoint_in_rulePolyline6061 = new BitSet(new long[]{0xEF04041000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_rulePolyline6083 = new BitSet(new long[]{0xEF04041000040000L,0x000000000000003FL});
    public static final BitSet FOLLOW_42_in_rulePolyline6103 = new BitSet(new long[]{0x0000000001000000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_rulePolyline6137 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePolyline6150 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_rulePolyline6171 = new BitSet(new long[]{0x00D3F90000040000L});
    public static final BitSet FOLLOW_18_in_rulePolyline6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_entryRuleContains6222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContains6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleContains6269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContains6292 = new BitSet(new long[]{0x0000002000400000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleContains6313 = new BitSet(new long[]{0x0000002000000000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleContains6335 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleContains6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue6384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_ruleValue6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_ruleValue6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue6584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue6675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleValue6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleValue6727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDoubleValue6744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleValue6761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue6802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleStringValue6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanValue6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_entryRuleEnumValue7022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumValue7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumValue7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel7115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLabel7171 = new BitSet(new long[]{0x0020000080020000L});
    public static final BitSet FOLLOW_53_in_ruleLabel7189 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleLabel7222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel7255 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLabel7269 = new BitSet(new long[]{0x4B00040000040000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleLabelFeature_in_ruleLabel7290 = new BitSet(new long[]{0x4B00040000040000L,0x000000000000000FL});
    public static final BitSet FOLLOW_42_in_ruleLabel7310 = new BitSet(new long[]{0x0000000001000000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleLabel7344 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLabel7357 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleLabel7378 = new BitSet(new long[]{0x00D3F90000040000L});
    public static final BitSet FOLLOW_18_in_ruleLabel7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelFeature_in_entryRuleLabelFeature7429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelFeature7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_ruleLabelFeature7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleLabelFeature7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleLabelFeature7540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontFace_in_ruleLabelFeature7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_ruleLabelFeature7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyle_in_ruleLabelFeature7621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleLabelFeature7648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleLabelFeature7675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage7710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleImage7757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImage7774 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleImage7798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImage7831 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImage7845 = new BitSet(new long[]{0x4C00040000040000L});
    public static final BitSet FOLLOW_ruleImageFeature_in_ruleImage7866 = new BitSet(new long[]{0x4C00040000040000L});
    public static final BitSet FOLLOW_42_in_ruleImage7886 = new BitSet(new long[]{0x0000000001000000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleImage7920 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleImage7933 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleImage7954 = new BitSet(new long[]{0x00D3F90000040000L});
    public static final BitSet FOLLOW_18_in_ruleImage7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageFeature_in_entryRuleImageFeature8005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageFeature8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleImageFeature8062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleImageFeature8089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransparency_in_ruleImageFeature8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvisible_in_entryRuleInvisible8151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvisible8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInvisible8207 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleInvisible8226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvisible8259 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInvisible8273 = new BitSet(new long[]{0x4804041000040000L});
    public static final BitSet FOLLOW_ruleInvisibleFeature_in_ruleInvisible8294 = new BitSet(new long[]{0x4804041000040000L});
    public static final BitSet FOLLOW_42_in_ruleInvisible8314 = new BitSet(new long[]{0x0000000001000000L,0x000000000C000040L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleInvisible8348 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInvisible8361 = new BitSet(new long[]{0x00D3F90000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleInvisible8382 = new BitSet(new long[]{0x00D3F90000040000L});
    public static final BitSet FOLLOW_18_in_ruleInvisible8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvisibleFeature_in_entryRuleInvisibleFeature8433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvisibleFeature8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleInvisibleFeature8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleInvisibleFeature8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedFeature_in_ruleInvisibleFeature8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature8579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleColorFeature8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleColorFeature8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_entryRuleForeground8698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeground8708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleForeground8751 = new BitSet(new long[]{0x0000000000000020L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleForeground8785 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleForeground8806 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleForeground8819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground8855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBackground8908 = new BitSet(new long[]{0x0000000000000020L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleBackground8942 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleBackground8963 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBackground8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransparency_in_entryRuleTransparency9012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransparency9022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTransparency9059 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleTransparency9076 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleTransparency9102 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTransparency9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize9151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize9161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSize9198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize9215 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleSize9232 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize9249 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleSize9275 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSize9288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint9324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePoint9371 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint9388 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePoint9405 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint9422 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_rulePoint9448 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePoint9461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_entryRulePosition9497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosition9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePosition9544 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePosition9561 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePosition9578 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePosition9595 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_rulePosition9621 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePosition9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner9670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCorner9717 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCorner9734 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleCorner9760 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCorner9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_entryRuleTextValue9809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextValue9819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleTextValue9856 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextValue9874 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTextValue9908 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleTextValue9930 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTextValue9943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontFace_in_entryRuleFontFace9979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontFace9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFontFace10026 = new BitSet(new long[]{0x0000000000000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_ruleFontFaceType_in_ruleFontFace10047 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleFontFace10068 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFontFace10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_entryRuleFontSize10117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontSize10127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFontSize10164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFontSize10181 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleFontSize10207 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFontSize10220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyle_in_entryRuleFontStyle10256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontStyle10266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFontStyle10303 = new BitSet(new long[]{0x0000000000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_ruleFontStyleType_in_ruleFontStyle10324 = new BitSet(new long[]{0x000000A000400000L});
    public static final BitSet FOLLOW_39_in_ruleFontStyle10337 = new BitSet(new long[]{0x0000000000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_ruleFontStyleType_in_ruleFontStyle10358 = new BitSet(new long[]{0x000000A000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleFontStyle10381 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFontStyle10394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_entryRuleLineStyle10430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineStyle10440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLineStyle10477 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_ruleLineType_in_ruleLineStyle10498 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleLineStyle10519 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLineStyle10532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_entryRuleLineWidth10568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineWidth10578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleLineWidth10615 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLineWidth10632 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleLineWidth10658 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLineWidth10671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleConnectionType10723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleConnectionType10740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAnchorDirection10785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAnchorDirection10802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDefaultColor10847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDefaultColor10864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDefaultColor10881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDefaultColor10898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDefaultColor10915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDefaultColor10932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDefaultColor10949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDefaultColor10966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDefaultColor10983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDefaultColor11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleDefaultColor11017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleDefaultColor11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleDefaultColor11051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleDefaultColor11068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDefaultColor11085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleDefaultColor11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleContainerLayout11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleContainerLayout11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleContainerLayout11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOperator11226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleOperator11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleBooleanLiteral11288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleBooleanLiteral11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleFontFaceType11350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleFontFaceType11367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleFontFaceType11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleFontFaceType11401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleFontStyleType11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleFontStyleType11463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleFontStyleType11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleLineType11525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleLineType11542 = new BitSet(new long[]{0x0000000000000002L});

}