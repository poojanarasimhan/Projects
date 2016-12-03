/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.EBillPayment.EBill;
import Business.EBillPayment.eBillDirectory;

/**
 *
 * @author raunak
 */
public class Employee {
    
   private String name;
   private int id;
    private String mailId;
    private int age;
    private String country;
    private String addressLine1;
    private String addressLine2;
    private int zipCode;
    private String type;
    private eBillDirectory eBillDirectory;


    public Employee() {
        eBillDirectory = new eBillDirectory();
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    
   

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public eBillDirectory geteBillDirectory() {
        return eBillDirectory;
    }

    public void seteBillDirectory(eBillDirectory eBillDirectory) {
        this.eBillDirectory = eBillDirectory;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

   
    
}
