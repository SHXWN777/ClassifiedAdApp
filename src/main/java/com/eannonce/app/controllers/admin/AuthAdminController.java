package com.eannonce.app.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthAdminController {
	
	@RequestMapping("/LoginAdmin")
	public String LoginAdmin() {
		return "admin/loginAdmin";
		
	}
	
	@RequestMapping("/RegisterAdmin")
	public String RegisterAdmin() {
		return "admin/registerAdmin";
		
	}


}
