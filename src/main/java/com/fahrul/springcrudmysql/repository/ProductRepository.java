package com.fahrul.springcrudmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrul.springcrudmysql.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	Product findByName(String name);

}
