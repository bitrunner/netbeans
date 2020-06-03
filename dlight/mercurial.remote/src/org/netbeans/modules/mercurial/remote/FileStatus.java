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
package org.netbeans.modules.mercurial.remote;

import org.netbeans.modules.versioning.core.api.VCSFileProxy;

/**
 * Holds detailed information about status of a mercurial-managed file, ie repository URL, remote path, branch, etc.
 * 
 * 
 */
public class FileStatus {
    private final VCSFileProxy mFile;
    private final boolean mbCopied;
    private final VCSFileProxy originalFile;
    
    public FileStatus(VCSFileProxy file, VCSFileProxy original){
        mFile = file;
        this.originalFile = original;
        mbCopied = original != null;
    }
    public VCSFileProxy getFile(){
        return mFile;
    }
    public VCSFileProxy getOriginalFile(){
        return originalFile;
    }
    public boolean isCopied(){
        return mbCopied;
    }
}