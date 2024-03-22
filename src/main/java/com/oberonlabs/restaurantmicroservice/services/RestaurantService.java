package com.oberonlabs.restaurantmicroservice.services;


import com.oberonlabs.restaurantmicroservice.entities.Restaurant;
import com.oberonlabs.restaurantmicroservice.repositories.RestaurantRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepo restaurantRepo;

    public Restaurant getRestaurantById(Long id) {
        return restaurantRepo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Restaurant with id: " + id + ", not Found"));
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }


}
