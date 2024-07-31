package com.app.model;

import jakarta.persistence.Entity;

@Entity
public class Bike extends Passenger{
	private int saddleHeight;

	public int getSaddleHeight() {
		return saddleHeight;
	}

	public void setSaddleHeight(int saddleHeight) {
		this.saddleHeight = saddleHeight;
	}
	

}
