package com.app.model;

public abstract class Transportation extends Vehicule {
private int loadCapacity;

public int getLoadCapacity() {
	return loadCapacity;
}

public void setLoadCapacity(int loadCapacity) {
	this.loadCapacity = loadCapacity;
}

}
