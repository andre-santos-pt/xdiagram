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
	protected AbstractElementAlias match_Node___SetKeyword_3_0_ColonKeyword_3_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XDiagramGrammarAccess) access;
		match_Node___SetKeyword_3_0_ColonKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeAccess().getSetKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getColonKeyword_3_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Node___SetKeyword_3_0_ColonKeyword_3_1__q.equals(syntax))
				emit_Node___SetKeyword_3_0_ColonKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('set' ':')?
	 */
	protected void emit_Node___SetKeyword_3_0_ColonKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
