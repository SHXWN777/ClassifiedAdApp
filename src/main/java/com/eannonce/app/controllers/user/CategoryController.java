package com.eannonce.app.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eannonce.app.model.Category;
import com.eannonce.app.model.User;
import com.eannonce.app.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/CatAdsUser")
	public String CategoryAds() {
		return "user/catadsUser";
		
	}

}
