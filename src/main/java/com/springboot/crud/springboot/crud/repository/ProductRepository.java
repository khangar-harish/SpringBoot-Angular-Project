package com.springboot.crud.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.springboot.crud.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>  {

	

}
