package com.micarney.Products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.micarney.Products.models.CategoryMod;

public interface CategoryRepo extends CrudRepository<CategoryMod, Long>{
	List<CategoryMod> findAll();

}
