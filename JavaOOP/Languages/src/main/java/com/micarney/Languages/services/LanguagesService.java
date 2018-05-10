package com.micarney.Languages.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.springframework.stereotype.Service;

import com.micarney.Languages.controller.*;
import com.micarney.Languages.models.*;

@Service
public class LanguagesService {
	private List<LanguagesModels> languages = new ArrayList(Arrays.asList(
			new LanguagesModels("Java", "James Gosling", "1.8"),
			new LanguagesModels("Python", "Guido van Rossum", "3.6"),
			new LanguagesModels("Javascript", "Brendon Eich", "1.9")));
	
	public List<LanguagesModels> alllanguages(){
		return languages;
	}
	
	public LanguagesModels findLanguages(int index) {
		if(index < languages.size()) {
			return languages.get(index);
		}
		else {
			return null;
			}
		}
		
		public void addLanguage(LanguagesModels language) {
			languages.add(language);
		}
		
		public void updateLanguage(int id, LanguagesModels language) {
			if (id < languages.size()) {
				languages.set(id, language);
			}
		}
		
		public void destroyLanguage(int id) {
			if (id < languages.size()) {
				languages.remove(id);
			}
		}
}
