package com.eannonce.app.controllers.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eannonce.app.model.Ads;
import com.eannonce.app.service.AdsService;

@Controller
public class DashboardUserController {
	
	@Autowired
	private AdsService adsService;
	
	@RequestMapping("/DashboardUser")
	public String DashboardUser() {
		return "user/dashboardUser";
	}
	
//	@RequestMapping(value = ("/logout"), method = RequestMethod.POST)
//	public String logout(HttpServletRequest request, HttpServletResponse response) {
//		return "user/HomeUser";
//	}
	
	@GetMapping("/ListAds")
	public String ListAds(Model model) {
		List<Ads> listAdss = adsService.listAll();
		model.addAttribute("listAdss", listAdss);
			//if (listAdss==null) {
			//	listAdss = new ArrayList<Ads>();
			//}					
		//model.addAttribute("listAdss", adsService.getAllAds());
		
		return "user/dashboardUser";
	}
	
	@PutMapping("/ads/update/{idAds}")
	public String findByAdsId(@PathVariable (value = "idAds") long idAds, Model model) {
		//model.addAttribute("ads", adsService.getUserById(idAds));
		Ads ads = adsService.getAdsById(idAds);
		model.addAttribute("ads", ads);
		return "user/dashboardUser";
	}
	
	@DeleteMapping("deleteAds/{idAds}")
	public String deleteAds(@PathVariable (value="idAds") long idAds) {
		this.adsService.deleteAdsById(idAds);
		return "user/dashboardUser";
	}

}
