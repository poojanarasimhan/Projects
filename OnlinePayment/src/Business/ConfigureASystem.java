/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdmin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Pooja Narasimhan
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();      
        
        Employee employee = system.getEmployeeDirectory().createEmployee();
        employee.setName("Pooja");
                            employee.setAge(10);
                            employee.setMailId("narasimhan.po@husky.neu.edu");
                            employee.setAddressLine1("693c parker street");
                            employee.setAddressLine2("Boston");
                            employee.setZipCode(Integer.parseInt("02120"));
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "YyW6yaxjtcDopMI8nC2vKQ==", employee, new SystemAdmin());
        
        return system;
        
    }
    
}
