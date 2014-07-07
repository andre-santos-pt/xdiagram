/**
 *
 * $Id$
 */
package conceptualmodel.validation;


/**
 * A sample validator interface for {@link conceptualmodel.Composite}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CompositeValidator {
	boolean validate();

	boolean validateEnd(conceptualmodel.Class value);

	boolean validateAggregation(boolean value);

	boolean validateName(String value);
}
