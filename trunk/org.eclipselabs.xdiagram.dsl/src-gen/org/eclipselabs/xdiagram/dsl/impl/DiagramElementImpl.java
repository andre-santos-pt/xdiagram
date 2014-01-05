/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.xdiagram.dsl.DiagramElement;
import org.eclipselabs.xdiagram.dsl.DslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl#getToolName <em>Tool Name</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl#getImageId <em>Image Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramElementImpl extends MinimalEObjectImpl.Container implements DiagramElement
{
  /**
   * The cached value of the '{@link #getModelClass() <em>Model Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelClass()
   * @generated
   * @ordered
   */
  protected EClass modelClass;

  /**
   * The default value of the '{@link #getToolName() <em>Tool Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolName()
   * @generated
   * @ordered
   */
  protected static final String TOOL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToolName() <em>Tool Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolName()
   * @generated
   * @ordered
   */
  protected String toolName = TOOL_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageId()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageId()
   * @generated
   * @ordered
   */
  protected String imageId = IMAGE_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiagramElementImpl()
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
    return DslPackage.Literals.DIAGRAM_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelClass()
  {
    if (modelClass != null && modelClass.eIsProxy())
    {
      InternalEObject oldModelClass = (InternalEObject)modelClass;
      modelClass = (EClass)eResolveProxy(oldModelClass);
      if (modelClass != oldModelClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.DIAGRAM_ELEMENT__MODEL_CLASS, oldModelClass, modelClass));
      }
    }
    return modelClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetModelClass()
  {
    return modelClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelClass(EClass newModelClass)
  {
    EClass oldModelClass = modelClass;
    modelClass = newModelClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DIAGRAM_ELEMENT__MODEL_CLASS, oldModelClass, modelClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToolName()
  {
    return toolName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToolName(String newToolName)
  {
    String oldToolName = toolName;
    toolName = newToolName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DIAGRAM_ELEMENT__TOOL_NAME, oldToolName, toolName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImageId()
  {
    return imageId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImageId(String newImageId)
  {
    String oldImageId = imageId;
    imageId = newImageId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DIAGRAM_ELEMENT__IMAGE_ID, oldImageId, imageId));
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
      case DslPackage.DIAGRAM_ELEMENT__MODEL_CLASS:
        if (resolve) return getModelClass();
        return basicGetModelClass();
      case DslPackage.DIAGRAM_ELEMENT__TOOL_NAME:
        return getToolName();
      case DslPackage.DIAGRAM_ELEMENT__IMAGE_ID:
        return getImageId();
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
      case DslPackage.DIAGRAM_ELEMENT__MODEL_CLASS:
        setModelClass((EClass)newValue);
        return;
      case DslPackage.DIAGRAM_ELEMENT__TOOL_NAME:
        setToolName((String)newValue);
        return;
      case DslPackage.DIAGRAM_ELEMENT__IMAGE_ID:
        setImageId((String)newValue);
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
      case DslPackage.DIAGRAM_ELEMENT__MODEL_CLASS:
        setModelClass((EClass)null);
        return;
      case DslPackage.DIAGRAM_ELEMENT__TOOL_NAME:
        setToolName(TOOL_NAME_EDEFAULT);
        return;
      case DslPackage.DIAGRAM_ELEMENT__IMAGE_ID:
        setImageId(IMAGE_ID_EDEFAULT);
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
      case DslPackage.DIAGRAM_ELEMENT__MODEL_CLASS:
        return modelClass != null;
      case DslPackage.DIAGRAM_ELEMENT__TOOL_NAME:
        return TOOL_NAME_EDEFAULT == null ? toolName != null : !TOOL_NAME_EDEFAULT.equals(toolName);
      case DslPackage.DIAGRAM_ELEMENT__IMAGE_ID:
        return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (toolName: ");
    result.append(toolName);
    result.append(", imageId: ");
    result.append(imageId);
    result.append(')');
    return result.toString();
  }

} //DiagramElementImpl
