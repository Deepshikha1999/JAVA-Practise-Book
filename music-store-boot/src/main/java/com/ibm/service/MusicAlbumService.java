package com.ibm.service;

import java.util.List;

import com.ibm.entity.MusicAlbum;

public interface MusicAlbumService {
	
	void addAlbum(MusicAlbum m);
	
	MusicAlbum findByTitle(String title);
	
	List<MusicAlbum> findAllByArtist(String artist);
	
	List<MusicAlbum> findAllByGenre(String genre);
	
	List<MusicAlbum> findAllAlbum();
	
	void deleteAlbum(int id);
	
}
