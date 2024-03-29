/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Administrator;

import Business.Market;
import UserInterface.Supplier.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class UpdateCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateSupplier
     */
    private JPanel userProcessContainer;
    private Market market;
    UpdateCustomerJPanel(JPanel userProcessContainer, Market market) {
     initComponents();
     this.userProcessContainer = userProcessContainer;
     this.market = market;
      displayinfo();
    }
     public void displayinfo() {
        txtCustomerName.setText(market.getCustomer().getCustomerName());
        txtCustomerID.setText(String.valueOf(market.getCustomer().getCustomerId()));
        txtCustomerEmail.setText(market.getCustomer().getEmailAddress());
        txtCustomerMarketType.setText(market.getMarketType());
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
        txtCustomerEmail = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerID = new javax.swing.JTextField();
        btnUpdateCustomer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCustomerMarketType = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Update Customer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Customer Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Customer ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 100, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Email:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));
        add(txtCustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 170, -1));
        add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 170, -1));

        txtCustomerID.setEditable(false);
        txtCustomerID.setEnabled(false);
        add(txtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 170, -1));

        btnUpdateCustomer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnUpdateCustomer.setText("Update");
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });
        add(btnUpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Market Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));
        add(txtCustomerMarketType, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
           userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        CustomerJPanel cjp = (CustomerJPanel) component;
        cjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        // TODO add your handling code here:
         if(txtCustomerID.getText().equals("") || txtCustomerName.getText().equals("") || txtCustomerEmail.getText().equals("")|| txtCustomerMarketType.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please input all the content");
        }else{
             int customerid = Integer.parseInt(txtCustomerID.getText());
             String customername = txtCustomerName.getText();
             String customeremail = txtCustomerEmail.getText();
             String customermarkettype = txtCustomerMarketType.getText();
            
            market.getCustomer().setCustomerId(customerid);
            market.getCustomer().setCustomerName(customername);
            market.getCustomer().setEmailAddress(customeremail);
            market.setMarketType(customermarkettype);

            JOptionPane.showMessageDialog(null,"Updated successufully");
        }
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtCustomerMarketType;
    private javax.swing.JTextField txtCustomerName;
    // End of variables declaration//GEN-END:variables
}
