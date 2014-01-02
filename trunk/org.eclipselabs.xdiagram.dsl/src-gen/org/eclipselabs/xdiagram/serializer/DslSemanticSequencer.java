package org.eclipselabs.xdiagram.serializer;

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
import org.eclipselabs.xdiagram.dsl.Anchor;
import org.eclipselabs.xdiagram.dsl.Background;
import org.eclipselabs.xdiagram.dsl.BooleanValue;
import org.eclipselabs.xdiagram.dsl.Color;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.Corner;
import org.eclipselabs.xdiagram.dsl.CustomColor;
import org.eclipselabs.xdiagram.dsl.Decorator;
import org.eclipselabs.xdiagram.dsl.DoubleValue;
import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Ellipse;
import org.eclipselabs.xdiagram.dsl.EnumValue;
import org.eclipselabs.xdiagram.dsl.FeatureConditional;
import org.eclipselabs.xdiagram.dsl.FontFace;
import org.eclipselabs.xdiagram.dsl.FontSize;
import org.eclipselabs.xdiagram.dsl.FontStyle;
import org.eclipselabs.xdiagram.dsl.Foreground;
import org.eclipselabs.xdiagram.dsl.Image;
import org.eclipselabs.xdiagram.dsl.ImageFile;
import org.eclipselabs.xdiagram.dsl.ImportStatement;
import org.eclipselabs.xdiagram.dsl.IntValue;
import org.eclipselabs.xdiagram.dsl.Invisible;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.LineStyle;
import org.eclipselabs.xdiagram.dsl.LineWidth;
import org.eclipselabs.xdiagram.dsl.Link;
import org.eclipselabs.xdiagram.dsl.Node;
import org.eclipselabs.xdiagram.dsl.Point;
import org.eclipselabs.xdiagram.dsl.Polyline;
import org.eclipselabs.xdiagram.dsl.Position;
import org.eclipselabs.xdiagram.dsl.Rectangle;
import org.eclipselabs.xdiagram.dsl.Rhombus;
import org.eclipselabs.xdiagram.dsl.Size;
import org.eclipselabs.xdiagram.dsl.StringValue;
import org.eclipselabs.xdiagram.dsl.Style;
import org.eclipselabs.xdiagram.dsl.TextValue;
import org.eclipselabs.xdiagram.dsl.Transparency;
import org.eclipselabs.xdiagram.dsl.XDiagram;
import org.eclipselabs.xdiagram.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DslPackage.ANCHOR:
				if(context == grammarAccess.getAnchorRule() ||
				   context == grammarAccess.getConnectableElementFeatureRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Anchor(context, (Anchor) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.BACKGROUND:
				if(context == grammarAccess.getBackgroundRule() ||
				   context == grammarAccess.getColorFeatureRule() ||
				   context == grammarAccess.getConnectableElementFeatureRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getLabelFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Background(context, (Background) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.COLOR:
				if(context == grammarAccess.getColorRule()) {
					sequence_Color(context, (Color) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.CONTAINS:
				if(context == grammarAccess.getConnectableElementFeatureRule() ||
				   context == grammarAccess.getContainsRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Contains(context, (Contains) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.CORNER:
				if(context == grammarAccess.getCornerRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Corner(context, (Corner) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.CUSTOM_COLOR:
				if(context == grammarAccess.getCustomColorRule()) {
					sequence_CustomColor(context, (CustomColor) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.DECORATOR:
				if(context == grammarAccess.getDecoratorRule()) {
					sequence_Decorator(context, (Decorator) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.DOUBLE_VALUE:
				if(context == grammarAccess.getDoubleValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_DoubleValue(context, (DoubleValue) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.ELLIPSE:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEllipseRule()) {
					sequence_Ellipse(context, (Ellipse) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.ENUM_VALUE:
				if(context == grammarAccess.getEnumValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_EnumValue(context, (EnumValue) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.FEATURE_CONDITIONAL:
				if(context == grammarAccess.getFeatureConditionalRule()) {
					sequence_FeatureConditional(context, (FeatureConditional) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.FONT_FACE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFontFaceRule() ||
				   context == grammarAccess.getLabelFeatureRule()) {
					sequence_FontFace(context, (FontFace) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.FONT_SIZE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFontSizeRule() ||
				   context == grammarAccess.getLabelFeatureRule()) {
					sequence_FontSize(context, (FontSize) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.FONT_STYLE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFontStyleRule() ||
				   context == grammarAccess.getLabelFeatureRule()) {
					sequence_FontStyle(context, (FontStyle) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.FOREGROUND:
				if(context == grammarAccess.getColorFeatureRule() ||
				   context == grammarAccess.getConnectableElementFeatureRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getForegroundRule() ||
				   context == grammarAccess.getLabelFeatureRule() ||
				   context == grammarAccess.getLinkFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Foreground(context, (Foreground) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.IMAGE:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getImageRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.IMAGE_FILE:
				if(context == grammarAccess.getImageFileRule()) {
					sequence_ImageFile(context, (ImageFile) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.IMPORT_STATEMENT:
				if(context == grammarAccess.getImportStatementRule()) {
					sequence_ImportStatement(context, (ImportStatement) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.INT_VALUE:
				if(context == grammarAccess.getIntValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntValue(context, (IntValue) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.INVISIBLE:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getInvisibleRule()) {
					sequence_Invisible(context, (Invisible) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.LABEL:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.LINE_STYLE:
				if(context == grammarAccess.getConnectableElementFeatureRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getLineStyleRule() ||
				   context == grammarAccess.getLinkFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_LineStyle(context, (LineStyle) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.LINE_WIDTH:
				if(context == grammarAccess.getConnectableElementFeatureRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getLineWidthRule() ||
				   context == grammarAccess.getLinkFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_LineWidth(context, (LineWidth) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.LINK:
				if(context == grammarAccess.getDiagramElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.NODE:
				if(context == grammarAccess.getDiagramElementRule() ||
				   context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (Node) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.POINT:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.POLYLINE:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPolylineRule() ||
				   context == grammarAccess.getStaticElementRule()) {
					sequence_Polyline(context, (Polyline) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.POSITION:
				if(context == grammarAccess.getConnectableElementFeatureRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getImageFeatureRule() ||
				   context == grammarAccess.getInvisibleFeatureRule() ||
				   context == grammarAccess.getPositionRule() ||
				   context == grammarAccess.getRectangleFeatureRule()) {
					sequence_Position(context, (Position) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.RECTANGLE:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getRectangleRule()) {
					sequence_Rectangle(context, (Rectangle) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.RHOMBUS:
				if(context == grammarAccess.getConnectableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getRhombusRule() ||
				   context == grammarAccess.getStaticElementRule()) {
					sequence_Rhombus(context, (Rhombus) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.SIZE:
				if(context == grammarAccess.getConnectableElementFeatureRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFigureFeatureRule() ||
				   context == grammarAccess.getImageFeatureRule() ||
				   context == grammarAccess.getInvisibleFeatureRule() ||
				   context == grammarAccess.getRectangleFeatureRule() ||
				   context == grammarAccess.getSizeRule()) {
					sequence_Size(context, (Size) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.STRING_VALUE:
				if(context == grammarAccess.getStringValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.STYLE:
				if(context == grammarAccess.getStyleRule()) {
					sequence_Style(context, (Style) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.TEXT_VALUE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getLabelFeatureRule() ||
				   context == grammarAccess.getTextValueRule()) {
					sequence_TextValue(context, (TextValue) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.TRANSPARENCY:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getImageFeatureRule() ||
				   context == grammarAccess.getTransparencyRule()) {
					sequence_Transparency(context, (Transparency) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.XDIAGRAM:
				if(context == grammarAccess.getXDiagramRule()) {
					sequence_XDiagram(context, (XDiagram) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (direction=AnchorDirection modelReference=[EReference|QualifiedName] conditional=FeatureConditional?)
	 */
	protected void sequence_Anchor(EObject context, Anchor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (color=Color conditional=FeatureConditional?)
	 */
	protected void sequence_Background(EObject context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BooleanLiteral
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueBooleanLiteralEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (default=DefaultColor | custom=[CustomColor|ID])
	 */
	protected void sequence_Color(EObject context, Color semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modelReference=[EReference|QualifiedName] conditional=FeatureConditional? layout=ContainerLayout?)
	 */
	protected void sequence_Contains(EObject context, Contains semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (angle=INT conditional=FeatureConditional?)
	 */
	protected void sequence_Corner(EObject context, Corner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID R=INT G=INT B=INT)
	 */
	protected void sequence_CustomColor(EObject context, CustomColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.CUSTOM_COLOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.CUSTOM_COLOR__NAME));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.CUSTOM_COLOR__R) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.CUSTOM_COLOR__R));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.CUSTOM_COLOR__G) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.CUSTOM_COLOR__G));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.CUSTOM_COLOR__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.CUSTOM_COLOR__B));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCustomColorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCustomColorAccess().getRINTTerminalRuleCall_2_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getCustomColorAccess().getGINTTerminalRuleCall_4_0(), semanticObject.getG());
		feeder.accept(grammarAccess.getCustomColorAccess().getBINTTerminalRuleCall_6_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((position=INT | source?='source' | target?='target' | middle?='middle') (staticElement=StaticElement | label=Label)?)
	 */
	protected void sequence_Decorator(EObject context, Decorator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueInt=INT valueDecimal=INT)
	 */
	protected void sequence_DoubleValue(EObject context, DoubleValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.DOUBLE_VALUE__VALUE_INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.DOUBLE_VALUE__VALUE_INT));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.DOUBLE_VALUE__VALUE_DECIMAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.DOUBLE_VALUE__VALUE_DECIMAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleValueAccess().getValueIntINTTerminalRuleCall_0_0(), semanticObject.getValueInt());
		feeder.accept(grammarAccess.getDoubleValueAccess().getValueDecimalINTTerminalRuleCall_2_0(), semanticObject.getValueDecimal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((ellipse?='ellipse' | circle?='circle') features+=ConnectableElementFeature* (composite?='children:' children+=ConnectableElement+)?)
	 */
	protected void sequence_Ellipse(EObject context, Ellipse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumValue(EObject context, EnumValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.ENUM_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ENUM_VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modelAttribute=[EAttribute|QualifiedName] operator=Operator value=Value)
	 */
	protected void sequence_FeatureConditional(EObject context, FeatureConditional semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.FEATURE_CONDITIONAL__MODEL_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.FEATURE_CONDITIONAL__MODEL_ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.FEATURE_CONDITIONAL__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.FEATURE_CONDITIONAL__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.FEATURE_CONDITIONAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.FEATURE_CONDITIONAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureConditionalAccess().getModelAttributeEAttributeQualifiedNameParserRuleCall_1_0_1(), semanticObject.getModelAttribute());
		feeder.accept(grammarAccess.getFeatureConditionalAccess().getOperatorOperatorEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getFeatureConditionalAccess().getValueValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (face=FontFaceType conditional=FeatureConditional?)
	 */
	protected void sequence_FontFace(EObject context, FontFace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (size=INT conditional=FeatureConditional?)
	 */
	protected void sequence_FontSize(EObject context, FontSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (styles+=FontStyleType styles+=FontStyleType* conditional=FeatureConditional?)
	 */
	protected void sequence_FontStyle(EObject context, FontStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (color=Color conditional=FeatureConditional?)
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
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.IMAGE_FILE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.IMAGE_FILE__NAME));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.IMAGE_FILE__SRC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.IMAGE_FILE__SRC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageFileAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getImageFileAccess().getSrcSTRINGTerminalRuleCall_2_0(), semanticObject.getSrc());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (image=[ImageFile|ID] features+=ImageFeature* (composite?='children:' children+=ConnectableElement+)?)
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importedNamespace=QualifiedNameWithWildCard?)
	 */
	protected void sequence_ImportStatement(EObject context, ImportStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntValue(EObject context, IntValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.INT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (features+=InvisibleFeature* (composite?='children:' children+=ConnectableElement+)?)
	 */
	protected void sequence_Invisible(EObject context, Invisible semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (editable?='editable'? features+=LabelFeature* (composite?='children:' children+=ConnectableElement+)?)
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=LineType conditional=FeatureConditional?)
	 */
	protected void sequence_LineStyle(EObject context, LineStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT conditional=FeatureConditional?)
	 */
	protected void sequence_LineWidth(EObject context, LineWidth semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             modelReference=[EReference|QualifiedName] | 
	 *             (complex?='object' modelClass=[EClass|QualifiedName] sourceReference=[EReference|QualifiedName] targetReference=[EReference|QualifiedName])
	 *         ) 
	 *         toolName=STRING? 
	 *         icon=[ImageFile|ID]? 
	 *         type=ConnectionType 
	 *         features+=LinkFeature* 
	 *         decorators+=Decorator*
	 *     )
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modelClass=[EClass|QualifiedName] toolName=STRING? icon=[ImageFile|ID]? mainFigure=ConnectableElement)
	 */
	protected void sequence_Node(EObject context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT conditional=FeatureConditional?)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (polygon?='polygon' | polyline?='polyline') 
	 *         features+=Point 
	 *         features+=Point 
	 *         features+=Point* 
	 *         features+=ConnectableElementFeature* 
	 *         (composite?='children:' children+=ConnectableElement+)?
	 *     )
	 */
	protected void sequence_Polyline(EObject context, Polyline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT conditional=FeatureConditional?)
	 */
	protected void sequence_Position(EObject context, Position semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((rectangle?='rectangle' | square?='square') features+=RectangleFeature* (composite?='children:' children+=ConnectableElement+)?)
	 */
	protected void sequence_Rectangle(EObject context, Rectangle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (features+=ConnectableElementFeature* (composite?='children:' children+=ConnectableElement+)?)
	 */
	protected void sequence_Rhombus(EObject context, Rhombus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT height=INT conditional=FeatureConditional?)
	 */
	protected void sequence_Size(EObject context, Size semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (null?='null' | value=STRING)
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID features+=Feature*)
	 */
	protected void sequence_Style(EObject context, Style semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((text=STRING | modelAttribute=[EAttribute|QualifiedName]) conditional=FeatureConditional?)
	 */
	protected void sequence_TextValue(EObject context, TextValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (percent=PERCENT conditional=FeatureConditional?)
	 */
	protected void sequence_Transparency(EObject context, Transparency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         importURI=STRING 
	 *         imports+=ImportStatement 
	 *         modelClass=[EClass|QualifiedName] 
	 *         (nodes+=Node | links+=Link | styles+=Style | colors+=CustomColor | images+=ImageFile)*
	 *     )
	 */
	protected void sequence_XDiagram(EObject context, XDiagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}