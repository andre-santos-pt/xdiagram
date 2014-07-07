/**
 */
package conceptualmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see conceptualmodel.ConceptualmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ConceptualmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conceptualmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipselabs.xdiagram.examples/ConceptualModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conceptualmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptualmodelPackage eINSTANCE = conceptualmodel.impl.ConceptualmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link conceptualmodel.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptualmodel.impl.ClassImpl
	 * @see conceptualmodel.impl.ConceptualmodelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPERCLASS = 3;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMPOSITES = 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptualmodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptualmodel.impl.AttributeImpl
	 * @see conceptualmodel.impl.ConceptualmodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptualmodel.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptualmodel.impl.CompositeImpl
	 * @see conceptualmodel.impl.ConceptualmodelPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__END = 0;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__AGGREGATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link conceptualmodel.impl.ConceptualModelImpl <em>Conceptual Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptualmodel.impl.ConceptualModelImpl
	 * @see conceptualmodel.impl.ConceptualmodelPackageImpl#getConceptualModel()
	 * @generated
	 */
	int CONCEPTUAL_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL__CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Conceptual Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conceptual Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link conceptualmodel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see conceptualmodel.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link conceptualmodel.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conceptualmodel.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link conceptualmodel.Class#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see conceptualmodel.Class#isAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link conceptualmodel.Class#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see conceptualmodel.Class#getProperties()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Properties();

	/**
	 * Returns the meta object for the reference '{@link conceptualmodel.Class#getSuperclass <em>Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superclass</em>'.
	 * @see conceptualmodel.Class#getSuperclass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Superclass();

	/**
	 * Returns the meta object for the containment reference list '{@link conceptualmodel.Class#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see conceptualmodel.Class#getComposites()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Composites();

	/**
	 * Returns the meta object for class '{@link conceptualmodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see conceptualmodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link conceptualmodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conceptualmodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link conceptualmodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see conceptualmodel.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the reference '{@link conceptualmodel.Composite#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see conceptualmodel.Composite#getEnd()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_End();

	/**
	 * Returns the meta object for the attribute '{@link conceptualmodel.Composite#isAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see conceptualmodel.Composite#isAggregation()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Aggregation();

	/**
	 * Returns the meta object for the attribute '{@link conceptualmodel.Composite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conceptualmodel.Composite#getName()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Name();

	/**
	 * Returns the meta object for class '{@link conceptualmodel.ConceptualModel <em>Conceptual Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Model</em>'.
	 * @see conceptualmodel.ConceptualModel
	 * @generated
	 */
	EClass getConceptualModel();

	/**
	 * Returns the meta object for the containment reference list '{@link conceptualmodel.ConceptualModel#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see conceptualmodel.ConceptualModel#getClasses()
	 * @see #getConceptualModel()
	 * @generated
	 */
	EReference getConceptualModel_Classes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConceptualmodelFactory getConceptualmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link conceptualmodel.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptualmodel.impl.ClassImpl
		 * @see conceptualmodel.impl.ConceptualmodelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

		/**
		 * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPERCLASS = eINSTANCE.getClass_Superclass();

		/**
		 * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__COMPOSITES = eINSTANCE.getClass_Composites();

		/**
		 * The meta object literal for the '{@link conceptualmodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptualmodel.impl.AttributeImpl
		 * @see conceptualmodel.impl.ConceptualmodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link conceptualmodel.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptualmodel.impl.CompositeImpl
		 * @see conceptualmodel.impl.ConceptualmodelPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__END = eINSTANCE.getComposite_End();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__AGGREGATION = eINSTANCE.getComposite_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__NAME = eINSTANCE.getComposite_Name();

		/**
		 * The meta object literal for the '{@link conceptualmodel.impl.ConceptualModelImpl <em>Conceptual Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptualmodel.impl.ConceptualModelImpl
		 * @see conceptualmodel.impl.ConceptualmodelPackageImpl#getConceptualModel()
		 * @generated
		 */
		EClass CONCEPTUAL_MODEL = eINSTANCE.getConceptualModel();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_MODEL__CLASSES = eINSTANCE.getConceptualModel_Classes();

	}

} //ConceptualmodelPackage
