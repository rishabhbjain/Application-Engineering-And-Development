/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Details;

/**
 *
 * @author rishabhjain
 */
public class Person {
    
    public String personFname; 
    public String personLname;
    public String personGender;
    public String personContact;
    public String personEmailid;
    public String image;
    
    public Account account;
     public Address address;
    public License license;
    public CreditCard credit;
    
    public String getPersonFname() {
        return personFname;
    }

    public void setPersonFname(String personFname) {
        this.personFname = personFname;
    }

    public String getPersonLname() {
        return personLname;
    }

    public void setPersonLname(String personLname) {
        this.personLname = personLname;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public String getPersonContact() {
        return personContact;
    }

    public void setPersonContact(String personContact) {
        this.personContact = personContact;
    }

    public String getPersonEmailid() {
        return personEmailid;
    }

    public void setPersonEmailid(String personEmailid) {
        this.personEmailid = personEmailid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public CreditCard getCredit() {
        return credit;
    }

    public void setCredit(CreditCard credit) {
        this.credit = credit;
    }
   

    public String getAddLine1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    
   
    
      
}
