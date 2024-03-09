package com.infy.dao;

import java.util.Arrays;
import java.util.List;

import com.infy.model.ServiceRequest;
import com.infy.model.Status;

public class MobileServiceDAOImpl implements MobileServiceDAO {
	
	@Override
	public ServiceRequest registerRequest(ServiceRequest service)  {
		service.setServiceId(1000);
		return service;
	}

	@Override
	public List<ServiceRequest> getServices()  {

		ServiceRequest service = new ServiceRequest("TwoMinus", Arrays.asList("Battery", "Camera", "Screen"));
		ServiceRequest service1 = new ServiceRequest("TwoMinus", Arrays.asList("Camera", "Screen"));
		ServiceRequest service2 = new ServiceRequest("Motorolling", Arrays.asList("Camera"));
		ServiceRequest service3 = new ServiceRequest("Motorolling", Arrays.asList("Camera", "Screen"));
		ServiceRequest service4 = new ServiceRequest("Pineapple", Arrays.asList("Battery Drain", "Camera"));
		ServiceRequest service5 = new ServiceRequest("Pineapple", Arrays.asList("Battery Drain", "Screen"));
		ServiceRequest service6 = new ServiceRequest("TwoMinus", Arrays.asList("Battery Drain","Battery"));
		ServiceRequest service7 = new ServiceRequest("TwoMinus", Arrays.asList("Screen"));

		
		service.setServiceId(1001);
		service1.setServiceId(1002);
		service3.setServiceId(1003);
		service2.setServiceId(1004);
		service4.setServiceId(1005);
		service5.setServiceId(1006);
		service6.setServiceId(1007);
		service7.setServiceId(1008);

		service.setStatus(Status.IN_PROGRESS);
		service1.setStatus(Status.COMPLETED);
		service3.setStatus(Status.COMPLETED);
		service2.setStatus(Status.COMPLETED);
		service4.setStatus(Status.COMPLETED);
		service5.setStatus(Status.ACCEPTED);
		service6.setStatus(Status.COMPLETED);
		service7.setStatus(Status.COMPLETED);

		return Arrays.asList(service, service1, service2, service3, service4, service5, service6, service7);
	}

}
