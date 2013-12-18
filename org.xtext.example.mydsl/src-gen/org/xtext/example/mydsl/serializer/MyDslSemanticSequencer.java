package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.AtributeExpression;
import org.xtext.example.mydsl.myDsl.AtributeValue;
import org.xtext.example.mydsl.myDsl.Background;
import org.xtext.example.mydsl.myDsl.Border;
import org.xtext.example.mydsl.myDsl.Color;
import org.xtext.example.mydsl.myDsl.Corner;
import org.xtext.example.mydsl.myDsl.CustomColor;
import org.xtext.example.mydsl.myDsl.Ellipse;
import org.xtext.example.mydsl.myDsl.FontFace;
import org.xtext.example.mydsl.myDsl.FontSize;
import org.xtext.example.mydsl.myDsl.FontStyle;
import org.xtext.example.mydsl.myDsl.Foreground;
import org.xtext.example.mydsl.myDsl.Image;
import org.xtext.example.mydsl.myDsl.ImageFile;
import org.xtext.example.mydsl.myDsl.Label;
import org.xtext.example.mydsl.myDsl.LineStyle;
import org.xtext.example.mydsl.myDsl.LineWidth;
import org.xtext.example.mydsl.myDsl.LinkElement;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Point;
import org.xtext.example.mydsl.myDsl.Polygon;
import org.xtext.example.mydsl.myDsl.Position;
import org.xtext.example.mydsl.myDsl.RGB;
import org.xtext.example.mydsl.myDsl.Rectangle;
import org.xtext.example.mydsl.myDsl.Rhombus;
import org.xtext.example.mydsl.myDsl.Size;
import org.xtext.example.mydsl.myDsl.Transparency;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ATRIBUTE_EXPRESSION:
				if(context == grammarAccess.getAtributeExpressionRule()) {
					sequence_AtributeExpression(context, (AtributeExpression) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.ATRIBUTE_VALUE:
				if(context == grammarAccess.getAtributeValueRule()) {
					sequence_AtributeValue(context, (AtributeValue) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BACKGROUND:
				if(context == grammarAccess.getBackgroundRule() ||
				   context == grammarAccess.getColorFeatureRule() ||
				   context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getLabelFeatureRule() ||
				   context == grammarAccess.getPolygonFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Background(context, (Background) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureRule()) {
					sequence_Background_Feature(context, (Background) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BORDER:
				if(context == grammarAccess.getBorderRule() ||
				   context == grammarAccess.getColorFeatureRule() ||
				   context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getPolygonFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Border(context, (Border) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureRule()) {
					sequence_Border_Feature(context, (Border) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.COLOR:
				if(context == grammarAccess.getColorRule()) {
					sequence_Color(context, (Color) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.CORNER:
				if(context == grammarAccess.getCornerRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Corner(context, (Corner) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureRule()) {
					sequence_Corner_Feature(context, (Corner) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.CUSTOM_COLOR:
				if(context == grammarAccess.getCustomColorRule()) {
					sequence_CustomColor(context, (CustomColor) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.ELLIPSE:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getEllipseRule()) {
					sequence_Ellipse(context, (Ellipse) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FONT_FACE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_FontFace(context, (FontFace) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFontFaceRule() ||
				   context == grammarAccess.getLabelFeatureRule()) {
					sequence_FontFace(context, (FontFace) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FONT_SIZE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_FontSize(context, (FontSize) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFontSizeRule() ||
				   context == grammarAccess.getLabelFeatureRule()) {
					sequence_FontSize(context, (FontSize) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FONT_STYLE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_FontStyle(context, (FontStyle) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFontStyleRule() ||
				   context == grammarAccess.getLabelFeatureRule()) {
					sequence_FontStyle(context, (FontStyle) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FOREGROUND:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_Foreground(context, (Foreground) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getColorFeatureRule() ||
				   context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getForegroundRule() ||
				   context == grammarAccess.getLabelFeatureRule() ||
				   context == grammarAccess.getLinkFeatureRule() ||
				   context == grammarAccess.getPolygonFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Foreground(context, (Foreground) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.IMAGE:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getImageRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.IMAGE_FILE:
				if(context == grammarAccess.getImageFileRule()) {
					sequence_ImageFile(context, (ImageFile) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LABEL:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LINE_STYLE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_LineStyle(context, (LineStyle) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getLineStyleRule() ||
				   context == grammarAccess.getLinkFeatureRule() ||
				   context == grammarAccess.getPolygonFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_LineStyle(context, (LineStyle) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LINE_WIDTH:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_LineWidth(context, (LineWidth) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLineWidthRule() ||
				   context == grammarAccess.getLinkFeatureRule() ||
				   context == grammarAccess.getPolygonFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_LineWidth(context, (LineWidth) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LINK_ELEMENT:
				if(context == grammarAccess.getLinkElementRule()) {
					sequence_LinkElement(context, (LinkElement) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.POINT:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_Point(context, (Point) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.POLYGON:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getPolygonRule()) {
					sequence_Polygon(context, (Polygon) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.POSITION:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_Position(context, (Position) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getImageFeatureRule() ||
				   context == grammarAccess.getPolygonFeatureRule() ||
				   context == grammarAccess.getPositionRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Position(context, (Position) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.RGB:
				if(context == grammarAccess.getRGBRule()) {
					sequence_RGB(context, (RGB) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.RECTANGLE:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getRectangleRule()) {
					sequence_Rectangle(context, (Rectangle) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.RHOMBUS:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getRhombusRule()) {
					sequence_Rhombus(context, (Rhombus) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SIZE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_Size(context, (Size) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getImageFeatureRule() ||
				   context == grammarAccess.getPolygonFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule() ||
				   context == grammarAccess.getSizeRule()) {
					sequence_Size(context, (Size) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.TRANSPARENCY:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_Transparency(context, (Transparency) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getImageFeatureRule() ||
				   context == grammarAccess.getTransparencyRule()) {
					sequence_Transparency(context, (Transparency) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (key=ID (operator='=' | operator='<>') value=AtributeValue)
	 */
	protected void sequence_AtributeExpression(EObject context, AtributeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         valueINT=INT | 
	 *         (valueINT=INT valueDEC=INT) | 
	 *         valueID=ID | 
	 *         valueBOOL='true' | 
	 *         valueBOOL='false' | 
	 *         valueSTRING=STRING | 
	 *         (valueDAY=INT valueMONTH=INT valueYEAR=INT)
	 *     )
	 */
	protected void sequence_AtributeValue(EObject context, AtributeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     color=Color
	 */
	protected void sequence_Background(EObject context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (color=Color expression=AtributeExpression?)
	 */
	protected void sequence_Background_Feature(EObject context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     color=Color
	 */
	protected void sequence_Border(EObject context, Border semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (color=Color expression=AtributeExpression?)
	 */
	protected void sequence_Border_Feature(EObject context, Border semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((custom?='rgb=' rgb=[CustomColor|ID]) | default=DefaultColor)
	 */
	protected void sequence_Color(EObject context, Color semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     angle=INT
	 */
	protected void sequence_Corner(EObject context, Corner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (angle=INT expression=AtributeExpression?)
	 */
	protected void sequence_Corner_Feature(EObject context, Corner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rgb=RGB)
	 */
	protected void sequence_CustomColor(EObject context, CustomColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CUSTOM_COLOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CUSTOM_COLOR__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CUSTOM_COLOR__RGB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CUSTOM_COLOR__RGB));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCustomColorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCustomColorAccess().getRgbRGBParserRuleCall_2_0(), semanticObject.getRgb());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((ellipse?='ellipse' | circle?='circle') features+=PolygonFeature*)
	 */
	protected void sequence_Ellipse(EObject context, Ellipse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (face=FontFaceType expression=AtributeExpression?)
	 */
	protected void sequence_Feature_FontFace(EObject context, FontFace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (size=INT expression=AtributeExpression?)
	 */
	protected void sequence_Feature_FontSize(EObject context, FontSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (styles+=FontStyleType styles+=FontStyleType* expression=AtributeExpression?)
	 */
	protected void sequence_Feature_FontStyle(EObject context, FontStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (color=Color expression=AtributeExpression?)
	 */
	protected void sequence_Feature_Foreground(EObject context, Foreground semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=LineType expression=AtributeExpression?)
	 */
	protected void sequence_Feature_LineStyle(EObject context, LineStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT expression=AtributeExpression?)
	 */
	protected void sequence_Feature_LineWidth(EObject context, LineWidth semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT expression=AtributeExpression?)
	 */
	protected void sequence_Feature_Point(EObject context, Point semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT expression=AtributeExpression?)
	 */
	protected void sequence_Feature_Position(EObject context, Position semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT height=INT expression=AtributeExpression?)
	 */
	protected void sequence_Feature_Size(EObject context, Size semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (percent=PERCENT expression=AtributeExpression?)
	 */
	protected void sequence_Feature_Transparency(EObject context, Transparency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     face=FontFaceType
	 */
	protected void sequence_FontFace(EObject context, FontFace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     size=INT
	 */
	protected void sequence_FontSize(EObject context, FontSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (styles+=FontStyleType styles+=FontStyleType*)
	 */
	protected void sequence_FontStyle(EObject context, FontStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     color=Color
	 */
	protected void sequence_Foreground(EObject context, Foreground semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID src=STRING)
	 */
	protected void sequence_ImageFile(EObject context, ImageFile semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.IMAGE_FILE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.IMAGE_FILE__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.IMAGE_FILE__SRC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.IMAGE_FILE__SRC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageFileAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getImageFileAccess().getSrcSTRINGTerminalRuleCall_2_0(), semanticObject.getSrc());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (image=[ImageFile|ID] features+=ImageFeature*)
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (editable?='editable'? features+=LabelFeature*)
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     style=LineType
	 */
	protected void sequence_LineStyle(EObject context, LineStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     width=INT
	 */
	protected void sequence_LineWidth(EObject context, LineWidth semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lineType=LineType features+=LinkFeature*)
	 */
	protected void sequence_LinkElement(EObject context, LinkElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (colors+=CustomColor* images+=ImageFile* elements+=ConnectableElement* links+=LinkElement*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((polygon?='polygon' | polyline?='polyline') features+=Point features+=Point features+=PolygonFeature*)
	 */
	protected void sequence_Polygon(EObject context, Polygon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT)
	 */
	protected void sequence_Position(EObject context, Position semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (R=INT G=INT B=INT)
	 */
	protected void sequence_RGB(EObject context, RGB semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RGB__R) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RGB__R));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RGB__G) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RGB__G));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RGB__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RGB__B));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRGBAccess().getRINTTerminalRuleCall_0_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getRGBAccess().getGINTTerminalRuleCall_2_0(), semanticObject.getG());
		feeder.accept(grammarAccess.getRGBAccess().getBINTTerminalRuleCall_4_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((rectangle?='rectangle' | square?='square') features+=PolygonFeature*)
	 */
	protected void sequence_Rectangle(EObject context, Rectangle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     features+=PolygonFeature
	 */
	protected void sequence_Rhombus(EObject context, Rhombus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT height=INT)
	 */
	protected void sequence_Size(EObject context, Size semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     percent=PERCENT
	 */
	protected void sequence_Transparency(EObject context, Transparency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
