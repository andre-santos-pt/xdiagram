package org.eclipselabs.xdiagram.provider;


import java.io.File;
import java.util.Enumeration;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.eclipselabs.xdiagram.interpreter.ExtensionPointIds;
import org.osgi.framework.Bundle;

public class XDiagramImageProvider extends AbstractImageProvider {			
	//	private String providerId;
	//	private Map<String, String> mapping;
	//	
	//	public XDiagramImageProvider() {
	//		mapping = new HashMap<String, String>();
	//	}
	//	
	//	@Override
	//	public String getProviderId() {
	//		return providerId;
	//	}
	//
	//	@Override
	//	public void setProviderId(String providerId) {
	//		this.providerId = providerId;
	//	}


	//	private IContributor plugin;
	//	private String filePath;

	public XDiagramImageProvider() {


		//		filePath = null;
		//		for(IExtension ext : reg.getExtensions(plugin)) {
		//			if(ext.getExtensionPointUniqueIdentifier().equals(ExtensionPointIds.XDIAGRAM_PROVIDERS_PROVIDER)) {
		//				for(IConfigurationElement c : ext.getConfigurationElements()) {
		//					if(c.getName().equals(ExtensionPointIds.XDIAGRAM_PROVIDERS_PROVIDER)) {
		//						for(IConfigurationElement prop : c.getChildren("property"))
		//							if(prop.getAttribute("id").equals("file")) {
		//								filePath = prop.getAttribute("value");
		//							}
		//					}
		//				}
		//			}
		//		}
		//		System.out.println("FILE " + filePath);


	}

	protected void addAvailableImages() {
		IContributor plugin = findPlugin();

		if(plugin != null) {

			Bundle bundle = Platform.getBundle(plugin.getName());
			Enumeration<String> e = bundle.getEntryPaths("images");
			if(e == null)
				return;
			
			while(e.hasMoreElements()) {
				String path = e.nextElement();
				int i = path.indexOf(File.separatorChar);
				if(i != -1 && i+1 < path.length()) {
					String id = path.substring(i+1);
					id = id.substring(0, id.indexOf('.'));
					if(isValidJavaIdentifier(id))
						addImageFilePath(id, path);
				}
			}
		}
		//		try{			
		//			ResourceSet rs = new ResourceSetImpl();
		//			//"/Users/andre/Documents/EclipseWS/runtime-XDiagramFeature/Test/new.xdiagram")
		//			URI uri = URI.createFileURI(filePath);
		//			Resource resource = rs.getResource(uri, true);
		//			List<EObject> objs = resource.getContents();
		//			XDiagram model = (XDiagram) objs.get(0);
		//
		//			for(ImageFile img : model.getImages())
		//				addImageFilePath(img.getName(), img.getSrc());
		//		}
		//		catch(Exception e){
		//			e.printStackTrace();
		//		}
	}

	private IContributor findPlugin() {
		IExtensionRegistry reg = Platform.getExtensionRegistry();

		for(IConfigurationElement a : reg.getConfigurationElementsFor(ExtensionPointIds.GRAPHITI_IMAGE_PROVIDERS_EXT)) {
			IContributor contributor = a.getContributor();

			if(a.getName().equals("imageProvider") && a.getAttribute("class").equals(XDiagramImageProvider.class.getName())) {
				String providerId = a.getAttribute("id");

				for(IConfigurationElement b : reg.getConfigurationElementsFor(ExtensionPointIds.GRAPHITI_DIAGRAM_TYPE_PROVIDERS_EXT)) {

					if(b.getName().equals("diagramTypeProvider")) {
						for(IConfigurationElement c : b.getChildren("imageProvider")) {
							String id = c.getAttribute("id");
							if(id.equals(providerId))
								return contributor;
						}
					}
				}	
			}
		}
		return null;
	}

	private final static boolean isValidJavaIdentifier(String s) {
		// an empty or null string cannot be a valid identifier
		if (s == null || s.length() == 0)
		{
			return false;
		}

		char[] c = s.toCharArray();
		if (!Character.isJavaIdentifierStart(c[0]))
		{
			return false;
		}

		for (int i = 1; i < c.length; i++)
		{
			if (!Character.isJavaIdentifierPart(c[i]))
			{
				return false;
			}
		}

		return true;
	}

	//	@Override
	//	public void setPluginId(String pluginId) {
	//		
	//	}
	//
	//	@Override
	//	public String getPluginId() {
	//		// TODO Auto-generated method stub
	//		return null;
	//	}
	//
	//	@Override
	//	public String getImageFilePath(String imageId) {
	//		return mapping.get(imageId);
	//	}
}
