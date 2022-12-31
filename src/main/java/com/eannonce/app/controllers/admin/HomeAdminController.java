package com.eannonce.app.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeAdminController {
	
	@RequestMapping("/HomeAdmin")
	public String HomeAdmin() {
		return "admin/homeAdmin";
		
	}

}
