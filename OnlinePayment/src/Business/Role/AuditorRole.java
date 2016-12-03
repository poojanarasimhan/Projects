/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AuditorRole.SystemAuditorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Pooja Narasimhan
 */
public class AuditorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SystemAuditorWorkAreaJPanel(container,account, organization, enterprise,system);
    }
}
