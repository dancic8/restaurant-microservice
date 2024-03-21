package com.oberonlabs.restaurantmicroservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test/restaurant")
@ResponseBody
public class RestaurantHealthcheckController {


    @GetMapping("")
    public String healthCheck() {
        return "RestaurantMICROSERVICE ----- OK";
    }
}
