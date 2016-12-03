/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EBillPayment;

import java.util.ArrayList;

/**
 *
 * @author Pooja Narasimhan
 */
public class eBillDirectory {
    
    private ArrayList<EBill> eBillDirectory;
    
    public eBillDirectory(){
        eBillDirectory = new ArrayList<>();
    }

    public ArrayList<EBill> geteBillDirectory() {
        return eBillDirectory;
    }
    
    public EBill createEBill(){
        EBill  ebill = new EBill();
        eBillDirectory.add(ebill);
        return ebill;
                }
    
    
    
    
}
