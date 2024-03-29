/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Provider;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class ProviderAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProviderAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Enterprise enterprise;

    public ProviderAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageProviderJButton = new javax.swing.JButton();
        manageProviderAdminJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Provider Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 46, -1, -1));

        manageProviderJButton.setText("Manage Provider");
        manageProviderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProviderJButtonActionPerformed(evt);
            }
        });
        add(manageProviderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 147, 192, -1));

        manageProviderAdminJButton.setText("Manage Provider Admin");
        manageProviderAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProviderAdminJButtonActionPerformed(evt);
            }
        });
        add(manageProviderAdminJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 221, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageProviderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProviderJButtonActionPerformed
        // TODO add your handling code here:
        ManageProviderJPanel manageProviderJPanel = new ManageProviderJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("manageEnterpriseJPanel", manageProviderJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProviderJButtonActionPerformed

    private void manageProviderAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProviderAdminJButtonActionPerformed
        // TODO add your handling code here:
        ManageProviderAdminJPanel manageProviderAdminJPanel = new ManageProviderAdminJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("manageEnterpriseJPanel", manageProviderAdminJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProviderAdminJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageProviderAdminJButton;
    private javax.swing.JButton manageProviderJButton;
    // End of variables declaration//GEN-END:variables
}
