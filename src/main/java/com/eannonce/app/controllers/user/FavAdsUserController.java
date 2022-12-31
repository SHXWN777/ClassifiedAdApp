package com.eannonce.app.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FavAdsUserController {
	
	@RequestMapping("/FavAdsUser")
	public String FavAds() {
		return "user/favadsUser";		
	}

}
