package com.fahrul.springcrudmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fahrul.springcrudmysql.entity.Product;
import com.fahrul.springcrudmysql.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products){
		return service.saveProducts(products);
	}
	
	@GetMapping("/products")
	public List<Product> findAllProduct(){
		return  service.getProducts();
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/getProductByName/{name}")
	public Product getProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
	

}
