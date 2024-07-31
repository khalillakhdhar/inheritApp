package com.app.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Passenger extends Vehicule {
private int noOfPassenger;

public int getNoOfPassenger() {
	return noOfPassenger;
}

public void setNoOfPassenger(int noOfPassenger) {
	this.noOfPassenger = noOfPassenger;
}

}
