package com.micarney.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micarney.driverslicense.models.People;

@Repository
public interface PeopleRepo extends CrudRepository<People, Long> {
	List<People> findAll();
}