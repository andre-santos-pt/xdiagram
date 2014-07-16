/*
 * generated by Xtext
 */
package org.eclipselabs.xdiagram.validation;

import static org.eclipselabs.xdiagram.dsl.DslPackage.Literals.*;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.PlatformContentHandlerImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.validation.Check;
import org.eclipselabs.xdiagram.XdiagramConstants;
import org.eclipselabs.xdiagram.dsl.Color;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.CustomColor;
import org.eclipselabs.xdiagram.dsl.Decorator;
import org.eclipselabs.xdiagram.dsl.Diagram;
import org.eclipselabs.xdiagram.dsl.DiagramElement;
import org.eclipselabs.xdiagram.dsl.DslPackage;
import org.eclipselabs.xdiagram.dsl.Ellipse;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Image;
import org.eclipselabs.xdiagram.dsl.Layout;
import org.eclipselabs.xdiagram.dsl.Line;
import org.eclipselabs.xdiagram.dsl.Link;
import org.eclipselabs.xdiagram.dsl.Node;
import org.eclipselabs.xdiagram.dsl.Position;
import org.eclipselabs.xdiagram.dsl.Rectangle;
import org.eclipselabs.xdiagram.dsl.Size;
import org.eclipselabs.xdiagram.dsl.TextPart;
import org.eclipselabs.xdiagram.dsl.TextValue;
import org.eclipselabs.xdiagram.dsl.XDiagram;
import org.osgi.framework.Bundle;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class DslJavaValidator extends org.eclipselabs.xdiagram.validation.AbstractDslJavaValidator {
	
	private String pluginId;
	
	@Check
	public void ecoreExists(XDiagram diagram) {
		
		String ecoreUri = diagram.getImportURI();
		URI uri = URI.createURI(ecoreUri);
		if(!uri.isPlatform())
			error("invalid ecore model", XDIAGRAM__IMPORT_URI);
		pluginId = uri.segment(1);
		ResourceSet resourceSet = new ResourceSetImpl(); 
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
		"ecore", new EcoreResourceFactoryImpl()); 
		
		try {
			Resource resource = resourceSet.getResource(uri, true);
		}
		catch(Exception e) {
			error("could not load ecore model, check URI: should be in the form \"platform:/plugin/plugin...id/.../model.ecore", DslPackage.Literals.XDIAGRAM__IMPORT_URI);
		}
	}


	

	@Check
	public void noDuplicateBindings(XDiagram diagram) {
		Map<EClass, DiagramElement> set = Maps.newHashMap();
		Set<DiagramElement> dups = Sets.newHashSet();
		
		Map<EReference, Link> setRefs = Maps.newHashMap();
		Set<Link> dupsRefs = Sets.newHashSet();
		
		for(DiagramElement e : diagram.getElements()) {
			if(e.getModelClass() != null) {
				EClass clazz = e.getModelClass();
				if(set.containsKey(clazz)) {
					dups.add(e);
					dups.add(set.get(clazz));
				}
				else {
					set.put(clazz, e);
				}
			}
			else if(e instanceof Link) {
				EReference ref = ((Link) e).getModelReference();
				if(setRefs.containsKey(ref)) {
					dupsRefs.add((Link) e);
					dupsRefs.add(setRefs.get(ref));
				}
				else {
					setRefs.put(ref, (Link) e);
				}
					
			}
		}
		
		for(DiagramElement e : dups)
			error("duplicate mapping", e, DIAGRAM_ELEMENT__MODEL_CLASS);
		
		for(Link l : dupsRefs)
			error("duplicate mapping", l, LINK__MODEL_REFERENCE);
	}
	

	@Check
	public void node(Node node) {
		if(node.getModelClass().isAbstract())
			error("node class cannot be abstract", DIAGRAM_ELEMENT__MODEL_CLASS);
	}

	@Check
	public void link(Link link) {
		if(link.isComplex()) {
			EClass linkClass = link.getModelClass();
			if(linkClass.isAbstract())
				error("link class cannot be abstract", DIAGRAM_ELEMENT__MODEL_CLASS);
			
		
			EReference srcRef = link.getSourceReference();
			if(!srcRef.getEReferenceType().isSuperTypeOf(linkClass))
				error("source reference type must be compatible with link class", LINK__SOURCE_REFERENCE);			
			
			EReference tgtRef = link.getTargetReference();
			if(!linkClass.getEAllReferences().contains(tgtRef))
				error("target reference must be owned by link class", LINK__TARGET_REFERENCE);
			
			if(!(tgtRef.getLowerBound() == 1 && tgtRef.getUpperBound() == 1))
				error("target reference must have cardinality 1..1", LINK__TARGET_REFERENCE);
			
		}
	}
	
	@Check
	public void contains(Contains contains) {
		Node node = (Node) diagramElement(contains);
		EClass clazz = node.getModelClass();
		if(!clazz.getEAllReferences().contains(contains.getModelReference()))
			error("reference must be owned by node class " + clazz.getName(), CONTAINS__MODEL_REFERENCE);
	}

	@Check
	public void conflitingContains(Diagram diagram) {
		checkContains(diagram.getContains());
	}
	
	@Check
	public void conflitingContains(FeatureContainer fc) {
		checkContains(fc.getFeatures());
	}


	private void checkContains(List<? extends Feature> list) {
		Map<EClass,Contains> refs = Maps.newHashMap();
		for(Feature f : list) {
			if(f instanceof Contains) {
				EClass t = ((Contains) f).getModelReference().getEReferenceType();
				for(EClass c : refs.keySet()) {
					if(c.isSuperTypeOf(t) || t.isSuperTypeOf(c)) {
						error("references with compatible types", f, CONTAINS__MODEL_REFERENCE);
						error("references with compatible types", refs.get(c), CONTAINS__MODEL_REFERENCE);
					}
				}
				refs.put(t, (Contains) f);
			}
		}
	}

	
	@Check
	public void textValue(TextValue v) {
		boolean modelRef = false;
		for(TextPart part : v.getParts()) {
			if(part.getModelAttribute() != null) {
				if(part.isEditable() && modelRef)
					error("at most one binding to the model may be editable", v, null);

				modelRef = true;
				DiagramElement element = diagramElement(v);

				if(element instanceof Node) {
					Node node = (Node) element;
					EClass clazz = node.getModelClass();
					if(!clazz.getEAllAttributes().contains(part.getModelAttribute()))
						error("attribute must be owned by class " + clazz.getName(), part, TEXT_PART__MODEL_ATTRIBUTE);
				}
				else if(element instanceof Link) {
					Link link = (Link) element;
					if(link.isComplex()) {
						EClass clazz = link.getModelClass();
						if(!clazz.getEAllAttributes().contains(part.getModelAttribute()))
							error("attribute must be owned by class " + clazz.getName(), part, TEXT_PART__MODEL_ATTRIBUTE);
					}
					else {
						error("dynamic labels in link references are not supported", part, null);
					}
				}
			}
		}
	}
	
	
	
	

	/**
	 * child figures cannot define Position if parent defines Layout
	 */
	@Check
	public void layout(ConnectableElement element) {

		for(Feature f : element.getFeatures()) {
			if(f instanceof Layout) {
				for(FeatureContainer child : element.getChildren()) {
					for(Feature fc : child.getFeatures())
						if(fc instanceof Position) {
							String l = ((Layout) f).isVertical() ? "vertical" : "horizontal";
							error("child element cannot have position feature, given that parent defines layout (" + l + ")", fc, null);
						}
				}
			}
		}
	}

	@Check
	public void sizeSquareCircleLine(Size size) {
		EObject parent = size.eContainer();
		String t = null;

		if(size.getWidth() == 0 && !size.isWidthRelative())
			error("width must be positive", SIZE__WIDTH);
		
		if(parent instanceof Rectangle && ((Rectangle) parent).isSquare() && size.getHeight() != 0)
			t = "square";
		else if(parent instanceof Ellipse && ((Ellipse) parent).isCircle() && size.getHeight() != 0)
			t = "circle";
		else if(parent instanceof Line && size.getHeight() != 0)
			t = "line";
		
		if(t != null) {
			error("size should have only one dimension, given that parent is a " + t, SIZE__HEIGHT);
			return;
		}
		else if(size.getHeight() == 0 && !size.isHeightRelative() && !isSingleDimension((FeatureContainer) parent))
			error("height must be positive", SIZE__HEIGHT);
		
	}
	
	
	@Check
	public void relativeSize(Size size) {
		if(size.isWidthRelative() && !isPercentage(size.getWidth()))
			error("relative width (%) must be within [0, 100]", SIZE__WIDTH);
		
		if(size.isHeightRelative() && !isPercentage(size.getHeight()))
			error("relative height (%) must be within [0, 100]", SIZE__HEIGHT);
	}
	
	@Check
	public void relativePosition(Position p) {
		if(p.isXRelative() && !isPercentage(p.getX()))
			error("relative x position (%) must be within [0, 100]", POSITION__X);
		
		if(p.isYRelative() && !isPercentage(p.getY()))
			error("relative y position (%) must be within [0, 100]", POSITION__Y);
	}

	@Check
	public void decorator(Decorator d) {
		if(!isPercentage(d.getPosition()))
			error("decorator position must be within [0, 100]", DECORATOR__POSITION);
	}
	
	@Check
	public void color(Color color) {
		CustomColor c = color.getCustom();
		if(c != null) {
			
			if(!isColorValue(c.getR()))
				error("invalid Red value, must be within [0, 255]", color, CUSTOM_COLOR__R);
			if(!isColorValue(c.getG()))
				error("invalid Green value, must be within [0, 255]", color, CUSTOM_COLOR__G);
			if(!isColorValue(c.getB()))
				error("invalid Blue value, must be within [0, 255]", color, CUSTOM_COLOR__B);
		}
	}
	
	@Check
	public void image(Image img) {
		Bundle bundle = Platform.getBundle(pluginId);
		
		Enumeration<String> e = bundle.getEntryPaths(XdiagramConstants.IMAGES_FOLDER_NAME);
		if(e == null)
			return;
		
		while(e.hasMoreElements()) {
			String file = e.nextElement();
			file = file.substring(file.indexOf('/')+1);
			if(file.equals(img.getImageId()))
				return;
		}
		error("image not found. images should be placed in a folder named \"" + 
				XdiagramConstants.IMAGES_FOLDER_NAME + "\" in the plugin root.", 
				IMAGE__IMAGE_ID);
	}
	
	
	private static DiagramElement diagramElement(Feature f) {
		EObject o = f.eContainer();
		while(!(o instanceof DiagramElement))
			o = o.eContainer();
		
		return (DiagramElement) o;
	}
	
	private static boolean isPercentage(int v) {
		return v >= 0 && v <= 100;
	}
	
	private static boolean isColorValue(int v) {
		return v >= 0 && v <= 255;
	}
	
	public static boolean isSingleDimension(FeatureContainer o) {
		return 
				o instanceof Rectangle && ((Rectangle) o).isSquare() ||
				o instanceof Ellipse && ((Ellipse) o).isCircle() ||
				o instanceof Line;
	}
	
}