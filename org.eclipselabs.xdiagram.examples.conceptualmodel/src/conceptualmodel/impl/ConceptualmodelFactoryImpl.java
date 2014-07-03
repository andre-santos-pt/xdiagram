/**
 */
package conceptualmodel.impl;

import conceptualmodel.Attribute;
import conceptualmodel.Composite;
import conceptualmodel.ConceptualModel;
import conceptualmodel.ConceptualmodelFactory;
import conceptualmodel.ConceptualmodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptualmodelFactoryImpl extends EFactoryImpl implements ConceptualmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptualmodelFactory init() {
		try {
			ConceptualmodelFactory theConceptualmodelFactory = (ConceptualmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ConceptualmodelPackage.eNS_URI);
			if (theConceptualmodelFactory != null) {
				return theConceptualmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConceptualmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConceptualmodelPackage.CLASS: return createClass();
			case ConceptualmodelPackage.ATTRIBUTE: return createAttribute();
			case ConceptualmodelPackage.COMPOSITE: return createComposite();
			case ConceptualmodelPackage.CONCEPTUAL_MODEL: return createConceptualModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conceptualmodel.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualModel createConceptualModel() {
		ConceptualModelImpl conceptualModel = new ConceptualModelImpl();
		return conceptualModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualmodelPackage getConceptualmodelPackage() {
		return (ConceptualmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConceptualmodelPackage getPackage() {
		return ConceptualmodelPackage.eINSTANCE;
	}

} //ConceptualmodelFactoryImpl
