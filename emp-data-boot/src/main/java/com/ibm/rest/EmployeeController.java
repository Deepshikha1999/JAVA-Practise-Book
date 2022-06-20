package com.ibm.rest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Employee;
import com.ibm.service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping(value="/add",consumes="application/json")
	public void addEmp(@RequestBody Employee emp)
	{
		service.save(emp);
	}
	
	@GetMapping(value="/get/{id}", produces="application/json")
	public Employee getEmp(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	@GetMapping(value="/list", produces="application/json")
	public List<Employee> getAll()
	{
		return service.getAll();
	}
	
	@DeleteMapping(value="/del/{id}", produces="application/json")
	public List<Employee> delEmp(@PathVariable int id)
	{
		service.delete(id);
		return service.getAll();
	}
	
	@GetMapping(value="/list/until",produces="application/json")
	public List<Employee> joinedUntil(@RequestParam LocalDate joinedUntil)
	{
		return service.getAllJoinedUntil(joinedUntil);
	}
	
	@GetMapping(value="/list/between", produces="application/json")
	public List<Employee> joinedBetween(@RequestParam("start") LocalDate start,@RequestParam("end") LocalDate end)
	{
		return service.getAllJoinedBetween(start, end);
	}
}
