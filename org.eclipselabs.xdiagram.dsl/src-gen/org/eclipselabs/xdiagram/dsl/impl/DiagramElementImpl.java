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
import org.eclipselabs.xdiagram.dsl.ImageFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl#getToolName <em>Tool Name</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl#getIcon <em>Icon</em>}</li>
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
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected ImageFile icon;

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
  public ImageFile getIcon()
  {
    if (icon != null && icon.eIsProxy())
    {
      InternalEObject oldIcon = (InternalEObject)icon;
      icon = (ImageFile)eResolveProxy(oldIcon);
      if (icon != oldIcon)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.DIAGRAM_ELEMENT__ICON, oldIcon, icon));
      }
    }
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageFile basicGetIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(ImageFile newIcon)
  {
    ImageFile oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DIAGRAM_ELEMENT__ICON, oldIcon, icon));
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
      case DslPackage.DIAGRAM_ELEMENT__ICON:
        if (resolve) return getIcon();
        return basicGetIcon();
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
      case DslPackage.DIAGRAM_ELEMENT__ICON:
        setIcon((ImageFile)newValue);
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
      case DslPackage.DIAGRAM_ELEMENT__ICON:
        setIcon((ImageFile)null);
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
      case DslPackage.DIAGRAM_ELEMENT__ICON:
        return icon != null;
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
    result.append(')');
    return result.toString();
  }

} //DiagramElementImpl
