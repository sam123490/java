package com.samuelrodriguez.mysqldemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.samuelrodriguez.mysqldemo.models.Book;
import com.samuelrodriguez.mysqldemo.services.BookService;
@RestController
public class BooksApi {
    private final BookService bookService;
    
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    // other methods removed for brevity
    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
		// we create a new Book object with the values we passed in
		Book book = new Book(title, desc, lang, numOfPages);
		// we then set the ID of the new Book object to equal the ID of the Book we are updating
		book.setId(id);
		// now we can use our bookService to update the book
		Book updatedBook = bookService.updateBook(book);
        return updatedBook;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
