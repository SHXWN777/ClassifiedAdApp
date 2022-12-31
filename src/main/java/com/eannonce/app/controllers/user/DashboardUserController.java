package com.eannonce.app.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardUserController {
	
	@RequestMapping("/DashboardUser")
	public String DashboardUser() {
		return "user/dashboardUser";
	}

}
