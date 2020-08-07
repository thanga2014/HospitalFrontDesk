package com.hospital.hospitalfrontdesk.model;

public class Specialist {
	private String type;
	private String name;
	private String availableDay;
	private String availableTime;
	private String isAvailable;
	private int hospitalId;
	public Specialist() {
		
	}
	public Specialist(String type, String name, String availableDay, String availableTime, String isAvailable,
			int hospitalId) {
		super();
		this.type = type;
		this.name = name;
		this.availableDay = availableDay;
		this.availableTime = availableTime;
		this.isAvailable = isAvailable;
		this.hospitalId = hospitalId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailableDay() {
		return availableDay;
	}

	public void setAvailableDay(String availableDay) {
		this.availableDay = availableDay;
	}

	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

}
