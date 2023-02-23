package com.miniproject.LibraryManagementSystem.controller;

import java.util.List;
import java.util.Optional;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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

	// Posting list of students
	@PostMapping("/save/all/students")
	public List<Student> saveAllStudentsData(@RequestBody List<Student> students) {
		return (List<Student>) (studentService.saveAllStudentsData(students));
	}

	// Adding A Single Student Details
	@PostMapping("/save/student")
	public Student saveStudent(@RequestBody Student student) {
		return (Student) (studentService.saveStudent(student));
	}

	// Getting list of Students
	@GetMapping("/get/students/list")
	public List<Student> getAllStudentsData() {
		return studentService.getAllStudentsData();
	}

	//Delete Student By Id
	@DeleteMapping("/delete/student/by/{studentId}")
	public ResponseEntity<String> deleteStudentById(@PathVariable Integer studentId) {
		return ResponseEntity.ok().body("Student is deleted");
	}
	
	//Updating Student Details by Id
	public ResponseEntity<Student> updateStudent(@PathVariable Integer StudentId,@RequestBody Student student){
		Optional<Student> existingStudent = studentService.getStudent(StudentId);
		if(existingStudent.isPresent()) {
			Student updatedStudent = existingStudent.get();
			updatedStudent.setName("vinay");
			updatedStudent.setGradYear(2022);
			 
			Student savedStudent = studentService.updateStudent(updatedStudent);
			
			return new ResponseEntity<Student>(savedStudent, HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
		
	
	
	}

	
	
	
	
	
	
//	   @PostMapping("/admin/promoteStudent/{studentId}")
//	   public ResponseEntity<String> promoteStudent(@PathVariable int studentId) {
//		   Student student = studentService.getStudentById(studentId);
//		   if (student == null) {
//			   return ResponseEntity.notFound().build();
//			   }
//		   int promote = 1;
//		   if (student.getCurrentYear() + promote <= student.getGradYear()) {
//			   student.setCurrentYear(student.getCurrentYear() + 1);
//			   studentService.saveStudent(student);
//			   return ResponseEntity.accepted().body("Student promoted");
//			   }
//		   return ResponseEntity.ok().body("Cannot promote as current year greater than graduation year");
//		   }    
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   

}
