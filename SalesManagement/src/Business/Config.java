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
public class Config{
    public static Business Initialize(){
        Business business = new Business();
        
        //supplier1
        SupplierDirectory spd = business.getSuplierdirectory();
        Supplier sup = spd.addSupplier();
        sup.setSupplierName("Dell");
        sup.setSupplierID(1);
        sup.setContactNo(666661);
        
        //product1-educational
        Product p = sup.getProductcatalog().addProduct();
        p.setProductName("ProductA1");
        p.setProductQuantity(20);
        p.setProductId("A1");
        p.setProductDescription("XXXA1");
        
        MarketOffer mo = p.getMarketOffer();
        mo.setFloorPrice(5);
        mo.setCeilingPrice(15);
        mo.setActualPrice(8);
        mo.setMarketType("Educational");
        //Market market = business.getMarketlist().addMarket();
        //market.setMarketType("Educational");
        
        //System.out.println(market.getMarketType());
        
        //product1-financial
        Product p1 = sup.getProductcatalog().addProduct();
        p1.setProductName("ProductA1");
        p1.setProductQuantity(20);
        p1.setProductId("A1");
        p1.setProductDescription("XXXA1");
        
        MarketOffer mo1 = p1.getMarketOffer();
        mo1.setFloorPrice(7);
        mo1.setCeilingPrice(17);
        mo1.setActualPrice(8);
        mo1.setMarketType("Financial");
        //Market market1 = business.getMarketlist().addMarket();
        //market1.setMarketType("Financial");
        
        //System.out.println(market1.getMarketType());
        
        //product2-educational
        Product p2 = sup.getProductcatalog().addProduct();
        p2.setProductName("ProductA2");
        p2.setProductQuantity(20);
        p2.setProductId("A2");
        p2.setProductDescription("XXXA2");
        
        MarketOffer mo2 = p2.getMarketOffer();
        mo2.setFloorPrice(15);
        mo2.setCeilingPrice(25);
        mo2.setActualPrice(18);
        mo2.setMarketType("Educational");
        //Market market2 = business.getMarketlist().addMarket();
        //market2.setMarketType("Educational");
        
        //System.out.println(market2.getMarketType());
        
        //product2-financial
        Product p3 = sup.getProductcatalog().addProduct();
        p3.setProductName("ProductA2");
        p3.setProductQuantity(20);
        p3.setProductId("A2");
        p3.setProductDescription("XXXA2");
        
        MarketOffer mo3 = p3.getMarketOffer();
        mo3.setFloorPrice(17);
        mo3.setCeilingPrice(27);
        mo3.setActualPrice(18);
        mo3.setMarketType("Financial");
        //Market market3 = business.getMarketlist().addMarket();
        //market3.setMarketType("Financial");
        
        //System.out.println(market3.getMarketType());
        
        //product3-educational
        Product p4 = sup.getProductcatalog().addProduct();
        p4.setProductName("ProductA3");
        p4.setProductQuantity(20);
        p4.setProductId("A3");
        p4.setProductDescription("XXXA3");
        
        MarketOffer mo4 = p4.getMarketOffer();
        mo4.setFloorPrice(25);
        mo4.setCeilingPrice(35);
        mo4.setActualPrice(28);
        mo4.setMarketType("Educational");
        //Market market4 = business.getMarketlist().addMarket();
        //market4.setMarketType("Educational");
        
        //System.out.println(market4.getMarketType());
        
        //product3-financial
        Product p5 = sup.getProductcatalog().addProduct();
        p5.setProductName("ProductA3");
        p5.setProductQuantity(20);
        p5.setProductId("A3");
        p5.setProductDescription("XXXA3");
        
        MarketOffer mo5 = p5.getMarketOffer();
        mo5.setFloorPrice(27);
        mo5.setCeilingPrice(37);
        mo5.setActualPrice(28);
        mo5.setMarketType("Financial");
        //Market market5 = business.getMarketlist().addMarket();
        //market5.setMarketType("Financial");
        
        //System.out.println(market5.getMarketType());
        
        //product4-educational
        Product p6 = sup.getProductcatalog().addProduct();
        p6.setProductName("ProductA4");
        p6.setProductQuantity(20);
        p6.setProductId("A4");
        p6.setProductDescription("XXXA4");
        
        MarketOffer mo6 = p6.getMarketOffer();
        mo6.setFloorPrice(35);
        mo6.setCeilingPrice(45);
        mo6.setActualPrice(38);
        mo6.setMarketType("Educational");
        //Market market6 = business.getMarketlist().addMarket();
        //market6.setMarketType("Educational");
        
        //System.out.println(market6.getMarketType());
        
        //product4-Financial
        Product p7 = sup.getProductcatalog().addProduct();
        p7.setProductName("ProductA4");
        p7.setProductQuantity(20);
        p7.setProductId("A4");
        p7.setProductDescription("XXXA4");
        
        MarketOffer mo7 = p7.getMarketOffer();
        mo7.setFloorPrice(37);
        mo7.setCeilingPrice(47);
        mo7.setActualPrice(38);
        mo7.setMarketType("Financial");
        //Market market7 = business.getMarketlist().addMarket();
        //market7.setMarketType("Financial");
        
        //System.out.println(market7.getMarketType());
        
        
        //product5-educational
        Product p8 = sup.getProductcatalog().addProduct();
        p8.setProductName("ProductA5");
        p8.setProductQuantity(20);
        p8.setProductId("A5");
        p8.setProductDescription("XXXA5");
        
        MarketOffer mo8 = p8.getMarketOffer();
        mo8.setFloorPrice(45);
        mo8.setCeilingPrice(55);
        mo8.setActualPrice(48);
        mo8.setMarketType("Educational");
        //Market market8 = business.getMarketlist().addMarket();
        //market8.setMarketType("Educational");
        
        //System.out.println(market8.getMarketType());
        
        //product5-Financial
        Product p9 = sup.getProductcatalog().addProduct();
        p9.setProductName("ProductA5");
        p9.setProductQuantity(20);
        p9.setProductId("A5");
        p9.setProductDescription("XXXA5");
        
        MarketOffer mo9 = p9.getMarketOffer();
        mo9.setFloorPrice(47);
        mo9.setCeilingPrice(57);
        mo9.setActualPrice(48);
        mo9.setMarketType("Financial");
        //Market market9 = business.getMarketlist().addMarket();
        //market9.setMarketType("Financial");
        
        //System.out.println(market9.getMarketType());
        
        //supplier2
        SupplierDirectory spd1 = business.getSuplierdirectory();
        Supplier sup1 = spd1.addSupplier();
        sup1.setSupplierName("HP");
        sup1.setSupplierID(2);
        sup1.setContactNo(666662);
        
        //product1-educational
        Product p10 = sup1.getProductcatalog().addProduct();
        p10.setProductName("ProductB1");
        p10.setProductQuantity(20);
        p10.setProductId("B1");
        p10.setProductDescription("XXXB1");
        
        MarketOffer mo10 = p10.getMarketOffer();
        mo10.setFloorPrice(55);
        mo10.setCeilingPrice(65);
        mo10.setActualPrice(58);
        mo10.setMarketType("Educational");
        //Market market10 = business.getMarketlist().addMarket();
        //market10.setMarketType("Educational");
        
        //System.out.println(market10.getMarketType());
        
        //product1-financial
        Product p11 = sup1.getProductcatalog().addProduct();
        p11.setProductName("ProductB1");
        p11.setProductQuantity(20);
        p11.setProductId("B1");
        p11.setProductDescription("XXXB1");
        
        MarketOffer mo11 = p11.getMarketOffer();
        mo11.setFloorPrice(57);
        mo11.setCeilingPrice(67);
        mo11.setActualPrice(58);
        mo11.setMarketType("Financial");
        //Market market11 = business.getMarketlist().addMarket();
        //market11.setMarketType("Financial");
        
        //System.out.println(market11.getMarketType());
        
        //product2-educational
        Product p12 = sup1.getProductcatalog().addProduct();
        p12.setProductName("ProductB2");
        p12.setProductQuantity(20);
        p12.setProductId("B2");
        p12.setProductDescription("XXXB2");
        
        MarketOffer mo12 = p12.getMarketOffer();
        mo12.setFloorPrice(65);
        mo12.setCeilingPrice(75);
        mo12.setActualPrice(68);
        mo12.setMarketType("Educational");
        //Market market12 = business.getMarketlist().addMarket();
        //market12.setMarketType("Educational");
        
        //System.out.println(market12.getMarketType());
        
        //product2-financial
        Product p13 = sup1.getProductcatalog().addProduct();
        p13.setProductName("ProductB2");
        p13.setProductQuantity(20);
        p13.setProductId("B2");
        p13.setProductDescription("XXXB2");
        
        MarketOffer mo13 = p13.getMarketOffer();
        mo13.setFloorPrice(67);
        mo13.setCeilingPrice(77);
        mo13.setActualPrice(68);
        mo13.setMarketType("Financial");
        //Market market13 = business.getMarketlist().addMarket();
        //market13.setMarketType("Financial");
        
        //System.out.println(market13.getMarketType());
        
        //product3-educational
        Product p14 = sup1.getProductcatalog().addProduct();
        p14.setProductName("ProductB3");
        p14.setProductQuantity(20);
        p14.setProductId("B3");
        p14.setProductDescription("XXXB3");
        
        MarketOffer mo14 = p14.getMarketOffer();
        mo14.setFloorPrice(75);
        mo14.setCeilingPrice(85);
        mo14.setActualPrice(78);
        mo14.setMarketType("Educational");
        //Market market14 = business.getMarketlist().addMarket();
        //market14.setMarketType("Educational");
        
        //System.out.println(market14.getMarketType());
        
        //product3-financial
        Product p15 = sup1.getProductcatalog().addProduct();
        p15.setProductName("ProductB3");
        p15.setProductQuantity(20);
        p15.setProductId("B3");
        p15.setProductDescription("XXXB3");
        
        MarketOffer mo15 = p15.getMarketOffer();
        mo15.setFloorPrice(77);
        mo15.setCeilingPrice(87);
        mo15.setActualPrice(78);
        mo15.setMarketType("Financial");
        //Market market15 = business.getMarketlist().addMarket();
        //market15.setMarketType("Financial");
        
        //System.out.println(market15.getMarketType());
        
        //product4-educational
        Product p16 = sup1.getProductcatalog().addProduct();
        p16.setProductName("ProductB4");
        p16.setProductQuantity(20);
        p16.setProductId("B4");
        p16.setProductDescription("XXXB4");
        
        MarketOffer mo16 = p16.getMarketOffer();
        mo16.setFloorPrice(85);
        mo16.setCeilingPrice(95);
        mo16.setActualPrice(88);
        mo16.setMarketType("Educational");
        //Market market16 = business.getMarketlist().addMarket();
        //market16.setMarketType("Educational");
        
        //System.out.println(market16.getMarketType());
        
        //product4-Financial
        Product p17 = sup1.getProductcatalog().addProduct();
        p17.setProductName("ProductB4");
        p17.setProductQuantity(20);
        p17.setProductId("B4");
        p17.setProductDescription("XXXB4");
        
        MarketOffer mo17 = p17.getMarketOffer();
        mo17.setFloorPrice(87);
        mo17.setCeilingPrice(97);
        mo17.setActualPrice(88);
        mo17.setMarketType("Financial");
        //Market market17 = business.getMarketlist().addMarket();
        //market17.setMarketType("Financial");
        
        //System.out.println(market17.getMarketType());
        
        
        //product5-educational
        Product p18 = sup1.getProductcatalog().addProduct();
        p18.setProductName("ProductB5");
        p18.setProductQuantity(20);
        p18.setProductId("B5");
        p18.setProductDescription("XXXB5");
        
        MarketOffer mo18 = p18.getMarketOffer();
        mo18.setFloorPrice(95);
        mo18.setCeilingPrice(105);
        mo18.setActualPrice(98);
        mo18.setMarketType("Educational");
     //   Market market18 = business.getMarketlist().addMarket();
     //   market18.setMarketType("Educational");
        
      //  System.out.println(market18.getMarketType());
        
        //product5-Financial
        Product p19 = sup1.getProductcatalog().addProduct();
        p19.setProductName("ProductB5");
        p19.setProductQuantity(20);
        p19.setProductId("B5");
        p19.setProductDescription("XXXB5");
        
        MarketOffer mo19 = p19.getMarketOffer();
        mo19.setFloorPrice(97);
        mo19.setCeilingPrice(107);
        mo19.setActualPrice(98);
        mo19.setMarketType("Financial");
        //Market market19 = business.getMarketlist().addMarket();
        //market19.setMarketType("Financial");
                
        //System.out.println(market19.getMarketType());
        
        return business;
    }
}