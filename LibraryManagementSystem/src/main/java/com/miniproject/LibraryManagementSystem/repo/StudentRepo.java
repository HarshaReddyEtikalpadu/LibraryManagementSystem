package com.miniproject.LibraryManagementSystem.repo;

import org.springframework.data.repository.CrudRepository;
import com.miniproject.LibraryManagementSystem.mainclasses.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
