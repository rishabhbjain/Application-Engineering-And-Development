/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Supplier;

import Business.Business;
import Business.MarketOffer;
import Business.MarketOfferCatalog;
import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageSuppliersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductCatelog
     */
    private JPanel userProcessContainer;
    private Business business;
  //  private SupplierDirectory supplierdirectory;
  //  private MarketOfferCatalog marketoffercatalog;
    public ManageSuppliersJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business = business;
       // this.supplierdirectory = business.getSuplierdirectory();
       // this.marketoffercatalog = business.getMarketoffercatalog();
        populateTable();
    }
    
public void populateTable() {
       // int rowcount = tblSupplier.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)tblSupplier.getModel();
        dtm.setRowCount(0);
        for(Supplier supplier: business.getSuplierdirectory().getSupplierlist() ){
            Object [] row = new Object[3];
            row[0]=supplier;
            row[1]=supplier.getSupplierID();
            row[2]=supplier.getContactNo();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        btnCreateProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        btnManageProductCatalog = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Manage Suppliers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        tblSupplier.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name", "Supplier ID", "Contact Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSupplier);
        if (tblSupplier.getColumnModel().getColumnCount() > 0) {
            tblSupplier.getColumnModel().getColumn(0).setResizable(false);
            tblSupplier.getColumnModel().getColumn(1).setResizable(false);
            tblSupplier.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 600, 210));

        btnCreateProduct.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCreateProduct.setText("Create");
        btnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProductActionPerformed(evt);
            }
        });
        add(btnCreateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        btnUpdateProduct.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnUpdateProduct.setText("Update");
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });
        add(btnUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        btnDeleteProduct.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnDeleteProduct.setText("Delete");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });
        add(btnDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        btnManageProductCatalog.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnManageProductCatalog.setText("Manage Product Catalog");
        btnManageProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductCatalogActionPerformed(evt);
            }
        });
        add(btnManageProductCatalog, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductCatalogActionPerformed
        // TODO add your handling code here:
         int selectedRow =tblSupplier.getSelectedRow();
         if(selectedRow<0) {
                  JOptionPane.showMessageDialog(null, "Please select a row from table first to view details","Warning",JOptionPane.WARNING_MESSAGE);

         }
         else {
           Supplier supplier = (Supplier)tblSupplier.getValueAt(selectedRow, 0);
           System.out.println("12344"+supplier);
       ManageProductCatalogJPanel mpc = new ManageProductCatalogJPanel(userProcessContainer,supplier);
        userProcessContainer.add("ManageProductCatalog", mpc);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
         }
        
        
        
        
    }//GEN-LAST:event_btnManageProductCatalogActionPerformed

    private void btnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProductActionPerformed
        // TODO add your handling code here:
        CreateSupplierJPanel cs = new CreateSupplierJPanel(userProcessContainer,business.getSuplierdirectory());
        userProcessContainer.add("CreateSupplier", cs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateProductActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        // TODO add your handling code here:
        
        
        
        
        int selectedRow = tblSupplier.getSelectedRow();
        if(selectedRow<0) {
                  JOptionPane.showMessageDialog(null, "Please select a row from table to view details","Warning",JOptionPane.WARNING_MESSAGE);

        }
        else {
        Supplier supplier =(Supplier)tblSupplier.getValueAt(selectedRow,0);
        UpdateSupplierJPanel us = new UpdateSupplierJPanel(userProcessContainer,supplier);
        userProcessContainer.add("UpdateSupplier", us);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
        
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSupplier.getSelectedRow();
        if(selectedRow  >= 0) {
           int dialogButton = JOptionPane.YES_NO_OPTION;
           int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the supplier?","Warning",dialogButton);
           if(dialogResult == JOptionPane.YES_OPTION) {
               Supplier supplier = (Supplier) tblSupplier.getValueAt(selectedRow,0);
               business.getSuplierdirectory().deleteSupplier(supplier);
               populateTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDeleteProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProduct;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnManageProductCatalog;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSupplier;
    // End of variables declaration//GEN-END:variables
}