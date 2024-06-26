package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myController {
	@RequestMapping("/model")
	public String getModel(Model model2) {
		model2.addAttribute("name", "Prahlad");
		return "model2";
	}

}
