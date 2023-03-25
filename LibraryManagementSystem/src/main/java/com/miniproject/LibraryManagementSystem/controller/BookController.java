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
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.LibraryManagementSystem.mainclasses.Address;
import com.miniproject.LibraryManagementSystem.mainclasses.Book;
import com.miniproject.LibraryManagementSystem.mainclasses.Student;
import com.miniproject.LibraryManagementSystem.srviceclasses.BookService;
import com.miniproject.LibraryManagementSystem.srviceclasses.StudentService;

@RestController
@RequestMapping("/student")
public class BookController {
	@Autowired
	private BookService bookService;
	//private StudentService studentService;
	
	// viewing All Books
		@GetMapping("/get/all/books")
		public ResponseEntity<List<Book>> getAllBooks() throws Exception {
			return ResponseEntity.ok().body(bookService.getAllBooks());
		} 
		// Deleting A book
		@DeleteMapping("/delete/a/book/by/{bookId}")
		public ResponseEntity<String> deleteABookById(@PathVariable Integer bookId) {
			return ResponseEntity.ok().body("Book is deleted");
		}
		
		
		
//		  @PostMapping("student/{id}/select/book/{bookName}")
//		  public ResponseEntity<String> selectBook(@PathVariable int id, @PathVariable String bookName) {
//			  Student student = studentService.getStudentById1(id);
//			  if (student == null) {
//				  return ResponseEntity.notFound().build();
//				  }
//			  List<Book> booksAvailable = this.bookService.findAll();
//			  for (Book b : booksAvailable) {
//				  if (b.getBookName().equals(bookName)) {
//					  student.setBook(b);
//					  student.getBook().setAvailable(false);
//					  return ResponseEntity.accepted().body("Book is selected: " + bookName); 
//					  }
//				  }
//			  return ResponseEntity.ok().body("unable to select the book: " + bookName);
//			  }


		
//		//Updating A Book
//		@PutMapping("/Update/A/Book")
//		public List<Book> updateBook(@RequestBody List<Book> book) {
//			return bookService.book(book);
//		}
	
//	// Adding A List Of Books
	@PostMapping("/save/all/books")
	public List<Book> saveAllBooks(@RequestBody List<Book> books) throws Exception {
		return (List<Book>) (bookService.saveAllBooks(books));
	}


		
//

//

//
//	@GetMapping("/find/By/Id/{bookId}")
//	public Book findBookById(@PathVariable Integer bookId) {
//		return bookService.findBookById(bookId);
//	}
}
