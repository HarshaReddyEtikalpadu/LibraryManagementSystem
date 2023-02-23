package com.miniproject.LibraryManagementSystem;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miniproject.LibraryManagementSystem.controller.StudentController;
import com.miniproject.LibraryManagementSystem.mainclasses.Student;

@SpringBootTest
class LibraryManagementSystemApplicationTests {

	@Autowired
	private StudentController studentController;
	
	@Test
	public void testStudentList() {
		List<Student> list = studentController.getAllStudentsData();
		System.out.println(list);
		Assertions.assertNotEquals(list.size(),7);
		
	}
	
	
	
		
}