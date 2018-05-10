package com.micarney.reloaded.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micarney.reloaded.models.Models;
import com.micarney.reloaded.services.Services;
import com.micarney.reloaded.repositories.*;
@Controller
public class Controllers {
	private final Services languagesService;
	public Controllers(Services languagesService) {
		this.languagesService = languagesService;
	}
	
	@RequestMapping("/languages")
	public String languages(@ModelAttribute("language") Models language, Model m) {
		List<Models> languages = languagesService.allLanguages();
		m.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String createLanguage(@Valid @ModelAttribute("language") Models language, BindingResult results) {
		if(results.hasErrors()) {
			return "index.jsp";
		}
		else {
			languagesService.addLanguage(language);
			return "redirect:/languages";
			
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String findLanguages(Model m, @PathVariable("id") Long id) {
		Models language = languagesService.findLanguageById(id);
		m.addAttribute("language", language);
		return "details.jsp";
	}
	
	@RequestMapping("languages/edit/{id}")
	public String editLanguage(@PathVariable("id") Long id, Model m) {
		Models language = languagesService.findLanguageById(id);
		if (language != null) {
			m.addAttribute("language", language);
			return "edit.jsp";
		} else {
			return "redirect:/languages";
		}
	}
	
	@PostMapping("/languages/edit/{id}")
	public String updateLanguage(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Models language, BindingResult results) {
		if (results.hasErrors()) {
			return "edit.jsp";
		} else {
			languagesService.updateLanguage(id, language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value="/languages/delete/{id}")
	public String destroyLanguage(@PathVariable("id") Long id) {
		languagesService.destroyLanguage(id);
		return "redirect:/languages";
	}

}
