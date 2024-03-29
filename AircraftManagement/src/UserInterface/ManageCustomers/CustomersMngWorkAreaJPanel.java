/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.TravelAgency;
import UserInterface.ManageAirlines.CreateAirlinerJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class CustomersMngWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomer
     */
    private JPanel UserProcessContainer;
    private TravelAgency travelagency;
    public CustomersMngWorkAreaJPanel(JPanel UserProcessContainer, TravelAgency travelagency) {
        initComponents();
        this.UserProcessContainer=UserProcessContainer;
        this.travelagency=travelagency;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchFlights = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearchFlights.setText("Search for Flights");
        btnSearchFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFlightsActionPerformed(evt);
            }
        });
        add(btnSearchFlights, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 430, 60));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE CUSTOMER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFlightsActionPerformed
        // TODO add your handling code here:
         ManageJPanel panel = new ManageJPanel(UserProcessContainer,travelagency);
        UserProcessContainer.add("ManageJPanel",panel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer); 
    }//GEN-LAST:event_btnSearchFlightsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchFlights;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
