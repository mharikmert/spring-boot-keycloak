package com.springboot.keycloak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class KeycloakController {
    private final CustomerDAO customerDAO;
    @Autowired
    public KeycloakController(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }


}
