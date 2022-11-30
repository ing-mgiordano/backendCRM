package com.assetment6.backendCMR.ServiceTest;

import com.assetment6.backendCMR.Services.ServiceCRM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ServiceCRMTest {
    private ServiceCRM service;

    @Test
    void login_whenCalled_shoudReturnIfYouCanAcces() {
        service = new ServiceCRM();
        boolean resultLogin = service.login("usuario@solera.com", "bootcamp4");
        assertEquals(true, resultLogin);
    }

    @Test
    void userCreate_whenCalled_ReturnTrueIfUsearIsCreated() {
        service = new ServiceCRM();
        boolean resultUserCreate = service.createUser("Miguel", "migiorda", "usuario@solera.com", "bootcamp4");
        assertEquals(true, resultUserCreate);
    }

    @Test
    void showOpportunities_whenCalled_ReturnOpportunitiesList() {
        service = new ServiceCRM();
        assertEquals(2, service.showOpportunities().size());
    }

    @Test
    void showClient_whenCalled_ReturnClientList() {
        service = new ServiceCRM();
        assertEquals(2, service.showClientList().size());
    }

    @Test 
    void createClient_whenCalled_changeIsClientFalseToTrue() {
        service = new ServiceCRM();
        assertEquals(true, service.createClient(2).getIsClient());
    }
}