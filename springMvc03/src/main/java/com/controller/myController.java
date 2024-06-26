package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {
	@RequestMapping("home")
	public String homePage() {
		return "home";
	}
	@RequestMapping("date")
	public String datePage() {
		return "date";
	}
}
