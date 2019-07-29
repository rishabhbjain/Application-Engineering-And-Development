/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;

/**
 *
 * @author rishabhjain
 */
public class ConfigASystem {
    
     public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Network network = system.getNetworkDirectory().createAndAddNetwork("Massachusetts");
      //  network.setPopulation(10000);

        Employee employee = system.getEmployeeDirectory().createEmployee("Rishabh Jain");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sys", "sys", employee, new SystemAdminRole());

       // Employee employee1 = system.getEmployeeDirectory().createEmployee("Jenil");
      //  UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("jj", "jj", employee1, new NationalDistributorAdminRole());

      //  Vaccine vaccine = system.getVaccineDirectory().addVaccine(1, "Influenza", "Flu", (float) 11.99, "08-May-2014", "01-May-2016");
      //  Vaccine vaccine1 = system.getVaccineDirectory().addVaccine(2, "Varicella", "Chicken Pox", (float) 10, "12-May-2014", "12-May-2016");

      //  InventoryItem item = network.getInventoryDirectory().addInventory(network, vaccine, 500);
      //  item.setAvailability(500);

     //   InventoryItem item1 = network.getInventoryDirectory().addInventory(network, vaccine1, 250);
    //    item1.setAvailability(250);

        return system;
    }
    
}
