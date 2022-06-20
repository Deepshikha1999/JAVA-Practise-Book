package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Student;
import com.ibm.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping(value="/add/stud", consumes="application/json")
	public void addStud(@RequestBody Student s)
	{
		service.add(s);
	}
	
	@GetMapping(value="/get/stud/{rollno}",produces="application/json")
	public Student fetch(@PathVariable int rollno)
	{
		return service.fetch(rollno);
	}
	
	@GetMapping(value="get/stud/all",produces="application/json")
	public List<Student> listAll()
	{
		return service.list();
	}
	
	@GetMapping(value="get/stud/school/{school}", produces="application/json")
	public List<Student> listSchool(@PathVariable String school)
	{
		return service.listBySchool(school);
	}

}
