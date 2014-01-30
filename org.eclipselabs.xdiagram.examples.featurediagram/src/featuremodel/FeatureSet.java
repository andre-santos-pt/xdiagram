/**
 */
package featuremodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featuremodel.FeatureSet#getId <em>Id</em>}</li>
 *   <li>{@link featuremodel.FeatureSet#getRoot <em>Root</em>}</li>
 *   <li>{@link featuremodel.FeatureSet#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see featuremodel.FeaturemodelPackage#getFeatureSet()
 * @model
 * @generated
 */
public interface FeatureSet extends EObject {
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
	 * @see featuremodel.FeaturemodelPackage#getFeatureSet_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link featuremodel.FeatureSet#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see featuremodel.FeaturemodelPackage#getFeatureSet_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RootFeature getRoot();

	/**
	 * Sets the value of the '{@link featuremodel.FeatureSet#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(RootFeature value);

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
	 * @see featuremodel.FeaturemodelPackage#getFeatureSet_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // FeatureSet
