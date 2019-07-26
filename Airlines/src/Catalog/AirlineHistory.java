/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalog;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public class AirlineHistory {

    //Defining Arraylist
    private ArrayList <Airline> AirlineHistory;

    //Defining Constructor
    public AirlineHistory()
    {
        AirlineHistory = new ArrayList<>();
        
    }
   
    
    public ArrayList<Airline> getAirlineHistory() {
        return AirlineHistory;
    }

    public void setAirlineHistory(ArrayList<Airline> AirlineHistory) {
        this.AirlineHistory = AirlineHistory;
    }
    
    public Airline addAirline()
    {
        Airline a = new Airline();
        AirlineHistory.add(a);
        return a;
        
    }
   
    public void deleteAirline(Airline a)
    {
        AirlineHistory.remove(a);
    }
           
}
