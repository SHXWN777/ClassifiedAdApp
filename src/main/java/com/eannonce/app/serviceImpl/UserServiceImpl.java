package com.eannonce.app.serviceImpl;

import java.util.List;
import java.util.Optional;
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

	@Override
	public User getUserById(Long idUser) {
		Optional<User> optional = userRepository.findById(idUser);
		User user = null;
		if(optional.isPresent()) {
			user = optional.get();
		} else {
			throw new RuntimeException("User not found id ::" + idUser);
		}
		return user;
		//return userRepository.findById(idUser).orElse(null);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public List<User> listAll() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUserById(long idUser) {
		this.userRepository.deleteById(idUser);	
	}

	
	

	
}
