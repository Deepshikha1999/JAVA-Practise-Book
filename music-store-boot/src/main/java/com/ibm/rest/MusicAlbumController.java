package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.MusicAlbum;
import com.ibm.service.MusicAlbumService;

@CrossOrigin
@RestController
public class MusicAlbumController {

	@Autowired
	private MusicAlbumService service;
	
	@PostMapping(value="/add/album", consumes="application/json")
	public void addAlbum(@RequestBody MusicAlbum m)
	{
		service.addAlbum(m);
	}
	
	@GetMapping(value="/get/album/title/{title}",produces="application/json")
	public MusicAlbum SearchByTitle(@PathVariable String title)
	{
		return service.findByTitle(title);
	}
	
	@GetMapping(value="/get/album/artist/{artist}",produces="application/json")
	public List<MusicAlbum> SearchAllByArtist(@PathVariable String artist)
	{
		return service.findAllByArtist(artist);
	}
	
	@GetMapping(value="/get/album/genre/{genre}",produces="application/json")
	public List<MusicAlbum> searchAllByGenre(@PathVariable String genre)
	{
		return service.findAllByGenre(genre);
	}
	
	@GetMapping(value="/get/album/all",produces="application/json")
	public List<MusicAlbum> searchAll()
	{
		return service.findAllAlbum();
	}
	
	@DeleteMapping(value="/del/{id}",produces="application/json")
	public List<MusicAlbum> deleteAlbum(@PathVariable int id)
	{
		service.deleteAlbum(id);
		return service.findAllAlbum();
	}
}
