package com.example.employee_back.controller;


import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.employee_back.entity.Employee;
import com.example.employee_back.service.EmployeeService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class EmployeeController 
{
    
    private final EmployeeService employeeService;    

    @GetMapping()
    public ResponseEntity<List<Employee>> getEmployees()
    {
        List<Employee> employees = employeeService.getEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) 
    {
        Employee employees = employeeService.getEmployeesById(id);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/save")
    public ResponseEntity<Employee> saveEmployees(@RequestBody Employee employee) 
    {
        Employee saveEmployees = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(saveEmployees, HttpStatus.CREATED);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee) 
    {
        Employee newEmployees = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployees, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployees(@RequestBody Employee employee) 
    {
        Employee updateEmployees = employeeService.addEmployee(employee);
        return new ResponseEntity<>(updateEmployees, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build(); 
    }
}

