package com.miniproject.LibraryManagementSystem.srviceclasses;

import java.util.List;
import java.util.Optional;

import com.miniproject.LibraryManagementSystem.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.LibraryManagementSystem.mainclasses.Student;
import com.miniproject.LibraryManagementSystem.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	// Adding List of Students
	public List<Student> saveAllStudentsData(List<Student> students) throws Exception {
		List<Student> studentsSaved = (List<Student>) studentRepo.saveAll(students);
		if( studentsSaved != null)
		{
			return studentsSaved;
		}
		throw new Exception("Unable to save students list");
	}

	// Adding A Single Student Details
	public Student saveStudent(Student student) throws Exception {
		Student studentSaved = studentRepo.save(student);
		if( studentSaved != null)
		{
			return studentSaved;
		}
		throw new Exception("Unable to save student");
	}

	// Getting Student Details
	public List<Student> getAllStudentsData() throws Exception {
		List<Student> students = (List<Student>) studentRepo.findAll();
		if(students.size()==0)
		{
			throw new Exception("Students List is empty");
		}
		return students;
	}

	// Delete A Student Details
	public void deleteStudentById(Integer studentId)throws Exception {
		Optional<Student> optionalStudent = studentRepo.findById(studentId);
		if (optionalStudent.isPresent()) {
			optionalStudent.get().getBook().setAvailable(true);
			studentRepo.deleteById(studentId);
		} else {
			throw new Exception(
					"Student is not found with the id: "+studentId);
		}

	}

	// Updating an Existing Student (By Checking Whether the student is present or
	// not)
	public Optional<Student> getStudent(Integer studentId) throws Exception {
		return Optional.ofNullable(studentRepo.findById(studentId).orElseThrow(() -> new Exception("Student is not found with the id: " + studentId)));
	}
	
	public Student updateStudent(Student student) throws Exception {
		Student studentSaved = studentRepo.save(student);
		if( studentSaved != null)
		{
			return studentSaved;
		}
		throw new Exception("Unable to update student");
	}
	
	
	
	
	
	
	
	
	
	
	

}
