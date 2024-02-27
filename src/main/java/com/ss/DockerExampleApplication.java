package com.ss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerExampleApplication {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "Hello Docker....!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}

}
