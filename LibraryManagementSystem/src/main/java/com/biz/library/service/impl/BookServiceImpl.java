package com.biz.library.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.biz.library.model.Book;
import com.biz.library.service.BookService;

import jakarta.annotation.PostConstruct;

@Service
public class BookServiceImpl implements BookService {

	private final Map<Integer, Book> bookMap = new HashMap<>();

	private final AtomicInteger idCounter = new AtomicInteger(1);


	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		int id = idCounter.getAndIncrement();
		book.setId(id);
		bookMap.put(id, book);
		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return new ArrayList<>(bookMap.values());
	}

	@Override
	public Optional<Book> getBookById(int id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(bookMap.get(id));
	}

	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		if (bookMap.containsKey(id)) {
			idCounter.decrementAndGet();
		}
		return bookMap.remove(id) != null;
	}

	@Override
	public Optional<Book> updateAvailability(int id, boolean isAvailable) {
		// TODO Auto-generated method stub
		Book book = bookMap.get(id);
		if (book != null) {
			book.setIsAvailable(isAvailable);
			return Optional.of(book);
		}
		return Optional.empty();
	}
	
	@PostConstruct   //This method will add first 5 books initially.
	public void initData() {
		addBook(new Book(null, "Clean Code", "Robert C. Martin", "9780132350884", true));
		addBook(new Book(null, "Effective Java", "Joshua Bloch", "9780134685991", true));
		addBook(new Book(null, "Java Concurrency in Practice", "Brian Goetz", "9780321349606", false));
		addBook(new Book(null, "Head First Design Patterns", "Eric Freeman", "9780596007126", true));
		addBook(new Book(null, "Spring in Action", "Craig Walls", "9781617294945", false));
	}


}
