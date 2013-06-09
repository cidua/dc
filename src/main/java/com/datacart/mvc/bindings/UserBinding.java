package com.datacart.mvc.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Dmitriy Sinenkiy
 * @since 1.0
 */
@XmlRootElement(name = "userInfo")
@XmlAccessorType( value = XmlAccessType.FIELD )
public class UserBinding {
	private String name;
	private String email;

	public UserBinding() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
