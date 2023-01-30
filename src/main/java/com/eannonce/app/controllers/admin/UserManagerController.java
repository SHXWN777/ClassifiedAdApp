package com.eannonce.app.controllers.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eannonce.app.model.User;
import com.eannonce.app.service.UserService;

//@RequestMapping("/user")
@Controller
public class UserManagerController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/UserManager")
	public String UserManager() {
		return "admin/usermanagerAdmin";
	}
	
	@GetMapping("/ListUser")
	public String ListUser(Model model) {
		model.addAttribute("listUsers", userService.getAllUsers());
		return "admin/usermanagerAdmin";
	}
		
//	@GetMapping("/")
//	public String ListUser(Model model) {
//		List<User> listUsers = userService.listAll();
//		model.addAttribute("listUsers", listUsers);
//			//if (listUsers==null) {
//			//	listUsers = new ArrayList<User>();
//			//}					
//		//model.addAttribute("listUsers", userService.getAllUsers());
//		
//		return "admin/usermanagerAdmin";
//	}
	
	
	
	@DeleteMapping("deleteUser/{idUser}")
	public String deleteUser(@PathVariable (value="idUser") long idUser) {
		this.userService.deleteUserById(idUser);
		return "redirect:/";
	}

}
