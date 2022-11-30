package com.assetment6.backendCMR.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assetment6.backendCMR.Entities.OpportunitiesClient;
import com.assetment6.backendCMR.Services.ServiceCRM;


@RestController
@CrossOrigin("*")
public class crmController {
    
   ServiceCRM service = new ServiceCRM();

   @GetMapping("/opportunities")
   public ArrayList<OpportunitiesClient> showOpportunities() {
        return service.showOpportunities();
   } 

   @GetMapping("/clients")
   public ArrayList<OpportunitiesClient> showClientList() {
        return service.showClientList();
   } 

   @PutMapping("/opportunities/{id}")
   public OpportunitiesClient createClient(@PathVariable int id) {
     return service.createClient(id);
   }

}
