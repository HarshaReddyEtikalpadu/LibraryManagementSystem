package com.miniproject.LibraryManagementSystem.srviceclasses;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.LibraryManagementSystem.mainclasses.Student;
import com.miniproject.LibraryManagementSystem.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;

	// Adding List of Students
	public List<Student> saveAllStudentsData(List<Student> students) {
		return (List<Student>) (studentRepo.saveAll(students));
	}

	// Adding A Single Student Details
	public Student saveStudent(Student student) {
		return (Student) (studentRepo.save(student));
	}

	// Getting Student Details
	public List<Student> getAllStudentsData() {
		return (List<Student>) (studentRepo.findAll());
	}

	// Delete A Student Details
	public void deleteStudentById(Integer studentId) {
		Optional<Student> optionalStudent = studentRepo.findById(studentId);
		if (optionalStudent.isPresent()) {
			studentRepo.deleteById(studentId);
		} else {
			throw new RuntimeErrorException(null, "Student is not found with that id");
		}

	}

	// Updating an Existing Student (By Checking Whether the student is present or
	// not)
	public Optional<Student> getStudent(Integer studentId) {
		return studentRepo.findById(studentId);
	}
	
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}
	
	
	
	
	
	
	
	
	
	
	

}
