package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Category extends BaseEntity {

	@Column(length = 50, unique = true)
	private String CategoryName;
	private String description;
	// one to many : bi dir Category 1--->* Product
	// Category -- one , parent , inverse(since no FK mapping)
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)// ,fetch = FetchType.EAGER
	@JsonIgnore
	private List<Products> products = new ArrayList<>();	// init to empty list

	//ctor
	public Category(String categoryName, String description) {
		super();
		CategoryName = categoryName;
		this.description = description;
	}
	

	// getter_Setters
	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	

	//ToString()
	@Override
	public String toString() {
		return "Category [CategoryName=" + CategoryName + ", description=" + description + "]";
	}
	

//	
//	//add a method(convenience/helper) to establish a bi dir asso. between entities
//	public void addProduct(Products p)
//	{
//		//parent --> child
//		products.add(p);
//		//child --> parent
//		p.setProductCategory(this);
//	}
//	//add a method(convenience/helper) to remove a bi dir asso. between entities
//		public void removeProduct(Product p)
//		{
//			//parent ----X---> child
//			products.remove(p);
//			//child ----X----> parent
//			p.setProductCategory(null);
//			
//			
//		}
}
