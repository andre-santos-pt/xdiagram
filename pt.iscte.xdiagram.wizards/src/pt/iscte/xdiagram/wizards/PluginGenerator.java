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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

class PluginGenerator {
	
	private static String[] IMPORTS = {
			"org.eclipse.core.runtime",
			"org.eclipse.emf.ecore",
			org.eclipselabs.xdiagram.provider.LanguageProvider.class.getPackage().getName(),
			org.eclipselabs.xdiagram.interpreter.XDiagramTypeProvider.class.getPackage().getName()
	};
	
	private static String[] PROJ_NATURES = {
			"org.eclipse.pde.PluginNature", 
			"org.eclipse.xtext.ui.shared.xtextNature"
	};
	

	public static IProject createProject(
			String projName, String diagramId, String diagramType, String diagramDesc, String rootClass, String ecoreProject,
			String ecoreFilePath, String ePackageName, String ePackageURI, String specFile, 
			IProgressMonitor monitor) throws CoreException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projName);
		project.create(null);
		project.open(null);
		IProjectDescription description = project.getDescription();
		description.setNatureIds(PROJ_NATURES);
		project.setDescription(description, null);
		createBuildProps(monitor, project, Collections.emptyList());
		createManifest(projName, ecoreProject, IMPORTS, Collections.emptyList(), monitor, project);
		createFile("plugin.xml", project, PluginGenerator.getPluginXml(diagramId, diagramType, diagramDesc, ePackageURI, specFile).toString(), monitor);

		String xdia = "metamodel {\n\tplugin-id \"" + ecoreProject + "\"\n\tecore-file \"" + ecoreFilePath + "\"\n}\n\ndiagram " + rootClass + "{\n\n}";
		createFile(specFile, project, xdia, monitor);
		return project;
	}

	


	private static void createBuildProps(final IProgressMonitor progressMonitor, final IProject project,
			final List<String> srcFolders) {
		//		final StringBuilder bpContent = new StringBuilder("source.. = ");
		//		for (final Iterator<String> iterator = srcFolders.iterator(); iterator.hasNext();) {
		//			bpContent.append(iterator.next()).append('/');
		//			if (iterator.hasNext()) {
		//				bpContent.append(",");
		//			}
		//		}
		//		bpContent.append("\n");
		//		bpContent.append("bin.includes = META-INF/,plugin.xml,.\n");

		String binIncludes = "bin.includes = META-INF/,plugin.xml,.\n";
		createFile("build.properties", project, binIncludes, progressMonitor);
	}

	private static void createManifest(final String projectName, String ecoreProject, String[] requiredBundles,
			final List<String> exportedPackages, final IProgressMonitor progressMonitor, final IProject project)
					throws CoreException {
		final StringBuilder maniContent = new StringBuilder("Manifest-Version: 1.0\n");
		maniContent.append("Bundle-ManifestVersion: 2\n");
		maniContent.append("Bundle-Name: " + projectName + "\n");
		maniContent.append("Bundle-SymbolicName: " + projectName + "; singleton:=true\n");
		maniContent.append("Bundle-Version: 1.0.0\n");

		if(requiredBundles.length > 0) {
			maniContent.append("Require-Bundle: " + ecoreProject);
			for(int i = 0; i < requiredBundles.length; i++)
				maniContent.append(",\n " + requiredBundles[i]);

			maniContent.append("\n");
		}

		if (exportedPackages != null && !exportedPackages.isEmpty()) {
			maniContent.append("Require-Bundle: " + exportedPackages.get(0));
			for (int i = 1, x = exportedPackages.size(); i < x; i++) {
				maniContent.append(",\n " + exportedPackages.get(i));
			}
			maniContent.append("\n");
		}
		maniContent.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.8\r\n");

		final IFolder metaInf = project.getFolder("META-INF");
		metaInf.create(false, true, progressMonitor);
		createFile("MANIFEST.MF", metaInf, maniContent.toString(), progressMonitor);
	}


	private static IFile createFile(final String name, final IContainer container, final String content,
			final IProgressMonitor progressMonitor) {
		final IFile file = container.getFile(new Path(name));
		try {
			final InputStream stream = new ByteArrayInputStream(content.getBytes(file.getCharset()));
			if (file.exists()) {
				file.setContents(stream, true, true, progressMonitor);
			}
			else {
				file.create(stream, true, progressMonitor);
			}
			stream.close();
		}
		catch (final Exception e) {
			e.printStackTrace();
		}
		progressMonitor.worked(1);

		return file;
	}
	
	
	private static StringBuffer getPluginXml(String xDiaId, String xDiaDesc, String xDiaType, String ecoreURI, String specFilePath) {
		StringBuffer xml = new StringBuffer();

		xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		xml.append("<?eclipse version=\"3.0\"?>\n");

		element(xml, "plugin");
		element(xml, "extension", "point","org.eclipse.graphiti.ui.diagramTypes");
		element_(xml, "diagramType",
				"id", xDiaId, 
				"name", xDiaDesc, 
				"type", xDiaType);
		close(xml, "extension");
		xml.append("\n\n");


		element(xml, "extension", "point","org.eclipse.graphiti.ui.diagramTypeProviders");
		element(xml, "diagramTypeProvider",
				"class", org.eclipselabs.xdiagram.interpreter.XDiagramTypeProvider.class.getName(),
				"id", xDiaId + "Provider",
				"name", xDiaDesc + " Type Provider");

		element_(xml, "diagramType", "id", xDiaId);
		element_(xml, "imageProvider", "id", 	"org.eclipselabs.xdiagram.examples.featurediagram.imageProvider");

		close(xml, "diagramTypeProvider", "extension");
		xml.append("\n\n");


		element(xml, "extension", "point","org.eclipselabs.xdiagram.interpreter.providers");

		element(xml, "provider", 
				"diagramType", xDiaType,
				"ePackageURI", ecoreURI,
				"provider", org.eclipselabs.xdiagram.provider.LanguageProvider.class.getName());

		element_(xml, "property", "id", "file","value", specFilePath);
		close(xml, "provider", "extension", "plugin");


		return xml;
	}

	private static void element(StringBuffer buffer, String element, String ... pairs) {
		buffer.append("<" + element + " ");
		for(int i = 0; i < pairs.length; i+=2)
			buffer.append(pairs[i] + "=\"" + pairs[i+1] + "\" ");
		buffer.append(">\n");
	}

	private static void element_(StringBuffer buffer, String element, String ... pairs) {
		buffer.append("<" + element + " ");
		for(int i = 0; i < pairs.length; i+=2)
			buffer.append(pairs[i] + "=\"" + pairs[i+1] + "\" ");
		buffer.append("/>\n");
	}

	private static void close(StringBuffer buffer, String ... element){
		for(String e : element)
			buffer.append("</" + e + ">\n");
	}
}
