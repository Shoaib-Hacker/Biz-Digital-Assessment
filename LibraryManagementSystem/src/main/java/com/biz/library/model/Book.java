package com.biz.library.model;

import jakarta.validation.constraints.NotEmpty;

public class Book {
	private Integer id;

	@NotEmpty(message = "Title cannot be empty")
	private String title;

	@NotEmpty(message = "Author cannot be empty")
	private String author;

	@NotEmpty(message = "ISBN cannot be empty")
	private String isbn;

	private Boolean isAvailable;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id, @NotEmpty(message = "Title cannot be empty") String title,
			@NotEmpty(message = "Author cannot be empty") String author,
			@NotEmpty(message = "ISBN cannot be empty") String isbn, Boolean isAvailable) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = isAvailable;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
