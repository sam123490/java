package com.samuelrodriguez.mysqldemo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.samuelrodriguez.mysqldemo.models.Book;
import com.samuelrodriguez.mysqldemo.services.BookService;

@Controller
public class BookController {
	
	private final BookService bookService;
	
	 public BookController(BookService bookService) {
	     this.bookService = bookService;
	 }
	
	 @RequestMapping("/")
	 public String redirect() {
		 return "redirect:/books";
	 }
	 
	@GetMapping("/books")
	public String allBooks(Model model) {
		
		List<Book> books = bookService.allBooks();
		model.addAttribute("allBooks", books);
		return "index.jsp";
	}
	 
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id") Long id, Model model) {
		
		Book book = bookService.findBook(id);
		System.out.println(book);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
	@RequestMapping("/books/new")
	public String createBook() {
		return "new.jsp";
	}
	
	@PostMapping("/books/save")
	public String SaveBook(
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("language") String language,
			@RequestParam("pages") Integer pages) {
		
		Book book = new Book(title, description, language, pages);
		bookService.createBook(book);
		
		return "redirect:/books";
	}
			
}