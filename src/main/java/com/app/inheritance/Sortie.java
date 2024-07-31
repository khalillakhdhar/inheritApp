package com.app.inheritance;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Sortie extends Devices {

	private int resolution;

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	
}
