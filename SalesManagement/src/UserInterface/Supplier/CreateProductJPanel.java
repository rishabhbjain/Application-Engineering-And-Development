/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Supplier;

import Business.Product;
import Business.SalesPerson;
import Business.Supplier;
import UserInterface.Administrator.SalespersonJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class CreateProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateSupplier
     */
    private JPanel userProcessContainer;
   private Supplier supplier;

    CreateProductJPanel(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
         comboboxMarketType.removeAllItems();;
         
          comboboxMarketType.addItem("Educational");
          comboboxMarketType.addItem("Financial");
          
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtDiscription = new javax.swing.JTextField();
        btnCreateProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTargetPrice = new javax.swing.JTextField();
        txtActualPrice = new javax.swing.JTextField();
        txtFloorPrice = new javax.swing.JTextField();
        txtCeilingPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboboxMarketType = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Create Product Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Discription:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 100, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Quantity:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 170, -1));
        add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 170, -1));
        add(txtDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 170, -1));

        btnCreateProduct.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCreateProduct.setText("Create");
        btnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProductActionPerformed(evt);
            }
        });
        add(btnCreateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Actual Price:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Floor Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Ceiling Price:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Target Price:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));
        add(txtTargetPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 120, -1));
        add(txtActualPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 120, -1));
        add(txtFloorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 120, -1));
        add(txtCeilingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 120, -1));

        jLabel9.setText("Market Type:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 90, -1));
        add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 170, -1));

        jLabel10.setText("Product Id:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 90, -1));

        comboboxMarketType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboboxMarketType, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageProductCatalogJPanel sp = (ManageProductCatalogJPanel) component;
        sp.populateTable1();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProductActionPerformed
        // TODO add your handling code here:
        if(txtProductName.getText().equals("") || txtDiscription.getText().equals("") || txtQuantity.getText().equals("")|| txtActualPrice.getText().equals("")|| txtCeilingPrice.getText().equals("")|| txtFloorPrice.getText().equals("") || txtTargetPrice.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please input all the content");
        }else{
            String productname = txtProductName.getText();
            String description = txtDiscription.getText();
            String productid = txtProductId.getText();
            String comboRole = (String)comboboxMarketType.getSelectedItem();
            int quantity = Integer.parseInt(txtQuantity.getText());
            int actualprice = Integer.parseInt(txtActualPrice.getText());
            int ceilingprice = Integer.parseInt(txtCeilingPrice.getText());
            int floorprice = Integer.parseInt(txtFloorPrice.getText());
            int targetprice = Integer.parseInt(txtTargetPrice.getText());
            String markettype = String.valueOf(comboboxMarketType.getSelectedItem());
            Product product = supplier.getProductcatalog().addProduct();
            System.out.println(quantity);
            product.setProductName(productname);
            product.setProductDescription(description);
            product.setProductQuantity(quantity);
            product.setProductId(productid);
            product.getMarketOffer().setActualPrice(actualprice);
            product.getMarketOffer().setCeilingPrice(ceilingprice);
            product.getMarketOffer().setFloorPrice(floorprice);
           product.getMarketOffer().setTargetPrice(targetprice);
           product.getMarketOffer().setMarketType(markettype);
            JOptionPane.showMessageDialog(null,"Product added successufully");
        }
    }//GEN-LAST:event_btnCreateProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateProduct;
    private javax.swing.JComboBox<String> comboboxMarketType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtActualPrice;
    private javax.swing.JTextField txtCeilingPrice;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtFloorPrice;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTargetPrice;
    // End of variables declaration//GEN-END:variables
}
