package user.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.backend.entity.UserEntity;
import user.backend.service.UserServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserConroller {
	
	@Autowired
	UserServiceImpl userService;
	
	
	 @PostMapping
	 public ResponseEntity<UserEntity> create(@RequestBody UserEntity user) {
		UserEntity createdUser = userService.create(user);
	     return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
	 }
	@GetMapping("")
	  public List<UserEntity> readAll() {
	        return userService.readAll();
	  }
	
	 @PutMapping("/{id}")
	    public ResponseEntity<UserEntity> updateMovie(@PathVariable Long id, @RequestBody UserEntity user) {
	        Optional<UserEntity> updatedUser =userService.readById(id)
	                .map(existingMovie -> userService.update(id, user));
	        return updatedUser.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	 
	 @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
	        Optional<UserEntity> user = userService.readById(id);
	        if (user.isPresent()) {
	            userService.delete(id);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

}
