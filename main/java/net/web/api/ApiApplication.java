package net.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ApiApplication {
	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
