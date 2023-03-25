package com.miniproject.LibraryManagementSystem.srviceclasses;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miniproject.LibraryManagementSystem.mainclasses.Book;
import com.miniproject.LibraryManagementSystem.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;

	public List<Book> saveAllBooks(List<Book> books) throws  Exception {
		List<Book> booksSaved =(List<Book>)(bookRepo.saveAll(books));
		if(booksSaved == null)

		{
			throw new Exception("Unable to save the list of books");
		}
		return (List<Book>)(bookRepo.saveAll(books));
		
	}
	
	public List<Book> getAllBooks() throws Exception {
		List<Book> books = (List<Book>) (bookRepo.findAll());
		if(books==null)
		{
			throw new Exception("Unable to fetch the books list");
		}
		return (List<Book>) (bookRepo.findAll());
	}


	
	public void deleteBookById(Integer bookId) throws Exception {
		Optional<Book> optionalbook = bookRepo.findById(bookId);
		if(optionalbook.isPresent()) {
			bookRepo.deleteById(bookId);
		}
		else {
			
				throw new Exception("Book not found with the id: "+bookId);
				
		}
	}

	
	public Book findBookById(Integer bookId) throws Exception {
		return bookRepo.findById(bookId).orElseThrow(()->new Exception("Unable to find the book with id: "+bookId));
	}

	



}
