package com.samrodriguez.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samrodriguez.savetravels.models.Cost;

public interface CostRepository extends CrudRepository<Cost, Long> {
	List<Cost> findAll();
}
