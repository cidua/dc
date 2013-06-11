package com.datacart.mvc.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Dmitriy Sinenkiy - Team International
 * @since 2.0
 */
@XmlRootElement(name = "SubscriberData")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class SubscriptionBinding {
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String password;

	public SubscriptionBinding() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
