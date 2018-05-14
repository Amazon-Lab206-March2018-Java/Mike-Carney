package com.micarney.DojoNinjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micarney.DojoNinjas.models.DojoMod;
import com.micarney.DojoNinjas.repositories.DojoRepo;

@Service
public class DojoServ {
	private final DojoRepo dojorepo;
	public DojoServ(DojoRepo dojorepo) {
		this.dojorepo = dojorepo;
	}
	
	public void createDojo(DojoMod dojo) {
		dojorepo.save(dojo);
	}
	public List<DojoMod> allDojos(){
		return dojorepo.findAll();
	}
}
