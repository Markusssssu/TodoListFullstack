package com.example.employee_back.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_back.entity.Employee;
import com.example.employee_back.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService
{
    private final EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() 
    {
        return employeeRepository.findAll();
    };

    public Employee getEmployeesById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) 
    {
        return employeeRepository.save(employee);
    }

    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id)
    {
        employeeRepository.deleteById(id);
    }

}
