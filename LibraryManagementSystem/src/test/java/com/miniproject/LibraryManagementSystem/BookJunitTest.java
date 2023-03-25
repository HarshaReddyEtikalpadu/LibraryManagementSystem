package com.miniproject.LibraryManagementSystem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miniproject.LibraryManagementSystem.entity.Book;

import com.miniproject.LibraryManagementSystem.repository.BookRepo;
import com.miniproject.LibraryManagementSystem.service.BookService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class BookJunitTest {
	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private BookService bookService;

	@Test
	@Order(1)
	public void create() {
		Book b = new Book();
		b.setBookId(1);
		b.setBookName("No Country For Old Man");
		b.setBookAuthor("Jimmmy campbell");
		b.setAvailable(true);
		b.setBookVersion("2.8");
		b.setReleaseYear("1956");
		bookRepo.save(b);

		assertNotNull(bookRepo.findById(1).get());

	}

	@Test
	@Order(2)
	public void readData() {
		List<Book> list = (List<Book>) bookRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	@Order(3)
	public void readSingleRecord() {
		Book b = bookRepo.findById(4).get();
		assertEquals(3, b.getBookId());
	}

	@Test
	@Order(4)
	public void updateRecords() {
		Book d = bookRepo.findById(3).get();
		d.setBookName("Shawshank Redemption");
		Assertions.assertNotEquals("Shawshank Redemption", bookRepo.findById(2).get());
	}

	@Test
	@Order(5)
	public void deleteRecord() {
		bookRepo.deleteById(3);
		assertThat(bookRepo.existsById(3)).isFalse();
	}

	@Test
	@Order(6)
	public void getAllOfDepartments() {
		Book b = new Book();
		b.setBookId(1);
		b.setBookName("Pulp Fiction");
		List<Book> b1 = new ArrayList<>();
		b1.add(b);

		assertEquals("Book Added Succesfully", bookService.saveAllBooks(b1));

	}

}



