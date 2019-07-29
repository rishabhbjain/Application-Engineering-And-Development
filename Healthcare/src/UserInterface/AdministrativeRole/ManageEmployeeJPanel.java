/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Organization.Organization.Type;
/**
 *
 * @author rishabhjain
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {
    private Enterprise enterprise;
   // private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */

    ManageEmployeeJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
      //  this.organizationDir = organizationDir;
        this.enterprise = enterprise;
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
     //   populateTable();
    }
    
    public void populateOrganizationComboBox(){
        
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
    
    public void populateOrganizationEmpComboBox(){
        
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            organizationEmpJComboBox.addItem(organization);
        }
       
        /*
       organizationEmpJComboBox.removeAllItems();
        if(enterprise.getEnterpriseType().getValue().equals("Hospital")){
            System.out.println("hhhhhhhhhhhhh");
        for (Type type : Organization.Type.values()){
        if ((!type.getValue().equals(Organization.Type.Admin.getValue()))&& (!type.getValue().equals(Organization.Type.CDCAdmin.getValue())) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue()))){
        organizationEmpJComboBox.addItem(type);
        }
        }    
        }
        if(enterprise.getEnterpriseType().getValue().equals("Manufacturer")){
              for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.CDCAdmin.getValue()) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue())))){
                   organizationEmpJComboBox.addItem(type);
            }
        }
        }
        
        if(enterprise.getEnterpriseType().getValue().equals("Provider")){
         for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.CDCAdmin.getValue()) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())))){
                   organizationEmpJComboBox.addItem(type);
            }   
        }
        }
        if(enterprise.getEnterpriseType().getValue().equals("CDC")){
         for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue()) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())))){
                   organizationEmpJComboBox.addItem(type);
            }   
        }
        }
        if(enterprise.getEnterpriseType().getValue().equals("StateDeptOfPublicHealth")){
         for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue()) && (!type.getValue().equals(Organization.Type.CDCAdmin.getValue())) && (!type.getValue().equals(Organization.Type.DistributorAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())))){
                   organizationEmpJComboBox.addItem(type);
            }   
        }
        }
        
        if(enterprise.getEnterpriseType().getValue().equals("Distributor")){
         for (Type type : Organization.Type.values()){
            if((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Clinic.getValue())) && (!type.getValue().equals(Organization.Type.ProviderAdmin.getValue()) && (!type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())) && (!type.getValue().equals(Organization.Type.CDCAdmin.getValue())) && (!type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) && (!type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())))){
                   organizationEmpJComboBox.addItem(type);
            }   
        }
        }
        */
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
      //  for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 67, 480, 92));

        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 328, -1, -1));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 34, 81, -1));

        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 38, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 328, -1, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 240, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 235, 126, -1));

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 190, 81, -1));

        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 194, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        
       Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        organization.getEmployeeDirectory().createEmployee(name);
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
       Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }

    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
