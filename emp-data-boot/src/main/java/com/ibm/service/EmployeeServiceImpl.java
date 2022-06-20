package com.ibm.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Employee;
import com.ibm.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	@Override
	//@Transactional
	public void save(Employee emp) {
		repo.save(emp);
	}

	@Override
	public Employee getById(int empNo) {
		return repo.findById(empNo).get();
	}

	@Override
	public List<Employee> getAll() {
		return repo.findAll();
	}

	@Override
	//@Transactional
	public void delete(int empNo) {
		repo.deleteById(empNo);
	}

	@Override
	public List<Employee> getAllJoinedUntil(LocalDate joinUntil) {
		return repo.findAllJoinedBefore(joinUntil);
	}

	@Override
	public List<Employee> getAllJoinedBetween(LocalDate start, LocalDate end) {
		return repo.findAllByHireDateBetween(start, end);
	}

}
