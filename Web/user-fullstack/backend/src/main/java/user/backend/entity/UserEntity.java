package user.backend.entity;

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
public class UserEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	Integer age;
	Double salary;
	
	UserEntity(String name, Integer age, Double salary ){
		this.name= name;
		this.age=age;
		this.salary=salary;
	}
}
