package com.eannonce.app.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eannonce.app.model.User;
import com.eannonce.app.service.UserService;

//@RequestMapping("/user")
@Controller
public class ProfileUserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/ProfileUser")
	public String ProfileUser() {
		return "user/profileUser";
	}
	
	@PutMapping("/user/update/{idUser}")
	public String findByUserId(@PathVariable (value = "idUser") long idUser, Model model) {
		//model.addAttribute("user", userService.getUserById(idUser));
		User user = userService.getUserById(idUser);
		model.addAttribute("user", user);
		return "user/profileUser";
	}
	
	@PostMapping("/user/{idUser}")
	public String updateUser(@PathVariable Long idUser, @ModelAttribute("user") User user, Model model) {
		User existingUser = userService.getUserById(idUser);
	    existingUser.setFirstName(user.getFirstName());
	    existingUser.setLastName(user.getLastName());
	    userService.updateUser(existingUser);
		return "user/profileUser";		
	}
	

}
