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

package org.netbeans.modules.cnd.editor.fortran.options;

import javax.swing.JPanel;
import org.netbeans.modules.options.editor.spi.PreferencesCustomizer;

/**
 *
 */
public class FmtTabsIndents extends JPanel {
    public static final String PROP_FREE_FORMAT_FORTRAN = "freeFormatFortran"; // NOI18N

    /** Creates new form FmtTabsIndents */
    public FmtTabsIndents() {
        initComponents();
        freeFormatCheckBox.putClientProperty(FmtOptions.CategorySupport.OPTION_ID, FmtOptions.freeFormat);
        autoDetect.putClientProperty(FmtOptions.CategorySupport.OPTION_ID, FmtOptions.autoDetect);
    }

    public static PreferencesCustomizer.Factory getController() {
        return new FmtOptions.CategorySupport.Factory(PreferencesCustomizer.TABS_AND_INDENTS_ID, FmtTabsIndents.class,
                org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "SAMPLE_Default"), // NOI18N
                new String[] { FmtOptions.rightMargin, "30" }  // NOI18N
                );
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        freeFormatCheckBox = new javax.swing.JCheckBox();
        autoDetect = new javax.swing.JCheckBox();

        setName(null);
        setOpaque(false);

        org.openide.awt.Mnemonics.setLocalizedText(freeFormatCheckBox, org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_Free_Format")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(autoDetect, org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_AUTO_DETECT")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(autoDetect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(freeFormatCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(freeFormatCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autoDetect))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autoDetect;
    private javax.swing.JCheckBox freeFormatCheckBox;
    // End of variables declaration//GEN-END:variables
    
}