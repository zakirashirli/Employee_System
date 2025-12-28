package com.employee.emp.service;

import com.employee.emp.entity.Employee;
import com.employee.emp.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // create employee
    public Employee createEmployee(@RequestBody Employee newEmp) {
        return employeeRepository.save(newEmp);
    }

}
