package com.micarney.reloaded.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.micarney.reloaded.models.Models;
import com.micarney.reloaded.repositories.Repositories;


@Service
public class Services {
	private List<Models> languages = new ArrayList<Models>();
	private Repositories repository;
	public Services(Repositories repository) {;
		this.repository = repository;
	}
	public List<Models> allLanguages(){
		return repository.findAll();
	}
		
		public void addLanguage(Models language) {
			repository.save(language);
		}
		
		public void updateLanguage(Long id, Models language) {
			repository.save(language);
			}
		
		public void destroyLanguage(Long id) {
			repository.deleteById(id);
		}
		public Models findLanguageById(Long id) {
			Optional<Models> optionalLanguage = repository.findById(id);
			if (optionalLanguage.isPresent()) {
				return optionalLanguage.get();
			} else {
				return null;
			}
		}
}
