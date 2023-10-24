package project.gate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.gate.feignclient.AdresseClient;

@RestController
public class AdresseController {

    @Autowired
    private AdresseClient addressClient;


    @GetMapping(path = "/data",produces = "application/json")
    public String getAdresse(){
        return addressClient.getAdress() ;
    }
}
