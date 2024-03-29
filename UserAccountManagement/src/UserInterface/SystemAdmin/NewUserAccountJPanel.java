/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Business;
import Business.Person;
import Business.UserAccount;
import UserInterface.HRAdmin.ManagePersonDirectoryJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class NewUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewUserAccountJPanel
     */
    private JPanel UserProcessContainer;
    private Business business;
    NewUserAccountJPanel(JPanel UserProcessContainer, Business business) {
          initComponents();
          ButtonGroup group = new ButtonGroup();
          group.add(radiobtnActive);
          group.add(radiobtnDisabled);
          this.UserProcessContainer = UserProcessContainer;
          this.business = business;
          comboboxSelectPerson.removeAllItems();
          comboboxSelectRole.removeAllItems();;
          for(int i=0;i<business.getPersondirectory().getPersonlist().size();i++){
              comboboxSelectPerson.addItem(business.getPersondirectory().getPersonlist().get(i).getFirstName());
          }
          comboboxSelectRole.addItem("SystemAdmin");
          comboboxSelectRole.addItem("HRAdmin");
          comboboxSelectRole.addItem("Student");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboboxSelectRole = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboboxSelectPerson = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        radiobtnActive = new javax.swing.JRadioButton();
        radiobtnDisabled = new javax.swing.JRadioButton();
        PasswordField = new javax.swing.JPasswordField();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New User Account");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 270, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Password :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 190, 40));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Select Role :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 190, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("User Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, 40));

        comboboxSelectRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboboxSelectRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 190, 50));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 190, 50));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Select Person:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, 40));

        comboboxSelectPerson.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboboxSelectPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 190, 50));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 250, 40));

        btnNew.setText("New ");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 250, 40));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Account Status :");
        jLabel7.setToolTipText("");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 170, 40));

        radiobtnActive.setText("Active");
        add(radiobtnActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        radiobtnDisabled.setText("Disabled");
        add(radiobtnDisabled, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));
        add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 190, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
            String comboPerson = (String)comboboxSelectPerson.getSelectedItem();
            String username = txtUsername.getText();
            String pwd = String.valueOf(PasswordField.getPassword());
            String comboRole = (String)comboboxSelectRole.getSelectedItem();
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
                    int i= comboboxSelectPerson.getSelectedIndex();
                    UserAccount useraccount = business.getPersondirectory().getPersonlist().get(i).addUserAccount();
                    business.getPersondirectory().getPersonlist().get(i).setFirstName(comboPerson);
                    useraccount.setUsername(username);
                    useraccount.setPassword(pwd);
                    useraccount.setRole(comboRole);
                    if(radiobtnActive.isSelected()){
                        useraccount.setAccountstatus(radiobtnActive.getText());
                    }else{
                useraccount.setAccountstatus(radiobtnDisabled.getText());
                }
                JOptionPane.showMessageDialog(null,"Person successfully added");
                }
            }
            else{
                 JOptionPane.showMessageDialog(null,"Please Enter the Data ");

                }     
            
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        UserProcessContainer .remove(this);
        Component[] componentArray = UserProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageUserAccountDirectoryJPanel manageuseraccountdirectoryjpanel = (ManageUserAccountDirectoryJPanel) component;
        manageuseraccountdirectoryjpanel.populateTable();
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
       layout.previous(UserProcessContainer);
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox<String> comboboxSelectPerson;
    private javax.swing.JComboBox<String> comboboxSelectRole;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton radiobtnActive;
    private javax.swing.JRadioButton radiobtnDisabled;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
