/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Pooja Narasimhan
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Auditor.getValue())){
            organization = new AuditorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Manager.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Supervisor.getValue())){
            organization = new SupervisorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Technicians.getValue())){
            organization = new TechnicianOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    
}
