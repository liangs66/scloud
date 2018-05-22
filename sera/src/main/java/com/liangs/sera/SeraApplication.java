package com.liangs.sera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SeraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeraApplication.class, args);
	}
}
