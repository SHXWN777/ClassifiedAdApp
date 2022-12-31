package com.eannonce.app.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
	
	@RequestMapping("/CatAdsUser")
	public String CategoryAds() {
		return "user/catadsUser";
		
	}

}
