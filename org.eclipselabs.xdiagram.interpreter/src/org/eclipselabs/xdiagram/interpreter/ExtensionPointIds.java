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
package org.eclipselabs.xdiagram.interpreter;

public interface ExtensionPointIds {

	public static final String GRAPHITI_DIAGRAM_TYPES_EXT = "org.eclipse.graphiti.ui.diagramTypes";
	public static final String GRAPHITI_DIAGRAM_TYPES_TYPE = "type";
	public static final String GRAPHITI_DIAGRAM_TYPE_PROVIDERS_EXT = "org.eclipse.graphiti.ui.diagramTypeProviders";
	public static final String GRAPHITI_DIAGRAM_TYPE_PROVIDERS_IMAGE = "imageProvider";
	
	public static final String GRAPHITI_IMAGE_PROVIDERS_EXT = "org.eclipse.graphiti.ui.imageProviders";
	
	public static final String XDIAGRAM_PROVIDERS_EXT = "org.eclipselabs.xdiagram.interpreter.providers";
	public static final String XDIAGRAM_PROVIDERS_PROVIDER = "provider";
	
//	public static final String XDIAGRAM_IMAGE_PROVIDER_ID
	
//	public static final String BINDINGS_ID = "org.eclipselabs.xdiagram.interpreter.bindings";
	public static final String BINDINGS_DIAGRAM_TYPE = "diagramType";
	public static final String BINDINGS_EPACKAGE_URI = "ePackageURI";
	

	
	
	
}

