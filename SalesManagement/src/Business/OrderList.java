/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class OrderList {
    private ArrayList<Order>orderList;
    private int orderNo;
    private double ordertotalprice;
    private double salespersoncomission;
   // private int orderprice;
    private int totalorderlistquantity;
  private static int count=0;
 // private Customer customer;
    
    public OrderList() {
        
           count++;
        orderNo = count;
        this.orderList = new ArrayList<Order>();
   //     this.customer = new Customer();
    }
/*
    public int getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(int orderprice) {
        this.orderprice = orderprice;
    }
*/

    public int getTotalorderlistquantity() {
        return totalorderlistquantity;
    }

    public void setTotalorderlistquantity(int totalorderlistquantity) {
        this.totalorderlistquantity = totalorderlistquantity;
    }
    
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public double getOrdertotalprice() {
        return ordertotalprice;
    }

    public void setOrdertotalprice(double ordertotalprice) {
        this.ordertotalprice = ordertotalprice;
    }

    public double getSalespersoncomission() {
        return salespersoncomission;
    }

    public void setSalespersoncomission(double salespersoncomission) {
        this.salespersoncomission = salespersoncomission;
    }

  

   
    
    
    
/*
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
  */  
    
/*
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
*/
    
    public Order addOrder(Product p,int quantity, int price) {
        Order order = new Order();
        //torder.getMarketoffer().setProduct(p);
        order.setProduct(p);
        order.setOrderQuantity(quantity);
        order.setOrderPrice(price);
        orderList.add(order);
        
       //q = q+(quantity*price);
        
       // this.setOrdertotalprice(q);
        return order ;
    }
  
    public void deleteOrder(Order order) {
        orderList.remove(order);
    }
    
  
    @Override
    public String toString(){
        String on = String.valueOf(orderNo);
        return on;
    }

}
