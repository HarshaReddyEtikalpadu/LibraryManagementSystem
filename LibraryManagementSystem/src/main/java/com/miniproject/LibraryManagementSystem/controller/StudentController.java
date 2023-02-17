package com.miniproject.LibraryManagementSystem.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.LibraryManagementSystem.mainclasses.Student;
import com.miniproject.LibraryManagementSystem.srviceclasses.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	//Posting list of students
	@PostMapping("/save/all/students")
	public List<Student> saveAllStudentsData(@RequestBody List<Student> students){
		return(List<Student>)(studentService.saveAllStudentsData(students));
	}

	//Getting list of Students
	@GetMapping("/get/students/list")
	public List<Student> getAllStudentsData(){
		return studentService.getAllStudentsData();
	}
	
	//Delete Student By Id
	@DeleteMapping("/delete/student/by/{studentId}")
	public ResponseEntity<String> deleteStudentById(@PathVariable Integer studentId) {
		return ResponseEntity.ok().body("Student is deleted");
//		studentService.deleteStudentById(studentId);
	}
}
