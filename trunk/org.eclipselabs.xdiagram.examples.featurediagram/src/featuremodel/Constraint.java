/**
 */
package featuremodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featuremodel.Constraint#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link featuremodel.Constraint#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see featuremodel.FeaturemodelPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * The literals are from the enumeration {@link featuremodel.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see featuremodel.ConstraintType
	 * @see #setAnnotation(ConstraintType)
	 * @see featuremodel.FeaturemodelPackage#getConstraint_Annotation()
	 * @model
	 * @generated
	 */
	ConstraintType getAnnotation();

	/**
	 * Sets the value of the '{@link featuremodel.Constraint#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see featuremodel.ConstraintType
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see featuremodel.FeaturemodelPackage#getConstraint_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link featuremodel.Constraint#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Constraint
