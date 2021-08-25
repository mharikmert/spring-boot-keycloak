package com.springboot.keycloak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootKeycloakApplication implements CommandLineRunner {
    @Autowired
    private CustomerDAO customerDAO;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootKeycloakApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Iterable<Customer> initialEntities = List.of(new Customer[]{
                new Customer(1L,"CustomerName1", "Address1"),
                new Customer(2L,"CustomerName2", "Address2"),
                new Customer(3L,"CustomerName3", "Address3")
        });
        customerDAO.saveAll(initialEntities);
    }
}
