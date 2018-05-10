package com.micarney.Languages.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micarney.Languages.models.LanguagesModels;
import com.micarney.Languages.services.LanguagesService;

@Controller
public class LanguagesControler {
	private final LanguagesService languagesService;
	public LanguagesControler(LanguagesService languagesService) {
		this.languagesService = languagesService;
	}
	
	@RequestMapping("/languages")
	public String languages(@ModelAttribute("language") LanguagesModels language, Model m) {
		List<LanguagesModels> languages = languagesService.alllanguages();
		m.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String createLanguage(@Valid @ModelAttribute("language") LanguagesModels language, BindingResult results) {
		if(results.hasErrors()) {
			return "index.jsp";
		}
		else {
			languagesService.addLanguage(language);
			return "redirect:/languages";
			
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String findLanguages(Model m, @PathVariable("id") int id) {
		LanguagesModels language = languagesService.findLanguages(id);
		List<LanguagesModels> languages = languagesService.alllanguages();
		m.addAttribute("languages",languages);
		m.addAttribute("language", language);
		return "details.jsp";
	}
	
	@RequestMapping("languages/edit/{id}")
	public String editLanguage(@PathVariable("id") int id, Model m) {
		LanguagesModels language = languagesService.findLanguages(id);
		if (language != null) {
			m.addAttribute("language", language);
			return "edit.jsp";
		} else {
			return "redirect:/languages";
		}
	}
	
	@PostMapping("/languages/edit/{id}")
	public String updateLanguage(@PathVariable("id") int id, @Valid @ModelAttribute("language") LanguagesModels language, BindingResult results) {
		if (results.hasErrors()) {
			return "edit.jsp";
		} else {
			languagesService.updateLanguage(id, language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value="/languages/delete/{id}")
	public String destroyLanguage(@PathVariable("id") int id) {
		languagesService.destroyLanguage(id);
		return "redirect:/languages";
	}

}
