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

package org.netbeans.modules.cnd.makeproject.ui.runprofiles;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditorSupport;
import javax.swing.JFileChooser;
import org.netbeans.modules.cnd.api.remote.ui.RemoteFileChooserUtil;
import org.openide.explorer.propertysheet.PropertyEnv;
import org.openide.filesystems.FileSystem;
import org.openide.util.NbBundle;

/**
 *
 */
/*package*/final class DirectoryChooserPanel extends javax.swing.JPanel implements PropertyChangeListener {
    private final PropertyEditorSupport editor;
    private final String seed;
    private final FileSystem fileSystem;

    /** Creates new form DirectoryChooserPanel */
    public DirectoryChooserPanel(String seed, PropertyEditorSupport editor, PropertyEnv propenv, FileSystem fileSystem) {
        initComponents();
        
        this.seed = seed;
        this.editor = editor;
        this.fileSystem = fileSystem;
        directoryTextField.setText(seed);

        propenv.setState(PropertyEnv.STATE_NEEDS_VALIDATION);
        propenv.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (PropertyEnv.PROP_STATE.equals(evt.getPropertyName()) && evt.getNewValue() == PropertyEnv.STATE_VALID) {
            editor.setValue(directoryTextField.getText());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        directoryLabel = new javax.swing.JLabel();
        directoryTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        directoryLabel.setLabelFor(directoryTextField);
        org.openide.awt.Mnemonics.setLocalizedText(directoryLabel, org.openide.util.NbBundle.getMessage(DirectoryChooserPanel.class, "DirectoryChooserPanel.directoryLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 0);
        add(directoryLabel, gridBagConstraints);

        directoryTextField.setColumns(60);
        directoryTextField.setText(org.openide.util.NbBundle.getMessage(DirectoryChooserPanel.class, "DirectoryChooserPanel.directoryTextField.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 4, 8, 0);
        add(directoryTextField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(DirectoryChooserPanel.class, "DirectoryChooserPanel.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 4, 8, 8);
        add(browseButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed

	    JFileChooser fileChooser = RemoteFileChooserUtil.createFileChooser(
                    fileSystem, getString("Run_Directory"), getString("SelectLabel"), JFileChooser.DIRECTORIES_ONLY, null, seed, true);
	    int ret = fileChooser.showOpenDialog(this);
	    if (ret == JFileChooser.CANCEL_OPTION) {
                return;
            }
	    String dirPath = fileChooser.getSelectedFile().getPath();
            directoryTextField.setText(dirPath);
}//GEN-LAST:event_browseButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel directoryLabel;
    private javax.swing.JTextField directoryTextField;
    // End of variables declaration//GEN-END:variables

    private static String getString(String key) {
        return NbBundle.getMessage(DirectoryChooserPanel.class, key);
    }
}