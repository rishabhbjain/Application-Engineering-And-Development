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
public class TravelAgency {
    private AirlinerDirectory airlinerdirectory;
    private CustomerDirectory customerdirectory;
    
  public TravelAgency()
  {
      airlinerdirectory = new AirlinerDirectory();
      this.customerdirectory = new CustomerDirectory();
  }

    public AirlinerDirectory getAirlinerdirectory() {
        return airlinerdirectory;
    }

    public void setAirlinerdirectory(AirlinerDirectory airlinerdirectory) {
        this.airlinerdirectory = airlinerdirectory;
    }

    public CustomerDirectory getCustomerdirectory() {
        return customerdirectory;
    }

    public void setCustomerdirectory(CustomerDirectory customerdirectory) {
        this.customerdirectory = customerdirectory;
    }
  
    
  
}
