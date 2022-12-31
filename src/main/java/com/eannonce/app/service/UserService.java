package com.eannonce.app.service;

import org.springframework.stereotype.Service;

import com.eannonce.app.model.User;

@Service
public interface UserService {
	
	User saveUser(User user);
	
	User connexion (String username, String password);

}
