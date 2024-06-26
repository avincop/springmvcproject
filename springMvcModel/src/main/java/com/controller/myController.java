  package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.controller.bean.Student;

@Controller
public class myController {
	@Autowired
	Student std;
	@RequestMapping("success")
	public String getModel(Model model) { 
		//controller to view
		model.addAttribute("id", 101);
		model.addAttribute("name", "Avinash");

		//creating arrayList
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(52);
		list.add(40);
		list.add(05);
		
		model.addAttribute("listData" ,list);
		
		//set value in Student class
		std.setId(1301);
		std.setName("Avinash");		
		model.addAttribute("stData", std);		
		return "success";
	}

}
