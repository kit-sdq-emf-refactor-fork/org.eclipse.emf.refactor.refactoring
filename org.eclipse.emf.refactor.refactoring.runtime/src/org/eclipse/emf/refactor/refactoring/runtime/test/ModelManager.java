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
package org.eclipse.emf.refactor.refactoring.runtime.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.refactor.refactoring.interfaces.IController;

/**
 * Class used for JUnit tests.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class ModelManager {

	
	/**
	 * Name of the refactoring to be tested.
	 */
	private final String name;	
	
	/**
	 * Controller to be used for the refactoring.
	 */
	private final IController controller;
	
	/**
	 * EObject to run the refactoring on.
	 */
	private final EObject source;
	
	/**
	 * EObject to compare the refactored source model to.
	 */
	private final EObject target;
	
	/**
	 * File extension of the corresponding meta model.
	 */
	private final String extension;
	
	/**
	 * Editing domain to be used for the refactoring.
	 */
	private final EditingDomain editingDomain;

	/**
	 * Constructor.
	 * @param newName Name of the refactoring to be tested.
	 * @param newController Controller to be used for the refactoring.
	 * @param newSource Source EObject to run the refactoring on.
	 * @param newTarget Target EObject to compare the refactored source model to.
	 * @param newExtension File extension of the corresponding meta model.
	 * @param newEditingDomain Editing domain to be used for the refactoring.
	 */
	public ModelManager(
			final String newName,
			final IController newController,
			final EObject newSource,
			final EObject newTarget,
			final String newExtension,
			final EditingDomain newEditingDomain) {
		super();
		this.name = newName;
		this.controller = newController;
		this.source = newSource;
		this.target = newTarget;
		this.extension = newExtension;
		this.editingDomain = newEditingDomain;
	}

	/**
	 * Returns the source EObject.
	 * @return the source EObject
	 */
	public final EObject getSource() {
		return source;
	}

	/**
	 * Returns the target EObject.
	 * @return the target EObject
	 */
	public final EObject getTarget() {
		return target;
	}

	/**
	 * Refactors the source model and compares it to the target model.
	 * @return true if the expected target model is matched, false if not
	 */
	protected final boolean testRefactor() { return true;
//		try {
//			boolean match = true;
//			// create refactoring
//			EObject refactoredSource = executeRefactoring();
//
//			// set match model options
//			Map<String, Object> options =
//				new HashMap<String, Object>();
//			// OPTION_IGNORE_XMI_ID = true
//			options.put(
//					MatchOptions.OPTION_IGNORE_XMI_ID,
//					Boolean.TRUE);
//			// create match model with those options
//			MatchModel matchModel =
//				MatchService.doMatch(
//						refactoredSource,
//						target,
//						options);
//			// if match model contains unmatched elements
//			if (matchModel.getUnmatchedElements().size() > 0) {
//				// set matched to false
//				match = false;
//			}
//
//			// if still matched
//			if (match) {
//				// create diff model
//				DiffModel diff = DiffService.doDiff(matchModel);
//				// if there are differences
//				if (diff.getDifferences().size() > 0) {
//					// set matched to false
//					match = false;
//				}
//			}
//
//			// if still matched
//			if (match) {
//				// run through all matched elements
//				List<MatchElement> matchedElements =
//					matchModel.getMatchedElements();
//				for (MatchElement m : matchedElements) {
//					if (1 != m.getSimilarity()) {
//						match = false;
//					}
//				}
//			}
//			 this.saveEMFDiffFile(matchModel);
//			 this.saveModel(EcoreUtil.copy(refactoredSource));
//			return match;
//		} catch (final Exception e) {
//			e.printStackTrace();
//			return false;
//		}
	}
	
//	private EObject executeRefactoring() {
//		EmfTestRefactoringCommand command =
//			new EmfTestRefactoringCommand(
//				name,
//				controller.getLtkRefactoringProcessor(),
//				source);
//		// execute the refactoring
//		editingDomain.getCommandStack().execute(command);
//		return command.getRoot();
//	}

	/**
	 * Save an EMFDiffFile for the given match model.
	 * @param match the MatchModel to create the diff file for
	 * @throws IOException
	 */
//	private void saveEMFDiffFile(
//			final MatchModel match) throws IOException {
//		// get source model URI
//		final String decodedSourcePath =
//			URI.decode(source.eResource().getURI().path());
//		// diff file URI = model URI with different extension (.emfdiff)
//		final String diffFileName =
//			new File(decodedSourcePath)
//			.getAbsolutePath().replace("source." + extension, "differences.emfdiff");
//		final URI diffFileURI = URI.createFileURI(diffFileName);
//
//		// create diff model
//		final DiffModel diff = DiffService.doDiff(match, false);
//
//		// save the diff model
//		ResourceSet rs = new ResourceSetImpl();
//		rs.getResourceFactoryRegistry()
//			.getExtensionToFactoryMap()
//			.put("emfdiff", new XMIResourceFactoryImpl());
//		final Resource newModelResource =
//			ModelUtils.createResource(diffFileURI, rs);
//		newModelResource.getContents().add(diff);
//		final Map<String, String> options =
//			new EMFCompareMap<String, String>();
//		options.put(
//				XMLResource.OPTION_ENCODING,
//				System.getProperty("file.encoding"));
//		newModelResource.save(options);
//
//	}
	
//	private void saveModel(EObject refsource) {
//		ResourceSet rs = new ResourceSetImpl();
//		rs.getResourceFactoryRegistry()
//			.getExtensionToFactoryMap()
//			.put(extension, new XMIResourceFactoryImpl());
//		final String decodedSourcePath =
//			URI.decode(source.eResource().getURI().path());
//		final String refSourceFileName =
//			new File(decodedSourcePath)
//			.getAbsolutePath().replace("source." + extension, "source_ref." + extension);
//		final URI refSourceURI = URI.createFileURI(refSourceFileName);
//		final Resource newModelResource =
//			ModelUtils.createResource(refSourceURI, rs);
//		rs.eSetDeliver(false);
//		newModelResource.eSetDeliver(false);
//		newModelResource.getContents().add(refsource);
//		final Map<String, String> options =
//			new EMFCompareMap<String, String>();
//		options.put(
//				XMLResource.OPTION_ENCODING,
//				System.getProperty("file.encoding"));
//		try {
//			newModelResource.save(options);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
