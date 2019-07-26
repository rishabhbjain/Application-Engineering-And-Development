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
public class SalesPerson {
    private int salesPersonId;
    private String salesPersonName;
    private String salesPersonUsername;
    private String salesPersonPassword;
    private OrderListCatalog orderlistcatalog;
    
    
   //private OrderList orderListSalesPerson;
//private ArrayList<OrderList>salesPersonOrder;
    
    public SalesPerson() {
      this.orderlistcatalog = new OrderListCatalog();
       //orderListSalesPerson = new OrderList();
 //     this.salesPersonOrder = new ArrayList<OrderList>();
    }

    public OrderListCatalog getOrderlistcatalog() {
        return orderlistcatalog;
    }

    public void setOrderlistcatalog(OrderListCatalog orderlistcatalog) {
        this.orderlistcatalog = orderlistcatalog;
    }

    
    public int getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(int salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public String getSalesPersonUsername() {
        return salesPersonUsername;
    }

    public void setSalesPersonUsername(String salesPersonUsername) {
        this.salesPersonUsername = salesPersonUsername;
    }

    public String getSalesPersonPassword() {
        return salesPersonPassword;
    }

    public void setSalesPersonPassword(String salesPersonPassword) {
        this.salesPersonPassword = salesPersonPassword;
    }
/*
    public OrderList getOrderListSalesPerson() {
        return orderListSalesPerson;
    }

    public void setOrderListSalesPerson(OrderList orderListSalesPerson) {
        this.orderListSalesPerson = orderListSalesPerson;
    }
*/
/*
    public ArrayList<OrderList> getSalesPersonOrder() {
        return salesPersonOrder;
    }

    public void setSalesPersonOrder(ArrayList<OrderList> salesPersonOrder) {
        this.salesPersonOrder = salesPersonOrder;
    }
   */ 
  /*  
    public OrderList addOrderList(OrderList o)
    {
        salesPersonOrder.add(o);
        return o;
    }
   */ 
    /*
        public OrderList addOrderList(OrderList o)
    {
        salesPersonOrder.add(o);
        return o;
    }
*/
  @Override
  public String toString() {
      return salesPersonName;
  }
    
    
    
}
