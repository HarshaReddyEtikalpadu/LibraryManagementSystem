package com.miniproject.LibraryManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;
import com.miniproject.LibraryManagementSystem.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
