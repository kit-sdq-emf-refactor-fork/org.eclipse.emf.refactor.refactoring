package org.eclipse.emf.refactor.refactoring.generator.managers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.refactor.refactoring.generator.core.RefactoringInfo;

public class DependenciesManager {

	protected final static String MANIFEST_FILE = "/META-INF/MANIFEST.MF";	
	protected final static String REQUIREBUNDLE = "Require-Bundle";
	protected final static String ECORE = "org.eclipse.emf.ecore";
	protected final static String EXPRESSIONS = "org.eclipse.core.expressions";
	protected final static String ECORECHANGE = "org.eclipse.emf.ecore.change";
	protected final static String LTKCORE = "org.eclipse.ltk.core.refactoring";
	protected final static String LTKUI = "org.eclipse.ltk.ui.refactoring";	
	protected final static String REFACTORCOMMON = "org.eclipse.emf.refactor.refactoring";
	protected final static String REFACTORRUNTIME = "org.eclipse.emf.refactor.refactoring.runtime";
	protected final static String JUNIT = "org.junit";
	
	/**
	 * Updates the plugin-dependencies (Require-Bundle) of the
	 * target project. Adds dependencies to org.eclipse.emf.ecore,
	 * org.eclipse.emf.ecore.change, org.eclipse.ltk.core.refactoring,
	 * org.eclipse.ltk.ui.refactoring, org.eclipse.emf.refactor.common,
	 * and org.eclipse.emf.refactor.runtime
	 */
	public static void updateDependencies(RefactoringInfo info) {		
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
								.getProject(info.getProjectName());
		try {
			String fileName = project.getLocation().append(MANIFEST_FILE)
								.toOSString();
			FileInputStream is = new FileInputStream(fileName);
			Manifest mf = new Manifest(is);
			Attributes att = mf.getMainAttributes();
			String value = att.getValue(REQUIREBUNDLE);
			if (! value.contains(EXPRESSIONS)) 
				value = value + "," +  EXPRESSIONS;
			if (! value.contains(ECORE))
				value = value + "," +  ECORE;
			if (! value.contains(ECORECHANGE))
				value = value + "," +  ECORECHANGE;
			if (! value.contains(LTKCORE))
				value = value + "," +  LTKCORE;
			if (! value.contains(LTKUI))
				value = value + "," +  LTKUI;
			if (! value.contains(REFACTORCOMMON)) 
				value = value + "," +  REFACTORCOMMON;
			if (! value.contains(REFACTORRUNTIME)) 
				value = value + "," +  REFACTORRUNTIME;
			if (! value.contains(JUNIT)) 
				value = value + "," +  JUNIT + ";bundle-version=\"4.8.1\"";
			if (! value.contains(info.getJar()))
				value = value + "," +  info.getJar();
			att.putValue(REQUIREBUNDLE, value);
			FileOutputStream out = new FileOutputStream(fileName);  
			mf.write(out); 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}
}
