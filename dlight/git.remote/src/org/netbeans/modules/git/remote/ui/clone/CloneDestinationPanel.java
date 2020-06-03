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
package org.netbeans.modules.git.remote.ui.clone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import org.netbeans.modules.git.remote.GitModuleConfig;
import org.netbeans.modules.git.remote.utils.GitUtils;
import org.netbeans.modules.remotefs.versioning.api.VCSFileProxySupport;
import org.netbeans.modules.versioning.core.api.VCSFileProxy;
import org.openide.filesystems.FileSystem;
import org.openide.util.NbBundle;

/**
 *
 */
public final class CloneDestinationPanel extends JPanel implements ActionListener {
    private String message;
    private final FileSystem fileSystem;
    
    /** Creates new form CloneVisualPanel2 */
    public CloneDestinationPanel(FileSystem fs) {
        this.fileSystem = fs;
        initComponents();
        directoryBrowseButton.addActionListener(this);    
        scanForProjectsCheckBox.addActionListener(this);    
        directoryField.setText(defaultWorkingDirectory().getPath());
        scanForProjectsCheckBox.setSelected(GitModuleConfig.getDefault().getShowCloneCompleted());
    }
    
    @Override
    public String getName() {
        if (destinationDirectoryPanel == null) {
            return null;
        }
        return destinationDirectoryPanel.getName();
    }
    
    public String getDirectory() {
        return directoryField.getText();
    }
    
    void setDirectory (String parentFolder) {
        directoryField.setText(parentFolder);
    }

    public String getCloneName() {
        return nameField.getText();
    }

    public String getMessage() {
        return message;
    }

    public String getBranch() {
        Object item = branchesComboBox.getSelectedItem();
        return item == null ? "" : item.toString();
    }
    
    public String getRemoteName() {
        return remoteTextField.getText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        destinationDirectoryPanel = new javax.swing.JPanel();
        directoryLabel = new javax.swing.JLabel();
        directoryBrowseButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        destinationDirectoryPanel.setName(org.openide.util.NbBundle.getMessage(CloneDestinationPanel.class, "destinationDirectoryPanel.Name")); // NOI18N

        directoryLabel.setLabelFor(directoryField);
        org.openide.awt.Mnemonics.setLocalizedText(directoryLabel, org.openide.util.NbBundle.getMessage(CloneDestinationPanel.class, "directoryLabel.Name")); // NOI18N

        directoryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directoryFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(directoryBrowseButton, org.openide.util.NbBundle.getMessage(CloneDestinationPanel.class, "directoryBrowseButton.Name")); // NOI18N

        nameLabel.setLabelFor(nameField);
        org.openide.awt.Mnemonics.setLocalizedText(nameLabel, org.openide.util.NbBundle.getMessage(CloneDestinationPanel.class, "nameLabel.Name")); // NOI18N

        scanForProjectsCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(scanForProjectsCheckBox, org.openide.util.NbBundle.getMessage(CloneDestinationPanel.class, "CTL_Scan_After_Clone")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(CloneDestinationPanel.class, "directoryTitleLabel.Name")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(CloneDestinationPanel.class, "CloneDestinationPanel.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(CloneDestinationPanel.class, "CloneDestinationPanel.jLabel3.text")); // NOI18N

        remoteTextField.setText(GitUtils.REMOTE_ORIGIN);
        remoteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remoteTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout destinationDirectoryPanelLayout = new javax.swing.GroupLayout(destinationDirectoryPanel);
        destinationDirectoryPanel.setLayout(destinationDirectoryPanelLayout);
        destinationDirectoryPanelLayout.setHorizontalGroup(
            destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(destinationDirectoryPanelLayout.createSequentialGroup()
                    .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(directoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameField)
                        .addComponent(directoryField))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(directoryBrowseButton)))
            .addGroup(destinationDirectoryPanelLayout.createSequentialGroup()
                .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scanForProjectsCheckBox)
                    .addGroup(destinationDirectoryPanelLayout.createSequentialGroup()
                        .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(remoteTextField)
                            .addComponent(branchesComboBox, 0, 260, Short.MAX_VALUE))))
                .addContainerGap())
        );
        destinationDirectoryPanelLayout.setVerticalGroup(
            destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationDirectoryPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(destinationDirectoryPanelLayout.createSequentialGroup()
                        .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(directoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(directoryBrowseButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(destinationDirectoryPanelLayout.createSequentialGroup()
                        .addComponent(directoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel)
                        .addGap(37, 37, 37)))
                .addGap(5, 5, 5)
                .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(branchesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinationDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remoteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scanForProjectsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scanForProjectsCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(CloneDestinationPanel.class, "ACSD_Scan_After_Clone")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(destinationDirectoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(destinationDirectoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void directoryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directoryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directoryFieldActionPerformed

    private void remoteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remoteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remoteTextFieldActionPerformed
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == directoryBrowseButton) {
            onBrowseClick();
        } else if (evt.getSource() == scanForProjectsCheckBox) {
            GitModuleConfig.getDefault().setShowCloneCompleted(scanForProjectsCheckBox.isSelected());
        }
    }

    private void onBrowseClick() {
        VCSFileProxy oldFile = defaultWorkingDirectory();
        JFileChooser fileChooser = VCSFileProxySupport.createFileChooser(oldFile);
        fileChooser.setDialogTitle(NbBundle.getMessage(CloneDestinationPanel.class, "Browse_title"));                                            // NO I18N
        fileChooser.setMultiSelectionEnabled(false);
        FileFilter[] old = fileChooser.getChoosableFileFilters();
        for (int i = 0; i < old.length; i++) {
            FileFilter fileFilter = old[i];
            fileChooser.removeChoosableFileFilter(fileFilter);
        }
        fileChooser.addChoosableFileFilter(new FileFilter() {
            public boolean accept(File f) {
                return f.isDirectory();
            }
            @Override
            public String getDescription() {
                return NbBundle.getMessage(CloneDestinationPanel.class, "Folders"); // NOI18N
            }
        });
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.showDialog(this, NbBundle.getMessage(CloneDestinationPanel.class, "OK_Button"));                                            // NO I18N
        VCSFileProxy f = VCSFileProxySupport.getSelectedFile(fileChooser);
        if (f != null) {
            directoryField.setText(f.getPath());
        }
    }
    
    /**
     * Returns file to be initally used.
     * <ul>
     * <li>first is takes text in workTextField
     * <li>then recent project folder
     * <li>finally <tt>user.home</tt>
     * <ul>
     */
    private VCSFileProxy defaultWorkingDirectory() {
        VCSFileProxy defaultDir = null;
        String current = directoryField.getText();
        if (current != null && !(current.trim().equals(""))) {  // NOI18N
            VCSFileProxy currentFile = VCSFileProxySupport.getResource(fileSystem, current);
            while (currentFile != null && currentFile.exists() == false) {
                currentFile = currentFile.getParentFile();
            }
            if (currentFile != null) {
                if (currentFile.isFile()) {
                    defaultDir = currentFile.getParentFile();
                } else {
                    defaultDir = currentFile;
                }
            }
        }
        
        if (defaultDir == null) {
            String cloneDir = GitModuleConfig.getDefault().getPreferences().get(CloneDestinationStep.CLONE_TARGET_DIRECTORY, null);
            if (cloneDir != null) {
                defaultDir = VCSFileProxySupport.getResource(fileSystem, cloneDir);               
            }            
        }

        //if (defaultDir == null) {
        //    VCSFileProxy projectFolder = ProjectChooser.getProjectsFolder();
        //    if (projectFolder.exists() && projectFolder.isDirectory()) {
        //        defaultDir = projectFolder;
        //    }
        //}

        if (defaultDir == null) {
            defaultDir = VCSFileProxySupport.getHome(VCSFileProxy.createFileProxy(fileSystem.getRoot()));
        }

        return defaultDir;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    final javax.swing.JComboBox branchesComboBox = new javax.swing.JComboBox();
    private javax.swing.JPanel destinationDirectoryPanel;
    private javax.swing.JButton directoryBrowseButton;
    final javax.swing.JTextField directoryField = new javax.swing.JTextField();
    private javax.swing.JLabel directoryLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    final javax.swing.JTextField nameField = new javax.swing.JTextField();
    private javax.swing.JLabel nameLabel;
    final javax.swing.JTextField remoteTextField = new javax.swing.JTextField();
    final javax.swing.JCheckBox scanForProjectsCheckBox = new javax.swing.JCheckBox();
    // End of variables declaration//GEN-END:variables
    
}
