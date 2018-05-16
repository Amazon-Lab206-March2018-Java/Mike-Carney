package com.micarney.Overflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.micarney.Overflow.models.QuestionsMod;
import com.micarney.Overflow.repositories.QuestionsRepo;

@Service
public class QuestionsServ {
	private final QuestionsRepo questionsRepo;
	public QuestionsServ(QuestionsRepo questionsRepo) {
		this.questionsRepo = questionsRepo;
		
	}
	
	public List<QuestionsMod> allQuestions(){
		return questionsRepo.findAll();
	}
	
	public QuestionsMod createQuestion(QuestionsMod quest) {
		return questionsRepo.save(quest);
		
	}
	
	public QuestionsMod findById(Long id) {
		Optional<QuestionsMod> quest = questionsRepo.findById(id);
		if(quest != null ) {
			return quest.get();
		}
		return null;
	}
}
