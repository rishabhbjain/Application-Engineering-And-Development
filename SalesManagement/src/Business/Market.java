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
public class Market {
   // private MarketOffer marketoffer;
    //private CustomerList customerList;
    String marketType;
    private Customer customer;
    public Market() {
        customer = new Customer();
     //   marketoffer = new MarketOffer();
      //  customerList = new CustomerList();
    }
    /*
    public MarketOffer getMarketoffer() {
        return marketoffer;
    }

    public void setMarketoffer(MarketOffer marketoffer) {
        this.marketoffer = marketoffer;
    }
*/
    /*
    public CustomerList getCustomerList() {
        return customerList;
    }

    public void setCustomerList(CustomerList customerList) {
        this.customerList = customerList;
    }
*/

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }
    @Override
    public String toString() {
        return marketType;
    }
    

    
    
    
}
