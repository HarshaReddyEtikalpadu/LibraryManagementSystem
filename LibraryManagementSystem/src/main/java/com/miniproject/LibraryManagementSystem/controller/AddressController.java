package com.miniproject.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miniproject.LibraryManagementSystem.srviceclasses.AddressService;

@RestController
@RequestMapping("/student")
public class AddressController {
@Autowired
private AddressService addressService;
	
	//Getting Address list
	@GetMapping("/get/address/list")
	public void getAddressList() {
		addressService.getAddressList();
	}

}
