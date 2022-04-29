/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.example.mydsl.semester_Project_Dsl.Model;
import org.xtext.example.mydsl.semester_Project_Dsl.Sensor;
import org.xtext.example.mydsl.semester_Project_Dsl.Variable;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class Semester_Project_DslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Model model = Iterators.<Model>filter(resource.getAllContents(), Model.class).next();
    fsa.generateFile("test.ino", this.compile(model));
  }
  
  public CharSequence compile(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <Arduino.h>");
    _builder.newLine();
    _builder.append("#include <SensirionI2CScd4x.h>");
    _builder.newLine();
    _builder.append("#include <Wire.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("SensirionI2CScd4x scd4x;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Variable> _variables = m.getVariables();
      for(final Variable e : _variables) {
        _builder.append("Variable name = ");
        String _name = e.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Sensor> _sensors = m.getSensors();
      for(final Sensor e_1 : _sensors) {
        _builder.append("int ");
        String _name_1 = e_1.getName();
        _builder.append(_name_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("void setup() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("void loop() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}