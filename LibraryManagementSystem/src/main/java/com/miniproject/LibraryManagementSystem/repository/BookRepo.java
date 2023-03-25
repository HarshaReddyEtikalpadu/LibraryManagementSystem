package com.miniproject.LibraryManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.miniproject.LibraryManagementSystem.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
