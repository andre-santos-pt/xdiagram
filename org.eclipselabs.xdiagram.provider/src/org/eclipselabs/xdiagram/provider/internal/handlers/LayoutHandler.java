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
package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

import pt.iscte.xdiagram.dsl.model.ConnectableElement;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Layout;

public class LayoutHandler implements FeatureHandler {

	private Map<GraphicsAlgorithm, Layout> layouts;
	
	public LayoutHandler() {
		layouts = new WeakHashMap<>();
	}
	
	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Layout.class;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram, final GraphicsAlgorithmContainer container,
			GraphicsAlgorithm figure) {
		
		final Layout layout = (Layout) feature;
		layouts.put(figure, layout);
			
		layout(container, layout);
	
		// TODO bug memory leak
//		eObject.eAdapters().add(new AdapterImpl() {
//			@Override
//			public void notifyChanged(Notification msg) {
//				languageProvider.internalUpdate((PictogramElement) container);
////				System.out.println(msg);
////				layout(container, layout);
//			}
//		});
	}

	private void layout(GraphicsAlgorithmContainer container, Layout layout) {
		int x = 0;
		int y = 0;
		for(Shape s : ((ContainerShape) container).getChildren()) {
			if(layout.isVertical())
				Graphiti.getGaService().setLocation(s.getGraphicsAlgorithm(), layout.getMargin(), y);
			else
				Graphiti.getGaService().setLocation(s.getGraphicsAlgorithm(), x, layout.getMargin());
			
			IDimension size = Graphiti.getGaService().calculateSize(s.getGraphicsAlgorithm());
			x += size.getWidth();
			y += size.getHeight();
		}
	}

	
	
	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {

	}

	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof ConnectableElement;
	}
	
	public boolean hasLayout(GraphicsAlgorithm element) {
		return layouts.containsKey(element);
	}
	
	public Layout getLayout(GraphicsAlgorithm element) {
		return layouts.get(element);
	}
}
