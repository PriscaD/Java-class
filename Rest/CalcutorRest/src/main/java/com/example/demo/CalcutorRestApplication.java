package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class CalcutorRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcutorRestApplication.class, args);
	}

}
