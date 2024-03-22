package com.oberonlabs.restaurantmicroservice.mappers;


import com.oberonlabs.restaurantmicroservice.dto.EmployeeDto;
import com.oberonlabs.restaurantmicroservice.entities.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee employeeDtoToEmployee(EmployeeDto employeeDto);
    EmployeeDto employeeDtoToEmployee(Employee employee);

}
