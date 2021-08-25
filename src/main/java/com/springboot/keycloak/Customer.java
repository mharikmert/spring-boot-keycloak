package com.springboot.keycloak;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Customer {
    public Customer(Long id, String name, String address){
        this.Id = id;
        this.name = name;
        this.address = address;
    }
    @Id
    private Long Id;
    private String name;
    private String address;
}
