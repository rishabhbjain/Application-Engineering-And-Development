package Business;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rishabhjain
 */
public class CustomerDirectory {
 
    private ArrayList<Person> person;
    
    public CustomerDirectory()
    {
        person = new ArrayList<>();
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }
    
    public Person addPerson()
    {
       Person pr = new Person();
       person.add(pr);
       return pr;
    }
    
    
    
}
