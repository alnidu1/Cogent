package book.book.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import book.book.backend.enitiy.Book;
import book.book.backend.repository.BookRepository;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("api/")
public class BookController {
	
	@Autowired
	BookRepository repo;
	
	@GetMapping("books")
	public List<Book> readAll(){
		return repo.findAll();
	}

}
