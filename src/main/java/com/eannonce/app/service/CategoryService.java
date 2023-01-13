package com.eannonce.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eannonce.app.model.Category;

@Service
public interface CategoryService {
	
	Category saveCategory(Category category);

	List<Category> findAll();

}
