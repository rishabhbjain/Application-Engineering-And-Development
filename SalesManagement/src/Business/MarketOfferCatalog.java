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
public class MarketOfferCatalog {
     private ArrayList<MarketOffer> marketOfferList;
    public MarketOfferCatalog() {
        this.marketOfferList = new ArrayList();
    }

    public ArrayList<MarketOffer> getMarketOfferList() {
        return marketOfferList;
    }

    public void setMarketOfferList(ArrayList<MarketOffer> marketOfferList) {
        this.marketOfferList = marketOfferList;
    }
    
    public MarketOffer addMarketOffer() {
        MarketOffer marketoffer = new MarketOffer();
        marketOfferList.add(marketoffer);
        return marketoffer;
    }
    
    public void deleteMarketOffer(MarketOffer marketoffer) {
        marketOfferList.remove(marketoffer);
    }
    
    
  /*  
    public MarketOffer searchMarketOffer(String marketType) {
        for(MarketOffer marketoffer:marketOfferList) {
            if(marketoffer.getMarketType().equalsIgnoreCase(marketType)) {
                return marketoffer;
            }
        }
        return null;
    }
*/
}
