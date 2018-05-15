package com.micarney.Products.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.micarney.Products.models.CategoryMod;
import com.micarney.Products.models.ProductMod;
import com.micarney.Products.repositories.CategoryRepo;

@Service
public class CategoryServ {
	private final CategoryRepo categoryRepo;
	public CategoryServ(CategoryRepo categoryRepo) {
		this.categoryRepo = categoryRepo;
	}
	
	public List<CategoryMod> allCategories() {
		return categoryRepo.findAll();
	}
	
	public CategoryMod createCategory(@Valid CategoryMod cat) {
		return categoryRepo.save(cat);
	}
	
	public CategoryMod findById(Long id) {
		Optional<CategoryMod> cat = categoryRepo.findById(id);
		if (cat != null) {
			return cat.get();
		}
		return null;
	}
	
	public void updateProducts(CategoryMod cat, ProductMod prod) {
		cat.updateProducts(prod);
		categoryRepo.save(cat);
	}
}

