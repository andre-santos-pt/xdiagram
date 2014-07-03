/**
 */
package conceptualmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link conceptualmodel.ConceptualModel#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see conceptualmodel.ConceptualmodelPackage#getConceptualModel()
 * @model
 * @generated
 */
public interface ConceptualModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link conceptualmodel.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see conceptualmodel.ConceptualmodelPackage#getConceptualModel_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<conceptualmodel.Class> getClasses();

} // ConceptualModel
