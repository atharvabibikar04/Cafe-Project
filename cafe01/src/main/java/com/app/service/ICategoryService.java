package com.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.entity.Category;

public interface ICategoryService {

	ResponseEntity<Category> addCategory(Category catobj);

	void deleteCategoryById(Long id);

	List<Category> viewAllCat();
	
//	String updateCategoryName(Category catObj);

}
