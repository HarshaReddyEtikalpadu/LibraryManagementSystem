package com.miniproject.LibraryManagementSystem.srviceclasses;

import java.util.List;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miniproject.LibraryManagementSystem.mainclasses.Book;
import com.miniproject.LibraryManagementSystem.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;

	public List<Book> saveAllBooks(List<Book> books) {
		return (List<Book>)(bookRepo.saveAll(books));
	}

}
