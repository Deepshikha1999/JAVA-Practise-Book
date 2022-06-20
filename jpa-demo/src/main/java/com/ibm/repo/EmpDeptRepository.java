package com.ibm.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class EmpDeptRepository {
	
	private EntityManagerFactory factory;
	
	public EmpDeptRepository()
	{
		factory=Persistence.createEntityManagerFactory("My JPA");
	}
	
	public int addDept(Department d)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(d);
		txn.commit();
		em.close();
		return d.getDeptId();
	}
	
	public int addEmp(Employee e,int deptId)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		Department d=em.find(Department.class,deptId);
		e.setDepts(d);
		em.persist(e);
		txn.commit();
		em.close();
		return e.getEmpId();
	}
	
	public void removeDept(int deptId)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		Department d=em.find(Department.class, deptId);
		em.remove(d);
		txn.commit();
		em.close();
	}
	
	public Department findDept(int id)
	{
		EntityManager em = factory.createEntityManager();
		Department d=em.find(Department.class, id);
		return d;
	}

}
