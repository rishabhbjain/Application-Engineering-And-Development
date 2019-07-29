/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinic;

import Business.Staff.Staff;

/**
 *
 * @author rishabhjain
 */
public class Clinic {
    private String name;
    private int id;
    private static int count = 1;
    private Staff staff;

    public Clinic() {
        id = count;
        count++;
        staff = new Staff();
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

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
     
}
