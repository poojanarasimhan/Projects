/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Payment.CardDetailsList;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue1.WorkQueue1;

/**
 *
 * @author Pooja Narasimhan
 */
public class UserAccount {
     private String username;
    private String password;
    private Employee employee;
    private Role role;
    private CardDetailsList cardDetailsList;
    private WorkQueue workQueue;
    private WorkQueue1 workQueue1;

    public WorkQueue1 getWorkQueue1() {
        return workQueue1;
    }

    public void setWorkQueue1(WorkQueue1 workQueue1) {
        this.workQueue1 = workQueue1;
    }
    

    public UserAccount() {
        workQueue = new WorkQueue();
        workQueue1 = new WorkQueue1();
        cardDetailsList = new CardDetailsList();
    }

    public CardDetailsList getCardDetailsList() {
        return cardDetailsList;
    }

    public void setCardDetailsList(CardDetailsList cardDetailsList) {
        this.cardDetailsList = cardDetailsList;
    }

    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
}
