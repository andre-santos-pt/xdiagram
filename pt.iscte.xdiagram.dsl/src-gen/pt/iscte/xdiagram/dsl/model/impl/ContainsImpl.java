/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.iscte.xdiagram.dsl.model.Contains;
import pt.iscte.xdiagram.dsl.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.impl.ContainsImpl#getModelReference <em>Model Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainsImpl extends FeatureImpl implements Contains
{
  /**
   * The cached value of the '{@link #getModelReference() <em>Model Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelReference()
   * @generated
   * @ordered
   */
  protected EReference modelReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelPackage.Literals.CONTAINS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelReference()
  {
    if (modelReference != null && modelReference.eIsProxy())
    {
      InternalEObject oldModelReference = (InternalEObject)modelReference;
      modelReference = (EReference)eResolveProxy(oldModelReference);
      if (modelReference != oldModelReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONTAINS__MODEL_REFERENCE, oldModelReference, modelReference));
      }
    }
    return modelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetModelReference()
  {
    return modelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelReference(EReference newModelReference)
  {
    EReference oldModelReference = modelReference;
    modelReference = newModelReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTAINS__MODEL_REFERENCE, oldModelReference, modelReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelPackage.CONTAINS__MODEL_REFERENCE:
        if (resolve) return getModelReference();
        return basicGetModelReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.CONTAINS__MODEL_REFERENCE:
        setModelReference((EReference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.CONTAINS__MODEL_REFERENCE:
        setModelReference((EReference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.CONTAINS__MODEL_REFERENCE:
        return modelReference != null;
    }
    return super.eIsSet(featureID);
  }

} //ContainsImpl
