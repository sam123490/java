package com.samrodriguez.dojosAndNinjas.repositories;

import org.springframework.data.repository.CrudRepository;

import com.samrodriguez.dojosAndNinjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
}
