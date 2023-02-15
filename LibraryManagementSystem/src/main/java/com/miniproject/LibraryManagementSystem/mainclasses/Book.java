package com.miniproject.LibraryManagementSystem.mainclasses;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	//: Book name, Book author, Unique id, Release year, Book version, 
	//Book type (Magazine, fun, article, scientific, subject based),dateIssued, dateReturned
//	public enum bookType{
//		Magazine, Fun, Article, Scientific, SubjectBased
//	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String releaseYear;
	private String bookVersion;
	private Date dateIssued;
	private Date dateReturned;
	private boolean isAvailble;
	//@ManyToOne
	//@Cascade(org.hibernate.annotations.CascadeType.ALL)
	//private Student student;
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
	public Date getDateIsuued() {
		return dateIssued;
	}
	public void setDateIsuued(Date dateIsuued) {
		this.dateIssued = dateIsuued;
	}
	public Date getDateReturned() {
		return dateReturned;
	}
	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}
	public boolean isAvailble() {
		return isAvailble;
	}
	public void setAvailble(boolean isAvailble) {
		this.isAvailble = isAvailble;
	}
	
	
	
	
}
