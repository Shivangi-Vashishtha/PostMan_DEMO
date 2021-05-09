package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student/")


public class Controller_class {
	
	@GetMapping("/get")
	public String getDetails()
	{
		return "Hello WORLD--SHIVANGI IS HERE";
	}

}
