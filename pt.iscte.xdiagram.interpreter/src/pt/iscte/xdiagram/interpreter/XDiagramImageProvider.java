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
package pt.iscte.xdiagram.interpreter;


import java.io.File;
import java.util.Enumeration;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.osgi.framework.Bundle;

public class XDiagramImageProvider extends AbstractImageProvider {			

	public static final String IMAGES_FOLDER_NAME = "images";

	@Override
	protected void addAvailableImages() {
		IExtensionRegistry reg = Platform.getExtensionRegistry();

		for(IConfigurationElement c : reg.getConfigurationElementsFor(ExtensionPointIds.XDIAGRAM_PROVIDERS_EXT)) {
			IContributor contributor = c.getContributor();

			Bundle bundle = Platform.getBundle(contributor.getName());
			Enumeration<String> e = bundle.getEntryPaths(IMAGES_FOLDER_NAME);
			if(e == null)
				continue;

			while(e.hasMoreElements()) {
				String path = e.nextElement();
				int i = path.indexOf(File.separatorChar);
				if(i != -1 && i+1 < path.length()) {
					String id = path.substring(i+1);
					addImageFilePath(bundle.getSymbolicName() + ":" + id, path);
				}
			}
		}
	}

}
