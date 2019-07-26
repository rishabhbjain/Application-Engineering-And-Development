/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPerson;

import Business.Business;
import Business.Market;
import Business.MarketOffer;
import Business.Order;

import Business.OrderList;
import Business.Product;
import Business.SalesPerson;
import Business.Supplier;
import UserInterface.Supplier.UpdateProductJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabhjain
 */
public class BookCustomerOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookCustomerOrderJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private OrderList orderlist;
    private SalesPerson salesperson;
    private Market market;
    private boolean isCheckedOut = false;
  //  private Order order;
    public int amount;
    public int orderNo = 0;
   // public int orderlistid;
    BookCustomerOrderJPanel(JPanel userProcessContainer, Business business,SalesPerson salesperson,Market market) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.salesperson = salesperson;
        this.market = market;
        this.amount = 0;
     //   this.orderlistid=0;
        if(!isCheckedOut){
            
        }
       orderlist = new OrderList(); 
      // order = new Order();
       populateTable777();
         populateSupplierCombo();
         lblsalesperson.setText(salesperson.getSalesPersonName());
         
       
        
    }
    public void populateSupplierCombo(){
        comboboxSuppler.removeAllItems();
        for(int i=0;i<business.getSuplierdirectory().getSupplierlist().size();i++){
        comboboxSuppler.addItem(business.getSuplierdirectory().getSupplierlist().get(i).getSupplierName());
        }
        
    } 
        public void populateTable123(){
                  DefaultTableModel dtm = (DefaultTableModel)tblSupplierProductCatalog.getModel();
        dtm.setRowCount(0);
 //       System.out.println("QQQQQQ");
//        System.out.println(business.getSuplierdirectory().getSupplierlist());
        for(Supplier supplier: business.getSuplierdirectory().getSupplierlist()){
     //       System.out.println("SUpplierfor");
            for(Product product: supplier.getProductcatalog().getProductlist()){
        if(supplier.getSupplierName().equals(String.valueOf(comboboxSuppler.getSelectedItem()))){
          Object [] row = new Object[7];
          row[0]=product.getProductId();
           row[1]= product;
           row[2]=product.getProductQuantity();
           row[3]=product.getMarketOffer().getMarketType();
           row[4]=product.getMarketOffer().getFloorPrice();
           row[5]=product.getMarketOffer().getCeilingPrice();
           row[6]=product.getMarketOffer().getActualPrice();
            dtm.addRow(row);
        }
            }}
       
        }
      
       public void refreshOrderTable(){
            DefaultTableModel dtm = (DefaultTableModel)tblOrder.getModel();
            dtm.setRowCount(0); 
             for(Order order:orderlist.getOrderList()){
                 Object row[] = new Object[5];
               //t  row[0]=order.getMarketoffer().getProduct().getProductId();
               //t  row[1]=order.getMarketoffer().getProduct().getProductName();
               row[0]=order.getProduct().getProductId();
               row[1]= order.getProduct().getProductName();
               row[2]=order;
                 row[3]=order.getOrderPrice();
                 amount = order.getOrderQuantity() * order.getOrderPrice();
                 row[4]=amount;
               //  amount = Integer.parseInt(String.valueOf(row[4]));
             //    orderlistid++;
                 dtm.addRow(row);
             }
            
       }
      
   //     populateTable777();
   
        
   // }
        
    
    public void populateTable777() {
        DefaultTableModel dtm = (DefaultTableModel)tblSupplierProductCatalog.getModel();
        dtm.setRowCount(0);
        //System.out.println("QQQQQQ");
       // System.out.println(business.getSuplierdirectory().getSupplierlist());
        for(Supplier supplier: business.getSuplierdirectory().getSupplierlist()){
         //   System.out.println("SUpplierfor");
            for(Product product: supplier.getProductcatalog().getProductlist()){
            //    System.out.println("12323444HELLO"+ product.getProductName());
            Object [] row = new Object[7];
            
           row[0]=product.getProductId();
           row[1]= product;
           row[2]=product.getProductQuantity();
           row[3]=product.getMarketOffer().getMarketType();
           row[4]=product.getMarketOffer().getFloorPrice();
           row[5]=product.getMarketOffer().getCeilingPrice();
           row[6]=product.getMarketOffer().getActualPrice();
            dtm.addRow(row);
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
        jLabel2 = new javax.swing.JLabel();
        comboboxSuppler = new javax.swing.JComboBox<>();
        txtSearchProduct = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplierProductCatalog = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        spinnerQuantity = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        txtModifyQuantity = new javax.swing.JTextField();
        btnModifyQuantity = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblsalesperson = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOK ORDER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 250, 50));

        jLabel2.setText("ITEMS IN CART");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 30));

        comboboxSuppler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxSuppler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxSupplerActionPerformed(evt);
            }
        });
        add(comboboxSuppler, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, 30));
        add(txtSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 180, 30));

        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });
        add(btnSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 150, 30));

        jLabel3.setText("SUPPLIER");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, 30));

        tblSupplierProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Name", "Product Quantity", "Market Type", "Floor Price", "Ceiling Price", "Actual Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSupplierProductCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 770, 120));

        jLabel4.setText("Quantity");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 70, 30));
        add(txtSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 90, 30));

        jLabel5.setText("Sales Price");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 100, 30));
        add(spinnerQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 50, 30));

        jLabel6.setText("SUPPLIER PRODUCT CATALOG");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, 30));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Name", "OrderNumber", "Selling Price(for 1)", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrder);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 770, 110));

        btnAddToCart.setText("Add To Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 150, 30));
        add(txtModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 90, 40));

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });
        add(btnModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 150, 40));

        btnCheckOut.setText("CheckOut");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 150, 40));

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 150, 40));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 140, 40));

        jLabel7.setText("PRODUCT ID :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, 30));
        add(lblsalesperson, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        // TODO add your handling code here:
        String productid = txtSearchProduct.getText();
    //    String marketoffer = String.valueOf(comboboxMarketType.getSelectedItem());
        Supplier result =business.getSuplierdirectory().searchSupplier(String.valueOf(comboboxSuppler.getSelectedItem()));
   //     String r = String.valueOf(comboboxSuppler.getSelectedItem());
        if(result == null) {
               JOptionPane.showMessageDialog(null, "U you entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
  
        }
        else {
               DefaultTableModel dtm = (DefaultTableModel)tblSupplierProductCatalog.getModel();
        dtm.setRowCount(0);
        System.out.println("QQQQQQ");
        System.out.println(business.getSuplierdirectory().getSupplierlist());
        for(Supplier supplier: business.getSuplierdirectory().getSupplierlist()){
            System.out.println("SUpplierfor");
            for(Product product: supplier.getProductcatalog().getProductlist()){
        /*    if(supplier.getSupplierName().equals(r)&&productid.equals(product.getProductId()) && marketoffer.equals(product.getMarketOffer().getMarketType())){
                System.out.println("12323444HELLO"+ product.getProductName());
            Object [] row = new Object[7];
          row[0]=product.getProductId();
           row[1]= product;
           row[2]=product.getProductQuantity();
           row[3]=product.getMarketOffer().getMarketType();
           row[4]=product.getMarketOffer().getFloorPrice();
           row[5]=product.getMarketOffer().getCeilingPrice();
           row[6]=product.getMarketOffer().getActualPrice();
            dtm.addRow(row);
         break;   
        }
*/
            if(product.getProductId().equals(productid)){
                System.out.println("12323444HELLO"+ product.getProductName());
            Object [] row = new Object[7];
          row[0]=product.getProductId();
           row[1]= product;
           row[2]=product.getProductQuantity();
           row[3]=product.getMarketOffer().getMarketType();
           row[4]=product.getMarketOffer().getFloorPrice();
           row[5]=product.getMarketOffer().getCeilingPrice();
           row[6]=product.getMarketOffer().getActualPrice();
            dtm.addRow(row);
        }

        
            }}
        }
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void comboboxSupplerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxSupplerActionPerformed
        // TODO add your handling code here:
        populateTable123();
    }//GEN-LAST:event_comboboxSupplerActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        
        
            int selectedRow = tblSupplierProductCatalog.getSelectedRow();
        if(selectedRow<0) {
                  JOptionPane.showMessageDialog(null, "Please select a row from table to view details");
                  return;
        }
       
        Product selectedProduct =(Product)tblSupplierProductCatalog.getValueAt(selectedRow,1);
        int fetchQty = (Integer)spinnerQuantity.getValue();
     if(fetchQty <=0){
          JOptionPane.showMessageDialog(null,"Quantity cannot be less than equal to 0");
           return;
       }
       try {
        int SalesPrice = Integer.parseInt(txtSalesPrice.getText());
        if(SalesPrice <= selectedProduct.getMarketOffer().getActualPrice()){
                       JOptionPane.showMessageDialog(null,"Sales price cannot be less than actual price");
                       return;
        }
        
        if(fetchQty <= selectedProduct.getProductQuantity()){
          //  System.out.println("FetchQuantity");
            boolean alreadyPresent = false;
          for(Order order:orderlist.getOrderList()){
               // System.out.println("forloop");
          //t     if(order.getMarketoffer().getProduct() == selectedProduct) { 
                   if(order.getProduct() == selectedProduct) {
                   int oldAvail = selectedProduct.getProductQuantity();
                   int newAvail = oldAvail - fetchQty;
                   selectedProduct.setProductQuantity(newAvail);
                 //  System.out.println(order.getOrderQuantity()+" "+order.getMarketoffer().getProduct().getProductQuantity());
                   order.setOrderQuantity(fetchQty+order.getOrderQuantity());
                   alreadyPresent = true;
                   populateTable777();
                   refreshOrderTable();
                   break;
               }
            }
            if(!alreadyPresent){
                int oldAvail = selectedProduct.getProductQuantity();
                int newAvail = oldAvail - fetchQty;
                selectedProduct.setProductQuantity(newAvail);
                orderlist.addOrder(selectedProduct,fetchQty,SalesPrice);
                populateTable777();
                refreshOrderTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Quantity> Availability","Warning",JOptionPane.WARNING_MESSAGE);
        }
            
        }
       catch(Exception e)
       {
        JOptionPane.showMessageDialog(null,"Invalid sales price");
        return;
   
       }
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        if(orderlist.getOrderList().size() > 0 ){
          
            salesperson.getOrderlistcatalog().addOrderList(orderlist);
            //
            market.getCustomer().getOrderListCatalog().addOrderList(orderlist);
            System.out.println(market.getCustomer().getCustomerName());
                        System.out.println(salesperson.getSalesPersonName());
                        System.out.println(market.getCustomer().getOrderListCatalog());
            for(OrderList orderlist:market.getCustomer().getOrderListCatalog().getOrCatalog()){
                int totalorder =0;
                double priceorderfinal = 0;
                System.out.println("-----------------Statrt--------------");
                System.out.println("OrderNo"+(orderlist.getOrderNo()));
                
                System.out.println("--------------------"+(orderlist.getOrderNo())+"-----------------------");
                  
                for(Order order:orderlist.getOrderList()){
                    
                   
                                        System.out.println("OrderPrice"+order.getOrderPrice());
                                         System.out.println("OrderQuantity"+order.getOrderQuantity());
                                         priceorderfinal = priceorderfinal + (order.getOrderQuantity()*order.getOrderPrice());
                                         totalorder = totalorder + order.getOrderQuantity();
                                         System.out.println("TotalOrderPrice"+(order.getOrderPrice()*order.getOrderQuantity()));
                                          order.setAmountprice(order.getOrderPrice()*order.getOrderQuantity());
                                          order.setTotalorderquantity(order.getOrderQuantity());
                                         
                    System.out.println("Ordervalaordernumber"+order.getOrderNumber());
                     System.out.println("Markettype"+order.getProduct().getMarketOffer().getMarketType());
                     System.out.println("ActualPrice"+order.getProduct().getMarketOffer().getActualPrice());
                     System.out.println("ProductName"+order.getProduct().getProductName());
                     System.out.println("ProductId"+order.getProduct().getProductId());
                     System.out.println("ProductQuantity"+order.getProduct().getProductQuantity());
                     System.out.println("-----END of inner for looop---------");
                      System.out.println("@@@@@@@@@@@@@@@"+(orderlist.getOrderNo())+"@@@@@@@@@@@@@@@");
                       
                }
                System.out.println("TOtal"+priceorderfinal);
                orderlist.setOrdertotalprice(priceorderfinal);
                orderlist.setTotalorderlistquantity(totalorder);
               orderlist.setSalespersoncomission(0.03*priceorderfinal);
                
                System.out.println("----------------End-------------");
            }
            for(OrderList orderlist:salesperson.getOrderlistcatalog().getOrCatalog()){
                
                double priceorderfinal1 = 0;
               int totalorder1 = 0;
                
                System.out.println("--------------------"+(orderlist.getOrderNo())+"-----------------------");
                  
                for(Order order:orderlist.getOrderList()){
                    
                   
                 
                                         priceorderfinal1 = priceorderfinal1 + (order.getOrderQuantity()*order.getOrderPrice());
                                         totalorder1 = totalorder1 + order.getOrderQuantity();
                                                 
                                          order.setAmountprice(order.getOrderPrice()*order.getOrderQuantity());
                                         order.setTotalorderquantity(order.getOrderQuantity());
                }
                orderlist.setOrdertotalprice(priceorderfinal1);
                orderlist.setTotalorderlistquantity(totalorder1);
         
                
             
            }
                


            //
            JOptionPane.showMessageDialog(null,"Order placed successfully");
             orderlist = new OrderList();
             refreshOrderTable();
            populateTable777();
             isCheckedOut = true;
             
            /*
            System.out.println("RISHABH"+orderlist.getOrderList());
           salesperson.getOrderListSalesPerson().addOrder(pr, SOMEBITS, ERROR)
           market
           //salesperson.getOrderlistcatalog().addOrderList(orderlist);
           // salesperson.getOrderlistcatalog().setAmountprice(amount);
           // salesperson.getOrderlistcatalog().setOrderId(String.valueOf(orderlistid));
         //  salesperson.addOrderList(orderlist);
          //  market.getCustomer().getOrderListCatalog().addOrderList(orderlist);
          //  market.getCustomer().getOrderListCatalog().setAmountprice(amount);
          //  market.getCustomer().getOrderListCatalog().setOrderId(String.valueOf(orderlistid));
            JOptionPane.showMessageDialog(null,"Order placed successfully");
           
          //  salesperson.setSalesPersonOrder(salesPersonOrder);
         */ 
           
        }
        else{
            JOptionPane.showMessageDialog(null,"No order placed");
        }
        
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            return;
        }
        Order order = (Order)tblOrder.getValueAt(selectedRow,2);
       // Product product = (Product)tblOrder.getValueAt(selectedRow,1);
       // int currentAvail = order.getMarketoffer().getProduct().getProductQuantity();
       int currentAvail = order.getProduct().getProductQuantity();
        int oldQty = order.getOrderQuantity();
        int newQty =Integer.parseInt(txtModifyQuantity.getText());
        if(newQty > (currentAvail + oldQty)){
            JOptionPane.showMessageDialog(null,"Quantity is more than Availability");
            return;
        }
        else{
            if(newQty <= 0){
                JOptionPane.showMessageDialog(null,"Quantity should be greater than 0");
            return;
            }
            order.setOrderQuantity(newQty);
       //t     order.getMarketoffer().getProduct().setProductQuantity(currentAvail + (oldQty - newQty));
          order.getProduct().setProductQuantity(currentAvail + (oldQty - newQty));
       refreshOrderTable();
            populateTable777();
            
        }
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int row = tblOrder.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        Order o =(Order)tblOrder.getValueAt(row,2);
     //t   int oldAvail = o.getMarketoffer().getProduct().getProductQuantity();
        int oldAvail = o.getProduct().getProductQuantity();
     int oldQty = o.getOrderQuantity();
        int newQty = oldAvail + oldQty;
      //  o.getMarketoffer().getProduct().setProductQuantity(newQty);
      o.getProduct().setProductQuantity(newQty);
        orderlist.deleteOrder(o);
        JOptionPane.showMessageDialog(null,"Order removed from the cart");
        refreshOrderTable();
        populateTable777();
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JComboBox<String> comboboxSuppler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblsalesperson;
    private javax.swing.JSpinner spinnerQuantity;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblSupplierProductCatalog;
    private javax.swing.JTextField txtModifyQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearchProduct;
    // End of variables declaration//GEN-END:variables
}
