package com.samrodriguez.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samrodriguez.bookclub.models.Book;
import com.samrodriguez.bookclub.models.User;
import com.samrodriguez.bookclub.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	
	@Autowired
	private UserService userService;
	
	public List<Book> getAll(){
		return bookRepo.findAll();
	}
	
	public List<Book> getAllBorrowed(User user){
		return bookRepo.findAllByBorrowerIs(user);
	}
	
	public Book getOne(Long id) {
		Optional<Book> book = bookRepo.findById(id);
		if (book.isPresent()) {
			return book.get();
		} else {
			return null;
		}
	}
	
	public void updateBorrower(Long bookId, Long userId) {
		Book book = getOne(bookId);
		book.setBorrower(userService.getOne(userId));
		bookRepo.save(book);
	}
	
	public void removeBorrower(Long bookId) {
		Book book = getOne(bookId);
		book.setBorrower(null);
		bookRepo.save(book);
	}
	
	public void create(Book newBook, Long userId) {
		newBook.setUser(userService.getOne(userId));
		bookRepo.save(newBook);
	}
	
	public void update(Book book) {
		bookRepo.save(book);
	}
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
}
