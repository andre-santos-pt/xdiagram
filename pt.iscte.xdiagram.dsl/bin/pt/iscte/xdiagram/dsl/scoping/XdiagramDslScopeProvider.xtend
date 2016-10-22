/*
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.impl.FilteringScope
import pt.iscte.xdiagram.dsl.model.ConnectableElement
import pt.iscte.xdiagram.dsl.model.Contains
import pt.iscte.xdiagram.dsl.model.Diagram
import pt.iscte.xdiagram.dsl.model.Node

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class XdiagramDslScopeProvider extends AbstractXdiagramDslScopeProvider {

//	override getScope(EObject context, EReference reference) {
//		var scope = super.getScope(context, reference);
//		if (context instanceof Contains) {
//			if(context.eContainer instanceof Diagram) {
//				val diagram = context.eContainer as Diagram;
//				return new FilteringScope(scope, [EObjectOrProxy.eContainer == diagram.modelClass && !name.toString.startsWith("http") && (EObjectOrProxy as EReference).containment ]);
//			}
//			else if(context.eContainer instanceof ConnectableElement) {
//				var n =  context.eContainer;
//				while(!(n instanceof Node))
//					n = n.eContainer;
//				val node = n as Node;
//				return new FilteringScope(scope, [EObjectOrProxy.eContainer == node.modelClass && !name.toString.startsWith("http") && (EObjectOrProxy as EReference).containment]);
//			}
//		}
//		return scope;
//	}

}
