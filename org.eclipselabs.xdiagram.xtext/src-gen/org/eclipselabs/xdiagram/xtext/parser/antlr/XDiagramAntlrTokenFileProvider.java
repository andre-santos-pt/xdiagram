/*
* generated by Xtext
*/
package org.eclipselabs.xdiagram.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XDiagramAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipselabs/xdiagram/xtext/parser/antlr/internal/InternalXDiagram.tokens");
	}
}
