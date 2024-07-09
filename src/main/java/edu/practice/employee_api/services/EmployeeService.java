package edu.practice.employee_api.services;

import edu.practice.employee_api.models.Employee;
import edu.practice.employee_api.repositoires.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService
{
    private final EmployeeRepository employeeRepository;

    public List<Employee> GetAllEmployees() {
        return employeeRepository.findAll();
    }
}
