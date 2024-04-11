package com.test.layout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SitemeshController {
	
	@GetMapping("/") 
	public String s1Mapping() {
		return "index";
	}
}
