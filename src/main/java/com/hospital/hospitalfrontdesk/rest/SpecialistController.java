package com.hospital.hospitalfrontdesk.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospitalfrontdesk.model.Specialist;
import com.hospital.hospitalfrontdesk.model.SpecialistList;
import com.hospital.hospitalfrontdesk.service.SpecialistRestService;
import com.hospital.hospitalfrontdesk.service.SpecialistService;

@RestController
@RequestMapping("/rest")
public class SpecialistController {
	@Autowired
	public SpecialistService specialistService;
	@Autowired
	public SpecialistRestService specialistRestService;
	
	@GetMapping(value = "${rest.hospital.specialist.url}")
	@ResponseStatus(HttpStatus.OK)
	public SpecialistList getSpecialistDetails(@PathVariable int hospitalId) throws Exception {
		return specialistService.getSpecialistList(hospitalId);
	}
	@GetMapping(value = "${rest.hospital.specialist.url.v1}")
	@ResponseStatus(HttpStatus.OK)
	public SpecialistList getSpecialistDetailsService(@PathVariable int hospitalId) throws Exception {
		return specialistRestService.getSpecialistDetails(hospitalId);
	}
}
