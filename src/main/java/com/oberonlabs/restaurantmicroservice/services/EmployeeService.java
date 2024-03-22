package com.oberonlabs.restaurantmicroservice.services;


import com.oberonlabs.restaurantmicroservice.dto.EmployeeDto;
import com.oberonlabs.restaurantmicroservice.entities.Employee;
import com.oberonlabs.restaurantmicroservice.entities.Restaurant;
import com.oberonlabs.restaurantmicroservice.mappers.EmployeeMapper;
import com.oberonlabs.restaurantmicroservice.repositories.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final RestaurantService restaurantService;
    private final EmployeeMapper employeeMapper;
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepo
                .findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public List<Employee> getEmployeesByRestaurantId(Long restaurantId) {
        Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);

        return employeeRepo.findAllByRestaurant(restaurant);
    }

    public void createEmployee(EmployeeDto employeeDto) {
        employeeRepo.save(employeeMapper.employeeDtoToEmployee(employeeDto));

    }

}
