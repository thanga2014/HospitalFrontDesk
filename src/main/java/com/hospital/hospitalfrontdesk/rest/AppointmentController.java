package com.hospital.hospitalfrontdesk.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospitalfrontdesk.model.Appointment;
import com.hospital.hospitalfrontdesk.service.AppointmentService;

@RestController
@RequestMapping("/rest")
public class AppointmentController {
	@Autowired
	public AppointmentService appointmentService;
	
	@GetMapping(value = "${rest.hospital.appointment.url}")
	@ResponseStatus(HttpStatus.OK)
	public Appointment getSpecialistDetails(@RequestBody Appointment appointment) throws Exception {
		return appointmentService.getAppointment(appointment);
	}
}
