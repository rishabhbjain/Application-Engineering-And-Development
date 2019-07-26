/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rishabhjain
 */
public class Product {
    private String productId;
    private String productName;
    private String productDescription;
    private int productQuantity;
   private MarketOffer marketoffer;

    public Product(){
        marketoffer = new MarketOffer();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    
   

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public MarketOffer getMarketOffer() {
        return marketoffer;
    }

    public void setMarketOffer(MarketOffer marketOffer) {
        this.marketoffer = marketOffer;
    }

@Override 
public String toString(){
    return productName;
}
    
    
    
}
