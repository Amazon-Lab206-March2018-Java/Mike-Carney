package com.micarney.Licenses.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micarney.Licenses.models.License;
import com.micarney.Licenses.models.People;
import com.micarney.Licenses.repos.LicenseRepo;
import com.micarney.Licenses.repos.PersonRepo;

@Service
public class LicenseServ {
	private final LicenseRepo licenserepo; 
	private final PersonRepo personrepo;
	
	
	public LicenseServ(LicenseRepo lr, PersonRepo pr){
        this.licenserepo = lr;
        this.personrepo = pr;
    }

	public List<People> all_drivers(){
		return personrepo.findAll();
	}
	
	public void addPerson(People p) {
		personrepo.save(p);
	}
	
	public List<License> allLicenses(){
		return licenserepo.findAll();
	}
	
	public void createlicense(License license) {
		licenserepo.save(license);
	}
	public People findDriverbyId(Long id) {		
		return personrepo.findById(id).get();
	}
}
