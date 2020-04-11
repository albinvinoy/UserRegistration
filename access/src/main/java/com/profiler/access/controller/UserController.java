package com.profiler.access.controller;

import com.profiler.access.model.Employee;
import com.profiler.access.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class UserController {

	private EmployeeRepository employeeRepository;

	@GetMapping("/health")
	public String welcome()
	{
		return "Yup I am working";
	}

	@GetMapping("/all")
	public Flux<Employee> getAll(){
		return employeeRepository.findAll();
	}

}
