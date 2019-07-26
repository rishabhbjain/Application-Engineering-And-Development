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
public class Customer {
    private int customerId;
    private String customerName;
    private String emailAddress;
    private OrderListCatalog orderListCatalog;
  //private OrderList orderlistcustomer;
    
    public Customer(){
        orderListCatalog = new OrderListCatalog();
  //   orderlistcustomer = new OrderList();
    }

    public OrderListCatalog getOrderListCatalog() {
        return orderListCatalog;
    }

    public void setOrderListCatalog(OrderListCatalog orderListCatalog) {
        this.orderListCatalog = orderListCatalog;
    }
    
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
/*
    public OrderList getOrderlistcustomer() {
        return orderlistcustomer;
    }

    public void setOrderlistcustomer(OrderList orderlistcustomer) {
        this.orderlistcustomer = orderlistcustomer;
    } 
  */
    @Override 
    public String toString() {
        return customerName;
    }
}
