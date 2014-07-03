/**
 */
package conceptualmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link conceptualmodel.Composite#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see conceptualmodel.ConceptualmodelPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends EObject {
	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(conceptualmodel.Class)
	 * @see conceptualmodel.ConceptualmodelPackage#getComposite_End()
	 * @model
	 * @generated
	 */
	conceptualmodel.Class getEnd();

	/**
	 * Sets the value of the '{@link conceptualmodel.Composite#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(conceptualmodel.Class value);

} // Composite
