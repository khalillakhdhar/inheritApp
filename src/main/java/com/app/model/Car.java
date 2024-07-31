package com.app.model;

import jakarta.persistence.Entity;

@Entity
public class Car extends Passenger {
private int noOfDoors;

public int getNoOfDoors() {
	return noOfDoors;
}

public void setNoOfDoors(int noOfDoors) {
	this.noOfDoors = noOfDoors;
}



}
