package com.micarney.Overflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.micarney.Overflow.models.AnswersMod;
import com.micarney.Overflow.services.AnswersServ;
import com.micarney.Overflow.services.QuestionsServ;

@Controller
public class AnswersCont {
	private final AnswersServ answersServ;
	private final QuestionsServ questionsServ;
	
	public AnswersCont(AnswersServ answersServ, QuestionsServ questionsServ) {
		this.answersServ = answersServ;
		this.questionsServ = questionsServ;
	}
	
	@PostMapping("answer/create")
	public String createAnswer(@Valid @ModelAttribute("a")AnswersMod answer, BindingResult results, @RequestParam("question") Long quest_id, Model m) {
		if(results.hasErrors()) {
			m.addAttribute("question", questionsServ.findById(quest_id));
			return "dispquest.jsp";
		}
		answer.setQuestion(questionsServ.findById(quest_id));
		answersServ.createAnswer(answer);
		return "redirect:/question/display/" + quest_id;
	}


}
