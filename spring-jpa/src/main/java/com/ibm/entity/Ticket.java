package com.ibm.entity;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ticket {
	@Id
	private int pnr;
	private LocalDate doj;//date of journey
	private double total;
	
	public Ticket() {
		super();
	}

	public Ticket(int pnr, LocalDate doj, double total) {
		super();
		this.pnr = pnr;
		this.doj = doj;
		this.total = total;
	}

	@OneToMany(mappedBy="ticket",cascade = CascadeType.ALL,fetch = FetchType.EAGER )
	private List<Passenger> passenger;

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public LocalDate getDate() {
		return doj;
	}

	public void setDate(LocalDate date) {
		this.doj = date;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", doj=" + doj + ", total=" + total + "]";
	}
}
