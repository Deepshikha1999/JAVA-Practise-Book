package com.ibm.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Album;

public class AlbumRepository {
	EntityManagerFactory factory;

	public AlbumRepository() {
		factory=Persistence.createEntityManagerFactory("My JPA");
	}
	
	public int saveAlbum(Album a)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(a);
		txn.commit();
		em.close();
		return a.getAlbumId();
	}
	
	public Album findAlbum(int id)
	{
		EntityManager em=factory.createEntityManager();
		Album a=em.find(Album.class, id);
		return a;
	}

	public Album updateAlbum(Album a)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.merge(a);
		txn.commit();
		em.close();
		return a;
	}
	
	public void deleteAlbum(int id)
	{
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		Album a=em.find(Album.class, id);
		em.remove(a);
		txn.commit();
		em.close();
	}
}
