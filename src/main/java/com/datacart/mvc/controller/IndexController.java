package com.datacart.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dmitriy Sinenkiy - Team International
 * @since 2.0
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {
	@RequestMapping
	public String getIndexPage() {
		return "index";
	}
}
