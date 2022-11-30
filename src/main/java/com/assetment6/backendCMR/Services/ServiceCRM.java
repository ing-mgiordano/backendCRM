package com.assetment6.backendCMR.Services;

import java.util.ArrayList;

import com.assetment6.backendCMR.Entities.OpportunitiesClient;
import com.assetment6.backendCMR.Entities.Users;

public class ServiceCRM {

    private ArrayList<Users> user;
    private ArrayList<OpportunitiesClient> opportClient;

    static int contUsers = 0;
    
    public ServiceCRM() {
        this.user = new ArrayList<>();
        this.user.add(new Users(0, "Miguel", "migiorda", "usuario@solera.com", "bootcamp4"));
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
        
        return opportClient;
    }

}
