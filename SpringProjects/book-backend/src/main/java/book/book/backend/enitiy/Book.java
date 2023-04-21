package book.book.backend.enitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String title;
	String author;
	Double price;
	
	public Book(String title, String author, Double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
}
