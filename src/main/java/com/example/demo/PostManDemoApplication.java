package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.Controller","com.example.Payments"})
//@ComponentScan("com.example.*")
@EntityScan("com.example.Payments")
public class PostManDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostManDemoApplication.class, args);
	}

	
}
