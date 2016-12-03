/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EBillPayment;

import java.util.Date;

/**
 *
 * @author Pooja Narasimhan
 */
public class EBill {
    
    private int billNumber;
    private int costPerWatt;
    private int wattUsed;
    private  int amount;
    private String date;
    private String dueDate;
    private int fineAmount;
    private String status;
    private String paymentDate;
    private static int count=1000;

    @Override
    public String toString() {
        return String.valueOf(billNumber);
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public EBill(){
        billNumber =count;
        count++;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public int getCostPerWatt() {
        return costPerWatt;
    }

    public void setCostPerWatt(int costPerWatt) {
        this.costPerWatt = costPerWatt;
    }

    public int getWattUsed() {
        return wattUsed;
    }

    public void setWattUsed(int wattUsed) {
        this.wattUsed = wattUsed;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
        this.fineAmount = fineAmount;
    }
    
    
    
    
}
