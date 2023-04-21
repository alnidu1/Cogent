package user.backend.service;

import java.util.List;
import java.util.Optional;

import user.backend.entity.UserEntity;

public interface UserService {

	UserEntity create(UserEntity user);
	List<UserEntity>readAll();
	UserEntity update(Long id, UserEntity user);
	void delete(Long id);
	public Optional<UserEntity> readById(Long id);
	
	
}
