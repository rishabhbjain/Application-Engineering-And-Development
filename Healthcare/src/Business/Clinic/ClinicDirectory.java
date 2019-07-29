/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinic;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class ClinicDirectory {
    private ArrayList<Clinic> clinicList;

    public ClinicDirectory() {
        clinicList = new ArrayList<>();
    }

    public ArrayList<Clinic> getClinicList() {
        return clinicList;
    }
    
    public Clinic createClinic(String name){
        Clinic clinic = new Clinic();
        clinic.setName(name);
        clinicList.add(clinic);
        return clinic;
    }
}
