package com.ibm.emp;

public class Employee {

	private int empno;
	private String empname;
	private double salary;
	
	private static int counter;
	
	static {
		counter=120;
	}
	
	public Employee(String empname, double salary) {
		super();
		this.empno = counter++;
		this.empname = empname;
		this.salary = salary;
	}
	public Employee() {
		//super();
		this("anonymous",0.0);
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	public void payslip()
	{
		System.out.println(" Employee no.: "+empno+"\n Employee name: "+empname+"\n Employee salary:  "+salary);
	}
	
}


