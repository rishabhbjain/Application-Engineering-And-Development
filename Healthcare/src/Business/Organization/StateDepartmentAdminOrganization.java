/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClinicRole;
import Business.Role.Role;
import Business.Role.StateDepartmentofPublicHealthAdmin;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class StateDepartmentAdminOrganization extends Organization{
    public StateDepartmentAdminOrganization() {
        super(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StateDepartmentofPublicHealthAdmin());
        return roles;
    }
}
