package org.eclipselabs.xdiagram.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipselabs.xdiagram.xtext.services.XDiagramGrammarAccess;

@SuppressWarnings("all")
public class XDiagramSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XDiagramGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DoubleFeature___FullStopKeyword_3_0_INTTerminalRuleCall_3_1__q;
	protected AbstractElementAlias match_Link___DestinyKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q;
	protected AbstractElementAlias match_Link___OriginKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XDiagramGrammarAccess) access;
		match_DoubleFeature___FullStopKeyword_3_0_INTTerminalRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDoubleFeatureAccess().getFullStopKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDoubleFeatureAccess().getINTTerminalRuleCall_3_1()));
		match_Link___DestinyKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLinkAccess().getDestinyKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_9_4()));
		match_Link___OriginKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLinkAccess().getOriginKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_DoubleFeature___FullStopKeyword_3_0_INTTerminalRuleCall_3_1__q.equals(syntax))
				emit_DoubleFeature___FullStopKeyword_3_0_INTTerminalRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Link___DestinyKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q.equals(syntax))
				emit_Link___DestinyKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Link___OriginKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_4__q.equals(syntax))
				emit_Link___OriginKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('.' INT)?
	 */
	protected void emit_DoubleFeature___FullStopKeyword_3_0_INTTerminalRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('destiny' '{' '}')?
	 */
	protected void emit_Link___DestinyKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('origin' '{' '}')?
	 */
	protected void emit_Link___OriginKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
