package com.app.inheritance;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Entre extends Devices {
private String mode;

public String getMode() {
	return mode;
}

public void setMode(String mode) {
	this.mode = mode;
}

}
