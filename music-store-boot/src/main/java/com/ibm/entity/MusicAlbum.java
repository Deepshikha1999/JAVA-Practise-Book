package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MusicAlbum {

	@Id
	@GeneratedValue
	@Column(name="album_id")
	private int albumId;
	@Column(length=30)
	private String title;
	@Column(length=10)
	private String genre;
	@Column(length=30)
	private String artist;
	private double rating;

	public MusicAlbum() {
		super();
	}

	public MusicAlbum(int albumId, String title, String genre, String artist, double rating) {
		super();
		this.albumId = albumId;
		this.title = title;
		this.genre = genre;
		this.artist = artist;
		this.rating = rating;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	
}
