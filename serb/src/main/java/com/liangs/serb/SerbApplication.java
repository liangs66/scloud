package com.liangs.serb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerbApplication.class, args);
	}
}
