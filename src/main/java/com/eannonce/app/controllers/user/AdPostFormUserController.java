package com.eannonce.app.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eannonce.app.model.Ads;
import com.eannonce.app.model.AdsRealEstate;
import com.eannonce.app.service.AdsReService;
import com.eannonce.app.service.AdsService;

//@RequestMapping("/AdPost")
@Controller
public class AdPostFormUserController {
	
	@Autowired
	private AdsService adsService;
	
	@Autowired
	private AdsReService adsReService;
	
	@RequestMapping("/AdPostUser")
	public String AdPostForm() {
		return "user/adpostformUser";
	}
	
	@PostMapping("/saveAds")
	public String saveAds(@ModelAttribute("ads") Ads ads) {
		adsService.saveAds(ads);
		return "user/adreformUser";
	}
	
	@GetMapping("/AdReForm")
	public String AdReForm() {
		return "user/adreformUser";
	}
	
	@PostMapping("/saveAdsRe")
	public String saveAdsRe(@ModelAttribute("adsRe") AdsRealEstate adsRe) {
		adsReService.saveAdsRe(adsRe);
		return "user/dashboardUser";
	}
	
}
