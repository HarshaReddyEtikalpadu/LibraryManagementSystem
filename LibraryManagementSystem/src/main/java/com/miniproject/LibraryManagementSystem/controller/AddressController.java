package com.miniproject.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.LibraryManagementSystem.entity.Address;
import com.miniproject.LibraryManagementSystem.service.AddressService;

@RestController
@RequestMapping("/student")
public class AddressController {
@Autowired
private AddressService addressService;
	
	//Getting Address list
	@PostMapping("/post/address/list")
	public List<Address> saveAllAddress(@RequestBody List<Address> address) throws Exception {
		return(List<Address>)(addressService.saveAllAddress(address));
	}


	//single address
	@PostMapping("/save/address")
	public Address saveAddress(Address address) throws Exception {
		return(Address)(addressService.saveAddress(address));
	}
}
