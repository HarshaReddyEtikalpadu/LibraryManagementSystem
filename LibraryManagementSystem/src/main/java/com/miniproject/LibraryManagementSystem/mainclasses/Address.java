package com.miniproject.LibraryManagementSystem.mainclasses;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	// street, address line 1, address line 2, city, country, Pin code.
	@Id
	private int addressId;
	private String street;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private long pincode;

	public int getAddressId() {
		return addressId;
	}

	public Address() {
		super();

	}

	public Address(int addressId, String street, String addressLine1, String addressLine2, String city, String country,
			long pincode) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

}
