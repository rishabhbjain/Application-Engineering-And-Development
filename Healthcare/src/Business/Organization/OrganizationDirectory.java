/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class OrganizationDirectory {
   private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
     public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Organization.Type.Inventory.getValue())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }

        if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.CDCAdmin.getValue())){
            organization = new CDCAdminOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.StateDepartmentOfPublicHealthAdmin.getValue())){
            organization = new StateDepartmentAdminOrganization();
            organizationList.add(organization);
        } 
        if (type.getValue().equals(Organization.Type.DistributorAdmin.getValue())){
            organization = new DistributorAdminOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.HospitalAdmin.getValue())){
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.ManufacturerAdmin.getValue())){
            organization = new ManufacturerAdminOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.ProviderAdmin.getValue())){
            organization = new ProviderAdminOrganization();
            organizationList.add(organization);
        } 
        if (type.getValue().equals(Organization.Type.Clinic.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }
        return organization;
    } 
    
    
   
}
