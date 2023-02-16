package com.miniproject.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.LibraryManagementSystem.mainclasses.Book;
import com.miniproject.LibraryManagementSystem.srviceclasses.BookService;

@RestController
@RequestMapping("/student")
public class BookController {
	@Autowired
	private BookService bookService;

	// Adding A List Of Books
	@PostMapping("/save/all/books")
	public List<Book> saveAllBooks(@RequestBody List<Book> books) {
		return bookService.saveAllBooks(books);
	}

	// viewing All Books
	@GetMapping("/get/all/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	// Deleting A book
	@DeleteMapping("/delete/a/book/by/{bookId}")
	public void deleteABookById(@PathVariable Integer bookId) {
		bookService.deleteBookById(bookId);
	}
	
	
//	
//	@DeleteMapping("/delete/book/by{bookId}")
//	public ResponseEntity<String> deleteBookById(@PathVariable Integer bookId) {
//		bookService.deleteBookById(bookId);
//		return ResponseEntity.ok("User Deleted Successfully");
//	}

	@PutMapping("/Update/A/Book")
	public List<Book> updateBook(@RequestBody List<Book> book) {
		return bookService.book(book);
	}

	@GetMapping("/find/By/Id/{bookId}")
	public Book findBookById(@PathVariable Integer bookId) {
		return bookService.findBookById(bookId);
	}
}
