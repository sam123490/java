package com.samrodriguez.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.samrodriguez.relationships.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

	List<Person> findAll();
	
}
