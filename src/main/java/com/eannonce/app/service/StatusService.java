package com.eannonce.app.service;

import org.springframework.stereotype.Service;

import com.eannonce.app.model.Status;

@Service
public interface StatusService {
	
	Status saveStatus(Status status);

}
