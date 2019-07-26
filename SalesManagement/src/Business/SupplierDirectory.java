/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UserInterface.Administrator.SalespersonJPanel;
import UserInterface.Supplier.ManageSuppliersJPanel;
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
public class SupplierDirectory {    
    private ArrayList<Supplier> supplierlist;
    
    public SupplierDirectory() {
        this.supplierlist = new ArrayList();
    }

    public ArrayList<Supplier> getSupplierlist() {
        return supplierlist;
    }

    public void setSupplierlist(ArrayList<Supplier> supplierlist) {
        this.supplierlist = supplierlist;
    }
            
    public Supplier addSupplier() {
        Supplier supplier = new Supplier();
        supplierlist.add(supplier);
        return supplier;
    }
    
    public void deleteSupplier(Supplier supplier) {
        supplierlist.remove(supplier);
    }
    
    public Supplier searchSupplier(String SupplierName) {
        for(Supplier supplier:supplierlist) {
            if(supplier.getSupplierName().equalsIgnoreCase(SupplierName)) {
                return supplier;
            }
        }
        return null;
    }
 /*   
    public void displayCsv()
    {
        System.out.println("1");
        String csvFile="src/Business/SupplierDirectory.csv";
        String line =" ";
        int count = 0;
         String cvsSplitBy = ",";
         try(BufferedReader bf = new BufferedReader(new FileReader(csvFile))){
            while((line = bf.readLine())!=null)
             {
                 System.out.println("a");
               //  for(Supplier supplier:supplierlist){
                     
                     Supplier supplier = this.addSupplier();
                      count++;
                    String Data[] = line.split(cvsSplitBy);
                    supplier.setSupplierName(Data[0]);
                    System.out.println("3");
                    System.out.println("44"+supplier.getSupplierName());
                    supplier.setSupplierID(Integer.parseInt(Data[1]));
                    supplier.setContactNo(Integer.parseInt(Data[2]));        
                    for(Product product:supplier.getProductcatalog().getProductlist()){
                        Product product1 = supplier.getProductcatalog().addProduct();
                        product1.setProductName(Data[3]);
                        product1.setProductDescription(Data[4]);
                        product1.setProductQuantity(Integer.parseInt(Data[5]));
                        product1.getMarketOffer().setFloorPrice(Integer.parseInt(Data[6]));
                        product1.getMarketOffer().setCeilingPrice(Integer.parseInt(Data[7]));
                        product1.getMarketOffer().setActualPrice(Integer.parseInt(Data[8]));
                        product1.getMarketOffer().setTargetPrice(Integer.parseInt(Data[9]));
                        System.out.println(product.getProductName());
                    }
               
               //  }
                 
             }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(ManageSuppliersJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
                 Logger.getLogger(ManageSuppliersJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
        System.out.println(count);                  
    }  
*/
}

