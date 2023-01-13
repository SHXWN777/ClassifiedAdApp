package com.eannonce.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eannonce.app.model.Status;
import com.eannonce.app.repository.StatusRepository;
import com.eannonce.app.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {
	
	@Autowired
	private StatusRepository statusRepository;

	@Override
	public Status saveStatus(Status status) {
		return statusRepository.save(status);
	}

}
