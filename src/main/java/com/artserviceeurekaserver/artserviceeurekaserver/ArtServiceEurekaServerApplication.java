package com.artserviceeurekaserver.artserviceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ArtServiceEurekaServerApplication
 *
 * This is the Eureka server our other services register to.
 */
@EnableEurekaServer
@SpringBootApplication
public class ArtServiceEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArtServiceEurekaServerApplication.class, args);
	}
}
