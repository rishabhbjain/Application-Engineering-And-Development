/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rishabhjain
 */
public class UserAccount {
    
    private String username;
  //  private Person person;
    private String role;
    private String password;
    private String accountstatus;
    
    public UserAccount() {
        
    //    person = new Person();
        
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   // public Person getPerson() {
   //     return person;
   // }

   // public void setPerson(Person person) {
   //     this.person = person;
   // }

    public String getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String toString()
    {
        return username;
    }
    
    
    
    
}
