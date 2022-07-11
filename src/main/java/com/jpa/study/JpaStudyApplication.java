package com.jpa.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JpaStudyApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/jpa");
		SpringApplication.run(JpaStudyApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
		return String.format("hello %s!", name);
	}
}
