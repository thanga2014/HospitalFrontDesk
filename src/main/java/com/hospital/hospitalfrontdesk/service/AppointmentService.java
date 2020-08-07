package com.hospital.hospitalfrontdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.hospitalfrontdesk.config.AllConfig;
import com.hospital.hospitalfrontdesk.model.Appointment;

@Service
public class AppointmentService {
	@Autowired
	AllConfig allConfig;

	public Appointment getAppointment(Appointment appointment) throws Exception {
		Appointment newAppointment = null;
		if (allConfig.getSpecialistName().equalsIgnoreCase(appointment.getSpecialistName())
				&& allConfig.getSpecialistAvailableDay().equalsIgnoreCase(appointment.getAppointmentDay())) {
			newAppointment = new Appointment();
			newAppointment.setAppointmentTime(allConfig.getSpecialistAvailableTime());
			newAppointment.setAppointmentDay(allConfig.getSpecialistAvailableDay());
			newAppointment.setPatientName(appointment.getPatientName());
			newAppointment.setSpecialistName(appointment.getSpecialistName());
		}
		if (newAppointment == null) {
			throw new Exception("No specialist details found for specified hospital name");
		}
		return newAppointment;
	}
}
