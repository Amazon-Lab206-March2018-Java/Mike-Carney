package com.micarney.Porfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class PorfolioController {
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		System.out.println("testing");
		return "/projects.html";	
	}
	
	@RequestMapping("/about")
	public String about() {
		return "/about.html";
		
	}
	
	 @RequestMapping("/test")
	  public String test() {
		return "index.jsp";
	 }
}
