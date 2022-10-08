package com.springboot.crud.springboot.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.springboot.crud.model.Product;
import com.springboot.crud.springboot.crud.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product)
	{
		return productRepository.save(product);
		
	}
	
	public List<Product> saveProducts(List<Product> Products)
	{
		return productRepository.saveAll(Products);
		
	}
	
	public List<Product> getProducts()
	{
		return productRepository.findAll();
		
	}
	public Optional<Product> getProductById(int id)
	{
	
		return productRepository.findById(id);
		
	}
	

	public String DeletePrtoduct(int id) {
		productRepository.deleteById(id);
		return "product removed !!"+id;
		
	}

	
}
