package com.micarney.DojoNinjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micarney.DojoNinjas.models.NinjaMod;
import com.micarney.DojoNinjas.services.DojoServ;
import com.micarney.DojoNinjas.services.NinjaServ;

@Controller
public class NinjaCont {
	private final NinjaServ ninjaserv;
	private final DojoServ dojoserv;
	
	public NinjaCont(NinjaServ ninjaserv, DojoServ dojoserv) {
		this.ninjaserv = ninjaserv;
		this.dojoserv = dojoserv;
	}
	
	@RequestMapping("/ninja/new")
	public String newNinja(@ModelAttribute("ninja") NinjaMod ninja, Model m) {
		m.addAttribute("dojos", dojoserv.allDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String createNinja(@Valid @ModelAttribute("ninja") NinjaMod ninja, BindingResult result, Model m) {
		if (result.hasErrors()) {
			return "newNinja.jsp";
		}
		ninjaserv.createNinja(ninja);
		return "redirect:/";
	}
}
