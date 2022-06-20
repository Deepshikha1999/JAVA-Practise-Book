package com.ibm.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("from Employee where hireDate < :joinUntil")
	List<Employee> findAllJoinedBefore(LocalDate joinUntil);
	
	List<Employee> findAllByHireDateBetween(LocalDate start, LocalDate end);
}
