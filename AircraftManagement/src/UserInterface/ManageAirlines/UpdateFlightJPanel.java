/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class UpdateFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateFlightJPanel
     */
   private JPanel UserProcessContainer;
   private Airliner airliner;
   private Flight flight;     
       

    UpdateFlightJPanel(JPanel UserProcessContainer, Flight flight) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.flight = flight;
        populateFlightDetails();
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
        txtFlightNumber = new javax.swing.JTextField();
        txtFlightFrom = new javax.swing.JTextField();
        txtFlightTo = new javax.swing.JTextField();
        txtFlightDeparture = new javax.swing.JTextField();
        txtFlightArrival = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE FLIGHT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 290, 30));

        txtFlightNumber.setEnabled(false);
        add(txtFlightNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 230, 40));

        txtFlightFrom.setEnabled(false);
        add(txtFlightFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, 40));

        txtFlightTo.setEnabled(false);
        add(txtFlightTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 230, 40));

        txtFlightDeparture.setEnabled(false);
        add(txtFlightDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 230, 40));

        txtFlightArrival.setEnabled(false);
        add(txtFlightArrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 230, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Price Of Seat:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 180, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Departure Date and Time:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 180, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("To:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 180, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("From:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 180, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Flight Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, 30));

        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 230, 50));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 230, 50));

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Arrival Date and Time:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 180, 30));

        txtprice.setEnabled(false);
        add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //String airlinername = txtAirlinerName.getText();
       String flightnumber = txtFlightNumber.getText();
       String flightfrom = txtFlightFrom.getText();
       String flightto = txtFlightTo.getText();
       String flightdeparture = txtFlightDeparture.getText();
       String flightarrival = txtFlightArrival.getText();
       String price = txtprice.getText();
         
       flight.setFlightnumber(flightnumber);
       flight.setFrom(flightfrom);
       flight.setTo(flightto);
       flight.setDeparturetime(flightdeparture);
       flight.setArrivaltime(flightarrival);
       flight.setFlightprice(price);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
            
            JOptionPane.showMessageDialog(null,"Airliner successfully created");
     
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         txtFlightNumber.setEnabled(true);
        txtFlightFrom.setEnabled(true);
        txtFlightTo.setEnabled(true);
        txtFlightDeparture.setEnabled(true);
        txtFlightArrival.setEnabled(true);
        txtprice.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       UserProcessContainer .remove(this);
       Component[] componentArray = UserProcessContainer.getComponents();
       Component component = componentArray[componentArray.length-1];
       ViewFlightJPanel viewflightjpanel = (ViewFlightJPanel) component;
       viewflightjpanel.populateTable1();
       CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
       layout.previous(UserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtFlightArrival;
    private javax.swing.JTextField txtFlightDeparture;
    private javax.swing.JTextField txtFlightFrom;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtFlightTo;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables

    private void populateFlightDetails()
    {   
      txtFlightNumber.setText(flight.getFlightnumber());
      txtFlightFrom.setText(flight.getFrom());
      txtFlightTo.setText(flight.getTo());
      txtFlightDeparture.setText(flight.getDeparturetime());
      txtFlightArrival.setText(flight.getArrivaltime());
      txtprice.setText(flight.getFlightprice());
    }
}
