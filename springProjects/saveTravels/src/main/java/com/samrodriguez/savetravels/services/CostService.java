package com.samrodriguez.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.samrodriguez.savetravels.models.Cost;
import com.samrodriguez.savetravels.repositories.CostRepository;

@Service
public class CostService {
	private final CostRepository costRepo;
	
	public CostService(CostRepository costRepo) {
		this.costRepo = costRepo;
	}
	
	public List<Cost> allCosts(){
		return costRepo.findAll();
	}
	
	public Cost createAndUpdateCost(Cost c) {
		return costRepo.save(c);
	}
	
	public void deleteCost(Long id) {
		costRepo.deleteById(id);
	}
	public Cost findCost(Long id) {
		Optional<Cost> optionalCost = costRepo.findById(id);
		if(optionalCost.isPresent()) {
			return optionalCost.get();
		}else {
			return null;
		}
	}

}