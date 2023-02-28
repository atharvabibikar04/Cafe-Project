package com.app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Category;
import com.app.service.ICategoryService;


@RequestMapping("/category")
@RestController
public class CategoryController {

	
	@Autowired
	private ICategoryService catService;
	@PostMapping("/add")
	public void addNewCategory(@RequestBody Category catobj) {
		catService.addCategory(catobj);
	}
	
	
	@DeleteMapping("/delete/{catId}")
	public void deleteCategory(@PathVariable Long catId) {
		catService.deleteCategoryById(catId);
	}
	
	@GetMapping("/view")
	public List<Category> viewAllCategory() {
	
	return catService.viewAllCat(); 
	}
	
	
//	@PutMapping("/update/{catId}")
//	public String updateName(@RequestBody Category catObj) {
//		return catService.updateCategoryName(catObj);
//	}
//	
	

	
	
	
	
	
	
	
	
}