package com.oberonlabs.restaurantmicroservice.controllers;


import com.oberonlabs.restaurantmicroservice.dto.EmployeeDto;
import com.oberonlabs.restaurantmicroservice.entities.Employee;
import com.oberonlabs.restaurantmicroservice.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping("/{employeeId}")
    @ResponseBody
    public Employee getEmployeeById(@PathVariable Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }
    @GetMapping()
    @ResponseBody
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/restaurants/{restaurantId}")
    @ResponseBody
    public List<Employee> getEmployeesByRestaurantId(@PathVariable Long restaurantId) {
        return employeeService.getEmployeesByRestaurantId(restaurantId);
    }

    @PostMapping()
    @ResponseBody
    public void createEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeService.createEmployee(employeeDto);
    }



}
