package com.micarney.Products.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.micarney.Products.models.CategoryMod;
import com.micarney.Products.models.ProductMod;
import com.micarney.Products.services.CategoryServ;
import com.micarney.Products.services.ProductServ;

@Controller
public class CategoryCont {
	private final CategoryServ categoryServ;
	private final ProductServ productServ;
	
	public CategoryCont(ProductServ productServ, CategoryServ categoryServ) {
		this.productServ = productServ;
		this.categoryServ = categoryServ;
		
	}
	
	@RequestMapping("/category/new")
	public String newCategory(@ModelAttribute("category") CategoryMod cat) {
		return "newcat.jsp";
	}
	
	@PostMapping("/category/create")
	public String createCategory(@Valid @ModelAttribute("category") CategoryMod cat, BindingResult results) {
		if (results.hasErrors()) {
			return "newcat.jsp";
		}
		categoryServ.createCategory(cat);
		return "dispcat.jsp";
	}
	
	@RequestMapping("/category/display/{id}")
	public String displayCategory(@PathVariable("id") Long id, Model m) {
		CategoryMod cat = categoryServ.findById(id);
		if (cat != null) {
			m.addAttribute("category", cat);
			m.addAttribute("products", productServ.allProducts());
			return "dispcat.jsp";
		}
		return "redirect:/";
	}
	
	@PostMapping("/category/{id}/addProduct")
	public String updateProducts(@PathVariable("id") Long id, @RequestParam("products") Long p_id) {
		ProductMod prod = productServ.findById(p_id);
		CategoryMod cat = categoryServ.findById(id);
		categoryServ.updateProducts(cat, prod);
		return "redirect:/";
	}
}
