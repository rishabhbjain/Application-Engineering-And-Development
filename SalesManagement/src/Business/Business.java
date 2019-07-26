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
public class Business {
    private SupplierDirectory suplierdirectory;
    private MarketOfferCatalog marketoffercatalog;
    private MarketList marketlist;
    private EmployeeDirectory employeedirectory;
    
    public Business() {
        suplierdirectory = new SupplierDirectory();
        marketoffercatalog = new MarketOfferCatalog();
        marketlist = new MarketList();
        employeedirectory = new EmployeeDirectory();
    }

    public SupplierDirectory getSuplierdirectory() {
        return suplierdirectory;
    }

    public void setSuplierdirectory(SupplierDirectory suplierdirectory) {
        this.suplierdirectory = suplierdirectory;
    }

    public MarketOfferCatalog getMarketoffercatalog() {
        return marketoffercatalog;
    }

    public void setMarketoffercatalog(MarketOfferCatalog marketoffercatalog) {
        this.marketoffercatalog = marketoffercatalog;
    }

    public MarketList getMarketlist() {
        return marketlist;
    }

    public void setMarketlist(MarketList marketlist) {
        this.marketlist = marketlist;
    }

    public EmployeeDirectory getEmployeedirectory() {
        return employeedirectory;
    }

    public void setEmployeedirectory(EmployeeDirectory employeedirectory) {
        this.employeedirectory = employeedirectory;
    }
    
    
    
}
