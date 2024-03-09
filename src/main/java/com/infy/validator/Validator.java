package com.infy.validator;

import java.util.List;

import org.apache.commons.logging.LogFactory;

import com.infy.exception.MobileServiceException;
import com.infy.model.ServiceRequest;


public class Validator {

	public void validate(ServiceRequest service) throws MobileServiceException{	
		//your code goes here
		String exceptionMessage = null;

		if (!(isValidBrand(service.getBrand())))
		{
		    exceptionMessage = "Validator.INVALID_BRAND";
		}
		else if (!(isValidIssues(service.getIssues())))
		{
		    exceptionMessage = "Validator.INVALID_NO_OF_ISSUES";
		}

	
		if (exceptionMessage != null)
		{
		    MobileServiceException exception = new  MobileServiceException(exceptionMessage);

	    LogFactory.getLog(getClass())
		      .error(exception.getMessage(), exception);

		    throw exception;
		}
	}	

	
	// validates the brand
	// brand should always start with a upper case alphabet 
	// and can be followed by one or more alphabets (lower case or upper case) 
	public Boolean isValidBrand(String brand){
		return brand.matches("[A-Z][a-zA-Z]+");
	}
	
	
	// validates the list of services
	// checks if the list is null or empty
	public Boolean isValidIssues(List<String> issues) {
		return !(issues.isEmpty()) && !(issues.equals(null));
	}

		
	
}
