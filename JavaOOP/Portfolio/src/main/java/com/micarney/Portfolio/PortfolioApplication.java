package com.micarney.Portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
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
