/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue1;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Pooja Narasimhan
 */
public class WorkQueue1 {
     private ArrayList<WorkRequest1> workRequestList1;
     
      public WorkQueue1() {
        workRequestList1 = new ArrayList<>();
    }

    public ArrayList<WorkRequest1> getWorkRequestList1() {
        return workRequestList1;
    }

    public void setWorkRequestList1(ArrayList<WorkRequest1> workRequestList1) {
        this.workRequestList1 = workRequestList1;
    }
     
    
}
