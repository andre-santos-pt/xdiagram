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
   * The feature id for the '<em><b>Styles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__STYLES = 2;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__MODEL_CLASS = 3;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__NODES = 4;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM__LINKS = 5;

  /**
   * The number of structural features of the '<em>XDiagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDIAGRAM_FEATURE_COUNT = 6;

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
   * The feature id for the '<em><b>Features</b></em>' containment reference.
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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getNode()
   * @generated
   */
  int NODE = 3;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__MODEL_CLASS = 0;

  /**
   * The feature id for the '<em><b>Resizable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__RESIZABLE = 1;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__STYLE = 2;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ICON = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ATTRIBUTES = 4;

  /**
   * The feature id for the '<em><b>Figures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__FIGURES = 5;

  /**
   * The feature id for the '<em><b>Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CONTAINERS = 6;

  /**
   * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ANCHORS = 7;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AttributeImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeFigureImpl <em>Node Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeFigureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getNodeFigure()
   * @generated
   */
  int NODE_FIGURE = 5;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FIGURE__OPTION = 0;

  /**
   * The feature id for the '<em><b>Figure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FIGURE__FIGURE = 1;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FIGURE__STYLE = 2;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FIGURE__FEATURES = 3;

  /**
   * The number of structural features of the '<em>Node Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FIGURE_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CONTAINER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CONTAINER__MODEL_CLASS = 1;

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
   * The feature id for the '<em><b>Model Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__MODEL_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Complex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__COMPLEX = 1;

  /**
   * The feature id for the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__MODEL_CLASS = 2;

  /**
   * The feature id for the '<em><b>Source Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__SOURCE_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Target Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TARGET_REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Manhattan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__MANHATTAN = 5;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__STYLE = 6;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__ATTRIBUTES = 7;

  /**
   * The feature id for the '<em><b>Linefeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__LINEFEATURES = 8;

  /**
   * The feature id for the '<em><b>Colorfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__COLORFEATURES = 9;

  /**
   * The feature id for the '<em><b>Integerfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__INTEGERFEATURES = 10;

  /**
   * The feature id for the '<em><b>Source Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__SOURCE_STATIC = 11;

  /**
   * The feature id for the '<em><b>Source Dynamic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__SOURCE_DYNAMIC = 12;

  /**
   * The feature id for the '<em><b>Target Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TARGET_STATIC = 13;

  /**
   * The feature id for the '<em><b>Target Dynamic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TARGET_DYNAMIC = 14;

  /**
   * The feature id for the '<em><b>Placings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__PLACINGS = 15;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PlacingFigureImpl <em>Placing Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PlacingFigureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPlacingFigure()
   * @generated
   */
  int PLACING_FIGURE = 8;

  /**
   * The feature id for the '<em><b>Pos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACING_FIGURE__POS = 0;

  /**
   * The feature id for the '<em><b>Placing Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACING_FIGURE__PLACING_STATIC = 1;

  /**
   * The feature id for the '<em><b>Placing Dynamic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACING_FIGURE__PLACING_DYNAMIC = 2;

  /**
   * The number of structural features of the '<em>Placing Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACING_FIGURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DynamicFigureImpl <em>Dynamic Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DynamicFigureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDynamicFigure()
   * @generated
   */
  int DYNAMIC_FIGURE = 9;

  /**
   * The feature id for the '<em><b>Figure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_FIGURE__FIGURE = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_FIGURE__FEATURES = 1;

  /**
   * The number of structural features of the '<em>Dynamic Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_FIGURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StaticFigureImpl <em>Static Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StaticFigureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStaticFigure()
   * @generated
   */
  int STATIC_FIGURE = 10;

  /**
   * The feature id for the '<em><b>Figure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FIGURE__FIGURE = 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FIGURE__STYLE = 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FIGURE__FEATURES = 2;

  /**
   * The number of structural features of the '<em>Static Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FIGURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl <em>Node Anchor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getNodeAnchor()
   * @generated
   */
  int NODE_ANCHOR = 11;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Pass X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR__PASS_X = 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR__X = 2;

  /**
   * The feature id for the '<em><b>Format X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR__FORMAT_X = 3;

  /**
   * The feature id for the '<em><b>Pass Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR__PASS_Y = 4;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR__Y = 5;

  /**
   * The feature id for the '<em><b>Format Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR__FORMAT_Y = 6;

  /**
   * The feature id for the '<em><b>Figures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR__FIGURES = 7;

  /**
   * The feature id for the '<em><b>Arrows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR__ARROWS = 8;

  /**
   * The number of structural features of the '<em>Node Anchor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ANCHOR_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ArrowAnchorImpl <em>Arrow Anchor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ArrowAnchorImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getArrowAnchor()
   * @generated
   */
  int ARROW_ANCHOR = 12;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_ANCHOR__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_ANCHOR__TYPE = 1;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_ANCHOR__N = 2;

  /**
   * The number of structural features of the '<em>Arrow Anchor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_ANCHOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl <em>Figure Features</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFigureFeatures()
   * @generated
   */
  int FIGURE_FEATURES = 13;

  /**
   * The feature id for the '<em><b>Linefeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__LINEFEATURES = 0;

  /**
   * The feature id for the '<em><b>Centerfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__CENTERFEATURES = 1;

  /**
   * The feature id for the '<em><b>Alignfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__ALIGNFEATURES = 2;

  /**
   * The feature id for the '<em><b>Gradientfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__GRADIENTFEATURES = 3;

  /**
   * The feature id for the '<em><b>Pointfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__POINTFEATURES = 4;

  /**
   * The feature id for the '<em><b>Sizefeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__SIZEFEATURES = 5;

  /**
   * The feature id for the '<em><b>Positionfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__POSITIONFEATURES = 6;

  /**
   * The feature id for the '<em><b>Colorfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__COLORFEATURES = 7;

  /**
   * The feature id for the '<em><b>Integerfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__INTEGERFEATURES = 8;

  /**
   * The feature id for the '<em><b>Booleanfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__BOOLEANFEATURES = 9;

  /**
   * The feature id for the '<em><b>Stringfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__STRINGFEATURES = 10;

  /**
   * The feature id for the '<em><b>Customfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES__CUSTOMFEATURES = 11;

  /**
   * The number of structural features of the '<em>Figure Features</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURES_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.CustomFeatureImpl <em>Custom Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.CustomFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getCustomFeature()
   * @generated
   */
  int CUSTOM_FEATURE = 14;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FEATURE__KEY = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FEATURE__ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FEATURE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Custom Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StyleFeatureImpl <em>Style Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StyleFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStyleFeature()
   * @generated
   */
  int STYLE_FEATURE = 15;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Style Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LayoutFeatureImpl <em>Layout Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LayoutFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLayoutFeature()
   * @generated
   */
  int LAYOUT_FEATURE = 16;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE__KEY = STYLE_FEATURE__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE__VALUE = STYLE_FEATURE__VALUE;

  /**
   * The number of structural features of the '<em>Layout Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_FEATURE_COUNT = STYLE_FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.CenterFeatureImpl <em>Center Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.CenterFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getCenterFeature()
   * @generated
   */
  int CENTER_FEATURE = 17;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_FEATURE__KEY = STYLE_FEATURE__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_FEATURE__VALUE = STYLE_FEATURE__VALUE;

  /**
   * The number of structural features of the '<em>Center Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_FEATURE_FEATURE_COUNT = STYLE_FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AlignFeatureImpl <em>Align Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AlignFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAlignFeature()
   * @generated
   */
  int ALIGN_FEATURE = 18;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_FEATURE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Align Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.GradientFeatureImpl <em>Gradient Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.GradientFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getGradientFeature()
   * @generated
   */
  int GRADIENT_FEATURE = 19;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT_FEATURE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Gradient Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PointFeatureImpl <em>Point Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PointFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPointFeature()
   * @generated
   */
  int POINT_FEATURE = 20;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE__Y = 1;

  /**
   * The number of structural features of the '<em>Point Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.SizeFeatureImpl <em>Size Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.SizeFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getSizeFeature()
   * @generated
   */
  int SIZE_FEATURE = 21;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE__WIDTH = 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE__HEIGHT = 1;

  /**
   * The number of structural features of the '<em>Size Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PositionFeatureImpl <em>Position Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PositionFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPositionFeature()
   * @generated
   */
  int POSITION_FEATURE = 22;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_FEATURE__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_FEATURE__Y = 1;

  /**
   * The number of structural features of the '<em>Position Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorFeatureImpl <em>Color Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getColorFeature()
   * @generated
   */
  int COLOR_FEATURE = 23;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__KEY = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__VALUE = 2;

  /**
   * The feature id for the '<em><b>Rgb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__RGB = 3;

  /**
   * The feature id for the '<em><b>Atribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__ATRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__OPERATOR = 5;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__OPTION = 6;

  /**
   * The number of structural features of the '<em>Color Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.RGBImpl <em>RGB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.RGBImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getRGB()
   * @generated
   */
  int RGB = 24;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.IntegerFeatureImpl <em>Integer Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.IntegerFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getIntegerFeature()
   * @generated
   */
  int INTEGER_FEATURE = 25;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_FEATURE__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_FEATURE__KEY = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_FEATURE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Integer Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleFeatureImpl <em>Double Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDoubleFeature()
   * @generated
   */
  int DOUBLE_FEATURE = 26;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_FEATURE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Double Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StringFeatureImpl <em>String Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StringFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStringFeature()
   * @generated
   */
  int STRING_FEATURE = 27;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE__KEY = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE__VALUE = 2;

  /**
   * The feature id for the '<em><b>Value L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE__VALUE_L = 3;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE__ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Value R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE__VALUE_R = 5;

  /**
   * The number of structural features of the '<em>String Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.BooleanFeatureImpl <em>Boolean Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.BooleanFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getBooleanFeature()
   * @generated
   */
  int BOOLEAN_FEATURE = 28;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE__KEY = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Boolean Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineFeatureImpl <em>Line Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineFeatureImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLineFeature()
   * @generated
   */
  int LINE_FEATURE = 29;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE__KEY = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Line Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeExpressionImpl <em>Atribute Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeExpressionImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAtributeExpression()
   * @generated
   */
  int ATRIBUTE_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_EXPRESSION__KEY = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_EXPRESSION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Atribute Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeValueImpl <em>Atribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeValueImpl
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAtributeValue()
   * @generated
   */
  int ATRIBUTE_VALUE = 31;

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
   * The meta object id for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape <em>Figure Shape</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFigureShape()
   * @generated
   */
  int FIGURE_SHAPE = 32;


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
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Style#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Features</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Style#getFeatures()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_Features();

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
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getModelClass <em>Model Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Class</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node#getModelClass()
   * @see #getNode()
   * @generated
   */
  EReference getNode_ModelClass();

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
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node#getStyle()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Style();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node#getIcon()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Icon();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node#getAttributes()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getFigures <em>Figures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Figures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node#getFigures()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Figures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Node#getContainers <em>Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containers</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Node#getContainers()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Containers();

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
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure <em>Node Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Figure</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure
   * @generated
   */
  EClass getNodeFigure();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getOption()
   * @see #getNodeFigure()
   * @generated
   */
  EAttribute getNodeFigure_Option();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getFigure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Figure</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getFigure()
   * @see #getNodeFigure()
   * @generated
   */
  EAttribute getNodeFigure_Figure();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getStyle()
   * @see #getNodeFigure()
   * @generated
   */
  EAttribute getNodeFigure_Style();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Features</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getFeatures()
   * @see #getNodeFigure()
   * @generated
   */
  EReference getNodeFigure_Features();

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
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getType()
   * @see #getNodeContainer()
   * @generated
   */
  EAttribute getNodeContainer_Type();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getModelClass <em>Model Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Class</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer#getModelClass()
   * @see #getNodeContainer()
   * @generated
   */
  EReference getNodeContainer_ModelClass();

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
   * Returns the meta object for the reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getModelClass <em>Model Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Class</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getModelClass()
   * @see #getLink()
   * @generated
   */
  EReference getLink_ModelClass();

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
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getStyle()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Style();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getAttributes()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getLinefeatures <em>Linefeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Linefeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getLinefeatures()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Linefeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getColorfeatures <em>Colorfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Colorfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getColorfeatures()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Colorfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getIntegerfeatures <em>Integerfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integerfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getIntegerfeatures()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Integerfeatures();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceStatic <em>Source Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Static</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceStatic()
   * @see #getLink()
   * @generated
   */
  EReference getLink_SourceStatic();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceDynamic <em>Source Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source Dynamic</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceDynamic()
   * @see #getLink()
   * @generated
   */
  EReference getLink_SourceDynamic();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetStatic <em>Target Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Static</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetStatic()
   * @see #getLink()
   * @generated
   */
  EReference getLink_TargetStatic();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetDynamic <em>Target Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Target Dynamic</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetDynamic()
   * @see #getLink()
   * @generated
   */
  EReference getLink_TargetDynamic();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getPlacings <em>Placings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Placings</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Link#getPlacings()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Placings();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure <em>Placing Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Placing Figure</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure
   * @generated
   */
  EClass getPlacingFigure();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPos <em>Pos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pos</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPos()
   * @see #getPlacingFigure()
   * @generated
   */
  EAttribute getPlacingFigure_Pos();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPlacingStatic <em>Placing Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Placing Static</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPlacingStatic()
   * @see #getPlacingFigure()
   * @generated
   */
  EReference getPlacingFigure_PlacingStatic();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPlacingDynamic <em>Placing Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Placing Dynamic</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPlacingDynamic()
   * @see #getPlacingFigure()
   * @generated
   */
  EReference getPlacingFigure_PlacingDynamic();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure <em>Dynamic Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Figure</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure
   * @generated
   */
  EClass getDynamicFigure();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure#getFigure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Figure</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure#getFigure()
   * @see #getDynamicFigure()
   * @generated
   */
  EAttribute getDynamicFigure_Figure();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Features</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure#getFeatures()
   * @see #getDynamicFigure()
   * @generated
   */
  EReference getDynamicFigure_Features();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure <em>Static Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Figure</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure
   * @generated
   */
  EClass getStaticFigure();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure#getFigure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Figure</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure#getFigure()
   * @see #getStaticFigure()
   * @generated
   */
  EAttribute getStaticFigure_Figure();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure#getStyle()
   * @see #getStaticFigure()
   * @generated
   */
  EAttribute getStaticFigure_Style();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Features</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure#getFeatures()
   * @see #getStaticFigure()
   * @generated
   */
  EReference getStaticFigure_Features();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor <em>Node Anchor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Anchor</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor
   * @generated
   */
  EClass getNodeAnchor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getObject()
   * @see #getNodeAnchor()
   * @generated
   */
  EAttribute getNodeAnchor_Object();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getPassX <em>Pass X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getPassX()
   * @see #getNodeAnchor()
   * @generated
   */
  EAttribute getNodeAnchor_PassX();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getX()
   * @see #getNodeAnchor()
   * @generated
   */
  EAttribute getNodeAnchor_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getFormatX <em>Format X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getFormatX()
   * @see #getNodeAnchor()
   * @generated
   */
  EAttribute getNodeAnchor_FormatX();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getPassY <em>Pass Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getPassY()
   * @see #getNodeAnchor()
   * @generated
   */
  EAttribute getNodeAnchor_PassY();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getY()
   * @see #getNodeAnchor()
   * @generated
   */
  EAttribute getNodeAnchor_Y();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getFormatY <em>Format Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getFormatY()
   * @see #getNodeAnchor()
   * @generated
   */
  EAttribute getNodeAnchor_FormatY();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getFigures <em>Figures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Figures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getFigures()
   * @see #getNodeAnchor()
   * @generated
   */
  EReference getNodeAnchor_Figures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getArrows <em>Arrows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arrows</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor#getArrows()
   * @see #getNodeAnchor()
   * @generated
   */
  EReference getNodeAnchor_Arrows();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor <em>Arrow Anchor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arrow Anchor</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor
   * @generated
   */
  EClass getArrowAnchor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor#getReference()
   * @see #getArrowAnchor()
   * @generated
   */
  EAttribute getArrowAnchor_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor#getType()
   * @see #getArrowAnchor()
   * @generated
   */
  EAttribute getArrowAnchor_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor#getN()
   * @see #getArrowAnchor()
   * @generated
   */
  EAttribute getArrowAnchor_N();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures <em>Figure Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Figure Features</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures
   * @generated
   */
  EClass getFigureFeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getLinefeatures <em>Linefeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Linefeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getLinefeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Linefeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getCenterfeatures <em>Centerfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Centerfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getCenterfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Centerfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getAlignfeatures <em>Alignfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alignfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getAlignfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Alignfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getGradientfeatures <em>Gradientfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Gradientfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getGradientfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Gradientfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getPointfeatures <em>Pointfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pointfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getPointfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Pointfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getSizefeatures <em>Sizefeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sizefeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getSizefeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Sizefeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getPositionfeatures <em>Positionfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Positionfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getPositionfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Positionfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getColorfeatures <em>Colorfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Colorfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getColorfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Colorfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getIntegerfeatures <em>Integerfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integerfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getIntegerfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Integerfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getBooleanfeatures <em>Booleanfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Booleanfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getBooleanfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Booleanfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getStringfeatures <em>Stringfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stringfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getStringfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Stringfeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getCustomfeatures <em>Customfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Customfeatures</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getCustomfeatures()
   * @see #getFigureFeatures()
   * @generated
   */
  EReference getFigureFeatures_Customfeatures();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature <em>Custom Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature
   * @generated
   */
  EClass getCustomFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature#getKey()
   * @see #getCustomFeature()
   * @generated
   */
  EAttribute getCustomFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature#getAttribute()
   * @see #getCustomFeature()
   * @generated
   */
  EAttribute getCustomFeature_Attribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature#getValue()
   * @see #getCustomFeature()
   * @generated
   */
  EAttribute getCustomFeature_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StyleFeature <em>Style Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StyleFeature
   * @generated
   */
  EClass getStyleFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StyleFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StyleFeature#getKey()
   * @see #getStyleFeature()
   * @generated
   */
  EAttribute getStyleFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StyleFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StyleFeature#getValue()
   * @see #getStyleFeature()
   * @generated
   */
  EAttribute getStyleFeature_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LayoutFeature <em>Layout Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LayoutFeature
   * @generated
   */
  EClass getLayoutFeature();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.CenterFeature <em>Center Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Center Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.CenterFeature
   * @generated
   */
  EClass getCenterFeature();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature <em>Align Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Align Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature
   * @generated
   */
  EClass getAlignFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature#getKey()
   * @see #getAlignFeature()
   * @generated
   */
  EAttribute getAlignFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature#getValue()
   * @see #getAlignFeature()
   * @generated
   */
  EAttribute getAlignFeature_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature <em>Gradient Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gradient Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature
   * @generated
   */
  EClass getGradientFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature#getKey()
   * @see #getGradientFeature()
   * @generated
   */
  EAttribute getGradientFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature#getValue()
   * @see #getGradientFeature()
   * @generated
   */
  EAttribute getGradientFeature_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature <em>Point Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature
   * @generated
   */
  EClass getPointFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature#getX()
   * @see #getPointFeature()
   * @generated
   */
  EAttribute getPointFeature_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature#getY()
   * @see #getPointFeature()
   * @generated
   */
  EAttribute getPointFeature_Y();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature <em>Size Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature
   * @generated
   */
  EClass getSizeFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature#getWidth()
   * @see #getSizeFeature()
   * @generated
   */
  EAttribute getSizeFeature_Width();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature#getHeight()
   * @see #getSizeFeature()
   * @generated
   */
  EAttribute getSizeFeature_Height();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature <em>Position Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature
   * @generated
   */
  EClass getPositionFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature#getX()
   * @see #getPositionFeature()
   * @generated
   */
  EAttribute getPositionFeature_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature#getY()
   * @see #getPositionFeature()
   * @generated
   */
  EAttribute getPositionFeature_Y();

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
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getExpression()
   * @see #getColorFeature()
   * @generated
   */
  EReference getColorFeature_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getKey()
   * @see #getColorFeature()
   * @generated
   */
  EAttribute getColorFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getValue()
   * @see #getColorFeature()
   * @generated
   */
  EAttribute getColorFeature_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getRgb <em>Rgb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rgb</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getRgb()
   * @see #getColorFeature()
   * @generated
   */
  EReference getColorFeature_Rgb();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getAtribute <em>Atribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atribute</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getAtribute()
   * @see #getColorFeature()
   * @generated
   */
  EAttribute getColorFeature_Atribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getOperator()
   * @see #getColorFeature()
   * @generated
   */
  EAttribute getColorFeature_Operator();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getOption()
   * @see #getColorFeature()
   * @generated
   */
  EAttribute getColorFeature_Option();

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
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature <em>Integer Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature
   * @generated
   */
  EClass getIntegerFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature#getExpression()
   * @see #getIntegerFeature()
   * @generated
   */
  EReference getIntegerFeature_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature#getKey()
   * @see #getIntegerFeature()
   * @generated
   */
  EAttribute getIntegerFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature#getValue()
   * @see #getIntegerFeature()
   * @generated
   */
  EAttribute getIntegerFeature_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleFeature <em>Double Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DoubleFeature
   * @generated
   */
  EClass getDoubleFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DoubleFeature#getKey()
   * @see #getDoubleFeature()
   * @generated
   */
  EAttribute getDoubleFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DoubleFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.DoubleFeature#getValue()
   * @see #getDoubleFeature()
   * @generated
   */
  EAttribute getDoubleFeature_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature <em>String Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature
   * @generated
   */
  EClass getStringFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getExpression()
   * @see #getStringFeature()
   * @generated
   */
  EReference getStringFeature_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getKey()
   * @see #getStringFeature()
   * @generated
   */
  EAttribute getStringFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValue()
   * @see #getStringFeature()
   * @generated
   */
  EAttribute getStringFeature_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValueL <em>Value L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value L</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValueL()
   * @see #getStringFeature()
   * @generated
   */
  EAttribute getStringFeature_ValueL();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getAttribute()
   * @see #getStringFeature()
   * @generated
   */
  EAttribute getStringFeature_Attribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValueR <em>Value R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value R</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValueR()
   * @see #getStringFeature()
   * @generated
   */
  EAttribute getStringFeature_ValueR();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature <em>Boolean Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature
   * @generated
   */
  EClass getBooleanFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature#getExpression()
   * @see #getBooleanFeature()
   * @generated
   */
  EReference getBooleanFeature_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature#getKey()
   * @see #getBooleanFeature()
   * @generated
   */
  EAttribute getBooleanFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature#getValue()
   * @see #getBooleanFeature()
   * @generated
   */
  EAttribute getBooleanFeature_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature <em>Line Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Feature</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature
   * @generated
   */
  EClass getLineFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature#getExpression()
   * @see #getLineFeature()
   * @generated
   */
  EReference getLineFeature_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature#getKey()
   * @see #getLineFeature()
   * @generated
   */
  EAttribute getLineFeature_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature#getValue()
   * @see #getLineFeature()
   * @generated
   */
  EAttribute getLineFeature_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression <em>Atribute Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atribute Expression</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression
   * @generated
   */
  EClass getAtributeExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression#getKey()
   * @see #getAtributeExpression()
   * @generated
   */
  EAttribute getAtributeExpression_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression#getOperator()
   * @see #getAtributeExpression()
   * @generated
   */
  EAttribute getAtributeExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression#getValue()
   * @see #getAtributeExpression()
   * @generated
   */
  EReference getAtributeExpression_Value();

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
   * Returns the meta object for enum '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape <em>Figure Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Figure Shape</em>'.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape
   * @generated
   */
  EEnum getFigureShape();

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
     * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDIAGRAM__STYLES = eINSTANCE.getXDiagram_Styles();

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
     * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE__FEATURES = eINSTANCE.getStyle_Features();

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
     * The meta object literal for the '<em><b>Model Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__MODEL_CLASS = eINSTANCE.getNode_ModelClass();

    /**
     * The meta object literal for the '<em><b>Resizable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__RESIZABLE = eINSTANCE.getNode_Resizable();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__STYLE = eINSTANCE.getNode_Style();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__ICON = eINSTANCE.getNode_Icon();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__ATTRIBUTES = eINSTANCE.getNode_Attributes();

    /**
     * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__FIGURES = eINSTANCE.getNode_Figures();

    /**
     * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__CONTAINERS = eINSTANCE.getNode_Containers();

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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeFigureImpl <em>Node Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeFigureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getNodeFigure()
     * @generated
     */
    EClass NODE_FIGURE = eINSTANCE.getNodeFigure();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_FIGURE__OPTION = eINSTANCE.getNodeFigure_Option();

    /**
     * The meta object literal for the '<em><b>Figure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_FIGURE__FIGURE = eINSTANCE.getNodeFigure_Figure();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_FIGURE__STYLE = eINSTANCE.getNodeFigure_Style();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_FIGURE__FEATURES = eINSTANCE.getNodeFigure_Features();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_CONTAINER__TYPE = eINSTANCE.getNodeContainer_Type();

    /**
     * The meta object literal for the '<em><b>Model Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_CONTAINER__MODEL_CLASS = eINSTANCE.getNodeContainer_ModelClass();

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
     * The meta object literal for the '<em><b>Model Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__MODEL_CLASS = eINSTANCE.getLink_ModelClass();

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
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__STYLE = eINSTANCE.getLink_Style();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__ATTRIBUTES = eINSTANCE.getLink_Attributes();

    /**
     * The meta object literal for the '<em><b>Linefeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__LINEFEATURES = eINSTANCE.getLink_Linefeatures();

    /**
     * The meta object literal for the '<em><b>Colorfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__COLORFEATURES = eINSTANCE.getLink_Colorfeatures();

    /**
     * The meta object literal for the '<em><b>Integerfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__INTEGERFEATURES = eINSTANCE.getLink_Integerfeatures();

    /**
     * The meta object literal for the '<em><b>Source Static</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__SOURCE_STATIC = eINSTANCE.getLink_SourceStatic();

    /**
     * The meta object literal for the '<em><b>Source Dynamic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__SOURCE_DYNAMIC = eINSTANCE.getLink_SourceDynamic();

    /**
     * The meta object literal for the '<em><b>Target Static</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TARGET_STATIC = eINSTANCE.getLink_TargetStatic();

    /**
     * The meta object literal for the '<em><b>Target Dynamic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TARGET_DYNAMIC = eINSTANCE.getLink_TargetDynamic();

    /**
     * The meta object literal for the '<em><b>Placings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__PLACINGS = eINSTANCE.getLink_Placings();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PlacingFigureImpl <em>Placing Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PlacingFigureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPlacingFigure()
     * @generated
     */
    EClass PLACING_FIGURE = eINSTANCE.getPlacingFigure();

    /**
     * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACING_FIGURE__POS = eINSTANCE.getPlacingFigure_Pos();

    /**
     * The meta object literal for the '<em><b>Placing Static</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLACING_FIGURE__PLACING_STATIC = eINSTANCE.getPlacingFigure_PlacingStatic();

    /**
     * The meta object literal for the '<em><b>Placing Dynamic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLACING_FIGURE__PLACING_DYNAMIC = eINSTANCE.getPlacingFigure_PlacingDynamic();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DynamicFigureImpl <em>Dynamic Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DynamicFigureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDynamicFigure()
     * @generated
     */
    EClass DYNAMIC_FIGURE = eINSTANCE.getDynamicFigure();

    /**
     * The meta object literal for the '<em><b>Figure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DYNAMIC_FIGURE__FIGURE = eINSTANCE.getDynamicFigure_Figure();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_FIGURE__FEATURES = eINSTANCE.getDynamicFigure_Features();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StaticFigureImpl <em>Static Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StaticFigureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStaticFigure()
     * @generated
     */
    EClass STATIC_FIGURE = eINSTANCE.getStaticFigure();

    /**
     * The meta object literal for the '<em><b>Figure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_FIGURE__FIGURE = eINSTANCE.getStaticFigure_Figure();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_FIGURE__STYLE = eINSTANCE.getStaticFigure_Style();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_FIGURE__FEATURES = eINSTANCE.getStaticFigure_Features();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl <em>Node Anchor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.NodeAnchorImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getNodeAnchor()
     * @generated
     */
    EClass NODE_ANCHOR = eINSTANCE.getNodeAnchor();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ANCHOR__OBJECT = eINSTANCE.getNodeAnchor_Object();

    /**
     * The meta object literal for the '<em><b>Pass X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ANCHOR__PASS_X = eINSTANCE.getNodeAnchor_PassX();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ANCHOR__X = eINSTANCE.getNodeAnchor_X();

    /**
     * The meta object literal for the '<em><b>Format X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ANCHOR__FORMAT_X = eINSTANCE.getNodeAnchor_FormatX();

    /**
     * The meta object literal for the '<em><b>Pass Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ANCHOR__PASS_Y = eINSTANCE.getNodeAnchor_PassY();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ANCHOR__Y = eINSTANCE.getNodeAnchor_Y();

    /**
     * The meta object literal for the '<em><b>Format Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ANCHOR__FORMAT_Y = eINSTANCE.getNodeAnchor_FormatY();

    /**
     * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ANCHOR__FIGURES = eINSTANCE.getNodeAnchor_Figures();

    /**
     * The meta object literal for the '<em><b>Arrows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ANCHOR__ARROWS = eINSTANCE.getNodeAnchor_Arrows();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.ArrowAnchorImpl <em>Arrow Anchor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.ArrowAnchorImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getArrowAnchor()
     * @generated
     */
    EClass ARROW_ANCHOR = eINSTANCE.getArrowAnchor();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARROW_ANCHOR__REFERENCE = eINSTANCE.getArrowAnchor_Reference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARROW_ANCHOR__TYPE = eINSTANCE.getArrowAnchor_Type();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARROW_ANCHOR__N = eINSTANCE.getArrowAnchor_N();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl <em>Figure Features</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFigureFeatures()
     * @generated
     */
    EClass FIGURE_FEATURES = eINSTANCE.getFigureFeatures();

    /**
     * The meta object literal for the '<em><b>Linefeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__LINEFEATURES = eINSTANCE.getFigureFeatures_Linefeatures();

    /**
     * The meta object literal for the '<em><b>Centerfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__CENTERFEATURES = eINSTANCE.getFigureFeatures_Centerfeatures();

    /**
     * The meta object literal for the '<em><b>Alignfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__ALIGNFEATURES = eINSTANCE.getFigureFeatures_Alignfeatures();

    /**
     * The meta object literal for the '<em><b>Gradientfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__GRADIENTFEATURES = eINSTANCE.getFigureFeatures_Gradientfeatures();

    /**
     * The meta object literal for the '<em><b>Pointfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__POINTFEATURES = eINSTANCE.getFigureFeatures_Pointfeatures();

    /**
     * The meta object literal for the '<em><b>Sizefeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__SIZEFEATURES = eINSTANCE.getFigureFeatures_Sizefeatures();

    /**
     * The meta object literal for the '<em><b>Positionfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__POSITIONFEATURES = eINSTANCE.getFigureFeatures_Positionfeatures();

    /**
     * The meta object literal for the '<em><b>Colorfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__COLORFEATURES = eINSTANCE.getFigureFeatures_Colorfeatures();

    /**
     * The meta object literal for the '<em><b>Integerfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__INTEGERFEATURES = eINSTANCE.getFigureFeatures_Integerfeatures();

    /**
     * The meta object literal for the '<em><b>Booleanfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__BOOLEANFEATURES = eINSTANCE.getFigureFeatures_Booleanfeatures();

    /**
     * The meta object literal for the '<em><b>Stringfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__STRINGFEATURES = eINSTANCE.getFigureFeatures_Stringfeatures();

    /**
     * The meta object literal for the '<em><b>Customfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE_FEATURES__CUSTOMFEATURES = eINSTANCE.getFigureFeatures_Customfeatures();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.CustomFeatureImpl <em>Custom Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.CustomFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getCustomFeature()
     * @generated
     */
    EClass CUSTOM_FEATURE = eINSTANCE.getCustomFeature();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_FEATURE__KEY = eINSTANCE.getCustomFeature_Key();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_FEATURE__ATTRIBUTE = eINSTANCE.getCustomFeature_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_FEATURE__VALUE = eINSTANCE.getCustomFeature_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StyleFeatureImpl <em>Style Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StyleFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStyleFeature()
     * @generated
     */
    EClass STYLE_FEATURE = eINSTANCE.getStyleFeature();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_FEATURE__KEY = eINSTANCE.getStyleFeature_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_FEATURE__VALUE = eINSTANCE.getStyleFeature_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LayoutFeatureImpl <em>Layout Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LayoutFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLayoutFeature()
     * @generated
     */
    EClass LAYOUT_FEATURE = eINSTANCE.getLayoutFeature();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.CenterFeatureImpl <em>Center Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.CenterFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getCenterFeature()
     * @generated
     */
    EClass CENTER_FEATURE = eINSTANCE.getCenterFeature();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AlignFeatureImpl <em>Align Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AlignFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAlignFeature()
     * @generated
     */
    EClass ALIGN_FEATURE = eINSTANCE.getAlignFeature();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIGN_FEATURE__KEY = eINSTANCE.getAlignFeature_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIGN_FEATURE__VALUE = eINSTANCE.getAlignFeature_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.GradientFeatureImpl <em>Gradient Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.GradientFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getGradientFeature()
     * @generated
     */
    EClass GRADIENT_FEATURE = eINSTANCE.getGradientFeature();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT_FEATURE__KEY = eINSTANCE.getGradientFeature_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT_FEATURE__VALUE = eINSTANCE.getGradientFeature_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PointFeatureImpl <em>Point Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PointFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPointFeature()
     * @generated
     */
    EClass POINT_FEATURE = eINSTANCE.getPointFeature();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT_FEATURE__X = eINSTANCE.getPointFeature_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT_FEATURE__Y = eINSTANCE.getPointFeature_Y();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.SizeFeatureImpl <em>Size Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.SizeFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getSizeFeature()
     * @generated
     */
    EClass SIZE_FEATURE = eINSTANCE.getSizeFeature();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_FEATURE__WIDTH = eINSTANCE.getSizeFeature_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_FEATURE__HEIGHT = eINSTANCE.getSizeFeature_Height();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.PositionFeatureImpl <em>Position Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.PositionFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getPositionFeature()
     * @generated
     */
    EClass POSITION_FEATURE = eINSTANCE.getPositionFeature();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION_FEATURE__X = eINSTANCE.getPositionFeature_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION_FEATURE__Y = eINSTANCE.getPositionFeature_Y();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FEATURE__EXPRESSION = eINSTANCE.getColorFeature_Expression();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FEATURE__KEY = eINSTANCE.getColorFeature_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FEATURE__VALUE = eINSTANCE.getColorFeature_Value();

    /**
     * The meta object literal for the '<em><b>Rgb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FEATURE__RGB = eINSTANCE.getColorFeature_Rgb();

    /**
     * The meta object literal for the '<em><b>Atribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FEATURE__ATRIBUTE = eINSTANCE.getColorFeature_Atribute();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FEATURE__OPERATOR = eINSTANCE.getColorFeature_Operator();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FEATURE__OPTION = eINSTANCE.getColorFeature_Option();

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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.IntegerFeatureImpl <em>Integer Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.IntegerFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getIntegerFeature()
     * @generated
     */
    EClass INTEGER_FEATURE = eINSTANCE.getIntegerFeature();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_FEATURE__EXPRESSION = eINSTANCE.getIntegerFeature_Expression();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_FEATURE__KEY = eINSTANCE.getIntegerFeature_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_FEATURE__VALUE = eINSTANCE.getIntegerFeature_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleFeatureImpl <em>Double Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.DoubleFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getDoubleFeature()
     * @generated
     */
    EClass DOUBLE_FEATURE = eINSTANCE.getDoubleFeature();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_FEATURE__KEY = eINSTANCE.getDoubleFeature_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_FEATURE__VALUE = eINSTANCE.getDoubleFeature_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.StringFeatureImpl <em>String Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.StringFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getStringFeature()
     * @generated
     */
    EClass STRING_FEATURE = eINSTANCE.getStringFeature();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_FEATURE__EXPRESSION = eINSTANCE.getStringFeature_Expression();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_FEATURE__KEY = eINSTANCE.getStringFeature_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_FEATURE__VALUE = eINSTANCE.getStringFeature_Value();

    /**
     * The meta object literal for the '<em><b>Value L</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_FEATURE__VALUE_L = eINSTANCE.getStringFeature_ValueL();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_FEATURE__ATTRIBUTE = eINSTANCE.getStringFeature_Attribute();

    /**
     * The meta object literal for the '<em><b>Value R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_FEATURE__VALUE_R = eINSTANCE.getStringFeature_ValueR();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.BooleanFeatureImpl <em>Boolean Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.BooleanFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getBooleanFeature()
     * @generated
     */
    EClass BOOLEAN_FEATURE = eINSTANCE.getBooleanFeature();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_FEATURE__EXPRESSION = eINSTANCE.getBooleanFeature_Expression();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_FEATURE__KEY = eINSTANCE.getBooleanFeature_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_FEATURE__VALUE = eINSTANCE.getBooleanFeature_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineFeatureImpl <em>Line Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.LineFeatureImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getLineFeature()
     * @generated
     */
    EClass LINE_FEATURE = eINSTANCE.getLineFeature();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINE_FEATURE__EXPRESSION = eINSTANCE.getLineFeature_Expression();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE_FEATURE__KEY = eINSTANCE.getLineFeature_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE_FEATURE__VALUE = eINSTANCE.getLineFeature_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeExpressionImpl <em>Atribute Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.AtributeExpressionImpl
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getAtributeExpression()
     * @generated
     */
    EClass ATRIBUTE_EXPRESSION = eINSTANCE.getAtributeExpression();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_EXPRESSION__KEY = eINSTANCE.getAtributeExpression_Key();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_EXPRESSION__OPERATOR = eINSTANCE.getAtributeExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTE_EXPRESSION__VALUE = eINSTANCE.getAtributeExpression_Value();

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
     * The meta object literal for the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape <em>Figure Shape</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape
     * @see org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramPackageImpl#getFigureShape()
     * @generated
     */
    EEnum FIGURE_SHAPE = eINSTANCE.getFigureShape();

  }

} //XdiagramPackage
