package com.samrodriguez.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.samrodriguez.relationships.models.Person;
import com.samrodriguez.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepo;
	
	public PersonService(PersonRepository personRepo) {
		this.personRepo = personRepo;
	}
	
	public List<Person> getAll(){
		return personRepo.findAll();
	}
	
	public Person getOne(Long id) {
		Optional<Person> person = personRepo.findById(id);
		if(person.isPresent()) {
			return person.get();
		} else {
			return null;
		}
	}
	
	public void createOrUpdate(Person p) {
		personRepo.save(p);
	}
}
