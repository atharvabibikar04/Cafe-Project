package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class CartItem extends BaseEntity {

	@OneToOne
	@JoinColumn(name = "product_id")
	private Products product;

	@ManyToOne
	private Cart cart;

	private int quantity;

	@Transient
	public double getSubtotal() {
		return product.getUnitPrice() * quantity;
	}

	// @NoargsConstructor

	public CartItem() {
		super();
	}

	// @allargsConstructor
	public CartItem(Products product, int quantity) {
		super();

		this.product = product;
		this.quantity = quantity;
	}

	// getter and setters

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// toString()
	@Override
	public String toString() {
		return "CartItem [ product=" + product + ", quantity=" + quantity + "]";
	}

}
