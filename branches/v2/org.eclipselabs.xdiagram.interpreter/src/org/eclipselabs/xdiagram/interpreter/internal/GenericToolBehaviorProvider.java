package org.eclipselabs.xdiagram.interpreter.internal;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;

public class GenericToolBehaviorProvider extends DefaultToolBehaviorProvider{

    public GenericToolBehaviorProvider(IDiagramTypeProvider dtp) {
         super(dtp);
    }
    
}
