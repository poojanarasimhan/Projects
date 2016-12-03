/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.IP.IPList;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdmin;
import java.util.ArrayList;

/**
 *
 * @author Pooja Narasimhan
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private IPList iPList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
            
                    
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        iPList = new IPList();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public  IPList getiPList() {
        return iPList;
    }

    public void setiPList(IPList iPList) {
        this.iPList = iPList;
    }
    
    

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdmin());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {
        }

        return true;
    }
    
}
