package com.hospital.hospitalfrontdesk.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.hospital.hospitalfrontdesk.model.SpecialistList;

@Component
public class SpecialistRestService {
	private RestTemplate restTemplate;
	@Value("${rest.hospital.specialist.resttemplate.url}")
	private String apiUrl;
	private static HttpHeaders httpHeaders;

	public SpecialistRestService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
		httpHeaders = new HttpHeaders();
		httpHeaders.set("Content-Type", "application/json");
	}

	public SpecialistList getSpecialistDetails(int hospitalId) throws Exception {
		SpecialistList specialistList = null;
		
		try {
			specialistList = restTemplate.getForObject(this.apiUrl+hospitalId, SpecialistList.class);
		} catch (Exception ex) {
			System.out.println("getQuotes Exception:" + ex.getMessage());
		}
		return specialistList;
	}

}
