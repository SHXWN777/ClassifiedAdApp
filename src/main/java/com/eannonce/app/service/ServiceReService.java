package com.eannonce.app.service;

import org.springframework.stereotype.Service;

import com.eannonce.app.model.ServiceRe;

@Service
public interface ServiceReService {
	
	ServiceRe saveServiceRe(ServiceRe serviceRe);

}
