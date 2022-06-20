package com.ibm.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Customer;

public class CustomerRepository {
	private EntityManagerFactory factory;

	public CustomerRepository() {
		factory = Persistence.createEntityManagerFactory("My JPA");
	}

	public int saveCustomer(Customer c) {
		// Entity Manager represents a session with the database
		EntityManager em = factory.createEntityManager();
		// Transactions are mandatory to perform DML operation
		EntityTransaction txn = em.getTransaction();
		txn.begin();// starting a transaction
		em.persist(c);// saving customer
		txn.commit();// closing transaction
		em.close();// closing database session
		return c.getCustId();
	}

	public Customer findCustomer(int id) {
		EntityManager em = factory.createEntityManager();
		Customer c = em.find(Customer.class, id);
		return c;
	}

	
	public Customer updateCustomer(Customer c)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.merge(c);//updating customer
		txn.commit();
		em.close();
		return c;
	}
	
	public void deleteCustomer(int id)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Customer c=em.find(Customer.class, id);
		em.remove(c);
		et.commit();
		em.close();
	}
}
