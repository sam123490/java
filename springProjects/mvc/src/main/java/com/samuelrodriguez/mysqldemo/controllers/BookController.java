package com.samuelrodriguez.mysqldemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.samuelrodriguez.mysqldemo.models.Book;
import com.samuelrodriguez.mysqldemo.services.BookService;

@Controller
public class BookController {
	
	private final BookService bookService;
	
	 public BookController(BookService bookService) {
	     this.bookService = bookService;
	 }
	
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id") Long id, Model model) {
		
		Book book = bookService.findBook(id);
		System.out.println(book);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
}
