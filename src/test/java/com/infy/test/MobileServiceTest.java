package com.infy.test;


import com.infy.exception.MobileServiceException;
import com.infy.model.ServiceRequest;
import com.infy.service.MobileService;
import com.infy.service.MobileServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class MobileServiceTest {
    
	private MobileService mobileService = new MobileServiceImpl();

	public void registerRequestInvalidBrandTest() throws MobileServiceException {
		List<String> issues =  new ArrayList<>();
		issues.add("Battery");
		ServiceRequest serviceRequest= new ServiceRequest("abc",issues);

		try {
			mobileService.registerRequest(serviceRequest);
		} catch (MobileServiceException e) {
			throw new RuntimeException(e);
		}
	}
    
}
