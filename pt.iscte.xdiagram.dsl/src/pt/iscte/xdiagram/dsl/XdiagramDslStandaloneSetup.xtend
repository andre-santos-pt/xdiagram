/*
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class XdiagramDslStandaloneSetup extends XdiagramDslStandaloneSetupGenerated {

	def static void doSetup() {
		new XdiagramDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
