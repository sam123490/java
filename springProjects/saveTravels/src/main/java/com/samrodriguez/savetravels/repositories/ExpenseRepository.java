package com.samrodriguez.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samrodriguez.savetravels.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	List<Expense> findAll();
}
