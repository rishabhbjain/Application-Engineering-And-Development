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
public class Airliner {
    private String airlinername;
    private String airlineraddress;
    private String noofairlines;
    private ArrayList<Flight> flightList; 
    public Airliner()
    {
      
       flightList = new ArrayList<Flight>();
    }
    
    
    public String getAirlinername() {
        return airlinername;
    }

    public void setAirlinername(String airlinername) {
        this.airlinername = airlinername;
    }

    public String getAirlineraddress() {
        return airlineraddress;
    }

    public void setAirlineraddress(String airlineraddress) {
        this.airlineraddress = airlineraddress;
    }

    public String getNoofairlines() {
        return noofairlines;
    }

    public void setNoofairlines(String noofairlines) {
        this.noofairlines = noofairlines;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
     public Flight addFlight() {
       Flight flight = new Flight();
       flightList.add(flight);
       return flight;
    }
    
    public void deleteFlight(Flight flight) {
        flightList.remove(flight);
    }
     
     
    @Override
    public String toString() {
        return airlinername;
    }
    
}
