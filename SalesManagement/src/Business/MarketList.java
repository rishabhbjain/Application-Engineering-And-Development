/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UserInterface.Administrator.CustomerJPanel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabhjain
 */
public class MarketList {
    private ArrayList<Market> marketList;
    
    public MarketList() {
        this.marketList = new ArrayList();
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(ArrayList<Market> marketList) {
        this.marketList = marketList;
    }
            
    public Market addMarket() {
        Market market = new Market();
        marketList.add(market);
        return market;
    }
    
    public Market searchMarket(int customerid) {
        for(Market market:marketList) {
            if(market.getCustomer().getCustomerId() == customerid ) {
                return market;
            }
        }
        return null;
    }
    
     public void deleteMarket(Market market) {
        marketList.remove(market);
    }
    
    public void displayCsv()
    {
        String csvFile="src/Business/customer.csv";
        String line =" ";
         String cvsSplitBy = ",";
         try(BufferedReader bf = new BufferedReader(new FileReader(csvFile))){
            while((line = bf.readLine())!=null)
             {  
                 String Data[] = line.split(cvsSplitBy);
                 Market market = this.addMarket();
                 market.setMarketType(Data[3]);
                 //Customer customer = market.getCustomerList().addCustomer();
                 market.getCustomer().setCustomerId(Integer.parseInt(Data[0]));
                 market.getCustomer().setCustomerName(Data[1]);
                 market.getCustomer().setEmailAddress(Data[2]);
             }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
                 Logger.getLogger(CustomerJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                       
    }  
    
}
