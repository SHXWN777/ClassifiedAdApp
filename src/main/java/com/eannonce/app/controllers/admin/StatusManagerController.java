package com.eannonce.app.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eannonce.app.model.Category;
import com.eannonce.app.model.Status;
import com.eannonce.app.service.StatusService;

@Controller
public class StatusManagerController {
	
	@Autowired
	private StatusService statusService;
	
	@RequestMapping("/StatusForm")
	public String StatusForm() {
		return "admin/statusManager";
	}
	
	@PostMapping("/SaveStatus")
	public String SaveStatus(@ModelAttribute("status") Status status) {
		statusService.saveStatus(status);
		return "admin/statusManager";
	}


}
