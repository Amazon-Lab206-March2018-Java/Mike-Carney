package com.micarney.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micarney.Overflow.models.TagsMod;

@Repository
public interface TagsRepo extends CrudRepository <TagsMod, Long>{
	List<TagsMod> findAll();
	TagsMod findByTag(String name);

}
