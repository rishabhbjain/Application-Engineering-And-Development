/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import static Business.Organization.Organization.Type.CDCAdmin;
import Business.Role.CDCAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class CDCAdminOrganization extends Organization{
    public CDCAdminOrganization() {
        super(Organization.Type.CDCAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCAdmin());
        return roles;
    }
}
