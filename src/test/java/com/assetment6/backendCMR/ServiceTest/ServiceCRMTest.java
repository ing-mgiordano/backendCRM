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
}