package net.iqbalfauzan.ems_backend.service;

import net.iqbalfauzan.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(EmployeeDto employeeDto);
    EmployeeDto findEmployeeById(Long id);
    List<EmployeeDto> findAllEmployees();
    EmployeeDto deleteEmployee(Long id);
}
