package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.Controller","com.example.Payments"})
//@ComponentScan("com.example.*")
@EntityScan("com.example.Payments")
@EnableJpaRepositories("com.example.Payments_ORM_Repository")
public class PostManDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostManDemoApplication.class, args);
	}

	
}
