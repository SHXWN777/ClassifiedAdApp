package com.eannonce.app.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eannonce.app.model.ServiceRe;
import com.eannonce.app.model.Status;
import com.eannonce.app.model.TypeRe;
import com.eannonce.app.service.ServiceReService;
import com.eannonce.app.service.TypeReService;

@Controller
public class RealEstateManagerController<method> {
	
	@Autowired
	private TypeReService typeReService;
	
	@Autowired
	private ServiceReService servReService;
	
	@RequestMapping("/TypeReForm")
	public String TypeReForm() {
		return "admin/typeReManager";
	}
	
	@PostMapping("/SaveTypeRe")
	public String SaveStatus(@ModelAttribute("typeRe") TypeRe typeRe) {
		typeReService.saveTypeRe(typeRe);
		return "admin/typeReManager";
	}
	
	@GetMapping("/ListTypeRe")
	public String ListTypeRe(Model model) {
		model.addAttribute("listTypeRe", typeReService.getAllTypeRes());
		return "admin/typeReManager";
	}
	
	@GetMapping("/ServiceReForm")
	public String ServReForm() {
		return "admin/servReManager";
	}
	
	@PostMapping("/SaveServiceRe")
	public String SaveServRe(@ModelAttribute("serviceRe") ServiceRe serviceRe) {
		servReService.saveServiceRe(serviceRe);
		return "admin/servReManager";
	}

	@GetMapping("/ListServiceRe")
	public String ListServiceRe(Model model) {
		model.addAttribute("listServiceRes", servReService.getAllServiceRe());
		return "admin/servReManager";
	}
	

}
