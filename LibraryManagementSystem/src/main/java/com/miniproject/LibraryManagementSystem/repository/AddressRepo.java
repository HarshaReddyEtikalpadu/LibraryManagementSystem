package com.miniproject.LibraryManagementSystem.repository;
import org.springframework.data.repository.CrudRepository;

import com.miniproject.LibraryManagementSystem.entity.Address;

public interface AddressRepo extends CrudRepository<Address, Integer> {

}
