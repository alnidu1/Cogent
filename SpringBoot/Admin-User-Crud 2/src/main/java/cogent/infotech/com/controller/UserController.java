package cogent.infotech.com.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Movie;
import cogent.infotech.com.entity.User;
import cogent.infotech.com.service.MovieServiceImpl;
import cogent.infotech.com.service.UserServiceImpl;


@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
    UserServiceImpl usi;
	@Autowired
    MovieServiceImpl msi;

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user) {
    	User createdUser = usi.createUser(user);
	    return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
    
    @GetMapping
	  public List<Movie> readAll() {
	        return msi.read();
	  }
    
    
    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
    	if(usi.findUserId(userId).get() != null) {
    		User user = usi.findUserId(userId).get();
    	
    		List<Movie> favoriteMovies =usi.getFavoriteMovies(userId);
    		return new User(user.getId(), user.getName(), null, favoriteMovies);
    	}
		return null;
    }
    @PostMapping("/{userId}/favorite/{movieId}")
    public ResponseEntity<Void> addFavoriteMovie(@PathVariable Long userId, @PathVariable Long movieId) {
        usi.addFavoriteMovie(userId, movieId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @DeleteMapping("/users/{userId}/favorite-movies/{movieId}")
    public ResponseEntity<Void> removeFavoriteMovie(@PathVariable Long userId, @PathVariable Long movieId) {
        usi.removeFavoriteMovie(userId, movieId);
        return ResponseEntity.noContent().build();
    }
}

