package org.eclipselabs.xdiagram.interpreter;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipselabs.xdiagram.interpreter.internal.ECoreUtil;
import org.osgi.framework.Bundle;


public class StandardGraphicsProvider implements GraphicsProvider {

	private IGaService gaService;
	private IPeCreateService peCreateService;
	
	public StandardGraphicsProvider() {
		gaService = Graphiti.getGaService();
		peCreateService = Graphiti.getPeCreateService();
	}
	
	public void setup(String diagramType, Map<String, String> properties, Bundle bundle) {
	}
	
	public EClass getRoot(EPackage ePackage) {
		return ECoreUtil.getRoot(ePackage);
	}
	
	public GraphicsAlgorithm createNodeFigure(Diagram diagram, IAddContext context, ContainerShape container, EObject eObject) {
		GraphicsAlgorithm fig = gaService.createPlainRectangle(container);
		gaService.setSize(fig, 100, 50);

		if(!container.getContainer().equals(diagram))
			gaService.setLocation(fig, 20, 20);
		
		Style style = gaService.createPlainStyle(diagram, "mystyle");
		style.setForeground(gaService.manageColor(diagram,IColorConstant.BLACK));
		style.setBackground(gaService.manageColor(diagram,IColorConstant.WHITE));
		
		fig.setStyle(style);
		
		
		
		Shape shape = peCreateService.createShape(container, false);
		Text text = gaService.createPlainText(shape, eObject.eClass().getName());
		text.setValue(eObject.eClass().getName());
		
		Style fontStyle = gaService.createPlainStyle(diagram, "myfontstyle");
		fontStyle.setFont(gaService.manageFont(diagram, "Arial", 14));	
		fontStyle.setBackground(style.getBackground());
		fontStyle.setForeground(gaService.manageColor(diagram,IColorConstant.BLACK));
		
		text.setStyle(fontStyle);
		
		gaService.setLocationAndSize(text, 2, 2, fig.getWidth()-4, 20);
		
		return fig;
	}

	public Connection getConnectionFigure(Diagram diagram, Anchor source, Anchor target, EObject eObject) {
		Connection connection = peCreateService.createFreeFormConnection(diagram);
		
		connection.setStart(source);
		connection.setEnd(target);

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPlainPolyline(connection);
		Style style = gaService.createPlainStyle(diagram, "linkstyle");
		polyline.setStyle(style);

		// add dynamic text decorator for the reference name
		ConnectionDecorator textDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createPlainText(textDecorator);
		text.setValue("??");
		Style textstyle = gaService.createPlainStyle(diagram, "linktextstyle");
		textstyle.setFilled(false);
		text.setStyle(textstyle);
		gaService.setLocation(text, 10, 0);

		// add static graphical decorators (composition and navigable)
		ConnectionDecorator cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
		Polyline arrow = gaService.createPlainPolyline(cd, new int[] { -15, 10, 0, 0, -15, -10 });
		arrow.setStyle(style);
		
		
		return connection;
	}


	public boolean hasTool(EClass eClass) {
		return true;
	}


	public boolean hasTool(EReference eReference) {
		return true;
	}


	
	public boolean isProperty(EStructuralFeature feature) {
		return feature instanceof EAttribute;
	}

	
	public boolean isLink(EClass eClass) {
		return false;
	}
	
	public EReference getLinkSource(EClass eClass) {
		throw new IllegalArgumentException("not a link - " + eClass.getName());
	}

	public EReference getLinkTarget(EClass eClass) {
		throw new IllegalArgumentException("not a link - " + eClass.getName());
	}

	public void resizeNodeFigure(Diagram diagram, ContainerShape container, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	public void updateNodeFigure(Diagram diagram, ContainerShape container) {
		// TODO Auto-generated method stub
		
	}

	public void removeNodeFigure(Diagram diagram, ContainerShape container) {
		// TODO Auto-generated method stub
		
	}

	public void removeNodeFigure(Diagram diagram, GraphicsAlgorithm figure) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValidOutgoingConnection(Anchor anchor, EReference eReference) {
		return true;
	}

	public boolean isValidIncomingConnection(Anchor anchor, EReference eReference) {
		return true;
	}

	public boolean canResizeNodeFigure(EObject eObject) {
		return true;
	}

	public boolean canMoveNodeFigure(GraphicsAlgorithm figure) {
		// TODO Auto-generated method stub
		return false;
	}

	public GraphicsAlgorithm getNodeFigureLabel(Diagram diagram,
			ContainerShape container) {
		// TODO Auto-generated method stub
		return null;
	}

	

	public GraphicsAlgorithm getFigureLabel(Diagram diagram,
			ContainerShape container) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateFigureLabel(Diagram diagram, ContainerShape container,
			GraphicsAlgorithm figure, String value) {
		// TODO Auto-generated method stub
		
	}

	public boolean canEditFigureLabel(GraphicsAlgorithm figure, EObject eObject) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getFigureLabelValue(GraphicsAlgorithm figure) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateFigureLabel(Diagram diagram, GraphicsAlgorithm figure,
			String value) {
		// TODO Auto-generated method stub
		
	}

	public void updateLinkFigure(Diagram diagram, Connection connection) {
		// TODO Auto-generated method stub
		
	}

	public Connection getConnectionFigure(Diagram diagram, Anchor source,
			Anchor target, EObject eObject, EReference eReference) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void updateNodeFigure(Diagram diagram, ContainerShape container, GraphicsAlgorithm fig,
//			EObject eObject) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public EAttribute getTextEditableAttribute(EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canAddChild(ContainerShape container, EClass eClass, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
	
}
