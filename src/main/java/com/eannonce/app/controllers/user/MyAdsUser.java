package com.eannonce.app.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAdsUser {
	
	@RequestMapping("/MyAdsUser")
	public String MyAds() {
		return "user/myadsUser";
	}

}
