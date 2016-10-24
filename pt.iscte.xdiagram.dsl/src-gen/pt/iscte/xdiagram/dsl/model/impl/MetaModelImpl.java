/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.iscte.xdiagram.dsl.model.MetaModel;
import pt.iscte.xdiagram.dsl.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.impl.MetaModelImpl#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.impl.MetaModelImpl#getEcorePath <em>Ecore Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaModelImpl extends MinimalEObjectImpl.Container implements MetaModel
{
  /**
   * The default value of the '{@link #getPlugin() <em>Plugin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlugin()
   * @generated
   * @ordered
   */
  protected static final String PLUGIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlugin() <em>Plugin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlugin()
   * @generated
   * @ordered
   */
  protected String plugin = PLUGIN_EDEFAULT;

  /**
   * The default value of the '{@link #getEcorePath() <em>Ecore Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcorePath()
   * @generated
   * @ordered
   */
  protected static final String ECORE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEcorePath() <em>Ecore Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcorePath()
   * @generated
   * @ordered
   */
  protected String ecorePath = ECORE_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaModelImpl()
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
    return ModelPackage.Literals.META_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlugin()
  {
    return plugin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlugin(String newPlugin)
  {
    String oldPlugin = plugin;
    plugin = newPlugin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.META_MODEL__PLUGIN, oldPlugin, plugin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEcorePath()
  {
    return ecorePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcorePath(String newEcorePath)
  {
    String oldEcorePath = ecorePath;
    ecorePath = newEcorePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.META_MODEL__ECORE_PATH, oldEcorePath, ecorePath));
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
      case ModelPackage.META_MODEL__PLUGIN:
        return getPlugin();
      case ModelPackage.META_MODEL__ECORE_PATH:
        return getEcorePath();
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
      case ModelPackage.META_MODEL__PLUGIN:
        setPlugin((String)newValue);
        return;
      case ModelPackage.META_MODEL__ECORE_PATH:
        setEcorePath((String)newValue);
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
      case ModelPackage.META_MODEL__PLUGIN:
        setPlugin(PLUGIN_EDEFAULT);
        return;
      case ModelPackage.META_MODEL__ECORE_PATH:
        setEcorePath(ECORE_PATH_EDEFAULT);
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
      case ModelPackage.META_MODEL__PLUGIN:
        return PLUGIN_EDEFAULT == null ? plugin != null : !PLUGIN_EDEFAULT.equals(plugin);
      case ModelPackage.META_MODEL__ECORE_PATH:
        return ECORE_PATH_EDEFAULT == null ? ecorePath != null : !ECORE_PATH_EDEFAULT.equals(ecorePath);
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
    result.append(" (plugin: ");
    result.append(plugin);
    result.append(", ecorePath: ");
    result.append(ecorePath);
    result.append(')');
    return result.toString();
  }

} //MetaModelImpl
