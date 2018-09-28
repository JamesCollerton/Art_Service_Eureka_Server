package com.artserviceeurekaserver.artserviceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ArtServiceEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArtServiceEurekaServerApplication.class, args);
	}
}
