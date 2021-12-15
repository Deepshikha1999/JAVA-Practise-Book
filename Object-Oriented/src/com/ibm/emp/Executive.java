package com.ibm.emp;

public class Executive extends Employee {
	private double commision;

	public Executive() {
		super();
	}

	public Executive(String empname, double salary,double commision) {
		super(empname, salary);
		this.commision=commision;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println(" Commission: "+commision);
	}

	@Override
	public double getSalary() {
		
		return super.getSalary()+commision;
	}
	
}
