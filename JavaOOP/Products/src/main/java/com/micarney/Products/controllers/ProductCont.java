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
public class ProductCont {
	
	private final ProductServ productServ;
	private final CategoryServ categoryServ;
	
	public ProductCont(ProductServ productServ, CategoryServ categoryServ) {
		this.productServ = productServ;
		this.categoryServ = categoryServ;
	}
	
	@RequestMapping("/")
	public String index(Model m) {
	m.addAttribute("products", productServ.allProducts());
	m.addAttribute("categories", categoryServ.allCategories());
	return "index.jsp";
	}
	
	@RequestMapping("/product/new")
	public String newProduct(@ModelAttribute("product") ProductMod prod) {
		return "newprod.jsp";
	}
	
	@PostMapping("/product/create")
	public String createProduct(@Valid @ModelAttribute("product") ProductMod prod, BindingResult results) {
		if (results.hasErrors()) {
			return "newprod.jsp";
		}
		ProductMod p = productServ.createProduct(prod);
		return "redirect:/product/display/" + p.getId();
	}
	
	@RequestMapping("/product/display/{id}")
	public String displayProduct(@PathVariable("id") Long id, Model m) {
		ProductMod prod = productServ.findById(id);
		m.addAttribute("product", prod);
		m.addAttribute("categories", categoryServ.allCategories());
		return "dispprod.jsp";
	}
	
	@PostMapping("/product/{id}/addCategory")
	public String updateCategory(@PathVariable("id") Long id, @RequestParam("categories") Long c_id) {
		CategoryMod cat = categoryServ.findById(c_id);
		ProductMod prod = productServ.findById(id);
		productServ.updateCategories(prod, cat);
		return "redirect:/product/display/" + prod.getId();
	}
}