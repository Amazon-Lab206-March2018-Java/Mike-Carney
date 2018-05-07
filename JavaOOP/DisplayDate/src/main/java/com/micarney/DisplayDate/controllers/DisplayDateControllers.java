package com.micarney.DisplayDate.controllers;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateControllers {
	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		return "index.jsp";
		}
	@RequestMapping("/date")
	public String date(Model model) {
		String date = new SimpleDateFormat("EEE, MMM, d 'of'  Y").format(new Date());
		model.addAttribute("date", date);
		return "/date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		String time = new SimpleDateFormat("h:mm a").format(new Date());
		model.addAttribute("time", time);
		return "/time.jsp";
	}
}