//package com.miniproject.LibraryManagementSystem.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.miniproject.LibraryManagementSystem.mainclasses.Book;
//import com.miniproject.LibraryManagementSystem.mainclasses.Department;
//import com.miniproject.LibraryManagementSystem.srviceclasses.BookService;
//import com.miniproject.LibraryManagementSystem.srviceclasses.DepartmentService;
//import com.miniproject.LibraryManagementSystem.srviceclasses.StudentService;
//
//@RestController
//@RequestMapping("/student")
//public class MainController {
//	@Autowired
//	private BookService bookService;
//
//	@Autowired
//	private DepartmentService departmentService;
//
////	@Autowired
////	private StudentService studentService;
////	
////	@PostMapping("/saveDepartments")
////	public List<Department> saveAllDepartment(@RequestBody List<Department> departments) {
////		return departmentService.saveAllDepartments(departments);
////	}
//
////	@PostMapping("/save/all/books")
////	public Book saveAllBooks(@RequestBody Book book) {
////		return bookService.saveAllBooks(book);
////	}
//
////	@GetMapping("/list/departments")
////	public List<Department> getAllDepartment(){
////		return departmentSevice.getAllDepartment();
////		
////	}
//////	public List<Book> getAllBook(){
//////		return bookService.getAllbooks();
//////	}
////	
//}
