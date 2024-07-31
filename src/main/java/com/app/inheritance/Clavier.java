package com.app.inheritance;

import jakarta.persistence.Entity;

@Entity
public class Clavier extends Entre {
private String mode;

public String getMode() {
	return mode;
}

public void setMode(String mode) {
	this.mode = mode;
}

}
