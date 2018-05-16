package com.micarney.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micarney.Overflow.controllers.AnswersCont;
import com.micarney.Overflow.models.AnswersMod;

@Repository
public interface AnswersRepo extends CrudRepository <AnswersMod, Long>{
	List<AnswersMod> findAll();

}
