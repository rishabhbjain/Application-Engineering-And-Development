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
public class Person {
    private String firstName;
    private String lastName;
    private int SSN;
   
    private ArrayList<UserAccount> listofuseraccount;

    public Person() {
        this.listofuseraccount=new ArrayList();
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    
    

    public ArrayList<UserAccount> getListofuseraccount() {
        return listofuseraccount;
    }

    public void setListofuseraccount(ArrayList<UserAccount> listofuseraccount) {
        this.listofuseraccount = listofuseraccount;
    }
    
    public UserAccount addUserAccount() {
        UserAccount useraccount = new UserAccount();
        listofuseraccount.add(useraccount);
        return useraccount;
    }
    
     public void deleteUserAccount(UserAccount useraccount) {
        listofuseraccount.remove(useraccount);
    }
    
    @Override
    public String toString() {
       return firstName; 
    }
}
