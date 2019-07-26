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
public class UserAccountDirectory {
    private ArrayList<UserAccount> useraccountlist;

    public UserAccountDirectory() {
    
        useraccountlist = new ArrayList();
    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }

    public UserAccount addUserAccount() {
        UserAccount useraccount = new UserAccount();
        useraccountlist.add(useraccount);
        return useraccount;
    }
        
    public void deleteUserAccount(UserAccount useraccount) {
        useraccountlist.remove(useraccount);
    }

    public UserAccount searchUserAccount (String username) {
        for(UserAccount useraccount:useraccountlist) {
            if(useraccount.getUsername().equals(username)) {
                return useraccount;
            }   
        }
        return null;
    }

}
