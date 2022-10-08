package com.springboot.crud.springboot.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.springboot.crud.model.Product;
import com.springboot.crud.springboot.crud.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	
	  @PostMapping("/saveProduct") public Product saveProduct(@RequestBody Product
	  product) { return productService.saveProduct(product);
	  
	  }
	  
	  @PostMapping("/saveListofProduct") public List<Product>
	  saveProducts(List<Product> Products) { return productService.saveProducts(Products);
	  
	  }
	 
	@GetMapping("/getName")
	public String getMsg()
	{
		return "Heelo";	
	}
	
	@GetMapping("/getProducts")
	public List<Product> getProducts()
	{
		return productService.getProducts();	
	}
	
	
	  @GetMapping("/Product/{id}") public Optional<Product>
	  getProductById(@PathVariable int id) { return productService.getProductById(id);
	  
	  }
	  
	  @DeleteMapping("/delete/{id}") public String deleteproduct(@PathVariable int
	  id) { return productService.DeletePrtoduct(id);
	  
	  }
	  

}
