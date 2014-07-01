package org.eclipselabs.xdiagram.provider.internal;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	public static final String PLUGIN_ID = "org.eclipselabs.xdiagram.provider"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
//		Bundle bundle = Platform.getBundle("org.eclipselabs.xdiagram.examples.featurediagram");
//		ImageDescriptor img = ImageDescriptor.createFromURL(
//		          FileLocator.find(bundle, new Path("images/lolo.jpg"), null));
//		
//		((AbstractUIPlugin) Platform.getBundle("org.eclipse.graphiti.ui")).getImageRegistry().put("FeatureDiagramTypeProvider||file", img);
		
		
//		getImageRegistry().put("file", img);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		// TODO Auto-generated method stub
		super.initializeImageRegistry(reg);
	}
	
//	@Override
//	protected ImageRegistry createImageRegistry() {
//		
//		ImageRegistry registry = super.createImageRegistry();
//		Bundle bundle = Platform.getBundle("org.eclipselabs.xdiagram.examples.featurediagram");
//		ImageDescriptor img = ImageDescriptor.createFromURL(
//		          FileLocator.find(bundle, new Path("images/lolo.jpg"), null));
//		
//		registry.put("file", img);
//		return registry;
//	}

}
