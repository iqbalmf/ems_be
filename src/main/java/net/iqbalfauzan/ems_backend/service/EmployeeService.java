package net.iqbalfauzan.ems_backend.service;

import net.iqbalfauzan.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);
    EmployeeDto findEmployeeById(Long id);
    List<EmployeeDto> findAllEmployees();
    void deleteEmployee(Long id);
}
