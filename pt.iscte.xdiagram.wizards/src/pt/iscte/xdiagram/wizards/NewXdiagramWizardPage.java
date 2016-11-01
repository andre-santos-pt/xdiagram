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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xdia).
 */

public class NewXdiagramWizardPage extends WizardPage {
	private Composite container;

	private Text ecorePluginText;
	private Text ecoreFileText;

	private Text projectNameText;
	private Text fileText;
	private Text diagramIdText;
	private Text diagramTypeText;
	private Text diagramNameText;
	private String ecoreProjectName;

	private ISelection selection;

	public NewXdiagramWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("Xdiagram Project");
		setDescription("This wizard creates a new Xdiagram project.");
		this.selection = selection;
	}


	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, false));

		ecorePluginText = createField(container, "&Ecore project:", false);
		ecorePluginText.setToolTipText("id of the plugin that contains the ecore file");
		ecoreFileText = createField(container, "&Ecore file:", false);
		ecoreFileText.setToolTipText("relative path to the ecore file");

		Button button = new Button(container, SWT.PUSH);
		button.setText("&Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				List<IResource> list = new ArrayList<>();
				try {
					ResourcesPlugin.getWorkspace().getRoot().accept((r) -> {
						if("ecore".equals(r.getFileExtension())) list.add(r);
						return true;
					});
				} catch (CoreException ex) {
					ex.printStackTrace();
				}

				ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(null, list.toArray(new IResource[list.size()]));
				dialog.setTitle("Please select an .ecore file.");
				dialog.open();
				Object[] sel = dialog.getResult();
				if(sel != null && sel.length > 0) {
					IFile f = (IFile) sel[0];
					initialize(f);
				}
			}
		});
		new Label(container, SWT.NONE);

		new Label(container, SWT.HORIZONTAL | SWT.SEPARATOR).setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false, 2, 1));

		projectNameText = createField(container,"&Project name:", false);
		diagramIdText = createField(container, "&Diagram id:", false);
		diagramTypeText = createField(container, "&Diagram type:", false);
		diagramNameText = createField(container, "&Diagram description:",false);
		fileText = createField(container,"&Specification file:",false);

		new Label(container, SWT.NULL).setText("Root class:");

		rootCombo = new Combo(container, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);


		//----------------
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IFile) {
				initialize((IFile) obj);
			}
		}

		dialogChanged();
		setControl(container);
		setPageComplete(false);
	}

	private final ModifyListener listener = new ModifyListener() {
		public void modifyText(ModifyEvent e) {
			dialogChanged();
		}
	};

	private final GridData fillHorizontal = new GridData(GridData.FILL_HORIZONTAL);

	private Combo rootCombo;

	private EPackage ePackage;



	private Text createField(Composite parent, String name, boolean readonly) {
		new Label(parent, SWT.NULL).setText(name);
		Text text = new Text(parent, SWT.BORDER | SWT.SINGLE | (readonly ? SWT.READ_ONLY : SWT.NULL));
		text.setLayoutData(fillHorizontal);
		text.addModifyListener(listener);
		return text;
	}



	private void initialize(IFile ecoreFile) {
		assert ecoreFile != null;
		String fileName = ecoreFile.getName().substring(0, ecoreFile.getName().lastIndexOf('.'));
		ecorePluginText.setText(ecoreFile.getProject().getName());
		ecoreFileText.setText(ecoreFile.getProjectRelativePath().toString());
		diagramIdText.setText(fileName + "Diagram");
		diagramTypeText.setText(fileName);
		fileText.setText(fileName + ".xdia");
		ecoreProjectName = ecoreFile.getProject().getName();
		projectNameText.setText(ecoreProjectName + ".xdiagram");
	}

	// TODO validate ecore project
	private void dialogChanged() {
		IResource ecoreFile = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getEcoreProjectName() + "/" + getEcoreFilePath()));
		String fileName = getFileName();
		String diagramId = getDiagramId();

		if (getEcoreFilePath().length() == 0) {
			updateStatus("Ecore file must be specified. Please select an .ecore file in the workspace when launching this wizard.");
			return;
		}
		if (!(ecoreFile instanceof IFile && ((IFile) ecoreFile).getFileExtension().equals("ecore"))) {
			updateStatus("Ecore file must have .ecore extension");
			return;
		}

		//		IResource ecoreFile = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(page.getEcoreProjectName() + "/" + page.getEcoreFilePath()));
		ResourceSet rs = new ResourceSetImpl();

		URI modelLocation = URI.createFileURI(ecoreFile.getLocation().toString());
		Resource resource = rs.getResource(modelLocation, true);
		ePackage = (EPackage) resource.getContents().get(0);

		int rootSel = rootCombo.getSelectionIndex();
		List<String> list = new ArrayList<>();
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if(eClassifier instanceof EClass && !((EClass) eClassifier).isAbstract())
				list.add(eClassifier.getName());
		}
		rootCombo.setItems(list.toArray(new String[list.size()]));
		if(list.size() == 0) {
			updateStatus("Ecore model must contain at least one class");
			return;
		}
		else if(rootSel != -1) {
			rootCombo.select(rootSel);
		}
		else {
			rootCombo.select(0);
		}

		if(getProjectName().isEmpty()) {
			updateStatus("Project name must be defined.");
			return;
		}
		else if(ResourcesPlugin.getWorkspace().getRoot().getProject(getProjectName()).exists()) {
			updateStatus("A project exists in the workspace with the specified name.");
			return;
		}

		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = fileName.substring(dotLoc + 1);
			if (!ext.equals("xdia")) {
				updateStatus("File extension of Xdiagram specification must be \"xdia\"");
				return;
			}
		}
		else {
			updateStatus("File extension of Xdiagram specification must be \"xdia\"");
			return;
		}

		if(!diagramId.matches("[a-zA-Z]+")) {
			updateStatus("Diagram id must be an identifier composed only of letter characters");
			return;
		}

		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}



	public String getEcoreProjectName() {
		return ecoreProjectName;
	}

	public String getEcoreFilePath() {
		return ecoreFileText.getText();
	}

	public String getProjectName() {
		return projectNameText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}

	public String getDiagramId() {
		return diagramIdText.getText();
	}

	public String getDiagramType() {
		return diagramTypeText.getText();
	}

	public String getDiagramDescription() {
		return diagramNameText.getText();
	}
	public String getEPackageName() {
		return ePackage.getName();
	}

	public String getRootClassName() {
		return rootCombo.getItem(rootCombo.getSelectionIndex());
	}

	public EPackage getEPackage() {
		return ePackage;
	}

}