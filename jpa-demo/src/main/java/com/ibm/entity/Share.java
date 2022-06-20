package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Share {
	
	@Id
	@Column(name="share_id")
	@GeneratedValue
	private int shareId;
	@Column(name="stock",length=30)
	private String stock;
	@Column(name="quantiyt")
	private double quantity;
	
	@ManyToOne
	@JoinColumn(name="port_id")
	private Portfolio quote;

	public int getShareId() {
		return shareId;
	}

	public void setShareId(int shareId) {
		this.shareId = shareId;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Portfolio getQuote() {
		return quote;
	}

	public void setQuote(Portfolio quote) {
		this.quote = quote;
	}
	

}
