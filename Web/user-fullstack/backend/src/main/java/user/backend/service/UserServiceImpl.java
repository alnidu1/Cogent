package user.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.backend.entity.UserEntity;
import user.backend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserEntity create(UserEntity user) {
		return userRepository.save(user);
	}

	@Override
	public List<UserEntity> readAll() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity update(Long id, UserEntity user) {
		user.setId(id);
		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
		
	}
	
	@Override
	public Optional<UserEntity> readById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

}
