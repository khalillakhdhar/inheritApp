package com.app.inheritance;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
@Entity
@DiscriminatorColumn(name = "type")
@Inheritance(strategy = InheritanceType.JOINED)
public class Devices {
	@Id
	private long id;
	private String deviceName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	

}
