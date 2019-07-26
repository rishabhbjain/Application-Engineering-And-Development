/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalog;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class History {
    private ArrayList <Airline> History;
    
public History()
{
    History = new ArrayList<>();
}
public ArrayList<Airline>getHistory() {
    return History;
}
public void setHistory(ArrayList<Airline> History) 
{
    this.History = History;
}
    public Airline addAirline1()
    {
        Airline a = new Airline();
        History.add(a);
        return a;
        
    }
    public void deleteAirline1(Airline a)
    {
        History.remove(a);
    }
    
    
    
    
}
