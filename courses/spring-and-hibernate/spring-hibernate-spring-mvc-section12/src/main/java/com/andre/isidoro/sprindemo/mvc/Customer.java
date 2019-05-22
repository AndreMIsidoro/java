package com.andre.isidoro.sprindemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String lastName;
	
	@NotNull(message="is required")
	@Size(min=1)
	private String firstName;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}	
}
