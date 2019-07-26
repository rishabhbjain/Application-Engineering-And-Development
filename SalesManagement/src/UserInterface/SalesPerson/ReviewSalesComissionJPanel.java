/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPerson;

import Business.Business;
import Business.Market;
import Business.OrderList;
import Business.SalesPerson;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabhjain
 */
public class ReviewSalesComissionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReviewSalesComissionJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
  //3  double tcomission = 0.0;
  //3  int totalquantity = 0;
  //3  double totalorderprice =0.0;
    private SalesPerson salesperson;
    ReviewSalesComissionJPanel(JPanel userProcessContainer, Business business, SalesPerson salesperson) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.salesperson = salesperson;
        lblSalesPersonName.setText(salesperson.getSalesPersonName());
        populateTable();
     //3   txtComission.setText(String.valueOf(tcomission));
     txtComission.setText(String.valueOf(salesperson.getOrderlistcatalog().getTotalcommision()));
        txttotalOrderQuantity.setText(String.valueOf(salesperson.getOrderlistcatalog().getTotalquantitypersalesperson()));
      //  salesperson.getOrderlistcatalog().setTotalcommision(tcomission);
        System.out.println("++++++++++==Salesperson++++++"+salesperson.getOrderlistcatalog().getTotalcommision());
        System.out.println("HEEY"+salesperson.getOrderlistcatalog().getTotalorderlistcsatalogprice()+"Heyyyyyyyy");

    }
public void populateTable() {
       // int rowcount = tblSupplier.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)tblSalesPersonCommision.getModel();
        dtm.setRowCount(0);
      //  for(OrderList orderlist:salesperson.getOrderlistcatalog().getSalesPersonOrder()){
   //   for(Order order:salesperson.getOrderListSalesPerson().getOrderList()){  
  // for(OrderList orderlist:salesperson.getOrderlistcatalog().getOrCatalog()){
 // for(SalesPerson salesperson :business.getEmployeedirectory().getSalesPersonList()){
     
      for(OrderList orderlist:salesperson.getOrderlistcatalog().getOrCatalog()){
      Object [] row = new Object[4];
     // row[0]=.getCustomer().getCustomerId();
    //  row[1]= market.getCustomer().getCustomerName();
      row[0]=orderlist;
      row[1]=orderlist.getOrdertotalprice();
      row[2]=orderlist.getSalespersoncomission();
      row[3]=orderlist.getTotalorderlistquantity();
    //3  tcomission = tcomission + orderlist.getSalespersoncomission();
    //3  totalquantity = totalquantity + orderlist.getTotalorderlistquantity();
    //3 totalorderprice = totalorderprice + orderlist.getOrdertotalprice();
      
  //          row[0]=order;
    //        row[1]=order.getAmountprice();
            
            dtm.addRow(row);
     //   }
   //   }
    } 
      //2 salesperson.getOrderlistcatalog().setTotalquantitypersalesperson(totalquantity);
     //2 salesperson.getOrderlistcatalog().setTotalcommision(tcomission);
     //2 salesperson.getOrderlistcatalog().setTotalorderlistcsatalogprice(totalorderprice);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblSalesPersonName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesPersonCommision = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtComission = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttotalOrderQuantity = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("SALES CONSOLE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 180, 40));
        add(lblSalesPersonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 170, 40));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 210, 50));

        tblSalesPersonCommision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderList No", "Order List Amount", "salesperson commission", "Order quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSalesPersonCommision);
        if (tblSalesPersonCommision.getColumnModel().getColumnCount() > 0) {
            tblSalesPersonCommision.getColumnModel().getColumn(0).setResizable(false);
            tblSalesPersonCommision.getColumnModel().getColumn(1).setResizable(false);
            tblSalesPersonCommision.getColumnModel().getColumn(2).setResizable(false);
            tblSalesPersonCommision.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 790, 190));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Total Order Quantity");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 180, 40));

        txtComission.setEditable(false);
        txtComission.setEnabled(false);
        add(txtComission, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 100, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Total Comission");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 180, 40));
        add(txttotalOrderQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalesPersonName;
    private javax.swing.JTable tblSalesPersonCommision;
    private javax.swing.JTextField txtComission;
    private javax.swing.JTextField txttotalOrderQuantity;
    // End of variables declaration//GEN-END:variables
}