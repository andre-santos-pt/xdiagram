/**
 */
package components;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.Component#getId <em>Id</em>}</li>
 *   <li>{@link components.Component#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link components.Component#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link components.Component#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see components.ComponentsPackage#getComponent_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link components.Component#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link components.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see components.ComponentsPackage#getComponent_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Subcomponents</b></em>' containment reference list.
	 * The list contents are of type {@link components.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponents</em>' containment reference list.
	 * @see components.ComponentsPackage#getComponent_Subcomponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getSubcomponents();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link components.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see components.ComponentsPackage#getComponent_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Interface> getDependencies();

} // Component
