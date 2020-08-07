package com.hospital.hospitalfrontdesk.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<APIErrorResponse> handleException(Exception e){
		APIErrorResponse errorResponse = new APIErrorResponse();
		errorResponse.setErrorMessage("Meesage: "+e.getMessage());
		return new ResponseEntity<APIErrorResponse>(errorResponse,HttpStatus.CONFLICT);
	}
}
