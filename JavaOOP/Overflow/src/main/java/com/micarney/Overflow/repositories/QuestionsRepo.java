package com.micarney.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micarney.Overflow.models.QuestionsMod;

@Repository
public interface QuestionsRepo extends CrudRepository <QuestionsMod, Long> {
	List<QuestionsMod> findAll();

}
