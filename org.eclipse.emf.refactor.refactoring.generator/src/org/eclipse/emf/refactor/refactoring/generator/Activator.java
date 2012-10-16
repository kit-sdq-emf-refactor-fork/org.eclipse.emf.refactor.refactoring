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
package org.eclipse.emf.refactor.refactoring.generator;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Activator class of the org.eclipse.emf.refactor.generator plugin.
 * @generated
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * @generated
	 */
	public static final String PLUGIN_ID = "org.eclipse.emf.refactor.refactoring.generator";

	/**
	 * @generated
	 */
	private static Activator plugin;
	
	/**
	 * @generated
	 */
	public Activator() {
	}

	/**
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * @generated
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
