package com.samrodriguez.bookclub.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.samrodriguez.bookclub.models.Book;
import com.samrodriguez.bookclub.models.User;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findAll();
	
//	@Query(value="SELECT * FROM books WHERE borrower_id = ?1", nativeQuery=true)
//	List<Book> findAllBorrowedBooks(Long id);
	
//	List<Book> findWhereBorrowerId(Long Id);
	
	List<Book> findAllByBorrowerIs(User user);
	
}
