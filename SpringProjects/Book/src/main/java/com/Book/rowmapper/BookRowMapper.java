package com.Book.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Book.dto.Book;

public class BookRowMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Book book= new Book();
		book.setId(rs.getInt("id"));
		book.setName(rs.getString("name"));
		book.setPrice(rs.getDouble("price"));
		return book;
	}

}
