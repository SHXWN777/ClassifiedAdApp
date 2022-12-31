package com.eannonce.app.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArchivedAdsUserController {
	
	@RequestMapping("/ArchAdsUser")
	public String ArchAds() {
		return "user/archadsUser";
		
	}

}
