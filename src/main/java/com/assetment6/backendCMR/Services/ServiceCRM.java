package com.assetment6.backendCMR.Services;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.assetment6.backendCMR.Entities.Contact;
import com.assetment6.backendCMR.Entities.OpportunitiesClient;
import com.assetment6.backendCMR.Entities.Users;

@Component
public class ServiceCRM {

    private ArrayList<Users> user;
    private ArrayList<OpportunitiesClient> opportClient;

    static int contUsers = 0;
    static int contOppCli = 0;
    static int contContac = 0;
    private Random r;
    
    
    public ServiceCRM() {
        this.user = new ArrayList<>();
        this.user.add(new Users(contUsers++, "Miguel", "migiorda", "usuario@solera.com", "bootcamp4"));
        this.opportClient = new ArrayList<>();
        this.opportClient.add( new OpportunitiesClient(contOppCli++, "Pepe", "Rodriguez", "ola@hola.com", "68686868", true, false, new ArrayList<>(), "123456789"));
        this.opportClient.add( new OpportunitiesClient(contOppCli++, "Pepe2", "Rodriguez2", "ola2@hola.com", "58686868", false, false, new ArrayList<>(), ""));
        this.opportClient.add( new OpportunitiesClient(contOppCli++, "Pepe3", "Rodriguez3", "ola3@hola.com", "48686868", true, false, new ArrayList<>(), "987654321"));
        this.opportClient.add( new OpportunitiesClient(contOppCli++, "Pepe4", "Rodriguez4", "ola4@hola.com", "78686868", false, false, new ArrayList<>(), ""));
        
        this.r = new Random();
    }
    


    public boolean login(String string, String string2) {
        boolean login = false;

        for(Users U:this.user) {
            if(string == U.getEmail() && string2 == U.getPassword()) login = true;
        }
        return login;
    }

    public boolean createUser(String string, String string2, String string3, String string4) {
        Users user1 = new Users(contUsers++, "Miguel", "migiorda", "usuario@solera.com", "bootcamp4");
        if (user.contains(user1)) return false;
        else user.add(user1);

        return true;
    }

    public ArrayList<OpportunitiesClient> showOpportunities() {
        ArrayList<OpportunitiesClient> opport = new ArrayList<>();
        for (OpportunitiesClient opp: this.opportClient) {
            if(!opp.getIsClient()) {
                opport.add(opp);
            }
        }
        return opport;
    }

    public ArrayList<OpportunitiesClient> showClientList() {
        ArrayList<OpportunitiesClient> client = new ArrayList<>();
        for (OpportunitiesClient cli: this.opportClient) {
            if(cli.getIsClient()) {
                client.add(cli);
            }
        }
        return client;
    }

    public OpportunitiesClient createClient(int id) {
        for(OpportunitiesClient opp: this.opportClient) {
            if(id == opp.getId()) {
                if(!opp.getIsClient()) {
                    opp.setIsClient(true);
                    int x = (int) (this.r.nextDouble()*100000000);
                    opp.setTaxCode(""+x);
                    return opp;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public OpportunitiesClient deleteClient(int id) {
        for(OpportunitiesClient cli: this.opportClient) {
            if(id == cli.getId()) {
                if(cli.getIsClient()) {
                    cli.setIsClient(false);
                    return cli;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public OpportunitiesClient addContact(Contact contact, int id) {
        for(OpportunitiesClient contactList: this.opportClient) {
            if(id == contactList.getId()) {
                contact.setId(contContac++);
                contactList.getContacts().add(contact);
                return contactList;
            }
        }
        return null;
    }

    public ArrayList<OpportunitiesClient> deleteOpportunity(int id) {

        for(OpportunitiesClient opport: this.opportClient) {
            System.out.println(opport);
            if(id == opport.getId()) {
                this.opportClient.remove(opport);
               return showOpportunities();
            }
        }
        return showOpportunities();
    }

}
