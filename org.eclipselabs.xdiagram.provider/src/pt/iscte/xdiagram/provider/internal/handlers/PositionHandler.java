/*******************************************************************************
 * Copyright (c) 2016 ISCTE-IUL.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André L. Santos, Eduardo Gomes - initial API and implementation
 *******************************************************************************/
package pt.iscte.xdiagram.provider.internal.handlers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Layout;
import pt.iscte.xdiagram.dsl.model.Node;
import pt.iscte.xdiagram.dsl.model.Position;
import pt.iscte.xdiagram.provider.internal.FeatureHandler;

public class PositionHandler implements FeatureHandler {

	private static final int DEFAULT_MARGIN = 0;

	private LayoutHandler layoutHandler;

	public PositionHandler(LayoutHandler layoutHandler) {
		this.layoutHandler = layoutHandler;
	}

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Position.class;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, final GraphicsAlgorithm figure) {
		final Position p = (Position) feature;
		ContainerShape cparent = (ContainerShape) container.eContainer();

		// TODO: memory leak listeners
		if(p.isXRelative()) {
			cparent.getGraphicsAlgorithm().eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if(msg.getFeature() instanceof EAttribute) {
						if(((EAttribute) msg.getFeature()).getName().equals("width")) {
							int width = msg.getNewIntValue();
							IDimension d = Graphiti.getGaLayoutService().calculateSize(figure);
							int newX = (int) (width*(p.getX()/100.0)) - (d.getWidth()/2);
							Graphiti.getGaService().setLocation(figure, newX, figure.getY());
						}
					}
				}	
			});
		}
		
		if(p.isYRelative()) {
			cparent.getGraphicsAlgorithm().eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if(msg.getFeature() instanceof EAttribute) {
						if(((EAttribute) msg.getFeature()).getName().equals("height")) {
							int height = msg.getNewIntValue();
							IDimension d = Graphiti.getGaLayoutService().calculateSize(figure);
							int newY = (int) (height*(p.getY()/100.0)) - (d.getHeight()/2);
							Graphiti.getGaService().setLocation(figure, figure.getX(), newY);
						}
					}
				}	
			});
		}

		if(!p.isXRelative())
			Graphiti.getGaService().setLocation(figure, p.getX(), figure.getY());
		
		if(!p.isYRelative())
			Graphiti.getGaService().setLocation(figure, figure.getX(), p.getY());
	}



	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		ContainerShape parent = ((ContainerShape) figure.eContainer()).getContainer();

		Layout layout = layoutHandler.getLayout(parent.getGraphicsAlgorithm());

		if(layout == null && !(element.eContainer() instanceof Node)) {
			Graphiti.getGaService().setLocation(figure, DEFAULT_MARGIN, DEFAULT_MARGIN);
		}
		//		else if(layout != null){
		//			element.eContainer();
		//			int x = 0;
		//			int y = 0;
		//
		//			for(Shape s : parent.getChildren()) {
		//				if(s.getGraphicsAlgorithm() == figure)
		//					break;
		//
		//				IDimension size = Graphiti.getGaService().calculateSize(s.getGraphicsAlgorithm());
		//				x += size.getWidth();
		//				y += size.getHeight();
		//			}
		//
		//			if(layout.isVertical())
		//				Graphiti.getGaService().setLocation(figure, layout.getMargin(), y);
		//			else
		//				Graphiti.getGaService().setLocation(figure, x, layout.getMargin());
		//		}
	}



	@Override
	public boolean accept(FeatureContainer element) {
		return //element instanceof ConnectableElement && 
				(element.eContainer() instanceof FeatureContainer || element.eContainer() instanceof Node);
	}
}
