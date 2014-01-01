package org.eclipselabs.xdiagram.interpreter;

import org.eclipselabs.xdiagram.interpreter.internal.GenericDiagramTypeProvider;

public final class XDiagramTypeProvider extends GenericDiagramTypeProvider {

	@Override
	public boolean isAutoUpdateAtStartup() {
		return true;
	}
	
}
