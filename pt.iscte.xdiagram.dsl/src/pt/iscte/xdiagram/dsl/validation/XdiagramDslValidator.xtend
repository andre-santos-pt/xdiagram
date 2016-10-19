/*
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.validation

import com.google.common.collect.Maps
import com.google.common.collect.Sets
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.xtext.validation.Check
import pt.iscte.xdiagram.dsl.model.Color
import pt.iscte.xdiagram.dsl.model.ConnectableElement
import pt.iscte.xdiagram.dsl.model.Contains
import pt.iscte.xdiagram.dsl.model.Decorator
import pt.iscte.xdiagram.dsl.model.Diagram
import pt.iscte.xdiagram.dsl.model.DiagramElement
import pt.iscte.xdiagram.dsl.model.Ellipse
import pt.iscte.xdiagram.dsl.model.Feature
import pt.iscte.xdiagram.dsl.model.FeatureContainer
import pt.iscte.xdiagram.dsl.model.Layout
import pt.iscte.xdiagram.dsl.model.Line
import pt.iscte.xdiagram.dsl.model.Link
import pt.iscte.xdiagram.dsl.model.ModelPackage
import pt.iscte.xdiagram.dsl.model.Node
import pt.iscte.xdiagram.dsl.model.Position
import pt.iscte.xdiagram.dsl.model.Rectangle
import pt.iscte.xdiagram.dsl.model.Size
import pt.iscte.xdiagram.dsl.model.XDiagram

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class XdiagramDslValidator extends AbstractXdiagramDslValidator {
	

	@Check
	def ecoreExists(XDiagram diagram) {
		var ecoreUri = diagram.getImportURI();
		var uri = URI.createURI(ecoreUri);
		
		if(!uri.isPlatform())
			error("invalid ecore model", ModelPackage.Literals.XDIAGRAM__IMPORT_URI);
//		var pluginId = uri.segment(1);
		var resourceSet = new ResourceSetImpl(); 
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl()); 
		
		try {
			var resource = resourceSet.getResource(uri, true);
		}
		catch(Exception e) {
			error("could not load ecore model, check URI: should be in the form \"platform:/plugin/plugin...id/.../model.ecore", 
				ModelPackage.Literals.XDIAGRAM__IMPORT_URI
			);
		}
	}


	@Check
	def void noDuplicateBindings(XDiagram diagram) {
		var set = Maps.newHashMap();
		var dups = Sets.newHashSet();
		
		var setRefs = Maps.newHashMap();
		var dupsRefs = Sets.newHashSet();
		
		for(DiagramElement e : diagram.getElements()) {
			if(e.getModelClass() != null) {
				var clazz = e.getModelClass();
				if(set.containsKey(clazz)) {
					dups.add(e);
					dups.add(set.get(clazz));
				}
				else {
					set.put(clazz, e);
				}
			}
			else if(e instanceof Link) {
				var ref = (e as Link).getModelReference();
				if(setRefs.containsKey(ref)) {
					dupsRefs.add(e as Link);
					dupsRefs.add(setRefs.get(ref));
				}
				else {
					setRefs.put(ref, e as Link);
				}
			}
		}
		
		for(DiagramElement e : dups)
			error("duplicate mapping", e, ModelPackage.Literals.DIAGRAM_ELEMENT__MODEL_CLASS);
		
		for(Link l : dupsRefs)
			error("duplicate mapping", l, ModelPackage.Literals.LINK__MODEL_REFERENCE);
	}

	@Check
	def void node(Node node) {
		if(node.getModelClass().isAbstract())
			error("node class cannot be abstract", ModelPackage.Literals.DIAGRAM_ELEMENT__MODEL_CLASS);
	}
	

	@Check
	def void link(Link link) {
		if(link.isComplex()) {
			var linkClass = link.getModelClass();
			if(linkClass.isAbstract())
				error("link class cannot be abstract", ModelPackage.Literals.DIAGRAM_ELEMENT__MODEL_CLASS);
			
		
			var srcRef = link.getSourceReference();
			if(!srcRef.getEReferenceType().isSuperTypeOf(linkClass))
				error("source reference type must be compatible with link class", ModelPackage.Literals.LINK__SOURCE_REFERENCE);			
			
			var tgtRef = link.getTargetReference();
			if(!linkClass.getEAllReferences().contains(tgtRef))
				error("target reference must be owned by link class", ModelPackage.Literals.LINK__TARGET_REFERENCE);
			
			if(!(tgtRef.getLowerBound() == 1 && tgtRef.getUpperBound() == 1))
				error("target reference must have cardinality 1..1", ModelPackage.Literals.LINK__TARGET_REFERENCE);
			
		}
	}


	@Check
	def void contains(Contains contains) {
		var node = diagramElement(contains) as Node;
		var clazz = node.getModelClass();
		if(!clazz.getEAllReferences().contains(contains.getModelReference()))
			error("reference must be owned by node class " + clazz.getName(), ModelPackage.Literals.CONTAINS__MODEL_REFERENCE);
	}

	def DiagramElement diagramElement(Feature f) {
		var o = f.eContainer();
		while(!(o instanceof DiagramElement))
			o = o.eContainer();
		
		return o as DiagramElement;
	}

	@Check
	def void conflitingContains(Diagram diagram) {
		checkContains(diagram.getContains());
	}
	
	@Check
	def void conflitingContains(FeatureContainer fc) {
		checkContains(fc.getFeatures());
	}


	def void checkContains(List<? extends Feature> list) {
		var refs = Maps.newHashMap();
		for(Feature f : list) {
			if(f instanceof Contains) {
				var t = (f as Contains).getModelReference().getEReferenceType();
				for(EClass c : refs.keySet()) {
					if(c.isSuperTypeOf(t) || t.isSuperTypeOf(c)) {
						error("references with compatible types", f, ModelPackage.Literals.CONTAINS__MODEL_REFERENCE);
						error("references with compatible types", refs.get(c), ModelPackage.Literals.CONTAINS__MODEL_REFERENCE);
					}
				}
				refs.put(t, f as Contains);
			}
		}
	}



//	@Check
//	public void textValue(TextValue v) {
//		boolean modelRef = false;
//		for(TextPart part : v.getParts()) {
//			if(part.getModelAttribute() != null) {
//				if(part.isEditable() && modelRef)
//					error("at most one binding to the model may be editable", v, null);
//
//				modelRef = true;
//				DiagramElement element = diagramElement(v);
//
//				if(element instanceof Node) {
//					Node node = (Node) element;
//					EClass clazz = node.getModelClass();
//					if(!clazz.getEAllAttributes().contains(part.getModelAttribute()))
//						error("attribute must be owned by class " + clazz.getName(), part, TEXT_PART__MODEL_ATTRIBUTE);
//				}
//				else if(element instanceof Link) {
//					Link link = (Link) element;
//					if(link.isComplex()) {
//						EClass clazz = link.getModelClass();
//						if(!clazz.getEAllAttributes().contains(part.getModelAttribute()))
//							error("attribute must be owned by class " + clazz.getName(), part, TEXT_PART__MODEL_ATTRIBUTE);
//					}
//					else {
//						error("dynamic labels in link references are not supported", part, null);
//					}
//				}
//			}
//		}
//	}
//	
//	
//	
//	
//
	/**
	 * child figures cannot define Position if parent defines Layout
	 */
	@Check
	def void layout(ConnectableElement element) {

		for(Feature f : element.getFeatures()) {
			if(f instanceof Layout) {
				for(FeatureContainer child : element.getChildren()) {
					for(Feature fc : child.getFeatures())
						if(fc instanceof Position) {
							var l = "horizontal";
							if((f as Layout).isVertical())
								l = "vertical";
							error("child element cannot have position feature, given that parent defines layout (" + l + ")", fc, null);
						}
				}
			}
		}
	}

	@Check
	def void sizeSquareCircleLine(Size size) {
		var parent = size.eContainer();
		var t = "";

		if(size.getWidth() == 0 && !size.isWidthRelative())
			error("width must be positive", ModelPackage.Literals.SIZE__WIDTH);
		
		if(parent instanceof Rectangle && (parent as Rectangle).isSquare() && size.getHeight() != 0) {
			t = "square";
		}
		else if(parent instanceof Ellipse && (parent as Ellipse).isCircle() && size.getHeight() != 0) {
			t = "circle";	
		}
		else if(parent instanceof Line && size.getHeight() != 0) {
			t = "line";
		}
		
		if(!t.isEmpty()) {
			error("size should have only one dimension, given that parent is a " + t, ModelPackage.Literals.SIZE__HEIGHT);
			return;
		}
		else if(size.getHeight() == 0 && !size.isHeightRelative() && !isSingleDimension(parent as FeatureContainer))
			error(parent.class.getSimpleName() + ": height must be positive", ModelPackage.Literals.SIZE__HEIGHT);
		
	}
	
	def isSingleDimension(FeatureContainer f) {
		return
			f instanceof Rectangle && (f as Rectangle).isSquare() || 
			f instanceof Ellipse && (f as Ellipse).isCircle() ||
			f instanceof Line;
	}
	
	
	@Check
	def void relativeSize(Size size) {
		if(size.isWidthRelative() && !isPercentage(size.getWidth()))
			error("relative width (%) must be within [0, 100]", ModelPackage.Literals.SIZE__WIDTH_RELATIVE);
		
		if(size.isHeightRelative() && !isPercentage(size.getHeight()))
			error("relative height (%) must be within [0, 100]", ModelPackage.Literals.SIZE__HEIGHT_RELATIVE);
	}
	
	@Check
	def void relativePosition(Position p) {
		if(p.isXRelative() && !isPercentage(p.getX()))
			error("relative x position (%) must be within [0, 100]", ModelPackage.Literals.POSITION__XRELATIVE);
		
		if(p.isYRelative() && !isPercentage(p.getY()))
			error("relative y position (%) must be within [0, 100]", ModelPackage.Literals.POSITION__YRELATIVE);
	}

	@Check
	def void decorator(Decorator d) {
		if(!isPercentage(d.getPosition()))
			error("decorator position must be within [0, 100]", ModelPackage.Literals.DECORATOR__POSITION);
	}
	
	@Check
	def void color(Color color) {
		var c = color.getCustom();
		if(c != null) {
			
			if(!isColorValue(c.getR()))
				error("invalid Red value, must be within [0, 255]", color, ModelPackage.Literals.CUSTOM_COLOR__R);
			if(!isColorValue(c.getG()))
				error("invalid Green value, must be within [0, 255]", color, ModelPackage.Literals.CUSTOM_COLOR__R);
			if(!isColorValue(c.getB()))
				error("invalid Blue value, must be within [0, 255]", color, ModelPackage.Literals.CUSTOM_COLOR__R);
		}
	}
	
//	@Check
//	def void image(Image img) {
//		var bundle = Platform.getBundle(pluginId);
//		
//		var e = bundle.getEntryPaths(XdiagramConstants.IMAGES_FOLDER_NAME);
//		if(e == null)
//			return;
//		
//		while(e.hasMoreElements()) {
//			var file = e.nextElement();
//			file = file.substring(file.indexOf('/')+1);
//			if(file.equals(img.getImageId()))
//				return;
//		}
//		error("image not found. images should be placed in a folder named \"" + 
//				XdiagramConstants.IMAGES_FOLDER_NAME + "\" in the plugin root.", 
//				IMAGE__IMAGE_ID);
//	}
	
	

	
	def boolean isPercentage(int v) {
		return v >= 0 && v <= 100;
	}
	
	def boolean isColorValue(int v) {
		return v >= 0 && v <= 255;
	}

	
}
