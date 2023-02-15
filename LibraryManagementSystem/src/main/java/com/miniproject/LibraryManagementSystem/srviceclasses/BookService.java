package com.miniproject.LibraryManagementSystem.srviceclasses;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miniproject.LibraryManagementSystem.mainclasses.Book;
import com.miniproject.LibraryManagementSystem.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;

	public Book saveAllBooks(Book book) {
		return bookRepo.save(book);

	}

}
