package com.micarney.DojoNinjas.services;

import org.springframework.stereotype.Service;

import com.micarney.DojoNinjas.models.NinjaMod;
import com.micarney.DojoNinjas.repositories.NinjaRepo;

@Service
public class NinjaServ {
	private final NinjaRepo ninjarepo;
	public NinjaServ(NinjaRepo ninjarepo) {
		this.ninjarepo = ninjarepo;
	}
	
	public void createNinja(NinjaMod ninja) {
		ninjarepo.save(ninja);
	}
}
