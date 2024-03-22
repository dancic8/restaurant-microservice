package com.oberonlabs.restaurantmicroservice.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Restaurant extends BaseEntity {

    @Column
    private String name;
    @Column
    private String address;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();
}
