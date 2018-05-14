package com.micarney.DojoNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micarney.DojoNinjas.models.DojoMod;

@Repository
public interface DojoRepo extends CrudRepository<DojoMod, Long> {
	List<DojoMod> findAll();

}
