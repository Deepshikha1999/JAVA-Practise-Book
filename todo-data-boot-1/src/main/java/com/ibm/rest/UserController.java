package com.ibm.rest;

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
	private UserService service_user;
	@PostMapping(value="/add/user",consumes="application/json")
	public void addUser(@RequestBody User user)
	{
		service_user.addUser(user);
	}
	
	@GetMapping(value="/get/user/{userId}",produces="application/json")
	public User getUserTest(@PathVariable int userId)
	{
		return service_user.getUser(userId);
	}
	
	@GetMapping(value="/login/{email}/{password}",produces="application/json")
	public ResponseEntity<?> validate(@PathVariable String email,@PathVariable String password)
	{
		Login login =new Login(email,password);
		try {
			User user=service_user.authenticate(login);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<String>("Invalid Email or Password",HttpStatus.NOT_FOUND);
		}
	}
}
