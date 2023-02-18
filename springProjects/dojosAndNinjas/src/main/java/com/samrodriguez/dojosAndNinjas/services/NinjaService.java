package com.samrodriguez.dojosAndNinjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samrodriguez.dojosAndNinjas.models.Ninja;
import com.samrodriguez.dojosAndNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public void createOrUpdate(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
}
