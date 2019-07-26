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
public class CustomerDirectory {
    //private ArrayList<AirlinerDirectory>airlinerdirectory;
    private ArrayList<Customer>customerdirectory;
    
    public CustomerDirectory(){
      //  airlinerdirectory = new ArrayList<AirlinerDirectory>(); 
        customerdirectory = new ArrayList();
        
    }

    public void CustomerDirectory(ArrayList<Customer> customer) {
          this.customerdirectory = customer;
    }
    /*
    public ArrayList<AirlinerDirectory> getAirlinerdirectory() {
        return airlinerdirectory;
    }

    public void setAirlinerdirectory(ArrayList<AirlinerDirectory> airlinerdirectory) {
        this.airlinerdirectory = airlinerdirectory;
    }
*/
    public ArrayList<Customer> getCustomerdirectory() {
        return customerdirectory;
    }

    public void setCustomerdirectory(ArrayList<Customer> customerdirectory) {
        this.customerdirectory = customerdirectory;
    }

   public Customer addCustomer() {
       Customer customer = new Customer();
       customerdirectory.add(customer);
       return customer;
   }

    
    
    
    
            
    
    
}
