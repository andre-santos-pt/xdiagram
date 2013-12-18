package org.xtext.example.mydsl.parser.antlr.internal; 

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_PERCENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'image'", "'rgb='", "'color'", "'rectangle'", "'square'", "'{'", "'}'", "'rhombus'", "'ellipse'", "'circle'", "'polygon'", "'polyline'", "'('", "'='", "'<>'", "'->'", "')'", "'.'", "'true'", "'false'", "'-'", "'label'", "'editable'", "'line'", "'foreground'", "':'", "'background'", "'border'", "'transparency'", "'size'", "'point'", "'position'", "'corner'", "'font-face'", "'font-size'", "'font-style'", "'line-style'", "'line-width'", "'red'", "'blue'", "'yellow'", "'arial'", "'verdana'", "'times'", "'courier'", "'italics'", "'bold'", "'underline'", "'solid'", "'dash'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_PERCENT=7;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=4;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_colors_0_0= ruleCustomColor ) )* ( (lv_images_1_0= ruleImageFile ) )* ( (lv_elements_2_0= ruleConnectableElement ) )* ( (lv_links_3_0= ruleLinkElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_colors_0_0 = null;

        EObject lv_images_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_links_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( ( (lv_colors_0_0= ruleCustomColor ) )* ( (lv_images_1_0= ruleImageFile ) )* ( (lv_elements_2_0= ruleConnectableElement ) )* ( (lv_links_3_0= ruleLinkElement ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( ( (lv_colors_0_0= ruleCustomColor ) )* ( (lv_images_1_0= ruleImageFile ) )* ( (lv_elements_2_0= ruleConnectableElement ) )* ( (lv_links_3_0= ruleLinkElement ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( ( (lv_colors_0_0= ruleCustomColor ) )* ( (lv_images_1_0= ruleImageFile ) )* ( (lv_elements_2_0= ruleConnectableElement ) )* ( (lv_links_3_0= ruleLinkElement ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: ( (lv_colors_0_0= ruleCustomColor ) )* ( (lv_images_1_0= ruleImageFile ) )* ( (lv_elements_2_0= ruleConnectableElement ) )* ( (lv_links_3_0= ruleLinkElement ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: ( (lv_colors_0_0= ruleCustomColor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_colors_0_0= ruleCustomColor )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_colors_0_0= ruleCustomColor )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:83:3: lv_colors_0_0= ruleCustomColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getColorsCustomColorParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomColor_in_ruleModel131);
            	    lv_colors_0_0=ruleCustomColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colors",
            	            		lv_colors_0_0, 
            	            		"CustomColor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:99:3: ( (lv_images_1_0= ruleImageFile ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_ID) ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==RULE_STRING) ) {
                            alt2=1;
                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:1: (lv_images_1_0= ruleImageFile )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:1: (lv_images_1_0= ruleImageFile )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:101:3: lv_images_1_0= ruleImageFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImagesImageFileParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImageFile_in_ruleModel153);
            	    lv_images_1_0=ruleImageFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"images",
            	            		lv_images_1_0, 
            	            		"ImageFile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:3: ( (lv_elements_2_0= ruleConnectableElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||(LA3_0>=16 && LA3_0<=17)||(LA3_0>=20 && LA3_0<=24)||LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:1: (lv_elements_2_0= ruleConnectableElement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:1: (lv_elements_2_0= ruleConnectableElement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:3: lv_elements_2_0= ruleConnectableElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsConnectableElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectableElement_in_ruleModel175);
            	    lv_elements_2_0=ruleConnectableElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"ConnectableElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:3: ( (lv_links_3_0= ruleLinkElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:1: (lv_links_3_0= ruleLinkElement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:1: (lv_links_3_0= ruleLinkElement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:3: lv_links_3_0= ruleLinkElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getLinksLinkElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkElement_in_ruleModel197);
            	    lv_links_3_0=ruleLinkElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_3_0, 
            	            		"LinkElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConnectableElement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: entryRuleConnectableElement returns [EObject current=null] : iv_ruleConnectableElement= ruleConnectableElement EOF ;
    public final EObject entryRuleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableElement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:2: (iv_ruleConnectableElement= ruleConnectableElement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:2: iv_ruleConnectableElement= ruleConnectableElement EOF
            {
             newCompositeNode(grammarAccess.getConnectableElementRule()); 
            pushFollow(FOLLOW_ruleConnectableElement_in_entryRuleConnectableElement234);
            iv_ruleConnectableElement=ruleConnectableElement();

            state._fsp--;

             current =iv_ruleConnectableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectableElement244); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:170:1: ruleConnectableElement returns [EObject current=null] : (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polygon_3= rulePolygon | this_Label_4= ruleLabel | this_Image_5= ruleImage ) ;
    public final EObject ruleConnectableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rectangle_0 = null;

        EObject this_Rhombus_1 = null;

        EObject this_Ellipse_2 = null;

        EObject this_Polygon_3 = null;

        EObject this_Label_4 = null;

        EObject this_Image_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:173:28: ( (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polygon_3= rulePolygon | this_Label_4= ruleLabel | this_Image_5= ruleImage ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:174:1: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polygon_3= rulePolygon | this_Label_4= ruleLabel | this_Image_5= ruleImage )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:174:1: (this_Rectangle_0= ruleRectangle | this_Rhombus_1= ruleRhombus | this_Ellipse_2= ruleEllipse | this_Polygon_3= rulePolygon | this_Label_4= ruleLabel | this_Image_5= ruleImage )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
            case 24:
                {
                alt5=4;
                }
                break;
            case 34:
                {
                alt5=5;
                }
                break;
            case 13:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:5: this_Rectangle_0= ruleRectangle
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getRectangleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRectangle_in_ruleConnectableElement291);
                    this_Rectangle_0=ruleRectangle();

                    state._fsp--;

                     
                            current = this_Rectangle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:185:5: this_Rhombus_1= ruleRhombus
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getRhombusParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRhombus_in_ruleConnectableElement318);
                    this_Rhombus_1=ruleRhombus();

                    state._fsp--;

                     
                            current = this_Rhombus_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:195:5: this_Ellipse_2= ruleEllipse
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getEllipseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEllipse_in_ruleConnectableElement345);
                    this_Ellipse_2=ruleEllipse();

                    state._fsp--;

                     
                            current = this_Ellipse_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:5: this_Polygon_3= rulePolygon
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getPolygonParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePolygon_in_ruleConnectableElement372);
                    this_Polygon_3=rulePolygon();

                    state._fsp--;

                     
                            current = this_Polygon_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:5: this_Label_4= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getLabelParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleConnectableElement399);
                    this_Label_4=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:225:5: this_Image_5= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getConnectableElementAccess().getImageParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleConnectableElement426);
                    this_Image_5=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_5; 
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


    // $ANTLR start "entryRuleRGB"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:2: (iv_ruleRGB= ruleRGB EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:243:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_ruleRGB_in_entryRuleRGB461);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGB471); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:250:1: ruleRGB returns [EObject current=null] : ( ( (lv_R_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_G_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_B_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRGB() throws RecognitionException {
        EObject current = null;

        Token lv_R_0_0=null;
        Token otherlv_1=null;
        Token lv_G_2_0=null;
        Token otherlv_3=null;
        Token lv_B_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:253:28: ( ( ( (lv_R_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_G_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_B_4_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:254:1: ( ( (lv_R_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_G_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_B_4_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:254:1: ( ( (lv_R_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_G_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_B_4_0= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:254:2: ( (lv_R_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_G_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_B_4_0= RULE_INT ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:254:2: ( (lv_R_0_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:255:1: (lv_R_0_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:255:1: (lv_R_0_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:256:3: lv_R_0_0= RULE_INT
            {
            lv_R_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB513); 

            			newLeafNode(lv_R_0_0, grammarAccess.getRGBAccess().getRINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"R",
                    		lv_R_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleRGB530); 

                	newLeafNode(otherlv_1, grammarAccess.getRGBAccess().getCommaKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: ( (lv_G_2_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:277:1: (lv_G_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:277:1: (lv_G_2_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:278:3: lv_G_2_0= RULE_INT
            {
            lv_G_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB547); 

            			newLeafNode(lv_G_2_0, grammarAccess.getRGBAccess().getGINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"G",
                    		lv_G_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleRGB564); 

                	newLeafNode(otherlv_3, grammarAccess.getRGBAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:298:1: ( (lv_B_4_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: (lv_B_4_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: (lv_B_4_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:3: lv_B_4_0= RULE_INT
            {
            lv_B_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB581); 

            			newLeafNode(lv_B_4_0, grammarAccess.getRGBAccess().getBINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"B",
                    		lv_B_4_0, 
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
    // $ANTLR end "ruleRGB"


    // $ANTLR start "entryRuleImageFile"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:1: entryRuleImageFile returns [EObject current=null] : iv_ruleImageFile= ruleImageFile EOF ;
    public final EObject entryRuleImageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFile = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:2: (iv_ruleImageFile= ruleImageFile EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:2: iv_ruleImageFile= ruleImageFile EOF
            {
             newCompositeNode(grammarAccess.getImageFileRule()); 
            pushFollow(FOLLOW_ruleImageFile_in_entryRuleImageFile622);
            iv_ruleImageFile=ruleImageFile();

            state._fsp--;

             current =iv_ruleImageFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageFile632); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageFile"


    // $ANTLR start "ruleImageFile"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:1: ruleImageFile returns [EObject current=null] : (otherlv_0= 'image' ( (lv_name_1_0= RULE_ID ) ) ( (lv_src_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_src_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:336:28: ( (otherlv_0= 'image' ( (lv_name_1_0= RULE_ID ) ) ( (lv_src_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:337:1: (otherlv_0= 'image' ( (lv_name_1_0= RULE_ID ) ) ( (lv_src_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:337:1: (otherlv_0= 'image' ( (lv_name_1_0= RULE_ID ) ) ( (lv_src_2_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:337:3: otherlv_0= 'image' ( (lv_name_1_0= RULE_ID ) ) ( (lv_src_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImageFile669); 

                	newLeafNode(otherlv_0, grammarAccess.getImageFileAccess().getImageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageFile686); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImageFileAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:359:2: ( (lv_src_2_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:360:1: (lv_src_2_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:360:1: (lv_src_2_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:361:3: lv_src_2_0= RULE_STRING
            {
            lv_src_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageFile708); 

            			newLeafNode(lv_src_2_0, grammarAccess.getImageFileAccess().getSrcSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"src",
                    		lv_src_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleImageFile"


    // $ANTLR start "entryRuleColor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:385:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:2: (iv_ruleColor= ruleColor EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor749);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor759); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: ruleColor returns [EObject current=null] : ( ( ( (lv_custom_0_0= 'rgb=' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_default_2_0= ruleDefaultColor ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token lv_custom_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_default_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:28: ( ( ( ( (lv_custom_0_0= 'rgb=' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_default_2_0= ruleDefaultColor ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:1: ( ( ( (lv_custom_0_0= 'rgb=' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_default_2_0= ruleDefaultColor ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:1: ( ( ( (lv_custom_0_0= 'rgb=' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_default_2_0= ruleDefaultColor ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=51 && LA6_0<=53)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:2: ( ( (lv_custom_0_0= 'rgb=' ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:2: ( ( (lv_custom_0_0= 'rgb=' ) ) ( (otherlv_1= RULE_ID ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:3: ( (lv_custom_0_0= 'rgb=' ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:3: ( (lv_custom_0_0= 'rgb=' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:1: (lv_custom_0_0= 'rgb=' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:1: (lv_custom_0_0= 'rgb=' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:400:3: lv_custom_0_0= 'rgb='
                    {
                    lv_custom_0_0=(Token)match(input,14,FOLLOW_14_in_ruleColor803); 

                            newLeafNode(lv_custom_0_0, grammarAccess.getColorAccess().getCustomRgbKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorRule());
                    	        }
                           		setWithLastConsumed(current, "custom", true, "rgb=");
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:413:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:414:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:414:1: (otherlv_1= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:415:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColor836); 

                    		newLeafNode(otherlv_1, grammarAccess.getColorAccess().getRgbCustomColorCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:6: ( (lv_default_2_0= ruleDefaultColor ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:6: ( (lv_default_2_0= ruleDefaultColor ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:1: (lv_default_2_0= ruleDefaultColor )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:1: (lv_default_2_0= ruleDefaultColor )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:429:3: lv_default_2_0= ruleDefaultColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getDefaultDefaultColorEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultColor_in_ruleColor864);
                    lv_default_2_0=ruleDefaultColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_2_0, 
                            		"DefaultColor");
                    	        afterParserOrEnumRuleCall();
                    	    

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


    // $ANTLR start "entryRuleCustomColor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:453:1: entryRuleCustomColor returns [EObject current=null] : iv_ruleCustomColor= ruleCustomColor EOF ;
    public final EObject entryRuleCustomColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomColor = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:2: (iv_ruleCustomColor= ruleCustomColor EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:455:2: iv_ruleCustomColor= ruleCustomColor EOF
            {
             newCompositeNode(grammarAccess.getCustomColorRule()); 
            pushFollow(FOLLOW_ruleCustomColor_in_entryRuleCustomColor900);
            iv_ruleCustomColor=ruleCustomColor();

            state._fsp--;

             current =iv_ruleCustomColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomColor910); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:1: ruleCustomColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= ruleRGB ) ) ) ;
    public final EObject ruleCustomColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rgb_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= ruleRGB ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= ruleRGB ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= ruleRGB ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= ruleRGB ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleCustomColor947); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomColorAccess().getColorKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:470:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:471:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:471:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomColor964); 

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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:2: ( (lv_rgb_2_0= ruleRGB ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:1: (lv_rgb_2_0= ruleRGB )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:1: (lv_rgb_2_0= ruleRGB )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:490:3: lv_rgb_2_0= ruleRGB
            {
             
            	        newCompositeNode(grammarAccess.getCustomColorAccess().getRgbRGBParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRGB_in_ruleCustomColor990);
            lv_rgb_2_0=ruleRGB();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomColorRule());
            	        }
                   		set(
                   			current, 
                   			"rgb",
                    		lv_rgb_2_0, 
                    		"RGB");
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
    // $ANTLR end "ruleCustomColor"


    // $ANTLR start "entryRuleRectangle"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:2: (iv_ruleRectangle= ruleRectangle EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_ruleRectangle_in_entryRuleRectangle1026);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRectangle1036); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:1: ruleRectangle returns [EObject current=null] : ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token lv_rectangle_0_0=null;
        Token lv_square_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:28: ( ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:1: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:1: ( ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:2: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:2: ( ( (lv_rectangle_0_0= 'rectangle' ) ) | ( (lv_square_1_0= 'square' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:3: ( (lv_rectangle_0_0= 'rectangle' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:3: ( (lv_rectangle_0_0= 'rectangle' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:528:1: (lv_rectangle_0_0= 'rectangle' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:528:1: (lv_rectangle_0_0= 'rectangle' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:529:3: lv_rectangle_0_0= 'rectangle'
                    {
                    lv_rectangle_0_0=(Token)match(input,16,FOLLOW_16_in_ruleRectangle1080); 

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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:543:6: ( (lv_square_1_0= 'square' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:543:6: ( (lv_square_1_0= 'square' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:1: (lv_square_1_0= 'square' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:1: (lv_square_1_0= 'square' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:3: lv_square_1_0= 'square'
                    {
                    lv_square_1_0=(Token)match(input,17,FOLLOW_17_in_ruleRectangle1117); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleRectangle1143); 

                	newLeafNode(otherlv_2, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:1: ( (lv_features_3_0= rulePolygonFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37||(LA8_0>=39 && LA8_0<=40)||LA8_0==42||LA8_0==44||(LA8_0>=49 && LA8_0<=50)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:1: (lv_features_3_0= rulePolygonFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:1: (lv_features_3_0= rulePolygonFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:3: lv_features_3_0= rulePolygonFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRectangleAccess().getFeaturesPolygonFeatureParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePolygonFeature_in_ruleRectangle1164);
            	    lv_features_3_0=rulePolygonFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"PolygonFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleRectangle1177); 

                	newLeafNode(otherlv_4, grammarAccess.getRectangleAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleRhombus"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:1: entryRuleRhombus returns [EObject current=null] : iv_ruleRhombus= ruleRhombus EOF ;
    public final EObject entryRuleRhombus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhombus = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:2: (iv_ruleRhombus= ruleRhombus EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:596:2: iv_ruleRhombus= ruleRhombus EOF
            {
             newCompositeNode(grammarAccess.getRhombusRule()); 
            pushFollow(FOLLOW_ruleRhombus_in_entryRuleRhombus1215);
            iv_ruleRhombus=ruleRhombus();

            state._fsp--;

             current =iv_ruleRhombus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRhombus1225); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:1: ruleRhombus returns [EObject current=null] : (otherlv_0= 'rhombus' otherlv_1= '{' ( (lv_features_2_0= rulePolygonFeature ) ) otherlv_3= '}' ) ;
    public final EObject ruleRhombus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_features_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:28: ( (otherlv_0= 'rhombus' otherlv_1= '{' ( (lv_features_2_0= rulePolygonFeature ) ) otherlv_3= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:607:1: (otherlv_0= 'rhombus' otherlv_1= '{' ( (lv_features_2_0= rulePolygonFeature ) ) otherlv_3= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:607:1: (otherlv_0= 'rhombus' otherlv_1= '{' ( (lv_features_2_0= rulePolygonFeature ) ) otherlv_3= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:607:3: otherlv_0= 'rhombus' otherlv_1= '{' ( (lv_features_2_0= rulePolygonFeature ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRhombus1262); 

                	newLeafNode(otherlv_0, grammarAccess.getRhombusAccess().getRhombusKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleRhombus1274); 

                	newLeafNode(otherlv_1, grammarAccess.getRhombusAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:615:1: ( (lv_features_2_0= rulePolygonFeature ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:1: (lv_features_2_0= rulePolygonFeature )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:1: (lv_features_2_0= rulePolygonFeature )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:617:3: lv_features_2_0= rulePolygonFeature
            {
             
            	        newCompositeNode(grammarAccess.getRhombusAccess().getFeaturesPolygonFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePolygonFeature_in_ruleRhombus1295);
            lv_features_2_0=rulePolygonFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRhombusRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_2_0, 
                    		"PolygonFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleRhombus1307); 

                	newLeafNode(otherlv_3, grammarAccess.getRhombusAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:2: (iv_ruleEllipse= ruleEllipse EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:2: iv_ruleEllipse= ruleEllipse EOF
            {
             newCompositeNode(grammarAccess.getEllipseRule()); 
            pushFollow(FOLLOW_ruleEllipse_in_entryRuleEllipse1343);
            iv_ruleEllipse=ruleEllipse();

            state._fsp--;

             current =iv_ruleEllipse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEllipse1353); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:1: ruleEllipse returns [EObject current=null] : ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleEllipse() throws RecognitionException {
        EObject current = null;

        Token lv_ellipse_0_0=null;
        Token lv_circle_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:28: ( ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:1: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:1: ( ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:2: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePolygonFeature ) )* otherlv_4= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:2: ( ( (lv_ellipse_0_0= 'ellipse' ) ) | ( (lv_circle_1_0= 'circle' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:3: ( (lv_ellipse_0_0= 'ellipse' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:3: ( (lv_ellipse_0_0= 'ellipse' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:1: (lv_ellipse_0_0= 'ellipse' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:1: (lv_ellipse_0_0= 'ellipse' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:3: lv_ellipse_0_0= 'ellipse'
                    {
                    lv_ellipse_0_0=(Token)match(input,21,FOLLOW_21_in_ruleEllipse1397); 

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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:6: ( (lv_circle_1_0= 'circle' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:6: ( (lv_circle_1_0= 'circle' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:675:1: (lv_circle_1_0= 'circle' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:675:1: (lv_circle_1_0= 'circle' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:3: lv_circle_1_0= 'circle'
                    {
                    lv_circle_1_0=(Token)match(input,22,FOLLOW_22_in_ruleEllipse1434); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEllipse1460); 

                	newLeafNode(otherlv_2, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:693:1: ( (lv_features_3_0= rulePolygonFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37||(LA10_0>=39 && LA10_0<=40)||LA10_0==42||LA10_0==44||(LA10_0>=49 && LA10_0<=50)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:694:1: (lv_features_3_0= rulePolygonFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:694:1: (lv_features_3_0= rulePolygonFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:695:3: lv_features_3_0= rulePolygonFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEllipseAccess().getFeaturesPolygonFeatureParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePolygonFeature_in_ruleEllipse1481);
            	    lv_features_3_0=rulePolygonFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"PolygonFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEllipse1494); 

                	newLeafNode(otherlv_4, grammarAccess.getEllipseAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulePolygon"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:723:1: entryRulePolygon returns [EObject current=null] : iv_rulePolygon= rulePolygon EOF ;
    public final EObject entryRulePolygon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolygon = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:724:2: (iv_rulePolygon= rulePolygon EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:725:2: iv_rulePolygon= rulePolygon EOF
            {
             newCompositeNode(grammarAccess.getPolygonRule()); 
            pushFollow(FOLLOW_rulePolygon_in_entryRulePolygon1530);
            iv_rulePolygon=rulePolygon();

            state._fsp--;

             current =iv_rulePolygon; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolygon1540); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolygon"


    // $ANTLR start "rulePolygon"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:1: rulePolygon returns [EObject current=null] : ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePolygonFeature ) )* otherlv_6= '}' ) ;
    public final EObject rulePolygon() throws RecognitionException {
        EObject current = null;

        Token lv_polygon_0_0=null;
        Token lv_polyline_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_features_3_0 = null;

        EObject lv_features_4_0 = null;

        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:28: ( ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePolygonFeature ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:1: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePolygonFeature ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:1: ( ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePolygonFeature ) )* otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:2: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) ) otherlv_2= '{' ( (lv_features_3_0= rulePoint ) ) ( (lv_features_4_0= rulePoint ) ) ( (lv_features_5_0= rulePolygonFeature ) )* otherlv_6= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:2: ( ( (lv_polygon_0_0= 'polygon' ) ) | ( (lv_polyline_1_0= 'polyline' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:3: ( (lv_polygon_0_0= 'polygon' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:3: ( (lv_polygon_0_0= 'polygon' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:1: (lv_polygon_0_0= 'polygon' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:1: (lv_polygon_0_0= 'polygon' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:3: lv_polygon_0_0= 'polygon'
                    {
                    lv_polygon_0_0=(Token)match(input,23,FOLLOW_23_in_rulePolygon1584); 

                            newLeafNode(lv_polygon_0_0, grammarAccess.getPolygonAccess().getPolygonPolygonKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolygonRule());
                    	        }
                           		setWithLastConsumed(current, "polygon", true, "polygon");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:752:6: ( (lv_polyline_1_0= 'polyline' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:752:6: ( (lv_polyline_1_0= 'polyline' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:1: (lv_polyline_1_0= 'polyline' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:1: (lv_polyline_1_0= 'polyline' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:3: lv_polyline_1_0= 'polyline'
                    {
                    lv_polyline_1_0=(Token)match(input,24,FOLLOW_24_in_rulePolygon1621); 

                            newLeafNode(lv_polyline_1_0, grammarAccess.getPolygonAccess().getPolylinePolylineKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolygonRule());
                    	        }
                           		setWithLastConsumed(current, "polyline", true, "polyline");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulePolygon1647); 

                	newLeafNode(otherlv_2, grammarAccess.getPolygonAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:771:1: ( (lv_features_3_0= rulePoint ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:1: (lv_features_3_0= rulePoint )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:1: (lv_features_3_0= rulePoint )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:3: lv_features_3_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getPolygonAccess().getFeaturesPointParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_rulePolygon1668);
            lv_features_3_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolygonRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_3_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:789:2: ( (lv_features_4_0= rulePoint ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:1: (lv_features_4_0= rulePoint )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:1: (lv_features_4_0= rulePoint )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:3: lv_features_4_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getPolygonAccess().getFeaturesPointParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_rulePolygon1689);
            lv_features_4_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolygonRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_4_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:2: ( (lv_features_5_0= rulePolygonFeature ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37||(LA12_0>=39 && LA12_0<=40)||LA12_0==42||LA12_0==44||(LA12_0>=49 && LA12_0<=50)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:1: (lv_features_5_0= rulePolygonFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:1: (lv_features_5_0= rulePolygonFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:3: lv_features_5_0= rulePolygonFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolygonAccess().getFeaturesPolygonFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePolygonFeature_in_rulePolygon1710);
            	    lv_features_5_0=rulePolygonFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolygonRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"PolygonFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_rulePolygon1723); 

                	newLeafNode(otherlv_6, grammarAccess.getPolygonAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolygon"


    // $ANTLR start "entryRulePolygonFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:837:1: entryRulePolygonFeature returns [EObject current=null] : iv_rulePolygonFeature= rulePolygonFeature EOF ;
    public final EObject entryRulePolygonFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolygonFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:2: (iv_rulePolygonFeature= rulePolygonFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:2: iv_rulePolygonFeature= rulePolygonFeature EOF
            {
             newCompositeNode(grammarAccess.getPolygonFeatureRule()); 
            pushFollow(FOLLOW_rulePolygonFeature_in_entryRulePolygonFeature1759);
            iv_rulePolygonFeature=rulePolygonFeature();

            state._fsp--;

             current =iv_rulePolygonFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolygonFeature1769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolygonFeature"


    // $ANTLR start "rulePolygonFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:846:1: rulePolygonFeature returns [EObject current=null] : (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_LineStyle_3= ruleLineStyle | this_LineWidth_4= ruleLineWidth ) ;
    public final EObject rulePolygonFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Position_0 = null;

        EObject this_Size_1 = null;

        EObject this_ColorFeature_2 = null;

        EObject this_LineStyle_3 = null;

        EObject this_LineWidth_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:28: ( (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_LineStyle_3= ruleLineStyle | this_LineWidth_4= ruleLineWidth ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:1: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_LineStyle_3= ruleLineStyle | this_LineWidth_4= ruleLineWidth )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:1: (this_Position_0= rulePosition | this_Size_1= ruleSize | this_ColorFeature_2= ruleColorFeature | this_LineStyle_3= ruleLineStyle | this_LineWidth_4= ruleLineWidth )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 37:
            case 39:
            case 40:
                {
                alt13=3;
                }
                break;
            case 49:
                {
                alt13=4;
                }
                break;
            case 50:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:5: this_Position_0= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getPolygonFeatureAccess().getPositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_rulePolygonFeature1816);
                    this_Position_0=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:861:5: this_Size_1= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getPolygonFeatureAccess().getSizeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_rulePolygonFeature1843);
                    this_Size_1=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:5: this_ColorFeature_2= ruleColorFeature
                    {
                     
                            newCompositeNode(grammarAccess.getPolygonFeatureAccess().getColorFeatureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleColorFeature_in_rulePolygonFeature1870);
                    this_ColorFeature_2=ruleColorFeature();

                    state._fsp--;

                     
                            current = this_ColorFeature_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:5: this_LineStyle_3= ruleLineStyle
                    {
                     
                            newCompositeNode(grammarAccess.getPolygonFeatureAccess().getLineStyleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLineStyle_in_rulePolygonFeature1897);
                    this_LineStyle_3=ruleLineStyle();

                    state._fsp--;

                     
                            current = this_LineStyle_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:5: this_LineWidth_4= ruleLineWidth
                    {
                     
                            newCompositeNode(grammarAccess.getPolygonFeatureAccess().getLineWidthParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLineWidth_in_rulePolygonFeature1924);
                    this_LineWidth_4=ruleLineWidth();

                    state._fsp--;

                     
                            current = this_LineWidth_4; 
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
    // $ANTLR end "rulePolygonFeature"


    // $ANTLR start "entryRuleAtributeExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:907:1: entryRuleAtributeExpression returns [EObject current=null] : iv_ruleAtributeExpression= ruleAtributeExpression EOF ;
    public final EObject entryRuleAtributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributeExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:908:2: (iv_ruleAtributeExpression= ruleAtributeExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:2: iv_ruleAtributeExpression= ruleAtributeExpression EOF
            {
             newCompositeNode(grammarAccess.getAtributeExpressionRule()); 
            pushFollow(FOLLOW_ruleAtributeExpression_in_entryRuleAtributeExpression1959);
            iv_ruleAtributeExpression=ruleAtributeExpression();

            state._fsp--;

             current =iv_ruleAtributeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributeExpression1969); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:1: ruleAtributeExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_key_1_0= RULE_ID ) ) ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' ) ) ) ( (lv_value_3_0= ruleAtributeValue ) ) otherlv_4= '->' otherlv_5= ')' ) ;
    public final EObject ruleAtributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:28: ( (otherlv_0= '(' ( (lv_key_1_0= RULE_ID ) ) ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' ) ) ) ( (lv_value_3_0= ruleAtributeValue ) ) otherlv_4= '->' otherlv_5= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:920:1: (otherlv_0= '(' ( (lv_key_1_0= RULE_ID ) ) ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' ) ) ) ( (lv_value_3_0= ruleAtributeValue ) ) otherlv_4= '->' otherlv_5= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:920:1: (otherlv_0= '(' ( (lv_key_1_0= RULE_ID ) ) ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' ) ) ) ( (lv_value_3_0= ruleAtributeValue ) ) otherlv_4= '->' otherlv_5= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:920:3: otherlv_0= '(' ( (lv_key_1_0= RULE_ID ) ) ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' ) ) ) ( (lv_value_3_0= ruleAtributeValue ) ) otherlv_4= '->' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleAtributeExpression2006); 

                	newLeafNode(otherlv_0, grammarAccess.getAtributeExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:1: ( (lv_key_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:925:1: (lv_key_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:925:1: (lv_key_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:926:3: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributeExpression2023); 

            			newLeafNode(lv_key_1_0, grammarAccess.getAtributeExpressionAccess().getKeyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtributeExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:2: ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:943:1: ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:943:1: ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:1: (lv_operator_2_1= '=' | lv_operator_2_2= '<>' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:1: (lv_operator_2_1= '=' | lv_operator_2_2= '<>' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:945:3: lv_operator_2_1= '='
                    {
                    lv_operator_2_1=(Token)match(input,26,FOLLOW_26_in_ruleAtributeExpression2048); 

                            newLeafNode(lv_operator_2_1, grammarAccess.getAtributeExpressionAccess().getOperatorEqualsSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:8: lv_operator_2_2= '<>'
                    {
                    lv_operator_2_2=(Token)match(input,27,FOLLOW_27_in_ruleAtributeExpression2077); 

                            newLeafNode(lv_operator_2_2, grammarAccess.getAtributeExpressionAccess().getOperatorLessThanSignGreaterThanSignKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributeExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:2: ( (lv_value_3_0= ruleAtributeValue ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:973:1: (lv_value_3_0= ruleAtributeValue )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:973:1: (lv_value_3_0= ruleAtributeValue )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:974:3: lv_value_3_0= ruleAtributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAtributeExpressionAccess().getValueAtributeValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAtributeValue_in_ruleAtributeExpression2114);
            lv_value_3_0=ruleAtributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtributeExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"AtributeValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAtributeExpression2126); 

                	newLeafNode(otherlv_4, grammarAccess.getAtributeExpressionAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleAtributeExpression2138); 

                	newLeafNode(otherlv_5, grammarAccess.getAtributeExpressionAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:1: entryRuleAtributeValue returns [EObject current=null] : iv_ruleAtributeValue= ruleAtributeValue EOF ;
    public final EObject entryRuleAtributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributeValue = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1007:2: (iv_ruleAtributeValue= ruleAtributeValue EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1008:2: iv_ruleAtributeValue= ruleAtributeValue EOF
            {
             newCompositeNode(grammarAccess.getAtributeValueRule()); 
            pushFollow(FOLLOW_ruleAtributeValue_in_entryRuleAtributeValue2174);
            iv_ruleAtributeValue=ruleAtributeValue();

            state._fsp--;

             current =iv_ruleAtributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributeValue2184); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:1: ruleAtributeValue returns [EObject current=null] : ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:28: ( ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:1: ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:1: ( ( (lv_valueINT_0_0= RULE_INT ) ) | ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) ) | ( (lv_valueID_4_0= RULE_ID ) ) | ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) ) | ( (lv_valueSTRING_6_0= RULE_STRING ) ) | ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 28:
                    {
                    alt16=1;
                    }
                    break;
                case 30:
                    {
                    alt16=2;
                    }
                    break;
                case 33:
                    {
                    alt16=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            case 31:
            case 32:
                {
                alt16=4;
                }
                break;
            case RULE_STRING:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:2: ( (lv_valueINT_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:2: ( (lv_valueINT_0_0= RULE_INT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1020:1: (lv_valueINT_0_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1020:1: (lv_valueINT_0_0= RULE_INT )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:3: lv_valueINT_0_0= RULE_INT
                    {
                    lv_valueINT_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue2226); 

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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1038:6: ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1038:6: ( ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1038:7: ( (lv_valueINT_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueDEC_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1038:7: ( (lv_valueINT_1_0= RULE_INT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:1: (lv_valueINT_1_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:1: (lv_valueINT_1_0= RULE_INT )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:3: lv_valueINT_1_0= RULE_INT
                    {
                    lv_valueINT_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue2255); 

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

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleAtributeValue2272); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtributeValueAccess().getFullStopKeyword_1_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1060:1: ( (lv_valueDEC_3_0= RULE_INT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:1: (lv_valueDEC_3_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:1: (lv_valueDEC_3_0= RULE_INT )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:3: lv_valueDEC_3_0= RULE_INT
                    {
                    lv_valueDEC_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue2289); 

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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:6: ( (lv_valueID_4_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:6: ( (lv_valueID_4_0= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:1: (lv_valueID_4_0= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:1: (lv_valueID_4_0= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:3: lv_valueID_4_0= RULE_ID
                    {
                    lv_valueID_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributeValue2318); 

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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:6: ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:6: ( ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1099:1: ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1099:1: ( (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1100:1: (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1100:1: (lv_valueBOOL_5_1= 'true' | lv_valueBOOL_5_2= 'false' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==31) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==32) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1101:3: lv_valueBOOL_5_1= 'true'
                            {
                            lv_valueBOOL_5_1=(Token)match(input,31,FOLLOW_31_in_ruleAtributeValue2349); 

                                    newLeafNode(lv_valueBOOL_5_1, grammarAccess.getAtributeValueAccess().getValueBOOLTrueKeyword_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtributeValueRule());
                            	        }
                                   		setWithLastConsumed(current, "valueBOOL", lv_valueBOOL_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:8: lv_valueBOOL_5_2= 'false'
                            {
                            lv_valueBOOL_5_2=(Token)match(input,32,FOLLOW_32_in_ruleAtributeValue2378); 

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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1129:6: ( (lv_valueSTRING_6_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1129:6: ( (lv_valueSTRING_6_0= RULE_STRING ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1130:1: (lv_valueSTRING_6_0= RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1130:1: (lv_valueSTRING_6_0= RULE_STRING )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:3: lv_valueSTRING_6_0= RULE_STRING
                    {
                    lv_valueSTRING_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributeValue2417); 

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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:6: ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:6: ( ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:7: ( (lv_valueDAY_7_0= RULE_INT ) ) otherlv_8= '-' ( (lv_valueMONTH_9_0= RULE_INT ) ) otherlv_10= '-' ( (lv_valueYEAR_11_0= RULE_INT ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:7: ( (lv_valueDAY_7_0= RULE_INT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:1: (lv_valueDAY_7_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:1: (lv_valueDAY_7_0= RULE_INT )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1150:3: lv_valueDAY_7_0= RULE_INT
                    {
                    lv_valueDAY_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue2446); 

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

                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleAtributeValue2463); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtributeValueAccess().getHyphenMinusKeyword_5_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:1: ( (lv_valueMONTH_9_0= RULE_INT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:1: (lv_valueMONTH_9_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:1: (lv_valueMONTH_9_0= RULE_INT )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1172:3: lv_valueMONTH_9_0= RULE_INT
                    {
                    lv_valueMONTH_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue2480); 

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

                    otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleAtributeValue2497); 

                        	newLeafNode(otherlv_10, grammarAccess.getAtributeValueAccess().getHyphenMinusKeyword_5_3());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:1: ( (lv_valueYEAR_11_0= RULE_INT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1193:1: (lv_valueYEAR_11_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1193:1: (lv_valueYEAR_11_0= RULE_INT )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1194:3: lv_valueYEAR_11_0= RULE_INT
                    {
                    lv_valueYEAR_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtributeValue2514); 

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


    // $ANTLR start "entryRuleLabel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1222:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1223:2: (iv_ruleLabel= ruleLabel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1224:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2560);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2570); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:1: ruleLabel returns [EObject current=null] : ( () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleLabelFeature ) )* otherlv_5= '}' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_editable_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:28: ( ( () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleLabelFeature ) )* otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:1: ( () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleLabelFeature ) )* otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:1: ( () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleLabelFeature ) )* otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:2: () otherlv_1= 'label' ( (lv_editable_2_0= 'editable' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleLabelFeature ) )* otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1236:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLabelAccess().getLabelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleLabel2616); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1245:1: ( (lv_editable_2_0= 'editable' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1246:1: (lv_editable_2_0= 'editable' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1246:1: (lv_editable_2_0= 'editable' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1247:3: lv_editable_2_0= 'editable'
                    {
                    lv_editable_2_0=(Token)match(input,35,FOLLOW_35_in_ruleLabel2634); 

                            newLeafNode(lv_editable_2_0, grammarAccess.getLabelAccess().getEditableEditableKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(current, "editable", true, "editable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleLabel2660); 

                	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:1: ( (lv_features_4_0= ruleLabelFeature ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37||LA18_0==39||(LA18_0>=46 && LA18_0<=48)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1265:1: (lv_features_4_0= ruleLabelFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1265:1: (lv_features_4_0= ruleLabelFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1266:3: lv_features_4_0= ruleLabelFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelAccess().getFeaturesLabelFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabelFeature_in_ruleLabel2681);
            	    lv_features_4_0=ruleLabelFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_4_0, 
            	            		"LabelFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleLabel2694); 

                	newLeafNode(otherlv_5, grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:1: entryRuleLabelFeature returns [EObject current=null] : iv_ruleLabelFeature= ruleLabelFeature EOF ;
    public final EObject entryRuleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:2: (iv_ruleLabelFeature= ruleLabelFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1296:2: iv_ruleLabelFeature= ruleLabelFeature EOF
            {
             newCompositeNode(grammarAccess.getLabelFeatureRule()); 
            pushFollow(FOLLOW_ruleLabelFeature_in_entryRuleLabelFeature2730);
            iv_ruleLabelFeature=ruleLabelFeature();

            state._fsp--;

             current =iv_ruleLabelFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelFeature2740); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1303:1: ruleLabelFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground | this_FontFace_2= ruleFontFace | this_FontSize_3= ruleFontSize | this_FontStyle_4= ruleFontStyle ) ;
    public final EObject ruleLabelFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_Background_1 = null;

        EObject this_FontFace_2 = null;

        EObject this_FontSize_3 = null;

        EObject this_FontStyle_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1306:28: ( (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground | this_FontFace_2= ruleFontFace | this_FontSize_3= ruleFontSize | this_FontStyle_4= ruleFontStyle ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground | this_FontFace_2= ruleFontFace | this_FontSize_3= ruleFontSize | this_FontStyle_4= ruleFontStyle )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground | this_FontFace_2= ruleFontFace | this_FontSize_3= ruleFontSize | this_FontStyle_4= ruleFontStyle )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 46:
                {
                alt19=3;
                }
                break;
            case 47:
                {
                alt19=4;
                }
                break;
            case 48:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1308:5: this_Foreground_0= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getForegroundParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleLabelFeature2787);
                    this_Foreground_0=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:5: this_Background_1= ruleBackground
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getBackgroundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBackground_in_ruleLabelFeature2814);
                    this_Background_1=ruleBackground();

                    state._fsp--;

                     
                            current = this_Background_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:5: this_FontFace_2= ruleFontFace
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getFontFaceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFontFace_in_ruleLabelFeature2841);
                    this_FontFace_2=ruleFontFace();

                    state._fsp--;

                     
                            current = this_FontFace_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1338:5: this_FontSize_3= ruleFontSize
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getFontSizeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFontSize_in_ruleLabelFeature2868);
                    this_FontSize_3=ruleFontSize();

                    state._fsp--;

                     
                            current = this_FontSize_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1348:5: this_FontStyle_4= ruleFontStyle
                    {
                     
                            newCompositeNode(grammarAccess.getLabelFeatureAccess().getFontStyleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFontStyle_in_ruleLabelFeature2895);
                    this_FontStyle_4=ruleFontStyle();

                    state._fsp--;

                     
                            current = this_FontStyle_4; 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:2: (iv_ruleImage= ruleImage EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1366:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage2930);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage2940); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1376:28: ( (otherlv_0= 'image' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:1: (otherlv_0= 'image' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:1: (otherlv_0= 'image' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:3: otherlv_0= 'image' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleImageFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImage2977); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1381:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1382:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1382:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1383:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImage2997); 

            		newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageImageFileCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleImage3009); 

                	newLeafNode(otherlv_2, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1398:1: ( (lv_features_3_0= ruleImageFeature ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=41 && LA20_0<=42)||LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1399:1: (lv_features_3_0= ruleImageFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1399:1: (lv_features_3_0= ruleImageFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:3: lv_features_3_0= ruleImageFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getFeaturesImageFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImageFeature_in_ruleImage3030);
            	    lv_features_3_0=ruleImageFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"ImageFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleImage3043); 

                	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1428:1: entryRuleImageFeature returns [EObject current=null] : iv_ruleImageFeature= ruleImageFeature EOF ;
    public final EObject entryRuleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1429:2: (iv_ruleImageFeature= ruleImageFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1430:2: iv_ruleImageFeature= ruleImageFeature EOF
            {
             newCompositeNode(grammarAccess.getImageFeatureRule()); 
            pushFollow(FOLLOW_ruleImageFeature_in_entryRuleImageFeature3079);
            iv_ruleImageFeature=ruleImageFeature();

            state._fsp--;

             current =iv_ruleImageFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageFeature3089); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:1: ruleImageFeature returns [EObject current=null] : (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) ;
    public final EObject ruleImageFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Size_0 = null;

        EObject this_Position_1 = null;

        EObject this_Transparency_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1440:28: ( (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1441:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1441:1: (this_Size_0= ruleSize | this_Position_1= rulePosition | this_Transparency_2= ruleTransparency )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt21=1;
                }
                break;
            case 44:
                {
                alt21=2;
                }
                break;
            case 41:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:5: this_Size_0= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getImageFeatureAccess().getSizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleImageFeature3136);
                    this_Size_0=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1452:5: this_Position_1= rulePosition
                    {
                     
                            newCompositeNode(grammarAccess.getImageFeatureAccess().getPositionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleImageFeature3163);
                    this_Position_1=rulePosition();

                    state._fsp--;

                     
                            current = this_Position_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1462:5: this_Transparency_2= ruleTransparency
                    {
                     
                            newCompositeNode(grammarAccess.getImageFeatureAccess().getTransparencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTransparency_in_ruleImageFeature3190);
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


    // $ANTLR start "entryRuleLinkElement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1478:1: entryRuleLinkElement returns [EObject current=null] : iv_ruleLinkElement= ruleLinkElement EOF ;
    public final EObject entryRuleLinkElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkElement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1479:2: (iv_ruleLinkElement= ruleLinkElement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1480:2: iv_ruleLinkElement= ruleLinkElement EOF
            {
             newCompositeNode(grammarAccess.getLinkElementRule()); 
            pushFollow(FOLLOW_ruleLinkElement_in_entryRuleLinkElement3225);
            iv_ruleLinkElement=ruleLinkElement();

            state._fsp--;

             current =iv_ruleLinkElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkElement3235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkElement"


    // $ANTLR start "ruleLinkElement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1487:1: ruleLinkElement returns [EObject current=null] : (otherlv_0= 'line' ( (lv_lineType_1_0= ruleLineType ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleLinkElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lineType_1_0 = null;

        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1490:28: ( (otherlv_0= 'line' ( (lv_lineType_1_0= ruleLineType ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkFeature ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:1: (otherlv_0= 'line' ( (lv_lineType_1_0= ruleLineType ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkFeature ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:1: (otherlv_0= 'line' ( (lv_lineType_1_0= ruleLineType ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkFeature ) )* otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:3: otherlv_0= 'line' ( (lv_lineType_1_0= ruleLineType ) ) otherlv_2= '{' ( (lv_features_3_0= ruleLinkFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleLinkElement3272); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkElementAccess().getLineKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:1: ( (lv_lineType_1_0= ruleLineType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:1: (lv_lineType_1_0= ruleLineType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:1: (lv_lineType_1_0= ruleLineType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1497:3: lv_lineType_1_0= ruleLineType
            {
             
            	        newCompositeNode(grammarAccess.getLinkElementAccess().getLineTypeLineTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLineType_in_ruleLinkElement3293);
            lv_lineType_1_0=ruleLineType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkElementRule());
            	        }
                   		set(
                   			current, 
                   			"lineType",
                    		lv_lineType_1_0, 
                    		"LineType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleLinkElement3305); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1517:1: ( (lv_features_3_0= ruleLinkFeature ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37||(LA22_0>=49 && LA22_0<=50)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:1: (lv_features_3_0= ruleLinkFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:1: (lv_features_3_0= ruleLinkFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:3: lv_features_3_0= ruleLinkFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkElementAccess().getFeaturesLinkFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkFeature_in_ruleLinkElement3326);
            	    lv_features_3_0=ruleLinkFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"LinkFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleLinkElement3339); 

                	newLeafNode(otherlv_4, grammarAccess.getLinkElementAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkElement"


    // $ANTLR start "entryRuleLinkFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1547:1: entryRuleLinkFeature returns [EObject current=null] : iv_ruleLinkFeature= ruleLinkFeature EOF ;
    public final EObject entryRuleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1548:2: (iv_ruleLinkFeature= ruleLinkFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1549:2: iv_ruleLinkFeature= ruleLinkFeature EOF
            {
             newCompositeNode(grammarAccess.getLinkFeatureRule()); 
            pushFollow(FOLLOW_ruleLinkFeature_in_entryRuleLinkFeature3375);
            iv_ruleLinkFeature=ruleLinkFeature();

            state._fsp--;

             current =iv_ruleLinkFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkFeature3385); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:1: ruleLinkFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) ;
    public final EObject ruleLinkFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_LineStyle_1 = null;

        EObject this_LineWidth_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1559:28: ( (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1560:1: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1560:1: (this_Foreground_0= ruleForeground | this_LineStyle_1= ruleLineStyle | this_LineWidth_2= ruleLineWidth )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt23=1;
                }
                break;
            case 49:
                {
                alt23=2;
                }
                break;
            case 50:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1561:5: this_Foreground_0= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getLinkFeatureAccess().getForegroundParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleLinkFeature3432);
                    this_Foreground_0=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:5: this_LineStyle_1= ruleLineStyle
                    {
                     
                            newCompositeNode(grammarAccess.getLinkFeatureAccess().getLineStyleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleLinkFeature3459);
                    this_LineStyle_1=ruleLineStyle();

                    state._fsp--;

                     
                            current = this_LineStyle_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1581:5: this_LineWidth_2= ruleLineWidth
                    {
                     
                            newCompositeNode(grammarAccess.getLinkFeatureAccess().getLineWidthParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLineWidth_in_ruleLinkFeature3486);
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


    // $ANTLR start "entryRuleColorFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1597:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1599:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature3521);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature3531); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1606:1: ruleColorFeature returns [EObject current=null] : (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground | this_Border_2= ruleBorder ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Foreground_0 = null;

        EObject this_Background_1 = null;

        EObject this_Border_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:28: ( (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground | this_Border_2= ruleBorder ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1610:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground | this_Border_2= ruleBorder )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1610:1: (this_Foreground_0= ruleForeground | this_Background_1= ruleBackground | this_Border_2= ruleBorder )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt24=1;
                }
                break;
            case 39:
                {
                alt24=2;
                }
                break;
            case 40:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1611:5: this_Foreground_0= ruleForeground
                    {
                     
                            newCompositeNode(grammarAccess.getColorFeatureAccess().getForegroundParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForeground_in_ruleColorFeature3578);
                    this_Foreground_0=ruleForeground();

                    state._fsp--;

                     
                            current = this_Foreground_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:5: this_Background_1= ruleBackground
                    {
                     
                            newCompositeNode(grammarAccess.getColorFeatureAccess().getBackgroundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBackground_in_ruleColorFeature3605);
                    this_Background_1=ruleBackground();

                    state._fsp--;

                     
                            current = this_Background_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:5: this_Border_2= ruleBorder
                    {
                     
                            newCompositeNode(grammarAccess.getColorFeatureAccess().getBorderParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBorder_in_ruleColorFeature3632);
                    this_Border_2=ruleBorder();

                    state._fsp--;

                     
                            current = this_Border_2; 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1647:1: entryRuleForeground returns [EObject current=null] : iv_ruleForeground= ruleForeground EOF ;
    public final EObject entryRuleForeground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeground = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1648:2: (iv_ruleForeground= ruleForeground EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1649:2: iv_ruleForeground= ruleForeground EOF
            {
             newCompositeNode(grammarAccess.getForegroundRule()); 
            pushFollow(FOLLOW_ruleForeground_in_entryRuleForeground3667);
            iv_ruleForeground=ruleForeground();

            state._fsp--;

             current =iv_ruleForeground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeground3677); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1656:1: ruleForeground returns [EObject current=null] : (otherlv_0= 'foreground' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) ;
    public final EObject ruleForeground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_color_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1659:28: ( (otherlv_0= 'foreground' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1660:1: (otherlv_0= 'foreground' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1660:1: (otherlv_0= 'foreground' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1660:3: otherlv_0= 'foreground' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleForeground3714); 

                	newLeafNode(otherlv_0, grammarAccess.getForegroundAccess().getForegroundKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleForeground3726); 

                	newLeafNode(otherlv_1, grammarAccess.getForegroundAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:1: ( (lv_color_2_0= ruleColor ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:1: (lv_color_2_0= ruleColor )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:1: (lv_color_2_0= ruleColor )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1670:3: lv_color_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getForegroundAccess().getColorColorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleForeground3747);
            lv_color_2_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForegroundRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_2_0, 
                    		"Color");
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
    // $ANTLR end "ruleForeground"


    // $ANTLR start "entryRuleBackground"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1694:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1695:2: (iv_ruleBackground= ruleBackground EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1696:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground3783);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground3793); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1703:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'background' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_color_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1706:28: ( (otherlv_0= 'background' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1707:1: (otherlv_0= 'background' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1707:1: (otherlv_0= 'background' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1707:3: otherlv_0= 'background' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleBackground3830); 

                	newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleBackground3842); 

                	newLeafNode(otherlv_1, grammarAccess.getBackgroundAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1715:1: ( (lv_color_2_0= ruleColor ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1716:1: (lv_color_2_0= ruleColor )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1716:1: (lv_color_2_0= ruleColor )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1717:3: lv_color_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getBackgroundAccess().getColorColorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleBackground3863);
            lv_color_2_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_2_0, 
                    		"Color");
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleBorder"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:1: entryRuleBorder returns [EObject current=null] : iv_ruleBorder= ruleBorder EOF ;
    public final EObject entryRuleBorder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorder = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1742:2: (iv_ruleBorder= ruleBorder EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1743:2: iv_ruleBorder= ruleBorder EOF
            {
             newCompositeNode(grammarAccess.getBorderRule()); 
            pushFollow(FOLLOW_ruleBorder_in_entryRuleBorder3899);
            iv_ruleBorder=ruleBorder();

            state._fsp--;

             current =iv_ruleBorder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorder3909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBorder"


    // $ANTLR start "ruleBorder"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1750:1: ruleBorder returns [EObject current=null] : (otherlv_0= 'border' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) ;
    public final EObject ruleBorder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_color_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1753:28: ( (otherlv_0= 'border' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1754:1: (otherlv_0= 'border' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1754:1: (otherlv_0= 'border' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1754:3: otherlv_0= 'border' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleBorder3946); 

                	newLeafNode(otherlv_0, grammarAccess.getBorderAccess().getBorderKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleBorder3958); 

                	newLeafNode(otherlv_1, grammarAccess.getBorderAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1762:1: ( (lv_color_2_0= ruleColor ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1763:1: (lv_color_2_0= ruleColor )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1763:1: (lv_color_2_0= ruleColor )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1764:3: lv_color_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getBorderAccess().getColorColorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleBorder3979);
            lv_color_2_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBorderRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_2_0, 
                    		"Color");
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
    // $ANTLR end "ruleBorder"


    // $ANTLR start "entryRuleTransparency"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1788:1: entryRuleTransparency returns [EObject current=null] : iv_ruleTransparency= ruleTransparency EOF ;
    public final EObject entryRuleTransparency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransparency = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:2: (iv_ruleTransparency= ruleTransparency EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1790:2: iv_ruleTransparency= ruleTransparency EOF
            {
             newCompositeNode(grammarAccess.getTransparencyRule()); 
            pushFollow(FOLLOW_ruleTransparency_in_entryRuleTransparency4015);
            iv_ruleTransparency=ruleTransparency();

            state._fsp--;

             current =iv_ruleTransparency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransparency4025); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1797:1: ruleTransparency returns [EObject current=null] : (otherlv_0= 'transparency' otherlv_1= ':' ( (lv_percent_2_0= RULE_PERCENT ) ) ) ;
    public final EObject ruleTransparency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_percent_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1800:28: ( (otherlv_0= 'transparency' otherlv_1= ':' ( (lv_percent_2_0= RULE_PERCENT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1801:1: (otherlv_0= 'transparency' otherlv_1= ':' ( (lv_percent_2_0= RULE_PERCENT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1801:1: (otherlv_0= 'transparency' otherlv_1= ':' ( (lv_percent_2_0= RULE_PERCENT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1801:3: otherlv_0= 'transparency' otherlv_1= ':' ( (lv_percent_2_0= RULE_PERCENT ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleTransparency4062); 

                	newLeafNode(otherlv_0, grammarAccess.getTransparencyAccess().getTransparencyKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleTransparency4074); 

                	newLeafNode(otherlv_1, grammarAccess.getTransparencyAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1809:1: ( (lv_percent_2_0= RULE_PERCENT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:1: (lv_percent_2_0= RULE_PERCENT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:1: (lv_percent_2_0= RULE_PERCENT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:3: lv_percent_2_0= RULE_PERCENT
            {
            lv_percent_2_0=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleTransparency4091); 

            			newLeafNode(lv_percent_2_0, grammarAccess.getTransparencyAccess().getPercentPERCENTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransparencyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"percent",
                    		lv_percent_2_0, 
                    		"PERCENT");
            	    

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
    // $ANTLR end "ruleTransparency"


    // $ANTLR start "entryRuleSize"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1835:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1836:2: (iv_ruleSize= ruleSize EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1837:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize4132);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize4142); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1844:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_width_2_0=null;
        Token otherlv_3=null;
        Token lv_height_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1847:28: ( (otherlv_0= 'size' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1848:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1848:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1848:3: otherlv_0= 'size' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleSize4179); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleSize4191); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1856:1: ( (lv_width_2_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1857:1: (lv_width_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1857:1: (lv_width_2_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1858:3: lv_width_2_0= RULE_INT
            {
            lv_width_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize4208); 

            			newLeafNode(lv_width_2_0, grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSize4225); 

                	newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1878:1: ( (lv_height_4_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1879:1: (lv_height_4_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1879:1: (lv_height_4_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1880:3: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize4242); 

            			newLeafNode(lv_height_4_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_4_0, 
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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRulePoint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1905:2: (iv_rulePoint= rulePoint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1906:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint4283);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint4293); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1913:1: rulePoint returns [EObject current=null] : (otherlv_0= 'point' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1916:28: ( (otherlv_0= 'point' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1917:1: (otherlv_0= 'point' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1917:1: (otherlv_0= 'point' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1917:3: otherlv_0= 'point' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_rulePoint4330); 

                	newLeafNode(otherlv_0, grammarAccess.getPointAccess().getPointKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_rulePoint4342); 

                	newLeafNode(otherlv_1, grammarAccess.getPointAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1925:1: ( (lv_x_2_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: (lv_x_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: (lv_x_2_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:3: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint4359); 

            			newLeafNode(lv_x_2_0, grammarAccess.getPointAccess().getXINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulePoint4376); 

                	newLeafNode(otherlv_3, grammarAccess.getPointAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1947:1: ( (lv_y_4_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1948:1: (lv_y_4_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1948:1: (lv_y_4_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1949:3: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint4393); 

            			newLeafNode(lv_y_4_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_4_0, 
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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRulePosition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1973:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1974:2: (iv_rulePosition= rulePosition EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_rulePosition_in_entryRulePosition4434);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosition4444); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1985:28: ( (otherlv_0= 'position' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1986:1: (otherlv_0= 'position' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1986:1: (otherlv_0= 'position' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1986:3: otherlv_0= 'position' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_rulePosition4481); 

                	newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_rulePosition4493); 

                	newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1994:1: ( (lv_x_2_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1995:1: (lv_x_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1995:1: (lv_x_2_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1996:3: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePosition4510); 

            			newLeafNode(lv_x_2_0, grammarAccess.getPositionAccess().getXINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulePosition4527); 

                	newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:1: ( (lv_y_4_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2017:1: (lv_y_4_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2017:1: (lv_y_4_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2018:3: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePosition4544); 

            			newLeafNode(lv_y_4_0, grammarAccess.getPositionAccess().getYINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_4_0, 
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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleCorner"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2042:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2043:2: (iv_ruleCorner= ruleCorner EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2044:2: iv_ruleCorner= ruleCorner EOF
            {
             newCompositeNode(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner4585);
            iv_ruleCorner=ruleCorner();

            state._fsp--;

             current =iv_ruleCorner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner4595); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2051:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'corner' otherlv_1= ':' ( (lv_angle_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_angle_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2054:28: ( (otherlv_0= 'corner' otherlv_1= ':' ( (lv_angle_2_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2055:1: (otherlv_0= 'corner' otherlv_1= ':' ( (lv_angle_2_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2055:1: (otherlv_0= 'corner' otherlv_1= ':' ( (lv_angle_2_0= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2055:3: otherlv_0= 'corner' otherlv_1= ':' ( (lv_angle_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleCorner4632); 

                	newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleCorner4644); 

                	newLeafNode(otherlv_1, grammarAccess.getCornerAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:1: ( (lv_angle_2_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2064:1: (lv_angle_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2064:1: (lv_angle_2_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2065:3: lv_angle_2_0= RULE_INT
            {
            lv_angle_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCorner4661); 

            			newLeafNode(lv_angle_2_0, grammarAccess.getCornerAccess().getAngleINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCornerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"angle",
                    		lv_angle_2_0, 
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
    // $ANTLR end "ruleCorner"


    // $ANTLR start "entryRuleFontFace"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2089:1: entryRuleFontFace returns [EObject current=null] : iv_ruleFontFace= ruleFontFace EOF ;
    public final EObject entryRuleFontFace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontFace = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2090:2: (iv_ruleFontFace= ruleFontFace EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2091:2: iv_ruleFontFace= ruleFontFace EOF
            {
             newCompositeNode(grammarAccess.getFontFaceRule()); 
            pushFollow(FOLLOW_ruleFontFace_in_entryRuleFontFace4702);
            iv_ruleFontFace=ruleFontFace();

            state._fsp--;

             current =iv_ruleFontFace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontFace4712); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2098:1: ruleFontFace returns [EObject current=null] : (otherlv_0= 'font-face' otherlv_1= ':' ( (lv_face_2_0= ruleFontFaceType ) ) ) ;
    public final EObject ruleFontFace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_face_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2101:28: ( (otherlv_0= 'font-face' otherlv_1= ':' ( (lv_face_2_0= ruleFontFaceType ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:1: (otherlv_0= 'font-face' otherlv_1= ':' ( (lv_face_2_0= ruleFontFaceType ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:1: (otherlv_0= 'font-face' otherlv_1= ':' ( (lv_face_2_0= ruleFontFaceType ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:3: otherlv_0= 'font-face' otherlv_1= ':' ( (lv_face_2_0= ruleFontFaceType ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleFontFace4749); 

                	newLeafNode(otherlv_0, grammarAccess.getFontFaceAccess().getFontFaceKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleFontFace4761); 

                	newLeafNode(otherlv_1, grammarAccess.getFontFaceAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2110:1: ( (lv_face_2_0= ruleFontFaceType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2111:1: (lv_face_2_0= ruleFontFaceType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2111:1: (lv_face_2_0= ruleFontFaceType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2112:3: lv_face_2_0= ruleFontFaceType
            {
             
            	        newCompositeNode(grammarAccess.getFontFaceAccess().getFaceFontFaceTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFontFaceType_in_ruleFontFace4782);
            lv_face_2_0=ruleFontFaceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFontFaceRule());
            	        }
                   		set(
                   			current, 
                   			"face",
                    		lv_face_2_0, 
                    		"FontFaceType");
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
    // $ANTLR end "ruleFontFace"


    // $ANTLR start "entryRuleFontSize"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2136:1: entryRuleFontSize returns [EObject current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final EObject entryRuleFontSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSize = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2137:2: (iv_ruleFontSize= ruleFontSize EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2138:2: iv_ruleFontSize= ruleFontSize EOF
            {
             newCompositeNode(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_ruleFontSize_in_entryRuleFontSize4818);
            iv_ruleFontSize=ruleFontSize();

            state._fsp--;

             current =iv_ruleFontSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontSize4828); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2145:1: ruleFontSize returns [EObject current=null] : (otherlv_0= 'font-size' otherlv_1= ':' ( (lv_size_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFontSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_size_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2148:28: ( (otherlv_0= 'font-size' otherlv_1= ':' ( (lv_size_2_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:1: (otherlv_0= 'font-size' otherlv_1= ':' ( (lv_size_2_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:1: (otherlv_0= 'font-size' otherlv_1= ':' ( (lv_size_2_0= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:3: otherlv_0= 'font-size' otherlv_1= ':' ( (lv_size_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleFontSize4865); 

                	newLeafNode(otherlv_0, grammarAccess.getFontSizeAccess().getFontSizeKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleFontSize4877); 

                	newLeafNode(otherlv_1, grammarAccess.getFontSizeAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2157:1: ( (lv_size_2_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2158:1: (lv_size_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2158:1: (lv_size_2_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2159:3: lv_size_2_0= RULE_INT
            {
            lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFontSize4894); 

            			newLeafNode(lv_size_2_0, grammarAccess.getFontSizeAccess().getSizeINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFontSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"size",
                    		lv_size_2_0, 
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
    // $ANTLR end "ruleFontSize"


    // $ANTLR start "entryRuleFontStyle"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:1: entryRuleFontStyle returns [EObject current=null] : iv_ruleFontStyle= ruleFontStyle EOF ;
    public final EObject entryRuleFontStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontStyle = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2184:2: (iv_ruleFontStyle= ruleFontStyle EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:2: iv_ruleFontStyle= ruleFontStyle EOF
            {
             newCompositeNode(grammarAccess.getFontStyleRule()); 
            pushFollow(FOLLOW_ruleFontStyle_in_entryRuleFontStyle4935);
            iv_ruleFontStyle=ruleFontStyle();

            state._fsp--;

             current =iv_ruleFontStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontStyle4945); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2192:1: ruleFontStyle returns [EObject current=null] : (otherlv_0= 'font-style' otherlv_1= ':' ( (lv_styles_2_0= ruleFontStyleType ) ) (otherlv_3= ',' ( (lv_styles_4_0= ruleFontStyleType ) ) )* ) ;
    public final EObject ruleFontStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_styles_2_0 = null;

        Enumerator lv_styles_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2195:28: ( (otherlv_0= 'font-style' otherlv_1= ':' ( (lv_styles_2_0= ruleFontStyleType ) ) (otherlv_3= ',' ( (lv_styles_4_0= ruleFontStyleType ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:1: (otherlv_0= 'font-style' otherlv_1= ':' ( (lv_styles_2_0= ruleFontStyleType ) ) (otherlv_3= ',' ( (lv_styles_4_0= ruleFontStyleType ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:1: (otherlv_0= 'font-style' otherlv_1= ':' ( (lv_styles_2_0= ruleFontStyleType ) ) (otherlv_3= ',' ( (lv_styles_4_0= ruleFontStyleType ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:3: otherlv_0= 'font-style' otherlv_1= ':' ( (lv_styles_2_0= ruleFontStyleType ) ) (otherlv_3= ',' ( (lv_styles_4_0= ruleFontStyleType ) ) )*
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleFontStyle4982); 

                	newLeafNode(otherlv_0, grammarAccess.getFontStyleAccess().getFontStyleKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleFontStyle4994); 

                	newLeafNode(otherlv_1, grammarAccess.getFontStyleAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2204:1: ( (lv_styles_2_0= ruleFontStyleType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2205:1: (lv_styles_2_0= ruleFontStyleType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2205:1: (lv_styles_2_0= ruleFontStyleType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2206:3: lv_styles_2_0= ruleFontStyleType
            {
             
            	        newCompositeNode(grammarAccess.getFontStyleAccess().getStylesFontStyleTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFontStyleType_in_ruleFontStyle5015);
            lv_styles_2_0=ruleFontStyleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFontStyleRule());
            	        }
                   		add(
                   			current, 
                   			"styles",
                    		lv_styles_2_0, 
                    		"FontStyleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2222:2: (otherlv_3= ',' ( (lv_styles_4_0= ruleFontStyleType ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==12) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2222:4: otherlv_3= ',' ( (lv_styles_4_0= ruleFontStyleType ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFontStyle5028); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFontStyleAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2226:1: ( (lv_styles_4_0= ruleFontStyleType ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2227:1: (lv_styles_4_0= ruleFontStyleType )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2227:1: (lv_styles_4_0= ruleFontStyleType )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2228:3: lv_styles_4_0= ruleFontStyleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFontStyleAccess().getStylesFontStyleTypeEnumRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFontStyleType_in_ruleFontStyle5049);
            	    lv_styles_4_0=ruleFontStyleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFontStyleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"styles",
            	            		lv_styles_4_0, 
            	            		"FontStyleType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleFontStyle"


    // $ANTLR start "entryRuleLineStyle"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2252:1: entryRuleLineStyle returns [EObject current=null] : iv_ruleLineStyle= ruleLineStyle EOF ;
    public final EObject entryRuleLineStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineStyle = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2253:2: (iv_ruleLineStyle= ruleLineStyle EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2254:2: iv_ruleLineStyle= ruleLineStyle EOF
            {
             newCompositeNode(grammarAccess.getLineStyleRule()); 
            pushFollow(FOLLOW_ruleLineStyle_in_entryRuleLineStyle5087);
            iv_ruleLineStyle=ruleLineStyle();

            state._fsp--;

             current =iv_ruleLineStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineStyle5097); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2261:1: ruleLineStyle returns [EObject current=null] : (otherlv_0= 'line-style' otherlv_1= ':' ( (lv_style_2_0= ruleLineType ) ) ) ;
    public final EObject ruleLineStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_style_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2264:28: ( (otherlv_0= 'line-style' otherlv_1= ':' ( (lv_style_2_0= ruleLineType ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2265:1: (otherlv_0= 'line-style' otherlv_1= ':' ( (lv_style_2_0= ruleLineType ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2265:1: (otherlv_0= 'line-style' otherlv_1= ':' ( (lv_style_2_0= ruleLineType ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2265:3: otherlv_0= 'line-style' otherlv_1= ':' ( (lv_style_2_0= ruleLineType ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleLineStyle5134); 

                	newLeafNode(otherlv_0, grammarAccess.getLineStyleAccess().getLineStyleKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleLineStyle5146); 

                	newLeafNode(otherlv_1, grammarAccess.getLineStyleAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2273:1: ( (lv_style_2_0= ruleLineType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2274:1: (lv_style_2_0= ruleLineType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2274:1: (lv_style_2_0= ruleLineType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2275:3: lv_style_2_0= ruleLineType
            {
             
            	        newCompositeNode(grammarAccess.getLineStyleAccess().getStyleLineTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLineType_in_ruleLineStyle5167);
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


            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2299:1: entryRuleLineWidth returns [EObject current=null] : iv_ruleLineWidth= ruleLineWidth EOF ;
    public final EObject entryRuleLineWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineWidth = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2300:2: (iv_ruleLineWidth= ruleLineWidth EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2301:2: iv_ruleLineWidth= ruleLineWidth EOF
            {
             newCompositeNode(grammarAccess.getLineWidthRule()); 
            pushFollow(FOLLOW_ruleLineWidth_in_entryRuleLineWidth5203);
            iv_ruleLineWidth=ruleLineWidth();

            state._fsp--;

             current =iv_ruleLineWidth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineWidth5213); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2308:1: ruleLineWidth returns [EObject current=null] : (otherlv_0= 'line-width' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) ) ) ;
    public final EObject ruleLineWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_width_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2311:28: ( (otherlv_0= 'line-width' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2312:1: (otherlv_0= 'line-width' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2312:1: (otherlv_0= 'line-width' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2312:3: otherlv_0= 'line-width' otherlv_1= ':' ( (lv_width_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleLineWidth5250); 

                	newLeafNode(otherlv_0, grammarAccess.getLineWidthAccess().getLineWidthKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleLineWidth5262); 

                	newLeafNode(otherlv_1, grammarAccess.getLineWidthAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2320:1: ( (lv_width_2_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2321:1: (lv_width_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2321:1: (lv_width_2_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2322:3: lv_width_2_0= RULE_INT
            {
            lv_width_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLineWidth5279); 

            			newLeafNode(lv_width_2_0, grammarAccess.getLineWidthAccess().getWidthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLineWidthRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_2_0, 
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
    // $ANTLR end "ruleLineWidth"


    // $ANTLR start "ruleDefaultColor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2346:1: ruleDefaultColor returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'yellow' ) ) ;
    public final Enumerator ruleDefaultColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2348:28: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'yellow' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2349:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'yellow' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2349:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'yellow' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt26=1;
                }
                break;
            case 52:
                {
                alt26=2;
                }
                break;
            case 53:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2349:2: (enumLiteral_0= 'red' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2349:2: (enumLiteral_0= 'red' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2349:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleDefaultColor5334); 

                            current = grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDefaultColorAccess().getREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2355:6: (enumLiteral_1= 'blue' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2355:6: (enumLiteral_1= 'blue' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2355:8: enumLiteral_1= 'blue'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleDefaultColor5351); 

                            current = grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDefaultColorAccess().getBLUEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2361:6: (enumLiteral_2= 'yellow' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2361:6: (enumLiteral_2= 'yellow' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2361:8: enumLiteral_2= 'yellow'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleDefaultColor5368); 

                            current = grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDefaultColorAccess().getYELLOWEnumLiteralDeclaration_2()); 
                        

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


    // $ANTLR start "ruleFontFaceType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2371:1: ruleFontFaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'arial' ) | (enumLiteral_1= 'verdana' ) | (enumLiteral_2= 'times' ) | (enumLiteral_3= 'courier' ) ) ;
    public final Enumerator ruleFontFaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2373:28: ( ( (enumLiteral_0= 'arial' ) | (enumLiteral_1= 'verdana' ) | (enumLiteral_2= 'times' ) | (enumLiteral_3= 'courier' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2374:1: ( (enumLiteral_0= 'arial' ) | (enumLiteral_1= 'verdana' ) | (enumLiteral_2= 'times' ) | (enumLiteral_3= 'courier' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2374:1: ( (enumLiteral_0= 'arial' ) | (enumLiteral_1= 'verdana' ) | (enumLiteral_2= 'times' ) | (enumLiteral_3= 'courier' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt27=1;
                }
                break;
            case 55:
                {
                alt27=2;
                }
                break;
            case 56:
                {
                alt27=3;
                }
                break;
            case 57:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2374:2: (enumLiteral_0= 'arial' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2374:2: (enumLiteral_0= 'arial' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2374:4: enumLiteral_0= 'arial'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleFontFaceType5413); 

                            current = grammarAccess.getFontFaceTypeAccess().getARIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFontFaceTypeAccess().getARIALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2380:6: (enumLiteral_1= 'verdana' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2380:6: (enumLiteral_1= 'verdana' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2380:8: enumLiteral_1= 'verdana'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleFontFaceType5430); 

                            current = grammarAccess.getFontFaceTypeAccess().getVERDANAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFontFaceTypeAccess().getVERDANAEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2386:6: (enumLiteral_2= 'times' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2386:6: (enumLiteral_2= 'times' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2386:8: enumLiteral_2= 'times'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleFontFaceType5447); 

                            current = grammarAccess.getFontFaceTypeAccess().getTIMESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFontFaceTypeAccess().getTIMESEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:6: (enumLiteral_3= 'courier' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:6: (enumLiteral_3= 'courier' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:8: enumLiteral_3= 'courier'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_57_in_ruleFontFaceType5464); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2402:1: ruleFontStyleType returns [Enumerator current=null] : ( (enumLiteral_0= 'italics' ) | (enumLiteral_1= 'bold' ) | (enumLiteral_2= 'underline' ) ) ;
    public final Enumerator ruleFontStyleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2404:28: ( ( (enumLiteral_0= 'italics' ) | (enumLiteral_1= 'bold' ) | (enumLiteral_2= 'underline' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2405:1: ( (enumLiteral_0= 'italics' ) | (enumLiteral_1= 'bold' ) | (enumLiteral_2= 'underline' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2405:1: ( (enumLiteral_0= 'italics' ) | (enumLiteral_1= 'bold' ) | (enumLiteral_2= 'underline' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt28=1;
                }
                break;
            case 59:
                {
                alt28=2;
                }
                break;
            case 60:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2405:2: (enumLiteral_0= 'italics' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2405:2: (enumLiteral_0= 'italics' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2405:4: enumLiteral_0= 'italics'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleFontStyleType5509); 

                            current = grammarAccess.getFontStyleTypeAccess().getITALICSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFontStyleTypeAccess().getITALICSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2411:6: (enumLiteral_1= 'bold' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2411:6: (enumLiteral_1= 'bold' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2411:8: enumLiteral_1= 'bold'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleFontStyleType5526); 

                            current = grammarAccess.getFontStyleTypeAccess().getBOLDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFontStyleTypeAccess().getBOLDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2417:6: (enumLiteral_2= 'underline' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2417:6: (enumLiteral_2= 'underline' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2417:8: enumLiteral_2= 'underline'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleFontStyleType5543); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2427:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2429:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2430:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2430:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==61) ) {
                alt29=1;
            }
            else if ( (LA29_0==62) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2430:2: (enumLiteral_0= 'solid' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2430:2: (enumLiteral_0= 'solid' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2430:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleLineType5588); 

                            current = grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSOLIDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2436:6: (enumLiteral_1= 'dash' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2436:6: (enumLiteral_1= 'dash' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2436:8: enumLiteral_1= 'dash'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_62_in_ruleLineType5605); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomColor_in_ruleModel131 = new BitSet(new long[]{0x0000001401F3A002L});
    public static final BitSet FOLLOW_ruleImageFile_in_ruleModel153 = new BitSet(new long[]{0x0000001401F32002L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_ruleModel175 = new BitSet(new long[]{0x0000001401F32002L});
    public static final BitSet FOLLOW_ruleLinkElement_in_ruleModel197 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleConnectableElement_in_entryRuleConnectableElement234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectableElement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangle_in_ruleConnectableElement291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhombus_in_ruleConnectableElement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_ruleConnectableElement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygon_in_ruleConnectableElement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleConnectableElement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleConnectableElement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGB_in_entryRuleRGB461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGB471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB513 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRGB530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB547 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRGB564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageFile_in_entryRuleImageFile622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageFile632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImageFile669 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageFile686 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageFile708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleColor803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColor836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultColor_in_ruleColor864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomColor_in_entryRuleCustomColor900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomColor910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCustomColor947 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomColor964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRGB_in_ruleCustomColor990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangle_in_entryRuleRectangle1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRectangle1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRectangle1080 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17_in_ruleRectangle1117 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRectangle1143 = new BitSet(new long[]{0x000615A000080000L});
    public static final BitSet FOLLOW_rulePolygonFeature_in_ruleRectangle1164 = new BitSet(new long[]{0x000615A000080000L});
    public static final BitSet FOLLOW_19_in_ruleRectangle1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRhombus_in_entryRuleRhombus1215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRhombus1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRhombus1262 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRhombus1274 = new BitSet(new long[]{0x000615A000000000L});
    public static final BitSet FOLLOW_rulePolygonFeature_in_ruleRhombus1295 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRhombus1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_entryRuleEllipse1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEllipse1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEllipse1397 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22_in_ruleEllipse1434 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEllipse1460 = new BitSet(new long[]{0x000615A000080000L});
    public static final BitSet FOLLOW_rulePolygonFeature_in_ruleEllipse1481 = new BitSet(new long[]{0x000615A000080000L});
    public static final BitSet FOLLOW_19_in_ruleEllipse1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygon_in_entryRulePolygon1530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolygon1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePolygon1584 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24_in_rulePolygon1621 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePolygon1647 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rulePoint_in_rulePolygon1668 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rulePoint_in_rulePolygon1689 = new BitSet(new long[]{0x000615A000080000L});
    public static final BitSet FOLLOW_rulePolygonFeature_in_rulePolygon1710 = new BitSet(new long[]{0x000615A000080000L});
    public static final BitSet FOLLOW_19_in_rulePolygon1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygonFeature_in_entryRulePolygonFeature1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolygonFeature1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_rulePolygonFeature1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rulePolygonFeature1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_rulePolygonFeature1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_rulePolygonFeature1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_rulePolygonFeature1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeExpression_in_entryRuleAtributeExpression1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributeExpression1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAtributeExpression2006 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributeExpression2023 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleAtributeExpression2048 = new BitSet(new long[]{0x0000000180000070L});
    public static final BitSet FOLLOW_27_in_ruleAtributeExpression2077 = new BitSet(new long[]{0x0000000180000070L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_ruleAtributeExpression2114 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtributeExpression2126 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtributeExpression2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributeValue_in_entryRuleAtributeValue2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributeValue2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue2255 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAtributeValue2272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributeValue2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAtributeValue2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAtributeValue2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributeValue2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue2446 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAtributeValue2463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue2480 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAtributeValue2497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtributeValue2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLabel2616 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_35_in_ruleLabel2634 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLabel2660 = new BitSet(new long[]{0x0001C0A000080000L});
    public static final BitSet FOLLOW_ruleLabelFeature_in_ruleLabel2681 = new BitSet(new long[]{0x0001C0A000080000L});
    public static final BitSet FOLLOW_19_in_ruleLabel2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelFeature_in_entryRuleLabelFeature2730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelFeature2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleLabelFeature2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleLabelFeature2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontFace_in_ruleLabelFeature2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_ruleLabelFeature2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyle_in_ruleLabelFeature2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage2930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImage2977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImage2997 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleImage3009 = new BitSet(new long[]{0x0000160000080000L});
    public static final BitSet FOLLOW_ruleImageFeature_in_ruleImage3030 = new BitSet(new long[]{0x0000160000080000L});
    public static final BitSet FOLLOW_19_in_ruleImage3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageFeature_in_entryRuleImageFeature3079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageFeature3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleImageFeature3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleImageFeature3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransparency_in_ruleImageFeature3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkElement_in_entryRuleLinkElement3225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkElement3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLinkElement3272 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ruleLineType_in_ruleLinkElement3293 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLinkElement3305 = new BitSet(new long[]{0x000615A000080000L});
    public static final BitSet FOLLOW_ruleLinkFeature_in_ruleLinkElement3326 = new BitSet(new long[]{0x000615A000080000L});
    public static final BitSet FOLLOW_19_in_ruleLinkElement3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkFeature_in_entryRuleLinkFeature3375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkFeature3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleLinkFeature3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleLinkFeature3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_ruleLinkFeature3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature3521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_ruleColorFeature3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleColorFeature3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorder_in_ruleColorFeature3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeground_in_entryRuleForeground3667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeground3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleForeground3714 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleForeground3726 = new BitSet(new long[]{0x0038000000004000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleForeground3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground3783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBackground3830 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBackground3842 = new BitSet(new long[]{0x0038000000004000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleBackground3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorder_in_entryRuleBorder3899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorder3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBorder3946 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBorder3958 = new BitSet(new long[]{0x0038000000004000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleBorder3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransparency_in_entryRuleTransparency4015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransparency4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTransparency4062 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTransparency4074 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleTransparency4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize4132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSize4179 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSize4191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize4208 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSize4225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint4283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePoint4330 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePoint4342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint4359 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePoint4376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_entryRulePosition4434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosition4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePosition4481 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePosition4493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePosition4510 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePosition4527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePosition4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner4585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCorner4632 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCorner4644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCorner4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontFace_in_entryRuleFontFace4702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontFace4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFontFace4749 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFontFace4761 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_ruleFontFaceType_in_ruleFontFace4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_entryRuleFontSize4818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontSize4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleFontSize4865 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFontSize4877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFontSize4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyle_in_entryRuleFontStyle4935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontStyle4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFontStyle4982 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFontStyle4994 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_ruleFontStyleType_in_ruleFontStyle5015 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleFontStyle5028 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_ruleFontStyleType_in_ruleFontStyle5049 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_entryRuleLineStyle5087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineStyle5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLineStyle5134 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLineStyle5146 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ruleLineType_in_ruleLineStyle5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineWidth_in_entryRuleLineWidth5203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineWidth5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLineWidth5250 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLineWidth5262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLineWidth5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDefaultColor5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDefaultColor5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDefaultColor5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFontFaceType5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFontFaceType5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFontFaceType5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleFontFaceType5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFontStyleType5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleFontStyleType5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleFontStyleType5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLineType5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLineType5605 = new BitSet(new long[]{0x0000000000000002L});

}