package com.example.progv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProgvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgvApplication.class, args);
	}
	@RequestMapping("/")

	String home() {
		return "Hi Gustavo, I'm your Spring Boot application!";
	}
}
