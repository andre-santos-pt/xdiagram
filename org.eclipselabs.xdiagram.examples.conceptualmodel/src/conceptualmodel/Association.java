/**
 */
package conceptualmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conceptualmodel.Association#getTo <em>To</em>}</li>
 *   <li>{@link conceptualmodel.Association#getType <em>Type</em>}</li>
 *   <li>{@link conceptualmodel.Association#getName <em>Name</em>}</li>
 *   <li>{@link conceptualmodel.Association#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see conceptualmodel.ConceptualmodelPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Entity)
	 * @see conceptualmodel.ConceptualmodelPackage#getAssociation_To()
	 * @model required="true"
	 * @generated
	 */
	Entity getTo();

	/**
	 * Sets the value of the '{@link conceptualmodel.Association#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Entity value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link conceptualmodel.AssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see conceptualmodel.AssociationType
	 * @see #setType(AssociationType)
	 * @see conceptualmodel.ConceptualmodelPackage#getAssociation_Type()
	 * @model required="true"
	 * @generated
	 */
	AssociationType getType();

	/**
	 * Sets the value of the '{@link conceptualmodel.Association#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see conceptualmodel.AssociationType
	 * @see #getType()
	 * @generated
	 */
	void setType(AssociationType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conceptualmodel.ConceptualmodelPackage#getAssociation_Name()
	 * @model default="name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conceptualmodel.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"*"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see conceptualmodel.ConceptualmodelPackage#getAssociation_Cardinality()
	 * @model default="*" required="true"
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link conceptualmodel.Association#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

} // Association
