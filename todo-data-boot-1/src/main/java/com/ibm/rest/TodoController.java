package com.ibm.rest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Todo;
import com.ibm.entity.User;
import com.ibm.service.TodoService;
import com.ibm.service.UserService;

@CrossOrigin
@RestController
public class TodoController {

	@Autowired
	private TodoService service;
	
	@PostMapping(value="/add/todo/{userId}",consumes="application/json")
	public void addTodo(@RequestBody Todo todo, @PathVariable int userId)
	{
		service.addTodo(todo, userId);
	}
	
	@PostMapping(value="/modify/todo/{userId}",consumes="application/json")
	public void updateTodo(@RequestBody Todo todo,@PathVariable int userId)
	{
		service.update(todo,userId);
	}
	
	@GetMapping(value="/find/tid/{tid}",produces="application/json")
	public Todo findById(@PathVariable int tid)
	{
		return service.getTodo(tid);
	}
	
	@GetMapping(value="/find/userid/{userId}",produces="application/json")
	public List<Todo> findByUser(@PathVariable int userId)
	{
		return service.todoByUser(userId);
	}
	
	@GetMapping(value="/find/pending/{userId}",produces="application/json")
	public List<Todo> findPendingTodo(@PathVariable int userId)
	{
		return service.pendingTodos(userId);
	}
	
	@GetMapping(value="/find/until",produces="application/json")
	public List<Todo> finsihedUntil(@RequestParam LocalDate until)
	{
		return service.finishedUntil(until);
	}
	
	
}
