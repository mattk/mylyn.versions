/*******************************************************************************
 * Copyright (c) 2011 Ericsson
 * 
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Description:
 *   ScmArtifact extension to include IResource information e.g. project name and project relative path
 * 
 * Contributors:
 *   Alvaro Sanchez-Leon - Initial API and Implementation
 *******************************************************************************/

package org.eclipse.mylyn.versions.core;

/**
 * @author lmcalvs
 */
public abstract class ScmArtifactX extends ScmArtifact {

	protected ScmArtifactX(String id, String path) {
		super(id, path);
	}

	/**
	 * Eclipse project name including this ScmArtifact
	 * 
	 * @return
	 */
	public abstract String getProjectName();

	/**
	 * Returns the relative path from it associated Eclipse project
	 * 
	 * @return
	 */
	public abstract String getRelPathToProject();
}
