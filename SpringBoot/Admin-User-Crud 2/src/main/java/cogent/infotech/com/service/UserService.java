package cogent.infotech.com.service;

import java.util.List;
import java.util.Optional;

import cogent.infotech.com.entity.Movie;
import cogent.infotech.com.entity.User;

public interface UserService {

	public User createUser(User user);
	public User findUser(String name, String password);
	public List<Movie> getFavoriteMovies(Long userId);
	public void addFavoriteMovie(Long userId, Long movieId);
	public void removeFavoriteMovie(Long userId, Long movieId);
	public Optional<User> findUserId(Long id);
	
}
