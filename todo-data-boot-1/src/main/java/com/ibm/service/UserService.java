package com.ibm.service;

import com.ibm.entity.User;
import com.ibm.pojo.Login;

public interface UserService {

	int addUser(User user);
	
	User getUser(int userId);
	
	User authenticate(Login login);
}
