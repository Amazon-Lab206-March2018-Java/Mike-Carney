package com.micarney.Overflow.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.micarney.Overflow.models.AnswersMod;
import com.micarney.Overflow.repositories.AnswersRepo;

@Service
public class AnswersServ {
	private final AnswersRepo answersRepo;
	public AnswersServ(AnswersRepo answersRepo) {
		this.answersRepo = answersRepo;
	}
	
	public List<AnswersMod> allAnswer(){
		return answersRepo.findAll();
		
	}
	
	public AnswersMod createAnswer(@Valid AnswersMod answer) {
		return answersRepo.save(answer);
	}



}
