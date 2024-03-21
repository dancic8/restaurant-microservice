package com.oberonlabs.restaurantmicroservice.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @ManyToOne
    private Restaurant restaurant;
}
