/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl;

import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import pt.iscte.xdiagram.dsl.AbstractXdiagramDslRuntimeModule;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class XdiagramDslRuntimeModule extends AbstractXdiagramDslRuntimeModule {
  @Override
  public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
    return ImportUriGlobalScopeProvider.class;
  }
}
