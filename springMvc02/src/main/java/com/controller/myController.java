package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {
	@RequestMapping("home")
	public String homePage() {
		return "home_jsp";
	}
	@RequestMapping("date")

	public String showDate() {
		return "date_jsp";
	}

}
