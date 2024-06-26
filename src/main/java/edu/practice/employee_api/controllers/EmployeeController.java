package edu.practice.employee_api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/employee")
public class EmployeeController
{
	private static final int SUCCESS_CODE = 200;

	@RequestMapping("/api/employees")
	public ResponseEntity GetEmployeeList(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model)
	{
		//TODO: content
		return new ResponseEntity<>(/*dto*/ "", HttpStatus.OK);
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

	@GetMapping("/api/employee/")
	public String test(@RequestParam(name="id", required = true, defaultValue = "0") Integer id, Model model)
	{
		//TODO: content
		return "";
	}
}
