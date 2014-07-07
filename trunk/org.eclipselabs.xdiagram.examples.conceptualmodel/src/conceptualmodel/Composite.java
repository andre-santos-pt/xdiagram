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
 *   <li>{@link conceptualmodel.Composite#isAggregation <em>Aggregation</em>}</li>
 *   <li>{@link conceptualmodel.Composite#getName <em>Name</em>}</li>
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
	 * @model required="true"
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

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see #setAggregation(boolean)
	 * @see conceptualmodel.ConceptualmodelPackage#getComposite_Aggregation()
	 * @model
	 * @generated
	 */
	boolean isAggregation();

	/**
	 * Sets the value of the '{@link conceptualmodel.Composite#isAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see #isAggregation()
	 * @generated
	 */
	void setAggregation(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conceptualmodel.ConceptualmodelPackage#getComposite_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conceptualmodel.Composite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Composite
