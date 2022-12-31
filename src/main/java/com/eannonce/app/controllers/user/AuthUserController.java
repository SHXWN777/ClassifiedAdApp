package com.eannonce.app.controllers.user;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eannonce.app.model.User;
import com.eannonce.app.service.UserService;


@Controller
public class AuthUserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/LoginUser")
	public String LoginUser() {
		return "user/loginUser";
	}
	
	@RequestMapping("/RegisterUser")
	public String RegisterUser() {
		return "user/registerUser";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "user/loginUser";
	}
	
	@PostMapping("/connexion")
	public String Connexion(@ModelAttribute("user") User user) {
		User oauthUser = userService.connexion(user.getUsername(), user.getPassword());
		
		System.out.println(oauthUser);
		
		if(Objects.nonNull(oauthUser)) {
			return "user/homeUser";
		} else {
			return "user/loginError";
		}
	}
	
	
	
	
}
