package com.ibm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private int movId;
	@Column(length = 30)
	private String title;
	private double rating;

	@ManyToMany
	@JoinTable(name = "show_time", joinColumns = { @JoinColumn(name = "movId") }, inverseJoinColumns = {
			@JoinColumn(name = "mpexId") })
	Set<Multiplex> multiplexes = new HashSet<>();

	public int getMovId() {
		return movId;
	}

	public void setMovId(int movId) {
		this.movId = movId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Set<Multiplex> getMultiplexes() {
		return multiplexes;
	}

	public void setMultiplexes(Set<Multiplex> multiplexes) {
		this.multiplexes = multiplexes;
	}

}
