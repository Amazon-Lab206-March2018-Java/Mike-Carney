package com.micarney.DojoNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micarney.DojoNinjas.models.NinjaMod;

@Repository
public interface NinjaRepo extends CrudRepository<NinjaMod, Long>{
	List <NinjaMod> findAll();
}
