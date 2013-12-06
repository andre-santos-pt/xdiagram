/*
* generated by Xtext
*/
package org.eclipselabs.xdiagram.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.xdiagram.xtext.services.XDiagramGrammarAccess;

public class XDiagramParser extends AbstractContentAssistParser {
	
	@Inject
	private XDiagramGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.xdiagram.xtext.ui.contentassist.antlr.internal.InternalXDiagramParser createParser() {
		org.eclipselabs.xdiagram.xtext.ui.contentassist.antlr.internal.InternalXDiagramParser result = new org.eclipselabs.xdiagram.xtext.ui.contentassist.antlr.internal.InternalXDiagramParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getXDiagramAccess().getAlternatives_6(), "rule__XDiagram__Alternatives_6");
					put(grammarAccess.getNodeContainerAccess().getTypeAlternatives_0_0(), "rule__NodeContainer__TypeAlternatives_0_0");
					put(grammarAccess.getNodeContainerAccess().getFormatAlternatives_3_2_0(), "rule__NodeContainer__FormatAlternatives_3_2_0");
					put(grammarAccess.getLinkAccess().getAlternatives_1(), "rule__Link__Alternatives_1");
					put(grammarAccess.getLinkAccess().getAlternatives_5(), "rule__Link__Alternatives_5");
					put(grammarAccess.getDynamicElementAccess().getAlternatives(), "rule__DynamicElement__Alternatives");
					put(grammarAccess.getStaticElementAccess().getAlternatives(), "rule__StaticElement__Alternatives");
					put(grammarAccess.getNodeAnchorAccess().getFormatXAlternatives_5_0(), "rule__NodeAnchor__FormatXAlternatives_5_0");
					put(grammarAccess.getNodeAnchorAccess().getFormatYAlternatives_9_0(), "rule__NodeAnchor__FormatYAlternatives_9_0");
					put(grammarAccess.getArrowAnchorAccess().getTypeAlternatives_3_0(), "rule__ArrowAnchor__TypeAlternatives_3_0");
					put(grammarAccess.getFigureFeaturesAccess().getAlternatives_1(), "rule__FigureFeatures__Alternatives_1");
					put(grammarAccess.getStyleFeatureAccess().getAlternatives(), "rule__StyleFeature__Alternatives");
					put(grammarAccess.getLayoutFeatureAccess().getValueAlternatives_2_0(), "rule__LayoutFeature__ValueAlternatives_2_0");
					put(grammarAccess.getCenterFeatureAccess().getValueAlternatives_2_0(), "rule__CenterFeature__ValueAlternatives_2_0");
					put(grammarAccess.getAlignFeatureAccess().getValueAlternatives_2_0(), "rule__AlignFeature__ValueAlternatives_2_0");
					put(grammarAccess.getGradientFeatureAccess().getValueAlternatives_2_0(), "rule__GradientFeature__ValueAlternatives_2_0");
					put(grammarAccess.getColorFeatureAccess().getKeyAlternatives_1_0(), "rule__ColorFeature__KeyAlternatives_1_0");
					put(grammarAccess.getColorFeatureAccess().getAlternatives_3(), "rule__ColorFeature__Alternatives_3");
					put(grammarAccess.getColorFeatureAccess().getOperatorAlternatives_4_2_0(), "rule__ColorFeature__OperatorAlternatives_4_2_0");
					put(grammarAccess.getColorAccess().getAlternatives(), "rule__Color__Alternatives");
					put(grammarAccess.getIntegerFeatureAccess().getKeyAlternatives_1_0(), "rule__IntegerFeature__KeyAlternatives_1_0");
					put(grammarAccess.getStringFeatureAccess().getKeyAlternatives_1_0(), "rule__StringFeature__KeyAlternatives_1_0");
					put(grammarAccess.getStringFeatureAccess().getAlternatives_3(), "rule__StringFeature__Alternatives_3");
					put(grammarAccess.getBooleanFeatureAccess().getKeyAlternatives_1_0(), "rule__BooleanFeature__KeyAlternatives_1_0");
					put(grammarAccess.getBooleanFeatureAccess().getValueAlternatives_3_0(), "rule__BooleanFeature__ValueAlternatives_3_0");
					put(grammarAccess.getLineStyleAccess().getAlternatives(), "rule__LineStyle__Alternatives");
					put(grammarAccess.getAtributeExpressionAccess().getOperatorAlternatives_1_0(), "rule__AtributeExpression__OperatorAlternatives_1_0");
					put(grammarAccess.getAtributeValueAccess().getAlternatives(), "rule__AtributeValue__Alternatives");
					put(grammarAccess.getAtributeValueAccess().getValueBOOLAlternatives_3_0(), "rule__AtributeValue__ValueBOOLAlternatives_3_0");
					put(grammarAccess.getFigureShapeAccess().getAlternatives(), "rule__FigureShape__Alternatives");
					put(grammarAccess.getXDiagramAccess().getGroup(), "rule__XDiagram__Group__0");
					put(grammarAccess.getImportStatementAccess().getGroup(), "rule__ImportStatement__Group__0");
					put(grammarAccess.getImportStatementAccess().getGroup_1(), "rule__ImportStatement__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup(), "rule__QualifiedNameWithWildCard__Group__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1(), "rule__QualifiedNameWithWildCard__Group_1__0");
					put(grammarAccess.getStyleAccess().getGroup(), "rule__Style__Group__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getNodeAccess().getGroup_4(), "rule__Node__Group_4__0");
					put(grammarAccess.getNodeAccess().getGroup_5(), "rule__Node__Group_5__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getNodeFigureAccess().getGroup(), "rule__NodeFigure__Group__0");
					put(grammarAccess.getNodeFigureAccess().getGroup_4(), "rule__NodeFigure__Group_4__0");
					put(grammarAccess.getNodeContainerAccess().getGroup(), "rule__NodeContainer__Group__0");
					put(grammarAccess.getNodeContainerAccess().getGroup_2(), "rule__NodeContainer__Group_2__0");
					put(grammarAccess.getNodeContainerAccess().getGroup_3(), "rule__NodeContainer__Group_3__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getLinkAccess().getGroup_1_1(), "rule__Link__Group_1_1__0");
					put(grammarAccess.getLinkAccess().getGroup_4(), "rule__Link__Group_4__0");
					put(grammarAccess.getLinkAccess().getGroup_6(), "rule__Link__Group_6__0");
					put(grammarAccess.getLinkAccess().getGroup_7(), "rule__Link__Group_7__0");
					put(grammarAccess.getPlacingFigureAccess().getGroup(), "rule__PlacingFigure__Group__0");
					put(grammarAccess.getDynamicFigureAccess().getGroup(), "rule__DynamicFigure__Group__0");
					put(grammarAccess.getStaticFigureAccess().getGroup(), "rule__StaticFigure__Group__0");
					put(grammarAccess.getStaticFigureAccess().getGroup_3(), "rule__StaticFigure__Group_3__0");
					put(grammarAccess.getNodeAnchorAccess().getGroup(), "rule__NodeAnchor__Group__0");
					put(grammarAccess.getNodeAnchorAccess().getGroup_1(), "rule__NodeAnchor__Group_1__0");
					put(grammarAccess.getArrowAnchorAccess().getGroup(), "rule__ArrowAnchor__Group__0");
					put(grammarAccess.getArrowAnchorAccess().getGroup_5(), "rule__ArrowAnchor__Group_5__0");
					put(grammarAccess.getFigureFeaturesAccess().getGroup(), "rule__FigureFeatures__Group__0");
					put(grammarAccess.getCustomFeatureAccess().getGroup(), "rule__CustomFeature__Group__0");
					put(grammarAccess.getLayoutFeatureAccess().getGroup(), "rule__LayoutFeature__Group__0");
					put(grammarAccess.getCenterFeatureAccess().getGroup(), "rule__CenterFeature__Group__0");
					put(grammarAccess.getAlignFeatureAccess().getGroup(), "rule__AlignFeature__Group__0");
					put(grammarAccess.getGradientFeatureAccess().getGroup(), "rule__GradientFeature__Group__0");
					put(grammarAccess.getPointFeatureAccess().getGroup(), "rule__PointFeature__Group__0");
					put(grammarAccess.getSizeFeatureAccess().getGroup(), "rule__SizeFeature__Group__0");
					put(grammarAccess.getPositionFeatureAccess().getGroup(), "rule__PositionFeature__Group__0");
					put(grammarAccess.getColorFeatureAccess().getGroup(), "rule__ColorFeature__Group__0");
					put(grammarAccess.getColorFeatureAccess().getGroup_4(), "rule__ColorFeature__Group_4__0");
					put(grammarAccess.getRGBAccess().getGroup(), "rule__RGB__Group__0");
					put(grammarAccess.getIntegerFeatureAccess().getGroup(), "rule__IntegerFeature__Group__0");
					put(grammarAccess.getDoubleFeatureAccess().getGroup(), "rule__DoubleFeature__Group__0");
					put(grammarAccess.getDoubleFeatureAccess().getGroup_3(), "rule__DoubleFeature__Group_3__0");
					put(grammarAccess.getStringFeatureAccess().getGroup(), "rule__StringFeature__Group__0");
					put(grammarAccess.getStringFeatureAccess().getGroup_3_1(), "rule__StringFeature__Group_3_1__0");
					put(grammarAccess.getStringFeatureAccess().getGroup_3_2(), "rule__StringFeature__Group_3_2__0");
					put(grammarAccess.getStringFeatureAccess().getGroup_3_4(), "rule__StringFeature__Group_3_4__0");
					put(grammarAccess.getBooleanFeatureAccess().getGroup(), "rule__BooleanFeature__Group__0");
					put(grammarAccess.getLineFeatureAccess().getGroup(), "rule__LineFeature__Group__0");
					put(grammarAccess.getAtributeExpressionAccess().getGroup(), "rule__AtributeExpression__Group__0");
					put(grammarAccess.getAtributeValueAccess().getGroup_1(), "rule__AtributeValue__Group_1__0");
					put(grammarAccess.getAtributeValueAccess().getGroup_5(), "rule__AtributeValue__Group_5__0");
					put(grammarAccess.getXDiagramAccess().getImportURIAssignment_1(), "rule__XDiagram__ImportURIAssignment_1");
					put(grammarAccess.getXDiagramAccess().getImportsAssignment_2(), "rule__XDiagram__ImportsAssignment_2");
					put(grammarAccess.getXDiagramAccess().getStylesAssignment_3(), "rule__XDiagram__StylesAssignment_3");
					put(grammarAccess.getXDiagramAccess().getModelClassAssignment_5(), "rule__XDiagram__ModelClassAssignment_5");
					put(grammarAccess.getXDiagramAccess().getNodesAssignment_6_0(), "rule__XDiagram__NodesAssignment_6_0");
					put(grammarAccess.getXDiagramAccess().getLinksAssignment_6_1(), "rule__XDiagram__LinksAssignment_6_1");
					put(grammarAccess.getImportStatementAccess().getImportedNamespaceAssignment_1_1(), "rule__ImportStatement__ImportedNamespaceAssignment_1_1");
					put(grammarAccess.getStyleAccess().getNameAssignment_2(), "rule__Style__NameAssignment_2");
					put(grammarAccess.getStyleAccess().getFeaturesAssignment_4(), "rule__Style__FeaturesAssignment_4");
					put(grammarAccess.getNodeAccess().getModelClassAssignment_1(), "rule__Node__ModelClassAssignment_1");
					put(grammarAccess.getNodeAccess().getResizableAssignment_3(), "rule__Node__ResizableAssignment_3");
					put(grammarAccess.getNodeAccess().getStyleAssignment_4_1(), "rule__Node__StyleAssignment_4_1");
					put(grammarAccess.getNodeAccess().getIconAssignment_5_1(), "rule__Node__IconAssignment_5_1");
					put(grammarAccess.getNodeAccess().getAttributesAssignment_6(), "rule__Node__AttributesAssignment_6");
					put(grammarAccess.getNodeAccess().getFiguresAssignment_7(), "rule__Node__FiguresAssignment_7");
					put(grammarAccess.getNodeAccess().getContainersAssignment_8(), "rule__Node__ContainersAssignment_8");
					put(grammarAccess.getNodeAccess().getAnchorsAssignment_9(), "rule__Node__AnchorsAssignment_9");
					put(grammarAccess.getAttributeAccess().getKeyAssignment_1(), "rule__Attribute__KeyAssignment_1");
					put(grammarAccess.getAttributeAccess().getValueAssignment_3(), "rule__Attribute__ValueAssignment_3");
					put(grammarAccess.getNodeFigureAccess().getOptionAssignment_0(), "rule__NodeFigure__OptionAssignment_0");
					put(grammarAccess.getNodeFigureAccess().getFigureAssignment_3(), "rule__NodeFigure__FigureAssignment_3");
					put(grammarAccess.getNodeFigureAccess().getStyleAssignment_4_3(), "rule__NodeFigure__StyleAssignment_4_3");
					put(grammarAccess.getNodeFigureAccess().getFeaturesAssignment_6(), "rule__NodeFigure__FeaturesAssignment_6");
					put(grammarAccess.getNodeContainerAccess().getTypeAssignment_0(), "rule__NodeContainer__TypeAssignment_0");
					put(grammarAccess.getNodeContainerAccess().getModelClassAssignment_2_1(), "rule__NodeContainer__ModelClassAssignment_2_1");
					put(grammarAccess.getNodeContainerAccess().getValueAssignment_3_1(), "rule__NodeContainer__ValueAssignment_3_1");
					put(grammarAccess.getNodeContainerAccess().getFormatAssignment_3_2(), "rule__NodeContainer__FormatAssignment_3_2");
					put(grammarAccess.getNodeContainerAccess().getFiguresAssignment_5(), "rule__NodeContainer__FiguresAssignment_5");
					put(grammarAccess.getLinkAccess().getModelReferenceAssignment_1_0(), "rule__Link__ModelReferenceAssignment_1_0");
					put(grammarAccess.getLinkAccess().getComplexAssignment_1_1_0(), "rule__Link__ComplexAssignment_1_1_0");
					put(grammarAccess.getLinkAccess().getModelClassAssignment_1_1_1(), "rule__Link__ModelClassAssignment_1_1_1");
					put(grammarAccess.getLinkAccess().getSourceReferenceAssignment_1_1_3(), "rule__Link__SourceReferenceAssignment_1_1_3");
					put(grammarAccess.getLinkAccess().getTargetReferenceAssignment_1_1_5(), "rule__Link__TargetReferenceAssignment_1_1_5");
					put(grammarAccess.getLinkAccess().getManhattanAssignment_3(), "rule__Link__ManhattanAssignment_3");
					put(grammarAccess.getLinkAccess().getStyleAssignment_4_1(), "rule__Link__StyleAssignment_4_1");
					put(grammarAccess.getLinkAccess().getAttributesAssignment_5_0(), "rule__Link__AttributesAssignment_5_0");
					put(grammarAccess.getLinkAccess().getLinefeaturesAssignment_5_1(), "rule__Link__LinefeaturesAssignment_5_1");
					put(grammarAccess.getLinkAccess().getColorfeaturesAssignment_5_2(), "rule__Link__ColorfeaturesAssignment_5_2");
					put(grammarAccess.getLinkAccess().getIntegerfeaturesAssignment_5_3(), "rule__Link__IntegerfeaturesAssignment_5_3");
					put(grammarAccess.getLinkAccess().getSourceStaticAssignment_6_2(), "rule__Link__SourceStaticAssignment_6_2");
					put(grammarAccess.getLinkAccess().getSourceDynamicAssignment_6_3(), "rule__Link__SourceDynamicAssignment_6_3");
					put(grammarAccess.getLinkAccess().getTargetStaticAssignment_7_2(), "rule__Link__TargetStaticAssignment_7_2");
					put(grammarAccess.getLinkAccess().getTargetDynamicAssignment_7_3(), "rule__Link__TargetDynamicAssignment_7_3");
					put(grammarAccess.getLinkAccess().getPlacingsAssignment_8(), "rule__Link__PlacingsAssignment_8");
					put(grammarAccess.getPlacingFigureAccess().getPosAssignment_2(), "rule__PlacingFigure__PosAssignment_2");
					put(grammarAccess.getPlacingFigureAccess().getPlacingStaticAssignment_5(), "rule__PlacingFigure__PlacingStaticAssignment_5");
					put(grammarAccess.getPlacingFigureAccess().getPlacingDynamicAssignment_6(), "rule__PlacingFigure__PlacingDynamicAssignment_6");
					put(grammarAccess.getDynamicFigureAccess().getFigureAssignment_1(), "rule__DynamicFigure__FigureAssignment_1");
					put(grammarAccess.getDynamicFigureAccess().getFeaturesAssignment_3(), "rule__DynamicFigure__FeaturesAssignment_3");
					put(grammarAccess.getStaticFigureAccess().getFigureAssignment_2(), "rule__StaticFigure__FigureAssignment_2");
					put(grammarAccess.getStaticFigureAccess().getStyleAssignment_3_3(), "rule__StaticFigure__StyleAssignment_3_3");
					put(grammarAccess.getStaticFigureAccess().getFeaturesAssignment_5(), "rule__StaticFigure__FeaturesAssignment_5");
					put(grammarAccess.getNodeAnchorAccess().getObjectAssignment_1_1(), "rule__NodeAnchor__ObjectAssignment_1_1");
					put(grammarAccess.getNodeAnchorAccess().getPassXAssignment_3(), "rule__NodeAnchor__PassXAssignment_3");
					put(grammarAccess.getNodeAnchorAccess().getXAssignment_4(), "rule__NodeAnchor__XAssignment_4");
					put(grammarAccess.getNodeAnchorAccess().getFormatXAssignment_5(), "rule__NodeAnchor__FormatXAssignment_5");
					put(grammarAccess.getNodeAnchorAccess().getPassYAssignment_7(), "rule__NodeAnchor__PassYAssignment_7");
					put(grammarAccess.getNodeAnchorAccess().getYAssignment_8(), "rule__NodeAnchor__YAssignment_8");
					put(grammarAccess.getNodeAnchorAccess().getFormatYAssignment_9(), "rule__NodeAnchor__FormatYAssignment_9");
					put(grammarAccess.getNodeAnchorAccess().getFiguresAssignment_11(), "rule__NodeAnchor__FiguresAssignment_11");
					put(grammarAccess.getNodeAnchorAccess().getArrowsAssignment_12(), "rule__NodeAnchor__ArrowsAssignment_12");
					put(grammarAccess.getArrowAnchorAccess().getReferenceAssignment_1(), "rule__ArrowAnchor__ReferenceAssignment_1");
					put(grammarAccess.getArrowAnchorAccess().getTypeAssignment_3(), "rule__ArrowAnchor__TypeAssignment_3");
					put(grammarAccess.getArrowAnchorAccess().getNAssignment_5_1(), "rule__ArrowAnchor__NAssignment_5_1");
					put(grammarAccess.getFigureFeaturesAccess().getLinefeaturesAssignment_1_0(), "rule__FigureFeatures__LinefeaturesAssignment_1_0");
					put(grammarAccess.getFigureFeaturesAccess().getCenterfeaturesAssignment_1_1(), "rule__FigureFeatures__CenterfeaturesAssignment_1_1");
					put(grammarAccess.getFigureFeaturesAccess().getAlignfeaturesAssignment_1_2(), "rule__FigureFeatures__AlignfeaturesAssignment_1_2");
					put(grammarAccess.getFigureFeaturesAccess().getGradientfeaturesAssignment_1_3(), "rule__FigureFeatures__GradientfeaturesAssignment_1_3");
					put(grammarAccess.getFigureFeaturesAccess().getPointfeaturesAssignment_1_4(), "rule__FigureFeatures__PointfeaturesAssignment_1_4");
					put(grammarAccess.getFigureFeaturesAccess().getSizefeaturesAssignment_1_5(), "rule__FigureFeatures__SizefeaturesAssignment_1_5");
					put(grammarAccess.getFigureFeaturesAccess().getPositionfeaturesAssignment_1_6(), "rule__FigureFeatures__PositionfeaturesAssignment_1_6");
					put(grammarAccess.getFigureFeaturesAccess().getColorfeaturesAssignment_1_7(), "rule__FigureFeatures__ColorfeaturesAssignment_1_7");
					put(grammarAccess.getFigureFeaturesAccess().getIntegerfeaturesAssignment_1_8(), "rule__FigureFeatures__IntegerfeaturesAssignment_1_8");
					put(grammarAccess.getFigureFeaturesAccess().getBooleanfeaturesAssignment_1_9(), "rule__FigureFeatures__BooleanfeaturesAssignment_1_9");
					put(grammarAccess.getFigureFeaturesAccess().getStringfeaturesAssignment_1_10(), "rule__FigureFeatures__StringfeaturesAssignment_1_10");
					put(grammarAccess.getFigureFeaturesAccess().getCustomfeaturesAssignment_1_11(), "rule__FigureFeatures__CustomfeaturesAssignment_1_11");
					put(grammarAccess.getCustomFeatureAccess().getKeyAssignment_0(), "rule__CustomFeature__KeyAssignment_0");
					put(grammarAccess.getCustomFeatureAccess().getAttributeAssignment_2(), "rule__CustomFeature__AttributeAssignment_2");
					put(grammarAccess.getCustomFeatureAccess().getValueAssignment_4(), "rule__CustomFeature__ValueAssignment_4");
					put(grammarAccess.getLayoutFeatureAccess().getKeyAssignment_0(), "rule__LayoutFeature__KeyAssignment_0");
					put(grammarAccess.getLayoutFeatureAccess().getValueAssignment_2(), "rule__LayoutFeature__ValueAssignment_2");
					put(grammarAccess.getCenterFeatureAccess().getKeyAssignment_0(), "rule__CenterFeature__KeyAssignment_0");
					put(grammarAccess.getCenterFeatureAccess().getValueAssignment_2(), "rule__CenterFeature__ValueAssignment_2");
					put(grammarAccess.getAlignFeatureAccess().getKeyAssignment_0(), "rule__AlignFeature__KeyAssignment_0");
					put(grammarAccess.getAlignFeatureAccess().getValueAssignment_2(), "rule__AlignFeature__ValueAssignment_2");
					put(grammarAccess.getGradientFeatureAccess().getKeyAssignment_0(), "rule__GradientFeature__KeyAssignment_0");
					put(grammarAccess.getGradientFeatureAccess().getValueAssignment_2(), "rule__GradientFeature__ValueAssignment_2");
					put(grammarAccess.getPointFeatureAccess().getXAssignment_2(), "rule__PointFeature__XAssignment_2");
					put(grammarAccess.getPointFeatureAccess().getYAssignment_4(), "rule__PointFeature__YAssignment_4");
					put(grammarAccess.getSizeFeatureAccess().getWidthAssignment_2(), "rule__SizeFeature__WidthAssignment_2");
					put(grammarAccess.getSizeFeatureAccess().getHeightAssignment_4(), "rule__SizeFeature__HeightAssignment_4");
					put(grammarAccess.getPositionFeatureAccess().getXAssignment_2(), "rule__PositionFeature__XAssignment_2");
					put(grammarAccess.getPositionFeatureAccess().getYAssignment_4(), "rule__PositionFeature__YAssignment_4");
					put(grammarAccess.getColorFeatureAccess().getExpressionAssignment_0(), "rule__ColorFeature__ExpressionAssignment_0");
					put(grammarAccess.getColorFeatureAccess().getKeyAssignment_1(), "rule__ColorFeature__KeyAssignment_1");
					put(grammarAccess.getColorFeatureAccess().getValueAssignment_3_0(), "rule__ColorFeature__ValueAssignment_3_0");
					put(grammarAccess.getColorFeatureAccess().getRgbAssignment_3_1(), "rule__ColorFeature__RgbAssignment_3_1");
					put(grammarAccess.getColorFeatureAccess().getAtributeAssignment_4_1(), "rule__ColorFeature__AtributeAssignment_4_1");
					put(grammarAccess.getColorFeatureAccess().getOperatorAssignment_4_2(), "rule__ColorFeature__OperatorAssignment_4_2");
					put(grammarAccess.getColorFeatureAccess().getOptionAssignment_4_3(), "rule__ColorFeature__OptionAssignment_4_3");
					put(grammarAccess.getRGBAccess().getRAssignment_2(), "rule__RGB__RAssignment_2");
					put(grammarAccess.getRGBAccess().getGAssignment_4(), "rule__RGB__GAssignment_4");
					put(grammarAccess.getRGBAccess().getBAssignment_6(), "rule__RGB__BAssignment_6");
					put(grammarAccess.getIntegerFeatureAccess().getExpressionAssignment_0(), "rule__IntegerFeature__ExpressionAssignment_0");
					put(grammarAccess.getIntegerFeatureAccess().getKeyAssignment_1(), "rule__IntegerFeature__KeyAssignment_1");
					put(grammarAccess.getIntegerFeatureAccess().getValueAssignment_3(), "rule__IntegerFeature__ValueAssignment_3");
					put(grammarAccess.getDoubleFeatureAccess().getKeyAssignment_0(), "rule__DoubleFeature__KeyAssignment_0");
					put(grammarAccess.getDoubleFeatureAccess().getValueAssignment_2(), "rule__DoubleFeature__ValueAssignment_2");
					put(grammarAccess.getStringFeatureAccess().getExpressionAssignment_0(), "rule__StringFeature__ExpressionAssignment_0");
					put(grammarAccess.getStringFeatureAccess().getKeyAssignment_1(), "rule__StringFeature__KeyAssignment_1");
					put(grammarAccess.getStringFeatureAccess().getValueAssignment_3_0(), "rule__StringFeature__ValueAssignment_3_0");
					put(grammarAccess.getStringFeatureAccess().getValueLAssignment_3_1_0(), "rule__StringFeature__ValueLAssignment_3_1_0");
					put(grammarAccess.getStringFeatureAccess().getAttributeAssignment_3_1_2(), "rule__StringFeature__AttributeAssignment_3_1_2");
					put(grammarAccess.getStringFeatureAccess().getAttributeAssignment_3_2_0(), "rule__StringFeature__AttributeAssignment_3_2_0");
					put(grammarAccess.getStringFeatureAccess().getValueRAssignment_3_2_2(), "rule__StringFeature__ValueRAssignment_3_2_2");
					put(grammarAccess.getStringFeatureAccess().getAttributeAssignment_3_3(), "rule__StringFeature__AttributeAssignment_3_3");
					put(grammarAccess.getStringFeatureAccess().getValueLAssignment_3_4_0(), "rule__StringFeature__ValueLAssignment_3_4_0");
					put(grammarAccess.getStringFeatureAccess().getAttributeAssignment_3_4_2(), "rule__StringFeature__AttributeAssignment_3_4_2");
					put(grammarAccess.getStringFeatureAccess().getValueRAssignment_3_4_4(), "rule__StringFeature__ValueRAssignment_3_4_4");
					put(grammarAccess.getBooleanFeatureAccess().getExpressionAssignment_0(), "rule__BooleanFeature__ExpressionAssignment_0");
					put(grammarAccess.getBooleanFeatureAccess().getKeyAssignment_1(), "rule__BooleanFeature__KeyAssignment_1");
					put(grammarAccess.getBooleanFeatureAccess().getValueAssignment_3(), "rule__BooleanFeature__ValueAssignment_3");
					put(grammarAccess.getLineFeatureAccess().getExpressionAssignment_0(), "rule__LineFeature__ExpressionAssignment_0");
					put(grammarAccess.getLineFeatureAccess().getKeyAssignment_1(), "rule__LineFeature__KeyAssignment_1");
					put(grammarAccess.getLineFeatureAccess().getValueAssignment_3(), "rule__LineFeature__ValueAssignment_3");
					put(grammarAccess.getAtributeExpressionAccess().getKeyAssignment_0(), "rule__AtributeExpression__KeyAssignment_0");
					put(grammarAccess.getAtributeExpressionAccess().getOperatorAssignment_1(), "rule__AtributeExpression__OperatorAssignment_1");
					put(grammarAccess.getAtributeExpressionAccess().getValueAssignment_2(), "rule__AtributeExpression__ValueAssignment_2");
					put(grammarAccess.getAtributeValueAccess().getValueINTAssignment_0(), "rule__AtributeValue__ValueINTAssignment_0");
					put(grammarAccess.getAtributeValueAccess().getValueINTAssignment_1_0(), "rule__AtributeValue__ValueINTAssignment_1_0");
					put(grammarAccess.getAtributeValueAccess().getValueDECAssignment_1_2(), "rule__AtributeValue__ValueDECAssignment_1_2");
					put(grammarAccess.getAtributeValueAccess().getValueIDAssignment_2(), "rule__AtributeValue__ValueIDAssignment_2");
					put(grammarAccess.getAtributeValueAccess().getValueBOOLAssignment_3(), "rule__AtributeValue__ValueBOOLAssignment_3");
					put(grammarAccess.getAtributeValueAccess().getValueSTRINGAssignment_4(), "rule__AtributeValue__ValueSTRINGAssignment_4");
					put(grammarAccess.getAtributeValueAccess().getValueDAYAssignment_5_0(), "rule__AtributeValue__ValueDAYAssignment_5_0");
					put(grammarAccess.getAtributeValueAccess().getValueMONTHAssignment_5_2(), "rule__AtributeValue__ValueMONTHAssignment_5_2");
					put(grammarAccess.getAtributeValueAccess().getValueYEARAssignment_5_4(), "rule__AtributeValue__ValueYEARAssignment_5_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipselabs.xdiagram.xtext.ui.contentassist.antlr.internal.InternalXDiagramParser typedParser = (org.eclipselabs.xdiagram.xtext.ui.contentassist.antlr.internal.InternalXDiagramParser) parser;
			typedParser.entryRuleXDiagram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public XDiagramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XDiagramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}