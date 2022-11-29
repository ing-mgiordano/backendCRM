package com.assetment6.backendCMR.Services;

import java.util.ArrayList;

import com.assetment6.backendCMR.Entities.Users;

public class ServiceCRM {

    private ArrayList<Users> user;
    
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
    
}
