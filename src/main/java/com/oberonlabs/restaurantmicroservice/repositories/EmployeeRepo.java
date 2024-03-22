package com.oberonlabs.restaurantmicroservice.repositories;

import com.oberonlabs.restaurantmicroservice.entities.Employee;
import com.oberonlabs.restaurantmicroservice.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    List<Employee> findAllByRestaurant(Restaurant restaurant);
}
