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
	
	public List<Student> saveAllStudentsData(List<Student> students) {
		return (List<Student>)(studentRepo.saveAll(students));
	}
	
	public List<Student> getAllStudentsData(){
		return(List<Student>)(studentRepo.findAll());
	}

	public void deleteStudentById(Integer studentId) {
		Optional<Student> optionalStudent = studentRepo.findById(studentId);
		if(optionalStudent.isPresent()) {
			studentRepo.deleteById(studentId);
		}
		else {
			throw new RuntimeErrorException(null, "Student is not found with that id");
		}
				
	}

	

}
