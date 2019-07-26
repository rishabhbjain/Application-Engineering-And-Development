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
public class ConfigureABusiness {
    public static Business Initialize () {
        Business b = new Business();
        
        PersonDirectory pd = b.getPersondirectory();
        Person p = pd.addPerson();
        p.setFirstName("firstname");
        p.setLastName("lastname");
        int a = 000000000;
        p.setSSN(a);
        
        UserAccount ua = p.addUserAccount();
        
       //Person p2 = pd.searchPerson("rishabh");
        
        //if(p2 != null) {
        //
        ua.setUsername("username");
        ua.setPassword("password");
        ua.setRole("SystemAdmin");
        ua.setAccountstatus("Active");
    //}
                
 return b;   
 
} 
}

