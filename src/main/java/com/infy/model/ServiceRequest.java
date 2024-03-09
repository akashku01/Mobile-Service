package com.infy.model;

import java.time.LocalDateTime;
import java.util.List;

public class ServiceRequest{
	private Integer serviceId;
	private String brand;
	private List<String> issues;
	private LocalDateTime timeOfRequest;
	private Float serviceFee;
	private Status status;

	public ServiceRequest(String brand, List<String> issues) {
		super();
		this.brand = brand;
		this.issues = issues;
		
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<String> getIssues() {
		return issues;
	}

	public void setIssues(List<String> issues) {
		this.issues = issues;
	}


	public LocalDateTime getTimeOfRequest() {
		return timeOfRequest;
	}

	public void setTimeOfRequest(LocalDateTime timeOfRequest) {
		this.timeOfRequest = timeOfRequest;
	}

	public Float getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Float serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

//	public Long getiMEINumber() {
//		return iMEINumber;
//	}
//
//	public void setiMEINumber(Long iMEINumber) {
//		this.iMEINumber = iMEINumber;
//	}

	
}
