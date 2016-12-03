/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.IP;

import java.util.ArrayList;

/**
 *
 * @author Pooja Narasimhan
 */
public class IPList {
    private ArrayList<IP> listOfIP;
    
    public IPList() {
        listOfIP = new ArrayList<IP>();
    }

    public ArrayList<IP> getListOfIP() {
        return listOfIP;
    }

    public void setListOfIP(ArrayList<IP> listOfIP) {
        this.listOfIP = listOfIP;
    }
    
    public IP createIP() {
        IP ip = new IP();
        listOfIP.add(ip);
        return ip;
    }
}
