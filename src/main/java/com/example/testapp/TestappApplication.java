package com.example.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestappApplication {

	public static void main(String[] args) {
		System.out.println("this is running");
		SpringApplication.run(TestappApplication.class, args);
	}

}
