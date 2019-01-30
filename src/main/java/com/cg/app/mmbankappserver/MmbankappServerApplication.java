package com.cg.app.mmbankappserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MmbankappServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmbankappServerApplication.class, args);
	}

}

