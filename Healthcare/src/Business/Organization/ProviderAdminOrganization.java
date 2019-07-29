/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClinicRole;
import Business.Role.ProviderAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class ProviderAdminOrganization extends Organization {
    public ProviderAdminOrganization() {
        super(Organization.Type.ProviderAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderAdmin());
        return roles;
    }
}
