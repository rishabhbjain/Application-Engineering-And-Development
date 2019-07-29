/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Staff.Staff;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rishabhjain
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private UserAccount userAccount;
    //private Staff staff;
    public Employee() {
        id = count;
        count++;
        userAccount = new UserAccount();
    //    staff = new Staff();
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
/*
    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
*/
    
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
