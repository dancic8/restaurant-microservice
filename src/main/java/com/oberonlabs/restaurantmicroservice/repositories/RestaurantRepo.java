package com.oberonlabs.restaurantmicroservice.repositories;

import com.oberonlabs.restaurantmicroservice.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {

}
