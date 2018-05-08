package com.micarney.Platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlatformController {
	@RequestMapping(value="/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/m/{chapter}/0553/{lesson}")
	public String lesson(@PathVariable String chapter, @PathVariable String lesson) {
		return "lesson.jsp";
	}
	@RequestMapping(value="/m/{chapter}/0483/{assignment}")
	public String assignment(@PathVariable String chapter, @PathVariable String assignment) {
					return "assignment.jsp";
	}
}
