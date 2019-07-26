/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class PersonDirectory {
    private ArrayList<Person> personlist;
    
    public PersonDirectory() {
        this.personlist = new ArrayList();
    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }
    
    public Person addPerson() {
        Person person = new Person();
        personlist.add(person);
        return person;
    }
           
    public void deletePerson(Person person) {
        personlist.remove(person);
    }
    
    public Person searchPerson(String firstname) {
        for(Person person:personlist) {
            if(person.getFirstName().equalsIgnoreCase(firstname)) {
                return person;
            }
        }
        return null;
        
    }
    
}
