/*******************************************************************************
 * Copyright (c) Philipps University of Marburg. All rights reserved. 
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Philipps University of Marburg - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.refactor.refactoring.henshin.managers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.refactor.refactoring.henshin.interfaces.IHenshinDataManagement;
import org.eclipse.emf.refactor.refactoring.henshin.interfaces.IHenshinInformation;
import org.eclipse.emf.refactor.refactoring.henshin.runtime.HenshinApplicationMonitor;

/**
 * Class that executes Henshin transformations using the Henshin
 * interpreter.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class HenshinRuntimeManager {
	
	/**
	 * Given selection of EObjects the model refactoring 
	 * shall be executed on.
	 */
	protected final List<EObject> selection;
	
	public final static String HENSHINEXTENSION = ".henshin";
	private static final String MAINUNIT = "mainUnit";
	
	/**
	 * Corresponding HenshinDataManagement object which specifies 
	 * data concerning a model refactoring that shall be executed by 
	 * EMF model transformations using Henshin. 
	 */
	private IHenshinDataManagement dataManagementObject;
	
	/**
	 * Factory for creating Henshin objects.
	 */
	private static HenshinFactory henshinFactory = HenshinFactory.eINSTANCE;
	
	/**
	 * Henshin transformation system to be executed.
	 */
	private Module module = henshinFactory.createModule();

	/**
	 * Default constructor using a selection of EObjects the model refactoring 
	 * shall be executed on and the corresponding HenshinDataManagement object 
	 * which specifies data concerning a model refactoring that shall be 
	 * executed by EMF model transformations using Henshin. 
	 * @param selection Given selection of EObjects the model refactoring 
	 * shall be executed on.
	 * @param dataManagementObject Corresponding HenshinDataManagement object 
	 * which specifies data concerning a model refactoring that shall be 
	 * executed by EMF model transformations using Henshin. 
	 */
	public HenshinRuntimeManager
		(List<EObject> selection, IHenshinDataManagement dataManagementObject){
		this.selection = selection;
		this.dataManagementObject = dataManagementObject;
	}
	
	/**
	 * Static method for checking initial or final conditions of a EMF
	 * model refactoring using Henshin transformations.
	 * @param henshinInformation Corresponding HenshinInformation object 
	 * specifying a Henshin file that shall be used.
	 * @param root Root object of the EMF model to be refactored.
	 * @return List of messages indicating errors which occur during
	 * conditions checking.
	 */
	public static List<String> checkConditions
					(IHenshinInformation henshinInformation, EObject root) {
		List<String> result = new ArrayList<String>();
		if (henshinInformation.isTransformationFileSpecified()) {
			String path = henshinInformation.getTransformationFileName() 
														+ HENSHINEXTENSION;
			Module checkTransformationSystem = 
						(Module) HenshinFileManager.loadFile(path);
			EGraph graph = new EGraphImpl();
			graph.addTree(root);
			Engine engine = new EngineImpl();
			
			Unit mainUnit = 
						checkTransformationSystem.getUnit(MAINUNIT);
			
			UnitApplication unitApplication = new UnitApplicationImpl(engine);
			unitApplication.setUnit(mainUnit);
			unitApplication.setEGraph(graph);

			
			// Map <Parameter, Object> values = new HashMap<Parameter, Object>();
			for (Parameter par : mainUnit.getParameters()){
				try {
					/*values.put(par, 
							henshinInformation.getHenshinDataManagement()
								.getInPortByName(par.getName()).getValue());*/
					unitApplication.setParameterValue(par.getName(), 
							henshinInformation.getHenshinDataManagement()
								.getInPortByName(par.getName()).getValue());
				} catch (IllegalArgumentException ex) {
					ex.printStackTrace();
				}			
			}
			
			HenshinApplicationMonitor am = new HenshinApplicationMonitor(); 
			
			unitApplication.execute(am);
			List<RuleApplication> appliedRules = am.getAppliedRules();
			for (UnitApplication ua : appliedRules) {
				result.add(((RuleApplication) ua).getResultMatch().getRule().getDescription());
			}
/*			while (!appliedRules.empty()) {
				RuleApplication appliedRule = appliedRules.pop();
				if ((null != appliedRule.getDescription()) 
							&& (! appliedRule.getDescription().isEmpty())) {
					result.add
						(appliedRule.getMatch().getRule().getDescription());
				}
			} */
		}
		return result;
	}
	
	/**
	 * Method that executes the EMF model refactoring using Henshin.
	 */
	public void run(){
		if (this.dataManagementObject.getCreateChangeHenshinInformation()
										.isTransformationFileSpecified()) {
			String path = this.dataManagementObject
					.getCreateChangeHenshinInformation()
						.getTransformationFileName() + HENSHINEXTENSION;
			this.module = 
						(Module) HenshinFileManager.loadFile(path);
			EObject root = EcoreUtil.getRootContainer(selection.get(0));
			EGraph graph = new EGraphImpl();
			graph.addTree(root);
			Engine engine = new EngineImpl();
			
			Unit mainUnit = 
						this.module.getUnit(MAINUNIT);
			UnitApplication unitApplication = new UnitApplicationImpl(engine);
			unitApplication.setUnit(mainUnit);
			unitApplication.setEGraph(graph);

			// Map <Parameter, Object> values = new HashMap<Parameter, Object>();
			for (Parameter par : mainUnit.getParameters()){
				try {
					unitApplication.setParameterValue(par.getName(), 
							this.dataManagementObject
								.getInPortByName(par.getName()).getValue());
					/*values.put
						(par, this.dataManagementObject
								.getInPortByName(par.getName()).getValue()); */
				} catch (IllegalArgumentException ex) {
					ex.printStackTrace();
				}			
			}
			
			unitApplication.execute(null);			
		}
	}

//	private final static String MAIN_RULE = "mainRule";
//	private final static String CONTEXT = "context";
//
//	public static double run(String transformationPath, EObject context) {
//		EObject root = EcoreUtil.getRootContainer(context);		
//		EGraph graph = new EGraphImpl();
//		graph.addTree(root);
//		Engine engine = new EngineImpl();
//		Module module = (Module) HenshinFileManager.loadFile(transformationPath);
//		Rule rule = (Rule) module.getUnit(MAIN_RULE);
//		Match prematch = new MatchImpl(rule);
//		for (Parameter par : rule.getParameters()) {
//			if (par.getName().equals(CONTEXT)) {
//				prematch.setParameterValue(par, context);
//			}
//		}
//		RuleApplication application = new RuleApplicationImpl(engine, graph, rule, prematch); 
//		List<Match> matches = InterpreterUtil.findAllMatches(engine,
//				application.getRule(), application.getEGraph(),
//				application.getPartialMatch());
//		return matches.size();
//	}
}
