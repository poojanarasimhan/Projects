/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue1;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Pooja Narasimhan
 */
public class WorkRequest1 {
    
   private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String AddLine1;
    private String AddLine2;
    
    private int zipCode;

    @Override
    public String toString() {
        return AddLine1 ;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddLine1() {
        return AddLine1;
    }

    public void setAddLine1(String AddLine1) {
        this.AddLine1 = AddLine1;
    }

    public String getAddLine2() {
        return AddLine2;
    }

    public void setAddLine2(String AddLine2) {
        this.AddLine2 = AddLine2;
    }

    

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    
    
}
