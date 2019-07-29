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
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import UserInterface.Provider.ProviderAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class ProviderAdmin extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ProviderAdminWorkAreaJPanel(userProcessContainer, enterprise,business);
    }  
}
