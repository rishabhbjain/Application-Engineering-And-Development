/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabhjain
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;

    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;

        popOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        popData();
    }

    public void popOrganizationComboBox() {
        
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            organizationJComboBox.addItem(organization);
        }
        
       /* 
       organizationJComboBox.removeAllItems();
        if(enterprise.getEnterpriseType().getValue().equals("Hospital")){
            System.out.println("hhhhhhhhhhhhh");
        for (Type type : Organization.Type.values()){
        if ((!type.getValue().equals(Organization.Type.Admin.getValue()))&& (!type.getValue().equals(Organization.Type.CDCAdmin.getValue())) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue()))){
        organizationJComboBox.addItem(type);
        }
        }    
        }
        if(enterprise.getEnterpriseType().getValue().equals("Manufacturer")){
              for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.CDCAdmin.getValue()) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue())))){
                   organizationJComboBox.addItem(type);
            }
        }
        }
        
        if(enterprise.getEnterpriseType().getValue().equals("Provider")){
         for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.CDCAdmin.getValue()) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())))){
                   organizationJComboBox.addItem(type);
            }   
        }
        }
        if(enterprise.getEnterpriseType().getValue().equals("CDC")){
         for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue()) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())))){
                   organizationJComboBox.addItem(type);
            }   
        }
        }
        if(enterprise.getEnterpriseType().getValue().equals("StateDeptOfPublicHealth")){
         for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue()) && (!type.getValue().equals(Organization.Type.CDCAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())))){
                   organizationJComboBox.addItem(type);
            }   
        }
        }
        
        if(enterprise.getEnterpriseType().getValue().equals("Distributor")){
         for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue()) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.CDCAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())))){
                   organizationJComboBox.addItem(type);
            }   
        }
        }
        */
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
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

        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 452, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 364, 146, -1));

        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 369, -1, -1));

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setResizable(false);
            userJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 28, 375, 179));

        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 413, -1, -1));
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 408, 146, -1));

        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 286, -1, -1));

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 282, 146, -1));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 471, 112, -1));

        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 241, -1, -1));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 237, 146, -1));

        jLabel4.setText("Role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 335, -1, -1));

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 331, 146, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();
        
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        
        popData();
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
