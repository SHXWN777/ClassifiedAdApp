package com.eannonce.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.eannonce.app.model.User;

@Service
public interface UserService {
	
	User saveUser(User user);
	
	User connexion (String username, String password);
	
	User getUserById(Long idUser);
	User updateUser(User user);
	
	List<User> getAllUsers();
	List<User> listAll();
	
	void deleteUserById(long idUser);
	
	//User addphotouser (MultipartFile photo);

}
