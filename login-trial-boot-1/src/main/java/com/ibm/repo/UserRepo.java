package com.ibm.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);
	Optional<User> findByEmailAndPassword(String email,String password);

}
