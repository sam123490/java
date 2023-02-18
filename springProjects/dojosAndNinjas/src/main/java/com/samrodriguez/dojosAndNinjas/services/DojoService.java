package com.samrodriguez.dojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samrodriguez.dojosAndNinjas.models.Dojo;
import com.samrodriguez.dojosAndNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepo;
	
	public Dojo getOne(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		} else {
			return null;
		}
	}
	
	public List<Dojo> getAll(){
		return dojoRepo.findAll();
	}
	
	public void createOrUpdate(Dojo d) {
		dojoRepo.save(d);
	}
}
