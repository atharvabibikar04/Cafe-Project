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

import com.app.entity.Products;
import com.app.service.IProductServices;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private IProductServices prodService;

	@GetMapping("/view")
	public List<Products> viewAllProds() {

		return prodService.allProdList();
	}

	@PostMapping("/add")
	public void addProducts(@RequestBody Products prod) {
		prodService.addProd(prod);
	}

	
	@DeleteMapping("/delete/{pid}")
	public void deleteById(@PathVariable Long pid) {
		prodService.deleteProdById(pid);
	}
	
	@PutMapping("/update/{pid}")
	public void updateById(@RequestBody Products prod) {
		prodService.updateProdById(prod);
	}
	
}