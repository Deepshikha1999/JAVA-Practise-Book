package com.ibm.service;

import java.time.LocalDate;
import java.util.List;

import com.ibm.entity.Todo;

public interface TodoService {

	int addTodo(Todo todo,int userId);
	
	Todo getTodo(int id);
	
	List<Todo> todoByUser(int userId);
	
	Todo update(Todo todo,int userId);
	
	List<Todo> pendingTodos(int userId);
	
	List<Todo> finishedUntil(LocalDate until);
}
