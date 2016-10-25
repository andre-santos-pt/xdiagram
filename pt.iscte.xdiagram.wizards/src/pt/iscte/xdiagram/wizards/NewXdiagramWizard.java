/*******************************************************************************
 * Copyright (c) 2016 ISCTE-IUL.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André L. Santos, Eduardo Gomes - initial API and implementation
 *******************************************************************************/
package pt.iscte.xdiagram.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;


public class NewXdiagramWizard extends Wizard implements INewWizard {
	private NewXdiagramWizardPage page;
	private ISelection selection;

	public NewXdiagramWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	public void addPages() {
		page = new NewXdiagramWizardPage(selection);
		addPage(page);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
	
	private IProject project;
	
	public boolean performFinish() {
		String projectName = page.getProjectName();
		String ecoreProject = page.getEcoreProjectName();
		String ecoreFilePath = page.getEcoreFilePath();
		String diagramId = page.getDiagramId();
		String diagramDesc = page.getDiagramDescription();
		String diagramType = diagramId.substring(0, diagramId.indexOf("Diagram")); // TODO review
		String specFile = page.getFileName();
		String ePackageName = page.getEPackageName();
		String ePackageURI = page.getEPackage().getNsURI();
		String rootClass = page.getRootClassName();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					project = PluginGenerator.createProject(projectName, diagramId, diagramDesc, diagramType, rootClass, ecoreProject, ecoreFilePath,  ePackageName, ePackageURI, specFile, monitor);			
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		IFile file = (IFile) project.findMember(specFile);
		open(file);
		return true;
	}

	private static void open(IFile file) {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			IDE.openEditor(page, file);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	
}