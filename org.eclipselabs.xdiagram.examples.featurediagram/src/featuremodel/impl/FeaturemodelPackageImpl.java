/**
 */
package featuremodel.impl;

import featuremodel.AbstractFeature;
import featuremodel.Constraint;
import featuremodel.ConstraintType;
import featuremodel.Feature;
import featuremodel.FeatureModel;
import featuremodel.FeaturemodelFactory;
import featuremodel.FeaturemodelPackage;
import featuremodel.RootFeature;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemodelPackageImpl extends EPackageImpl implements FeaturemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see featuremodel.FeaturemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeaturemodelPackageImpl() {
		super(eNS_URI, FeaturemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FeaturemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FeaturemodelPackage init() {
		if (isInited) return (FeaturemodelPackage)EPackage.Registry.INSTANCE.getEPackage(FeaturemodelPackage.eNS_URI);

		// Obtain or create and register package
		FeaturemodelPackageImpl theFeaturemodelPackage = (FeaturemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FeaturemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FeaturemodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFeaturemodelPackage.createPackageContents();

		// Initialize created meta-data
		theFeaturemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFeaturemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FeaturemodelPackage.eNS_URI, theFeaturemodelPackage);
		return theFeaturemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootFeature() {
		return rootFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Optional() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Constraints() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Parent() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureModel() {
		return featureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModel_Features() {
		return (EReference)featureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModel_Root() {
		return (EReference)featureModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Annotation() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Feature() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeature() {
		return abstractFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeature_Name() {
		return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintType() {
		return constraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelFactory getFeaturemodelFactory() {
		return (FeaturemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootFeatureEClass = createEClass(ROOT_FEATURE);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__OPTIONAL);
		createEReference(featureEClass, FEATURE__CONSTRAINTS);
		createEReference(featureEClass, FEATURE__PARENT);

		featureModelEClass = createEClass(FEATURE_MODEL);
		createEReference(featureModelEClass, FEATURE_MODEL__FEATURES);
		createEReference(featureModelEClass, FEATURE_MODEL__ROOT);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__ANNOTATION);
		createEReference(constraintEClass, CONSTRAINT__FEATURE);

		abstractFeatureEClass = createEClass(ABSTRACT_FEATURE);
		createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__NAME);

		// Create enums
		constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootFeatureEClass.getESuperTypes().add(this.getAbstractFeature());
		featureEClass.getESuperTypes().add(this.getAbstractFeature());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootFeatureEClass, RootFeature.class, "RootFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Parent(), this.getAbstractFeature(), null, "parent", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureModelEClass, FeatureModel.class, "FeatureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureModel_Features(), this.getFeature(), null, "features", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModel_Root(), this.getRootFeature(), null, "root", null, 1, 1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Annotation(), this.getConstraintType(), "annotation", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Feature(), this.getFeature(), null, "feature", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFeatureEClass, AbstractFeature.class, "AbstractFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.REQUIRES);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.EXCLUDES);

		// Create resource
		createResource(eNS_URI);
	}

} //FeaturemodelPackageImpl
