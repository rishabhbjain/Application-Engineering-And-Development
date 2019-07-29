/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Vaccine.VaccineDirectory;

/**
 *
 * @author rishabhjain
 */
public class Inventory {
    private String name;
    private VaccineDirectory vaccinedirectory;
    private int quantity;

    public Inventory() {
        
        vaccinedirectory = new VaccineDirectory();
    }

    public VaccineDirectory getVaccinedirectory() {
        return vaccinedirectory;
    }

    public void setVaccinedirectory(VaccineDirectory vaccinedirectory) {
        this.vaccinedirectory = vaccinedirectory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
