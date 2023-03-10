package com.samrodriguez.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.samrodriguez.bookclub.models.Book;
import com.samrodriguez.bookclub.services.BookService;
import com.samrodriguez.bookclub.services.UserService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/books/create")
	public String createBook(
			@ModelAttribute("newBook") Book newBook,
			HttpSession session
			) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "new-book.jsp";
	}
	
	@PostMapping("/books/create")
	public String saveBook(
			@Valid @ModelAttribute("newBook") Book newBook,
			BindingResult result,
			HttpSession session
			) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		if (result.hasErrors()) {
			return "new-book.jsp";
		}
		bookService.create(newBook, (Long) session.getAttribute("userId"));
		return "redirect:/dashboard";
		
	}
	
	@GetMapping("/books/{bookId}")
	public String showBook(
			@PathVariable("bookId") Long bookId,
			HttpSession session,
			Model model
			) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", bookService.getOne(bookId));
		model.addAttribute("loggedUser", userService.getOne((Long) session.getAttribute("userId")));
		return "show-book.jsp";
	}
	
	@GetMapping("/books/edit/{id}")
	public String editBook(
			@PathVariable("id") Long bookId,
			HttpSession session,
			Model model
			) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", bookService.getOne(bookId));
		return "edit-book.jsp";
	}
	
	@PutMapping("/books/edit/{id}")
	public String saveEdit(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			HttpSession session
			) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		if (result.hasErrors()) {
			return "edit-book.jsp";
		} else {
			bookService.update(book);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("books/borrow/{bookId}")
	public String borrowBook(
			@PathVariable("bookId") Long bookId,
			HttpSession session
			) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		bookService.updateBorrower(bookId, (Long) session.getAttribute("userId"));
		return "redirect:/dashboard";
	}
	
	@GetMapping("/books/return/{id}")
	public String returnBook(
			@PathVariable("id") Long id,
			HttpSession session
			) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		bookService.removeBorrower(id);
		return "redirect:/dashboard";
	}
	
	@DeleteMapping("/books/delete/{bookId}")
	public String removeBook(
			@PathVariable("bookId") Long bookId,
			HttpSession session
			) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		bookService.deleteBook(bookId);
		return "redirect:/dashboard";
	}
	
}
