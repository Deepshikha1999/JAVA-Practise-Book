package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.User;
import com.ibm.pojo.Login;
import com.ibm.service.UserService;

@CrossOrigin
@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping(value="/register",consumes = "application/json")
	public void addUser(@RequestBody User user)
	{
		service.addUser(user);
	}
	
	@GetMapping(value="/getid/{id}",produces = "application/json")
	public User searchById(@PathVariable int id)
	{
		return service.findById(id);
	}
	
	@GetMapping(value="/getemail/{email}",produces = "application/json")
	public User searchByEmail(@PathVariable String email)
	{
		return service.findByEmail(email);
	}
	
	@GetMapping(value="/list",produces = "application/json")
	public List<User> searchAll()
	{
		return service.findAll();
	}
	
	@GetMapping(value="/auth",produces = "application/json")
	public ResponseEntity<?> validate(@RequestParam String email,@RequestParam String password)
	{
		Login login=new Login();
		login.setEmail(email);
		login.setPassword(password);
		try {
		User user=service.authenticate(login);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<String>("Invalid Email or Password",HttpStatus.NOT_FOUND);
		}
	}

}
