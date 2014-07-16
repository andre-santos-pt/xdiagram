package org.eclipselabs.xdiagram.interpreter;


import java.io.File;
import java.util.Enumeration;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.eclipselabs.xdiagram.XdiagramConstants;
import org.osgi.framework.Bundle;

public class XDiagramImageProvider extends AbstractImageProvider {			

	@Override
	protected void addAvailableImages() {
		IExtensionRegistry reg = Platform.getExtensionRegistry();

		for(IConfigurationElement c : reg.getConfigurationElementsFor(ExtensionPointIds.XDIAGRAM_PROVIDERS_EXT)) {
			IContributor contributor = c.getContributor();

			Bundle bundle = Platform.getBundle(contributor.getName());
			Enumeration<String> e = bundle.getEntryPaths(XdiagramConstants.IMAGES_FOLDER_NAME);
			if(e == null)
				continue;

			while(e.hasMoreElements()) {
				String path = e.nextElement();
				int i = path.indexOf(File.separatorChar);
				if(i != -1 && i+1 < path.length()) {
					String id = path.substring(i+1);
					addImageFilePath(bundle.getSymbolicName() + ":" + id, path);
					System.out.println(bundle.getSymbolicName() + ":" + id);
				}
			}
		}
	}

}
