package edu.practice.employee_api.controllers;

import edu.practice.employee_api.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/employee")
public class EmployeeController
{
	private final EmployeeService employeeService;

	private static final int SUCCESS_CODE = 200;

	@RequestMapping("/list")
	public ResponseEntity GetEmployeeList(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model)
	{
		//TODO: use DTO
		return new ResponseEntity<>(/*dto*/ employeeService.GetAllEmployees(), HttpStatus.OK);
	}

	@GetMapping("/api/employee/")
	public String GetEmployeeById(@RequestParam(name="id", required = true, defaultValue = "0") Integer id, Model model)
	{
		//TODO: content
		return "";
	}

	@PostMapping("/api/employee/create/id")
	public String CreateEmployee(@PathVariable(name="id", required = true) Integer id, Model model)
	{
		//TODO: content
		return "";
	}

	@PutMapping("/api/employee/")
	public String UpdateEmployee(@RequestParam(name="id", required = true, defaultValue = "0") Integer id, Model model)
	{
		//TODO: content
		return "";
	}

	@DeleteMapping("/api/employee/")
	public String RemoveEmployee(@RequestParam(name="id", required = true, defaultValue = "0") Integer id, Model model)
	{
		//TODO: content
		return "";
	}

}
