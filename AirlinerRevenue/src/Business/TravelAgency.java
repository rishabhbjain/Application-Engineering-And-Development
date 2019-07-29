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
public class TravelAgency {

    private ArrayList <Airliner> airlineList;
    private MasterTravelSchedule mastertravelschedule;
    private ArrayList <CustomerDirectory> customerList;
    
    public ArrayList<Airliner> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(ArrayList<Airliner> airlineList) {
        this.airlineList = airlineList;
    }
    
   

    public ArrayList<CustomerDirectory> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<CustomerDirectory> customerList) {
        this.customerList = customerList;
    }
    
     public MasterTravelSchedule getMastertravelschedule() {
        return mastertravelschedule;
    }

    public void setMastertravelschedule(MasterTravelSchedule mastertravelschedule) {
        this.mastertravelschedule = mastertravelschedule;
    }
    
    public TravelAgency(){
        airlineList=new ArrayList();
        customerList= new ArrayList();
    }

   
    
    public CustomerDirectory addCustomer(CustomerDirectory customerdir)
    {
        customerList.add(customerdir);
        return customerdir;
    }
    
    public Airliner addAirliner(Airliner airline){
        airlineList.add(airline);
        return airline;
    } 

}
