/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.semester_project_dsl.ui.internal.Semester_project_dslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Semester_Project_DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Semester_project_dslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Semester_project_dslActivator activator = Semester_project_dslActivator.getInstance();
		return activator != null ? activator.getInjector(Semester_project_dslActivator.ORG_XTEXT_EXAMPLE_MYDSL_SEMESTER_PROJECT_DSL) : null;
	}

}