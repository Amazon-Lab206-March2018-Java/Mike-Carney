package com.micarney.Licenses.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micarney.Licenses.models.People;

@Repository
public interface PersonRepo extends CrudRepository<People, Long> {
	List<People> findAll();
}
