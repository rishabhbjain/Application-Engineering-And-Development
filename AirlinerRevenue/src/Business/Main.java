/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class Main {
    public static void main(String[] args)
    {
        
        String csvFile ="src/Business/assgn3.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        TravelAgency travelagency = new TravelAgency();
        ArrayList<Fleet> fl=new ArrayList<Fleet>();
        //
        ArrayList<Person> p = new ArrayList<Person>();
        try
        {
        br = new BufferedReader(new FileReader(csvFile));
        System.out.println("----------------------->Welcome to Travel Agency<--------------------");
        
        TravelAgency ta=new TravelAgency();
        while((line = br.readLine()) != null)
        {
        String[] element = line.split(cvsSplitBy);
        String airlinename = element[0];
        String airplanename = element[1];
        String departtime = element[2];
        String departdate = element[3];
        String airport = element[4];
        int seatprice = Integer.parseInt(element[5]);
        String seattype = element[6];
        String seatno = element[7];
        String flightno = element[8];
        String personname = element[9];
        //Seat
        Seat s = new Seat();
        s.setSeatnumber(seatno);
        s.setSeatprice(seatprice);
        s.setSeattype(seattype);
        //Person
        Person person=new Person();
        person.setPersonname(personname);
        s.setPerson(person);
        //Flight
        Flight f = new Flight();
        f.setFlightnumber(flightno);
        f.setSeat(s);
        //Airplane
        Airplane ar = new Airplane();
        ar.setAirplanename(airplanename);
        ar.setFlight(f);
        //Fleet
        Fleet fleet = new Fleet();
        fleet.addAirplane(ar);
        //Airliner
        Airliner airliner = new Airliner();
        fl.add(fleet);
        airliner.setFleet(fl);
        airliner.setAirlinername(airlinename);
         //CustomerDirectory
        CustomerDirectory customerdirectory = new CustomerDirectory();
        p.add(person);
        customerdirectory.setPerson(p); 
        //TravelAgency
        
        travelagency=ta;
        ta.addAirliner(airliner);
        ta.addCustomer(customerdirectory);
        }
        
        int price=0;
        for (int i=0;i<ta.getAirlineList().size();i++){
            for(int j=0;j<ta.getAirlineList().get(i).getFleet().size();j++){
                for(int k=0;k<ta.getAirlineList().get(i).getFleet().get(j).getFleet().size();k++){
         System.out.println();
        System.out.println("Airline Name: "+ta.getAirlineList().get(j).getAirlinername());
        System.out.println("Airplane Name: "+ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getAirplanename());
        System.out.println("Flight Number: "+ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getFlightnumber());
        ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().setFlightRevenue(ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getFlightRevenue()+ta.getAirlineList().get(i).getFleet().get(i).getFleet().get(i).getFlight().getSeat().getSeatprice());
        System.out.println("Seat Price: "+ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeatprice());
        price=price+ta.getAirlineList().get(j).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeatprice();
        System.out.println("Seat Type: "+ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeattype());
        System.out.println("Seat Number: "+ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeatnumber());
        System.out.println("Person Name: "+ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getPerson().getPersonname());
         System.out.println();
        
        }
        
        }
       break;
       
    }
    
        int frevenue100=0;
        int frevenue111=0;
        int frevenue112=0;
        int emirates = 0;
        int qatar=0;
        int Delta = 0;
         for (int i=0;i<ta.getAirlineList().size();i++){
        for(int j=0;j<ta.getAirlineList().get(i).getFleet().size();j++){
        for(int k=0;k<ta.getAirlineList().get(i).getFleet().get(j).getFleet().size();k++){
        if((ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getFlightnumber()).equals("100"))
        {
            frevenue100=frevenue100+ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeatprice();
        }
        if((ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getFlightnumber()).equals("111"))
        {
            frevenue111=frevenue111+ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeatprice();
        }
         if((ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getFlightnumber()).equals("112"))
        {
            frevenue112=frevenue112+ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeatprice();
        }
        if(ta.getAirlineList().get(j).getAirlinername().equals("emirates"))
        {
         emirates = emirates +ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeatprice();   
        }
        if(ta.getAirlineList().get(j).getAirlinername().equals("qatar"))
        {
         qatar = qatar +ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeatprice();   
        }
        if(ta.getAirlineList().get(j).getAirlinername().equals("Delta"))
        {
         Delta = Delta +ta.getAirlineList().get(i).getFleet().get(j).getFleet().get(k).getFlight().getSeat().getSeatprice();   
        }
        }
        } break;
        }
         
            System.out.println("-----------REVENUE PER FLIGHT----------");
            System.out.println();
         System.out.println("Flight Revenue for flight 100: "+frevenue100);
            System.out.println();
          System.out.println("Flight Revenue for flight 111: "+frevenue111);
           System.out.println();
          System.out.println("Flight Revenue for flight 112: "+frevenue112);
          System.out.println();
          System.out.println("----------REVENUE PER AIRLINER----------");
           System.out.println();
          System.out.println("EMIRATES REVENUE   "  +emirates);
          System.out.println();
          System.out.println("QATAR REVENUE   "  +qatar);
           System.out.println();
          System.out.println("DELTA REVENUE   " +Delta);
          System.out.println();
            System.out.println("----------TOTAL REVENUE----------");
            System.out.println();
           System.out.println("TOTAL REVENUE GENERATED FOR ALL FLIGHTs BY ALL AIRLINER   "+price);
       
        
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        finally {
            if(br != null){
               try {
                   br.close();     
                }catch(IOException e){
                   e.printStackTrace();
                }
            }
            
           
       }
        
    }      
  
    }


