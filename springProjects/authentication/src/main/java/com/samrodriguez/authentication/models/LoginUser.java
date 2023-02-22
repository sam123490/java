package com.samrodriguez.authentication.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginUser {

	@NotBlank(message="Please enter email.")
	@Email(message="Please enter valid email.")
	private String email;
	
	@NotBlank(message="Please enter password.")
	private String password;
	
	public LoginUser() {}

	public LoginUser(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
