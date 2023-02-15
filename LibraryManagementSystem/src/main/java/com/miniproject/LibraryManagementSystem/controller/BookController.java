package com.miniproject.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.LibraryManagementSystem.mainclasses.Book;
import com.miniproject.LibraryManagementSystem.srviceclasses.BookService;

@RestController
@RequestMapping("/student")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/saveAll/Books")
	public List<Book> saveAllBooks(@RequestBody List<Book> books){
		return bookService.saveAllBooks(books);
		
	}
}
