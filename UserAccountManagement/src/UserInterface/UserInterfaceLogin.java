/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Business;
import Business.ConfigureABusiness;
import Business.UserAccount;
import UserInterface.HRAdmin.DisplayHRAdminJPanel;
import UserInterface.SystemAdmin.DisplaySystemAdminJPanel;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class UserInterfaceLogin extends javax.swing.JPanel {

    /**
     * Creates new form UserInterfaceLogin
     */
    //private ConfigureABusiness cab;
    private Business business;
    private JPanel UserProcessContainer;
    public String usernamenxt;
   // private ConfigureABusiness configureabusiness;
    UserInterfaceLogin(JPanel UserProcessContainer, Business business) {
         initComponents();
         this.business = business;
         this.UserProcessContainer = UserProcessContainer;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLoginUser.setText("LOGIN");
        btnLoginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginUserActionPerformed(evt);
            }
        });
        add(btnLoginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 220, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("UserName :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 120, 40));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 220, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Password :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 120, 40));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginUserActionPerformed
        // TODO add your handling code here:
        String pwd =String.valueOf(txtPassword.getPassword());
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
         if((txtUsername.getText() != null)&& !(txtUsername.getText().isEmpty())
           && (pwd != null)&& !(pwd.isEmpty()) 
            )
         { 
            Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
            Matcher m = pattern.matcher(username + pwd );
            boolean boo = m.find();
            if(boo == true || username == null || pwd == null) {
            JOptionPane.showMessageDialog(null,"Please Check your UserName/Password");
            }
            else{      
        System.out.println(business.getPersondirectory().getPersonlist());
        
        for(int i=0;i<business.getPersondirectory().getPersonlist().size();i++) {
            for(UserAccount useraccount: business.getPersondirectory().getPersonlist().get(i).getListofuseraccount()) {
                if(useraccount.getUsername().equals(username) && useraccount.getPassword().equals(password) && useraccount.getRole().equals("SystemAdmin") && useraccount.getAccountstatus().equals("Active")){
                 JOptionPane.showMessageDialog(null,"Logging into SystemAdmin ");
                DisplaySystemAdminJPanel panel = new DisplaySystemAdminJPanel(UserProcessContainer,business, useraccount);
                UserProcessContainer.add("DisplaySystemAdminJPanel",panel);
                CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
                layout.next(UserProcessContainer);
                }
                if(useraccount.getUsername().equals(username) && useraccount.getPassword().equals(password) && useraccount.getRole().equals("HRAdmin") && useraccount.getAccountstatus().equals("Active")){
                 JOptionPane.showMessageDialog(null,"Logging into HRAdmin ");
                DisplayHRAdminJPanel panel = new DisplayHRAdminJPanel(UserProcessContainer,business, useraccount);
                UserProcessContainer.add("DisplayHRAdminJPanel",panel);
                CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
                layout.next(UserProcessContainer);
             
                }
                if(useraccount.getUsername().equals(username) && useraccount.getPassword().equals(password) && useraccount.getAccountstatus().equals("Disabled")) {
                    JOptionPane.showMessageDialog(null,"Account disabled");
                }
            }
        }
        }//endelse
     
    }
       
        else{
        JOptionPane.showMessageDialog(null,"Please Enter the Data ");

    }                
    }//GEN-LAST:event_btnLoginUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
