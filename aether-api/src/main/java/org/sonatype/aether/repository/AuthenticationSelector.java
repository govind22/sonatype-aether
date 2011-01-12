package org.sonatype.aether.repository;

/*******************************************************************************
 * Copyright (c) 2010-2011 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

/**
 * Selects authentication for a given remote repository.
 * 
 * @author Benjamin Bentmann
 */
public interface AuthenticationSelector
{

    /**
     * Selects authentication for the specified remote repository.
     * 
     * @param repository The repository for which to select authentication, must not be {@code null}.
     * @return The selected authentication or {@code null} if none.
     */
    Authentication getAuthentication( RemoteRepository repository );

}
