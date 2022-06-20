package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.entity.User;
import com.ibm.pojo.Login;
import com.ibm.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User authenticate(Login login) {
		// TODO Auto-generated method stub
		return repo.findByEmailAndPassword(login.getEmail(), login.getPassword()).orElseThrow(()->new IllegalArgumentException("invalid email or password"));
	}

}
