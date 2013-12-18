package org.eclipselabs.xdiagram.xtext.serializer;

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
import org.eclipselabs.xdiagram.xtext.services.XDiagramGrammarAccess;
import org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression;
import org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Attribute;
import org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.CenterFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Decorator;
import org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures;
import org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement;
import org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.LayoutFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Link;
import org.eclipselabs.xdiagram.xtext.xdiagram.Node;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.RGB;
import org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Style;
import org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

@SuppressWarnings("all")
public class XDiagramSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XDiagramGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XdiagramPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XdiagramPackage.ALIGN_FEATURE:
				if(context == grammarAccess.getAlignFeatureRule()) {
					sequence_AlignFeature(context, (AlignFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.ARROW_ANCHOR:
				if(context == grammarAccess.getArrowAnchorRule()) {
					sequence_ArrowAnchor(context, (ArrowAnchor) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.ATRIBUTE_EXPRESSION:
				if(context == grammarAccess.getAtributeExpressionRule()) {
					sequence_AtributeExpression(context, (AtributeExpression) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.ATRIBUTE_VALUE:
				if(context == grammarAccess.getAtributeValueRule()) {
					sequence_AtributeValue(context, (AtributeValue) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.BOOLEAN_FEATURE:
				if(context == grammarAccess.getBooleanFeatureRule()) {
					sequence_BooleanFeature(context, (BooleanFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.CENTER_FEATURE:
				if(context == grammarAccess.getCenterFeatureRule() ||
				   context == grammarAccess.getStyleFeatureRule()) {
					sequence_CenterFeature(context, (CenterFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.COLOR_FEATURE:
				if(context == grammarAccess.getColorFeatureRule()) {
					sequence_ColorFeature(context, (ColorFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.DECORATOR:
				if(context == grammarAccess.getDecoratorRule()) {
					sequence_Decorator(context, (Decorator) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.DYNAMIC_FIGURE:
				if(context == grammarAccess.getDynamicFigureRule()) {
					sequence_DynamicFigure(context, (DynamicFigure) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.FIGURE_FEATURES:
				if(context == grammarAccess.getFigureFeaturesRule()) {
					sequence_FigureFeatures(context, (FigureFeatures) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.GRADIENT_FEATURE:
				if(context == grammarAccess.getGradientFeatureRule()) {
					sequence_GradientFeature(context, (GradientFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.IMPORT_STATEMENT:
				if(context == grammarAccess.getImportStatementRule()) {
					sequence_ImportStatement(context, (ImportStatement) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.INTEGER_FEATURE:
				if(context == grammarAccess.getIntegerFeatureRule()) {
					sequence_IntegerFeature(context, (IntegerFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.LAYOUT_FEATURE:
				if(context == grammarAccess.getLayoutFeatureRule() ||
				   context == grammarAccess.getStyleFeatureRule()) {
					sequence_LayoutFeature(context, (LayoutFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.LINE_FEATURE:
				if(context == grammarAccess.getLineFeatureRule()) {
					sequence_LineFeature(context, (LineFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.LINK:
				if(context == grammarAccess.getDiagramElementRule() ||
				   context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.NODE:
				if(context == grammarAccess.getDiagramElementRule() ||
				   context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (Node) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.NODE_ANCHOR:
				if(context == grammarAccess.getNodeAnchorRule()) {
					sequence_NodeAnchor(context, (NodeAnchor) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.NODE_CONTAINER:
				if(context == grammarAccess.getNodeContainerRule()) {
					sequence_NodeContainer(context, (NodeContainer) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.NODE_FIGURE:
				if(context == grammarAccess.getNodeFigureRule()) {
					sequence_NodeFigure(context, (NodeFigure) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.POINT_FEATURE:
				if(context == grammarAccess.getPointFeatureRule()) {
					sequence_PointFeature(context, (PointFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.POSITION_FEATURE:
				if(context == grammarAccess.getPositionFeatureRule()) {
					sequence_PositionFeature(context, (PositionFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.RGB:
				if(context == grammarAccess.getRGBRule()) {
					sequence_RGB(context, (RGB) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.SIZE_FEATURE:
				if(context == grammarAccess.getSizeFeatureRule()) {
					sequence_SizeFeature(context, (SizeFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.STATIC_FIGURE:
				if(context == grammarAccess.getStaticFigureRule()) {
					sequence_StaticFigure(context, (StaticFigure) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.STRING_FEATURE:
				if(context == grammarAccess.getStringFeatureRule()) {
					sequence_StringFeature(context, (StringFeature) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.STYLE:
				if(context == grammarAccess.getStyleRule()) {
					sequence_Style(context, (Style) semanticObject); 
					return; 
				}
				else break;
			case XdiagramPackage.XDIAGRAM:
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
	 *     (key='text-align' (value='left' | value='middle' | value='right'))
	 */
	protected void sequence_AlignFeature(EObject context, AlignFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=ID (type='incoming' | type='outgoing' | type='both') N=INT?)
	 */
	protected void sequence_ArrowAnchor(EObject context, ArrowAnchor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (key=ID value=AtributeValue)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.ATTRIBUTE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.ATTRIBUTE__KEY));
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getKeyIDTerminalRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getAttributeAccess().getValueAtributeValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=AtributeExpression? (key='text-editable' | key='font-italic' | key='font-bold') (value='true' | value='false'))
	 */
	protected void sequence_BooleanFeature(EObject context, BooleanFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key='center' (value='horizontal' | value='vertical' | value='both'))
	 */
	protected void sequence_CenterFeature(EObject context, CenterFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expression=AtributeExpression? 
	 *         (key='background' | key='foreground' | key='border') 
	 *         (value=Color | rgb=RGB) 
	 *         (atribute=ID (operator='=' | operator='<>') option=ID)?
	 *     )
	 */
	protected void sequence_ColorFeature(EObject context, ColorFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((pos=INT | source?='source' | target?='target' | middle?='middle') placingStatic=StaticFigure? placingDynamic+=DynamicFigure*)
	 */
	protected void sequence_Decorator(EObject context, Decorator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (figure=DynamicElement features=FigureFeatures)
	 */
	protected void sequence_DynamicFigure(EObject context, DynamicFigure semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.DYNAMIC_FIGURE__FIGURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.DYNAMIC_FIGURE__FIGURE));
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.DYNAMIC_FIGURE__FEATURES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.DYNAMIC_FIGURE__FEATURES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDynamicFigureAccess().getFigureDynamicElementParserRuleCall_1_0(), semanticObject.getFigure());
		feeder.accept(grammarAccess.getDynamicFigureAccess().getFeaturesFigureFeaturesParserRuleCall_3_0(), semanticObject.getFeatures());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             linefeatures+=LineFeature | 
	 *             centerfeatures+=CenterFeature | 
	 *             alignfeatures+=AlignFeature | 
	 *             gradientfeatures+=GradientFeature | 
	 *             pointfeatures+=PointFeature | 
	 *             sizefeatures+=SizeFeature | 
	 *             positionfeatures+=PositionFeature | 
	 *             colorfeatures+=ColorFeature | 
	 *             integerfeatures+=IntegerFeature | 
	 *             booleanfeatures+=BooleanFeature | 
	 *             stringfeatures+=StringFeature
	 *         )*
	 *     )
	 */
	protected void sequence_FigureFeatures(EObject context, FigureFeatures semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         key='gradient' 
	 *         (
	 *             value='BlueWhite' | 
	 *             value='BlueWhiteGloss' | 
	 *             value='CopperWhiteGloss' | 
	 *             value='LightGray' | 
	 *             value='LightYellow' | 
	 *             value='SilverWhiteGloss' | 
	 *             value='LimeWhite'
	 *         )
	 *     )
	 */
	protected void sequence_GradientFeature(EObject context, GradientFeature semanticObject) {
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
	 *     (
	 *         expression=AtributeExpression? 
	 *         (
	 *             key='line-width' | 
	 *             key='top' | 
	 *             key='left' | 
	 *             key='width' | 
	 *             key='height' | 
	 *             key='angle' | 
	 *             key='corner' | 
	 *             key='transparency' | 
	 *             key='font-size'
	 *         ) 
	 *         value=INT
	 *     )
	 */
	protected void sequence_IntegerFeature(EObject context, IntegerFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key='layout' (value='horizontal' | value='vertical' | value='over'))
	 */
	protected void sequence_LayoutFeature(EObject context, LayoutFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=AtributeExpression? key='line-style' value=LineStyle)
	 */
	protected void sequence_LineFeature(EObject context, LineFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             modelReference=[EReference|QualifiedName] | 
	 *             (complex?='object' modelClass=[EClass|QualifiedName] sourceReference=[EReference|QualifiedName] targetReference=[EReference|QualifiedName])
	 *         ) 
	 *         manhattan?='manhattan'? 
	 *         style=ID? 
	 *         icon=ID? 
	 *         name=STRING? 
	 *         (attributes+=Attribute | linefeatures+=LineFeature | colorfeatures+=ColorFeature | integerfeatures+=IntegerFeature)* 
	 *         decorators+=Decorator*
	 *     )
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         object=ID? 
	 *         passX='-'? 
	 *         X=INT 
	 *         (formatX='%' | formatX='lf' | formatX='rg') 
	 *         passY='-'? 
	 *         Y=INT 
	 *         (formatY='%' | formatY='up' | formatY='dw') 
	 *         figures+=NodeFigure* 
	 *         arrows+=ArrowAnchor*
	 *     )
	 */
	protected void sequence_NodeAnchor(EObject context, NodeAnchor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (layout=ContainerLayout? modelReference=[EReference|QualifiedName]? (value=INT (format='%' | format='px'))? figures+=NodeFigure+)
	 */
	protected void sequence_NodeContainer(EObject context, NodeContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (option='main'? figure=FigureShape style=ID? features=FigureFeatures)
	 */
	protected void sequence_NodeFigure(EObject context, NodeFigure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         modelClass=[EClass|QualifiedName] 
	 *         resizable?='resizable'? 
	 *         style=ID? 
	 *         icon=ID? 
	 *         name=STRING? 
	 *         attributes+=Attribute* 
	 *         figures+=NodeFigure* 
	 *         containers+=NodeContainer* 
	 *         anchors+=NodeAnchor*
	 *     )
	 */
	protected void sequence_Node(EObject context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (X=INT Y=INT)
	 */
	protected void sequence_PointFeature(EObject context, PointFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.POINT_FEATURE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.POINT_FEATURE__X));
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.POINT_FEATURE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.POINT_FEATURE__Y));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPointFeatureAccess().getXINTTerminalRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPointFeatureAccess().getYINTTerminalRuleCall_4_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (X=INT Y=INT)
	 */
	protected void sequence_PositionFeature(EObject context, PositionFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.POSITION_FEATURE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.POSITION_FEATURE__X));
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.POSITION_FEATURE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.POSITION_FEATURE__Y));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPositionFeatureAccess().getXINTTerminalRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPositionFeatureAccess().getYINTTerminalRuleCall_4_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (R=INT G=INT B=INT)
	 */
	protected void sequence_RGB(EObject context, RGB semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.RGB__R) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.RGB__R));
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.RGB__G) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.RGB__G));
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.RGB__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.RGB__B));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRGBAccess().getRINTTerminalRuleCall_2_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getRGBAccess().getGINTTerminalRuleCall_4_0(), semanticObject.getG());
		feeder.accept(grammarAccess.getRGBAccess().getBINTTerminalRuleCall_6_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (Width=INT Height=INT)
	 */
	protected void sequence_SizeFeature(EObject context, SizeFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.SIZE_FEATURE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.SIZE_FEATURE__WIDTH));
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.SIZE_FEATURE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.SIZE_FEATURE__HEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeFeatureAccess().getWidthINTTerminalRuleCall_2_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSizeFeatureAccess().getHeightINTTerminalRuleCall_4_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (figure=StaticElement style=ID? features=FigureFeatures)
	 */
	protected void sequence_StaticFigure(EObject context, StaticFigure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expression=AtributeExpression? 
	 *         (key='text-value' | key='font-name' | key='icon') 
	 *         (value=STRING | (valueL=STRING attribute=ID) | (attribute=ID valueR=STRING) | attribute=ID | (valueL=STRING attribute=ID valueR=STRING))?
	 *     )
	 */
	protected void sequence_StringFeature(EObject context, StringFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID features=FigureFeatures)
	 */
	protected void sequence_Style(EObject context, Style semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.STYLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.STYLE__NAME));
			if(transientValues.isValueTransient(semanticObject, XdiagramPackage.Literals.STYLE__FEATURES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XdiagramPackage.Literals.STYLE__FEATURES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStyleAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStyleAccess().getFeaturesFigureFeaturesParserRuleCall_4_0(), semanticObject.getFeatures());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (importURI=STRING imports+=ImportStatement modelClass=[EClass|QualifiedName] styles+=Style* (nodes+=Node | links+=Link)*)
	 */
	protected void sequence_XDiagram(EObject context, XDiagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
