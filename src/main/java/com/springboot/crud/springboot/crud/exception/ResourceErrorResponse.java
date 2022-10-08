package com.springboot.crud.springboot.crud.exception;

public class ResourceErrorResponse {
	private int Status;
	private String Message;
	private long timeStamp;
	
	
	public ResourceErrorResponse(int status, String message, long timeStamp) {
		super();
		Status = status;
		Message = message;
		this.timeStamp = timeStamp;
	}
	public ResourceErrorResponse() {
		
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
		
}
