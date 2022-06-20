package com.ibm.service;

import java.util.List;

import com.ibm.entity.User;
import com.ibm.pojo.Login;

public interface UserService {
	void addUser(User user);
	
	User findById(int id);
	
	User findByEmail(String email);
	
	List<User> findAll();
	
	User authenticate(Login login);

}
