/*
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XdiagramDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("pt/iscte/xdiagram/dsl/parser/antlr/internal/InternalXdiagramDsl.tokens");
	}
}