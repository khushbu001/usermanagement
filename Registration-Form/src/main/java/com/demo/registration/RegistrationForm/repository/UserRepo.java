package com.demo.registration.RegistrationForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.registration.RegistrationForm.model.User;

/**
 * 
 * @author khushii UserRepo is a repository class for performing crud operation
 *         with data
 *
 */

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
