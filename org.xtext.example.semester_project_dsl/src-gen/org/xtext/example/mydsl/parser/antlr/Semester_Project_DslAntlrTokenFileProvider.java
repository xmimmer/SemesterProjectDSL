/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Semester_Project_DslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/mydsl/parser/antlr/internal/InternalSemester_Project_Dsl.tokens");
	}
}
