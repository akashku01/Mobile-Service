package com.infy.service;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.logging.LogFactory;

import com.infy.dao.MobileServiceDAO;
import com.infy.dao.MobileServiceDAOImpl;
import com.infy.exception.MobileServiceException;
import com.infy.model.ServiceReport;
import com.infy.model.ServiceRequest;
import com.infy.model.Status;
import com.infy.validator.Validator;

public class MobileServiceImpl implements MobileService {

	private MobileServiceDAO dao = new MobileServiceDAOImpl();
    private Validator validator=new Validator();

	@Override
	public ServiceRequest registerRequest(ServiceRequest service) throws MobileServiceException {
		ServiceRequest serviceFromDao;
		try {
			validator.validate(service);
			Float serviceFee = calculateEstimateCost(service.getIssues());
			if (serviceFee <= 0) {
				throw new MobileServiceException("Service.INVALID_ISSUES");
			}
			service.setServiceFee(serviceFee);
			service.setStatus(Status.ACCEPTED);
			service.setTimeOfRequest(LocalDateTime.now());
			serviceFromDao = dao.registerRequest(service);
		}

		catch (MobileServiceException mobileServiceException) {
			if (mobileServiceException.getMessage().startsWith("Service")) {
			   LogFactory.getLog(getClass()).error(mobileServiceException.getMessage(), mobileServiceException);
			}

			throw mobileServiceException;
		}

		return serviceFromDao;
	}

	@Override
	public Float calculateEstimateCost(List<String> issues) throws MobileServiceException {
		Float totalCost = 0.0F;
		for (String issue : issues) {
			if (issue.equalsIgnoreCase("BATTERY")) {
				totalCost += 10;
			} else if (issue.equalsIgnoreCase("CAMERA")) {
				totalCost += 5;
			} else if (issue.equalsIgnoreCase("SCREEN")) {
				totalCost += 15;
			}

		}

		return totalCost;
	}

	@Override
	public List<ServiceReport> getServices(Status status) throws MobileServiceException {
		List<ServiceReport> a = new ArrayList<>();
		try{


			List<ServiceRequest> b=dao.getServices();
			if (a.isEmpty()) {
				throw new MobileServiceException("Service.NO_RECORDS_FOUND");

			}

		} catch (Exception e){
			throw new MobileServiceException("Service.NO_RECORDS_FOUND");
		}



		return a;
		
	}

}
