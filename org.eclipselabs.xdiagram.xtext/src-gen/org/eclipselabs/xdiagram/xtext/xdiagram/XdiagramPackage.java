/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

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
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramFactory
 * @model kind="package"
 * @generated
 */
public interface XdiagramPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xdiagram";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/xdiagram/xtext/XDiagram";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xdiagram";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XdiagramPackage eINSTANCE = org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl <em>XDiagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getXDiagram()
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
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__MODEL_CLASS = 2;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__NODES = 3;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__LINKS = 4;

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
   * The feature id for the '<em><b>Images</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__IMAGES = 7;

  /**
   * The number of structural features of the '<em>XDiagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImportStatementImpl <em>Import Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImportStatementImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getImportStatement()
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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StyleImpl <em>Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StyleImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStyle()
   * @generated
   */
  int STYLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__FEATURES = 1;

  /**
   * The number of structural features of the '<em>Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DiagramElementImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDiagramElement()
   * @generated
   */
  int DIAGRAM_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__MODEL_CLASS = 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__STYLE = 1;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__ICON = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__NAME = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Diagram Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getNode()
   * @generated
   */
  int NODE = 4;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__MODEL_CLASS = DIAGRAM_ELEMENT__MODEL_CLASS;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__STYLE = DIAGRAM_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ICON = DIAGRAM_ELEMENT__ICON;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = DIAGRAM_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ATTRIBUTES = DIAGRAM_ELEMENT__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Resizable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__RESIZABLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Main Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__MAIN_FIGURE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ANCHORS = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AttributeImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeContainerImpl <em>Node Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeContainerImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getNodeContainer()
   * @generated
   */
  int NODE_CONTAINER = 6;

  /**
   * The feature id for the '<em><b>Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CONTAINER__LAYOUT = 0;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CONTAINER__MODEL_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CONTAINER__VALUE = 2;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CONTAINER__FORMAT = 3;

  /**
   * The feature id for the '<em><b>Figures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CONTAINER__FIGURES = 4;

  /**
   * The number of structural features of the '<em>Node Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CONTAINER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLink()
   * @generated
   */
  int LINK = 7;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__MODEL_CLASS = DIAGRAM_ELEMENT__MODEL_CLASS;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__STYLE = DIAGRAM_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__ICON = DIAGRAM_ELEMENT__ICON;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__NAME = DIAGRAM_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__ATTRIBUTES = DIAGRAM_ELEMENT__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__FEATURES = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__MODEL_REFERENCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Complex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__COMPLEX = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Source Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__SOURCE_REFERENCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Target Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TARGET_REFERENCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Manhattan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__MANHATTAN = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__DECORATORS = DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl <em>Decorator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDecorator()
   * @generated
   */
  int DECORATOR = 8;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ElementImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__FEATURES = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ConnectableElementImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getConnectableElement()
   * @generated
   */
  int CONNECTABLE_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT__FEATURES = ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT__CHILDREN = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Connectable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AnchorImpl <em>Anchor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AnchorImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAnchor()
   * @generated
   */
  int ANCHOR = 10;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Pass X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__PASS_X = 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__X = 2;

  /**
   * The feature id for the '<em><b>Format X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__FORMAT_X = 3;

  /**
   * The feature id for the '<em><b>Pass Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__PASS_Y = 4;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__Y = 5;

  /**
   * The feature id for the '<em><b>Format Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__FORMAT_Y = 6;

  /**
   * The feature id for the '<em><b>Figures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__FIGURES = 7;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__CONSTRAINTS = 8;

  /**
   * The number of structural features of the '<em>Anchor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AnchorConstraintImpl <em>Anchor Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AnchorConstraintImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAnchorConstraint()
   * @generated
   */
  int ANCHOR_CONSTRAINT = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_CONSTRAINT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_CONSTRAINT__REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_CONSTRAINT__MAX = 2;

  /**
   * The number of structural features of the '<em>Anchor Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.RGBImpl <em>RGB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.RGBImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getRGB()
   * @generated
   */
  int RGB = 13;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__R = 0;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__G = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__B = 2;

  /**
   * The number of structural features of the '<em>RGB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImageFileImpl <em>Image File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImageFileImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getImageFile()
   * @generated
   */
  int IMAGE_FILE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FILE__SRC = 1;

  /**
   * The number of structural features of the '<em>Image File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getColor()
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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.CustomColorImpl <em>Custom Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.CustomColorImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getCustomColor()
   * @generated
   */
  int CUSTOM_COLOR = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Rgb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR__RGB = 1;

  /**
   * The number of structural features of the '<em>Custom Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.RectangleImpl <em>Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.RectangleImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getRectangle()
   * @generated
   */
  int RECTANGLE = 17;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 18;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.RhombusImpl <em>Rhombus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.RhombusImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getRhombus()
   * @generated
   */
  int RHOMBUS = 19;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHOMBUS__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.EllipseImpl <em>Ellipse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.EllipseImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getEllipse()
   * @generated
   */
  int ELLIPSE = 20;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PolylineImpl <em>Polyline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PolylineImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPolyline()
   * @generated
   */
  int POLYLINE = 21;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FeatureConditionalImpl <em>Feature Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FeatureConditionalImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFeatureConditional()
   * @generated
   */
  int FEATURE_CONDITIONAL = 22;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ContainsImpl <em>Contains</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ContainsImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getContains()
   * @generated
   */
  int CONTAINS = 23;

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
   * The number of structural features of the '<em>Contains</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ValueImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getValue()
   * @generated
   */
  int VALUE = 24;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.IntValueImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 25;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleValueImpl <em>Double Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleValueImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDoubleValue()
   * @generated
   */
  int DOUBLE_VALUE = 26;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StringValueImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 27;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.BooleanValueImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 28;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.EnumValueImpl <em>Enum Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.EnumValueImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getEnumValue()
   * @generated
   */
  int ENUM_VALUE = 29;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeValueImpl <em>Atribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeValueImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAtributeValue()
   * @generated
   */
  int ATRIBUTE_VALUE = 30;

  /**
   * The feature id for the '<em><b>Value INT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_INT = 0;

  /**
   * The feature id for the '<em><b>Value DEC</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_DEC = 1;

  /**
   * The feature id for the '<em><b>Value ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_ID = 2;

  /**
   * The feature id for the '<em><b>Value BOOL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_BOOL = 3;

  /**
   * The feature id for the '<em><b>Value STRING</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_STRING = 4;

  /**
   * The feature id for the '<em><b>Value DAY</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_DAY = 5;

  /**
   * The feature id for the '<em><b>Value MONTH</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_MONTH = 6;

  /**
   * The feature id for the '<em><b>Value YEAR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_YEAR = 7;

  /**
   * The number of structural features of the '<em>Atribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LabelImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 31;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImageImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 32;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__CHILDREN = CONNECTABLE_ELEMENT__CHILDREN;

  /**
   * The feature id for the '<em><b>Image</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__IMAGE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorFeatureImpl <em>Color Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getColorFeature()
   * @generated
   */
  int COLOR_FEATURE = 33;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__COLOR = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ForegroundImpl <em>Foreground</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ForegroundImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getForeground()
   * @generated
   */
  int FOREGROUND = 34;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREGROUND__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREGROUND__COLOR = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Foreground</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREGROUND_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.BackgroundImpl <em>Background</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.BackgroundImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getBackground()
   * @generated
   */
  int BACKGROUND = 35;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__CONDITIONAL = FEATURE__CONDITIONAL;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__COLOR = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Background</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.TransparencyImpl <em>Transparency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.TransparencyImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getTransparency()
   * @generated
   */
  int TRANSPARENCY = 36;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.SizeImpl <em>Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.SizeImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getSize()
   * @generated
   */
  int SIZE = 37;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PointImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPoint()
   * @generated
   */
  int POINT = 38;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PositionImpl <em>Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PositionImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPosition()
   * @generated
   */
  int POSITION = 39;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.CornerImpl <em>Corner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.CornerImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getCorner()
   * @generated
   */
  int CORNER = 40;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.TextValueImpl <em>Text Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.TextValueImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getTextValue()
   * @generated
   */
  int TEXT_VALUE = 41;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontFaceImpl <em>Font Face</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontFaceImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontFace()
   * @generated
   */
  int FONT_FACE = 42;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontSizeImpl <em>Font Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontSizeImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontSize()
   * @generated
   */
  int FONT_SIZE = 43;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontStyleImpl <em>Font Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontStyleImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontStyle()
   * @generated
   */
  int FONT_STYLE = 44;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineStyleImpl <em>Line Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineStyleImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLineStyle()
   * @generated
   */
  int LINE_STYLE = 45;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineWidthImpl <em>Line Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineWidthImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLineWidth()
   * @generated
   */
  int LINE_WIDTH = 46;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ContainerLayout <em>Container Layout</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ContainerLayout
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getContainerLayout()
   * @generated
   */
  int CONTAINER_LAYOUT = 47;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType <em>Anchor Constraint Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAnchorConstraintType()
   * @generated
   */
  int ANCHOR_CONSTRAINT_TYPE = 48;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor <em>Default Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDefaultColor()
   * @generated
   */
  int DEFAULT_COLOR = 49;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Operator
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 50;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanLiteral <em>Boolean Literal</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanLiteral
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 51;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontFaceType <em>Font Face Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontFaceType
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontFaceType()
   * @generated
   */
  int FONT_FACE_TYPE = 52;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType <em>Font Style Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontStyleType()
   * @generated
   */
  int FONT_STYLE_TYPE = 53;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineType <em>Line Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineType
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLineType()
   * @generated
   */
  int LINE_TYPE = 54;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram <em>XDiagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDiagram</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram
   * @generated
   */
  EClass getXDiagram();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImportURI()
   * @see #getXDiagram()
   * @generated
   */
  EAttribute getXDiagram_ImportURI();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImports()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Imports();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getModelClass <em>Model Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Class</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getModelClass()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_ModelClass();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getNodes()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getLinks()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Links();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getStyles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Styles</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getStyles()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Styles();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getColors <em>Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Colors</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getColors()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Colors();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImages <em>Images</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Images</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImages()
   * @see #getXDiagram()
   * @generated
   */
  EReference getXDiagram_Images();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Statement</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement
   * @generated
   */
  EClass getImportStatement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement#getImportedNamespace()
   * @see #getImportStatement()
   * @generated
   */
  EAttribute getImportStatement_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Style
   * @generated
   */
  EClass getStyle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Style#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Style#getName()
   * @see #getStyle()
   * @generated
   */
  EAttribute getStyle_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Style#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Style#getFeatures()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_Features();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement <em>Diagram Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram Element</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement
   * @generated
   */
  EClass getDiagramElement();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getModelClass <em>Model Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Class</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getModelClass()
   * @see #getDiagramElement()
   * @generated
   */
  EReference getDiagramElement_ModelClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getStyle()
   * @see #getDiagramElement()
   * @generated
   */
  EAttribute getDiagramElement_Style();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getIcon()
   * @see #getDiagramElement()
   * @generated
   */
  EAttribute getDiagramElement_Icon();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getName()
   * @see #getDiagramElement()
   * @generated
   */
  EAttribute getDiagramElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getAttributes()
   * @see #getDiagramElement()
   * @generated
   */
  EReference getDiagramElement_Attributes();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#isResizable <em>Resizable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resizable</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node#isResizable()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Resizable();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getMainFigure <em>Main Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Figure</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node#getMainFigure()
   * @see #getNode()
   * @generated
   */
  EReference getNode_MainFigure();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getAnchors <em>Anchors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anchors</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node#getAnchors()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Anchors();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Attribute#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Attribute#getKey()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer <em>Node Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Container</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer
   * @generated
   */
  EClass getNodeContainer();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getLayout()
   * @see #getNodeContainer()
   * @generated
   */
  EAttribute getNodeContainer_Layout();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Reference</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getModelReference()
   * @see #getNodeContainer()
   * @generated
   */
  EReference getNodeContainer_ModelReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getValue()
   * @see #getNodeContainer()
   * @generated
   */
  EAttribute getNodeContainer_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getFormat()
   * @see #getNodeContainer()
   * @generated
   */
  EAttribute getNodeContainer_Format();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getFigures <em>Figures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Figures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getFigures()
   * @see #getNodeContainer()
   * @generated
   */
  EReference getNodeContainer_Figures();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Reference</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getModelReference()
   * @see #getLink()
   * @generated
   */
  EReference getLink_ModelReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#isComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Complex</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#isComplex()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Complex();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceReference <em>Source Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Reference</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceReference()
   * @see #getLink()
   * @generated
   */
  EReference getLink_SourceReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetReference <em>Target Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Reference</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetReference()
   * @see #getLink()
   * @generated
   */
  EReference getLink_TargetReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#isManhattan <em>Manhattan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Manhattan</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#isManhattan()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Manhattan();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getDecorators <em>Decorators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decorators</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getDecorators()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Decorators();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator <em>Decorator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decorator</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Decorator
   * @generated
   */
  EClass getDecorator();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getPosition()
   * @see #getDecorator()
   * @generated
   */
  EAttribute getDecorator_Position();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isSource()
   * @see #getDecorator()
   * @generated
   */
  EAttribute getDecorator_Source();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isTarget()
   * @see #getDecorator()
   * @generated
   */
  EAttribute getDecorator_Target();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isMiddle <em>Middle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Middle</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isMiddle()
   * @see #getDecorator()
   * @generated
   */
  EAttribute getDecorator_Middle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getStaticElement <em>Static Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Static Element</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getStaticElement()
   * @see #getDecorator()
   * @generated
   */
  EReference getDecorator_StaticElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getLabel()
   * @see #getDecorator()
   * @generated
   */
  EReference getDecorator_Label();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement <em>Connectable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connectable Element</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement
   * @generated
   */
  EClass getConnectableElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement#getChildren()
   * @see #getConnectableElement()
   * @generated
   */
  EReference getConnectableElement_Children();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor <em>Anchor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor
   * @generated
   */
  EClass getAnchor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getObject()
   * @see #getAnchor()
   * @generated
   */
  EAttribute getAnchor_Object();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getPassX <em>Pass X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getPassX()
   * @see #getAnchor()
   * @generated
   */
  EAttribute getAnchor_PassX();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getX()
   * @see #getAnchor()
   * @generated
   */
  EAttribute getAnchor_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getFormatX <em>Format X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getFormatX()
   * @see #getAnchor()
   * @generated
   */
  EAttribute getAnchor_FormatX();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getPassY <em>Pass Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getPassY()
   * @see #getAnchor()
   * @generated
   */
  EAttribute getAnchor_PassY();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getY()
   * @see #getAnchor()
   * @generated
   */
  EAttribute getAnchor_Y();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getFormatY <em>Format Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getFormatY()
   * @see #getAnchor()
   * @generated
   */
  EAttribute getAnchor_FormatY();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getFigures <em>Figures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Figures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getFigures()
   * @see #getAnchor()
   * @generated
   */
  EReference getAnchor_Figures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Anchor#getConstraints()
   * @see #getAnchor()
   * @generated
   */
  EReference getAnchor_Constraints();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint <em>Anchor Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor Constraint</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint
   * @generated
   */
  EClass getAnchorConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getType()
   * @see #getAnchorConstraint()
   * @generated
   */
  EAttribute getAnchorConstraint_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getReference()
   * @see #getAnchorConstraint()
   * @generated
   */
  EAttribute getAnchorConstraint_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getMax()
   * @see #getAnchorConstraint()
   * @generated
   */
  EAttribute getAnchorConstraint_Max();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Element#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Element#getFeatures()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Features();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.RGB <em>RGB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RGB</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.RGB
   * @generated
   */
  EClass getRGB();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.RGB#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.RGB#getR()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_R();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.RGB#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.RGB#getG()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_G();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.RGB#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.RGB#getB()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_B();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ImageFile <em>Image File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image File</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ImageFile
   * @generated
   */
  EClass getImageFile();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ImageFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ImageFile#getName()
   * @see #getImageFile()
   * @generated
   */
  EAttribute getImageFile_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ImageFile#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Src</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ImageFile#getSrc()
   * @see #getImageFile()
   * @generated
   */
  EAttribute getImageFile_Src();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Color#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Color#getDefault()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Default();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Color#getCustom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Custom</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Color#getCustom()
   * @see #getColor()
   * @generated
   */
  EReference getColor_Custom();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor <em>Custom Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Color</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor
   * @generated
   */
  EClass getCustomColor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor#getName()
   * @see #getCustomColor()
   * @generated
   */
  EAttribute getCustomColor_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor#getRgb <em>Rgb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rgb</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor#getRgb()
   * @see #getCustomColor()
   * @generated
   */
  EReference getCustomColor_Rgb();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rectangle</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle
   * @generated
   */
  EClass getRectangle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle#isRectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rectangle</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle#isRectangle()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_Rectangle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle#isSquare <em>Square</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Square</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle#isSquare()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_Square();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Feature#getConditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Feature#getConditional()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Conditional();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Rhombus <em>Rhombus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rhombus</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Rhombus
   * @generated
   */
  EClass getRhombus();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ellipse</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse
   * @generated
   */
  EClass getEllipse();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse#isEllipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ellipse</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse#isEllipse()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Ellipse();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse#isCircle <em>Circle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Circle</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse#isCircle()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Circle();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Polyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Polyline</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Polyline
   * @generated
   */
  EClass getPolyline();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Polyline#isPolygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Polygon</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Polyline#isPolygon()
   * @see #getPolyline()
   * @generated
   */
  EAttribute getPolyline_Polygon();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Polyline#isPolyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Polyline</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Polyline#isPolyline()
   * @see #getPolyline()
   * @generated
   */
  EAttribute getPolyline_Polyline();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional <em>Feature Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Conditional</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional
   * @generated
   */
  EClass getFeatureConditional();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getModelAttribute <em>Model Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Attribute</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getModelAttribute()
   * @see #getFeatureConditional()
   * @generated
   */
  EReference getFeatureConditional_ModelAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getOperator()
   * @see #getFeatureConditional()
   * @generated
   */
  EAttribute getFeatureConditional_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getValue()
   * @see #getFeatureConditional()
   * @generated
   */
  EReference getFeatureConditional_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Contains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contains</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Contains
   * @generated
   */
  EClass getContains();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Contains#getModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Reference</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Contains#getModelReference()
   * @see #getContains()
   * @generated
   */
  EReference getContains_ModelReference();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue <em>Double Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue
   * @generated
   */
  EClass getDoubleValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue#getValueInt <em>Value Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Int</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue#getValueInt()
   * @see #getDoubleValue()
   * @generated
   */
  EAttribute getDoubleValue_ValueInt();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue#getValueDecimal <em>Value Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Decimal</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue#getValueDecimal()
   * @see #getDoubleValue()
   * @generated
   */
  EAttribute getDoubleValue_ValueDecimal();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringValue#isNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringValue#isNull()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Null();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.EnumValue <em>Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.EnumValue
   * @generated
   */
  EClass getEnumValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.EnumValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.EnumValue#getName()
   * @see #getEnumValue()
   * @generated
   */
  EAttribute getEnumValue_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue <em>Atribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atribute Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue
   * @generated
   */
  EClass getAtributeValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueINT <em>Value INT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value INT</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueINT()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueINT();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueDEC <em>Value DEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value DEC</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueDEC()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueDEC();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueID <em>Value ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value ID</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueID()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueID();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueBOOL <em>Value BOOL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value BOOL</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueBOOL()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueBOOL();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueSTRING <em>Value STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value STRING</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueSTRING()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueSTRING();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueDAY <em>Value DAY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value DAY</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueDAY()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueDAY();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueMONTH <em>Value MONTH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value MONTH</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueMONTH()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueMONTH();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueYEAR <em>Value YEAR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value YEAR</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue#getValueYEAR()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueYEAR();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Label#isEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Editable</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Label#isEditable()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Editable();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Image#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Image</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Image#getImage()
   * @see #getImage()
   * @generated
   */
  EReference getImage_Image();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature <em>Color Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature
   * @generated
   */
  EClass getColorFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getColor()
   * @see #getColorFeature()
   * @generated
   */
  EReference getColorFeature_Color();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Foreground <em>Foreground</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreground</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Foreground
   * @generated
   */
  EClass getForeground();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Background <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Background</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Background
   * @generated
   */
  EClass getBackground();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Transparency <em>Transparency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transparency</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Transparency
   * @generated
   */
  EClass getTransparency();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Transparency#getPercent <em>Percent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Percent</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Transparency#getPercent()
   * @see #getTransparency()
   * @generated
   */
  EAttribute getTransparency_Percent();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Size
   * @generated
   */
  EClass getSize();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Size#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Size#getWidth()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Width();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Size#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Size#getHeight()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Height();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Point#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Point#getX()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Point#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Point#getY()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Y();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Position
   * @generated
   */
  EClass getPosition();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Position#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Position#getX()
   * @see #getPosition()
   * @generated
   */
  EAttribute getPosition_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Position#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Position#getY()
   * @see #getPosition()
   * @generated
   */
  EAttribute getPosition_Y();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Corner <em>Corner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Corner</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Corner
   * @generated
   */
  EClass getCorner();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Corner#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Corner#getAngle()
   * @see #getCorner()
   * @generated
   */
  EAttribute getCorner_Angle();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.TextValue <em>Text Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.TextValue
   * @generated
   */
  EClass getTextValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.TextValue#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.TextValue#getText()
   * @see #getTextValue()
   * @generated
   */
  EAttribute getTextValue_Text();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.TextValue#getModelAttribute <em>Model Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Attribute</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.TextValue#getModelAttribute()
   * @see #getTextValue()
   * @generated
   */
  EReference getTextValue_ModelAttribute();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontFace <em>Font Face</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Face</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontFace
   * @generated
   */
  EClass getFontFace();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontFace#getFace <em>Face</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Face</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontFace#getFace()
   * @see #getFontFace()
   * @generated
   */
  EAttribute getFontFace_Face();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Size</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontSize
   * @generated
   */
  EClass getFontSize();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontSize#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontSize#getSize()
   * @see #getFontSize()
   * @generated
   */
  EAttribute getFontSize_Size();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontStyle <em>Font Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Style</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontStyle
   * @generated
   */
  EClass getFontStyle();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontStyle#getStyles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Styles</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontStyle#getStyles()
   * @see #getFontStyle()
   * @generated
   */
  EAttribute getFontStyle_Styles();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineStyle <em>Line Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Style</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineStyle
   * @generated
   */
  EClass getLineStyle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineStyle#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineStyle#getStyle()
   * @see #getLineStyle()
   * @generated
   */
  EAttribute getLineStyle_Style();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineWidth <em>Line Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Width</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineWidth
   * @generated
   */
  EClass getLineWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineWidth#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineWidth#getWidth()
   * @see #getLineWidth()
   * @generated
   */
  EAttribute getLineWidth_Width();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ContainerLayout <em>Container Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Container Layout</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ContainerLayout
   * @generated
   */
  EEnum getContainerLayout();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType <em>Anchor Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Anchor Constraint Type</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType
   * @generated
   */
  EEnum getAnchorConstraintType();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor <em>Default Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Default Color</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor
   * @generated
   */
  EEnum getDefaultColor();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Operator
   * @generated
   */
  EEnum getOperator();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Literal</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanLiteral
   * @generated
   */
  EEnum getBooleanLiteral();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontFaceType <em>Font Face Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Font Face Type</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontFaceType
   * @generated
   */
  EEnum getFontFaceType();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType <em>Font Style Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Font Style Type</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType
   * @generated
   */
  EEnum getFontStyleType();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineType <em>Line Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Line Type</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineType
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
  XdiagramFactory getXdiagramFactory();

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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl <em>XDiagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XDiagramImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getXDiagram()
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
     * The meta object literal for the '<em><b>Model Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__MODEL_CLASS = eINSTANCE.getXDiagram_ModelClass();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__NODES = eINSTANCE.getXDiagram_Nodes();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__LINKS = eINSTANCE.getXDiagram_Links();

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
     * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__IMAGES = eINSTANCE.getXDiagram_Images();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImportStatementImpl <em>Import Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImportStatementImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getImportStatement()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StyleImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStyle()
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
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE__FEATURES = eINSTANCE.getStyle_Features();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DiagramElementImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDiagramElement()
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
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM_ELEMENT__STYLE = eINSTANCE.getDiagramElement_Style();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM_ELEMENT__ICON = eINSTANCE.getDiagramElement_Icon();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM_ELEMENT__NAME = eINSTANCE.getDiagramElement_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM_ELEMENT__ATTRIBUTES = eINSTANCE.getDiagramElement_Attributes();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Resizable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__RESIZABLE = eINSTANCE.getNode_Resizable();

    /**
     * The meta object literal for the '<em><b>Main Figure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__MAIN_FIGURE = eINSTANCE.getNode_MainFigure();

    /**
     * The meta object literal for the '<em><b>Anchors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__ANCHORS = eINSTANCE.getNode_Anchors();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AttributeImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__KEY = eINSTANCE.getAttribute_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeContainerImpl <em>Node Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeContainerImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getNodeContainer()
     * @generated
     */
    EClass NODE_CONTAINER = eINSTANCE.getNodeContainer();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_CONTAINER__LAYOUT = eINSTANCE.getNodeContainer_Layout();

    /**
     * The meta object literal for the '<em><b>Model Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_CONTAINER__MODEL_REFERENCE = eINSTANCE.getNodeContainer_ModelReference();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_CONTAINER__VALUE = eINSTANCE.getNodeContainer_Value();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_CONTAINER__FORMAT = eINSTANCE.getNodeContainer_Format();

    /**
     * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_CONTAINER__FIGURES = eINSTANCE.getNodeContainer_Figures();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LinkImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLink()
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
     * The meta object literal for the '<em><b>Manhattan</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__MANHATTAN = eINSTANCE.getLink_Manhattan();

    /**
     * The meta object literal for the '<em><b>Decorators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__DECORATORS = eINSTANCE.getLink_Decorators();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl <em>Decorator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DecoratorImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDecorator()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ConnectableElementImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getConnectableElement()
     * @generated
     */
    EClass CONNECTABLE_ELEMENT = eINSTANCE.getConnectableElement();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTABLE_ELEMENT__CHILDREN = eINSTANCE.getConnectableElement_Children();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AnchorImpl <em>Anchor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AnchorImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAnchor()
     * @generated
     */
    EClass ANCHOR = eINSTANCE.getAnchor();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR__OBJECT = eINSTANCE.getAnchor_Object();

    /**
     * The meta object literal for the '<em><b>Pass X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR__PASS_X = eINSTANCE.getAnchor_PassX();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR__X = eINSTANCE.getAnchor_X();

    /**
     * The meta object literal for the '<em><b>Format X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR__FORMAT_X = eINSTANCE.getAnchor_FormatX();

    /**
     * The meta object literal for the '<em><b>Pass Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR__PASS_Y = eINSTANCE.getAnchor_PassY();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR__Y = eINSTANCE.getAnchor_Y();

    /**
     * The meta object literal for the '<em><b>Format Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR__FORMAT_Y = eINSTANCE.getAnchor_FormatY();

    /**
     * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCHOR__FIGURES = eINSTANCE.getAnchor_Figures();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCHOR__CONSTRAINTS = eINSTANCE.getAnchor_Constraints();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AnchorConstraintImpl <em>Anchor Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AnchorConstraintImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAnchorConstraint()
     * @generated
     */
    EClass ANCHOR_CONSTRAINT = eINSTANCE.getAnchorConstraint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR_CONSTRAINT__TYPE = eINSTANCE.getAnchorConstraint_Type();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR_CONSTRAINT__REFERENCE = eINSTANCE.getAnchorConstraint_Reference();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR_CONSTRAINT__MAX = eINSTANCE.getAnchorConstraint_Max();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ElementImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__FEATURES = eINSTANCE.getElement_Features();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.RGBImpl <em>RGB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.RGBImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getRGB()
     * @generated
     */
    EClass RGB = eINSTANCE.getRGB();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB__R = eINSTANCE.getRGB_R();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB__G = eINSTANCE.getRGB_G();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB__B = eINSTANCE.getRGB_B();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImageFileImpl <em>Image File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImageFileImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getImageFile()
     * @generated
     */
    EClass IMAGE_FILE = eINSTANCE.getImageFile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_FILE__NAME = eINSTANCE.getImageFile_Name();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_FILE__SRC = eINSTANCE.getImageFile_Src();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getColor()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.CustomColorImpl <em>Custom Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.CustomColorImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getCustomColor()
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
     * The meta object literal for the '<em><b>Rgb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_COLOR__RGB = eINSTANCE.getCustomColor_Rgb();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.RectangleImpl <em>Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.RectangleImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getRectangle()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFeature()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.RhombusImpl <em>Rhombus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.RhombusImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getRhombus()
     * @generated
     */
    EClass RHOMBUS = eINSTANCE.getRhombus();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.EllipseImpl <em>Ellipse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.EllipseImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getEllipse()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PolylineImpl <em>Polyline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PolylineImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPolyline()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FeatureConditionalImpl <em>Feature Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FeatureConditionalImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFeatureConditional()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ContainsImpl <em>Contains</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ContainsImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getContains()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ValueImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.IntValueImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getIntValue()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleValueImpl <em>Double Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleValueImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDoubleValue()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StringValueImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStringValue()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.BooleanValueImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getBooleanValue()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.EnumValueImpl <em>Enum Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.EnumValueImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getEnumValue()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeValueImpl <em>Atribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeValueImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAtributeValue()
     * @generated
     */
    EClass ATRIBUTE_VALUE = eINSTANCE.getAtributeValue();

    /**
     * The meta object literal for the '<em><b>Value INT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_INT = eINSTANCE.getAtributeValue_ValueINT();

    /**
     * The meta object literal for the '<em><b>Value DEC</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_DEC = eINSTANCE.getAtributeValue_ValueDEC();

    /**
     * The meta object literal for the '<em><b>Value ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_ID = eINSTANCE.getAtributeValue_ValueID();

    /**
     * The meta object literal for the '<em><b>Value BOOL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_BOOL = eINSTANCE.getAtributeValue_ValueBOOL();

    /**
     * The meta object literal for the '<em><b>Value STRING</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_STRING = eINSTANCE.getAtributeValue_ValueSTRING();

    /**
     * The meta object literal for the '<em><b>Value DAY</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_DAY = eINSTANCE.getAtributeValue_ValueDAY();

    /**
     * The meta object literal for the '<em><b>Value MONTH</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_MONTH = eINSTANCE.getAtributeValue_ValueMONTH();

    /**
     * The meta object literal for the '<em><b>Value YEAR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_YEAR = eINSTANCE.getAtributeValue_ValueYEAR();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LabelImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLabel()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ImageImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE__IMAGE = eINSTANCE.getImage_Image();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorFeatureImpl <em>Color Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getColorFeature()
     * @generated
     */
    EClass COLOR_FEATURE = eINSTANCE.getColorFeature();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FEATURE__COLOR = eINSTANCE.getColorFeature_Color();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ForegroundImpl <em>Foreground</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ForegroundImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getForeground()
     * @generated
     */
    EClass FOREGROUND = eINSTANCE.getForeground();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.BackgroundImpl <em>Background</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.BackgroundImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getBackground()
     * @generated
     */
    EClass BACKGROUND = eINSTANCE.getBackground();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.TransparencyImpl <em>Transparency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.TransparencyImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getTransparency()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.SizeImpl <em>Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.SizeImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getSize()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PointImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPoint()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PositionImpl <em>Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PositionImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPosition()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.CornerImpl <em>Corner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.CornerImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getCorner()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.TextValueImpl <em>Text Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.TextValueImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getTextValue()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontFaceImpl <em>Font Face</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontFaceImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontFace()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontSizeImpl <em>Font Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontSizeImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontSize()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontStyleImpl <em>Font Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FontStyleImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontStyle()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineStyleImpl <em>Line Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineStyleImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLineStyle()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineWidthImpl <em>Line Width</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineWidthImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLineWidth()
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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ContainerLayout <em>Container Layout</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.ContainerLayout
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getContainerLayout()
     * @generated
     */
    EEnum CONTAINER_LAYOUT = eINSTANCE.getContainerLayout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType <em>Anchor Constraint Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAnchorConstraintType()
     * @generated
     */
    EEnum ANCHOR_CONSTRAINT_TYPE = eINSTANCE.getAnchorConstraintType();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor <em>Default Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDefaultColor()
     * @generated
     */
    EEnum DEFAULT_COLOR = eINSTANCE.getDefaultColor();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.Operator
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanLiteral <em>Boolean Literal</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanLiteral
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getBooleanLiteral()
     * @generated
     */
    EEnum BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontFaceType <em>Font Face Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontFaceType
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontFaceType()
     * @generated
     */
    EEnum FONT_FACE_TYPE = eINSTANCE.getFontFaceType();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType <em>Font Style Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFontStyleType()
     * @generated
     */
    EEnum FONT_STYLE_TYPE = eINSTANCE.getFontStyleType();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineType <em>Line Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineType
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLineType()
     * @generated
     */
    EEnum LINE_TYPE = eINSTANCE.getLineType();

  }

} //XdiagramPackage
