/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class StateDeptOfPublicHealthEnterprise extends Enterprise {
     public StateDeptOfPublicHealthEnterprise(String name) {
        super(name, EnterpriseType.StateDeptOfPublicHealth);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<Role>();
    roles.add(new AdminRole());
    return roles;
    }
    
}
