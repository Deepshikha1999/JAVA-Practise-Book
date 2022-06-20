package com.ibm.service;

import java.time.LocalDate;
import java.util.List;

import com.ibm.entity.Employee;

public interface EmployeeService {

	void save(Employee emp);

	Employee getById(int empNo);

	List<Employee> getAll();

	void delete(int empNo);

	List<Employee> getAllJoinedUntil(LocalDate joinUntil);

	List<Employee> getAllJoinedBetween(LocalDate start, LocalDate end);

}
