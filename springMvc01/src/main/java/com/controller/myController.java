package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {
	@RequestMapping("/show")
	public String home1() {
		return "home";
	}
}
