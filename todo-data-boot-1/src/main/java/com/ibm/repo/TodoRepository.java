package com.ibm.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ibm.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{

	@Query(value = "select * from todo where user_id=:uid" , nativeQuery = true)
	List<Todo> findAllByUser(@Param("uid") int userId);
	
	@Query(value = "select * from todo where status='Pending' and user_id=:uid" , nativeQuery = true)
	List<Todo> findAllPendingTodos(@Param("uid") int userId);
	
	@Query(value = "select * from todo where finish_date<=:until", nativeQuery = true)
	List<Todo> findAllFinishedUntil(@Param("until") LocalDate until);
	
}
