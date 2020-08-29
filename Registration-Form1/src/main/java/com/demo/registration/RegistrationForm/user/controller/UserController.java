package com.demo.registration.RegistrationForm.user.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.registration.RegistrationForm.model.User;
import com.demo.registration.RegistrationForm.repository.UserRepo;

/**
 * 
 * @author khushii
 *
 */
@RestController
@ControllerAdvice
public class UserController {
	int counter = 0;

	@Autowired
	private UserRepo userRepo;

//	@Autowired
//	private User usr;

	// create a user

	/**
	 * Creates a {@link User}
	 * 
	 * @param userdata the user you want to create
	 * @return the user with ID populated
	 */

//
//    @ResponseBody
//    @ExceptionHandler
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.ACCEPTED)
	public User createUser(@Valid @RequestBody User userdata) {
//		counter++;
		return userRepo.save(userdata);

	}

	// update a user detail
	/**
	 * 
	 * @return
	 */
	@PutMapping(value = "/users/{userId}")
	public User updateUser() {
		return null;
	}

	/**
	 * 
	 * @param email
	 * @return
	 */
	public User findByEmail(String email) {
//		if (usr.getEmail().equals()) {
//
//		}

		return null;
	}
}