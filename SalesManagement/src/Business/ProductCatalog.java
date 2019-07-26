/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UserInterface.Supplier.ManageSuppliersJPanel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabhjain
 */
public class ProductCatalog {
    private ArrayList<Product> productlist;
    
    public ProductCatalog() {
        this.productlist = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(ArrayList<Product> productlist) {
        this.productlist = productlist;
    }

   
            
    public Product addProduct() {
        Product product = new Product();
        productlist.add(product);
        return product;
    }
    
    public void deleteProduct(Product product) {
        productlist.remove(product);
    }
    
    public Product searchProduct(String MarketType) {
        for(Product product:productlist) {
            if(product.getMarketOffer().getMarketType().equals(MarketType)) {
                return product;
            }
        }
        return null;
    }
    
    
    
}
