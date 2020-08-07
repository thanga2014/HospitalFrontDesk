package com.hospital.hospitalfrontdesk.model;

import java.util.List;

public class SpecialistList {
	List<Specialist> specialistList;

	
	public SpecialistList(List<Specialist> specialistList) {
		super();
		this.specialistList = specialistList;
	}

	public SpecialistList() {
		// TODO Auto-generated constructor stub
	}

	public List<Specialist> getSpecialistList() {
		return specialistList;
	}

	public void setSpecialistList(List<Specialist> specialistList) {
		this.specialistList = specialistList;
	}	
}
