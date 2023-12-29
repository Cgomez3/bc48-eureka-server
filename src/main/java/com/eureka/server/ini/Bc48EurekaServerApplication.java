package com.eureka.server.ini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Bc48EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bc48EurekaServerApplication.class, args);
	}

}
