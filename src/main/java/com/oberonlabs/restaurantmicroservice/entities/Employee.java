package com.oberonlabs.restaurantmicroservice.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {


    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @ManyToOne
    private Restaurant restaurant;

}
