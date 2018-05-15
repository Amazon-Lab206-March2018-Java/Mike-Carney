package com.micarney.Products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.micarney.Products.models.ProductMod;

public interface ProductRepo extends CrudRepository<ProductMod, Long>{
	List<ProductMod> findAll();

}
