/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPerson;
import Business.EmployeeDirectory;
import Business.SalesPerson;
import Business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class SalesPersonLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesPersonLoginJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    
    public SalesPersonLoginJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
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
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLoginUser = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALESPERSON LOGIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 33, -1, 50));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("UserName :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        txtUsername.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 220, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Password :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 20));

        txtPassword.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 220, 40));

        btnLoginUser.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        btnLoginUser.setText("LOGIN");
        btnLoginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginUserActionPerformed(evt);
            }
        });
        add(btnLoginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginUserActionPerformed
        // TODO add your handling code here:
        String password = String.valueOf(txtPassword.getPassword());
        String username = txtUsername.getText();
        
        for(SalesPerson salesperson:business.getEmployeedirectory().getSalesPersonList()){
        if(salesperson.getSalesPersonUsername().equals(username) && salesperson.getSalesPersonPassword().equals(password)){
        ManageCustomerJPanel mc = new ManageCustomerJPanel(userProcessContainer,business,salesperson);
        userProcessContainer.add("ManageCustomer",mc);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
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