package com.eannonce.app.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eannonce.app.model.Category;
import com.eannonce.app.service.CategoryService;

@Controller
class CategoryManagerController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/CategoryForm")
	public String CategoryForm() {
		return "admin/categoryManager";
	}
	
	@PostMapping("/SaveCategory")
	public String SaveCategory(@ModelAttribute("category") Category category) {
		categoryService.saveCategory(category);
		return "admin/categoryManager";
	}
	
	@GetMapping("/ListCategory")
	public String ListCategory(Model model) {
		List<Category> listCategories = categoryService.findAll();
		return "admin/categoryManager";
	}

}
