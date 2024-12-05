package com.jago4232.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")  //GET --> http://localhost:8080/
	public String inicio() {
		return "jago4232";
		
	}
}
