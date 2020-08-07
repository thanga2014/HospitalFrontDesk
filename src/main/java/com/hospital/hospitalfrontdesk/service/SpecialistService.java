package com.hospital.hospitalfrontdesk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.hospital.hospitalfrontdesk.model.Specialist;
import com.hospital.hospitalfrontdesk.model.SpecialistList;

@Service
public class SpecialistService {
	@Cacheable("specialist")
	public SpecialistList getSpecialistList(int hospitalId) throws Exception {
		SpecialistList specialistList=new SpecialistList();
		List<Specialist> specialists = new ArrayList<>();
		specialists.add(new Specialist("Dentist", "sandhya", "Monday,Wednesday", "5 to 6", "Y", 946));
		specialists.add(new Specialist("Dentist", "saranya", "Monday,Thursday", "6 to 8", "N", 946));
		
		Predicate<Specialist> streamsPredicate = item -> item.getHospitalId() == hospitalId;
		List<Specialist> filteredSpecialistList = specialists.stream().filter(streamsPredicate)
				.collect(Collectors.toList());
		
		if (filteredSpecialistList.isEmpty()) {
			throw new Exception("No specialist details found");
		}
		specialistList.setSpecialistList(filteredSpecialistList);
		return specialistList;
	}
}
