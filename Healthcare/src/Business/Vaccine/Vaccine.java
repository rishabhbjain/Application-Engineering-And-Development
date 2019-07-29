/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

/**
 *
 * @author rishabhjain
 */
public class Vaccine {

   
    private String vaccineName;
    private String diseaseName;
    private int vaccineqty;

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public int getVaccineqty() {
        return vaccineqty;
    }

    public void setVaccineqty(int vaccineqty) {
        this.vaccineqty = vaccineqty;
    }
    

    @Override
    public String toString() {
        return vaccineName;
    }

}
