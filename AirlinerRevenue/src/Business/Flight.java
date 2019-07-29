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
public class Flight {
    private String flightnumber;
    private Seat seat;
    private int flightRevenue;

    public int getFlightRevenue() {
        return flightRevenue;
    }

    public void setFlightRevenue(int flightRevenue) {
        this.flightRevenue = flightRevenue;
    }
    
    public Flight()
    {
        seat =new Seat();
    }
    
    
    
    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }
    

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    
    
}
