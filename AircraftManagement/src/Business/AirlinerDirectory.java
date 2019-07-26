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
public class AirlinerDirectory {
    private ArrayList<Airliner> airlinerList;

    public AirlinerDirectory()
    {
        this.airlinerList = new ArrayList<Airliner>();
      
        
    }   
    
    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }
 
    public Airliner addAirliner() {
       Airliner airliner = new Airliner();
       airlinerList.add(airliner);
       return airliner;
    }
         
    public void deleteAirliner(Airliner airliner) {
        airlinerList.remove(airliner);
    }
            
    
    public Airliner searchAirliner(String airlinername){
        for(Airliner airliner:airlinerList) {
            if(airliner.getAirlinername().equalsIgnoreCase(airlinername)) {
                return airliner;
            }
        }
        return null;
    }
    
}
