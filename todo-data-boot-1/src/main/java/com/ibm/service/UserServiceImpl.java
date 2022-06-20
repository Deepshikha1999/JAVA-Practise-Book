package com.ibm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.User;
import com.ibm.pojo.Login;
import com.ibm.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	@Override
	@Transactional
	public int addUser(User user) {
		repo.save(user);
		return 0;
	}

	@Override
	public User getUser(int userId) {
		return repo.findById(userId).orElseThrow(()->new IllegalArgumentException("user not found with id: "+userId));
	}

	@Override
	public User authenticate(Login login) {
		// TODO Auto-generated method stub
		return repo.findByEmailAndPassword(login.getEmail(), login.getPassword()).orElseThrow(()-> new IllegalArgumentException("Invalid Email or password"));
	}

}
