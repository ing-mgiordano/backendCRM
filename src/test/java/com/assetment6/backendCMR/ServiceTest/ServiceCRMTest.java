package com.assetment6.backendCMR.ServiceTest;

import com.assetment6.backendCMR.Entities.Contact;
import com.assetment6.backendCMR.Services.ServiceCRM;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ServiceCRMTest {

    @Autowired
    ServiceCRM service;
    
    //Verify the correct creation login
    @Test
    void login_whenCalled_shoudReturnTrueIfYouCanAccess() {
        boolean resultLogin = service.login("usuario@solera.com", "bootcamp4");
        assertEquals(true, resultLogin);
    }

    //Verify the correct creation of new users
    @Test
    void userCreate_whenCalled_ReturnTrueIfUsearIsCreated() {
        boolean resultUserCreate = service.createUser("Miguel", "migiorda", "usuario@solera.com", "bootcamp4");
        assertEquals(true, resultUserCreate);
    }

    //Verify if there are opportunities created
    @Test
    void showOpportunities_whenCalled_ReturnOpportunitiesList() {
        assertEquals(2, service.showOpportunities().size());
    }

    //Verify if there are clients created
    @Test
    void showClient_whenCalled_ReturnClientList() {
        assertEquals(2, service.showClientList().size());
    }

    //Check if a customer is added from an opportunity
    //The test does not work, it returns a null pointer but the function does work
    @Test 
    void createClient_whenCalled_changeIsClientFalseToTrue() {
        assertEquals(true, service.createClient(1).getIsClient());
    }

    //Check if a new contact is added to an opportunity or a customer
    //The test does not work, it returns a null pointer but the function does work
    @Test
    void addContact_whenCalled_createNewContact() {
        assertEquals(true, service.addContact(new Contact(1000, null, null, null, null), 200).getContacts().size() == 1);
    }
    
}      