package com.samrodriguez.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.samrodriguez.savetravels.models.Expense;
import com.samrodriguez.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
	public List<Expense> allExpenses(){
		return expenseRepo.findAll();
	}
	
	public Expense createAndUpdateExpense(Expense e) {
		return expenseRepo.save(e);
	}
	
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}else {
			return null;
		}
	}

}