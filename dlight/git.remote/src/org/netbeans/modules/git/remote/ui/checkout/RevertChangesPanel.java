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

/*
 * RevertChangesPanel.java
 *
 * Created on Nov 10, 2010, 3:15:36 PM
 */

package org.netbeans.modules.git.remote.ui.checkout;

/**
 *
 */
public class RevertChangesPanel extends javax.swing.JPanel {

    /** Creates new form RevertChangesPanel */
    public RevertChangesPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        revertbButtonGroup = new javax.swing.ButtonGroup();
        workingTreeGroup = new javax.swing.ButtonGroup();

        org.openide.awt.Mnemonics.setLocalizedText(removeAllNewCheckBox, org.openide.util.NbBundle.getMessage(RevertChangesPanel.class, "RevertChangesPanel.removeAllNewCheckBox.text")); // NOI18N

        revertbButtonGroup.add(revertWTRadioButton);
        org.openide.awt.Mnemonics.setLocalizedText(revertWTRadioButton, org.openide.util.NbBundle.getMessage(RevertChangesPanel.class, "RevertChangesPanel.revertWTRadioButton.text")); // NOI18N
        revertWTRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revertWTRadioButtonActionPerformed(evt);
            }
        });

        revertbButtonGroup.add(revertIndexRadioButton);
        org.openide.awt.Mnemonics.setLocalizedText(revertIndexRadioButton, org.openide.util.NbBundle.getMessage(RevertChangesPanel.class, "RevertChangesPanel.revertIndexRadioButton.text")); // NOI18N
        revertIndexRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revertIndexRadioButtonActionPerformed(evt);
            }
        });

        revertbButtonGroup.add(revertAllRadioButton);
        org.openide.awt.Mnemonics.setLocalizedText(revertAllRadioButton, org.openide.util.NbBundle.getMessage(RevertChangesPanel.class, "RevertChangesPanel.revertAllRadioButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(removeWTNewCheckBox, org.openide.util.NbBundle.getMessage(RevertChangesPanel.class, "RevertChangesPanel.removeWTNewCheckBox.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(revertAllRadioButton)
                    .addComponent(revertWTRadioButton)
                    .addComponent(revertIndexRadioButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeWTNewCheckBox)
                            .addComponent(removeAllNewCheckBox))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(revertAllRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeAllNewCheckBox)
                .addGap(18, 18, 18)
                .addComponent(revertWTRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeWTNewCheckBox)
                .addGap(18, 18, 18)
                .addComponent(revertIndexRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void revertIndexRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revertIndexRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_revertIndexRadioButtonActionPerformed

    private void revertWTRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revertWTRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_revertWTRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    final javax.swing.JCheckBox removeAllNewCheckBox = new javax.swing.JCheckBox();
    final javax.swing.JCheckBox removeWTNewCheckBox = new javax.swing.JCheckBox();
    final javax.swing.JRadioButton revertAllRadioButton = new javax.swing.JRadioButton();
    final javax.swing.JRadioButton revertIndexRadioButton = new javax.swing.JRadioButton();
    final javax.swing.JRadioButton revertWTRadioButton = new javax.swing.JRadioButton();
    private javax.swing.ButtonGroup revertbButtonGroup;
    private javax.swing.ButtonGroup workingTreeGroup;
    // End of variables declaration//GEN-END:variables

}