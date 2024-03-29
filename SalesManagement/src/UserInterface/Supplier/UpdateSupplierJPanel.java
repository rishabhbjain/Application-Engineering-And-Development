/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Supplier;

import Business.SupplierDirectory;
import Business.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class UpdateSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateSupplier
     */
    private JPanel userProcessContainer;
    private Supplier supplier;
    UpdateSupplierJPanel(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        displayinfo();
    }
    
     public void displayinfo() {
         txtSupplierName.setText(supplier.getSupplierName());
         txtSupplierID.setText(String.valueOf(supplier.getSupplierID()));
         txtContactNumber.setText(String.valueOf(supplier.getContactNo()));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        txtSupplierID = new javax.swing.JTextField();
        btnUpdateSupplier = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Update Supplier");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Supplier Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Supplier ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 100, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Contact Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));
        add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 170, -1));
        add(txtSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 170, -1));
        add(txtSupplierID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 170, -1));

        btnUpdateSupplier.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnUpdateSupplier.setText("Update");
        btnUpdateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSupplierActionPerformed(evt);
            }
        });
        add(btnUpdateSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageSuppliersJPanel msp = (ManageSuppliersJPanel) component;
        msp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSupplierActionPerformed
        // TODO add your handling code here:
        if(txtSupplierName.getText().equals("") || txtSupplierID.getText().equals("") || txtContactNumber.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please input all the content");
        }else{
            String supplierName = txtSupplierName.getText();
            int supplierID = Integer.parseInt(txtSupplierID.getText());
            int contactNumber = Integer.parseInt(txtContactNumber.getText());
            supplier.setSupplierName(supplierName);
            supplier.setSupplierID(supplierID);
            supplier.setContactNo(contactNumber);

            JOptionPane.showMessageDialog(null,"Updated successufully");
        }
    }//GEN-LAST:event_btnUpdateSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtSupplierID;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables
}
