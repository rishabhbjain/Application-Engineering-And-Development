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
public class MasterTravelSchedule {
    private FlightSchedule flightschedule;
    
    public MasterTravelSchedule()
    {
        flightschedule = new FlightSchedule();
    }

    public FlightSchedule getFlightschedule() {
        return flightschedule;
    }

    public void setFlightschedule(FlightSchedule flightschedule) {
        this.flightschedule = flightschedule;
    }
    
    
}
