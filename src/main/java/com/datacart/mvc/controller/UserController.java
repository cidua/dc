package com.datacart.mvc.controller;

import com.datacart.mvc.bindings.UserBinding;
import com.datacart.mvc.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public
	@ResponseBody
	UserBinding getUserInfo() {
		UserBinding userBinding = new UserBinding();
		userBinding.setEmail("user@gmail.com");
		userBinding.setName("User Name");

		return userBinding;
	}
}