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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'import'", "'.'", "'*'", "'diagram'", "'{'", "'}'", "'toolgroup'", "';'", "'style'", "'+'", "'if'", "'tool'", "'group'", "'icon'", "'node'", "'link'", "'reference'", "'class'", "'source'", "'target'", "'decorator'", "'%'", "'anchor'", "'color'", "'figure'", "'as'", "'child'", "'rectangle'", "'square'", "'rhombus'", "'ellipse'", "'circle'", "'polygon'", "'polyline'", "'triangle'", "'hline'", "'vline'", "'arrow'", "'contains'", "'null'", "'label'", "'image'", "'invisible'", "'foreground'", "'background'", "'transparency'", "'size'", "']'", "'resizable'", "'point'", "'position'", "'corner'", "'layout'", "'vertical'", "'horizontal'", "'margin'", "'text'", "'edit:'", "'font'", "'arial'", "'verdana'", "'courier'", "'times'", "'bold'", "'italics'", "'align'", "'linestyle'", "'manhattan'", "'linewidth'", "'incoming'", "'outgoing'", "'white'", "'silver'", "'gray'", "'black'", "'red'", "'maroon'", "'yellow'", "'olive'", "'lime'", "'green'", "'aqua'", "'teal'", "'blue'", "'navy'", "'fuchsia'", "'purple'", "'='", "'<>'", "'true'", "'false'", "'left'", "'center'", "'right'", "'solid'", "'dashed'", "'dotted'"
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:77:1: ruleXDiagram returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:80:28: ( (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:81:1: (otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )* )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:81:3: otherlv_0= 'metamodel' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImportStatement ) ) ( (lv_diagram_3_0= ruleDiagram ) ) ( (lv_groups_4_0= ruleToolGroup ) )* ( ( (lv_elements_5_0= ruleDiagramElement ) ) | ( (lv_styles_6_0= ruleStyle ) ) | ( (lv_colors_7_0= ruleCustomColor ) ) | ( (lv_figures_8_0= ruleCustomFigure ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleXDiagram122); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:139:2: ( (lv_groups_4_0= ruleToolGroup ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:140:1: (lv_groups_4_0= ruleToolGroup )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:140:1: (lv_groups_4_0= ruleToolGroup )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:141:3: lv_groups_4_0= ruleToolGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDiagramAccess().getGroupsToolGroupParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleToolGroup_in_ruleXDiagram207);
            	    lv_groups_4_0=ruleToolGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groups",
            	            		lv_groups_4_0, 
            	            		"ToolGroup");
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
                case 35:
                    {
                    alt2=3;
                    }
                    break;
                case 36:
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

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:259:4: otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleImportStatement406); 

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

                if ( (LA4_0==13) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:310:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName536); 

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

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:355:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildCard676); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                        
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard689); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:383:1: ruleDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_contains_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:386:28: ( (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:387:1: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:387:1: (otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:387:3: otherlv_0= 'diagram' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_contains_3_0= ruleContains ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDiagram778); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDiagram813); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDiagram847); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:440:1: entryRuleToolGroup returns [EObject current=null] : iv_ruleToolGroup= ruleToolGroup EOF ;
    public final EObject entryRuleToolGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolGroup = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:441:2: (iv_ruleToolGroup= ruleToolGroup EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:442:2: iv_ruleToolGroup= ruleToolGroup EOF
            {
             newCompositeNode(grammarAccess.getToolGroupRule()); 
            pushFollow(FOLLOW_ruleToolGroup_in_entryRuleToolGroup883);
            iv_ruleToolGroup=ruleToolGroup();

            state._fsp--;

             current =iv_ruleToolGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToolGroup893); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:449:1: ruleToolGroup returns [EObject current=null] : (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleToolGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:452:28: ( (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:453:1: (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:453:1: (otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:453:3: otherlv_0= 'toolgroup' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleToolGroup930); 

                	newLeafNode(otherlv_0, grammarAccess.getToolGroupAccess().getToolgroupKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:457:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:458:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:458:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:459:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToolGroup947); 

            			newLeafNode(lv_name_1_0, grammarAccess.getToolGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getToolGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:475:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:476:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:476:1: (lv_description_2_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:477:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleToolGroup969); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getToolGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getToolGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleToolGroup987); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:505:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:506:2: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:507:2: iv_ruleDiagramElement= ruleDiagramElement EOF
            {
             newCompositeNode(grammarAccess.getDiagramElementRule()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1023);
            iv_ruleDiagramElement=ruleDiagramElement();

            state._fsp--;

             current =iv_ruleDiagramElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramElement1033); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:514:1: ruleDiagramElement returns [EObject current=null] : (this_Node_0= ruleNode | this_Link_1= ruleLink ) ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Link_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:517:28: ( (this_Node_0= ruleNode | this_Link_1= ruleLink ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:518:1: (this_Node_0= ruleNode | this_Link_1= ruleLink )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:518:1: (this_Node_0= ruleNode | this_Link_1= ruleLink )
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:519:5: this_Node_0= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getDiagramElementAccess().getNodeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNode_in_ruleDiagramElement1080);
                    this_Node_0=ruleNode();

                    state._fsp--;

                     
                            current = this_Node_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:529:5: this_Link_1= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getDiagramElementAccess().getLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleDiagramElement1107);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:545:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:546:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:547:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle1142);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle1152); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:554:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:557:28: ( (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:558:1: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:558:1: (otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:558:3: otherlv_0= 'style' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleStyleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleStyle1189); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:562:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:563:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:563:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:564:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStyle1206); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:580:2: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:580:3: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:580:3: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:581:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:581:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:582:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleStyle1230); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getStyleAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStyleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:595:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:596:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:596:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:597:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStyleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStyle1263); 

                    		newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleStyle1277); 

                	newLeafNode(otherlv_4, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:612:1: ( (lv_features_5_0= ruleStyleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=55 && LA10_0<=58)||(LA10_0>=61 && LA10_0<=63)||LA10_0==68||LA10_0==70||(LA10_0>=77 && LA10_0<=78)||LA10_0==80) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:613:1: (lv_features_5_0= ruleStyleFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:613:1: (lv_features_5_0= ruleStyleFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:614:3: lv_features_5_0= ruleStyleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStyleAccess().getFeaturesStyleFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyleFeature_in_ruleStyle1298);
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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleStyle1311); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:644:1: entryRuleLinkedFeature returns [EObject current=null] : iv_ruleLinkedFeature= ruleLinkedFeature EOF ;
    public final EObject entryRuleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:645:2: (iv_ruleLinkedFeature= ruleLinkedFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:646:2: iv_ruleLinkedFeature= ruleLinkedFeature EOF
            {
             newCompositeNode(grammarAccess.getLinkedFeatureRule()); 
            pushFollow(FOLLOW_ruleLinkedFeature_in_entryRuleLinkedFeature1349);
            iv_ruleLinkedFeature=ruleLinkedFeature();

            state._fsp--;

             current =iv_ruleLinkedFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedFeature1359); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:653:1: ruleLinkedFeature returns [EObject current=null] : (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) ;
    public final EObject ruleLinkedFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_Anchor_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:656:28: ( (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:657:1: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:657:1: (this_Contains_0= ruleContains | this_Anchor_1= ruleAnchor )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==50) ) {
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:658:5: this_Contains_0= ruleContains
                    {
                     
                            newCompositeNode(grammarAccess.getLinkedFeatureAccess().getContainsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleContains_in_ruleLinkedFeature1406);
                    this_Contains_0=ruleContains();

                    state._fsp--;

                     
                            current = this_Contains_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:668:5: this_Anchor_1= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getLinkedFeatureAccess().getAnchorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleLinkedFeature1433);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:684:1: entryRuleStyleFeature returns [EObject current=null] : iv_ruleStyleFeature= ruleStyleFeature EOF ;
    public final EObject entryRuleStyleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:685:2: (iv_ruleStyleFeature= ruleStyleFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:686:2: iv_ruleStyleFeature= ruleStyleFeature EOF
            {
             newCompositeNode(grammarAccess.getStyleFeatureRule()); 
            pushFollow(FOLLOW_ruleStyleFeature_in_entryRuleStyleFeature1468);
            iv_ruleStyleFeature=ruleStyleFeature();

            state._fsp--;

             current =iv_ruleStyleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyleFeature1478); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:693:1: ruleStyleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:696:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:697:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:697:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Point_2= rulePoint | this_Corner_3= ruleCorner | this_Background_4= ruleBackground | this_Foreground_5= ruleForeground | this_Transparency_6= ruleTransparency | this_FontProperties_7= ruleFontProperties | this_TextValue_8= ruleTextValue | this_TextAlign_9= ruleTextAlign | this_LineStyle_10= ruleLineStyle | this_LineWidth_11= ruleLineWidth )
            int alt12=12;
            switch ( input.LA(1) ) {
            case 58:
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
            case 56:
                {
                alt12=5;
                }
                break;
            case 55:
                {
                alt12=6;
                }
                break;
            case 57:
                {
                alt12=7;
                }
                break;
            case 70:
                {
                alt12=8;
                }
                break;
            case 68:
                {
                alt12=9;
                }
                break;
            case 77:
                {
                alt12=10;
                }
                break;
            case 78:
                {
                alt12=11;
                }
                break;
            case 80:
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:698:5: this_Size_0= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getSizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleStyleFeature1525);
                    this_Size_0=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:708:5: this_Position_1= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getPositionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleStyleFeature1552);
                    this_Position_1=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:718:5: this_Point_2= rulePoint
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getPointParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePoint_in_ruleStyleFeature1579);
                    this_Point_2=rulePoint();

                    state._fsp--;

                     
                            current = this_Point_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:728:5: this_Corner_3= ruleCorner
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getCornerParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCorner_in_ruleStyleFeature1606);
                    this_Corner_3=ruleCorner();

                    state._fsp--;

                     
                            current = this_Corner_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:738:5: this_Background_4= ruleBackground
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getBackgroundParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBackground_in_ruleStyleFeature1633);
                    this_Background_4=ruleBackground();

                    state._fsp--;

                     
                            current = this_Background_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:748:5: this_Foreground_5= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getForegroundParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleStyleFeature1660);
                    this_Foreground_5=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:758:5: this_Transparency_6= ruleTransparency
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getTransparencyParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTransparency_in_ruleStyleFeature1687);
                    this_Transparency_6=ruleTransparency();

                    state._fsp--;

                     
                            current = this_Transparency_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:768:5: this_FontProperties_7= ruleFontProperties
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getFontPropertiesParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleFontProperties_in_ruleStyleFeature1714);
                    this_FontProperties_7=ruleFontProperties();

                    state._fsp--;

                     
                            current = this_FontProperties_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:778:5: this_TextValue_8= ruleTextValue
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getTextValueParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleTextValue_in_ruleStyleFeature1741);
                    this_TextValue_8=ruleTextValue();

                    state._fsp--;

                     
                            current = this_TextValue_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:788:5: this_TextAlign_9= ruleTextAlign
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getTextAlignParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleTextAlign_in_ruleStyleFeature1768);
                    this_TextAlign_9=ruleTextAlign();

                    state._fsp--;

                     
                            current = this_TextAlign_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:798:5: this_LineStyle_10= ruleLineStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getLineStyleParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleStyleFeature1795);
                    this_LineStyle_10=ruleLineStyle();

                    state._fsp--;

                     
                            current = this_LineStyle_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:808:5: this_LineWidth_11= ruleLineWidth
                    {
                     
                            newCompositeNode(grammarAccess.getStyleFeatureAccess().getLineWidthParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleLineWidth_in_ruleStyleFeature1822);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:826:1: entryRuleChildElement returns [EObject current=null] : iv_ruleChildElement= ruleChildElement EOF ;
    public final EObject entryRuleChildElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildElement = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:827:2: (iv_ruleChildElement= ruleChildElement EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:828:2: iv_ruleChildElement= ruleChildElement EOF
            {
             newCompositeNode(grammarAccess.getChildElementRule()); 
            pushFollow(FOLLOW_ruleChildElement_in_entryRuleChildElement1859);
            iv_ruleChildElement=ruleChildElement();

            state._fsp--;

             current =iv_ruleChildElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChildElement1869); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:835:1: ruleChildElement returns [EObject current=null] : (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) ;
    public final EObject ruleChildElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElement_0 = null;

        EObject this_Line_1 = null;

        EObject this_Arrow_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:838:28: ( (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:839:1: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:839:1: (this_ConnectableElement_0= ruleConnectableElement | this_Line_1= ruleLine | this_Arrow_2= ruleArrow )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 36:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 52:
            case 53:
            case 54:
                {
                alt13=1;
                }
                break;
            case 47:
            case 48:
                {
                alt13=2;
                }
                break;
            case 49:
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:840:5: this_ConnectableElement_0= ruleConnectableElement
                    {
                     
                            newCompositeNode(grammarAccess.getChildElementAccess().getConnectableElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConnectableElement_in_ruleChildElement1916);
                    this_ConnectableElement_0=ruleConnectableElement();

                    state._fsp--;

                     
                            current = this_ConnectableElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:850:5: this_Line_1= ruleLine
                    {
                     
                            newCompositeNode(grammarAccess.getChildElementAccess().getLineParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLine_in_ruleChildElement1943);
                    this_Line_1=ruleLine();

                    state._fsp--;

                     
                            current = this_Line_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:860:5: this_Arrow_2= ruleArrow
                    {
                     
                            newCompositeNode(grammarAccess.getChildElementAccess().getArrowParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleArrow_in_ruleChildElement1970);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:876:1: entryRuleFeatureConditional returns [EObject current=null] : iv_ruleFeatureConditional= ruleFeatureConditional EOF ;
    public final EObject entryRuleFeatureConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureConditional = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:877:2: (iv_ruleFeatureConditional= ruleFeatureConditional EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:878:2: iv_ruleFeatureConditional= ruleFeatureConditional EOF
            {
             newCompositeNode(grammarAccess.getFeatureConditionalRule()); 
            pushFollow(FOLLOW_ruleFeatureConditional_in_entryRuleFeatureConditional2005);
            iv_ruleFeatureConditional=ruleFeatureConditional();

            state._fsp--;

             current =iv_ruleFeatureConditional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureConditional2015); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:885:1: ruleFeatureConditional returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleFeatureConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:888:28: ( (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:889:1: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:889:1: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:889:3: otherlv_0= 'if' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleFeatureConditional2052); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureConditionalAccess().getIfKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:893:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:894:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:894:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:895:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureConditionalRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFeatureConditionalAccess().getModelAttributeEAttributeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureConditional2075);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:908:2: ( (lv_operator_2_0= ruleOperator ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:909:1: (lv_operator_2_0= ruleOperator )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:909:1: (lv_operator_2_0= ruleOperator )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:910:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getFeatureConditionalAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleFeatureConditional2096);
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:926:2: ( (lv_value_3_0= ruleValue ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:927:1: (lv_value_3_0= ruleValue )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:927:1: (lv_value_3_0= ruleValue )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:928:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getFeatureConditionalAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleFeatureConditional2117);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:952:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:953:2: (iv_ruleNode= ruleNode EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:954:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode2153);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode2163); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:961:1: ruleNode returns [EObject current=null] : ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:964:28: ( ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:965:1: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:965:1: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:965:2: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'node' ( ( ruleQualifiedName ) ) ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:965:2: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:965:3: ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:965:3: ( (lv_tool_0_0= 'tool' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:966:1: (lv_tool_0_0= 'tool' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:966:1: (lv_tool_0_0= 'tool' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:967:3: lv_tool_0_0= 'tool'
                    {
                    lv_tool_0_0=(Token)match(input,23,FOLLOW_23_in_ruleNode2207); 

                            newLeafNode(lv_tool_0_0, grammarAccess.getNodeAccess().getToolToolKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(current, "tool", true, "tool");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:980:2: ( (lv_toolName_1_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:981:1: (lv_toolName_1_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:981:1: (lv_toolName_1_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:982:3: lv_toolName_1_0= RULE_STRING
                    {
                    lv_toolName_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode2237); 

                    			newLeafNode(lv_toolName_1_0, grammarAccess.getNodeAccess().getToolNameSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"toolName",
                            		lv_toolName_1_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:998:2: ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==24) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:998:3: ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:998:3: ( (lv_group_2_0= 'group' ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:999:1: (lv_group_2_0= 'group' )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:999:1: (lv_group_2_0= 'group' )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1000:3: lv_group_2_0= 'group'
                            {
                            lv_group_2_0=(Token)match(input,24,FOLLOW_24_in_ruleNode2261); 

                                    newLeafNode(lv_group_2_0, grammarAccess.getNodeAccess().getGroupGroupKeyword_0_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeRule());
                            	        }
                                   		setWithLastConsumed(current, "group", true, "group");
                            	    

                            }


                            }

                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1013:2: ( (otherlv_3= RULE_ID ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1014:1: (otherlv_3= RULE_ID )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1014:1: (otherlv_3= RULE_ID )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1015:3: otherlv_3= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeRule());
                            	        }
                                    
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode2294); 

                            		newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getGroupIdToolGroupCrossReference_0_2_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1026:4: ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==25) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1026:5: ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1026:5: ( (lv_icon_4_0= 'icon' ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1027:1: (lv_icon_4_0= 'icon' )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1027:1: (lv_icon_4_0= 'icon' )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1028:3: lv_icon_4_0= 'icon'
                            {
                            lv_icon_4_0=(Token)match(input,25,FOLLOW_25_in_ruleNode2315); 

                                    newLeafNode(lv_icon_4_0, grammarAccess.getNodeAccess().getIconIconKeyword_0_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeRule());
                            	        }
                                   		setWithLastConsumed(current, "icon", true, "icon");
                            	    

                            }


                            }

                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1041:2: ( (lv_imageId_5_0= RULE_ID ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1042:1: (lv_imageId_5_0= RULE_ID )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1042:1: (lv_imageId_5_0= RULE_ID )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1043:3: lv_imageId_5_0= RULE_ID
                            {
                            lv_imageId_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode2345); 

                            			newLeafNode(lv_imageId_5_0, grammarAccess.getNodeAccess().getImageIdIDTerminalRuleCall_0_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNodeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"imageId",
                                    		lv_imageId_5_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleNode2366); 

                	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getNodeKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1063:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1064:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1064:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1065:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getModelClassEClassCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNode2389);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1078:2: ( (lv_rootFigure_8_0= ruleConnectableElement ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1079:1: (lv_rootFigure_8_0= ruleConnectableElement )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1079:1: (lv_rootFigure_8_0= ruleConnectableElement )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1080:3: lv_rootFigure_8_0= ruleConnectableElement
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getRootFigureConnectableElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConnectableElement_in_ruleNode2410);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1104:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1105:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1106:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink2446);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink2456); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1113:1: ruleLink returns [EObject current=null] : ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1116:28: ( ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1117:1: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1117:1: ( ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1117:2: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )? otherlv_6= 'link' ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) ) ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '{' ( (lv_features_18_0= ruleLinkFeature ) )* ( (lv_decorators_19_0= ruleDecorator ) )* otherlv_20= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1117:2: ( ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1117:3: ( (lv_tool_0_0= 'tool' ) ) ( (lv_toolName_1_0= RULE_STRING ) ) ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1117:3: ( (lv_tool_0_0= 'tool' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1118:1: (lv_tool_0_0= 'tool' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1118:1: (lv_tool_0_0= 'tool' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1119:3: lv_tool_0_0= 'tool'
                    {
                    lv_tool_0_0=(Token)match(input,23,FOLLOW_23_in_ruleLink2500); 

                            newLeafNode(lv_tool_0_0, grammarAccess.getLinkAccess().getToolToolKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "tool", true, "tool");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1132:2: ( (lv_toolName_1_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1133:1: (lv_toolName_1_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1133:1: (lv_toolName_1_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1134:3: lv_toolName_1_0= RULE_STRING
                    {
                    lv_toolName_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink2530); 

                    			newLeafNode(lv_toolName_1_0, grammarAccess.getLinkAccess().getToolNameSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"toolName",
                            		lv_toolName_1_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1150:2: ( ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1150:3: ( (lv_group_2_0= 'group' ) ) ( (otherlv_3= RULE_ID ) )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1150:3: ( (lv_group_2_0= 'group' ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1151:1: (lv_group_2_0= 'group' )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1151:1: (lv_group_2_0= 'group' )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1152:3: lv_group_2_0= 'group'
                            {
                            lv_group_2_0=(Token)match(input,24,FOLLOW_24_in_ruleLink2554); 

                                    newLeafNode(lv_group_2_0, grammarAccess.getLinkAccess().getGroupGroupKeyword_0_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLinkRule());
                            	        }
                                   		setWithLastConsumed(current, "group", true, "group");
                            	    

                            }


                            }

                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1165:2: ( (otherlv_3= RULE_ID ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1166:1: (otherlv_3= RULE_ID )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1166:1: (otherlv_3= RULE_ID )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1167:3: otherlv_3= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLinkRule());
                            	        }
                                    
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2587); 

                            		newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getGroupIdToolGroupCrossReference_0_2_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1178:4: ( ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==25) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1178:5: ( (lv_icon_4_0= 'icon' ) ) ( (lv_imageId_5_0= RULE_ID ) )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1178:5: ( (lv_icon_4_0= 'icon' ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1179:1: (lv_icon_4_0= 'icon' )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1179:1: (lv_icon_4_0= 'icon' )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1180:3: lv_icon_4_0= 'icon'
                            {
                            lv_icon_4_0=(Token)match(input,25,FOLLOW_25_in_ruleLink2608); 

                                    newLeafNode(lv_icon_4_0, grammarAccess.getLinkAccess().getIconIconKeyword_0_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLinkRule());
                            	        }
                                   		setWithLastConsumed(current, "icon", true, "icon");
                            	    

                            }


                            }

                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1193:2: ( (lv_imageId_5_0= RULE_ID ) )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1194:1: (lv_imageId_5_0= RULE_ID )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1194:1: (lv_imageId_5_0= RULE_ID )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1195:3: lv_imageId_5_0= RULE_ID
                            {
                            lv_imageId_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2638); 

                            			newLeafNode(lv_imageId_5_0, grammarAccess.getLinkAccess().getImageIdIDTerminalRuleCall_0_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLinkRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"imageId",
                                    		lv_imageId_5_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleLink2659); 

                	newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getLinkKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1215:1: ( ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) ) | ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) ) )
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1215:2: ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1215:2: ( ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1215:3: ( (lv_reference_7_0= 'reference' ) ) ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1215:3: ( (lv_reference_7_0= 'reference' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1216:1: (lv_reference_7_0= 'reference' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1216:1: (lv_reference_7_0= 'reference' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1217:3: lv_reference_7_0= 'reference'
                    {
                    lv_reference_7_0=(Token)match(input,28,FOLLOW_28_in_ruleLink2679); 

                            newLeafNode(lv_reference_7_0, grammarAccess.getLinkAccess().getReferenceReferenceKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "reference", true, "reference");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1230:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1231:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1231:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1232:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelReferenceEReferenceCrossReference_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2715);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1246:6: ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1246:6: ( ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1246:7: ( (lv_complex_9_0= 'class' ) ) ( ( ruleQualifiedName ) ) otherlv_11= 'source' ( ( ruleQualifiedName ) ) otherlv_13= 'target' ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1246:7: ( (lv_complex_9_0= 'class' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1247:1: (lv_complex_9_0= 'class' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1247:1: (lv_complex_9_0= 'class' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1248:3: lv_complex_9_0= 'class'
                    {
                    lv_complex_9_0=(Token)match(input,29,FOLLOW_29_in_ruleLink2741); 

                            newLeafNode(lv_complex_9_0, grammarAccess.getLinkAccess().getComplexClassKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "complex", true, "class");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1261:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1262:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1262:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1263:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getModelClassEClassCrossReference_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2777);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleLink2789); 

                        	newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getSourceKeyword_2_1_2());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1280:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1281:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1281:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1282:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getSourceReferenceEReferenceCrossReference_2_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2812);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_31_in_ruleLink2824); 

                        	newLeafNode(otherlv_13, grammarAccess.getLinkAccess().getTargetKeyword_2_1_4());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1299:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1300:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1300:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1301:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getTargetReferenceEReferenceCrossReference_2_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink2847);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1314:4: ( ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1314:5: ( (lv_styled_15_0= '+' ) ) ( (otherlv_16= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1314:5: ( (lv_styled_15_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1315:1: (lv_styled_15_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1315:1: (lv_styled_15_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1316:3: lv_styled_15_0= '+'
                    {
                    lv_styled_15_0=(Token)match(input,21,FOLLOW_21_in_ruleLink2868); 

                            newLeafNode(lv_styled_15_0, grammarAccess.getLinkAccess().getStyledPlusSignKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1329:2: ( (otherlv_16= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1330:1: (otherlv_16= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1330:1: (otherlv_16= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1331:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink2901); 

                    		newLeafNode(otherlv_16, grammarAccess.getLinkAccess().getStyleStyleCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleLink2915); 

                	newLeafNode(otherlv_17, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1346:1: ( (lv_features_18_0= ruleLinkFeature ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==55||LA22_0==78||LA22_0==80) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1347:1: (lv_features_18_0= ruleLinkFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1347:1: (lv_features_18_0= ruleLinkFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1348:3: lv_features_18_0= ruleLinkFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getFeaturesLinkFeatureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkFeature_in_ruleLink2936);
            	    lv_features_18_0=ruleLinkFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_18_0, 
            	            		"LinkFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1364:3: ( (lv_decorators_19_0= ruleDecorator ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1365:1: (lv_decorators_19_0= ruleDecorator )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1365:1: (lv_decorators_19_0= ruleDecorator )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1366:3: lv_decorators_19_0= ruleDecorator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getDecoratorsDecoratorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecorator_in_ruleLink2958);
            	    lv_decorators_19_0=ruleDecorator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decorators",
            	            		lv_decorators_19_0, 
            	            		"Decorator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleLink2971); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1394:1: entryRuleLinkFeature returns [EObject current=null] : iv_ruleLinkFeature= ruleLinkFeature EOF ;
    public final EObject entryRuleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1395:2: (iv_ruleLinkFeature= ruleLinkFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1396:2: iv_ruleLinkFeature= ruleLinkFeature EOF
            {
             newCompositeNode(grammarAccess.getLinkFeatureRule()); 
            pushFollow(FOLLOW_ruleLinkFeature_in_entryRuleLinkFeature3007);
            iv_ruleLinkFeature=ruleLinkFeature();

            state._fsp--;

             current =iv_ruleLinkFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkFeature3017); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1403:1: ruleLinkFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) ;
    public final EObject ruleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_LineStyle_1 = null;

        EObject this_LineWidth_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1406:28: ( (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1407:1: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1407:1: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt24=1;
                }
                break;
            case 78:
                {
                alt24=2;
                }
                break;
            case 80:
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1408:5: this_Foreground_0= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getLinkFeatureAccess().getForegroundParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleLinkFeature3064);
                    this_Foreground_0=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1418:5: this_LineStyle_1= ruleLineStyle
                    {
                     
                            newCompositeNode(grammarAccess.getLinkFeatureAccess().getLineStyleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleLinkFeature3091);
                    this_LineStyle_1=ruleLineStyle();

                    state._fsp--;

                     
                            current = this_LineStyle_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1428:5: this_LineWidth_2= ruleLineWidth
                    {
                     
                            newCompositeNode(grammarAccess.getLinkFeatureAccess().getLineWidthParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLineWidth_in_ruleLinkFeature3118);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1444:1: entryRuleDecorator returns [EObject current=null] : iv_ruleDecorator= ruleDecorator EOF ;
    public final EObject entryRuleDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorator = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1445:2: (iv_ruleDecorator= ruleDecorator EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1446:2: iv_ruleDecorator= ruleDecorator EOF
            {
             newCompositeNode(grammarAccess.getDecoratorRule()); 
            pushFollow(FOLLOW_ruleDecorator_in_entryRuleDecorator3153);
            iv_ruleDecorator=ruleDecorator();

            state._fsp--;

             current =iv_ruleDecorator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorator3163); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1453:1: ruleDecorator returns [EObject current=null] : (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) ;
    public final EObject ruleDecorator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_position_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1456:28: ( (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1457:1: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1457:1: (otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1457:3: otherlv_0= 'decorator' ( (lv_position_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_element_3_0= ruleDecoratorElement ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleDecorator3200); 

                	newLeafNode(otherlv_0, grammarAccess.getDecoratorAccess().getDecoratorKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1461:1: ( (lv_position_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1462:1: (lv_position_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1462:1: (lv_position_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1463:3: lv_position_1_0= RULE_INT
            {
            lv_position_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecorator3217); 

            			newLeafNode(lv_position_1_0, grammarAccess.getDecoratorAccess().getPositionINTTerminalRuleCall_1_0()); 
            		

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleDecorator3234); 

                	newLeafNode(otherlv_2, grammarAccess.getDecoratorAccess().getPercentSignKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1483:1: ( (lv_element_3_0= ruleDecoratorElement ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1484:1: (lv_element_3_0= ruleDecoratorElement )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1484:1: (lv_element_3_0= ruleDecoratorElement )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1485:3: lv_element_3_0= ruleDecoratorElement
            {
             
            	        newCompositeNode(grammarAccess.getDecoratorAccess().getElementDecoratorElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDecoratorElement_in_ruleDecorator3255);
            lv_element_3_0=ruleDecoratorElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDecoratorRule());
            	        }
                   		set(
                   			current, 
                   			"element",
                    		lv_element_3_0, 
                    		"DecoratorElement");
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1509:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1510:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1511:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor3291);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor3301); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1518:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_direction_1_0 = null;

        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1521:28: ( (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1522:1: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1522:1: (otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1522:3: otherlv_0= 'anchor' ( (lv_direction_1_0= ruleAnchorDirection ) ) ( ( ruleQualifiedName ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleAnchor3338); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAnchorKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1526:1: ( (lv_direction_1_0= ruleAnchorDirection ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1527:1: (lv_direction_1_0= ruleAnchorDirection )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1527:1: (lv_direction_1_0= ruleAnchorDirection )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1528:3: lv_direction_1_0= ruleAnchorDirection
            {
             
            	        newCompositeNode(grammarAccess.getAnchorAccess().getDirectionAnchorDirectionEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnchorDirection_in_ruleAnchor3359);
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1544:2: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1545:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1545:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1546:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnchorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnchorAccess().getModelReferenceEReferenceCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnchor3382);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1559:2: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1560:1: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1560:1: (lv_conditional_3_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1561:3: lv_conditional_3_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleAnchor3403);
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


            }


            }

             leaveRule(); 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1585:1: entryRuleCustomColor returns [EObject current=null] : iv_ruleCustomColor= ruleCustomColor EOF ;
    public final EObject entryRuleCustomColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomColor = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1586:2: (iv_ruleCustomColor= ruleCustomColor EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1587:2: iv_ruleCustomColor= ruleCustomColor EOF
            {
             newCompositeNode(grammarAccess.getCustomColorRule()); 
            pushFollow(FOLLOW_ruleCustomColor_in_entryRuleCustomColor3440);
            iv_ruleCustomColor=ruleCustomColor();

            state._fsp--;

             current =iv_ruleCustomColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomColor3450); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1594:1: ruleCustomColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1597:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1598:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1598:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1598:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_R_2_0= RULE_INT ) ) ( (lv_G_3_0= RULE_INT ) ) ( (lv_B_4_0= RULE_INT ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleCustomColor3487); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomColorAccess().getColorKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1602:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1603:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1603:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1604:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomColor3504); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1620:2: ( (lv_R_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1621:1: (lv_R_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1621:1: (lv_R_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1622:3: lv_R_2_0= RULE_INT
            {
            lv_R_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomColor3526); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1638:2: ( (lv_G_3_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1639:1: (lv_G_3_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1639:1: (lv_G_3_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1640:3: lv_G_3_0= RULE_INT
            {
            lv_G_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomColor3548); 

            			newLeafNode(lv_G_3_0, grammarAccess.getCustomColorAccess().getGINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"G",
                    		lv_G_3_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1656:2: ( (lv_B_4_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1657:1: (lv_B_4_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1657:1: (lv_B_4_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1658:3: lv_B_4_0= RULE_INT
            {
            lv_B_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomColor3570); 

            			newLeafNode(lv_B_4_0, grammarAccess.getCustomColorAccess().getBINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"B",
                    		lv_B_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCustomColor3587); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1686:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1687:2: (iv_ruleColor= ruleColor EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1688:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor3623);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor3633); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1695:1: ruleColor returns [EObject current=null] : ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_default_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1698:28: ( ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1699:1: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1699:1: ( ( (lv_default_0_0= ruleDefaultColor ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=83 && LA26_0<=98)) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1699:2: ( (lv_default_0_0= ruleDefaultColor ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1699:2: ( (lv_default_0_0= ruleDefaultColor ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1700:1: (lv_default_0_0= ruleDefaultColor )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1700:1: (lv_default_0_0= ruleDefaultColor )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1701:3: lv_default_0_0= ruleDefaultColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getDefaultDefaultColorEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultColor_in_ruleColor3679);
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1718:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1718:6: ( (otherlv_1= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1719:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1719:1: (otherlv_1= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1720:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColor3705); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1739:1: entryRuleConnectableElement returns [EObject current=null] : iv_ruleConnectableElement= ruleConnectableElement EOF ;
    public final EObject entryRuleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElement = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1740:2: (iv_ruleConnectableElement= ruleConnectableElement EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1741:2: iv_ruleConnectableElement= ruleConnectableElement EOF
            {
             newCompositeNode(grammarAccess.getConnectableElementRule()); 
            pushFollow(FOLLOW_ruleConnectableElement_in_entryRuleConnectableElement3741);
            iv_ruleConnectableElement=ruleConnectableElement();

            state._fsp--;

             current =iv_ruleConnectableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectableElement3751); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1748:1: ruleConnectableElement returns [EObject current=null] : (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1751:28: ( (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1752:1: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1752:1: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polyline_3= rulePolyline | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Invisible_6= ruleInvisible | this_Custom_7= ruleCustom | this_Triangle_8= ruleTriangle )
            int alt27=9;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt27=1;
                }
                break;
            case 41:
                {
                alt27=2;
                }
                break;
            case 42:
            case 43:
                {
                alt27=3;
                }
                break;
            case 44:
            case 45:
                {
                alt27=4;
                }
                break;
            case 52:
                {
                alt27=5;
                }
                break;
            case 53:
                {
                alt27=6;
                }
                break;
            case 54:
                {
                alt27=7;
                }
                break;
            case 36:
                {
                alt27=8;
                }
                break;
            case 46:
                {
                alt27=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1753:5: this_Rectangle_0= ruleRectangle
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getRectangleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRectangle_in_ruleConnectableElement3798);
                    this_Rectangle_0=ruleRectangle();

                    state._fsp--;

                     
                            current = this_Rectangle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1763:5: this_Rhombus_1= ruleRhombus
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getRhombusParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRhombus_in_ruleConnectableElement3825);
                    this_Rhombus_1=ruleRhombus();

                    state._fsp--;

                     
                            current = this_Rhombus_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1773:5: this_Ellipse_2= ruleEllipse
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getEllipseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEllipse_in_ruleConnectableElement3852);
                    this_Ellipse_2=ruleEllipse();

                    state._fsp--;

                     
                            current = this_Ellipse_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1783:5: this_Polyline_3= rulePolyline
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getPolylineParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePolyline_in_ruleConnectableElement3879);
                    this_Polyline_3=rulePolyline();

                    state._fsp--;

                     
                            current = this_Polyline_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1793:5: this_Label_4= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getLabelParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleConnectableElement3906);
                    this_Label_4=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1803:5: this_Image_5= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getImageParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleConnectableElement3933);
                    this_Image_5=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1813:5: this_Invisible_6= ruleInvisible
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getInvisibleParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleInvisible_in_ruleConnectableElement3960);
                    this_Invisible_6=ruleInvisible();

                    state._fsp--;

                     
                            current = this_Invisible_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1823:5: this_Custom_7= ruleCustom
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getCustomParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleCustom_in_ruleConnectableElement3987);
                    this_Custom_7=ruleCustom();

                    state._fsp--;

                     
                            current = this_Custom_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1833:5: this_Triangle_8= ruleTriangle
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getTriangleParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleTriangle_in_ruleConnectableElement4014);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1849:1: entryRuleDecoratorElement returns [EObject current=null] : iv_ruleDecoratorElement= ruleDecoratorElement EOF ;
    public final EObject entryRuleDecoratorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoratorElement = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1850:2: (iv_ruleDecoratorElement= ruleDecoratorElement EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1851:2: iv_ruleDecoratorElement= ruleDecoratorElement EOF
            {
             newCompositeNode(grammarAccess.getDecoratorElementRule()); 
            pushFollow(FOLLOW_ruleDecoratorElement_in_entryRuleDecoratorElement4049);
            iv_ruleDecoratorElement=ruleDecoratorElement();

            state._fsp--;

             current =iv_ruleDecoratorElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecoratorElement4059); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1858:1: ruleDecoratorElement returns [EObject current=null] : (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1861:28: ( (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1862:1: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1862:1: (this_Ellipse_0= ruleEllipse | this_Rhombus_1= ruleRhombus | this_Polyline_2= rulePolyline | this_Triangle_3= ruleTriangle | this_Label_4= ruleLabel | this_Image_5= ruleImage | this_Arrow_6= ruleArrow | this_Line_7= ruleLine )
            int alt28=8;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
                {
                alt28=1;
                }
                break;
            case 41:
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
                {
                alt28=4;
                }
                break;
            case 52:
                {
                alt28=5;
                }
                break;
            case 53:
                {
                alt28=6;
                }
                break;
            case 49:
                {
                alt28=7;
                }
                break;
            case 47:
            case 48:
                {
                alt28=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1863:5: this_Ellipse_0= ruleEllipse
                    {
                     
                            newCompositeNode(grammarAccess.getDecoratorElementAccess().getEllipseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEllipse_in_ruleDecoratorElement4106);
                    this_Ellipse_0=ruleEllipse();

                    state._fsp--;

                     
                            current = this_Ellipse_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1873:5: this_Rhombus_1= ruleRhombus
                    {
                     
                            newCompositeNode(grammarAccess.getDecoratorElementAccess().getRhombusParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRhombus_in_ruleDecoratorElement4133);
                    this_Rhombus_1=ruleRhombus();

                    state._fsp--;

                     
                            current = this_Rhombus_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1883:5: this_Polyline_2= rulePolyline
                    {
                     
                            newCompositeNode(grammarAccess.getDecoratorElementAccess().getPolylineParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePolyline_in_ruleDecoratorElement4160);
                    this_Polyline_2=rulePolyline();

                    state._fsp--;

                     
                            current = this_Polyline_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1893:5: this_Triangle_3= ruleTriangle
                    {
                     
                            newCompositeNode(grammarAccess.getDecoratorElementAccess().getTriangleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTriangle_in_ruleDecoratorElement4187);
                    this_Triangle_3=ruleTriangle();

                    state._fsp--;

                     
                            current = this_Triangle_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1903:5: this_Label_4= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getDecoratorElementAccess().getLabelParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleDecoratorElement4214);
                    this_Label_4=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1913:5: this_Image_5= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getDecoratorElementAccess().getImageParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleDecoratorElement4241);
                    this_Image_5=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1923:5: this_Arrow_6= ruleArrow
                    {
                     
                            newCompositeNode(grammarAccess.getDecoratorElementAccess().getArrowParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleArrow_in_ruleDecoratorElement4268);
                    this_Arrow_6=ruleArrow();

                    state._fsp--;

                     
                            current = this_Arrow_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1933:5: this_Line_7= ruleLine
                    {
                     
                            newCompositeNode(grammarAccess.getDecoratorElementAccess().getLineParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleLine_in_ruleDecoratorElement4295);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1949:1: entryRuleConnectableElementFeature returns [EObject current=null] : iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF ;
    public final EObject entryRuleConnectableElementFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElementFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1950:2: (iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1951:2: iv_ruleConnectableElementFeature= ruleConnectableElementFeature EOF
            {
             newCompositeNode(grammarAccess.getConnectableElementFeatureRule()); 
            pushFollow(FOLLOW_ruleConnectableElementFeature_in_entryRuleConnectableElementFeature4330);
            iv_ruleConnectableElementFeature=ruleConnectableElementFeature();

            state._fsp--;

             current =iv_ruleConnectableElementFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectableElementFeature4340); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1958:1: ruleConnectableElementFeature returns [EObject current=null] : (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1961:28: ( (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1962:1: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1962:1: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_Transparency_3= ruleTransparency | this_LineStyle_4= ruleLineStyle | this_LineWidth_5= ruleLineWidth | this_Contains_6= ruleContains | this_Anchor_7= ruleAnchor | this_Layout_8= ruleLayout | this_Visible_9= ruleVisible )
            int alt29=10;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt29=1;
                }
                break;
            case 58:
                {
                alt29=2;
                }
                break;
            case 55:
            case 56:
                {
                alt29=3;
                }
                break;
            case 57:
                {
                alt29=4;
                }
                break;
            case 78:
                {
                alt29=5;
                }
                break;
            case 80:
                {
                alt29=6;
                }
                break;
            case 50:
                {
                alt29=7;
                }
                break;
            case 34:
                {
                alt29=8;
                }
                break;
            case 64:
                {
                alt29=9;
                }
                break;
            case 54:
                {
                alt29=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1963:5: this_Position_0= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getPositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleConnectableElementFeature4387);
                    this_Position_0=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1973:5: this_Size_1= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getSizeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleConnectableElementFeature4414);
                    this_Size_1=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1983:5: this_ColorFeature_2= ruleColorFeature
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getColorFeatureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleColorFeature_in_ruleConnectableElementFeature4441);
                    this_ColorFeature_2=ruleColorFeature();

                    state._fsp--;

                     
                            current = this_ColorFeature_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:1993:5: this_Transparency_3= ruleTransparency
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getTransparencyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTransparency_in_ruleConnectableElementFeature4468);
                    this_Transparency_3=ruleTransparency();

                    state._fsp--;

                     
                            current = this_Transparency_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2003:5: this_LineStyle_4= ruleLineStyle
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getLineStyleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleConnectableElementFeature4495);
                    this_LineStyle_4=ruleLineStyle();

                    state._fsp--;

                     
                            current = this_LineStyle_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2013:5: this_LineWidth_5= ruleLineWidth
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getLineWidthParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLineWidth_in_ruleConnectableElementFeature4522);
                    this_LineWidth_5=ruleLineWidth();

                    state._fsp--;

                     
                            current = this_LineWidth_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2023:5: this_Contains_6= ruleContains
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getContainsParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleContains_in_ruleConnectableElementFeature4549);
                    this_Contains_6=ruleContains();

                    state._fsp--;

                     
                            current = this_Contains_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2033:5: this_Anchor_7= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getAnchorParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleConnectableElementFeature4576);
                    this_Anchor_7=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2043:5: this_Layout_8= ruleLayout
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getLayoutParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleLayout_in_ruleConnectableElementFeature4603);
                    this_Layout_8=ruleLayout();

                    state._fsp--;

                     
                            current = this_Layout_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2053:5: this_Visible_9= ruleVisible
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementFeatureAccess().getVisibleParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleVisible_in_ruleConnectableElementFeature4630);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2069:1: entryRuleCustomFigure returns [EObject current=null] : iv_ruleCustomFigure= ruleCustomFigure EOF ;
    public final EObject entryRuleCustomFigure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFigure = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2070:2: (iv_ruleCustomFigure= ruleCustomFigure EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2071:2: iv_ruleCustomFigure= ruleCustomFigure EOF
            {
             newCompositeNode(grammarAccess.getCustomFigureRule()); 
            pushFollow(FOLLOW_ruleCustomFigure_in_entryRuleCustomFigure4665);
            iv_ruleCustomFigure=ruleCustomFigure();

            state._fsp--;

             current =iv_ruleCustomFigure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomFigure4675); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2078:1: ruleCustomFigure returns [EObject current=null] : (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) ;
    public final EObject ruleCustomFigure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2081:28: ( (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2082:1: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2082:1: (otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2082:3: otherlv_0= 'figure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_element_3_0= ruleConnectableElement ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleCustomFigure4712); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomFigureAccess().getFigureKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2086:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2087:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2087:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2088:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomFigure4729); 

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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleCustomFigure4746); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomFigureAccess().getAsKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2108:1: ( (lv_element_3_0= ruleConnectableElement ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2109:1: (lv_element_3_0= ruleConnectableElement )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2109:1: (lv_element_3_0= ruleConnectableElement )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2110:3: lv_element_3_0= ruleConnectableElement
            {
             
            	        newCompositeNode(grammarAccess.getCustomFigureAccess().getElementConnectableElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConnectableElement_in_ruleCustomFigure4767);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2134:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2135:2: (iv_ruleCustom= ruleCustom EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2136:2: iv_ruleCustom= ruleCustom EOF
            {
             newCompositeNode(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_ruleCustom_in_entryRuleCustom4803);
            iv_ruleCustom=ruleCustom();

            state._fsp--;

             current =iv_ruleCustom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustom4813); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2143:1: ruleCustom returns [EObject current=null] : (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2146:28: ( (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2147:1: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2147:1: (otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2147:3: otherlv_0= 'figure' ( (otherlv_1= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLinkedFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleCustom4850); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomAccess().getFigureKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2151:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2152:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2152:1: (otherlv_1= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2153:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustom4870); 

            		newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getFigureCustomFigureCrossReference_1_0()); 
            	

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2164:2: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2164:3: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2164:3: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2165:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2165:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2166:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleCustom4889); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getCustomAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2179:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2180:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2180:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2181:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustom4922); 

                    		newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleCustom4936); 

                	newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2196:1: ( (lv_features_5_0= ruleLinkedFeature ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34||LA31_0==50) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2197:1: (lv_features_5_0= ruleLinkedFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2197:1: (lv_features_5_0= ruleLinkedFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2198:3: lv_features_5_0= ruleLinkedFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomAccess().getFeaturesLinkedFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkedFeature_in_ruleCustom4957);
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
            	    break loop31;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2214:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2214:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleCustom4971); 

            	        	newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getChildKeyword_5_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2218:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2219:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2219:1: (lv_children_7_0= ruleChildElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2220:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChildElement_in_ruleCustom4992);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleCustom5006); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2248:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2249:2: (iv_ruleRectangle= ruleRectangle EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2250:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_ruleRectangle_in_entryRuleRectangle5042);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRectangle5052); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2257:1: ruleRectangle returns [EObject current=null] : ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2260:28: ( ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2261:1: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2261:1: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2261:2: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleRectangleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2261:2: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            else if ( (LA33_0==40) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2261:3: ( (lv_rectangle_0_0= 'rectangle' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2261:3: ( (lv_rectangle_0_0= 'rectangle' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2262:1: (lv_rectangle_0_0= 'rectangle' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2262:1: (lv_rectangle_0_0= 'rectangle' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2263:3: lv_rectangle_0_0= 'rectangle'
                    {
                    lv_rectangle_0_0=(Token)match(input,39,FOLLOW_39_in_ruleRectangle5096); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2277:6: ( (lv_square_1_0= 'square' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2277:6: ( (lv_square_1_0= 'square' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2278:1: (lv_square_1_0= 'square' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2278:1: (lv_square_1_0= 'square' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2279:3: lv_square_1_0= 'square'
                    {
                    lv_square_1_0=(Token)match(input,40,FOLLOW_40_in_ruleRectangle5133); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2292:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2292:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2292:4: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2293:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2293:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2294:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleRectangle5166); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getRectangleAccess().getStyledPlusSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRectangleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2307:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2308:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2308:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2309:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRectangleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRectangle5199); 

                    		newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getStyleStyleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRectangle5213); 

                	newLeafNode(otherlv_4, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2324:1: ( (lv_features_5_0= ruleRectangleFeature ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34||LA35_0==50||(LA35_0>=54 && LA35_0<=58)||(LA35_0>=62 && LA35_0<=64)||LA35_0==78||LA35_0==80) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2325:1: (lv_features_5_0= ruleRectangleFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2325:1: (lv_features_5_0= ruleRectangleFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2326:3: lv_features_5_0= ruleRectangleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRectangleAccess().getFeaturesRectangleFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRectangleFeature_in_ruleRectangle5234);
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
            	    break loop35;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2342:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2342:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleRectangle5248); 

            	        	newLeafNode(otherlv_6, grammarAccess.getRectangleAccess().getChildKeyword_4_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2346:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2347:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2347:1: (lv_children_7_0= ruleChildElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2348:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRectangleAccess().getChildrenChildElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChildElement_in_ruleRectangle5269);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleRectangle5283); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2376:1: entryRuleRectangleFeature returns [EObject current=null] : iv_ruleRectangleFeature= ruleRectangleFeature EOF ;
    public final EObject entryRuleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2377:2: (iv_ruleRectangleFeature= ruleRectangleFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2378:2: iv_ruleRectangleFeature= ruleRectangleFeature EOF
            {
             newCompositeNode(grammarAccess.getRectangleFeatureRule()); 
            pushFollow(FOLLOW_ruleRectangleFeature_in_entryRuleRectangleFeature5319);
            iv_ruleRectangleFeature=ruleRectangleFeature();

            state._fsp--;

             current =iv_ruleRectangleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRectangleFeature5329); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2385:1: ruleRectangleFeature returns [EObject current=null] : (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) ;
    public final EObject ruleRectangleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectableElementFeature_0 = null;

        EObject this_Corner_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2388:28: ( (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2389:1: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2389:1: (this_ConnectableElementFeature_0= ruleConnectableElementFeature | this_Corner_1= ruleCorner )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34||LA37_0==50||(LA37_0>=54 && LA37_0<=58)||LA37_0==62||LA37_0==64||LA37_0==78||LA37_0==80) ) {
                alt37=1;
            }
            else if ( (LA37_0==63) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2390:5: this_ConnectableElementFeature_0= ruleConnectableElementFeature
                    {
                     
                            newCompositeNode(grammarAccess.getRectangleFeatureAccess().getConnectableElementFeatureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConnectableElementFeature_in_ruleRectangleFeature5376);
                    this_ConnectableElementFeature_0=ruleConnectableElementFeature();

                    state._fsp--;

                     
                            current = this_ConnectableElementFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2400:5: this_Corner_1= ruleCorner
                    {
                     
                            newCompositeNode(grammarAccess.getRectangleFeatureAccess().getCornerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCorner_in_ruleRectangleFeature5403);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2416:1: entryRuleRhombus returns [EObject current=null] : iv_ruleRhombus= ruleRhombus EOF ;
    public final EObject entryRuleRhombus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhombus = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2417:2: (iv_ruleRhombus= ruleRhombus EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2418:2: iv_ruleRhombus= ruleRhombus EOF
            {
             newCompositeNode(grammarAccess.getRhombusRule()); 
            pushFollow(FOLLOW_ruleRhombus_in_entryRuleRhombus5438);
            iv_ruleRhombus=ruleRhombus();

            state._fsp--;

             current =iv_ruleRhombus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRhombus5448); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2425:1: ruleRhombus returns [EObject current=null] : ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2428:28: ( ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2429:1: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2429:1: ( () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2429:2: () otherlv_1= 'rhombus' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2429:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2430:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRhombusAccess().getRhombusAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleRhombus5494); 

                	newLeafNode(otherlv_1, grammarAccess.getRhombusAccess().getRhombusKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2439:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2439:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2439:2: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2440:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2440:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2441:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleRhombus5513); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getRhombusAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRhombusRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2454:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2455:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2455:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2456:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRhombusRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRhombus5546); 

                    		newLeafNode(otherlv_3, grammarAccess.getRhombusAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRhombus5560); 

                	newLeafNode(otherlv_4, grammarAccess.getRhombusAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2471:1: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==34||LA39_0==50||(LA39_0>=54 && LA39_0<=58)||LA39_0==62||LA39_0==64||LA39_0==78||LA39_0==80) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2472:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2472:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2473:3: lv_features_5_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRhombusAccess().getFeaturesConnectableElementFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectableElementFeature_in_ruleRhombus5581);
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
            	    break loop39;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2489:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==38) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2489:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleRhombus5595); 

            	        	newLeafNode(otherlv_6, grammarAccess.getRhombusAccess().getChildKeyword_5_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2493:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2494:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2494:1: (lv_children_7_0= ruleChildElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2495:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRhombusAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChildElement_in_ruleRhombus5616);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRhombusRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleRhombus5630); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2523:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2524:2: (iv_ruleEllipse= ruleEllipse EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2525:2: iv_ruleEllipse= ruleEllipse EOF
            {
             newCompositeNode(grammarAccess.getEllipseRule()); 
            pushFollow(FOLLOW_ruleEllipse_in_entryRuleEllipse5666);
            iv_ruleEllipse=ruleEllipse();

            state._fsp--;

             current =iv_ruleEllipse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEllipse5676); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2532:1: ruleEllipse returns [EObject current=null] : ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2535:28: ( ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2536:1: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2536:1: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2536:2: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2536:2: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==42) ) {
                alt41=1;
            }
            else if ( (LA41_0==43) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2536:3: ( (lv_ellipse_0_0= 'ellipse' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2536:3: ( (lv_ellipse_0_0= 'ellipse' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2537:1: (lv_ellipse_0_0= 'ellipse' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2537:1: (lv_ellipse_0_0= 'ellipse' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2538:3: lv_ellipse_0_0= 'ellipse'
                    {
                    lv_ellipse_0_0=(Token)match(input,42,FOLLOW_42_in_ruleEllipse5720); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2552:6: ( (lv_circle_1_0= 'circle' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2552:6: ( (lv_circle_1_0= 'circle' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2553:1: (lv_circle_1_0= 'circle' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2553:1: (lv_circle_1_0= 'circle' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2554:3: lv_circle_1_0= 'circle'
                    {
                    lv_circle_1_0=(Token)match(input,43,FOLLOW_43_in_ruleEllipse5757); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2567:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2567:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2567:4: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2568:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2568:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2569:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleEllipse5790); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getEllipseAccess().getStyledPlusSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEllipseRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2582:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2583:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2583:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2584:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEllipseRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEllipse5823); 

                    		newLeafNode(otherlv_3, grammarAccess.getEllipseAccess().getStyleStyleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEllipse5837); 

                	newLeafNode(otherlv_4, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2599:1: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==34||LA43_0==50||(LA43_0>=54 && LA43_0<=58)||LA43_0==62||LA43_0==64||LA43_0==78||LA43_0==80) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2600:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2600:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2601:3: lv_features_5_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEllipseAccess().getFeaturesConnectableElementFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectableElementFeature_in_ruleEllipse5858);
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
            	    break loop43;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2617:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==38) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2617:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleEllipse5872); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEllipseAccess().getChildKeyword_4_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2621:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2622:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2622:1: (lv_children_7_0= ruleChildElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2623:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEllipseAccess().getChildrenChildElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChildElement_in_ruleEllipse5893);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEllipse5907); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2651:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2652:2: (iv_rulePolyline= rulePolyline EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2653:2: iv_rulePolyline= rulePolyline EOF
            {
             newCompositeNode(grammarAccess.getPolylineRule()); 
            pushFollow(FOLLOW_rulePolyline_in_entryRulePolyline5943);
            iv_rulePolyline=rulePolyline();

            state._fsp--;

             current =iv_rulePolyline; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolyline5953); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2660:1: rulePolyline returns [EObject current=null] : ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2663:28: ( ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2664:1: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2664:1: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2664:2: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= rulePoint ) ) ( (lv_features_6_0= rulePoint ) ) ( (lv_features_7_0= rulePoint ) )* ( (lv_features_8_0= ruleConnectableElementFeature ) )* (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )* otherlv_11= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2664:2: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            else if ( (LA45_0==45) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2664:3: ( (lv_polygon_0_0= 'polygon' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2664:3: ( (lv_polygon_0_0= 'polygon' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2665:1: (lv_polygon_0_0= 'polygon' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2665:1: (lv_polygon_0_0= 'polygon' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2666:3: lv_polygon_0_0= 'polygon'
                    {
                    lv_polygon_0_0=(Token)match(input,44,FOLLOW_44_in_rulePolyline5997); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2680:6: ( (lv_polyline_1_0= 'polyline' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2680:6: ( (lv_polyline_1_0= 'polyline' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2681:1: (lv_polyline_1_0= 'polyline' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2681:1: (lv_polyline_1_0= 'polyline' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2682:3: lv_polyline_1_0= 'polyline'
                    {
                    lv_polyline_1_0=(Token)match(input,45,FOLLOW_45_in_rulePolyline6034); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2695:3: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==21) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2695:4: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2695:4: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2696:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2696:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2697:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_rulePolyline6067); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getPolylineAccess().getStyledPlusSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolylineRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2710:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2711:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2711:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2712:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolylineRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePolyline6100); 

                    		newLeafNode(otherlv_3, grammarAccess.getPolylineAccess().getStyleStyleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePolyline6114); 

                	newLeafNode(otherlv_4, grammarAccess.getPolylineAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2727:1: ( (lv_features_5_0= rulePoint ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2728:1: (lv_features_5_0= rulePoint )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2728:1: (lv_features_5_0= rulePoint )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2729:3: lv_features_5_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_rulePolyline6135);
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2745:2: ( (lv_features_6_0= rulePoint ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2746:1: (lv_features_6_0= rulePoint )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2746:1: (lv_features_6_0= rulePoint )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2747:3: lv_features_6_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_rulePolyline6156);
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2763:2: ( (lv_features_7_0= rulePoint ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==61) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2764:1: (lv_features_7_0= rulePoint )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2764:1: (lv_features_7_0= rulePoint )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2765:3: lv_features_7_0= rulePoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesPointParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoint_in_rulePolyline6177);
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
            	    break loop47;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2781:3: ( (lv_features_8_0= ruleConnectableElementFeature ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==34||LA48_0==50||(LA48_0>=54 && LA48_0<=58)||LA48_0==62||LA48_0==64||LA48_0==78||LA48_0==80) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2782:1: (lv_features_8_0= ruleConnectableElementFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2782:1: (lv_features_8_0= ruleConnectableElementFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2783:3: lv_features_8_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolylineAccess().getFeaturesConnectableElementFeatureParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectableElementFeature_in_rulePolyline6199);
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
            	    break loop48;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2799:3: (otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==38) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2799:5: otherlv_9= 'child' ( (lv_children_10_0= ruleChildElement ) )
            	    {
            	    otherlv_9=(Token)match(input,38,FOLLOW_38_in_rulePolyline6213); 

            	        	newLeafNode(otherlv_9, grammarAccess.getPolylineAccess().getChildKeyword_7_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2803:1: ( (lv_children_10_0= ruleChildElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2804:1: (lv_children_10_0= ruleChildElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2804:1: (lv_children_10_0= ruleChildElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2805:3: lv_children_10_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolylineAccess().getChildrenChildElementParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChildElement_in_rulePolyline6234);
            	    lv_children_10_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_10_0, 
            	            		"ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_rulePolyline6248); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2833:1: entryRuleTriangle returns [EObject current=null] : iv_ruleTriangle= ruleTriangle EOF ;
    public final EObject entryRuleTriangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriangle = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2834:2: (iv_ruleTriangle= ruleTriangle EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2835:2: iv_ruleTriangle= ruleTriangle EOF
            {
             newCompositeNode(grammarAccess.getTriangleRule()); 
            pushFollow(FOLLOW_ruleTriangle_in_entryRuleTriangle6284);
            iv_ruleTriangle=ruleTriangle();

            state._fsp--;

             current =iv_ruleTriangle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriangle6294); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2842:1: ruleTriangle returns [EObject current=null] : ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2845:28: ( ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2846:1: ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2846:1: ( () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2846:2: () otherlv_1= 'triangle' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleConnectableElementFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2846:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2847:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTriangleAccess().getTriangleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleTriangle6340); 

                	newLeafNode(otherlv_1, grammarAccess.getTriangleAccess().getTriangleKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2856:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==21) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2856:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2856:2: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2857:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2857:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2858:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleTriangle6359); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getTriangleAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriangleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2871:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2872:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2872:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2873:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriangleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTriangle6392); 

                    		newLeafNode(otherlv_3, grammarAccess.getTriangleAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleTriangle6406); 

                	newLeafNode(otherlv_4, grammarAccess.getTriangleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2888:1: ( (lv_features_5_0= ruleConnectableElementFeature ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==34||LA51_0==50||(LA51_0>=54 && LA51_0<=58)||LA51_0==62||LA51_0==64||LA51_0==78||LA51_0==80) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2889:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2889:1: (lv_features_5_0= ruleConnectableElementFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2890:3: lv_features_5_0= ruleConnectableElementFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTriangleAccess().getFeaturesConnectableElementFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectableElementFeature_in_ruleTriangle6427);
            	    lv_features_5_0=ruleConnectableElementFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTriangleRule());
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2906:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==38) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2906:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleTriangle6441); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTriangleAccess().getChildKeyword_5_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2910:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2911:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2911:1: (lv_children_7_0= ruleChildElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2912:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTriangleAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChildElement_in_ruleTriangle6462);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTriangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleTriangle6476); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2940:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2941:2: (iv_ruleLine= ruleLine EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2942:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine6512);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine6522); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2949:1: ruleLine returns [EObject current=null] : ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2952:28: ( ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2953:1: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2953:1: ( () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2953:2: () ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) ) ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleLineFeature ) )* otherlv_7= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2953:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2954:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLineAccess().getLineAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2959:2: ( ( (lv_horizontal_1_0= 'hline' ) ) | ( (lv_vertical_2_0= 'vline' ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            else if ( (LA53_0==48) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2959:3: ( (lv_horizontal_1_0= 'hline' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2959:3: ( (lv_horizontal_1_0= 'hline' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2960:1: (lv_horizontal_1_0= 'hline' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2960:1: (lv_horizontal_1_0= 'hline' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2961:3: lv_horizontal_1_0= 'hline'
                    {
                    lv_horizontal_1_0=(Token)match(input,47,FOLLOW_47_in_ruleLine6575); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2975:6: ( (lv_vertical_2_0= 'vline' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2975:6: ( (lv_vertical_2_0= 'vline' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2976:1: (lv_vertical_2_0= 'vline' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2976:1: (lv_vertical_2_0= 'vline' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2977:3: lv_vertical_2_0= 'vline'
                    {
                    lv_vertical_2_0=(Token)match(input,48,FOLLOW_48_in_ruleLine6612); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2990:3: ( ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2990:4: ( (lv_styled_3_0= '+' ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2990:4: ( (lv_styled_3_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2991:1: (lv_styled_3_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2991:1: (lv_styled_3_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:2992:3: lv_styled_3_0= '+'
                    {
                    lv_styled_3_0=(Token)match(input,21,FOLLOW_21_in_ruleLine6645); 

                            newLeafNode(lv_styled_3_0, grammarAccess.getLineAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLineRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3005:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3006:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3006:1: (otherlv_4= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3007:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLineRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLine6678); 

                    		newLeafNode(otherlv_4, grammarAccess.getLineAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleLine6692); 

                	newLeafNode(otherlv_5, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3022:1: ( (lv_features_6_0= ruleLineFeature ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=54 && LA55_0<=55)||LA55_0==58||LA55_0==62||LA55_0==80) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3023:1: (lv_features_6_0= ruleLineFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3023:1: (lv_features_6_0= ruleLineFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3024:3: lv_features_6_0= ruleLineFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLineAccess().getFeaturesLineFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLineFeature_in_ruleLine6713);
            	    lv_features_6_0=ruleLineFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_6_0, 
            	            		"LineFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleLine6726); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3052:1: entryRuleLineFeature returns [EObject current=null] : iv_ruleLineFeature= ruleLineFeature EOF ;
    public final EObject entryRuleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3053:2: (iv_ruleLineFeature= ruleLineFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3054:2: iv_ruleLineFeature= ruleLineFeature EOF
            {
             newCompositeNode(grammarAccess.getLineFeatureRule()); 
            pushFollow(FOLLOW_ruleLineFeature_in_entryRuleLineFeature6762);
            iv_ruleLineFeature=ruleLineFeature();

            state._fsp--;

             current =iv_ruleLineFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineFeature6772); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3061:1: ruleLineFeature returns [EObject current=null] : (this_LineWidth_0= ruleLineWidth | this_Foreground_1= ruleForeground | this_Position_2= rulePosition | this_Size_3= ruleSize | this_Visible_4= ruleVisible ) ;
    public final EObject ruleLineFeature() throws RecognitionException {
        EObject current = null;

        EObject this_LineWidth_0 = null;

        EObject this_Foreground_1 = null;

        EObject this_Position_2 = null;

        EObject this_Size_3 = null;

        EObject this_Visible_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3064:28: ( (this_LineWidth_0= ruleLineWidth | this_Foreground_1= ruleForeground | this_Position_2= rulePosition | this_Size_3= ruleSize | this_Visible_4= ruleVisible ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3065:1: (this_LineWidth_0= ruleLineWidth | this_Foreground_1= ruleForeground | this_Position_2= rulePosition | this_Size_3= ruleSize | this_Visible_4= ruleVisible )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3065:1: (this_LineWidth_0= ruleLineWidth | this_Foreground_1= ruleForeground | this_Position_2= rulePosition | this_Size_3= ruleSize | this_Visible_4= ruleVisible )
            int alt56=5;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt56=1;
                }
                break;
            case 55:
                {
                alt56=2;
                }
                break;
            case 62:
                {
                alt56=3;
                }
                break;
            case 58:
                {
                alt56=4;
                }
                break;
            case 54:
                {
                alt56=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3066:5: this_LineWidth_0= ruleLineWidth
                    {
                     
                            newCompositeNode(grammarAccess.getLineFeatureAccess().getLineWidthParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLineWidth_in_ruleLineFeature6819);
                    this_LineWidth_0=ruleLineWidth();

                    state._fsp--;

                     
                            current = this_LineWidth_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3076:5: this_Foreground_1= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getLineFeatureAccess().getForegroundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleLineFeature6846);
                    this_Foreground_1=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3086:5: this_Position_2= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getLineFeatureAccess().getPositionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleLineFeature6873);
                    this_Position_2=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3096:5: this_Size_3= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getLineFeatureAccess().getSizeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleLineFeature6900);
                    this_Size_3=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3106:5: this_Visible_4= ruleVisible
                    {
                     
                            newCompositeNode(grammarAccess.getLineFeatureAccess().getVisibleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleVisible_in_ruleLineFeature6927);
                    this_Visible_4=ruleVisible();

                    state._fsp--;

                     
                            current = this_Visible_4; 
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3122:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3123:2: (iv_ruleArrow= ruleArrow EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3124:2: iv_ruleArrow= ruleArrow EOF
            {
             newCompositeNode(grammarAccess.getArrowRule()); 
            pushFollow(FOLLOW_ruleArrow_in_entryRuleArrow6962);
            iv_ruleArrow=ruleArrow();

            state._fsp--;

             current =iv_ruleArrow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrow6972); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3131:1: ruleArrow returns [EObject current=null] : ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3134:28: ( ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3135:1: ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3135:1: ( () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3135:2: () otherlv_1= 'arrow' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLineFeature ) )* otherlv_6= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3135:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3136:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrowAccess().getArrowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleArrow7018); 

                	newLeafNode(otherlv_1, grammarAccess.getArrowAccess().getArrowKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3145:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==21) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3145:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3145:2: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3146:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3146:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3147:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleArrow7037); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getArrowAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3160:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3161:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3161:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3162:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArrow7070); 

                    		newLeafNode(otherlv_3, grammarAccess.getArrowAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleArrow7084); 

                	newLeafNode(otherlv_4, grammarAccess.getArrowAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3177:1: ( (lv_features_5_0= ruleLineFeature ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=54 && LA58_0<=55)||LA58_0==58||LA58_0==62||LA58_0==80) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3178:1: (lv_features_5_0= ruleLineFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3178:1: (lv_features_5_0= ruleLineFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3179:3: lv_features_5_0= ruleLineFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrowAccess().getFeaturesLineFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLineFeature_in_ruleArrow7105);
            	    lv_features_5_0=ruleLineFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"LineFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleArrow7118); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3207:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3208:2: (iv_ruleContains= ruleContains EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3209:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_ruleContains_in_entryRuleContains7154);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContains7164); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3216:1: ruleContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3219:28: ( (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3220:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3220:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3220:3: otherlv_0= 'contains' ( ( ruleQualifiedName ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleContains7201); 

                	newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3224:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3225:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3225:1: ( ruleQualifiedName )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3226:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainsAccess().getModelReferenceEReferenceCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContains7224);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3239:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==22) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3240:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3240:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3241:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainsAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleContains7245);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleContains7258); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3269:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3270:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3271:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue7294);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue7304); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3278:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_DoubleValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_EnumValue_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3281:28: ( (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3282:1: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3282:1: (this_IntValue_0= ruleIntValue | this_DoubleValue_1= ruleDoubleValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_EnumValue_4= ruleEnumValue )
            int alt60=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==13) ) {
                    alt60=2;
                }
                else if ( (LA60_1==EOF||LA60_1==17||LA60_1==19||LA60_1==34||LA60_1==38||LA60_1==50||(LA60_1>=54 && LA60_1<=58)||(LA60_1>=62 && LA60_1<=64)||LA60_1==78||LA60_1==80) ) {
                    alt60=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 51:
                {
                alt60=3;
                }
                break;
            case 101:
            case 102:
                {
                alt60=4;
                }
                break;
            case RULE_ID:
                {
                alt60=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3283:5: this_IntValue_0= ruleIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue7351);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;

                     
                            current = this_IntValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3293:5: this_DoubleValue_1= ruleDoubleValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDoubleValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDoubleValue_in_ruleValue7378);
                    this_DoubleValue_1=ruleDoubleValue();

                    state._fsp--;

                     
                            current = this_DoubleValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3303:5: this_StringValue_2= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue7405);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3313:5: this_BooleanValue_3= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue7432);
                    this_BooleanValue_3=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3323:5: this_EnumValue_4= ruleEnumValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getEnumValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEnumValue_in_ruleValue7459);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3339:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3340:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3341:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue7494);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue7504); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3348:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3351:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3352:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3352:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3353:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3353:1: (lv_value_0_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3354:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue7545); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3378:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3379:2: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3380:2: iv_ruleDoubleValue= ruleDoubleValue EOF
            {
             newCompositeNode(grammarAccess.getDoubleValueRule()); 
            pushFollow(FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue7585);
            iv_ruleDoubleValue=ruleDoubleValue();

            state._fsp--;

             current =iv_ruleDoubleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleValue7595); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3387:1: ruleDoubleValue returns [EObject current=null] : ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueInt_0_0=null;
        Token otherlv_1=null;
        Token lv_valueDecimal_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3390:28: ( ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3391:1: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3391:1: ( ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3391:2: ( (lv_valueInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_valueDecimal_2_0= RULE_INT ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3391:2: ( (lv_valueInt_0_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3392:1: (lv_valueInt_0_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3392:1: (lv_valueInt_0_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3393:3: lv_valueInt_0_0= RULE_INT
            {
            lv_valueInt_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleValue7637); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDoubleValue7654); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleValueAccess().getFullStopKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3413:1: ( (lv_valueDecimal_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3414:1: (lv_valueDecimal_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3414:1: (lv_valueDecimal_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3415:3: lv_valueDecimal_2_0= RULE_INT
            {
            lv_valueDecimal_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleValue7671); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3439:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3440:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3441:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue7712);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue7722); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3448:1: ruleStringValue returns [EObject current=null] : ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_null_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3451:28: ( ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3452:1: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3452:1: ( ( (lv_null_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==51) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_STRING) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3452:2: ( (lv_null_0_0= 'null' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3452:2: ( (lv_null_0_0= 'null' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3453:1: (lv_null_0_0= 'null' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3453:1: (lv_null_0_0= 'null' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3454:3: lv_null_0_0= 'null'
                    {
                    lv_null_0_0=(Token)match(input,51,FOLLOW_51_in_ruleStringValue7765); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3468:6: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3468:6: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3469:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3469:1: (lv_value_1_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3470:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue7801); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3494:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3495:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3496:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue7842);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue7852); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3503:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteral ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3506:28: ( ( (lv_value_0_0= ruleBooleanLiteral ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3507:1: ( (lv_value_0_0= ruleBooleanLiteral ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3507:1: ( (lv_value_0_0= ruleBooleanLiteral ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3508:1: (lv_value_0_0= ruleBooleanLiteral )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3508:1: (lv_value_0_0= ruleBooleanLiteral )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3509:3: lv_value_0_0= ruleBooleanLiteral
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueBooleanLiteralEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanValue7897);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3533:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3534:2: (iv_ruleEnumValue= ruleEnumValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3535:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_ruleEnumValue_in_entryRuleEnumValue7932);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumValue7942); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3542:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3545:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3546:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3546:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3547:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3547:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3548:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumValue7983); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3574:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3575:2: (iv_ruleLabel= ruleLabel EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3576:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel8025);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel8035); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3583:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3586:28: ( ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3587:1: ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3587:1: ( () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3587:2: () otherlv_1= 'label' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleLabelFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3587:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3588:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLabelAccess().getLabelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleLabel8081); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3597:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==21) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3597:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3597:2: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3598:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3598:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3599:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleLabel8100); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getLabelAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3612:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3613:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3613:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3614:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel8133); 

                    		newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleLabel8147); 

                	newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3629:1: ( (lv_features_5_0= ruleLabelFeature ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=54 && LA63_0<=55)||LA63_0==58||LA63_0==62||LA63_0==68||LA63_0==70||LA63_0==77) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3630:1: (lv_features_5_0= ruleLabelFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3630:1: (lv_features_5_0= ruleLabelFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3631:3: lv_features_5_0= ruleLabelFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelAccess().getFeaturesLabelFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabelFeature_in_ruleLabel8168);
            	    lv_features_5_0=ruleLabelFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"LabelFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3647:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==38) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3647:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleLabel8182); 

            	        	newLeafNode(otherlv_6, grammarAccess.getLabelAccess().getChildKeyword_5_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3651:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3652:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3652:1: (lv_children_7_0= ruleChildElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3653:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChildElement_in_ruleLabel8203);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleLabel8217); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3681:1: entryRuleLabelFeature returns [EObject current=null] : iv_ruleLabelFeature= ruleLabelFeature EOF ;
    public final EObject entryRuleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3682:2: (iv_ruleLabelFeature= ruleLabelFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3683:2: iv_ruleLabelFeature= ruleLabelFeature EOF
            {
             newCompositeNode(grammarAccess.getLabelFeatureRule()); 
            pushFollow(FOLLOW_ruleLabelFeature_in_entryRuleLabelFeature8253);
            iv_ruleLabelFeature=ruleLabelFeature();

            state._fsp--;

             current =iv_ruleLabelFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelFeature8263); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3690:1: ruleLabelFeature returns [EObject current=null] : (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3693:28: ( (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3694:1: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3694:1: (this_TextValue_0= ruleTextValue | this_Foreground_1= ruleForeground | this_FontProperties_2= ruleFontProperties | this_Size_3= ruleSize | this_Position_4= rulePosition | this_Visible_5= ruleVisible | this_TextAlign_6= ruleTextAlign )
            int alt65=7;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt65=1;
                }
                break;
            case 55:
                {
                alt65=2;
                }
                break;
            case 70:
                {
                alt65=3;
                }
                break;
            case 58:
                {
                alt65=4;
                }
                break;
            case 62:
                {
                alt65=5;
                }
                break;
            case 54:
                {
                alt65=6;
                }
                break;
            case 77:
                {
                alt65=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3695:5: this_TextValue_0= ruleTextValue
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getTextValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTextValue_in_ruleLabelFeature8310);
                    this_TextValue_0=ruleTextValue();

                    state._fsp--;

                     
                            current = this_TextValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3705:5: this_Foreground_1= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getForegroundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleLabelFeature8337);
                    this_Foreground_1=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3715:5: this_FontProperties_2= ruleFontProperties
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getFontPropertiesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFontProperties_in_ruleLabelFeature8364);
                    this_FontProperties_2=ruleFontProperties();

                    state._fsp--;

                     
                            current = this_FontProperties_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3725:5: this_Size_3= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getSizeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleLabelFeature8391);
                    this_Size_3=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3735:5: this_Position_4= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getPositionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleLabelFeature8418);
                    this_Position_4=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3745:5: this_Visible_5= ruleVisible
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getVisibleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleVisible_in_ruleLabelFeature8445);
                    this_Visible_5=ruleVisible();

                    state._fsp--;

                     
                            current = this_Visible_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3755:5: this_TextAlign_6= ruleTextAlign
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getTextAlignParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTextAlign_in_ruleLabelFeature8472);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3771:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3772:2: (iv_ruleImage= ruleImage EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3773:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage8507);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage8517); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3780:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3783:28: ( (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3784:1: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3784:1: (otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3784:3: otherlv_0= 'image' ( (lv_imageId_1_0= RULE_ID ) ) ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleImageFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleImage8554); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3788:1: ( (lv_imageId_1_0= RULE_ID ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3789:1: (lv_imageId_1_0= RULE_ID )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3789:1: (lv_imageId_1_0= RULE_ID )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3790:3: lv_imageId_1_0= RULE_ID
            {
            lv_imageId_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImage8571); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3806:2: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==21) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3806:3: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3806:3: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3807:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3807:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3808:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleImage8595); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getImageAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3821:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3822:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3822:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3823:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImage8628); 

                    		newLeafNode(otherlv_3, grammarAccess.getImageAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleImage8642); 

                	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3838:1: ( (lv_features_5_0= ruleImageFeature ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=57 && LA67_0<=58)||LA67_0==62) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3839:1: (lv_features_5_0= ruleImageFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3839:1: (lv_features_5_0= ruleImageFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3840:3: lv_features_5_0= ruleImageFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getFeaturesImageFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImageFeature_in_ruleImage8663);
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
            	    break loop67;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3856:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==38) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3856:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleImage8677); 

            	        	newLeafNode(otherlv_6, grammarAccess.getImageAccess().getChildKeyword_5_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3860:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3861:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3861:1: (lv_children_7_0= ruleChildElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3862:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChildElement_in_ruleImage8698);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleImage8712); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3890:1: entryRuleImageFeature returns [EObject current=null] : iv_ruleImageFeature= ruleImageFeature EOF ;
    public final EObject entryRuleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3891:2: (iv_ruleImageFeature= ruleImageFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3892:2: iv_ruleImageFeature= ruleImageFeature EOF
            {
             newCompositeNode(grammarAccess.getImageFeatureRule()); 
            pushFollow(FOLLOW_ruleImageFeature_in_entryRuleImageFeature8748);
            iv_ruleImageFeature=ruleImageFeature();

            state._fsp--;

             current =iv_ruleImageFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageFeature8758); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3899:1: ruleImageFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) ;
    public final EObject ruleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Transparency_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3902:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3903:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3903:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt69=1;
                }
                break;
            case 62:
                {
                alt69=2;
                }
                break;
            case 57:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3904:5: this_Size_0= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getImageFeatureAccess().getSizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleImageFeature8805);
                    this_Size_0=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3914:5: this_Position_1= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getImageFeatureAccess().getPositionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleImageFeature8832);
                    this_Position_1=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3924:5: this_Transparency_2= ruleTransparency
                    {
                     
                            newCompositeNode(grammarAccess.getImageFeatureAccess().getTransparencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTransparency_in_ruleImageFeature8859);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3940:1: entryRuleInvisible returns [EObject current=null] : iv_ruleInvisible= ruleInvisible EOF ;
    public final EObject entryRuleInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisible = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3941:2: (iv_ruleInvisible= ruleInvisible EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3942:2: iv_ruleInvisible= ruleInvisible EOF
            {
             newCompositeNode(grammarAccess.getInvisibleRule()); 
            pushFollow(FOLLOW_ruleInvisible_in_entryRuleInvisible8894);
            iv_ruleInvisible=ruleInvisible();

            state._fsp--;

             current =iv_ruleInvisible; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvisible8904); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3949:1: ruleInvisible returns [EObject current=null] : ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3952:28: ( ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3953:1: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3953:1: ( () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3953:2: () otherlv_1= 'invisible' ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleInvisibleFeature ) )* (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )* otherlv_8= '}'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3953:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3954:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInvisibleAccess().getInvisibleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleInvisible8950); 

                	newLeafNode(otherlv_1, grammarAccess.getInvisibleAccess().getInvisibleKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3963:1: ( ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==21) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3963:2: ( (lv_styled_2_0= '+' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3963:2: ( (lv_styled_2_0= '+' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3964:1: (lv_styled_2_0= '+' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3964:1: (lv_styled_2_0= '+' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3965:3: lv_styled_2_0= '+'
                    {
                    lv_styled_2_0=(Token)match(input,21,FOLLOW_21_in_ruleInvisible8969); 

                            newLeafNode(lv_styled_2_0, grammarAccess.getInvisibleAccess().getStyledPlusSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvisibleRule());
                    	        }
                           		setWithLastConsumed(current, "styled", true, "+");
                    	    

                    }


                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3978:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3979:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3979:1: (otherlv_3= RULE_ID )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3980:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvisibleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvisible9002); 

                    		newLeafNode(otherlv_3, grammarAccess.getInvisibleAccess().getStyleStyleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleInvisible9016); 

                	newLeafNode(otherlv_4, grammarAccess.getInvisibleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3995:1: ( (lv_features_5_0= ruleInvisibleFeature ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==34||LA71_0==50||LA71_0==58||LA71_0==62||LA71_0==64) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3996:1: (lv_features_5_0= ruleInvisibleFeature )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3996:1: (lv_features_5_0= ruleInvisibleFeature )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:3997:3: lv_features_5_0= ruleInvisibleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvisibleAccess().getFeaturesInvisibleFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInvisibleFeature_in_ruleInvisible9037);
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
            	    break loop71;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4013:3: (otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==38) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4013:5: otherlv_6= 'child' ( (lv_children_7_0= ruleChildElement ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleInvisible9051); 

            	        	newLeafNode(otherlv_6, grammarAccess.getInvisibleAccess().getChildKeyword_5_0());
            	        
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4017:1: ( (lv_children_7_0= ruleChildElement ) )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4018:1: (lv_children_7_0= ruleChildElement )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4018:1: (lv_children_7_0= ruleChildElement )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4019:3: lv_children_7_0= ruleChildElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvisibleAccess().getChildrenChildElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChildElement_in_ruleInvisible9072);
            	    lv_children_7_0=ruleChildElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvisibleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_7_0, 
            	            		"ChildElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleInvisible9086); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4047:1: entryRuleInvisibleFeature returns [EObject current=null] : iv_ruleInvisibleFeature= ruleInvisibleFeature EOF ;
    public final EObject entryRuleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvisibleFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4048:2: (iv_ruleInvisibleFeature= ruleInvisibleFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4049:2: iv_ruleInvisibleFeature= ruleInvisibleFeature EOF
            {
             newCompositeNode(grammarAccess.getInvisibleFeatureRule()); 
            pushFollow(FOLLOW_ruleInvisibleFeature_in_entryRuleInvisibleFeature9122);
            iv_ruleInvisibleFeature=ruleInvisibleFeature();

            state._fsp--;

             current =iv_ruleInvisibleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvisibleFeature9132); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4056:1: ruleInvisibleFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) ;
    public final EObject ruleInvisibleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_LinkedFeature_2 = null;

        EObject this_Layout_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4059:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4060:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4060:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_LinkedFeature_2= ruleLinkedFeature | this_Layout_3= ruleLayout )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt73=1;
                }
                break;
            case 62:
                {
                alt73=2;
                }
                break;
            case 34:
            case 50:
                {
                alt73=3;
                }
                break;
            case 64:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4061:5: this_Size_0= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getSizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleInvisibleFeature9179);
                    this_Size_0=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4071:5: this_Position_1= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getPositionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleInvisibleFeature9206);
                    this_Position_1=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4081:5: this_LinkedFeature_2= ruleLinkedFeature
                    {
                     
                            newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getLinkedFeatureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLinkedFeature_in_ruleInvisibleFeature9233);
                    this_LinkedFeature_2=ruleLinkedFeature();

                    state._fsp--;

                     
                            current = this_LinkedFeature_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4091:5: this_Layout_3= ruleLayout
                    {
                     
                            newCompositeNode(grammarAccess.getInvisibleFeatureAccess().getLayoutParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLayout_in_ruleInvisibleFeature9260);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4107:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4108:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4109:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature9295);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature9305); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4116:1: ruleColorFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_Background_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4119:28: ( (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4120:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4120:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==55) ) {
                alt74=1;
            }
            else if ( (LA74_0==56) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4121:5: this_Foreground_0= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getColorFeatureAccess().getForegroundParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleColorFeature9352);
                    this_Foreground_0=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4131:5: this_Background_1= ruleBackground
                    {
                     
                            newCompositeNode(grammarAccess.getColorFeatureAccess().getBackgroundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBackground_in_ruleColorFeature9379);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4147:1: entryRuleForeground returns [EObject current=null] : iv_ruleForeground= ruleForeground EOF ;
    public final EObject entryRuleForeground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeground = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4148:2: (iv_ruleForeground= ruleForeground EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4149:2: iv_ruleForeground= ruleForeground EOF
            {
             newCompositeNode(grammarAccess.getForegroundRule()); 
            pushFollow(FOLLOW_ruleForeground_in_entryRuleForeground9414);
            iv_ruleForeground=ruleForeground();

            state._fsp--;

             current =iv_ruleForeground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeground9424); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4156:1: ruleForeground returns [EObject current=null] : ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleForeground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4159:28: ( ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4160:1: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4160:1: ( ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4160:2: ( (lv_type_0_0= 'foreground' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4160:2: ( (lv_type_0_0= 'foreground' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4161:1: (lv_type_0_0= 'foreground' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4161:1: (lv_type_0_0= 'foreground' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4162:3: lv_type_0_0= 'foreground'
            {
            lv_type_0_0=(Token)match(input,55,FOLLOW_55_in_ruleForeground9467); 

                    newLeafNode(lv_type_0_0, grammarAccess.getForegroundAccess().getTypeForegroundKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForegroundRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "foreground");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4175:2: ( (lv_color_1_0= ruleColor ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4176:1: (lv_color_1_0= ruleColor )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4176:1: (lv_color_1_0= ruleColor )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4177:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getForegroundAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleForeground9501);
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4193:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==22) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4194:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4194:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4195:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getForegroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleForeground9522);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleForeground9535); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4223:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4224:2: (iv_ruleBackground= ruleBackground EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4225:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground9571);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground9581); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4232:1: ruleBackground returns [EObject current=null] : ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_3=null;
        EObject lv_color_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4235:28: ( ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4236:1: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4236:1: ( ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4236:2: ( (lv_type_0_0= 'background' ) ) ( (lv_color_1_0= ruleColor ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4236:2: ( (lv_type_0_0= 'background' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4237:1: (lv_type_0_0= 'background' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4237:1: (lv_type_0_0= 'background' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4238:3: lv_type_0_0= 'background'
            {
            lv_type_0_0=(Token)match(input,56,FOLLOW_56_in_ruleBackground9624); 

                    newLeafNode(lv_type_0_0, grammarAccess.getBackgroundAccess().getTypeBackgroundKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBackgroundRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "background");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4251:2: ( (lv_color_1_0= ruleColor ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4252:1: (lv_color_1_0= ruleColor )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4252:1: (lv_color_1_0= ruleColor )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4253:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getBackgroundAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleBackground9658);
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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4269:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==22) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4270:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4270:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4271:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getBackgroundAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleBackground9679);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBackground9692); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4299:1: entryRuleTransparency returns [EObject current=null] : iv_ruleTransparency= ruleTransparency EOF ;
    public final EObject entryRuleTransparency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransparency = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4300:2: (iv_ruleTransparency= ruleTransparency EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4301:2: iv_ruleTransparency= ruleTransparency EOF
            {
             newCompositeNode(grammarAccess.getTransparencyRule()); 
            pushFollow(FOLLOW_ruleTransparency_in_entryRuleTransparency9728);
            iv_ruleTransparency=ruleTransparency();

            state._fsp--;

             current =iv_ruleTransparency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransparency9738); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4308:1: ruleTransparency returns [EObject current=null] : (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTransparency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_percent_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4311:28: ( (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4312:1: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4312:1: (otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4312:3: otherlv_0= 'transparency' ( (lv_percent_1_0= RULE_INT ) ) otherlv_2= '%' ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleTransparency9775); 

                	newLeafNode(otherlv_0, grammarAccess.getTransparencyAccess().getTransparencyKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4316:1: ( (lv_percent_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4317:1: (lv_percent_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4317:1: (lv_percent_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4318:3: lv_percent_1_0= RULE_INT
            {
            lv_percent_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransparency9792); 

            			newLeafNode(lv_percent_1_0, grammarAccess.getTransparencyAccess().getPercentINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransparencyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"percent",
                    		lv_percent_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleTransparency9809); 

                	newLeafNode(otherlv_2, grammarAccess.getTransparencyAccess().getPercentSignKeyword_2());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4338:1: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==22) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4339:1: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4339:1: (lv_conditional_3_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4340:3: lv_conditional_3_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransparencyAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleTransparency9830);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransparencyRule());
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleTransparency9843); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4368:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4369:2: (iv_ruleSize= ruleSize EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4370:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize9879);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize9889); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4377:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4380:28: ( (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4381:1: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4381:1: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4381:3: otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_widthRelative_2_0= ']' ) )? ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )? ( (lv_resizable_5_0= 'resizable' ) )? ( (lv_conditional_6_0= ruleFeatureConditional ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleSize9926); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4385:1: ( (lv_width_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4386:1: (lv_width_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4386:1: (lv_width_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4387:3: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize9943); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4403:2: ( (lv_widthRelative_2_0= ']' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==59) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4404:1: (lv_widthRelative_2_0= ']' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4404:1: (lv_widthRelative_2_0= ']' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4405:3: lv_widthRelative_2_0= ']'
                    {
                    lv_widthRelative_2_0=(Token)match(input,59,FOLLOW_59_in_ruleSize9966); 

                            newLeafNode(lv_widthRelative_2_0, grammarAccess.getSizeAccess().getWidthRelativeRightSquareBracketKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSizeRule());
                    	        }
                           		setWithLastConsumed(current, "widthRelative", true, "]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4418:3: ( ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )? )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4418:4: ( (lv_height_3_0= RULE_INT ) ) ( (lv_heightRelative_4_0= ']' ) )?
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4418:4: ( (lv_height_3_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4419:1: (lv_height_3_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4419:1: (lv_height_3_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4420:3: lv_height_3_0= RULE_INT
                    {
                    lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize9998); 

                    			newLeafNode(lv_height_3_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_3_0_0()); 
                    		

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

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4436:2: ( (lv_heightRelative_4_0= ']' ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==59) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4437:1: (lv_heightRelative_4_0= ']' )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4437:1: (lv_heightRelative_4_0= ']' )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4438:3: lv_heightRelative_4_0= ']'
                            {
                            lv_heightRelative_4_0=(Token)match(input,59,FOLLOW_59_in_ruleSize10021); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4451:5: ( (lv_resizable_5_0= 'resizable' ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==60) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4452:1: (lv_resizable_5_0= 'resizable' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4452:1: (lv_resizable_5_0= 'resizable' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4453:3: lv_resizable_5_0= 'resizable'
                    {
                    lv_resizable_5_0=(Token)match(input,60,FOLLOW_60_in_ruleSize10055); 

                            newLeafNode(lv_resizable_5_0, grammarAccess.getSizeAccess().getResizableResizableKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSizeRule());
                    	        }
                           		setWithLastConsumed(current, "resizable", true, "resizable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4466:3: ( (lv_conditional_6_0= ruleFeatureConditional ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==22) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4467:1: (lv_conditional_6_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4467:1: (lv_conditional_6_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4468:3: lv_conditional_6_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getSizeAccess().getConditionalFeatureConditionalParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleSize10090);
                    lv_conditional_6_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSizeRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_6_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSize10103); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4496:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4497:2: (iv_rulePoint= rulePoint EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4498:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint10139);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint10149); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4505:1: rulePoint returns [EObject current=null] : (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;
        Token otherlv_4=null;
        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4508:28: ( (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4509:1: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4509:1: (otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4509:3: otherlv_0= 'point' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_rulePoint10186); 

                	newLeafNode(otherlv_0, grammarAccess.getPointAccess().getPointKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4513:1: ( (lv_x_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4514:1: (lv_x_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4514:1: (lv_x_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4515:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint10203); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4531:2: ( (lv_y_2_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4532:1: (lv_y_2_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4532:1: (lv_y_2_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4533:3: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint10225); 

            			newLeafNode(lv_y_2_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_2_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4549:2: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==22) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4550:1: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4550:1: (lv_conditional_3_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4551:3: lv_conditional_3_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getPointAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_rulePoint10251);
                    lv_conditional_3_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPointRule());
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePoint10264); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4579:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4580:2: (iv_rulePosition= rulePosition EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4581:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_rulePosition_in_entryRulePosition10300);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosition10310); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4588:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4591:28: ( (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4592:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4592:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4592:3: otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) ( (lv_xRelative_2_0= '%' ) )? ( (lv_y_3_0= RULE_INT ) ) ( (lv_yRelative_4_0= '%' ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_rulePosition10347); 

                	newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4596:1: ( (lv_x_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4597:1: (lv_x_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4597:1: (lv_x_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4598:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePosition10364); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4614:2: ( (lv_xRelative_2_0= '%' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==33) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4615:1: (lv_xRelative_2_0= '%' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4615:1: (lv_xRelative_2_0= '%' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4616:3: lv_xRelative_2_0= '%'
                    {
                    lv_xRelative_2_0=(Token)match(input,33,FOLLOW_33_in_rulePosition10387); 

                            newLeafNode(lv_xRelative_2_0, grammarAccess.getPositionAccess().getXRelativePercentSignKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPositionRule());
                    	        }
                           		setWithLastConsumed(current, "xRelative", true, "%");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4629:3: ( (lv_y_3_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4630:1: (lv_y_3_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4630:1: (lv_y_3_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4631:3: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePosition10418); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4647:2: ( (lv_yRelative_4_0= '%' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==33) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4648:1: (lv_yRelative_4_0= '%' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4648:1: (lv_yRelative_4_0= '%' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4649:3: lv_yRelative_4_0= '%'
                    {
                    lv_yRelative_4_0=(Token)match(input,33,FOLLOW_33_in_rulePosition10441); 

                            newLeafNode(lv_yRelative_4_0, grammarAccess.getPositionAccess().getYRelativePercentSignKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPositionRule());
                    	        }
                           		setWithLastConsumed(current, "yRelative", true, "%");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4662:3: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==22) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4663:1: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4663:1: (lv_conditional_5_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4664:3: lv_conditional_5_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getPositionAccess().getConditionalFeatureConditionalParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_rulePosition10476);
                    lv_conditional_5_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPositionRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_5_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_rulePosition10489); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4692:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4693:2: (iv_ruleCorner= ruleCorner EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4694:2: iv_ruleCorner= ruleCorner EOF
            {
             newCompositeNode(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner10525);
            iv_ruleCorner=ruleCorner();

            state._fsp--;

             current =iv_ruleCorner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner10535); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4701:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4704:28: ( (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4705:1: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4705:1: (otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4705:3: otherlv_0= 'corner' ( (lv_angle_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleCorner10572); 

                	newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4709:1: ( (lv_angle_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4710:1: (lv_angle_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4710:1: (lv_angle_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4711:3: lv_angle_1_0= RULE_INT
            {
            lv_angle_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCorner10589); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4727:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==22) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4728:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4728:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4729:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getCornerAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleCorner10615);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCorner10628); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4757:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4758:2: (iv_ruleLayout= ruleLayout EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4759:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout10664);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout10674); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4766:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4769:28: ( (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4770:1: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4770:1: (otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4770:3: otherlv_0= 'layout' ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) ) (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )? ( (lv_conditional_5_0= ruleFeatureConditional ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleLayout10711); 

                	newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4774:1: ( ( (lv_vertical_1_0= 'vertical' ) ) | ( (lv_horizontal_2_0= 'horizontal' ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==65) ) {
                alt88=1;
            }
            else if ( (LA88_0==66) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4774:2: ( (lv_vertical_1_0= 'vertical' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4774:2: ( (lv_vertical_1_0= 'vertical' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4775:1: (lv_vertical_1_0= 'vertical' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4775:1: (lv_vertical_1_0= 'vertical' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4776:3: lv_vertical_1_0= 'vertical'
                    {
                    lv_vertical_1_0=(Token)match(input,65,FOLLOW_65_in_ruleLayout10730); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4790:6: ( (lv_horizontal_2_0= 'horizontal' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4790:6: ( (lv_horizontal_2_0= 'horizontal' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4791:1: (lv_horizontal_2_0= 'horizontal' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4791:1: (lv_horizontal_2_0= 'horizontal' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4792:3: lv_horizontal_2_0= 'horizontal'
                    {
                    lv_horizontal_2_0=(Token)match(input,66,FOLLOW_66_in_ruleLayout10767); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4805:3: (otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==67) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4805:5: otherlv_3= 'margin' ( (lv_margin_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_67_in_ruleLayout10794); 

                        	newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getMarginKeyword_2_0());
                        
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4809:1: ( (lv_margin_4_0= RULE_INT ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4810:1: (lv_margin_4_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4810:1: (lv_margin_4_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4811:3: lv_margin_4_0= RULE_INT
                    {
                    lv_margin_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLayout10811); 

                    			newLeafNode(lv_margin_4_0, grammarAccess.getLayoutAccess().getMarginINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayoutRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"margin",
                            		lv_margin_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4827:4: ( (lv_conditional_5_0= ruleFeatureConditional ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==22) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4828:1: (lv_conditional_5_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4828:1: (lv_conditional_5_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4829:3: lv_conditional_5_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleLayout10839);
                    lv_conditional_5_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_5_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleLayout10852); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4857:1: entryRuleVisible returns [EObject current=null] : iv_ruleVisible= ruleVisible EOF ;
    public final EObject entryRuleVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisible = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4858:2: (iv_ruleVisible= ruleVisible EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4859:2: iv_ruleVisible= ruleVisible EOF
            {
             newCompositeNode(grammarAccess.getVisibleRule()); 
            pushFollow(FOLLOW_ruleVisible_in_entryRuleVisible10888);
            iv_ruleVisible=ruleVisible();

            state._fsp--;

             current =iv_ruleVisible; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisible10898); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4866:1: ruleVisible returns [EObject current=null] : (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) ;
    public final EObject ruleVisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_conditional_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4869:28: ( (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4870:1: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4870:1: (otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4870:3: otherlv_0= 'invisible' ( (lv_conditional_1_0= ruleFeatureConditional ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleVisible10935); 

                	newLeafNode(otherlv_0, grammarAccess.getVisibleAccess().getInvisibleKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4874:1: ( (lv_conditional_1_0= ruleFeatureConditional ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4875:1: (lv_conditional_1_0= ruleFeatureConditional )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4875:1: (lv_conditional_1_0= ruleFeatureConditional )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4876:3: lv_conditional_1_0= ruleFeatureConditional
            {
             
            	        newCompositeNode(grammarAccess.getVisibleAccess().getConditionalFeatureConditionalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFeatureConditional_in_ruleVisible10956);
            lv_conditional_1_0=ruleFeatureConditional();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVisibleRule());
            	        }
                   		set(
                   			current, 
                   			"conditional",
                    		lv_conditional_1_0, 
                    		"FeatureConditional");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleVisible10968); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4904:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4905:2: (iv_ruleTextValue= ruleTextValue EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4906:2: iv_ruleTextValue= ruleTextValue EOF
            {
             newCompositeNode(grammarAccess.getTextValueRule()); 
            pushFollow(FOLLOW_ruleTextValue_in_entryRuleTextValue11004);
            iv_ruleTextValue=ruleTextValue();

            state._fsp--;

             current =iv_ruleTextValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextValue11014); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4913:1: ruleTextValue returns [EObject current=null] : ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_parts_2_0 = null;

        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4916:28: ( ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4917:1: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4917:1: ( () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4917:2: () otherlv_1= 'text' ( (lv_parts_2_0= ruleTextPart ) )* ( (lv_conditional_3_0= ruleFeatureConditional ) )? otherlv_4= ';'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4917:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4918:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextValueAccess().getTextValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleTextValue11060); 

                	newLeafNode(otherlv_1, grammarAccess.getTextValueAccess().getTextKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4927:1: ( (lv_parts_2_0= ruleTextPart ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=RULE_STRING && LA91_0<=RULE_ID)||LA91_0==69) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4928:1: (lv_parts_2_0= ruleTextPart )
            	    {
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4928:1: (lv_parts_2_0= ruleTextPart )
            	    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4929:3: lv_parts_2_0= ruleTextPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextValueAccess().getPartsTextPartParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextPart_in_ruleTextValue11081);
            	    lv_parts_2_0=ruleTextPart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parts",
            	            		lv_parts_2_0, 
            	            		"TextPart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4945:3: ( (lv_conditional_3_0= ruleFeatureConditional ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==22) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4946:1: (lv_conditional_3_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4946:1: (lv_conditional_3_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4947:3: lv_conditional_3_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextValueAccess().getConditionalFeatureConditionalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleTextValue11103);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleTextValue11116); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4975:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4976:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4977:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart11152);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart11162); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4984:1: ruleTextPart returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_editable_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4987:28: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4988:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4988:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_STRING) ) {
                alt94=1;
            }
            else if ( (LA94_0==RULE_ID||LA94_0==69) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4988:2: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4988:2: ( (lv_text_0_0= RULE_STRING ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4989:1: (lv_text_0_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4989:1: (lv_text_0_0= RULE_STRING )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:4990:3: lv_text_0_0= RULE_STRING
                    {
                    lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextPart11204); 

                    			newLeafNode(lv_text_0_0, grammarAccess.getTextPartAccess().getTextSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextPartRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5007:6: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5007:6: ( ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5007:7: ( (lv_editable_1_0= 'edit:' ) )? ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5007:7: ( (lv_editable_1_0= 'edit:' ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==69) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5008:1: (lv_editable_1_0= 'edit:' )
                            {
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5008:1: (lv_editable_1_0= 'edit:' )
                            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5009:3: lv_editable_1_0= 'edit:'
                            {
                            lv_editable_1_0=(Token)match(input,69,FOLLOW_69_in_ruleTextPart11234); 

                                    newLeafNode(lv_editable_1_0, grammarAccess.getTextPartAccess().getEditableEditKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTextPartRule());
                            	        }
                                   		setWithLastConsumed(current, "editable", true, "edit:");
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5022:3: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5023:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5023:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5024:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextPartRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTextPartAccess().getModelAttributeEAttributeCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTextPart11271);
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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5045:1: entryRuleFontProperties returns [EObject current=null] : iv_ruleFontProperties= ruleFontProperties EOF ;
    public final EObject entryRuleFontProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontProperties = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5046:2: (iv_ruleFontProperties= ruleFontProperties EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5047:2: iv_ruleFontProperties= ruleFontProperties EOF
            {
             newCompositeNode(grammarAccess.getFontPropertiesRule()); 
            pushFollow(FOLLOW_ruleFontProperties_in_entryRuleFontProperties11308);
            iv_ruleFontProperties=ruleFontProperties();

            state._fsp--;

             current =iv_ruleFontProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontProperties11318); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5054:1: ruleFontProperties returns [EObject current=null] : ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5057:28: ( ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5058:1: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5058:1: ( () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5058:2: () otherlv_1= 'font' ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )? ( (lv_size_6_0= RULE_INT ) )? ( (lv_bold_7_0= 'bold' ) )? ( (lv_italics_8_0= 'italics' ) )? ( (lv_conditional_9_0= ruleFeatureConditional ) )? otherlv_10= ';'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5058:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5059:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFontPropertiesAccess().getFontPropertiesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleFontProperties11364); 

                	newLeafNode(otherlv_1, grammarAccess.getFontPropertiesAccess().getFontKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5068:1: ( ( (lv_face_2_0= 'arial' ) ) | otherlv_3= 'verdana' | otherlv_4= 'courier' | otherlv_5= 'times' )?
            int alt95=5;
            switch ( input.LA(1) ) {
                case 71:
                    {
                    alt95=1;
                    }
                    break;
                case 72:
                    {
                    alt95=2;
                    }
                    break;
                case 73:
                    {
                    alt95=3;
                    }
                    break;
                case 74:
                    {
                    alt95=4;
                    }
                    break;
            }

            switch (alt95) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5068:2: ( (lv_face_2_0= 'arial' ) )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5068:2: ( (lv_face_2_0= 'arial' ) )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5069:1: (lv_face_2_0= 'arial' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5069:1: (lv_face_2_0= 'arial' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5070:3: lv_face_2_0= 'arial'
                    {
                    lv_face_2_0=(Token)match(input,71,FOLLOW_71_in_ruleFontProperties11383); 

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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5084:7: otherlv_3= 'verdana'
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_72_in_ruleFontProperties11414); 

                        	newLeafNode(otherlv_3, grammarAccess.getFontPropertiesAccess().getVerdanaKeyword_2_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5089:7: otherlv_4= 'courier'
                    {
                    otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleFontProperties11432); 

                        	newLeafNode(otherlv_4, grammarAccess.getFontPropertiesAccess().getCourierKeyword_2_2());
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5094:7: otherlv_5= 'times'
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleFontProperties11450); 

                        	newLeafNode(otherlv_5, grammarAccess.getFontPropertiesAccess().getTimesKeyword_2_3());
                        

                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5098:3: ( (lv_size_6_0= RULE_INT ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_INT) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5099:1: (lv_size_6_0= RULE_INT )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5099:1: (lv_size_6_0= RULE_INT )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5100:3: lv_size_6_0= RULE_INT
                    {
                    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFontProperties11469); 

                    			newLeafNode(lv_size_6_0, grammarAccess.getFontPropertiesAccess().getSizeINTTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFontPropertiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"size",
                            		lv_size_6_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5116:3: ( (lv_bold_7_0= 'bold' ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==75) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5117:1: (lv_bold_7_0= 'bold' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5117:1: (lv_bold_7_0= 'bold' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5118:3: lv_bold_7_0= 'bold'
                    {
                    lv_bold_7_0=(Token)match(input,75,FOLLOW_75_in_ruleFontProperties11493); 

                            newLeafNode(lv_bold_7_0, grammarAccess.getFontPropertiesAccess().getBoldBoldKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFontPropertiesRule());
                    	        }
                           		setWithLastConsumed(current, "bold", true, "bold");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5131:3: ( (lv_italics_8_0= 'italics' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==76) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5132:1: (lv_italics_8_0= 'italics' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5132:1: (lv_italics_8_0= 'italics' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5133:3: lv_italics_8_0= 'italics'
                    {
                    lv_italics_8_0=(Token)match(input,76,FOLLOW_76_in_ruleFontProperties11525); 

                            newLeafNode(lv_italics_8_0, grammarAccess.getFontPropertiesAccess().getItalicsItalicsKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFontPropertiesRule());
                    	        }
                           		setWithLastConsumed(current, "italics", true, "italics");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5146:3: ( (lv_conditional_9_0= ruleFeatureConditional ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==22) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5147:1: (lv_conditional_9_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5147:1: (lv_conditional_9_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5148:3: lv_conditional_9_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getFontPropertiesAccess().getConditionalFeatureConditionalParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleFontProperties11560);
                    lv_conditional_9_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFontPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_9_0, 
                            		"FeatureConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleFontProperties11573); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5176:1: entryRuleTextAlign returns [EObject current=null] : iv_ruleTextAlign= ruleTextAlign EOF ;
    public final EObject entryRuleTextAlign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAlign = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5177:2: (iv_ruleTextAlign= ruleTextAlign EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5178:2: iv_ruleTextAlign= ruleTextAlign EOF
            {
             newCompositeNode(grammarAccess.getTextAlignRule()); 
            pushFollow(FOLLOW_ruleTextAlign_in_entryRuleTextAlign11609);
            iv_ruleTextAlign=ruleTextAlign();

            state._fsp--;

             current =iv_ruleTextAlign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextAlign11619); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5185:1: ruleTextAlign returns [EObject current=null] : (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleTextAlign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_value_1_0 = null;

        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5188:28: ( (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5189:1: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5189:1: (otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5189:3: otherlv_0= 'align' ( (lv_value_1_0= ruleTextAlignValue ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleTextAlign11656); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAlignAccess().getAlignKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5193:1: ( (lv_value_1_0= ruleTextAlignValue ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5194:1: (lv_value_1_0= ruleTextAlignValue )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5194:1: (lv_value_1_0= ruleTextAlignValue )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5195:3: lv_value_1_0= ruleTextAlignValue
            {
             
            	        newCompositeNode(grammarAccess.getTextAlignAccess().getValueTextAlignValueEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextAlignValue_in_ruleTextAlign11677);
            lv_value_1_0=ruleTextAlignValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextAlignRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"TextAlignValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5211:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==22) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5212:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5212:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5213:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAlignAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleTextAlign11698);
                    lv_conditional_2_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextAlignRule());
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTextAlign11711); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5241:1: entryRuleLineStyle returns [EObject current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final EObject entryRuleLineStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStyle = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5242:2: (iv_ruleLineStyle= ruleLineStyle EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5243:2: iv_ruleLineStyle= ruleLineStyle EOF
            {
             newCompositeNode(grammarAccess.getLineStyleRule()); 
            pushFollow(FOLLOW_ruleLineStyle_in_entryRuleLineStyle11747);
            iv_ruleLineStyle=ruleLineStyle();

            state._fsp--;

             current =iv_ruleLineStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineStyle11757); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5250:1: ruleLineStyle returns [EObject current=null] : ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) ;
    public final EObject ruleLineStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_manhattan_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_style_2_0 = null;

        EObject lv_conditional_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5253:28: ( ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5254:1: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5254:1: ( () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5254:2: () otherlv_1= 'linestyle' ( (lv_style_2_0= ruleLineType ) )? ( (lv_manhattan_3_0= 'manhattan' ) )? ( (lv_conditional_4_0= ruleFeatureConditional ) )? otherlv_5= ';'
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5254:2: ()
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5255:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLineStyleAccess().getLineStyleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleLineStyle11803); 

                	newLeafNode(otherlv_1, grammarAccess.getLineStyleAccess().getLinestyleKeyword_1());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5264:1: ( (lv_style_2_0= ruleLineType ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=106 && LA101_0<=108)) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5265:1: (lv_style_2_0= ruleLineType )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5265:1: (lv_style_2_0= ruleLineType )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5266:3: lv_style_2_0= ruleLineType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineStyleAccess().getStyleLineTypeEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLineType_in_ruleLineStyle11824);
                    lv_style_2_0=ruleLineType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"LineType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5282:3: ( (lv_manhattan_3_0= 'manhattan' ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==79) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5283:1: (lv_manhattan_3_0= 'manhattan' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5283:1: (lv_manhattan_3_0= 'manhattan' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5284:3: lv_manhattan_3_0= 'manhattan'
                    {
                    lv_manhattan_3_0=(Token)match(input,79,FOLLOW_79_in_ruleLineStyle11843); 

                            newLeafNode(lv_manhattan_3_0, grammarAccess.getLineStyleAccess().getManhattanManhattanKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLineStyleRule());
                    	        }
                           		setWithLastConsumed(current, "manhattan", true, "manhattan");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5297:3: ( (lv_conditional_4_0= ruleFeatureConditional ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==22) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5298:1: (lv_conditional_4_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5298:1: (lv_conditional_4_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5299:3: lv_conditional_4_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineStyleAccess().getConditionalFeatureConditionalParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleLineStyle11878);
                    lv_conditional_4_0=ruleFeatureConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineStyleRule());
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleLineStyle11891); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5327:1: entryRuleLineWidth returns [EObject current=null] : iv_ruleLineWidth= ruleLineWidth EOF ;
    public final EObject entryRuleLineWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineWidth = null;


        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5328:2: (iv_ruleLineWidth= ruleLineWidth EOF )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5329:2: iv_ruleLineWidth= ruleLineWidth EOF
            {
             newCompositeNode(grammarAccess.getLineWidthRule()); 
            pushFollow(FOLLOW_ruleLineWidth_in_entryRuleLineWidth11927);
            iv_ruleLineWidth=ruleLineWidth();

            state._fsp--;

             current =iv_ruleLineWidth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineWidth11937); 

            }

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5336:1: ruleLineWidth returns [EObject current=null] : (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) ;
    public final EObject ruleLineWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_3=null;
        EObject lv_conditional_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5339:28: ( (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5340:1: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5340:1: (otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';' )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5340:3: otherlv_0= 'linewidth' ( (lv_width_1_0= RULE_INT ) ) ( (lv_conditional_2_0= ruleFeatureConditional ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleLineWidth11974); 

                	newLeafNode(otherlv_0, grammarAccess.getLineWidthAccess().getLinewidthKeyword_0());
                
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5344:1: ( (lv_width_1_0= RULE_INT ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5345:1: (lv_width_1_0= RULE_INT )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5345:1: (lv_width_1_0= RULE_INT )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5346:3: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLineWidth11991); 

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

            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5362:2: ( (lv_conditional_2_0= ruleFeatureConditional ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==22) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5363:1: (lv_conditional_2_0= ruleFeatureConditional )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5363:1: (lv_conditional_2_0= ruleFeatureConditional )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5364:3: lv_conditional_2_0= ruleFeatureConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineWidthAccess().getConditionalFeatureConditionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureConditional_in_ruleLineWidth12017);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleLineWidth12030); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5392:1: ruleAnchorDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) ;
    public final Enumerator ruleAnchorDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5394:28: ( ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5395:1: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5395:1: ( (enumLiteral_0= 'incoming' ) | (enumLiteral_1= 'outgoing' ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==81) ) {
                alt105=1;
            }
            else if ( (LA105_0==82) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5395:2: (enumLiteral_0= 'incoming' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5395:2: (enumLiteral_0= 'incoming' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5395:4: enumLiteral_0= 'incoming'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleAnchorDirection12080); 

                            current = grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnchorDirectionAccess().getINCOMINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5401:6: (enumLiteral_1= 'outgoing' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5401:6: (enumLiteral_1= 'outgoing' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5401:8: enumLiteral_1= 'outgoing'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_82_in_ruleAnchorDirection12097); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5411:1: ruleDefaultColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) ;
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
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5413:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5414:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5414:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'silver' ) | (enumLiteral_2= 'gray' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'red' ) | (enumLiteral_5= 'maroon' ) | (enumLiteral_6= 'yellow' ) | (enumLiteral_7= 'olive' ) | (enumLiteral_8= 'lime' ) | (enumLiteral_9= 'green' ) | (enumLiteral_10= 'aqua' ) | (enumLiteral_11= 'teal' ) | (enumLiteral_12= 'blue' ) | (enumLiteral_13= 'navy' ) | (enumLiteral_14= 'fuchsia' ) | (enumLiteral_15= 'purple' ) )
            int alt106=16;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt106=1;
                }
                break;
            case 84:
                {
                alt106=2;
                }
                break;
            case 85:
                {
                alt106=3;
                }
                break;
            case 86:
                {
                alt106=4;
                }
                break;
            case 87:
                {
                alt106=5;
                }
                break;
            case 88:
                {
                alt106=6;
                }
                break;
            case 89:
                {
                alt106=7;
                }
                break;
            case 90:
                {
                alt106=8;
                }
                break;
            case 91:
                {
                alt106=9;
                }
                break;
            case 92:
                {
                alt106=10;
                }
                break;
            case 93:
                {
                alt106=11;
                }
                break;
            case 94:
                {
                alt106=12;
                }
                break;
            case 95:
                {
                alt106=13;
                }
                break;
            case 96:
                {
                alt106=14;
                }
                break;
            case 97:
                {
                alt106=15;
                }
                break;
            case 98:
                {
                alt106=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5414:2: (enumLiteral_0= 'white' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5414:2: (enumLiteral_0= 'white' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5414:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleDefaultColor12142); 

                            current = grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDefaultColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5420:6: (enumLiteral_1= 'silver' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5420:6: (enumLiteral_1= 'silver' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5420:8: enumLiteral_1= 'silver'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleDefaultColor12159); 

                            current = grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDefaultColorAccess().getSILVEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5426:6: (enumLiteral_2= 'gray' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5426:6: (enumLiteral_2= 'gray' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5426:8: enumLiteral_2= 'gray'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_85_in_ruleDefaultColor12176); 

                            current = grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDefaultColorAccess().getGRAYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5432:6: (enumLiteral_3= 'black' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5432:6: (enumLiteral_3= 'black' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5432:8: enumLiteral_3= 'black'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_86_in_ruleDefaultColor12193); 

                            current = grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDefaultColorAccess().getBLACKEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5438:6: (enumLiteral_4= 'red' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5438:6: (enumLiteral_4= 'red' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5438:8: enumLiteral_4= 'red'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_87_in_ruleDefaultColor12210); 

                            current = grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5444:6: (enumLiteral_5= 'maroon' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5444:6: (enumLiteral_5= 'maroon' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5444:8: enumLiteral_5= 'maroon'
                    {
                    enumLiteral_5=(Token)match(input,88,FOLLOW_88_in_ruleDefaultColor12227); 

                            current = grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDefaultColorAccess().getMAROONEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5450:6: (enumLiteral_6= 'yellow' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5450:6: (enumLiteral_6= 'yellow' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5450:8: enumLiteral_6= 'yellow'
                    {
                    enumLiteral_6=(Token)match(input,89,FOLLOW_89_in_ruleDefaultColor12244); 

                            current = grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5456:6: (enumLiteral_7= 'olive' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5456:6: (enumLiteral_7= 'olive' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5456:8: enumLiteral_7= 'olive'
                    {
                    enumLiteral_7=(Token)match(input,90,FOLLOW_90_in_ruleDefaultColor12261); 

                            current = grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDefaultColorAccess().getOLIVEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5462:6: (enumLiteral_8= 'lime' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5462:6: (enumLiteral_8= 'lime' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5462:8: enumLiteral_8= 'lime'
                    {
                    enumLiteral_8=(Token)match(input,91,FOLLOW_91_in_ruleDefaultColor12278); 

                            current = grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDefaultColorAccess().getLIMEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5468:6: (enumLiteral_9= 'green' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5468:6: (enumLiteral_9= 'green' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5468:8: enumLiteral_9= 'green'
                    {
                    enumLiteral_9=(Token)match(input,92,FOLLOW_92_in_ruleDefaultColor12295); 

                            current = grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDefaultColorAccess().getGREENEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5474:6: (enumLiteral_10= 'aqua' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5474:6: (enumLiteral_10= 'aqua' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5474:8: enumLiteral_10= 'aqua'
                    {
                    enumLiteral_10=(Token)match(input,93,FOLLOW_93_in_ruleDefaultColor12312); 

                            current = grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDefaultColorAccess().getAQUAEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5480:6: (enumLiteral_11= 'teal' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5480:6: (enumLiteral_11= 'teal' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5480:8: enumLiteral_11= 'teal'
                    {
                    enumLiteral_11=(Token)match(input,94,FOLLOW_94_in_ruleDefaultColor12329); 

                            current = grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDefaultColorAccess().getTEALEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5486:6: (enumLiteral_12= 'blue' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5486:6: (enumLiteral_12= 'blue' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5486:8: enumLiteral_12= 'blue'
                    {
                    enumLiteral_12=(Token)match(input,95,FOLLOW_95_in_ruleDefaultColor12346); 

                            current = grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5492:6: (enumLiteral_13= 'navy' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5492:6: (enumLiteral_13= 'navy' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5492:8: enumLiteral_13= 'navy'
                    {
                    enumLiteral_13=(Token)match(input,96,FOLLOW_96_in_ruleDefaultColor12363); 

                            current = grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getDefaultColorAccess().getNAVYEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5498:6: (enumLiteral_14= 'fuchsia' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5498:6: (enumLiteral_14= 'fuchsia' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5498:8: enumLiteral_14= 'fuchsia'
                    {
                    enumLiteral_14=(Token)match(input,97,FOLLOW_97_in_ruleDefaultColor12380); 

                            current = grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getDefaultColorAccess().getFUCHSIAEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5504:6: (enumLiteral_15= 'purple' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5504:6: (enumLiteral_15= 'purple' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5504:8: enumLiteral_15= 'purple'
                    {
                    enumLiteral_15=(Token)match(input,98,FOLLOW_98_in_ruleDefaultColor12397); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5514:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5516:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5517:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5517:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==99) ) {
                alt107=1;
            }
            else if ( (LA107_0==100) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5517:2: (enumLiteral_0= '=' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5517:2: (enumLiteral_0= '=' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5517:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_99_in_ruleOperator12442); 

                            current = grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5523:6: (enumLiteral_1= '<>' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5523:6: (enumLiteral_1= '<>' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5523:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_100_in_ruleOperator12459); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5533:1: ruleBooleanLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5535:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5536:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5536:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5536:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5536:2: (enumLiteral_0= 'true' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5536:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_101_in_ruleBooleanLiteral12504); 

                            current = grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralAccess().getTRUEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5542:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5542:6: (enumLiteral_1= 'false' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5542:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_102_in_ruleBooleanLiteral12521); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5552:1: ruleTextAlignValue returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleTextAlignValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5554:28: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5555:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5555:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt109=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt109=1;
                }
                break;
            case 104:
                {
                alt109=2;
                }
                break;
            case 105:
                {
                alt109=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5555:2: (enumLiteral_0= 'left' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5555:2: (enumLiteral_0= 'left' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5555:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_103_in_ruleTextAlignValue12566); 

                            current = grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTextAlignValueAccess().getLEFTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5561:6: (enumLiteral_1= 'center' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5561:6: (enumLiteral_1= 'center' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5561:8: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_104_in_ruleTextAlignValue12583); 

                            current = grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTextAlignValueAccess().getCENTEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5567:6: (enumLiteral_2= 'right' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5567:6: (enumLiteral_2= 'right' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5567:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_105_in_ruleTextAlignValue12600); 

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
    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5577:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5579:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) ) )
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5580:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            {
            // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5580:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dashed' ) | (enumLiteral_2= 'dotted' ) )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt110=1;
                }
                break;
            case 107:
                {
                alt110=2;
                }
                break;
            case 108:
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
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5580:2: (enumLiteral_0= 'solid' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5580:2: (enumLiteral_0= 'solid' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5580:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_106_in_ruleLineType12645); 

                            current = grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5586:6: (enumLiteral_1= 'dashed' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5586:6: (enumLiteral_1= 'dashed' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5586:8: enumLiteral_1= 'dashed'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_107_in_ruleLineType12662); 

                            current = grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineTypeAccess().getDASHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5592:6: (enumLiteral_2= 'dotted' )
                    {
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5592:6: (enumLiteral_2= 'dotted' )
                    // ../org.eclipselabs.xdiagram.dsl/src-gen/org/eclipselabs/xdiagram/parser/antlr/internal/InternalDsl.g:5592:8: enumLiteral_2= 'dotted'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_108_in_ruleLineType12679); 

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


 

    public static final BitSet FOLLOW_ruleXDiagram_in_entryRuleXDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleXDiagram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXDiagram139 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleXDiagram165 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleDiagram_in_ruleXDiagram186 = new BitSet(new long[]{0x000000180C940002L});
    public static final BitSet FOLLOW_ruleToolGroup_in_ruleXDiagram207 = new BitSet(new long[]{0x000000180C940002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_ruleXDiagram230 = new BitSet(new long[]{0x000000180C900002L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleXDiagram257 = new BitSet(new long[]{0x000000180C900002L});
    public static final BitSet FOLLOW_ruleCustomColor_in_ruleXDiagram284 = new BitSet(new long[]{0x000000180C900002L});
    public static final BitSet FOLLOW_ruleCustomFigure_in_ruleXDiagram311 = new BitSet(new long[]{0x000000180C900002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImportStatement406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportStatement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName517 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName551 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard657 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildCard676 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDiagram778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDiagram801 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDiagram813 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_ruleContains_in_ruleDiagram834 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDiagram847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToolGroup_in_entryRuleToolGroup883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToolGroup893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleToolGroup930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToolGroup947 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleToolGroup969 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleToolGroup987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramElement1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleDiagramElement1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleDiagramElement1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStyle1189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStyle1206 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleStyle1230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStyle1263 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStyle1277 = new BitSet(new long[]{0xE780000000020000L,0x0000000000016050L});
    public static final BitSet FOLLOW_ruleStyleFeature_in_ruleStyle1298 = new BitSet(new long[]{0xE780000000020000L,0x0000000000016050L});
    public static final BitSet FOLLOW_17_in_ruleStyle1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedFeature_in_entryRuleLinkedFeature1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedFeature1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_ruleLinkedFeature1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleLinkedFeature1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyleFeature_in_entryRuleStyleFeature1468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleFeature1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleStyleFeature1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleStyleFeature1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_ruleStyleFeature1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_ruleStyleFeature1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleStyleFeature1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleStyleFeature1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransparency_in_ruleStyleFeature1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontProperties_in_ruleStyleFeature1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_ruleStyleFeature1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextAlign_in_ruleStyleFeature1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleStyleFeature1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_ruleStyleFeature1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildElement_in_entryRuleChildElement1859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChildElement1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleChildElement1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_ruleChildElement1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrow_in_ruleChildElement1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_entryRuleFeatureConditional2005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureConditional2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFeatureConditional2052 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureConditional2075 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleFeatureConditional2096 = new BitSet(new long[]{0x0008000000000070L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFeatureConditional2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode2153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNode2207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode2237 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24_in_ruleNode2261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode2294 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleNode2315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode2345 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNode2366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNode2389 = new BitSet(new long[]{0x00707F9000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleNode2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink2446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLink2500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink2530 = new BitSet(new long[]{0x000000000B000000L});
    public static final BitSet FOLLOW_24_in_ruleLink2554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2587 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_25_in_ruleLink2608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2638 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLink2659 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleLink2679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2715 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_29_in_ruleLink2741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2777 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLink2789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2812 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLink2824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink2847 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleLink2868 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink2901 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLink2915 = new BitSet(new long[]{0xE780000100020000L,0x0000000000016050L});
    public static final BitSet FOLLOW_ruleLinkFeature_in_ruleLink2936 = new BitSet(new long[]{0xE780000100020000L,0x0000000000016050L});
    public static final BitSet FOLLOW_ruleDecorator_in_ruleLink2958 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_17_in_ruleLink2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkFeature_in_entryRuleLinkFeature3007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkFeature3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleLinkFeature3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleLinkFeature3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_ruleLinkFeature3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorator_in_entryRuleDecorator3153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorator3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDecorator3200 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecorator3217 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDecorator3234 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleDecoratorElement_in_ruleDecorator3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor3291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAnchor3338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleAnchorDirection_in_ruleAnchor3359 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnchor3382 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleAnchor3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomColor_in_entryRuleCustomColor3440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomColor3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCustomColor3487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomColor3504 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomColor3526 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomColor3548 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomColor3570 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCustomColor3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor3623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultColor_in_ruleColor3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColor3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_entryRuleConnectableElement3741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectableElement3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangle_in_ruleConnectableElement3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhombus_in_ruleConnectableElement3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_ruleConnectableElement3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolyline_in_ruleConnectableElement3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleConnectableElement3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleConnectableElement3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvisible_in_ruleConnectableElement3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustom_in_ruleConnectableElement3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriangle_in_ruleConnectableElement4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecoratorElement_in_entryRuleDecoratorElement4049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecoratorElement4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_ruleDecoratorElement4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhombus_in_ruleDecoratorElement4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolyline_in_ruleDecoratorElement4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriangle_in_ruleDecoratorElement4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleDecoratorElement4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleDecoratorElement4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrow_in_ruleDecoratorElement4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_ruleDecoratorElement4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_entryRuleConnectableElementFeature4330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectableElementFeature4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleConnectableElementFeature4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleConnectableElementFeature4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleConnectableElementFeature4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransparency_in_ruleConnectableElementFeature4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleConnectableElementFeature4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_ruleConnectableElementFeature4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_ruleConnectableElementFeature4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleConnectableElementFeature4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleConnectableElementFeature4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisible_in_ruleConnectableElementFeature4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomFigure_in_entryRuleCustomFigure4665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomFigure4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCustomFigure4712 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomFigure4729 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCustomFigure4746 = new BitSet(new long[]{0x00707F9000000000L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleCustomFigure4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustom_in_entryRuleCustom4803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustom4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCustom4850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustom4870 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleCustom4889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustom4922 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCustom4936 = new BitSet(new long[]{0x0004004400020000L});
    public static final BitSet FOLLOW_ruleLinkedFeature_in_ruleCustom4957 = new BitSet(new long[]{0x0004004400020000L});
    public static final BitSet FOLLOW_38_in_ruleCustom4971 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleChildElement_in_ruleCustom4992 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_ruleCustom5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangle_in_entryRuleRectangle5042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRectangle5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRectangle5096 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_40_in_ruleRectangle5133 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleRectangle5166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRectangle5199 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRectangle5213 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_ruleRectangleFeature_in_ruleRectangle5234 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_38_in_ruleRectangle5248 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleChildElement_in_ruleRectangle5269 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_ruleRectangle5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangleFeature_in_entryRuleRectangleFeature5319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRectangleFeature5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_ruleRectangleFeature5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_ruleRectangleFeature5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhombus_in_entryRuleRhombus5438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRhombus5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRhombus5494 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleRhombus5513 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRhombus5546 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRhombus5560 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_ruleRhombus5581 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_38_in_ruleRhombus5595 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleChildElement_in_ruleRhombus5616 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_ruleRhombus5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_entryRuleEllipse5666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEllipse5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEllipse5720 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_43_in_ruleEllipse5757 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleEllipse5790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEllipse5823 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEllipse5837 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_ruleEllipse5858 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_38_in_ruleEllipse5872 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleChildElement_in_ruleEllipse5893 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_ruleEllipse5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolyline_in_entryRulePolyline5943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolyline5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePolyline5997 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_45_in_rulePolyline6034 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_rulePolyline6067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePolyline6100 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePolyline6114 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rulePoint_in_rulePolyline6135 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rulePoint_in_rulePolyline6156 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_rulePoint_in_rulePolyline6177 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_rulePolyline6199 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_38_in_rulePolyline6213 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleChildElement_in_rulePolyline6234 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_rulePolyline6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriangle_in_entryRuleTriangle6284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriangle6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTriangle6340 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleTriangle6359 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTriangle6392 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTriangle6406 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_ruleConnectableElementFeature_in_ruleTriangle6427 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_38_in_ruleTriangle6441 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleChildElement_in_ruleTriangle6462 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_ruleTriangle6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine6512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLine6575 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_48_in_ruleLine6612 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleLine6645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLine6678 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLine6692 = new BitSet(new long[]{0xE7C4000400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_ruleLineFeature_in_ruleLine6713 = new BitSet(new long[]{0xE7C4000400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_17_in_ruleLine6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineFeature_in_entryRuleLineFeature6762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineFeature6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_ruleLineFeature6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleLineFeature6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleLineFeature6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleLineFeature6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisible_in_ruleLineFeature6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrow_in_entryRuleArrow6962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrow6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleArrow7018 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleArrow7037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArrow7070 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArrow7084 = new BitSet(new long[]{0xE7C4000400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_ruleLineFeature_in_ruleArrow7105 = new BitSet(new long[]{0xE7C4000400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_17_in_ruleArrow7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_entryRuleContains7154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContains7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleContains7201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContains7224 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleContains7245 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContains7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue7294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue7351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_ruleValue7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue7432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_ruleValue7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue7494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue7585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleValue7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleValue7637 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDoubleValue7654 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleValue7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue7712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleStringValue7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue7801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue7842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanValue7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_entryRuleEnumValue7932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumValue7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumValue7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel8025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLabel8081 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleLabel8100 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel8133 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLabel8147 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_ruleLabelFeature_in_ruleLabel8168 = new BitSet(new long[]{0xE7C4004400020000L,0x0000000000016051L});
    public static final BitSet FOLLOW_38_in_ruleLabel8182 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleChildElement_in_ruleLabel8203 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_ruleLabel8217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelFeature_in_entryRuleLabelFeature8253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelFeature8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_ruleLabelFeature8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleLabelFeature8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontProperties_in_ruleLabelFeature8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleLabelFeature8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleLabelFeature8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisible_in_ruleLabelFeature8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextAlign_in_ruleLabelFeature8472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage8507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleImage8554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImage8571 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleImage8595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImage8628 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImage8642 = new BitSet(new long[]{0x4600004000020000L});
    public static final BitSet FOLLOW_ruleImageFeature_in_ruleImage8663 = new BitSet(new long[]{0x4600004000020000L});
    public static final BitSet FOLLOW_38_in_ruleImage8677 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleChildElement_in_ruleImage8698 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_ruleImage8712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageFeature_in_entryRuleImageFeature8748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageFeature8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleImageFeature8805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleImageFeature8832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransparency_in_ruleImageFeature8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvisible_in_entryRuleInvisible8894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvisible8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInvisible8950 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleInvisible8969 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvisible9002 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInvisible9016 = new BitSet(new long[]{0x4404004400020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleInvisibleFeature_in_ruleInvisible9037 = new BitSet(new long[]{0x4404004400020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38_in_ruleInvisible9051 = new BitSet(new long[]{0x0073FF9000000000L});
    public static final BitSet FOLLOW_ruleChildElement_in_ruleInvisible9072 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_ruleInvisible9086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvisibleFeature_in_entryRuleInvisibleFeature9122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvisibleFeature9132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleInvisibleFeature9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleInvisibleFeature9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedFeature_in_ruleInvisibleFeature9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleInvisibleFeature9260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature9295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleColorFeature9352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleColorFeature9379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_entryRuleForeground9414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeground9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleForeground9467 = new BitSet(new long[]{0x0000000000000020L,0x00000007FFF80000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleForeground9501 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleForeground9522 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleForeground9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground9571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground9581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBackground9624 = new BitSet(new long[]{0x0000000000000020L,0x00000007FFF80000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleBackground9658 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleBackground9679 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBackground9692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransparency_in_entryRuleTransparency9728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransparency9738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTransparency9775 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransparency9792 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTransparency9809 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleTransparency9830 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransparency9843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize9879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSize9926 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize9943 = new BitSet(new long[]{0x1800000000480040L});
    public static final BitSet FOLLOW_59_in_ruleSize9966 = new BitSet(new long[]{0x1000000000480040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize9998 = new BitSet(new long[]{0x1800000000480000L});
    public static final BitSet FOLLOW_59_in_ruleSize10021 = new BitSet(new long[]{0x1000000000480000L});
    public static final BitSet FOLLOW_60_in_ruleSize10055 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleSize10090 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSize10103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint10139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint10149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePoint10186 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint10203 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint10225 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_rulePoint10251 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePoint10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_entryRulePosition10300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosition10310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePosition10347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePosition10364 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_33_in_rulePosition10387 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePosition10418 = new BitSet(new long[]{0x0000000200480000L});
    public static final BitSet FOLLOW_33_in_rulePosition10441 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_rulePosition10476 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePosition10489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner10525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner10535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCorner10572 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCorner10589 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleCorner10615 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCorner10628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout10664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout10674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleLayout10711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_ruleLayout10730 = new BitSet(new long[]{0x0000000000480000L,0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_ruleLayout10767 = new BitSet(new long[]{0x0000000000480000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleLayout10794 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLayout10811 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleLayout10839 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLayout10852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisible_in_entryRuleVisible10888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisible10898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVisible10935 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleVisible10956 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVisible10968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_entryRuleTextValue11004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextValue11014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTextValue11060 = new BitSet(new long[]{0x0000000000480030L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextValue11081 = new BitSet(new long[]{0x0000000000480030L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleTextValue11103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTextValue11116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart11152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextPart11204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTextPart11234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTextPart11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontProperties_in_entryRuleFontProperties11308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontProperties11318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleFontProperties11364 = new BitSet(new long[]{0x0000000000480040L,0x0000000000001F80L});
    public static final BitSet FOLLOW_71_in_ruleFontProperties11383 = new BitSet(new long[]{0x0000000000480040L,0x0000000000001800L});
    public static final BitSet FOLLOW_72_in_ruleFontProperties11414 = new BitSet(new long[]{0x0000000000480040L,0x0000000000001800L});
    public static final BitSet FOLLOW_73_in_ruleFontProperties11432 = new BitSet(new long[]{0x0000000000480040L,0x0000000000001800L});
    public static final BitSet FOLLOW_74_in_ruleFontProperties11450 = new BitSet(new long[]{0x0000000000480040L,0x0000000000001800L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFontProperties11469 = new BitSet(new long[]{0x0000000000480000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleFontProperties11493 = new BitSet(new long[]{0x0000000000480000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleFontProperties11525 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleFontProperties11560 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFontProperties11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextAlign_in_entryRuleTextAlign11609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextAlign11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTextAlign11656 = new BitSet(new long[]{0x0000000000000000L,0x0000038000000000L});
    public static final BitSet FOLLOW_ruleTextAlignValue_in_ruleTextAlign11677 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleTextAlign11698 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTextAlign11711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_entryRuleLineStyle11747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineStyle11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleLineStyle11803 = new BitSet(new long[]{0x0000000000480000L,0x00001C0000008000L});
    public static final BitSet FOLLOW_ruleLineType_in_ruleLineStyle11824 = new BitSet(new long[]{0x0000000000480000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleLineStyle11843 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleLineStyle11878 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLineStyle11891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_entryRuleLineWidth11927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineWidth11937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleLineWidth11974 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLineWidth11991 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleFeatureConditional_in_ruleLineWidth12017 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLineWidth12030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAnchorDirection12080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAnchorDirection12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDefaultColor12142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleDefaultColor12159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleDefaultColor12176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleDefaultColor12193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleDefaultColor12210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDefaultColor12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleDefaultColor12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleDefaultColor12261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleDefaultColor12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleDefaultColor12295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleDefaultColor12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleDefaultColor12329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleDefaultColor12346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleDefaultColor12363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleDefaultColor12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleDefaultColor12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleOperator12442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleOperator12459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleBooleanLiteral12504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleBooleanLiteral12521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleTextAlignValue12566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleTextAlignValue12583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleTextAlignValue12600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleLineType12645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleLineType12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleLineType12679 = new BitSet(new long[]{0x0000000000000002L});

}