package com.miniproject.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.LibraryManagementSystem.mainclasses.Address;
import com.miniproject.LibraryManagementSystem.srviceclasses.AddressService;

@RestController
@RequestMapping("/student")
public class AddressController {
@Autowired
private AddressService addressService;
	
	//Getting Address list
	@PostMapping("/post/address/list")
	public List<Address> saveAllAddress(@RequestBody List<Address> address) {
		return(List<Address>)(addressService.saveAllAddress(address));
	}
	
	//single address
	@PostMapping("/save/address")
	public Address saveAddress(Address address) {
		return(Address)(addressService.saveAddress(address));
	}
}
