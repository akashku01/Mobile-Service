package com.infy.model;


import java.util.List;

//Implement class according to class diagram
public class ServiceReport {
	//your code goes here	
	private int serviceId;
    private String brand;
    private List<String> issues;
    private float serviceFee;

    public int getServiceId() {
        return serviceId;
    }

    public String getBrand() {
        return brand;
    }

    public List<String> getIssues() {
        return issues;
    }

    public float getServiceFee() {
        return serviceFee;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIssues(List<String> issues) {
        this.issues = issues;
    }

    public void setServiceFee(float serviceFee) {
        this.serviceFee = serviceFee;
    }

    ServiceReport(int serviceId, String brand, List<String> issues, float serviceFee){

    }
}
