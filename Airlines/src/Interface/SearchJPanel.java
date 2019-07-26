/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Catalog.Airline;
import Catalog.AirlineHistory;
import Catalog.History;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rishabhjain
 */
public class SearchJPanel extends javax.swing.JPanel {
private AirlineHistory ah;
private History ah1;
/*rivate ArrayList<Airline> temp =new ArrayList<Airline>();*/
   public SearchJPanel(AirlineHistory ah,History ah1) {
          initComponents();
          this.ah=ah;
          this.ah1=ah1;
        populateTable();
 
   }
  
 //public void populateTable(ArrayList <Airline> temp)
 public void populateTable()        
    {
           DefaultTableModel dtm =(DefaultTableModel) tblAirline.getModel();
           dtm.setRowCount(0);  
           for(Airline a :ah1.getHistory())
           {
               
               Object row[] = new Object[13];
               row[0]=a;
               row[1]=a.getDate();
               row[2]=a.getTime();
               row[3]=a.getMadeBy();
               row[4]=a.getManYr();
               row[5]=a.getModelNo();
               row[6]=a.getSeats();
               row[7]=a.getMainCerti();
               row[8]=a.getFrom();
               row[9]=a.getTo();
               row[10]=a.getDuration();
               row[11]=a.getAvail();
               row[12]=a.getAirline();
               dtm.addRow(row);          
           }     
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMadeby = new javax.swing.JLabel();
        btnMadeby = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirline = new javax.swing.JTable();
        lblAvailableseats = new javax.swing.JLabel();
        btnAvailseats = new javax.swing.JButton();
        txtMadeby = new javax.swing.JTextField();
        lblFirstAvailable = new javax.swing.JLabel();
        btnFirstavailable = new javax.swing.JButton();
        lblCurrentlyAvailable = new javax.swing.JLabel();
        btnCurrentlyAvailable = new javax.swing.JButton();
        lblManufacture = new javax.swing.JLabel();
        btnManufactureYear = new javax.swing.JButton();
        txtManufactureYear = new javax.swing.JTextField();
        txtminSeats = new javax.swing.JTextField();
        txtmaxSeats = new javax.swing.JTextField();
        lblSerialNumber = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        btnSerialNumber = new javax.swing.JButton();
        lblModelNumber = new javax.swing.JLabel();
        btnModelNumber = new javax.swing.JButton();
        txtModelNumber = new javax.swing.JTextField();
        lblAiport = new javax.swing.JLabel();
        txtAirport = new javax.swing.JTextField();
        btnAirport = new javax.swing.JButton();
        lblManufactureCertificate = new javax.swing.JLabel();
        txtManufactureCertificate = new javax.swing.JTextField();
        btnManufactureCertificate = new javax.swing.JButton();
        lblmin = new javax.swing.JLabel();
        lblmax = new javax.swing.JLabel();
        lblUsedby = new javax.swing.JLabel();
        txtManufactureUsedby = new javax.swing.JTextField();
        btnManufactureUsedby = new javax.swing.JButton();
        lblUpdateTime = new javax.swing.JLabel();
        btnUpdateTime = new javax.swing.JButton();
        txtUpdateTime = new javax.swing.JTextField();
        From1 = new javax.swing.JTextField();
        To1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        lblMadeby.setText("Made by ");

        btnMadeby.setText("Madeby");
        btnMadeby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMadebyActionPerformed(evt);
            }
        });

        tblAirline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "Date", "Time", "MadeBy", "Manu Year", "Model No", "Seats", "MainCerti", "From", "To", "Duration", "Availability", "Airline"
            }
        ));
        jScrollPane1.setViewportView(tblAirline);

        lblAvailableseats.setText("Availablity based on min and max  Seats");

        btnAvailseats.setText("Available Seats");
        btnAvailseats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailseatsActionPerformed(evt);
            }
        });

        lblFirstAvailable.setText("First Available Airplane");

        btnFirstavailable.setText("First Available");
        btnFirstavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstavailableActionPerformed(evt);
            }
        });

        lblCurrentlyAvailable.setText("Currently Available Airplane");

        btnCurrentlyAvailable.setText("Currently Available");
        btnCurrentlyAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentlyAvailableActionPerformed(evt);
            }
        });

        lblManufacture.setText("Manufactured in ");

        btnManufactureYear.setText("Year");
        btnManufactureYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufactureYearActionPerformed(evt);
            }
        });

        lblSerialNumber.setText("Serial Number");

        btnSerialNumber.setText("Serial Number");
        btnSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNumberActionPerformed(evt);
            }
        });

        lblModelNumber.setText("Model Number");

        btnModelNumber.setText("Model Number");
        btnModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNumberActionPerformed(evt);
            }
        });

        lblAiport.setText("Available at Airport");

        btnAirport.setText("Airport");
        btnAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirportActionPerformed(evt);
            }
        });

        lblManufactureCertificate.setText("Maintenance Certificate");

        btnManufactureCertificate.setText("Expired");
        btnManufactureCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufactureCertificateActionPerformed(evt);
            }
        });

        lblmin.setText("MIN");

        lblmax.setText("MAX");

        lblUsedby.setText("Airplane Manufacturers Usedby");

        btnManufactureUsedby.setText("Manufacturer");
        btnManufactureUsedby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufactureUsedbyActionPerformed(evt);
            }
        });

        lblUpdateTime.setText("Time Flet Calalog was Updated");

        btnUpdateTime.setText("Show");
        btnUpdateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTimeActionPerformed(evt);
            }
        });

        txtUpdateTime.setEditable(false);

        jLabel1.setText("FROM");

        jLabel2.setText("TO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblManufactureCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblManufacture, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAvailableseats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblUsedby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblUpdateTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtminSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblmax)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtmaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAvailseats, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtMadeby, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtManufactureCertificate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(txtAirport, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtModelNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtManufactureUsedby, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(txtUpdateTime, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnManufactureCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(btnAirport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnManufactureUsedby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnUpdateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(To1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnManufactureYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCurrentlyAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnFirstavailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnMadeby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblAiport, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFirstAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(From1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCurrentlyAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMadeby, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(425, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstAvailable)
                    .addComponent(btnFirstavailable)
                    .addComponent(From1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(To1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentlyAvailable)
                    .addComponent(btnCurrentlyAvailable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMadeby)
                    .addComponent(txtMadeby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMadeby))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblManufacture)
                        .addComponent(btnManufactureYear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailableseats)
                    .addComponent(btnAvailseats)
                    .addComponent(txtmaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmin)
                    .addComponent(txtminSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmax))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerialNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModelNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAiport)
                    .addComponent(txtAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAirport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManufactureCertificate)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManufactureCertificate)
                            .addComponent(txtManufactureCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManufactureUsedby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsedby)
                            .addComponent(btnManufactureUsedby))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateTime)
                    .addComponent(btnUpdateTime)
                    .addComponent(txtUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMadebyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMadebyActionPerformed
        // TODO add your handling code here:
       String Maker = txtMadeby.getText();
       DefaultTableModel dtm1 =(DefaultTableModel) tblAirline.getModel();
       dtm1.setRowCount(0); 
        for(int i=0;i<ah1.getHistory().size();i++)
             {
             if((ah.getAirlineHistory().get(i).getMadeBy().equals(Maker)))
             {
                Airline a = ah.addAirline();
               Object row[]= new Object[13];
               row[0]=ah.getAirlineHistory().get(i).getSrNo();
               row[1]=ah.getAirlineHistory().get(i).getDate();
               row[2]=ah.getAirlineHistory().get(i).getTime();
               row[3]=ah.getAirlineHistory().get(i).getMadeBy();
               row[4]=ah.getAirlineHistory().get(i).getManYr();
               row[5]=ah.getAirlineHistory().get(i).getModelNo();
               row[6]=ah.getAirlineHistory().get(i).getSeats();
               row[7]=ah.getAirlineHistory().get(i).getMainCerti();
               row[8]=ah.getAirlineHistory().get(i).getFrom();
               row[9]=ah.getAirlineHistory().get(i).getTo();
               row[10]=ah.getAirlineHistory().get(i).getDuration();
               row[11]=ah.getAirlineHistory().get(i).getAvail();
               row[12]=ah.getAirlineHistory().get(i).getAirline();
               dtm1.addRow(row);
               txtMadeby.setText("");
             }    
             } 
        
    }//GEN-LAST:event_btnMadebyActionPerformed

    private void btnAvailseatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailseatsActionPerformed
  
         int min=Integer.parseInt(txtminSeats.getText());
         int max=Integer.parseInt(txtmaxSeats.getText());
          DefaultTableModel dtm =(DefaultTableModel) tblAirline.getModel();
          dtm.setRowCount(0); 
             for(int i=0;i<ah1.getHistory().size();i++)
             {
     
             if(((ah.getAirlineHistory().get(i).getAvail()>min) && (ah.getAirlineHistory().get(i).getAvail()<max)) == true )
             {
                Airline a = ah.addAirline();
                Object row[]= new Object[13];
                row[0]=ah.getAirlineHistory().get(i).getSrNo();
                row[1]=ah.getAirlineHistory().get(i).getDate();
                row[2]=ah.getAirlineHistory().get(i).getTime();
                row[3]=ah.getAirlineHistory().get(i).getMadeBy();
                row[4]=ah.getAirlineHistory().get(i).getManYr();
                row[5]=ah.getAirlineHistory().get(i).getModelNo();
                row[6]=ah.getAirlineHistory().get(i).getSeats();
                row[7]=ah.getAirlineHistory().get(i).getMainCerti();
                row[8]=ah.getAirlineHistory().get(i).getFrom();
                row[9]=ah.getAirlineHistory().get(i).getTo();
                row[10]=ah.getAirlineHistory().get(i).getDuration();
                row[11]=ah.getAirlineHistory().get(i).getAvail();
                row[12]=ah.getAirlineHistory().get(i).getAirline();
                dtm.addRow(row);
               txtminSeats.setText("");
               txtmaxSeats.setText("");
         
             }
             } 
// TODO add your handling code here:
    }//GEN-LAST:event_btnAvailseatsActionPerformed

    private void btnFirstavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstavailableActionPerformed
        // TODO add your handling code here: 
        String from1 =From1.getText();
        String to1 = To1.getText();
        String b = null;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));
        b = df.format(dateobj);
        System.out.println(b);
      DefaultTableModel dtm =(DefaultTableModel) tblAirline.getModel();
       dtm.setRowCount(0); 
        for(int i=0;i<ah1.getHistory().size();i++)
             {
               if((ah.getAirlineHistory().get(i).getFrom().compareTo(from1))==0 )
               {
               if((ah.getAirlineHistory().get(i).getTo().compareTo(to1)) == 0)    
               
               {     
                 
                 
            if((ah.getAirlineHistory().get(i).getDate().compareTo(b)) >= 0)
                 {
                Airline a = ah.addAirline();
               Object row[]= new Object[13];
               row[0]=ah.getAirlineHistory().get(i).getSrNo();
               row[1]=ah.getAirlineHistory().get(i).getDate();
               row[2]=ah.getAirlineHistory().get(i).getTime();
               row[3]=ah.getAirlineHistory().get(i).getMadeBy();
               row[4]=ah.getAirlineHistory().get(i).getManYr();
               row[5]=ah.getAirlineHistory().get(i).getModelNo();
               row[6]=ah.getAirlineHistory().get(i).getSeats();
               row[7]=ah.getAirlineHistory().get(i).getMainCerti();
               row[8]=ah.getAirlineHistory().get(i).getFrom();
               row[9]=ah.getAirlineHistory().get(i).getTo();
               row[10]=ah.getAirlineHistory().get(i).getDuration();
               row[11]=ah.getAirlineHistory().get(i).getAvail();
               row[12]=ah.getAirlineHistory().get(i).getAirline();
               dtm.addRow(row);
               break;
             }
                 }
             }
             }
              

    }//GEN-LAST:event_btnFirstavailableActionPerformed

    private void btnCurrentlyAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentlyAvailableActionPerformed
        // TODO add your handling code here:
        String b = null;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));
        b = df.format(dateobj);
        System.out.println(b);
      DefaultTableModel dtm =(DefaultTableModel) tblAirline.getModel();
       dtm.setRowCount(0); 
        for(int i=0;i<ah1.getHistory().size();i++)
             {
            if((ah.getAirlineHistory().get(i).getDate().compareTo(b)) >= 0)
                 {
                Airline a = ah.addAirline();
               Object row[]= new Object[13];
               row[0]=ah.getAirlineHistory().get(i).getSrNo();
               row[1]=ah.getAirlineHistory().get(i).getDate();
               row[2]=ah.getAirlineHistory().get(i).getTime();
               row[3]=ah.getAirlineHistory().get(i).getMadeBy();
               row[4]=ah.getAirlineHistory().get(i).getManYr();
               row[5]=ah.getAirlineHistory().get(i).getModelNo();
               row[6]=ah.getAirlineHistory().get(i).getSeats();
               row[7]=ah.getAirlineHistory().get(i).getMainCerti();
               row[8]=ah.getAirlineHistory().get(i).getFrom();
               row[9]=ah.getAirlineHistory().get(i).getTo();
               row[10]=ah.getAirlineHistory().get(i).getDuration();
               row[11]=ah.getAirlineHistory().get(i).getAvail();
               row[12]=ah.getAirlineHistory().get(i).getAirline();
               dtm.addRow(row);
          
               
             }

             } 

    }//GEN-LAST:event_btnCurrentlyAvailableActionPerformed

    private void btnManufactureYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufactureYearActionPerformed
        // TODO add your handling code here:
       int ManuYear = Integer.parseInt(txtManufactureYear.getText());
       DefaultTableModel dtm = (DefaultTableModel) tblAirline.getModel();
       dtm.setRowCount(0);
        for(int i=0;i<ah1.getHistory().size();i++)
             {
     
             if((ah.getAirlineHistory().get(i).getManYr() == ManuYear))
             {
                System.out.println("hi");
                Airline a = ah.addAirline();
               Object row[]= new Object[13];
               row[0]=ah.getAirlineHistory().get(i).getSrNo();
               row[1]=ah.getAirlineHistory().get(i).getDate();
               row[2]=ah.getAirlineHistory().get(i).getTime();
               row[3]=ah.getAirlineHistory().get(i).getMadeBy();
               row[4]=ah.getAirlineHistory().get(i).getManYr();
               row[5]=ah.getAirlineHistory().get(i).getModelNo();
               row[6]=ah.getAirlineHistory().get(i).getSeats();
               row[7]=ah.getAirlineHistory().get(i).getMainCerti();
               row[8]=ah.getAirlineHistory().get(i).getFrom();
               row[9]=ah.getAirlineHistory().get(i).getTo();
               row[10]=ah.getAirlineHistory().get(i).getDuration();
               row[11]=ah.getAirlineHistory().get(i).getAvail();
               row[12]=ah.getAirlineHistory().get(i).getAirline();
               dtm.addRow(row);
               txtManufactureYear.setText("");
             }    
             }      
    }//GEN-LAST:event_btnManufactureYearActionPerformed

    private void btnSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialNumberActionPerformed
        // TODO add your handling code here:
         String Serial = txtSerialNumber.getText();
         DefaultTableModel dtm = (DefaultTableModel) tblAirline.getModel();
         dtm.setRowCount(0);
        for(int i=0;i<ah1.getHistory().size();i++)
             {
     
             if((ah.getAirlineHistory().get(i).getSrNo().equals(Serial)))
             {
               Airline a = ah.addAirline();
               Object row[]= new Object[13];
               row[0]=ah.getAirlineHistory().get(i).getSrNo();
               row[1]=ah.getAirlineHistory().get(i).getDate();
               row[2]=ah.getAirlineHistory().get(i).getTime();
               row[3]=ah.getAirlineHistory().get(i).getMadeBy();
               row[4]=ah.getAirlineHistory().get(i).getManYr();
               row[5]=ah.getAirlineHistory().get(i).getModelNo();
               row[6]=ah.getAirlineHistory().get(i).getSeats();
               row[7]=ah.getAirlineHistory().get(i).getMainCerti();
               row[8]=ah.getAirlineHistory().get(i).getFrom();
               row[9]=ah.getAirlineHistory().get(i).getTo();
               row[10]=ah.getAirlineHistory().get(i).getDuration();
               row[11]=ah.getAirlineHistory().get(i).getAvail();
               row[12]=ah.getAirlineHistory().get(i).getAirline();
               dtm.addRow(row);
               txtSerialNumber.setText("");
             }    
             } 
  
    }//GEN-LAST:event_btnSerialNumberActionPerformed

    private void btnModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNumberActionPerformed
        // TODO add your handling code here:
         int Model = Integer.parseInt(txtModelNumber.getText());
         DefaultTableModel dtm = (DefaultTableModel) tblAirline.getModel();
         dtm.setRowCount(0);
        for(int i=0;i<ah1.getHistory().size();i++)
             {
     
             if(ah.getAirlineHistory().get(i).getModelNo() == Model)
             {
               Airline a = ah.addAirline();
               Object row[]= new Object[13];
               row[0]=ah.getAirlineHistory().get(i).getSrNo();
               row[1]=ah.getAirlineHistory().get(i).getDate();
               row[2]=ah.getAirlineHistory().get(i).getTime();
               row[3]=ah.getAirlineHistory().get(i).getMadeBy();
               row[4]=ah.getAirlineHistory().get(i).getManYr();
               row[5]=ah.getAirlineHistory().get(i).getModelNo();
               row[6]=ah.getAirlineHistory().get(i).getSeats();
               row[7]=ah.getAirlineHistory().get(i).getMainCerti();
               row[8]=ah.getAirlineHistory().get(i).getFrom();
               row[9]=ah.getAirlineHistory().get(i).getTo();
               row[10]=ah.getAirlineHistory().get(i).getDuration();
               row[11]=ah.getAirlineHistory().get(i).getAvail();
               row[12]=ah.getAirlineHistory().get(i).getAirline();
               dtm.addRow(row);
               txtModelNumber.setText("");
             }    
             } 
    
    }//GEN-LAST:event_btnModelNumberActionPerformed

    private void btnAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirportActionPerformed
        // TODO add your handling code here:
        String Airport= txtAirport.getText();
       DefaultTableModel dtm = (DefaultTableModel) tblAirline.getModel();
       dtm.setRowCount(0);
        for(int i=0;i<ah1.getHistory().size();i++)
             {
     
             if(ah.getAirlineHistory().get(i).getFrom().equals(Airport))
             {
               Airline a = ah.addAirline();
               Object row[]= new Object[13];
               row[0]=ah.getAirlineHistory().get(i).getSrNo();
               row[1]=ah.getAirlineHistory().get(i).getDate();
               row[2]=ah.getAirlineHistory().get(i).getTime();
               row[3]=ah.getAirlineHistory().get(i).getMadeBy();
               row[4]=ah.getAirlineHistory().get(i).getManYr();
               row[5]=ah.getAirlineHistory().get(i).getModelNo();
               row[6]=ah.getAirlineHistory().get(i).getSeats();
               row[7]=ah.getAirlineHistory().get(i).getMainCerti();
               row[8]=ah.getAirlineHistory().get(i).getFrom();
               row[9]=ah.getAirlineHistory().get(i).getTo();
               row[10]=ah.getAirlineHistory().get(i).getDuration();
               row[11]=ah.getAirlineHistory().get(i).getAvail();
               row[12]=ah.getAirlineHistory().get(i).getAirline();
               dtm.addRow(row);
               txtAirport.setText("");
             }    
             } 
    }//GEN-LAST:event_btnAirportActionPerformed

    private void btnManufactureCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufactureCertificateActionPerformed
        // TODO add your handling code here:
         String manu= txtManufactureCertificate.getText();
       DefaultTableModel dtm = (DefaultTableModel) tblAirline.getModel();
       dtm.setRowCount(0);
        for(int i=0;i<ah1.getHistory().size();i++)
             {
     
             if(ah.getAirlineHistory().get(i).getMainCerti().equals(manu))
             {
                Airline a = ah.addAirline();
               Object row[]= new Object[13];
               row[0]=ah.getAirlineHistory().get(i).getSrNo();
               row[1]=ah.getAirlineHistory().get(i).getDate();
               row[2]=ah.getAirlineHistory().get(i).getTime();
               row[3]=ah.getAirlineHistory().get(i).getMadeBy();
               row[4]=ah.getAirlineHistory().get(i).getManYr();
               row[5]=ah.getAirlineHistory().get(i).getModelNo();
               row[6]=ah.getAirlineHistory().get(i).getSeats();
               row[7]=ah.getAirlineHistory().get(i).getMainCerti();
               row[8]=ah.getAirlineHistory().get(i).getFrom();
               row[9]=ah.getAirlineHistory().get(i).getTo();
               row[10]=ah.getAirlineHistory().get(i).getDuration();
               row[11]=ah.getAirlineHistory().get(i).getAvail();
               row[12]=ah.getAirlineHistory().get(i).getAirline();
               dtm.addRow(row);
               txtManufactureCertificate.setText("");
             }    
             } 
 
    }//GEN-LAST:event_btnManufactureCertificateActionPerformed

    private void btnManufactureUsedbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufactureUsedbyActionPerformed
        // TODO add your handling code here:
         String airlin= txtManufactureUsedby.getText();
       DefaultTableModel dtm = (DefaultTableModel) tblAirline.getModel();
       dtm.setRowCount(0);
        for(int i=0;i<ah1.getHistory().size();i++)
             {
     
             if(ah.getAirlineHistory().get(i).getAirline().equals(airlin))
             {
                Airline a = ah.addAirline();
               Object row[]= new Object[13];
               row[0]=ah.getAirlineHistory().get(i).getSrNo();
               row[1]=ah.getAirlineHistory().get(i).getDate();
               row[2]=ah.getAirlineHistory().get(i).getTime();
               row[3]=ah.getAirlineHistory().get(i).getMadeBy();
               row[4]=ah.getAirlineHistory().get(i).getManYr();
               row[5]=ah.getAirlineHistory().get(i).getModelNo();
               row[6]=ah.getAirlineHistory().get(i).getSeats();
               row[7]=ah.getAirlineHistory().get(i).getMainCerti();
               row[8]=ah.getAirlineHistory().get(i).getFrom();
               row[9]=ah.getAirlineHistory().get(i).getTo();
               row[10]=ah.getAirlineHistory().get(i).getDuration();
               row[11]=ah.getAirlineHistory().get(i).getAvail();
               row[12]=ah.getAirlineHistory().get(i).getAirline();
               dtm.addRow(row);
               txtManufactureUsedby.setText("");
             }    
             } 
    }//GEN-LAST:event_btnManufactureUsedbyActionPerformed

    private void btnUpdateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTimeActionPerformed
        // TODO add your handling code here:
        txtUpdateTime.setText(ViewJPanel.dateS);
        
    }//GEN-LAST:event_btnUpdateTimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField From1;
    private javax.swing.JTextField To1;
    private javax.swing.JButton btnAirport;
    private javax.swing.JButton btnAvailseats;
    private javax.swing.JButton btnCurrentlyAvailable;
    private javax.swing.JButton btnFirstavailable;
    private javax.swing.JButton btnMadeby;
    private javax.swing.JButton btnManufactureCertificate;
    private javax.swing.JButton btnManufactureUsedby;
    private javax.swing.JButton btnManufactureYear;
    private javax.swing.JButton btnModelNumber;
    private javax.swing.JButton btnSerialNumber;
    private javax.swing.JButton btnUpdateTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAiport;
    private javax.swing.JLabel lblAvailableseats;
    private javax.swing.JLabel lblCurrentlyAvailable;
    private javax.swing.JLabel lblFirstAvailable;
    private javax.swing.JLabel lblMadeby;
    private javax.swing.JLabel lblManufacture;
    private javax.swing.JLabel lblManufactureCertificate;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblUpdateTime;
    private javax.swing.JLabel lblUsedby;
    private javax.swing.JLabel lblmax;
    private javax.swing.JLabel lblmin;
    private javax.swing.JTable tblAirline;
    private javax.swing.JTextField txtAirport;
    private javax.swing.JTextField txtMadeby;
    private javax.swing.JTextField txtManufactureCertificate;
    private javax.swing.JTextField txtManufactureUsedby;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtUpdateTime;
    private javax.swing.JTextField txtmaxSeats;
    private javax.swing.JTextField txtminSeats;
    // End of variables declaration//GEN-END:variables
}






