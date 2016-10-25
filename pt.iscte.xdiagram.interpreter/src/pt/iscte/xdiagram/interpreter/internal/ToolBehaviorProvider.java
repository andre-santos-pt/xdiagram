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
package pt.iscte.xdiagram.interpreter.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;

import pt.iscte.xdiagram.interpreter.GraphicsProvider;

public class ToolBehaviorProvider extends DefaultToolBehaviorProvider {
	
	private GraphicsProvider provider;
	
	public ToolBehaviorProvider(IDiagramTypeProvider dtp, GraphicsProvider provider) {
		super(dtp);
		this.provider = provider;
	}
	
	@Override
	public String getContributorId() {
		return "xdiagram.PropertyContributor";
	}
	
	@Override
	public boolean equalsBusinessObjects(Object o1, Object o2) {
		return o1.equals(o2);
	}

	@Override
	public IPaletteCompartmentEntry[] getPalette() {
		List<IPaletteCompartmentEntry> ret = new ArrayList<IPaletteCompartmentEntry>();

		
		// add new compartment at the end of the existing compartments
		PaletteCompartmentEntry nodesEntry = new PaletteCompartmentEntry("Nodes", null);
		ret.add(nodesEntry);
		

		// add all create-features to the new stack-entry
		IFeatureProvider featureProvider = getFeatureProvider();
		ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
		for (ICreateFeature cf : createFeatures) {
			ObjectCreationToolEntry objectCreationToolEntry = 
					new ObjectCreationToolEntry(cf.getCreateName(), cf.getCreateDescription(),
					cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
			
			nodesEntry.addToolEntry(objectCreationToolEntry);
		}

		PaletteCompartmentEntry linksEntry = new PaletteCompartmentEntry("Links", null);
		ret.add(linksEntry);
		
//		// add all create-connection-features to the new stack-entry
		ICreateConnectionFeature[] createConnectionFeatures = featureProvider.getCreateConnectionFeatures();
		for (ICreateConnectionFeature cf : createConnectionFeatures) {
			ConnectionCreationToolEntry connectionCreationToolEntry = new ConnectionCreationToolEntry(cf.getCreateName(),
					cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId());
			connectionCreationToolEntry.addCreateConnectionFeature(cf);
			linksEntry.addToolEntry(connectionCreationToolEntry);
		}

		return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
	}

	@Override
	public Object getToolTip(GraphicsAlgorithm ga) {
		PictogramElement pe = ga.getPictogramElement();
		Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
		if (bo instanceof EObject) {
			return ((EObject) bo).eClass().getName();
		}
		else if(pe.isActive() && pe instanceof ContainerShape) {
			String s = "";
			for(EReference r : provider.getContainerReferences((ContainerShape) pe)) {
				if(!s.isEmpty())
					s += ",";
				s += r.getEType().getName();
			}
			return "Container for " + s;
		}
		return super.getToolTip(ga);
	}
	
	

	// TODO: errors
//	@Override
//	public IDecorator[] getDecorators(PictogramElement pe) {
//		IFeatureProvider featureProvider = getFeatureProvider();
//		Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
//		if (bo instanceof EClass) {
//			EClass eClass = (EClass) bo;
//			String name = eClass.getName();
//			if (name != null && name.length() > 0 && !(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
//				IDecorator imageRenderingDecorator = new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK);
//				imageRenderingDecorator.setMessage("Name should start with upper case letter"); //$NON-NLS-1$
//				return new IDecorator[] { imageRenderingDecorator };
//			}
//		}
//
//		return super.getDecorators(pe);
//	}

//	@Override
//	public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
//		IFeatureProvider featureProvider = getFeatureProvider();
//		Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
//		if (bo instanceof EClass) {
//			GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
//			GraphicsAlgorithm rectangle = invisible.getGraphicsAlgorithmChildren().get(0);
//			return new GraphicsAlgorithm[] { rectangle };
//		}
//		return super.getClickArea(pe);
//	}

//	@Override
//	public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
//		if (pe instanceof ContainerShape) {
//			GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
//			EList<GraphicsAlgorithm> graphicsAlgorithmChildren = invisible.getGraphicsAlgorithmChildren();
//			for (GraphicsAlgorithm ga : graphicsAlgorithmChildren)
//				if ("1".equals(Graphiti.getPeService().getPropertyValue(ga, "MAIN")))
//						return ga;
//			if (!invisible.getLineVisible()) {				
//				if (!graphicsAlgorithmChildren.isEmpty()) {
//					return graphicsAlgorithmChildren.get(0);
//				}
//			}
//		}
//		return super.getSelectionBorder(pe);
//	}

//	@Override
//	public IContextMenuEntry[] getContextMenu(ICustomContext context) {
//		// create a sub-menu for all custom features
//		ContextMenuEntry subMenu = new ContextMenuEntry(null, context);
//		subMenu.setText("Cu&stom"); //$NON-NLS-1$
//		subMenu.setDescription("Custom features submenu"); //$NON-NLS-1$
//		// display sub-menu hierarchical or flat
//		subMenu.setSubmenu(true);
//
//		// create a menu-entry in the sub-menu for each custom feature
//		ICustomFeature[] customFeatures = getFeatureProvider().getCustomFeatures(context);
//		for (int i = 0; i < customFeatures.length; i++) {
//			ICustomFeature customFeature = customFeatures[i];
//			if (customFeature.isAvailable(context)) {
//				ContextMenuEntry menuEntry = new ContextMenuEntry(customFeature, context);
//				subMenu.add(menuEntry);
//			}
//		}
//
//		IContextMenuEntry ret[] = new IContextMenuEntry[] { subMenu };
//		return ret;
//	}
	

}
