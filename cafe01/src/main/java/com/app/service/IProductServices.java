package com.app.service;

import java.util.List;

import com.app.entity.Products;

public interface IProductServices {

	List<Products> allProdList();

	void addProd(Products prod);

	void deleteProdById(Long pid);

	void updateProdById(Products prod);


}
