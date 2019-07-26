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
    private ArrayList<AirlinerDirectory>airlinerdirectory;
    String cutomername;
    String customercontact;
    public Customer(){
        airlinerdirectory = new ArrayList(); 
    }

    public String getCutomername() {
        return cutomername;
    }

    public void setCutomername(String cutomername) {
        this.cutomername = cutomername;
    }

    public String getCustomercontact() {
        return customercontact;
    }

    public void setCustomercontact(String customercontact) {
        this.customercontact = customercontact;
    }

    public ArrayList<AirlinerDirectory> getAirlinerdirectory() {
        return airlinerdirectory;
    }

    public void setAirlinerdirectory(ArrayList<AirlinerDirectory> airlinerdirectory) {
        this.airlinerdirectory = airlinerdirectory;
    }
    
     @Override
    public String toString() {
        return cutomername;
    }
    
}
