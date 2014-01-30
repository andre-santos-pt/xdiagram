/**
 */
package featuremodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featuremodel.FeatureModel#getFeatures <em>Features</em>}</li>
 *   <li>{@link featuremodel.FeatureModel#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see featuremodel.FeaturemodelPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see featuremodel.FeaturemodelPackage#getFeatureModel_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(RootFeature)
	 * @see featuremodel.FeaturemodelPackage#getFeatureModel_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RootFeature getRoot();

	/**
	 * Sets the value of the '{@link featuremodel.FeatureModel#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(RootFeature value);

} // FeatureModel
