package com.miniproject.LibraryManagementSystem.mainclasses;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	// Name, student id, department id, address, current batch year
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int studentId;
	private String name;
	private int departmentId;
	
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="fk_deptId")
//	private Department department;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_addressId")
	private Address address;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_uniqueId")
	private Book book;
	
	private int currentYear;
	private int gradYear;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

}
