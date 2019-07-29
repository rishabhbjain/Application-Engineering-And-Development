package Business;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rishabhjain
 */
public class Airliner {
    
    private String airlinername;
    private ArrayList <Fleet> fleet;
 
    public Airliner()
    {
        fleet= new ArrayList();
    }
    public void Airliner(ArrayList<Fleet> infleet)
    {
        
        this.fleet = infleet;
        
    }

    public String getAirlinername() {
        return airlinername;
    }

    public void setAirlinername(String airlinername) {
        this.airlinername = airlinername;
    }

    public ArrayList<Fleet> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Fleet> fleet) {
        this.fleet = fleet;
    }
    
    public Fleet addAirliner(Fleet fl){
        fleet.add(fl);
        return fl;
    }
   
}
