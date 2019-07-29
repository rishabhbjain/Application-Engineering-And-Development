/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Staff;

import Business.Employee.EmployeeDirectory;

/**
 *
 * @author rishabhjain
 */
public class Staff {
    private EmployeeDirectory empdirectory;
   
    private String name;
    private int id;
    private static int count = 1;
   

    public Staff() {
        id = count;
        count++;
        empdirectory = new EmployeeDirectory();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public EmployeeDirectory getEmpdirectory() {
        return empdirectory;
    }

    public void setEmpdirectory(EmployeeDirectory empdirectory) {
        this.empdirectory = empdirectory;
    }

    
    
    @Override
    public String toString() {
        return name;
    }
}
