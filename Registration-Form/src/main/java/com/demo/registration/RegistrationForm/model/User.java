package com.demo.registration.RegistrationForm.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author khushii model class for data manipulation
 *
 */

@Entity
@Table(name = "Users_Data")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

//	@NotBlank
	@Size(max = 50)
	@Column(name = "firstname")
	private String firstName;

//	@NotBlank
	@Size(max = 50)
	@Column(name = "lastname")
	private String lastName;

//	@NotBlank
	@Size(max = 50)
	@Column(name = "email")
	private String email;

//	@NotBlank
	@Size(max = 50)
	@Column(name = "password")
	private String password;

	@NotBlank
	@Column(name = "contact", unique = true)
	private String contact;

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", contact=" + contact + "]";
	}

}
