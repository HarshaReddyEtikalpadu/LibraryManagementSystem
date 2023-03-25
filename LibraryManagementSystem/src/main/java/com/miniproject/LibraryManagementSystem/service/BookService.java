package com.miniproject.LibraryManagementSystem.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miniproject.LibraryManagementSystem.entity.Book;
import com.miniproject.LibraryManagementSystem.repository.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;

	public List<Book> saveAllBooks(List<Book> books) {
		return (List<Book>)(bookRepo.saveAll(books));
		
	}
	
	public List<Book> getAllBooks() {
		return (List<Book>) (bookRepo.findAll());
	}
	public void removeBooksFromList(int bookId,List<Book>books)
	{
		int index =-1;
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getBookId()==bookId)
			{
				index=i;
				break;
			}
		}

		books.remove(Integer.valueOf(index));
	}


	
	public void deleteBookById(Integer bookId) {
		Optional<Book> optionalbook = bookRepo.findById(bookId);
		if(optionalbook.isPresent()) {
			bookRepo.deleteById(bookId);
		}
		else {
			
				throw new RuntimeErrorException(null,"Not Found");
				
		}
	}

	public List<Book> book(List<Book> book) {
		return (List<Book>) (bookRepo.saveAll(book));
	}
	
	public Book findBookById(Integer bookId) { 
		return bookRepo.findById(bookId).orElse(null);
	}

	public List<Book> findAll() {
		return (List<Book>) bookRepo.findAll();
	}


	



}
