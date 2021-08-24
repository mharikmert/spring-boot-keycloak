package com.example.springbootkeycloakexample;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Customer {
    @Id
    private Long Id;
    private String name;
}
