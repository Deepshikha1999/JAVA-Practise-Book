package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id

	@Column(name = "emp_id")
	@GeneratedValue
	private int empId;
	@Column(name = "ename", length = 30)
	private String empname;
	private double salary;

	//department of a particular employee
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department depts;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepts() {
		return depts;
	}

	public void setDepts(Department depts) {
		this.depts = depts;
	}

}
