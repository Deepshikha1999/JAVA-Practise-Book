package com.ibm.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Portfolio;
import com.ibm.entity.Share;

public class SharePortRepository {
	private EntityManagerFactory factory;

	public SharePortRepository() {
		factory=Persistence.createEntityManagerFactory("My JPA");
	}
	
	public int addPort(Portfolio p)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(p);
		txn.commit();
		em.close();
		return p.getPortId();
	}
	
	
	public int addShare(Share s,int portId)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		Portfolio p=em.find(Portfolio.class,portId);
		s.setQuote(p);
		em.persist(s);
		txn.commit();
		em.close();
		return s.getShareId();
	}
}
