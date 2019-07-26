/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Business;
import Business.Person;
import Business.UserAccount;
import UserInterface.HRAdmin.FindPersonJPanel;
import java.awt.CardLayout;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabhjain
 */
public class ManageUserAccountDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountDirectoryJPanel
     */
    private JPanel UserProcessContainer;
    private Business business;
    //private UserAccount useraccount;

    ManageUserAccountDirectoryJPanel(JPanel UserProcessContainer, Business business) {
         initComponents();
         this.UserProcessContainer=UserProcessContainer;
         this.business = business;
         populateTable();
         
    }
     public void populateTable(){
         DefaultTableModel dtm = (DefaultTableModel) tblUserAccounts.getModel();
        dtm.setRowCount(0);
       
        for(int i=0;i<business.getPersondirectory().getPersonlist().size();i++) {
        for(UserAccount useraccount: business.getPersondirectory().getPersonlist().get(i).getListofuseraccount()) {
            Object[] row = new Object[7];
            row[0]=useraccount;
           
            row[1]=business.getPersondirectory().getPersonlist().get(i).getFirstName();
            row[2]=business.getPersondirectory().getPersonlist().get(i).getLastName();
           
         //   row[3]=useraccount.getPassword();     
           //try bonus
           String passwordToHash = useraccount.getPassword();
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i1=0; i1< bytes.length ;i1++)
            {
                sb.append(Integer.toString((bytes[i1] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        System.out.println(generatedPassword);
            
         row[3] = generatedPassword;  
           
           
           
           
           
           
           
           
           
           
           
           //end bonus 
            row[4]= useraccount.getRole();
            row[5]=useraccount.getAccountstatus();
            row[6]=business.getPersondirectory().getPersonlist().get(i).getSSN();
            dtm.addRow(row);
            
            
            
            
            
            
            
            
            
            
            
         //End Bonus Part   
        }
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

        btnFindUserAccount = new javax.swing.JButton();
        btnUpdateUserAccount = new javax.swing.JButton();
        btnNewUserAccount = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserAccounts = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFindUserAccount.setText("Find User Account >>");
        btnFindUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindUserAccountActionPerformed(evt);
            }
        });
        add(btnFindUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 360, 40));

        btnUpdateUserAccount.setText("Update User Account >>");
        btnUpdateUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserAccountActionPerformed(evt);
            }
        });
        add(btnUpdateUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 360, 40));

        btnNewUserAccount.setText("New User Account >>");
        btnNewUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserAccountActionPerformed(evt);
            }
        });
        add(btnNewUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 360, 40));

        tblUserAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "UserName", "FirstName", "LastName", "Password", "Account role", "Account Status", "SSN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUserAccounts);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 780, 240));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("User Accounts");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindUserAccountActionPerformed
        // TODO add your handling code here:
        FindUserAccountJPanel panel = new FindUserAccountJPanel(UserProcessContainer,business);
        UserProcessContainer.add("FindUserAccountJPanel",panel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_btnFindUserAccountActionPerformed

    private void btnNewUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserAccountActionPerformed
        // TODO add your handling code here:
        NewUserAccountJPanel panel = new NewUserAccountJPanel(UserProcessContainer,business);
        UserProcessContainer.add("NewUserAccountJPanel",panel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_btnNewUserAccountActionPerformed

    private void btnUpdateUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserAccountActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblUserAccounts.getSelectedRow();
        if(selectedRow<0) {
                  JOptionPane.showMessageDialog(null, "Please select a row from table to view details","Warning",JOptionPane.WARNING_MESSAGE);

        }
        else {
        UserAccount useraccount =(UserAccount)tblUserAccounts.getValueAt(selectedRow,0);
        UpdateUserAccountStatusJPanel panel = new UpdateUserAccountStatusJPanel(UserProcessContainer,useraccount);
        UserProcessContainer.add("UpdateUserAccountStatusJPanel",panel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
        }
    }//GEN-LAST:event_btnUpdateUserAccountActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindUserAccount;
    private javax.swing.JButton btnNewUserAccount;
    private javax.swing.JButton btnUpdateUserAccount;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUserAccounts;
    // End of variables declaration//GEN-END:variables
}