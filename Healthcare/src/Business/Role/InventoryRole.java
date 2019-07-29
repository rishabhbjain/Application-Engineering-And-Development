/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Inventory.ClinicRole.ClinicInventoryWorkAreaJPanel;
import UserInterface.Inventory.InventoryRole.InventoryWorkAreaJPanel;
import UserInterface.Inventory.ProviderRole.ProviderInventoryWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class InventoryRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if((String.valueOf(enterprise.getEnterpriseType())).equals("Hospital")){
            System.out.println("HospitalIN" +enterprise.getEnterpriseType());
        return new ClinicInventoryWorkAreaJPanel(userProcessContainer,enterprise,organization,account,business);
    } else  if((String.valueOf(enterprise.getEnterpriseType())).equals("Manufacturer")){
            System.out.println("ManufacturerIN" +enterprise.getEnterpriseType());
        return new ProviderInventoryWorkAreaJPanel(userProcessContainer,enterprise,organization,account,business);
    } else
           System.out.println("ALL" +enterprise.getEnterpriseType()); 
      return new InventoryWorkAreaJPanel(userProcessContainer,enterprise,organization,account,business);      
    }    
}
