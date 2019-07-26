/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class ViewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirlinerJPanel
     */
  
    private JPanel UserProcessContainer;
    //private AirlinerDirectory airlinerdirectory;
    private Airliner airliner;
    

    ViewAirlinerJPanel(JPanel UserProcessContainer, Airliner airliner) {
         initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.airliner = airliner;
        populateAirlinerDetails();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
       
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
        txtAirlinerAddress = new javax.swing.JTextField();
        txtNoofAircrafts = new javax.swing.JTextField();
        txtAirlinerName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Airliner");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 290, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Number of Aircrafts:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 180, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Airliner Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 180, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Airliner Address:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));

        txtAirlinerAddress.setEnabled(false);
        add(txtAirlinerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 230, 40));

        txtNoofAircrafts.setEnabled(false);
        add(txtNoofAircrafts, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 230, 40));

        txtAirlinerName.setEnabled(false);
        add(txtAirlinerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 230, 40));

        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 180, 50));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 180, 50));

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtAirlinerName.setEnabled(true);
        txtAirlinerAddress.setEnabled(true);
        txtNoofAircrafts.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UserProcessContainer .remove(this);
        Component[] componentArray = UserProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        MngAirlinerWorkArea manageairlinerworkarea = (MngAirlinerWorkArea) component;
        manageairlinerworkarea.populateTable();
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String airlinername = txtAirlinerName.getText();
        String airlineraddress = txtAirlinerAddress.getText();
        String airlinernoofaircrafts = txtNoofAircrafts.getText();
         
        airliner.setAirlinername(airlinername);
        airliner.setAirlineraddress(airlineraddress);
        airliner.setNoofairlines(airlinernoofaircrafts);
         
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
            
            JOptionPane.showMessageDialog(null,"Airliner successfully created");
     
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAirlinerAddress;
    private javax.swing.JTextField txtAirlinerName;
    private javax.swing.JTextField txtNoofAircrafts;
    // End of variables declaration//GEN-END:variables

public void populateAirlinerDetails()
{   
    txtAirlinerName.setText(airliner.getAirlinername());
    txtAirlinerAddress.setText(airliner.getAirlineraddress());
    txtNoofAircrafts.setText(airliner.getNoofairlines());
}
}