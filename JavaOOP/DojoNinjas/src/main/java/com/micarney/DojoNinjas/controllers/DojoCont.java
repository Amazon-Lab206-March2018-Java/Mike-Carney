package com.micarney.DojoNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micarney.DojoNinjas.models.DojoMod;
import com.micarney.DojoNinjas.services.DojoServ;

@Controller
public class DojoCont {
	private final DojoServ dojoserv;
	public DojoCont(DojoServ dojoserv) {
		this.dojoserv = dojoserv;
	}
	
	@RequestMapping("/")
	public String index(Model m) {
		List<DojoMod> dojos = dojoserv.allDojos();
		m.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	
	@RequestMapping("/dojo/new")
	public String newDojo(@ModelAttribute("dojo")DojoMod dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojo/create")
	public String createDojo(@Valid @ModelAttribute("dojo")DojoMod dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		} else {
			dojoserv.createDojo(dojo);
			return "redirect:/";
		}

	}
}
