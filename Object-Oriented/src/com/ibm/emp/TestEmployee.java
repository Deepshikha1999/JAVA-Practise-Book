package com.ibm.emp;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.payslip();
		
		Employee e2=new Employee("Deepshikha",500000);
		e2.payslip();
		
		Executive ex=new Executive("Deepshikha",5000,2000);
		ex.payslip();
		System.out.println(ex.getSalary());
		
		Incentives inc=new Incentives("Deep",5000,3000);
		inc.payslip();
		System.out.println(inc.getSalary());
		
		Employee e3=inc;
		System.out.println(e3.getSalary());
		System.out.println(inc.getSalary());
		
		showSalary(ex);
		showSalary(inc);
	}
	
	//example of polymorphism
	
	private static void showSalary(Employee emp)
	{
		System.out.println(emp.getSalary());
		if(emp instanceof Incentives)
		{
			System.out.println("Manager");
		}
		else
		{
			System.out.println("Executive");
		}
	}

	//example of method overloading
	/*private static void showSalary(Incentives inc) {
		// TODO Auto-generated method stub
		System.out.println(inc.getSalary());
	}

	private static void showSalary(Executive ex) {
		// TODO Auto-generated method stub
		System.out.println(ex.getSalary());
	}*/

}
