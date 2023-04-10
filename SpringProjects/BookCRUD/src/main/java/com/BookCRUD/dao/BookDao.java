package com.BookCRUD.dao;

import java.util.List;

import com.BookCRUD.dto.Book;

public interface BookDao {
    public void saveBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(int id);
    public Book getBookById(int id);
    public List<Book> getAllBooks();
}

