package com.micarney.Licenses.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micarney.Licenses.models.License;
import com.micarney.Licenses.models.People;
import com.micarney.Licenses.services.LicenseServ;

@Controller
public class Controller1 {
	private final LicenseServ licenseServ;
	public Controller1(LicenseServ service) {
		this.licenseServ = service;
	}
	@RequestMapping ("/")
	public String show(Model m) {
		List<People> list = licenseServ.all_drivers();
		m.addAttribute("list", list);
		return "index.jsp";
	}
	@RequestMapping ("/persons/new")
	public String new_person(@ModelAttribute ("person") People person) {
		return "newperson.jsp";
	}
	@RequestMapping ("/licenses/new")
	public String new_license(@ModelAttribute ("license") License license, Model m) {
		List<People> list = licenseServ.all_drivers();
		m.addAttribute("list", list );
		m.addAttribute("number", String.format("%06d", 1+licenseServ.allLicenses().size()));
		return "newlicense.jsp";
	}
	
	@PostMapping ("/add")	
	public String addperson(@Valid @ModelAttribute("person") People person, BindingResult results) {
		 if (results.hasErrors()) {
	    		return "newperson.jsp";
	        }else{
	        	licenseServ.addPerson(person);
	            return "redirect:/licenses/new";
	        }
	}
	
	@PostMapping ("/addlicense")	
	public String addlicense(@Valid @ModelAttribute ("license") License license, BindingResult results) {
		 if (results.hasErrors()) {
	    		return "newlicense.jsp";
	        }else{
	        	licenseServ.createlicense(license);
	            return "redirect:/licenses/new";
	        }
	}
	
	@RequestMapping ("/show/{id}")
	public String show(Model model,@PathVariable ("id") Long id ) {
		People person = licenseServ.findDriverbyId(id);
		model.addAttribute("person", person);
		return "index.jsp";
	}
}