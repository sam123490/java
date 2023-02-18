package com.samrodriguez.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.samrodriguez.relationships.models.License;
import com.samrodriguez.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepo;
	
	public LicenseService(LicenseRepository licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	
	public List<License> getAll(){
		return licenseRepo.findAll();
	}
	
	public void createOrUpdate(License l) {
		licenseRepo.save(l);
	}
}
