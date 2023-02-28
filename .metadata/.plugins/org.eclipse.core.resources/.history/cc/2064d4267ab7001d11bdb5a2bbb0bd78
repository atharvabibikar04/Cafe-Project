package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity

public class Products extends BaseEntity{

	
	@Column(length = 50, unique = true)
	private String foodName;

	@Column(length = 150)
	private String foodDetails;

	@Column(length = 150)
	private String imageUrl;

	@Column
	private boolean available;
	
	@Column
	private double unitPrice;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;

	// ctor
	public Products(String foodName, double unitPrice, String foodDetails) {
		super();
		this.foodName = foodName;
		this.unitPrice = unitPrice;
		this.foodDetails = foodDetails;
	
	}
	
	// getter_setters
	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public String getFoodDetails() {
		return foodDetails;
	}


	public void setFoodDetails(String foodDetails) {
		this.foodDetails = foodDetails;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	// toString()
	@Override
	public String toString() {
		return "Products [foodName=" + foodName + ", foodDetails=" + foodDetails + ", imageUrl=" + imageUrl
				+ ", available=" + available + ", unitPrice=" + unitPrice + "]";
	}
	
	
	
}
