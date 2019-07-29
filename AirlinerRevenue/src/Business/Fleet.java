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
public class Fleet {
    
    private ArrayList<Airplane> fleet;

    public ArrayList<Airplane> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Airplane> fleet) {
        this.fleet = fleet;
    }
    public Fleet()
    {
        fleet = new ArrayList<>();
    }
    
    public Airplane addAirplane(Airplane ar)
    {
        fleet.add(ar);
        return ar;
    }
    
    
}
