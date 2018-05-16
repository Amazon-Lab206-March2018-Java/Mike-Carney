package com.micarney.Overflow.services;

import java.util.List;

import javax.swing.text.html.HTML.Tag;

import org.springframework.stereotype.Service;

import com.micarney.Overflow.models.TagsMod;
import com.micarney.Overflow.repositories.TagsRepo;

@Service
public class TagsServ {
	private final TagsRepo tagsRepo;
	public TagsServ(TagsRepo tagsRepo) {
		this.tagsRepo = tagsRepo;
	}
	
	public List<TagsMod> allTags() {
		return tagsRepo.findAll();
	}
	
	public void createTag(TagsMod tag) {
		tagsRepo.save(tag);
	}
	
	public TagsMod findTagByTag(String subject) {
		TagsMod tag = tagsRepo.findByTag(subject);
		if (tag != null) {
			return tag;
		}
		return tagsRepo.save(new TagsMod(subject));
	}
}
