package com.app.model;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Transportation {
	private int loadCapacity;

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	
	

}
