package com.miniproject.LibraryManagementSystem.mainclasses;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	public Book() {
		super();

	}

	public Book(int bookId, String bookName, String bookAuthor, String releaseYear, String bookVersion, Date dateIssued,
			Date dateReturned, boolean isAvailable) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.releaseYear = releaseYear;
		this.bookVersion = bookVersion;
		this.dateIssued = dateIssued;
		this.dateReturned = dateReturned;
		this.isAvailable = isAvailable;
	}

	// : Book name, Book author, Unique id, Release year, Book version,
	// Book type (Magazine, fun, article, scientific, subject based),dateIssued,
	// dateReturned
//	public enum bookType{
//		Magazine, Fun, Article, Scientific, SubjectBased
//	}
	@Id
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String releaseYear;
	private String bookVersion;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateIssued;
	private Date dateReturned;
	@Column(name = "IS_AVAILABLE")
	private boolean isAvailable;

//	@ManyToOne
//	@Cascade(org.hibernate.annotations.CascadeType.ALL)
//	private Student student;
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getBookVersion() {
		return bookVersion;
	}

	public void setBookVersion(String bookVersion) {
		this.bookVersion = bookVersion;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	public Date getDateReturned() {
		return dateReturned;
	}

	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//	

}
