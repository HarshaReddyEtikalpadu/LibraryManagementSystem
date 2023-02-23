package com.miniproject.LibraryManagementSystem.srviceclasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.LibraryManagementSystem.mainclasses.Address;
import com.miniproject.LibraryManagementSystem.repo.AddressRepo;

@Service
public class AddressService {
@Autowired
private AddressRepo addressRepo;

//save all
public List<Address> saveAllAddress(List<Address> address) {
	return(List<Address>)(addressRepo.saveAll(address));
}

//save
public Address saveAddress(Address address) {
	return(Address)(addressRepo.save(address));
}



}
