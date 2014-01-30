/**
 */
package featuremodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featuremodel.Note#getNote <em>Note</em>}</li>
 *   <li>{@link featuremodel.Note#getRelates <em>Relates</em>}</li>
 * </ul>
 * </p>
 *
 * @see featuremodel.FeaturemodelPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * The default value is <code>"my note"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see featuremodel.FeaturemodelPackage#getNote_Note()
	 * @model default="my note"
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link featuremodel.Note#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Relates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates</em>' reference.
	 * @see #setRelates(Note)
	 * @see featuremodel.FeaturemodelPackage#getNote_Relates()
	 * @model
	 * @generated
	 */
	Note getRelates();

	/**
	 * Sets the value of the '{@link featuremodel.Note#getRelates <em>Relates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relates</em>' reference.
	 * @see #getRelates()
	 * @generated
	 */
	void setRelates(Note value);

} // Note
