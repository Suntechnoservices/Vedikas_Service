package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo5Application {
	@RequestMapping("hello world")
	public String Test() 
	{
	return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo5Application.class, args);
	}

}
