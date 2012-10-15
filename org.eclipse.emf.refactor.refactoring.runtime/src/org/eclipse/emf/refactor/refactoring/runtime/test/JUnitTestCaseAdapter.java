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

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Adapter class used for running JUnit tests.
 * @generated NOT
 * @author Thorsten Arendt
 */
public abstract class JUnitTestCaseAdapter {

	private static final String TEST_CASES_DIR = "test_";
	private static final String ANNOTATION = "marker";
	
	/**
	 * Path prefix of the model to be loaded. 
	 */
	private final String pathPrefix;
	
	/**
	 * Name of the refactoring to test
	 */
	private final String name;
	
	/**
	 * File extension of the models
	 */
	private final String extension;
	
	/**
	 * XMIResourceFactory used for registry purposes.
	 */
	private final Factory factory;
	
	/**
	 * Refactoring to test
	 */
	private final Refactoring refactoring;
	
	/**
	 * Constructor.
	 * @param newName the name of the refactoring to test
	 * @param newExtension the file extension of the models
	 * @param bundle path to the bundle containing the test cases
	 * @param newEmfRefactoring the refactoring to test
	 */
	protected JUnitTestCaseAdapter(
			final String newName,
			final String newExtension,
			final String bundle,
			final Refactoring newRefactoring) {
		this.name = newName;
		this.extension = newExtension;
		this.refactoring = newRefactoring;
		this.pathPrefix = bundle + "/tests/" + newName;
		this.factory = new XMIResourceFactoryImpl();
	}

	/**
	 * Prepares and runs the test case with the given number.
	 * @param no the number of the test case
	 */
	protected final void executeTestCase(final String no) {
		// create model manager for this test case
		JUnitModelManager newModelManager = createJUnitModelManager(no);
		if (newModelManager != null) {
			// get source model
			EObject source = newModelManager.getSource();
			// set the selection to the annotated element
			// of the source model
			setSelection(getAnnotatedElement(source));
			// set the port values for this test case
			setPortValues(no);
			// run actual test
			newModelManager.runTest(no);
		}
	}

	/**
	 * Creates a JUnitModelManager for this test case.
	 * @param no the number of the test case
	 * @return JUnitModelManager for this test case
	 */
	private JUnitModelManager createJUnitModelManager(final String no) {
		// create URIs for source and target model files
		URI sourceUri = URI.createFileURI(
				new File(pathPrefix,
						"/" + TEST_CASES_DIR
						+ no + "/source."
						+ extension)
				.getAbsolutePath());
		URI targetUri = URI.createFileURI(
				new File(pathPrefix,
						"/" + TEST_CASES_DIR
						+ no + "/target."
						+ extension)
				.getAbsolutePath());
		// load source and target models
		EObject source = null;
		try {
			source = loadResource(sourceUri);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		EObject target = null;
		try {
			target = loadResource(targetUri);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// return the model manager
		// target = null intentionally allowed, tries constraints instead
		return new JUnitModelManager(
				source, target, getEditingDomain(source));
	}

	/**
	 * Loads and returns the EObject for a given resource via it's URI.
	 * @param resourceUri URI of the resource that should be loaded
	 * @return the EObject to the given URI
	 * @throws IOException 
	 */
	private EObject loadResource(final URI resourceUri) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(extension, factory);
		Resource rs = resourceSet.createResource(resourceUri);
		rs.load(Collections.EMPTY_MAP);
		return EcoreUtil.getRootContainer(rs.getContents().get(0));
	}

	/**
	 * Returns the editing domain for this EObject (the model).
	 * @param source the model to get the editing domain for
	 * @return the editing domain for the given EObject (model)
	 */
	private EditingDomain getEditingDomain(final EObject source) {
		ResourceSet rset = source.eResource().getResourceSet();
		EditingDomain editingDomain = null;
		try {
			// if a domain is registered already, use it
			editingDomain =
				TransactionalEditingDomain.Factory.INSTANCE
				.getEditingDomain(rset);
		} catch (Exception e) {
			//Ignore Exception
		}

		if (null == editingDomain) {
			try {
				// else, create a new one
				editingDomain =
					TransactionalEditingDomain
					.Factory.INSTANCE
					.createEditingDomain(rset);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return editingDomain;
	}

	/**
	 * Sets the selection of the refactoring to the given object.
	 * Preselects port accordingly.
	 * @param selection the EObject to select
	 */
	private void setSelection(final EObject selection) {
		if (null == selection) {
			throw new RuntimeException("Selection not found!");
		}
		List<EObject> sel = new ArrayList<EObject>();
		sel.add(selection);
		// set the refactoring controller's selection
		refactoring.getController().setSelection(sel);
		// preselect the port
		refactoring.getController().getDataManagementObject()
		.preselect(sel);
	}

	/**
	 * Returns the annotated model element from the given model.
	 * @param root the model which contains the annotated element
	 * @return the annotated model element
	 */
	private static EModelElement getAnnotatedElement(final EObject root) {
		Iterator<EObject> allElements = root.eAllContents();
		// loop through all elements of the model object
		while (allElements.hasNext()) {
			EObject element = allElements.next();
			if (element instanceof EModelElement) {
				if (element instanceof EAnnotation) {
					if (((EAnnotation) element).getSource()
							.equals(ANNOTATION)) {
						// return annotated element
						return
						((EAnnotation) element)
						.getEModelElement();
					}
				}
			}
		}
		throw new RuntimeException("Element not found!");
	}

	/**
	 * Sets the port values according to the config XML.
	 * @param no the number of the test case
	 */
	@SuppressWarnings("unchecked")
	private void setPortValues(final String no) {
		// create URI for the config XML file of this test case
		URI configUri = URI.createFileURI(
				new File(pathPrefix, "/"
						+ TEST_CASES_DIR
						+ no + "/config.xml")
				.getAbsolutePath());
		// parse the XML
		DocumentBuilderFactory dbf =
			DocumentBuilderFactory.newInstance();
		Document doc = null;
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			try {
				doc = db.parse(configUri.toString());
			} catch (final SAXException e) {
				e.printStackTrace();
			} catch (final IOException e) {
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}
		if (null != doc) {
			doc.getDocumentElement().normalize();
			NodeList nodes = doc.getElementsByTagName("param");
			String portName = "";
			String portValue = "";
			// for every parameter in the config
			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element param = (Element) node;
					NodeList names =
						((Element) param
						.getElementsByTagName("name")
						.item(0))
						.getChildNodes();
				    portName =
				    	((Node) names
				    			.item(0))
				    			.getNodeValue();
				    NodeList values =
				    	((Element) param
				    		.getElementsByTagName("value")
				    		.item(0))
				    		.getChildNodes();
				    portValue =
				    	((Node) values.item(0)).getNodeValue();
				    // save the value of the specified port
					refactoring
					.getController()
					.getDataManagementObject()
					.getInPortByName(portName)
					.setValue(portValue);
				}
			}
		}
	}

	/**
	 * Registers the right package to namespace URI relation to 
	 * the package registry. 
	 */
	protected static void register(final EPackage ePackage) {
		EPackage.Registry.INSTANCE.put(
				ePackage.getNsURI(),
				EPackage.Registry.INSTANCE.get(
						ePackage.getNsURI()));
	}
		
	/**
	 * Individual Model Manager
	 */
	protected final class JUnitModelManager extends ModelManager {

		public JUnitModelManager(final EObject source,
				final EObject target,
				final EditingDomain editingDomain) {
				super(name, refactoring.getController(),
						source, target, extension, editingDomain);
		}

		@Test
		public void runTest(final String no) {
			assertEquals(true, this.testRefactor());
		}

	}

}
