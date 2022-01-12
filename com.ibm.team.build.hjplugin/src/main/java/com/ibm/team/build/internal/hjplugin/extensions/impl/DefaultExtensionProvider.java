/*******************************************************************************
 * Copyright (c) 2016, 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.team.build.internal.hjplugin.extensions.impl;

import hudson.Extension;
import hudson.model.Run;

import java.io.File;
import java.io.PrintStream;
import java.util.Map;

import com.ibm.team.build.internal.hjplugin.extensions.RtcExtensionProvider;

@Extension
public class DefaultExtensionProvider extends RtcExtensionProvider {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9109197832897523833L;

	@Override
	public boolean isApplicable(Run<?, ?> build) {
		return false;
	}
	
	@Override
	public void preUpdateFileCopyArea(String workspaceUUID, String workspaceName, String buildResultUUID, String repoURL, String userId, String password, File loadDirectory, PrintStream logger) {
		if(logger != null) {
			logger.println("In preUpdateFileCopyArea method");
			logger.println("workspaceUUID= "+workspaceUUID);
			logger.println("workspace name= "+workspaceName);
			logger.println("buildResultUUID= "+buildResultUUID);
			logger.println("repoURL= "+repoURL);
			logger.println("UserId= "+userId);
			logger.println("Password= "+password);
			logger.println("Workspace Path: "+loadDirectory.getAbsolutePath());
		}
	}
	
	@Override
    public void postUpdateFileCopyArea(String workspaceUUID, String workspaceName, String buildResultUUID, String repoURL, String userId, String password, File loadDirectory, PrintStream logger) {
		if(logger != null) {
			logger.println("In postUpdateFileCopyArea method");
			logger.println("workspaceUUID= "+workspaceUUID);
			logger.println("workspace name= "+workspaceName);
			logger.println("buildResultUUID= "+buildResultUUID);
			logger.println("repoURL= "+repoURL);
			logger.println("UserId= "+userId);
			logger.println("Password= "+password);
			logger.println("Workspace Path: "+loadDirectory.getAbsolutePath());
		}
	} 

	@Override
	public String getPathToLoadRuleFile(String workspaceUUID, String workspaceName, String buildResultUUID, Map<String, String> componentInfo, String repoURL, String userId, String password, File loadDirectory, PrintStream logger) {
		
		if(logger != null) {
			logger.println("In new getPathToLoadRuleFile method");
			logger.println("workspaceUUID= "+workspaceUUID);
			logger.println("workspace name= "+workspaceName);
			logger.println("buildResultUUID= "+buildResultUUID);
			logger.println("repoURL= "+repoURL);
			logger.println("UserId= "+userId);
			logger.println("Password= "+password);
			logger.println("Workspace Path: "+loadDirectory.getAbsolutePath());
		}
		return loadDirectory.getAbsolutePath()+"/demo.loadrule";
	}
}
