package com.ibm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.MusicAlbum;
import com.ibm.repo.MusicAlbumRepository;

@Service
public class MusicAlbumServiceImpl implements MusicAlbumService {
	
	@Autowired
	private MusicAlbumRepository repo;

	@Override
	@Transactional
	public void addAlbum(MusicAlbum m) {
		// TODO Auto-generated method stub
		repo.save(m);
	}

	@Override
	public MusicAlbum findByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.findByTitle(title);
	}

	@Override
	public List<MusicAlbum> findAllByArtist(String artist) {
		// TODO Auto-generated method stub
		return repo.findAllByArtist(artist);
	}

	@Override
	public List<MusicAlbum> findAllByGenre(String genre) {
		// TODO Auto-generated method stub
		return repo.findAllByGenre(genre);
	}

	@Override
	public List<MusicAlbum> findAllAlbum() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	@Transactional
	public void deleteAlbum(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

}
