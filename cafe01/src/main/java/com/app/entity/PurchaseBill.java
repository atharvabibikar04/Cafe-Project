package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;

@Entity
@Getter
@Table(name = "purchase_bill")
public class PurchaseBill extends BaseEntity {

	private double totalAmount;

	@ReadOnlyProperty
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate billDate;

	@OneToOne
	private Products product;

	private int quantity;

	private double unitPrice;

	public PurchaseBill(double totalAmount) {
		super();
		this.billDate = LocalDate.now();
	}

	public PurchaseBill() {
		super();
		this.billDate = LocalDate.now();

	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = (this.unitPrice * this.quantity);
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public void setProducts(Products product) {
		this.product = product;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
