/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.Airliner;
import Business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rishabhjain
 */
public class ViewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightJPanel
     */
    private JPanel UserProcessContainer;
    private Airliner airliner;
    
    
    ViewFlightJPanel(JPanel UserProcessContainer, Airliner airliner) {
       initComponents();
       this.UserProcessContainer = UserProcessContainer;
       this.airliner = airliner;
       
       
       txtAirlinerName.setText(airliner.getAirlinername());
      populateTable1();
    }
    public void populateTable1() {
        DefaultTableModel dtm = (DefaultTableModel)tblViewFlight.getModel();
        dtm.setRowCount(0);
        for(Flight flight:airliner.getFlightList()) {
            Object[] row = new Object[7];
            row[0]=airliner.getAirlinername();
            row[1]=flight;
            row[2]=flight.getFrom();
            row[3]=flight.getTo();
            row[4]=flight.getDeparturetime();
            row[5]=flight.getArrivaltime();
            row[6]=flight.getFlightprice();
            dtm.addRow(row);
        
        }
            
        
        
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
        jLabel3 = new javax.swing.JLabel();
        txtAirlinerName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewFlight = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW FLIGHT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 290, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Airliner Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, 30));

        txtAirlinerName.setEditable(false);
        txtAirlinerName.setEnabled(false);
        add(txtAirlinerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 230, 40));

        tblViewFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Airliner", "Flight Number", "From", "To", "Departure ", "Arrival ", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewFlight);
        if (tblViewFlight.getColumnModel().getColumnCount() > 0) {
            tblViewFlight.getColumnModel().getColumn(1).setResizable(false);
            tblViewFlight.getColumnModel().getColumn(2).setResizable(false);
            tblViewFlight.getColumnModel().getColumn(3).setResizable(false);
            tblViewFlight.getColumnModel().getColumn(4).setResizable(false);
            tblViewFlight.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 210));

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 180, 50));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 180, 50));

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
            int selectedRow = tblViewFlight.getSelectedRow();
        if(selectedRow  >= 0) {
           int dialogButton = JOptionPane.YES_NO_OPTION;
           int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the airliner details ?","Warning",dialogButton);
           if(dialogResult == JOptionPane.YES_OPTION) {
               Flight f = (Flight) tblViewFlight.getValueAt(selectedRow,1);
               airliner.deleteFlight(f);
               populateTable1();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblViewFlight.getSelectedRow();
         if(selectedRow<0) {
                  JOptionPane.showMessageDialog(null, "Please select a row from table first to view details","Warning",JOptionPane.WARNING_MESSAGE);

         }
         else {
           Flight flight = (Flight)tblViewFlight.getValueAt(selectedRow,1);
           UpdateFlightJPanel panel = new UpdateFlightJPanel(UserProcessContainer,flight);
           UserProcessContainer.add("UpdateFlightJPanel",panel);
           CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
           layout.next(UserProcessContainer);
         }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewFlight;
    private javax.swing.JTextField txtAirlinerName;
    // End of variables declaration//GEN-END:variables
}