package com.BookCRUD.daoimp;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.BookCRUD.dao.BookDao;
import com.BookCRUD.dto.Book;
import rowmapper.BookRowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("bookdao")
public class BookDaoImpl implements BookDao {

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;


    public BookDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void saveBook(Book book) {
        String sql = "INSERT INTO book (id, name, price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,book.getId(), book.getName(), book.getPrice());
    }

    @Override
    public void updateBook(Book book) {
        String sql = "UPDATE book SET name=?, price=? WHERE id=?";
        jdbcTemplate.update(sql, book.getName(), book.getPrice(), book.getId());
    }

    @Override
    public void deleteBook(int id) {
        String sql = "DELETE FROM book WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Book getBookById(int id) {
        String sql = "SELECT * FROM book WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BookRowMapper());
        } catch (EmptyResultDataAccessException e) {
        	System.out.println("No such book");
            return null;
        }
    }

    @Override
    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM book";
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

    
}
