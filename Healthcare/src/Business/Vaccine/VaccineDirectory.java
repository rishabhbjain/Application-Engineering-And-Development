/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class VaccineDirectory {

    private ArrayList<Vaccine> vaccineList;

    public VaccineDirectory() {
        vaccineList = new ArrayList<Vaccine>();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

    public Vaccine addVaccine( String name, String diseaseName,int vaccinequantity) {
        Vaccine vaccine = new Vaccine();
        vaccine.setVaccineName(name);
        vaccine.setDiseaseName(diseaseName);
        vaccine.setVaccineqty(vaccinequantity);
        vaccineList.add(vaccine);
        return vaccine;
    }

    public void removeVaccine(Vaccine vaccine) {
        vaccineList.remove(vaccine);
    }
}
