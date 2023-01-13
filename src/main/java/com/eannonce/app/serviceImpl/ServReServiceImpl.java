package com.eannonce.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eannonce.app.model.ServiceRe;
import com.eannonce.app.repository.ServiceReRepository;
import com.eannonce.app.service.ServiceReService;

@Service
public class ServReServiceImpl implements ServiceReService {
	
	@Autowired
	private ServiceReRepository serviceReRepository;

	@Override
	public ServiceRe saveServiceRe(ServiceRe serviceRe) {
		return serviceReRepository.save(serviceRe);
	}

}
