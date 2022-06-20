package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.repo.EmpDeptRepository;

public class TestEmpDept {
	
	private static EmpDeptRepository repo;
	
	@BeforeAll
	public static void init()
	{
		repo=new EmpDeptRepository();
	}
	
	@Test
	public void testSaveDept()
	{
		Department d=new Department();
		d.setDeptId(20);
		d.setDeptname("HR");
		repo.addDept(d);
	}
	
	@Test
	public void testSaveEmp()
	{
		Employee e=new Employee();
		e.setEmpname("Raya");
		e.setSalary(25000);
		repo.addEmp(e, 20);
	}
	
	@Test
	public void testDelete()
	{
		repo.removeDept(10);
	}
	
	@Test
	public void testFind()
	{
		Department d=repo.findDept(10);
		System.out.println(d.getDeptname());
		System.out.println(d.getEmps());
	}

}
