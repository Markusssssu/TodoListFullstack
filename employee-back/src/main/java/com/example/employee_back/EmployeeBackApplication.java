package com.example.employee_back;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.employee_back.entity.Employee;
import com.example.employee_back.service.EmployeeService;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
@RestController
public class EmployeeBackApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(EmployeeBackApplication.class, args);
	}
	
	private final EmployeeService employeeService;
	
	@Override
	public void run(String... args) throws Exception 
	{
		Employee employee1 = Employee.builder()
		.firstName("Mark")
		.lastName("Mansurov")
		.email("marik334488@mail.ru") 
		.build();

		employeeService.addEmployee(employee1);
	}

}
