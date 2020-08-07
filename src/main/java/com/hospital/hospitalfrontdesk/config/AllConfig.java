package com.hospital.hospitalfrontdesk.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:specialist.properties"})
public class AllConfig {
	
	@Value("${specialist.name}")
	private String specialistName;
	
	@Value("${specialist.availableday}")
	private String specialistAvailableDay;
	
	@Value("${specialist.availabletime}")
	private String specialistAvailableTime;

	public String getSpecialistName() {
		return specialistName;
	}

	public String getSpecialistAvailableDay() {
		return specialistAvailableDay;
	}

	public String getSpecialistAvailableTime() {
		return specialistAvailableTime;
	}

}
