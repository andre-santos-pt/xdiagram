package org.eclipselabs.xdiagram.interpreter.internal;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;


public class EMFEditingDomainFactory implements TransactionalEditingDomain.Factory {

	public TransactionalEditingDomain createEditingDomain() {
		 // create an editing domain with a default resource set implementation
	      //    and delegating command execution to the default (workbench)
	      //    operation history
	      TransactionalEditingDomain result = WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();
	      
	      // add an exception handler to the editing domain's command stack
//	      ((TransactionalCommandStack) result.getCommandStack()).setExceptionHandler(
//	            new CommandStackExceptionHandler());
	      
	      return result;
	}

	public TransactionalEditingDomain createEditingDomain(ResourceSet arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public TransactionalEditingDomain getEditingDomain(ResourceSet arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
