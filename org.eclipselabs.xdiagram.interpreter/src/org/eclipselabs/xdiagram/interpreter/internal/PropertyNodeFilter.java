package org.eclipselabs.xdiagram.interpreter.internal;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

public class PropertyNodeFilter extends AbstractPropertySectionFilter {

	@Override
	protected boolean accept(PictogramElement pe) {
//		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
//		if (bo instanceof EClass) {
//			return true;
//		}
//		return false;
		
		return true;
	}
}
