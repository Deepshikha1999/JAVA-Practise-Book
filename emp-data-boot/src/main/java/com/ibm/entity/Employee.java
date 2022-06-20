package com.ibm.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@Column(name = "emp_no")
	private int empNo;
	@Column(name = "ename", length = 30)
	private String empName;
	@Column(length = 20)
	private String job;
	private double salary;
	@Column(name = "hire_date")
	private LocalDate hireDate;

	//Constructors
	public Employee() {
		super();
	}

	public Employee(int empNo, String empName, String job, double salary, LocalDate hireDate) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	//Getters and Setters
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

}
