package com.samrodriguez.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.samrodriguez.savetravels.models.Expense;
import com.samrodriguez.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	private final ExpenseService expenseService;
	
	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	@GetMapping("/")
	public String redirect() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String home(@ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("allExpenses", expenseService.allExpenses());
		return "home.jsp";
	}
	
	@PostMapping("/expenses")
	public String addExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allExpenses", expenseService.allExpenses());
			return "home.jsp";
		}else {
			expenseService.createAndUpdateExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/{id}")
	public String viewExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "view.jsp";
	}
	
	@GetMapping("/expenses/{id}/edit")
	public String editExpense(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "edit.jsp";
	}
	
	@PutMapping("/expenses/{id}/edit")
	public String saveEdit(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("expense", expense);
			return "edit.jsp";
		}else {
			expenseService.createAndUpdateExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	@DeleteMapping("/expenses/{id}/delete")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/expenses";
	}

}
