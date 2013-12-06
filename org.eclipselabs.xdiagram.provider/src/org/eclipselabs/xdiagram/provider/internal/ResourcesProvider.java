package org.eclipselabs.xdiagram.provider.internal;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.xdiagram.xtext.XDiagramStandaloneSetup;

public class ResourcesProvider {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private File getFile(URI uri) {
		if (uri != null) {
			/** to resolve this we need the workspace root */
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			/** create an new IPath from the URI (decode blanks etc.) */
			IPath path = new Path(uri.toPlatformString(true));
			/** finally resolve the file with the workspace */
			IFile file = myWorkspaceRoot.getFile(path);

			if (file != null && file.getLocation() != null) {

				/** get java.io.File object */
				File f = file.getLocation().toFile();
				return f;
			}
		}
		return null;
	}
	
	public ResourcesProvider() {
		
		;
		//IWorkspaceRoot.findFile(new Path(uri.toPlatformString())).getLocation()
		//this.getClass().getResource("/myFile.ext")
		//IResource::getLocationURI		
		//Platform.getInstanceLocation
		new XDiagramStandaloneSetup().createInjectorAndDoEMFRegistration();		
		ResourceSet rs = new ResourceSetImpl();
		//resource = rs.getResource(URI.createURI("file://C:/Users/Eduardo/workspace/org.eclipsedsl.gdsl/src/org/eclipsedsl/gdsl/GraficalDSL.gdsl"), true);
		//System.out.println(IResource.getLocation().toString());
		//ECoreUtil.getURI(EObject) 
		//createURI("platform:/resource/org.xtext.example.mydsl/src/example.mydsl"), true);
		//EObject.eResource().getURI()
		//YourClassName.class.getResourceAsStream("/foo.xml")
		//http://stackoverflow.com/questions/8786089/how-to-get-path-of-current-selected-file-in-eclipse-plugin-development
		//"./GPlugin/src/gplugin/GraficalDSL.gdsl
		//"platform:/resource/GPlugin/src/gplugin/GraficalDSL.gdsl"
		//ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
//		public String getDslResourceURI(){
//			String uri = this.diagramProvider.getDiagramTypeProvider().getDiagram().eResource().getURI().toPlatformString(true);
//			uri = uri.substring(0, uri.lastIndexOf(".diagram")).concat(".gdsl");
//			return uri;
//		}
		Resource resource = null;
		try{
			//"file://" + ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/" + "org.eclipselabs.threedsl.examples.binding" + "/" + "bin/threedsl/GraficalDSL.gdsl")
			//"file://C:/Users/Eduardo/workspace/org.eclipselabs.threedsl.examples.binding/bin/threedsl/GraficalDSL.gdsl"
			// this.getClass().getSimpleName()
			//Bundle bundle = Platform.getBundle("de.vogella.example.readfile");
			System.out.println("--> BBUS: " + Platform.getBundle("org.eclipselabs.threedsl.examples.binding").getResource("bin/threedsl/GraficalDSL.gdsl"));
			System.out.println("--> RRUS: " + this.getClass().getResource("GraficalDSL.gdsl").toString());
			//bundleresource://794.fwk6507439/org/eclipselabs/threedsl/examples/GraficalDSL.gdsl
			resource = rs.getResource(URI.createURI("bundleresource://766.fwk6507439:1/bin/threedsl/GraficalDSL.gdsl"), true);
			System.out.println("--> URI: " + resource.getURI());
		}catch(Exception e){
			System.out.println("oops: " + e.getMessage());
		}
		
//		Bundle bundle = Platform.getBundle("de.vogella.example.readfile");
//		URL fileURL = bundle.getEntry("files/test.txt");
//		File file = null;
//		try {
//		    file = new File(FileLocator.resolve(fileURL).toURI());
//		} catch (URISyntaxException e1) {
//		    e1.printStackTrace();
//		} catch (IOException e1) {
//		    e1.printStackTrace();
//		}
		
//		URL url;
//		try {
//		        url = new URL("platform:/plugin/de.vogella.rcp.plugin.filereader/files/test.txt");
//		    InputStream inputStream = url.openConnection().getInputStream();
//		    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
//		    String inputLine;
//		 
//		    while ((inputLine = in.readLine()) != null) {
//		        System.out.println(inputLine);
//		    }
//		 
//		    in.close();
//		 
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
		
	}

}
