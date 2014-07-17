/**
 */
package components.impl;

import components.Component;
import components.ComponentsPackage;
import components.Interface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.ComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link components.impl.ComponentImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link components.impl.ComponentImpl#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link components.impl.ComponentImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getSubcomponents() <em>Subcomponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> subcomponents;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPONENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, ComponentsPackage.COMPONENT__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getSubcomponents() {
		if (subcomponents == null) {
			subcomponents = new EObjectContainmentEList<Component>(Component.class, this, ComponentsPackage.COMPONENT__SUBCOMPONENTS);
		}
		return subcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Interface>(Interface.class, this, ComponentsPackage.COMPONENT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__SUBCOMPONENTS:
				return ((InternalEList<?>)getSubcomponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__ID:
				return getId();
			case ComponentsPackage.COMPONENT__INTERFACES:
				return getInterfaces();
			case ComponentsPackage.COMPONENT__SUBCOMPONENTS:
				return getSubcomponents();
			case ComponentsPackage.COMPONENT__DEPENDENCIES:
				return getDependencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__ID:
				setId((String)newValue);
				return;
			case ComponentsPackage.COMPONENT__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case ComponentsPackage.COMPONENT__SUBCOMPONENTS:
				getSubcomponents().clear();
				getSubcomponents().addAll((Collection<? extends Component>)newValue);
				return;
			case ComponentsPackage.COMPONENT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Interface>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ComponentsPackage.COMPONENT__INTERFACES:
				getInterfaces().clear();
				return;
			case ComponentsPackage.COMPONENT__SUBCOMPONENTS:
				getSubcomponents().clear();
				return;
			case ComponentsPackage.COMPONENT__DEPENDENCIES:
				getDependencies().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ComponentsPackage.COMPONENT__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case ComponentsPackage.COMPONENT__SUBCOMPONENTS:
				return subcomponents != null && !subcomponents.isEmpty();
			case ComponentsPackage.COMPONENT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
