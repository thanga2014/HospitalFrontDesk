package com.hospital.hospitalfrontdesk.handler;

public class APIErrorResponse {
	private String messageId;
	private String errorMessage;
	private int statucCde;
	private String timeStamp;
	
	
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getStatucCde() {
		return statucCde;
	}
	public void setStatucCde(int statucCde) {
		this.statucCde = statucCde;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
