package com.Book.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.Book.dao.BookDAO;
import com.Book.dto.Book;

@Component("bookdao")
public class BookDAOImpl implements BookDAO {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public BookDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	
	@Override
	public int create(Book book) {
		System.out.println("Inside create ");
		 String sql = "INSERT INTO books (name, price) VALUES (?, ?)";
		
		return 0;
	}

	@Override
	public int update(int id, Book book) {
		// TODO Auto-generated method stub
		System.out.println("Inside update ");

		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		System.out.println("delete ");

		return 0;
	}

	@Override
	public int read(int id) {
		// TODO Auto-generated method stub
		System.out.println("read");

		return 0;
	}

	@Override
	public List<Book> readAll() {
		// TODO Auto-generated method stub
		System.out.println("readaall ");
		String sql = "SELECT * FROM books";
	        
		
		
		return null;
	}

	
}
