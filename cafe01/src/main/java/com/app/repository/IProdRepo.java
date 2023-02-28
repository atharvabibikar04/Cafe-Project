package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Products;

public interface IProdRepo extends JpaRepository<Products,Long> {

}
