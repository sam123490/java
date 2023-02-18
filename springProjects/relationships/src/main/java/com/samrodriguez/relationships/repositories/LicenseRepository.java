package com.samrodriguez.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.samrodriguez.relationships.models.License;

public interface LicenseRepository extends CrudRepository<License, Long> {

	List<License> findAll();	
	
}
