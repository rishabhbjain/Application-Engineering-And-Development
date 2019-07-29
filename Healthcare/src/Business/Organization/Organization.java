/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.Staff.StaffDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.Vaccine.VaccineDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public abstract class Organization {
    
    private String name;
    private VaccineDirectory vaccineDirectory;
    private StaffDirectory staffDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
   
    private int organizationID;
    private static int counter;
    
    public enum Type{
       Admin("Admin Organization"), 
       Inventory("Inventory Organization"),
       Clinic("Clinic Organization"),
       CDCAdmin("CDCAdmin Organization"), StateDepartmentOfPublicHealthAdmin("StateDepartmentOfPublicHealthAdmin Organization"),
       DistributorAdmin("DistributorAdmin Organization"),HospitalAdmin("HospitalAdmin Organization"),
       ManufacturerAdmin("ManufacturerAdmin Organization"),ProviderAdmin("ProviderAdmin Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
  

    public Organization(String name) {
        this.name = name;
        vaccineDirectory = new VaccineDirectory();
        staffDirectory = new StaffDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public StaffDirectory getStaffDirectory() {
        return staffDirectory;
    }

    public void setStaffDirectory(StaffDirectory staffDirectory) {
        this.staffDirectory = staffDirectory;
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(VaccineDirectory vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
}
