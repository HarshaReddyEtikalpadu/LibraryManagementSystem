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
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int studentId;

	public Student() {
		super();

	}

	public Student(int studentId, String name, Department department, Address address, Book book, int currentYear,
			int gradYear) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.department = department;
		this.address = address;
		this.book = book;
		this.currentYear = currentYear;
		this.gradYear = gradYear;
	}

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_deptId", referencedColumnName = "deptId")
	private Department department;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_addressId")
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_bookId", referencedColumnName = "bookId")
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

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

}
