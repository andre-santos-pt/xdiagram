/*
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import pt.iscte.xdiagram.dsl.model.Anchor;
import pt.iscte.xdiagram.dsl.model.Arrow;
import pt.iscte.xdiagram.dsl.model.BooleanValue;
import pt.iscte.xdiagram.dsl.model.Color;
import pt.iscte.xdiagram.dsl.model.ColorFeature;
import pt.iscte.xdiagram.dsl.model.Colors;
import pt.iscte.xdiagram.dsl.model.Contains;
import pt.iscte.xdiagram.dsl.model.Corner;
import pt.iscte.xdiagram.dsl.model.Custom;
import pt.iscte.xdiagram.dsl.model.CustomColor;
import pt.iscte.xdiagram.dsl.model.CustomFigure;
import pt.iscte.xdiagram.dsl.model.Decorator;
import pt.iscte.xdiagram.dsl.model.Diagram;
import pt.iscte.xdiagram.dsl.model.DoubleValue;
import pt.iscte.xdiagram.dsl.model.Ellipse;
import pt.iscte.xdiagram.dsl.model.EnumValue;
import pt.iscte.xdiagram.dsl.model.FeatureConditional;
import pt.iscte.xdiagram.dsl.model.FontProperties;
import pt.iscte.xdiagram.dsl.model.Image;
import pt.iscte.xdiagram.dsl.model.ImportStatement;
import pt.iscte.xdiagram.dsl.model.IntValue;
import pt.iscte.xdiagram.dsl.model.Invisible;
import pt.iscte.xdiagram.dsl.model.Label;
import pt.iscte.xdiagram.dsl.model.Layout;
import pt.iscte.xdiagram.dsl.model.Line;
import pt.iscte.xdiagram.dsl.model.LineStyle;
import pt.iscte.xdiagram.dsl.model.LineWidth;
import pt.iscte.xdiagram.dsl.model.Link;
import pt.iscte.xdiagram.dsl.model.MetaModel;
import pt.iscte.xdiagram.dsl.model.ModelPackage;
import pt.iscte.xdiagram.dsl.model.Node;
import pt.iscte.xdiagram.dsl.model.Point;
import pt.iscte.xdiagram.dsl.model.Polyline;
import pt.iscte.xdiagram.dsl.model.Position;
import pt.iscte.xdiagram.dsl.model.Rectangle;
import pt.iscte.xdiagram.dsl.model.Rhombus;
import pt.iscte.xdiagram.dsl.model.Size;
import pt.iscte.xdiagram.dsl.model.StringValue;
import pt.iscte.xdiagram.dsl.model.TextAlign;
import pt.iscte.xdiagram.dsl.model.TextPart;
import pt.iscte.xdiagram.dsl.model.TextValue;
import pt.iscte.xdiagram.dsl.model.Transparency;
import pt.iscte.xdiagram.dsl.model.Triangle;
import pt.iscte.xdiagram.dsl.model.Visible;
import pt.iscte.xdiagram.dsl.model.XDiagram;
import pt.iscte.xdiagram.dsl.services.XdiagramDslGrammarAccess;

@SuppressWarnings("all")
public class XdiagramDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XdiagramDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ModelPackage.ANCHOR:
				sequence_Anchor(context, (Anchor) semanticObject); 
				return; 
			case ModelPackage.ARROW:
				sequence_Arrow(context, (Arrow) semanticObject); 
				return; 
			case ModelPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case ModelPackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
				return; 
			case ModelPackage.COLOR_FEATURE:
				if (rule == grammarAccess.getBackgroundRule()) {
					sequence_Background(context, (ColorFeature) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureRule()
						|| rule == grammarAccess.getStyleFeatureRule()
						|| rule == grammarAccess.getConnectableElementFeatureRule()
						|| rule == grammarAccess.getRectangleFeatureRule()
						|| rule == grammarAccess.getFigureFeatureRule()
						|| rule == grammarAccess.getColorFeatureRule()) {
					sequence_Background_Foreground(context, (ColorFeature) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLinkFeatureRule()
						|| rule == grammarAccess.getLineFeatureRule()
						|| rule == grammarAccess.getLabelFeatureRule()
						|| rule == grammarAccess.getForegroundRule()) {
					sequence_Foreground(context, (ColorFeature) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.COLORS:
				sequence_Colors(context, (Colors) semanticObject); 
				return; 
			case ModelPackage.CONTAINS:
				sequence_Contains(context, (Contains) semanticObject); 
				return; 
			case ModelPackage.CORNER:
				sequence_Corner(context, (Corner) semanticObject); 
				return; 
			case ModelPackage.CUSTOM:
				sequence_Custom(context, (Custom) semanticObject); 
				return; 
			case ModelPackage.CUSTOM_COLOR:
				sequence_CustomColor(context, (CustomColor) semanticObject); 
				return; 
			case ModelPackage.CUSTOM_FIGURE:
				sequence_CustomFigure(context, (CustomFigure) semanticObject); 
				return; 
			case ModelPackage.DECORATOR:
				sequence_Decorator(context, (Decorator) semanticObject); 
				return; 
			case ModelPackage.DIAGRAM:
				sequence_Diagram(context, (Diagram) semanticObject); 
				return; 
			case ModelPackage.DOUBLE_VALUE:
				sequence_DoubleValue(context, (DoubleValue) semanticObject); 
				return; 
			case ModelPackage.ELLIPSE:
				sequence_Ellipse(context, (Ellipse) semanticObject); 
				return; 
			case ModelPackage.ENUM_VALUE:
				sequence_EnumValue(context, (EnumValue) semanticObject); 
				return; 
			case ModelPackage.FEATURE_CONDITIONAL:
				sequence_FeatureConditional(context, (FeatureConditional) semanticObject); 
				return; 
			case ModelPackage.FONT_PROPERTIES:
				sequence_FontProperties(context, (FontProperties) semanticObject); 
				return; 
			case ModelPackage.IMAGE:
				sequence_Image(context, (Image) semanticObject); 
				return; 
			case ModelPackage.IMPORT_STATEMENT:
				sequence_ImportStatement(context, (ImportStatement) semanticObject); 
				return; 
			case ModelPackage.INT_VALUE:
				sequence_IntValue(context, (IntValue) semanticObject); 
				return; 
			case ModelPackage.INVISIBLE:
				sequence_Invisible(context, (Invisible) semanticObject); 
				return; 
			case ModelPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case ModelPackage.LAYOUT:
				sequence_Layout(context, (Layout) semanticObject); 
				return; 
			case ModelPackage.LINE:
				sequence_Line(context, (Line) semanticObject); 
				return; 
			case ModelPackage.LINE_STYLE:
				sequence_LineStyle(context, (LineStyle) semanticObject); 
				return; 
			case ModelPackage.LINE_WIDTH:
				sequence_LineWidth(context, (LineWidth) semanticObject); 
				return; 
			case ModelPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			case ModelPackage.META_MODEL:
				sequence_MetaModel(context, (MetaModel) semanticObject); 
				return; 
			case ModelPackage.NODE:
				sequence_Node(context, (Node) semanticObject); 
				return; 
			case ModelPackage.POINT:
				sequence_Point(context, (Point) semanticObject); 
				return; 
			case ModelPackage.POLYLINE:
				sequence_Polyline(context, (Polyline) semanticObject); 
				return; 
			case ModelPackage.POSITION:
				sequence_Position(context, (Position) semanticObject); 
				return; 
			case ModelPackage.RECTANGLE:
				sequence_Rectangle(context, (Rectangle) semanticObject); 
				return; 
			case ModelPackage.RHOMBUS:
				sequence_Rhombus(context, (Rhombus) semanticObject); 
				return; 
			case ModelPackage.SIZE:
				sequence_Size(context, (Size) semanticObject); 
				return; 
			case ModelPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case ModelPackage.TEXT_ALIGN:
				sequence_TextAlign(context, (TextAlign) semanticObject); 
				return; 
			case ModelPackage.TEXT_PART:
				sequence_TextPart(context, (TextPart) semanticObject); 
				return; 
			case ModelPackage.TEXT_VALUE:
				sequence_TextValue(context, (TextValue) semanticObject); 
				return; 
			case ModelPackage.TRANSPARENCY:
				sequence_Transparency(context, (Transparency) semanticObject); 
				return; 
			case ModelPackage.TRIANGLE:
				sequence_Triangle(context, (Triangle) semanticObject); 
				return; 
			case ModelPackage.VISIBLE:
				sequence_Visible(context, (Visible) semanticObject); 
				return; 
			case ModelPackage.XDIAGRAM:
				sequence_XDiagram(context, (XDiagram) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Feature returns Anchor
	 *     LinkedFeature returns Anchor
	 *     Anchor returns Anchor
	 *     ConnectableElementFeature returns Anchor
	 *     RectangleFeature returns Anchor
	 *     InvisibleFeature returns Anchor
	 *
	 * Constraint:
	 *     (direction=AnchorDirection modelReference=[EReference|QualifiedName] max=INT? conditional=FeatureConditional?)
	 */
	protected void sequence_Anchor(ISerializationContext context, Anchor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Arrow
	 *     ChildElement returns Arrow
	 *     DecoratorElement returns Arrow
	 *     Arrow returns Arrow
	 *
	 * Constraint:
	 *     features+=LineFeature*
	 */
	protected void sequence_Arrow(ISerializationContext context, Arrow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Background returns ColorFeature
	 *
	 * Constraint:
	 *     (type='background' color=Color conditional=FeatureConditional?)
	 */
	protected void sequence_Background(ISerializationContext context, ColorFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns ColorFeature
	 *     StyleFeature returns ColorFeature
	 *     ConnectableElementFeature returns ColorFeature
	 *     RectangleFeature returns ColorFeature
	 *     FigureFeature returns ColorFeature
	 *     ColorFeature returns ColorFeature
	 *
	 * Constraint:
	 *     ((type='foreground' color=Color conditional=FeatureConditional?) | (type='background' color=Color conditional=FeatureConditional?))
	 */
	protected void sequence_Background_Foreground(ISerializationContext context, ColorFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns BooleanValue
	 *     BooleanValue returns BooleanValue
	 *
	 * Constraint:
	 *     value=BooleanLiteral
	 */
	protected void sequence_BooleanValue(ISerializationContext context, BooleanValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueBooleanLiteralEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Color returns Color
	 *
	 * Constraint:
	 *     (default=DefaultColor | custom=[CustomColor|ID])
	 */
	protected void sequence_Color(ISerializationContext context, Color semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Colors returns Colors
	 *
	 * Constraint:
	 *     colors+=CustomColor*
	 */
	protected void sequence_Colors(ISerializationContext context, Colors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Contains
	 *     LinkedFeature returns Contains
	 *     ConnectableElementFeature returns Contains
	 *     RectangleFeature returns Contains
	 *     Contains returns Contains
	 *     InvisibleFeature returns Contains
	 *
	 * Constraint:
	 *     (modelReference=[EReference|QualifiedName] conditional=FeatureConditional?)
	 */
	protected void sequence_Contains(ISerializationContext context, Contains semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Corner
	 *     StyleFeature returns Corner
	 *     RectangleFeature returns Corner
	 *     Corner returns Corner
	 *
	 * Constraint:
	 *     (angle=INT conditional=FeatureConditional?)
	 */
	protected void sequence_Corner(ISerializationContext context, Corner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CustomColor returns CustomColor
	 *
	 * Constraint:
	 *     (name=ID R=INT G=INT B=INT)
	 */
	protected void sequence_CustomColor(ISerializationContext context, CustomColor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.CUSTOM_COLOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.CUSTOM_COLOR__NAME));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.CUSTOM_COLOR__R) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.CUSTOM_COLOR__R));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.CUSTOM_COLOR__G) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.CUSTOM_COLOR__G));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.CUSTOM_COLOR__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.CUSTOM_COLOR__B));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomColorAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCustomColorAccess().getRINTTerminalRuleCall_1_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getCustomColorAccess().getGINTTerminalRuleCall_2_0(), semanticObject.getG());
		feeder.accept(grammarAccess.getCustomColorAccess().getBINTTerminalRuleCall_3_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CustomFigure returns CustomFigure
	 *
	 * Constraint:
	 *     (name=ID element=ConnectableElement)
	 */
	protected void sequence_CustomFigure(ISerializationContext context, CustomFigure semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.CUSTOM_FIGURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.CUSTOM_FIGURE__NAME));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.CUSTOM_FIGURE__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.CUSTOM_FIGURE__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomFigureAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCustomFigureAccess().getElementConnectableElementParserRuleCall_3_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Custom
	 *     ChildElement returns Custom
	 *     ConnectableElement returns Custom
	 *     Custom returns Custom
	 *
	 * Constraint:
	 *     (figure=[CustomFigure|ID] features+=LinkedFeature* children+=ChildElement*)
	 */
	protected void sequence_Custom(ISerializationContext context, Custom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decorator returns Decorator
	 *
	 * Constraint:
	 *     (position=INT element=DecoratorElement)
	 */
	protected void sequence_Decorator(ISerializationContext context, Decorator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.DECORATOR__POSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.DECORATOR__POSITION));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.DECORATOR__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.DECORATOR__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDecoratorAccess().getPositionINTTerminalRuleCall_1_0(), semanticObject.getPosition());
		feeder.accept(grammarAccess.getDecoratorAccess().getElementDecoratorElementParserRuleCall_3_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Diagram returns Diagram
	 *
	 * Constraint:
	 *     (modelClass=[EClass|QualifiedName] contains+=Contains*)
	 */
	protected void sequence_Diagram(ISerializationContext context, Diagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns DoubleValue
	 *     DoubleValue returns DoubleValue
	 *
	 * Constraint:
	 *     (valueInt=INT valueDecimal=INT)
	 */
	protected void sequence_DoubleValue(ISerializationContext context, DoubleValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.DOUBLE_VALUE__VALUE_INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.DOUBLE_VALUE__VALUE_INT));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.DOUBLE_VALUE__VALUE_DECIMAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.DOUBLE_VALUE__VALUE_DECIMAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoubleValueAccess().getValueIntINTTerminalRuleCall_0_0(), semanticObject.getValueInt());
		feeder.accept(grammarAccess.getDoubleValueAccess().getValueDecimalINTTerminalRuleCall_2_0(), semanticObject.getValueDecimal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Ellipse
	 *     ChildElement returns Ellipse
	 *     ConnectableElement returns Ellipse
	 *     DecoratorElement returns Ellipse
	 *     Ellipse returns Ellipse
	 *
	 * Constraint:
	 *     ((ellipse?='ellipse' | circle?='circle') features+=ConnectableElementFeature* children+=ChildElement*)
	 */
	protected void sequence_Ellipse(ISerializationContext context, Ellipse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns EnumValue
	 *     EnumValue returns EnumValue
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumValue(ISerializationContext context, EnumValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ENUM_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ENUM_VALUE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureConditional returns FeatureConditional
	 *
	 * Constraint:
	 *     (modelAttribute=[EAttribute|QualifiedName] operator=Operator value=Value)
	 */
	protected void sequence_FeatureConditional(ISerializationContext context, FeatureConditional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.FEATURE_CONDITIONAL__MODEL_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.FEATURE_CONDITIONAL__MODEL_ATTRIBUTE));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.FEATURE_CONDITIONAL__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.FEATURE_CONDITIONAL__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.FEATURE_CONDITIONAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.FEATURE_CONDITIONAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeatureConditionalAccess().getModelAttributeEAttributeQualifiedNameParserRuleCall_1_0_1(), semanticObject.getModelAttribute());
		feeder.accept(grammarAccess.getFeatureConditionalAccess().getOperatorOperatorEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getFeatureConditionalAccess().getValueValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns FontProperties
	 *     StyleFeature returns FontProperties
	 *     LabelFeature returns FontProperties
	 *     FontProperties returns FontProperties
	 *
	 * Constraint:
	 *     (face='arial'? size=INT? bold?='bold'? italics?='italics'? conditional=FeatureConditional?)
	 */
	protected void sequence_FontProperties(ISerializationContext context, FontProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LinkFeature returns ColorFeature
	 *     LineFeature returns ColorFeature
	 *     LabelFeature returns ColorFeature
	 *     Foreground returns ColorFeature
	 *
	 * Constraint:
	 *     (type='foreground' color=Color conditional=FeatureConditional?)
	 */
	protected void sequence_Foreground(ISerializationContext context, ColorFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Image
	 *     ChildElement returns Image
	 *     ConnectableElement returns Image
	 *     DecoratorElement returns Image
	 *     Image returns Image
	 *
	 * Constraint:
	 *     (imageId=STRING features+=ImageFeature* children+=ChildElement*)
	 */
	protected void sequence_Image(ISerializationContext context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportStatement returns ImportStatement
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCard?
	 */
	protected void sequence_ImportStatement(ISerializationContext context, ImportStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns IntValue
	 *     IntValue returns IntValue
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntValue(ISerializationContext context, IntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.INT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Invisible
	 *     ChildElement returns Invisible
	 *     ConnectableElement returns Invisible
	 *     Invisible returns Invisible
	 *
	 * Constraint:
	 *     (features+=InvisibleFeature* children+=ChildElement*)
	 */
	protected void sequence_Invisible(ISerializationContext context, Invisible semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Label
	 *     ChildElement returns Label
	 *     ConnectableElement returns Label
	 *     DecoratorElement returns Label
	 *     Label returns Label
	 *
	 * Constraint:
	 *     (features+=LabelFeature* children+=ChildElement*)
	 */
	protected void sequence_Label(ISerializationContext context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConnectableElementFeature returns Layout
	 *     RectangleFeature returns Layout
	 *     InvisibleFeature returns Layout
	 *     Layout returns Layout
	 *
	 * Constraint:
	 *     ((vertical?='vertical' | horizontal?='horizontal') margin=INT? conditional=FeatureConditional?)
	 */
	protected void sequence_Layout(ISerializationContext context, Layout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns LineStyle
	 *     StyleFeature returns LineStyle
	 *     LinkFeature returns LineStyle
	 *     ConnectableElementFeature returns LineStyle
	 *     RectangleFeature returns LineStyle
	 *     LineFeature returns LineStyle
	 *     FigureFeature returns LineStyle
	 *     LineStyle returns LineStyle
	 *
	 * Constraint:
	 *     (style=LineType? manhattan?='manhattan'? conditional=FeatureConditional?)
	 */
	protected void sequence_LineStyle(ISerializationContext context, LineStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns LineWidth
	 *     StyleFeature returns LineWidth
	 *     LinkFeature returns LineWidth
	 *     ConnectableElementFeature returns LineWidth
	 *     RectangleFeature returns LineWidth
	 *     LineFeature returns LineWidth
	 *     LineWidth returns LineWidth
	 *
	 * Constraint:
	 *     (width=INT conditional=FeatureConditional?)
	 */
	protected void sequence_LineWidth(ISerializationContext context, LineWidth semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Line
	 *     ChildElement returns Line
	 *     DecoratorElement returns Line
	 *     Line returns Line
	 *
	 * Constraint:
	 *     ((horizontal?='hline' | vertical?='vline') features+=LineFeature*)
	 */
	protected void sequence_Line(ISerializationContext context, Line semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DiagramElement returns Link
	 *     FeatureContainer returns Link
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (reference?='reference' modelReference=[EReference|QualifiedName]) | 
	 *             (complex?='class' modelClass=[EClass|QualifiedName] sourceReference=[EReference|QualifiedName] targetReference=[EReference|QualifiedName])
	 *         ) 
	 *         features+=LinkFeature* 
	 *         decorators+=Decorator*
	 *     )
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MetaModel returns MetaModel
	 *
	 * Constraint:
	 *     (plugin=STRING ecorePath=STRING)
	 */
	protected void sequence_MetaModel(ISerializationContext context, MetaModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.META_MODEL__PLUGIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.META_MODEL__PLUGIN));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.META_MODEL__ECORE_PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.META_MODEL__ECORE_PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMetaModelAccess().getPluginSTRINGTerminalRuleCall_3_0(), semanticObject.getPlugin());
		feeder.accept(grammarAccess.getMetaModelAccess().getEcorePathSTRINGTerminalRuleCall_5_0(), semanticObject.getEcorePath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DiagramElement returns Node
	 *     Node returns Node
	 *
	 * Constraint:
	 *     (modelClass=[EClass|QualifiedName] rootFigure=ConnectableElement)
	 */
	protected void sequence_Node(ISerializationContext context, Node semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.DIAGRAM_ELEMENT__MODEL_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.DIAGRAM_ELEMENT__MODEL_CLASS));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.NODE__ROOT_FIGURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.NODE__ROOT_FIGURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNodeAccess().getModelClassEClassQualifiedNameParserRuleCall_1_0_1(), semanticObject.getModelClass());
		feeder.accept(grammarAccess.getNodeAccess().getRootFigureConnectableElementParserRuleCall_2_0(), semanticObject.getRootFigure());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Point
	 *     StyleFeature returns Point
	 *     FigureFeature returns Point
	 *     Point returns Point
	 *
	 * Constraint:
	 *     (x=INT y=INT conditional=FeatureConditional?)
	 */
	protected void sequence_Point(ISerializationContext context, Point semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Polyline
	 *     ChildElement returns Polyline
	 *     ConnectableElement returns Polyline
	 *     DecoratorElement returns Polyline
	 *     Polyline returns Polyline
	 *
	 * Constraint:
	 *     (
	 *         (polygon?='polygon' | polyline?='polyline') 
	 *         features+=Point 
	 *         features+=Point 
	 *         features+=Point* 
	 *         features+=ConnectableElementFeature* 
	 *         children+=ChildElement*
	 *     )
	 */
	protected void sequence_Polyline(ISerializationContext context, Polyline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Position
	 *     StyleFeature returns Position
	 *     ConnectableElementFeature returns Position
	 *     RectangleFeature returns Position
	 *     LineFeature returns Position
	 *     FigureFeature returns Position
	 *     LabelFeature returns Position
	 *     ImageFeature returns Position
	 *     InvisibleFeature returns Position
	 *     Position returns Position
	 *
	 * Constraint:
	 *     (x=INT xRelative?='%'? y=INT yRelative?='%'? conditional=FeatureConditional?)
	 */
	protected void sequence_Position(ISerializationContext context, Position semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Rectangle
	 *     ChildElement returns Rectangle
	 *     ConnectableElement returns Rectangle
	 *     Rectangle returns Rectangle
	 *
	 * Constraint:
	 *     ((rectangle?='rectangle' | square?='square') features+=RectangleFeature* children+=ChildElement*)
	 */
	protected void sequence_Rectangle(ISerializationContext context, Rectangle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Rhombus
	 *     ChildElement returns Rhombus
	 *     ConnectableElement returns Rhombus
	 *     DecoratorElement returns Rhombus
	 *     Rhombus returns Rhombus
	 *
	 * Constraint:
	 *     (features+=ConnectableElementFeature* children+=ChildElement*)
	 */
	protected void sequence_Rhombus(ISerializationContext context, Rhombus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Size
	 *     StyleFeature returns Size
	 *     ConnectableElementFeature returns Size
	 *     RectangleFeature returns Size
	 *     LineFeature returns Size
	 *     FigureFeature returns Size
	 *     LabelFeature returns Size
	 *     ImageFeature returns Size
	 *     InvisibleFeature returns Size
	 *     Size returns Size
	 *
	 * Constraint:
	 *     (width=INT widthRelative?=']'? (height=INT heightRelative?=']'?)? resizable?='resizable'? conditional=FeatureConditional?)
	 */
	protected void sequence_Size(ISerializationContext context, Size semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     (null?='null' | value=STRING)
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns TextAlign
	 *     StyleFeature returns TextAlign
	 *     LabelFeature returns TextAlign
	 *     TextAlign returns TextAlign
	 *
	 * Constraint:
	 *     (value=TextAlignValue conditional=FeatureConditional?)
	 */
	protected void sequence_TextAlign(ISerializationContext context, TextAlign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TextPart returns TextPart
	 *
	 * Constraint:
	 *     (text=STRING | (editable?='edit:'? modelAttribute=[EAttribute|QualifiedName]))
	 */
	protected void sequence_TextPart(ISerializationContext context, TextPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns TextValue
	 *     StyleFeature returns TextValue
	 *     LabelFeature returns TextValue
	 *     TextValue returns TextValue
	 *
	 * Constraint:
	 *     (parts+=TextPart* conditional=FeatureConditional?)
	 */
	protected void sequence_TextValue(ISerializationContext context, TextValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Transparency
	 *     StyleFeature returns Transparency
	 *     ConnectableElementFeature returns Transparency
	 *     RectangleFeature returns Transparency
	 *     ImageFeature returns Transparency
	 *     Transparency returns Transparency
	 *
	 * Constraint:
	 *     (percent=INT conditional=FeatureConditional?)
	 */
	protected void sequence_Transparency(ISerializationContext context, Transparency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureContainer returns Triangle
	 *     ChildElement returns Triangle
	 *     ConnectableElement returns Triangle
	 *     DecoratorElement returns Triangle
	 *     Triangle returns Triangle
	 *
	 * Constraint:
	 *     (features+=ConnectableElementFeature* children+=ChildElement*)
	 */
	protected void sequence_Triangle(ISerializationContext context, Triangle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConnectableElementFeature returns Visible
	 *     RectangleFeature returns Visible
	 *     LineFeature returns Visible
	 *     LabelFeature returns Visible
	 *     Visible returns Visible
	 *
	 * Constraint:
	 *     conditional=FeatureConditional
	 */
	protected void sequence_Visible(ISerializationContext context, Visible semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.FEATURE__CONDITIONAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.FEATURE__CONDITIONAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVisibleAccess().getConditionalFeatureConditionalParserRuleCall_1_0(), semanticObject.getConditional());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XDiagram returns XDiagram
	 *
	 * Constraint:
	 *     (metamodel=MetaModel diagram=Diagram customColors=Colors? (elements+=DiagramElement | figures+=CustomFigure)*)
	 */
	protected void sequence_XDiagram(ISerializationContext context, XDiagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
