package com.eannonce.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eannonce.app.model.User;
import com.eannonce.app.repository.UserRepository;
import com.eannonce.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User connexion(String username, String password) {
		User user = userRepository.findByUsernameAndPassword(username, password);
		return user;
	}

}
