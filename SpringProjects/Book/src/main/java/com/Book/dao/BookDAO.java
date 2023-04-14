package com.Book.dao;

import java.util.List;

import com.Book.dto.Book;


public interface BookDAO {

	int create(Book book);
	int update(int id, Book bk);
	int delete(int id);
	int read(int id);
	List<Book> readAll();
}
