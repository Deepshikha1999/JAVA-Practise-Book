package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Album;
import com.ibm.repo.AlbumRepository;

public class TestAlbum {
	private static AlbumRepository album;
	
	@BeforeAll
	public static void setup()
	{
		album=new AlbumRepository();
	}
	
	@Test
	public void testSave()
	{
		Album a=new Album();
		a.setAlbumId(123);
		a.setTitle("teri fariyaad");
		a.setGenre("classical");
		a.setRating(4.5);
		album.saveAlbum(a);
	}
	
	@Test
	public void testFind()
	{
		Album a=album.findAlbum(123);
		assertNotNull(a);
		System.out.println(a.getTitle());
	}
	
	@Test
	public void testUpdate()
	{
		
		Album a=album.findAlbum(111);
		a.setRating(4.1);
		album.updateAlbum(a);
		
	}
	
	@Test
	public void testDelete()
	{
		album.deleteAlbum(111);
	}

}
