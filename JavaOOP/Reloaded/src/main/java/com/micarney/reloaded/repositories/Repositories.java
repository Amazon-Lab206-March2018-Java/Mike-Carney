package com.micarney.reloaded.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micarney.reloaded.models.*;

@Repository
public interface Repositories extends CrudRepository<Models, Long> {
	List<Models>findAll();
	}

