/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public class Order {

    //private Date orderDate;
    private int orderQuantity;
  //  private int salesPersonComission;
    private int orderPrice;
  //t  private MarketOffer marketoffer;
    private int orderNumber;
    private int amountprice;
    private int totalorderquantity;
    private static int count=0;
    private Product product;
    public Order(){
             count++;
        orderNumber = count;
       //t marketoffer = new MarketOffer();
       Product product= new Product();
       
    }

    public int getTotalorderquantity() {
        return totalorderquantity;
    }

    public void setTotalorderquantity(int totalorderquantity) {
        this.totalorderquantity = totalorderquantity;
    }

    
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getAmountprice() {
        return amountprice;
    }

    public void setAmountprice(int amountprice) {
        this.amountprice = amountprice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

   

   
   /*t 

    public MarketOffer getMarketoffer() {
        return marketoffer;
    }

    public void setMarketoffer(MarketOffer marketoffer) {
        this.marketoffer = marketoffer;
    }
    */
/*
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
*/
    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }
    
    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
/*
    public int getSalesPersonComission() {
        return salesPersonComission;
    }

    public void setSalesPersonComission(int salesPersonComission) {
        this.salesPersonComission = salesPersonComission;
    }
*/
    @Override 
    public String toString(){
        String on = String.valueOf(orderNumber);
   // return marketoffer.getProduct().getProductId();
   return on;
    }
    
}
