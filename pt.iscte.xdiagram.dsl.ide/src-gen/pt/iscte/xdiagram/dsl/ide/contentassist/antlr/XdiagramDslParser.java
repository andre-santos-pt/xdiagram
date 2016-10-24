/*
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import pt.iscte.xdiagram.dsl.ide.contentassist.antlr.internal.InternalXdiagramDslParser;
import pt.iscte.xdiagram.dsl.services.XdiagramDslGrammarAccess;

public class XdiagramDslParser extends AbstractContentAssistParser {

	@Inject
	private XdiagramDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalXdiagramDslParser createParser() {
		InternalXdiagramDslParser result = new InternalXdiagramDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getXDiagramAccess().getAlternatives_8(), "rule__XDiagram__Alternatives_8");
					put(grammarAccess.getDiagramElementAccess().getAlternatives(), "rule__DiagramElement__Alternatives");
					put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
					put(grammarAccess.getLinkedFeatureAccess().getAlternatives(), "rule__LinkedFeature__Alternatives");
					put(grammarAccess.getStyleFeatureAccess().getAlternatives(), "rule__StyleFeature__Alternatives");
					put(grammarAccess.getFeatureContainerAccess().getAlternatives(), "rule__FeatureContainer__Alternatives");
					put(grammarAccess.getChildElementAccess().getAlternatives(), "rule__ChildElement__Alternatives");
					put(grammarAccess.getLinkAccess().getAlternatives_2(), "rule__Link__Alternatives_2");
					put(grammarAccess.getLinkFeatureAccess().getAlternatives(), "rule__LinkFeature__Alternatives");
					put(grammarAccess.getColorAccess().getAlternatives(), "rule__Color__Alternatives");
					put(grammarAccess.getConnectableElementAccess().getAlternatives(), "rule__ConnectableElement__Alternatives");
					put(grammarAccess.getDecoratorElementAccess().getAlternatives(), "rule__DecoratorElement__Alternatives");
					put(grammarAccess.getConnectableElementFeatureAccess().getAlternatives(), "rule__ConnectableElementFeature__Alternatives");
					put(grammarAccess.getRectangleAccess().getAlternatives_0(), "rule__Rectangle__Alternatives_0");
					put(grammarAccess.getRectangleFeatureAccess().getAlternatives(), "rule__RectangleFeature__Alternatives");
					put(grammarAccess.getEllipseAccess().getAlternatives_0(), "rule__Ellipse__Alternatives_0");
					put(grammarAccess.getPolylineAccess().getAlternatives_0(), "rule__Polyline__Alternatives_0");
					put(grammarAccess.getLineAccess().getAlternatives_1(), "rule__Line__Alternatives_1");
					put(grammarAccess.getLineFeatureAccess().getAlternatives(), "rule__LineFeature__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getStringValueAccess().getAlternatives(), "rule__StringValue__Alternatives");
					put(grammarAccess.getFigureFeatureAccess().getAlternatives(), "rule__FigureFeature__Alternatives");
					put(grammarAccess.getLabelFeatureAccess().getAlternatives(), "rule__LabelFeature__Alternatives");
					put(grammarAccess.getImageFeatureAccess().getAlternatives(), "rule__ImageFeature__Alternatives");
					put(grammarAccess.getInvisibleFeatureAccess().getAlternatives(), "rule__InvisibleFeature__Alternatives");
					put(grammarAccess.getColorFeatureAccess().getAlternatives(), "rule__ColorFeature__Alternatives");
					put(grammarAccess.getLayoutAccess().getAlternatives_1(), "rule__Layout__Alternatives_1");
					put(grammarAccess.getTextPartAccess().getAlternatives(), "rule__TextPart__Alternatives");
					put(grammarAccess.getFontPropertiesAccess().getAlternatives_2(), "rule__FontProperties__Alternatives_2");
					put(grammarAccess.getAnchorDirectionAccess().getAlternatives(), "rule__AnchorDirection__Alternatives");
					put(grammarAccess.getDefaultColorAccess().getAlternatives(), "rule__DefaultColor__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getAlternatives(), "rule__BooleanLiteral__Alternatives");
					put(grammarAccess.getTextAlignValueAccess().getAlternatives(), "rule__TextAlignValue__Alternatives");
					put(grammarAccess.getLineTypeAccess().getAlternatives(), "rule__LineType__Alternatives");
					put(grammarAccess.getXDiagramAccess().getGroup(), "rule__XDiagram__Group__0");
					put(grammarAccess.getXDiagramAccess().getGroup_3(), "rule__XDiagram__Group_3__0");
					put(grammarAccess.getMetaModelAccess().getGroup(), "rule__MetaModel__Group__0");
					put(grammarAccess.getImportStatementAccess().getGroup(), "rule__ImportStatement__Group__0");
					put(grammarAccess.getImportStatementAccess().getGroup_1(), "rule__ImportStatement__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup(), "rule__QualifiedNameWithWildCard__Group__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1(), "rule__QualifiedNameWithWildCard__Group_1__0");
					put(grammarAccess.getDiagramAccess().getGroup(), "rule__Diagram__Group__0");
					put(grammarAccess.getToolGroupAccess().getGroup(), "rule__ToolGroup__Group__0");
					put(grammarAccess.getStyleAccess().getGroup(), "rule__Style__Group__0");
					put(grammarAccess.getStyleAccess().getGroup_2(), "rule__Style__Group_2__0");
					put(grammarAccess.getFeatureConditionalAccess().getGroup(), "rule__FeatureConditional__Group__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getNodeAccess().getGroup_0(), "rule__Node__Group_0__0");
					put(grammarAccess.getNodeAccess().getGroup_0_2(), "rule__Node__Group_0_2__0");
					put(grammarAccess.getNodeAccess().getGroup_0_3(), "rule__Node__Group_0_3__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getLinkAccess().getGroup_0(), "rule__Link__Group_0__0");
					put(grammarAccess.getLinkAccess().getGroup_0_2(), "rule__Link__Group_0_2__0");
					put(grammarAccess.getLinkAccess().getGroup_0_3(), "rule__Link__Group_0_3__0");
					put(grammarAccess.getLinkAccess().getGroup_2_0(), "rule__Link__Group_2_0__0");
					put(grammarAccess.getLinkAccess().getGroup_2_1(), "rule__Link__Group_2_1__0");
					put(grammarAccess.getLinkAccess().getGroup_3(), "rule__Link__Group_3__0");
					put(grammarAccess.getDecoratorAccess().getGroup(), "rule__Decorator__Group__0");
					put(grammarAccess.getAnchorAccess().getGroup(), "rule__Anchor__Group__0");
					put(grammarAccess.getAnchorAccess().getGroup_3(), "rule__Anchor__Group_3__0");
					put(grammarAccess.getCustomColorAccess().getGroup(), "rule__CustomColor__Group__0");
					put(grammarAccess.getCustomFigureAccess().getGroup(), "rule__CustomFigure__Group__0");
					put(grammarAccess.getCustomAccess().getGroup(), "rule__Custom__Group__0");
					put(grammarAccess.getCustomAccess().getGroup_2(), "rule__Custom__Group_2__0");
					put(grammarAccess.getCustomAccess().getGroup_5(), "rule__Custom__Group_5__0");
					put(grammarAccess.getRectangleAccess().getGroup(), "rule__Rectangle__Group__0");
					put(grammarAccess.getRectangleAccess().getGroup_1(), "rule__Rectangle__Group_1__0");
					put(grammarAccess.getRectangleAccess().getGroup_4(), "rule__Rectangle__Group_4__0");
					put(grammarAccess.getRhombusAccess().getGroup(), "rule__Rhombus__Group__0");
					put(grammarAccess.getRhombusAccess().getGroup_2(), "rule__Rhombus__Group_2__0");
					put(grammarAccess.getRhombusAccess().getGroup_5(), "rule__Rhombus__Group_5__0");
					put(grammarAccess.getEllipseAccess().getGroup(), "rule__Ellipse__Group__0");
					put(grammarAccess.getEllipseAccess().getGroup_1(), "rule__Ellipse__Group_1__0");
					put(grammarAccess.getEllipseAccess().getGroup_4(), "rule__Ellipse__Group_4__0");
					put(grammarAccess.getPolylineAccess().getGroup(), "rule__Polyline__Group__0");
					put(grammarAccess.getPolylineAccess().getGroup_1(), "rule__Polyline__Group_1__0");
					put(grammarAccess.getPolylineAccess().getGroup_7(), "rule__Polyline__Group_7__0");
					put(grammarAccess.getTriangleAccess().getGroup(), "rule__Triangle__Group__0");
					put(grammarAccess.getTriangleAccess().getGroup_2(), "rule__Triangle__Group_2__0");
					put(grammarAccess.getTriangleAccess().getGroup_5(), "rule__Triangle__Group_5__0");
					put(grammarAccess.getLineAccess().getGroup(), "rule__Line__Group__0");
					put(grammarAccess.getLineAccess().getGroup_2(), "rule__Line__Group_2__0");
					put(grammarAccess.getArrowAccess().getGroup(), "rule__Arrow__Group__0");
					put(grammarAccess.getArrowAccess().getGroup_2(), "rule__Arrow__Group_2__0");
					put(grammarAccess.getContainsAccess().getGroup(), "rule__Contains__Group__0");
					put(grammarAccess.getDoubleValueAccess().getGroup(), "rule__DoubleValue__Group__0");
					put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
					put(grammarAccess.getLabelAccess().getGroup_2(), "rule__Label__Group_2__0");
					put(grammarAccess.getLabelAccess().getGroup_5(), "rule__Label__Group_5__0");
					put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
					put(grammarAccess.getImageAccess().getGroup_2(), "rule__Image__Group_2__0");
					put(grammarAccess.getImageAccess().getGroup_5(), "rule__Image__Group_5__0");
					put(grammarAccess.getInvisibleAccess().getGroup(), "rule__Invisible__Group__0");
					put(grammarAccess.getInvisibleAccess().getGroup_2(), "rule__Invisible__Group_2__0");
					put(grammarAccess.getInvisibleAccess().getGroup_5(), "rule__Invisible__Group_5__0");
					put(grammarAccess.getForegroundAccess().getGroup(), "rule__Foreground__Group__0");
					put(grammarAccess.getBackgroundAccess().getGroup(), "rule__Background__Group__0");
					put(grammarAccess.getTransparencyAccess().getGroup(), "rule__Transparency__Group__0");
					put(grammarAccess.getSizeAccess().getGroup(), "rule__Size__Group__0");
					put(grammarAccess.getSizeAccess().getGroup_3(), "rule__Size__Group_3__0");
					put(grammarAccess.getPointAccess().getGroup(), "rule__Point__Group__0");
					put(grammarAccess.getPositionAccess().getGroup(), "rule__Position__Group__0");
					put(grammarAccess.getCornerAccess().getGroup(), "rule__Corner__Group__0");
					put(grammarAccess.getLayoutAccess().getGroup(), "rule__Layout__Group__0");
					put(grammarAccess.getLayoutAccess().getGroup_2(), "rule__Layout__Group_2__0");
					put(grammarAccess.getVisibleAccess().getGroup(), "rule__Visible__Group__0");
					put(grammarAccess.getTextValueAccess().getGroup(), "rule__TextValue__Group__0");
					put(grammarAccess.getTextPartAccess().getGroup_1(), "rule__TextPart__Group_1__0");
					put(grammarAccess.getFontPropertiesAccess().getGroup(), "rule__FontProperties__Group__0");
					put(grammarAccess.getTextAlignAccess().getGroup(), "rule__TextAlign__Group__0");
					put(grammarAccess.getLineStyleAccess().getGroup(), "rule__LineStyle__Group__0");
					put(grammarAccess.getLineWidthAccess().getGroup(), "rule__LineWidth__Group__0");
					put(grammarAccess.getXDiagramAccess().getIdAssignment_1(), "rule__XDiagram__IdAssignment_1");
					put(grammarAccess.getXDiagramAccess().getDescAssignment_2(), "rule__XDiagram__DescAssignment_2");
					put(grammarAccess.getXDiagramAccess().getImportURIAssignment_3_1(), "rule__XDiagram__ImportURIAssignment_3_1");
					put(grammarAccess.getXDiagramAccess().getImportsAssignment_4(), "rule__XDiagram__ImportsAssignment_4");
					put(grammarAccess.getXDiagramAccess().getMetamodelAssignment_5(), "rule__XDiagram__MetamodelAssignment_5");
					put(grammarAccess.getXDiagramAccess().getDiagramAssignment_6(), "rule__XDiagram__DiagramAssignment_6");
					put(grammarAccess.getXDiagramAccess().getGroupsAssignment_7(), "rule__XDiagram__GroupsAssignment_7");
					put(grammarAccess.getXDiagramAccess().getElementsAssignment_8_0(), "rule__XDiagram__ElementsAssignment_8_0");
					put(grammarAccess.getXDiagramAccess().getStylesAssignment_8_1(), "rule__XDiagram__StylesAssignment_8_1");
					put(grammarAccess.getXDiagramAccess().getColorsAssignment_8_2(), "rule__XDiagram__ColorsAssignment_8_2");
					put(grammarAccess.getXDiagramAccess().getFiguresAssignment_8_3(), "rule__XDiagram__FiguresAssignment_8_3");
					put(grammarAccess.getMetaModelAccess().getPluginAssignment_3(), "rule__MetaModel__PluginAssignment_3");
					put(grammarAccess.getMetaModelAccess().getEcorePathAssignment_6(), "rule__MetaModel__EcorePathAssignment_6");
					put(grammarAccess.getImportStatementAccess().getImportedNamespaceAssignment_1_1(), "rule__ImportStatement__ImportedNamespaceAssignment_1_1");
					put(grammarAccess.getDiagramAccess().getModelClassAssignment_1(), "rule__Diagram__ModelClassAssignment_1");
					put(grammarAccess.getDiagramAccess().getContainsAssignment_3(), "rule__Diagram__ContainsAssignment_3");
					put(grammarAccess.getToolGroupAccess().getNameAssignment_1(), "rule__ToolGroup__NameAssignment_1");
					put(grammarAccess.getToolGroupAccess().getDescriptionAssignment_2(), "rule__ToolGroup__DescriptionAssignment_2");
					put(grammarAccess.getStyleAccess().getNameAssignment_1(), "rule__Style__NameAssignment_1");
					put(grammarAccess.getStyleAccess().getStyledAssignment_2_0(), "rule__Style__StyledAssignment_2_0");
					put(grammarAccess.getStyleAccess().getStyleAssignment_2_1(), "rule__Style__StyleAssignment_2_1");
					put(grammarAccess.getStyleAccess().getFeaturesAssignment_4(), "rule__Style__FeaturesAssignment_4");
					put(grammarAccess.getFeatureConditionalAccess().getModelAttributeAssignment_1(), "rule__FeatureConditional__ModelAttributeAssignment_1");
					put(grammarAccess.getFeatureConditionalAccess().getOperatorAssignment_2(), "rule__FeatureConditional__OperatorAssignment_2");
					put(grammarAccess.getFeatureConditionalAccess().getValueAssignment_3(), "rule__FeatureConditional__ValueAssignment_3");
					put(grammarAccess.getNodeAccess().getToolAssignment_0_0(), "rule__Node__ToolAssignment_0_0");
					put(grammarAccess.getNodeAccess().getToolNameAssignment_0_1(), "rule__Node__ToolNameAssignment_0_1");
					put(grammarAccess.getNodeAccess().getGroupAssignment_0_2_0(), "rule__Node__GroupAssignment_0_2_0");
					put(grammarAccess.getNodeAccess().getGroupIdAssignment_0_2_1(), "rule__Node__GroupIdAssignment_0_2_1");
					put(grammarAccess.getNodeAccess().getIconAssignment_0_3_0(), "rule__Node__IconAssignment_0_3_0");
					put(grammarAccess.getNodeAccess().getImageIdAssignment_0_3_1(), "rule__Node__ImageIdAssignment_0_3_1");
					put(grammarAccess.getNodeAccess().getModelClassAssignment_2(), "rule__Node__ModelClassAssignment_2");
					put(grammarAccess.getNodeAccess().getRootFigureAssignment_3(), "rule__Node__RootFigureAssignment_3");
					put(grammarAccess.getLinkAccess().getToolAssignment_0_0(), "rule__Link__ToolAssignment_0_0");
					put(grammarAccess.getLinkAccess().getToolNameAssignment_0_1(), "rule__Link__ToolNameAssignment_0_1");
					put(grammarAccess.getLinkAccess().getGroupAssignment_0_2_0(), "rule__Link__GroupAssignment_0_2_0");
					put(grammarAccess.getLinkAccess().getGroupIdAssignment_0_2_1(), "rule__Link__GroupIdAssignment_0_2_1");
					put(grammarAccess.getLinkAccess().getIconAssignment_0_3_0(), "rule__Link__IconAssignment_0_3_0");
					put(grammarAccess.getLinkAccess().getImageIdAssignment_0_3_1(), "rule__Link__ImageIdAssignment_0_3_1");
					put(grammarAccess.getLinkAccess().getReferenceAssignment_2_0_0(), "rule__Link__ReferenceAssignment_2_0_0");
					put(grammarAccess.getLinkAccess().getModelReferenceAssignment_2_0_1(), "rule__Link__ModelReferenceAssignment_2_0_1");
					put(grammarAccess.getLinkAccess().getComplexAssignment_2_1_0(), "rule__Link__ComplexAssignment_2_1_0");
					put(grammarAccess.getLinkAccess().getModelClassAssignment_2_1_1(), "rule__Link__ModelClassAssignment_2_1_1");
					put(grammarAccess.getLinkAccess().getSourceReferenceAssignment_2_1_3(), "rule__Link__SourceReferenceAssignment_2_1_3");
					put(grammarAccess.getLinkAccess().getTargetReferenceAssignment_2_1_5(), "rule__Link__TargetReferenceAssignment_2_1_5");
					put(grammarAccess.getLinkAccess().getStyledAssignment_3_0(), "rule__Link__StyledAssignment_3_0");
					put(grammarAccess.getLinkAccess().getStyleAssignment_3_1(), "rule__Link__StyleAssignment_3_1");
					put(grammarAccess.getLinkAccess().getFeaturesAssignment_5(), "rule__Link__FeaturesAssignment_5");
					put(grammarAccess.getLinkAccess().getDecoratorsAssignment_6(), "rule__Link__DecoratorsAssignment_6");
					put(grammarAccess.getDecoratorAccess().getPositionAssignment_1(), "rule__Decorator__PositionAssignment_1");
					put(grammarAccess.getDecoratorAccess().getElementAssignment_3(), "rule__Decorator__ElementAssignment_3");
					put(grammarAccess.getAnchorAccess().getDirectionAssignment_1(), "rule__Anchor__DirectionAssignment_1");
					put(grammarAccess.getAnchorAccess().getModelReferenceAssignment_2(), "rule__Anchor__ModelReferenceAssignment_2");
					put(grammarAccess.getAnchorAccess().getMaxAssignment_3_1(), "rule__Anchor__MaxAssignment_3_1");
					put(grammarAccess.getAnchorAccess().getConditionalAssignment_4(), "rule__Anchor__ConditionalAssignment_4");
					put(grammarAccess.getCustomColorAccess().getNameAssignment_1(), "rule__CustomColor__NameAssignment_1");
					put(grammarAccess.getCustomColorAccess().getRAssignment_2(), "rule__CustomColor__RAssignment_2");
					put(grammarAccess.getCustomColorAccess().getGAssignment_3(), "rule__CustomColor__GAssignment_3");
					put(grammarAccess.getCustomColorAccess().getBAssignment_4(), "rule__CustomColor__BAssignment_4");
					put(grammarAccess.getColorAccess().getDefaultAssignment_0(), "rule__Color__DefaultAssignment_0");
					put(grammarAccess.getColorAccess().getCustomAssignment_1(), "rule__Color__CustomAssignment_1");
					put(grammarAccess.getCustomFigureAccess().getNameAssignment_1(), "rule__CustomFigure__NameAssignment_1");
					put(grammarAccess.getCustomFigureAccess().getElementAssignment_3(), "rule__CustomFigure__ElementAssignment_3");
					put(grammarAccess.getCustomAccess().getFigureAssignment_1(), "rule__Custom__FigureAssignment_1");
					put(grammarAccess.getCustomAccess().getStyledAssignment_2_0(), "rule__Custom__StyledAssignment_2_0");
					put(grammarAccess.getCustomAccess().getStyleAssignment_2_1(), "rule__Custom__StyleAssignment_2_1");
					put(grammarAccess.getCustomAccess().getFeaturesAssignment_4(), "rule__Custom__FeaturesAssignment_4");
					put(grammarAccess.getCustomAccess().getChildrenAssignment_5_1(), "rule__Custom__ChildrenAssignment_5_1");
					put(grammarAccess.getRectangleAccess().getRectangleAssignment_0_0(), "rule__Rectangle__RectangleAssignment_0_0");
					put(grammarAccess.getRectangleAccess().getSquareAssignment_0_1(), "rule__Rectangle__SquareAssignment_0_1");
					put(grammarAccess.getRectangleAccess().getStyledAssignment_1_0(), "rule__Rectangle__StyledAssignment_1_0");
					put(grammarAccess.getRectangleAccess().getStyleAssignment_1_1(), "rule__Rectangle__StyleAssignment_1_1");
					put(grammarAccess.getRectangleAccess().getFeaturesAssignment_3(), "rule__Rectangle__FeaturesAssignment_3");
					put(grammarAccess.getRectangleAccess().getChildrenAssignment_4_1(), "rule__Rectangle__ChildrenAssignment_4_1");
					put(grammarAccess.getRhombusAccess().getStyledAssignment_2_0(), "rule__Rhombus__StyledAssignment_2_0");
					put(grammarAccess.getRhombusAccess().getStyleAssignment_2_1(), "rule__Rhombus__StyleAssignment_2_1");
					put(grammarAccess.getRhombusAccess().getFeaturesAssignment_4(), "rule__Rhombus__FeaturesAssignment_4");
					put(grammarAccess.getRhombusAccess().getChildrenAssignment_5_1(), "rule__Rhombus__ChildrenAssignment_5_1");
					put(grammarAccess.getEllipseAccess().getEllipseAssignment_0_0(), "rule__Ellipse__EllipseAssignment_0_0");
					put(grammarAccess.getEllipseAccess().getCircleAssignment_0_1(), "rule__Ellipse__CircleAssignment_0_1");
					put(grammarAccess.getEllipseAccess().getStyledAssignment_1_0(), "rule__Ellipse__StyledAssignment_1_0");
					put(grammarAccess.getEllipseAccess().getStyleAssignment_1_1(), "rule__Ellipse__StyleAssignment_1_1");
					put(grammarAccess.getEllipseAccess().getFeaturesAssignment_3(), "rule__Ellipse__FeaturesAssignment_3");
					put(grammarAccess.getEllipseAccess().getChildrenAssignment_4_1(), "rule__Ellipse__ChildrenAssignment_4_1");
					put(grammarAccess.getPolylineAccess().getPolygonAssignment_0_0(), "rule__Polyline__PolygonAssignment_0_0");
					put(grammarAccess.getPolylineAccess().getPolylineAssignment_0_1(), "rule__Polyline__PolylineAssignment_0_1");
					put(grammarAccess.getPolylineAccess().getStyledAssignment_1_0(), "rule__Polyline__StyledAssignment_1_0");
					put(grammarAccess.getPolylineAccess().getStyleAssignment_1_1(), "rule__Polyline__StyleAssignment_1_1");
					put(grammarAccess.getPolylineAccess().getFeaturesAssignment_3(), "rule__Polyline__FeaturesAssignment_3");
					put(grammarAccess.getPolylineAccess().getFeaturesAssignment_4(), "rule__Polyline__FeaturesAssignment_4");
					put(grammarAccess.getPolylineAccess().getFeaturesAssignment_5(), "rule__Polyline__FeaturesAssignment_5");
					put(grammarAccess.getPolylineAccess().getFeaturesAssignment_6(), "rule__Polyline__FeaturesAssignment_6");
					put(grammarAccess.getPolylineAccess().getChildrenAssignment_7_1(), "rule__Polyline__ChildrenAssignment_7_1");
					put(grammarAccess.getTriangleAccess().getStyledAssignment_2_0(), "rule__Triangle__StyledAssignment_2_0");
					put(grammarAccess.getTriangleAccess().getStyleAssignment_2_1(), "rule__Triangle__StyleAssignment_2_1");
					put(grammarAccess.getTriangleAccess().getFeaturesAssignment_4(), "rule__Triangle__FeaturesAssignment_4");
					put(grammarAccess.getTriangleAccess().getChildrenAssignment_5_1(), "rule__Triangle__ChildrenAssignment_5_1");
					put(grammarAccess.getLineAccess().getHorizontalAssignment_1_0(), "rule__Line__HorizontalAssignment_1_0");
					put(grammarAccess.getLineAccess().getVerticalAssignment_1_1(), "rule__Line__VerticalAssignment_1_1");
					put(grammarAccess.getLineAccess().getStyledAssignment_2_0(), "rule__Line__StyledAssignment_2_0");
					put(grammarAccess.getLineAccess().getStyleAssignment_2_1(), "rule__Line__StyleAssignment_2_1");
					put(grammarAccess.getLineAccess().getFeaturesAssignment_4(), "rule__Line__FeaturesAssignment_4");
					put(grammarAccess.getArrowAccess().getStyledAssignment_2_0(), "rule__Arrow__StyledAssignment_2_0");
					put(grammarAccess.getArrowAccess().getStyleAssignment_2_1(), "rule__Arrow__StyleAssignment_2_1");
					put(grammarAccess.getArrowAccess().getFeaturesAssignment_4(), "rule__Arrow__FeaturesAssignment_4");
					put(grammarAccess.getContainsAccess().getModelReferenceAssignment_1(), "rule__Contains__ModelReferenceAssignment_1");
					put(grammarAccess.getContainsAccess().getConditionalAssignment_2(), "rule__Contains__ConditionalAssignment_2");
					put(grammarAccess.getIntValueAccess().getValueAssignment(), "rule__IntValue__ValueAssignment");
					put(grammarAccess.getDoubleValueAccess().getValueIntAssignment_0(), "rule__DoubleValue__ValueIntAssignment_0");
					put(grammarAccess.getDoubleValueAccess().getValueDecimalAssignment_2(), "rule__DoubleValue__ValueDecimalAssignment_2");
					put(grammarAccess.getStringValueAccess().getNullAssignment_0(), "rule__StringValue__NullAssignment_0");
					put(grammarAccess.getStringValueAccess().getValueAssignment_1(), "rule__StringValue__ValueAssignment_1");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
					put(grammarAccess.getEnumValueAccess().getNameAssignment(), "rule__EnumValue__NameAssignment");
					put(grammarAccess.getLabelAccess().getStyledAssignment_2_0(), "rule__Label__StyledAssignment_2_0");
					put(grammarAccess.getLabelAccess().getStyleAssignment_2_1(), "rule__Label__StyleAssignment_2_1");
					put(grammarAccess.getLabelAccess().getFeaturesAssignment_4(), "rule__Label__FeaturesAssignment_4");
					put(grammarAccess.getLabelAccess().getChildrenAssignment_5_1(), "rule__Label__ChildrenAssignment_5_1");
					put(grammarAccess.getImageAccess().getImageIdAssignment_1(), "rule__Image__ImageIdAssignment_1");
					put(grammarAccess.getImageAccess().getStyledAssignment_2_0(), "rule__Image__StyledAssignment_2_0");
					put(grammarAccess.getImageAccess().getStyleAssignment_2_1(), "rule__Image__StyleAssignment_2_1");
					put(grammarAccess.getImageAccess().getFeaturesAssignment_4(), "rule__Image__FeaturesAssignment_4");
					put(grammarAccess.getImageAccess().getChildrenAssignment_5_1(), "rule__Image__ChildrenAssignment_5_1");
					put(grammarAccess.getInvisibleAccess().getStyledAssignment_2_0(), "rule__Invisible__StyledAssignment_2_0");
					put(grammarAccess.getInvisibleAccess().getStyleAssignment_2_1(), "rule__Invisible__StyleAssignment_2_1");
					put(grammarAccess.getInvisibleAccess().getFeaturesAssignment_4(), "rule__Invisible__FeaturesAssignment_4");
					put(grammarAccess.getInvisibleAccess().getChildrenAssignment_5_1(), "rule__Invisible__ChildrenAssignment_5_1");
					put(grammarAccess.getForegroundAccess().getTypeAssignment_0(), "rule__Foreground__TypeAssignment_0");
					put(grammarAccess.getForegroundAccess().getColorAssignment_1(), "rule__Foreground__ColorAssignment_1");
					put(grammarAccess.getForegroundAccess().getConditionalAssignment_2(), "rule__Foreground__ConditionalAssignment_2");
					put(grammarAccess.getBackgroundAccess().getTypeAssignment_0(), "rule__Background__TypeAssignment_0");
					put(grammarAccess.getBackgroundAccess().getColorAssignment_1(), "rule__Background__ColorAssignment_1");
					put(grammarAccess.getBackgroundAccess().getConditionalAssignment_2(), "rule__Background__ConditionalAssignment_2");
					put(grammarAccess.getTransparencyAccess().getPercentAssignment_1(), "rule__Transparency__PercentAssignment_1");
					put(grammarAccess.getTransparencyAccess().getConditionalAssignment_3(), "rule__Transparency__ConditionalAssignment_3");
					put(grammarAccess.getSizeAccess().getWidthAssignment_1(), "rule__Size__WidthAssignment_1");
					put(grammarAccess.getSizeAccess().getWidthRelativeAssignment_2(), "rule__Size__WidthRelativeAssignment_2");
					put(grammarAccess.getSizeAccess().getHeightAssignment_3_0(), "rule__Size__HeightAssignment_3_0");
					put(grammarAccess.getSizeAccess().getHeightRelativeAssignment_3_1(), "rule__Size__HeightRelativeAssignment_3_1");
					put(grammarAccess.getSizeAccess().getResizableAssignment_4(), "rule__Size__ResizableAssignment_4");
					put(grammarAccess.getSizeAccess().getConditionalAssignment_5(), "rule__Size__ConditionalAssignment_5");
					put(grammarAccess.getPointAccess().getXAssignment_1(), "rule__Point__XAssignment_1");
					put(grammarAccess.getPointAccess().getYAssignment_2(), "rule__Point__YAssignment_2");
					put(grammarAccess.getPointAccess().getConditionalAssignment_3(), "rule__Point__ConditionalAssignment_3");
					put(grammarAccess.getPositionAccess().getXAssignment_1(), "rule__Position__XAssignment_1");
					put(grammarAccess.getPositionAccess().getXRelativeAssignment_2(), "rule__Position__XRelativeAssignment_2");
					put(grammarAccess.getPositionAccess().getYAssignment_3(), "rule__Position__YAssignment_3");
					put(grammarAccess.getPositionAccess().getYRelativeAssignment_4(), "rule__Position__YRelativeAssignment_4");
					put(grammarAccess.getPositionAccess().getConditionalAssignment_5(), "rule__Position__ConditionalAssignment_5");
					put(grammarAccess.getCornerAccess().getAngleAssignment_1(), "rule__Corner__AngleAssignment_1");
					put(grammarAccess.getCornerAccess().getConditionalAssignment_2(), "rule__Corner__ConditionalAssignment_2");
					put(grammarAccess.getLayoutAccess().getVerticalAssignment_1_0(), "rule__Layout__VerticalAssignment_1_0");
					put(grammarAccess.getLayoutAccess().getHorizontalAssignment_1_1(), "rule__Layout__HorizontalAssignment_1_1");
					put(grammarAccess.getLayoutAccess().getMarginAssignment_2_1(), "rule__Layout__MarginAssignment_2_1");
					put(grammarAccess.getLayoutAccess().getConditionalAssignment_3(), "rule__Layout__ConditionalAssignment_3");
					put(grammarAccess.getVisibleAccess().getConditionalAssignment_1(), "rule__Visible__ConditionalAssignment_1");
					put(grammarAccess.getTextValueAccess().getPartsAssignment_2(), "rule__TextValue__PartsAssignment_2");
					put(grammarAccess.getTextValueAccess().getConditionalAssignment_3(), "rule__TextValue__ConditionalAssignment_3");
					put(grammarAccess.getTextPartAccess().getTextAssignment_0(), "rule__TextPart__TextAssignment_0");
					put(grammarAccess.getTextPartAccess().getEditableAssignment_1_0(), "rule__TextPart__EditableAssignment_1_0");
					put(grammarAccess.getTextPartAccess().getModelAttributeAssignment_1_1(), "rule__TextPart__ModelAttributeAssignment_1_1");
					put(grammarAccess.getFontPropertiesAccess().getFaceAssignment_2_0(), "rule__FontProperties__FaceAssignment_2_0");
					put(grammarAccess.getFontPropertiesAccess().getSizeAssignment_3(), "rule__FontProperties__SizeAssignment_3");
					put(grammarAccess.getFontPropertiesAccess().getBoldAssignment_4(), "rule__FontProperties__BoldAssignment_4");
					put(grammarAccess.getFontPropertiesAccess().getItalicsAssignment_5(), "rule__FontProperties__ItalicsAssignment_5");
					put(grammarAccess.getFontPropertiesAccess().getConditionalAssignment_6(), "rule__FontProperties__ConditionalAssignment_6");
					put(grammarAccess.getTextAlignAccess().getValueAssignment_1(), "rule__TextAlign__ValueAssignment_1");
					put(grammarAccess.getTextAlignAccess().getConditionalAssignment_2(), "rule__TextAlign__ConditionalAssignment_2");
					put(grammarAccess.getLineStyleAccess().getStyleAssignment_2(), "rule__LineStyle__StyleAssignment_2");
					put(grammarAccess.getLineStyleAccess().getManhattanAssignment_3(), "rule__LineStyle__ManhattanAssignment_3");
					put(grammarAccess.getLineStyleAccess().getConditionalAssignment_4(), "rule__LineStyle__ConditionalAssignment_4");
					put(grammarAccess.getLineWidthAccess().getWidthAssignment_1(), "rule__LineWidth__WidthAssignment_1");
					put(grammarAccess.getLineWidthAccess().getConditionalAssignment_2(), "rule__LineWidth__ConditionalAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalXdiagramDslParser typedParser = (InternalXdiagramDslParser) parser;
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

	public XdiagramDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XdiagramDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
