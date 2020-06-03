/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.subversion.remote.client.cli.commands;

import java.io.IOException;
import org.netbeans.modules.subversion.remote.api.ISVNNotifyListener;
import org.netbeans.modules.subversion.remote.api.SVNRevision;
import org.netbeans.modules.subversion.remote.client.cli.Parser.Line;
import org.netbeans.modules.subversion.remote.client.cli.SvnCommand;
import org.netbeans.modules.versioning.core.api.VCSFileProxy;
import org.openide.filesystems.FileSystem;

/**
 *
 * 
 */
public class UpdateCommand extends SvnCommand {

    private final VCSFileProxy[] files;
    private final boolean recursive;
    private final SVNRevision rev;
    private final boolean ignoreExternals;
    private long revision;

    public UpdateCommand(FileSystem fileSystem, VCSFileProxy[] files, SVNRevision rev, boolean recursive, boolean ignoreExternals) {
        super(fileSystem);
        this.files = files;
        this.recursive = recursive;
        this.rev = rev;
        this.ignoreExternals = ignoreExternals;
    }
       
    @Override
    protected ISVNNotifyListener.Command getCommand() {
        return ISVNNotifyListener.Command.UPDATE;
    }
    
    @Override
    public void prepareCommand(Arguments arguments) throws IOException {                     
        arguments.add("update"); //NOI18N
        if (!recursive) {
            arguments.add("-N"); //NOI18N
        }
        if(rev != null) {
            arguments.add(rev);
        }
        if(ignoreExternals) {
            arguments.add("--ignore-externals"); //NOI18N
        }
        arguments.add("--force"); // NOI18N - permits update when locally new file conflicts with the one in repository
        for (VCSFileProxy file : files) {
            arguments.add(file);                       
        }        
        setCommandWorkingDirectory(files[0]);        
    }
    
    // XXX merge with commit
    public long getRevision() {
        return revision;
    }

    @Override
    protected void notify(Line line) {
        if(line.getRevision() != -1) {
            // XXX - doesn't work with externals            
            // Fetching external item into '/foo/beer'
            // External at revision 3120.
            // At revision 24051.            

//          XXX can't rely on this - see also update cmd            
//            if(revision != -1) {
//                Subversion.LOG.warning(
//                        "Revision notified more times : " + revision + ", " + 
//                        line.getRevision() + " for command " + getStringCommand());
//            }
            revision = line.getRevision();            
        }
    }        
    
}