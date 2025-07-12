package com.biz.library.service;

import java.util.List;
import java.util.Optional;

import com.biz.library.model.Book;

public interface BookService {
	Book addBook(Book book);

	List<Book> getAllBooks();

	Optional<Book> getBookById(int id);

	boolean deleteBook(int id);

	Optional<Book> updateAvailability(int id, boolean isAvailable);

}
