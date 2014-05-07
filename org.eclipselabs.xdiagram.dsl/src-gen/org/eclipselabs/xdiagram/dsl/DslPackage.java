/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xdiagram.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/xdiagram/Dsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslPackage eINSTANCE = org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl <em>XDiagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getXDiagram()
   * @generated
   */
  int XDIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__IMPORT_URI = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Diagram</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__DIAGRAM = 2;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__GROUPS = 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__ELEMENTS = 4;

  /**
   * The feature id for the '<em><b>Styles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__STYLES = 5;

  /**
   * The feature id for the '<em><b>Colors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__COLORS = 6;

  /**
   * The feature id for the '<em><b>Figures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__FIGURES = 7;

  /**
   * The number of structural features of the '<em>XDiagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.ImportStatementImpl <em>Import Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.ImportStatementImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getImportStatement()
   * @generated
   */
  int IMPORT_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.DiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.DiagramImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDiagram()
   * @generated
   */
  int DIAGRAM = 2;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__MODEL_CLASS = 0;

  /**
   * The feature id for the '<em><b>Contains</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__CONTAINS = 1;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.GroupImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = 0;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDiagramElement()
   * @generated
   */
  int DIAGRAM_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__MODEL_CLASS = 0;

  /**
   * The feature id for the '<em><b>Tool Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__TOOL_NAME = 1;

  /**
   * The feature id for the '<em><b>Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__GROUP = 2;

  /**
   * The feature id for the '<em><b>Image Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__IMAGE_ID = 3;

  /**
   * The number of structural features of the '<em>Diagram Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.FeatureContainerImpl <em>Feature Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.FeatureContainerImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFeatureContainer()
   * @generated
   */
  int FEATURE_CONTAINER = 7;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CONTAINER__STYLED = 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CONTAINER__STYLE = 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CONTAINER__FEATURES = 2;

  /**
   * The number of structural features of the '<em>Feature Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CONTAINER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.StyleImpl <em>Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.StyleImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getStyle()
   * @generated
   */
  int STYLE = 5;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__STYLED = FEATURE_CONTAINER__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__STYLE = FEATURE_CONTAINER__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__FEATURES = FEATURE_CONTAINER__FEATURES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__NAME = FEATURE_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_COUNT = FEATURE_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.FeatureImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 6;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__CONDITIONAL = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.FeatureConditionalImpl <em>Feature Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.FeatureConditionalImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFeatureConditional()
   * @generated
   */
  int FEATURE_CONDITIONAL = 8;

  /**
   * The feature id for the '<em><b>Model Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CONDITIONAL__MODEL_ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CONDITIONAL__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CONDITIONAL__VALUE = 2;

  /**
   * The number of structural features of the '<em>Feature Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CONDITIONAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.NodeImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getNode()
   * @generated
   */
  int NODE = 9;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__MODEL_CLASS = DIAGRAM_ELEMENT__MODEL_CLASS;

  /**
   * The feature id for the '<em><b>Tool Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__TOOL_NAME = DIAGRAM_ELEMENT__TOOL_NAME;

  /**
   * The feature id for the '<em><b>Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__GROUP = DIAGRAM_ELEMENT__GROUP;

  /**
   * The feature id for the '<em><b>Image Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__IMAGE_ID = DIAGRAM_ELEMENT__IMAGE_ID;

  /**
   * The feature id for the '<em><b>Root Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ROOT_FIGURE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.LinkImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLink()
   * @generated
   */
  int LINK = 10;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__MODEL_CLASS = DIAGRAM_ELEMENT__MODEL_CLASS;

  /**
   * The feature id for the '<em><b>Tool Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TOOL_NAME = DIAGRAM_ELEMENT__TOOL_NAME;

  /**
   * The feature id for the '<em><b>Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__GROUP = DIAGRAM_ELEMENT__GROUP;

  /**
   * The feature id for the '<em><b>Image Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__IMAGE_ID = DIAGRAM_ELEMENT__IMAGE_ID;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__STYLED = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__STYLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__FEATURES = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__MODEL_REFERENCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Complex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__COMPLEX = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Source Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__SOURCE_REFERENCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Target Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TARGET_REFERENCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TYPE = DIAGRAM_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__DECORATORS = DIAGRAM_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.DecoratorImpl <em>Decorator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.DecoratorImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDecorator()
   * @generated
   */
  int DECORATOR = 11;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATOR__POSITION = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATOR__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATOR__TARGET = 2;

  /**
   * The feature id for the '<em><b>Middle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATOR__MIDDLE = 3;

  /**
   * The feature id for the '<em><b>Static Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATOR__STATIC_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATOR__LABEL = 5;

  /**
   * The number of structural features of the '<em>Decorator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.ConnectableElementImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getConnectableElement()
   * @generated
   */
  int CONNECTABLE_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT__STYLED = FEATURE_CONTAINER__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT__STYLE = FEATURE_CONTAINER__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT__FEATURES = FEATURE_CONTAINER__FEATURES;

  /**
   * The feature id for the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT__COMPOSITE = FEATURE_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT__CHILDREN = FEATURE_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Connectable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT_FEATURE_COUNT = FEATURE_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.AnchorImpl <em>Anchor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.AnchorImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getAnchor()
   * @generated
   */
  int ANCHOR = 13;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__DIRECTION = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__MODEL_REFERENCE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anchor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.CustomColorImpl <em>Custom Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.CustomColorImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getCustomColor()
   * @generated
   */
  int CUSTOM_COLOR = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR__NAME = 0;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR__R = 1;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR__G = 2;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR__B = 3;

  /**
   * The number of structural features of the '<em>Custom Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.ColorImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getColor()
   * @generated
   */
  int COLOR = 15;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__DEFAULT = 0;

  /**
   * The feature id for the '<em><b>Custom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__CUSTOM = 1;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.CustomFigureImpl <em>Custom Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.CustomFigureImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getCustomFigure()
   * @generated
   */
  int CUSTOM_FIGURE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIGURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIGURE__ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Custom Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIGURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.CustomImpl <em>Custom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.CustomImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getCustom()
   * @generated
   */
  int CUSTOM = 17;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM__STYLED = CONNECTABLE_ELEMENT__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM__STYLE = CONNECTABLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM__COMPOSITE = CONNECTABLE_ELEMENT__COMPOSITE;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM__CHILDREN = CONNECTABLE_ELEMENT__CHILDREN;

  /**
   * The feature id for the '<em><b>Figure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM__FIGURE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.RectangleImpl <em>Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.RectangleImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getRectangle()
   * @generated
   */
  int RECTANGLE = 18;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__STYLED = CONNECTABLE_ELEMENT__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__STYLE = CONNECTABLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__COMPOSITE = CONNECTABLE_ELEMENT__COMPOSITE;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__CHILDREN = CONNECTABLE_ELEMENT__CHILDREN;

  /**
   * The feature id for the '<em><b>Rectangle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__RECTANGLE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Square</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__SQUARE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.RhombusImpl <em>Rhombus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.RhombusImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getRhombus()
   * @generated
   */
  int RHOMBUS = 19;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHOMBUS__STYLED = CONNECTABLE_ELEMENT__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHOMBUS__STYLE = CONNECTABLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHOMBUS__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHOMBUS__COMPOSITE = CONNECTABLE_ELEMENT__COMPOSITE;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHOMBUS__CHILDREN = CONNECTABLE_ELEMENT__CHILDREN;

  /**
   * The number of structural features of the '<em>Rhombus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHOMBUS_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.EllipseImpl <em>Ellipse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.EllipseImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getEllipse()
   * @generated
   */
  int ELLIPSE = 20;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__STYLED = CONNECTABLE_ELEMENT__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__STYLE = CONNECTABLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__COMPOSITE = CONNECTABLE_ELEMENT__COMPOSITE;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__CHILDREN = CONNECTABLE_ELEMENT__CHILDREN;

  /**
   * The feature id for the '<em><b>Ellipse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__ELLIPSE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Circle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__CIRCLE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ellipse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.PolylineImpl <em>Polyline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.PolylineImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getPolyline()
   * @generated
   */
  int POLYLINE = 21;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__STYLED = CONNECTABLE_ELEMENT__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__STYLE = CONNECTABLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__COMPOSITE = CONNECTABLE_ELEMENT__COMPOSITE;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__CHILDREN = CONNECTABLE_ELEMENT__CHILDREN;

  /**
   * The feature id for the '<em><b>Polygon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__POLYGON = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Polyline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__POLYLINE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Polyline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.ContainsImpl <em>Contains</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.ContainsImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getContains()
   * @generated
   */
  int CONTAINS = 22;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS__MODEL_REFERENCE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS__LAYOUT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Contains</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.ValueImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getValue()
   * @generated
   */
  int VALUE = 23;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.IntValueImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.DoubleValueImpl <em>Double Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.DoubleValueImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDoubleValue()
   * @generated
   */
  int DOUBLE_VALUE = 25;

  /**
   * The feature id for the '<em><b>Value Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE__VALUE_INT = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Decimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE__VALUE_DECIMAL = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Double Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.StringValueImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 26;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__NULL = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.BooleanValueImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.EnumValueImpl <em>Enum Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.EnumValueImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getEnumValue()
   * @generated
   */
  int ENUM_VALUE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__NAME = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.LabelImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 29;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__STYLED = CONNECTABLE_ELEMENT__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__STYLE = CONNECTABLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__COMPOSITE = CONNECTABLE_ELEMENT__COMPOSITE;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__CHILDREN = CONNECTABLE_ELEMENT__CHILDREN;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__EDITABLE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.ImageImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 30;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__STYLED = CONNECTABLE_ELEMENT__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__STYLE = CONNECTABLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__COMPOSITE = CONNECTABLE_ELEMENT__COMPOSITE;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__CHILDREN = CONNECTABLE_ELEMENT__CHILDREN;

  /**
   * The feature id for the '<em><b>Image Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__IMAGE_ID = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.InvisibleImpl <em>Invisible</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.InvisibleImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getInvisible()
   * @generated
   */
  int INVISIBLE = 31;

  /**
   * The feature id for the '<em><b>Styled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVISIBLE__STYLED = CONNECTABLE_ELEMENT__STYLED;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVISIBLE__STYLE = CONNECTABLE_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVISIBLE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVISIBLE__COMPOSITE = CONNECTABLE_ELEMENT__COMPOSITE;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVISIBLE__CHILDREN = CONNECTABLE_ELEMENT__CHILDREN;

  /**
   * The number of structural features of the '<em>Invisible</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVISIBLE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.ColorFeatureImpl <em>Color Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.ColorFeatureImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getColorFeature()
   * @generated
   */
  int COLOR_FEATURE = 32;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__TYPE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__COLOR = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Color Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.TransparencyImpl <em>Transparency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.TransparencyImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getTransparency()
   * @generated
   */
  int TRANSPARENCY = 33;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPARENCY__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Percent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPARENCY__PERCENT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transparency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPARENCY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.SizeImpl <em>Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.SizeImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getSize()
   * @generated
   */
  int SIZE = 34;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__WIDTH = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__HEIGHT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.PointImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getPoint()
   * @generated
   */
  int POINT = 35;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__X = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__Y = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.PositionImpl <em>Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.PositionImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getPosition()
   * @generated
   */
  int POSITION = 36;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION__X = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION__Y = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Position</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.CornerImpl <em>Corner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.CornerImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getCorner()
   * @generated
   */
  int CORNER = 37;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER__ANGLE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Corner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.TextValueImpl <em>Text Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.TextValueImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getTextValue()
   * @generated
   */
  int TEXT_VALUE = 38;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VALUE__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VALUE__TEXT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VALUE__MODEL_ATTRIBUTE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Text Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VALUE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.FontFaceImpl <em>Font Face</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.FontFaceImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontFace()
   * @generated
   */
  int FONT_FACE = 39;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Face</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE__FACE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Font Face</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.FontSizeImpl <em>Font Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.FontSizeImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontSize()
   * @generated
   */
  int FONT_SIZE = 40;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE__SIZE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Font Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.FontStyleImpl <em>Font Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.FontStyleImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontStyle()
   * @generated
   */
  int FONT_STYLE = 41;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Styles</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE__STYLES = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Font Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.LineStyleImpl <em>Line Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.LineStyleImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLineStyle()
   * @generated
   */
  int LINE_STYLE = 42;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE__STYLE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Line Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.impl.LineWidthImpl <em>Line Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.impl.LineWidthImpl
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLineWidth()
   * @generated
   */
  int LINE_WIDTH = 43;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_WIDTH__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_WIDTH__WIDTH = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Line Width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_WIDTH_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.FigureType <em>Figure Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.FigureType
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFigureType()
   * @generated
   */
  int FIGURE_TYPE = 44;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.ConnectionType <em>Connection Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.ConnectionType
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getConnectionType()
   * @generated
   */
  int CONNECTION_TYPE = 45;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.AnchorDirection <em>Anchor Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.AnchorDirection
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getAnchorDirection()
   * @generated
   */
  int ANCHOR_DIRECTION = 46;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.DefaultColor <em>Default Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.DefaultColor
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDefaultColor()
   * @generated
   */
  int DEFAULT_COLOR = 47;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.ContainerLayout <em>Container Layout</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.ContainerLayout
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getContainerLayout()
   * @generated
   */
  int CONTAINER_LAYOUT = 48;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.Operator
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 49;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.BooleanLiteral <em>Boolean Literal</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.BooleanLiteral
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 50;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.FontFaceType <em>Font Face Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.FontFaceType
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontFaceType()
   * @generated
   */
  int FONT_FACE_TYPE = 51;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.FontStyleType <em>Font Style Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.FontStyleType
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontStyleType()
   * @generated
   */
  int FONT_STYLE_TYPE = 52;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.dsl.LineType <em>Line Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.dsl.LineType
   * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLineType()
   * @generated
   */
  int LINE_TYPE = 53;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.XDiagram <em>XDiagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDiagram</em>'.
   * @see org.eclipselabs.xdiagram.dsl.XDiagram
   * @generated
   */
  EClass getXDiagram();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.eclipselabs.xdiagram.dsl.XDiagram#getImportURI()
   * @see #getXDiagram()
   * @generated
   */
  EAttribute getXDiagram_ImportURI();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipselabs.xdiagram.dsl.XDiagram#getImports()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Diagram</em>'.
   * @see org.eclipselabs.xdiagram.dsl.XDiagram#getDiagram()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Diagram();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see org.eclipselabs.xdiagram.dsl.XDiagram#getGroups()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Groups();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipselabs.xdiagram.dsl.XDiagram#getElements()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getStyles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Styles</em>'.
   * @see org.eclipselabs.xdiagram.dsl.XDiagram#getStyles()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Styles();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getColors <em>Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Colors</em>'.
   * @see org.eclipselabs.xdiagram.dsl.XDiagram#getColors()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Colors();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getFigures <em>Figures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Figures</em>'.
   * @see org.eclipselabs.xdiagram.dsl.XDiagram#getFigures()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Figures();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Statement</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ImportStatement
   * @generated
   */
  EClass getImportStatement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.ImportStatement#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ImportStatement#getImportedNamespace()
   * @see #getImportStatement()
   * @generated
   */
  EAttribute getImportStatement_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Diagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Diagram
   * @generated
   */
  EClass getDiagram();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.Diagram#getModelClass <em>Model Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Class</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Diagram#getModelClass()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_ModelClass();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.Diagram#getContains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contains</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Diagram#getContains()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_Contains();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Group#getName()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.DiagramElement <em>Diagram Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram Element</em>'.
   * @see org.eclipselabs.xdiagram.dsl.DiagramElement
   * @generated
   */
  EClass getDiagramElement();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getModelClass <em>Model Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Class</em>'.
   * @see org.eclipselabs.xdiagram.dsl.DiagramElement#getModelClass()
   * @see #getDiagramElement()
   * @generated
   */
  EReference getDiagramElement_ModelClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getToolName <em>Tool Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tool Name</em>'.
   * @see org.eclipselabs.xdiagram.dsl.DiagramElement#getToolName()
   * @see #getDiagramElement()
   * @generated
   */
  EAttribute getDiagramElement_ToolName();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Group</em>'.
   * @see org.eclipselabs.xdiagram.dsl.DiagramElement#getGroup()
   * @see #getDiagramElement()
   * @generated
   */
  EReference getDiagramElement_Group();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getImageId <em>Image Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image Id</em>'.
   * @see org.eclipselabs.xdiagram.dsl.DiagramElement#getImageId()
   * @see #getDiagramElement()
   * @generated
   */
  EAttribute getDiagramElement_ImageId();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Style
   * @generated
   */
  EClass getStyle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Style#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Style#getName()
   * @see #getStyle()
   * @generated
   */
  EAttribute getStyle_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.dsl.Feature#getConditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Feature#getConditional()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Conditional();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.FeatureContainer <em>Feature Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Container</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FeatureContainer
   * @generated
   */
  EClass getFeatureContainer();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.FeatureContainer#isStyled <em>Styled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Styled</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FeatureContainer#isStyled()
   * @see #getFeatureContainer()
   * @generated
   */
  EAttribute getFeatureContainer_Styled();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.FeatureContainer#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FeatureContainer#getStyle()
   * @see #getFeatureContainer()
   * @generated
   */
  EReference getFeatureContainer_Style();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.FeatureContainer#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FeatureContainer#getFeatures()
   * @see #getFeatureContainer()
   * @generated
   */
  EReference getFeatureContainer_Features();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.FeatureConditional <em>Feature Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Conditional</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FeatureConditional
   * @generated
   */
  EClass getFeatureConditional();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.FeatureConditional#getModelAttribute <em>Model Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Attribute</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FeatureConditional#getModelAttribute()
   * @see #getFeatureConditional()
   * @generated
   */
  EReference getFeatureConditional_ModelAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.FeatureConditional#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FeatureConditional#getOperator()
   * @see #getFeatureConditional()
   * @generated
   */
  EAttribute getFeatureConditional_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.dsl.FeatureConditional#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FeatureConditional#getValue()
   * @see #getFeatureConditional()
   * @generated
   */
  EReference getFeatureConditional_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.dsl.Node#getRootFigure <em>Root Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Figure</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Node#getRootFigure()
   * @see #getNode()
   * @generated
   */
  EReference getNode_RootFigure();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.Link#getModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Reference</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Link#getModelReference()
   * @see #getLink()
   * @generated
   */
  EReference getLink_ModelReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Link#isComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Complex</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Link#isComplex()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Complex();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.Link#getSourceReference <em>Source Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Reference</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Link#getSourceReference()
   * @see #getLink()
   * @generated
   */
  EReference getLink_SourceReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.Link#getTargetReference <em>Target Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Reference</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Link#getTargetReference()
   * @see #getLink()
   * @generated
   */
  EReference getLink_TargetReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Link#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Link#getType()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.Link#getDecorators <em>Decorators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decorators</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Link#getDecorators()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Decorators();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Decorator <em>Decorator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decorator</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Decorator
   * @generated
   */
  EClass getDecorator();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Decorator#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Decorator#getPosition()
   * @see #getDecorator()
   * @generated
   */
  EAttribute getDecorator_Position();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Decorator#isSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Decorator#isSource()
   * @see #getDecorator()
   * @generated
   */
  EAttribute getDecorator_Source();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Decorator#isTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Decorator#isTarget()
   * @see #getDecorator()
   * @generated
   */
  EAttribute getDecorator_Target();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Decorator#isMiddle <em>Middle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Middle</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Decorator#isMiddle()
   * @see #getDecorator()
   * @generated
   */
  EAttribute getDecorator_Middle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.dsl.Decorator#getStaticElement <em>Static Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Static Element</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Decorator#getStaticElement()
   * @see #getDecorator()
   * @generated
   */
  EReference getDecorator_StaticElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.dsl.Decorator#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Decorator#getLabel()
   * @see #getDecorator()
   * @generated
   */
  EReference getDecorator_Label();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.ConnectableElement <em>Connectable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connectable Element</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ConnectableElement
   * @generated
   */
  EClass getConnectableElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.ConnectableElement#isComposite <em>Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Composite</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ConnectableElement#isComposite()
   * @see #getConnectableElement()
   * @generated
   */
  EAttribute getConnectableElement_Composite();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.dsl.ConnectableElement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ConnectableElement#getChildren()
   * @see #getConnectableElement()
   * @generated
   */
  EReference getConnectableElement_Children();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Anchor <em>Anchor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Anchor
   * @generated
   */
  EClass getAnchor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Anchor#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Anchor#getDirection()
   * @see #getAnchor()
   * @generated
   */
  EAttribute getAnchor_Direction();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.Anchor#getModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Reference</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Anchor#getModelReference()
   * @see #getAnchor()
   * @generated
   */
  EReference getAnchor_ModelReference();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.CustomColor <em>Custom Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Color</em>'.
   * @see org.eclipselabs.xdiagram.dsl.CustomColor
   * @generated
   */
  EClass getCustomColor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.CustomColor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.dsl.CustomColor#getName()
   * @see #getCustomColor()
   * @generated
   */
  EAttribute getCustomColor_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.CustomColor#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.eclipselabs.xdiagram.dsl.CustomColor#getR()
   * @see #getCustomColor()
   * @generated
   */
  EAttribute getCustomColor_R();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.CustomColor#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.eclipselabs.xdiagram.dsl.CustomColor#getG()
   * @see #getCustomColor()
   * @generated
   */
  EAttribute getCustomColor_G();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.CustomColor#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.eclipselabs.xdiagram.dsl.CustomColor#getB()
   * @see #getCustomColor()
   * @generated
   */
  EAttribute getCustomColor_B();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Color#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Color#getDefault()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Default();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.Color#getCustom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Custom</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Color#getCustom()
   * @see #getColor()
   * @generated
   */
  EReference getColor_Custom();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.CustomFigure <em>Custom Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Figure</em>'.
   * @see org.eclipselabs.xdiagram.dsl.CustomFigure
   * @generated
   */
  EClass getCustomFigure();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.CustomFigure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.dsl.CustomFigure#getName()
   * @see #getCustomFigure()
   * @generated
   */
  EAttribute getCustomFigure_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.dsl.CustomFigure#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.eclipselabs.xdiagram.dsl.CustomFigure#getElement()
   * @see #getCustomFigure()
   * @generated
   */
  EReference getCustomFigure_Element();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Custom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Custom
   * @generated
   */
  EClass getCustom();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.Custom#getFigure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Figure</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Custom#getFigure()
   * @see #getCustom()
   * @generated
   */
  EReference getCustom_Figure();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rectangle</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Rectangle
   * @generated
   */
  EClass getRectangle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Rectangle#isRectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rectangle</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Rectangle#isRectangle()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_Rectangle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Rectangle#isSquare <em>Square</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Square</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Rectangle#isSquare()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_Square();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Rhombus <em>Rhombus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rhombus</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Rhombus
   * @generated
   */
  EClass getRhombus();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Ellipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ellipse</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Ellipse
   * @generated
   */
  EClass getEllipse();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Ellipse#isEllipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ellipse</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Ellipse#isEllipse()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Ellipse();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Ellipse#isCircle <em>Circle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Circle</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Ellipse#isCircle()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Circle();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Polyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Polyline</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Polyline
   * @generated
   */
  EClass getPolyline();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Polyline#isPolygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Polygon</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Polyline#isPolygon()
   * @see #getPolyline()
   * @generated
   */
  EAttribute getPolyline_Polygon();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Polyline#isPolyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Polyline</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Polyline#isPolyline()
   * @see #getPolyline()
   * @generated
   */
  EAttribute getPolyline_Polyline();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Contains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contains</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Contains
   * @generated
   */
  EClass getContains();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.Contains#getModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Reference</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Contains#getModelReference()
   * @see #getContains()
   * @generated
   */
  EReference getContains_ModelReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Contains#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Contains#getLayout()
   * @see #getContains()
   * @generated
   */
  EAttribute getContains_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.DoubleValue <em>Double Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.DoubleValue
   * @generated
   */
  EClass getDoubleValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.DoubleValue#getValueInt <em>Value Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Int</em>'.
   * @see org.eclipselabs.xdiagram.dsl.DoubleValue#getValueInt()
   * @see #getDoubleValue()
   * @generated
   */
  EAttribute getDoubleValue_ValueInt();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.DoubleValue#getValueDecimal <em>Value Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Decimal</em>'.
   * @see org.eclipselabs.xdiagram.dsl.DoubleValue#getValueDecimal()
   * @see #getDoubleValue()
   * @generated
   */
  EAttribute getDoubleValue_ValueDecimal();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.StringValue#isNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see org.eclipselabs.xdiagram.dsl.StringValue#isNull()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Null();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.EnumValue <em>Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.EnumValue
   * @generated
   */
  EClass getEnumValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.EnumValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.dsl.EnumValue#getName()
   * @see #getEnumValue()
   * @generated
   */
  EAttribute getEnumValue_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Label#isEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Editable</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Label#isEditable()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Editable();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Image#getImageId <em>Image Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image Id</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Image#getImageId()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_ImageId();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Invisible <em>Invisible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invisible</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Invisible
   * @generated
   */
  EClass getInvisible();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.ColorFeature <em>Color Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Feature</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ColorFeature
   * @generated
   */
  EClass getColorFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.ColorFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ColorFeature#getType()
   * @see #getColorFeature()
   * @generated
   */
  EAttribute getColorFeature_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.dsl.ColorFeature#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ColorFeature#getColor()
   * @see #getColorFeature()
   * @generated
   */
  EReference getColorFeature_Color();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Transparency <em>Transparency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transparency</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Transparency
   * @generated
   */
  EClass getTransparency();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Transparency#getPercent <em>Percent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Percent</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Transparency#getPercent()
   * @see #getTransparency()
   * @generated
   */
  EAttribute getTransparency_Percent();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Size
   * @generated
   */
  EClass getSize();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Size#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Size#getWidth()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Width();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Size#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Size#getHeight()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Height();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Point#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Point#getX()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Point#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Point#getY()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Y();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Position
   * @generated
   */
  EClass getPosition();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Position#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Position#getX()
   * @see #getPosition()
   * @generated
   */
  EAttribute getPosition_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Position#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Position#getY()
   * @see #getPosition()
   * @generated
   */
  EAttribute getPosition_Y();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.Corner <em>Corner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Corner</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Corner
   * @generated
   */
  EClass getCorner();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.Corner#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Corner#getAngle()
   * @see #getCorner()
   * @generated
   */
  EAttribute getCorner_Angle();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.TextValue <em>Text Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Value</em>'.
   * @see org.eclipselabs.xdiagram.dsl.TextValue
   * @generated
   */
  EClass getTextValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.TextValue#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipselabs.xdiagram.dsl.TextValue#getText()
   * @see #getTextValue()
   * @generated
   */
  EAttribute getTextValue_Text();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.dsl.TextValue#getModelAttribute <em>Model Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Attribute</em>'.
   * @see org.eclipselabs.xdiagram.dsl.TextValue#getModelAttribute()
   * @see #getTextValue()
   * @generated
   */
  EReference getTextValue_ModelAttribute();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.FontFace <em>Font Face</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Face</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FontFace
   * @generated
   */
  EClass getFontFace();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.FontFace#getFace <em>Face</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Face</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FontFace#getFace()
   * @see #getFontFace()
   * @generated
   */
  EAttribute getFontFace_Face();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.FontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Size</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FontSize
   * @generated
   */
  EClass getFontSize();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.FontSize#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FontSize#getSize()
   * @see #getFontSize()
   * @generated
   */
  EAttribute getFontSize_Size();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.FontStyle <em>Font Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Style</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FontStyle
   * @generated
   */
  EClass getFontStyle();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipselabs.xdiagram.dsl.FontStyle#getStyles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Styles</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FontStyle#getStyles()
   * @see #getFontStyle()
   * @generated
   */
  EAttribute getFontStyle_Styles();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.LineStyle <em>Line Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Style</em>'.
   * @see org.eclipselabs.xdiagram.dsl.LineStyle
   * @generated
   */
  EClass getLineStyle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.LineStyle#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.dsl.LineStyle#getStyle()
   * @see #getLineStyle()
   * @generated
   */
  EAttribute getLineStyle_Style();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.dsl.LineWidth <em>Line Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Width</em>'.
   * @see org.eclipselabs.xdiagram.dsl.LineWidth
   * @generated
   */
  EClass getLineWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.dsl.LineWidth#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.eclipselabs.xdiagram.dsl.LineWidth#getWidth()
   * @see #getLineWidth()
   * @generated
   */
  EAttribute getLineWidth_Width();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.FigureType <em>Figure Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Figure Type</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FigureType
   * @generated
   */
  EEnum getFigureType();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.ConnectionType <em>Connection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Connection Type</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ConnectionType
   * @generated
   */
  EEnum getConnectionType();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.AnchorDirection <em>Anchor Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Anchor Direction</em>'.
   * @see org.eclipselabs.xdiagram.dsl.AnchorDirection
   * @generated
   */
  EEnum getAnchorDirection();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.DefaultColor <em>Default Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Default Color</em>'.
   * @see org.eclipselabs.xdiagram.dsl.DefaultColor
   * @generated
   */
  EEnum getDefaultColor();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.ContainerLayout <em>Container Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Container Layout</em>'.
   * @see org.eclipselabs.xdiagram.dsl.ContainerLayout
   * @generated
   */
  EEnum getContainerLayout();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see org.eclipselabs.xdiagram.dsl.Operator
   * @generated
   */
  EEnum getOperator();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Literal</em>'.
   * @see org.eclipselabs.xdiagram.dsl.BooleanLiteral
   * @generated
   */
  EEnum getBooleanLiteral();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.FontFaceType <em>Font Face Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Font Face Type</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FontFaceType
   * @generated
   */
  EEnum getFontFaceType();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.FontStyleType <em>Font Style Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Font Style Type</em>'.
   * @see org.eclipselabs.xdiagram.dsl.FontStyleType
   * @generated
   */
  EEnum getFontStyleType();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.dsl.LineType <em>Line Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Line Type</em>'.
   * @see org.eclipselabs.xdiagram.dsl.LineType
   * @generated
   */
  EEnum getLineType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DslFactory getDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl <em>XDiagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.XDiagramImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getXDiagram()
     * @generated
     */
    EClass XDIAGRAM = eINSTANCE.getXDiagram();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XDIAGRAM__IMPORT_URI = eINSTANCE.getXDiagram_ImportURI();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__IMPORTS = eINSTANCE.getXDiagram_Imports();

    /**
     * The meta object literal for the '<em><b>Diagram</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__DIAGRAM = eINSTANCE.getXDiagram_Diagram();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__GROUPS = eINSTANCE.getXDiagram_Groups();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__ELEMENTS = eINSTANCE.getXDiagram_Elements();

    /**
     * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__STYLES = eINSTANCE.getXDiagram_Styles();

    /**
     * The meta object literal for the '<em><b>Colors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__COLORS = eINSTANCE.getXDiagram_Colors();

    /**
     * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__FIGURES = eINSTANCE.getXDiagram_Figures();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.ImportStatementImpl <em>Import Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.ImportStatementImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getImportStatement()
     * @generated
     */
    EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_STATEMENT__IMPORTED_NAMESPACE = eINSTANCE.getImportStatement_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.DiagramImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDiagram()
     * @generated
     */
    EClass DIAGRAM = eINSTANCE.getDiagram();

    /**
     * The meta object literal for the '<em><b>Model Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__MODEL_CLASS = eINSTANCE.getDiagram_ModelClass();

    /**
     * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__CONTAINS = eINSTANCE.getDiagram_Contains();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.GroupImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.DiagramElementImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDiagramElement()
     * @generated
     */
    EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

    /**
     * The meta object literal for the '<em><b>Model Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM_ELEMENT__MODEL_CLASS = eINSTANCE.getDiagramElement_ModelClass();

    /**
     * The meta object literal for the '<em><b>Tool Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM_ELEMENT__TOOL_NAME = eINSTANCE.getDiagramElement_ToolName();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM_ELEMENT__GROUP = eINSTANCE.getDiagramElement_Group();

    /**
     * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM_ELEMENT__IMAGE_ID = eINSTANCE.getDiagramElement_ImageId();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.StyleImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getStyle()
     * @generated
     */
    EClass STYLE = eINSTANCE.getStyle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE__NAME = eINSTANCE.getStyle_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.FeatureImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__CONDITIONAL = eINSTANCE.getFeature_Conditional();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.FeatureContainerImpl <em>Feature Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.FeatureContainerImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFeatureContainer()
     * @generated
     */
    EClass FEATURE_CONTAINER = eINSTANCE.getFeatureContainer();

    /**
     * The meta object literal for the '<em><b>Styled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_CONTAINER__STYLED = eINSTANCE.getFeatureContainer_Styled();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CONTAINER__STYLE = eINSTANCE.getFeatureContainer_Style();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CONTAINER__FEATURES = eINSTANCE.getFeatureContainer_Features();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.FeatureConditionalImpl <em>Feature Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.FeatureConditionalImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFeatureConditional()
     * @generated
     */
    EClass FEATURE_CONDITIONAL = eINSTANCE.getFeatureConditional();

    /**
     * The meta object literal for the '<em><b>Model Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CONDITIONAL__MODEL_ATTRIBUTE = eINSTANCE.getFeatureConditional_ModelAttribute();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_CONDITIONAL__OPERATOR = eINSTANCE.getFeatureConditional_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CONDITIONAL__VALUE = eINSTANCE.getFeatureConditional_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.NodeImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Root Figure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__ROOT_FIGURE = eINSTANCE.getNode_RootFigure();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.LinkImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Model Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__MODEL_REFERENCE = eINSTANCE.getLink_ModelReference();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__COMPLEX = eINSTANCE.getLink_Complex();

    /**
     * The meta object literal for the '<em><b>Source Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__SOURCE_REFERENCE = eINSTANCE.getLink_SourceReference();

    /**
     * The meta object literal for the '<em><b>Target Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TARGET_REFERENCE = eINSTANCE.getLink_TargetReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

    /**
     * The meta object literal for the '<em><b>Decorators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__DECORATORS = eINSTANCE.getLink_Decorators();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.DecoratorImpl <em>Decorator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.DecoratorImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDecorator()
     * @generated
     */
    EClass DECORATOR = eINSTANCE.getDecorator();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECORATOR__POSITION = eINSTANCE.getDecorator_Position();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECORATOR__SOURCE = eINSTANCE.getDecorator_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECORATOR__TARGET = eINSTANCE.getDecorator_Target();

    /**
     * The meta object literal for the '<em><b>Middle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECORATOR__MIDDLE = eINSTANCE.getDecorator_Middle();

    /**
     * The meta object literal for the '<em><b>Static Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECORATOR__STATIC_ELEMENT = eINSTANCE.getDecorator_StaticElement();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECORATOR__LABEL = eINSTANCE.getDecorator_Label();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.ConnectableElementImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getConnectableElement()
     * @generated
     */
    EClass CONNECTABLE_ELEMENT = eINSTANCE.getConnectableElement();

    /**
     * The meta object literal for the '<em><b>Composite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTABLE_ELEMENT__COMPOSITE = eINSTANCE.getConnectableElement_Composite();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTABLE_ELEMENT__CHILDREN = eINSTANCE.getConnectableElement_Children();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.AnchorImpl <em>Anchor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.AnchorImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getAnchor()
     * @generated
     */
    EClass ANCHOR = eINSTANCE.getAnchor();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR__DIRECTION = eINSTANCE.getAnchor_Direction();

    /**
     * The meta object literal for the '<em><b>Model Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCHOR__MODEL_REFERENCE = eINSTANCE.getAnchor_ModelReference();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.CustomColorImpl <em>Custom Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.CustomColorImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getCustomColor()
     * @generated
     */
    EClass CUSTOM_COLOR = eINSTANCE.getCustomColor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_COLOR__NAME = eINSTANCE.getCustomColor_Name();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_COLOR__R = eINSTANCE.getCustomColor_R();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_COLOR__G = eINSTANCE.getCustomColor_G();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_COLOR__B = eINSTANCE.getCustomColor_B();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.ColorImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__DEFAULT = eINSTANCE.getColor_Default();

    /**
     * The meta object literal for the '<em><b>Custom</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR__CUSTOM = eINSTANCE.getColor_Custom();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.CustomFigureImpl <em>Custom Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.CustomFigureImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getCustomFigure()
     * @generated
     */
    EClass CUSTOM_FIGURE = eINSTANCE.getCustomFigure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_FIGURE__NAME = eINSTANCE.getCustomFigure_Name();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FIGURE__ELEMENT = eINSTANCE.getCustomFigure_Element();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.CustomImpl <em>Custom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.CustomImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getCustom()
     * @generated
     */
    EClass CUSTOM = eINSTANCE.getCustom();

    /**
     * The meta object literal for the '<em><b>Figure</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM__FIGURE = eINSTANCE.getCustom_Figure();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.RectangleImpl <em>Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.RectangleImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getRectangle()
     * @generated
     */
    EClass RECTANGLE = eINSTANCE.getRectangle();

    /**
     * The meta object literal for the '<em><b>Rectangle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECTANGLE__RECTANGLE = eINSTANCE.getRectangle_Rectangle();

    /**
     * The meta object literal for the '<em><b>Square</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECTANGLE__SQUARE = eINSTANCE.getRectangle_Square();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.RhombusImpl <em>Rhombus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.RhombusImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getRhombus()
     * @generated
     */
    EClass RHOMBUS = eINSTANCE.getRhombus();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.EllipseImpl <em>Ellipse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.EllipseImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getEllipse()
     * @generated
     */
    EClass ELLIPSE = eINSTANCE.getEllipse();

    /**
     * The meta object literal for the '<em><b>Ellipse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELLIPSE__ELLIPSE = eINSTANCE.getEllipse_Ellipse();

    /**
     * The meta object literal for the '<em><b>Circle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELLIPSE__CIRCLE = eINSTANCE.getEllipse_Circle();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.PolylineImpl <em>Polyline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.PolylineImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getPolyline()
     * @generated
     */
    EClass POLYLINE = eINSTANCE.getPolyline();

    /**
     * The meta object literal for the '<em><b>Polygon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLYLINE__POLYGON = eINSTANCE.getPolyline_Polygon();

    /**
     * The meta object literal for the '<em><b>Polyline</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLYLINE__POLYLINE = eINSTANCE.getPolyline_Polyline();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.ContainsImpl <em>Contains</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.ContainsImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getContains()
     * @generated
     */
    EClass CONTAINS = eINSTANCE.getContains();

    /**
     * The meta object literal for the '<em><b>Model Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINS__MODEL_REFERENCE = eINSTANCE.getContains_ModelReference();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINS__LAYOUT = eINSTANCE.getContains_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.ValueImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.IntValueImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.DoubleValueImpl <em>Double Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.DoubleValueImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDoubleValue()
     * @generated
     */
    EClass DOUBLE_VALUE = eINSTANCE.getDoubleValue();

    /**
     * The meta object literal for the '<em><b>Value Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_VALUE__VALUE_INT = eINSTANCE.getDoubleValue_ValueInt();

    /**
     * The meta object literal for the '<em><b>Value Decimal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_VALUE__VALUE_DECIMAL = eINSTANCE.getDoubleValue_ValueDecimal();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.StringValueImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__NULL = eINSTANCE.getStringValue_Null();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.BooleanValueImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.EnumValueImpl <em>Enum Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.EnumValueImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getEnumValue()
     * @generated
     */
    EClass ENUM_VALUE = eINSTANCE.getEnumValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VALUE__NAME = eINSTANCE.getEnumValue_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.LabelImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__EDITABLE = eINSTANCE.getLabel_Editable();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.ImageImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__IMAGE_ID = eINSTANCE.getImage_ImageId();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.InvisibleImpl <em>Invisible</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.InvisibleImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getInvisible()
     * @generated
     */
    EClass INVISIBLE = eINSTANCE.getInvisible();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.ColorFeatureImpl <em>Color Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.ColorFeatureImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getColorFeature()
     * @generated
     */
    EClass COLOR_FEATURE = eINSTANCE.getColorFeature();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FEATURE__TYPE = eINSTANCE.getColorFeature_Type();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FEATURE__COLOR = eINSTANCE.getColorFeature_Color();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.TransparencyImpl <em>Transparency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.TransparencyImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getTransparency()
     * @generated
     */
    EClass TRANSPARENCY = eINSTANCE.getTransparency();

    /**
     * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSPARENCY__PERCENT = eINSTANCE.getTransparency_Percent();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.SizeImpl <em>Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.SizeImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getSize()
     * @generated
     */
    EClass SIZE = eINSTANCE.getSize();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.PointImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__X = eINSTANCE.getPoint_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__Y = eINSTANCE.getPoint_Y();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.PositionImpl <em>Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.PositionImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getPosition()
     * @generated
     */
    EClass POSITION = eINSTANCE.getPosition();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION__X = eINSTANCE.getPosition_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.CornerImpl <em>Corner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.CornerImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getCorner()
     * @generated
     */
    EClass CORNER = eINSTANCE.getCorner();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORNER__ANGLE = eINSTANCE.getCorner_Angle();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.TextValueImpl <em>Text Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.TextValueImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getTextValue()
     * @generated
     */
    EClass TEXT_VALUE = eINSTANCE.getTextValue();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_VALUE__TEXT = eINSTANCE.getTextValue_Text();

    /**
     * The meta object literal for the '<em><b>Model Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_VALUE__MODEL_ATTRIBUTE = eINSTANCE.getTextValue_ModelAttribute();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.FontFaceImpl <em>Font Face</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.FontFaceImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontFace()
     * @generated
     */
    EClass FONT_FACE = eINSTANCE.getFontFace();

    /**
     * The meta object literal for the '<em><b>Face</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_FACE__FACE = eINSTANCE.getFontFace_Face();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.FontSizeImpl <em>Font Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.FontSizeImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontSize()
     * @generated
     */
    EClass FONT_SIZE = eINSTANCE.getFontSize();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_SIZE__SIZE = eINSTANCE.getFontSize_Size();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.FontStyleImpl <em>Font Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.FontStyleImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontStyle()
     * @generated
     */
    EClass FONT_STYLE = eINSTANCE.getFontStyle();

    /**
     * The meta object literal for the '<em><b>Styles</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_STYLE__STYLES = eINSTANCE.getFontStyle_Styles();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.LineStyleImpl <em>Line Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.LineStyleImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLineStyle()
     * @generated
     */
    EClass LINE_STYLE = eINSTANCE.getLineStyle();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE_STYLE__STYLE = eINSTANCE.getLineStyle_Style();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.impl.LineWidthImpl <em>Line Width</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.impl.LineWidthImpl
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLineWidth()
     * @generated
     */
    EClass LINE_WIDTH = eINSTANCE.getLineWidth();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE_WIDTH__WIDTH = eINSTANCE.getLineWidth_Width();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.FigureType <em>Figure Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.FigureType
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFigureType()
     * @generated
     */
    EEnum FIGURE_TYPE = eINSTANCE.getFigureType();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.ConnectionType <em>Connection Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.ConnectionType
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getConnectionType()
     * @generated
     */
    EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.AnchorDirection <em>Anchor Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.AnchorDirection
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getAnchorDirection()
     * @generated
     */
    EEnum ANCHOR_DIRECTION = eINSTANCE.getAnchorDirection();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.DefaultColor <em>Default Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.DefaultColor
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getDefaultColor()
     * @generated
     */
    EEnum DEFAULT_COLOR = eINSTANCE.getDefaultColor();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.ContainerLayout <em>Container Layout</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.ContainerLayout
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getContainerLayout()
     * @generated
     */
    EEnum CONTAINER_LAYOUT = eINSTANCE.getContainerLayout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.Operator
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.BooleanLiteral <em>Boolean Literal</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.BooleanLiteral
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getBooleanLiteral()
     * @generated
     */
    EEnum BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.FontFaceType <em>Font Face Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.FontFaceType
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontFaceType()
     * @generated
     */
    EEnum FONT_FACE_TYPE = eINSTANCE.getFontFaceType();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.FontStyleType <em>Font Style Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.FontStyleType
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getFontStyleType()
     * @generated
     */
    EEnum FONT_STYLE_TYPE = eINSTANCE.getFontStyleType();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.dsl.LineType <em>Line Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.dsl.LineType
     * @see org.eclipselabs.xdiagram.dsl.impl.DslPackageImpl#getLineType()
     * @generated
     */
    EEnum LINE_TYPE = eINSTANCE.getLineType();

  }

} //DslPackage
