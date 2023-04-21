package book.book.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import book.book.backend.enitiy.Book;
import book.book.backend.repository.BookRepository;

@SpringBootApplication
public class BookBackendApplication implements CommandLineRunner {

	@Autowired
	BookRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(BookBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Book("test1", "tester1", 111.0));
		repo.save(new Book("test2", "tester2", 222.0));
		repo.save(new Book("tes3t", "teste3r", 333.0));


		
		
	}

}
