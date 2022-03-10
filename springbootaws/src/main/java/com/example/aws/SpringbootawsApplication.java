package com.example.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringbootawsApplication {
	
@GetMapping("/")
	
	public String home(){
		return " Hello Anamika "
				+ "Welcome to AWS...";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootawsApplication.class, args);
	}

}
