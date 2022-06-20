package com.ibm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.MusicAlbum;

public interface MusicAlbumRepository extends JpaRepository<MusicAlbum, Integer>{
	
	MusicAlbum findByTitle(String title);
	
	List<MusicAlbum> findAllByArtist(String artist);
	
	List<MusicAlbum> findAllByGenre(String genre);

}
