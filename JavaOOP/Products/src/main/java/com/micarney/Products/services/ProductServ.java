package com.micarney.Products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.micarney.Products.models.CategoryMod;
import com.micarney.Products.models.ProductMod;
import com.micarney.Products.repositories.ProductRepo;

@Service
public class ProductServ {
	private final ProductRepo productRepo;
	public ProductServ(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	public List<ProductMod> allProducts() {
		return productRepo.findAll();
	}
	
	public ProductMod createProduct(ProductMod prod) {
		return productRepo.save(prod);
	}
	
	public ProductMod findById(Long id) {
		Optional<ProductMod> product = productRepo.findById(id);
		if (product != null) {
			return product.get();
		}
		return null;
	}
	
	public void updateCategories(ProductMod prod, CategoryMod cat) {
		prod.updateCategories(cat);
		productRepo.save(prod);
	}
}

