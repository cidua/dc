package com.datacart.mvc.controller;

import com.datacart.mvc.bean.common.User;
import com.datacart.mvc.bindings.SubscriptionBinding;
import com.datacart.mvc.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Dmitriy Sinenkiy - Team International
 * @since 2.0
 */
@Controller
@RequestMapping(value = "/subscription")
public class SubscriptionController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/register/{userData}", method = RequestMethod.POST)
	public
	@ResponseBody
	void addUser(@PathVariable("userData") SubscriptionBinding subscriber) {
		User user = new User();
		user.setEmail(subscriber.getEmail());
		user.setFirstName(subscriber.getFirstName());

		userRepository.save(user);
	}

	@RequestMapping("/layout")
	public String getSubscriptionPartialPage() {
		return "subscription/layout";
	}

}
