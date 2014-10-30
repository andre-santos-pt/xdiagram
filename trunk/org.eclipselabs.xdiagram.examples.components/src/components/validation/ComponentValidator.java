/**
 *
 * $Id$
 */
package components.validation;

import components.Component;
import components.Interface;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link components.Component}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateInterfaces(EList<Interface> value);
	boolean validateSubcomponents(EList<Component> value);
	boolean validateDependencies(EList<Interface> value);
}