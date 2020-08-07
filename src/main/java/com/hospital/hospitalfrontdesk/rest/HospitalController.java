package com.hospital.hospitalfrontdesk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.hospitalfrontdesk.model.Hospital;

@RestController
@RequestMapping("/rest")
public class HospitalController {
	@GetMapping(value = "${rest.hospital.availability.url}")
	@ResponseStatus(HttpStatus.OK)
	public String getHospital(@PathVariable String hospitalName) throws Exception {
		Hospital hospital = setHospitalDetails();
		if(!hospital.getHospitalName().equalsIgnoreCase(hospitalName)) {
			throw new Exception("Invalid Hospital Name");
		}
		if (hospital.getNoOfBeds() == 0) {
			throw new Exception("Bed not available");
		}
		return "Number of Beds Available is = " + hospital.getNoOfBeds();
	}

	private Hospital setHospitalDetails() {
		Hospital hospital = new Hospital();
		hospital.setHospitalName("Aurora");
		hospital.setNoOfBeds(5);
		return hospital;
	}
}
