package com.darbuth.moviemealtime.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darbuth.moviemealtime.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	User findByEmail(String email);

}
