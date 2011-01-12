package org.sonatype.aether.impl.internal;

/*******************************************************************************
 * Copyright (c) 2010-2011 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

import org.sonatype.aether.RepositorySystemSession;
import org.sonatype.aether.impl.VersionResolver;
import org.sonatype.aether.resolution.VersionRequest;
import org.sonatype.aether.resolution.VersionResolutionException;
import org.sonatype.aether.resolution.VersionResult;

/**
 * @author Benjamin Hanzelmann
 *
 */
class StubVersionResolver
    implements VersionResolver
{

    public VersionResult resolveVersion( RepositorySystemSession session, VersionRequest request )
        throws VersionResolutionException
    {
        VersionResult result = new VersionResult( request ).setVersion( request.getArtifact().getVersion() );
        if ( request.getRepositories().size() > 0 )
        {
            result = result.setRepository( request.getRepositories().get( 0 ) );
        }
        return result;

    }

}
