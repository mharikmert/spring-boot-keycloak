package com.springboot.keycloak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.List;


@Controller
public class CustomerRestController {
    private final Logger logger = LoggerFactory.getLogger(CustomerRestController.class);

    private final CustomerDAO customerDAO;
    @Autowired
    public CustomerRestController(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "redirect:/";
    }

    @GetMapping("/customers")
    public String customer(Principal principal, Model model){
        List<Customer> customers = customerDAO.findAll();
        model.addAttribute("customers", customers);
        model.addAttribute("username", principal.getName());
        return "customers";
    }

}
