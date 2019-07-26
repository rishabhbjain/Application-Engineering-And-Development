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
public class OrderListCatalog {
     
     private ArrayList<OrderList>OrCatalog;
     private double totalcommision;
     private int totalquantitypersalesperson;
      String tc =String.valueOf(totalcommision);
      private double totalorderlistcsatalogprice; 
      public OrderListCatalog() {
       this.OrCatalog= new ArrayList<OrderList>();
    }

    public int getTotalquantitypersalesperson() {
        return totalquantitypersalesperson;
    }

    public void setTotalquantitypersalesperson(int totalquantitypersalesperson) {
        this.totalquantitypersalesperson = totalquantitypersalesperson;
    }

    public double getTotalorderlistcsatalogprice() {
        return totalorderlistcsatalogprice;
    }

    public void setTotalorderlistcsatalogprice(double totalorderlistcsatalogprice) {
        this.totalorderlistcsatalogprice = totalorderlistcsatalogprice;
    }

      
      
      
      
      
    public ArrayList<OrderList> getOrCatalog() {
        return OrCatalog;
    }

    public void setOrCatalog(ArrayList<OrderList> OrCatalog) {
        this.OrCatalog = OrCatalog;
    }
      
        public OrderList addOrderList(OrderList o)
    {
        OrCatalog.add(o);
        return o;
    }  
    
        
    /*
     private ArrayList<OrderList>salesPersonOrder;
     private String orderId;
     private int amountprice;
     
     public OrderListCatalog() {
       //orderListSalesPerson = new OrderList();
       this.salesPersonOrder = new ArrayList<OrderList>();
    }

    public ArrayList<OrderList> getSalesPersonOrder() {
        return salesPersonOrder;
    }

    public void setSalesPersonOrder(ArrayList<OrderList> salesPersonOrder) {
        this.salesPersonOrder = salesPersonOrder;
    }
   

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getAmountprice() {
        return amountprice;
    }

    public void setAmountprice(int amountprice) {
        this.amountprice = amountprice;
    }
     
      public OrderList addOrderList(OrderList o)
    {
        salesPersonOrder.add(o);
        return o;
    }
  
       @Override
  public String toString() {
      return orderId;
  }
*/

    public double getTotalcommision() {
        return totalcommision;
    }

    public void setTotalcommision(double totalcommision) {
        this.totalcommision = totalcommision;
    }
@Override
public String toString(){
   
   return tc; 
}
   

}
