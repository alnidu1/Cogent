package book.book.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book.book.backend.enitiy.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long>{

	
	
}
