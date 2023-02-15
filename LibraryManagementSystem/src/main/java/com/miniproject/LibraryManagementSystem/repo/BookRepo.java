package com.miniproject.LibraryManagementSystem.repo;

import org.springframework.data.repository.CrudRepository;

import com.miniproject.LibraryManagementSystem.mainclasses.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
