package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Products;
import com.app.repository.IProdRepo;

@Service
@Transactional
public class ProductServiceImpl implements IProductServices {

	
	@Autowired
	private IProdRepo prodRepo;
	@Override
	public List<Products> allProdList() {
		
		return prodRepo.findAll();
	}
	@Override
	public void addProd(Products prod) {
		
			prodRepo.save(prod); // if cat id null add new category 
		}
	@Override
	public void deleteProdById(Long pid) {
		prodRepo.deleteById(pid);
		
	}
	@Override
	public void updateProdById(Products prod) {
	 if(prodRepo.existsById(prod.getId())) {
		 prodRepo.save(prod);
	 }
		
	}

		
	}


