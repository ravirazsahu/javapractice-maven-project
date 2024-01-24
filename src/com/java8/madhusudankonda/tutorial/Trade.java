package com.java8.madhusudankonda.tutorial;

public class Trade {
	
	int quantity;
	String status;
	
	
	public Trade(int quantity, String status) {
		super();
		this.quantity = quantity;
		this.status = status;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
