/*
* generated by Xtext
*/
package org.eclipselabs.xdiagram.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XDiagramStandaloneSetup extends XDiagramStandaloneSetupGenerated{

	public static void doSetup() {
		new XDiagramStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

