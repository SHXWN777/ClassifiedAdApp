package com.eannonce.app.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeUserController {
	
	@RequestMapping("/HomeUser")
	public String HomeUser() {
		return "user/homeUser";
	}

}
