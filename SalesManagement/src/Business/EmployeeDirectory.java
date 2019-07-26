/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UserInterface.Administrator.SalespersonJPanel;
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
public class EmployeeDirectory {
    private ArrayList<SalesPerson> salesPersonList;
    
    public EmployeeDirectory() {
        this.salesPersonList = new ArrayList();
    }

    public ArrayList<SalesPerson> getSalesPersonList() {
        return salesPersonList;
    }

    public void setSalesPersonList(ArrayList<SalesPerson> salesPersonList) {
        this.salesPersonList = salesPersonList;
    }
            
    public SalesPerson addSalesPerson() {
        SalesPerson salesperson= new SalesPerson();
        salesPersonList.add(salesperson);
        return salesperson;
    }
    
    public void deleteSalesPerson(SalesPerson salesPerson) {
        salesPersonList.remove(salesPerson);
    }
    
    public SalesPerson searchSalesPerson(int salesPersonId) {
        for(SalesPerson salesperson:salesPersonList) {
            if(salesperson.getSalesPersonId() == salesPersonId) {
                return salesperson;
            }
        }
        return null;
    }
    
    
    
    public void displayCsv()
    {
        String csvFile="src/Business/salespersons.csv";
        String line =" ";
        int count = 0;
         String cvsSplitBy = ",";
         try(BufferedReader bf = new BufferedReader(new FileReader(csvFile))){
            while((line = bf.readLine())!=null)
             {
                 count++;
                 String Data[] = line.split(cvsSplitBy);
                 SalesPerson sp =this.addSalesPerson();
                 sp.setSalesPersonId(Integer.parseInt(Data[0]));
                 sp.setSalesPersonName(Data[1]);
                 sp.setSalesPersonUsername(Data[2]);
                 sp.setSalesPersonPassword(Data[3]);
             }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(SalespersonJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
                 Logger.getLogger(SalespersonJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
        System.out.println(count);                  
    }  
    
}
