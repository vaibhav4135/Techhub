package com.logic;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Login {

	@Size(max = 20, min = 3, message = "{un.user.empty}") 
	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	  @NotEmpty(message = "password should not be empty")
	private String pass;
}
