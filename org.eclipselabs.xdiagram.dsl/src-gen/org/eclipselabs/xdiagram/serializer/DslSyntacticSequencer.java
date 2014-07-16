package org.eclipselabs.xdiagram.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipselabs.xdiagram.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FontProperties___CourierKeyword_2_2_or_TimesKeyword_2_3_or_VerdanaKeyword_2_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DslGrammarAccess) access;
		match_FontProperties___CourierKeyword_2_2_or_TimesKeyword_2_3_or_VerdanaKeyword_2_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFontPropertiesAccess().getCourierKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getFontPropertiesAccess().getTimesKeyword_2_3()), new TokenAlias(false, false, grammarAccess.getFontPropertiesAccess().getVerdanaKeyword_2_1()));
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
			if(match_FontProperties___CourierKeyword_2_2_or_TimesKeyword_2_3_or_VerdanaKeyword_2_1__q.equals(syntax))
				emit_FontProperties___CourierKeyword_2_2_or_TimesKeyword_2_3_or_VerdanaKeyword_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('courier' | 'verdana' | 'times')?
	 */
	protected void emit_FontProperties___CourierKeyword_2_2_or_TimesKeyword_2_3_or_VerdanaKeyword_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
