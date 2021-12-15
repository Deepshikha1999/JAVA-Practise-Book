package com.ibm.emp;

public class Incentives extends Employee {
	private double incentives;

	public Incentives() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Incentives(String empname, double salary,double incentives) {
		super(empname, salary);
		this.incentives=incentives;
	}

	@Override
	public double getSalary() {
		return super.getSalary()+incentives;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println(" Incentives:"+incentives);
	}
	
}
