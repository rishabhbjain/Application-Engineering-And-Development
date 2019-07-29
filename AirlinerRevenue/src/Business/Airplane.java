package Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rishabhjain
 */
public class Airplane {
   
    private String airplanename;
    private Flight flight;
    public Airplane()
    {
           flight = new Flight();
    }

    public String getAirplanename() {
        return airplanename;
    }

    public void setAirplanename(String airplanename) {
        this.airplanename = airplanename;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
     
   
   
   
   
   
   
   
   
   
}
