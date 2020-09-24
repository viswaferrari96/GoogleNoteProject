package com.example.googlenote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@SpringBootApplication
public class GoogleNoteMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleNoteMicroServiceApplication.class, args);
	}
	
	@RequestMapping(value="/")
	public String home() {
		return "Eureka Client app";
	}

}
