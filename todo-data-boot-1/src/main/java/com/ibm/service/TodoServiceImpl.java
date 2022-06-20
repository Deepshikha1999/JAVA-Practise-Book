package com.ibm.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Todo;
import com.ibm.repo.TodoRepository;
import com.ibm.repo.UserRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository repo;
	
	@Autowired
	private UserService user;
	
	@Override
	@Transactional
	public int addTodo(Todo todo, int userId) {
		
		todo.setUser(user.getUser(userId));
		repo.save(todo);
		return todo.getId();
	}

	@Override
	public Todo getTodo(int tid) {
		
		return repo.findById(tid).orElseThrow(()->new IllegalArgumentException("task id not found "+tid));
	}

	@Override
	public List<Todo> todoByUser(int userId) {
		
		return repo.findAllByUser(userId);
	}

	@Override
	@Transactional
	public Todo update(Todo todo,int userId) {
		todo.setUser(user.getUser(userId));
		return repo.save(todo);
	}

	@Override
	public List<Todo> pendingTodos(int userId) {
		
		return repo.findAllPendingTodos(userId);
	}

	@Override
	public List<Todo> finishedUntil(LocalDate until) {
		
		return repo.findAllFinishedUntil(until);
	}

}
