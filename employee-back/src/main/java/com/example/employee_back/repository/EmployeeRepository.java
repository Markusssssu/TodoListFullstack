package com.example.employee_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee_back.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{}
