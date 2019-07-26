/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Administrator;

import Business.Business;
import Business.Order;
import Business.OrderList;
import Business.SalesPerson;
import java.awt.CardLayout;
import java.util.Collections;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabhjain
 */
public class AnalysisJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    public double revenue=0.0; 
    public double revenue1=0.0;
    AnalysisJPanel(JPanel userProcessContainer, Business business) {
    initComponents();
    this.userProcessContainer = userProcessContainer;
    this.business = business;
    revenue();
    revenue1();
    populateTable();
    populateTable1();
    populateTable3();
    populateTable4();
    populateTable5();
    }
    public void revenue(){
        for(SalesPerson salesperson:business.getEmployeedirectory().getSalesPersonList()){
            for(OrderList orderlist: salesperson.getOrderlistcatalog().getOrCatalog()){
                revenue = revenue+orderlist.getOrdertotalprice();
                System.out.println("REVENUE"+revenue);
            }
        }
         txtAnalysis.setText(String.valueOf(revenue));
    }
    public void revenue1(){
        for(SalesPerson salesperson:business.getEmployeedirectory().getSalesPersonList()){
            for(OrderList orderlist: salesperson.getOrderlistcatalog().getOrCatalog()){
                for(Order order:orderlist.getOrderList()){
                revenue1 = revenue1+order.getOrderQuantity()*(order.getOrderPrice()-order.getProduct().getMarketOffer().getActualPrice());
                System.out.println("REVENUE"+revenue);
            }
        }
         txtUnexpectedProfit.setText(String.valueOf(revenue1));
    }
    }
    public void populateTable() {
       
        DefaultTableModel dtm = (DefaultTableModel)tblSalesperson.getModel();
        dtm.setRowCount(0);
 System.out.print("0");
     for(SalesPerson salesperson:business.getEmployeedirectory().getSalesPersonList()){
         System.out.println("1");
             if(salesperson.getOrderlistcatalog().getTotalorderlistcsatalogprice()<500.0){
                Object [] row = new Object[5];
      row[0]=salesperson.getSalesPersonId();
      row[1]=salesperson;
      row[2]=salesperson.getOrderlistcatalog().getTotalcommision();
      row[3]=salesperson.getOrderlistcatalog().getTotalquantitypersalesperson();
      row[4]=salesperson.getOrderlistcatalog().getTotalorderlistcsatalogprice();
             System.out.println("Populate <500"+salesperson);
            dtm.addRow(row); 
             }
         }
     System.out.println("3");
    } 
    
      

    public void populateTable1() {
       // int rowcount = tblSupplier.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)tblSalespersonabove.getModel();
        dtm.setRowCount(0);
     System.out.println("4");
     for(SalesPerson salesperson1:business.getEmployeedirectory().getSalesPersonList()){
         System.out.println("5");
             if(salesperson1.getOrderlistcatalog().getTotalorderlistcsatalogprice()>=500.0){
                Object [] row1 = new Object[5];
 System.out.println("6");
      row1[0]=salesperson1.getSalesPersonId();
      row1[1]=salesperson1;
      row1[2]=salesperson1.getOrderlistcatalog().getTotalcommision();
      row1[3]=salesperson1.getOrderlistcatalog().getTotalquantitypersalesperson();
      row1[4]=salesperson1.getOrderlistcatalog().getTotalorderlistcsatalogprice();
                 System.out.println("Populate >500"+salesperson1);
            dtm.addRow(row1); 
             }System.out.println("7");
         }System.out.println("8");
 
}
      public void populateTable3() {
       
        DefaultTableModel dtm = (DefaultTableModel)tblSalespersonTOP10.getModel();
        dtm.setRowCount(0);
 System.out.print("0");
 
     for(int a=0;a<business.getEmployeedirectory().getSalesPersonList().size();a++){
         for(int b=a+1;b<business.getEmployeedirectory().getSalesPersonList().size();b++){
         System.out.println("1");
        
             if((business.getEmployeedirectory().getSalesPersonList().get(a).getOrderlistcatalog().getTotalorderlistcsatalogprice()) <=(business.getEmployeedirectory().getSalesPersonList().get(b).getOrderlistcatalog().getTotalorderlistcsatalogprice()) ){
                Object [] row = new Object[5];
                System.out.println("***********");
      row[0]=business.getEmployeedirectory().getSalesPersonList().get(b).getSalesPersonId();
      row[1]=business.getEmployeedirectory().getSalesPersonList().get(b);
      row[2]=business.getEmployeedirectory().getSalesPersonList().get(b).getOrderlistcatalog().getTotalcommision();
      row[3]=business.getEmployeedirectory().getSalesPersonList().get(b).getOrderlistcatalog().getTotalquantitypersalesperson();
      row[4]=business.getEmployeedirectory().getSalesPersonList().get(b).getOrderlistcatalog().getTotalorderlistcsatalogprice();
             System.out.println("Populate Sort"+row[4]);
            dtm.addRow(row); 
             }
         
        }
      }
     System.out.println("3");

    } 
      
      
      public void populateTable4() {
       
        DefaultTableModel dtm = (DefaultTableModel)tblProductsalerevenue.getModel();
        dtm.setRowCount(0);
 System.out.print("0");
     for(SalesPerson salesperson:business.getEmployeedirectory().getSalesPersonList()){
         for(OrderList orderList:salesperson.getOrderlistcatalog().getOrCatalog()){
             for(Order order:orderList.getOrderList()){
         
         System.out.println("1");
             if(order.getProduct().getMarketOffer().getMarketType().equals("Educational")){
                Object [] row = new Object[4];
      row[0]=order.getProduct().getProductId();
      row[1]=order.getProduct();
      row[2]=order.getProduct().getMarketOffer().getMarketType();
      row[3]=order.getAmountprice();
     // row[4]=salesperson.getOrderlistcatalog().getTotalorderlistcsatalogprice();
             System.out.println("Populate <500"+salesperson);
            dtm.addRow(row); 
             }
         }
     System.out.println("3");
    } 
      }
      }
      
       public void populateTable5() {
       
        DefaultTableModel dtm = (DefaultTableModel)tblProductsalerevenue1.getModel();
        dtm.setRowCount(0);
 System.out.print("0");
     for(SalesPerson salesperson:business.getEmployeedirectory().getSalesPersonList()){
         for(OrderList orderList:salesperson.getOrderlistcatalog().getOrCatalog()){
             for(Order order:orderList.getOrderList()){
         
         System.out.println("1");
             if(order.getProduct().getMarketOffer().getMarketType().equals("Financial")){
                Object [] row = new Object[4];
      row[0]=order.getProduct().getProductId();
      row[1]=order.getProduct();
      row[2]=order.getProduct().getMarketOffer().getMarketType();
      row[3]=order.getAmountprice();
     // row[4]=salesperson.getOrderlistcatalog().getTotalorderlistcsatalogprice();
             System.out.println("Populate <500"+salesperson);
            dtm.addRow(row); 
             }
         }
     System.out.println("3");
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

        jLabel1 = new javax.swing.JLabel();
        txtAnalysis = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesperson = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSalespersonabove = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSalespersonTOP10 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProductsalerevenue = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTop3Product = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtUnexpectedProfit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProductsalerevenue1 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SalesPersonWith totalTarget less than 500:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 400, 30));

        txtAnalysis.setEditable(false);
        txtAnalysis.setEnabled(false);
        add(txtAnalysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 110, 40));

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 120, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("XEROX ANALYSIS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 40));

        jLabel3.setText("Unexpected Profit:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 180, 30));

        tblSalesperson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SalesPersonId", "SalesPersonName", "TotalSalesComission", "TotalOrderListQuantity", "Target Acheived"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSalesperson);
        if (tblSalesperson.getColumnModel().getColumnCount() > 0) {
            tblSalesperson.getColumnModel().getColumn(0).setResizable(false);
            tblSalesperson.getColumnModel().getColumn(1).setResizable(false);
            tblSalesperson.getColumnModel().getColumn(2).setResizable(false);
            tblSalesperson.getColumnModel().getColumn(3).setResizable(false);
            tblSalesperson.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 740, 80));

        tblSalespersonabove.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SalesPersonId", "SalesPersonName", "TotalSalesComission", "TotalOrderListQuantity", "TargetAcheived"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSalespersonabove);
        if (tblSalespersonabove.getColumnModel().getColumnCount() > 0) {
            tblSalespersonabove.getColumnModel().getColumn(0).setResizable(false);
            tblSalespersonabove.getColumnModel().getColumn(1).setResizable(false);
            tblSalespersonabove.getColumnModel().getColumn(2).setResizable(false);
            tblSalespersonabove.getColumnModel().getColumn(3).setResizable(false);
            tblSalespersonabove.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 740, 70));

        jLabel4.setText("Product sales revenue by Financial:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 400, 30));

        jLabel5.setText("SalesPersonWith totalTarget more than 500:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 400, 30));

        tblSalespersonTOP10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SalesPersonId", "SalesPersonName", "TotalSalesComission", "TotalOrderListQuantity", "TargetAcheived"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSalespersonTOP10);
        if (tblSalespersonTOP10.getColumnModel().getColumnCount() > 0) {
            tblSalespersonTOP10.getColumnModel().getColumn(0).setResizable(false);
            tblSalespersonTOP10.getColumnModel().getColumn(1).setResizable(false);
            tblSalespersonTOP10.getColumnModel().getColumn(2).setResizable(false);
            tblSalespersonTOP10.getColumnModel().getColumn(3).setResizable(false);
            tblSalespersonTOP10.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 740, 90));

        tblProductsalerevenue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Productid", "ProductName", "Market", "Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblProductsalerevenue);
        if (tblProductsalerevenue.getColumnModel().getColumnCount() > 0) {
            tblProductsalerevenue.getColumnModel().getColumn(0).setResizable(false);
            tblProductsalerevenue.getColumnModel().getColumn(1).setResizable(false);
            tblProductsalerevenue.getColumnModel().getColumn(2).setResizable(false);
            tblProductsalerevenue.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 760, 90));

        jLabel6.setText("Top 10 Sales Person:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 400, 30));

        jLabel7.setText("TOP 3 Product :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 400, 30));

        tblTop3Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Productid", "ProductName", "Market", "Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblTop3Product);
        if (tblTop3Product.getColumnModel().getColumnCount() > 0) {
            tblTop3Product.getColumnModel().getColumn(0).setResizable(false);
            tblTop3Product.getColumnModel().getColumn(1).setResizable(false);
            tblTop3Product.getColumnModel().getColumn(2).setResizable(false);
            tblTop3Product.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, 760, 60));

        jLabel8.setText("Total Revenue:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 180, 30));

        txtUnexpectedProfit.setEditable(false);
        txtUnexpectedProfit.setEnabled(false);
        add(txtUnexpectedProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 130, 40));

        jLabel9.setText("Product sales revenue by Educational:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 400, 30));

        tblProductsalerevenue1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Productid", "ProductName", "Market", "Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblProductsalerevenue1);
        if (tblProductsalerevenue1.getColumnModel().getColumnCount() > 0) {
            tblProductsalerevenue1.getColumnModel().getColumn(0).setResizable(false);
            tblProductsalerevenue1.getColumnModel().getColumn(1).setResizable(false);
            tblProductsalerevenue1.getColumnModel().getColumn(2).setResizable(false);
            tblProductsalerevenue1.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 760, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblProductsalerevenue;
    private javax.swing.JTable tblProductsalerevenue1;
    private javax.swing.JTable tblSalesperson;
    private javax.swing.JTable tblSalespersonTOP10;
    private javax.swing.JTable tblSalespersonabove;
    private javax.swing.JTable tblTop3Product;
    private javax.swing.JTextField txtAnalysis;
    private javax.swing.JTextField txtUnexpectedProfit;
    // End of variables declaration//GEN-END:variables
}
