package com.micarney.Overflow.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.micarney.Overflow.models.AnswersMod;
import com.micarney.Overflow.models.QuestionsMod;
import com.micarney.Overflow.models.TagsMod;
import com.micarney.Overflow.services.QuestionsServ;
import com.micarney.Overflow.services.TagsServ;

@Controller
public class QuestionsCont {
	private final QuestionsServ questionsServ;
	private final TagsServ tagsServ;
	
	public QuestionsCont(QuestionsServ questionsServ, TagsServ tagsServ) {
		this.questionsServ = questionsServ;
		this.tagsServ = tagsServ;
	}
	
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("question", questionsServ.allQuestions());
		return "index.jsp";
		
	}
	
	@RequestMapping("/question/new")
	public String newQuestion(@ModelAttribute("q") QuestionsMod quest) {
		return "newquest.jsp";
		
	}
	
	@PostMapping("/question/create")
	public String createQuestion(@Valid @ModelAttribute("q") QuestionsMod quest, BindingResult results, @RequestParam("tagA") String tagA, @RequestParam("tagB") String tagB, @RequestParam("tagC") String tagC ) {
		if (results.hasErrors()) {
			return "newquest.jsp";
		}
		QuestionsMod question = questionsServ.createQuestion(quest);
		List<String> tagList = new ArrayList<String>(Arrays.asList(tagA, tagB, tagC));
		List<TagsMod> tags = new ArrayList<TagsMod>();
		for(int i=0; i<tagList.size();i++) {
			if (tagsServ.findTagByTag(tagList.get(i)) != null){
				tags.add(tagsServ.findTagByTag(tagList.get(i)));
			}
		}
		question.setTags(tags);
		questionsServ.createQuestion(question);
		return "redirect:/question/display/" + question.getId();
		
	}
	
	@RequestMapping("/question/display/{id}")
	public String displayQuestion(@ModelAttribute("a") AnswersMod answer, @PathVariable("id") Long id, Model m) {
		m.addAttribute("question", questionsServ.findById(id));
		return "dispquest.jsp";
	}
}
