package cogent.infotech.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Movie;
import cogent.infotech.com.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository repo;
	
	@Override
	public Movie create(Movie movie) {
		return repo.save(movie);
		
	}

	@Override
	public List<Movie> read() {
		return repo.findAll();
	}

	@Override
	public Movie update(Long id, Movie movie) {
		movie.setId(id);
		return repo.save(movie);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public Optional<Movie> readByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByTitle(name);
	}

	@Override
	public Optional<Movie> readById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
