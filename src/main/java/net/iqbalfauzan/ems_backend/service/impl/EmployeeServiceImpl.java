package net.iqbalfauzan.ems_backend.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import net.iqbalfauzan.ems_backend.dto.EmployeeDto;
import net.iqbalfauzan.ems_backend.entity.Employee;
import net.iqbalfauzan.ems_backend.mapper.EmployeeMapper;
import net.iqbalfauzan.ems_backend.repository.EmployeeRepository;
import net.iqbalfauzan.ems_backend.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public EmployeeDto findEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee with id " + id + " not found"));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> findAllEmployees() {
        return List.of();
    }

    @Override
    public EmployeeDto deleteEmployee(Long id) {
        return null;
    }
}
