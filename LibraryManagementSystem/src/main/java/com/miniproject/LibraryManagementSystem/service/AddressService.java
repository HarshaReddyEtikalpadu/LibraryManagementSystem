package com.miniproject.LibraryManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.LibraryManagementSystem.entity.Address;
import com.miniproject.LibraryManagementSystem.repository.AddressRepo;

@Service
public class AddressService {
@Autowired
private AddressRepo addressRepo;

//save all
public List<Address> saveAllAddress(List<Address> address) throws Exception {
	List<Address> addresses =(List<Address>)(addressRepo.saveAll(address));
	if(addresses == null)
	{
		throw new Exception("Unable to save the address list");
	}

	return addresses;
}

//save
public Address saveAddress(Address address) throws Exception {
	Address addressSaved = addressRepo.save(address);
	if(addressSaved == null)
	{
		throw new Exception("Unable to save the address");
	}
	return addressSaved;
}



}
