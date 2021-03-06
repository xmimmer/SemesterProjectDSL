/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalSemester_Project_DslParser;
import org.xtext.example.mydsl.services.Semester_Project_DslGrammarAccess;

public class Semester_Project_DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(Semester_Project_DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, Semester_Project_DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCredentialsAccess().getAlternatives(), "rule__Credentials__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getSSIDAccess().getGroup(), "rule__SSID__Group__0");
			builder.put(grammarAccess.getPasswordAccess().getGroup(), "rule__Password__Group__0");
			builder.put(grammarAccess.getIPAccess().getGroup(), "rule__IP__Group__0");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
			builder.put(grammarAccess.getModelAccess().getVariablesAssignment_2(), "rule__Model__VariablesAssignment_2");
			builder.put(grammarAccess.getModelAccess().getSensorsAssignment_3(), "rule__Model__SensorsAssignment_3");
			builder.put(grammarAccess.getModelAccess().getCredentialsAssignment_4(), "rule__Model__CredentialsAssignment_4");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getNameAssignment_1(), "rule__Sensor__NameAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getPinAssignment_3(), "rule__Sensor__PinAssignment_3");
			builder.put(grammarAccess.getSSIDAccess().getNameAssignment_1(), "rule__SSID__NameAssignment_1");
			builder.put(grammarAccess.getPasswordAccess().getNameAssignment_1(), "rule__Password__NameAssignment_1");
			builder.put(grammarAccess.getIPAccess().getNameAssignment_1(), "rule__IP__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private Semester_Project_DslGrammarAccess grammarAccess;

	@Override
	protected InternalSemester_Project_DslParser createParser() {
		InternalSemester_Project_DslParser result = new InternalSemester_Project_DslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Semester_Project_DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Semester_Project_DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
