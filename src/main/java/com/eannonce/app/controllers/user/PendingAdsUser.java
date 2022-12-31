package com.eannonce.app.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PendingAdsUser {
	
	@RequestMapping("/PendingAdsUser")
	public String PendingAds() {
		return "user/pendadsUser";
		
	}

}
